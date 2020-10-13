//import Axios from 'axios';
//const messages = Vue.resource('/news{/id}')

new Vue({
    el: '#app',
    data() {
        return {
            info: null
        };
    },
    mounted() {
        axios
            .get('http://127.0.0.1:8080/news')
            .then(response => (this.info = response));
    }
});