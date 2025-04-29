package com.cloudframe.app.repository;

import com.cloudframe.app.dlcrntof.dto.*;
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
     * @parm sqlca
* @parm dcltbdelsec
     */
    public void openSecCursorDlcrntof(Sqlca sqlca, Dcltbdelsec dcltbdelsec) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dcltbdelsec
     */
    public void fetchSecCursorDlcrntof(Sqlca sqlca, Dcltbdelsec dcltbdelsec) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
     */
    public void deleteTbdelsec(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
     */
    public void deleteTbdelsec1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeSecCursorDlcrntof(Sqlca sqlca) throws Exception;

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
