package com.wish.shopping.repository;

import com.wish.shopping.dto.Product;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class MainRepository {
    List<Product> result =
        Arrays.asList(
            new Product("L1","검정 스커트", BigInteger.valueOf(39900), "검정 스커트입니다."),
            new Product("L2","블라우스", BigInteger.valueOf(59900), "블라우스 입니다."),
            new Product("L3","스카프", BigInteger.valueOf(9900), "스카프입니다.")
        );
    public List<Product> getProductList(){
        return result;
    }

    public void addProduct(Product product){
        List<Product> list = new ArrayList<>(result);
        list.add(product);
        result = list;
    }

    public void updateProduct(Product product){

        result.stream().filter(d -> product.getSpdNo().equals(d.getSpdNo())).findFirst().ifPresent(r -> {
            r.setName(product.getName());
            r.setPrice(product.getPrice());
            r.setDescription(product.getDescription());
        });
    }

}
