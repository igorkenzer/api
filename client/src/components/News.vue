<template>
  <div class="card-group">
    <div v-for="news in newses" :key="news.id">
        <b-card bg-variant="dark" text-variant="white" :title = "news.heading">
          <b-card-text>
            {{news.newsbody}}
          </b-card-text>
          <b-button href="#" variant="primary">Go somewhere</b-button>
        </b-card>
    </div>
  </div>
</template>

<script>
  import axios from 'axios';

  export default {
    name: 'News',
    data() {
      return {
        newses: '',
      };
    },
    methods: {
      getMessage() {
        const path = 'http://127.0.0.1:8080/news';
        axios.get(path)
          .then((res) => {
            this.newses = res.data;
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
