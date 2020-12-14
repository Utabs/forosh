package io.dolphin.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;



@Entity
@Table(name="BaseInfoCategory", schema = "dbo")
@NamedQuery(name="BaseInfoCategory.findAll", query="SELECT b FROM BaseInfoCategory b")
public class BaseInfoCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="EName" , columnDefinition = "nvarchar(255)")
	private String EName;

	@Column(name="Endabled")
	private boolean endabled;

	@Column(name="Name" , columnDefinition = "nvarchar(255)")
	private String name;

	//bi-directional many-to-one association to BaseInfo
	@OneToMany(mappedBy="baseInfoCategory")
	private List<BaseInfo> baseInfos;

	public BaseInfoCategory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEName() {
		return this.EName;
	}

	public void setEName(String EName) {
		this.EName = EName;
	}

	public boolean getEndabled() {
		return this.endabled;
	}

	public void setEndabled(boolean endabled) {
		this.endabled = endabled;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BaseInfo> getBaseInfos() {
		return this.baseInfos;
	}

	public void setBaseInfos(List<BaseInfo> baseInfos) {
		this.baseInfos = baseInfos;
	}

	public BaseInfo addBaseInfo(BaseInfo baseInfo) {
		getBaseInfos().add(baseInfo);
		baseInfo.setBaseInfoCategory(this);

		return baseInfo;
	}

	public BaseInfo removeBaseInfo(BaseInfo baseInfo) {
		getBaseInfos().remove(baseInfo);
		baseInfo.setBaseInfoCategory(null);

		return baseInfo;
	}

}
