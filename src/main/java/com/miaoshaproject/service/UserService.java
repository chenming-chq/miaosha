package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

public interface UserService {
    //用户id获取用户对象
    UserModel geyUserById(Integer id);
    void register(UserModel userModel) throws BusinessException;
    UserModel validateLogin(String telphone,String encrptPassword) throws BusinessException;
}
