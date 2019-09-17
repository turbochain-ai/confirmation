<template>
  <div>
    <div style="margin: 10px">
      <el-button type="primary" @click="insertEvent">添加新行</el-button>
      <el-button type="danger" @click="removeSelected">删除选中</el-button>
    </div>
    <vxe-table ref="xTable" :data="tableData" :edit-config="{trigger: 'dblclick', mode: 'cell'}">
      <vxe-table-column type="selection" width="60"></vxe-table-column>
      <vxe-table-column type="index" width="60"></vxe-table-column>
      <vxe-table-column field="accountName" title="账户名称" :edit-render="{name: 'input'}" width="150"></vxe-table-column>
      <vxe-table-column field="bankAccount" title="银行账号" :edit-render="{name: 'input'}" width="150"></vxe-table-column>
      <vxe-table-column field="currencyType" title="币种" :edit-render="{name: 'input'}" width="150"></vxe-table-column>
      <vxe-table-column field="date" title="注销账户日" :edit-render="{name: 'input'}" width="150"></vxe-table-column>
      <!--<vxe-table-column field="operate" title="操作"  width="150">
        <el-button type="danger" @click="removeRow">删除</el-button>
      </vxe-table-column>-->
    </vxe-table>
  </div>
</template>

<script>
  export default {
    name: "DepositTable",
    data () {
      return {
        tableData: []
      }
    },
    created () {
      this.tableData.push({
        accountName:"zhangsan",
        bankAccount:"male",
        currencyType:"33",
        interestRates:"zhangsan",
        accountType:"male",
        balance:"33",
        startAndEndDate:"zhangsan",
        limit:"male",
        note:"33",
      },{
        accountName:"zhangsan",
        bankAccount:"male",
        currencyType:"33",
        interestRates:"zhangsan",
        accountType:"male",
        balance:"33",
        startAndEndDate:"zhangsan",
        limit:"male",
        note:"33",
      });
    },
    methods: {
      insertEvent () {
        let row = -1;
        let record = {
          accountName: '1'
        }
        this.$refs.xTable.insertAt(record, row).then(({ row }) => this.$refs.xTable.setActiveCell(row, 'accountName'));
      },
      removeSelected() {
        this.$refs.xTable.removeSelecteds();
      },
      /*editActivedEvent({row, column}, event) {
        console.log(`打开 ${column.title} 列编辑`)
      },
      editClosedEvent({row, column}, event) {
        console.log(`关闭 ${column.title} 列编辑`)
      }*/
    }
  }
</script>

<style scoped>

</style>

