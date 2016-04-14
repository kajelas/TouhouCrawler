package io.kajelas.touhou.manager;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.kajelas.touhou.dao.TouhouCollectionMapper;
import io.kajelas.touhou.model.TouhouCollection;

@Service
public class TouhouCollectionManager {
	
	@Autowired
	private TouhouCollectionMapper dao;
	
	public void persistRecords(List<TouhouCollection> collections) {
		for (TouhouCollection collection : collections) {
			persistRecord(collection);
		}
	}
	
	public void persistRecord(TouhouCollection collection) {
		TouhouCollection collectionInDb = dao.selectByPrimaryKey(collection.getCollectionId());
		if (collectionInDb == null)
			dao.insert(collection);
		else if (!collectionInDb.getUpdateTime().equals(collection.getUpdateTime()))
			dao.updateByPrimaryKey(collection);
	}
}
