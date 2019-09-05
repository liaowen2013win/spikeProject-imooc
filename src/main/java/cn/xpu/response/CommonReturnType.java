/**
 * @(#)CommonReturnType.java, 2019/08/29. 15:25
 * @Author: L.Wen
 * <p/>
 */
package cn.xpu.response;

/**
 * 通用数据返回格式
 *
 * @Author: L.Wen
 * @created_at: 2019/08/29 15:25
 */
public class CommonReturnType {

    public static final String SUCCESS = "success";
    public static final String FAIL = "fail";

    private String status;
    private Object data;

    public static CommonReturnType create(Object result) {
        return CommonReturnType.create(result, SUCCESS);
    }

    public static CommonReturnType create(Object result, String status) {
        CommonReturnType commonReturnType = new CommonReturnType();
        commonReturnType.setStatus(status);
        commonReturnType.setData(result);
        return commonReturnType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
