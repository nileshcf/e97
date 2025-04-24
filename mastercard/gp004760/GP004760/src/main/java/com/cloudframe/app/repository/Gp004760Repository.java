package com.cloudframe.app.repository;

import com.cloudframe.app.gp004760.dto.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface Gp004760Repository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     * @return 
     */
    public ResultSet openCabtccextCsrGp004760(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm tgpaitb
     */
    public void fetchCabtccextCsrGp004760(ResultSet cabtccextCsrResultSet, Sqlca sqlca, Tgpaitb tgpaitb) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCabtccextCsrGp004760(ResultSet cabtccextCsrResultSet, Sqlca sqlca) throws Exception;

}
