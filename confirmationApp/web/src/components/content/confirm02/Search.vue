<template>
<div class="search">

  <el-row>
    <el-col :span="17"><div class="grid-content bg-purple">
      <span>快速查找:ABCDEFGHIGKLMNOPQRSTUVWXYZ</span>
    </div></el-col>

    <el-col :span="7"><div class="grid-content bg-purple">
      <el-form :inline="true" :model="formInline" class="demo-form-inline">
        <el-form-item>
          <el-input v-model="formInline.user"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="onSubmit">查询</el-button>
        </el-form-item>
      </el-form>
    </div>
    </el-col>
  </el-row>
</div>

</template>

<script>
    export default {
        name: "Search",
        data() {
            return {
                formInline: {
                    user: '',
                    region: ''
                }
            }
        },
        methods: {
            onSubmit() {
                console.log('submit!');
            }
        }
    }
</script>

<style scoped>

</style>


