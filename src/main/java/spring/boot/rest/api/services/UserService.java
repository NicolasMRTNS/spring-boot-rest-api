package spring.boot.rest.api.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import spring.boot.rest.api.models.UserModel;
import spring.boot.rest.api.repositories.UserRepository;

public class UserService {
	private static UserService __instance;
	
	@Autowired
	private UserRepository repository;
	
	private UserService() {}
	
	public static UserService getInstance() {
		if (__instance == null) {
			__instance = new UserService();
		}
		return __instance;
	}
	
	public void saveUser(UserModel user) {
		repository.save(user);
	}
	
	public List<UserModel> getAll() {
		return repository.findAll();
	}
	
	public void createAndSaveUser(Map<String, String> user) {
		UserModel userModel = new UserModel();
		userModel.setEmail(user.get("email"));
		userModel.setPassword(user.get("password"));
		userModel.setCreationDate(user.get("creationDate"));
		saveUser(userModel);
	}
}
