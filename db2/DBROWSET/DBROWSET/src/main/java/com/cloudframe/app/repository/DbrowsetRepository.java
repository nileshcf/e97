package com.cloudframe.app.repository;

import com.cloudframe.app.dbrowset.dto.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface DbrowsetRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     * @return 
     */
    public ResultSet openSecCursorDbrowset(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm misc
* @parm sqlca
* @parm secTable
     */
    public void fetchSecCursorDbrowset(ResultSet secCursorResultSet, Misc misc, Sqlca sqlca, SecTable secTable) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeSecCursorDbrowset(ResultSet secCursorResultSet, Sqlca sqlca) throws Exception;

}
