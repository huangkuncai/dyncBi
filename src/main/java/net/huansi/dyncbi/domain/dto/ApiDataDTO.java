package net.huansi.dyncbi.domain.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.huansi.dyncbi.domain.request.AddWebPageControlApiRequest;

/**
 * @author lucky
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ApiDataDTO extends AddWebPageControlApiRequest {

    private Long id;


}

