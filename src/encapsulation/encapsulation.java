package encapsulation;
class encapsulation{
    public static void main(String[] args) {
        Car car = new Car("Blue", 2013, false);
        System.out.println(car.getColor());
        
        Phone iPhone = new Phone("iPhone 13 Pro", true, 3);
        System.out.println(iPhone.getModel());
        iPhone.setModel("iPhone 14"); 
        System.out.println(iPhone.model);
    }



    //just setting a method in this class
     public static class Car{
        private String color;
        private int year;
        private boolean brandNew;

        Car(String color, int year, boolean brandNew){
            //this.getColor();
            //this.getYear();
            //this.getBrandNew();

            this.color = color;
            this.year = year;
            this.brandNew = brandNew;
        }

        //get methods
            public String getColor(){
                return color;
            }
            public int getYear(){
                return year;
            }
            public boolean getBrandNew(){
                return brandNew;
            }
        }



        //setting and getting method in this class
        public static class Phone{
            private String model;
            private boolean isNew;
            private int numberOfCameras;

                Phone(String model, boolean isNew, int numberOfCameras){
                    this.setModel(model);
                    this.setModel(model);
                    this.setNumberOfCameras(numberOfCameras);
                }

                //get phone method
                public String getModel(){
                    return model;
                }
                public boolean getIsNew(){
                    return isNew;
                }
                public int getNUmberOfCameras(){
                    return numberOfCameras;
                }

                //set phone method
                public void setModel(String model){
                    this.model = model;

                }
                public void setIsNew(boolean isNew){
                    this.isNew = isNew;
                }
                public void setNumberOfCameras(int numberOfCameras){
                    this.numberOfCameras = numberOfCameras;
                }
        }

        
    }