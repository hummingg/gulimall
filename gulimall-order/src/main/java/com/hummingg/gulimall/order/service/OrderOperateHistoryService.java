package com.hummingg.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hummingg.common.utils.PageUtils;
import com.hummingg.gulimall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author hummingg
 * @email xuhuiming6991@gmail.com
 * @date 2023-06-01 15:24:51
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

