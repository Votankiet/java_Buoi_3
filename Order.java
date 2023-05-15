package bai1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private ArrayList<OrderDetail> lineItems;
    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = new ArrayList<OrderDetail>();
    }

    public void addLineItem(Product product, int quantity) {
        OrderDetail lineItem = new OrderDetail(product, quantity);
        this.lineItems.add(lineItem);
    }

    public double calcTotalCharge() {
        double totalCharge = 0;
        for (OrderDetail lineItem : this.lineItems) {
            totalCharge += lineItem.calcTotalPrice();
        }
        return totalCharge;
    }

    @Override
    public String toString() {
        return "Order [orderID=" + orderID + ", orderDate=" + orderDate + ", lineItems=" + lineItems + "]";
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<OrderDetail> getLineItems() {
        return lineItems;
    }
}

