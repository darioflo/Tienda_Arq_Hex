package mx.com.santander.hexagonalmodularmaven.post.adapter.jpa.dao;
import java.util.List;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.post.model.dto.PostDTO;
import mx.com.santander.hexagonalmodularmaven.post.port.dao.PostDAO;

@Repository
@AllArgsConstructor
public class PostDaoAdapter implements PostDAO {


    @Override
    public List<PostDTO> obtenerPosts() {
        String url = "https://jsonplaceholder.typicode.com/posts";
        
        return null;
    }
}