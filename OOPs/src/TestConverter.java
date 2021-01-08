import com.lti.cc.AED;
import com.lti.cc.CurrencyConverter;
import com.lti.cc.INR;
import com.lti.cc.USD;
import com.lti.cc.ZAR;

public class TestConverter {

	public static void main(String[] args) {
		INR inr = new INR();
		USD usd = new USD();
		ZAR zar = new ZAR();
		AED aed = new AED();
		
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.println(cc.convert(usd, inr, 100));
		System.out.println(cc.convert(usd, zar, 100));
		System.out.println(cc.convert(zar, inr, 100));
		System.out.println(cc.convert(inr, zar, 1000));
		System.out.println(cc.convert(usd, aed, 100));
		System.out.println(cc.convert(aed, zar, -100));
	}
}
