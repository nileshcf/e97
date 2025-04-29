package com.cloudframe.app.repository;

import com.cloudframe.app.db2varch.dto.*;
import com.cloudframe.app.data.Field;


public interface Db2varchRepository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm nullvars
* @parm dclbook
     */
    public void updateBook(Sqlca sqlca, Nullvars nullvars, Dclbook dclbook) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dclbook
     */
    public void deleteBook(Sqlca sqlca, Dclbook dclbook) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm nullvars
* @parm dclbook
     */
    public void selectBook1(Sqlca sqlca, Nullvars nullvars, Dclbook dclbook) throws Exception;

}
