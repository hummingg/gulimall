package com.hummingg.gulimall.member.dao;

import com.hummingg.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hummingg
 * @email xuhuiming6991@gmail.com
 * @date 2023-06-01 15:16:51
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
