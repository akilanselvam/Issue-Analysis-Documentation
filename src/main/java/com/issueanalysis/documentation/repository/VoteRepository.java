package com.issueanalysis.documentation.repository;

import com.issueanalysis.documentation.model.Post;
import com.issueanalysis.documentation.model.User;
import com.issueanalysis.documentation.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
