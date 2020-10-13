import java.util.ArrayList;
import java.util.List;

public class PrefixHirarchy {

    public static void main(String[] args) {
        String[] names = {"jackson","jacques","jack","jackonson", "jacq", "ashwin", "joshi"};
        String[] queryString = {"jack","jac","jacq"};
        int[] results = findCompletePrefix(names,queryString);
        for(int result: results){
                System.out.println(result);
        }
    }

    private static int[] findCompletePrefix(String[] names, String[] queryStrings){
        int[] result = new int[queryStrings.length];
        for(int queryIndex =0; queryIndex<queryStrings.length; queryIndex++){
            String query = queryStrings[queryIndex];
            int subStringCount=0;
            for(String name: names){
                if(name.startsWith(query) && name.length() != query.length()){
                    subStringCount++;
                }
            }
            result[queryIndex] = subStringCount;
        }
        return result;
    }
}
