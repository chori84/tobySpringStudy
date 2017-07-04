package springstudy.user.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by chori on 2017. 6. 27..
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    String id;
    String name;
    String password;
}
