package com.hummingg.gulimall.order.dao;

import com.hummingg.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author hummingg
 * @email xuhuiming6991@gmail.com
 * @date 2023-06-01 15:24:50
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
