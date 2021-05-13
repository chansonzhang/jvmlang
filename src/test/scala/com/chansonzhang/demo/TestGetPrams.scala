package com.chansonzhang.demo

import com.chansonzhang.demo.util.JsonUtils
import org.json4s.native.Serialization
import org.json4s.{Formats, NoTypeHints}

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
 * @since 2021/5/13 23:37
 * @author Zhang Chen(ChansonZhang)
 */
import com.chansonzhang.demo.util.JsonUtils.fromJsonString

object TestGetPrams {
  def main(args: Array[String]): Unit = {
    val param = DemoParam(Some("zc"), Some(160), Some(false))
    val json = JsonUtils.toJsonString(param)
    println(json)

    implicit val formats: Formats = Serialization.formats(NoTypeHints)
    val obj: DemoParam = fromJsonString[DemoParam](json)

    println(obj.name)
    assert(obj.name.get == "zc")
  }
}
