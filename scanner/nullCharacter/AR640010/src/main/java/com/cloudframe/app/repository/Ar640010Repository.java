package com.cloudframe.app.repository;

import com.cloudframe.app.ar640010.dto.*;
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
* @parm itarafxs
* @parm sqlca
     */
    public void fetchFxsFiforetrRowAr640010(Tarafxs tarafxs, Itarafxs itarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm tarafxs
* @parm itarafxs
* @parm sqlca
     */
    public void fetchFxsRetrieveRowAr640010(Tarafxs tarafxs, Itarafxs itarafxs, Sqlca sqlca) throws Exception;

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
* @parm itarafxs
* @parm sqlca
     */
    public void selectTarafxs1(Tarafxs tarafxs, Itarafxs itarafxs, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tarafxs
* @parm itarafxs
* @parm sqlca
     */
    public void selectTarafxs12(Tarafxs tarafxs, Itarafxs itarafxs, Sqlca sqlca) throws Exception;

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
     * @parm reqWorkAreas810
* @parm tarafxs
* @parm characterLiterals320
* @parm sqlWorkAreas840
* @parm sqlca
     */
    public void selectTarafxs13(ReqWorkAreas810 reqWorkAreas810, Tarafxs tarafxs, CharacterLiterals320 characterLiterals320, SqlWorkAreas840 sqlWorkAreas840, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tarafxs
* @parm itarafxs
* @parm sqlca
     */
    public void selectTarafxs14(Tarafxs tarafxs, Itarafxs itarafxs, Sqlca sqlca) throws Exception;

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
     * @parm tarafxs
* @parm itarafxs
* @parm sqlca
     */
    public void fetchFxsInstallRowAr640010(Tarafxs tarafxs, Itarafxs itarafxs, Sqlca sqlca) throws Exception;

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
     * @parm itarafpl
* @parm sqlca
* @parm tarafpl
     */
    public void selectTarafpl1(Itarafpl itarafpl, Sqlca sqlca, Tarafpl tarafpl) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tarafxs
* @parm dynamWorkAreas850
* @parm sqlca
     */
    public void selectTarafxs15(Tarafxs tarafxs, DynamWorkAreas850 dynamWorkAreas850, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm taraefp
* @parm itaraefp
* @parm sqlca
     */
    public void fetchEfpBulkRowAr640010(Taraefp taraefp, Itaraefp itaraefp, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tarafxs
* @parm itarafxs
* @parm sqlWorkAreas840
* @parm sqlca
     */
    public void updateTarafxs1(Tarafxs tarafxs, Itarafxs itarafxs, SqlWorkAreas840 sqlWorkAreas840, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tarafxs
* @parm itarafxs
* @parm sqlca
     */
    public void insertTarafxs1(Tarafxs tarafxs, Itarafxs itarafxs, Sqlca sqlca) throws Exception;

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
     * @parm itaraept
* @parm taraept
* @parm sqlca
     */
    public void selectTaraept1(Itaraept itaraept, Taraept taraept, Sqlca sqlca) throws Exception;

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
