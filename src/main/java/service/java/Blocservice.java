package service.java;
import com.example.hadilderbali4se4.entity.Bloc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repostries.IBlocRepository ;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Blocservice implements IBlocService {
    public  final IBlocRepository blocRepository;
    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        if (bloc.getIdBloc() != 0) {
            Bloc existingBloc = blocRepository.findById(bloc.getIdBloc()).orElse(null);
            if (existingBloc != null) {
                if (bloc.getNomBloc() != null) {
                    existingBloc.setNomBloc(bloc.getNomBloc());
                }
                if (bloc.getCapaciteBloc() != 0) {
                    existingBloc.setCapaciteBloc(bloc.getCapaciteBloc());
                }
                if (bloc.getFoyer() != null) {
                    existingBloc.setFoyer(bloc.getFoyer());
                }
                if (bloc.getChambres() != null) {
                    existingBloc.setChambres(bloc.getChambres());
                }
                return blocRepository.save(existingBloc);
            }
        }
        return null;
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Optional<Bloc> getBlocById(Long idBloc) {
        return blocRepository.findById(idBloc);
    }

    @Override
    public void deleteBloc(Long idBloc) {
         blocRepository.deleteById(idBloc);
    }
}
