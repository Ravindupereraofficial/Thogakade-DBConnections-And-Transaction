/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.thagakade;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Order {
    private String id;
    private String date;
    private String customerId;
    private ArrayList <OrderDetail>orderDetailList;

    public Order() {
    }

    public Order(String id, String date, String customerId, ArrayList<OrderDetail> orderDetailList) {
        this.id = id;
        this.date = date;
        this.customerId = customerId;
        this.orderDetailList = orderDetailList;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the orderDetailList
     */
    public ArrayList <OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    /**
     * @param orderDetailList the orderDetailList to set
     */
    public void setOrderDetailList(ArrayList <OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
    
}
