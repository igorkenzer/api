
const messages = Vue.resource('/news{/id}')

var app = new Vue({
    el: '#app',
    data: {
        message: 'Привет, Vue!'
    }
})