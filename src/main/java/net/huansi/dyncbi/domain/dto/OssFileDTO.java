package net.huansi.dyncbi.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author kc
 * @date 2021/12/21 0021 10:22
 */
@Data
public class OssFileDTO {
    @ApiModelProperty(value = "文件的id", name = "fileId")
    private Long fileId;

    @ApiModelProperty(value = "保存的日期",name="date")
    private String date;

    @ApiModelProperty(value = "上传文件的文件名",name="fileName")
    private String fileName;

    @ApiModelProperty(value = "OSS服务器上保存的路径",name="filePath")
    private String filePath;

    @ApiModelProperty(value = "文件大小",name="fileSize")
    private Long fileSize;

    @ApiModelProperty(value = "文件类型",name="fileType")
    private String fileType;

    @ApiModelProperty(value = "原文件名",name="originalName")
    private String originalName;

}
