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
public class AnimalZone {
	private String zone;
	List<Map<String, String>> list = new ArrayList<Map<String, String>>();

	
	AnimalZone(){
		
	}
	/**
	 * creates list of animal zones in zoo
	 * 
	 * @return list
	 */
	public List<Map<String, String>> zoneMap() {
        Map<String, String> animalZoneMap1 = new HashMap<String, String>();
        animalZoneMap1.put("name", "General");
        
        Map<String, String> animalZoneMap2 = new HashMap<String, String>();
        animalZoneMap2.put("name", "Reptile house");
        
        Map<String, String> animalZoneMap3 = new HashMap<String, String>();
        animalZoneMap3.put("name", "Butterfly");
        
        Map<String, String> animalZoneMap4 = new HashMap<String, String>();
        animalZoneMap4.put("name", "Insect");
        
        Map<String, String> animalZoneMap5 = new HashMap<String, String>();
        animalZoneMap5.put("name", "Petting");

        list.add(animalZoneMap1);
        list.add(animalZoneMap2);
        list.add(animalZoneMap3);
        list.add(animalZoneMap4);
        list.add(animalZoneMap5);

        return list;
   }
	
	
	public String setZoneName(String animalZoneName){
		for(Map<String, String> list : zoneMap()) {
			if(animalZoneName.equals(list.get("name")) ) {
				this.zone = list.get("name");
				return list.get("name");
			} else {
				return "Zone not found";
			}
		}
		return zone;
	}

}
