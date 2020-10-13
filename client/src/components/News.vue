<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
  </div>
</template>

<script>
  import axios from 'axios';

  export default {
    name: 'News',
    data() {
      return {
        msg: '',
      };
    },
    methods: {
      getMessage() {
        const path = 'http://192.168.177.188:8080/news';
        axios.get(path)
          .then((res) => {
            this.msg = res.data;
          })
          .catch((error) => {
            // eslint-выключение следующей строки
            console.error(error);
          });
      },
    },
    created() {
      this.getMessage();
    },
  };
</script>
