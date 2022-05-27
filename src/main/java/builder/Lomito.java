package builder;

public class Lomito extends builderPlatosDeParrilla{

    @Override
    public void buildTipoDeCarne(){
        this.parrilla.setTipoDeCarne("Lomo");
    }

    @Override
    public void buildSaborRefresco(){
        this.parrilla.setSaborRefresco("Pepsi");
    }

    @Override
    public void buildGuarniciones(){
        this.parrilla.setGuarniciones("Arroz");
    }
}
