package com.neo.drools.model;

import com.neo.drools.model.fact.InsuranceResult;

import java.util.List;

/**
 * @author: yangshaoqiang
 * @date: 2018/10/11 16:21
 *
 * 综和所有问题
 */
public class FullRequest {

    private FamilyIncomeExpenseInfo familyIncomeExpenseInfo;

    private FamilyMemberInfo familyMemberInfo;

    private SelfBaseInfo selfBaseInfo;

    private SelfHealthInfo selfHealthInfo;

    private SelfWorkInfo selfWorkInfo;

    private List<InsuranceResult> results;

    private InsuranceResult insuranceResult;

    public FamilyIncomeExpenseInfo getFamilyIncomeExpenseInfo() {
        return familyIncomeExpenseInfo;
    }

    public void setFamilyIncomeExpenseInfo(FamilyIncomeExpenseInfo familyIncomeExpenseInfo) {
        this.familyIncomeExpenseInfo = familyIncomeExpenseInfo;
    }

    public FamilyMemberInfo getFamilyMemberInfo() {
        return familyMemberInfo;
    }

    public void setFamilyMemberInfo(FamilyMemberInfo familyMemberInfo) {
        this.familyMemberInfo = familyMemberInfo;
    }

    public SelfBaseInfo getSelfBaseInfo() {
        return selfBaseInfo;
    }

    public void setSelfBaseInfo(SelfBaseInfo selfBaseInfo) {
        this.selfBaseInfo = selfBaseInfo;
    }

    public SelfHealthInfo getSelfHealthInfo() {
        return selfHealthInfo;
    }

    public void setSelfHealthInfo(SelfHealthInfo selfHealthInfo) {
        this.selfHealthInfo = selfHealthInfo;
    }

    public SelfWorkInfo getSelfWorkInfo() {
        return selfWorkInfo;
    }

    public void setSelfWorkInfo(SelfWorkInfo selfWorkInfo) {
        this.selfWorkInfo = selfWorkInfo;
    }

    public List<InsuranceResult> getResults() {
        return results;
    }

    public void setResults(List<InsuranceResult> results) {
        this.results = results;
    }

    public void addResults(List<InsuranceResult> results) {
        this.results.addAll(results);
    }

    public InsuranceResult getInsuranceResult() {
        return insuranceResult;
    }

    public void setInsuranceResult(InsuranceResult insuranceResult) {
        this.insuranceResult = insuranceResult;
    }
}
