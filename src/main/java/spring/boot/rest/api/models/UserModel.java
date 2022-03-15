package spring.boot.rest.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class UserModel {
	
	@Id
	private String id;
	private String email;
	private String password;
	private String creationDate;
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {  
		this.email = email;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
}
