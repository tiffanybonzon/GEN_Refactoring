import java.util.ArrayList;

public class OrdersWriter {
    private final ArrayList<Order> orders;

    public OrdersWriter(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public String getJSONContent() {
        StringBuilder sb = new StringBuilder("{\"orders\": [");

        for (Order order : orders) {
            sb.append(order);
        }

        if (orders.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }
}