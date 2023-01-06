package com.example.sagedbms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.json.*;
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {return "index.html";
    }

    @RequestMapping(value = "/addNewDiscount")
    public String addNewDiscount () {return "addDiscount.html";}

   @PostMapping("/postnewdiscount")
    public String postnewdiscount(@RequestBody newDiscount discount) {
        return "Discount = "+discount;
    }
    //returns GUID
    @GetMapping(value = "/genGuid")
    @ResponseBody
    public String Guid () throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("GUID",settingsUtils.generateGuid());
        System.out.println(jsonObject);
        return  settingsUtils.generateGuid();
    }


}