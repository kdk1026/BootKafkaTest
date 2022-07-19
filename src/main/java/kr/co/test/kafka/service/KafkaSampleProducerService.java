package kr.co.test.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

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
@Service
public class KafkaSampleProducerService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMessage(String message) {
		System.out.println("send message : " +  message);        
		kafkaTemplate.send("test", message);
	}
	
}
