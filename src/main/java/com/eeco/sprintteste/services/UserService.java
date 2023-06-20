package com.eeco.sprintteste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eeco.sprintteste.entities.User;
import com.eeco.sprintteste.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();

	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	//operação para inserir no banco de dados um novo objeto do tipo user
	public User insert(User obj) {
		return repository.save(obj);
	}
	// operção para deletar do banco de dados um usuário
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

}
