package com.chansonzhang.demo;

import lombok.val;

import java.util.ArrayList;

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
 * @since 2021/6/3 16:59
 */
public class JavaData {
    public static ArrayList<ArrayList<Float[]>> getJavaData(){
        val list1=new ArrayList<ArrayList<Float[]>>();
        for (int i =0;i< 10;i++){
            val list2 = new ArrayList<Float[]>();
            for (int j =0;j<20;j++){
                val arr3 = new Float[30];
                for (int k=0;k<30;k++){
                    arr3[k] = (float)(i+j+k);
                }
                list2.add(arr3);
            }
            list1.add(list2);
        }
        return list1;
    }
}
