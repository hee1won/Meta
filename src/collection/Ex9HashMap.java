package collection;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Ex9HashMap {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		Properties properties = getAdminInfo();
		String adminId = properties.getProperty("username");
		String adminPw = properties.getProperty("password");
		map.put(adminId, adminPw);
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			String id = scanner.next();
			System.out.println("비밀번호 : ");
			String pw = scanner.next();
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호를 확인해주세요.");
				}
			} else {
				System.out.println("아이디를 다시 입력해주세요.");
			}
		}
		
		/*
		Map<String, String> map = new HashMap<>();
		map.put("spring", "1");
		map.put("summer", "2");
		map.put("fall", "3");
		map.put("winter", "4");
		String value = map.get("spring");
		System.out.println(value);
		Set<String> set = map.keySet();
		System.out.println(set);
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println("key : " + key + "\t value : " + map.get(key));
		}
		*/
	}
	public static Properties getAdminInfo() {
		Properties properties = null;
		try {
			properties = new Properties();
			String path = Ex9HashMap.class.getResource("database.properties").getPath();
			path = URLDecoder.decode(path, "UTF-8");
			properties.load(new FileReader(path));
			/*
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			System.out.println(driver);
			System.out.println(url);
			System.out.println(username);
			System.out.println(password);
			*/
		}catch(Exception e) {
			e.printStackTrace();
		}
		return properties;
	}
}
