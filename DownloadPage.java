package finalpro;
import java.io.IOException;  
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;  

public class DownloadPage {
	private String inISO ="";
	private String outISO = "";
	private String amount = "";
	private String convertedAmt ="";

	public DownloadPage(String inISO, String outISO, String amount) {
		this.inISO = inISO;
		this.outISO = outISO;
		this.amount = amount;
	}
	public void scrape() throws IOException {
		 	
		String url = "https://www.x-rates.com/calculator/?from="+inISO+"&to="+outISO+"&amount="+amount;
	
	    Document doc = Jsoup.connect(url).get();   
		      
		Element description = doc.select("div.ccOutputBx > span.ccOutputRslt").first();
		String linkText = description.text();
		   
		this.convertedAmt = linkText; 
	}
	
	public String getConvertedAmt() {
		return this.convertedAmt;
		
	}
	//public static void main(String args[]) throws IOException {
	//	DownloadPage calculation = new DownloadPage("EUR","CAD","375");
	//	calculation.scrape();
	//	System.out.print(calculation.getConvertedAmt());
	//}
}
