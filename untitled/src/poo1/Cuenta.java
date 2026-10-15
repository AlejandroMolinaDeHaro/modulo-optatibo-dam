package poo1;

public class Cuenta {
    private String nombreCliente = "pepe";
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

 //Metodo getter
    public String getnombreCliente(){
        return nombreCliente;
    }
    public String getnumeroCuenta(){
    return numeroCuenta;
    }
    public double gettipoInteres(){
        return tipoInteres;
    }
    public double getsaldo(){
        return saldo;
    }

    //Setters
    public void setnumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setnombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }
    public void settipoInteres(double tipoInteres){
        this.tipoInteres = tipoInteres;
    }
    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }
    public Cuenta(){

    }
}
