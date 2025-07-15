package mx.com.santander.hexagonalmodularmaven.post.command;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.post.mapper.PostDtoMapper;
import mx.com.santander.hexagonalmodularmaven.post.model.dto.PostDTO;
import mx.com.santander.hexagonalmodularmaven.post.model.dto.command.PostCreateCommand;
import mx.com.santander.hexagonalmodularmaven.post.model.entity.Post;
import mx.com.santander.hexagonalmodularmaven.post.service.PostCreateService;

@AllArgsConstructor
public class PostCreateHandler {
    private final PostCreateService postCreateService;
    private final PostDtoMapper postDtoMapper;

    public PostDTO handler(PostCreateCommand post){
        Post nuevoPost =  postCreateService.createPost(post);
        return postDtoMapper.toDto(nuevoPost);
    }
}
