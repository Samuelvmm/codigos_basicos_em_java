public class SmartTv {
    
    boolean ligada=false;
    int canal=1;
    int volume = 25;
    
    public void mudarCanal (int novocanl){
        canal = novocanl;
    }
    public void diminuirCanal (){
        canal --;

    }
    public void aumentarCanal (){
        canal ++;

    }
    public void aumentarVolume(){
        System.out.println("Aumentando o volume para: " + volume);
        volume= volume + 1;
    }
        
    public void diminuirVolume(){
        System.out.println("Diminuindo o volume para: " + volume);

        volume--;
    }

    public void ligar (){
        ligada=true;
    }

    public void desligar (){
        ligada = false;
    }


}