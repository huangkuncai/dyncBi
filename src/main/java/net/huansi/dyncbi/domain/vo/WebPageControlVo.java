package net.huansi.dyncbi.domain.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by liuhongchun on 2021/12/24 上午11:44
 */
@Data
public class WebPageControlVo implements Serializable {
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
