package com.ivan.demo.main.myStudy.lambda;

import org.thymeleaf.util.StringUtils;

public class Artist {

    private String name;
    private String members;
    private String origin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public boolean isFrom(String originParam){
        return StringUtils.equals(originParam,origin);
    }
}
