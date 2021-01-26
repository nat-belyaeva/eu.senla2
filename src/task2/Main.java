package task2;
public class Main {
    public static void main(String[] args) {
        Rainbow myRainbow = new Rainbow();
        myRainbow.numberOfCOlour = 8;
        switch (myRainbow.numberOfCOlour) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue");
                break;
            case 6:
                System.out.println("Purple");
                break;
            case 7:
                System.out.println("Pink");
                break;
            default:
                System.out.println("нет такого цвета");
        }
        if(myRainbow.mixColour > 11 ||myRainbow.mixColour <76 ) {
            myRainbow.mixColour = 456;
            switch (myRainbow.mixColour) {
                case 12 :
                    System.out.println("red and orange");
                break;
                case 13 :
                    System.out.println("orange and yellow");
                    break;
                default:
                    System.out.println("Нет такого цвета");

            }
        }
    }


}
