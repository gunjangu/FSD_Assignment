public class Second {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        System.out.println("----------------------------------------------------------------");
        int b = 10;
        b++;
        b = b+1;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);

        System.out.println("----------------------------------------------------------------");
        
        int x = 100;
        int y = 200;
        System.out.println(x++ + ++y);   
        System.out.println(++x + y++);   

        System.out.println("----------------------------------------------------------------");
        
        int c = 40;
        int d = 20;
        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c % d);

        System.out.println("----------------------------------------------------------------");
        
        int a1= 10;
        int b1 = 5;
         int c1 = 30;
        System.out.println(a1 < b1 && a1 <c1);
        System.out.println(a1 < b1 || a1 < c1);

        int x1 = 10;
        int y1 = 5;
        if(x1 < y1){
            System.out.println(x1);
        }else{
            System.out.println(y1);
        }
        int result = (x1 < y1)?x1:y1;
        System.out.println(result);


    }
}