package com.hummingg.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hummingg.common.utils.PageUtils;
import com.hummingg.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author hummingg
 * @email xuhuiming6991@gmail.com
 * @date 2023-06-01 15:24:50
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

