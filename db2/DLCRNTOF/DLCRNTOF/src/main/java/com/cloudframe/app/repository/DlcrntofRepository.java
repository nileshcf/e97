package com.cloudframe.app.repository;

import com.cloudframe.app.dlcrntof.dto.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface DlcrntofRepository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
     */
    public void insertTbdemsec(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcltbdelsec
* @parm sqlca
     * @return 
     */
    public ResultSet openSecCursorDlcrntof(Dcltbdelsec dcltbdelsec, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dcltbdelsec
* @parm sqlca
     */
    public void fetchSecCursorDlcrntof(ResultSet secCursorResultSet, Dcltbdelsec dcltbdelsec, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
     */
    public void deleteTbdelsec(ResultSet secCursorResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
     */
    public void deleteTbdelsec1(ResultSet secCursorResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeSecCursorDlcrntof(ResultSet secCursorResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm work
     */
    public void selectTbdelsec(Sqlca sqlca, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
     */
    public void deleteTbdelsec2(Sqlca sqlca) throws Exception;

}
