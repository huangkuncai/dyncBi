package net.huansi.dyncbi.utils.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import net.huansi.dyncbi.utils.emus.ResponseEnum;

import java.io.Serializable;

/**
 * 接口返回参数
 *
 * @author kc
 * @date 2021/12/20 0020 18:06
 */
@Data
@Builder
public class ResultWrapper<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 具体数据
     */
    @ApiModelProperty("具体数据")
    private T data;
    /**
     * 是否成功
     */
    @ApiModelProperty("是否成功")
    private boolean success;
    /**
     * 描述
     */
    @ApiModelProperty("描述")
    private String message;
    /**
     * 状态码
     */
    @ApiModelProperty("状态码")
    private Integer status;
    /**
     * 错误码
     */
    @ApiModelProperty("错误码")
    private String code;
    /**
     * 请求路径
     */
    @ApiModelProperty("请求路径")
    private String path;

    private static ResultWrapper build(ResponseEnum responseEnum, boolean success) {
        return new ResultWrapperBuilder<>().code(responseEnum.getCode()).message(responseEnum.getMessage()).success(success).build();
    }

    private static ResultWrapper buildMsg(ResponseEnum responseEnum, String message, boolean success) {
        return new ResultWrapperBuilder<>().code(responseEnum.getCode()).message(message).success(success).build();
    }

    private static <T> ResultWrapper<T> build(ResponseEnum responseEnum, T data, boolean success) {
        return new ResultWrapperBuilder<T>().code(responseEnum.getCode()).message(responseEnum.getMessage()).data(data).success(success).build();
    }

    /**
     * 响应成功
     *
     * @return 无响应对象的成功响应
     */
    public static ResultWrapper ok() {
        return build(ResponseEnum.CODE_0, true);
    }

    /**
     * 响应成功
     *
     * @param message 响应消息
     * @return 无响应对象的成功响应
     */
    public static ResultWrapper okMsg(String message) {
        return buildMsg(ResponseEnum.CODE_0, message, true);
    }

    /**
     * 响应成功
     *
     * @param data 响应对象
     * @return 包含响应成功的响应对象
     */
    public static <T> ResultWrapper<T> ok(T data) {
        return build(ResponseEnum.CODE_0, data, true);
    }

    /**
     * 系统错误
     *
     * @return 响应为系统错误
     */
    public static ResultWrapper failed() {
        return build(ResponseEnum.CODE_9, false);
    }

    /**
     * 系统错误
     *
     * @param message 错误消息
     * @return 响应为系统错误
     */
    public static ResultWrapper failed(String message) {
        return buildMsg(ResponseEnum.CODE_9, message, false);
    }

    /**
     * 系统错误
     *
     * @param data 错误数据
     * @return 响应为系统错误
     */
    public static <T> ResultWrapper<T> failedData(T data) {
        return build(ResponseEnum.CODE_9, data, false);
    }

    /**
     * 自定义异常响应
     *
     * @param responseEnum 响应枚举
     * @param message      响应消息
     * @return 响应为自定义错误
     */
    public static ResultWrapper failed(ResponseEnum responseEnum, String message) {
        return buildMsg(responseEnum, message, false);
    }

    /**
     * 自定义异常响应
     *
     * @param responseEnum 响应枚举
     * @return 响应为自定义错误
     */
    public static ResultWrapper failed(ResponseEnum responseEnum) {
        return buildMsg(responseEnum, responseEnum.getMessage(), false);
    }
}
