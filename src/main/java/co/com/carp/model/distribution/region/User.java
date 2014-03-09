package co.com.carp.model.distribution.region;

public class User extends DistributionModel {

	private Role role;
	
	private Login login;

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

}
