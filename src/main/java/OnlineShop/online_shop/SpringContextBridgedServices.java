package OnlineShop.online_shop;

import OnlineShop.online_shop.IRepository.*;
import org.springframework.stereotype.Service;

/**
 * This interface represents a list of Spring Beans (services) which need to be referenced from a non Spring class.
 */
@Service
public interface SpringContextBridgedServices {
    UserRepository getUserRepository();
    ProductRepository getProductRepository();
    ManufacturerRepository getManufacturerRepository();
    ShoppingListRepository getShoppingListRepository();
    OrdersRepository getOrdersRepository();
    ListProductRepository getListProductRepository();
    BoughtProductRepository getBoughtProductRepository();
}