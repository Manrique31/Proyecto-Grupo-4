package ProyectoGrupo4.demo;


import ProyectoGrupo4.demo.impl.UsuarioDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ProjectConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/registro/nuevo").setViewName("/registro/nuevo");
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((request) -> request
                .requestMatchers("/", "/index", "/errores/**", "/carrito/**", "/pruebas/**", "/reportes/**",
                                 "/registro/**", "/js/**", "/webjars/**")
                .permitAll()
                .requestMatchers("/producto/nuevo", "/producto/guardar", "/producto/modificar/**", "/producto/eliminar/**",
                                 "/categoria/nuevo", "/categoria/guardar", "/categoria/modificar/**", "/categoria/eliminar/**",
                                 "/usuario/nuevo", "/usuario/guardar", "/usuario/modificar/**", "/usuario/eliminar/**",
                                 "/reportes/**")
                .hasRole("ADMIN")
                .requestMatchers("/producto/listado", "/categoria/listado", "/usuario/listado")
                .hasAnyRole("ADMIN", "VENDEDOR")
                .requestMatchers("/facturar/carrito")
                .hasRole("USER")
            )
            .formLogin((form) -> form
                .loginPage("/login").permitAll())
            .logout((logout) -> logout.permitAll());
        return http.build();
    }

    @Autowired
    private UsuarioDetailsServiceImpl usuarioDetailsService; // Cambiado a la implementación correcta

    @Autowired
    public void configurerGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(usuarioDetailsService) // Usando la implementación de UsuarioDetailsService
            .passwordEncoder(new BCryptPasswordEncoder());
    }
}