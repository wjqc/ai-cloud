package com.cloud.auth.api.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 操作日志记录对象 user_oper_log
 * 
 * @author ai-cloud
 */
@ApiModel("操作日志记录")
public class UserOperLog{

    private static final long serialVersionUID = 1L;

    /** 操作日志记录ID */
    private String id;

    /** 模块标题 */
    @ApiModelProperty(value = "模块标题",example = "String")
    private String title;

    /** 业务类型（0其它 1查询 2新增 3修改 4删除） */
    @ApiModelProperty(value = "业务类型",example = "Integer")
    private Integer businessType;

    /** 方法名称 */
    @ApiModelProperty(value = "方法名称",example = "String")
    private String method;

    /** 请求方式 */
    @ApiModelProperty(value = "请求方式",example = "String")
    private String requestMethod;

    /** 操作类别（0其它 1小程序用户 2手机端用户） */
    @ApiModelProperty(value = "操作类别",example = "Integer")
    private Integer operatorType;

    /** 操作人员 */
    @ApiModelProperty(value = "操作人员",example = "String")
    private String operName;

    /** 部门名称 */
    @ApiModelProperty(value = "部门名称",example = "String")
    private String deptName;

    /** 请求URL */
    @ApiModelProperty(value = "请求URL",example = "String")
    private String operUrl;

    /** 主机地址 */
    @ApiModelProperty(value = "主机地址",example = "String")
    private String operIp;

    /** 操作地点 */
    @ApiModelProperty(value = "操作地点",example = "String")
    private String operLocation;

    /** 请求参数 */
    @ApiModelProperty(value = "请求参数",example = "String")
    private String operParam;

    /** 返回参数 */
    @ApiModelProperty(value = "返回参数",example = "String")
    private String jsonResult;

    /** 操作状态（0正常 1异常） */
    @ApiModelProperty(value = "操作状态",example = "Integer")
    private Integer status;

    /** 错误消息 */
    @ApiModelProperty(value = "错误消息",example = "String")
    private String errorMsg;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value ="操作时间",example = "Date")
    private Date operTime;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setBusinessType(Integer businessType){
        this.businessType = businessType;
    }
    public Integer getBusinessType(){
        return businessType;
    }
    public void setMethod(String method){
        this.method = method;
    }
    public String getMethod(){
        return method;
    }
    public void setRequestMethod(String requestMethod){
        this.requestMethod = requestMethod;
    }
    public String getRequestMethod(){
        return requestMethod;
    }
    public void setOperatorType(Integer operatorType){
        this.operatorType = operatorType;
    }
    public Integer getOperatorType(){
        return operatorType;
    }
    public void setOperName(String operName){
        this.operName = operName;
    }
    public String getOperName(){
        return operName;
    }
    public void setDeptName(String deptName){
        this.deptName = deptName;
    }
    public String getDeptName(){
        return deptName;
    }
    public void setOperUrl(String operUrl){
        this.operUrl = operUrl;
    }
    public String getOperUrl(){
        return operUrl;
    }
    public void setOperIp(String operIp){
        this.operIp = operIp;
    }
    public String getOperIp(){
        return operIp;
    }
    public void setOperLocation(String operLocation){
        this.operLocation = operLocation;
    }
    public String getOperLocation(){
        return operLocation;
    }
    public void setOperParam(String operParam){
        this.operParam = operParam;
    }
    public String getOperParam(){
        return operParam;
    }
    public void setJsonResult(String jsonResult){
        this.jsonResult = jsonResult;
    }
    public String getJsonResult(){
        return jsonResult;
    }
    public void setStatus(Integer status){
        this.status = status;
    }
    public Integer getStatus(){
        return status;
    }
    public void setErrorMsg(String errorMsg){
        this.errorMsg = errorMsg;
    }
    public String getErrorMsg(){
        return errorMsg;
    }
    public void setOperTime(Date operTime){
        this.operTime = operTime;
    }
    public Date getOperTime(){
        return operTime;
    }

}
