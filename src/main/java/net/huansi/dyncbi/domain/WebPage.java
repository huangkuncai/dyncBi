package net.huansi.dyncbi.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author kc
 * @since 2022-06-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("web_page")
@ApiModel(value="WebPage对象", description="")
public class WebPage extends Model<WebPage> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "租户ID")
    private Long tenantId;

    @ApiModelProperty(value = "页面分组ID")
    private Long groupId;

    @ApiModelProperty(value = "页面名称")
    private String pageName;

    @ApiModelProperty(value = "页面英文名称")
    private String pageEname;

    @ApiModelProperty(value = "模板ID")
    private Long templateId;

    @ApiModelProperty(value = "配置json")
    private String jsonConfig;

    @ApiModelProperty(value = "模拟数据json")
    private String jsonData;

    @ApiModelProperty(value = "版本号")
    private Long versionNumber;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "是否可用")
    private Boolean usable;

    @ApiModelProperty(value = "父级页面ID")
    private Long parentId;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "开发appID")
    private Long appId;

    @ApiModelProperty(value = "页面类型")
    private Integer pageType;

    @ApiModelProperty(value = "是否激活=0代表逻辑删除")
    private Boolean activeStatus;

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
    private Date timeStamp;

    @ApiModelProperty(value = "提交状态：0=未提交，1=已提交，3=已发布")
    private Boolean status;

    @ApiModelProperty(value = "分组名称")
    private String groupName;

    @ApiModelProperty(value = "页面url")
    private String pageUrl;

}
