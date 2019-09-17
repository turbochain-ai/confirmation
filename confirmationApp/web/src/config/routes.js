import Index from '../pages/index/index'
import confirmation from '../pages/confirmation/index'
import confirm01 from "../pages/confirm01/confirm01";
import confirm02 from "../pages/confirm02/confirm02";
import confirm03 from "../pages/confirm03/confirm03";
import confirmlist from "../pages/confirmlist/confirmlist";



export default [
    { path: '/', component: Index },
    { path: '/index', component: Index },
    { path: '/confirmation', component: confirmation },
    { path: '*', component: Index },
    { path: '/confirm03', name: 'confirm03',  component: confirm03  },
    { path: '/confirm02', name: 'confirm02',  component: confirm02  },
    { path: '/confirm01', name: 'confirm01',  component: confirm01  },
    { path: '/confirmlist', name: 'confirmlist',  component: confirmlist  },
];
