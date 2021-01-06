import com.lti.stock.Broker;
import com.lti.stock.Exchange;
import com.lti.stock.Holder;
import com.lti.stock.Stock;

public class TestStock {

	public static void main(String[] args) {
		Stock s = new Stock();
		
		Holder h = new Stock();
		h.viewQuote();
		
		Broker b = s;
		b.getQuote();
		b.viewQuote();
		
		Exchange x = s;
		x.setQuote();
		x.getQuote();
		x.viewQuote();
	}
}
