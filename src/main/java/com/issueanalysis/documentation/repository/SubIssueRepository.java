package com.issueanalysis.documentation.repository;

import com.issueanalysis.documentation.model.subissue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubIssueRepository extends JpaRepository<subissue, Long> {

    Optional<subissue> findByName(String subissueName);
}
