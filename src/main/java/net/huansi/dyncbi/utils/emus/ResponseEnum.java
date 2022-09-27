package net.huansi.dyncbi.utils.emus;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 异常枚举
 *
 * @author kc
 * @date 2021/12/21 0021 11:14
 */
@Getter
@AllArgsConstructor
public enum ResponseEnum {

    /**
     * 0 返回成功
     */
    CODE_0("0", "返回成功"),
    /**
     * 5 无相关数据
     */
    CODE_5("5", "无相关数据"),
    /**
     * 8 参数有误
     */
    CODE_8("8", "参数有误"),
    /**
     * 9 发生错误
     */
    CODE_9("9", "发生错误"),

    ;
    private final String code;
    private final String message;
}
