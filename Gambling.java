// Welcome to the World of Gambling...

class game{

    int stake = 100;
    int rnnum;
    int counter;

    public void Game(int min, int max){
        int range = (max - min) + 1;     
        rnnum =  (int)(Math.random() * range) + min;
     }

    void ingame(){
        for (int i = 0; stake != 0 || stake <= 101 || stake != 50; i++ ){
            Game(0, 1);
            if(rnnum == 0){
                System.out.println("You Lose");
                stake--;
                counter++;
            }
            else  if (rnnum == 1){
                System.out.println("You won");
                stake++;
                counter++;
            }
        }System.out.println("");
        System.out.println("Total times game played : " + counter);
        System.out.println("Your stake left : " + stake);
    }
}

public class Gambling{
    public static void main(String[] args) {
        game obj = new game();
        obj.ingame();
    }
}