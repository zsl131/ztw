package com.zslin.app.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 钟述林 393156105@qq.com on 2016/12/29 9:43.
 * 用户信息
 */
@Entity
@Table(name = "ztw_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /** 真实姓名 */
    private String realname;

    /** 昵称 */
    private String nickname;

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    private String openid;

    /** 头像 */
    private String headimgurl;

    /** 电话 */
    private String phone;

    /** 身份证号 */
    private String identity;

    /** 邮箱地址 */
    private String email;

    /** qq号码 */
    private String qq;

    /**
     * 来源
     * 1 - 本站注册
     * 2 - 微信登陆
     * 3 - QQ登陆
     */
    private String sources;

    /**
     * 类型
     * 1 - 普通用户
     */
    private String type;

    /** 积分 */
    private Integer scores;

    /** 等级 */
    private Integer level;

    /** 性别 */
    private String sex;

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

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
