package asdf;

public class User {
	 	public int id;
	    public String firstName;
	    public String lastName;
	    public String username;
	    public String password;
	    public String role;
		public User(int id, String firstName, String lastName, String username, String password, String role) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.username = username;
			this.password = password;
			this.role = role;
		}
		public int getId() {
			return id;
		}
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public String getUsername() {
			return username;
		}
		public String getPassword() {
			return password;
		}
		public String getRole() {
			return role;
		}
	    
}
