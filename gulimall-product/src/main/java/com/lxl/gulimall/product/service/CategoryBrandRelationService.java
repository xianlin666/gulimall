package com.lxl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxl.common.utils.PageUtils;
import com.lxl.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author xianlin
 * @email xianlin@zju.edu.cn
 * @date 2023-04-18 09:34:04
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

