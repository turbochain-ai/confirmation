import Index from '../pages/index/index'
import confirmation from '../pages/confirmation/index'

export default [
    { path: '/', component: Index },
    { path: '/index', component: Index },
    { path: '/confirmation', component: confirmation },
    { path: '*', component: Index },
];