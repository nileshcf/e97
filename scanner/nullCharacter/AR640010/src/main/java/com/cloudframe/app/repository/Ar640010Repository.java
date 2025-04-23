package com.cloudframe.app.repository;

import com.cloudframe.app.ar640010.dto.*;
import com.cloudframe.app.data.Field;


public interface Ar640010Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm taraxtk
* @parm itaraxtk
* @parm messages600
     */
    public void selectTaraxtk(Sqlca sqlca, Taraxtk taraxtk, Itaraxtk itaraxtk, Messages600 messages600) throws Exception;

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
* @parm characterLiterals320
* @parm tarafxs
* @parm sqlWorkAreas840
* @parm reqWorkAreas810
     */
    public void selectTarafxs13(Sqlca sqlca, CharacterLiterals320 characterLiterals320, Tarafxs tarafxs, SqlWorkAreas840 sqlWorkAreas840, ReqWorkAreas810 reqWorkAreas810) throws Exception;

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
     * @parm sqlca
* @parm tarafpl
* @parm itarafpl
     */
    public void selectTarafpl1(Sqlca sqlca, Tarafpl tarafpl, Itarafpl itarafpl) throws Exception;

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
     * @parm sqlca
* @parm itaraefp
* @parm taraefp
     */
    public void fetchEfpBulkRowAr640010(Sqlca sqlca, Itaraefp itaraefp, Taraefp taraefp) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm itarafxs
* @parm tarafxs
* @parm sqlWorkAreas840
     */
    public void updateTarafxs1(Sqlca sqlca, Itarafxs itarafxs, Tarafxs tarafxs, SqlWorkAreas840 sqlWorkAreas840) throws Exception;

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
     * @parm sqlca
* @parm itaraefp
* @parm taraefp
     */
    public void selectTaraefp1(Sqlca sqlca, Itaraefp itaraefp, Taraefp taraefp) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm itaraept
* @parm sqlca
* @parm taraept
     */
    public void selectTaraept1(Itaraept itaraept, Sqlca sqlca, Taraept taraept) throws Exception;

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
