package com.chansonzhang.demo

/**
 * Copyright 2021 Zhang, Chen. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @since 2021/5/13 21:41
 * @author Zhang Chen(ChansonZhang)
 */

import com.chansonzhang.demo.util.{JavaDataUtils, JsonUtils}
import lombok.extern.slf4j.Slf4j

import scala.collection.mutable

class DemoBehavior extends DemoBase {
  def getJsonParam: String = {
    val name = Option(this.getString("name"))
    val age = JavaDataUtils.getIntFromJava(this, "age")
    val married = JavaDataUtils.getBooleanFromJava(this, "married")


    val param = DemoParam(
      name,
      age,
      married)
    JsonUtils.toJsonString(param)
  }

  def execute(): Unit = {
    val input = this.getString("input")
    println("input: " + input)
    val value = "do some compute"
    setOutputValue("out", value)
  }

  def sum():Int={
    var rst = sumTuple(1,2)
    rst
  }

  def sumTuple(tuple2: Tuple2[Int, Int]):Int = {
    tuple2._1 + tuple2._2
  }

}
