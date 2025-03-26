package com.wish.shopping.service;

import com.wish.shopping.dto.Product;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    public List<Product> getProductList(){
        List<Product> result = new ArrayList<>();
        Product pr1 = new Product("검정 스커트", BigInteger.valueOf(39900), "검정 스커트입니다.");
        Product pr2 = new Product("블라우스", BigInteger.valueOf(59900), "블라우스 입니다.");
        Product pr3 = new Product("스카프", BigInteger.valueOf(9900), "스카프입니다.");
        return Arrays.asList(pr1, pr2, pr3);
    }

}
