package OnlineShop.online_shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineShopApplication {

	public static void main(String[] args) {

		SpringApplication.run(OnlineShopApplication.class, args);
		Generator generator = new Generator();
		//generator.generateUserData();
		//generator.generateProductData();
		//generator.generateManufacturerData();
		//generator.generateShoppingListData();
		//generator.generateOrdersData();
	}

}
