package com.neo.drools;

import com.neo.drools.config.DroolsBeanFactory;
import org.junit.Test;

public class droolsTest {

    @Test
    public static void main(String[] args) {
        String PATH = "rules/point.xlsx";

        String drl = new DroolsBeanFactory().getDrlFromExcel(PATH);
        System.out.println("drl: " + drl);
    }

}
