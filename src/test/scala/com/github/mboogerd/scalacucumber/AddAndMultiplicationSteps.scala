/*
 * Copyright 2017 Merlijn Boogerd
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

package com.github.mboogerd.scalacucumber

import cucumber.api.scala.{ EN, ScalaDsl }
import org.scalatest.Matchers

/** AddAndMultiplySteps */
class AddAndMultiplicationSteps extends ScalaDsl with EN with Matchers {
  var x: Int = 0
  var y: Int = 0
  var z: Int = 0

  Given("""^a variable x with value (\d+)$""") { (arg0: Int) =>
    x = arg0
  }

  Given("""^a variable y with value (\d+)$""") { (arg0: Int) =>
    y = arg0
  }

  When("""^I multiply x \* y$""") { () =>
    z = x * y
  }

  When("""^I add x \+ y$""") { () =>
    z = x + y
  }

  Then("""^I get (\d+)$""") { (arg0: Int) =>
    z shouldBe arg0
  }
}