package oops.inter;

public class NIceCar {
   private Enigne enigne;
   private Media player=new CDplayer();
    public NIceCar() {
        this.enigne = new PowerEngine();
    }
    public NIceCar(Enigne enigne) {
        this.enigne = enigne;
    }
    public void start(){
        enigne.start();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void switchEngine(){
        this.enigne=new Electic_engine();
    }
    static void main(String[] args) {
        NIceCar bmw=new NIceCar();
        bmw.start();
        bmw.startMusic();
        bmw.stopMusic();
    }
}
