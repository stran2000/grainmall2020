package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author madokast
 * @email 578562554@qq.com
 * @date 2020-05-04 22:45:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
