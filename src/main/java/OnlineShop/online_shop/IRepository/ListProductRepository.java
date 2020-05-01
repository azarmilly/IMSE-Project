package OnlineShop.online_shop.IRepository;

import OnlineShop.online_shop.tables.ListProduct;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ListProductRepository extends CrudRepository<ListProduct, Integer> {

}
