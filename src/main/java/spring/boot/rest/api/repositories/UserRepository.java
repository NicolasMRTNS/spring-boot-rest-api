package spring.boot.rest.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import spring.boot.rest.api.models.UserModel;

public interface UserRepository extends MongoRepository<UserModel, String> {}
