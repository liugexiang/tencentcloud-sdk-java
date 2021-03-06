/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuestionBlockObj extends AbstractModel{

    /**
    * 数学试题识别结构化信息数组
    */
    @SerializedName("QuestionArr")
    @Expose
    private QuestionObj [] QuestionArr;

    /**
     * Get 数学试题识别结构化信息数组 
     * @return QuestionArr 数学试题识别结构化信息数组
     */
    public QuestionObj [] getQuestionArr() {
        return this.QuestionArr;
    }

    /**
     * Set 数学试题识别结构化信息数组
     * @param QuestionArr 数学试题识别结构化信息数组
     */
    public void setQuestionArr(QuestionObj [] QuestionArr) {
        this.QuestionArr = QuestionArr;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "QuestionArr.", this.QuestionArr);

    }
}

