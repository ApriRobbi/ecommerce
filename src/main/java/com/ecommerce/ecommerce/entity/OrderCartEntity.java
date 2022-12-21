package com.ecommerce.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_cart")
public class OrderCartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long orderCartId;

    private Long costumerId;

    private String orderCartType;

    public OrderCartEntity(Long costumerId, String orderCartType) {
        this.costumerId = costumerId;
        this.orderCartType = orderCartType;
    }

    public OrderCartEntity() {
    }

    public Long getOrderCartId() {
        return orderCartId;
    }

    public void setOrderCartId(Long orderCartId) {
        this.orderCartId = orderCartId;
    }

    public Long getCostumerId() {
        return costumerId;
    }

    public void setCostumerId(Long costumerId) {
        this.costumerId = costumerId;
    }

    public String getOrderCartType() {
        return orderCartType;
    }

    public void setOrderCartType(String orderCartType) {
        this.orderCartType = orderCartType;
    }
}
