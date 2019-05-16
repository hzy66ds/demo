package com.ivan.demo.main;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLabel {

    /**
     * 主键ID，自增主键
     */
    @Id
    private String id;

    /**
     * 用户域
     */
    private String domain;

    /**
     * 用户id
     */
    private String primaryValue;

    /**
     * passport
     */
    private String passport;

    /**
     * 身份类子标签id集合
     */
    private List<Integer> identity;

    /**
     * 行为类子标签id集合
     */
    private List<Integer> behavior;

    /**
     * 状态类子标签id集合
     */
    private List<Integer> state;

    /**
     * 内容类子标签id集合
     */
    private List<Integer> content;

    /**
     * 添加人ID
     */
    private String createUser;

    /**
     * 修改人ID
     */
    private String updateUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPrimaryValue() {
        return primaryValue;
    }

    public void setPrimaryValue(String primaryValue) {
        this.primaryValue = primaryValue;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<Integer> getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identityId) {
        if (null == this.identity) {
            this.identity = new ArrayList<>();
            this.identity.add(identityId);
        } else {
            this.identity.add(identityId);
        }
    }

    public List<Integer> getBehavior() {
        return behavior;
    }

    public void setBehavior(Integer behaviorId) {
        if (null == this.behavior) {
            this.behavior = new ArrayList<>();
            this.behavior.add(behaviorId);
        } else {
            this.behavior.add(behaviorId);
        }
    }

    public List<Integer> getState() {
        return state;
    }

    public void setState(Integer stateId) {
        if (null == this.state) {
            this.state = new ArrayList<>();
            this.state.add(stateId);
        } else {
            this.state.add(stateId);
        }
    }

    public List<Integer> getContent() {
        return content;
    }

    public void setContent(Integer contentId) {
        if (null == this.content) {
            this.content = new ArrayList<>();
            this.content.add(contentId);
        } else {
            this.content.add(contentId);
        }
    }


    //好像用不到了，先注释掉，后续再看用不用得到
//    @Override
//    public int hashCode() {
//        int result = 17;
//        result = result * 31 + primaryValue.hashCode();
//        result = result * 31 + id;
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == this) {
//            return true;
//        }
//
//        if (!(obj instanceof UserLabel)) {
//            return false;
//        }
//        UserLabel userLabel = (UserLabel) obj;
//        return StringUtils.equals(userLabel.getPrimaryValue(), this.getPrimaryValue()) && userLabel.getId() == this.getId();
//    }
}
