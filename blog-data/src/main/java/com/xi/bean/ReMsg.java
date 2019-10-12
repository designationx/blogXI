package com.xi.bean;

/**
 * 返回信息类
 * code   信息代码 200
 * msg    信息结果 成功
 * data   返回数据
 */
public class ReMsg {
    private int code;
    private String msg;
    private Object data;

    public ReMsg() {
    }

    public ReMsg(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
