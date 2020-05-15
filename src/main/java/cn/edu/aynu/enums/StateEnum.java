package cn.edu.aynu.enums;

import lombok.Getter;

import javax.management.loading.MLetContent;

/**
 *@Author:冯君
 **/
@Getter
public enum StateEnum {

    SUCCESS(0,"成功"),
    PARAM_ERROR(1,"参数有误");

    private Integer code;

    private String msg;

    StateEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
