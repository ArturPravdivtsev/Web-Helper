package com.aidar.service;

import com.aidar.model.Comment;

public interface CommentService {

    Comment add(Long id, String text);

}
