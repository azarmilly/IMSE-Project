package OnlineShop.online_shop.tables;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class ShoppingList {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer shoppingListId;

    private String name;

    private int itemCount;

    @ManyToOne
    private User user;

    public Integer getShoppingListId() {
        return shoppingListId;
    }

    public void setShoppingListId(Integer shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
