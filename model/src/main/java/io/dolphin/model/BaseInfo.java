package io.dolphin.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="BaseInfo" )
@NamedQuery(name="BaseInfo.findAll", query="SELECT b FROM BaseInfo b")
public class BaseInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="Enabled")
	private boolean enabled;

	@Column(name="ParentID")
	private int parentID;

	@Column(name="Title" , columnDefinition = "nvarchar(255)")
	private String title;

	//bi-directional many-to-one association to BaseInfoCategory
	@ManyToOne
	@JoinColumn(name="BaseInfoCategoryID")
	private BaseInfoCategory baseInfoCategory;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="baseInfo1")
	private List<Product> products1;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="baseInfo2")
	private List<Product> products2;

	public BaseInfo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public int getParentID() {
		return this.parentID;
	}

	public void setParentID(int parentID) {
		this.parentID = parentID;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BaseInfoCategory getBaseInfoCategory() {
		return this.baseInfoCategory;
	}

	public void setBaseInfoCategory(BaseInfoCategory baseInfoCategory) {
		this.baseInfoCategory = baseInfoCategory;
	}

	public List<Product> getProducts1() {
		return this.products1;
	}

	public void setProducts1(List<Product> products1) {
		this.products1 = products1;
	}

	public Product addProducts1(Product products1) {
		getProducts1().add(products1);
		products1.setBaseInfo1(this);

		return products1;
	}

	public Product removeProducts1(Product products1) {
		getProducts1().remove(products1);
		products1.setBaseInfo1(null);

		return products1;
	}

	public List<Product> getProducts2() {
		return this.products2;
	}

	public void setProducts2(List<Product> products2) {
		this.products2 = products2;
	}

	public Product addProducts2(Product products2) {
		getProducts2().add(products2);
		products2.setBaseInfo2(this);

		return products2;
	}

	public Product removeProducts2(Product products2) {
		getProducts2().remove(products2);
		products2.setBaseInfo2(null);

		return products2;
	}

}
