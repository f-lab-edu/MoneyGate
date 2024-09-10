package flab.prestudy.feed;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class FeedTest {
    @Test
    void 피드_작성하기(){
        // Arrange
        UUID authorId = UUID.randomUUID();
        // Action
        Feed feed = new Feed(authorId, "테스트", null, null);
        // Assert
        assertThat(feed).isNotNull();
    }

    @Test
    void 좋아요_누르기(){
        // Arrange
        UUID authorId = UUID.randomUUID();
        UUID likeUserId = UUID.randomUUID();
        Feed feed = new Feed(authorId, "테스트", null, null);
        // Action
        int likeCount = feed.obtainLike(likeUserId);
        // Assert
        assertThat(likeCount).isEqualTo(1);
    }

    @Test
    void 댓글을_달기(){
        // Arrange
        UUID authorId = UUID.randomUUID();
        Feed feed = new Feed(authorId, "테스트", null, null);

        UUID commentUserId = UUID.randomUUID();
        // Action
        int commentCount = feed.addComment(commentUserId, "댓글");
        // Assert
        assertThat(commentCount).isEqualTo(1);
    }
}