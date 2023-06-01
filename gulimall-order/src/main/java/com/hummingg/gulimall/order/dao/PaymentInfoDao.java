package com.hummingg.gulimall.order.dao;

import com.hummingg.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author hummingg
 * @email xuhuiming6991@gmail.com
 * @date 2023-06-01 15:24:50
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
