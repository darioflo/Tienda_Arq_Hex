package mx.com.santander.hexagonalmodularmaven.post.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PostUserId {
    private final Long value;

    public Long getValue() {
        return value;
    }
}
