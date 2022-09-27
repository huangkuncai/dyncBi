package net.huansi.dyncbi.domain.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * @author kc
 * @date 2022/4/28 0028 16:08
 */
@Data
public class AddWebPageControlApiRequest{

    @ApiModelProperty(
            value = "接口名",
            required = true
    )
    private String apiName;
    @ApiModelProperty(
            value = "源接口名称,当sourceType为API时必传,为DB是可不传",
            required = true
    )
    private String apiNameSource;
    @ApiModelProperty("分组ID")
    private Long groupId;
    @ApiModelProperty("分组名称")
    private String groupName;
    @ApiModelProperty("源API分组,sourceType = 0,类型为DB时可不传")
    private String apiGroup;
    @ApiModelProperty(
            value = "请求方式(get,post ,put ,delete ,head  , options,patch),必传,传的是字符串",
            required = true
    )
    private String apiType;

    @ApiModelProperty(
            value = "请求方式( 0 get,1 post ,2 put ,3 delete ,4 head  , 5 options,6 patch)必传,传的是枚举值",
            required = true
    )
    private Integer requestMode;

    @ApiModelProperty("发布Api接口路径,可自定义")
    private String apiPath;
    @ApiModelProperty("源Api接口路径,当sourceType= 1(API)时,源Api路径必须为可Http请求的正常地址")
    private String apiUrl;
    @ApiModelProperty("完整接口路径")
    private String fullApiPath;
    @ApiModelProperty("标签Id")
    private Long tagId;
    @ApiModelProperty("标签名称")
    private String tagName;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("源备注")
    private String remarkSource;
    @ApiModelProperty("发布入参(入参包含header),根据sourceType不同,其值也不同,当sourceType= 0(DB)时入参中的request_body为对象,例:{\"request_header\":{},\"request_body\":{\"id\":{\"name\":\"id\",\"value\":\"11111\",\"isnull\":\"必须\",\"title\":\"\",\"remark\":\"\",\"isDefault\":\"\",\"type\":\"String\",\"row_index\":1}},\"query_params\":{},\"rest_params\":{}} .当sourceType= 1(API)时,入参中的request_body为jsonSchem,例:{\"request_header\":{},\"request_body\":{\"type\":\"object\",\"title\":\"title\",\"properties\":{\"id\":{\"type\":\"string\"}},\"required\":[\"id\"]},\"query_params\":{},\"rest_params\":{}}")
    private String requestParams;
    @ApiModelProperty("(发布)出参,根据sourceType不同,其值也不同,当sourceType= 0(DB) 其值为对象,例:{\"id\":{\"name\":\"id\",\"value\":\"11111\",\"isnull\":\"必须\",\"title\":\"\",\"remark\":\"\",\"isDefault\":\"\",\"type\":\"String\",\"row_index\":1},\"resource_name\":{\"name\":\"id\",\"value\":\"11111\",\"isnull\":\"必须\",\"title\":\"\",\"remark\":\"\",\"isDefault\":\"\",\"type\":\"String\",\"row_index\":1},\"resource_type\":{\"name\":\"id\",\"value\":\"11111\",\"isnull\":\"必须\",\"title\":\"\",\"remark\":\"\",\"isDefault\":\"\",\"type\":\"String\",\"row_index\":1}}.当sourceType= 1(API)时,其值为jsonSchem,例:{\"type\":\"object\",\"title\":\"title\",\"properties\":{\"id\":{\"type\":\"string\"},\"name\":{\"type\":\"string\"}},\"required\":[\"id\",\"name\"]}")
    private String responseParams;
    @ApiModelProperty("源入参(入参包含header),根据sourceType不同,其值也不同,当sourceType= 0(DB)时入参中的request_body为对象,例:{\"request_header\":{},\"request_body\":{\"id\":{\"name\":\"id\",\"value\":\"11111\",\"isnull\":\"必须\",\"title\":\"\",\"remark\":\"\",\"isDefault\":\"\",\"type\":\"String\",\"row_index\":1}},\"query_params\":{},\"rest_params\":{}} .当sourceType= 1(API)时,入参中的request_body为jsonSchem,例:{\"request_header\":{},\"request_body\":{\"type\":\"object\",\"title\":\"title\",\"properties\":{\"id\":{\"type\":\"string\"}},\"required\":[\"id\"]},\"query_params\":{},\"rest_params\":{}}")
    private String requestParamsSource;
    @ApiModelProperty("(源)出参,根据sourceType不同,其值也不同,当sourceType= 0(DB) 其值为对象,例:{\"id\":{\"name\":\"id\",\"value\":\"11111\",\"isnull\":\"必须\",\"title\":\"\",\"remark\":\"\",\"isDefault\":\"\",\"type\":\"String\",\"row_index\":1},\"resource_name\":{\"name\":\"id\",\"value\":\"11111\",\"isnull\":\"必须\",\"title\":\"\",\"remark\":\"\",\"isDefault\":\"\",\"type\":\"String\",\"row_index\":1},\"resource_type\":{\"name\":\"id\",\"value\":\"11111\",\"isnull\":\"必须\",\"title\":\"\",\"remark\":\"\",\"isDefault\":\"\",\"type\":\"String\",\"row_index\":1}}.当sourceType= 1(API)时,其值为jsonSchem,例:{\"type\":\"object\",\"title\":\"title\",\"properties\":{\"id\":{\"type\":\"string\"},\"name\":{\"type\":\"string\"}},\"required\":[\"id\",\"name\"]}")
    private String responseParamsSource;
    @ApiModelProperty("数据源id")
    private Long dateResourceId;
    @ApiModelProperty(
            value = "数据类型(0 DB 1 API) ",
            required = true
    )
    private Integer sourceType;
    @ApiModelProperty("sql语句,当sourceType= 0(DB)时必传")
    private String sqlContent;
    @ApiModelProperty("是否开启请求参数转换规则(0否 1是)")
    private Integer openRequestTransfer;
    @ApiModelProperty("是否开启响应结果转换规则(0否 1是)")
    private Integer openResponseTransfer;
    @ApiModelProperty("是否自定义路由(0否 1是)")
    private Integer isCustomRoute;
    @ApiModelProperty("是否提交 0否  1是 dyncApi默认传0")
    private String isSubmit;
    @ApiModelProperty("是否走模版 0否  1是 DB类型Api判断sql语句是否走Velocity模版,如果传0 ,不使用Velocity模版,但sql语句又写了Velocity语法,则sql语句解析,运行,调用异常")
    private Integer isVelocity;
    @ApiModelProperty(value = "动态UI页面表主键")
    private Long pageId;

    @ApiModelProperty(value = "控件code")
    private String controlCode;


    @ApiModelProperty(value = "请求参数json")
    private String requestJson;


    @ApiModelProperty(value = "是否激活")
    private Boolean activeStatus;

    @ApiModelProperty(value = "返回数据格式（1：二维数组、2：对象数组）")
    private Integer dataType;

    @ApiModelProperty(value = "结果集所在节点")
    private String dataNode;

    private String controlApiName;

    private Long dyncApiId;
}
