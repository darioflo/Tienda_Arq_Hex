package mx.com.santander.hexagonalmodularmaven.post.mapper;
import mx.com.santander.hexagonalmodularmaven.post.model.dto.PostDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PostDtoMapper {

    @Mapping(source = "userId", target = "userId")
    @Mapping(source = "id", target = "id")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "body", target = "body")
    PostDTO toDto(PostDTO post);
}
