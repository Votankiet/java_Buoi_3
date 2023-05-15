package bai1;

    public class OrderDetail {
        private int quantity;
        private Product product;
    
        public OrderDetail(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }
    
        public double calcTotalPrice() {
            return product.getPrice() * quantity;
        }
    
        public String toString() {
            return "Product: " + product.getDescription() + ", Quantity: " + quantity + ", Total Price: $" + calcTotalPrice();
        }
    
        public int getQuantity() {
            return quantity;
        }
    
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    
        public Product getProduct() {
            return product;
        }
    
        public void setProduct(Product product) {
            this.product = product;
        }
    }
    
