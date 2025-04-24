package com.cloudframe.app.repository;

import com.cloudframe.app.db2varch.dto.*;
import com.cloudframe.app.data.Field;


public interface Db2varchRepository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dclbook
* @parm sqlca
* @parm nullvars
     */
    public void updateBook(Dclbook dclbook, Sqlca sqlca, Nullvars nullvars) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dclbook
* @parm sqlca
     */
    public void deleteBook(Dclbook dclbook, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dclbook
* @parm sqlca
* @parm nullvars
     */
    public void selectBook1(Dclbook dclbook, Sqlca sqlca, Nullvars nullvars) throws Exception;

}
