for (int i = 99; i >= 0; i--) {
if (i==1){
    System.out.println("1 bottle of beer on the wall, 1 bottle of beer. Take one down and pass it around, no more bottles of beer on the wall."); 
}
else if (i==0){
    System.out.println("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.");
  }
else {
  System.out.println(i+" bottls of beer on the wall, "+i+ "bottls of beer, take one down pass it around" +(i-1)+"bottls of beer on the wall" );
}
  

}
