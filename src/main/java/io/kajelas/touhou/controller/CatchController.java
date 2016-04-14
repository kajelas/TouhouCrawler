package io.kajelas.touhou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.kajelas.touhou.service.async.AsyncCatchService;

@RestController
public class CatchController {
		
	@Autowired
	private AsyncCatchService service;
	
	@RequestMapping("/catchTouhouCollections")
	public String catchTouhouCollection(@RequestParam(value = "startId", defaultValue = "1") String startId,@RequestParam(value = "endId", defaultValue = "1") String endId) throws Exception {
		service.catchAndSave(startId, endId);
		return "SUCCESS";
	}

}
