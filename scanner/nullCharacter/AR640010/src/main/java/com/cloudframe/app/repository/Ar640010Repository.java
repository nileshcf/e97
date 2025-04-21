package com.cloudframe.app.repository;

import com.cloudframe.app.ar640010.dto.*;
import com.cloudframe.app.data.Field;


public interface Ar640010Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm taraxtk
* @parm sqlca
* @parm itaraxtk
* @parm messages600
     */
    public void selectTaraxtk(Taraxtk taraxtk, Sqlca sqlca, Itaraxtk itaraxtk, Messages600 messages600) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm reqWorkAreas810
* @parm tarafxs
* @parm sqlca
     */
    public void openFxsFiforetrRowAr640010(ReqWorkAreas810 reqWorkAreas810, Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm reqWorkAreas810
* @parm tarafxs
* @parm sqlca
     */
    public void openFxsRetrieveRowAr640010(ReqWorkAreas810 reqWorkAreas810, Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm itarafxs
* @parm tarafxs
* @parm sqlca
     */
    public void fetchFxsFiforetrRowAr640010(Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm itarafxs
* @parm tarafxs
* @parm sqlca
     */
    public void fetchFxsRetrieveRowAr640010(Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeFxsFiforetrRowAr640010(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeFxsRetrieveRowAr640010(Sqlca sqlca) throws Exception;

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
     */
    public void openEfpBulkRowAr640010(Taraefp taraefp, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeEfpBulkRowAr640010(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlWorkAreas840
* @parm reqWorkAreas810
* @parm tarafxs
* @parm sqlca
* @parm characterLiterals320
     */
    public void selectTarafxs13(SqlWorkAreas840 sqlWorkAreas840, ReqWorkAreas810 reqWorkAreas810, Tarafxs tarafxs, Sqlca sqlca, CharacterLiterals320 characterLiterals320) throws Exception;

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
     */
    public void openFxaResetRowAr640010(Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm tarafxa
* @parm itarafxa
* @parm sqlca
     */
    public void fetchFxaResetRowAr640010(Tarafxa tarafxa, Itarafxa itarafxa, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeFxaResetRowAr640010(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm tarafxs
* @parm sqlca
     */
    public void openFxsInstallRowAr640010(Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm itarafxs
* @parm tarafxs
* @parm sqlca
     */
    public void fetchFxsInstallRowAr640010(Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeFxsInstallRowAr640010(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm connectDatabaseMsg630
* @parm sqlca
     */
    public void release(ConnectDatabaseMsg630 connectDatabaseMsg630, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm tarafpl
* @parm itarafpl
     */
    public void selectTarafpl1(Sqlca sqlca, Tarafpl tarafpl, Itarafpl itarafpl) throws Exception;

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
     * @parm itaraefp
* @parm taraefp
* @parm sqlca
     */
    public void fetchEfpBulkRowAr640010(Itaraefp itaraefp, Taraefp taraefp, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlWorkAreas840
* @parm itarafxs
* @parm tarafxs
* @parm sqlca
     */
    public void updateTarafxs1(SqlWorkAreas840 sqlWorkAreas840, Itarafxs itarafxs, Tarafxs tarafxs, Sqlca sqlca) throws Exception;

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
     * @parm itaraefp
* @parm taraefp
* @parm sqlca
     */
    public void selectTaraefp1(Itaraefp itaraefp, Taraefp taraefp, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm taraept
* @parm itaraept
     */
    public void selectTaraept1(Sqlca sqlca, Taraept taraept, Itaraept itaraept) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm reqWorkAreas810
* @parm sqlca
* @parm tarafpl
     */
    public void selectTaraept12(ReqWorkAreas810 reqWorkAreas810, Sqlca sqlca, Tarafpl tarafpl) throws Exception;

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
