package com.lxl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxl.common.utils.PageUtils;
import com.lxl.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author xianlin
 * @email xianlin@zju.edu.cn
 * @date 2023-04-18 09:34:03
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

