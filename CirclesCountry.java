public class CirclesCountry{
    public boolean isInside(int x, int y, int cx, int cy, int r){
        double dist = (x-cx)*(x-cx) + (y-cy)*(y-cy);
        double radSquared = r*r;
        return dist < radSquared;
    }

    public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) {
        int counter = 0;
        for(int i = 0; i < x.length; i++){
            if(isInside(x1, y1, x[i], y[i], r[i]) && !isInside(x2, y2, x[i], y[i], r[i])){
                counter++;
            }
            if(!isInside(x1, y1, x[i], y[i], r[i]) && isInside(x2, y2, x[i], y[i], r[i])){
                counter++;
            }
        }

        return counter;  
    }
}
