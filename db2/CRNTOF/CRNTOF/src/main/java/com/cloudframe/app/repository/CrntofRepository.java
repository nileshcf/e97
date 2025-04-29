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
     * @parm sqlca
* @parm crntofTable
     */
    public void fetchPmaCursorCrntof(Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void updateCrntof(Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void updateCrntof1(Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void updateCrntof2(Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void updateCrntof3(Sqlca sqlca, CrntofTable crntofTable) throws Exception;

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
     * @parm sqlca
* @parm crntofTable
     */
    public void fetchPmaCursor2Crntof(Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void updateCrntof4(Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void updateCrntof5(Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void updateCrntof6(Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void updateCrntof7(Sqlca sqlca, CrntofTable crntofTable) throws Exception;

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
     * @parm sqlca
* @parm crntofTable
     */
    public void fetchPmaCursor3Crntof(Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closePmaCursor3Crntof(Sqlca sqlca) throws Exception;

}
