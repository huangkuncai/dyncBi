package net.huansi.dyncbi.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author kc
 * @since 2022-04-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("control_data_resource")
@ApiModel(value = "ControlDataResource对象", description = "")
public class ControlDataResource extends Model<ControlDataResource> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "api主键")
    private Long apiId;

    @ApiModelProperty(value = "组件ID")
    private Long controlId;

    @ApiModelProperty(value = "组件编码")
    private String controlCode;


}
