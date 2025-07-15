package mx.com.santander.hexagonalmodularmaven.post.mapper;
import mx.com.santander.hexagonalmodularmaven.post.model.dto.PostDTO;
import mx.com.santander.hexagonalmodularmaven.post.model.entity.Post;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PostDtoMapper {

    @Mapping(source = "userId.value", target = "userId")
    @Mapping(source = "title.value", target = "title")
    @Mapping(source = "body.value", target = "body")
    PostDTO toDto(Post post); 
}

