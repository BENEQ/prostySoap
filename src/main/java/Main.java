import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        URL adresURL = null;
        try {
            adresURL = new URL("http://www.dneonline.com/calculator.asmx?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        CalculatorSoap servis = new Calculator(adresURL).getCalculatorSoap();
        int wynik = servis.add(10, 20);
        System.out.println(wynik);
    }
}
