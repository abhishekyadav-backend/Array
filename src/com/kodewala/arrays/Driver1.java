package com.kodewala.arrays;

public class Driver1 {
	public static void main(String[] args) {
         
		User  user1 = new User ("kodewala","389446877");
		User  user2 = new User ("shubham","756450399");
		User  user3 = new User ("Abhi","12364489220");
		User  user4 = new User ("suraj","78944613");
		User  user5 = new User ("Rohit","2894723002");
		// store user object in an array.

		User users [] = new User[5];
		
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		users[3] = user4;
		users[4] = user5;
		
		System.out.println(users);
	}
}
