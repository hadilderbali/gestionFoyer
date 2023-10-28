package service.java;
import com.example.hadilderbali4se4.entity.Bloc;

import java.util.List;
import java.util.Optional;

public interface IBlocService {
        Bloc addBloc(Bloc bloc);
        Bloc updateBloc(Bloc bloc);
        List<Bloc> getAllBlocs();
        Optional<Bloc> getBlocById(Long idBloc);
        void deleteBloc(Long idBloc);
    }