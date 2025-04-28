package com.cloudframe.app.repository;

import com.cloudframe.app.d529351u.dto.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface D529351uRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm workArea
* @parm sqlca
* @parm dclfeSpiPlnVar
     * @return 
     */
    public ResultSet openCsplnvD529351u(WorkArea workArea, Sqlca sqlca, DclfeSpiPlnVar dclfeSpiPlnVar) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCsplnv
* @parm sqlca
     */
    public void fetchCsplnvD529351u(ResultSet csplnvResultSet, HvHostVariablesCsplnv hvHostVariablesCsplnv, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsplnvD529351u(ResultSet csplnvResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleFrToSvc
     * @return 
     */
    public ResultSet openCsfrtoD529351u(Sqlca sqlca, DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvHostVariablesCsfrto
     */
    public void fetchCsfrtoD529351u(ResultSet csfrtoResultSet, Sqlca sqlca, HvHostVariablesCsfrto hvHostVariablesCsfrto) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsfrtoD529351u(ResultSet csfrtoResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleProvTyp
     * @return 
     */
    public ResultSet openCsptypD529351u(Sqlca sqlca, DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleProvTyp
     */
    public void fetchCsptypD529351u(ResultSet csptypResultSet, Sqlca sqlca, DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsptypD529351u(ResultSet csptypResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm lstIcdKey
* @parm dclfeSpiRuleIcd
* @parm testVariables
* @parm sqlca
     * @return 
     */
    public ResultSet openCsicdD529351u(LstIcdKey lstIcdKey, DclfeSpiRuleIcd dclfeSpiRuleIcd, TestVariables testVariables, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCsicdo
* @parm sqlca
     */
    public void fetchCsicdD529351u(ResultSet csicdResultSet, HvHostVariablesCsicdo hvHostVariablesCsicdo, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsicdD529351u(ResultSet csicdResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleFrCondPos
     * @return 
     */
    public ResultSet openCsfcndD529351u(Sqlca sqlca, DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleFrCondPos
     */
    public void fetchCsfcndD529351u(ResultSet csfcndResultSet, Sqlca sqlca, DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsfcndD529351u(ResultSet csfcndResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dclfeSpiRuleCaus
* @parm sqlca
     */
    public void selectFeSpiRuleCaus(DclfeSpiRuleCaus dclfeSpiRuleCaus, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleIpa
     */
    public void selectFeSpiRuleIpa(Sqlca sqlca, DclfeSpiRuleIpa dclfeSpiRuleIpa) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleFrToSvc
     * @return 
     */
    public ResultSet openSvcMainCsrD529351u(Sqlca sqlca, DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesSvcmain
* @parm sqlca
     */
    public void fetchSvcMainCsrD529351u(ResultSet svcMainCsrResultSet, HvHostVariablesSvcmain hvHostVariablesSvcmain, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeSvcMainCsrD529351u(ResultSet svcMainCsrResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleCaus
* @parm testVariables
* @parm sqlca
* @parm dclfeSpiRuleProvTyp
* @parm dclfeSpiRuleIpa
* @parm dclfeSpiRuleCpeFlg
* @parm dclfeSpiRuleFrCondPos
     * @return 
     */
    public ResultSet openCombCurD529351u(DclfeSpiRuleCaus dclfeSpiRuleCaus, TestVariables testVariables, Sqlca sqlca, DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp, DclfeSpiRuleIpa dclfeSpiRuleIpa, DclfeSpiRuleCpeFlg dclfeSpiRuleCpeFlg, DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvHostVariablesCombcr
     */
    public void fetchCombCurD529351u(ResultSet combCurResultSet, Sqlca sqlca, HvHostVariablesCombcr hvHostVariablesCombcr) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCombCurD529351u(ResultSet combCurResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm lstIcdKey
* @parm dclfeSpiRuleIcd
* @parm testVariables
* @parm sqlca
     * @return 
     */
    public ResultSet openCsicdFirst9999SpiD529351u(LstIcdKey lstIcdKey, DclfeSpiRuleIcd dclfeSpiRuleIcd, TestVariables testVariables, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCsicdo
* @parm sqlca
     */
    public void fetchCsicdFirst9999SpiD529351u(ResultSet csicdFirst9999SpiResultSet, HvHostVariablesCsicdo hvHostVariablesCsicdo, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsicdFirst9999SpiD529351u(ResultSet csicdFirst9999SpiResultSet, Sqlca sqlca) throws Exception;

}
