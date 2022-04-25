import java.util.*;
import com.trial.pdfReader.entities.Configuration;

public class T112PDFConfig implements FileConfig {

    @override
    public List<Configuration> getFileConfigurations() {
        return List.of(
            new Configuration(0, false),
            new Configuration(1, false),
            new Configuration(2, false),
            new Configuration(3, true),
            new Configuration(4, true),
            new Configuration(5, true),
            new Configuration(6, true),
            new Configuration(7, true)
        );
    }
}