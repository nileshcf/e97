package com.cloudframe.app.repository;

import com.cloudframe.app.dbrowst2.dto.*;
import com.cloudframe.app.data.Field;


public interface Dbrowst2Repository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openSecCursorDbrowst2(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm secTable
* @parm sqlca
     */
    public void fetchSecCursorDbrowst2(SecTable secTable, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeSecCursorDbrowst2(Sqlca sqlca) throws Exception;

}
