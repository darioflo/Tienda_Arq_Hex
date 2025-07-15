package mx.com.santander.hexagonalmodularmaven.post.service;
import java.util.List;
import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.post.model.entity.Post;
import mx.com.santander.hexagonalmodularmaven.post.port.dao.PostDAO;

@RequiredArgsConstructor
public class PostFindAllService {
    
    private final PostDAO postDAO;
   
    public List<Post> obtenerTodosLosPost(){
        return postDAO.obtenerPosts();
    }
}
