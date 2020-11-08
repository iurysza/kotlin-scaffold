/*
 * Copyright (C) 2020 Iury Souza.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.iurysza.kotlinscaffold

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class LibraryTest : BehaviorSpec({
  given("an instance of Library") {
    `when`("some library method is called") {
      then("it should return true") {
        Library().someLibraryMethod() shouldBe true
      }
    }
  }
})
