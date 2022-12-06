package problems.dataStructure;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void size(Map map) {
		try {
			System.out.println("Index Size: " + map.size());
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(map);
			oos.close();
			System.out.println("Data Size: " + baos.size());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<>();

//		myMap.put(1, "Saniyat");
//		myMap.put(2, "Saniyat");

		System.out.println(myMap);
		size(myMap);
	}
}
