package com.neo.drools.point;

import com.neo.drools.dao.Order;
import com.neo.drools.dao.User;
import com.neo.drools.model.Address;
import com.neo.drools.model.fact.AddressCheckResult;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class loopClacPoint {

    static KieSession getSession() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        return kc.newKieSession("ks-loopCalc");
    }

    public static void main(String[] args) {
        KieSession kSession = getSession();

        User user = new User();
        user.setName("张三");
        user.setLevel(1);
        Order order = new Order(new Date(),200,user,0);
//        order.setDiscountAmount(80);

        kSession.insert(order);
        kSession.getAgenda().getAgendaGroup("group-1").setFocus();
//        kSession.getAgenda().getAgendaGroup("group-2").setFocus();

        int ruleFiredCount = kSession.fireAllRules();
        kSession.dispose();

        System.out.println("触发了" + ruleFiredCount + "条规则");

        System.out.println("main--amount:"+order.getAmount() +", score:"+ order.getScore());
    }

}
