package builder;

public class Bife extends builderPlatosDeParrilla{
    @Override
    public void buildTipoDeCarne(){
        this.parrilla.setTipoDeCarne("bife");
    }

    @Override
    public void buildSaborRefresco(){
        this.parrilla.setSaborRefresco("Coca-Cola");
    }

    @Override
    public void buildGuarniciones(){
        this.parrilla.setGuarniciones("Papas fritas");
    }
}
