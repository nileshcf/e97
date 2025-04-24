package com.cloudframe.app.repository;

import com.cloudframe.app.ar640010.dto.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface Ar640010Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm itaraxtk
* @parm messages600
* @parm taraxtk
* @parm sqlca
     */
    public void selectTaraxtk(Itaraxtk itaraxtk, Messages600 messages600, Taraxtk taraxtk, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm tarafxs
* @parm sqlca
* @parm reqWorkAreas810
     * @return 
     */
    public ResultSet openFxsFiforetrRowAr640010(Tarafxs tarafxs, Sqlca sqlca, ReqWorkAreas810 reqWorkAreas810) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm tarafxs
* @parm sqlca
* @parm reqWorkAreas810
     * @return 
     */
    public ResultSet openFxsRetrieveRowAr640010(Tarafxs tarafxs, Sqlca sqlca, ReqWorkAreas810 reqWorkAreas810) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm itarafxs
* @parm tarafxs
* @parm sqlca
     */
    public void fetchFxsFiforetrRowAr640010(ResultSet fxsFiforetrRowResultSet, Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm itarafxs
* @parm tarafxs
* @parm sqlca
     */
    public void fetchFxsRetrieveRowAr640010(ResultSet fxsRetrieveRowResultSet, Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeFxsFiforetrRowAr640010(ResultSet fxsFiforetrRowResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeFxsRetrieveRowAr640010(ResultSet fxsRetrieveRowResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm itarafxs
* @parm tarafxs
* @parm sqlca
     */
    public void selectTarafxs1(Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm itarafxs
* @parm tarafxs
* @parm sqlca
     */
    public void selectTarafxs12(Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm taraefp
* @parm sqlca
     * @return 
     */
    public ResultSet openEfpBulkRowAr640010(Taraefp taraefp, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeEfpBulkRowAr640010(ResultSet efpBulkRowResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tarafxs
* @parm sqlWorkAreas840
* @parm sqlca
* @parm characterLiterals320
* @parm reqWorkAreas810
     */
    public void selectTarafxs13(Tarafxs tarafxs, SqlWorkAreas840 sqlWorkAreas840, Sqlca sqlca, CharacterLiterals320 characterLiterals320, ReqWorkAreas810 reqWorkAreas810) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm itarafxs
* @parm tarafxs
* @parm sqlca
     */
    public void selectTarafxs14(Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm tarafxs
* @parm sqlca
     * @return 
     */
    public ResultSet openFxaResetRowAr640010(Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm itarafxa
* @parm tarafxa
* @parm sqlca
     */
    public void fetchFxaResetRowAr640010(ResultSet fxaResetRowResultSet, Itarafxa itarafxa, Tarafxa tarafxa, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeFxaResetRowAr640010(ResultSet fxaResetRowResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm tarafxs
* @parm sqlca
     * @return 
     */
    public ResultSet openFxsInstallRowAr640010(Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm itarafxs
* @parm tarafxs
* @parm sqlca
     */
    public void fetchFxsInstallRowAr640010(ResultSet fxsInstallRowResultSet, Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeFxsInstallRowAr640010(ResultSet fxsInstallRowResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm connectDatabaseMsg630
     */
    public void release(Sqlca sqlca, ConnectDatabaseMsg630 connectDatabaseMsg630) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm itarafpl
* @parm tarafpl
* @parm sqlca
     */
    public void selectTarafpl1(Itarafpl itarafpl, Tarafpl tarafpl, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tarafxs
* @parm sqlca
* @parm dynamWorkAreas850
     */
    public void selectTarafxs15(Tarafxs tarafxs, Sqlca sqlca, DynamWorkAreas850 dynamWorkAreas850) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm taraefp
* @parm itaraefp
* @parm sqlca
     */
    public void fetchEfpBulkRowAr640010(ResultSet efpBulkRowResultSet, Taraefp taraefp, Itaraefp itaraefp, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm itarafxs
* @parm tarafxs
* @parm sqlWorkAreas840
* @parm sqlca
     */
    public void updateTarafxs1(Itarafxs itarafxs, Tarafxs tarafxs, SqlWorkAreas840 sqlWorkAreas840, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm itarafxs
* @parm tarafxs
* @parm sqlca
     */
    public void insertTarafxs1(Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm taraefp
* @parm itaraefp
* @parm sqlca
     */
    public void selectTaraefp1(Taraefp taraefp, Itaraefp itaraefp, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm itaraept
* @parm taraept
     */
    public void selectTaraept1(Sqlca sqlca, Itaraept itaraept, Taraept taraept) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tarafpl
* @parm sqlca
* @parm reqWorkAreas810
     */
    public void selectTaraept12(Tarafpl tarafpl, Sqlca sqlca, ReqWorkAreas810 reqWorkAreas810) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tarafxs
* @parm sqlca
     */
    public void selectTarafxs16(Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tarasts
* @parm sqlca
     */
    public void selectTarasts(Tarasts tarasts, Sqlca sqlca) throws Exception;

}
