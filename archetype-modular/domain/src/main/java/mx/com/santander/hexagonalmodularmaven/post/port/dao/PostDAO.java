package mx.com.santander.hexagonalmodularmaven.post.port.dao;
import java.util.List;
import mx.com.santander.hexagonalmodularmaven.post.model.dto.PostDTO;

public interface PostDAO {
    List<PostDTO> obtenerPosts();
}
