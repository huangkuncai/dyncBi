package net.huansi.dyncbi.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class WebPageControlDto implements Serializable {
    //控件名称 页面配置= pageConfig
    private String controlName;
    //页面配置json
    private String jsonConfig;
    //模拟数据json
    private String jsonData;
    //页面ID
    private String pageId;

    private String controlType;

    private String controlCode;
}
