package file;
import java.io.File;
class file {
    public static void main(String[] args) {
        File file = new File("/Users/dom/Files/VSCode /Java/LearningJava/GitHub/src");
        
        if(file.exists()){
            System.out.println("This file exists!");
        } else {
            System.out.println("This file does not exist. ");
        }

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParentFile());
        System.out.println(file.getName());
    }   
}
