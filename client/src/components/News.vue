<template>
  <div class=maincard>
    <div class=card1 v-for="news in newses" :key="news.id">
      <b-card :title = "news.heading">
        <b-card-text>
          {{news.newsbody}}
        </b-card-text>
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
        const path = 'http://192.168.177.188:8080/news';
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
