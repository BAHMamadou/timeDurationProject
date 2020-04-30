
public class TimeDuration{
    private int s;

    public TimeDuration(s){
        this.s =s;
    }

    public void toString(){
        int p1 = this.s%60;
        int h= this.s/60;
        int m=h%60;
         h = h/60;
        if(this.s==0 || this.s <60){
            system.out.println(""+ this.s+"s");
        }else if (this.s>=60 && this.s <3600 ){
            system.out.println(""+m+"mn"+""+ p1+"s");
        }else if (this.s >3600 ){
            system.out.println(""+h+"h"+""+m+"mn"+""+ p1+"s");
        }
    }

}
