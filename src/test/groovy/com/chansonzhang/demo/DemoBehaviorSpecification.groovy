package com.chansonzhang.demo

import com.chansonzhang.demo.util.JsonUtils
import spock.lang.Specification
import scala.Tuple2


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
 * ==============================================================================
 *
 * @since 2021/5/13 21:20
 * @author Zhang Chen(ChansonZhang)
 */

class DemoBehaviorSpecification extends Specification {
    def testGetJsonParam() {
        given:
        var behavior = Spy(DemoBehavior.class)
        behavior.getInt("age") >> 122
        behavior.getBoolean("married") >> false
        behavior.getString("name") >> "zc"

        when:
        var json = behavior.getJsonParam()
        println(json)
        DemoParam obj = JsonUtils.fromJsonString4j(json, DemoParam.class)

        then:
        obj.age().get() == 122
        !obj.married().get()
        obj.name().get() == "zc"
    }

    def "testSumTuple"(){
        given:
        var behavior = Spy(DemoBehavior)
        behavior.sumTuple(_ as Tuple2<Integer,Integer>) >> 10

        when:
        var rst = behavior.sumTuple(Tuple2.apply(1,2))

        then:
        rst == 10
    }

    def "testSum"(){
        given:
        var behavior = Spy(DemoBehavior)

        when:
        var rst = behavior.sum()

        then:
        rst == 3
    }
}
