<template>
  <div id="fullpage">
     <!---------------------头部header---------------------->
		<div class="header">
			<div class="container">
				<img style="float: left;" class="img-responsive img-circle img-thumbnail user_head" src="@/assets/img/index/01区块链银行函证系统-首页_14.png" alt="logo" width="48px">
				<div class="" style="float: left; padding-left: 12px;">
					<h4 class="user_name">普华永道中国</h4>
					<p>当前用户：张雨春</p>
					<div style="padding-left: 64px; display: inline-block;">
						<span>
									企业门户：
								</span>
						<a href="http://www.baidu.com">www.baidu.com</a>
					</div>

				</div>

				<div class="header_right">
					<img src="@/assets/img/index/01区块链银行函证系统-首页_03.png" />
					<p style="line-height: 24px; margin: 0px auto; display:block;">综合评分:9.9分</p>
				</div>
			</div>
		</div>

		<!---------------------内容content--------------------->
		<section id="confirm_content">
			<div class="container">
				<div class="row">
					<div class="col-sm-6 col-md-6">
						<a href="#" class="thumbnail">
							<div class="main_box">
								<img style="display: inline-block;" src="@/assets/img/index/01区块链银行函证系统-首页_07.png" alt="通用">
								<div class="main_list">
									<h4 class="main_title">询证函数量-未询证 </h4>
									<p class="main_content">待银行回复的询证</p>
								</div>
								<span class="main_count">--</span><span class="main_unit">份</span>
							</div>
							<span class="detail">
							  <router-link :to="{path: '/confirm01'}">查看明细></router-link>
							</span>
						</a>
					</div>

					<div class="col-sm-6 col-md-6">
						<a href="#" class="thumbnail">
							<div class="main_box">
								<img style="display: inline-block;" src="@/assets/img/index/01区块链银行函证系统-首页_09.png" alt="通用">
								<div class="main_list">
									<h4 class="main_title">询证函数量-已询证 </h4>
									<p class="main_content">已经完成的询证</p>
								</div>
								<span class="main_count">--</span><span class="main_unit">份</span>
							</div>
							<span class="detail">查看明细></span>
						</a>
					</div>

					<div class="col-sm-6 col-md-6">
						<a href="#" class="thumbnail">
							<div class="main_box">
								<img style="display: inline-block;" src="@/assets/img/index/01区块链银行函证系统-首页_13.png" alt="通用">
								<div class="main_list">
									<h4 class="main_title">企业</h4>
									<p class="main_content">已完成询证的企业统计</p>
								</div>
								<span class="main_count">--</span><span class="main_unit">家</span>
							</div>
							<span class="detail">查看明细></span>
						</a>
					</div>

					<div class="col-sm-6 col-md-6">
						<a href="#" class="thumbnail">
							<div class="main_box">
								<img style="display: inline-block;" src="@/assets/img/index/01区块链银行函证系统-首页_14.png" alt="通用">
								<div class="main_list">
									<h4 class="main_title">银行</h4>
									<p class="main_content">询证业务往来的银行</p>
								</div>
								<span class="main_count">--</span><span class="main_unit">家</span>
							</div>
							<span class="detail">查看明细></span>
						</a>
					</div>

				</div>
			</div>
		</section>
  </div>
</template>
<script>
import $ from "@js/jquery.min.js";

export default {
  data() {
    let self = this;
    return {
	 // pane: 'usdt',
	  pane: 'eth',
      baseSymbols: [],
      loading: false,
      // progress: 0,
      // already: 0,
      percent: 0,
      timer3: null,
      pageNo: 1,
      pageSize: 50,
      totalNum: 0,
      FAQList: [],
      // safetyAndAssoction: 0,
      // currentBonusETHBnous: 0,
      yesDayCashDividensBonusETH: 0,
      // yesDayMineAmountBHB: 0,
     // CNYRate: null,
      CNYPrice: 1,
      coinsCNYRate: [],
      dataIndex: [],
      pageNo: 1,
      pageSize: 50,
      totalNum: 0,
      FAQList: [],
      //当前市场上的交易币种，按交易对分
      coins: {
        paneCoin: '',
        symbol: [],
        _map: [],
        favor: [],
        columns: [
        ]
      },
      valueCal: 0,
      showArrow: "never",
      speed: 5000,
      symbol: "",
      usdtData: [],
      usdtList: [],
      btcList: [],
      ethList: [],
      picList: []
    };
  },
  created: function() {
  alert(777);
    this.init();
  },
  computed: {
    lang: function() {
      return this.$store.state.lang;
    }
  },
  watch: {
  },
  mounted: function() {
  },
  methods: {
    strde(str) {
      str = str.trim();
      return str.length > 30 ? str.slice(0, 30) + "..." : str;
    },
    init() {
      this.$store.commit("navigate", "nav-index");
      this.$store.state.HeaderActiveName = "1-1";
      alert(888);
      this.$router.push("/notice");
    },
    stop: function() {
      clearInterval(this.timer3);
    },
    round(v, e) {
      var t = 1;
      for (; e > 0; t *= 10, e--);
      for (; e < 0; t /= 10, e++);
      return Math.round(v * t) / t;
    },
    mul(a, b) {
      var c = 0,
        d = a && a.toString(),
        e = b && b.toString();
      try {
        c += d.split(".")[1].length;
      } catch (f) {}
      try {
        c += e.split(".")[1].length;
      } catch (f) {}
      return (
        Number(d && d.replace(".", "")) *
        Number(e && e.replace(".", "")) /
        Math.pow(10, c)
      );
    },
      addClass(index) {
          //this.choseBtn = index;
          /*if (index == 0) {
            this.dataIndex = this.coins.USDT;
          } else if (index == 1) {
            this.dataIndex = this.coins.BTC;
          } else if (index == 2) {
            this.dataIndex = this.coins.ETH;
          } else if (index == 3) {
            this.dataIndex = this.coins.favor;
          }*/
      },
  }
};
</script>
<style scoped lang="scss">
@import url(../../assets/bootstrap/css/bootstrap.css);
@import url(../../assets/css/index.css);
</style>
<script>
</script>
