package OnlineShop.online_shop.IRepository;

import OnlineShop.online_shop.tables.ShoppingList;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ShoppingListRepository extends CrudRepository<ShoppingList, Integer> {

}
