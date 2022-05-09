package com.example.tutoronline.repositories;

import com.example.tutoronline.entities.PostEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity,Long> {

    Page<PostEntity> findByTitleContainingAndAddressIDAndSubjectIDAndFormality(String name,Long addressID,Long subjectID, int formality, Pageable pageable);

    Page<PostEntity> findByTitleContaining(String search,Pageable pageable);


}
