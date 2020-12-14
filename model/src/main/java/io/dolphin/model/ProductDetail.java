package io.dolphin.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ProductDetails" database table.
 *
 */
@Entity
@Table(name="ProductDetails", schema = "dbo")
@NamedQuery(name="ProductDetail.findAll", query="SELECT p FROM ProductDetail p")
public class ProductDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="Description", columnDefinition = "nvarchar(2045)")
	private String description;

	@Column(name="Enabled")
	private boolean enabled;

	@Column(name="Specification", columnDefinition = "nvarchar(2045)")
	private String specification;

	@Column(name="Type")
	private int type;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="ProductID")
	private Product product;

	public ProductDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getSpecification() {
		return this.specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
