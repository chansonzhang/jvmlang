package com.chansonzhang.demo

import com.chansonzhang.demo.util.JsonUtils
import org.mockito.ArgumentMatchers.any
import org.mockito.IdiomaticMockito.{DoSomethingOps, returned}
import org.mockito.Mockito.{spy, when}
import org.mockito.invocation.InvocationOnMock
import org.mockito.stubbing.Answer
import org.scalamock.scalatest.MockFactory
import org.scalatest.flatspec.AnyFlatSpec

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
 * @since 2021/5/21 10:37
 * @author Zhang Chen(ChansonZhang)
 */
class DemoBehaviorSpec extends AnyFlatSpec with MockFactory{
  val map = new mutable.HashMap[String,Object]()
  "stubbing" should "work" in {
    val spiedBehavior=spy(new DemoBehavior)
    "test input" willBe returned by spiedBehavior.getString(any[String])
    val  ans:Answer[Unit] = new Answer[Unit] {
      override def answer(invocationOnMock: InvocationOnMock): Unit = {
        val key:String = invocationOnMock.getArgument(0)
        val value:Object = invocationOnMock.getArgument(1)
        map.put(key,value)
        ()
      }
    }

    when(spiedBehavior.setOutputValue(any[String],any[Object])).thenAnswer(ans)
    spiedBehavior.execute()
    assert(map.contains("out"))
    println("map: "+JsonUtils.toJsonString(map))
  }
}
