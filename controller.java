package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.Serviceclass;



@RestController
public class controller {
	@Autowired
	Serviceclass serviceobj;
	Logger logger = LoggerFactory.getLogger(controller.class);
	@GetMapping("/get")
	public List<User>getDetails()
	{
		return serviceobj.Show();
	}
	@PostMapping("/post")
	public User create(@RequestBody User posted)
	{
		return serviceobj.PostDetails(posted) ;
		
	}
	@PutMapping("/put/{id}")
	public String update(@RequestBody User put,@PathVariable Integer id)
	{
		User temp = serviceobj.get(id);
		if(temp!=null)
		{
			 serviceobj.PutDetails(put);
			 return "OK";
		}
		return "Error";
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id)
	{
		serviceobj.Delete(id);
	}
	@GetMapping("/customer/{field}")
	public List<User> getCustomerWithSorting(@PathVariable String field) {
		List<User> sortcustomer = serviceobj.getCustomerWithSorting(field);
   		return sortcustomer;
	}

	@GetMapping("/pagination/{offset}/{pageSize}")
	public Page<User> getCustomerWithSorting(@PathVariable int offset, @PathVariable int pageSize) {
		Page<User> sortProducts = serviceobj.getCustomerWithPagination(offset, pageSize);
		return sortProducts;
	}
	
	@GetMapping(path="/loggerdemo")
		public String loggerDemo() {
			logger.info("Logger info");
			logger.warn("Logger warn");
			logger.error("logger error");
			return "Hello from logger demo";
		}
	

}
