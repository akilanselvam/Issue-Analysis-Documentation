package com.issueanalysis.documentation.repository;

import com.issueanalysis.documentation.model.Post;
import com.issueanalysis.documentation.model.User;

import com.issueanalysis.documentation.model.subissue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBysubissue(subissue subissue);

    List<Post> findByUser(User user);
}
