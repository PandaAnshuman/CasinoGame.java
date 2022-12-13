
import java.util.Scanner;
public class BlackJack {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("\n Welcome To Java Casino !!!");
        System.out.println("Do You Have A Knack For Black jack ?");
        System.out.println("We Shall See ......");
        System.out.println("... Ready ? Press Anything To Begin ");
        sc.nextLine();
       
        int card1 = randomCard();
        int card2 = randomCard();

        System.out.println("\n You Get a \n" + cardString(card1) + "\n and a \n" + cardString(card2));
        int total = Math.min(card1, 10) + Math.min(card2, 10);
        
        System.out.println("Your Total Is " + total);


        int dealerCard1 = randomCard();
        int dealerCard2 = randomCard();
        System.out.println("\n The Dealer Shows \n " + cardString(dealerCard1)+ "\n and a card facing Down \n " + facedown());

        int Dtotal = Math.min(dealerCard1 , 10)+ Math.min(dealerCard2 , 10);
        System.out.println("\n The Dealers total Is Hidden..");

        while(true){
            String option = StayorHit();
            if(option.equals("stay")){
                break;
            }
            int newCard = randomCard();
            total += Math.min(newCard , 10);
            System.out.println("\n You Get a \n " + cardString(newCard));
            System.out.println("Your Total is " + total);
        }
        if(total>21){
            System.out.println("Bust! Player Loses");
            System.exit(0);
        }
        sc.close();
        System.out.println("Dealers Turn :");
        System.out.println("\n The Dealers Card are \n" + cardString(dealerCard1) + "\n and \n" + cardString(dealerCard2));
        while(Dtotal >17){
            int newCard= randomCard();
            Dtotal+= Math.min(newCard, 10);
            System.out.println("\n Dealer get a \n " + cardString(newCard));
            System.out.println("Dealers total is  " + Dtotal );

        }
        if(Dtotal>21){
            System.out.println("Bust! The Dealer loses.");
            System.exit(0);
            
        }

        if(total>Dtotal){
            System.out.println("Player Wins !!");
        }else{
            System.out.println("Dealer Wins !!");
        }
    }





    

    public static int randomCard(){
        double random = Math.random()*13;
        random+=1;
        return (int)random;
    }

    public static String cardString(int cardNumber){
        switch (cardNumber){
            case 1 :
            return "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
   
            case 2 :
            return
                    "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n"; 
            case 3 :
            return 
                   
                  "   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";

                   
                   
                   
                   
            case 4 :
            return 
            "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";

            case 5 :
            return
                    "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

            case 6 :
            return 
            "   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";

            case 7 :
            return
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
            case 8 :
            return
                    "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            case 9 :
            return 
                    "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
            case 10 :
            return 
            "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";
    
            case 11 :
            return
            
            "   _____\n" +
            "  |J  ww|\n"+ 
            "  | o {)|\n"+ 
            "  |o o% |\n"+ 
            "  | | % |\n"+ 
            "  |__%%[|\n";
    
            case 12 :
            return
            
            "   _____\n" +
            "  |Q  ww|\n"+ 
            "  | o {(|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%O|\n";
            case 13 :
            return
            "   _____\n" +
            "  |K  WW|\n"+ 
            "  | o {)|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%>|\n";




        }
        return null;

        
    }
    public static String facedown(){
        return
            "   _____\n" +
            "  |     |\n"+ 
            "  |  J  |\n"+ 
            "  | JJJ |\n"+ 
            "  |  J  |\n"+ 
            "  |_____|\n";
    }
    public static String StayorHit(){
        System.out.println("Would You like to Stay Or Hit ???");
        String response = sc.nextLine();
        while(!(response.equals("hit") || response.equals("stay")));{
            System.out.println("Please Write hit or stay");
            response =sc.nextLine();

        }
        return response;

        
    }



}

