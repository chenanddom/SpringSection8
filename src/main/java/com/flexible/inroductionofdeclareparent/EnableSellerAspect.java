package com.flexible.inroductionofdeclareparent;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EnableSellerAspect {
//1.为PoliteWaiter太你家接口实现 2.默认接口实现类 3.要是西安的目标接口。
@DeclareParents(value = "com.flexible.inroductionofdeclareparent.PoliteWaiter",defaultImpl = SmartSeller.class)
public Seller seller;
}
