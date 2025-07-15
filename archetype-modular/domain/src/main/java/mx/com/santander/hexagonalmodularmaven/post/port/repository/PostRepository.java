package mx.com.santander.hexagonalmodularmaven.post.port.repository;

import mx.com.santander.hexagonalmodularmaven.post.model.entity.Post;

public interface PostRepository {
    Post createPost(Post post);
}
