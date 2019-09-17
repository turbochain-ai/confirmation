<template>
  <el-table
    :data="tableData"
    stripe="true"
    style="width: 100%">
    <el-table-column
      prop="order"
      label="序号"
      width="100"
      align="center">
      <template scope="scope">
        <span>{{scope.$index + 1}}
        </span>
      </template>
    </el-table-column>
    <el-table-column
      prop="inquiryNumber"
      label="询证函编号"
      width="180">
    </el-table-column>
    <el-table-column
      prop="conpanyName"
      label="企业名称"
      width="180">
    </el-table-column>
    <el-table-column
      prop="bankName"
      label="银行名称"
      width="180">
    </el-table-column>
    <el-table-column
      prop="firmName"
      label="事务所名称"
      width="180">
    </el-table-column>
    <el-table-column
      prop="inquiryStartTime"
      label="询证开始时间"
      width="180">
    </el-table-column>
    <el-table-column
      prop="inquiryEndTime"
      label="询证结束时间"
      width="180">
    </el-table-column>
    <el-table-column
      prop="currentStatus"
      label="当前状态"
      width="180">
    </el-table-column>
    <el-table-column
      prop="operate"
      label="操作">
<!--      <router-link tag='a' :to="'APP'" >查看</router-link>-->
      <a href="https://www.baidu.com" style="color: #0071d9;">查看</a>

    </el-table-column>

  </el-table>
</template>

<script>
    export default {
        data() {
            return {
                tableData: [{
                    // order: '1',
                    inquiryNumber: 'YH-000001',
                    conpanyName: '中国建筑',
                    bankName: '中国银行',
                    firmName: '普华永道中国',
                    inquiryStartTime: '2016-05-02',
                    inquiryEndTime: '2016-06-02',
                    currentStatus: '待银行回复',
                    // operate: '查看'
                }, {
                    // order: '1',
                    inquiryNumber: 'YH-000001',
                    conpanyName: '中国建筑',
                    bankName: '中国银行',
                    firmName: '普华永道中国',
                    inquiryStartTime: '2016-05-02',
                    inquiryEndTime: '2016-06-02',
                    currentStatus: '待银行回复',
                    operate: '查看'
                }, {
                    // order: '1',
                    inquiryNumber: 'YH-000001',
                    conpanyName: '中国建筑',
                    bankName: '中国银行',
                    firmName: '普华永道中国',
                    inquiryStartTime: '2016-05-02',
                    inquiryEndTime: '2016-06-02',
                    currentStatus: '待银行回复',
                    operate: '查看'
                }, {
                    // order: '1',
                    inquiryNumber: 'YH-000001',
                    conpanyName: '中国建筑',
                    bankName: '中国银行',
                    firmName: '普华永道中国',
                    inquiryStartTime: '2016-05-02',
                    inquiryEndTime: '2016-06-02',
                    currentStatus: '待银行回复',
                    operate: '查看'
                }, {
                    // order: '1',
                    inquiryNumber: 'YH-000001',
                    conpanyName: '中国建筑',
                    bankName: '中国银行',
                    firmName: '普华永道中国',
                    inquiryStartTime: '2016-05-02',
                    inquiryEndTime: '2016-06-02',
                    currentStatus: '待银行回复',
                    operate: '查看'
                }, {
                    // order: '1',
                    inquiryNumber: 'YH-000001',
                    conpanyName: '中国建筑',
                    bankName: '中国银行',
                    firmName: '普华永道中国',
                    inquiryStartTime: '2016-05-02',
                    inquiryEndTime: '2016-06-02',
                    currentStatus: '待银行回复',
                    operate: '查看'
                }, {
                    // order: '1',
                    inquiryNumber: 'YH-000001',
                    conpanyName: '中国建筑',
                    bankName: '中国银行',
                    firmName: '普华永道中国',
                    inquiryStartTime: '2016-05-02',
                    inquiryEndTime: '2016-06-02',
                    currentStatus: '待银行回复',
                    operate: '查看'
                }, {
                    // order: '1',
                    inquiryNumber: 'YH-000001',
                    conpanyName: '中国建筑',
                    bankName: '中国银行',
                    firmName: '普华永道中国',
                    inquiryStartTime: '2016-05-02',
                    inquiryEndTime: '2016-06-02',
                    currentStatus: '待银行回复',
                    operate: '查看'
                }, {
                    // order: '1',
                    inquiryNumber: 'YH-000001',
                    conpanyName: '中国建筑',
                    bankName: '中国银行',
                    firmName: '普华永道中国',
                    inquiryStartTime: '2016-05-02',
                    inquiryEndTime: '2016-06-02',
                    currentStatus: '待银行回复',
                    operate: '查看'
                }, {
                    // order: '1',
                    inquiryNumber: 'YH-000001',
                    conpanyName: '中国建筑',
                    bankName: '中国银行',
                    firmName: '普华永道中国',
                    inquiryStartTime: '2016-05-02',
                    inquiryEndTime: '2016-06-02',
                    currentStatus: '待银行回复',
                    operate: '查看'
                }, {
                    // order: '1',
                    inquiryNumber: 'YH-000001',
                    conpanyName: '中国建筑',
                    bankName: '中国银行',
                    firmName: '普华永道中国',
                    inquiryStartTime: '2016-05-02',
                    inquiryEndTime: '2016-06-02',
                    currentStatus: '待银行回复',
                    operate: '查看'

                }]
            }
        }
    }
</script>

<style>
  table thead tr th {
    color: #0071d9;
    font-size: 15px;
    font-weight: bold;
  }
</style>
