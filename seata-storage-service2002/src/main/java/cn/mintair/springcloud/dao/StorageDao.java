package cn.mintair.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName StorageDao
 * @Description TODO
 * @Author xing
 * @Date 2021/3/30 15:38
 * @Version 1.0
 **/
@Mapper
public interface StorageDao {
    //扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
