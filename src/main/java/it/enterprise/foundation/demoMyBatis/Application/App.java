package it.enterprise.foundation.demoMyBatis.Application;

import java.util.List;

import it.enterprise.foundation.demoMyBatis.model.User;
import it.enterprise.foundation.demoMyBatis.service.UserService;

/**
 * Hello world!
 *
 */
public class App {
	private static UserService userService = new UserService();
	
	public static void main( String[] args ){
         List<User> list = userService.listUsers();
         for (User u : list) {
             System.out.println(u.getNome() + " - " + u.getCognome() + " age: " + u.getEta());
         }
    }
}
