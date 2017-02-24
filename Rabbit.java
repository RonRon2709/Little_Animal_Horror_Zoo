public class Rabbit {
    private String name = "Rabbit";

    private int y = 10;
    private int x = 1;



    public void moveRight() {
        if(this.x <= 9 ) {
            x = x+1;
            y = y-0;
            System.out.println(printLocation());
        }
         else {
            System.out.println("invalid move");
        }
    }
    public void moveLeft(){
        if(this.x >= 2 ) {
            x = x-1;
            y = y-0;
            System.out.println(printLocation());
        }
         else {
            System.out.println("invalid move");
        }
        
        }
    public void moveUp(){
            if(this.y <= 9 ) {
            x = x-0;
            y = y+1;
            System.out.println(printLocation());
        }
         else {
            System.out.println("invalid move");
        }

    }
    public void moveDown(){
            if(this.y >= 2 ) {
            x = x-0;
            y = y-1;
            System.out.println(printLocation());
        }
         else {
            System.out.println("invalid move");
        }

    }
    public String getLocation(){
        return x + "," + y;

    }
    public String printLocation(){
        return ("I am the nice "+ name + " , I am standig on square " + getLocation());

    }
    public void askForMercy(){
        System.out.println("Please dont kill me evil snake");
    
    }



}