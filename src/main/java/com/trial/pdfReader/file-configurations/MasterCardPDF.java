import java.util.*;
import com.trial.pdfReader.entities.Configuration;

public class MasterCardPDF implements FileConfig {

    @override
    public List<Configuration> getFileConfigurations() {
        return List.of(
            new Configuration(0, true),
            new Configuration(1, true),
            new Configuration(2, false),
            new Configuration(3, true),
            new Configuration(4, false),
            new Configuration(5, true),
            new Configuration(6, false),
            new Configuration(7, true)
        );
    }
}