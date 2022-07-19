package kr.co.test.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.test.kafka.service.KafkaSampleProducerService;

/**
 * <pre>
 * -----------------------------------
 * 개정이력
 * -----------------------------------
 * 2022. 7. 19. kdk	최초작성
 * </pre>
 * 
 *
 * @author kdk
 */
@RestController
public class KafkaSampleProducerController {

	@Autowired
	private KafkaSampleProducerService kafkaSampleProducerService;
	
	@PostMapping("/sendMessage")
	public void sendMessage(String msg) {
		kafkaSampleProducerService.sendMessage(msg);
	}
	
}
