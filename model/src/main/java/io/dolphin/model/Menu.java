package io.dolphin.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;




@Entity
@Table(name = "Menu" , schema = "dbo")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "ID", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CategoryId" )
    private MenuCategory menuCategory;

    @Column( name = "ParentId")
    private Integer parentId;


    @Column(name = "Title" , columnDefinition = "nvarchar(255)")
    private String title;

    @Column(name = "ETitle"  , columnDefinition = "nvarchar(255)")
    private String eTitle;

    @Column(name = "Url"  , columnDefinition = "nvarchar(255)")
    private String url;

    @Column(name = "Icon" , columnDefinition = "nvarchar(255)")
    private String icon;

    @Column(name = "Ordering")
    private Integer ordering;

    @Column(name = "PortalId")
    private Integer portalId;

    @Column(name = "CreateBy")
    private Integer createBy;

    @Column(name = "CreateTime")
    private Date createTime;

    @Column(name = "UpdateBy")
    private Integer updateBy;

    @Column(name = "UpdateTime")
    private Timestamp updateTime;

    public Menu() {
    }

    public Menu(Integer id, MenuCategory menuCategory, Integer parentId, String title, String eTitle, String url, String icon, Integer ordering, Integer portalId, Integer createBy, Date createTime, Integer updateBy, Timestamp updateTime) {
        this.id = id;
        this.menuCategory = menuCategory;
        this.parentId = parentId;
        this.title = title;
        this.eTitle = eTitle;
        this.url = url;
        this.icon = icon;
        this.ordering = ordering;
        this.portalId = portalId;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MenuCategory getMenuCategory() {
        return menuCategory;
    }

    public void setMenuCategory(MenuCategory menuCategory) {
        this.menuCategory = menuCategory;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String geteTitle() {
        return eTitle;
    }

    public void seteTitle(String eTitle) {
        this.eTitle = eTitle;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    public Integer getPortalId() {
        return portalId;
    }

    public void setPortalId(Integer portalId) {
        this.portalId = portalId;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuCategory=" + menuCategory +
                ", parentId=" + parentId +
                ", title='" + title + '\'' +
                ", eTitle='" + eTitle + '\'' +
                ", url='" + url + '\'' +
                ", icon='" + icon + '\'' +
                ", ordering=" + ordering +
                ", portalId=" + portalId +
                ", createBy=" + createBy +
                ", createTime=" + createTime +
                ", updateBy=" + updateBy +
                ", updateTime=" + updateTime +
                '}';
    }
}
