<template>
  <el-table
    :data="tableData"
    style="width: 100%"
    height="250"
    stripe="true"  class="bank_deposit_table">


    <el-table-column label="操作" width="120px">
      <template slot-scope="scope">
        <el-button
          size="mini"
          type="primary"
          @click="handleEdit(scope.$index, scope.row)" icon="el-icon-plus"></el-button>
        <el-button
          size="mini"
          type="primary"
          @click="handleDelete(scope.$index, scope.row)" icon="el-icon-minus"></el-button>
      </template>
    </el-table-column>

    <el-table-column
      prop="accountName"
      label="账户名称" width="120px">
    </el-table-column>

    <el-table-column
      prop="bankAccount"
      label="银行账号" width="120px">
    </el-table-column>

    <el-table-column
      prop="currencyType"
      label="币种" width="120px">
    </el-table-column>

    <el-table-column
      prop="interestRates"
      label="利率" width="120px">
    </el-table-column>

    <el-table-column
    prop="accountType"
    label="账户类型" width="120px">
  </el-table-column>

    <el-table-column
      prop="balance"
      label="余额" width="120px">
    </el-table-column>


    <el-table-column
      prop="startAndEndDate"
      label="起止日期" width="150px">
    </el-table-column>

    <el-table-column
      prop="limit"
      label="是否用于担保或存在其他使用限制" width="250px">
    </el-table-column>

    <el-table-column
    prop="note"
    label="备注" width="200px">
  </el-table-column>

  </el-table>
</template>

<script>
    export default {
        data() {
            return {
                tableData: [{
                    date: '2016-05-02',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1518 弄'
                }, {
                    date: '2016-05-04',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1517 弄'
                }, {
                    date: '2016-05-01',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1519 弄'
                }, {
                    date: '2016-05-03',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1516 弄'
                }]
            }
        },
        methods: {
            handleEdit(index, row) {
                console.log(index, row);
            },
            handleDelete(index, row) {
                console.log(index, row);
            }
        }
    }
</script>

<style scoped>

</style>
