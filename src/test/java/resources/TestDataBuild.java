package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlcae;
import pojo.Location;

public class TestDataBuild {
	
	public AddPlcae AddPlacePayload(String name, String language, String address) {
		AddPlcae p = new AddPlcae();
		p.setAccuracy(50);
		p.setAddress(address);
		p.setLanguage(language);
		p.setName("name");
		p.setPhone_number("\"(+91) 983 893 3937");

		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);

		List<String> list = new ArrayList<String>();
		list.add("shoe park");
		list.add("shop");
		p.setTypes(list);
		
		return p;
	}
}
