package com.xdd.mdemo.pack.blog.entry;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by angelo.tang on 2016-12-30.
 */
public class StatisticsInfo implements Serializable {
    /**
     * 对象序列化版本
     */
    private static final long serialVersionUID = -6255127600860238517L;

    /**
     * ID
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 门店ID
     */
    private Long storeId;

    /**
     * 门店名称
     */
    private String storeName;

    /**
     * 支付订单总额
     */
    private BigDecimal payOrderAmount;

    /**
     * 支付订单笔数
     */
    private Integer payOrderCount;

    /**
     * 支付笔单价
     */
    private BigDecimal avgCountAmount;

    /**
     * 支付退款笔数
     */
    private Integer drawackCount;

    /**
     * 核销订单笔数
     */
    private Integer verOrderCount;

    /**
     * 外卖订单总额
     */
    private BigDecimal wmOrderAmount;

    /**
     * 外卖订单笔数
     */
    private Integer wmOrderCount;

    /**
     * 外卖订单笔单价
     */
    private BigDecimal wmAvgCountAmount;

    /**
     * 外卖退单笔数
     */
    private Integer wmDrawBackCount;

    /**
     * 新增会员人数
     */
    private Integer newFansCount;

    /**
     * 会员充值金额
     */
    private BigDecimal fansChargeAmount;

    /**
     * 店长（联系方式）
     */
    private String storeManagerTel;

    public StatisticsInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public BigDecimal getPayOrderAmount() {
        return payOrderAmount;
    }

    public void setPayOrderAmount(BigDecimal payOrderAmount) {
        this.payOrderAmount = payOrderAmount;
    }

    public Integer getPayOrderCount() {
        return payOrderCount;
    }

    public void setPayOrderCount(Integer payOrderCount) {
        this.payOrderCount = payOrderCount;
    }

    public BigDecimal getAvgCountAmount() {
        return avgCountAmount;
    }

    public void setAvgCountAmount(BigDecimal avgCountAmount) {
        this.avgCountAmount = avgCountAmount;
    }

    public Integer getDrawackCount() {
        return drawackCount;
    }

    public void setDrawackCount(Integer drawackCount) {
        this.drawackCount = drawackCount;
    }

    public Integer getVerOrderCount() {
        return verOrderCount;
    }

    public void setVerOrderCount(Integer verOrderCount) {
        this.verOrderCount = verOrderCount;
    }

    public BigDecimal getWmOrderAmount() {
        return wmOrderAmount;
    }

    public void setWmOrderAmount(BigDecimal wmOrderAmount) {
        this.wmOrderAmount = wmOrderAmount;
    }

    public Integer getWmOrderCount() {
        return wmOrderCount;
    }

    public void setWmOrderCount(Integer wmOrderCount) {
        this.wmOrderCount = wmOrderCount;
    }

    public BigDecimal getWmAvgCountAmount() {
        return wmAvgCountAmount;
    }

    public void setWmAvgCountAmount(BigDecimal wmAvgCountAmount) {
        this.wmAvgCountAmount = wmAvgCountAmount;
    }

    public Integer getWmDrawBackCount() {
        return wmDrawBackCount;
    }

    public void setWmDrawBackCount(Integer wmDrawBackCount) {
        this.wmDrawBackCount = wmDrawBackCount;
    }

    public Integer getNewFansCount() {
        return newFansCount;
    }

    public void setNewFansCount(Integer newFansCount) {
        this.newFansCount = newFansCount;
    }

    public BigDecimal getFansChargeAmount() {
        return fansChargeAmount;
    }

    public void setFansChargeAmount(BigDecimal fansChargeAmount) {
        this.fansChargeAmount = fansChargeAmount;
    }

    public String getStoreManagerTel() {
        return storeManagerTel;
    }

    public void setStoreManagerTel(String storeManagerTel) {
        this.storeManagerTel = storeManagerTel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatisticsInfo that = (StatisticsInfo) o;

        if (avgCountAmount != null ? !avgCountAmount.equals(that.avgCountAmount) : that.avgCountAmount != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (drawackCount != null ? !drawackCount.equals(that.drawackCount) : that.drawackCount != null) return false;
        if (fansChargeAmount != null ? !fansChargeAmount.equals(that.fansChargeAmount) : that.fansChargeAmount != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (newFansCount != null ? !newFansCount.equals(that.newFansCount) : that.newFansCount != null) return false;
        if (payOrderAmount != null ? !payOrderAmount.equals(that.payOrderAmount) : that.payOrderAmount != null)
            return false;
        if (payOrderCount != null ? !payOrderCount.equals(that.payOrderCount) : that.payOrderCount != null)
            return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (storeManagerTel != null ? !storeManagerTel.equals(that.storeManagerTel) : that.storeManagerTel != null)
            return false;
        if (storeName != null ? !storeName.equals(that.storeName) : that.storeName != null) return false;
        if (verOrderCount != null ? !verOrderCount.equals(that.verOrderCount) : that.verOrderCount != null)
            return false;
        if (wmAvgCountAmount != null ? !wmAvgCountAmount.equals(that.wmAvgCountAmount) : that.wmAvgCountAmount != null)
            return false;
        if (wmDrawBackCount != null ? !wmDrawBackCount.equals(that.wmDrawBackCount) : that.wmDrawBackCount != null)
            return false;
        if (wmOrderAmount != null ? !wmOrderAmount.equals(that.wmOrderAmount) : that.wmOrderAmount != null)
            return false;
        if (wmOrderCount != null ? !wmOrderCount.equals(that.wmOrderCount) : that.wmOrderCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (storeName != null ? storeName.hashCode() : 0);
        result = 31 * result + (payOrderAmount != null ? payOrderAmount.hashCode() : 0);
        result = 31 * result + (payOrderCount != null ? payOrderCount.hashCode() : 0);
        result = 31 * result + (avgCountAmount != null ? avgCountAmount.hashCode() : 0);
        result = 31 * result + (drawackCount != null ? drawackCount.hashCode() : 0);
        result = 31 * result + (verOrderCount != null ? verOrderCount.hashCode() : 0);
        result = 31 * result + (wmOrderAmount != null ? wmOrderAmount.hashCode() : 0);
        result = 31 * result + (wmOrderCount != null ? wmOrderCount.hashCode() : 0);
        result = 31 * result + (wmAvgCountAmount != null ? wmAvgCountAmount.hashCode() : 0);
        result = 31 * result + (wmDrawBackCount != null ? wmDrawBackCount.hashCode() : 0);
        result = 31 * result + (newFansCount != null ? newFansCount.hashCode() : 0);
        result = 31 * result + (fansChargeAmount != null ? fansChargeAmount.hashCode() : 0);
        result = 31 * result + (storeManagerTel != null ? storeManagerTel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StatisticsInfo{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", payOrderAmount=" + payOrderAmount +
                ", payOrderCount=" + payOrderCount +
                ", avgCountAmount=" + avgCountAmount +
                ", drawackCount=" + drawackCount +
                ", verOrderCount=" + verOrderCount +
                ", wmOrderAmount=" + wmOrderAmount +
                ", wmOrderCount=" + wmOrderCount +
                ", wmAvgCountAmount=" + wmAvgCountAmount +
                ", wmDrawBackCount=" + wmDrawBackCount +
                ", newFansCount=" + newFansCount +
                ", fansChargeAmount=" + fansChargeAmount +
                ", storeManagerTel='" + storeManagerTel + '\'' +
                '}';
    }
}
