package com.lin.blog.dto;

/**
 * 存储对服务器的请求结果
 * Created by lin on 2016/11/7.
 */
public class RequestResult<T> {
    //对服务器请求是否成功
    private boolean requestSuccess;
    //对数据操作是否成功
    private boolean operateSuccess;
    //结果
    private T result;

    public RequestResult(boolean requestSuccess, boolean operateSuccess) {
        this.requestSuccess = requestSuccess;
        this.operateSuccess = operateSuccess;
    }

    public RequestResult(boolean requestSuccess, boolean operateSuccess, T result) {
        this.requestSuccess = requestSuccess;
        this.operateSuccess = operateSuccess;
        this.result = result;
    }

    public RequestResult(boolean requestSuccess) {
        this.requestSuccess = requestSuccess;
    }

    public boolean isRequestSuccess() {
        return requestSuccess;
    }

    public void setRequestSuccess(boolean requestSuccess) {
        this.requestSuccess = requestSuccess;
    }

    public boolean isOperateSuccess() {
        return operateSuccess;
    }

    public void setOperateSuccess(boolean operateSuccess) {
        this.operateSuccess = operateSuccess;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
