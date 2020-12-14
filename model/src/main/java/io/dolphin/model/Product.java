package io.dolphin.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;



@Entity
@Table(name="Product", schema = "dbo")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="Code")
	private int code;

	@Column(name="CreateBy")
	private int createBy;

	@Column(name="CreateTime")
	private Timestamp createTime;

	@Column(name="Description", columnDefinition = "nvarchar(255)")
	private String description;

	@Column(name="Enabled")
	private boolean enabled;

	@Column(name="EName", columnDefinition = "nvarchar(255)")
	private String EName;

	@Column(name="Name", columnDefinition = "nvarchar(255)")
	private String name;

	@Column(name="Price")
	private BigDecimal price;

	private int qty;

	@Column(name="UpdateBy")
	private int updateBy;

	@Column(name="UpdateTime")
	private Timestamp updateTime;

	@Column(name="UrlImge" , columnDefinition = "nvarchar(255)")
	private String urlImge;

	//bi-directional many-to-one association to BaseInfo
	@ManyToOne
	@JoinColumn(name="BICategoryId")
	private BaseInfo baseInfo1;

	//bi-directional many-to-one association to BaseInfo
	@ManyToOne
	@JoinColumn(name="BIPriceType")
	private BaseInfo baseInfo2;

	//bi-directional many-to-one association to ProductDetail
	@OneToMany(mappedBy="product")
	private List<ProductDetail> productDetails;

	public Product() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(int createBy) {
		this.createBy = createBy;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getEName() {
		return this.EName;
	}

	public void setEName(String EName) {
		this.EName = EName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(int updateBy) {
		this.updateBy = updateBy;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public String getUrlImge() {
		return this.urlImge;
	}

	public void setUrlImge(String urlImge) {
		this.urlImge = urlImge;
	}

	public BaseInfo getBaseInfo1() {
		return this.baseInfo1;
	}

	public void setBaseInfo1(BaseInfo baseInfo1) {
		this.baseInfo1 = baseInfo1;
	}

	public BaseInfo getBaseInfo2() {
		return this.baseInfo2;
	}

	public void setBaseInfo2(BaseInfo baseInfo2) {
		this.baseInfo2 = baseInfo2;
	}

	public List<ProductDetail> getProductDetails() {
		return this.productDetails;
	}

	public void setProductDetails(List<ProductDetail> productDetails) {
		this.productDetails = productDetails;
	}

	public ProductDetail addProductDetail(ProductDetail productDetail) {
		getProductDetails().add(productDetail);
		productDetail.setProduct(this);

		return productDetail;
	}

	public ProductDetail removeProductDetail(ProductDetail productDetail) {
		getProductDetails().remove(productDetail);
		productDetail.setProduct(null);

		return productDetail;
	}

}
