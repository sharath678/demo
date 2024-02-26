package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControler {

	@Autowired
	private UserRepository ur;

	@PostMapping("/add")
	public <S extends User> S save(@RequestBody S entity) {
		return ur.save(entity);
	}

	@GetMapping("/get/page/sort")
	public List<User> findAll(Sort sort) {
		return ur.findAll(sort);
	}

	@GetMapping("/get/page")
	public Page<User> findAll(Pageable pageable) {
		return ur.findAll(pageable);
	}

	@GetMapping("/get")
	public List<User> findAll() {
		return ur.findAll();
	}

	@GetMapping("/get/{id}")
	public Optional<User> findById(@PathVariable("id")Integer id) {
		return ur.findById(id);
	}

	@DeleteMapping("/get/{id}")
	public void deleteById(@PathVariable("id")Integer id) {
		ur.deleteById(id);
	}
	@PutMapping("/get/{id}")
	public User updateById(@PathVariable("id") Integer id,@RequestBody User u) {
		return ur.save(u);
	}
	
	
	
}
