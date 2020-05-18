public class Product {
    private String code;
    private Color color;
    private Size size;
    private Price price;

    public Product(String code, Color color, Size size, Price price) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price.getAmount();
    }

    public String getCurrency() {
        return price.getCurrency();
    }

    public String getContent(StringBuffer sb) {
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(getCode());
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(getColor());
        sb.append("\", ");

        if (getSize() != Size.SIZE_NOT_APPLICABLE) {
            sb.append("\"size\": \"");
            sb.append(getSize());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(getCurrency());
        sb.append("\"}, ");

        return sb.toString();
    }
}