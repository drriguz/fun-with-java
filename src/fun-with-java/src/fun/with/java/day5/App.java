package fun.with.java.day5;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
	public File[] getFiles(String dir){
		File folder = new File(dir);
		return folder.listFiles();
	}

	public static void main(String[] args){
		System.out.println("Hello!");

		App app = new App();
		List<Item> itemList = new ArrayList<Item>();
		File [] files = app.getFiles("d:/data");

		for(File f:files){
			System.out.println("Parsing file:" + f.getName());
			ExcelParser parser = new ExcelParser(f.getAbsolutePath(), new SheetParser());

			List<Item> items = parser.parse();
			System.out.println(items.size());
			itemList.addAll(items);
		}
		
		ItemWalker walker = new ItemWalker(itemList);

		Set<String> projects = walker.getProjects();
//		for(String s:projects)
//			System.out.println(s);
		System.out.println("\n----------*****----------\n");
		Map<String, Float> dict = walker.getHours();
		for(String k:dict.keySet()){
			System.out.println(k + ":\t" + dict.get(k));
		}
	}
}
