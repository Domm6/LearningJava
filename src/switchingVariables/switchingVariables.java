package switchingVariables;
class switchingVariables {
    
    public static void main(String[] args) {
        String favorite = "basketball";
        String secondFavorite = "football";
        String temp;

        System.out.println("favorite: " + favorite);
        System.out.println("secondFavorite: " + secondFavorite);

        temp = favorite;
        favorite = secondFavorite;
        secondFavorite = temp;
 
        System.out.println("favorite: " + favorite);
        System.out.println("secondFavorite: " + secondFavorite);
        
        

    }
}
