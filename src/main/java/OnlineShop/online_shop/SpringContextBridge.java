package OnlineShop.online_shop;

//https://www.javacodegeeks.com/2015/03/using-spring-managed-bean-in-non-managed-object.html
import OnlineShop.online_shop.IRepository.*;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Register this SpringContextBridge as a Spring Component.
 */
@Component
public class SpringContextBridge
        implements SpringContextBridgedServices, ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Autowired
    private UserRepository userRepository; //Autowire the UserRepository
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ManufacturerRepository manufacturerRepository;
    @Autowired
    private ShoppingListRepository shoppingListRepository;
    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private ListProductRepository listProductRepository;
    @Autowired
    private BoughtProductRepository boughtProductRepository;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * A static method to lookup the SpringContextBridgedServices Bean in
     * the applicationContext. It is basically an instance of itself, which
     * was registered by the @Component annotation.
     *
     * @return the SpringContextBridgedServices, which exposes all the
     * Spring services that are bridged from the Spring context.
     */
    public static SpringContextBridgedServices services() {
        return applicationContext.getBean(SpringContextBridgedServices.class);
    }

    @Override
    public UserRepository getUserRepository() {
        return userRepository; //Return the Autowired taxService
    }

    @Override
    public ProductRepository getProductRepository() {
        return productRepository;
    }

    @Override
    public ManufacturerRepository getManufacturerRepository() {
        return manufacturerRepository;
    }

    @Override
    public ShoppingListRepository getShoppingListRepository() {
        return shoppingListRepository;
    }

    @Override
    public OrdersRepository getOrdersRepository() {
        return ordersRepository;
    }

    @Override
    public ListProductRepository getListProductRepository() {
        return listProductRepository;
    }

    @Override
    public BoughtProductRepository getBoughtProductRepository() {
        return boughtProductRepository;
    }

}