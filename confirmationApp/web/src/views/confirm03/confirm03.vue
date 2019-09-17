<template>

  <div class="confirm03_page">

    <!--询证03头部的步骤条-->
    <div class="confirm03_steps">
      <Steps03></Steps03>
    </div>


    <!--询证03的内容部分-->
    <div class="confirm03_content">

      <!--上部分的审计年度、审计日期-->
      <div class="content_top">
        <el-row>
          <el-col :span="12"><div class="grid-content bg-purple">
            审计年度:<AuditYear></AuditYear>
          </div></el-col>

          <el-col :span="12"><div class="grid-content bg-purple">
            审计期间:<DataTimeComponent></DataTimeComponent>至
            <DataTimeComponent></DataTimeComponent>
          </div>
          </el-col>
        </el-row>
      </div>

      <!--中间的表格-->

      <div class="content_middle">
        <Collapse></Collapse>

      </div>


      <!--下部分的按钮-->
      <div class="content_bottom">
        <el-button class="button">上一步</el-button>
        <el-button type="primary" class="button" >保存</el-button>
        <el-button type="primary" class="button">提交</el-button>
      </div>

    </div>
  </div>
</template>

<script>
   import Steps03 from "@/components/content/confirm03/Steps03";
   import AuditYear from "@/components/content/confirm03/AuditYear";
   import DataTimeComponent from "@/components/content/confirm03/DataTimeComponent";
   import Collapse from "@/components/content/confirm03/Collapse";
    export default {
        name: "confirm03",
        components: {
            Steps03,
            AuditYear,
            DataTimeComponent,
            Collapse
        }
    }
</script>

<style scoped>
  .confirm03_page{
    width: 100%;
    height: 100%;
    padding-top: 10px;
    padding-bottom: 10px;
    background-color: #d3d3d3;
  }
  .confirm03_steps{
    width: 99%;
    height: 80px;
    margin-left: auto;
    margin-right: auto;
    margin-bottom: 10px;
    border-radius: 3px;
    background-color: #ffffff;
    padding-top: 3px;
  }
  .confirm03_steps:hover {
    box-shadow: 0px 0px 8px rgba(0, 0, 0, 0.5);
  }

  .confirm03_content{
    width: 99%;
    height: 470px;
    margin: auto;
    border-radius: 3px;
    background-color: #ffffff;
  }

  .confirm03_content:hover {
    box-shadow: 0px 0px 8px rgba(0, 0, 0, 0.5);
  }

  .content_top{
    width: 100%;
    height: 50px;
  }
  .content_middle{
    width: 100%;
    height: 370px;
    overflow-y:auto;
    overflow-x:auto;
    border-top: 2px solid #f2f2f2;
    border-bottom: 2px solid #f2f2f2;
  }
  .content_bottom{
    width: 100%;
    height: 70px;
    text-align: center;
  }

  .grid-content{
     margin-top: 5px;
     margin-left: 20px;
  }
  .button{
    margin-top: 3px;
    margin-left: 5px;
  }

</style>
