class game{

    int stake = 100;
    int rnnum;
    int min = 0;
    int max = 0;

    public void Game(int min, int max){
        int range = (max - min) + 1;     
        rnnum =  (int)(Math.random() * range) + min;
     }
     void ingame(){
        Game(0, 1);
        if(rnnum == 0){
            System.out.println("You Lose");
            stake--;
            System.out.println("Remaning balance : " + stake);
        }
        else  if (rnnum == 1){
            System.out.println("You won");
            stake++;
            System.out.println("Remaning balance : " + stake);
        }
    }
}

public class Gambling_UC1{
    public static void main(String[] args) {
        game obj = new game();
        obj.ingame();
    }
}