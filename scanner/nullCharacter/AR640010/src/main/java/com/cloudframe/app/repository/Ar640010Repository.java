package com.cloudframe.app.repository;

import com.cloudframe.app.ar640010.dto.*;
import com.cloudframe.app.data.Field;


public interface Ar640010Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm itaraxtk
* @parm taraxtk
* @parm messages600
     */
    public void selectTaraxtk(Sqlca sqlca, Itaraxtk itaraxtk, Taraxtk taraxtk, Messages600 messages600) throws Exception;

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
     * @parm tarafxs
* @parm sqlca
* @parm itarafxs
     */
    public void fetchFxsFiforetrRowAr640010(Tarafxs tarafxs, Sqlca sqlca, Itarafxs itarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm tarafxs
* @parm sqlca
* @parm itarafxs
     */
    public void fetchFxsRetrieveRowAr640010(Tarafxs tarafxs, Sqlca sqlca, Itarafxs itarafxs) throws Exception;

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
     * @parm tarafxs
* @parm sqlca
* @parm itarafxs
     */
    public void selectTarafxs1(Tarafxs tarafxs, Sqlca sqlca, Itarafxs itarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tarafxs
* @parm sqlca
* @parm itarafxs
     */
    public void selectTarafxs12(Tarafxs tarafxs, Sqlca sqlca, Itarafxs itarafxs) throws Exception;

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
     * @parm reqWorkAreas810
* @parm tarafxs
* @parm sqlca
* @parm sqlWorkAreas840
* @parm characterLiterals320
     */
    public void selectTarafxs13(ReqWorkAreas810 reqWorkAreas810, Tarafxs tarafxs, Sqlca sqlca, SqlWorkAreas840 sqlWorkAreas840, CharacterLiterals320 characterLiterals320) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tarafxs
* @parm sqlca
* @parm itarafxs
     */
    public void selectTarafxs14(Tarafxs tarafxs, Sqlca sqlca, Itarafxs itarafxs) throws Exception;

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
     * @parm sqlca
* @parm tarafxa
* @parm itarafxa
     */
    public void fetchFxaResetRowAr640010(Sqlca sqlca, Tarafxa tarafxa, Itarafxa itarafxa) throws Exception;

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
     * @parm tarafxs
* @parm sqlca
* @parm itarafxs
     */
    public void fetchFxsInstallRowAr640010(Tarafxs tarafxs, Sqlca sqlca, Itarafxs itarafxs) throws Exception;

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
     * @parm tarafxs
* @parm sqlca
* @parm dynamWorkAreas850
     */
    public void selectTarafxs15(Tarafxs tarafxs, Sqlca sqlca, DynamWorkAreas850 dynamWorkAreas850) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm taraefp
* @parm itaraefp
     */
    public void fetchEfpBulkRowAr640010(Sqlca sqlca, Taraefp taraefp, Itaraefp itaraefp) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tarafxs
* @parm sqlca
* @parm sqlWorkAreas840
* @parm itarafxs
     */
    public void updateTarafxs1(Tarafxs tarafxs, Sqlca sqlca, SqlWorkAreas840 sqlWorkAreas840, Itarafxs itarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tarafxs
* @parm sqlca
* @parm itarafxs
     */
    public void insertTarafxs1(Tarafxs tarafxs, Sqlca sqlca, Itarafxs itarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm taraefp
* @parm itaraefp
     */
    public void selectTaraefp1(Sqlca sqlca, Taraefp taraefp, Itaraefp itaraefp) throws Exception;

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
