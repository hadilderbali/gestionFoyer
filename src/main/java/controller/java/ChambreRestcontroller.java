package controller.java;
import service.java.IChambreService ;
import org.springframework.web.bind.annotation.*;
import com.example.hadilderbali4se4.entity.chambre ;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RestController
@RequestMapping("/chambre")
public class ChambreRestcontroller {

    private final IChambreService chambreService;

    @PostMapping("/add")
    public chambre addChambre(@RequestBody chambre ch) {
        return chambreService.addchambre(ch);
    }

    @PutMapping("/update")
    public chambre updateChambre(@RequestBody chambre ch) {
        return chambreService .updateChambre(ch);
    }

    @GetMapping("/all")
    public List<chambre> getAllChambres() {
        return chambreService.getAllChambres();
    }

    @GetMapping("/{idChambre}")
    public Optional<chambre> getChambreById(@PathVariable Long idChambre) {
        return chambreService.getChambreById(idChambre);
    }

    @DeleteMapping("/delete/{idChambre}")
    public void deleteChambre(@PathVariable Long idChambre) {
        chambreService.deletechambre(idChambre);
    }

}
