package com.miaoshaproject.error;

public enum EmBusinessError implements CommonError {
    //通用错误类型00001
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    UNKNOWN_ERROR(10002,"未知错误"),

    //10000开头为用户相关错误定义
    USER_NOT_EXIST(20001,"用户不存在"),
    USER_LOGIN_FAIL(20002,"用户手机号和密码不正确"),
    USER_NOT_LOGIN(20003,"用户还未登陆"),
    ITEM_NOT_EXIST(30001,"商品不存在"),
    STOCK_NOT_ENOUGH(30002,"库存不足")
    ;

    private  EmBusinessError(int errCode,String errMsg){
        this.errCode=errCode;
        this.errMsg=errMsg;
    }
    private  int  errCode;
    private  String errMsg;
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
        this.errMsg=errMsg;
        return this;
    }
}
