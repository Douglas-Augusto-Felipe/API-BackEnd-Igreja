package Data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminRegistration {
    private String Name;
    private int ID;
    private String Password;
    private String Cargo;
}
