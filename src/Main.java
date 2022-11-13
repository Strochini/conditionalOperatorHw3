public class Main {
    public static void main(String[] args) {

        int educationAge = 19;
        if (educationAge >= 2 && educationAge <= 6) {
            System.out.println("Если возраст человека равен " + educationAge + ", то ему нужно ходить в детский сад");
        } else {
            if (educationAge >= 7 && educationAge <= 18) {
                System.out.println("Если возраст человека равен " + educationAge + ", то ему нужно ходить в школу");
            } else {
                if (educationAge > 18 && educationAge <= 24) {
                    System.out.println("Если возраст человека равен " + educationAge + ", то ему нужно ходить в университет");
                } else {
                    System.out.println("Если возраст человека равен " + educationAge + ", то ему нужно ходить на работу");
                }
            }
        }
        int attractiionAgeLimit = 17;
        if (attractiionAgeLimit < 5) {
            System.out.println("Кататься запрещено!");
        } else {
            if (attractiionAgeLimit < 14) {
                System.out.println("Разрешено кататься толко в сопровождении взрослых!");

            } else {
                System.out.println("Кататься разрешено");
            }
        }


        int one = 45;
        int two = 117;
        int three = 37;

        if (one > two && one > three) {
            System.out.println("One");
        } else {
            if (two > one && two > three) {
                System.out.println("Two");
            } else {
                System.out.println("Three");
            }
        }
    }
}