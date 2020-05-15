package cn.edu.aynu.util;


import cn.edu.aynu.enums.StateEnum;
import cn.edu.aynu.exception.CustomerException;
import cn.edu.aynu.vo.ResultVO;

/**
 *@Author:冯君
 **/
public class ResultVOFactory {

    /**
     *@Description: 正确
     *@param:  data
     *@return ResultVo
     **/
    public static ResultVO ok(Object data){
        ResultVO vo = new ResultVO(StateEnum.SUCCESS.getCode(),StateEnum.SUCCESS.getMsg(),data);
        return vo;
    }

    /**
     *@Description: 正确
     *@return ResultVo
     **/
    public static ResultVO ok(){
        return ok(null);
    }

    /**
     *@Description: 错误调用的方法
     *@param:  code
     *@param:  msg
     *@return ResultVo
     **/
    public static ResultVO error(Integer code, String msg){
        ResultVO vo = new ResultVO(code,msg,null);
        return vo;
    }
    /**
     *@Description: 错误调用的方法
     *@param:  ex
     *@return ResultVo
     **/
    public static ResultVO error(CustomerException ex){
        ResultVO vo = new ResultVO(ex.getCode(),ex.getMessage(),null);
        return vo;
    }
    /**
     *@Description: 错误调用的方法
     *@param:  stateEnum
     *@return ResultVo
     **/
    public static ResultVO error(StateEnum stateEnum){
        ResultVO vo = new ResultVO(stateEnum.getCode(), stateEnum.getMsg(),null);
        return vo;
    }

}
