package cn.mintair.springcloud.service;

/**
 * @ClassName StorageService
 * @Description TODO
 * @Author xing
 * @Date 2021/3/30 15:42
 * @Version 1.0
 **/
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
