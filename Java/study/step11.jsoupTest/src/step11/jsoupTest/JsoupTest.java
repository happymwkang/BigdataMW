package step11.jsoupTest;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
	
//	step02 - 한글 데이터 확인
	public static void main(String[] args) throws IOException {
        Document doc=null;
        try {
        	doc = Jsoup.connect("https://www.youtube.com/").get();
        } catch(IOException e) {
        	e.printStackTrace();
        }

        
//        System.out.println(doc.title());
        Elements newsHeadlines = doc.select(".yt-lockup-title > a[title]");
//        System.out.println(newsHeadlines.get(0).ownText());
//        System.out.println(newsHeadlines);
//        System.out.println(newsHeadlines.get(0));
//        System.out.println(newsHeadlines.get(0).childNodeSize());
//        System.out.println(newsHeadlines.get(0).hasText());
        
             
        for (Element a : newsHeadlines) {
            System.out.println(a.attr("title"));
//        }
        }
	}
}
			//#main > div.w3-example > h3
//	#dismissable
//	#main > h2:nth-child(6)
	
//				//step01메뉴얼
//			    public static void main(String[] args) throws IOException {
//		        Document doc=null;
//		        try {
//		        	doc = Jsoup.connect("http://ko.wikipedia.org/").get();
//		        } catch(IOException e) {
//		        	e.printStackTrace();
//		        }
//		        
//		        System.out.println(doc.title());
//		        Elements newsHeadlines = doc.select("#mp-itn b a");
//		        for (Element headline : newsHeadlines) {
//		            System.out.println(headline.attr("title")+ headline.absUrl("href"));
//		        }
//		}


//#mp_contentsL > p:nth-child(5)