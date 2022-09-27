package net.huansi.dyncbi.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author wzz
 * @since 2022-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "WebPageControlApi对象", description = "")
public class WebPageControlApi implements Serializable {

    private static final long serialVersionUID = 1L;

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

    private Integer sourceType;
    private String tenantId;
    private Long dyncApiId;
    //API名称
    private String controlApiName;
    private Integer isImport;
}
