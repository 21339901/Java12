package pack6;  
import pack6.subpack1.CCircle;   
import pack6.subpack2.CRectangle;   
import pack6.subpack1.subpack.CStyle;
public class app12_6
{
   public static void main(String args[])
   {
      CCircle cir=new CCircle();
      CRectangle rect=new CRectangle();
      CStyle cs = new CStyle(1);
      cir.show();
      rect.show();
   }
}
