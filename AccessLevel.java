import java.util.ArrayList;

public class AccessLevel {
    public String canAccess(int[] rights, int minPermission){
        ArrayList<String> list = new ArrayList<String>();
        for(int right : rights){
            if(right >= minPermission){
                list.add("A");
            }
            else{
                list.add("D");
            }
        }
        String listString = String.join("", list);
        return listString;
    }
}