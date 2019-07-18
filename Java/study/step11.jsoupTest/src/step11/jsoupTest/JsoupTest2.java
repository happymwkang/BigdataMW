package step11.jsoupTest;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest2 {
	
//	step02 - 한글 데이터 확인
	public static void main(String[] args) throws IOException {
	      Document doc = Jsoup.connect("https://www.youtube.com/").get();
	      Elements youtubeTitles = doc.select("h3 a");
	      Elements youtubeChannels = doc.select("div:nth-child(2) > a");
//	      System.out.println(youtubeTitles.text());
//	      for (Element title : youtubeTitles) {
//	         System.out.println(title.text());
//	      }
//	      for (Element channel : youtubeChannels) {
//	         System.out.println(channel.text());
//	      }
	      for (int i = 0; i < youtubeTitles.size(); i++) {
	         System.out.printf("[%s]\t%s\n", youtubeChannels.get(i + 4).text(), youtubeTitles.get(i).text());
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