package com.neo.drools.model.fact;

/**
 * @author: yangshaoqiang
 * @date: 2018/10/11 15:48
 */
public class InsuranceResult {

    // 得分
    private int score;

    private InsuranceEnum insurance;

    public InsuranceResult(int score, InsuranceEnum insurance) {
        this.score = score;
        this.insurance = insurance;
    }

    public InsuranceResult() {
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public InsuranceEnum getInsurance() {
        return insurance;
    }

    public void setInsurance(InsuranceEnum insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceResult{");
        sb.append("\"score\":")
                .append(score);
        sb.append(",\"insurance\":")
                .append(insurance);
        sb.append('}');
        return sb.toString();
    }

    // 保险类型
    public enum InsuranceEnum {
        MEDICAL(1, "医疗"),
        SERIOUS_ILLNESS(2, "重疾"),
        SAVING(3, "储蓄"),
        ACCIDENT(4, "意外");

        private int id;

        private String desc;

        private InsuranceEnum(int id, String desc) {
            this.id = id;
            this.desc = desc;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("insuranceEnum{");
            sb.append("\"id\":")
                    .append(id);
            sb.append(",\"desc\":\"")
                    .append(desc).append('\"');
            sb.append('}');
            return sb.toString();
        }
    }
}
