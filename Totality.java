public class Totality {
    public int sum(int[] a, String stype) {
        int general_sum = 0;
        if(stype.equals("odd")){
            for (int num: a){
                if (num%2 == 0){
                    general_sum += num;
                }
            }
        } else if (stype.equals("even")){
            for (int num: a){
                if (num%2 != 0){
                    general_sum += num;
                }
            }
        } else if (stype.equals("all")){
            for (int num: a){
                general_sum += num;
            }
        }
        return general_sum;
    }
}