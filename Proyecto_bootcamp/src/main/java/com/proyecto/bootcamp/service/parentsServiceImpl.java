package com.proyecto.bootcamp.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.bootcamp.bean.Parents;
import com.proyecto.bootcamp.repository.ItemReactiveRepository;
import com.proyecto.bootcamp.service.parentsService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;









@Service
public class parentsServiceImpl implements parentsService{

	@Autowired
	private ItemReactiveRepository repository;
	

	
//	@Autowired
//	private ItemReactiveRepository repository;
//	
//	
	
	
	
	

	public Flux<Parents> findAll() {
		// TODO Auto-generated method stub
	
		return repository.findAll();
        
	}



@Override
public Mono<Parents> save(Parents parent) {
	// TODO Auto-generated method stub
	return repository.save(parent);



}



@Override
public Mono<Void> delete(Parents parent) {
	// TODO Auto-generated method stub
	return repository.delete(parent);
}



@Override
public Mono<Parents> findById(String id) {
	// TODO Auto-generated method stub
	return repository.findById(id);
}




public Mono<Parents> update(String id, Parents parent) {
	// TODO Auto-generated method stub
	return repository.save(parent);



}



@Override
public Mono<Parents> findByComplementName(String nombre) {
	// TODO Auto-generated method stub
	return repository.findByComplementName(nombre);
}



@Override
public Mono<Parents> findByNumberidentify(String numberidentify) {
	// TODO Auto-generated method stub
	return repository.findByNumberidentify(numberidentify);
}



@Override
public Flux<Parents> findDateBirthbetween(Date startDate, Date endDate) {
	// TODO Auto-generated method stub
	return repository.findDateBirthbetween(startDate, endDate);
}



//@Override
//public Flux<Parents> findByDateBirthBetween() {
//	// TODO Auto-generated method stub
//	return repository.findByDateBirthBetween();
//}




















}
