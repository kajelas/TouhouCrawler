package io.kajelas.touhou;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Test {
	@Autowired
	private Test2 test;
	
	//@Scheduled(initialDelay = 2000, fixedRate=600000)
	@Transactional
	public void test() throws Exception {
		test.test();
	}
}
