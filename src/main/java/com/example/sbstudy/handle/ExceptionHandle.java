package com.example.sbstudy.handle;

import com.example.sbstudy.Exception.MyException;
import com.example.sbstudy.vo.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandle {

    /**
     * org.springframework.http.converter.HttpMessageNotWritableException: No converter found for return value of type: class com.example.sbstudy.vo.ResultVO
     * 	解决：序列化问题，ResultVO未提供get方法。
     * @param req
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ResultVO jsonErrorHandler(HttpServletRequest req, MyException e) throws Exception {
        ResultVO resultVO = new ResultVO();
        resultVO.setMessage(e.getMessage());
        resultVO.setCode(500);
        return resultVO;
    }

}
