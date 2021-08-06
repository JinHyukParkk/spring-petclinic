package org.springframework.samples.petclinic.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.samples.petclinic.aspect.LogExecutionTime;
import org.springframework.samples.petclinic.owner.OwnerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	String hyuk;

	@LogExecutionTime
	@GetMapping("/context")
	public String context() {
		return "hello " + applicationContext.getBean(OwnerRepository.class);
	}

	@GetMapping("/hyuk")
	public String getHyuk() {
		return hyuk;
	}

}
