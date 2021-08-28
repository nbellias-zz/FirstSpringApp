package net.nbellias.firstspringapp.viewcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public ModelAndView sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        Map<String, Object> model = new HashMap<>();
        model.put("name", name);
        model.put("title", "Hello " + name);
        model.put("tname", name);
        return new ModelAndView("hellotest.html", model);
//        return String.format("Hello %s!", name);
    }

}
