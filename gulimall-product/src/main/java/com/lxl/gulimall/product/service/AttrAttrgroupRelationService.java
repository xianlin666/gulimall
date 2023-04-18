package com.lxl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxl.common.utils.PageUtils;
import com.lxl.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author xianlin
 * @email xianlin@zju.edu.cn
 * @date 2023-04-18 09:34:04
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

