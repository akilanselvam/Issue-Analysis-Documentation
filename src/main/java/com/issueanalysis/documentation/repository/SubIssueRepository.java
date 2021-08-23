package com.issueanalysis.documentation.repository;

import com.issueanalysis.documentation.model.SubIssue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubIssueRepository extends JpaRepository<SubIssue, Long> {

    Optional<SubIssue> findByName(String subissueName);
}
