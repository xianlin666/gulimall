package com.lxl.gulimall.product;

import com.lxl.gulimall.product.entity.BrandEntity;
import com.lxl.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("huawei");
//        brandService.save(brandEntity);
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("垃圾公司");
        brandService.updateById(brandEntity);
        System.out.println("修改成功。。。。");
    }

}
