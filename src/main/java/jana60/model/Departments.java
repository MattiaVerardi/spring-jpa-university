package jana60.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Departments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String address;

	private String phone;

	private String email;

	private String website;

	private String headOfDepartment;

	@OneToMany(mappedBy = "departments")
	private List<Degrees> degrees;

	// getter e setter

	public Integer getId() {
		return id;
	}

	public List<Degrees> getDegrees() {
		return degrees;
	}

	public void setDegrees(List<Degrees> degrees) {
		this.degrees = degrees;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getHeadOfDepartment() {
		return headOfDepartment;
	}

	public void setHeadOfDepartment(String headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}

}
