<template>
  <el-collapse accordion>
    <el-collapse-item title="银行存款">
      <template slot="title">
       <span class="collapse_title"> 银行存款</span>
      </template>
      <div><DepositTable></DepositTable></div>
    </el-collapse-item>

    <el-collapse-item title="银行借款">
      <template slot="title">
        <span class="collapse_title"> 银行借款</span>
      </template>
      <div><BankLoanTable></BankLoanTable></div>
    </el-collapse-item>

    <el-collapse-item title="注销的账户">
      <template slot="title">
        <span class="collapse_title"> 注销的账户</span>
      </template>
      <div><CloseAccountTable></CloseAccountTable></div>
    </el-collapse-item>

    <el-collapse-item title="本公司作为贷款方的委托贷款">
      <template slot="title">
        <span class="collapse_title">本公司作为贷款方的委托贷款</span>
      </template>
      <div>本公司作为贷款方的委托贷款</div>
    </el-collapse-item>
  </el-collapse>
</template>

<script>
  import DepositTable from "@/components/content/confirm03/DepositTable";
  import BankLoanTable from "./BankLoanTable";
  import CloseAccountTable from "./CloseAccountTable";
  import BankDepositTable from "./DepositTable";
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
            DepositTable,
            BankLoanTable,
            CloseAccountTable
        }
    }

</script>

<style scoped>
  .collapse_title{
    margin-left: 20px;
    font-weight: bold;
  }

</style>
