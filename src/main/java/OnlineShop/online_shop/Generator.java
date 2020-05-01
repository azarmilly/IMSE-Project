package OnlineShop.online_shop;

import OnlineShop.online_shop.IRepository.*;
import OnlineShop.online_shop.tables.*;
import com.github.javafaker.Faker;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Generator {
    private User user;
    private Product product;
    private Manufacturer manufacturer;
    private ShoppingList shoppingList;
    private Orders orders;

    public Generator() {}

    public void generateUserData() {
        UserRepository userRepository = SpringContextBridge.services().getUserRepository();
        Faker faker = new Faker();
        for (int i = 0; i < 50; i++) {
            user = new User();
            user.setFirstName(faker.name().firstName());
            user.setSecondName(faker.name().lastName());
            user.setUsername(faker.name().username());
            user.setPassword(faker.name().username());
            user.setPhoneNumber(faker.phoneNumber().phoneNumber());
            user.setEmail(user.getFirstName() + "@gmail.com");
            user.setAddress(faker.address().streetAddress());
            userRepository.save(user);
        }
    }

        public void generateProductData() {
            ProductRepository productRepository = SpringContextBridge.services().getProductRepository();
            DecimalFormat df2 = new DecimalFormat("#.##");
            for(int i=0; i<50; i++) {
                product = new Product();
                double price = Double.valueOf(df2.format(ThreadLocalRandom.current().nextDouble(0,300)));
                double rating = Double.valueOf(df2.format(ThreadLocalRandom.current().nextDouble(0,10)));

                product.setPrice(price);
                product.setRating(rating);
                product.setAvailability(ThreadLocalRandom.current().nextBoolean());
                productRepository.save(product);
            }
    }

    public void generateManufacturerData() {
        ManufacturerRepository manufacturerRepository = SpringContextBridge.services().getManufacturerRepository();
        for (int i = 0; i < 50; i++) {
            Faker faker = new Faker();
            manufacturer = new Manufacturer();
            manufacturer.setName(faker.name().name());
            manufacturer.setSector(faker.company().industry());
            manufacturerRepository.save(manufacturer);
        }
    }
        public void generateShoppingListData() {
            ShoppingListRepository shoppingListRepository = SpringContextBridge.services().getShoppingListRepository();

            for(int i=0; i<50; i++) {
                Random rand = new Random();
                shoppingList = new ShoppingList();
                shoppingList.setItemCount(rand.nextInt(7));
                shoppingList.setName("MyShoppingList");
                shoppingListRepository.save(shoppingList);
            }
    }

    public void generateOrdersData() {
        OrdersRepository ordersRepository = SpringContextBridge.services().getOrdersRepository();
        List<String> statusList = new ArrayList<>();
        Date fromDate = new Date(115, 1, 1);
        Date toDate = new Date();
        statusList.add("Confirmed");
        statusList.add("Dispatched");
        statusList.add("Waiting for Payment");
        statusList.add("Received");
        DecimalFormat df2 = new DecimalFormat("#.##");


        for(int i=0; i<50; i++) {
            Faker faker = new Faker();
            Random rand = new Random();
            orders = new Orders();
            double price = Double.valueOf(df2.format(ThreadLocalRandom.current().nextDouble(0,500)));

            orders.setPrice(price);
            orders.setAddress(faker.address().streetAddress());
            orders.setDate(faker.date().between(fromDate, toDate));
            orders.setStatus(statusList.get(rand.nextInt(4)));
            ordersRepository.save(orders);
        }
    }


}
