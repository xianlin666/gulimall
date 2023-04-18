package com.lxl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxl.common.utils.PageUtils;
import com.lxl.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author xianlin
 * @email xianlin@zju.edu.cn
 * @date 2023-04-18 09:34:03
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

