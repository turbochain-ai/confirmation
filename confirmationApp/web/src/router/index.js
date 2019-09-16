import Vue from 'vue';
import Router from 'vue-router';
import confirm01 from "@/views/confirm01/confirm01";
import confirm03 from "../views/confirm03/confirm031";

Vue.use(Router);

const routes=[
  {
    path:'/confirm03',
   component:'confirm03'
  },
  {
    path:'/confirm01',
    component:'confirm01'
  }
];

 const router=new Router({
   routes
});


export default router;
