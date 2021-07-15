package com.chansonzhang.demo

import org.scalamock.scalatest.MockFactory
import org.scalatest.flatspec.AnyFlatSpec
import com.chansonzhang.demo.util.JsonUtils

import scala.collection.mutable

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
 *
 * @since 2021/6/8 19:45
 * @author Zhang Chen(ChansonZhang)
 */
class JsonUtilsSpec extends AnyFlatSpec with MockFactory{
  "emptyMap" should "serialize" in {
    //val map:mutable.Map[String,mutable.Map[String,Double]] = mutable.Map.em
    val json = JsonUtils.toJsonString(collection.Map.empty)
    println(json)
    val map1 = JsonUtils.fromJsonString[mutable.Map[String,mutable.Map[String,Double]]](json)
    print(map1)
  }
}
