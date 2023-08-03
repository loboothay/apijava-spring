package projects.api.qadaily.api.domain.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired
    private UsuarioRepostory repostory;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repostory.findByLogin(username);
    }
}
