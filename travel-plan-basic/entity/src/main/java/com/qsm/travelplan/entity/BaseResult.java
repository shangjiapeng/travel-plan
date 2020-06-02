package com.qsm.travelplan.entity;

import java.io.Serializable;

/**
 * @Author: shangjp
 * @Email: shangjp@163.com
 * @Date: 2020/5/29 13:20
 * @Description:
 */
public class BaseResult implements Serializable {

    private int code;//状态码
    private String msg;//状态信息
    private Object data;//相应具体的数据

    public BaseResult() {
    }

    public BaseResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


}
