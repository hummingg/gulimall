package com.hummingg.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hummingg.gulimall.product.entity.BrandEntity;
import com.hummingg.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	public void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();

//		brandEntity.setDescript("");
//		brandEntity.setName("华为");
//		brandService.save(brandEntity);
//		System.out.println("brand created");

//		brandEntity.setBrandId(1L);
//		brandEntity.setDescript("这是更新的描述");
//		brandService.updateById(brandEntity);
//		System.out.println("brand updated");

		List<BrandEntity> lst = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
		lst.forEach((item) -> {
			System.out.println(item);
		});
		System.out.println("brand retrieved");
	}

}
