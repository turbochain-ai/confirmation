<template>

  <div class="confirm02_page">

    <!--询证02头部的步骤条-->
    <div class="confirm02_steps">
      <Steps02></Steps02>
    </div>


    <!--询证02的内容部分-->
    <div class="confirm02_content">
       <!--上部分的查找-->
     <div class="content_top"><Search></Search></div>
      <!--上部分银行选择-->
      <div class="content_middle">
        <Bank></Bank>
      </div>

      <!--下部分的按钮-->
      <div class="content_bottom">
        <el-button >上一步</el-button>
        <el-button type="primary" >下一步</el-button>
      </div>

    </div>
  </div>
</template>

<script>
  import Steps02 from "@/components/content/confirm02/Steps02";
  import Search from "@/components/content/confirm02/Search";
  import Bank from "@/components/content/confirm02/Bank";
    export default {
        name: "confirm02",
        components: {
            Steps02,
            Search,
            Bank
        }
    }
</script>

<style scoped>
  .confirm02_page{
    width: 100%;
    height: 100%;
    padding-top: 10px;
    padding-bottom: 10px;
    background-color: #d3d3d3;
  }
  .confirm02_steps{
    width: 99%;
    height: 80px;
    margin-left: auto;
    margin-right: auto;
    margin-bottom: 10px;
    border-radius: 3px;
    background-color: #ffffff;
  }
  .confirm02_content{
    width: 99%;
    height: 470px;
    margin: auto;
    border-radius: 3px;
    background-color: #ffffff;

  }

  .content_top{
    width: 100%;
    height: 50px;

  }
  .content_middle{
    width: 100%;
    height: 330px;
    overflow-y:auto;
    overflow-x:auto;
    border-top: 2px solid #f2f2f2;
    border-bottom: 2px solid #f2f2f2;
    padding-top: 20px;


  }

  .content_bottom{
    width: 100%;
    height: 70px;
    text-align: center;
  }


</style>
