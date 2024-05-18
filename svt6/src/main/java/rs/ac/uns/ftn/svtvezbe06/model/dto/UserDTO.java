package rs.ac.uns.ftn.svtvezbe06.model.dto;

import javax.validation.constraints.NotBlank;

import rs.ac.uns.ftn.svtvezbe06.model.entity.User;


public class UserDTO {

	private Long id;
	
	private String username;
	
	private String password;
    public Long getId() {
		return id;
	}

    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

    public UserDTO(User createdUser) {
        this.id = createdUser.getId();
        this.username = createdUser.getUsername();
    }
}
