package step11.jsoupTest;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class JsoupTest5 {

	// step01¸Þ´º¾ó
	public static void main(String[] args) throws IOException {
		Document doc = null;
		int a = 0;

		try {
			doc = Jsoup.connect("http://www.fashionplus.co.kr/mall/include/comment_list.asp?GoTopage=1&block=0&goods_id_comment=79598533").get();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Elements baseConn = doc.select("#review_list > dd > ul > li");
		Elements content = baseConn.get(1).("#review_list > dd > ul > li:nth-child(1) > div.contents");
		Elements star = doc.select("#review_list > dd > ul > li:nth-child(1) > div.icon_star");
		Elements member = doc.select("#review_list > dd > ul > li:nth-child(1) p.member");
		Elements option = doc.select("#review_list > dd > ul > li:nth-child(1) p.option");
		System.out.println(test);

		
		
		}

	}
