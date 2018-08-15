package cn.lung.flower.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PictureController {

    @RequestMapping("picture")
    public String base2picture(String myImage){
        System.out.println(myImage);
        return "2";
    }
}
