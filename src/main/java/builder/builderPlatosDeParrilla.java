package builder;

public abstract class builderPlatosDeParrilla {
    protected Parrilla parrilla;

    public Parrilla getProduct(){
        return parrilla;
    }

    public void createParrilla() {
        this.parrilla = new Parrilla();
    }

    public abstract void buildTipoDeCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();
}
