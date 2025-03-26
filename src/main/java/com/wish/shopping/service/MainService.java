package com.wish.shopping.service;

import com.wish.shopping.dto.Product;
import com.wish.shopping.repository.MainRepository;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainService {

    private final MainRepository mainRepository;

    public List<Product> getProductList(){
        return mainRepository.getProductList();
    }

}
