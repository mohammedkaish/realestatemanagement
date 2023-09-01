package com.example.demo.service;

import java.util.List;

//import org.springdoc.core.converters.models.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.Userrepo;

@Service
public class Serviceclass {
  @Autowired
  Userrepo repositoryobj;
  public List<User> Show()
  {
	return repositoryobj.findAll();
	  
  }
  public User PostDetails(User modify)
  {
	  return repositoryobj.save(modify);
  }
  public User PutDetails(User put)
  {
	   return repositoryobj.saveAndFlush(put);
  }
  public void Delete(Integer id)
  {
	  repositoryobj.deleteById(id);
  }
  public User get(Integer id)
  {
	  return repositoryobj.findById(id).get();
  }
  public List<User> getCustomerWithSorting(String field) {
		return repositoryobj.findAll(Sort.by(Sort.Direction.DESC,field));
	}

	public Page<User> getCustomerWithPagination(int offset, int pageSize) {
		Page<User> products = repositoryobj.findAll(PageRequest.of(offset, pageSize));
		return products;
	}
}
