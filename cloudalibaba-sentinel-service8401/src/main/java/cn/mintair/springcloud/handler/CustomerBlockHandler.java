package cn.mintair.springcloud.handler;

import cn.mintair.springcloud.entites.CommonResult;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @ClassName CustomerBlockHandler
 * @Description TODO
 * @Author xing
 * @Date 2021/3/29 14:58
 * @Version 1.0
 **/
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
