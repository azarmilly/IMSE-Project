package OnlineShop.online_shop.IRepository;

import OnlineShop.online_shop.tables.BoughtProduct;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface BoughtProductRepository extends CrudRepository<BoughtProduct, Integer> {

}
