package com.cloudframe.app.repository;

import com.cloudframe.app.d529351u.dto.*;
import com.cloudframe.app.data.Field;


public interface D529351uRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm workArea
* @parm dclfeSpiPlnVar
* @parm sqlca
     */
    public void openCsplnvD529351u(WorkArea workArea, DclfeSpiPlnVar dclfeSpiPlnVar, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCsplnv
* @parm sqlca
     */
    public void fetchCsplnvD529351u(HvHostVariablesCsplnv hvHostVariablesCsplnv, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsplnvD529351u(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleFrToSvc
     */
    public void openCsfrtoD529351u(Sqlca sqlca, DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvHostVariablesCsfrto
     */
    public void fetchCsfrtoD529351u(Sqlca sqlca, HvHostVariablesCsfrto hvHostVariablesCsfrto) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsfrtoD529351u(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleProvTyp
     */
    public void openCsptypD529351u(Sqlca sqlca, DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleProvTyp
     */
    public void fetchCsptypD529351u(Sqlca sqlca, DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsptypD529351u(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleIcd
* @parm lstIcdKey
* @parm testVariables
     */
    public void openCsicdD529351u(Sqlca sqlca, DclfeSpiRuleIcd dclfeSpiRuleIcd, LstIcdKey lstIcdKey, TestVariables testVariables) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvHostVariablesCsicdo
     */
    public void fetchCsicdD529351u(Sqlca sqlca, HvHostVariablesCsicdo hvHostVariablesCsicdo) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsicdD529351u(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleFrCondPos
* @parm sqlca
     */
    public void openCsfcndD529351u(DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dclfeSpiRuleFrCondPos
* @parm sqlca
     */
    public void fetchCsfcndD529351u(DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsfcndD529351u(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleCaus
     */
    public void selectFeSpiRuleCaus(Sqlca sqlca, DclfeSpiRuleCaus dclfeSpiRuleCaus) throws Exception;

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
     */
    public void openSvcMainCsrD529351u(Sqlca sqlca, DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvHostVariablesSvcmain
     */
    public void fetchSvcMainCsrD529351u(Sqlca sqlca, HvHostVariablesSvcmain hvHostVariablesSvcmain) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeSvcMainCsrD529351u(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleFrCondPos
* @parm sqlca
* @parm dclfeSpiRuleCaus
* @parm dclfeSpiRuleIpa
* @parm dclfeSpiRuleCpeFlg
* @parm testVariables
* @parm dclfeSpiRuleProvTyp
     */
    public void openCombCurD529351u(DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos, Sqlca sqlca, DclfeSpiRuleCaus dclfeSpiRuleCaus, DclfeSpiRuleIpa dclfeSpiRuleIpa, DclfeSpiRuleCpeFlg dclfeSpiRuleCpeFlg, TestVariables testVariables, DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCombcr
* @parm sqlca
     */
    public void fetchCombCurD529351u(HvHostVariablesCombcr hvHostVariablesCombcr, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCombCurD529351u(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleIcd
* @parm lstIcdKey
* @parm testVariables
     */
    public void openCsicdFirst9999SpiD529351u(Sqlca sqlca, DclfeSpiRuleIcd dclfeSpiRuleIcd, LstIcdKey lstIcdKey, TestVariables testVariables) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvHostVariablesCsicdo
     */
    public void fetchCsicdFirst9999SpiD529351u(Sqlca sqlca, HvHostVariablesCsicdo hvHostVariablesCsicdo) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsicdFirst9999SpiD529351u(Sqlca sqlca) throws Exception;

}
