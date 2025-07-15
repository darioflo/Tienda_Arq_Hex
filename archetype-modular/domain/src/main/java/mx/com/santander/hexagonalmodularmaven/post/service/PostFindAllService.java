package mx.com.santander.hexagonalmodularmaven.post.service;
import java.util.List;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.post.model.dto.PostDTO;
import mx.com.santander.hexagonalmodularmaven.post.port.dao.PostDAO;

@RequiredArgsConstructor
public class PostFindAllService {
    
    private final PostDAO postDAO;
    public List<PostDTO> obtenerTodosLosPost(){
        return postDAO.obtenerPosts();
    }
}
