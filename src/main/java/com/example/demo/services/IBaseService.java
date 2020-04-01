package com.example.demo.services;

import org.springframework.data.domain.Page;

public interface IBaseService<T, K> {
	T create(K dto);
	
	T get(int id);
	
//	Page<T> search(Object dto);
	
	T update(int id, K dto);
	
	int delete(int[] ids);
}