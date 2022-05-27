package builder;

public class cliente {
    public static void main(String[] args){
        Owner cris = new Owner();
        builderPlatosDeParrilla bife = new Bife();
        builderPlatosDeParrilla lomito = new Lomito();
        builderPlatosDeParrilla tira = new Tira();

        cris.setBuilder(bife);
        cris.armarParrilla();
        Parrilla parrilla1 = cris.getParrillaArmada();
        parrilla1.showInfo();

        cris.setBuilder(lomito);
        cris.armarParrilla();
        Parrilla parrilla2 = cris.getParrillaArmada();
        parrilla2.showInfo();

        cris.setBuilder(tira);
        cris.armarParrilla();
        Parrilla parrilla3 = cris.getParrillaArmada();
        parrilla3.showInfo();
    }
}
