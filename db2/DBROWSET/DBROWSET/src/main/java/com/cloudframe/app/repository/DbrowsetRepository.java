package com.cloudframe.app.repository;

import com.cloudframe.app.dbrowset.dto.*;
import com.cloudframe.app.data.Field;


public interface DbrowsetRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openSecCursorDbrowset(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm misc
* @parm secTable
* @parm sqlca
     */
    public void fetchSecCursorDbrowset(Misc misc, SecTable secTable, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeSecCursorDbrowset(Sqlca sqlca) throws Exception;

}
