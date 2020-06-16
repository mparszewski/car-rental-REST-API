package com.mparszewski.carrental.repository;

import com.mparszewski.carrental.model.SegmentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SegmentTypeRepository extends JpaRepository<SegmentType, String> {
}
