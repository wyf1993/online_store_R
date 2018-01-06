package org.online.store.dao.individual;

import org.online.store.dao.base.BaseDao;
import org.online.store.model.Comment;
import org.springframework.stereotype.Repository;


@Repository(value = "commentDao")
public class CommentDao extends BaseDao<Comment> {

}
