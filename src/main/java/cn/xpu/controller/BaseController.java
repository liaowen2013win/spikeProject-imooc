/**
 * 公共Controller
 *
 * @(#)BaseController.java, 2019/08/29. 17:46
 * @Author: L.Wen
 * <p/>
 */
package cn.xpu.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import cn.xpu.error.BusinessException;
import cn.xpu.error.EmBusinessError;
import cn.xpu.response.CommonReturnType;

/**
 * @Author: L.Wen
 * @created_at: 2019/08/29 17:46
 */
public class BaseController {

    public static final String CONTENT_TYPE_FORMED = "application/x-www-form-urlencoded";

    /**
     * 定义ExceptionHandler来解决未被Controller层吸收的Exception
     *
     * @param request
     * @param exception
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handlerException(HttpServletRequest request, Exception exception) {
        Map<String, Object> responseData = new HashMap<>();
        if (exception instanceof BusinessException) {
            BusinessException businessException = (BusinessException) exception;
            responseData.put("errCode", businessException.getErrCode());
            responseData.put("errMsg", businessException.getErrMsg());
        } else {
            responseData.put("errCode", EmBusinessError.UNKNOWN_ERROR.getErrCode());
            responseData.put("errMsg", EmBusinessError.UNKNOWN_ERROR.getErrMsg());
        }
        exception.printStackTrace();
        return CommonReturnType.create(responseData, CommonReturnType.FAIL);
    }


}
