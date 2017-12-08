/**
 * 
 */
package zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Martins Buhanovskis
 *
 */
public class HumanStatus {
	
	private String humanStatus;
	List<Map<String, String>> list = new ArrayList<Map<String, String>>();
	HumanStatus human;
	
	HumanStatus(){
		
	}
	/**
	 * Human status list
	 * @return list
	 */
	public List<Map<String, String>> humanStatusList() {
        Map<String, String> statusMap1 = new HashMap<String, String>();
        statusMap1.put("name", "Adults");
        
        Map<String, String> statusMap2 = new HashMap<String, String>();
        statusMap2.put("name", "School age children");
        
        Map<String, String> statusMap3 = new HashMap<String, String>();
        statusMap3.put("name", "Seniors");
        
        Map<String, String> statusMap4 = new HashMap<String, String>();
        statusMap4.put("name", "Students");
        
        Map<String, String> statusMap5 = new HashMap<String, String>();
        statusMap5.put("name", "Persons with a disability");

        list.add(statusMap1);
        list.add(statusMap2);
        list.add(statusMap3);
        list.add(statusMap4);
        list.add(statusMap5);

        return list;
   }

	public String setHumanStatus(String humanStatus){
		for(Map<String, String> list : humanStatusList()) {
			if(humanStatus.equals(list.get("name")) ) {
				this.humanStatus = list.get("name");
				return list.get("name");
			} else {
				return "Status not found";
			}
		}
		return this.humanStatus;
	}
}
