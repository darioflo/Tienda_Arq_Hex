package mx.com.santander.hexagonalmodularmaven.post.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PostId {
    private final Long id;

    public Long getid() {
        return id;
    }
}
