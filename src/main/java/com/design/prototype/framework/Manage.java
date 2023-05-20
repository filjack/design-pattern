package com.design.prototype.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xpf
 * @since 2023/5/20
 */
public class Manage {

    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String name) {
        Product product = showcase.get(name);
        return product.createClone();
    }

}
