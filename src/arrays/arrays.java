package arrays;
class arrays {
    public static void main(String[] args) {

        System.out.println("Here is a list of your brothers: ");
        
        String[] brothers = {"Damien", "Devan",};

        System.out.println(brothers[1]);

        for(int i = 0; i < brothers.length; i++){
            System.out.println(brothers[i]);

        }

        System.out.println("Here is a list of some games: ");

        String[] games = new String[4];

        games[0] = "Fortntie";
        games[1] = "Apex";
        games[2] = "Call of Duty";
        games[3] = "Fall Guys";

        for(int j = 0; j < games.length; j++){
            System.out.println(games[j]);
        }
        

    }
}
