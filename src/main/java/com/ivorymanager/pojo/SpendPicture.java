package com.ivorymanager.pojo;

import java.io.Serializable;
import java.util.Date;

public class SpendPicture implements Serializable {
    private Integer id;

    private Integer spendId;

    private String spendImage;

    private Integer imageType;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpendId() {
        return spendId;
    }

    public void setSpendId(Integer spendId) {
        this.spendId = spendId;
    }

    public String getSpendImage() {
        return spendImage;
    }

    public void setSpendImage(String spendImage) {
        this.spendImage = spendImage == null ? null : spendImage.trim();
    }

    public Integer getImageType() {
        return imageType;
    }

    public void setImageType(Integer imageType) {
        this.imageType = imageType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", spendId=").append(spendId);
        sb.append(", spendImage=").append(spendImage);
        sb.append(", imageType=").append(imageType);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append("]");
        return sb.toString();
    }
}