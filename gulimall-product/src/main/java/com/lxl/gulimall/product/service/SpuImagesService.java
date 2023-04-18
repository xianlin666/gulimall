package com.lxl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxl.common.utils.PageUtils;
import com.lxl.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author xianlin
 * @email xianlin@zju.edu.cn
 * @date 2023-04-18 09:34:03
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

