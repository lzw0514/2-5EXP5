package cn.edu.xmu.javaee.productdemoaop.mapper.jpa.po;

import cn.edu.xmu.javaee.productdemoaop.dao.bo.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Table(name = "goods_onsale")
public class OnSaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long price;

    @Column(name = "product_id")
    private Long productId;

    private LocalDateTime beginTime;

    private LocalDateTime endTime;

    private Integer quantity;

    private Integer maxQuantity;

    private Long creator_id;

    private String creator_name;

    private Long modifier_id;

    private String modifier_name;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    public Long getCreatorId() {
        return creator_id;
    }

    public String getCreatorName() {
        return creator_name;
    }

    public Long getModifierId() {
        return modifier_id;
    }
    public String getModifierName() {
        return modifier_name;
    }

}
