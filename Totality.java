public class Totality {
    public int sum(int[] a, String stype) {
        int general_sum = 0;
        for(int i = 0; i < a.length; i++) {
            if(stype.equals("odd")){
                if(i%2!=0){
                    general_sum += a[i];
                }
            } else if (stype.equals("even")){
                if(i%2==0){
                    general_sum += a[i];
                }
            } else if (stype.equals("all")){
                general_sum += a[i];
            }
        }
        return general_sum;
    }
}