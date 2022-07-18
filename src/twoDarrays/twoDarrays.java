package twoDarrays;
class twoDarrays {
    public static void main(String[] args) {
        
        System.out.println("Here are a list of comapnies I would love to work at in the future: ");

        String[][] companies = { {"Google", "Apple", "Microsoft"}, 
                                 {"LinkedIn", "Meta", "Amazon", "Tesla"}
                               };

        for(int i = 0; i < companies.length; i++){
                        System.out.println();
            for(int j = 0; j < companies[i].length; j++){
                System.out.print(companies[i][j] + " ");
            }
        }
        System.out.println("Here are all of my family memebers (including our pets).");

        String[][] family = { {"Damien", "Devan"},
                              {"Louis", "Patricia"},
                              {"Zo", "Apollo"}
                            };
        for(int i = 0; i < family.length; i++){
            System.out.println();
            for(int j = 0; j < family[i].length; j++){
                System.out.print(family[i][j] + " ");
            }
        }

    }

}
