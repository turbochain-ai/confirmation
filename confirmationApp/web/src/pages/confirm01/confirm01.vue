<template>

  <div class="confirm01_page">

    <!--询证01头部的步骤条-->
    <div class="confirm01_steps">
      <Steps01></Steps01>
    </div>


    <!--询证01的内容部分-->
    <div class="confirm01_content">

      <!--上部分公司选择-->
      <div class="content_top">上部分公司选择</div>

      <!--下部分的按钮-->
      <div class="content_bottom">
        <router-link :to="{path: '/confirm02'}">
          <el-button type="primary" >下一步</el-button>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script>
  import Steps01 from "@/components/content/confirm01/Steps01";
    export default {
        name: "confirm01",
        components: {
            Steps01
        }

    }
</script>

<style scoped>
  .confirm01_page{
    width: 100%;
    height: 100%;
    background-color: #d3d3d3;
    padding-top: 10px;
    padding-bottom: 10px;
  }
  .confirm01_steps{
    width: 99%;
    height: 80px;
   background-color: #ffffff;
    margin-left: auto;
    margin-right: auto;
    margin-bottom: 10px;
    border-radius: 3px;
  }
  .confirm01_content{
    width: 99%;
    height: 470px;
    margin: auto;
    overflow-y:auto;
    overflow-x:auto;
    border-radius: 3px;
    background-color: #ffffff;

  }
  .content_top{
    width: 100%;
    height: 420px;
    border-bottom: 2px solid #f2f2f2;

  }

  .content_bottom{
    width: 100%;
    height: 50px;
    text-align: center;
  }


</style>
