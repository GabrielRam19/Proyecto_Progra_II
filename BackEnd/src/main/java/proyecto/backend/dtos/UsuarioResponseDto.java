package proyecto.backend.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponseDto {
    private int idUsuario;

    private String nombre;

    private String userName;

    private String rol;

    private String contrasena;

    private Boolean active;
}
