package src.prototype;

public class cliente {
    public static void main(String[]args){

        Persona cristoffer = new Persona();
        cristoffer.setNombre("cristoffer");
        cristoffer.setApellido("mollinedo");

        Persona julio = new Persona();
        julio.setNombre("julio");
        julio.setApellido("herrera");

        Persona andrea = new Persona();
        andrea.setNombre("andrea");
        andrea.setApellido("cano");

        Persona natalia = new Persona();
        natalia.setNombre("natalia");
        natalia.setApellido("fernandez");

        Persona lili = new Persona();
        lili.setNombre("lili");
        lili.setApellido("miranda");

        Persona javier = new Persona();
        javier.setNombre("javier");
        javier.setApellido("rejas");

        Contrato contrato1 = (Contrato) template.clone();
        contrato1.setPersona(cristoffer);

        contrato1.showInfo();
    }
}
