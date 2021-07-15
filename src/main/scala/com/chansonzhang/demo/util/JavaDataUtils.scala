package com.chansonzhang.demo.util

import com.chansonzhang.demo.{DemoBase, JavaData}

import java.util

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
 * @since 2021/5/13 21:50
 * @author Zhang Chen(ChansonZhang)
 */
object JavaDataUtils {
  def main(args: Array[String]): Unit = {
    val javaData = JavaData.getJavaData

    val json = JsonUtils.toJsonString(javaData)
    val scalaData = JsonUtils.fromJsonString[Array[Array[Array[Float]]]](json)


    javaData.toArray().map(a=>a)

    println(scalaData)
  }

  def parse2d(list: util.List[Array[Float]])={
    list.toArray().map(a=>a)
  }
  def getIntFromJava(behavior: DemoBase, key: String): Option[Int] = {
    val javaValue = behavior.getInt(key)
    if (null == javaValue) None else Option(javaValue.intValue())
  }

  def getBooleanFromJava(behavior: DemoBase, key: String): Option[Boolean] = {
    val javaValue = behavior.getBoolean(key)
    if (null == javaValue) None else Option(javaValue.booleanValue())
  }

}
