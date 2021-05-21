package com.chansonzhang.demo;

import java.util.HashMap;
import java.util.Map;

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
 * @author Zhang Chen(ChansonZhang)
 * @since 2021/5/13 21:42
 */
public class DemoBase {
    Map<String, Object> output = new HashMap<>();

    public Integer getInt(String key) {
        return null;
    }

    public String getString(String key) {
        return null;
    }

    public Boolean getBoolean(String key) {
        return null;
    }

    public void setOutputValue(String key, Object value) {
        this.output.put(key, value);
    }
}
