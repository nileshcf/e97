package com.cloudframe.app.repository;

import com.cloudframe.app.ar640010.dto.*;
import com.cloudframe.app.data.Field;


public interface Ar640010Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm messages600
* @parm itaraxtk
* @parm taraxtk
     */
    public void selectTaraxtk(Sqlca sqlca, Messages600 messages600, Itaraxtk itaraxtk, Taraxtk taraxtk) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm tarafxs
* @parm reqWorkAreas810
     */
    public void openFxsFiforetrRowAr640010(Sqlca sqlca, Tarafxs tarafxs, ReqWorkAreas810 reqWorkAreas810) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm tarafxs
* @parm reqWorkAreas810
     */
    public void openFxsRetrieveRowAr640010(Sqlca sqlca, Tarafxs tarafxs, ReqWorkAreas810 reqWorkAreas810) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm itarafxs
* @parm sqlca
* @parm tarafxs
     */
    public void fetchFxsFiforetrRowAr640010(Itarafxs itarafxs, Sqlca sqlca, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm itarafxs
* @parm sqlca
* @parm tarafxs
     */
    public void fetchFxsRetrieveRowAr640010(Itarafxs itarafxs, Sqlca sqlca, Tarafxs tarafxs) throws Exception;

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
* @parm sqlca
* @parm tarafxs
     */
    public void selectTarafxs1(Itarafxs itarafxs, Sqlca sqlca, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm itarafxs
* @parm sqlca
* @parm tarafxs
     */
    public void selectTarafxs12(Itarafxs itarafxs, Sqlca sqlca, Tarafxs tarafxs) throws Exception;

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
     * @parm sqlca
* @parm sqlWorkAreas840
* @parm tarafxs
* @parm reqWorkAreas810
* @parm characterLiterals320
     */
    public void selectTarafxs13(Sqlca sqlca, SqlWorkAreas840 sqlWorkAreas840, Tarafxs tarafxs, ReqWorkAreas810 reqWorkAreas810, CharacterLiterals320 characterLiterals320) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm itarafxs
* @parm sqlca
* @parm tarafxs
     */
    public void selectTarafxs14(Itarafxs itarafxs, Sqlca sqlca, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm tarafxs
     */
    public void openFxaResetRowAr640010(Sqlca sqlca, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm tarafxa
* @parm sqlca
* @parm itarafxa
     */
    public void fetchFxaResetRowAr640010(Tarafxa tarafxa, Sqlca sqlca, Itarafxa itarafxa) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeFxaResetRowAr640010(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm tarafxs
     */
    public void openFxsInstallRowAr640010(Sqlca sqlca, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm itarafxs
* @parm sqlca
* @parm tarafxs
     */
    public void fetchFxsInstallRowAr640010(Itarafxs itarafxs, Sqlca sqlca, Tarafxs tarafxs) throws Exception;

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
* @parm itarafpl
* @parm tarafpl
     */
    public void selectTarafpl1(Sqlca sqlca, Itarafpl itarafpl, Tarafpl tarafpl) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dynamWorkAreas850
* @parm tarafxs
     */
    public void selectTarafxs15(Sqlca sqlca, DynamWorkAreas850 dynamWorkAreas850, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm taraefp
* @parm sqlca
* @parm itaraefp
     */
    public void fetchEfpBulkRowAr640010(Taraefp taraefp, Sqlca sqlca, Itaraefp itaraefp) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm itarafxs
* @parm sqlca
* @parm sqlWorkAreas840
* @parm tarafxs
     */
    public void updateTarafxs1(Itarafxs itarafxs, Sqlca sqlca, SqlWorkAreas840 sqlWorkAreas840, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm itarafxs
* @parm sqlca
* @parm tarafxs
     */
    public void insertTarafxs1(Itarafxs itarafxs, Sqlca sqlca, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm taraefp
* @parm sqlca
* @parm itaraefp
     */
    public void selectTaraefp1(Taraefp taraefp, Sqlca sqlca, Itaraefp itaraefp) throws Exception;

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
     * @parm sqlca
* @parm tarafpl
* @parm reqWorkAreas810
     */
    public void selectTaraept12(Sqlca sqlca, Tarafpl tarafpl, ReqWorkAreas810 reqWorkAreas810) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm tarafxs
     */
    public void selectTarafxs16(Sqlca sqlca, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm tarasts
     */
    public void selectTarasts(Sqlca sqlca, Tarasts tarasts) throws Exception;

}
