package mx.com.santander.hexagonalmodularmaven.post.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PostTitle {
    private final String value;

    public String getValue() {
        return value;
    }
}
