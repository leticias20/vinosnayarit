package com.vinosnayarit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinosnayarit.model.Vino;
import com.vinosnayarit.repository.VinoRepository;

@RestController
@RequestMapping("/api")
public class VinoController {
	
	@Autowired
	VinoRepository vinoRepository;
	
	 @GetMapping("/vinos")
	  public ResponseEntity<List<Vino>> getAllVinos() {
	    try {
	      List<Vino> vinos = new ArrayList<Vino>();
	      
	        vinoRepository.findAll().forEach(vinos::add);
	      

	      if (vinos.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }

	      return new ResponseEntity<>(vinos, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 
	 
	 @PostMapping("/vinos")
	  public ResponseEntity<Vino> createTutorial(@RequestBody Vino vino) {
	    try {
	    	
	      Vino _vino = vinoRepository
	          .save(new Vino(vino.getTipo(), vino.getMarca(), vino.getTamano(), vino.getPais(), vino.getUva(), vino.getCategoria(),
	        		  vino.getAnada(),vino.isEnexistencia()));
	      return new ResponseEntity<>(_vino, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	

}
