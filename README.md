# BANCO MACRO  
#### Trabajo practico de DTO

## Clase main

```java
public class BancoMacro {

  public static ClienteDTO coveClienteDTO(Cliente cli){
      
  return new ClienteDTO(cli.getId(),
          cli.getNombre(),
          cli.getApellido(),
          cli.getDni()); //Coverti a DTO porque va devolver eso
  }
  public static CuentaDTO covCuentaDTO(Cuenta cuent){
  return new CuentaDTO(3L, "12345");
  
  }
    public static void main(String[] args) {
       
        Cliente cli=new Cliente(12L, "Marisol", "Donaire","40069488", "1234567890");
        ClienteDTO cliDTO= coveClienteDTO(cli);
        
        System.out.println("--Datos enviados del cliente al Frontend");
        
        System.out.println(cliDTO);
        
       // Falta CUENTA
       Cuenta cuent=new Cuenta
        CuentaDTO cuentDTO= covCuentaDTO(Cuenta);
        
        System.out.println("--La cuenta del cliente al Frontend");
        
        System.out.println(cuentDTO);
       
       // REPUESTA DE LA CLASE RespuestaDTO
       RespuestaDTO<ClienteDTO > repuesta = new RespuestaDTO<>(true, "Exito ", cliDTO);// Lo que es generico va dentro que en este caso es clienetDTO
       RespuestaDTO<CuentaDTO > repuesta1 = new RespuestaDTO<>(true, "Cuenta encontrada ", CuentaDTO);
    }
    
    
}

```

## Clase Cliente

```java
public class Cliente {
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String contraseña;

    public Cliente() {
    }

    public Cliente(Long id, String nombre, String apellido, String dni, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.contraseña = contraseña;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getContraseña() {
        return contraseña;
    }
    
}
```

## Clase ClienteDTO

```java

public class ClienteDTO {
      private Long id;
    private String nombre;
    private String apellido;
    private String dni;

    public ClienteDTO() {
    }

    public ClienteDTO(Long id, String nombre, String apellido, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
   
}
```

## Clase Cuenta

```java

public class Cuenta {
   private Long id;
    private String  numeroCuenta;
    private double saldo;
    private String contraseña;  

    public Cuenta() {
    }

    public Cuenta(Long id, String numeroCuenta, double saldo, String contraseña) {
        this.id = id;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.contraseña = contraseña;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
```

## Clase CuentaDTO

```java

public class CuentaDTO {
    private Long id;
    private String numeroCuenta;

    public CuentaDTO() {
    }

    public CuentaDTO(Long id, String numeroCuenta) {
        this.id = id;
        this.numeroCuenta = numeroCuenta;
    }

    public Long getId() {
        return id;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    @Override
    public String toString() {
        return "CuentaDTO{" + "id=" + id + ", numeroCuenta=" + numeroCuenta + '}';
    }
  

    
}
```

## Clase RepuestaDTO

```java

public class RespuestaDTO <T>{// Es generico
    private boolean exito;
    private String mensaje;
    private T datos; // Tipo de dato generico

    public RespuestaDTO() {
    }

    public RespuestaDTO(boolean exito, String mensaje, T datos) {
        this.exito = exito;
        this.mensaje = mensaje;
        this.datos = datos;
    }

    public boolean isExito() {
        return exito;
    }

    public String getMensaje() {
        return mensaje;
    }

    public T getDatos() {
        return datos;
    }

}

```
