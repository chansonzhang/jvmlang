package com.chansonzhang.demo.util

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
 * @since 2021/5/13 21:22
 * @author Zhang Chen(ChansonZhang)
 */

import org.json4s.{DefaultFormats, Formats}
import org.json4s.native.Serialization.{read, write}
import scala.reflect.Manifest

object JsonUtils {
  implicit def format: Formats = DefaultFormats

  def toJsonString(obj: AnyRef): String = {
    write(obj)
  }

  def fromJsonString4j[A](json: String)(cls: Class[A]): A = {
    fromJsonString(json)(Manifest.classType(cls))
  }

  def fromJsonString[A](json: String)(implicit mf: Manifest[A]): A = read(json)
}
