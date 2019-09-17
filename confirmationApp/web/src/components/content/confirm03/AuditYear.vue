<template>
  <el-select v-model="value" placeholder="请选择">
    <el-option
      v-for="item in options"
      :key="item.value"
      :label="item.label"
      :value="item.value">
    </el-option>
  </el-select>
</template>

<script>
    export default {
        name: "AuditYear",
        data() {
            return {
                options: [{
                    value: '选项1',
                    label: '2015'
                }, {
                    value: '选项2',
                    label: '2016'
                }, {
                    value: '选项3',
                    label: '2017'
                }, {
                    value: '选项4',
                    label: '2018'
                }, {
                    value: '选项5',
                    label: '2019'
                }],
                value: ''
            }
        }
    }
</script>

<style scoped>

</style>
