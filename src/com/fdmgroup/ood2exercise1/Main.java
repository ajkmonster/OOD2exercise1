package com.fdmgroup.ood2exercise1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		ArrayList<User> users = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		File file1 = new File("Users.txt");
		FileWriter fw = new FileWriter(file1 , true);
		BufferedWriter bw = new BufferedWriter(fw);
		while (true) {
			System.out.println("Would you like to enter in a User? (Y/N)");
			String ans = sc.next();
			if ( ans.equalsIgnoreCase("y")) {
				User user = new User();
				System.out.println("What is your name? ");
				String name = sc.next();
				bw.append(name+",");
				user.setName(name);
				System.out.println("What is your address? ");
				sc.nextLine();
				String address = sc.nextLine();
				bw.append(address+",");
				user.setAddress(address);
				System.out.println("What is your email? ");
				String email = sc.next();
				bw.append(email+"\n");
				user.setEmail(email);
				users.add(user);
			}
			else {
				sc.close();
				bw.close();
				break;
			}
		}
		
		for (User user : users) {
			System.out.println(user.toString());
		}
		BufferedReader br = new BufferedReader(new FileReader(new File("Users.txt")));
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

}
