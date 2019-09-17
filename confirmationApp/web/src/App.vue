<template>
  <div id="app">
    <confirm03></confirm03>

  </div>
</template>

<script>

  import Confirm01 from "@/views/confirm01/confirm01";
  import Confirm02 from "@/views/confirm02/confirm02";
  /*import confirm03 from "@/views/confirm03/confirm031";*/
 import confirm03 from "@/views/confirm03/confirm03";

export default {
  name: 'app',
  components: {
      Confirm01,
      Confirm02,
      confirm03
  }
}


</script>

<style>
 @import "assets/css/base.css";
</style>
