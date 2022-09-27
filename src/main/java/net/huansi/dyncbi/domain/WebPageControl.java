package net.huansi.dyncbi.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by liuhongchun on 2021/12/24 上午11:04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("web_page_control")
@ApiModel(description = "WebPageControl对象")
public class WebPageControl implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
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
    private String controlCode;
}
