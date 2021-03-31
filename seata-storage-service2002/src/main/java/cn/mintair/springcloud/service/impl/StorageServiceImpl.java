package cn.mintair.springcloud.service.impl;

import cn.mintair.springcloud.dao.StorageDao;
import cn.mintair.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName StorageServiceImpl
 * @Description TODO
 * @Author xing
 * @Date 2021/3/30 15:43
 * @Version 1.0
 **/
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageDao storageDao;
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        log.info("------->storage-service中扣减库存结束");
    }
}
