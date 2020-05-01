package OnlineShop.online_shop;

import OnlineShop.online_shop.IRepository.*;

/**
 * This interface represents a list of Spring Beans (services) which need to be referenced from a non Spring class.
 */
public interface SpringContextBridgedServices {
    UserRepository getUserRepository();
    ProductRepository getProductRepository();
    ManufacturerRepository getManufacturerRepository();
    ShoppingListRepository getShoppingListRepository();
    OrdersRepository getOrdersRepository();
    ListProductRepository getListProductRepository();
    BoughtProductRepository getBoughtProductRepository();
}