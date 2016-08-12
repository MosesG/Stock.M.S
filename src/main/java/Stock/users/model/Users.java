package Stock.users.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "Users")
public class Users implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@Column(name = "User_Name")
	private String User_Name;
	
	@Column(name = "User_Password")
	private String User_Password;
	
	@Column(name = "User_Email")
	private String User_Email;
	
	@Column(name = "User_PhoneNo")
	private String User_PhoneNo;
	
	@Column(name = "User_Box")
	private String User_Box;
	
	@Column(name = "User_Status")
	private String User_Status;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUser_Name() {
		return User_Name;
	}

	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}

	public String getUser_Password() {
		return User_Password;
	}

	public void setUser_Password(String user_Password) {
		User_Password = user_Password;
	}

	public String getUser_Email() {
		return User_Email;
	}

	public void setUser_Email(String user_Email) {
		User_Email = user_Email;
	}

	public String getUser_PhoneNo() {
		return User_PhoneNo;
	}

	public String getUser_Status() {
		return User_Status;
	}

	public void setUser_Status(String user_Status) {
		User_Status = user_Status;
	}

	public void setUser_PhoneNo(String user_PhoneNo) {
		User_PhoneNo = user_PhoneNo;
	}

	public String getUser_Box() {
		return User_Box;
	}

	public void setUser_Box(String user_Box) {
		User_Box = user_Box;
	}
	
	public String getJson(){
		StringBuilder sb = new StringBuilder();
		sb.append("{")
			.append("\"id\": \"").append(getId()).append("\",")
			.append("\"User_Name\": \"").append(getUser_Name()).append("\",")
			.append("\"User_Password\": \"").append(getUser_Password()).append("\",")
			.append("\"User_Email\": \"").append(getUser_Email()).append("\",")
			.append("\"User_PhoneNo\": \"").append(getUser_PhoneNo()).append("\",")
			.append("\"User_Status\": \"").append(getUser_Status()).append("\",")
			.append("\"User_Box\": \"").append(getUser_Box()).append("\"");
		sb.append("}");
		
		return sb.toString();
		
	}

}
