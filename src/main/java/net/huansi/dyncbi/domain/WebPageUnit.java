package net.huansi.dyncbi.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author kc
 * @since 2022-01-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("web_page_unit")
@ApiModel(value="WebPageUnit对象", description="")
public class WebPageUnit extends Model<WebPageUnit> {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long tenantId;

    private String unitName;

    private String unitConfig;

    private String uintImage;

    private Boolean usable;

    private Long parentId;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
