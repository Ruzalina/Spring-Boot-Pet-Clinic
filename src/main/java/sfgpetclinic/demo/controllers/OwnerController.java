package sfgpetclinic.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owners")
//localgost:8080/owners/
@Controller
public class OwnerController {
    @RequestMapping({"", "/", "/index","/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
