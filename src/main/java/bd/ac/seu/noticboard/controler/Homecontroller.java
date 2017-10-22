package bd.ac.seu.noticboard.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author rakib on 10/22/17
 * @project noticboard
 */

@Controller
public class Homecontroller {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    private String viewhome(){
        return "home";
    }
}
