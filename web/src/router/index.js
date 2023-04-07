import { createRouter, createWebHistory } from 'vue-router'
import PKindexView from '@/views/pk/PKindexView'
import RanklistindexView from '@/views/ranklist/RanklistindexView'
import RecordlistindexView from '@/views/record/RecordlistindexView'
import UserBotindexView from '@/views/user/bot/UserBotindexView'
import NotFound from '@/views/error/NotFound'


const routes = [
  {
    path: "/",
    name: "home",
    redirect: "/pk/"
  },
  {
    path: "/pk/",
    name: "pk_index",
    component: PKindexView,
  },
  {
    path: "/record/",
    name: "record_index",
    component: RecordlistindexView,
  },
  {
    path: "/ranklist/",
    name: "ranklist_index",
    component: RanklistindexView,
  },
  {
    path: "/user/bot/",
    name: "user_bot_index",
    component: UserBotindexView,
  },
  {
    path: "/404/",
    name: "404",
    component: NotFound,
  },
  {
    path: "/:catchAll(.*)",
    redirect: "/404/"
  },

 
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
