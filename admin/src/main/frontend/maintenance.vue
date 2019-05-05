<!--
  - Copyright 2014-2018 the original author or authors.
  -
  - Licensed under the Apache License, Version 2.0 (the "License");
  - you may not use this file except in compliance with the License.
  - You may obtain a copy of the License at
  -
  -     http://www.apache.org/licenses/LICENSE-2.0
  -
  - Unless required by applicable law or agreed to in writing, software
  - distributed under the License is distributed on an "AS IS" BASIS,
  - WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  - See the License for the specific language governing permissions and
  - limitations under the License.
  -->

<template>
  <section class="section">
    <h1>Status</h1>
    <p v-text="status"></p>

    <button
      class="button is-success"
      @click="setStatus('UP')"
    >
      UP
    </button>
    <button
      class="button is-danger"
      @click="setStatus('OUT_OF_SERVICE')"
    >
      OUT_OF_SERVICE
    </button>
  </section>
</template>

<script>
  export default {
    props: {
      instance: {
        type: Object,
        required: true,
      },
    },
    data: () => ({
      status: '',
    }),
    methods: {
      async fetchStatus() {
        const response = await this.instance.axios.get('actuator/maintenance');
        this.status = response.data.status;
      },
      async setStatus(status) {
        await this.instance.axios.post('actuator/maintenance', {status});
        return this.fetchStatus();
      },
    },
    async created() {
      await this.fetchStatus();
    },
  };
</script>

<style>
</style>
