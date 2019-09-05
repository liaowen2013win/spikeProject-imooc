/**
 * @(#)UserService.java, 2019/08/29. 13:55
 * @Author: L.Wen
 * <p/>
 */
package cn.xpu.service;

import org.apache.commons.lang3.StringUtils;

import cn.xpu.error.BusinessException;
import cn.xpu.service.model.UserModel;

/**
 * @Author: L.Wen
 * @created_at: 2019/08/29 13:55
 */
public interface UserService {

    /**
     * 根据用户id查询
     *
     * @param id
     * @return
     */
    UserModel getUserById(Integer id);

    /**
     * 用户注册
     *
     * @param userModel
     */
    void register(UserModel userModel) throws BusinessException;

    /**
     * 登录
     *
     * @param telphone
     * @param encryptPassword
     */
    UserModel validateLogin(String telphone, String encryptPassword) throws BusinessException;
}
