<template>
  <el-collapse accordion>
    <el-collapse-item title="银行存款">
      <div><BankDepositTable></BankDepositTable></div>
    </el-collapse-item>

    <el-collapse-item title="银行借款">
      <div><BankLoanTable></BankLoanTable></div>
    </el-collapse-item>

    <el-collapse-item title="注销的账户">
      <div>简化流程：设计简洁直观的操作流程；</div>
    </el-collapse-item>

    <el-collapse-item title="本公司作为贷款方的委托贷款">
      <div>用户决策：根据场景可给予用户操作建议或安全提示，但不能代替用户进行决策；</div>
    </el-collapse-item>
  </el-collapse>
</template>

<script>
  import BankDepositTable from "@/components/content/confirm03/BankDepositTable";
  import BankLoanTable from "./BankLoanTable";
    export default {
        name: "Collapse",
        data() {
            return {
                activeNames: ['1']
            };
        },
        methods: {
            handleChange(val) {
                console.log(val);
            }
        },
        components: {
            BankDepositTable,
            BankLoanTable
        }
    }

</script>

<style scoped>

</style>
