/**
 * FileName: CommentService
 * Author:   closesi
 * Date:     2021/6/9 10:32
 * Description:
 */
package com.closesi.service;

import com.closesi.po.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
