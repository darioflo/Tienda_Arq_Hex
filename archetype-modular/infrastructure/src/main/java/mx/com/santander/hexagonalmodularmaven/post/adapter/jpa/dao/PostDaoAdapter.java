package mx.com.santander.hexagonalmodularmaven.post.adapter.jpa.dao;
import java.util.List;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.post.model.entity.Post;
import mx.com.santander.hexagonalmodularmaven.post.port.dao.PostDAO;

@Repository
@AllArgsConstructor
public class PostDaoAdapter implements PostDAO {


    @Override
    public List<Post> obtenerPosts() {
      
        return null;
    }
}