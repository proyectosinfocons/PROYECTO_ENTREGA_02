package com.proyecto.bootcamp.repository;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.bootcamp.bean.Parents;
import com.proyecto.bootcamp.bean.Students;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ItemReactiveRepository extends ReactiveMongoRepository<Parents,String>{

	
//	Flux<Parents> findAll();
	
	
// Flux<Parents> findByDateBirthBetween(@Param("startDate")Date startDate,@Param("endDate")Date endDate);
//	
	
	@Query("{ 'complementName': ?0 }")
	public Mono<Parents> findByComplementName(String nombre);
	
	@Query("{ 'numberidentify': ?0 }")
	public Mono<Parents> findByNumberidentify(String numberidentify);
	
	
	@Query("{'dateBirth': {$gte: ?0, $lte:?1 }}")
	public Flux<Parents> findDateBirthbetween(Date startDate, Date endDate);

}
