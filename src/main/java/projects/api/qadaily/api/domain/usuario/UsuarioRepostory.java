package projects.api.qadaily.api.domain.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepostory extends JpaRepository<Usuario, Long> {
    UserDetails findByLogin(String login);
}
