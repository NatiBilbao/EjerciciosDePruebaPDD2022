package src.prototype;

public class Contrato implements IContrato {

    private int sueldo = 5000;
    private int cargaHoraria = 80;

    private int horaEntrada = 8;

    private int horaSalida = 18;

    private boolean cursoEducarionSuperior = true;

    private boolean accesoPlataforma = true;

    private boolean marcadoBiometrico = false;
    private Persona persona = new Persona();

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isCursoEducarionSuperior() {
        return cursoEducarionSuperior;
    }

    public void setCursoEducarionSuperior(boolean cursoEducarionSuperior) {
        this.cursoEducarionSuperior = cursoEducarionSuperior;
    }

    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean isMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public Object clone(){
        Persona cloneP = new Persona();
        cloneP.setNombre(this.getPersona.getNombre());
        cloneP.setApellido(this.getPersona.getApellido());
    }

    public void showInfo(){
        System.out.println("INFORMACION DEL CONTRATO");
        System.out.println("Sueldo" + sueldo);
        System.out.println("Carga horaria" + cargaHoraria);
        System.out.println("Hora de entrada" + horaEntrada);
        System.out.println("Hora de salida" + horaSalida);
        System.out.println("Curso de educacion superior" + cursoEducarionSuperior);
        System.out.println("Acceso a la plataforma" + accesoPlataforma);
        System.out.println("Marcado biometricos" + marcadoBiometrico);
        System.out.println("Nombre de la persona" + persona.getNombre());
        System.out.println("Apellido de la persona" + persona.getApellido());
    }
}
