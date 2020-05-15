
package cn.edu.aynu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *@Author:冯君
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO {

    //状态码
    private Integer code;

    //描述信息
    private String msg;

    //数据信息
    private Object data;


}
