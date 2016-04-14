package io.kajelas.touhou;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import io.kajelas.touhou.dao.TouhouCollectionMapper;
import io.kajelas.touhou.model.TouhouCollection;

@Component
public class Test2 {
	@Autowired
	private TouhouCollectionMapper collectionDao;
	
	@Transactional
	public void test() throws Exception {
		System.out.println("123");
		TouhouCollection t1 = new TouhouCollection();
		t1.setCollectionId(9);
		t1.setCollectionName("123");
		collectionDao.insert(t1);
	}
}
