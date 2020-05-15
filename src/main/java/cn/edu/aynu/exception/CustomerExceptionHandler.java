package cn.edu.aynu.exception;

import cn.edu.aynu.util.ResultVOFactory;
import cn.edu.aynu.vo.ResultVO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *@Author:冯君
 **/
@RestControllerAdvice
public class CustomerExceptionHandler {
    @ExceptionHandler(CustomerException.class)
    public ResultVO jxc(CustomerException ex){
        return ResultVOFactory.error(ex);
    }
}

