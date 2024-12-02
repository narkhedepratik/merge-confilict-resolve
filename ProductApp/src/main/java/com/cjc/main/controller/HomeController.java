package com.cjc.main.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @PostMapping("/save-Product")
  public String saveProduct()
  {
      return "Product will be save latter";
  }

}
