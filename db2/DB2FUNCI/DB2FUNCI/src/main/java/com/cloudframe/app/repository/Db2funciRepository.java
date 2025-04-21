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
     * @parm work
* @parm sqlca
* @parm parmlstGroup
     */
    public void call(Work work, Sqlca sqlca, ParmlstGroup parmlstGroup) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm work
* @parm sqlca
     */
    public void associate(Work work, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm work
* @parm sqlca
     */
    public void allocate(Work work, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dcltbdemsec
* @parm sqlca
     */
    public void fetchC1Db2funci(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception;

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
     * @parm dclscpsectb
* @parm hostVariables
* @parm sqlca
* @parm applicationCodeListGroup
     */
    public void openPositionCursorDb2funci(Dclscpsectb dclscpsectb, HostVariables hostVariables, Sqlca sqlca, ApplicationCodeListGroup applicationCodeListGroup) throws Exception;

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
* @parm dclvmstranb
* @parm bdms01CallParameters
* @parm db2Indicators
     */
    public void selectTmasterAdpNumber(Sqlca sqlca, Dclvmstranb dclvmstranb, Bdms01CallParameters bdms01CallParameters, Db2Indicators db2Indicators) throws Exception;

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
     * @parm dcltbdemsec
* @parm sqlca
     */
    public void fetchIsinCursorDb2funci(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbdemsec
* @parm sqlca
     */
    public void updateTbdemsec(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbdemsec
* @parm sqlca
     */
    public void updateTbdemsec1(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbdemsec
* @parm sqlca
     */
    public void selectTbdemsec1(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeIsinCursorDb2funci(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm work
* @parm sqlca
* @parm dclvbsscrdt
* @parm db2Indicators
     */
    public void selectTbaseSecurityDat(Work work, Sqlca sqlca, Dclvbsscrdt dclvbsscrdt, Db2Indicators db2Indicators) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm work
* @parm sqlca
     */
    public void selectScholitb(Work work, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm work
* @parm sqlca
     */
    public void selectScholitb1(Work work, Sqlca sqlca) throws Exception;

}
