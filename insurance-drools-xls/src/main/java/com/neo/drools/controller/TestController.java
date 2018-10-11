package com.neo.drools.controller;

import com.neo.drools.dao.Order;
import com.neo.drools.dao.User;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@RequestMapping("/test")
@Controller
public class TestController {

    @Resource
    private KieContainer kieContainer;

    @ResponseBody
    @RequestMapping("/address")
    public void test(int num){
        KieSession kieSession = kieContainer.newKieSession();

//        AddressCheckResult result = new AddressCheckResult();
//        kieSession.insert(address);
//        kieSession.insert(result);
//        int ruleFiredCount = kieSession.fireAllRules();
//        kieSession.destroy();
//        System.out.println("触发了" + ruleFiredCount + "条规则");

    }

    /**
     * 生成随机数
     * @param num
     * @return
     */
    public String generateRandom(int num) {
        String chars = "0123456789";
        StringBuffer number=new StringBuffer();
        for (int i = 0; i < num; i++) {
            int rand = (int) (Math.random() * 10);
            number=number.append(chars.charAt(rand));
        }
        return number.toString();
    }


    User user;
    Order order;
}
