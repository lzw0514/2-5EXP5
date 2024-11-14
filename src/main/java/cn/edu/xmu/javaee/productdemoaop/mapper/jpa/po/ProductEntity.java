package cn.edu.xmu.javaee.productdemoaop.mapper.jpa.po;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "goods_product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "goods_id")
    private Long goodsId;

    private String skuSn;

    private String name;

    private Long originalPrice;

    private Long weight;

    private String barcode;

    private String unit;

    private String originPlace;

    private Long creatorId;

    private String creatorName;

    private Long modifierId;

    private String modifierName;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    private Integer commissionRatio;

    private Long freeThreshold;

    private Byte status;

}
