package mingfu;

import java.util.HashMap;

public class HelloWorld {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
        }
        map.put("name","james");
        map.put("age","14");
        map.put("major","basketball");
        map.remove("major");
        System.out.println(map);
    }


}
