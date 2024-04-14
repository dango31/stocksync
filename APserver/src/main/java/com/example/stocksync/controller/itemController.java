package com.example.stocksync.controller;

import com.example.stocksync.models.ItemCreate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/item")
public class itemController {
    @PostMapping("/create")
    public ItemCreate addItem(@RequestBody ItemCreate itemCreate){
       return itemCreate;
    }
}
