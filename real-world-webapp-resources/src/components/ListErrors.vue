<template v-show="errors">
  <ul class="error-messages">
    <li v-for="(value, key) in errors" :key="key">
      <span>{{ key }} </span>
      <span v-for="err in value" :key="err">{{ err }}</span>
    </li>
  </ul>
</template>

<script>
export default {
  name: "RwvListErorrs",
  props: {
    errors: { type: Object, required: true }
  }
};
</script>
