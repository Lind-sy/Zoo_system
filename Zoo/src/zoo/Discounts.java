/**
 * 
 */
package zoo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Martins Buhanovskis
 *
 */
public class Discounts {
	private Map<Integer,Double> map = new LinkedHashMap<Integer,Double>();
	DecimalFormat dec = new DecimalFormat("#0.00");
	
	
	/*
	 * discount charges
	 */
	public Discounts() {
		/* Populate */
		map.put(0,0.00);
		map.put(10,0.10);
		map.put(15,0.15);
		map.put(20,0.20);
	}
	public List<Integer> indexes = new ArrayList<Integer>(map.keySet());
	public List<Double> valuesOfIndex = new ArrayList<Double>(map.values());
	
	
	/*
	 * gets discount % by map Index
	 */
	
	public Object getElementByIndex(int searchIndex){	
	    return map.get( (map.keySet().toArray())[ searchIndex ] );
	}
	public Object getDiscount(int ind) {
		return getElementByIndex(ind);
	}
	
	/*
	 * from string input gets corresponding discount according to map Index
	 */
	public double fromNameToValue(String name) {
		if (name == "0" ) {
			return (double) getDiscount(0);
		} else if (name == "10%") {
			return (double) getDiscount(1);
		} else if (name == "15%") {
			return (double) getDiscount(2);
		} else if (name == "20%") {
			return (double) getDiscount(3);
		}
		return 0;
	}
	
	
	/*
	public double getDicountByName(int search) {
		if(getDiscount(search).equals(0)) {
			return 0.0000000001;
		} else if(getDiscount(search).equals(1)) {
			return (Double) getDiscount(search);
		} else if(getDiscount(search).equals(2)) {
			return (Double) getDiscount(search);
		} else if(getDiscount(search).equals(3)) {
			return (Double) getDiscount(search);
		}
		
		return 0; 
	}
	*/
}
