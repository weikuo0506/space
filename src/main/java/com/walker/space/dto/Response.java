package com.walker.space.dto;

/**
 * Created by wk on 2015/12/3.
 */
public class Response {
    private static final String OK = "ok";
    private static final String ERROR = "error";

    private Status status;
    private Object data;

    public Response success(){
        this.status = new Status(true,OK);
        return this;
    }

    public Response success(Object data) {
        this.status = new Status(true,OK);
        this.data = data;
        return this;
    }

    public Response failure(){
        this.status = new Status(false,ERROR);
        return this;
    }

    public Response failure(String message){
        this.status = new Status(false,message);
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Object getData() {
        return data;
    }

    public class Status{
        private boolean success;
        private String message;

        public Status(boolean success) {
            this.success = success;
        }

        public Status(boolean success, String message) {
            this.success = success;
            this.message = message;
        }

        public boolean isSuccess() {
            return success;
        }

        public String getMessage() {
            return message;
        }
    }
}
