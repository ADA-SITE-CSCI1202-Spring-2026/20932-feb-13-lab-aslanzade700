package week03.invoice;
    public class Invoice {
        String number;
        String description;
        int quantity;
        double price;
        
        public void setNumber(String number) {
            this.number = number;
        }
    
        public void setDescription(String description) {
            this.description = description;
        }
    
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    
        public void setPrice(double price) {
            this.price = price;
        }
    
        public String getNumber() {
            return number;
        }
    
        public String getDescription() {
            return description;
        }
    
        public int getQuantity() {
            return quantity;
        }
        
        public double getPrice() {
            return price;
        }
    }
