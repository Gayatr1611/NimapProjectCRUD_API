package Nimap.Crud_Apis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Nimap.Crud_Apis.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}