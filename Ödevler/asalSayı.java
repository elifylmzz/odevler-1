public class asalSayı {
    
    public static void main(String[] args) {
        
        int number=1;
        int reminder= number%2;
        System.out.println(reminder);
        boolean isPrime=true;

        if(number==1)
        {
            System.out.println("Sayı asal değildir ");
            return;
        }

        if(number<1)
        {
            System.out.println("Geçersiz sayı ");
        }
        
        
        for(int i=2; i<number; i++)
        {
            if(number%i==0)
            {
                isPrime=false;
            }
        }

        if(isPrime==true) 
        {
            System.out.println("Sayı Asaldır");
        }
        else
        {
            System.out.println("Sayı asal değildir");
        }
    
    }
}
