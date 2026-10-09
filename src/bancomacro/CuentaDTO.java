/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancomacro;

/**
 *
 * @author Marisol
 */
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
