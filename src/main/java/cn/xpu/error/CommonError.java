/**
 * @(#)CommonError.java, 2019/08/29. 15:41
 * @Author: L.Wen
 * <p/>
 */
package cn.xpu.error;

/**
 * @Author: L.Wen
 * @created_at: 2019/08/29 15:41
 */
public interface CommonError {

    int getErrCode();

    String getErrMsg();

    CommonError setErrMsg(String errMsg);
}
