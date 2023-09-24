package gm.cuentas.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Table(name = "cuenta")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCuenta;
    private String nombre;
    private String tipoCuenta;
    private Double saldo;
}
