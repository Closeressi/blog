/**
 * FileName: TypeRepository
 * Author:   closesi
 * Date:     2021/3/31 16:37
 * Description:
 */
package com.closesi.dao;

import com.closesi.po.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);

    @Query("select t from t_tag t")
    List<Tag> findTop(Pageable pageable);
}
