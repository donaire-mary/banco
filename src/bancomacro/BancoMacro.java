/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancomacro;

/**
 *
 * @author Marisol
 */
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
