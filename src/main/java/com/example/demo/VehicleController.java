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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {


	@Autowired
	private VehicleRepository ur;

	@PostMapping("/add")
	public <S extends Vehicle> S save(@RequestBody S entity) {
		return ur.save(entity);
	}

	@GetMapping("/get/page/sort")
	public List<Vehicle> findAll(Sort sort) {
		return ur.findAll(sort);
	}

	@GetMapping("/get/page")
	public Page<Vehicle> findAll(Pageable pageable) {
		return ur.findAll(pageable);
	}

	@GetMapping("/get")
	public List<Vehicle> findAll() {
		return ur.findAll();
	}

	@GetMapping("/get/{id}")
	public Optional<Vehicle> findById(@PathVariable("id")Integer id) {
		return ur.findById(id);
	}

	@DeleteMapping("/get/{id}")
	public void deleteById(@PathVariable("id")Integer id) {
		ur.deleteById(id);
	}
	@PutMapping("/get/{id}")
	public Vehicle updateById(@PathVariable("id") Integer id,@RequestBody Vehicle u) {
		return ur.save(u);
	}
}
