package com.wish.shopping.controller;

import com.wish.shopping.dto.Product;
import com.wish.shopping.service.MainService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping("/")
    public String main() {
        return "main";
    }

    @GetMapping("/list")
    public ResponseEntity<List<Product>> getProductList() {
        return ResponseEntity.ok(mainService.getProductList());
    }
}
