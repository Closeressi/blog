/**
 * FileName: CommentRepository
 * Author:   closesi
 * Date:     2021/6/9 10:38
 * Description:
 */
package com.closesi.dao;

import com.closesi.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {

    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
