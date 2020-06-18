package com.ivorymanager.pojo;

import java.io.Serializable;
import java.util.Date;

public class Spend implements Serializable {
    private Integer id;

    private String content;

    private String spendName;

    private String city;

    private String spendPeople;

    private String spendMethod;

    private Integer spendAmount;

    private String spendTargetAccount;

    private String spendTargetAccountNumber;

    private Date updateDate;

    private Date createDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSpendName() {
        return spendName;
    }

    public void setSpendName(String spendName) {
        this.spendName = spendName == null ? null : spendName.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getSpendPeople() {
        return spendPeople;
    }

    public void setSpendPeople(String spendPeople) {
        this.spendPeople = spendPeople == null ? null : spendPeople.trim();
    }

    public String getSpendMethod() {
        return spendMethod;
    }

    public void setSpendMethod(String spendMethod) {
        this.spendMethod = spendMethod == null ? null : spendMethod.trim();
    }

    public Integer getSpendAmount() {
        return spendAmount;
    }

    public void setSpendAmount(Integer spendAmount) {
        this.spendAmount = spendAmount;
    }

    public String getSpendTargetAccount() {
        return spendTargetAccount;
    }

    public void setSpendTargetAccount(String spendTargetAccount) {
        this.spendTargetAccount = spendTargetAccount == null ? null : spendTargetAccount.trim();
    }

    public String getSpendTargetAccountNumber() {
        return spendTargetAccountNumber;
    }

    public void setSpendTargetAccountNumber(String spendTargetAccountNumber) {
        this.spendTargetAccountNumber = spendTargetAccountNumber == null ? null : spendTargetAccountNumber.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", content=").append(content);
        sb.append(", spendName=").append(spendName);
        sb.append(", city=").append(city);
        sb.append(", spendPeople=").append(spendPeople);
        sb.append(", spendMethod=").append(spendMethod);
        sb.append(", spendAmount=").append(spendAmount);
        sb.append(", spendTargetAccount=").append(spendTargetAccount);
        sb.append(", spendTargetAccountNumber=").append(spendTargetAccountNumber);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", createDate=").append(createDate);
        sb.append("]");
        return sb.toString();
    }
}