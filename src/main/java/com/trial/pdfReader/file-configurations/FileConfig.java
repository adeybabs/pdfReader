import java.util.*;
import com.trial.pdfReader.entities.Configuration;

/**
 * This is a base config interface that every file we need to read must implement, providing configurations as to how the file will be read
 */
public interface FileConfig {
    List<Configuration> getFileConfigurations();
}