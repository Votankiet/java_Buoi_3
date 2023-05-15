package bai1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private List<OrderDetail> lineItems;

    
    public Order() {
        lineItems = new ArrayList<>();
    }

   
    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        lineItems = new ArrayList<>();
    }

    
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    
    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public List<OrderDetail> getLineItems() {
        return lineItems;
    }
    
    public void addLineItems(Product product, int quantity) {
        lineItems.add(new OrderDetail(quantity, product));
    }

    public double calcTotalCharge(int n) {
        double totalCharge = 0;
        int count = 0;
        for (int i = n; count < lineItems.size(); i++) {
            OrderDetail orderDetail = lineItems.get(count);
            totalCharge += orderDetail.calcTotalPrice();
            count++;
        }
        return totalCharge;
    }

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", orderDate=" + orderDate + ", lineItems=" + lineItems + "]";
	}
}
    
