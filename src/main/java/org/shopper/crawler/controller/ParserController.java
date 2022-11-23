package org.shopper.crawler.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ParserController {
    @GetMapping("/hello")
    public Map<String, Object> hello(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.walmart.ca/");
        return Map.of();
    }
}
