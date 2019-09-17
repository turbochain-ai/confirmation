<template>
  <el-container>
    <div class="xunzheng">
      <el-radio v-model="radio" label="1">
        <div class="demo-image__preview">
          <el-image
            class="img-style"
            src="https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg">
          </el-image>
        </div>
        <p>普联软件股份有限公司</p>
      </el-radio>
      <el-radio v-model="radio" label="2">
        <div class="demo-image__preview">
          <el-image
            class="img-style"
            src="https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg">
          </el-image>
        </div>
        <p>普联软件股份有限公司</p>
      </el-radio>
      <el-radio v-model="radio" label="3">
        <div class="demo-image__preview">
          <el-image
            class="img-style"
            src="https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg">
          </el-image>
        </div>
        <p>普联软件股份有限公司</p>
      </el-radio>
      <el-radio v-model="radio" label="4">
        <div class="demo-image__preview">
          <el-image
            class="img-style"
            src="https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg">
          </el-image>
        </div>
        <p>普联软件股份有限公司</p>
      </el-radio>
      <el-radio v-model="radio" label="5">
        <div class="demo-image__preview">
          <el-image
            class="img-style"
            src="https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg">
          </el-image>
        </div>
        <p>普联软件股份有限公司</p>
      </el-radio>
      <el-radio v-model="radio" label="6">
        <div class="demo-image__preview">
          <el-image
            class="img-style"
            src="https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg">
          </el-image>
        </div>
        <p>普联软件股份有限公司</p>
      </el-radio>
      <el-radio v-model="radio" label="7">
        <div class="demo-image__preview">
          <el-image
            class="img-style"
            src="https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg">
          </el-image>
        </div>
        <p>普联软件股份有限公司</p>
      </el-radio>
      <el-radio v-model="radio" label="8">
        <div class="demo-image__preview">
          <el-image
            class="img-style"
            src="https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg">
          </el-image>
        </div>
        <p>普联软件股份有限公司</p>
      </el-radio>
    </div>

  </el-container>
</template>

<script>
    export default {
        data () {
            return {
                radio: '1'
            };
        }
    }
</script>

<style >
  .radio-input{
    float:left;
  }
  label {
    cursor: pointer;
    position: relative;
    vertical-align: middle;
    display: inline-block;
    color: #333333;
    width: 200px;
    height: 48px;
    padding: 12px;
    font-size: 14px;
  }
  label:hover{
    color: #0071d9;

  }
  label img {
    float: left;
    border-radius: 4px;
    border: 1px solid #ccc;
  }
  label p {
    font-weight: bold;
    width: 120px;
    display: inline-block;
    margin-top: 18px;
  }
  label input {
    position: absolute;
    top: 26px;
    vertical-align: middle;
  }
  p, div, a, h1, h2 {
    padding: 0em;
    margin: 0 auto;
  }
  .img-style{
    width: 48px;
    height: 48px;
    float: left;
    border-radius: 4px;
    border: 1px solid #ccc;

  }
  .xunzheng .el-radio__input {
      cursor: pointer;
      vertical-align: middle;
      float: left;
    }
  .xunzheng .el-radio__input {
    cursor: pointer;
    vertical-align: middle;
    float: left;
    display: inline-block;
    border: 1px solid #ccc;
    width: 16px;
    height: 16px;
    border-radius: 2px;
    vertical-align: middle;
    margin-right: 5px;
    /* position: absolute; */
    top: 28px;
  }

</style>
