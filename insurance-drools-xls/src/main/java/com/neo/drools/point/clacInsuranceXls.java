package com.neo.drools.point;

import com.google.common.collect.Lists;
import com.neo.drools.model.*;
import com.neo.drools.model.fact.InsuranceResult;
import com.neo.drools.model.fact.Result;
import jdk.nashorn.internal.objects.annotations.Function;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class clacInsuranceXls {

    static KieSession getSession() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        return kc.newKieSession("ks-insuranceXLS");
    }

    public static void main(String[] args) {
        KieSession kSession = getSession();

        FullRequest fullRequest = new FullRequest();
        //收入信息
        FamilyIncomeExpenseInfo familyIncomeExpenseInfo = new FamilyIncomeExpenseInfo();
        familyIncomeExpenseInfo.setFamilyIncome(60);

        FamilyMemberInfo familyMemberInfo;
        SelfBaseInfo selfBaseInfo;
        // 健康信息
        SelfHealthInfo selfHealthInfo = new SelfHealthInfo();
        selfHealthInfo.setHealth(SelfHealthInfo.Health.NO);
        //工作信息
        SelfWorkInfo selfWorkInfo = new SelfWorkInfo();
        selfWorkInfo.setIndustry(SelfWorkInfo.INDUSTRY.OUTDOOR);


        fullRequest.setFamilyIncomeExpenseInfo(familyIncomeExpenseInfo);
        fullRequest.setSelfHealthInfo(selfHealthInfo);
        fullRequest.setSelfWorkInfo(selfWorkInfo);
        fullRequest.setResults(new ArrayList<InsuranceResult>());

        // 需要把规则所有参数统一传入（包括输入输出）
        kSession.insert(fullRequest);

        int ruleFiredCount = kSession.fireAllRules();
        kSession.dispose();

        System.out.println("触发了" + ruleFiredCount + "条规则");

    }



}
