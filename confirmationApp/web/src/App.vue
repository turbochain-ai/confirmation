<template>
  <div :class="pageView">
    <div class="page-content" :style="{ minHeight: minHeight + 'px' }">
      <router-view></router-view>
    </div>
  </div>
</template>
<script>
import Vue from "vue";
import { mapGetters, mapActions } from "vuex";
export default {
  name: "app",
  provide() {
      return {
          reload: this.reload
      }
  },
  data() {
    return {
      pageView: "page-view",
      minHeight: null,
      utc: null,
      time: null,
      content: " ",
      wechat: this.$t("footer.wechat"),
        isRouterAlive: true
    };
  },
  watch: {
    $route(to, from) {
      this.pageView = "page-view";
      // if (to.path === "/") {
      //   this.pageView = "page-view";
      // } else {
      //   if (to.path.indexOf("exchange") > 0 && this.exchangeSkin == "night") {
      //     this.pageView = "page-view";
      //   } else {
      //     this.pageView = "page-view2";
      //   }
      // }
    },
  },
  computed: {
    activeNav: function() {
      return this.$store.state.activeNav;
    },
    isLogin: function() {
      return this.$store.getters.isLogin;
    },
    member: function() {
      return this.$store.getters.member;
    },
  },
  created: function() {
    this.initialize();
    var d = new Date(),
      gmtHours = d.getTimezoneOffset() / 60;
    this.utc = "GMT " + (gmtHours > 0 ? "-" : "+") + " " + String(gmtHours)[1];
    setInterval(() => {
      this.time = new Date().getTime();
    }, 1000);
    // if (this.$route.path === "/") {
    //   this.pageView = "page-view";
    // } else {
    //   this.pageView = "page-view";
    // }
    this.pageView = "page-view";
  },
  methods: {
    reload() {
        this.isRouterAlive = false;
        this.$nextTick(function () {
            this.isRouterAlive = true;
        });
      },
    initialize() {
      this.$store.commit("navigate", "nav-index");
      this.$store.commit("recoveryMember");
      this.$store.commit("initLang");
    },
  }
};
</script>