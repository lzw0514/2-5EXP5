package cn.edu.xmu.javaee.productdemoaop.mapper.jpa;


import cn.edu.xmu.javaee.productdemoaop.controller.dto.ProductDto;
import cn.edu.xmu.javaee.productdemoaop.dao.bo.Product;
import cn.edu.xmu.javaee.productdemoaop.mapper.jpa.po.OnSaleEntity;
import cn.edu.xmu.javaee.productdemoaop.mapper.jpa.po.ProductEntity;

import org.apache.ibatis.annotations.Param;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;






@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    //
    @Query("select p from ProductEntity p where p.name =:name ")
    List<ProductEntity> findByName(@Param("name") String name);

    @Query("SELECT o FROM OnSaleEntity o WHERE o.productId = :productId " +
            "AND o.beginTime < CURRENT_TIMESTAMP " +
            "AND o.endTime > CURRENT_TIMESTAMP " +
            "ORDER BY o.endTime DESC")
    List<OnSaleEntity> findCurrentOnSalesByProductId(@Param("productId") Long productId);

    @Query("SELECT p FROM ProductEntity p WHERE p.goodsId = :goodsId AND p.id <> :id")
    List<ProductEntity> findOtherProductsByGoodsId(@Param("goodsId") Long goodsId, @Param("id") Long id);

}

