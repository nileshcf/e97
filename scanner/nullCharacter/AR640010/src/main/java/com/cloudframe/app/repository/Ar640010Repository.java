package com.cloudframe.app.repository;

import com.cloudframe.app.ar640010.dto.*;
import com.cloudframe.app.data.Field;


public interface Ar640010Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm messages600
* @parm itaraxtk
* @parm taraxtk
* @parm sqlca
     */
    public void selectTaraxtk(Messages600 messages600, Itaraxtk itaraxtk, Taraxtk taraxtk, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm tarafxs
* @parm reqWorkAreas810
* @parm sqlca
     */
    public void openFxsFiforetrRowAr640010(Tarafxs tarafxs, ReqWorkAreas810 reqWorkAreas810, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm tarafxs
* @parm reqWorkAreas810
* @parm sqlca
     */
    public void openFxsRetrieveRowAr640010(Tarafxs tarafxs, ReqWorkAreas810 reqWorkAreas810, Sqlca sqlca) throws Exception;

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
     * @parm tarafxs
* @parm sqlWorkAreas840
* @parm reqWorkAreas810
* @parm characterLiterals320
* @parm sqlca
     */
    public void selectTarafxs13(Tarafxs tarafxs, SqlWorkAreas840 sqlWorkAreas840, ReqWorkAreas810 reqWorkAreas810, CharacterLiterals320 characterLiterals320, Sqlca sqlca) throws Exception;

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
     * @parm tarafpl
* @parm itarafpl
* @parm sqlca
     */
    public void selectTarafpl1(Tarafpl tarafpl, Itarafpl itarafpl, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dynamWorkAreas850
* @parm tarafxs
* @parm sqlca
     */
    public void selectTarafxs15(DynamWorkAreas850 dynamWorkAreas850, Tarafxs tarafxs, Sqlca sqlca) throws Exception;

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
     * @parm tarafxs
* @parm sqlWorkAreas840
* @parm itarafxs
* @parm sqlca
     */
    public void updateTarafxs1(Tarafxs tarafxs, SqlWorkAreas840 sqlWorkAreas840, Itarafxs itarafxs, Sqlca sqlca) throws Exception;

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
     * @parm itaraefp
* @parm taraefp
* @parm sqlca
     */
    public void selectTaraefp1(Itaraefp itaraefp, Taraefp taraefp, Sqlca sqlca) throws Exception;

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
* @parm reqWorkAreas810
* @parm sqlca
     */
    public void selectTaraept12(Tarafpl tarafpl, ReqWorkAreas810 reqWorkAreas810, Sqlca sqlca) throws Exception;

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
