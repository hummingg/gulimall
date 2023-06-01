package com.hummingg.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hummingg.common.utils.PageUtils;
import com.hummingg.gulimall.order.entity.PmsSpuInfoEntity;

import java.util.Map;

/**
 * 
 *
 * @author hummingg
 * @email xuhuiming6991@gmail.com
 * @date 2023-06-01 15:24:51
 */
public interface PmsSpuInfoService extends IService<PmsSpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

