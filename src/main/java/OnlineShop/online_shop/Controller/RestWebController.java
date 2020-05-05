package OnlineShop.online_shop.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import OnlineShop.online_shop.tables.User;

@RestController
public class RestWebController {

    List<User> cust = new ArrayList<User>();

    @RequestMapping(value = "/getallcustomer", method = RequestMethod.GET)
    public List<User> getResource(){
        return cust;
    }

    @RequestMapping(value="/postcustomer", method=RequestMethod.POST)
    public String postCustomer(@RequestBody User customer){
        cust.add(customer);

        return "Sucessful!";
    }
}