package step11.jsoupTest;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class JsoupTest6 {

	// step01메뉴얼
	public static void main(String[] args) throws IOException {
		Document doc = null;
		int a = 0;
		Elements test = null;
		boolean ftf ;
		
		try {
			doc = Jsoup.connect(
					"http://www.fashionplus.co.kr/mall/include/comment_list.asp?GoTopage=1&block=0&goods_id_comment=79598533")
					.get();
		} catch (IOException e) {
			e.printStackTrace();
		}

//		Elements page = doc.select("div.pageframe");
		Elements content = doc.select("li:nth-child(1)");
		Elements iconStar = doc.select("li:nth-child(1) > div.icon_star p");
//		Elements iconstar = content.select("li:nth-child(1) > div.icon_star");
//		Elements iconstar = content.select("li:nth-child(1) > div.icon_star");
//		Elements iconstar = content.select("li:nth-child(1) > div.icon_star");
		Elements content1 = null;
		Elements content2 = null;
		Elements content3 = null;
		Elements content4 = null;
		Elements content5 = null;
		Elements content6 = null;
		Elements content7 = null;
		Elements content8 = null;
		Elements content9 = null;
		Elements content10 = null;
		Elements content11 = null;
		Elements content12 = null;
		
		System.out.println(content);
		content1 = content.tagName("li").next();
		
		System.out.println(content1);
		content2 = content1.tagName("li").next();
		
		System.out.println(content2);
		content3 = content2.tagName("li").next();
		System.out.println(content3);
		content4 = content3.tagName("li").next();
		System.out.println(content4);
		content5 = content4.tagName("li").next();
		System.out.println(content5);
		content6 = content5.tagName("li").next();
		System.out.println(content6);
		content7 = content6.tagName("li").next();
		System.out.println(content7);
		content8 = content7.tagName("li").next();
		System.out.println(content8);
		content9 = content8.tagName("li").next();
		System.out.println(content9);
		content10 = content9.tagName("li").next();
		System.out.println(content10);
		content11 = content10.tagName("li").next();
		System.out.println(content11 );
		content12 = content11.tagName("li").next();
		System.out.println(content12+ "###끝###");
		
	
		
//		System.out.println(iconStar);
//		System.out.println(iconStar.size());
//		System.out.println(content.nextAll());
//		System.out.println(content.nextAll().select("div.icon_star p"));
		
//		for(int j = 0 ; j < 10 ; j++) {
//			Elements liTest = null;
//			for (int i = 0 ; i < iconStar.size() ; i++) {
//				test = iconStar;
//				if(test.get(i).getElementsByClass("reviewbg star_on").size() ==1) {
//					a = a + 1;
//				}
//			}
//			System.out.println(a + "확인용");
//		}
		
		Elements test1 = doc.select("li:nth-child(1)");
		while(test1.tagName("li").next().size() == 0) {
			
			for (int i = 0 ; i < test1.select("div.icon_star p").size() ; i++) {
				if(test1.get(i).getElementsByClass("reviewbg star_on").size() == 1) {
					a = a + 1;
				}
			}
			System.out.println(a + "확인용");
			test1.tagName("li").next();
			System.out.println(test1 + "확인용2");
		
		}
		
		
		
		
		
//		for(int i = 0; i < 5 ; i++) {
//			Elements iconstar1 = content.select("div.icon_star");
//			System.out.println(iconstar1);
////			System.out.println(iconstar1.get(i).getElementsByClass("icon_star").getClass());
//		}
		
		
		
		
//		for (int pageNo = 0; pageNo < page.size(); pageNo++) {
//			System.out.println(page.get(pageNo));
//		}

//		while(a<1) {
//			
//		}
//		
//		for (int star = 0; star < iconstar.size(); star++) {
//			iconstar.get(star).getElementsByClass("reviewbg star_on");
//			a = star;
//		}
//		System.out.print("[별 " + a + "개] ");
//
//		for (int i = 0; i < content.size(); i++) {
//			System.out.println(content.get(i).text());
//			
//		}
	}
}
