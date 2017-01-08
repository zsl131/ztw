package com.zslin.app.model;

import javax.persistence.*;

/**
 * Created by 钟述林 393156105@qq.com on 2016/12/29 10:04.
 * 新闻分类
 */
@Entity
@Table(name = "ztw_news_category")
public class NewsCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Integer pid;

    @Column(name = "order_no")
    private Integer orderNo;

    /** 图标，选至boots或fontawesome.io */
    private String icon;

    /** 自己上传的图标 */
    @Column(name = "icon_path")
    private String iconPath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }
}
