package com.cloudframe.app.repository;

import com.cloudframe.app.cfbooksl.dto.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface CfbookslRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     * @return 
     */
    public ResultSet openBookscurCfbooksl(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeBookscurCfbooksl(ResultSet bookscurResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm nullvars
* @parm dclbooks
     */
    public void fetchBookscurCfbooksl(ResultSet bookscurResultSet, Sqlca sqlca, Nullvars nullvars, Dclbooks dclbooks) throws Exception;

}
