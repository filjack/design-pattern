package com.design.factory.idcard;

import com.design.factory.framework.Factory;
import com.design.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xpf
 * @since 2023/5/18
 */
public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product p) {
        owners.add(((IDCard) p).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
