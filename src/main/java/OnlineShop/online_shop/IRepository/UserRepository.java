package OnlineShop.online_shop.IRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import OnlineShop.online_shop.tables.User;
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
