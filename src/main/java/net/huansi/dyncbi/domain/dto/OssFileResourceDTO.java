package net.huansi.dyncbi.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author kc
 * @date 2021/12/21 0021 14:48
 */
@Data
public class OssFileResourceDTO {
    /**
     * 文件资源表id 删除时取该id
     */
    @ApiModelProperty(value = "文件资源表id 删除时取该id", name = "id")
    private Long id;
    /**
     * 上传文件名称
     */
    @ApiModelProperty(value = "上传文件名称", name = "name")
    private String name;

    /**
     * oss记录表id
     */
    @ApiModelProperty(value = "oss记录表id", name = "fileId")
    private Long fileId;

    /**
     * 0为目录 1为文件
     */
    @ApiModelProperty(value = "0为目录 1为文件", name = "type")
    private Integer type;

    /**
     * 父级Id
     */
    @ApiModelProperty(value = "父级Id", name = "parentId")
    private Long parentId;

    /**
     * 缩略图
     */
    @ApiModelProperty(value = "缩略图", name = "thumbnail")
    private String thumbnail;

    /**
     * 文件大小
     */
    @ApiModelProperty(value = "文件大小", name = "fileSize")
    private Long fileSize;

    /**
     * 文件类型
     */
    @ApiModelProperty(value = "文件类型", name = "fileType")
    private String fileType;

    /**
     * 关联的文件
     */
    @ApiModelProperty(value = "关联的文件", name = "ossFileDto")
    private OssFileDTO ossFileDto;
}
