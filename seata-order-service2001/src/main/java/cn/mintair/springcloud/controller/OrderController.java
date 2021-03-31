package cn.mintair.springcloud.controller;

import cn.mintair.springcloud.domain.CommonResult;
import cn.mintair.springcloud.domain.Order;
import cn.mintair.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author xing
 * @Date 2021/3/30 15:24
 * @Version 1.0
 **/
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
