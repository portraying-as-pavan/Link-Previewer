package com.example.linkpreviewer.repository;

import com.example.linkpreviewer.Entity.Link;
import org.springframework.data.repository.CrudRepository;

public interface LinkRepository extends CrudRepository<Link,String> {
}
