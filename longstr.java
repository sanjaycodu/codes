import java.util.ArrayList;

public class longstr{
    public static void main(String[] args) {
        String str="soon";
        System.out.println(ans(str));
        
    }
    static int ans(String a){
        int start=0;
        int end=0;
        int maxlen=0;
        System.out.println(a);
        ArrayList<Character> list=new ArrayList<>();
        while(end<a.length()){
            
            char b=a.charAt(end);
            if(!list.contains(a.charAt(end))){
                list.add(a.charAt(end));
                end++;
                maxlen=Math.max(maxlen,list.size());
            }else{
                System.out.println(a.charAt(start));
                list.remove(Character.valueOf(a.charAt(start)));
                start++;
                System.out.println(a.charAt(start));
              //  list.add(a.charAt(end)+"");
              //  end++;
            }
            
            
        }
        return maxlen;
    }
}
