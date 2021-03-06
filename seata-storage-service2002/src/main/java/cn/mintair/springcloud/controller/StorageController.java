package cn.mintair.springcloud.controller;

import cn.mintair.springcloud.domain.CommonResult;
import cn.mintair.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName StorageController
 * @Description TODO
 * @Author xing
 * @Date 2021/3/30 15:45
 * @Version 1.0
 **/
@RestController
public class StorageController {
    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
