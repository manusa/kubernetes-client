/*
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.client;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class SundrioConfigBuilderTest {
  @Test
  void hasExpectedNumberOfFields() {
    assertThat(Arrays.stream(SundrioConfigFluent.class.getDeclaredFields())
        .filter(f -> !Modifier.isStatic(f.getModifiers()))
        .collect(Collectors.toList()))
        .withFailMessage("You've probably modified Config and SundrioConfig constructor annotated with @Buildable," +
            "please update the ConfigFluent.copyInstance method too")
        .hasSize(51);
  }
}
