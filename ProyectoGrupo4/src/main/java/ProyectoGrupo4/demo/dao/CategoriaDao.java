package ProyectoGrupo4.demo.dao;


import ProyectoGrupo4.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author adrianchavarriamora
 */
public interface CategoriaDao extends JpaRepository<Categoria,Long>{
    
}
