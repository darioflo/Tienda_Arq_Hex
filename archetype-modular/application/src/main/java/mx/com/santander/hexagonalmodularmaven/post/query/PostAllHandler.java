package mx.com.santander.hexagonalmodularmaven.post.query;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.post.mapper.PostDtoMapper;
import mx.com.santander.hexagonalmodularmaven.post.model.dto.PostDTO;
import mx.com.santander.hexagonalmodularmaven.post.service.PostFindAllService;

@Service
@AllArgsConstructor
public class PostAllHandler {
    
    private final PostFindAllService postFindAllService;
    private final PostDtoMapper postDtoMapper;

    public List<PostDTO> handler(){
       return postFindAllService.obtenerTodosLosPost().stream().map(postDtoMapper::toDto).collect(Collectors.toList()); 
    }

}
