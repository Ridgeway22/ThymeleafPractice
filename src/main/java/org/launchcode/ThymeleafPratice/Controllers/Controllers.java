package org.launchcode.ThymeleafPratice.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Controllers {


    //    // Handle request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    //@ResponseBody
    public String helloWithQueryParam(@RequestParam String name, Model model) {
        // return "Hello, " + name + "!";
        String theGreeting = "Gello " + name;
        model.addAttribute("greeting", theGreeting);
        return "hello";
    }

    // Handles requests of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }


    @GetMapping("form")
    //@ResponseBody
    public String helloForm() {
        return "form";
//            return "<html>" +
//                    "<body>" +
//                    "<form action = 'hello' method = 'post'>" + // submit a request to /hello
//                    "<input type = 'text' name = 'name' >" +
//                    "<input type = 'submit' value = 'Greet Me!' >" +
//                    "</form>" +
//                    "</body>" +
//                    "</html>";
    }
    @GetMapping("hello-names")
    public String helloNames(Model model) {
List<String> names = new ArrayList<>();
    names.add("AMber");
    names.add("Lamber");
    names.add("Ricky");
    names.add("Emmie");
    model.addAttribute("names", names);
return "hello-list";
    }
}
