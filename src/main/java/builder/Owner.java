package builder;

public class Owner {
    private builderPlatosDeParrilla builder;

    public Parrilla getParrillaArmada(){
        return builder.getProduct();
    }

    public void setBuilder(builderPlatosDeParrilla builder){
        this.builder = builder;
    }

    public void armarParrilla(){
        this.builder.createParrilla();
        this.builder.buildTipoDeCarne();
        this.builder.buildSaborRefresco();
        this.builder.buildGuarniciones();
    }
}
