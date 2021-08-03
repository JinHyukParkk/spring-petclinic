package org.springframework.samples.petclinic.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {

	@Autowired
	ApplicationContext applicationContext;

	@GetMapping("/context")
	public String context() {
		return "hello " + applicationContext.getBean(OwnerRepository.class);
	}

}
