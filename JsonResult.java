package com.api.common;

import java.io.Serializable;

/**
 * 自定义返回Json对象
 * @author quancong
 *
 */
public class JsonResult implements Serializable {
	private static final long serialVersionUID = 5116450891657481137L;
	public static final int SUCCESS=1;
    public static final int ERROR=0;
	private int state;
	private String message;
	private Object data;
	
	public JsonResult() {
		this.state=SUCCESS;
		this.message="ok";
	}
	public JsonResult(Object data) {
		this();
		this.data=data;
	}
	public JsonResult(int state,String message) {
		this.state=state;
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	public Object getData() {
		return data;
	}
	public int getState() {
		return state;
	}
}
