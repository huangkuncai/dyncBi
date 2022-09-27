package net.huansi.dyncbi.domain.dto;

import io.swagger.annotations.ApiModel;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author kc
 * @since 2022-01-20
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "WebPageUnit对象", description = "")
public class WebPageUnitDTO {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long tenantId;

    private String unitName;

    private Map<String,Object> unitConfig;

    private String uintImage;

    private Long parentId;

    private List<WebPageUnitDTO> children;

}
