
package trabalhofinalpatter;


public class CarroBuilder {
    
    public Carro criaCarroSedan(){
        Carro c = new CriaCarro();
        c.setPosMontar(new Sedan());
        return c;
    }
    
    public Carro criaCarroHatch(){
        Carro c = new CriaCarro();
        c.setPosMontar(new Hatch());
        return c;
    }
    
}