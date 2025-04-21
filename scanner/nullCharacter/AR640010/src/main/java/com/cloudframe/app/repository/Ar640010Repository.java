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
* @parm sqlca
* @parm tarafxs
     */
    public void openFxsFiforetrRowAr640010(ReqWorkAreas810 reqWorkAreas810, Sqlca sqlca, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm reqWorkAreas810
* @parm sqlca
* @parm tarafxs
     */
    public void openFxsRetrieveRowAr640010(ReqWorkAreas810 reqWorkAreas810, Sqlca sqlca, Tarafxs tarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm tarafxs
* @parm itarafxs
     */
    public void fetchFxsFiforetrRowAr640010(Sqlca sqlca, Tarafxs tarafxs, Itarafxs itarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm tarafxs
* @parm itarafxs
     */
    public void fetchFxsRetrieveRowAr640010(Sqlca sqlca, Tarafxs tarafxs, Itarafxs itarafxs) throws Exception;

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
* @parm tarafxs
* @parm itarafxs
     */
    public void selectTarafxs1(Sqlca sqlca, Tarafxs tarafxs, Itarafxs itarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm tarafxs
* @parm itarafxs
     */
    public void selectTarafxs12(Sqlca sqlca, Tarafxs tarafxs, Itarafxs itarafxs) throws Exception;

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
* @parm sqlca
* @parm characterLiterals320
* @parm tarafxs
* @parm sqlWorkAreas840
     */
    public void selectTarafxs13(ReqWorkAreas810 reqWorkAreas810, Sqlca sqlca, CharacterLiterals320 characterLiterals320, Tarafxs tarafxs, SqlWorkAreas840 sqlWorkAreas840) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm tarafxs
* @parm itarafxs
     */
    public void selectTarafxs14(Sqlca sqlca, Tarafxs tarafxs, Itarafxs itarafxs) throws Exception;

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
     * @parm sqlca
* @parm itarafxa
* @parm tarafxa
     */
    public void fetchFxaResetRowAr640010(Sqlca sqlca, Itarafxa itarafxa, Tarafxa tarafxa) throws Exception;

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
* @parm tarafxs
* @parm itarafxs
     */
    public void fetchFxsInstallRowAr640010(Sqlca sqlca, Tarafxs tarafxs, Itarafxs itarafxs) throws Exception;

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
     * @parm sqlca
* @parm itarafpl
* @parm tarafpl
     */
    public void selectTarafpl1(Sqlca sqlca, Itarafpl itarafpl, Tarafpl tarafpl) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm tarafxs
* @parm dynamWorkAreas850
     */
    public void selectTarafxs15(Sqlca sqlca, Tarafxs tarafxs, DynamWorkAreas850 dynamWorkAreas850) throws Exception;

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
     * @parm sqlca
* @parm tarafxs
* @parm sqlWorkAreas840
* @parm itarafxs
     */
    public void updateTarafxs1(Sqlca sqlca, Tarafxs tarafxs, SqlWorkAreas840 sqlWorkAreas840, Itarafxs itarafxs) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm tarafxs
* @parm itarafxs
     */
    public void insertTarafxs1(Sqlca sqlca, Tarafxs tarafxs, Itarafxs itarafxs) throws Exception;

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
     * @parm taraept
* @parm itaraept
* @parm sqlca
     */
    public void selectTaraept1(Taraept taraept, Itaraept itaraept, Sqlca sqlca) throws Exception;

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
