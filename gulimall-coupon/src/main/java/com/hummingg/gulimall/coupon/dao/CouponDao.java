package com.hummingg.gulimall.coupon.dao;

import com.hummingg.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hummingg
 * @email xuhuiming6991@gmail.com
 * @date 2023-06-01 15:00:55
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
