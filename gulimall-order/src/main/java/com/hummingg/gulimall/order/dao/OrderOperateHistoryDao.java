package com.hummingg.gulimall.order.dao;

import com.hummingg.gulimall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author hummingg
 * @email xuhuiming6991@gmail.com
 * @date 2023-06-01 15:24:51
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
