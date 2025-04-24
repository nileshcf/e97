package com.cloudframe.app.repository;

import com.cloudframe.app.ip343690.dto.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface Ip343690Repository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm tipapma
* @parm sqlca
     * @return 
     */
    public ResultSet openPmaCursorIp343690(Tipapma tipapma, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm tipapma
* @parm sqlca
     */
    public void fetchPmaCursorIp343690(ResultSet pmaCursorResultSet, Tipapma tipapma, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closePmaCursorIp343690(ResultSet pmaCursorResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm tipapma
* @parm itipapma
* @parm sqlca
     */
    public void updateTipapma1(ResultSet pmaCursorResultSet, Tipapma tipapma, Itipapma itipapma, Sqlca sqlca) throws Exception;

}
