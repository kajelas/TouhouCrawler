package io.kajelas.touhou.service;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.time.DateUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import io.kajelas.touhou.model.TouhouCollection;

@Service
public class CatchCollectionService {
	public List<TouhouCollection> catchBatch(String baseUrl, String startId,String endId) throws ParseException, IOException {
		List<TouhouCollection> collections = new ArrayList<TouhouCollection>();
		for (int i = Integer.parseInt(startId); i <= Integer.parseInt(endId); i++) {
			TouhouCollection record = catchSingle(baseUrl,i);
			if (record != null)
				collections.add(record);
		}
		return collections;
	}
	
	public TouhouCollection catchSingle(String baseUrl,Integer id) throws ParseException, IOException {
		Document document = Jsoup.connect(baseUrl+id).timeout(15000).get();
		if (document.text().equals("对应的项目不存在"))
			return null;
		
		TouhouCollection record = new TouhouCollection();
		record.setCollectionId(id);
		record.setAddTime(new Date());
		Element element = document.getElementById("content");
		
		for (Element e : element.children()) {
			if (e.text().equals("项目名称"))
				record.setCollectionName(e.nextElementSibling().text());
			if (e.text().equals("社团/作者"))
				record.setCollectionAuthor(e.nextElementSibling().text());
			if (e.text().equals("项目类别"))
				record.setCollectionType(e.nextElementSibling().text());
			if (e.text().equals("展会名称"))
				record.setCollectionEvent(e.nextElementSibling().text());
			if (e.text().equals("添加时间"))
				record.setCreateTime(DateUtils.parseDate(e.nextElementSibling().text(), "yyyy-MM-dd HH:mm:ss"));
			if (e.text().equals("最新更新"))
				record.setUpdateTime(DateUtils.parseDate(e.nextElementSibling().text(), "yyyy-MM-dd HH:mm:ss"));
			if (e.text().equals("Wiki链接"))
				record.setWikiUrl(e.nextElementSibling().child(0).attr("href"));
		}
		return record;
	}
	
	public static void main(String args[]) throws ParseException, IOException {
		CatchCollectionService test = new CatchCollectionService();
		System.out.println(new String(test.catchSingle("http://down.thwiki.cc/i/", 1).getCollectionName().getBytes("UTF-8")));
	}
}
