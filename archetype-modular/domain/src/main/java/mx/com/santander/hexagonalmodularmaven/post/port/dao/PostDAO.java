package mx.com.santander.hexagonalmodularmaven.post.port.dao;
import java.util.List;
import mx.com.santander.hexagonalmodularmaven.post.model.entity.Post;

public interface PostDAO {
    List<Post> obtenerPosts();
}
