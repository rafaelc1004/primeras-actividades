
package proyectosaludo;

public class BreakContinue {
    
    public static void main(String[] args) {
        pruebaBreak();
        
    }
    
    public static void pruebaBreak(){
        for(int i=0; i<10;i++){
            if(i == 4){
                break;
            }
            System.out.printf("i=%d %n",i);
        }
    }
    
    public static void pruebaContinue(){
        for(int i =0; i<10;i++){
            if(i==4){
                System.out.printf("i=%d %n",i);
            }
        }
    }
    
}
