package com.cloudframe.app.repository;

import com.cloudframe.app.ar640010.dto.*;
import com.cloudframe.app.data.Field;


public interface Ar640010Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm itaraxtk
* @parm taraxtk
* @parm sqlca
* @parm messages600
     */
    public void selectTaraxtk(Itaraxtk itaraxtk, Taraxtk taraxtk, Sqlca sqlca, Messages600 messages600) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm reqWorkAreas810
* @parm tarafxs
     */
    public void openFxsFiforetrRowAr640010(Sqlca sqlca, ReqWorkAreas810 reqWorkAreas810, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm reqWorkAreas810
* @parm tarafxs
     */
    public void openFxsRetrieveRowAr640010(Sqlca sqlca, ReqWorkAreas810 reqWorkAreas810, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm itarafxs
* @parm tarafxs
     */
    public void fetchFxsFiforetrRowAr640010(Sqlca sqlca, Itarafxs itarafxs, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm itarafxs
* @parm tarafxs
     */
    public void fetchFxsRetrieveRowAr640010(Sqlca sqlca, Itarafxs itarafxs, Tarafxs tarafxs) throws Exception;

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
     * @parm sqlca
* @parm itarafxs
* @parm tarafxs
     */
    public void selectTarafxs1(Sqlca sqlca, Itarafxs itarafxs, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm itarafxs
* @parm tarafxs
     */
    public void selectTarafxs12(Sqlca sqlca, Itarafxs itarafxs, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm taraefp
     */
    public void openEfpBulkRowAr640010(Sqlca sqlca, Taraefp taraefp) throws Exception;

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
* @parm reqWorkAreas810
* @parm sqlWorkAreas840
* @parm tarafxs
* @parm characterLiterals320
     */
    public void selectTarafxs13(Sqlca sqlca, ReqWorkAreas810 reqWorkAreas810, SqlWorkAreas840 sqlWorkAreas840, Tarafxs tarafxs, CharacterLiterals320 characterLiterals320) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm itarafxs
* @parm tarafxs
     */
    public void selectTarafxs14(Sqlca sqlca, Itarafxs itarafxs, Tarafxs tarafxs) throws Exception;

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
     * @parm itarafxa
* @parm tarafxa
* @parm sqlca
     */
    public void fetchFxaResetRowAr640010(Itarafxa itarafxa, Tarafxa tarafxa, Sqlca sqlca) throws Exception;

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
     * @parm sqlca
* @parm itarafxs
* @parm tarafxs
     */
    public void fetchFxsInstallRowAr640010(Sqlca sqlca, Itarafxs itarafxs, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeFxsInstallRowAr640010(Sqlca sqlca) throws Exception;

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
     * @parm sqlca
* @parm dynamWorkAreas850
* @parm tarafxs
     */
    public void selectTarafxs15(Sqlca sqlca, DynamWorkAreas850 dynamWorkAreas850, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm itaraefp
* @parm sqlca
* @parm taraefp
     */
    public void fetchEfpBulkRowAr640010(Itaraefp itaraefp, Sqlca sqlca, Taraefp taraefp) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm itarafxs
* @parm sqlWorkAreas840
* @parm tarafxs
     */
    public void updateTarafxs1(Sqlca sqlca, Itarafxs itarafxs, SqlWorkAreas840 sqlWorkAreas840, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm itarafxs
* @parm tarafxs
     */
    public void insertTarafxs1(Sqlca sqlca, Itarafxs itarafxs, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm itaraefp
* @parm sqlca
* @parm taraefp
     */
    public void selectTaraefp1(Itaraefp itaraefp, Sqlca sqlca, Taraefp taraefp) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm taraept
* @parm sqlca
* @parm itaraept
     */
    public void selectTaraept1(Taraept taraept, Sqlca sqlca, Itaraept itaraept) throws Exception;

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
