package com.flexible.inroductionofdeclareparent;

public class SmartSeller implements Seller {
    @Override
    public void sell(String goods) {
        System.out.println("sell:"+goods);
    }
}
