package com.sourcecode.service;

import com.github.pagehelper.PageInfo;
import com.sourcecode.SourceCodeBackendApplication;
import com.sourcecode.domain.*;
import com.sourcecode.vo.ProductVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SourceCodeBackendApplication.class})
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    // 保存
    @Test
    public void testSave() throws Exception {
        Product product = new Product();
        product.setTitle("银证系统");
        product.setTags("银行，Java , AWT");
        product.setPrice(new BigDecimal("100.32"));
        product.setCheckTime(new Date());
        product.setDevLanguage("Java");
        product.setDevTools("idea");
        product.setRunPlatform("windows");
        product.setSize("4.7M");
        product.setUpdatedTime(new Date());

        Category category = new Category();
        category.setId(1);
        product.setCategory(category);

        ProductDesc productDesc = new ProductDesc();
        productDesc.setProduct(product);
        productDesc.setInfo("很不错的文件搜索");
        product.setProductDesc(productDesc);

//        List<ProductImages> productImages = new ArrayList<ProductImages>();
//        ProductImages pi1 = new ProductImages();
//        pi1.setProduct(product);
//        pi1.setImageUrl("http://www.qq.com");
//
//        ProductImages pi2 = new ProductImages();
//        pi2.setProduct(product);
//        pi2.setImageUrl("http://www.google.com");
//
//        productImages.add(pi1);
//        productImages.add(pi2);

        List<ProductVideo> videos = new ArrayList<ProductVideo>();
        ProductVideo pv1 = new ProductVideo();
        pv1.setProduct(product);
        pv1.setVideoUrl("qiniu://abc.qq");

        ProductVideo pv2 = new ProductVideo();
        pv2.setProduct(product);
        pv2.setVideoUrl("qiniu://qaz.zz");
        videos.add(pv1);
        videos.add(pv2);

        product.setProductVideos(videos);

        productService.save(product);
    }

    // 查询全部带分页
    @Test
    public void testQueryByPage() throws Exception{
        ProductVo vo = new ProductVo();
        vo.setTitle("搜索");
        PageInfo<Product> pageInfo = productService.queryAllByPage(vo);
        System.out.println(pageInfo.getTotal());
        List<Product> products = pageInfo.getList();
        for (Product product:products) {
            System.out.println(product);
            System.out.println(product.getProductDesc());
            System.out.println(product.getProductImages());
            System.out.println(product.getProductVideos());
        }
        System.out.println(pageInfo.getPages());
    }

    // 根据id查询商品信息
    @Test
    public void testQueryById() throws Exception{
        Integer id = 6;
        Product product = productService.queryById(id);
        System.out.println(product);
        System.out.println(product.getProductDesc());
        System.out.println(product.getProductImages());
        System.out.println(product.getProductVideos());
    }

    // 根据id删除商品
    @Test
    public void testDeleteById() throws Exception{
        Integer id = 6;
        productService.deleteById(id);
    }

    // 根据id更新商品
    @Test
    public void testUpdate() throws Exception{
        Product product = new Product();
        product.setId(6);
        product.setTitle("淘票票系统");
        productService.update(product);
    }

    // 根据id上架商品
    @Test
    public void testEnableById() throws Exception{
        Integer id = 6;
        productService.enableById(id);
    }

    // 批量上架商品
    @Test
    public void testEnableByIds() throws Exception{
        Integer[] ids = {8,9,10,11};
        productService.enableByIds(ids);
    }

    // 批量删除商品
    @Test
    public void testDeleteByIds() throws Exception{
        Integer[] ids = {8,9,10};
        productService.deleteByIds(ids);
    }
}
