package arrayOfObjects;
class arrayOfObjects {
    public static void main(String[] args) {
        gradeLevel first = new gradeLevel("Kindergarden", 20, false, 2);
        gradeLevel second = new gradeLevel("First grade", 25, true, 3);
        gradeLevel third = new gradeLevel("Second grade", 15, false, 1);
        gradeLevel fourth = new gradeLevel("Third grade", 27, true, 2);

        gradeLevel[] graduation = {first, second, third, fourth};

        System.out.println(graduation[0].classSize);
        System.out.println(graduation[3].mature);

        for(gradeLevel i : graduation){
            System.out.println(i);
        }

        for(int i = 0; i < graduation.length; i++){
            System.out.println(graduation[i]);
        }

    }
}
    class gradeLevel{
        String grade;
        boolean mature;
        int classSize;
        int amountOfTeachers;

        gradeLevel(String grade, int classSize, boolean mature, int amountOfTeachers){
            this.amountOfTeachers = amountOfTeachers;
            this.classSize = classSize;
            this.grade = grade;
            this.mature = mature;

        }
    }
