package com.cloudframe.app.repository;

import com.cloudframe.app.crntof.dto.*;
import com.cloudframe.app.data.Field;


public interface CrntofRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openPmaCursorCrntof(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm crntofTable
* @parm sqlca
     */
    public void fetchPmaCursorCrntof(CrntofTable crntofTable, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm crntofTable
* @parm sqlca
     */
    public void updateCrntof(CrntofTable crntofTable, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm crntofTable
* @parm sqlca
     */
    public void updateCrntof1(CrntofTable crntofTable, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm crntofTable
* @parm sqlca
     */
    public void updateCrntof2(CrntofTable crntofTable, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm crntofTable
* @parm sqlca
     */
    public void updateCrntof3(CrntofTable crntofTable, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closePmaCursorCrntof(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openPmaCursor2Crntof(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm crntofTable
* @parm sqlca
     */
    public void fetchPmaCursor2Crntof(CrntofTable crntofTable, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm crntofTable
* @parm sqlca
     */
    public void updateCrntof4(CrntofTable crntofTable, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm crntofTable
* @parm sqlca
     */
    public void updateCrntof5(CrntofTable crntofTable, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm crntofTable
* @parm sqlca
     */
    public void updateCrntof6(CrntofTable crntofTable, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm crntofTable
* @parm sqlca
     */
    public void updateCrntof7(CrntofTable crntofTable, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closePmaCursor2Crntof(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openPmaCursor3Crntof(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm crntofTable
* @parm sqlca
     */
    public void fetchPmaCursor3Crntof(CrntofTable crntofTable, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closePmaCursor3Crntof(Sqlca sqlca) throws Exception;

}
