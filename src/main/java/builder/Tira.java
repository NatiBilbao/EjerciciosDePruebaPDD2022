package builder;

public class Tira extends builderPlatosDeParrilla{

    @Override
    public void buildTipoDeCarne(){
        this.parrilla.setTipoDeCarne("Tira de carne");
    }

    @Override
    public void buildSaborRefresco(){
        this.parrilla.setSaborRefresco("Coca-Cola");
    }

    @Override
    public void buildGuarniciones(){
        this.parrilla.setGuarniciones("Fideo");
    }
}
