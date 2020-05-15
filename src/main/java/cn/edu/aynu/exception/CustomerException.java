
package cn.edu.aynu.exception;

import cn.edu.aynu.enums.StateEnum;
import lombok.Getter;

/**
 *@Author:冯君
 **/
@Getter
public class CustomerException extends RuntimeException {

    private Integer code;

    public CustomerException(StateEnum stateEnum){
        super(stateEnum.getMsg());
        this.code = stateEnum.getCode();
    }

    public CustomerException(Integer code, String msg){
        super(msg);
        this.code = code;
    }
}
