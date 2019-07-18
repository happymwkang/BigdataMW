package step11.jsoupTest;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest3 {
	
				//step01¸Þ´º¾ó
			    public static void main(String[] args) throws IOException {
		        Document doc=null;
		        try {
		        	doc = Jsoup.connect("http://www.fashionplus.co.kr/mall/goods/goods.asp?goods_id=104469458").get();
		        } catch(IOException e) {
		        	e.printStackTrace();
		        }
		        
		        Elements newsHeadlines = doc.select("#div .contents [p]");
		        for (Element headline : newsHeadlines) {
		            System.out.println(headline.text());
		        }
		}
	}

//#mp_contentsL > p:nth-child(5)