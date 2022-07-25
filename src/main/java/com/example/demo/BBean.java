package com.example.demo;

public class BBean {
    private String desc;
    private ABean a;

    public ABean getA() {
        return a;
    }

    public void setA(ABean a) {
        this.a = a;
    }

    public BBean() {
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
