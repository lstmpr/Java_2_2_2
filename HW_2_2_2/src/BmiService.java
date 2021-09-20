public class BmiService {
    // height в см
    public float calculate(float height, int weight){
        float imt = weight/((height*height)/10000);
        return imt;
    }
}
