package com.cloudframe.app.repository;

import com.cloudframe.app.varchar1.dto.*;
import com.cloudframe.app.data.Field;


public interface Varchar1Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm vchar1Table
* @parm sqlca
     */
    public void selectVchar1(Vchar1Table vchar1Table, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm vchar1Table
* @parm sqlca
     */
    public void selectVchar11(Vchar1Table vchar1Table, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm vchar1Table
* @parm sqlca
     */
    public void selectVchar12(Vchar1Table vchar1Table, Sqlca sqlca) throws Exception;

}
