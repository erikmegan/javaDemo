package com.javaDemo.javaDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "javaDemo")
public class Orders {
    @Id
    private Integer orderId;
    @Column(name = "customerId")
    private Integer customerId;
    @Column(name = "employeeId")
    private Integer employeeId;
    @Column(name = "orderDate")
    private Date orderDate;
    @Column(name = "purchaseOrderNumber")
    private String purchaseOrderNumber;
    @Column(name = "shipDate")
    private Date shipDate;
    @Column(name = "shippingMethodId")
    private Integer shippingMethodId;
    @Column(name = "freighCharge")
    private Integer freighCharge;
    @Column(name = "taxes")
    private Integer taxes;
    @Column(name = "paymentReceived")
    private String paymentReceived;
    @Column(name = "comment")
    private String comment;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public Integer getShippingMethodId() {
        return shippingMethodId;
    }

    public void setShippingMethodId(Integer shippingMethodId) {
        this.shippingMethodId = shippingMethodId;
    }

    public Integer getFreighCharge() {
        return freighCharge;
    }

    public void setFreighCharge(Integer freighCharge) {
        this.freighCharge = freighCharge;
    }

    public Integer getTaxes() {
        return taxes;
    }

    public void setTaxes(Integer taxes) {
        this.taxes = taxes;
    }

    public String getPaymentReceived() {
        return paymentReceived;
    }

    public void setPaymentReceived(String paymentReceived) {
        this.paymentReceived = paymentReceived;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
