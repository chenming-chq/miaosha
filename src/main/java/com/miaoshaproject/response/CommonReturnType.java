package com.miaoshaproject.response;

public class CommonReturnType {

    //表明请求返回结果为"success"或"fail"
    private  String status;

    //若status=success，则返回前端需要的数据
    //若fail则返回通用错误码格式
    private  Object data;

    //定义通用创建方法
    public static CommonReturnType create(Object result){
        return  CommonReturnType.create(result,"success");

    }

    public static CommonReturnType create(Object result,String status){
        CommonReturnType type =new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;
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
