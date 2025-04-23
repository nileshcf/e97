package com.cloudframe.app.repository;

import com.cloudframe.app.varchar1.dto.*;
import com.cloudframe.app.data.Field;


public interface Varchar1Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm vchar1Table
     */
    public void selectVchar1(Sqlca sqlca, Vchar1Table vchar1Table) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm vchar1Table
     */
    public void selectVchar11(Sqlca sqlca, Vchar1Table vchar1Table) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm vchar1Table
     */
    public void selectVchar12(Sqlca sqlca, Vchar1Table vchar1Table) throws Exception;

}
