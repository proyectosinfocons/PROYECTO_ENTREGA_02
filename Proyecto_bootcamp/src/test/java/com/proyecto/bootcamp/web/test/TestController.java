package com.proyecto.bootcamp.web.test;

import static org.mockito.Mockito.times;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.util.ResourceUtils;
import org.springframework.web.reactive.function.BodyInserters;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.util.JSON;
import com.proyecto.bootcamp.OrderServiceConfig;
import com.proyecto.bootcamp.bean.Parents;
import com.proyecto.bootcamp.repository.ItemReactiveRepository;
import com.proyecto.bootcamp.service.parentsService;
import com.proyecto.bootcamp.web.studentsController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@ExtendWith(SpringExtension.class)
@WebFluxTest(controllers = studentsController.class)
@ContextConfiguration(classes = { OrderServiceConfig.class })
public class TestController {

	ObjectMapper mapper;

	@Autowired
	WebTestClient webTestClient;

	@MockBean
	private ItemReactiveRepository parentsService;

	@BeforeEach
	public void init() {
//		webTestClient = WebTestClient.bindToServer().baseUrl("http://localhost:8099/micro-crud").build();

		mapper = new ObjectMapper();
	}

	 
    @Test
  public  void testCreateParents() {
//        Parents parent = new Parents();
//        parent.set_id("4667485");
//        parent.setComplementName("Test");
//        parent.setDateBirth("10/09/2019");
//        parent.setNumberidentify(2);
//        parent.setSex("H");
//        parent.setTypeidentify("DNI");
//        Mockito.when(parentsService.save(parent)).thenReturn(Mono.just(parent));
// 
//        webTestClient.post()
//            .uri("/index/entities")
//            .contentType(MediaType.APPLICATION_JSON)
//            .body(BodyInserters.fromObject(parent))
//            .exchange()
//            .expectStatus().isCreated();
// 
//        Mockito.verify(parentsService, times(1)).save(parent);
    }
    
    
    
    
    @Test
    public  void testGetParents() {

    	
//    	Parents par= new Parents();
//    	try {
//			par=mapper.readValue(new URL("C:\\version_segunda\\Proyecto_bootcamp\\src\\test\\resources\\mockups\\listallparents.json"),mapper.getTypeFactory().constructCollectionType(ArrayList.class, Parents.class));
//		} catch (Exception e) {
//			// TODO: handle exception
//	e.printStackTrace();
//		}
//    	Flux<Parents> statementFlux = Flux.just(par);
//        
//        Mockito.when(parentsService.findAll()).thenReturn(statementFlux);
//        
//        webTestClient.get()
//          .uri("/index/listall")
//          .exchange()
//          .expectStatus().isOk()
//          .expectBody(Parents.class).isEqualTo(par);
    	
      }

}
