package io.kajelas.touhou.service.async;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import io.kajelas.touhou.manager.TouhouCollectionManager;
import io.kajelas.touhou.model.TouhouCollection;
import io.kajelas.touhou.service.CatchCollectionService;

@Service
public class AsyncCatchService {
	protected final Logger log = Logger.getLogger(getClass());
	
	@Autowired
	private TouhouCollectionManager manager;
	
	@Autowired
	private CatchCollectionService service;
	
	@Async
	public void catchAndSave(String startId, String endId) throws Exception {
		log.info("抓取开始...");
		List<TouhouCollection> collections = service.catchBatch("http://down.thwiki.cc/i/", startId, endId);
		log.info("抓取到"+collections.size()+"条记录，开始写入数据库");
		manager.persistRecords(collections);
		log.info("抓取结束...");
	}
}
