package com.design.test.factory.idcard;

import com.design.test.factory.framework.Factory;
import com.design.test.factory.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xpf
 * @since 2023/5/18
 */
public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    private Map<Integer, String> noToOwner = new HashMap<>();

    private static int no = 1;

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner, no++);
    }

    @Override
    public void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        this.owners.add(card.getOwner());
        this.noToOwner.put(card.getNo(), card.getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }

    public Map<Integer, String> getNoToOwner() {
        return noToOwner;
    }
}
