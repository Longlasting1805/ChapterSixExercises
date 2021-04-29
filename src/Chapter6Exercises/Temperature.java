package Chapter6Exercises;

public class Temperature {
    private double temp;
    private String scale;

    public Temperature( double temp){
            this.temp = temp;
        }

        public String toString () {
            return "your temp is " + this.temp;
        }
        public double getTemp () {
            return this.temp;
        }
        public String getScale(String userScale) {
            this.scale = scale;
            return this.scale;
        }
        public double conversion () {
            double temp = 0;
            if (this.scale == "fahrenheit") {
                temp = (this.temp * (double) (5 / 9));
            } else if (this.scale == "celsius") {
                temp = (this.temp -32) * ((double) 5/9);
            }
            return temp;
        }
        public boolean aboveBoiling ( double temp){
            if (this.scale == "fahrenheit") {
                return temp >= 212;
            }
            return true;

        }


}
