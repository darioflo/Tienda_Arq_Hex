package mx.com.santander.hexagonalmodularmaven.post.service;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.post.model.dto.command.PostCreateCommand;
import mx.com.santander.hexagonalmodularmaven.post.model.entity.Post;
import mx.com.santander.hexagonalmodularmaven.post.model.entity.PostBody;
import mx.com.santander.hexagonalmodularmaven.post.model.entity.PostId;
import mx.com.santander.hexagonalmodularmaven.post.model.entity.PostTitle;
import mx.com.santander.hexagonalmodularmaven.post.model.entity.PostUserId;
import mx.com.santander.hexagonalmodularmaven.post.port.repository.PostRepository;

@RequiredArgsConstructor
public class PostCreateService {

    private final PostRepository postRepository;

    public Post createPost(PostCreateCommand postCommand) {

        Post nuevoPost = new Post(
          new PostId(null),
          new PostUserId(postCommand.getUserId()),
          new PostTitle(postCommand.getTitle()),
          new PostBody(postCommand.getBody())
        );

        return postRepository.createPost(nuevoPost);
    }
}
