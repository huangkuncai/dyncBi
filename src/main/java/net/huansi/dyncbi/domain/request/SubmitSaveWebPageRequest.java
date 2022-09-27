package net.huansi.dyncbi.domain.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "提交实体")
public class SubmitSaveWebPageRequest implements Serializable {
    @ApiModelProperty(value = "分组id", required = true)
    private Long groupId;
}
