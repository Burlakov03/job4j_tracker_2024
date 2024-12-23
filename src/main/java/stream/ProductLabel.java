package stream;

import java.util.List;
import java.util.stream.Collectors;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(product -> (product.getStandard() - product.getActual()) <= 3)
                .filter(product -> 0 <= (product.getStandard() - product.getActual()))
                .map(product -> new Label(product.getName(), (float) (product.getPrice() * 0.5)).toString())
                .collect(Collectors.toList());
    }
}
