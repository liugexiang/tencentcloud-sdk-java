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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextTranslateBatchRequest extends AbstractModel{

    /**
    * 源语言，参照Target支持语言列表
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 目标语言，参照支持语言列表
<li> zh : 简体中文 </li> <li> zh-TW : 繁体中文 </li><li> en : 英文 </li><li> jp : 日语 </li> <li> kr : 韩语 </li><li> de : 德语 </li><li> fr : 法语 </li><li> es : 西班牙文 </li> <li> it : 意大利文 </li><li> tr : 土耳其文 </li><li> ru : 俄文 </li><li> pt : 葡萄牙文 </li><li> vi : 越南文 </li><li> id : 印度尼西亚文 </li><li> ms : 马来西亚文 </li><li> th : 泰文 </li><li> auto : 自动识别源语言，只能用于source字段 </li>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 待翻译的文本列表，批量接口可以以数组方式在一次请求中填写多个待翻译文本。文本统一使用utf-8格式编码，非utf-8格式编码字符会翻译失败，请传入有效文本，html标记等非常规翻译文本会翻译失败。单次请求的文本长度总和需要低于2000。
    */
    @SerializedName("SourceTextList")
    @Expose
    private String [] SourceTextList;

    /**
     * Get 源语言，参照Target支持语言列表 
     * @return Source 源语言，参照Target支持语言列表
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 源语言，参照Target支持语言列表
     * @param Source 源语言，参照Target支持语言列表
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 目标语言，参照支持语言列表
<li> zh : 简体中文 </li> <li> zh-TW : 繁体中文 </li><li> en : 英文 </li><li> jp : 日语 </li> <li> kr : 韩语 </li><li> de : 德语 </li><li> fr : 法语 </li><li> es : 西班牙文 </li> <li> it : 意大利文 </li><li> tr : 土耳其文 </li><li> ru : 俄文 </li><li> pt : 葡萄牙文 </li><li> vi : 越南文 </li><li> id : 印度尼西亚文 </li><li> ms : 马来西亚文 </li><li> th : 泰文 </li><li> auto : 自动识别源语言，只能用于source字段 </li> 
     * @return Target 目标语言，参照支持语言列表
<li> zh : 简体中文 </li> <li> zh-TW : 繁体中文 </li><li> en : 英文 </li><li> jp : 日语 </li> <li> kr : 韩语 </li><li> de : 德语 </li><li> fr : 法语 </li><li> es : 西班牙文 </li> <li> it : 意大利文 </li><li> tr : 土耳其文 </li><li> ru : 俄文 </li><li> pt : 葡萄牙文 </li><li> vi : 越南文 </li><li> id : 印度尼西亚文 </li><li> ms : 马来西亚文 </li><li> th : 泰文 </li><li> auto : 自动识别源语言，只能用于source字段 </li>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标语言，参照支持语言列表
<li> zh : 简体中文 </li> <li> zh-TW : 繁体中文 </li><li> en : 英文 </li><li> jp : 日语 </li> <li> kr : 韩语 </li><li> de : 德语 </li><li> fr : 法语 </li><li> es : 西班牙文 </li> <li> it : 意大利文 </li><li> tr : 土耳其文 </li><li> ru : 俄文 </li><li> pt : 葡萄牙文 </li><li> vi : 越南文 </li><li> id : 印度尼西亚文 </li><li> ms : 马来西亚文 </li><li> th : 泰文 </li><li> auto : 自动识别源语言，只能用于source字段 </li>
     * @param Target 目标语言，参照支持语言列表
<li> zh : 简体中文 </li> <li> zh-TW : 繁体中文 </li><li> en : 英文 </li><li> jp : 日语 </li> <li> kr : 韩语 </li><li> de : 德语 </li><li> fr : 法语 </li><li> es : 西班牙文 </li> <li> it : 意大利文 </li><li> tr : 土耳其文 </li><li> ru : 俄文 </li><li> pt : 葡萄牙文 </li><li> vi : 越南文 </li><li> id : 印度尼西亚文 </li><li> ms : 马来西亚文 </li><li> th : 泰文 </li><li> auto : 自动识别源语言，只能用于source字段 </li>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0 
     * @return ProjectId 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0
     * @param ProjectId 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 待翻译的文本列表，批量接口可以以数组方式在一次请求中填写多个待翻译文本。文本统一使用utf-8格式编码，非utf-8格式编码字符会翻译失败，请传入有效文本，html标记等非常规翻译文本会翻译失败。单次请求的文本长度总和需要低于2000。 
     * @return SourceTextList 待翻译的文本列表，批量接口可以以数组方式在一次请求中填写多个待翻译文本。文本统一使用utf-8格式编码，非utf-8格式编码字符会翻译失败，请传入有效文本，html标记等非常规翻译文本会翻译失败。单次请求的文本长度总和需要低于2000。
     */
    public String [] getSourceTextList() {
        return this.SourceTextList;
    }

    /**
     * Set 待翻译的文本列表，批量接口可以以数组方式在一次请求中填写多个待翻译文本。文本统一使用utf-8格式编码，非utf-8格式编码字符会翻译失败，请传入有效文本，html标记等非常规翻译文本会翻译失败。单次请求的文本长度总和需要低于2000。
     * @param SourceTextList 待翻译的文本列表，批量接口可以以数组方式在一次请求中填写多个待翻译文本。文本统一使用utf-8格式编码，非utf-8格式编码字符会翻译失败，请传入有效文本，html标记等非常规翻译文本会翻译失败。单次请求的文本长度总和需要低于2000。
     */
    public void setSourceTextList(String [] SourceTextList) {
        this.SourceTextList = SourceTextList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SourceTextList.", this.SourceTextList);

    }
}

