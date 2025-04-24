package com.cloudframe.app.repository;

import com.cloudframe.app.bm80022.dto.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface Bm80022Repository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     * @return 
     */
    public ResultSet openCurGe18Bm80022(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm ge1801Array
     */
    public void fetchCurGe18Bm80022(ResultSet curGe18ResultSet, Sqlca sqlca, Ge1801Array ge1801Array) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCurGe18Bm80022(ResultSet curGe18ResultSet, Sqlca sqlca) throws Exception;

}
