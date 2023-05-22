package org.apache.dubbo.springboot.demo.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.springboot.demo.Demo2Service;

/**
 * @author yuwenbo@kkworld.com
 * @date 2023/5/22
 */
@DubboService(version = "1.0.0", group = "A")
public class Demo2ServiceImpl implements Demo2Service {

    @Override
    public String sayHello(String name) {
        return "hello2 " + name;
    }
}
