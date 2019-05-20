/*
 * Copyright 2014-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import custom from './custom';
import maintenance from './maintenance';

global.SBA.use({
  install({viewRegistry}) {
    viewRegistry.addView({
      name: 'instances/maintenance',
      parent: 'instances',
      path: 'maintenance',
      component: maintenance,
      label: 'Maintenance (Custom)',
      order: 5,
      isEnabled: ({instance}) => instance.hasEndpoint('maintenance'),
    });
  },
});

global.SBA.use({
  install({viewRegistry}) {
    viewRegistry.addView({
      name: 'custom',
      path: '/custom',
      component: custom,
      label: 'Custom',
      order: 1000,
    });
  },
});


