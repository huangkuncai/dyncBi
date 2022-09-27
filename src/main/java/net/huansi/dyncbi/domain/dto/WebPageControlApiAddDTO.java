package net.huansi.dyncbi.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author kc
 * @date 2022/5/30 0030 20:29
 */
@Data
public class WebPageControlApiAddDTO {

    @ApiModelProperty("WebPageControlApi的Id")
    private Long id;

    @ApiModelProperty("是否为导入0否 1是")
    private Integer isImport;

}
