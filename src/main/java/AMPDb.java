import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class AMPDb {

	private Gson gson;
	private JsonParser parser;
	private Map<Set<String>, Double> map;

	public AMPDb(String jsonfile) throws FileNotFoundException {

		gson = new Gson();
		parser = new JsonParser();
		map = new HashMap<Set<String>, Double>();

		Scanner scan = new Scanner(new File(jsonfile));

		while (scan.hasNext()) {
			JsonObject obj = (JsonObject) parser.parse(scan.nextLine());
			AMPRelation rel = gson.fromJson(obj, AMPRelation.class);
			rel.createSet();
			
			if (!this.map.keySet().contains(rel.getSeqSet())) {
				map.put(rel.getSeqSet(), rel.getSim());
			}
		}
	}
	
	public Map<Set<String>, Double> getMap(){
		return map;
	}
	
}
