package comparetest;

import java.util.Arrays;

public class User implements Comparable {

	private String id;
	private int age;

	public User(String id, int age) {
		this.id = id;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * implements Comparable's compareTo
	 */
	public int compareTo(Object o) {
		return this.age - ((User) o).getAge();
	}

	/**
	 * ≤‚ ‘∑Ω∑®
	 */
	public static void main(String[] args) {
		User[] users = new User[] { new User("a", 30), new User("b", 20) };
		Arrays.sort(users);
		for (int i = 0; i < users.length; i++) {
			User user = users[i];
			System.out.println(user.getId() + " " + user.getAge());
		}
	}

}
