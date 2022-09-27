package net.huansi.dyncbi.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author kc
 * @date 2022/4/24 0024 10:15
 */
@Data
public class WebPageControlApiDTO {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "动态UI页面表主键")
    private Long pageId;

    @ApiModelProperty(value = "控件code")
    private String controlCode;

    @ApiModelProperty(value = "接口地址")
    private String apiUrl;

    @ApiModelProperty(value = "请求方式 0:get,1:post,2:put")
    private Integer requestMode;

    @ApiModelProperty(value = "请求参数json")
    private String requestJson;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "是否激活")
    private Boolean activeStatus;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "创建人")
    private Long creatorId;

    @ApiModelProperty(value = "创建人")
    private String creatorName;

    @ApiModelProperty(value = "是否被锁定")
    private Boolean isLocked;

    @ApiModelProperty(value = "修改人")
    private Long modifyId;

    @ApiModelProperty(value = "修改人")
    private String modifyName;

    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;

    @ApiModelProperty(value = "时间戳")
    private Timestamp timeStamp;

    @ApiModelProperty(value = "是否启用")
    private Boolean usable;

    @ApiModelProperty(value = "返回数据格式（1：二维数组、2：对象数组）")
    private Integer dataType;

    @ApiModelProperty(value = "结果集所在节点")
    private String dataNode;

    @ApiModelProperty(value = "API名称")
    private String controlApiName;

    @ApiModelProperty(value = "数据源类型 0=db 1=api")
    private Integer sourceType;

    @ApiModelProperty(value = "是否为导入的API")
    private Integer isImport;
}
