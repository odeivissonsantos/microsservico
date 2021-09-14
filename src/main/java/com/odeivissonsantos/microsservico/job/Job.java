package com.odeivissonsantos.microsservico.job;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.odeivissonsantos.microsservico.entity.Cliente;
import com.odeivissonsantos.microsservico.repository.ClienteRepository;

@Component
public class Job {
	
	@Autowired
	private ClienteRepository repository;
	
	@Scheduled(cron = "*/10 * * * * *")
	public void execute() {
		Cliente cliente = new Cliente();
		cliente.setData(new Date());
		cliente.setStatus(false);
		
		repository.save(cliente);
		
	}
	
}
