package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class OrderProcessor {
    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        processor.addOrder(new OrderProcessor.Order("1", "Alice", 300));
        processor.addOrder(new OrderProcessor.Order("1", "Bob", 600));
        processor.addOrder(new OrderProcessor.Order("2", "Sam", 1000));
        
        List<OrderProcessor.Order> discountedOrders = processor.getDiscountedOrders();
        
        assert(discountedOrders.size() == 2);
        assert(discountedOrders.get(0).totalAmount == 510); // 600 * 0.85
        assert(discountedOrders.get(1).totalAmount == 850); // 1000 * 0.85
        
        System.out.println("All assertions passed ✅");
    }
    
    private List<Order> orders = new ArrayList<>();

    static class Order {
        String orderId;
        String customerName;
        double totalAmount;

        public Order(String orderId, String customerName, double totalAmount) {
            this.orderId = orderId;
            this.customerName = customerName;
            this.totalAmount = totalAmount;
        }
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    // ✅ Implementation using Java Streams
    public List<Order> getDiscountedOrders() {
        return orders.stream()
                .filter(order -> order.totalAmount > 500)
                .map(order -> new Order(
                        order.orderId,
                        order.customerName,
                        order.totalAmount * 0.85))
                .collect(Collectors.toList());
    }
}

