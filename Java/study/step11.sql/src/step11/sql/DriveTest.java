package step11.sql;

import java.io.IOException;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import javax.swing.text.Document;

import org.jsoup.Jsoup;

public class DriveTest {

	public static void main(String[] args) {
		
		public class Wikipedia {
		    public static void main(String[] args) throws IOException {
		        Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
		        log(doc.title());

		        Elements newsHeadlines = doc.select("#mp-itn b a");
		        for (Element headline : newsHeadlines) {
		            log("%s\n\t%s", headline.attr("title"), headline.absUrl("href"));
		        }
		    }

		    private static void log(String msg, String... vals) {
		        System.out.println(String.format(msg, vals));
		    }
		}

	}

}
