package com.cloudframe.app.repository;

import com.cloudframe.app.db2varcl.dto.*;
import com.cloudframe.app.data.Field;


public interface Db2varclRepository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm bookReqArea
* @parm sqlca
* @parm nullvars
     */
    public void insertBook(BookReqArea bookReqArea, Sqlca sqlca, Nullvars nullvars) throws Exception;

}
