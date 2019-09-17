<template>
  <el-steps :active="3" finish-status="success" simple style="margin-top: 20px">
    <el-step title="选择询证企业" ></el-step>
    <el-step title="选择询证银行" ></el-step>
    <el-step title="填写询证内容" ></el-step>
  </el-steps>
  <!--<div class="steps03">
    <el-steps  :active="3" align-center >
      <el-step title="选择询证企业"></el-step>
      <el-step title="选择询证银行"></el-step>
      <el-step title="填写询证内容"></el-step>
    </el-steps>
  </div>-->
</template>

<script>
    export default {
        name: "Steps03"
    }
</script>

<style scoped>


</style>
