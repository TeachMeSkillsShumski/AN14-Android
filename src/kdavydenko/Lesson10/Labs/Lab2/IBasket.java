package kdavydenko.Lesson10.Labs.Lab2;

import java.util.List;

public interface IBasket {

    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);

}
