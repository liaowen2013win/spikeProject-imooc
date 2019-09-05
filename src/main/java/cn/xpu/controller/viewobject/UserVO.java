/**
 * @(#)UserModel.java, 2019/08/29. 13:59
 * @Author: L.Wen
 * <p/>
 */
package cn.xpu.controller.viewobject;

/**
 * 用于前台数据交互的对象模型
 *
 * @Author: L.Wen
 * @created_at: 2019/08/29 13:59
 */
public class UserVO {

    private Integer id;
    private String name;
    private Integer gender;
    private Integer age;
    private String telphone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
}
