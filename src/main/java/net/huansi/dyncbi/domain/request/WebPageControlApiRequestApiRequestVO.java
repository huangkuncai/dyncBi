package net.huansi.dyncbi.domain.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "WebPageControlApiRequestApiRequestVO")
public class WebPageControlApiRequestApiRequestVO {

    @ApiModelProperty(value = "控件code")
    private String controlCode;

    @ApiModelProperty(value = "参数类型（1：二维数组、2：对象数组）", required = true)
    private Integer objectFormat;

    @ApiModelProperty(value = "请求参数")
    private String nowReqJson;

    @ApiModelProperty("pageId")
    private Long pageId;

    @ApiModelProperty("dyncApiId")
    private Long dyncApiId;

    @ApiModelProperty("isPublish =1 调用已提交的记录 =0 调用最新的记录")
    private Integer isPublish;
}
