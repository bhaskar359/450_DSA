import java.util.HashMap;
class Duplicates {
    HashMap<Character,Integer> count(String str){
        
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            }
            else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        map.entrySet().removeIf(entry -> (entry.getValue() <= 1));   
        
        return map;
    }    
}

class Test{
    public static void main(String[] args) {
        System.out.println(new Duplicates().count("geeksforgeeks"));
    }
}