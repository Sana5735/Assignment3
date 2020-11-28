class Assignment3q5
{
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
class Sample
{
   public static void main(String args[])
   {
       Assignment3q5 obj = new Assignment3q5();
       obj.disp('a',5);
   }
}