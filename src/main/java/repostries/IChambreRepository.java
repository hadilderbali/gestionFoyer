package repostries;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hadilderbali4se4.entity.chambre ;

import java.util.List;

public interface IChambreRepository extends JpaRepository<chambre, Long>  {

}