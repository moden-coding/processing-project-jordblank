import processing.core.*;

public class App extends PApplet {
    PImage image;
    float x;
    float y;
    boolean visible;
    float count = 0;
    int scene = 0;
    int distance = 0;
    float speed = 1;
    int lives = 3;

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        size(600, 600);

    }

    public void setup() {
        background(192, 178, 207);
        image = loadImage("heifer.png");
        image.resize(140, 100);
        newHeifer();
        textSize(25);

    }

    public void draw() {
       
      
        if (scene == 0) {
            showStart();
            
        }else if(scene == 1){
          gameBoard();
        }else if(scene == 2){
            System.out.println("game over");
            text("Game Over!", 500, 520);
            showEnd();
        }
        
    }

    public void gameBoard(){
        background(192, 178, 207);
        stroke(108, 89, 128);
        strokeWeight(1);
        rect(100, 100, 400, 400);
        fill(159, 138, 181);
        line(200, 100, 200, 500);
        line(300, 100, 300, 500);
        line(400, 100, 400, 500);
        line(100, 200, 500, 200);
        line(100, 300, 500, 300);
        line(100, 400, 500, 400);
        image(image, x, y, 93, 80);
        textSize(30);
        text("Score: " + count, 100, 530);
        text("Lives: " + lives, 410, 530);
       
    }

    public void showStart() {
        background(192, 178, 207);
        textSize(50);
        fill(108, 89, 128);
        text("Whack-A-Heifer", 145, 270);
        textSize(30);
        fill(159, 138, 181);
        rect(200, 300, 210, 50);
        fill(108, 89, 128);
        textSize(20);
        text("Click anywhere to start!", 208, 332);
        text("Instructions:", 450, 30);
        textSize(15);
        text("1. Hit the heifer as it appears", 410, 50);
        text("2. The heifer dissapears faster", 410, 75);
        text("as your score increases", 410, 90);
        text("3. You have three lives", 410, 115);
        line(400, 0, 400, 125);
        line(400, 125, 600, 125);

    }

    public void showEnd(){
    background(192, 178, 207);
    fill(108, 89, 128);
    textSize(50);
    text("Game Over", 190, 290);
    textSize(20);
    text(" Click to restart", 240, 320);

    }

    public void mousePressed() {
        distance = (int) dist(x, y, mouseX, mouseY);
        System.out.println("current scene is " + scene);

        if (scene == 0){
            scene = 1;
        }else if (scene == 1){
            
            if (mouseX > x && mouseX < 93 + x && mouseY > y && mouseY < 75 + y ) {
                System.out.println("clicked correctly");
                newHeifer();
                count++;
            } else{
                System.out.println("lose a life");
                lives--;
                if (lives == 0) {
                    scene = 2;
                }
            }
        }else if(scene == 2){
            lives = 3;
            count = 0;
            scene = 0;
            showStart();
        }
        
        System.out.println("lives are " + lives);
       
        // System.out.println("mouse x" + mouseX + "mousey" + mouseY);
        // System.out.println("x" + x + "y" + y);
        // System.out.println(count);

    }

    public void newHeifer(){
        x = (int) random(0, 4);
        y = (int) random(0, 4);
        x = x * 100 + 105;
        y = y * 100 + 110;
    }


}

// }