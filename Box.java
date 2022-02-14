class Box
{
 //state of the Box : tight encapsulation
 private double width,depth,height;//instance variables
 //parameterized constructor to init complete state of the Box
 Box(double w,double d,double h)
 {
   this.width=w;
     this.depth=d;
     //this keyword is used to un hide instance var from local var
     this.height=h;
 }
  Box(double d)
 {
   this.width=d;
   this.depth=d;
   this.height=d;
 }

  String getBoxDimensions()
 {
    return "Box Dims "+width+" "+depth+" "+height;
 }
//write a non static method To return computed volume of the box.
   double getBoxVolume(double c)
   {
      return this.width*this.depth*this.height;
   } 
   double getBox1Volume(double p,double q,double r)
   {
      return this.width*this.depth*this.height;
   } 
   boolean checkEquality(Box anotherBox)
  {
 	 return this.width==anotherBox.width && this.depth==anotherBox.width && this.height==anotherBox.height;
  }
 
 
 
}