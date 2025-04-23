package com.cloudframe.app.repository;

import com.cloudframe.app.cfbooksl.dto.*;
import com.cloudframe.app.data.Field;


public interface CfbookslRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openBookscurCfbooksl(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeBookscurCfbooksl(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dclbooks
* @parm nullvars
     */
    public void fetchBookscurCfbooksl(Sqlca sqlca, Dclbooks dclbooks, Nullvars nullvars) throws Exception;

}
