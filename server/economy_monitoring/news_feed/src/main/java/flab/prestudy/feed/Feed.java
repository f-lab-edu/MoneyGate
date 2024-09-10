package flab.prestudy.feed;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Feed {
    private final UUID authorId;
    private final String text;
    private final List<Like> likes; // null 인게 좋을까 빈리스트가 좋을까?
    private final List<Comment> comments;

    public Feed(UUID userId, String text, List<Like> likes, List<Comment> comments) {
        this.text = text;
        this.likes = setLikes(likes);
        this.authorId = userId;
        this.comments = setComments(comments);
    }

    private List<Like> setLikes(List<Like> likes) {
        if (likes == null) {
            return new ArrayList<>();
        }
        return likes;
    }

    private List<Comment> setComments(List<Comment> comments) {
        if (comments == null) {
            return new ArrayList<>();
        }
        return comments;
    }

    public int obtainLike(UUID userId) {
        Like newLike = new Like(userId);
        likes.add(newLike);
        return likes.size();
    }

    public int addComment(UUID userId, String text) {
        Comment newComment = new Comment(userId, text);
        comments.add(newComment);
        return comments.size();
    }
}
