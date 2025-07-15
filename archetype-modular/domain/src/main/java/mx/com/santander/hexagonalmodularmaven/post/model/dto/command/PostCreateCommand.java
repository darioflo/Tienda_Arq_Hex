package mx.com.santander.hexagonalmodularmaven.post.model.dto.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PostCreateCommand {
    private Long id;
    private Long userId;
    private String title;
    private String body;
}
