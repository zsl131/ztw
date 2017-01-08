package com.zslin.app.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 钟述林 393156105@qq.com on 2016/12/29 9:48.
 * 积分明细
 */
@Entity
@Table(name = "ztw_score")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /** 对应用户Id */
    @Column(name = "account_id")
    private Integer accountId;

    /** 对应用户昵称 */
    private String nickname;

    /** 对应用户真实姓名 */
    private String realname;

    /** 对应用户电话号码 */
    private String phone;

    /** 说明 */
    private String remark;

    /** 偏移量，即加减分值 */
    private Integer flag;

    /** 剩余分值 */
    private Integer surplus;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "create_long")
    private Long createLong;

    public Date getCreateDate() {
        return createDate;
    }

    public Long getCreateLong() {
        return createLong;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCreateLong(Long createLong) {
        this.createLong = createLong;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getSurplus() {
        return surplus;
    }

    public void setSurplus(Integer surplus) {
        this.surplus = surplus;
    }
}
