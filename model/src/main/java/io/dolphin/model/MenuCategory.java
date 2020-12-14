package io.dolphin.model;

import java.io.Serializable;
import javax.persistence.*;



@Entity
@Table(name="MenuCategory", schema = "dbo")
@NamedQuery(name="MenuCategory.findAll", query="SELECT m FROM MenuCategory m")
public class MenuCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="Enabled")
	private boolean enabled;

	@Column(name="Title" , columnDefinition = "nvarchar(255)")
	private String title;

	public MenuCategory() {
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
