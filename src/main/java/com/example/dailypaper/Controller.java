package com.example.dailypaper;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

@GetMapping("/")
public String paper(){
    return "thedaily";
}

}
