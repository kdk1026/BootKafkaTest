package kr.co.test.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
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
public class KafkaSampleConsumerService {

	@KafkaListener(topics = "test", groupId = "group-id-oing")
	public void consume(String message) {
		System.out.println("receive message : " + message);
	}
	
}
