package org.bellotech.bellotech.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
/**
 * AdminControlleer
 */
public class AdminControlleer {

    
    @GetMapping("/admin")
    public String admin (Model model){

        return "register";
    }
}