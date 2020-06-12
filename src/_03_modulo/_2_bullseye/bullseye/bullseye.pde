
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  int X = 400;
  int B = 370;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for (int i=0; i<8; i++) {
    if(i % 2==0){
      fill(#FF0000);
    
    }
    else {
      fill(0);
    }
      ellipse(250,250,X-i*40,B-i*40);
  }
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
