import processing.core.*; 
public class App extends PApplet{
    PImage image;
    float x;
    float y;
    //float mousePressed = 0;
    // float mouseX = 0;
    // float mouseY = 0;
    float count = 0;
    int scene = 0;
    int distance = 0;
    int radius = 38;
    float speed = 1;
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    
    public void settings(){
        size(600, 600);
        
    }
    public void setup(){
        background(192, 178, 207);
        x = (int)random(0,4);
        y = (int)random(0,4);
        x = x * 100 + 150;
        y= y * 100 + 150;
        textSize (25);
        image = loadImage("heifer.png");
        //image.resize(140, 100);
    }


    public void draw(){
        background(192, 178, 207);
        stroke(108, 89, 128);
        strokeWeight(1);
        rect (100,100,400,400);
        fill (159, 138, 181);
        line(200, 100, 200, 500);
        line(300, 100, 300, 500);
        line(400, 100, 400, 500);
        line(100, 200, 500, 200);
        line(100, 300, 500, 300);
        line(100, 400, 500, 400);
        image(image, x, y, 93, 80);
        ellipse(x, y, 75, 75);
        text("Score: " + count, 100, 520);
        
        

        //if (scene = 0){
            
        //}
        //else if (scene = 1){

        //}
        //else{

        //}

    }
    public void mousePressed(){
        distance = (int)dist(x, y, mouseX, mouseY);
        if (distance <= radius){
            x = (int)random(0,4);
            y = (int)random(0,4);
            x = x * 100 + 150;
            y= y * 100 + 150;
            //mousePressed = x;
            count++;
            System.out.println("mouse x" + mouseX + "mousey" + mouseY);
            System.out.println("x" + x + "y" + y);
            x += speed;
        }
            scene++;
            if(scene == 3){
                scene = 1;
            }
           
            System.out.println(count);
        
        }

    }
    
//}