package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Controller
public class CustomerController {

    @Resource
    CustomerRepository repository;

    @RequestMapping("/home")
    public String fetchCustomers(Model model) {
        model.addAttribute("customersAsCollection", repository.findAll());
        return "home";
    }

}
