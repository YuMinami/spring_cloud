package cn.mintair.springcloud.dao;

import cn.mintair.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName OrderDao
 * @Description TODO
 * @Author xing
 * @Date 2021/3/30 15:07
 * @Version 1.0
 **/
@Mapper
public interface OrderDao {
    //1 新建订单
    void create(@Param("order") Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
