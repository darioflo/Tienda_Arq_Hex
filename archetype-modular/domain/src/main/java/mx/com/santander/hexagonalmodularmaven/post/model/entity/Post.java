package mx.com.santander.hexagonalmodularmaven.post.model.entity;

public class Post {

    private PostId id;
    private PostUserId userId;
    private PostTitle title;
    private PostBody body;

    public Post(PostId id, PostUserId userId, PostTitle title, PostBody body) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    public PostId getId() {
        return id;
    }

    public PostUserId getUserId() {
        return userId;
    }

    public PostTitle getTitle() {
        return title;
    }

    public PostBody getBody() {
        return body;
    }
}
