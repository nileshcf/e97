package com.cloudframe.app.repository;

import com.cloudframe.app.db2funci.dto.*;
import com.cloudframe.app.data.Field;


public interface Db2funciRepository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dateFields
     */
    public void selectTbdemsec(Sqlca sqlca, DateFields dateFields) throws Exception;

    /**
     * This method will handle the sql operations for a stored-procedure query.
     *
     * @parm sqlca
* @parm parmlstGroup
* @parm work
     */
    public void call(Sqlca sqlca, ParmlstGroup parmlstGroup, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm work
     */
    public void associate(Sqlca sqlca, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm work
     */
    public void allocate(Sqlca sqlca, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dcltbdemsec
     */
    public void fetchC1Db2funci(Sqlca sqlca, Dcltbdemsec dcltbdemsec) throws Exception;

    /**
     * This method will handle the sql operations for a stored-procedure query.
     *
     * @parm sqlca
* @parm sdms01Parm
     */
    public void call1(Sqlca sqlca, Sdms01Parm sdms01Parm) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm applicationCodeListGroup
* @parm hostVariables
* @parm dclscpsectb
     */
    public void openPositionCursorDb2funci(Sqlca sqlca, ApplicationCodeListGroup applicationCodeListGroup, HostVariables hostVariables, Dclscpsectb dclscpsectb) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dateFields
     */
    public void selectSysdummy1(Sqlca sqlca, DateFields dateFields) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm bdms01CallParameters
* @parm db2Indicators
* @parm dclvmstranb
     */
    public void selectTmasterAdpNumber(Sqlca sqlca, Bdms01CallParameters bdms01CallParameters, Db2Indicators db2Indicators, Dclvmstranb dclvmstranb) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dclvcrrexrt
     */
    public void selectTcrrncyExchRate(Sqlca sqlca, Dclvcrrexrt dclvcrrexrt) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dclvmsdxrfk
     */
    public void openXrefCursorDb2funci(Sqlca sqlca, Dclvmsdxrfk dclvmsdxrfk) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dclvmsdxrfk
     */
    public void fetchXrefCursorDb2funci(Sqlca sqlca, Dclvmsdxrfk dclvmsdxrfk) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeXrefCursorDb2funci(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openIsinCursorDb2funci(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dcltbdemsec
     */
    public void fetchIsinCursorDb2funci(Sqlca sqlca, Dcltbdemsec dcltbdemsec) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbdemsec
     */
    public void updateTbdemsec(Sqlca sqlca, Dcltbdemsec dcltbdemsec) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbdemsec
     */
    public void updateTbdemsec1(Sqlca sqlca, Dcltbdemsec dcltbdemsec) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbdemsec
     */
    public void selectTbdemsec1(Sqlca sqlca, Dcltbdemsec dcltbdemsec) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeIsinCursorDb2funci(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm db2Indicators
* @parm work
* @parm dclvbsscrdt
     */
    public void selectTbaseSecurityDat(Sqlca sqlca, Db2Indicators db2Indicators, Work work, Dclvbsscrdt dclvbsscrdt) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm work
     */
    public void selectScholitb(Sqlca sqlca, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm work
     */
    public void selectScholitb1(Sqlca sqlca, Work work) throws Exception;

}
