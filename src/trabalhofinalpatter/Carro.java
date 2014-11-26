
package trabalhofinalpatter;

public abstract class Carro {
    private PosMontar posMontar;
    
    public void montarCarro(){
        
        tipo();
        lataria();
        motor();
        rodas();
        pintura();
        posMontar();
    }
    
    public abstract void tipo();
    
    public void lataria(){
        System.out.println("Mexendo na lataria...");
    }
    
    public void motor(){
        System.out.println("Montando o Motor...");
    }
    
    public void rodas(){
        System.out.println("Colocando rodas...");
    }
    
    public void pintura(){
        System.out.println("Pintando...");
    }
    
    private void posMontar(){
        posMontar.montar();
    }
    
    public void setPosMontar(PosMontar posMontar){
        this.posMontar = posMontar;
    }
    
    
 }
