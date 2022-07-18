package copyObjects;
class copyObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Lambo", 22, false, 15.5);
        Car car2 = new Car("Ferrari", 23, true, 10.5);

        //printing both cars details and location
            System.out.println(car1); 
            System.out.println(car2); 
            System.out.println();      
            System.out.println(car1.getModel());
            System.out.println(car1.getYear());
            System.out.println(car1.getIsNew());
            System.out.println(car1.getMpg() + "\n");
            System.out.println(car2.getModel());
            System.out.println(car2.getYear());
            System.out.println(car2.getIsNew());
            System.out.println(car2.getMpg() + "\n");

            //copying first car to second car
            car1.copy(car2);

            //printing first car now that is coppied to same as second
            //memory locations the same so know there are two different cars with exact same details
            System.out.println(car1); 
            System.out.println(car2); 
            System.out.println();      
            System.out.println(car1.getModel());
            System.out.println(car1.getYear());
            System.out.println(car1.getIsNew());


    }
}
    class Car{
        private String model;
        private int year;
        private boolean isNew;
        private double mpg;

            Car(String model, int year, boolean isNew, double mpg){
                this.setModel(model);
                this.setYear(year);
                this.setIsNew(isNew);
                this.setMpg(mpg);
            }

            //copy method
            void copy(Car x){
                this.setModel(x.getModel());
                this.setYear(x.getYear());
                this.setIsNew(x.getIsNew());
                this.setMpg(x.getMpg());
            }

            // get methods
                public void  setModel(String model){
                    this.model = model;
                }
                public void setYear(int year){
                    this.year = year;
                }
                public void setIsNew(boolean isNew){
                    this.isNew = isNew;
                }
                public void setMpg(double mpg){
                    this.mpg = mpg;
                }

            // get methods
            public String getModel(){
                return model;
            } 
            public int getYear(){
                return year;  
            } 
            public boolean getIsNew(){
                return isNew;
            } 
            public double getMpg(){
                return mpg;
            } 
    }
