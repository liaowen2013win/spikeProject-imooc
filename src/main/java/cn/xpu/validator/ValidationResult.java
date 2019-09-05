/**
 * @(#)ValidationResult.java, 2019/09/04. 13:35
 * @Author: L.Wen
 * <p/>
 */
package cn.xpu.validator;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

/**
 * 输入数据校验 工具类
 *
 * @Author: L.Wen
 * @created_at: 2019/09/04 13:35
 */
public class ValidationResult {

    // 参数是否有误
    private boolean hasError = false;
    // 存放错误信息
    private Map<String, String> errorMsgMap = new HashMap<>();

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public Map<String, String> getErrorMsgMap() {
        return errorMsgMap;
    }

    public void setErrorMsgMap(Map<String, String> errorMsgMap) {
        this.errorMsgMap = errorMsgMap;
    }

    /**
     * 实现通用的、通过格式化字符串信息获取错误结果的msg方法
     *
     * @return
     */
    public String getErrorMsg() {
        return StringUtils.join(errorMsgMap.values().toArray(), ",");

    }
}
