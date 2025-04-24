package com.cloudframe.app.repository;

import com.cloudframe.app.crntof.dto.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface CrntofRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     * @return 
     */
    public ResultSet openPmaCursorCrntof(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void fetchPmaCursorCrntof(ResultSet pmaCursorResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void updateCrntof(ResultSet pmaCursorResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void updateCrntof1(ResultSet pmaCursorResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void updateCrntof2(ResultSet pmaCursorResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void updateCrntof3(ResultSet pmaCursorResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closePmaCursorCrntof(ResultSet pmaCursorResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     * @return 
     */
    public ResultSet openPmaCursor2Crntof(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void fetchPmaCursor2Crntof(ResultSet pmaCursor2ResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void updateCrntof4(ResultSet pmaCursor2ResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void updateCrntof5(ResultSet pmaCursor2ResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void updateCrntof6(ResultSet pmaCursor2ResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void updateCrntof7(ResultSet pmaCursor2ResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closePmaCursor2Crntof(ResultSet pmaCursor2ResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     * @return 
     */
    public ResultSet openPmaCursor3Crntof(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm crntofTable
     */
    public void fetchPmaCursor3Crntof(ResultSet pmaCursor3ResultSet, Sqlca sqlca, CrntofTable crntofTable) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closePmaCursor3Crntof(ResultSet pmaCursor3ResultSet, Sqlca sqlca) throws Exception;

}
