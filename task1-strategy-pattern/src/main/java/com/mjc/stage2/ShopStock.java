package com.mjc.stage2;

import java.util.List;
import java.util.ArrayList;
public class ShopStock {
    private final List<Product> productList;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

    // Write your code here!
    public List<Product> executeFilteringStrategy(FilteringStrategy filteringStrategy){
        List<Product> ans = new ArrayList<>();
        for (Product product : productList){
            if (filteringStrategy.filter(product)){
                ans.add(product);
            }
        }
        return ans;
    }
}
