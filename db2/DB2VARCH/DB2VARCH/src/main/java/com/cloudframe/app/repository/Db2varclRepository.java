package com.cloudframe.app.repository;

import com.cloudframe.app.db2varcl.dto.*;
import com.cloudframe.app.data.Field;


public interface Db2varclRepository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm nullvars
* @parm sqlca
* @parm bookReqArea
     */
    public void insertBook(Nullvars nullvars, Sqlca sqlca, BookReqArea bookReqArea) throws Exception;

}
