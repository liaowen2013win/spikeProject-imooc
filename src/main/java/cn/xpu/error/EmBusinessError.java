/**
 * @(#)EmBusinessError.java, 2019/08/29. 16:28
 * @Author: L.Wen
 * <p/>
 */
package cn.xpu.error;

import javax.print.attribute.standard.OrientationRequested;

/**
 * @Author: L.Wen
 * @created_at: 2019/08/29 16:28
 */
public enum EmBusinessError implements CommonError {

    //    通用错误类型10001
    PARAMETER_VALIDATION_ERROR(10001, "参数不正确"),
    //    未知错误类型10002
    UNKNOWN_ERROR(10002, "未知错误"),
    //    20000开头的为用户信息相关的错误定义
    USER_NOT_EXIST(20001, "用户不存在"),
    USER_LOGIN_FAIL(20002, "用户手机号或密码不正确");

    private int errCode;
    private String errMsg;

    EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
