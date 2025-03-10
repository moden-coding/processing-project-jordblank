import processing.core.*; 
public class App extends PApplet{
    float x;
    float y;
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    //PImage image;
    public void settings(){
        size(600, 600);
        
    }
    public void setup(){
        background(192, 178, 207);
        x = (int)random(0,4);
        y = (int)random(0,4);
        x = x * 100 + 150;
        y= y * 100 + 150;
        //image = loadImage("heifer.jpg");
        //image.resize(140, 140);
    }


    public void draw(){
        
       
        //image(image, 105, 105);
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
        ellipse(x, y, 75, 75);

    }
    
}
