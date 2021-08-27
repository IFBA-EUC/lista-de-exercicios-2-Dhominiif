public class Quest_16_0{

    private long h, m, s;

    public void settempo(long s){ 

        this.s = s;
        while(this.s > 59){
            this.s = this.s - 60;
        }
        this.h = s-this.s;

        this.m = this.h/60;
        while(this.m > 59){
            this.m = this.m - 60;
        }
        this.h = (this.h - (this.m*60))/3600;

    }
    public Long getseng(){
        return this.s;
    }
    public Long getmin(){
        return this.m;
    }
    public Long gethora(){
        return this.h;
    }

    public void status(){

        System.out.println(" ");
        System.out.println("-----------------------------------RESULTADO DA CONVERSAO-----------------------------------");
        System.out.println(" ");
        System.out.println(this.gethora()+":"+this.getmin()+":"+this.getseng());
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(" ");
    }
}