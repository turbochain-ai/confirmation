<template>
  <div>
    <div style="margin: 10px">
      <el-button type="primary" @click="insertEvent">添加新行</el-button>
      <el-button type="danger" @click="removeSelected">删除选中</el-button>
    </div>
    <vxe-table ref="xTable" :data="tableData" :edit-config="{trigger: 'dblclick', mode: 'cell'}">
      <vxe-table-column type="selection" width="60"></vxe-table-column>
      <vxe-table-column type="index" width="60"></vxe-table-column>
      <vxe-table-column field="borrower" title="借款人" :edit-render="{name: 'input'}" width="150"></vxe-table-column>
      <vxe-table-column field="bank" title="银行" :edit-render="{name: 'input'}" width="150"></vxe-table-column>
      <vxe-table-column field="currencyType" title="币种" :edit-render="{name: 'input'}" width="150"></vxe-table-column>
      <vxe-table-column field="balance" title="余额" :edit-render="{name: 'input'}" width="150"></vxe-table-column>
      <vxe-table-column field="fund" title="借款" :edit-render="{name: 'input'}" width="150"></vxe-table-column>
      <vxe-table-column field="date" title="到期" :edit-render="{name: 'input'}" width="150"></vxe-table-column>
      <vxe-table-column field="interestRates" title="利率" :edit-render="{name: 'input'}" width="150"></vxe-table-column>
      <vxe-table-column field="pledge" title="抵（质）押品" :edit-render="{name: 'input'}" width="250"></vxe-table-column>
      <vxe-table-column field="note" title="备注" :edit-render="{name: 'input'}" width="250"></vxe-table-column>
      <!--<vxe-table-column field="operate" title="操作"  width="150">
        <el-button type="danger" @click="removeRow">删除</el-button>
      </vxe-table-column>-->
    </vxe-table>
  </div>
</template>

<script>
  export default {
    name: "BankLoanTable",
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
