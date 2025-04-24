package com.cloudframe.app.repository;

import com.cloudframe.app.dbrowst2.dto.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface Dbrowst2Repository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     * @return 
     */
    public ResultSet openSecCursorDbrowst2(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm secTable
     */
    public void fetchSecCursorDbrowst2(ResultSet secCursorResultSet, Sqlca sqlca, SecTable secTable) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeSecCursorDbrowst2(ResultSet secCursorResultSet, Sqlca sqlca) throws Exception;

}
