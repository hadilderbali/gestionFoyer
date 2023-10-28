package controller.java;
import com.example.hadilderbali4se4.entity.universite;
import service.java.IUniversiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class UniversiteRestcontroller {
    private final IUniversiteService universiteService;

    @PostMapping("/add")
    public universite addUniversite(@RequestBody universite u) {
        return universiteService.adduniversite(u);
    }

    @PutMapping("/update")
    public universite updateUniversite(@RequestBody universite u) {
        return universiteService.updateuniversite(u);
    }

    @GetMapping("/all")
    public List<universite> getAllUniversites() {
        return universiteService.getAlluniversites();
    }

    @GetMapping("/{idUniversite}")
    public universite getUniversiteById(@PathVariable Long idUniversite) {
        return universiteService.getuniversiteById(idUniversite);
    }

    @DeleteMapping("/delete/{idUniversite}")
    public void deleteUniversite(@PathVariable Long idUniversite) {
        universiteService.deleteuniversite(idUniversite);
    }
}
