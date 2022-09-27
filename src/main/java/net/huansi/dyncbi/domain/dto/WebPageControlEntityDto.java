package net.huansi.dyncbi.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class WebPageControlEntityDto implements Serializable {
    private Long id;
    private Long pageId;
    private String controlName;
    private String controlType;
    private String jsonConfig;
    private String jsonData;
    private LocalDate createTime;
    private LocalDate updateTime;
    private Boolean isMock;
    private Integer usable;
}
