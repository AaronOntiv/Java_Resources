package Chapter8;

public class EnumTest {
    public enum TrafficLight{
        RED(55),
        GREEN(55),
        YELLOW(10);

        private final int duration;

        TrafficLight(int duration){
            this.duration=duration;
        }

        public int getDuration() {
            return duration;
        }
    }


    public static void main(String[]args){
        for(TrafficLight light: TrafficLight.values()){
            System.out.printf("%s %d\n",light,light.getDuration());
        }

    }

}
