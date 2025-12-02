
public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
         Turtle turtle = new Turtle(0,200);
         for (int i = 0; i<6; i++) {
         turtle.forward(50);
         turtle.right(60);
         
         }

        // Task 2: Draw a regular shape many times
         turtle.up();
         turtle.right(90);
         turtle.forward(150);
         turtle.down();
         for (int n = 0; n<18; n++){
            for (int i = 0; i<6; i++) {
               turtle.forward(8);
               turtle.right(60);
         }
            turtle.up();
            turtle.forward(20);
            turtle.right(20);
            turtle.down();
         }
      
        // Task 3: How many times does Turtle turn!
         int counter = 0;
         turtle.up();
         
         turtle.forward(150);
         turtle.down();
         for (int n = 0; n<18; n++){
            for (int i = 0; i<6; i++) {
               turtle.forward(8);
               turtle.right(60);
               counter++;
         }
            turtle.up();
            turtle.forward(20);
            turtle.right(20);
            turtle.down();
         }
         System.out.print("turtle has turned " +counter+ " times!");

        // Extension 1: Triply nested loop
        turtle.up();
            
            turtle.left(90);
            turtle.forward(100);
            turtle.left(120);
            turtle.forward(50);
            turtle.down();
         for (int k = 0; k<6; k++) {
            for (int n = 0; n<9; n++){
               for (int i = 0; i<5; i++) {
                  turtle.forward(8);
                  turtle.right(72);
                  counter++;
            }
               turtle.up();
               turtle.forward(20);
               turtle.right(40);
               turtle.down();
            }
            turtle.up();
            turtle.forward(100);
            turtle.right(60);
            turtle.down();
         }
        // Extension 2:
        turtle.up();
            
            turtle.left(90);
            turtle.forward(100);
            turtle.left(120);
            turtle.forward(50);
            turtle.down();
            for (int n = 0; n<9; n++){
               for (int i = 0; i<8; i++) {
                  turtle.forward(8);
                  turtle.right(45);
                  counter++;
            }
               turtle.up();
               turtle.forward(10*n);
               turtle.right(40);
               turtle.down();
            }
            
         

    }
}
