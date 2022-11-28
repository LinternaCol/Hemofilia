package com.savia.hemofilia.repository;

import com.savia.hemofilia.model.HemofiliaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface HemofiliaRepositoryValidator extends JpaRepository<HemofiliaModel,Long> {
}
