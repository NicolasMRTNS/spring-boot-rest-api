package spring.boot.rest.api.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.rest.api.models.UserModel;
import spring.boot.rest.api.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	public UserController() {}
	
	@GetMapping(value = "/")
	public ResponseEntity<List<UserModel>> getAllUsers() throws Exception {
		try {
			List<UserModel> users = UserService.getInstance().getAll();
			return new ResponseEntity<List<UserModel>>(users, HttpStatus.OK);
		} catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}
	
	@PostMapping(value = "/")
	public void createUser(@RequestBody Map<String, String> user) throws Exception{
		try {
			UserService.getInstance().createAndSaveUser(user);			
		} catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
