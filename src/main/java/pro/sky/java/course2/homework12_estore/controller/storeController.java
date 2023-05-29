package pro.sky.java.course2.homework12_estore.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.homework12_estore.services.StoreService;

import java.util.List;

@RestController
@RequestMapping("/store/order/")
public class storeController {
    private final StoreService storeService;

    public storeController(StoreService storeService) {
        this.storeService = storeService;
    }


    @GetMapping
    public String hello() {
        return storeService.hello();
    }

    @GetMapping("/add")
    public String add(@RequestParam String items) {
        return storeService.addItems(items);
    }

    @GetMapping("/get")
    public List get() {
        return storeService.getItems();
    }
}
