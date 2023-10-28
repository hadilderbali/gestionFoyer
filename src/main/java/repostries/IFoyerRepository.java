package repostries;

import com.example.hadilderbali4se4.entity.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IFoyerRepository extends JpaRepository<Foyer, Long>
{
}
