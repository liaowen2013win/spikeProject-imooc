/**
 * @(#)BusinessException.java, 2019/08/29. 17:05
 * @Author: L.Wen
 * <p/>
 */
package cn.xpu.error;

/**
 * 采用包装器设计模式实现业务异常处理
 *
 * @Author: L.Wen
 * @created_at: 2019/08/29 17:05
 */
public class BusinessException extends Exception implements CommonError {


    private CommonError commonError;

    //    直接接收EmBusinessError的传参，用于构造业务异常
    public BusinessException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }


    //    接收自定义错误信息
    public BusinessException(CommonError commonError, String errMsg) {
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);
    }


    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}