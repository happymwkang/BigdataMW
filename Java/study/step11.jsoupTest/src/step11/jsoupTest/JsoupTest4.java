package step11.jsoupTest;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class JsoupTest4 {

	// step01메뉴얼
	public static void main(String[] args) throws IOException {
		Document doc = null;
		int a = 0;
		try {
			doc = Jsoup.connect(
					"http://www.fashionplus.co.kr/mall/include/comment_list.asp?GoTopage=1&block=0&goods_id_comment=79598533")
					.get();
		} catch (IOException e) {
			e.printStackTrace();
		}

//		Elements page = doc.select("div.pageframe");
		Elements content = doc.select("li:nth-child(1) > div.contents p");
		Elements iconstar = doc.select("li:nth-child(1) > div.icon_star p");

//		for (int pageNo = 0; pageNo < page.size(); pageNo++) {
//			System.out.println(page.get(pageNo));
//		}

		for (int star = 0; star < iconstar.size(); star++) {
			iconstar.get(star).getElementsByClass("reviewbg star_on");
			a = star;
		}
		System.out.print("[별 " + a + "개] ");

		for (int i = 0; i < content.size(); i++) {
			System.out.println(content.get(i).text());
			
		}
	}
}

