package hunre.chinh.login.Service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import hunre.chinh.login.Model.User;
import hunre.chinh.login.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);

	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
