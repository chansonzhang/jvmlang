package com.chansonzhang.demo

import spock.lang.Specification

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
 * @since 2021/6/28 17:36
 * @author Zhang Chen(ChansonZhang)
 */
class DemoObjectSpecification extends Specification{
    def "testSpy"(){
        given:
        var obj = Spy(DemoObject)
        when:
        println()
        then:
        obj.getName() == "zc"
        obj.valueIsReal()
    }

    def "testMock"(){
        given:
        var obj = Mock(DemoObject)
        when:
        println()
        then:
        obj.getName() == null
        null == obj.valueIsReal()
    }
}
