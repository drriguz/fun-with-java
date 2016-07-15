package fun.with.java.day5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ItemWalker {
	protected List<Item> items;

	public ItemWalker(List<Item> items){
		this.items = items;
	}

	public Set<String> getProjects(){
		Set<String> projects = new HashSet<String>();
		for(Item item :this.items){
			projects.add(item.getProjectName());
		}
		return projects;
	}

	public Map<String, Float> getHours(){
		Map<String, Float> dict = new HashMap<String, Float>();
		for(Item item :this.items){
			Float sum = dict.get(item.getProjectName());
			if(sum == null){
				sum = 0.0f;
			}
			sum += item.getHour();
			dict.put(item.getProjectName(), sum);
		}
		return dict;
	}
}
