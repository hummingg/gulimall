package com.hummingg.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hummingg.common.utils.PageUtils;
import com.hummingg.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author hummingg
 * @email xuhuiming6991@gmail.com
 * @date 2023-06-01 15:24:50
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

