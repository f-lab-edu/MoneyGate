package flab.prestudy.feed;

import java.util.UUID;

class Comment {
    private final String content;
    private final UUID userId;

    public Comment(UUID userId, String content) {
        this.content = content;
        this.userId = userId;
    }
}
