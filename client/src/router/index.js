import Vue from 'vue'
import Router from 'vue-router'
import News from '@/components/News'
import BootstrapVue from 'bootstrap-vue';

Vue.use(Router)
Vue.use(BootstrapVue)

import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'News',
      component: News
    }
  ]
})
