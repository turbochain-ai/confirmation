import Vue from 'vue';
import Router from 'vue-router';
import confirm01 from "@/views/confirm01/confirm01";
import confirm03 from "@/views/confirm03/confirm03";

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'confirm03',
      component: confirm03
    },
    {
        path: '/confirm03',
        name: 'confirm03',
        component: confirm03
      },
      {
          path: '/confirm01',
          name: 'confirm01',
          component: confirm01
        },
  ]
})

/**
 * const routes=[ { path:'/confirm03', component:'confirm03' }, {
 * path:'/confirm01', component:'confirm01' } ];
 * 
 * const router=new Router({ routes });
 * 
 * 
 * export default router;
 */
