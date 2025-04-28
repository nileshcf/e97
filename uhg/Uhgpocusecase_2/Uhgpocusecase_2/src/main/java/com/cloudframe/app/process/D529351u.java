  package com.cloudframe.app.process;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.d529351u.dto.D51uNonArrayData;
  import com.cloudframe.app.d529351u.dto.DsmCommonArea;
  import com.cloudframe.app.d529351u.dto.D51uKey;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.d529351u.dto.DsmEditErrorValueTxt;
  import com.cloudframe.app.d529351u.dto.DsmSqlErrorMsgArea;
  import com.cloudframe.app.d529351u.dto.Db2ReqDosDateRedefined;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.repository.D529351uRepository;
  import com.cloudframe.app.d529351u.dto.D51uErrorTrace;
  import com.cloudframe.app.d529351u.dto.D51uTableCounts;
  import com.cloudframe.app.d529351u.dto.D51uTestValues;
  import com.cloudframe.app.d529351u.dto.D51uTestDiagArea;
  import com.cloudframe.app.d529351u.dto.TestDiagArea;
  import com.cloudframe.app.d529351u.dto.D51uLstIcdKey;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.d529351u.dto.*;
  import com.cloudframe.app.d529351u.dto.DsmCallArea;
  import com.cloudframe.app.d529351u.dto.Vyspi51uCallArea;
  import com.cloudframe.app.d529351u.dto.WorkArea;
  import com.cloudframe.app.d529351u.dto.Sqlca;
  import com.cloudframe.app.d529351u.dto.TestVariables;
  import com.cloudframe.app.d529351u.dto.DclfeSpiRuleIpa;
  import com.cloudframe.app.d529351u.dto.HvHostVariablesCsplnv;
  import com.cloudframe.app.d529351u.dto.DclfeSpiPlnVar;
  import com.cloudframe.app.d529351u.dto.DclfeSpiRuleCaus;
  import com.cloudframe.app.d529351u.dto.DclfeSpiRuleIcd;
  import com.cloudframe.app.d529351u.dto.HvHostVariablesCsfrto;
  import com.cloudframe.app.d529351u.dto.HvHostVariablesCombcr;
  import com.cloudframe.app.d529351u.dto.DclfeSpiRuleCpeFlg;
  import com.cloudframe.app.d529351u.dto.LstIcdKey;
  import com.cloudframe.app.d529351u.dto.HvHostVariablesCsicdo;
  import com.cloudframe.app.d529351u.dto.DclfeSpiRuleProvTyp;
  import com.cloudframe.app.d529351u.dto.DclfeSpiRuleFrCondPos;
  import com.cloudframe.app.d529351u.dto.DclfeSpiRuleFrToSvc;
  import com.cloudframe.app.d529351u.dto.HvHostVariablesSvcmain;
  import com.cloudframe.app.d529351u.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("d529351u")
  
  public class D529351u extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(D529351u.class);
  
  private DsmCallArea dsmCallArea = new DsmCallArea() ;
  private Vyspi51uCallArea vyspi51uCallArea = new Vyspi51uCallArea() ;
  private WorkArea workArea = new WorkArea() ;
  private Sqlca sqlca = new Sqlca() ;
  private TestVariables testVariables = new TestVariables() ;
  private DclfeSpiRuleIpa dclfeSpiRuleIpa = new DclfeSpiRuleIpa() ;
  private HvHostVariablesCsplnv hvHostVariablesCsplnv = new HvHostVariablesCsplnv() ;
  private DclfeSpiPlnVar dclfeSpiPlnVar = new DclfeSpiPlnVar() ;
  private DclfeSpiRuleCaus dclfeSpiRuleCaus = new DclfeSpiRuleCaus() ;
  private DclfeSpiRuleIcd dclfeSpiRuleIcd = new DclfeSpiRuleIcd() ;
  private HvHostVariablesCsfrto hvHostVariablesCsfrto = new HvHostVariablesCsfrto() ;
  private HvHostVariablesCombcr hvHostVariablesCombcr = new HvHostVariablesCombcr() ;
  private DclfeSpiRuleCpeFlg dclfeSpiRuleCpeFlg = new DclfeSpiRuleCpeFlg() ;
  private LstIcdKey lstIcdKey = new LstIcdKey() ;
  private HvHostVariablesCsicdo hvHostVariablesCsicdo = new HvHostVariablesCsicdo() ;
  private DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp = new DclfeSpiRuleProvTyp() ;
  private DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos = new DclfeSpiRuleFrCondPos() ;
  private DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc = new DclfeSpiRuleFrToSvc() ;
  private HvHostVariablesSvcmain hvHostVariablesSvcmain = new HvHostVariablesSvcmain() ;
  private Work work = new Work() ;
  
  @Value("${D529351U.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("d529351uRepository")
  D529351uRepository d529351uRepository;
  
  
  
  int hv2iIndex;
  int hv2sIndex;
  int hv3cIndex;
  int hv2mIndex;
  int hv10Index;
  int hv09Index;
  int hv2pIndex;
  int hv2fIndex;
  int hv3aIndex;
  int hv2aIndex;
  int hv2cIndex;
  int hv2kIndex;
  int hv2jIndex;
  int hv06Index;
  int hv2nIndex;
  int hv3dIndex;
  int hv2hIndex;
  int hv2qIndex;
  int hv01Index;
  int hv2eIndex;
  int hv13Index;
  int hv12Index;
  int hv08Index;
  int hv2uIndex;
  int hv15Index;
  int hv04Index;
  int hv2oIndex;
  int hv2dIndex;
  int hv07Index;
  int hv0aIndex;
  int hv2gIndex;
  int hv14Index;
  int hv3eIndex;
  int hv2tIndex;
  int hv2rIndex;
  int hv2lIndex;
  int hv05Index;
  int hv11Index;
  int hv2bIndex;
  int hv3fIndex;
  int hv3bIndex;
  
  
  
      public int setParameter(String dsmCallArea,String vyspi51uCallArea) throws Exception {
      		if(dsmCallArea != null)
      		    this.dsmCallArea.setString(com.cloudframe.app.data.Field.getParm(dsmCallArea),new String(CONSTANTS.EBCDIC_ENCODING));
      		if(vyspi51uCallArea != null)
      		    this.vyspi51uCallArea.setString(com.cloudframe.app.data.Field.getParm(vyspi51uCallArea),new String(CONSTANTS.EBCDIC_ENCODING));
      		setInitDone(false);
      		process();
      		return getRc();
      }
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public int process() throws Exception {
       initVars();
       try {
       setCodePage("1047");
          ;
//  PERFORM 0000-MAIN-LINE
          mainLine();/*0000-MAIN-LINE SECTION*/
          if (this.isProgramEnded()) {
              return getRc();
          }
          exit();/*0000-EXIT*/
          if (this.isProgramEnded()) {
              return getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
		handleDbAtEnd(db2Base); 
		clearVars(); 
      

      }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainLine 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-LINE SECTION COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void mainLine() throws Exception {
//  PERFORM 1000-INITIALIZE THRU 1000-EXIT
          initialize();/*1000-INITIALIZE SECTION*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESSING THRU 2000-EXIT
          processing();/*2000-PROCESSING SECTION*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * exit 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-EXIT COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void exit() throws Exception {
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE SECTION COBOL Cyclomatic complexity - 1
      * Input  :  

      * - dsmFuncCd01                    COBOL Name: DSM-FUNC-CD
      * - d51uKeyFeSpi                   COBOL Name: D51U-KEY-FE-SPI
      * - d51uKeyPolicy                  COBOL Name: D51U-KEY-POLICY
      * - d51uKeyPlan                    COBOL Name: D51U-KEY-PLAN
      * - d51uKeyStatus                  COBOL Name: D51U-KEY-STATUS
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - dclfeSpiPlnVar                 COBOL Name: DCLFE-SPI-PLN-VAR
      * - dclfeSpiRuleFrCondPos          COBOL Name: DCLFE-SPI-RULE-FR-COND-POS
      * - dclfeSpiRuleFrToSvc            COBOL Name: DCLFE-SPI-RULE-FR-TO-SVC
      * - dclfeSpiRuleProvTyp            COBOL Name: DCLFE-SPI-RULE-PROV-TYP
      * - dclfeSpiRuleIcd                COBOL Name: DCLFE-SPI-RULE-ICD
      * - dclfeSpiRuleCaus               COBOL Name: DCLFE-SPI-RULE-CAUS
      * - dclfeSpiRuleIpa                COBOL Name: DCLFE-SPI-RULE-IPA
      * - dclfeSpiRuleCpeFlg             COBOL Name: DCLFE-SPI-RULE-CPE-FLG
      * - d51uNbrOfEntries               COBOL Name: D51U-NBR-OF-ENTRIES
      * - lstIcdKey                      COBOL Name: WS-LST-ICD-KEY
      * - dsmFuncCd                      COBOL Name: WS-DSM-FUNC-CD
      * - dsmFuncCd01                    COBOL Name: DSM-FUNC-CD
      * - causSpiTblId                   COBOL Name: CAUS-SPI-TBL-ID
      * - fcndSpiTblId                   COBOL Name: FCND-SPI-TBL-ID
      * - frtoSpiTblId                   COBOL Name: FRTO-SPI-TBL-ID
      * - ptypSpiTblId                   COBOL Name: PTYP-SPI-TBL-ID
      * - ricdSpiTblId                   COBOL Name: RICD-SPI-TBL-ID
      * - ripaSpiTblId                   COBOL Name: RIPA-SPI-TBL-ID
      * - cpeflSpiTblId                  COBOL Name: CPEFL-SPI-TBL-ID
      * - d51uKeyFeSpi                   COBOL Name: D51U-KEY-FE-SPI
      * - plnvPolNbr                     COBOL Name: PLNV-POL-NBR
      * - d51uKeyPolicy                  COBOL Name: D51U-KEY-POLICY
      * - plnvPlnNbr                     COBOL Name: PLNV-PLN-NBR
      * - d51uKeyPlan                    COBOL Name: D51U-KEY-PLAN
      * - plnvStsCd                      COBOL Name: PLNV-STS-CD
      * - causStsCd                      COBOL Name: CAUS-STS-CD
      * - fcndStsCd                      COBOL Name: FCND-STS-CD
      * - frtoStsCd                      COBOL Name: FRTO-STS-CD
      * - ptypStsCd                      COBOL Name: PTYP-STS-CD
      * - ricdStsCd                      COBOL Name: RICD-STS-CD
      * - ripaStsCd                      COBOL Name: RIPA-STS-CD
      * - cpeflStsCd                     COBOL Name: CPEFL-STS-CD
      * - d51uKeyStatus                  COBOL Name: D51U-KEY-STATUS
      * - frtoSub                        COBOL Name: FRTO-SUB
      * - ptypSub                        COBOL Name: PTYP-SUB
      * - icdSub                         COBOL Name: ICD-SUB
      * - fcndSub                        COBOL Name: FCND-SUB
      * - causSub                        COBOL Name: CAUS-SUB
      * - ipaSub                         COBOL Name: IPA-SUB
      * - cflgSub                        COBOL Name: CFLG-SUB
      *
      * @throws CFException
      */
      private void initialize() throws Exception {
			// Declare local variables used in the method
			D51uNonArrayData d51uNonArrayData = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData();
			DsmCommonArea dsmCommonArea = dsmCallArea.getDsmCommonArea();
			D51uKey d51uKey = vyspi51uCallArea.getD51uRequestFields().getD51uKey();
			// End of variable declaration

      
// *82 1. Initialize all dclgen fields                              *
// *82 2. format spi fields for all tables key lookup               *
// *82***************************************************************
//  MOVE ZEROES TO WS-SQLCODE
          work.setSqlcode_Ws(0);
//  INITIALIZE DCLFE-SPI-PLN-VAR DCLFE-SPI-RULE-FR-COND-POS DCLFE-SPI-RULE-FR-TO-SVC DCLFE-SPI-RULE-PROV-TYP DCLFE-SPI-RULE-ICD DCLFE-SPI-RULE-CAUS DCLFE-SPI-RULE-IPA DCLFE-SPI-RULE-CPE-FLG
          dclfeSpiPlnVar.initialize();
          dclfeSpiRuleFrCondPos.initialize();
          dclfeSpiRuleFrToSvc.initialize();
          dclfeSpiRuleProvTyp.initialize();
          dclfeSpiRuleIcd.initialize();
          dclfeSpiRuleCaus.initialize();
          dclfeSpiRuleIpa.initialize();
          dclfeSpiRuleCpeFlg.initialize();

// *    Perform varying ws-sub from 1 by 1
// *45917c        until ws-sub > 99
// *         initialize   d51u-ret-rul-cause     (ws-sub)
// *                      d51u-ret-rule-ipa      (ws-sub)
// *    end-perform
// *
//  INITIALIZE D51U-NBR-OF-ENTRIES WS-LST-ICD-KEY
          d51uNonArrayData.setD51uNbrOfEntries(0);
          lstIcdKey.initialize();
  

// *                 D51u-more-icd-records
// *    perform varying ws-sub from 1 by 1
// *45917c        until ws-sub > 99
// *         initialize   d51u-ret-rule-fr-cond-pos(ws-sub)
// *    end-perform
// *
// *    perform varying ws-sub from 1 by 1
// *              until ws-sub > 9999
// *         initialize   d51u-ret-rule-icd  (ws-sub)
// *    end-perform
//  MOVE DSM-FUNC-CD TO WS-DSM-FUNC-CD
          work.setDsmFuncCd((short) dsmCommonArea.getDsmFuncCd01());
  
//  MOVE D51U-KEY-FE-SPI TO CAUS-SPI-TBL-ID FCND-SPI-TBL-ID FRTO-SPI-TBL-ID PTYP-SPI-TBL-ID RICD-SPI-TBL-ID RIPA-SPI-TBL-ID CPEFL-SPI-TBL-ID
          dclfeSpiRuleCaus.setCausSpiTblId(d51uKey.getD51uKeyFeSpi());
          dclfeSpiRuleFrCondPos.setFcndSpiTblId(d51uKey.getD51uKeyFeSpi());
          dclfeSpiRuleFrToSvc.setFrtoSpiTblId(d51uKey.getD51uKeyFeSpi());
          dclfeSpiRuleProvTyp.setPtypSpiTblId(d51uKey.getD51uKeyFeSpi());
          dclfeSpiRuleIcd.setRicdSpiTblId(d51uKey.getD51uKeyFeSpi());
          dclfeSpiRuleIpa.setRipaSpiTblId(d51uKey.getD51uKeyFeSpi());
          dclfeSpiRuleCpeFlg.setCpeflSpiTblId(d51uKey.getD51uKeyFeSpi());
  
//  MOVE D51U-KEY-POLICY TO PLNV-POL-NBR
          dclfeSpiPlnVar.setPlnvPolNbr(d51uKey.getD51uKeyPolicy());
  
//  MOVE D51U-KEY-PLAN TO PLNV-PLN-NBR
          dclfeSpiPlnVar.setPlnvPlnNbr(d51uKey.getD51uKeyPlan());
  
//  MOVE D51U-KEY-STATUS TO PLNV-STS-CD CAUS-STS-CD FCND-STS-CD FRTO-STS-CD PTYP-STS-CD RICD-STS-CD RIPA-STS-CD CPEFL-STS-CD
          dclfeSpiPlnVar.setPlnvStsCd(d51uKey.getD51uKeyStatus());
          dclfeSpiRuleCaus.setCausStsCd(d51uKey.getD51uKeyStatus());
          dclfeSpiRuleFrCondPos.setFcndStsCd(d51uKey.getD51uKeyStatus());
          dclfeSpiRuleFrToSvc.setFrtoStsCd(d51uKey.getD51uKeyStatus());
          dclfeSpiRuleProvTyp.setPtypStsCd(d51uKey.getD51uKeyStatus());
          dclfeSpiRuleIcd.setRicdStsCd(d51uKey.getD51uKeyStatus());
          dclfeSpiRuleIpa.setRipaStsCd(d51uKey.getD51uKeyStatus());
          dclfeSpiRuleCpeFlg.setCpeflStsCd(d51uKey.getD51uKeyStatus());
  

// *
// **   Move d51u-lst-icd-key    to ws-lst-icd-key
// *
//  INITIALIZE FRTO-SUB PTYP-SUB ICD-SUB FCND-SUB CAUS-SUB IPA-SUB CFLG-SUB
          work.setFrtoSub(0);
          work.setPtypSub(0);
          work.setIcdSub(0);
          work.setFcndSub(0);
          work.setCausSub(0);
          work.setIpaSub(0);
          work.setCflgSub(0);
      
      }
      /**
      * processing 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESSING SECTION COBOL Cyclomatic complexity - 7
      * Input  :  

      * - dsmFuncCd                      COBOL Name: WS-DSM-FUNC-CD
      * - sub                            COBOL Name: WS-SUB
      * - dsmFuncCd01                    COBOL Name: DSM-FUNC-CD
      *
      * Output :  

      * - sub                            COBOL Name: WS-SUB
      * - d51uRetRuleKeys                COBOL Name: D51U-RET-RULE-KEYS
      * - d51uMoreIcdRecords             COBOL Name: D51U-MORE-ICD-RECORDS
      * - dsmEditErrorField              COBOL Name: DSM-EDIT-ERROR-FIELD
      * - dsmEditErrorValueInt           COBOL Name: DSM-EDIT-ERROR-VALUE-INT
      * - dsmFuncCd01                    COBOL Name: DSM-FUNC-CD
      * - dsmErrSectnName                COBOL Name: DSM-ERR-SECTN-NAME
      * - dsmErrPgmName                  COBOL Name: DSM-ERR-PGM-NAME
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      *
      * @throws CFException
      */
      private void processing() throws Exception {
			// Declare local variables used in the method
			DsmCommonArea dsmCommonArea = dsmCallArea.getDsmCommonArea();
			DsmEditErrorValueTxt dsmEditErrorValueTxt = dsmCallArea.getDsmCommonArea().getDsmEditErrorValueTxt();
			DsmSqlErrorMsgArea dsmSqlErrorMsgArea = dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea();
			// End of variable declaration

      
// *81***************************************************************
// *81 2000-Processing                                              *
// *81                                                              *
// *81 business function:                                           *
// *81 process the function code                                    *
// *81***************************************************************
// *82***************************************************************
// *82 2000-processing                                              *
// *82                                                              *
// *82 1.evaluate the function code                                 *
// *82 2.func-cd 1 retrieves data from spi plan variation table     *
// *82 3.func-cd 2 retrieves data from spi plan rules tables        *
// *82                                                              *
// *82***************************************************************
//  EVALUATE TRUE
          if  ( work.isFuncCd1()  ) { 
//  PERFORM 2100-PROCESS-FUNC-CD-1 THRU 2100-EXIT
              processFuncCd1();/*2100-PROCESS-FUNC-CD-1 SECTION*/
          }
          else if  ( work.isFuncCd2()  ) { 
//  PERFORM VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > 99
              for (work.setSub(1); (	( work.getSub() <= 99 )) ; work.setSub(work.getSub() + 1) ) {
//  INITIALIZE D51U-RET-RULE-KEYS ( WS-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulKeys().getD51uRetRuleKeys(work.getSub() - 1).initialize();
              }
//  SET NO-MORE-ICD-RECORDS TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setNoMoreIcdRecordsTrue(); 
              
//  PERFORM 2200-PROCESS-FUNC-CD-2 THRU 2200-EXIT
              processFuncCd2();/*2200-PROCESS-FUNC-CD-2 SECTION*/
          }
          else if  ( work.isFuncCd3()  ) { 
//  PERFORM 3100-PROCESS-FUNC-CD-3 THRU 3100-EXIT
              processFuncCd3();/*3100-PROCESS-FUNC-CD-3 SECTION*/
          }
          else   { 
//  MOVE 'DSM-FUNC-CD' TO DSM-EDIT-ERROR-FIELD
              dsmCommonArea.setDsmEditErrorField(CONSTANTS.LITERAL_DSM_MN2_FUNCCD_B19_);
  
//  MOVE DSM-FUNC-CD TO DSM-EDIT-ERROR-VALUE-INT
//  FORMAT_467480023 = "-999999999999999999"
              dsmEditErrorValueTxt.setDsmEditErrorValueInt(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_467480023,String.valueOf(dsmCommonArea.getDsmFuncCd01()).toCharArray()));
  
//  MOVE '2000-PROCESSI' TO DSM-ERR-SECTN-NAME
              dsmSqlErrorMsgArea.setDsmErrSectnName(CONSTANTS.LITERAL_1773875177);
  
//  MOVE 'D529351U' TO DSM-ERR-PGM-NAME
//  LITERAL_D529351U = 'D529351U'
              dsmSqlErrorMsgArea.setDsmErrPgmName(CONSTANTS.LITERAL_D529351U);
  
//  SET D51U-INV-FUNC-CD TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uInvFuncCdTrue(); 
              
          }
      
      }
      /**
      * processFuncCd1 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-PROCESS-FUNC-CD-1 SECTION COBOL Cyclomatic complexity - 3
      * Input  :  

      * - d51uReqDosDate                 COBOL Name: D51U-REQ-DOS-DATE
      *
      * Output :  

      * - fetchEnd                       COBOL Name: WS-FETCH-END
      * - planFoundSw                    COBOL Name: PLAN-FOUND-SW
      * - csSub                          COBOL Name: CS-SUB
      * - planMatch                      COBOL Name: WS-PLAN-MATCH
      * - planEffDate                    COBOL Name: WS-PLAN-EFF-DATE
      * - planCanDate                    COBOL Name: WS-PLAN-CAN-DATE
      * - db2DosYyyy                     COBOL Name: WS-DB2-DOS-YYYY
      * - d51uReqDosDate                 COBOL Name: D51U-REQ-DOS-DATE
      * - db2DosMm                       COBOL Name: WS-DB2-DOS-MM
      * - db2DosDd                       COBOL Name: WS-DB2-DOS-DD
      * - db2Dash1                       COBOL Name: WS-DB2-DASH1
      * - db2Dash2                       COBOL Name: WS-DB2-DASH2
      *
      * @throws CFException
      */
      private void processFuncCd1() throws Exception {
			// Declare local variables used in the method
			Db2ReqDosDateRedefined db2ReqDosDateRedefined = workArea.getDb2ReqDosDateRedefined();
			char[] db2DosMm = null;
			// End of variable declaration

      
// *81***************************************************************
// *81 2100-Process-func-cd-1                                       *
// *81                                                              *
// *81 business function:                                           *
// *81 retrieves data from spi plan variation table                 *
// *81***************************************************************
// *82***************************************************************
// *82 2100-process-func-cd-1                                       *
// *82 retrieves data from spi plan variation table                 *
// *82                                                              *
// *82 called by : 1.2000-processing section                        *
// *82 call      : 1.2150-open-csplnv-cursor                        *
// *82***************************************************************
//  SET NOT-END-OF-FETCH TO TRUE
          work.setNotEndOfFetchTrue(); 
          
//  SET PLAN-NOT-FOUND TO TRUE
          vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setPlanNotFoundTrue(); 
          
//  INITIALIZE CS-SUB WS-PLAN-MATCH WS-PLAN-EFF-DATE WS-PLAN-CAN-DATE
          work.setCsSub(0);
          work.setPlanMatch(0);
          work.setPlanEffDate(0);
          work.setPlanCanDate(0);
//  MOVE D51U-REQ-DOS-DATE (1 : 4) TO WS-DB2-DOS-YYYY
          workArea.replace(vyspi51uCallArea/*parent*/,54/*fromOffset - (db2DosYyyy) */,4/*fromLen*/,17/*toOffset - (d51uReqDosDate) */,4/*toLen*/);
  
//  MOVE D51U-REQ-DOS-DATE (5 : 2) TO WS-DB2-DOS-MM
          workArea.replace(vyspi51uCallArea/*parent*/,54+5 - 1/*fromOffset - (db2DosMm) */,2/*fromLen*/,22/*toOffset - (d51uReqDosDate) */,2/*toLen*/);
  
//  MOVE D51U-REQ-DOS-DATE (7 : 2) TO WS-DB2-DOS-DD
          workArea.replace(vyspi51uCallArea/*parent*/,54+7 - 1/*fromOffset - (db2DosDd) */,2/*fromLen*/,25/*toOffset - (d51uReqDosDate) */,2/*toLen*/);
  
          db2DosMm = db2ReqDosDateRedefined.getDb2DosMm();
//  IF WS-DB2-DOS-MM = '99' OR '00' THEN
//  LITERAL_00 = '00'
          if (		compareChars(db2DosMm,CONSTANTS.LITERAL_99) == 0  || 		compareChars(db2DosMm,CONSTANTS.LITERAL_00) == 0 ) { 
              // MOVE '12' TO WS-DB2-DOS-MM
              //  LITERAL_12 = '12'
              workArea.getDb2ReqDosDateRedefined().setDb2DosMm(CONSTANTS.LITERAL_12);
  
              // MOVE '31' TO WS-DB2-DOS-DD
              //  LITERAL_31 = '31'
              workArea.getDb2ReqDosDateRedefined().setDb2DosDd(CONSTANTS.LITERAL_31);
  
          }
  
//  MOVE '-' TO WS-DB2-DASH1 , WS-DB2-DASH2
//  LITERAL_MN_ = '-'
          db2ReqDosDateRedefined.setDb2Dash1(CONSTANTS.LITERAL_MN_);
          db2ReqDosDateRedefined.setDb2Dash2(CONSTANTS.LITERAL_MN_);
  
//  PERFORM 2150-OPEN-CSPLNV-CURSOR THRU 2150-EXIT
          openCsplnvCursor();/*2150-OPEN-CSPLNV-CURSOR SECTION*/
          ;
      
      }
      /**
      * openCsplnvCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 2150-OPEN-CSPLNV-CURSOR SECTION COBOL Cyclomatic complexity - 6
      * Input  :  

      * - fetchEnd                       COBOL Name: WS-FETCH-END
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - csSub                          COBOL Name: CS-SUB
      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      private void openCsplnvCursor() throws Exception {
			// Declare local variables used in the method
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

      
// *81***************************************************************
// *82***************************************************************
// *82 2150-Open-csplnv-cursor                                      *
// *82                                                              *
// *82 1.validate spi nbr based on the key against                  *
// *82                - fe_spi_pln_var table                        *
// *82                                                              *
// *82 called by : 1.2000-processing section                        *
// *82 call      : 1.2180-fetch-csplnv                              *
// *82                                                              *
// *82***************************************************************
//  SELECT A.SPI_TBL_ID , B.POS_TIER_TYP_CD , B.PRI_DIAG_IND , B.MJR_DIAG_ELIG_IND FROM FE_SPI_PLN_VAR A INNER JOIN FE_SPI_DESC_HDR B ON B.SPI_TBL_ID = A.SPI_TBL_ID AND B.SPI_STS_CD = 'A' AND B.STS_CD = 'A' WHERE A.POL_NBR = ? AND A.PLN_NBR = ? AND A.EFF_DT <= ? AND A.CANC_DT >= ? AND A.STS_CD = 'A' ORDER BY A.SPI_TBL_ID ASC , A.EFF_DT DESC FOR FETCH ONLY
          d529351uRepository.openCsplnvD529351u(dclfeSpiPlnVar,workArea,sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  MOVE 0 TO CS-SUB
              work.setCsSub(0);
//  PERFORM 2180-FETCH-CSPLNV THRU 2180-EXIT UNTIL END-OF-FETCH OR CS-SUB > +9999
              while (!(work.isEndOfFetch())  && 	( work.getCsSub() <= 9999 )) {
                 fetchCsplnv();/*2180-FETCH-CSPLNV SECTION*/
              }
          break;
          default :
//  SET DSM-DB2-ERROR TO TRUE
              dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue(); 
              
//  SET D51U-DB2-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
              
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  SET D51U-DB2-OPEN-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2OpenErrorTrue(); 
              
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//  MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              d51uErrorTrace.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
  
//  MOVE '2150-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2150_MN_ = '2150-'
              d51uErrorTrace.setD51uParagraphNum(CONSTANTS.LITERAL_2150_MN_);
  
          }
      
      }
      /**
      * fetchCsplnv 
      *   This method is derived from 
  *   COBOL Paragraph - 2180-FETCH-CSPLNV SECTION COBOL Cyclomatic complexity - 11
      * Input  :  

      * - sqlerrd                        COBOL Name: SQLERRD
      * - csSub                          COBOL Name: CS-SUB
      * - planMatch                      COBOL Name: WS-PLAN-MATCH
      * - hv01SpiTblId                   COBOL Name: HV01-SPI-TBL-ID
      * - hv14PosTierTypCd               COBOL Name: HV14-POS-TIER-TYP-CD
      * - hv0aPriDiagInd                 COBOL Name: HV0A-PRI-DIAG-IND
      * - hv15MjrDiagEligInd             COBOL Name: HV15-MJR-DIAG-ELIG-IND
      * - plnvPolNbr                     COBOL Name: PLNV-POL-NBR
      * - plnvPlnNbr                     COBOL Name: PLNV-PLN-NBR
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsnnrows                       COBOL Name: DSNNROWS
      * - planFoundSw                    COBOL Name: PLAN-FOUND-SW
      * - hv01Index                      COBOL Name: HV01-INDEX
      * - hv14Index                      COBOL Name: HV14-INDEX
      * - hv0aIndex                      COBOL Name: HV0A-INDEX
      * - hv15Index                      COBOL Name: HV15-INDEX
      * - csSub                          COBOL Name: CS-SUB
      * - planMatch                      COBOL Name: WS-PLAN-MATCH
      * - d51uRetFeSpi                   COBOL Name: D51U-RET-FE-SPI
      * - hv01SpiTblId                   COBOL Name: HV01-SPI-TBL-ID
      * - d51uRetPosTierCd               COBOL Name: D51U-RET-POS-TIER-CD
      * - hv14PosTierTypCd               COBOL Name: HV14-POS-TIER-TYP-CD
      * - d51uRetPriDiagInd              COBOL Name: D51U-RET-PRI-DIAG-IND
      * - hv0aPriDiagInd                 COBOL Name: HV0A-PRI-DIAG-IND
      * - d51uRetDiagElgInd              COBOL Name: D51U-RET-DIAG-ELG-IND
      * - hv15MjrDiagEligInd             COBOL Name: HV15-MJR-DIAG-ELIG-IND
      * - d51uRetStatus                  COBOL Name: D51U-RET-STATUS
      * - d51uRetPolicy                  COBOL Name: D51U-RET-POLICY
      * - plnvPolNbr                     COBOL Name: PLNV-POL-NBR
      * - d51uRetPlan                    COBOL Name: D51U-RET-PLAN
      * - plnvPlnNbr                     COBOL Name: PLNV-PLN-NBR
      * - d51uNbrOfEntries               COBOL Name: D51U-NBR-OF-ENTRIES
      * - fetchEnd                       COBOL Name: WS-FETCH-END
      * - d51uPlnvCnt                    COBOL Name: D51U-PLNV-CNT
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      private void fetchCsplnv() throws Exception {
			// Declare local variables used in the method
			int csSub = 0;
			D51uNonArrayData d51uNonArrayData = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData();
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			// End of variable declaration

// FETCH NEXT ROWSET FROM CSPLNV FOR 100 ROWS INTO  ?    ,   ?    ,   ?    ,   ? 
//  MOVE 100 TO DSNNROWS
          work.setDsnnrows(100);
//  FETCH NEXT ROWSET FROM CSPLNV FOR 100 ROWS INTO ? , ? , ? , ?
          d529351uRepository.fetchCsplnvD529351u(hvHostVariablesCsplnv,sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:

// *45917S    if (d51u-req-dos-date  not < ws-plan-eff-date) and
// *45917s       (d51u-req-dos-date  not > ws-plan-can-date)
// *             add +1 to cs-sub
// *             add +1 to ws-plan-match
// *             move plnv-spi-tbl-id to d51u-ret-fe-spi (cs-sub)
// *             move plnv-sts-cd     to d51u-ret-status (cs-sub)
// *             move plnv-pol-nbr    to d51u-ret-policy (cs-sub)
// *             move plnv-pln-nbr    to d51u-ret-plan   (cs-sub)
// *             set plan-found   to true
//  SET PLAN-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setPlanFoundTrue(); 
              
//  SET HV01-INDEX TO +1
              hv01Index = 1; 
              
//  SET HV14-INDEX TO +1
              hv14Index = 1; 
              
//  SET HV0A-INDEX TO +1
              hv0aIndex = 1; 
              
//  SET HV15-INDEX TO +1
              hv15Index = 1; 
              
//  PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < sqlca.getSqlerrd(2);index1++) {
//  ADD +1 TO CS-SUB
                  work.setCsSub(work.getCsSub()+1);
                  csSub = work.getCsSub();
//  IF CS-SUB <= +9999
                  if (	( csSub <= 9999 )) { 
//  ADD +1 TO WS-PLAN-MATCH
                      work.setPlanMatch(work.getPlanMatch()+1);
//  MOVE HV01-SPI-TBL-ID ( HV01-INDEX ) TO D51U-RET-FE-SPI ( CS-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getCsSub() - 1).setD51uRetFeSpi(hvHostVariablesCsplnv.getHv01SpiTblId(hv01Index - 1));
//  MOVE HV14-POS-TIER-TYP-CD ( HV14-INDEX ) TO D51U-RET-POS-TIER-CD ( CS-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getCsSub() - 1).setD51uRetPosTierCd(hvHostVariablesCsplnv.getHv14PosTierTypCd(hv14Index - 1));
//  MOVE HV0A-PRI-DIAG-IND ( HV0A-INDEX ) TO D51U-RET-PRI-DIAG-IND ( CS-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getCsSub() - 1).setD51uRetPriDiagInd(hvHostVariablesCsplnv.getHv0aPriDiagInd(hv0aIndex - 1));
//  MOVE HV15-MJR-DIAG-ELIG-IND ( HV15-INDEX ) TO D51U-RET-DIAG-ELG-IND ( CS-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getCsSub() - 1).setD51uRetDiagElgInd(hvHostVariablesCsplnv.getHv15MjrDiagEligInd(hv15Index - 1));
//  MOVE 'A' TO D51U-RET-STATUS ( CS-SUB )
//  LITERAL_A = 'A'
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getCsSub() - 1).setD51uRetStatus(CONSTANTS.LITERAL_A);
//  MOVE PLNV-POL-NBR TO D51U-RET-POLICY ( CS-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getCsSub() - 1).setD51uRetPolicy(dclfeSpiPlnVar.getPlnvPolNbr());
//  MOVE PLNV-PLN-NBR TO D51U-RET-PLAN ( CS-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getCsSub() - 1).setD51uRetPlan(padLeftZeros(4,dclfeSpiPlnVar.getPlnvPlnNbr(),false));
                  }
  
//  SET HV01-INDEX UP BY +1
                  hv01Index++; 
                  
//  SET HV14-INDEX UP BY +1
                  hv14Index++; 
                  
//  SET HV0A-INDEX UP BY +1
                  hv0aIndex++; 
                  
//  SET HV15-INDEX UP BY +1
                  hv15Index++; 
                  
              }
          break;
          	case 100:
//  IF SQLERRD (3) > ZERO
              if (	( sqlca.getSqlerrd(2) > 0 )) { 
//  SET PLAN-FOUND TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setPlanFoundTrue(); 
                  
//  SET HV01-INDEX TO +1
                  hv01Index = 1; 
                  
//  SET HV14-INDEX TO +1
                  hv14Index = 1; 
                  
//  SET HV0A-INDEX TO +1
                  hv0aIndex = 1; 
                  
//  SET HV15-INDEX TO +1
                  hv15Index = 1; 
                  
              }
//  PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < sqlca.getSqlerrd(2);index1++) {
//  ADD +1 TO CS-SUB
                  work.setCsSub(work.getCsSub()+1);
                  csSub = work.getCsSub();
//  IF CS-SUB <= +9999
                  if (	( csSub <= 9999 )) { 
//  ADD +1 TO WS-PLAN-MATCH
                      work.setPlanMatch(work.getPlanMatch()+1);
//  MOVE HV01-SPI-TBL-ID ( HV01-INDEX ) TO D51U-RET-FE-SPI ( CS-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getCsSub() - 1).setD51uRetFeSpi(hvHostVariablesCsplnv.getHv01SpiTblId(hv01Index - 1));
//  MOVE HV0A-PRI-DIAG-IND ( HV0A-INDEX ) TO D51U-RET-PRI-DIAG-IND ( CS-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getCsSub() - 1).setD51uRetPriDiagInd(hvHostVariablesCsplnv.getHv0aPriDiagInd(hv0aIndex - 1));
//  MOVE 'A' TO D51U-RET-STATUS ( CS-SUB )
//  LITERAL_A = 'A'
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getCsSub() - 1).setD51uRetStatus(CONSTANTS.LITERAL_A);
//  MOVE HV14-POS-TIER-TYP-CD ( HV14-INDEX ) TO D51U-RET-POS-TIER-CD ( CS-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getCsSub() - 1).setD51uRetPosTierCd(hvHostVariablesCsplnv.getHv14PosTierTypCd(hv14Index - 1));
//  MOVE HV15-MJR-DIAG-ELIG-IND ( HV15-INDEX ) TO D51U-RET-DIAG-ELG-IND ( CS-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getCsSub() - 1).setD51uRetDiagElgInd(hvHostVariablesCsplnv.getHv15MjrDiagEligInd(hv15Index - 1));
//  MOVE PLNV-POL-NBR TO D51U-RET-POLICY ( CS-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getCsSub() - 1).setD51uRetPolicy(dclfeSpiPlnVar.getPlnvPolNbr());
//  MOVE PLNV-PLN-NBR TO D51U-RET-PLAN ( CS-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getCsSub() - 1).setD51uRetPlan(padLeftZeros(4,dclfeSpiPlnVar.getPlnvPlnNbr(),false));
                  }
  
//  SET HV01-INDEX UP BY +1
                  hv01Index++; 
                  
//  SET HV14-INDEX UP BY +1
                  hv14Index++; 
                  
//  SET HV0A-INDEX UP BY +1
                  hv0aIndex++; 
                  
//  SET HV15-INDEX UP BY +1
                  hv15Index++; 
                  
              }
              csSub = work.getCsSub();
//  IF CS-SUB = 0
              if (	( csSub == 0 )) { 
//  SET PLAN-NOT-FOUND TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setPlanNotFoundTrue(); 
                  
              }
  
//  ELSE
              else { 
//  SET PLAN-FOUND TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setPlanFoundTrue(); 
                  
                  // MOVE WS-PLAN-MATCH TO D51U-NBR-OF-ENTRIES
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uNbrOfEntries(work.getPlanMatch());
  
              }
//  SET END-OF-FETCH TO TRUE
              work.setEndOfFetchTrue(); 
              
//  MOVE CS-SUB TO D51U-PLNV-CNT
              d51uTableCounts.setD51uPlnvCnt(work.getCsSub());
  
//  PERFORM 2185-CLOSE-CSR THRU 2185-EXIT
              closeCsr();/*2185-CLOSE-CSR SECTION*/
          break;
          default :
//  SET PLAN-NOT-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setPlanNotFoundTrue(); 
              
//  SET END-OF-FETCH TO TRUE
              work.setEndOfFetchTrue(); 
              
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  PERFORM 2185-CLOSE-CSR THRU 2185-EXIT
              closeCsr();/*2185-CLOSE-CSR SECTION*/
          }
      
      }
      /**
      * closeCsr 
      *   This method is derived from 
  *   COBOL Paragraph - 2185-CLOSE-CSR SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      private void closeCsr() throws Exception {
			// Declare local variables used in the method
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

//  CLOSE CSPLNV
          d529351uRepository.closeCsplnvD529351u(sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  SET CLOSE-CSR-OK TO TRUE
              work.setCloseCsrOkTrue(); 
              
          break;
          default :
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  SET CLOSE-CSR-NG TO TRUE
              work.setCloseCsrNgTrue(); 
              
//  SET D51U-DB2-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
              
//  SET D51U-DB2-CLOSE-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2CloseErrorTrue(); 
              
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//  MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              d51uErrorTrace.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
  
//  MOVE '2185-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2185_MN_ = '2185-'
              d51uErrorTrace.setD51uParagraphNum(CONSTANTS.LITERAL_2185_MN_);
  
          }
      
      }
      /**
      * processFuncCd2 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-PROCESS-FUNC-CD-2 SECTION COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void processFuncCd2() throws Exception {
      
// *81***************************************************************
// *81 2200-Process-func-cd-2                                       *
// *81                                                              *
// *81 business function:                                           *
// *81 select / validate columns the fe spi tables                  *
// *81***************************************************************
// *82***************************************************************
// *82 2200-process-func-cd-2                                       *
// *82                                                              *
// *82 1.                                                           *
// *82                                                              *
// *82 called by : 1.2000-processing section                        *
// *82 call      :                                                  *
// *82***************************************************************
//  PERFORM 2200-PROCESS-FUNC-CD-2-SPLIT0
          processFuncCd2Split0();/*2200-PROCESS-FUNC-CD-2-SPLIT0*/
//  PERFORM 2200-PROCESS-FUNC-CD-2-SPLIT1
          processFuncCd2Split1();/*2200-PROCESS-FUNC-CD-2-SPLIT1*/
      
      }
      /**
      * processFuncCd2Split0 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-PROCESS-FUNC-CD-2-SPLIT0 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - d51uTestCaus                   COBOL Name: D51U-TEST-CAUS
      * - d51uTestProvTyp                COBOL Name: D51U-TEST-PROV-TYP
      * - d51uTestPos                    COBOL Name: D51U-TEST-POS
      * - d51uTestSvcCd                  COBOL Name: D51U-TEST-SVC-CD
      * - d51uTestDiag01                 COBOL Name: D51U-TEST-DIAG-01
      * - d51uTestDiag02                 COBOL Name: D51U-TEST-DIAG-02
      * - d51uTestDiag03                 COBOL Name: D51U-TEST-DIAG-03
      * - d51uTestDiag04                 COBOL Name: D51U-TEST-DIAG-04
      * - d51uTestDiag05                 COBOL Name: D51U-TEST-DIAG-05
      * - d51uTestDiag06                 COBOL Name: D51U-TEST-DIAG-06
      * - d51uTestDiag07                 COBOL Name: D51U-TEST-DIAG-07
      * - d51uTestDiag08                 COBOL Name: D51U-TEST-DIAG-08
      * - d51uTestDiag09                 COBOL Name: D51U-TEST-DIAG-09
      * - d51uTestDiag10                 COBOL Name: D51U-TEST-DIAG-10
      * - d51uTestDiag11                 COBOL Name: D51U-TEST-DIAG-11
      * - d51uTestDiag12                 COBOL Name: D51U-TEST-DIAG-12
      * - d51uTestDiag13                 COBOL Name: D51U-TEST-DIAG-13
      * - d51uTestDiag14                 COBOL Name: D51U-TEST-DIAG-14
      * - d51uTestDiag15                 COBOL Name: D51U-TEST-DIAG-15
      * - d51uTestDiag16                 COBOL Name: D51U-TEST-DIAG-16
      * - d51uTestDiag17                 COBOL Name: D51U-TEST-DIAG-17
      * - d51uTestDiag18                 COBOL Name: D51U-TEST-DIAG-18
      * - d51uTestDiag19                 COBOL Name: D51U-TEST-DIAG-19
      * - d51uTestDiag20                 COBOL Name: D51U-TEST-DIAG-20
      * - d51uTestDiag21                 COBOL Name: D51U-TEST-DIAG-21
      * - d51uTestDiag22                 COBOL Name: D51U-TEST-DIAG-22
      * - d51uTestDiag23                 COBOL Name: D51U-TEST-DIAG-23
      * - d51uTestDiag24                 COBOL Name: D51U-TEST-DIAG-24
      * - d51uTestDiag25                 COBOL Name: D51U-TEST-DIAG-25
      * - d51uTestCpeDescCd              COBOL Name: D51U-TEST-CPE-DESC-CD
      *
      * Output :  

      * - fetchEndMain                   COBOL Name: WS-FETCH-END-MAIN
      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - testCaus                       COBOL Name: TEST-CAUS
      * - d51uTestCaus                   COBOL Name: D51U-TEST-CAUS
      * - testProvTyp                    COBOL Name: TEST-PROV-TYP
      * - d51uTestProvTyp                COBOL Name: D51U-TEST-PROV-TYP
      * - testPos                        COBOL Name: TEST-POS
      * - d51uTestPos                    COBOL Name: D51U-TEST-POS
      * - testSvcCd                      COBOL Name: TEST-SVC-CD
      * - d51uTestSvcCd                  COBOL Name: D51U-TEST-SVC-CD
      * - testDiag01                     COBOL Name: TEST-DIAG-01
      * - d51uTestDiag01                 COBOL Name: D51U-TEST-DIAG-01
      * - testDiag02                     COBOL Name: TEST-DIAG-02
      * - d51uTestDiag02                 COBOL Name: D51U-TEST-DIAG-02
      * - testDiag03                     COBOL Name: TEST-DIAG-03
      * - d51uTestDiag03                 COBOL Name: D51U-TEST-DIAG-03
      * - testDiag04                     COBOL Name: TEST-DIAG-04
      * - d51uTestDiag04                 COBOL Name: D51U-TEST-DIAG-04
      * - testDiag05                     COBOL Name: TEST-DIAG-05
      * - d51uTestDiag05                 COBOL Name: D51U-TEST-DIAG-05
      * - testDiag06                     COBOL Name: TEST-DIAG-06
      * - d51uTestDiag06                 COBOL Name: D51U-TEST-DIAG-06
      * - testDiag07                     COBOL Name: TEST-DIAG-07
      * - d51uTestDiag07                 COBOL Name: D51U-TEST-DIAG-07
      * - testDiag08                     COBOL Name: TEST-DIAG-08
      * - d51uTestDiag08                 COBOL Name: D51U-TEST-DIAG-08
      * - testDiag09                     COBOL Name: TEST-DIAG-09
      * - d51uTestDiag09                 COBOL Name: D51U-TEST-DIAG-09
      * - testDiag10                     COBOL Name: TEST-DIAG-10
      * - d51uTestDiag10                 COBOL Name: D51U-TEST-DIAG-10
      * - testDiag11                     COBOL Name: TEST-DIAG-11
      * - d51uTestDiag11                 COBOL Name: D51U-TEST-DIAG-11
      * - testDiag12                     COBOL Name: TEST-DIAG-12
      * - d51uTestDiag12                 COBOL Name: D51U-TEST-DIAG-12
      * - testDiag13                     COBOL Name: TEST-DIAG-13
      * - d51uTestDiag13                 COBOL Name: D51U-TEST-DIAG-13
      * - testDiag14                     COBOL Name: TEST-DIAG-14
      * - d51uTestDiag14                 COBOL Name: D51U-TEST-DIAG-14
      * - testDiag15                     COBOL Name: TEST-DIAG-15
      * - d51uTestDiag15                 COBOL Name: D51U-TEST-DIAG-15
      * - testDiag16                     COBOL Name: TEST-DIAG-16
      * - d51uTestDiag16                 COBOL Name: D51U-TEST-DIAG-16
      * - testDiag17                     COBOL Name: TEST-DIAG-17
      * - d51uTestDiag17                 COBOL Name: D51U-TEST-DIAG-17
      * - testDiag18                     COBOL Name: TEST-DIAG-18
      * - d51uTestDiag18                 COBOL Name: D51U-TEST-DIAG-18
      * - testDiag19                     COBOL Name: TEST-DIAG-19
      * - d51uTestDiag19                 COBOL Name: D51U-TEST-DIAG-19
      * - testDiag20                     COBOL Name: TEST-DIAG-20
      * - d51uTestDiag20                 COBOL Name: D51U-TEST-DIAG-20
      * - testDiag21                     COBOL Name: TEST-DIAG-21
      * - d51uTestDiag21                 COBOL Name: D51U-TEST-DIAG-21
      * - testDiag22                     COBOL Name: TEST-DIAG-22
      * - d51uTestDiag22                 COBOL Name: D51U-TEST-DIAG-22
      * - testDiag23                     COBOL Name: TEST-DIAG-23
      * - d51uTestDiag23                 COBOL Name: D51U-TEST-DIAG-23
      * - testDiag24                     COBOL Name: TEST-DIAG-24
      * - d51uTestDiag24                 COBOL Name: D51U-TEST-DIAG-24
      * - testDiag25                     COBOL Name: TEST-DIAG-25
      * - d51uTestDiag25                 COBOL Name: D51U-TEST-DIAG-25
      * - testCpeDescCd                  COBOL Name: TEST-CPE-DESC-CD
      * - d51uTestCpeDescCd              COBOL Name: D51U-TEST-CPE-DESC-CD
      * - causSub                        COBOL Name: CAUS-SUB
      * - d51uCausCnt                    COBOL Name: D51U-CAUS-CNT
      * - causFoundSw                    COBOL Name: CAUS-FOUND-SW
      * - ipaSub                         COBOL Name: IPA-SUB
      * - d51uIpaCnt                     COBOL Name: D51U-IPA-CNT
      * - ipaFoundSw                     COBOL Name: IPA-FOUND-SW
      * - ptypSub                        COBOL Name: PTYP-SUB
      * - d51uPtypCnt                    COBOL Name: D51U-PTYP-CNT
      * - provFoundSw                    COBOL Name: PROV-FOUND-SW
      * - fcndSub                        COBOL Name: FCND-SUB
      * - d51uFcndCnt                    COBOL Name: D51U-FCND-CNT
      * - posFoundSw                     COBOL Name: POS-FOUND-SW
      * - cflgSub                        COBOL Name: CFLG-SUB
      * - d51uCflgCnt                    COBOL Name: D51U-CFLG-CNT
      * - cflgFoundSw                    COBOL Name: CFLG-FOUND-SW
      * - fetchEndComb                   COBOL Name: WS-FETCH-END-COMB
      *
      * @throws CFException
      */
      private void processFuncCd2Split0() throws Exception {
			// Declare local variables used in the method
			D51uTestValues d51uTestValues = vyspi51uCallArea.getD51uRequestFields().getD51uTestValues();
			D51uTestDiagArea d51uTestDiagArea = vyspi51uCallArea.getD51uRequestFields().getD51uTestValues().getD51uTestDiagArea();
			TestDiagArea testDiagArea = testVariables.getTestDiagArea();
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			// End of variable declaration

//  SET NOT-END-OF-FETCH-MAIN TO TRUE
          work.setNotEndOfFetchMainTrue(); 
          
//  SET CLOSE-CSR-OK TO TRUE
          work.setCloseCsrOkTrue(); 
          
//  MOVE D51U-TEST-CAUS TO TEST-CAUS
          testVariables.setTestCaus(d51uTestValues.getD51uTestCaus());
  
//  MOVE D51U-TEST-PROV-TYP TO TEST-PROV-TYP
          testVariables.setTestProvTyp(d51uTestValues.getD51uTestProvTyp());
  
//  MOVE D51U-TEST-POS TO TEST-POS
          testVariables.setTestPos(d51uTestValues.getD51uTestPos());
  
//  MOVE D51U-TEST-SVC-CD TO TEST-SVC-CD
          testVariables.setTestSvcCd(d51uTestValues.getD51uTestSvcCd());
  
//  MOVE D51U-TEST-DIAG-01 TO TEST-DIAG-01
          testDiagArea.setTestDiag01(d51uTestDiagArea.getD51uTestDiag01());
  
//  MOVE D51U-TEST-DIAG-02 TO TEST-DIAG-02
          testDiagArea.setTestDiag02(d51uTestDiagArea.getD51uTestDiag02());
  
//  MOVE D51U-TEST-DIAG-03 TO TEST-DIAG-03
          testDiagArea.setTestDiag03(d51uTestDiagArea.getD51uTestDiag03());
  
//  MOVE D51U-TEST-DIAG-04 TO TEST-DIAG-04
          testDiagArea.setTestDiag04(d51uTestDiagArea.getD51uTestDiag04());
  
//  MOVE D51U-TEST-DIAG-05 TO TEST-DIAG-05
          testDiagArea.setTestDiag05(d51uTestDiagArea.getD51uTestDiag05());
  
//  MOVE D51U-TEST-DIAG-06 TO TEST-DIAG-06
          testDiagArea.setTestDiag06(d51uTestDiagArea.getD51uTestDiag06());
  
//  MOVE D51U-TEST-DIAG-07 TO TEST-DIAG-07
          testDiagArea.setTestDiag07(d51uTestDiagArea.getD51uTestDiag07());
  
//  MOVE D51U-TEST-DIAG-08 TO TEST-DIAG-08
          testDiagArea.setTestDiag08(d51uTestDiagArea.getD51uTestDiag08());
  
//  MOVE D51U-TEST-DIAG-09 TO TEST-DIAG-09
          testDiagArea.setTestDiag09(d51uTestDiagArea.getD51uTestDiag09());
  
//  MOVE D51U-TEST-DIAG-10 TO TEST-DIAG-10
          testDiagArea.setTestDiag10(d51uTestDiagArea.getD51uTestDiag10());
  
//  MOVE D51U-TEST-DIAG-11 TO TEST-DIAG-11
          testDiagArea.setTestDiag11(d51uTestDiagArea.getD51uTestDiag11());
  
//  MOVE D51U-TEST-DIAG-12 TO TEST-DIAG-12
          testDiagArea.setTestDiag12(d51uTestDiagArea.getD51uTestDiag12());
  
//  MOVE D51U-TEST-DIAG-13 TO TEST-DIAG-13
          testDiagArea.setTestDiag13(d51uTestDiagArea.getD51uTestDiag13());
  
//  MOVE D51U-TEST-DIAG-14 TO TEST-DIAG-14
          testDiagArea.setTestDiag14(d51uTestDiagArea.getD51uTestDiag14());
  
//  MOVE D51U-TEST-DIAG-15 TO TEST-DIAG-15
          testDiagArea.setTestDiag15(d51uTestDiagArea.getD51uTestDiag15());
  
//  MOVE D51U-TEST-DIAG-16 TO TEST-DIAG-16
          testDiagArea.setTestDiag16(d51uTestDiagArea.getD51uTestDiag16());
  
//  MOVE D51U-TEST-DIAG-17 TO TEST-DIAG-17
          testDiagArea.setTestDiag17(d51uTestDiagArea.getD51uTestDiag17());
  
//  MOVE D51U-TEST-DIAG-18 TO TEST-DIAG-18
          testDiagArea.setTestDiag18(d51uTestDiagArea.getD51uTestDiag18());
  
//  MOVE D51U-TEST-DIAG-19 TO TEST-DIAG-19
          testDiagArea.setTestDiag19(d51uTestDiagArea.getD51uTestDiag19());
  
//  MOVE D51U-TEST-DIAG-20 TO TEST-DIAG-20
          testDiagArea.setTestDiag20(d51uTestDiagArea.getD51uTestDiag20());
  
//  MOVE D51U-TEST-DIAG-21 TO TEST-DIAG-21
          testDiagArea.setTestDiag21(d51uTestDiagArea.getD51uTestDiag21());
  
//  MOVE D51U-TEST-DIAG-22 TO TEST-DIAG-22
          testDiagArea.setTestDiag22(d51uTestDiagArea.getD51uTestDiag22());
  
//  MOVE D51U-TEST-DIAG-23 TO TEST-DIAG-23
          testDiagArea.setTestDiag23(d51uTestDiagArea.getD51uTestDiag23());
  
//  MOVE D51U-TEST-DIAG-24 TO TEST-DIAG-24
          testDiagArea.setTestDiag24(d51uTestDiagArea.getD51uTestDiag24());
  
//  MOVE D51U-TEST-DIAG-25 TO TEST-DIAG-25
          testDiagArea.setTestDiag25(d51uTestDiagArea.getD51uTestDiag25());
  
//  MOVE D51U-TEST-CPE-DESC-CD TO TEST-CPE-DESC-CD
          testVariables.setTestCpeDescCd(d51uTestValues.getD51uTestCpeDescCd());
  
//  PERFORM 2218-OPEN-SVC-MAIN-CSR THRU 2218-EXIT
          openSvcMainCsr();/*2218-OPEN-SVC-MAIN-CSR SECTION*/

// *
// *
//  MOVE +0 TO CAUS-SUB
          work.setCausSub(0);
//  MOVE CAUS-SUB TO D51U-CAUS-CNT
          d51uTableCounts.setD51uCausCnt(work.getCausSub());
  
//  SET CAUSECD-NOT-FOUND TO TRUE
          vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setCausecdNotFoundTrue(); 
          

// *
//  MOVE +0 TO IPA-SUB
          work.setIpaSub(0);
//  MOVE IPA-SUB TO D51U-IPA-CNT
          d51uTableCounts.setD51uIpaCnt(work.getIpaSub());
  
//  SET IPA-NOT-FOUND TO TRUE
          vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setIpaNotFoundTrue(); 
          

// *
//  MOVE +0 TO PTYP-SUB
          work.setPtypSub(0);
//  MOVE PTYP-SUB TO D51U-PTYP-CNT
          d51uTableCounts.setD51uPtypCnt(work.getPtypSub());
  
//  SET PROVTYP-NOT-FOUND TO TRUE
          vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setProvtypNotFoundTrue(); 
          

// *
//  MOVE +0 TO FCND-SUB
          work.setFcndSub(0);
//  MOVE FCND-SUB TO D51U-FCND-CNT
          d51uTableCounts.setD51uFcndCnt(work.getFcndSub());
  
//  SET POS-NOT-FOUND TO TRUE
          vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setPosNotFoundTrue(); 
          

// *
//  MOVE +0 TO CFLG-SUB
          work.setCflgSub(0);
//  MOVE CFLG-SUB TO D51U-CFLG-CNT
          d51uTableCounts.setD51uCflgCnt(work.getCflgSub());
  
//  SET CFLG-NOT-FOUND TO TRUE
          vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setCflgNotFoundTrue(); 
          

// *
//  SET CLOSE-CSR-OK TO TRUE
          work.setCloseCsrOkTrue(); 
          
//  SET NOT-END-OF-FETCH-COMB TO TRUE
          work.setNotEndOfFetchCombTrue(); 
          
//  PERFORM 2351-OPEN-COMB-CURSOR THRU 2351-EXIT
          openCombCursor();/*2351-OPEN-COMB-CURSOR SECTION*/
      
      }
      /**
      * processFuncCd2Split1 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-PROCESS-FUNC-CD-2-SPLIT1 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - d51uLstClmIcdInd               COBOL Name: D51U-LST-CLM-ICD-IND
      *
      * Output :  

      * - frtoSub                        COBOL Name: FRTO-SUB
      * - d51uFrtoCnt                    COBOL Name: D51U-FRTO-CNT
      * - svcFoundSw                     COBOL Name: SVC-FOUND-SW
      * - fetchEndFrto                   COBOL Name: WS-FETCH-END-FRTO
      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - icdSub                         COBOL Name: ICD-SUB
      * - d51uIcdCnt                     COBOL Name: D51U-ICD-CNT
      * - icdFoundSw                     COBOL Name: ICD-FOUND-SW
      * - lstClmIcdInd                   COBOL Name: WS-LST-CLM-ICD-IND
      * - d51uLstClmIcdInd               COBOL Name: D51U-LST-CLM-ICD-IND
      * - fetchEndIcd                    COBOL Name: WS-FETCH-END-ICD
      *
      * @throws CFException
      */
      private void processFuncCd2Split1() throws Exception {
			// Declare local variables used in the method
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			D51uLstIcdKey d51uLstIcdKey = vyspi51uCallArea.getD51uRequestFields().getD51uLstIcdKey();
			// End of variable declaration


// *
//  MOVE +0 TO FRTO-SUB
          work.setFrtoSub(0);
//  MOVE FRTO-SUB TO D51U-FRTO-CNT
          d51uTableCounts.setD51uFrtoCnt(work.getFrtoSub());
  
//  SET SVCD-NOT-FOUND TO TRUE
          vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setSvcdNotFoundTrue(); 
          

// *
//  SET NOT-END-OF-FETCH-FRTO TO TRUE
          work.setNotEndOfFetchFrtoTrue(); 
          
//  SET CLOSE-CSR-OK TO TRUE
          work.setCloseCsrOkTrue(); 
          
//  PERFORM 2250-OPEN-CSFRTO-CURSOR THRU 2250-EXIT
          openCsfrtoCursor();/*2250-OPEN-CSFRTO-CURSOR SECTION*/

// *
//  MOVE +0 TO ICD-SUB
          work.setIcdSub(0);
//  MOVE ICD-SUB TO D51U-ICD-CNT
          d51uTableCounts.setD51uIcdCnt(work.getIcdSub());
  
//  SET ICD-NOT-FOUND TO TRUE
          vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setIcdNotFoundTrue(); 
          
//  MOVE D51U-LST-CLM-ICD-IND TO WS-LST-CLM-ICD-IND
          lstIcdKey.setLstClmIcdInd(d51uLstIcdKey.getD51uLstClmIcdInd());
  

// *
//  SET NOT-END-OF-FETCH-ICD TO TRUE
          work.setNotEndOfFetchIcdTrue(); 
          
//  SET CLOSE-CSR-OK TO TRUE
          work.setCloseCsrOkTrue(); 
          
//  PERFORM 3200-OPEN-CSICD-CURSOR THRU 3200-EXIT
          openCsicdCursor3200();/*3200-OPEN-CSICD-CURSOR SECTION*/
          ;
      
      }
      /**
      * openCsfrtoCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 2250-OPEN-CSFRTO-CURSOR SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - fetchEndFrto                   COBOL Name: WS-FETCH-END-FRTO
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      private void openCsfrtoCursor() throws Exception {
			// Declare local variables used in the method
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

//  SELECT DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CLM_FRM_SVC_CD , CLM_TO_SVC_CD , SVC_TYP_CD FROM FE_SPI_RULE_FR_TO_SVC WHERE SPI_TBL_ID = ? AND STS_CD = 'A' FOR FETCH ONLY
          d529351uRepository.openCsfrtoD529351u(dclfeSpiRuleFrToSvc,sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  PERFORM 2280-FETCH-CSFRTO THRU 2280-EXIT UNTIL END-OF-FETCH-FRTO
              while (!(work.isEndOfFetchFrto()) ) {
                 fetchCsfrto();/*2280-FETCH-CSFRTO SECTION*/
              }
          break;
          default :
//  SET DSM-DB2-ERROR TO TRUE
              dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue(); 
              
//  SET D51U-DB2-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
              
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  SET D51U-DB2-OPEN-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2OpenErrorTrue(); 
              
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//  MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              d51uErrorTrace.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
  
//  MOVE '2250-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2250_MN_ = '2250-'
              d51uErrorTrace.setD51uParagraphNum(CONSTANTS.LITERAL_2250_MN_);
  
          }
      
      }
      /**
      * fetchCsfrto 
      *   This method is derived from 
  *   COBOL Paragraph - 2280-FETCH-CSFRTO SECTION COBOL Cyclomatic complexity - 11
      * Input  :  

      * - sqlerrd                        COBOL Name: SQLERRD
      * - frtoSub                        COBOL Name: FRTO-SUB
      * - hv08SvcDrvPos                  COBOL Name: HV08-SVC-DRV-POS
      * - hv09SvcDrvSvc                  COBOL Name: HV09-SVC-DRV-SVC
      * - hv10SvcDrvCau                  COBOL Name: HV10-SVC-DRV-CAU
      * - hv11ClmFrmSvcCd                COBOL Name: HV11-CLM-FRM-SVC-CD
      * - hv12ClmToSvcCd                 COBOL Name: HV12-CLM-TO-SVC-CD
      * - hv13SvcTypCd                   COBOL Name: HV13-SVC-TYP-CD
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsnnrows                       COBOL Name: DSNNROWS
      * - hv08Index                      COBOL Name: HV08-INDEX
      * - hv09Index                      COBOL Name: HV09-INDEX
      * - hv10Index                      COBOL Name: HV10-INDEX
      * - hv11Index                      COBOL Name: HV11-INDEX
      * - hv12Index                      COBOL Name: HV12-INDEX
      * - hv13Index                      COBOL Name: HV13-INDEX
      * - frtoSub                        COBOL Name: FRTO-SUB
      * - d51uFrtoDrvPos                 COBOL Name: D51U-FRTO-DRV-POS
      * - hv08SvcDrvPos                  COBOL Name: HV08-SVC-DRV-POS
      * - d51uFrtoDrvSvc                 COBOL Name: D51U-FRTO-DRV-SVC
      * - hv09SvcDrvSvc                  COBOL Name: HV09-SVC-DRV-SVC
      * - d51uFrtoDrvCau                 COBOL Name: D51U-FRTO-DRV-CAU
      * - hv10SvcDrvCau                  COBOL Name: HV10-SVC-DRV-CAU
      * - d51uFrtoClmFrmSvcCd            COBOL Name: D51U-FRTO-CLM-FRM-SVC-CD
      * - hv11ClmFrmSvcCd                COBOL Name: HV11-CLM-FRM-SVC-CD
      * - d51uFrtoClmToSvcCd             COBOL Name: D51U-FRTO-CLM-TO-SVC-CD
      * - hv12ClmToSvcCd                 COBOL Name: HV12-CLM-TO-SVC-CD
      * - d51uFrtoSvcTypCd               COBOL Name: D51U-FRTO-SVC-TYP-CD
      * - hv13SvcTypCd                   COBOL Name: HV13-SVC-TYP-CD
      * - svcFoundSw                     COBOL Name: SVC-FOUND-SW
      * - fetchEndFrto                   COBOL Name: WS-FETCH-END-FRTO
      * - d51uFrtoCnt                    COBOL Name: D51U-FRTO-CNT
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      private void fetchCsfrto() throws Exception {
			// Declare local variables used in the method
			int frtoSub = 0;
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			// End of variable declaration

// FETCH NEXT ROWSET FROM CSFRTO FOR 100 ROWS INTO  ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ? 
//  MOVE 100 TO DSNNROWS
          work.setDsnnrows(100);
//  FETCH NEXT ROWSET FROM CSFRTO FOR 100 ROWS INTO ? , ? , ? , ? , ? , ?
          d529351uRepository.fetchCsfrtoD529351u(hvHostVariablesCsfrto,sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:

// *45917C           add +1 to frto-sub
// *45917c           move frto-deriv-pl-of-svc-cd to
// *45917c                            d51u-frto-drv-pos  (frto-sub)
// *45917c           move frto-deriv-svc-cd       to
// *45917c                            d51u-frto-drv-svc  (frto-sub)
// *45917c           move frto-deriv-caus-cd  to
// *45917c                            d51u-frto-drv-cau  (frto-sub)
// *45917c           move frto-clm-frm-svc-cd to
// *45917c                       d51u-frto-clm-frm-svc-cd  (frto-sub)
// *45917c           move frto-clm-to-svc-cd  to
// *45917c                       d51u-frto-clm-to-svc-cd   (frto-sub)
// *45917c           move frto-svc-typ-cd     to
// *45917c                       d51u-frto-svc-typ-cd      (frto-sub)
// *45917c           set svcd-found  to true
//  SET HV08-INDEX TO +1
              hv08Index = 1; 
              
//  SET HV09-INDEX TO +1
              hv09Index = 1; 
              
//  SET HV10-INDEX TO +1
              hv10Index = 1; 
              
//  SET HV11-INDEX TO +1
              hv11Index = 1; 
              
//  SET HV12-INDEX TO +1
              hv12Index = 1; 
              
//  SET HV13-INDEX TO +1
              hv13Index = 1; 
              
//  PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < sqlca.getSqlerrd(2);index1++) {

// ***            Add +1            to frto-sub
// ***          if frto-sub <= +9999
                  frtoSub = work.getFrtoSub();
//  IF FRTO-SUB < +9999
                  if (	( frtoSub < 9999 )) { 
//  ADD +1 TO FRTO-SUB
                      work.setFrtoSub(work.getFrtoSub()+1);

// *              Move frto-deriv-pl-of-svc-cd
//  MOVE HV08-SVC-DRV-POS ( HV08-INDEX ) TO D51U-FRTO-DRV-POS ( FRTO-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getFrtoSub() - 1).setD51uFrtoDrvPos(hvHostVariablesCsfrto.getHv08SvcDrvPos(hv08Index - 1));

// *              Move frto-deriv-svc-cd
//  MOVE HV09-SVC-DRV-SVC ( HV09-INDEX ) TO D51U-FRTO-DRV-SVC ( FRTO-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getFrtoSub() - 1).setD51uFrtoDrvSvc(hvHostVariablesCsfrto.getHv09SvcDrvSvc(hv09Index - 1));

// *              Move frto-deriv-caus-cd
//  MOVE HV10-SVC-DRV-CAU ( HV10-INDEX ) TO D51U-FRTO-DRV-CAU ( FRTO-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getFrtoSub() - 1).setD51uFrtoDrvCau(hvHostVariablesCsfrto.getHv10SvcDrvCau(hv10Index - 1));
//  MOVE HV11-CLM-FRM-SVC-CD ( HV11-INDEX ) TO D51U-FRTO-CLM-FRM-SVC-CD ( FRTO-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getFrtoSub() - 1).setD51uFrtoClmFrmSvcCd(hvHostVariablesCsfrto.getHv11ClmFrmSvcCd(hv11Index - 1));
//  MOVE HV12-CLM-TO-SVC-CD ( HV12-INDEX ) TO D51U-FRTO-CLM-TO-SVC-CD ( FRTO-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getFrtoSub() - 1).setD51uFrtoClmToSvcCd(hvHostVariablesCsfrto.getHv12ClmToSvcCd(hv12Index - 1));
//  MOVE HV13-SVC-TYP-CD ( HV13-INDEX ) TO D51U-FRTO-SVC-TYP-CD ( FRTO-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getFrtoSub() - 1).setD51uFrtoSvcTypCd(hvHostVariablesCsfrto.getHv13SvcTypCd(hv13Index - 1));
                  }
  
//  SET HV08-INDEX UP BY +1
                  hv08Index++; 
                  
//  SET HV09-INDEX UP BY +1
                  hv09Index++; 
                  
//  SET HV10-INDEX UP BY +1
                  hv10Index++; 
                  
//  SET HV11-INDEX UP BY +1
                  hv11Index++; 
                  
//  SET HV12-INDEX UP BY +1
                  hv12Index++; 
                  
//  SET HV13-INDEX UP BY +1
                  hv13Index++; 
                  
              }
              frtoSub = work.getFrtoSub();
//  IF FRTO-SUB = +9999
              if (	( frtoSub == 9999 )) { 
//  SET SVCD-FOUND TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setSvcdFoundTrue(); 
                  
//  SET END-OF-FETCH-FRTO TO TRUE
                  work.setEndOfFetchFrtoTrue(); 
                  
//  MOVE FRTO-SUB TO D51U-FRTO-CNT
                  d51uTableCounts.setD51uFrtoCnt(work.getFrtoSub());
  
//  PERFORM 2285-CLOSE-CSR THRU 2285-EXIT
                  closeCsr2285();/*2285-CLOSE-CSR SECTION*/
              }
  
          break;
          	case 100:
//  SET HV08-INDEX TO +1
              hv08Index = 1; 
              
//  SET HV09-INDEX TO +1
              hv09Index = 1; 
              
//  SET HV10-INDEX TO +1
              hv10Index = 1; 
              
//  SET HV11-INDEX TO +1
              hv11Index = 1; 
              
//  SET HV12-INDEX TO +1
              hv12Index = 1; 
              
//  SET HV13-INDEX TO +1
              hv13Index = 1; 
              
//  PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < sqlca.getSqlerrd(2);index1++) {

// ***            Add +1            to frto-sub
// ***          if frto-sub <= +9999
                  frtoSub = work.getFrtoSub();
//  IF FRTO-SUB < +9999
                  if (	( frtoSub < 9999 )) { 
//  ADD +1 TO FRTO-SUB
                      work.setFrtoSub(work.getFrtoSub()+1);

// *              Move frto-deriv-pl-of-svc-cd
//  MOVE HV08-SVC-DRV-POS ( HV08-INDEX ) TO D51U-FRTO-DRV-POS ( FRTO-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getFrtoSub() - 1).setD51uFrtoDrvPos(hvHostVariablesCsfrto.getHv08SvcDrvPos(hv08Index - 1));

// *              Move frto-deriv-svc-cd
//  MOVE HV09-SVC-DRV-SVC ( HV09-INDEX ) TO D51U-FRTO-DRV-SVC ( FRTO-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getFrtoSub() - 1).setD51uFrtoDrvSvc(hvHostVariablesCsfrto.getHv09SvcDrvSvc(hv09Index - 1));

// *              Move frto-deriv-caus-cd
//  MOVE HV10-SVC-DRV-CAU ( HV10-INDEX ) TO D51U-FRTO-DRV-CAU ( FRTO-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getFrtoSub() - 1).setD51uFrtoDrvCau(hvHostVariablesCsfrto.getHv10SvcDrvCau(hv10Index - 1));
//  MOVE HV11-CLM-FRM-SVC-CD ( HV11-INDEX ) TO D51U-FRTO-CLM-FRM-SVC-CD ( FRTO-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getFrtoSub() - 1).setD51uFrtoClmFrmSvcCd(hvHostVariablesCsfrto.getHv11ClmFrmSvcCd(hv11Index - 1));
//  MOVE HV12-CLM-TO-SVC-CD ( HV12-INDEX ) TO D51U-FRTO-CLM-TO-SVC-CD ( FRTO-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getFrtoSub() - 1).setD51uFrtoClmToSvcCd(hvHostVariablesCsfrto.getHv12ClmToSvcCd(hv12Index - 1));
//  MOVE HV13-SVC-TYP-CD ( HV13-INDEX ) TO D51U-FRTO-SVC-TYP-CD ( FRTO-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getFrtoSub() - 1).setD51uFrtoSvcTypCd(hvHostVariablesCsfrto.getHv13SvcTypCd(hv13Index - 1));
                  }
  
//  SET HV08-INDEX UP BY +1
                  hv08Index++; 
                  
//  SET HV09-INDEX UP BY +1
                  hv09Index++; 
                  
//  SET HV10-INDEX UP BY +1
                  hv10Index++; 
                  
//  SET HV11-INDEX UP BY +1
                  hv11Index++; 
                  
//  SET HV12-INDEX UP BY +1
                  hv12Index++; 
                  
//  SET HV13-INDEX UP BY +1
                  hv13Index++; 
                  
              }
              frtoSub = work.getFrtoSub();
//  IF FRTO-SUB = 0
              if (	( frtoSub == 0 )) { 
//  SET SVCD-NOT-FOUND TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setSvcdNotFoundTrue(); 
                  
              }
  
//  ELSE
              else { 
//  SET SVCD-FOUND TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setSvcdFoundTrue(); 
                  
              }
//  SET END-OF-FETCH-FRTO TO TRUE
              work.setEndOfFetchFrtoTrue(); 
              
//  MOVE FRTO-SUB TO D51U-FRTO-CNT
              d51uTableCounts.setD51uFrtoCnt(work.getFrtoSub());
  
//  PERFORM 2285-CLOSE-CSR THRU 2285-EXIT
              closeCsr2285();/*2285-CLOSE-CSR SECTION*/
          break;
          default :
//  SET SVCD-NOT-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setSvcdNotFoundTrue(); 
              
//  SET END-OF-FETCH-FRTO TO TRUE
              work.setEndOfFetchFrtoTrue(); 
              
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  PERFORM 2285-CLOSE-CSR THRU 2285-EXIT
              closeCsr2285();/*2285-CLOSE-CSR SECTION*/
          }
      
      }
      /**
      * closeCsr2285 
      *   This method is derived from 
  *   COBOL Paragraph - 2285-CLOSE-CSR SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      private void closeCsr2285() throws Exception {
			// Declare local variables used in the method
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

//  CLOSE CSFRTO
          d529351uRepository.closeCsfrtoD529351u(sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  SET CLOSE-CSR-OK TO TRUE
              work.setCloseCsrOkTrue(); 
              
          break;
          default :
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  SET CLOSE-CSR-NG TO TRUE
              work.setCloseCsrNgTrue(); 
              
//  SET D51U-DB2-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
              
//  SET D51U-DB2-CLOSE-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2CloseErrorTrue(); 
              
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//  MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              d51uErrorTrace.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
  
//  MOVE '2285-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2285_MN_ = '2285-'
              d51uErrorTrace.setD51uParagraphNum(CONSTANTS.LITERAL_2285_MN_);
  
          }
      
      }
      /**
      * openCsptypCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 2350-OPEN-CSPTYP-CURSOR SECTION COBOL Cyclomatic complexity - 6
      * Input  :  

      * - fetchEndPtyp                   COBOL Name: WS-FETCH-END-PTYP
      * - ptypSub                        COBOL Name: PTYP-SUB
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      private void openCsptypCursor() throws Exception {
			// Declare local variables used in the method
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

      
// *81***************************************************************
// *81 2350-Open-csptyp-cursor section.                            *
// *81                                                              *
// *81 business function:                                           *
// *81 select / validate columns the fe spi tables                  *
// *81***************************************************************
// *82***************************************************************
// *82 2350-open-csptyp-cursor section                              *
// *82                                                              *
// *82 1.open cursor of this table                                  *
// *82                - fe_spi_rule_prov_typ                        *
// *82                                                              *
// *82 called by : 1.                                               *
// *82 call      :                                                  *
// *82                                                              *
// *82***************************************************************
//  SELECT PROV_TYP FROM FE_SPI_RULE_PROV_TYP WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND DERIV_PL_OF_SVC_CD = ? AND DERIV_SVC_CD = ? AND DERIV_CAUS_CD = ? FOR FETCH ONLY
          d529351uRepository.openCsptypD529351u(dclfeSpiRuleProvTyp,sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  PERFORM 2380-FETCH-CSPTYP THRU 2380-EXIT UNTIL END-OF-FETCH-PTYP OR PTYP-SUB > +99
              while (!(work.isEndOfFetchPtyp())  && 	( work.getPtypSub() <= 99 )) {
                 fetchCsptyp();/*2380-FETCH-CSPTYP SECTION*/
              }
          break;
          default :
//  SET DSM-DB2-ERROR TO TRUE
              dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue(); 
              
//  SET D51U-DB2-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
              
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  SET D51U-DB2-OPEN-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2OpenErrorTrue(); 
              
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//  MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              d51uErrorTrace.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
  
//  MOVE '2350-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2350_MN_ = '2350-'
              d51uErrorTrace.setD51uParagraphNum(CONSTANTS.LITERAL_2350_MN_);
  
          }
      
      }
      /**
      * fetchCsptyp 
      *   This method is derived from 
  *   COBOL Paragraph - 2380-FETCH-CSPTYP SECTION COBOL Cyclomatic complexity - 7
      * Input  :  

      * - ptypSub                        COBOL Name: PTYP-SUB
      * - ptypDerivPlOfSvcCd             COBOL Name: PTYP-DERIV-PL-OF-SVC-CD
      * - ptypDerivSvcCd                 COBOL Name: PTYP-DERIV-SVC-CD
      * - ptypDerivCausCd                COBOL Name: PTYP-DERIV-CAUS-CD
      * - ptypProvTyp                    COBOL Name: PTYP-PROV-TYP
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - ptypSub                        COBOL Name: PTYP-SUB
      * - d51uPtypDrvPos                 COBOL Name: D51U-PTYP-DRV-POS
      * - ptypDerivPlOfSvcCd             COBOL Name: PTYP-DERIV-PL-OF-SVC-CD
      * - d51uPtypDrvSvc                 COBOL Name: D51U-PTYP-DRV-SVC
      * - ptypDerivSvcCd                 COBOL Name: PTYP-DERIV-SVC-CD
      * - d51uPtypDrvCau                 COBOL Name: D51U-PTYP-DRV-CAU
      * - ptypDerivCausCd                COBOL Name: PTYP-DERIV-CAUS-CD
      * - d51uPtypProvTyp                COBOL Name: D51U-PTYP-PROV-TYP
      * - ptypProvTyp                    COBOL Name: PTYP-PROV-TYP
      * - provFoundSw                    COBOL Name: PROV-FOUND-SW
      * - fetchEndPtyp                   COBOL Name: WS-FETCH-END-PTYP
      * - d51uPtypCnt                    COBOL Name: D51U-PTYP-CNT
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      private void fetchCsptyp() throws Exception {
			// Declare local variables used in the method
			int ptypSub = 0;
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			// End of variable declaration

//  FETCH CSPTYP INTO ?
          d529351uRepository.fetchCsptypD529351u(dclfeSpiRuleProvTyp,sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
          
          	case 100:
              ptypSub = work.getPtypSub();
//  IF PTYP-SUB = 0
              if (	( ptypSub == 0 )) { 
//  SET PROVTYP-NOT-FOUND TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setProvtypNotFoundTrue(); 
                  
              }
  
//  ELSE
              else { 
//  SET PROVTYP-FOUND TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setProvtypFoundTrue(); 
                  
              }
//  SET END-OF-FETCH-PTYP TO TRUE
              work.setEndOfFetchPtypTrue(); 
              
//  MOVE PTYP-SUB TO D51U-PTYP-CNT
              d51uTableCounts.setD51uPtypCnt(work.getPtypSub());
  
//  PERFORM 2385-CLOSE-CSR THRU 2385-EXIT
              closeCsr2385();/*2385-CLOSE-CSR SECTION*/
          break;
          default :
//  SET END-OF-FETCH-PTYP TO TRUE
              work.setEndOfFetchPtypTrue(); 
              
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  PERFORM 2385-CLOSE-CSR THRU 2385-EXIT
              closeCsr2385();/*2385-CLOSE-CSR SECTION*/
          }
      
      }
      /**
      * closeCsr2385 
      *   This method is derived from 
  *   COBOL Paragraph - 2385-CLOSE-CSR SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      private void closeCsr2385() throws Exception {
			// Declare local variables used in the method
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

//  CLOSE CSPTYP
          d529351uRepository.closeCsptypD529351u(sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  SET CLOSE-CSR-OK TO TRUE
              work.setCloseCsrOkTrue(); 
              
          break;
          default :
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  SET CLOSE-CSR-NG TO TRUE
              work.setCloseCsrNgTrue(); 
              
//  SET D51U-DB2-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
              
//  SET D51U-DB2-CLOSE-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2CloseErrorTrue(); 
              
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//  MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              d51uErrorTrace.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
  
//  MOVE '2385-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2385_MN_ = '2385-'
              d51uErrorTrace.setD51uParagraphNum(CONSTANTS.LITERAL_2385_MN_);
  
          }
      
      }
      /**
      * openCsicdCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 2450-OPEN-CSICD-CURSOR SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      private void openCsicdCursor() throws Exception {
			// Declare local variables used in the method
			TestDiagArea testDiagArea = testVariables.getTestDiagArea();
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

      
// *81***************************************************************
// *81 2450-Open-csicd-cursor section.                              *
// *81                                                              *
// *81 business function:                                           *
// *81 select / validate columns the fe spi tables                  *
// *81***************************************************************
// *82***************************************************************
// *82 2450-open-csicd-cursor section                               *
// *82                                                              *
// *82 1.open cursor of this table                                  *
// *82                - fe_spi_rule_icd                             *
// *82                                                              *
// *82 called by : 1.                                               *
// *82 call      :                                                  *
// *82                                                              *
// *82***************************************************************
//  SELECT DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CLM_ICD_IND , CLM_ICD_FROM_CD , CLM_ICD_TO_CD FROM FE_SPI_RULE_ICD WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND DERIV_PL_OF_SVC_CD = ? AND DERIV_SVC_CD = ? AND DERIV_CAUS_CD = ? AND CLM_ICD_IND = ? AND ( ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? ) ORDER BY CLM_ICD_FROM_CD , CLM_ICD_TO_CD FOR FETCH ONLY
          d529351uRepository.openCsicdD529351u(dclfeSpiRuleIcd,lstIcdKey,sqlca,testVariables);
  
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  PERFORM 2480-FETCH-CSICD THRU 2480-EXIT
              fetchCsicd();/*2480-FETCH-CSICD SECTION*/
          break;
          default :
//  SET DSM-DB2-ERROR TO TRUE
              dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue(); 
              
//  SET D51U-DB2-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
              
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  SET D51U-DB2-OPEN-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2OpenErrorTrue(); 
              
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//  MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              d51uErrorTrace.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
  
//  MOVE '2450-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2450_MN_ = '2450-'
              d51uErrorTrace.setD51uParagraphNum(CONSTANTS.LITERAL_2450_MN_);
  
          }
      
      }
      /**
      * fetchCsicd 
      *   This method is derived from 
  *   COBOL Paragraph - 2480-FETCH-CSICD SECTION COBOL Cyclomatic complexity - 11
      * Input  :  

      * - sqlerrd                        COBOL Name: SQLERRD
      * - icdSub                         COBOL Name: ICD-SUB
      * - hv3aIcdDrvPos                  COBOL Name: HV3A-ICD-DRV-POS
      * - hv3bIcdDrvSvc                  COBOL Name: HV3B-ICD-DRV-SVC
      * - hv3cIcdDrvCau                  COBOL Name: HV3C-ICD-DRV-CAU
      * - hv3dIcdTypCd                   COBOL Name: HV3D-ICD-TYP-CD
      * - hv3eClmFrmIcdCd                COBOL Name: HV3E-CLM-FRM-ICD-CD
      * - hv3fClmToIcdCd                 COBOL Name: HV3F-CLM-TO-ICD-CD
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsnnrows                       COBOL Name: DSNNROWS
      * - hv3aIndex                      COBOL Name: HV3A-INDEX
      * - hv3bIndex                      COBOL Name: HV3B-INDEX
      * - hv3cIndex                      COBOL Name: HV3C-INDEX
      * - hv3dIndex                      COBOL Name: HV3D-INDEX
      * - hv3eIndex                      COBOL Name: HV3E-INDEX
      * - hv3fIndex                      COBOL Name: HV3F-INDEX
      * - icdSub                         COBOL Name: ICD-SUB
      * - d51uRicdDrvPos                 COBOL Name: D51U-RICD-DRV-POS
      * - hv3aIcdDrvPos                  COBOL Name: HV3A-ICD-DRV-POS
      * - d51uRicdDrvSvc                 COBOL Name: D51U-RICD-DRV-SVC
      * - hv3bIcdDrvSvc                  COBOL Name: HV3B-ICD-DRV-SVC
      * - d51uRicdDrvCau                 COBOL Name: D51U-RICD-DRV-CAU
      * - hv3cIcdDrvCau                  COBOL Name: HV3C-ICD-DRV-CAU
      * - d51uRicdClmIcdInd              COBOL Name: D51U-RICD-CLM-ICD-IND
      * - hv3dIcdTypCd                   COBOL Name: HV3D-ICD-TYP-CD
      * - d51uRicdClmIcdFromCd           COBOL Name: D51U-RICD-CLM-ICD-FROM-CD
      * - hv3eClmFrmIcdCd                COBOL Name: HV3E-CLM-FRM-ICD-CD
      * - d51uRicdClmIcdToCd             COBOL Name: D51U-RICD-CLM-ICD-TO-CD
      * - hv3fClmToIcdCd                 COBOL Name: HV3F-CLM-TO-ICD-CD
      * - moreIcdFoundSw                 COBOL Name: MORE-ICD-FOUND-SW
      * - d51uMoreIcdCnt                 COBOL Name: D51U-MORE-ICD-CNT
      * - fetchEndIcd                    COBOL Name: WS-FETCH-END-ICD
      * - icdFoundSw                     COBOL Name: ICD-FOUND-SW
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      private void fetchCsicd() throws Exception {
			// Declare local variables used in the method
			int icdSub = 0;
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			// End of variable declaration

// FETCH NEXT ROWSET FROM CSICD FOR 9999 ROWS INTO  ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ? 
//  MOVE 9999 TO DSNNROWS
          work.setDsnnrows(9999);
//  FETCH NEXT ROWSET FROM CSICD FOR 9999 ROWS INTO ? , ? , ? , ? , ? , ?
          d529351uRepository.fetchCsicdD529351u(hvHostVariablesCsicdo,sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  SET HV3A-INDEX TO +1
              hv3aIndex = 1; 
              
//  SET HV3B-INDEX TO +1
              hv3bIndex = 1; 
              
//  SET HV3C-INDEX TO +1
              hv3cIndex = 1; 
              
//  SET HV3D-INDEX TO +1
              hv3dIndex = 1; 
              
//  SET HV3E-INDEX TO +1
              hv3eIndex = 1; 
              
//  SET HV3F-INDEX TO +1
              hv3fIndex = 1; 
              
//  PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < sqlca.getSqlerrd(2);index1++) {

// **         Add +1 to icd-sub
// **        if icd-sub > +0 and icd-sub <= +9999
                  icdSub = work.getIcdSub();
//  IF ICD-SUB < +9999
                  if (	( icdSub < 9999 )) { 
//  ADD +1 TO ICD-SUB
                      work.setIcdSub(work.getIcdSub()+1);

// **         Move ricd-deriv-pl-of-svc-cd  to
//  MOVE HV3A-ICD-DRV-POS ( HV3A-INDEX ) TO D51U-RICD-DRV-POS ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdDrvPos(hvHostVariablesCsicdo.getHv3aIcdDrvPos(hv3aIndex - 1));

// **         Move ricd-deriv-svc-cd        to
//  MOVE HV3B-ICD-DRV-SVC ( HV3B-INDEX ) TO D51U-RICD-DRV-SVC ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdDrvSvc(hvHostVariablesCsicdo.getHv3bIcdDrvSvc(hv3bIndex - 1));

// **         Move ricd-deriv-caus-cd       to
//  MOVE HV3C-ICD-DRV-CAU ( HV3C-INDEX ) TO D51U-RICD-DRV-CAU ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdDrvCau(hvHostVariablesCsicdo.getHv3cIcdDrvCau(hv3cIndex - 1));

// **         Move ricd-clm-icd-ind         to
//  MOVE HV3D-ICD-TYP-CD ( HV3D-INDEX ) TO D51U-RICD-CLM-ICD-IND ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdClmIcdInd(hvHostVariablesCsicdo.getHv3dIcdTypCd(hv3dIndex - 1));

// **         Move ricd-clm-icd-from-cd  to
//  MOVE HV3E-CLM-FRM-ICD-CD ( HV3E-INDEX ) TO D51U-RICD-CLM-ICD-FROM-CD ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdClmIcdFromCd(hvHostVariablesCsicdo.getHv3eClmFrmIcdCd(hv3eIndex - 1));

// **         Move ricd-clm-icd-to-cd  to
//  MOVE HV3F-CLM-TO-ICD-CD ( HV3F-INDEX ) TO D51U-RICD-CLM-ICD-TO-CD ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdClmIcdToCd(hvHostVariablesCsicdo.getHv3fClmToIcdCd(hv3fIndex - 1));
                  }
  

// **         Set icd-found to true
// **        else
// **         move 'y' to d51u-more-icd-records
// **         move +9999 to d51u-icd-cnt
// **         set end-of-fetch-icd  to true
// **         perform 2485-close-csr  thru 2485-exit
//  SET HV3A-INDEX UP BY +1
                  hv3aIndex++; 
                  
//  SET HV3B-INDEX UP BY +1
                  hv3bIndex++; 
                  
//  SET HV3C-INDEX UP BY +1
                  hv3cIndex++; 
                  
//  SET HV3D-INDEX UP BY +1
                  hv3dIndex++; 
                  
//  SET HV3E-INDEX UP BY +1
                  hv3eIndex++; 
                  
//  SET HV3F-INDEX UP BY +1
                  hv3fIndex++; 
                  
              }
              icdSub = work.getIcdSub();
//  IF ICD-SUB = +9999
              if (	( icdSub == 9999 )) { 
//  SET MORE-ICD-FOUND TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setMoreIcdFoundTrue(); 
                  
//  MOVE ICD-SUB TO D51U-MORE-ICD-CNT
                  d51uTableCounts.setD51uMoreIcdCnt(work.getIcdSub());
  
              }
  
          break;
          	case 100:
//  SET HV3A-INDEX TO +1
              hv3aIndex = 1; 
              
//  SET HV3B-INDEX TO +1
              hv3bIndex = 1; 
              
//  SET HV3C-INDEX TO +1
              hv3cIndex = 1; 
              
//  SET HV3D-INDEX TO +1
              hv3dIndex = 1; 
              
//  SET HV3E-INDEX TO +1
              hv3eIndex = 1; 
              
//  SET HV3F-INDEX TO +1
              hv3fIndex = 1; 
              
//  PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < sqlca.getSqlerrd(2);index1++) {
                  icdSub = work.getIcdSub();
//  IF ICD-SUB < +9999
                  if (	( icdSub < 9999 )) { 
//  ADD +1 TO ICD-SUB
                      work.setIcdSub(work.getIcdSub()+1);
//  MOVE HV3A-ICD-DRV-POS ( HV3A-INDEX ) TO D51U-RICD-DRV-POS ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdDrvPos(hvHostVariablesCsicdo.getHv3aIcdDrvPos(hv3aIndex - 1));
//  MOVE HV3B-ICD-DRV-SVC ( HV3B-INDEX ) TO D51U-RICD-DRV-SVC ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdDrvSvc(hvHostVariablesCsicdo.getHv3bIcdDrvSvc(hv3bIndex - 1));
//  MOVE HV3C-ICD-DRV-CAU ( HV3C-INDEX ) TO D51U-RICD-DRV-CAU ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdDrvCau(hvHostVariablesCsicdo.getHv3cIcdDrvCau(hv3cIndex - 1));
//  MOVE HV3D-ICD-TYP-CD ( HV3D-INDEX ) TO D51U-RICD-CLM-ICD-IND ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdClmIcdInd(hvHostVariablesCsicdo.getHv3dIcdTypCd(hv3dIndex - 1));
//  MOVE HV3E-CLM-FRM-ICD-CD ( HV3E-INDEX ) TO D51U-RICD-CLM-ICD-FROM-CD ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdClmIcdFromCd(hvHostVariablesCsicdo.getHv3eClmFrmIcdCd(hv3eIndex - 1));
//  MOVE HV3F-CLM-TO-ICD-CD ( HV3F-INDEX ) TO D51U-RICD-CLM-ICD-TO-CD ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdClmIcdToCd(hvHostVariablesCsicdo.getHv3fClmToIcdCd(hv3fIndex - 1));
                  }
  
//  SET HV3A-INDEX UP BY +1
                  hv3aIndex++; 
                  
//  SET HV3B-INDEX UP BY +1
                  hv3bIndex++; 
                  
//  SET HV3C-INDEX UP BY +1
                  hv3cIndex++; 
                  
//  SET HV3D-INDEX UP BY +1
                  hv3dIndex++; 
                  
//  SET HV3E-INDEX UP BY +1
                  hv3eIndex++; 
                  
//  SET HV3F-INDEX UP BY +1
                  hv3fIndex++; 
                  
              }
              icdSub = work.getIcdSub();
//  IF ICD-SUB = 0
              if (	( icdSub == 0 )) { 

// **            Set icd-not-found  to true
//  SET MORE-ICD-NOT-FOUND TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setMoreIcdNotFoundTrue(); 
                  
              }
  
//  ELSE
              else { 

// **            Set icd-found  to true
//  SET MORE-ICD-FOUND TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setMoreIcdFoundTrue(); 
                  
              }
//  SET END-OF-FETCH-ICD TO TRUE
              work.setEndOfFetchIcdTrue(); 
              

// **         Move icd-sub to d51u-icd-cnt
//  MOVE ICD-SUB TO D51U-MORE-ICD-CNT
              d51uTableCounts.setD51uMoreIcdCnt(work.getIcdSub());
  
//  PERFORM 2485-CLOSE-CSR THRU 2485-EXIT
              closeCsr2485();/*2485-CLOSE-CSR SECTION*/
          break;
          default :
//  SET ICD-NOT-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setIcdNotFoundTrue(); 
              
//  SET END-OF-FETCH-ICD TO TRUE
              work.setEndOfFetchIcdTrue(); 
              
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  PERFORM 2485-CLOSE-CSR THRU 2485-EXIT
              closeCsr2485();/*2485-CLOSE-CSR SECTION*/
          }
      
      }
      /**
      * closeCsr2485 
      *   This method is derived from 
  *   COBOL Paragraph - 2485-CLOSE-CSR SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      private void closeCsr2485() throws Exception {
			// Declare local variables used in the method
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

//  CLOSE CSICD
          d529351uRepository.closeCsicdD529351u(sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  SET CLOSE-CSR-OK TO TRUE
              work.setCloseCsrOkTrue(); 
              
          break;
          default :
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  SET CLOSE-CSR-NG TO TRUE
              work.setCloseCsrNgTrue(); 
              
//  SET D51U-DB2-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
              
//  SET D51U-DB2-CLOSE-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2CloseErrorTrue(); 
              
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//  MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              d51uErrorTrace.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
  
//  MOVE '2485-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2485_MN_ = '2485-'
              d51uErrorTrace.setD51uParagraphNum(CONSTANTS.LITERAL_2485_MN_);
  
          }
      
      }
      /**
      * openCsfcndCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 2550-OPEN-CSFCND-CURSOR SECTION COBOL Cyclomatic complexity - 6
      * Input  :  

      * - fetchEndFcnd                   COBOL Name: WS-FETCH-END-FCND
      * - fcndSub                        COBOL Name: FCND-SUB
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      private void openCsfcndCursor() throws Exception {
			// Declare local variables used in the method
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

      
// *81***************************************************************
// *81 2550-Open-csfcnd-cursor section.                             *
// *81                                                              *
// *81 business function:                                           *
// *81 select / validate columns the fe spi tables                  *
// *81***************************************************************
// *82***************************************************************
// *82 2550-open-csfcnd-cursor section                              *
// *82                                                              *
// *82 1.open cursor and fetch data from:                           *
// *82                - fe_spi_rule_fr_cond_pos                     *
// *82                                                              *
// *82 called by : 1.                                               *
// *82 call      :                                                  *
// *82                                                              *
// *82***************************************************************
//  SELECT FROM_COND_POS FROM FE_SPI_RULE_FR_COND_POS WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND DERIV_PL_OF_SVC_CD = ? AND DERIV_SVC_CD = ? AND DERIV_CAUS_CD = ? FOR FETCH ONLY
          d529351uRepository.openCsfcndD529351u(sqlca,dclfeSpiRuleFrCondPos);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  PERFORM 2580-FETCH-CSFCND THRU 2580-EXIT UNTIL END-OF-FETCH-FCND OR FCND-SUB > +99
              while (!(work.isEndOfFetchFcnd())  && 	( work.getFcndSub() <= 99 )) {
                 fetchCsfcnd();/*2580-FETCH-CSFCND SECTION*/
              }
          break;
          default :
//  SET DSM-DB2-ERROR TO TRUE
              dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue(); 
              
//  SET D51U-DB2-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
              
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  SET D51U-DB2-OPEN-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2OpenErrorTrue(); 
              
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//  MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              d51uErrorTrace.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
  
//  MOVE '2550-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2550_MN_ = '2550-'
              d51uErrorTrace.setD51uParagraphNum(CONSTANTS.LITERAL_2550_MN_);
  
          }
      
      }
      /**
      * fetchCsfcnd 
      *   This method is derived from 
  *   COBOL Paragraph - 2580-FETCH-CSFCND SECTION COBOL Cyclomatic complexity - 6
      * Input  :  

      * - fcndSub                        COBOL Name: FCND-SUB
      * - fcndDerivPlOfSvcCd             COBOL Name: FCND-DERIV-PL-OF-SVC-CD
      * - fcndDerivSvcCd                 COBOL Name: FCND-DERIV-SVC-CD
      * - fcndDerivCausCd                COBOL Name: FCND-DERIV-CAUS-CD
      * - fcndFromCondPos                COBOL Name: FCND-FROM-COND-POS
      * - csSub                          COBOL Name: CS-SUB
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - fcndSub                        COBOL Name: FCND-SUB
      * - d51uFcndDrvPos                 COBOL Name: D51U-FCND-DRV-POS
      * - fcndDerivPlOfSvcCd             COBOL Name: FCND-DERIV-PL-OF-SVC-CD
      * - d51uFcndDrvSvc                 COBOL Name: D51U-FCND-DRV-SVC
      * - fcndDerivSvcCd                 COBOL Name: FCND-DERIV-SVC-CD
      * - d51uFcndDrvCau                 COBOL Name: D51U-FCND-DRV-CAU
      * - fcndDerivCausCd                COBOL Name: FCND-DERIV-CAUS-CD
      * - d51uFcndFromCondPos            COBOL Name: D51U-FCND-FROM-COND-POS
      * - fcndFromCondPos                COBOL Name: FCND-FROM-COND-POS
      * - posFoundSw                     COBOL Name: POS-FOUND-SW
      * - fetchEndFcnd                   COBOL Name: WS-FETCH-END-FCND
      * - d51uFcndCnt                    COBOL Name: D51U-FCND-CNT
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      private void fetchCsfcnd() throws Exception {
			// Declare local variables used in the method
			int csSub = 0;
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			// End of variable declaration

//  FETCH CSFCND INTO ?
          d529351uRepository.fetchCsfcndD529351u(sqlca,dclfeSpiRuleFrCondPos);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  ADD +1 TO FCND-SUB
              work.setFcndSub(work.getFcndSub()+1);
//  MOVE FCND-DERIV-PL-OF-SVC-CD TO D51U-FCND-DRV-POS ( FCND-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrCondPos().getD51uRetRuleFrCondPos(work.getFcndSub() - 1).setD51uFcndDrvPos(dclfeSpiRuleFrCondPos.getFcndDerivPlOfSvcCd());
//  MOVE FCND-DERIV-SVC-CD TO D51U-FCND-DRV-SVC ( FCND-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrCondPos().getD51uRetRuleFrCondPos(work.getFcndSub() - 1).setD51uFcndDrvSvc(dclfeSpiRuleFrCondPos.getFcndDerivSvcCd());
//  MOVE FCND-DERIV-CAUS-CD TO D51U-FCND-DRV-CAU ( FCND-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrCondPos().getD51uRetRuleFrCondPos(work.getFcndSub() - 1).setD51uFcndDrvCau(dclfeSpiRuleFrCondPos.getFcndDerivCausCd());
//  MOVE FCND-FROM-COND-POS TO D51U-FCND-FROM-COND-POS ( FCND-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrCondPos().getD51uRetRuleFrCondPos(work.getFcndSub() - 1).setD51uFcndFromCondPos(pad(3,dclfeSpiRuleFrCondPos.getFcndFromCondPos(),SPACE_CHAR,RIGHT_PAD));
//  SET POS-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setPosFoundTrue(); 
              
          break;
          	case 100:
              csSub = work.getCsSub();
//  IF CS-SUB = 0
              if (	( csSub == 0 )) { 
//  SET POS-NOT-FOUND TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setPosNotFoundTrue(); 
                  
              }
  
//  ELSE
              else { 
//  SET POS-FOUND TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setPosFoundTrue(); 
                  
              }
//  SET END-OF-FETCH-FCND TO TRUE
              work.setEndOfFetchFcndTrue(); 
              
//  MOVE FCND-SUB TO D51U-FCND-CNT
              d51uTableCounts.setD51uFcndCnt(work.getFcndSub());
  
//  PERFORM 2585-CLOSE-CSR THRU 2585-EXIT
              closeCsr2585();/*2585-CLOSE-CSR SECTION*/
          break;
          default :
//  SET POS-NOT-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setPosNotFoundTrue(); 
              
//  SET END-OF-FETCH-FCND TO TRUE
              work.setEndOfFetchFcndTrue(); 
              
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  PERFORM 2585-CLOSE-CSR THRU 2585-EXIT
              closeCsr2585();/*2585-CLOSE-CSR SECTION*/
          }
      
      }
      /**
      * closeCsr2585 
      *   This method is derived from 
  *   COBOL Paragraph - 2585-CLOSE-CSR SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      private void closeCsr2585() throws Exception {
			// Declare local variables used in the method
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

//  CLOSE CSFCND
          d529351uRepository.closeCsfcndD529351u(sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  SET CLOSE-CSR-OK TO TRUE
              work.setCloseCsrOkTrue(); 
              
          break;
          default :
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  SET CLOSE-CSR-NG TO TRUE
              work.setCloseCsrNgTrue(); 
              
//  SET D51U-DB2-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
              
//  SET D51U-DB2-CLOSE-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2CloseErrorTrue(); 
              
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//  MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              d51uErrorTrace.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
  
//  MOVE '2585-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2585_MN_ = '2585-'
              d51uErrorTrace.setD51uParagraphNum(CONSTANTS.LITERAL_2585_MN_);
  
          }
      
      }
      /**
      * selectCauseTable 
      *   This method is derived from 
  *   COBOL Paragraph - 2650-SELECT-CAUSE-TABLE SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - causSub                        COBOL Name: CAUS-SUB
      * - causDerivPlOfSvcCd             COBOL Name: CAUS-DERIV-PL-OF-SVC-CD
      * - causDerivSvcCd                 COBOL Name: CAUS-DERIV-SVC-CD
      * - causDerivCausCd                COBOL Name: CAUS-DERIV-CAUS-CD
      * - causClmCaus1Cd                 COBOL Name: CAUS-CLM-CAUS-1-CD
      * - causClmCaus2Cd                 COBOL Name: CAUS-CLM-CAUS-2-CD
      * - causClmCaus3Cd                 COBOL Name: CAUS-CLM-CAUS-3-CD
      * - causClmCaus4Cd                 COBOL Name: CAUS-CLM-CAUS-4-CD
      * - causClmCaus5Cd                 COBOL Name: CAUS-CLM-CAUS-5-CD
      * - causClmCaus6Cd                 COBOL Name: CAUS-CLM-CAUS-6-CD
      * - causClmCaus7Cd                 COBOL Name: CAUS-CLM-CAUS-7-CD
      * - causClmCaus8Cd                 COBOL Name: CAUS-CLM-CAUS-8-CD
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - causSub                        COBOL Name: CAUS-SUB
      * - d51uCausCnt                    COBOL Name: D51U-CAUS-CNT
      * - d51uCausDrvPos                 COBOL Name: D51U-CAUS-DRV-POS
      * - causDerivPlOfSvcCd             COBOL Name: CAUS-DERIV-PL-OF-SVC-CD
      * - d51uCausDrvSvc                 COBOL Name: D51U-CAUS-DRV-SVC
      * - causDerivSvcCd                 COBOL Name: CAUS-DERIV-SVC-CD
      * - d51uCausDrvCau                 COBOL Name: D51U-CAUS-DRV-CAU
      * - causDerivCausCd                COBOL Name: CAUS-DERIV-CAUS-CD
      * - d51uCausClmCauseCd1            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-1
      * - causClmCaus1Cd                 COBOL Name: CAUS-CLM-CAUS-1-CD
      * - d51uCausClmCauseCd2            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-2
      * - causClmCaus2Cd                 COBOL Name: CAUS-CLM-CAUS-2-CD
      * - d51uCausClmCauseCd3            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-3
      * - causClmCaus3Cd                 COBOL Name: CAUS-CLM-CAUS-3-CD
      * - d51uCausClmCauseCd4            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-4
      * - causClmCaus4Cd                 COBOL Name: CAUS-CLM-CAUS-4-CD
      * - d51uCausClmCauseCd5            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-5
      * - causClmCaus5Cd                 COBOL Name: CAUS-CLM-CAUS-5-CD
      * - d51uCausClmCauseCd6            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-6
      * - causClmCaus6Cd                 COBOL Name: CAUS-CLM-CAUS-6-CD
      * - d51uCausClmCauseCd7            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-7
      * - causClmCaus7Cd                 COBOL Name: CAUS-CLM-CAUS-7-CD
      * - d51uCausClmCauseCd8            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-8
      * - causClmCaus8Cd                 COBOL Name: CAUS-CLM-CAUS-8-CD
      * - causFoundSw                    COBOL Name: CAUS-FOUND-SW
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      private void selectCauseTable() throws Exception {
			// Declare local variables used in the method
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

      
// *81***************************************************************
// *81 2650-Select-cause-table section.                             *
// *81                                                              *
// *81 business function:                                           *
// *81 select / validate columns the fe spi tables                  *
// *81***************************************************************
// *82***************************************************************
// *82 2650-select-cause-table section                              *
// *82                                                              *
// *82 1.select from this table:                                    *
// *82                - fe_spi_rule_caus                            *
// *82                                                              *
// *82 called by : 1.                                               *
// *82 call      :                                                  *
// *82                                                              *
// *82***************************************************************
//  SELECT CLM_CAUS_1_CD , CLM_CAUS_2_CD , CLM_CAUS_3_CD , CLM_CAUS_4_CD , CLM_CAUS_5_CD , CLM_CAUS_6_CD , CLM_CAUS_7_CD , CLM_CAUS_8_CD FROM FE_SPI_RULE_CAUS WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND DERIV_PL_OF_SVC_CD = ? AND DERIV_SVC_CD = ? AND DERIV_CAUS_CD = ? FETCH FIRST 1 ROW ONLY
          d529351uRepository.selectFeSpiRuleCaus(dclfeSpiRuleCaus,sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  ADD 1 TO CAUS-SUB
              work.setCausSub(work.getCausSub()+1);
//  MOVE CAUS-SUB TO D51U-CAUS-CNT
              d51uTableCounts.setD51uCausCnt(work.getCausSub());
  
//  MOVE CAUS-DERIV-PL-OF-SVC-CD TO D51U-CAUS-DRV-POS ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausDrvPos(dclfeSpiRuleCaus.getCausDerivPlOfSvcCd());
//  MOVE CAUS-DERIV-SVC-CD TO D51U-CAUS-DRV-SVC ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausDrvSvc(dclfeSpiRuleCaus.getCausDerivSvcCd());
//  MOVE CAUS-DERIV-CAUS-CD TO D51U-CAUS-DRV-CAU ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausDrvCau(dclfeSpiRuleCaus.getCausDerivCausCd());
//  MOVE CAUS-CLM-CAUS-1-CD TO D51U-CAUS-CLM-CAUSE-CD-1 ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausClmCauseCd1(dclfeSpiRuleCaus.getCausClmCaus1Cd());
//  MOVE CAUS-CLM-CAUS-2-CD TO D51U-CAUS-CLM-CAUSE-CD-2 ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausClmCauseCd2(dclfeSpiRuleCaus.getCausClmCaus2Cd());
//  MOVE CAUS-CLM-CAUS-3-CD TO D51U-CAUS-CLM-CAUSE-CD-3 ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausClmCauseCd3(dclfeSpiRuleCaus.getCausClmCaus3Cd());
//  MOVE CAUS-CLM-CAUS-4-CD TO D51U-CAUS-CLM-CAUSE-CD-4 ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausClmCauseCd4(dclfeSpiRuleCaus.getCausClmCaus4Cd());
//  MOVE CAUS-CLM-CAUS-5-CD TO D51U-CAUS-CLM-CAUSE-CD-5 ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausClmCauseCd5(dclfeSpiRuleCaus.getCausClmCaus5Cd());
//  MOVE CAUS-CLM-CAUS-6-CD TO D51U-CAUS-CLM-CAUSE-CD-6 ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausClmCauseCd6(dclfeSpiRuleCaus.getCausClmCaus6Cd());
//  MOVE CAUS-CLM-CAUS-7-CD TO D51U-CAUS-CLM-CAUSE-CD-7 ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausClmCauseCd7(dclfeSpiRuleCaus.getCausClmCaus7Cd());
//  MOVE CAUS-CLM-CAUS-8-CD TO D51U-CAUS-CLM-CAUSE-CD-8 ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausClmCauseCd8(dclfeSpiRuleCaus.getCausClmCaus8Cd());
//  SET CAUSECD-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setCausecdFoundTrue(); 
              
          break;
          	case +100:
//  SET CAUSECD-NOT-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setCausecdNotFoundTrue(); 
              
//  MOVE CAUS-SUB TO D51U-CAUS-CNT
              d51uTableCounts.setD51uCausCnt(work.getCausSub());
  
          break;
          default :
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  SET D51U-DB2-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
              
//  SET D51U-DB2-SELECT-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2SelectErrorTrue(); 
              
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//  MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              d51uErrorTrace.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
  
//  MOVE '2650-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2650_MN_ = '2650-'
              d51uErrorTrace.setD51uParagraphNum(CONSTANTS.LITERAL_2650_MN_);
  
//  SET CAUSECD-NOT-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setCausecdNotFoundTrue(); 
              
          }
      
      }
      /**
      * selectIpaTable 
      *   This method is derived from 
  *   COBOL Paragraph - 2750-SELECT-IPA-TABLE SECTION COBOL Cyclomatic complexity - 11
      * Input  :  

      * - ipaSub                         COBOL Name: IPA-SUB
      * - ripaClmIpa1Cd                  COBOL Name: RIPA-CLM-IPA-1-CD
      * - d51uIpaCnt                     COBOL Name: D51U-IPA-CNT
      * - ripaClmIpa2Cd                  COBOL Name: RIPA-CLM-IPA-2-CD
      * - ripaClmIpa3Cd                  COBOL Name: RIPA-CLM-IPA-3-CD
      * - ripaSpiTblId                   COBOL Name: RIPA-SPI-TBL-ID
      * - ripaDerivPlOfSvcCd             COBOL Name: RIPA-DERIV-PL-OF-SVC-CD
      * - ripaDerivSvcCd                 COBOL Name: RIPA-DERIV-SVC-CD
      * - ripaDerivCausCd                COBOL Name: RIPA-DERIV-CAUS-CD
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - ipaSub                         COBOL Name: IPA-SUB
      * - d51uRipaClmIpa1Cd              COBOL Name: D51U-RIPA-CLM-IPA-1-CD
      * - d51uIpaCnt                     COBOL Name: D51U-IPA-CNT
      * - ripaClmIpa1Cd                  COBOL Name: RIPA-CLM-IPA-1-CD
      * - d51uRipaClmIpa2Cd              COBOL Name: D51U-RIPA-CLM-IPA-2-CD
      * - ripaClmIpa2Cd                  COBOL Name: RIPA-CLM-IPA-2-CD
      * - d51uRipaClmIpa3Cd              COBOL Name: D51U-RIPA-CLM-IPA-3-CD
      * - ripaClmIpa3Cd                  COBOL Name: RIPA-CLM-IPA-3-CD
      * - d51uRipaSpiTblId               COBOL Name: D51U-RIPA-SPI-TBL-ID
      * - ripaSpiTblId                   COBOL Name: RIPA-SPI-TBL-ID
      * - d51uRipaDrvPos                 COBOL Name: D51U-RIPA-DRV-POS
      * - ripaDerivPlOfSvcCd             COBOL Name: RIPA-DERIV-PL-OF-SVC-CD
      * - d51uRipaDrvSvc                 COBOL Name: D51U-RIPA-DRV-SVC
      * - ripaDerivSvcCd                 COBOL Name: RIPA-DERIV-SVC-CD
      * - d51uRipaDrvCau                 COBOL Name: D51U-RIPA-DRV-CAU
      * - ripaDerivCausCd                COBOL Name: RIPA-DERIV-CAUS-CD
      * - ipaFoundSw                     COBOL Name: IPA-FOUND-SW
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      private void selectIpaTable() throws Exception {
			// Declare local variables used in the method
			char[] ripaClmIpa1Cd = null;
			char[] ripaClmIpa2Cd = null;
			char[] ripaClmIpa3Cd = null;
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

      
// *82***************************************************************
//  SELECT CLM_IPA_1_CD , CLM_IPA_2_CD , CLM_IPA_3_CD FROM FE_SPI_RULE_IPA WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND DERIV_PL_OF_SVC_CD = ? AND DERIV_SVC_CD = ? AND DERIV_CAUS_CD = ? FETCH FIRST 1 ROW ONLY
          d529351uRepository.selectFeSpiRuleIpa(dclfeSpiRuleIpa,sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  ADD 1 TO IPA-SUB
              work.setIpaSub(work.getIpaSub()+1);

// ***     Move ipa-sub to d51u-ipa-cnt
              ripaClmIpa1Cd = dclfeSpiRuleIpa.getRipaClmIpa1Cd();
//  IF RIPA-CLM-IPA-1-CD = SPACES OR LOW-VALUES
              if (        ( allSpaces(ripaClmIpa1Cd)   ) || 			( checkLowValue(ripaClmIpa1Cd) ) ) { 
//  MOVE ZEROES TO D51U-RIPA-CLM-IPA-1-CD ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaClmIpa1Cd(0);
              }
  
//  ELSE
              else { 
//  ADD 1 TO D51U-IPA-CNT
                  d51uTableCounts.setD51uIpaCnt(d51uTableCounts.getD51uIpaCnt()+1);
  
//  MOVE RIPA-CLM-IPA-1-CD TO D51U-RIPA-CLM-IPA-1-CD ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaClmIpa1Cd(padLeftZeros(3,dclfeSpiRuleIpa.getRipaClmIpa1Cd(),false));
              }
              ripaClmIpa2Cd = dclfeSpiRuleIpa.getRipaClmIpa2Cd();
//  IF RIPA-CLM-IPA-2-CD = SPACES OR LOW-VALUES
              if (        ( allSpaces(ripaClmIpa2Cd)   ) || 			( checkLowValue(ripaClmIpa2Cd) ) ) { 
//  MOVE ZEROES TO D51U-RIPA-CLM-IPA-2-CD ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaClmIpa2Cd(0);
              }
  
//  ELSE
              else { 
//  MOVE RIPA-CLM-IPA-2-CD TO D51U-RIPA-CLM-IPA-2-CD ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaClmIpa2Cd(padLeftZeros(3,dclfeSpiRuleIpa.getRipaClmIpa2Cd(),false));
              }
              ripaClmIpa3Cd = dclfeSpiRuleIpa.getRipaClmIpa3Cd();
//  IF RIPA-CLM-IPA-3-CD = SPACES OR LOW-VALUES
              if (        ( allSpaces(ripaClmIpa3Cd)   ) || 			( checkLowValue(ripaClmIpa3Cd) ) ) { 
//  MOVE ZEROES TO D51U-RIPA-CLM-IPA-3-CD ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaClmIpa3Cd(0);
              }
  
//  ELSE
              else { 
//  MOVE RIPA-CLM-IPA-3-CD TO D51U-RIPA-CLM-IPA-3-CD ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaClmIpa3Cd(padLeftZeros(3,dclfeSpiRuleIpa.getRipaClmIpa3Cd(),false));
              }
//  MOVE RIPA-SPI-TBL-ID TO D51U-RIPA-SPI-TBL-ID ( IPA-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaSpiTblId(dclfeSpiRuleIpa.getRipaSpiTblId());
//  MOVE RIPA-DERIV-PL-OF-SVC-CD TO D51U-RIPA-DRV-POS ( IPA-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaDrvPos(dclfeSpiRuleIpa.getRipaDerivPlOfSvcCd());
//  MOVE RIPA-DERIV-SVC-CD TO D51U-RIPA-DRV-SVC ( IPA-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaDrvSvc(dclfeSpiRuleIpa.getRipaDerivSvcCd());
//  MOVE RIPA-DERIV-CAUS-CD TO D51U-RIPA-DRV-CAU ( IPA-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaDrvCau(dclfeSpiRuleIpa.getRipaDerivCausCd());
//  SET IPA-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setIpaFoundTrue(); 
              
          break;
          	case +100:
//  SET IPA-NOT-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setIpaNotFoundTrue(); 
              

// ***     Move ipa-sub to d51u-ipa-cnt
//  MOVE IPA-SUB TO D51U-IPA-CNT
              d51uTableCounts.setD51uIpaCnt(work.getIpaSub());
  
          break;
          default :
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  SET D51U-DB2-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
              
//  SET D51U-DB2-SELECT-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2SelectErrorTrue(); 
              
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//  MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              d51uErrorTrace.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
  
//  MOVE '2750-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2750_MN_ = '2750-'
              d51uErrorTrace.setD51uParagraphNum(CONSTANTS.LITERAL_2750_MN_);
  
//  SET IPA-NOT-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setIpaNotFoundTrue(); 
              
          }
      
      }
      /**
      * openSvcMainCsr 
      *   This method is derived from 
  *   COBOL Paragraph - 2218-OPEN-SVC-MAIN-CSR SECTION COBOL Cyclomatic complexity - 7
      * Input  :  

      * - fetchEndMain                   COBOL Name: WS-FETCH-END-MAIN
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - mainCtr                        COBOL Name: WS-MAIN-CTR
      * - dsmLogArea                     COBOL Name: DSM-LOG-AREA
      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - dsmErrTblName                  COBOL Name: DSM-ERR-TBL-NAME
      * - dsmErrTblAction                COBOL Name: DSM-ERR-TBL-ACTION
      * - dsmErrSectnName                COBOL Name: DSM-ERR-SECTN-NAME
      * - dsmErrPgmName                  COBOL Name: DSM-ERR-PGM-NAME
      * - dsmSqlcode                     COBOL Name: DSM-SQLCODE
      *
      * @throws CFException
      */
      private void openSvcMainCsr() throws Exception {
			// Declare local variables used in the method
			DsmSqlErrorMsgArea dsmSqlErrorMsgArea = dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea();
			DsmCommonArea dsmCommonArea = dsmCallArea.getDsmCommonArea();
			// End of variable declaration

      
// *
//  SELECT DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , POS_IND || SVC_IND || PROV_IND || CAUS_IND || IPA_IND || GTN_IND || ICD_IND || CPE_DESC_IND FROM FE_SPI_DENORM WHERE SPI_TBL_ID = ? FOR FETCH ONLY WITH UR
          d529351uRepository.openSvcMainCsrD529351u(dclfeSpiRuleFrToSvc,sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:

// *           Initialize  ws-main-ctr
//  MOVE +0 TO WS-MAIN-CTR
              work.setMainCtr(0);
//  PERFORM 2318-FETCH-SVC-MAIN-CSR THRU 2318-EXIT UNTIL END-OF-FETCH-MAIN OR WS-MAIN-CTR > +99
              while (!(work.isEndOfFetchMain())  && 	( work.getMainCtr() <= 99 )) {
                 fetchSvcMainCsr();/*2318-FETCH-SVC-MAIN-CSR SECTION*/
              }
          break;
          	case +100:
          break;
          default :
//  INITIALIZE DSM-LOG-AREA
              dsmCallArea.getDsmLogArea().initialize();
//  SET DSM-DB2-ERROR TO TRUE
              dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue(); 
              
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  MOVE 'OPEN-SVC-CSR' TO DSM-ERR-TBL-NAME
              dsmSqlErrorMsgArea.setDsmErrTblName(CONSTANTS.LITERAL_OPEN_MN2_SVCCSR_B13_);
  
//  MOVE 'OPEN SVC-MAIN-CSR' TO DSM-ERR-TBL-ACTION
//  LITERAL_OPEN_B_SVC_MN2_MAINCSR = 'OPEN SVC-MAIN-CSR'
              dsmSqlErrorMsgArea.setDsmErrTblAction(CONSTANTS.LITERAL_OPEN_B_SVC_MN2_MAINCSR);
  
//  MOVE '2218-OPEN-SVC-MAIN-CSR' TO DSM-ERR-SECTN-NAME
              dsmSqlErrorMsgArea.setDsmErrSectnName(CONSTANTS.LITERAL_2038928312);
  
//  MOVE 'D529351U' TO DSM-ERR-PGM-NAME
//  LITERAL_D529351U = 'D529351U'
              dsmSqlErrorMsgArea.setDsmErrPgmName(CONSTANTS.LITERAL_D529351U);
  
//  MOVE WS-SQLCODE TO DSM-SQLCODE
              dsmCommonArea.setDsmSqlcode( work.getSqlcode_Ws());
  
          }
      
      }
      /**
      * fetchSvcMainCsr 
      *   This method is derived from 
  *   COBOL Paragraph - 2318-FETCH-SVC-MAIN-CSR SECTION COBOL Cyclomatic complexity - 8
      * Input  :  

      * - sqlerrd                        COBOL Name: SQLERRD
      * - sqlcode                        COBOL Name: SQLCODE
      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      *
      * Output :  

      * - dsnnrows                       COBOL Name: DSNNROWS
      * - hv04Index                      COBOL Name: HV04-INDEX
      * - hv05Index                      COBOL Name: HV05-INDEX
      * - hv06Index                      COBOL Name: HV06-INDEX
      * - hv07Index                      COBOL Name: HV07-INDEX
      * - fetchEndMain                   COBOL Name: WS-FETCH-END-MAIN
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - dsmLogArea                     COBOL Name: DSM-LOG-AREA
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - dsmErrTblName                  COBOL Name: DSM-ERR-TBL-NAME
      * - dsmErrTblAction                COBOL Name: DSM-ERR-TBL-ACTION
      * - dsmErrSectnName                COBOL Name: DSM-ERR-SECTN-NAME
      * - dsmErrPgmName                  COBOL Name: DSM-ERR-PGM-NAME
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      *
      * @throws CFException
      */
      private void fetchSvcMainCsr() throws Exception {
			// Declare local variables used in the method
			DsmSqlErrorMsgArea dsmSqlErrorMsgArea = dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea();
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

      
// *
// FETCH NEXT ROWSET FROM SVC-MAIN-CSR FOR 100 ROWS INTO  ?    ,    ?    ,    ?    ,    ? 
//  MOVE 100 TO DSNNROWS
          work.setDsnnrows(100);
//  FETCH NEXT ROWSET FROM SVC-MAIN-CSR FOR 100 ROWS INTO ? , ? , ? , ?
          d529351uRepository.fetchSvcMainCsrD529351u(hvHostVariablesSvcmain,sqlca);

// *
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  SET HV04-INDEX TO +1
              hv04Index = 1; 
              
//  SET HV05-INDEX TO +1
              hv05Index = 1; 
              
//  SET HV06-INDEX TO +1
              hv06Index = 1; 
              
//  SET HV07-INDEX TO +1
              hv07Index = 1; 
              
//  PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < sqlca.getSqlerrd(2);index1++) {
//  PERFORM 2418-MOVE-SVC-MAIN-CSR THRU 2418-EXIT
                  moveSvcMainCsr();/*2418-MOVE-SVC-MAIN-CSR SECTION*/
//  SET HV04-INDEX UP BY +1
                  hv04Index++; 
                  
//  SET HV05-INDEX UP BY +1
                  hv05Index++; 
                  
//  SET HV06-INDEX UP BY +1
                  hv06Index++; 
                  
//  SET HV07-INDEX UP BY +1
                  hv07Index++; 
                  
              }
          break;
          	case +100:
//  SET HV04-INDEX TO +1
              hv04Index = 1; 
              
//  SET HV05-INDEX TO +1
              hv05Index = 1; 
              
//  SET HV06-INDEX TO +1
              hv06Index = 1; 
              
//  SET HV07-INDEX TO +1
              hv07Index = 1; 
              
//  PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < sqlca.getSqlerrd(2);index1++) {
//  PERFORM 2418-MOVE-SVC-MAIN-CSR THRU 2418-EXIT
                  moveSvcMainCsr();/*2418-MOVE-SVC-MAIN-CSR SECTION*/
//  SET HV04-INDEX UP BY +1
                  hv04Index++; 
                  
//  SET HV05-INDEX UP BY +1
                  hv05Index++; 
                  
//  SET HV06-INDEX UP BY +1
                  hv06Index++; 
                  
//  SET HV07-INDEX UP BY +1
                  hv07Index++; 
                  
              }
//  SET END-OF-FETCH-MAIN TO TRUE
              work.setEndOfFetchMainTrue(); 
              
//  PERFORM 2518-CLOSE-SVC-MAIN-CSR THRU 2518-EXIT
              closeSvcMainCsr();/*2518-CLOSE-SVC-MAIN-CSR SECTION*/
          break;
          default :
//  SET END-OF-FETCH-MAIN TO TRUE
              work.setEndOfFetchMainTrue(); 
              
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  PERFORM 2518-CLOSE-SVC-MAIN-CSR THRU 2518-EXIT
              closeSvcMainCsr();/*2518-CLOSE-SVC-MAIN-CSR SECTION*/
//  IF CLOSE-CSR-NG
              if ( work.isCloseCsrNg()  ) { 
//  INITIALIZE DSM-LOG-AREA
                  dsmCallArea.getDsmLogArea().initialize();
//  SET D51U-DB2-ERROR TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
                  
//  SET D51U-DB2-CLOSE-ERROR TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2CloseErrorTrue(); 
                  
//  SET DSM-DB2-ERROR TO TRUE
                  dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue(); 
                  
//  MOVE 'SVC-MAIN-CSR' TO DSM-ERR-TBL-NAME
                  dsmSqlErrorMsgArea.setDsmErrTblName(CONSTANTS.LITERAL_SVC_MN2_MAINCSR_B13_);
  
//  MOVE 'FETCH SVC-MAIN-CSR' TO DSM-ERR-TBL-ACTION
//  LITERAL_FETCH_B_SVC_MN2_MAINCSR = 'FETCH SVC-MAIN-CSR'
                  dsmSqlErrorMsgArea.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B_SVC_MN2_MAINCSR);
  
//  MOVE '2318-FETCH-SVC-MAIN-CSR' TO DSM-ERR-SECTN-NAME
                  dsmSqlErrorMsgArea.setDsmErrSectnName(CONSTANTS.LITERAL_774437619);
  
//  MOVE 'D529351U' TO DSM-ERR-PGM-NAME
//  LITERAL_D529351U = 'D529351U'
                  dsmSqlErrorMsgArea.setDsmErrPgmName(CONSTANTS.LITERAL_D529351U);
  
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
                  d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//cobolCode::GO TO 2318-EXIT
return ;
//cobolCodeEnds::GO TO 2318-EXIT
              }
          }
      
      }
      /**
      * moveSvcMainCsr 
      *   This method is derived from 
  *   COBOL Paragraph - 2418-MOVE-SVC-MAIN-CSR SECTION COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void moveSvcMainCsr() throws Exception {
      
// *

// *    Add +1  to ws-main-ctr.

// *    Perform 2250-open-csfrto-cursor thru 2250-exit.
// *    perform 2350-open-csptyp-cursor thru 2350-exit.
// *    perform 2450-open-csicd-cursor  thru 2450-exit.
// *    perform 2550-open-csfcnd-cursor thru 2550-exit.
//  PERFORM 2618-MOVE-SVC-KEY-CSR THRU 2618-EXIT
          moveSvcKeyCsr();/*2618-MOVE-SVC-KEY-CSR SECTION*/
          ;
      
      }
      /**
      * moveSvcKeyCsr 
      *   This method is derived from 
  *   COBOL Paragraph - 2618-MOVE-SVC-KEY-CSR SECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - mainCtr                        COBOL Name: WS-MAIN-CTR
      * - hv04KeyDrvPos                  COBOL Name: HV04-KEY-DRV-POS
      * - hv05KeyDrvSvc                  COBOL Name: HV05-KEY-DRV-SVC
      * - hv06KeyDrvCau                  COBOL Name: HV06-KEY-DRV-CAU
      * - hv07RuleSw                     COBOL Name: HV07-RULE-SW
      *
      * Output :  

      * - mainCtr                        COBOL Name: WS-MAIN-CTR
      * - d51uRetDrvPos                  COBOL Name: D51U-RET-DRV-POS
      * - hv04KeyDrvPos                  COBOL Name: HV04-KEY-DRV-POS
      * - d51uRetDrvSvc                  COBOL Name: D51U-RET-DRV-SVC
      * - hv05KeyDrvSvc                  COBOL Name: HV05-KEY-DRV-SVC
      * - d51uRetDrvCau                  COBOL Name: D51U-RET-DRV-CAU
      * - hv06KeyDrvCau                  COBOL Name: HV06-KEY-DRV-CAU
      * - d51uRetRuleSw                  COBOL Name: D51U-RET-RULE-SW
      * - hv07RuleSw                     COBOL Name: HV07-RULE-SW
      *
      * @throws CFException
      */
      private void moveSvcKeyCsr() throws Exception {
			// Declare local variables used in the method
			int mainCtr = 0;
			// End of variable declaration

      
// *
          mainCtr = work.getMainCtr();
//  IF WS-MAIN-CTR < +99
          if (	( mainCtr < 99 )) { 
//  ADD +1 TO WS-MAIN-CTR
              work.setMainCtr(work.getMainCtr()+1);
//  MOVE HV04-KEY-DRV-POS ( HV04-INDEX ) TO D51U-RET-DRV-POS ( WS-MAIN-CTR )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulKeys().getD51uRetRuleKeys(work.getMainCtr() - 1).setD51uRetDrvPos(hvHostVariablesSvcmain.getHv04KeyDrvPos(hv04Index - 1));
//  MOVE HV05-KEY-DRV-SVC ( HV05-INDEX ) TO D51U-RET-DRV-SVC ( WS-MAIN-CTR )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulKeys().getD51uRetRuleKeys(work.getMainCtr() - 1).setD51uRetDrvSvc(hvHostVariablesSvcmain.getHv05KeyDrvSvc(hv05Index - 1));
//  MOVE HV06-KEY-DRV-CAU ( HV06-INDEX ) TO D51U-RET-DRV-CAU ( WS-MAIN-CTR )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulKeys().getD51uRetRuleKeys(work.getMainCtr() - 1).setD51uRetDrvCau(hvHostVariablesSvcmain.getHv06KeyDrvCau(hv06Index - 1));
//  MOVE HV07-RULE-SW ( HV07-INDEX ) TO D51U-RET-RULE-SW ( WS-MAIN-CTR )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulKeys().getD51uRetRuleKeys(work.getMainCtr() - 1).setD51uRetRuleSw(hvHostVariablesSvcmain.getHv07RuleSw(hv07Index - 1));
          }
  
      
      }
      /**
      * closeSvcMainCsr 
      *   This method is derived from 
  *   COBOL Paragraph - 2518-CLOSE-SVC-MAIN-CSR SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - dsmLogArea                     COBOL Name: DSM-LOG-AREA
      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - dsmErrTblName                  COBOL Name: DSM-ERR-TBL-NAME
      * - dsmErrTblAction                COBOL Name: DSM-ERR-TBL-ACTION
      * - dsmErrSectnName                COBOL Name: DSM-ERR-SECTN-NAME
      * - dsmErrPgmName                  COBOL Name: DSM-ERR-PGM-NAME
      * - dsmSqlcode                     COBOL Name: DSM-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      private void closeSvcMainCsr() throws Exception {
			// Declare local variables used in the method
			DsmSqlErrorMsgArea dsmSqlErrorMsgArea = dsmCallArea.getDsmLogArea().getDsmSqlErrorMsgArea();
			DsmCommonArea dsmCommonArea = dsmCallArea.getDsmCommonArea();
			int sqlcode_Ws = 0;
			// End of variable declaration

//  CLOSE SVC-MAIN-CSR
          d529351uRepository.closeSvcMainCsrD529351u(sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  SET CLOSE-CSR-OK TO TRUE
              work.setCloseCsrOkTrue(); 
              
          break;
          default :
//  SET CLOSE-CSR-NG TO TRUE
              work.setCloseCsrNgTrue(); 
              
              sqlcode_Ws = work.getSqlcode_Ws();
//  IF WS-SQLCODE = ZEROS
              if (	( sqlcode_Ws == 0 )) { 
//  INITIALIZE DSM-LOG-AREA
                  dsmCallArea.getDsmLogArea().initialize();
//  SET DSM-DB2-ERROR TO TRUE
                  dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue(); 
                  
//  MOVE 'SVC-MAIN-CSR' TO DSM-ERR-TBL-NAME
                  dsmSqlErrorMsgArea.setDsmErrTblName(CONSTANTS.LITERAL_SVC_MN2_MAINCSR_B13_);
  
//  MOVE 'CLOSE SVC-MAIN-CSR' TO DSM-ERR-TBL-ACTION
//  LITERAL_CLOSE_B_SVC_MN2_MAINCSR = 'CLOSE SVC-MAIN-CSR'
                  dsmSqlErrorMsgArea.setDsmErrTblAction(CONSTANTS.LITERAL_CLOSE_B_SVC_MN2_MAINCSR);
  
//  MOVE '2518-CLOSE-SVC-MAIN-CSR' TO DSM-ERR-SECTN-NAME
                  dsmSqlErrorMsgArea.setDsmErrSectnName(CONSTANTS.LITERAL_1560171085);
  
//  MOVE 'D529351U' TO DSM-ERR-PGM-NAME
//  LITERAL_D529351U = 'D529351U'
                  dsmSqlErrorMsgArea.setDsmErrPgmName(CONSTANTS.LITERAL_D529351U);
  
//  MOVE SQLCODE TO DSM-SQLCODE
                  dsmCommonArea.setDsmSqlcode( sqlca.getSqlcode());
  
              }
  
          }
      
      }
      /**
      * openCombCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 2351-OPEN-COMB-CURSOR SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - fetchEndComb                   COBOL Name: WS-FETCH-END-COMB
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      private void openCombCursor() throws Exception {
			// Declare local variables used in the method
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

//  DECLARE COMB_CUR CURSOR WITH ROWSET POSITIONING FOR SELECT '1' REC_TYP_CD , DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CLM_CAUS_1_CD , CLM_CAUS_2_CD , CLM_CAUS_3_CD , CLM_CAUS_4_CD , CLM_CAUS_5_CD , CLM_CAUS_6_CD , CLM_CAUS_7_CD , CLM_CAUS_8_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_1_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_2_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_3_CD , CHAR ( SPACE ( 2 ) ) PROV_TYP , CHAR ( SPACE ( 2 ) ) FROM_COND_POS , CHAR ( SPACE ( 4 ) ) GRP_TBL_1_NBR , CHAR ( SPACE ( 4 ) ) GRP_TBL_2_NBR , CHAR ( SPACE ( 4 ) ) GRP_TBL_3_NBR , CHAR ( SPACE ( 4 ) ) CPE_DESC_CD FROM FE_SPI_RULE_CAUS WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND ( CLM_CAUS_1_CD = ? OR CLM_CAUS_2_CD = ? OR CLM_CAUS_3_CD = ? OR CLM_CAUS_4_CD = ? OR CLM_CAUS_5_CD = ? OR CLM_CAUS_6_CD = ? OR CLM_CAUS_7_CD = ? OR CLM_CAUS_8_CD = ? ) UNION ALL SELECT '2' REC_TYP_CD , DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_1_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_2_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_3_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_4_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_5_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_6_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_7_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_8_CD , CLM_IPA_1_CD , CLM_IPA_2_CD , CLM_IPA_3_CD , CHAR ( SPACE ( 2 ) ) PROV_TYP , CHAR ( SPACE ( 2 ) ) FROM_COND_POS , GRP_TBL_1_NBR , GRP_TBL_2_NBR , GRP_TBL_3_NBR , CHAR ( SPACE ( 4 ) ) CPE_DESC_CD FROM FE_SPI_RULE_IPA WHERE SPI_TBL_ID = ? AND STS_CD = 'A' UNION ALL SELECT '3' REC_TYP_CD , DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_1_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_2_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_3_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_4_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_5_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_6_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_7_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_8_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_1_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_2_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_3_CD , PROV_TYP , CHAR ( SPACE ( 2 ) ) FROM_COND_POS , CHAR ( SPACE ( 4 ) ) GRP_TBL_1_NBR , CHAR ( SPACE ( 4 ) ) GRP_TBL_2_NBR , CHAR ( SPACE ( 4 ) ) GRP_TBL_3_NBR , CHAR ( SPACE ( 4 ) ) CPE_DESC_CD FROM FE_SPI_RULE_PROV_TYP WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND PROV_TYP = ? UNION ALL SELECT '4' REC_TYP_CD , DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_1_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_2_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_3_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_4_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_5_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_6_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_7_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_8_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_1_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_2_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_3_CD , CHAR ( SPACE ( 2 ) ) PROV_TYP , FROM_COND_POS , CHAR ( SPACE ( 4 ) ) GRP_TBL_1_NBR , CHAR ( SPACE ( 4 ) ) GRP_TBL_2_NBR , CHAR ( SPACE ( 4 ) ) GRP_TBL_3_NBR , CHAR ( SPACE ( 4 ) ) CPE_DESC_CD FROM FE_SPI_RULE_FR_COND_POS WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND FROM_COND_POS = ? UNION ALL SELECT '5' REC_TYP_CD , DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_1_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_2_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_3_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_4_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_5_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_6_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_7_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_8_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_1_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_2_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_3_CD , CHAR ( SPACE ( 2 ) ) PROV_TYP , CHAR ( SPACE ( 2 ) ) FROM_COND_POS , CHAR ( SPACE ( 4 ) ) GRP_TBL_1_NBR , CHAR ( SPACE ( 4 ) ) GRP_TBL_2_NBR , CHAR ( SPACE ( 4 ) ) GRP_TBL_3_NBR , CPE_DESC_CD FROM FE_SPI_RULE_CPE_FLG WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND CPE_DESC_CD = ? FOR FETCH ONLY
          d529351uRepository.openCombCurD529351u(dclfeSpiRuleCaus,dclfeSpiRuleProvTyp,dclfeSpiRuleIpa,sqlca,dclfeSpiRuleFrCondPos,testVariables,dclfeSpiRuleCpeFlg);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  PERFORM 2352-FETCH-COMB THRU 2352-EXIT UNTIL END-OF-FETCH-COMB
              while (!(work.isEndOfFetchComb()) ) {
                 fetchComb();/*2352-FETCH-COMB SECTION*/
              }
          break;
          default :
//  SET DSM-DB2-ERROR TO TRUE
              dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue(); 
              
//  SET D51U-DB2-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
              
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  SET D51U-DB2-OPEN-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2OpenErrorTrue(); 
              
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//  MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              d51uErrorTrace.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
  
//  MOVE '2351-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2351_MN_ = '2351-'
              d51uErrorTrace.setD51uParagraphNum(CONSTANTS.LITERAL_2351_MN_);
  
          }
      
      }
      /**
      * fetchComb 
      *   This method is derived from 
  *   COBOL Paragraph - 2352-FETCH-COMB SECTION COBOL Cyclomatic complexity - 17
      * Input  :  

      * - sqlerrd                        COBOL Name: SQLERRD
      * - hv2aRecTypCd                   COBOL Name: HV2A-REC-TYP-CD
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsnnrows                       COBOL Name: DSNNROWS
      * - hv2bIndex                      COBOL Name: HV2B-INDEX
      * - hv2cIndex                      COBOL Name: HV2C-INDEX
      * - hv2dIndex                      COBOL Name: HV2D-INDEX
      * - hv2eIndex                      COBOL Name: HV2E-INDEX
      * - hv2fIndex                      COBOL Name: HV2F-INDEX
      * - hv2gIndex                      COBOL Name: HV2G-INDEX
      * - hv2hIndex                      COBOL Name: HV2H-INDEX
      * - hv2iIndex                      COBOL Name: HV2I-INDEX
      * - hv2jIndex                      COBOL Name: HV2J-INDEX
      * - hv2kIndex                      COBOL Name: HV2K-INDEX
      * - hv2lIndex                      COBOL Name: HV2L-INDEX
      * - hv2mIndex                      COBOL Name: HV2M-INDEX
      * - hv2nIndex                      COBOL Name: HV2N-INDEX
      * - hv2oIndex                      COBOL Name: HV2O-INDEX
      * - hv2pIndex                      COBOL Name: HV2P-INDEX
      * - hv2qIndex                      COBOL Name: HV2Q-INDEX
      * - hv2aIndex                      COBOL Name: HV2A-INDEX
      * - hv2rIndex                      COBOL Name: HV2R-INDEX
      * - hv2sIndex                      COBOL Name: HV2S-INDEX
      * - hv2tIndex                      COBOL Name: HV2T-INDEX
      * - hv2uIndex                      COBOL Name: HV2U-INDEX
      * - fetchEndComb                   COBOL Name: WS-FETCH-END-COMB
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      private void fetchComb() throws Exception {
// FETCH NEXT ROWSET FROM COMB_CUR FOR 100 ROWS INTO  ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ? 
//  MOVE 100 TO DSNNROWS
          work.setDsnnrows(100);
//  FETCH NEXT ROWSET FROM COMB_CUR FOR 100 ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d529351uRepository.fetchCombCurD529351u(hvHostVariablesCombcr,sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  SET HV2B-INDEX TO +1
              hv2bIndex = 1; 
              
//  SET HV2C-INDEX TO +1
              hv2cIndex = 1; 
              
//  SET HV2D-INDEX TO +1
              hv2dIndex = 1; 
              
//  SET HV2E-INDEX TO +1
              hv2eIndex = 1; 
              
//  SET HV2F-INDEX TO +1
              hv2fIndex = 1; 
              
//  SET HV2G-INDEX TO +1
              hv2gIndex = 1; 
              
//  SET HV2H-INDEX TO +1
              hv2hIndex = 1; 
              
//  SET HV2I-INDEX TO +1
              hv2iIndex = 1; 
              
//  SET HV2J-INDEX TO +1
              hv2jIndex = 1; 
              
//  SET HV2K-INDEX TO +1
              hv2kIndex = 1; 
              
//  SET HV2L-INDEX TO +1
              hv2lIndex = 1; 
              
//  SET HV2M-INDEX TO +1
              hv2mIndex = 1; 
              
//  SET HV2N-INDEX TO +1
              hv2nIndex = 1; 
              
//  SET HV2O-INDEX TO +1
              hv2oIndex = 1; 
              
//  SET HV2P-INDEX TO +1
              hv2pIndex = 1; 
              
//  SET HV2Q-INDEX TO +1
              hv2qIndex = 1; 
              
//  SET HV2A-INDEX TO +1
              hv2aIndex = 1; 
              
//  SET HV2R-INDEX TO +1
              hv2rIndex = 1; 
              
//  SET HV2S-INDEX TO +1
              hv2sIndex = 1; 
              
//  SET HV2T-INDEX TO +1
              hv2tIndex = 1; 
              
//  SET HV2U-INDEX TO +1
              hv2uIndex = 1; 
              
//  PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < sqlca.getSqlerrd(2);index1++) {
//  IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '1'
                  if (hvHostVariablesCombcr.getHv2aRecTypCd(hv2aIndex - 1)[0] == '1') { 
//  PERFORM 2653-MOVE-CAUSE-TABLE THRU 2653-EXIT
                      moveCauseTable();/*2653-MOVE-CAUSE-TABLE SECTION*/
                  }
//  ELSE
                  else { 
//  IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '2'
                      if (hvHostVariablesCombcr.getHv2aRecTypCd(hv2aIndex - 1)[0] == '2') { 
//  PERFORM 2654-MOVE-IPA-TABLE THRU 2654-EXIT
                          moveIpaTable();/*2654-MOVE-IPA-TABLE SECTION*/
                      }
//  ELSE
                      else { 
//  IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '3'
                          if (hvHostVariablesCombcr.getHv2aRecTypCd(hv2aIndex - 1)[0] == '3') { 
//  PERFORM 2655-MOVE-CSPTYP THRU 2655-EXIT
                              moveCsptyp();/*2655-MOVE-CSPTYP SECTION*/
                          }
//  ELSE
                          else { 
//  IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '4'
                              if (hvHostVariablesCombcr.getHv2aRecTypCd(hv2aIndex - 1)[0] == '4') { 
//  PERFORM 2656-MOVE-CSFCND THRU 2656-EXIT
                                  moveCsfcnd();/*2656-MOVE-CSFCND SECTION*/
                              }
//  IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '5'
                              if (hvHostVariablesCombcr.getHv2aRecTypCd(hv2aIndex - 1)[0] == '5') { 
//  PERFORM 2657-MOVE-CFLG-TABLE THRU 2657-EXIT
                                  moveCflgTable();/*2657-MOVE-CFLG-TABLE SECTION*/
                              }
                          }
                      }
                  }
//  SET HV2B-INDEX UP BY +1
                  hv2bIndex++; 
                  
//  SET HV2C-INDEX UP BY +1
                  hv2cIndex++; 
                  
//  SET HV2D-INDEX UP BY +1
                  hv2dIndex++; 
                  
//  SET HV2E-INDEX UP BY +1
                  hv2eIndex++; 
                  
//  SET HV2F-INDEX UP BY +1
                  hv2fIndex++; 
                  
//  SET HV2G-INDEX UP BY +1
                  hv2gIndex++; 
                  
//  SET HV2H-INDEX UP BY +1
                  hv2hIndex++; 
                  
//  SET HV2I-INDEX UP BY +1
                  hv2iIndex++; 
                  
//  SET HV2J-INDEX UP BY +1
                  hv2jIndex++; 
                  
//  SET HV2K-INDEX UP BY +1
                  hv2kIndex++; 
                  
//  SET HV2L-INDEX UP BY +1
                  hv2lIndex++; 
                  
//  SET HV2M-INDEX UP BY +1
                  hv2mIndex++; 
                  
//  SET HV2N-INDEX UP BY +1
                  hv2nIndex++; 
                  
//  SET HV2O-INDEX UP BY +1
                  hv2oIndex++; 
                  
//  SET HV2P-INDEX UP BY +1
                  hv2pIndex++; 
                  
//  SET HV2Q-INDEX UP BY +1
                  hv2qIndex++; 
                  
//  SET HV2A-INDEX UP BY +1
                  hv2aIndex++; 
                  
//  SET HV2R-INDEX UP BY +1
                  hv2rIndex++; 
                  
//  SET HV2S-INDEX UP BY +1
                  hv2sIndex++; 
                  
//  SET HV2T-INDEX UP BY +1
                  hv2tIndex++; 
                  
//  SET HV2U-INDEX UP BY +1
                  hv2uIndex++; 
                  
              }
          break;
          	case 100:
//  SET HV2B-INDEX TO +1
              hv2bIndex = 1; 
              
//  SET HV2C-INDEX TO +1
              hv2cIndex = 1; 
              
//  SET HV2D-INDEX TO +1
              hv2dIndex = 1; 
              
//  SET HV2E-INDEX TO +1
              hv2eIndex = 1; 
              
//  SET HV2F-INDEX TO +1
              hv2fIndex = 1; 
              
//  SET HV2G-INDEX TO +1
              hv2gIndex = 1; 
              
//  SET HV2H-INDEX TO +1
              hv2hIndex = 1; 
              
//  SET HV2I-INDEX TO +1
              hv2iIndex = 1; 
              
//  SET HV2J-INDEX TO +1
              hv2jIndex = 1; 
              
//  SET HV2K-INDEX TO +1
              hv2kIndex = 1; 
              
//  SET HV2L-INDEX TO +1
              hv2lIndex = 1; 
              
//  SET HV2M-INDEX TO +1
              hv2mIndex = 1; 
              
//  SET HV2N-INDEX TO +1
              hv2nIndex = 1; 
              
//  SET HV2O-INDEX TO +1
              hv2oIndex = 1; 
              
//  SET HV2P-INDEX TO +1
              hv2pIndex = 1; 
              
//  SET HV2Q-INDEX TO +1
              hv2qIndex = 1; 
              
//  SET HV2A-INDEX TO +1
              hv2aIndex = 1; 
              
//  SET HV2R-INDEX TO +1
              hv2rIndex = 1; 
              
//  SET HV2S-INDEX TO +1
              hv2sIndex = 1; 
              
//  SET HV2T-INDEX TO +1
              hv2tIndex = 1; 
              
//  SET HV2U-INDEX TO +1
              hv2uIndex = 1; 
              
//  PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < sqlca.getSqlerrd(2);index1++) {
//  IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '1'
                  if (hvHostVariablesCombcr.getHv2aRecTypCd(hv2aIndex - 1)[0] == '1') { 
//  PERFORM 2653-MOVE-CAUSE-TABLE THRU 2653-EXIT
                      moveCauseTable();/*2653-MOVE-CAUSE-TABLE SECTION*/
                  }
//  ELSE
                  else { 
//  IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '2'
                      if (hvHostVariablesCombcr.getHv2aRecTypCd(hv2aIndex - 1)[0] == '2') { 
//  PERFORM 2654-MOVE-IPA-TABLE THRU 2654-EXIT
                          moveIpaTable();/*2654-MOVE-IPA-TABLE SECTION*/
                      }
//  ELSE
                      else { 
//  IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '3'
                          if (hvHostVariablesCombcr.getHv2aRecTypCd(hv2aIndex - 1)[0] == '3') { 
//  PERFORM 2655-MOVE-CSPTYP THRU 2655-EXIT
                              moveCsptyp();/*2655-MOVE-CSPTYP SECTION*/
                          }
//  ELSE
                          else { 
//  IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '4'
                              if (hvHostVariablesCombcr.getHv2aRecTypCd(hv2aIndex - 1)[0] == '4') { 
//  PERFORM 2656-MOVE-CSFCND THRU 2656-EXIT
                                  moveCsfcnd();/*2656-MOVE-CSFCND SECTION*/
                              }
//  IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '5'
                              if (hvHostVariablesCombcr.getHv2aRecTypCd(hv2aIndex - 1)[0] == '5') { 
//  PERFORM 2657-MOVE-CFLG-TABLE THRU 2657-EXIT
                                  moveCflgTable();/*2657-MOVE-CFLG-TABLE SECTION*/
                              }
                          }
                      }
                  }
//  SET HV2B-INDEX UP BY +1
                  hv2bIndex++; 
                  
//  SET HV2C-INDEX UP BY +1
                  hv2cIndex++; 
                  
//  SET HV2D-INDEX UP BY +1
                  hv2dIndex++; 
                  
//  SET HV2E-INDEX UP BY +1
                  hv2eIndex++; 
                  
//  SET HV2F-INDEX UP BY +1
                  hv2fIndex++; 
                  
//  SET HV2G-INDEX UP BY +1
                  hv2gIndex++; 
                  
//  SET HV2H-INDEX UP BY +1
                  hv2hIndex++; 
                  
//  SET HV2I-INDEX UP BY +1
                  hv2iIndex++; 
                  
//  SET HV2J-INDEX UP BY +1
                  hv2jIndex++; 
                  
//  SET HV2K-INDEX UP BY +1
                  hv2kIndex++; 
                  
//  SET HV2L-INDEX UP BY +1
                  hv2lIndex++; 
                  
//  SET HV2M-INDEX UP BY +1
                  hv2mIndex++; 
                  
//  SET HV2N-INDEX UP BY +1
                  hv2nIndex++; 
                  
//  SET HV2O-INDEX UP BY +1
                  hv2oIndex++; 
                  
//  SET HV2P-INDEX UP BY +1
                  hv2pIndex++; 
                  
//  SET HV2Q-INDEX UP BY +1
                  hv2qIndex++; 
                  
//  SET HV2A-INDEX UP BY +1
                  hv2aIndex++; 
                  
//  SET HV2R-INDEX UP BY +1
                  hv2rIndex++; 
                  
//  SET HV2S-INDEX UP BY +1
                  hv2sIndex++; 
                  
//  SET HV2T-INDEX UP BY +1
                  hv2tIndex++; 
                  
//  SET HV2U-INDEX UP BY +1
                  hv2uIndex++; 
                  
              }
//  SET END-OF-FETCH-COMB TO TRUE
              work.setEndOfFetchCombTrue(); 
              
//  PERFORM 2353-CLOSE-COMB-CSR THRU 2353-EXIT
              closeCombCsr();/*2353-CLOSE-COMB-CSR SECTION*/
          break;
          default :
//  SET END-OF-FETCH-COMB TO TRUE
              work.setEndOfFetchCombTrue(); 
              
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  PERFORM 2353-CLOSE-COMB-CSR THRU 2353-EXIT
              closeCombCsr();/*2353-CLOSE-COMB-CSR SECTION*/
          }
      
      }
      /**
      * closeCombCsr 
      *   This method is derived from 
  *   COBOL Paragraph - 2353-CLOSE-COMB-CSR SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      private void closeCombCsr() throws Exception {
			// Declare local variables used in the method
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

//  CLOSE COMB_CUR
          d529351uRepository.closeCombCurD529351u(sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  SET CLOSE-CSR-OK TO TRUE
              work.setCloseCsrOkTrue(); 
              
          break;
          default :
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  SET CLOSE-CSR-NG TO TRUE
              work.setCloseCsrNgTrue(); 
              
//  SET D51U-DB2-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
              
//  SET D51U-DB2-CLOSE-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2CloseErrorTrue(); 
              
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//  MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              d51uErrorTrace.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
  
//  MOVE '2353-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2353_MN_ = '2353-'
              d51uErrorTrace.setD51uParagraphNum(CONSTANTS.LITERAL_2353_MN_);
  
          }
      
      }
      /**
      * moveCauseTable 
      *   This method is derived from 
  *   COBOL Paragraph - 2653-MOVE-CAUSE-TABLE SECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - causSub                        COBOL Name: CAUS-SUB
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - hv2eClmCaus1Cd                 COBOL Name: HV2E-CLM-CAUS-1-CD
      * - hv2fClmCaus2Cd                 COBOL Name: HV2F-CLM-CAUS-2-CD
      * - hv2gClmCaus3Cd                 COBOL Name: HV2G-CLM-CAUS-3-CD
      * - hv2hClmCaus4Cd                 COBOL Name: HV2H-CLM-CAUS-4-CD
      * - hv2iClmCaus5Cd                 COBOL Name: HV2I-CLM-CAUS-5-CD
      * - hv2jClmCaus6Cd                 COBOL Name: HV2J-CLM-CAUS-6-CD
      * - hv2kClmCaus7Cd                 COBOL Name: HV2K-CLM-CAUS-7-CD
      * - hv2lClmCaus8Cd                 COBOL Name: HV2L-CLM-CAUS-8-CD
      *
      * Output :  

      * - causSub                        COBOL Name: CAUS-SUB
      * - d51uCausCnt                    COBOL Name: D51U-CAUS-CNT
      * - causFoundSw                    COBOL Name: CAUS-FOUND-SW
      * - d51uCausDrvPos                 COBOL Name: D51U-CAUS-DRV-POS
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - d51uCausDrvSvc                 COBOL Name: D51U-CAUS-DRV-SVC
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - d51uCausDrvCau                 COBOL Name: D51U-CAUS-DRV-CAU
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - d51uCausClmCauseCd1            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-1
      * - hv2eClmCaus1Cd                 COBOL Name: HV2E-CLM-CAUS-1-CD
      * - d51uCausClmCauseCd2            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-2
      * - hv2fClmCaus2Cd                 COBOL Name: HV2F-CLM-CAUS-2-CD
      * - d51uCausClmCauseCd3            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-3
      * - hv2gClmCaus3Cd                 COBOL Name: HV2G-CLM-CAUS-3-CD
      * - d51uCausClmCauseCd4            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-4
      * - hv2hClmCaus4Cd                 COBOL Name: HV2H-CLM-CAUS-4-CD
      * - d51uCausClmCauseCd5            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-5
      * - hv2iClmCaus5Cd                 COBOL Name: HV2I-CLM-CAUS-5-CD
      * - d51uCausClmCauseCd6            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-6
      * - hv2jClmCaus6Cd                 COBOL Name: HV2J-CLM-CAUS-6-CD
      * - d51uCausClmCauseCd7            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-7
      * - hv2kClmCaus7Cd                 COBOL Name: HV2K-CLM-CAUS-7-CD
      * - d51uCausClmCauseCd8            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-8
      * - hv2lClmCaus8Cd                 COBOL Name: HV2L-CLM-CAUS-8-CD
      *
      * @throws CFException
      */
      private void moveCauseTable() throws Exception {
			// Declare local variables used in the method
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			int causSub = 0;
			// End of variable declaration

          causSub = work.getCausSub();
//  IF CAUS-SUB < +99
          if (	( causSub < 99 )) { 
//  ADD 1 TO CAUS-SUB
              work.setCausSub(work.getCausSub()+1);
//  MOVE CAUS-SUB TO D51U-CAUS-CNT
              d51uTableCounts.setD51uCausCnt(work.getCausSub());
  
//  SET CAUSECD-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setCausecdFoundTrue(); 
              
//  MOVE HV2B-DERIV-PL-OF-SVC-CD ( HV2B-INDEX ) TO D51U-CAUS-DRV-POS ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausDrvPos(hvHostVariablesCombcr.getHv2bDerivPlOfSvcCd(hv2bIndex - 1));
//  MOVE HV2C-DERIV-SVC-CD ( HV2C-INDEX ) TO D51U-CAUS-DRV-SVC ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausDrvSvc(hvHostVariablesCombcr.getHv2cDerivSvcCd(hv2cIndex - 1));
//  MOVE HV2D-DERIV-CAUS-CD ( HV2D-INDEX ) TO D51U-CAUS-DRV-CAU ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausDrvCau(hvHostVariablesCombcr.getHv2dDerivCausCd(hv2dIndex - 1));
//  MOVE HV2E-CLM-CAUS-1-CD ( HV2E-INDEX ) TO D51U-CAUS-CLM-CAUSE-CD-1 ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausClmCauseCd1(hvHostVariablesCombcr.getHv2eClmCaus1Cd(hv2eIndex - 1));
//  MOVE HV2F-CLM-CAUS-2-CD ( HV2F-INDEX ) TO D51U-CAUS-CLM-CAUSE-CD-2 ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausClmCauseCd2(hvHostVariablesCombcr.getHv2fClmCaus2Cd(hv2fIndex - 1));
//  MOVE HV2G-CLM-CAUS-3-CD ( HV2G-INDEX ) TO D51U-CAUS-CLM-CAUSE-CD-3 ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausClmCauseCd3(hvHostVariablesCombcr.getHv2gClmCaus3Cd(hv2gIndex - 1));
//  MOVE HV2H-CLM-CAUS-4-CD ( HV2H-INDEX ) TO D51U-CAUS-CLM-CAUSE-CD-4 ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausClmCauseCd4(hvHostVariablesCombcr.getHv2hClmCaus4Cd(hv2hIndex - 1));
//  MOVE HV2I-CLM-CAUS-5-CD ( HV2I-INDEX ) TO D51U-CAUS-CLM-CAUSE-CD-5 ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausClmCauseCd5(hvHostVariablesCombcr.getHv2iClmCaus5Cd(hv2iIndex - 1));
//  MOVE HV2J-CLM-CAUS-6-CD ( HV2J-INDEX ) TO D51U-CAUS-CLM-CAUSE-CD-6 ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausClmCauseCd6(hvHostVariablesCombcr.getHv2jClmCaus6Cd(hv2jIndex - 1));
//  MOVE HV2K-CLM-CAUS-7-CD ( HV2K-INDEX ) TO D51U-CAUS-CLM-CAUSE-CD-7 ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausClmCauseCd7(hvHostVariablesCombcr.getHv2kClmCaus7Cd(hv2kIndex - 1));
//  MOVE HV2L-CLM-CAUS-8-CD ( HV2L-INDEX ) TO D51U-CAUS-CLM-CAUSE-CD-8 ( CAUS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCausSub() - 1).setD51uCausClmCauseCd8(hvHostVariablesCombcr.getHv2lClmCaus8Cd(hv2lIndex - 1));
          }
  
      
      }
      /**
      * moveIpaTable 
      *   This method is derived from 
  *   COBOL Paragraph - 2654-MOVE-IPA-TABLE SECTION COBOL Cyclomatic complexity - 20
      * Input  :  

      * - ipaSub                         COBOL Name: IPA-SUB
      * - ripaSpiTblId                   COBOL Name: RIPA-SPI-TBL-ID
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - hv2mClmIpa1Cd                  COBOL Name: HV2M-CLM-IPA-1-CD
      * - hv2mIndex                      COBOL Name: HV2M-INDEX
      * - d51uIpaCnt                     COBOL Name: D51U-IPA-CNT
      * - hv2nClmIpa2Cd                  COBOL Name: HV2N-CLM-IPA-2-CD
      * - hv2nIndex                      COBOL Name: HV2N-INDEX
      * - hv2oClmIpa3Cd                  COBOL Name: HV2O-CLM-IPA-3-CD
      * - hv2oIndex                      COBOL Name: HV2O-INDEX
      * - hv2rGrpTbl1Nbr                 COBOL Name: HV2R-GRP-TBL-1-NBR
      * - hv2rIndex                      COBOL Name: HV2R-INDEX
      * - hv2sGrpTbl2Nbr                 COBOL Name: HV2S-GRP-TBL-2-NBR
      * - hv2sIndex                      COBOL Name: HV2S-INDEX
      * - hv2tGrpTbl3Nbr                 COBOL Name: HV2T-GRP-TBL-3-NBR
      * - hv2tIndex                      COBOL Name: HV2T-INDEX
      *
      * Output :  

      * - ipaSub                         COBOL Name: IPA-SUB
      * - ipaFoundSw                     COBOL Name: IPA-FOUND-SW
      * - d51uRipaSpiTblId               COBOL Name: D51U-RIPA-SPI-TBL-ID
      * - ripaSpiTblId                   COBOL Name: RIPA-SPI-TBL-ID
      * - d51uRipaDrvPos                 COBOL Name: D51U-RIPA-DRV-POS
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - d51uRipaDrvSvc                 COBOL Name: D51U-RIPA-DRV-SVC
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - d51uRipaDrvCau                 COBOL Name: D51U-RIPA-DRV-CAU
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - d51uRipaClmIpa1Cd              COBOL Name: D51U-RIPA-CLM-IPA-1-CD
      * - d51uIpaCnt                     COBOL Name: D51U-IPA-CNT
      * - hv2mClmIpa1Cd                  COBOL Name: HV2M-CLM-IPA-1-CD
      * - d51uRipaClmIpa2Cd              COBOL Name: D51U-RIPA-CLM-IPA-2-CD
      * - hv2nClmIpa2Cd                  COBOL Name: HV2N-CLM-IPA-2-CD
      * - d51uRipaClmIpa3Cd              COBOL Name: D51U-RIPA-CLM-IPA-3-CD
      * - hv2oClmIpa3Cd                  COBOL Name: HV2O-CLM-IPA-3-CD
      * - d51uRipaGrpTbl1Nbr             COBOL Name: D51U-RIPA-GRP-TBL-1-NBR
      * - hv2rGrpTbl1Nbr                 COBOL Name: HV2R-GRP-TBL-1-NBR
      * - d51uRipaGrpTbl2Nbr             COBOL Name: D51U-RIPA-GRP-TBL-2-NBR
      * - hv2sGrpTbl2Nbr                 COBOL Name: HV2S-GRP-TBL-2-NBR
      * - d51uRipaGrpTbl3Nbr             COBOL Name: D51U-RIPA-GRP-TBL-3-NBR
      * - hv2tGrpTbl3Nbr                 COBOL Name: HV2T-GRP-TBL-3-NBR
      *
      * @throws CFException
      */
      private void moveIpaTable() throws Exception {
			// Declare local variables used in the method
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			int ipaSub = 0;
			// End of variable declaration

          ipaSub = work.getIpaSub();
//  IF IPA-SUB < +99
          if (	( ipaSub < 99 )) { 
//  ADD 1 TO IPA-SUB
              work.setIpaSub(work.getIpaSub()+1);
//  SET IPA-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setIpaFoundTrue(); 
              
//  MOVE RIPA-SPI-TBL-ID TO D51U-RIPA-SPI-TBL-ID ( IPA-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaSpiTblId(dclfeSpiRuleIpa.getRipaSpiTblId());
//  MOVE HV2B-DERIV-PL-OF-SVC-CD ( HV2B-INDEX ) TO D51U-RIPA-DRV-POS ( IPA-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaDrvPos(hvHostVariablesCombcr.getHv2bDerivPlOfSvcCd(hv2bIndex - 1));
//  MOVE HV2C-DERIV-SVC-CD ( HV2C-INDEX ) TO D51U-RIPA-DRV-SVC ( IPA-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaDrvSvc(hvHostVariablesCombcr.getHv2cDerivSvcCd(hv2cIndex - 1));
//  MOVE HV2D-DERIV-CAUS-CD ( HV2D-INDEX ) TO D51U-RIPA-DRV-CAU ( IPA-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaDrvCau(hvHostVariablesCombcr.getHv2dDerivCausCd(hv2dIndex - 1));
//  IF HV2M-CLM-IPA-1-CD ( HV2M-INDEX ) = SPACES OR LOW-VALUES OR HIGH-VALUES
              if (        ( allSpaces(hvHostVariablesCombcr.getHv2mClmIpa1Cd(hv2mIndex - 1))   ) || 			( checkLowValue(hvHostVariablesCombcr.getHv2mClmIpa1Cd(hv2mIndex - 1)) )  || ( isHighValue(hvHostVariablesCombcr.getHv2mClmIpa1Cd(hv2mIndex - 1)) ) ) { 
//  MOVE ZEROES TO D51U-RIPA-CLM-IPA-1-CD ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaClmIpa1Cd(0);
              }
//  ELSE
              else { 
//  ADD 1 TO D51U-IPA-CNT
                  d51uTableCounts.setD51uIpaCnt(d51uTableCounts.getD51uIpaCnt()+1);
  
//  MOVE HV2M-CLM-IPA-1-CD ( HV2M-INDEX ) TO D51U-RIPA-CLM-IPA-1-CD ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaClmIpa1Cd(CFUtil.getInt(hvHostVariablesCombcr.getHv2mClmIpa1Cd(hv2mIndex - 1)));
              }
//  IF HV2N-CLM-IPA-2-CD ( HV2N-INDEX ) = SPACES OR LOW-VALUES OR HIGH-VALUES
              if (        ( allSpaces(hvHostVariablesCombcr.getHv2nClmIpa2Cd(hv2nIndex - 1))   ) || 			( checkLowValue(hvHostVariablesCombcr.getHv2nClmIpa2Cd(hv2nIndex - 1)) )  || ( isHighValue(hvHostVariablesCombcr.getHv2nClmIpa2Cd(hv2nIndex - 1)) ) ) { 
//  MOVE ZEROES TO D51U-RIPA-CLM-IPA-2-CD ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaClmIpa2Cd(0);
              }
//  ELSE
              else { 
//  MOVE HV2N-CLM-IPA-2-CD ( HV2N-INDEX ) TO D51U-RIPA-CLM-IPA-2-CD ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaClmIpa2Cd(CFUtil.getInt(hvHostVariablesCombcr.getHv2nClmIpa2Cd(hv2nIndex - 1)));
              }
//  IF HV2O-CLM-IPA-3-CD ( HV2O-INDEX ) = SPACES OR LOW-VALUES OR HIGH-VALUES
              if (        ( allSpaces(hvHostVariablesCombcr.getHv2oClmIpa3Cd(hv2oIndex - 1))   ) || 			( checkLowValue(hvHostVariablesCombcr.getHv2oClmIpa3Cd(hv2oIndex - 1)) )  || ( isHighValue(hvHostVariablesCombcr.getHv2oClmIpa3Cd(hv2oIndex - 1)) ) ) { 
//  MOVE ZEROES TO D51U-RIPA-CLM-IPA-3-CD ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaClmIpa3Cd(0);
              }
//  ELSE
              else { 
//  MOVE HV2O-CLM-IPA-3-CD ( HV2O-INDEX ) TO D51U-RIPA-CLM-IPA-3-CD ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaClmIpa3Cd(CFUtil.getInt(hvHostVariablesCombcr.getHv2oClmIpa3Cd(hv2oIndex - 1)));
              }
//  IF HV2R-GRP-TBL-1-NBR ( HV2R-INDEX ) = SPACES OR LOW-VALUES OR HIGH-VALUES
              if (        ( allSpaces(hvHostVariablesCombcr.getHv2rGrpTbl1Nbr(hv2rIndex - 1))   ) || 			( checkLowValue(hvHostVariablesCombcr.getHv2rGrpTbl1Nbr(hv2rIndex - 1)) )  || ( isHighValue(hvHostVariablesCombcr.getHv2rGrpTbl1Nbr(hv2rIndex - 1)) ) ) { 

// ***70293N    move   zeroes
//  MOVE SPACES TO D51U-RIPA-GRP-TBL-1-NBR ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaGrpTbl1Nbr(CONSTANTS.SPACE_4);
              }
//  ELSE
              else { 
//  MOVE HV2R-GRP-TBL-1-NBR ( HV2R-INDEX ) TO D51U-RIPA-GRP-TBL-1-NBR ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaGrpTbl1Nbr(hvHostVariablesCombcr.getHv2rGrpTbl1Nbr(hv2rIndex - 1));
              }
//  IF HV2S-GRP-TBL-2-NBR ( HV2S-INDEX ) = SPACES OR LOW-VALUES OR HIGH-VALUES
              if (        ( allSpaces(hvHostVariablesCombcr.getHv2sGrpTbl2Nbr(hv2sIndex - 1))   ) || 			( checkLowValue(hvHostVariablesCombcr.getHv2sGrpTbl2Nbr(hv2sIndex - 1)) )  || ( isHighValue(hvHostVariablesCombcr.getHv2sGrpTbl2Nbr(hv2sIndex - 1)) ) ) { 

// ***70293N    move   zeroes
//  MOVE SPACES TO D51U-RIPA-GRP-TBL-2-NBR ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaGrpTbl2Nbr(CONSTANTS.SPACE_4);
              }
//  ELSE
              else { 
//  MOVE HV2S-GRP-TBL-2-NBR ( HV2S-INDEX ) TO D51U-RIPA-GRP-TBL-2-NBR ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaGrpTbl2Nbr(hvHostVariablesCombcr.getHv2sGrpTbl2Nbr(hv2sIndex - 1));
              }
//  IF HV2T-GRP-TBL-3-NBR ( HV2T-INDEX ) = SPACES OR LOW-VALUES OR HIGH-VALUES
              if (        ( allSpaces(hvHostVariablesCombcr.getHv2tGrpTbl3Nbr(hv2tIndex - 1))   ) || 			( checkLowValue(hvHostVariablesCombcr.getHv2tGrpTbl3Nbr(hv2tIndex - 1)) )  || ( isHighValue(hvHostVariablesCombcr.getHv2tGrpTbl3Nbr(hv2tIndex - 1)) ) ) { 

// ***70293N    move   zeroes
//  MOVE SPACES TO D51U-RIPA-GRP-TBL-3-NBR ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaGrpTbl3Nbr(CONSTANTS.SPACE_4);
              }
//  ELSE
              else { 
//  MOVE HV2T-GRP-TBL-3-NBR ( HV2T-INDEX ) TO D51U-RIPA-GRP-TBL-3-NBR ( IPA-SUB )
                  vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getIpaSub() - 1).setD51uRipaGrpTbl3Nbr(hvHostVariablesCombcr.getHv2tGrpTbl3Nbr(hv2tIndex - 1));
              }
          }
  
      
      }
      /**
      * moveCsptyp 
      *   This method is derived from 
  *   COBOL Paragraph - 2655-MOVE-CSPTYP SECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ptypSub                        COBOL Name: PTYP-SUB
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - hv2pProvTyp                    COBOL Name: HV2P-PROV-TYP
      *
      * Output :  

      * - ptypSub                        COBOL Name: PTYP-SUB
      * - provFoundSw                    COBOL Name: PROV-FOUND-SW
      * - d51uPtypCnt                    COBOL Name: D51U-PTYP-CNT
      * - d51uPtypDrvPos                 COBOL Name: D51U-PTYP-DRV-POS
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - d51uPtypDrvSvc                 COBOL Name: D51U-PTYP-DRV-SVC
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - d51uPtypDrvCau                 COBOL Name: D51U-PTYP-DRV-CAU
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - d51uPtypProvTyp                COBOL Name: D51U-PTYP-PROV-TYP
      * - hv2pProvTyp                    COBOL Name: HV2P-PROV-TYP
      *
      * @throws CFException
      */
      private void moveCsptyp() throws Exception {
			// Declare local variables used in the method
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			int ptypSub = 0;
			// End of variable declaration

          ptypSub = work.getPtypSub();
//  IF PTYP-SUB < +99
          if (	( ptypSub < 99 )) { 
//  ADD +1 TO PTYP-SUB
              work.setPtypSub(work.getPtypSub()+1);
//  SET PROVTYP-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setProvtypFoundTrue(); 
              
//  MOVE PTYP-SUB TO D51U-PTYP-CNT
              d51uTableCounts.setD51uPtypCnt(work.getPtypSub());
  
//  MOVE HV2B-DERIV-PL-OF-SVC-CD ( HV2B-INDEX ) TO D51U-PTYP-DRV-POS ( PTYP-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulProvTyp().getD51uRetRuleProvTyp(work.getPtypSub() - 1).setD51uPtypDrvPos(hvHostVariablesCombcr.getHv2bDerivPlOfSvcCd(hv2bIndex - 1));
//  MOVE HV2C-DERIV-SVC-CD ( HV2C-INDEX ) TO D51U-PTYP-DRV-SVC ( PTYP-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulProvTyp().getD51uRetRuleProvTyp(work.getPtypSub() - 1).setD51uPtypDrvSvc(hvHostVariablesCombcr.getHv2cDerivSvcCd(hv2cIndex - 1));
//  MOVE HV2D-DERIV-CAUS-CD ( HV2D-INDEX ) TO D51U-PTYP-DRV-CAU ( PTYP-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulProvTyp().getD51uRetRuleProvTyp(work.getPtypSub() - 1).setD51uPtypDrvCau(hvHostVariablesCombcr.getHv2dDerivCausCd(hv2dIndex - 1));
//  MOVE HV2P-PROV-TYP ( HV2P-INDEX ) TO D51U-PTYP-PROV-TYP ( PTYP-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulProvTyp().getD51uRetRuleProvTyp(work.getPtypSub() - 1).setD51uPtypProvTyp(hvHostVariablesCombcr.getHv2pProvTyp(hv2pIndex - 1));
          }
  
      
      }
      /**
      * moveCsfcnd 
      *   This method is derived from 
  *   COBOL Paragraph - 2656-MOVE-CSFCND SECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - fcndSub                        COBOL Name: FCND-SUB
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - hv2qFromCondPos                COBOL Name: HV2Q-FROM-COND-POS
      *
      * Output :  

      * - fcndSub                        COBOL Name: FCND-SUB
      * - posFoundSw                     COBOL Name: POS-FOUND-SW
      * - d51uFcndCnt                    COBOL Name: D51U-FCND-CNT
      * - d51uFcndDrvPos                 COBOL Name: D51U-FCND-DRV-POS
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - d51uFcndDrvSvc                 COBOL Name: D51U-FCND-DRV-SVC
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - d51uFcndDrvCau                 COBOL Name: D51U-FCND-DRV-CAU
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - d51uFcndFromCondPos            COBOL Name: D51U-FCND-FROM-COND-POS
      * - hv2qFromCondPos                COBOL Name: HV2Q-FROM-COND-POS
      *
      * @throws CFException
      */
      private void moveCsfcnd() throws Exception {
			// Declare local variables used in the method
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			int fcndSub = 0;
			// End of variable declaration

          fcndSub = work.getFcndSub();
//  IF FCND-SUB < +99
          if (	( fcndSub < 99 )) { 
//  ADD +1 TO FCND-SUB
              work.setFcndSub(work.getFcndSub()+1);
//  SET POS-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setPosFoundTrue(); 
              
//  MOVE FCND-SUB TO D51U-FCND-CNT
              d51uTableCounts.setD51uFcndCnt(work.getFcndSub());
  
//  MOVE HV2B-DERIV-PL-OF-SVC-CD ( HV2B-INDEX ) TO D51U-FCND-DRV-POS ( FCND-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrCondPos().getD51uRetRuleFrCondPos(work.getFcndSub() - 1).setD51uFcndDrvPos(hvHostVariablesCombcr.getHv2bDerivPlOfSvcCd(hv2bIndex - 1));
//  MOVE HV2C-DERIV-SVC-CD ( HV2C-INDEX ) TO D51U-FCND-DRV-SVC ( FCND-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrCondPos().getD51uRetRuleFrCondPos(work.getFcndSub() - 1).setD51uFcndDrvSvc(hvHostVariablesCombcr.getHv2cDerivSvcCd(hv2cIndex - 1));
//  MOVE HV2D-DERIV-CAUS-CD ( HV2D-INDEX ) TO D51U-FCND-DRV-CAU ( FCND-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrCondPos().getD51uRetRuleFrCondPos(work.getFcndSub() - 1).setD51uFcndDrvCau(hvHostVariablesCombcr.getHv2dDerivCausCd(hv2dIndex - 1));
//  MOVE HV2Q-FROM-COND-POS ( HV2Q-INDEX ) TO D51U-FCND-FROM-COND-POS ( FCND-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrCondPos().getD51uRetRuleFrCondPos(work.getFcndSub() - 1).setD51uFcndFromCondPos(pad(3,hvHostVariablesCombcr.getHv2qFromCondPos(hv2qIndex - 1),SPACE_CHAR,RIGHT_PAD));
          }
  
      
      }
      /**
      * moveCflgTable 
      *   This method is derived from 
  *   COBOL Paragraph - 2657-MOVE-CFLG-TABLE SECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - cflgSub                        COBOL Name: CFLG-SUB
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - hv2uCpeDescCd                  COBOL Name: HV2U-CPE-DESC-CD
      *
      * Output :  

      * - cflgSub                        COBOL Name: CFLG-SUB
      * - d51uCflgCnt                    COBOL Name: D51U-CFLG-CNT
      * - cflgFoundSw                    COBOL Name: CFLG-FOUND-SW
      * - d51uCflgDrvPos                 COBOL Name: D51U-CFLG-DRV-POS
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - d51uCflgDrvSvc                 COBOL Name: D51U-CFLG-DRV-SVC
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - d51uCflgDrvCau                 COBOL Name: D51U-CFLG-DRV-CAU
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - d51uCflgCpeDescCd              COBOL Name: D51U-CFLG-CPE-DESC-CD
      * - hv2uCpeDescCd                  COBOL Name: HV2U-CPE-DESC-CD
      *
      * @throws CFException
      */
      private void moveCflgTable() throws Exception {
			// Declare local variables used in the method
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			int cflgSub = 0;
			// End of variable declaration

          cflgSub = work.getCflgSub();
//  IF CFLG-SUB < +99
          if (	( cflgSub < 99 )) { 
//  ADD 1 TO CFLG-SUB
              work.setCflgSub(work.getCflgSub()+1);
//  MOVE CFLG-SUB TO D51U-CFLG-CNT
              d51uTableCounts.setD51uCflgCnt(work.getCflgSub());
  
//  SET CFLG-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setCflgFoundTrue(); 
              
//  MOVE HV2B-DERIV-PL-OF-SVC-CD ( HV2B-INDEX ) TO D51U-CFLG-DRV-POS ( CFLG-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCpeFlgData().getD51uRetRulCpeFlg(work.getCflgSub() - 1).setD51uCflgDrvPos(hvHostVariablesCombcr.getHv2bDerivPlOfSvcCd(hv2bIndex - 1));
//  MOVE HV2C-DERIV-SVC-CD ( HV2C-INDEX ) TO D51U-CFLG-DRV-SVC ( CFLG-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCpeFlgData().getD51uRetRulCpeFlg(work.getCflgSub() - 1).setD51uCflgDrvSvc(hvHostVariablesCombcr.getHv2cDerivSvcCd(hv2cIndex - 1));
//  MOVE HV2D-DERIV-CAUS-CD ( HV2D-INDEX ) TO D51U-CFLG-DRV-CAU ( CFLG-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCpeFlgData().getD51uRetRulCpeFlg(work.getCflgSub() - 1).setD51uCflgDrvCau(hvHostVariablesCombcr.getHv2dDerivCausCd(hv2dIndex - 1));
//  MOVE HV2U-CPE-DESC-CD ( HV2U-INDEX ) TO D51U-CFLG-CPE-DESC-CD ( CFLG-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCpeFlgData().getD51uRetRulCpeFlg(work.getCflgSub() - 1).setD51uCflgCpeDescCd(hvHostVariablesCombcr.getHv2uCpeDescCd(hv2uIndex - 1));
          }
  
      
      }
      /**
      * processFuncCd3 
      *   This method is derived from 
  *   COBOL Paragraph - 3100-PROCESS-FUNC-CD-3 SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sub                            COBOL Name: WS-SUB
      * - d51uMoreIcdSwitch              COBOL Name: D51U-MORE-ICD-SWITCH
      * - d51uKeyFeSpi                   COBOL Name: D51U-KEY-FE-SPI
      * - d51uLstClmIcdPos               COBOL Name: D51U-LST-CLM-ICD-POS
      * - d51uLstClmIcdSvc               COBOL Name: D51U-LST-CLM-ICD-SVC
      * - d51uLstClmIcdCau               COBOL Name: D51U-LST-CLM-ICD-CAU
      * - d51uLstClmIcdInd               COBOL Name: D51U-LST-CLM-ICD-IND
      *
      * Output :  

      * - sub                            COBOL Name: WS-SUB
      * - d51uRetRuleIcd                 COBOL Name: D51U-RET-RULE-ICD
      * - icdSub                         COBOL Name: ICD-SUB
      * - d51uMoreIcdCnt                 COBOL Name: D51U-MORE-ICD-CNT
      * - moreIcdFoundSw                 COBOL Name: MORE-ICD-FOUND-SW
      * - fetchEndIcd                    COBOL Name: WS-FETCH-END-ICD
      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - ricdSpiTblId                   COBOL Name: RICD-SPI-TBL-ID
      * - d51uKeyFeSpi                   COBOL Name: D51U-KEY-FE-SPI
      * - lstClmIcdPos                   COBOL Name: WS-LST-CLM-ICD-POS
      * - ricdDerivPlOfSvcCd             COBOL Name: RICD-DERIV-PL-OF-SVC-CD
      * - d51uLstClmIcdPos               COBOL Name: D51U-LST-CLM-ICD-POS
      * - lstClmIcdSvc                   COBOL Name: WS-LST-CLM-ICD-SVC
      * - ricdDerivSvcCd                 COBOL Name: RICD-DERIV-SVC-CD
      * - d51uLstClmIcdSvc               COBOL Name: D51U-LST-CLM-ICD-SVC
      * - lstClmIcdCau                   COBOL Name: WS-LST-CLM-ICD-CAU
      * - ricdDerivCausCd                COBOL Name: RICD-DERIV-CAUS-CD
      * - d51uLstClmIcdCau               COBOL Name: D51U-LST-CLM-ICD-CAU
      * - lstClmIcdInd                   COBOL Name: WS-LST-CLM-ICD-IND
      * - d51uLstClmIcdInd               COBOL Name: D51U-LST-CLM-ICD-IND
      *
      * @throws CFException
      */
      private void processFuncCd3() throws Exception {
			// Declare local variables used in the method
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			D51uKey d51uKey = vyspi51uCallArea.getD51uRequestFields().getD51uKey();
			D51uLstIcdKey d51uLstIcdKey = vyspi51uCallArea.getD51uRequestFields().getD51uLstIcdKey();
			D51uNonArrayData d51uNonArrayData = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData();
			// End of variable declaration

      
// *81***************************************************************
// *81 3100-Process-func-cd-3                                       *
// *81                                                              *
// *81 business function:                                           *
// *81 process icd rule table for records in excess of 9999         *
// *81***************************************************************
// *82***************************************************************
// *82 3100-process-func-cd-3                                       *
// *82                                                              *
// *82 1. fetch this cursor                                         *
// *82               csicd_first_9999_spi                           *
// *82                                                              *
// *82 called by : 1.2000-processing section                        *
// *82 call      :                                                  *
// *82***************************************************************

// **   Move 'n'                    to d51u-more-icd-records.
// **   move 'n'                    to ws-fetch-end-icd.
// **
// **
// *== populate fields required for cursor fetch (csicd_b9999)
// **   move d51u-ricd-drv-pos(01)  to ricd-deriv-pl-of-svc-cd
// **   move d51u-ricd-drv-svc(01)  to ricd-deriv-svc-cd
// **   move d51u-ricd-drv-cau(01)  to ricd-deriv-caus-cd
// *== initialize the return fields
//  PERFORM VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > +9999
          for (work.setSub(1); (	( work.getSub() <= 9999 )) ; work.setSub(work.getSub() + 1) ) {
//  INITIALIZE D51U-RET-RULE-ICD ( WS-SUB )
              vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getSub() - 1).initialize();
          }

// *==
//  MOVE +0 TO ICD-SUB
          work.setIcdSub(0);
//  MOVE ICD-SUB TO D51U-MORE-ICD-CNT
          d51uTableCounts.setD51uMoreIcdCnt(work.getIcdSub());
  
//  SET MORE-ICD-NOT-FOUND TO TRUE
          vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setMoreIcdNotFoundTrue(); 
          
//  SET NOT-END-OF-FETCH-ICD TO TRUE
          work.setNotEndOfFetchIcdTrue(); 
          
//  SET CLOSE-CSR-OK TO TRUE
          work.setCloseCsrOkTrue(); 
          

// *
// ***  Perform  3200-open-csicd-cursor   thru  3200-exit.
// *
          d51uNonArrayData = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData();
//  IF FIRST-TIME-MORE-ICD
          if ( d51uNonArrayData.isFirstTimeMoreIcd()  ) { 
//  MOVE D51U-KEY-FE-SPI TO RICD-SPI-TBL-ID
              dclfeSpiRuleIcd.setRicdSpiTblId(d51uKey.getD51uKeyFeSpi());
  
//  MOVE D51U-LST-CLM-ICD-POS TO WS-LST-CLM-ICD-POS RICD-DERIV-PL-OF-SVC-CD
              lstIcdKey.setLstClmIcdPos(d51uLstIcdKey.getD51uLstClmIcdPos());
              dclfeSpiRuleIcd.setRicdDerivPlOfSvcCd(d51uLstIcdKey.getD51uLstClmIcdPos());
  
//  MOVE D51U-LST-CLM-ICD-SVC TO WS-LST-CLM-ICD-SVC RICD-DERIV-SVC-CD
              lstIcdKey.setLstClmIcdSvc(d51uLstIcdKey.getD51uLstClmIcdSvc());
              dclfeSpiRuleIcd.setRicdDerivSvcCd(d51uLstIcdKey.getD51uLstClmIcdSvc());
  
//  MOVE D51U-LST-CLM-ICD-CAU TO WS-LST-CLM-ICD-CAU RICD-DERIV-CAUS-CD
              lstIcdKey.setLstClmIcdCau(d51uLstIcdKey.getD51uLstClmIcdCau());
              dclfeSpiRuleIcd.setRicdDerivCausCd(d51uLstIcdKey.getD51uLstClmIcdCau());
  
//  MOVE D51U-LST-CLM-ICD-IND TO WS-LST-CLM-ICD-IND
              lstIcdKey.setLstClmIcdInd(d51uLstIcdKey.getD51uLstClmIcdInd());
  
//  PERFORM 2450-OPEN-CSICD-CURSOR THRU 2450-EXIT
              openCsicdCursor();/*2450-OPEN-CSICD-CURSOR SECTION*/
          }
  
//  ELSE
          else { 
//  PERFORM 2480-FETCH-CSICD THRU 2480-EXIT
              fetchCsicd();/*2480-FETCH-CSICD SECTION*/
          }
      
      }
      /**
      * openCsicdCursor3200 
      *   This method is derived from 
  *   COBOL Paragraph - 3200-OPEN-CSICD-CURSOR SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - fetchEndIcd                    COBOL Name: WS-FETCH-END-ICD
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      private void openCsicdCursor3200() throws Exception {
			// Declare local variables used in the method
			TestDiagArea testDiagArea = testVariables.getTestDiagArea();
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

      
// *81***************************************************************
// *81 3200-Open-csicd-cursor section.                              *
// *81                                                              *
// *81 business function:                                           *
// *81 select / validate columns the fe spi tables                  *
// *81***************************************************************
// *82***************************************************************
// *82 3200-open-csicd-cursor section                               *
// *82                                                              *
// *82 1.open cursor of this table                                  *
// *82                - fe_spi_rule_icd                             *
// *82                                                              *
// *82 ccsicded by : 1.                                             *
// *82 call      :                                                  *
// *82                                                              *
// *82***************************************************************
//  SELECT DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CLM_ICD_IND , CLM_ICD_FROM_CD , CLM_ICD_TO_CD FROM FE_SPI_RULE_ICD WHERE ( SPI_TBL_ID = ? AND STS_CD = 'A' AND CLM_ICD_IND = ? ) AND ( ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? ) ORDER BY DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CLM_ICD_FROM_CD , CLM_ICD_TO_CD FOR FETCH ONLY
          d529351uRepository.openCsicdFirst9999SpiD529351u(dclfeSpiRuleIcd,lstIcdKey,sqlca,testVariables);
  
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  PERFORM 3250-FETCH-CSICD THRU 3250-EXIT UNTIL END-OF-FETCH-ICD
              while (!(work.isEndOfFetchIcd()) ) {
                 fetchCsicd3250();/*3250-FETCH-CSICD SECTION*/
              }
          break;
          default :
//  SET DSM-DB2-ERROR TO TRUE
              dsmCallArea.getDsmCommonArea().setDsmDb2ErrorTrue(); 
              
//  SET D51U-DB2-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
              
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  SET D51U-DB2-OPEN-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2OpenErrorTrue(); 
              
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//  MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              d51uErrorTrace.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
  
//  MOVE '3200-' TO D51U-PARAGRAPH-NUM
//  LITERAL_3200_MN_ = '3200-'
              d51uErrorTrace.setD51uParagraphNum(CONSTANTS.LITERAL_3200_MN_);
  
          }
      
      }
      /**
      * fetchCsicd3250 
      *   This method is derived from 
  *   COBOL Paragraph - 3250-FETCH-CSICD SECTION COBOL Cyclomatic complexity - 11
      * Input  :  

      * - sqlerrd                        COBOL Name: SQLERRD
      * - icdSub                         COBOL Name: ICD-SUB
      * - hv3aIcdDrvPos                  COBOL Name: HV3A-ICD-DRV-POS
      * - hv3bIcdDrvSvc                  COBOL Name: HV3B-ICD-DRV-SVC
      * - hv3cIcdDrvCau                  COBOL Name: HV3C-ICD-DRV-CAU
      * - hv3dIcdTypCd                   COBOL Name: HV3D-ICD-TYP-CD
      * - hv3eClmFrmIcdCd                COBOL Name: HV3E-CLM-FRM-ICD-CD
      * - hv3fClmToIcdCd                 COBOL Name: HV3F-CLM-TO-ICD-CD
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsnnrows                       COBOL Name: DSNNROWS
      * - hv3aIndex                      COBOL Name: HV3A-INDEX
      * - hv3bIndex                      COBOL Name: HV3B-INDEX
      * - hv3cIndex                      COBOL Name: HV3C-INDEX
      * - hv3dIndex                      COBOL Name: HV3D-INDEX
      * - hv3eIndex                      COBOL Name: HV3E-INDEX
      * - hv3fIndex                      COBOL Name: HV3F-INDEX
      * - icdSub                         COBOL Name: ICD-SUB
      * - d51uRicdDrvPos                 COBOL Name: D51U-RICD-DRV-POS
      * - hv3aIcdDrvPos                  COBOL Name: HV3A-ICD-DRV-POS
      * - d51uRicdDrvSvc                 COBOL Name: D51U-RICD-DRV-SVC
      * - hv3bIcdDrvSvc                  COBOL Name: HV3B-ICD-DRV-SVC
      * - d51uRicdDrvCau                 COBOL Name: D51U-RICD-DRV-CAU
      * - hv3cIcdDrvCau                  COBOL Name: HV3C-ICD-DRV-CAU
      * - d51uRicdClmIcdInd              COBOL Name: D51U-RICD-CLM-ICD-IND
      * - hv3dIcdTypCd                   COBOL Name: HV3D-ICD-TYP-CD
      * - d51uRicdClmIcdFromCd           COBOL Name: D51U-RICD-CLM-ICD-FROM-CD
      * - hv3eClmFrmIcdCd                COBOL Name: HV3E-CLM-FRM-ICD-CD
      * - d51uRicdClmIcdToCd             COBOL Name: D51U-RICD-CLM-ICD-TO-CD
      * - hv3fClmToIcdCd                 COBOL Name: HV3F-CLM-TO-ICD-CD
      * - icdFoundSw                     COBOL Name: ICD-FOUND-SW
      * - d51uIcdCnt                     COBOL Name: D51U-ICD-CNT
      * - fetchEndIcd                    COBOL Name: WS-FETCH-END-ICD
      * - d51uMoreIcdRecords             COBOL Name: D51U-MORE-ICD-RECORDS
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      private void fetchCsicd3250() throws Exception {
			// Declare local variables used in the method
			int icdSub = 0;
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			// End of variable declaration

// FETCH NEXT ROWSET FROM CSICD_FIRST_9999_SPI FOR 9999 ROWS INTO  ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ? 
//  MOVE 9999 TO DSNNROWS
          work.setDsnnrows(9999);
//  FETCH NEXT ROWSET FROM CSICD_FIRST_9999_SPI FOR 9999 ROWS INTO ? , ? , ? , ? , ? , ?
          d529351uRepository.fetchCsicdFirst9999SpiD529351u(hvHostVariablesCsicdo,sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:

// ***        Add +1 to icd-sub
//  SET HV3A-INDEX TO +1
              hv3aIndex = 1; 
              
//  SET HV3B-INDEX TO +1
              hv3bIndex = 1; 
              
//  SET HV3C-INDEX TO +1
              hv3cIndex = 1; 
              
//  SET HV3D-INDEX TO +1
              hv3dIndex = 1; 
              
//  SET HV3E-INDEX TO +1
              hv3eIndex = 1; 
              
//  SET HV3F-INDEX TO +1
              hv3fIndex = 1; 
              
//  PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < sqlca.getSqlerrd(2);index1++) {

// ***       If icd-sub > +0 and icd-sub <= +9999
                  icdSub = work.getIcdSub();
//  IF ICD-SUB < +9999
                  if (	( icdSub < 9999 )) { 
//  ADD +1 TO ICD-SUB
                      work.setIcdSub(work.getIcdSub()+1);

// ***        Move ricd-deriv-pl-of-svc-cd  to
//  MOVE HV3A-ICD-DRV-POS ( HV3A-INDEX ) TO D51U-RICD-DRV-POS ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdDrvPos(hvHostVariablesCsicdo.getHv3aIcdDrvPos(hv3aIndex - 1));

// ***        Move ricd-deriv-svc-cd        to
//  MOVE HV3B-ICD-DRV-SVC ( HV3B-INDEX ) TO D51U-RICD-DRV-SVC ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdDrvSvc(hvHostVariablesCsicdo.getHv3bIcdDrvSvc(hv3bIndex - 1));

// ***        Move ricd-deriv-caus-cd       to
//  MOVE HV3C-ICD-DRV-CAU ( HV3C-INDEX ) TO D51U-RICD-DRV-CAU ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdDrvCau(hvHostVariablesCsicdo.getHv3cIcdDrvCau(hv3cIndex - 1));

// ***        Move ricd-clm-icd-ind      to
//  MOVE HV3D-ICD-TYP-CD ( HV3D-INDEX ) TO D51U-RICD-CLM-ICD-IND ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdClmIcdInd(hvHostVariablesCsicdo.getHv3dIcdTypCd(hv3dIndex - 1));

// ***        Move ricd-clm-icd-from-cd  to
//  MOVE HV3E-CLM-FRM-ICD-CD ( HV3E-INDEX ) TO D51U-RICD-CLM-ICD-FROM-CD ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdClmIcdFromCd(hvHostVariablesCsicdo.getHv3eClmFrmIcdCd(hv3eIndex - 1));

// ***        Move ricd-clm-icd-to-cd  to
//  MOVE HV3F-CLM-TO-ICD-CD ( HV3F-INDEX ) TO D51U-RICD-CLM-ICD-TO-CD ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdClmIcdToCd(hvHostVariablesCsicdo.getHv3fClmToIcdCd(hv3fIndex - 1));
                  }
  

// ***        Set icd-found to true
// ***       else
// ***        move 'y'                to d51u-more-icd-records
// ***        move +9999 to d51u-icd-cnt
// ***        perform 3260-close-csr   thru 3260-exit
//  SET HV3A-INDEX UP BY +1
                  hv3aIndex++; 
                  
//  SET HV3B-INDEX UP BY +1
                  hv3bIndex++; 
                  
//  SET HV3C-INDEX UP BY +1
                  hv3cIndex++; 
                  
//  SET HV3D-INDEX UP BY +1
                  hv3dIndex++; 
                  
//  SET HV3E-INDEX UP BY +1
                  hv3eIndex++; 
                  
//  SET HV3F-INDEX UP BY +1
                  hv3fIndex++; 
                  
              }
              icdSub = work.getIcdSub();
//  IF ICD-SUB = +9999
              if (	( icdSub == 9999 )) { 
//  SET ICD-FOUND TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setIcdFoundTrue(); 
                  
//  MOVE ICD-SUB TO D51U-ICD-CNT
                  d51uTableCounts.setD51uIcdCnt(work.getIcdSub());
  
//  SET END-OF-FETCH-ICD TO TRUE
                  work.setEndOfFetchIcdTrue(); 
                  
//  SET MORE-ICD-RECORDS TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setMoreIcdRecordsTrue(); 
                  
//  PERFORM 3260-CLOSE-CSR THRU 3260-EXIT
                  closeCsr3260();/*3260-CLOSE-CSR SECTION*/
              }
  
          break;
          	case 100:
//  SET HV3A-INDEX TO +1
              hv3aIndex = 1; 
              
//  SET HV3B-INDEX TO +1
              hv3bIndex = 1; 
              
//  SET HV3C-INDEX TO +1
              hv3cIndex = 1; 
              
//  SET HV3D-INDEX TO +1
              hv3dIndex = 1; 
              
//  SET HV3E-INDEX TO +1
              hv3eIndex = 1; 
              
//  SET HV3F-INDEX TO +1
              hv3fIndex = 1; 
              
//  PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < sqlca.getSqlerrd(2);index1++) {
                  icdSub = work.getIcdSub();
//  IF ICD-SUB < +9999
                  if (	( icdSub < 9999 )) { 
//  ADD +1 TO ICD-SUB
                      work.setIcdSub(work.getIcdSub()+1);
//  MOVE HV3A-ICD-DRV-POS ( HV3A-INDEX ) TO D51U-RICD-DRV-POS ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdDrvPos(hvHostVariablesCsicdo.getHv3aIcdDrvPos(hv3aIndex - 1));
//  MOVE HV3B-ICD-DRV-SVC ( HV3B-INDEX ) TO D51U-RICD-DRV-SVC ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdDrvSvc(hvHostVariablesCsicdo.getHv3bIcdDrvSvc(hv3bIndex - 1));
//  MOVE HV3C-ICD-DRV-CAU ( HV3C-INDEX ) TO D51U-RICD-DRV-CAU ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdDrvCau(hvHostVariablesCsicdo.getHv3cIcdDrvCau(hv3cIndex - 1));
//  MOVE HV3D-ICD-TYP-CD ( HV3D-INDEX ) TO D51U-RICD-CLM-ICD-IND ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdClmIcdInd(hvHostVariablesCsicdo.getHv3dIcdTypCd(hv3dIndex - 1));
//  MOVE HV3E-CLM-FRM-ICD-CD ( HV3E-INDEX ) TO D51U-RICD-CLM-ICD-FROM-CD ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdClmIcdFromCd(hvHostVariablesCsicdo.getHv3eClmFrmIcdCd(hv3eIndex - 1));
//  MOVE HV3F-CLM-TO-ICD-CD ( HV3F-INDEX ) TO D51U-RICD-CLM-ICD-TO-CD ( ICD-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcdSub() - 1).setD51uRicdClmIcdToCd(hvHostVariablesCsicdo.getHv3fClmToIcdCd(hv3fIndex - 1));
                  }
  
//  SET HV3A-INDEX UP BY +1
                  hv3aIndex++; 
                  
//  SET HV3B-INDEX UP BY +1
                  hv3bIndex++; 
                  
//  SET HV3C-INDEX UP BY +1
                  hv3cIndex++; 
                  
//  SET HV3D-INDEX UP BY +1
                  hv3dIndex++; 
                  
//  SET HV3E-INDEX UP BY +1
                  hv3eIndex++; 
                  
//  SET HV3F-INDEX UP BY +1
                  hv3fIndex++; 
                  
              }
              icdSub = work.getIcdSub();
//  IF ICD-SUB = 0
              if (	( icdSub == 0 )) { 
//  SET ICD-NOT-FOUND TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setIcdNotFoundTrue(); 
                  
              }
  
//  ELSE
              else { 
//  SET ICD-FOUND TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setIcdFoundTrue(); 
                  
              }
//  SET END-OF-FETCH-ICD TO TRUE
              work.setEndOfFetchIcdTrue(); 
              
//  MOVE ICD-SUB TO D51U-ICD-CNT
              d51uTableCounts.setD51uIcdCnt(work.getIcdSub());
  
//  PERFORM 3260-CLOSE-CSR THRU 3260-EXIT
              closeCsr3260();/*3260-CLOSE-CSR SECTION*/
          break;
          default :
//  SET ICD-NOT-FOUND TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().setIcdNotFoundTrue(); 
              
//  SET END-OF-FETCH-ICD TO TRUE
              work.setEndOfFetchIcdTrue(); 
              
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  PERFORM 3260-CLOSE-CSR THRU 3260-EXIT
              closeCsr3260();/*3260-CLOSE-CSR SECTION*/
          }
      
      }
      /**
      * closeCsr3260 
      *   This method is derived from 
  *   COBOL Paragraph - 3260-CLOSE-CSR SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      private void closeCsr3260() throws Exception {
			// Declare local variables used in the method
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

//  CLOSE CSICD_FIRST_9999_SPI
          d529351uRepository.closeCsicdFirst9999SpiD529351u(sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  SET CLOSE-CSR-OK TO TRUE
              work.setCloseCsrOkTrue(); 
              
          break;
          default :
//  MOVE SQLCODE TO WS-SQLCODE
              work.setSqlcode_Ws(sqlca.getSqlcode());
//  SET CLOSE-CSR-NG TO TRUE
              work.setCloseCsrNgTrue(); 
              
//  SET D51U-DB2-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2ErrorTrue(); 
              
//  SET D51U-DB2-CLOSE-ERROR TO TRUE
              vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setD51uDb2CloseErrorTrue(); 
              
//  MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              d51uErrorTrace.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(work.getSqlcode_Ws()).toCharArray()));
  
//  MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              d51uErrorTrace.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
  
//  MOVE '3260-' TO D51U-PARAGRAPH-NUM
//  LITERAL_3260_MN_ = '3260-'
              d51uErrorTrace.setD51uParagraphNum(CONSTANTS.LITERAL_3260_MN_);
  
          }
      
      }
  
  
      /**
* This method pre-initializes variables consistent with
* what a mainframe program would have done at the start of a program
*/
      @Override
      public void initVars() throws CFException {
      setProgramEnded(false);
          db2Base.reset("D529351U" ,dbQualifier, true/*use Dynamic SQL*/);
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
      public int call(Object[] params) throws Exception {
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            dsmCallArea.set((Field)params[0]);
         if (len > 1 && params[1] != null )
            vyspi51uCallArea.set((Field)params[1]);
         // invoke the process and return rc
         return process();
         
      }
      
      public int call(Field... parameters) throws Exception {
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof DsmCallArea) {
                       	this.dsmCallArea = ((DsmCallArea) parameters[index]);
                  	} else {
                       	this.dsmCallArea.set(parameters[index]);
                  	}
                  }
                
                  break;
              case 1:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Vyspi51uCallArea) {
                       	this.vyspi51uCallArea = ((Vyspi51uCallArea) parameters[index]);
                  	} else {
                       	this.vyspi51uCallArea.set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
          return process();
      }
      
      
  
  
  
  
  
  }
  /* 
*00***************************************************************
*00    licenced materials - property of united health group      *
*00                                                              *
*00***************************************************************
*10***************************************************************
*10  program name       :  d529351u                              *
*10  business function  :  db2 data service module of o529351u   *
*10  designed by        :  marife silva                          *
*10  programmed by      :  marife silva                          *
*10  date coded         :  feb. 2012.                            *
*10  type               :  batch/online                          *
*10***************************************************************
*20***************************************************************
*20  major program process:                                      *
*20                                                              *
*20  this db2 dsm module receives function code / spi nbr        *
*20  policy / plan - validates them against spi db2 tables       *
*20  and send back response to the calling program               *
*20                                                              *
*80 func-cd - entered       access spi tables       by           *
*80 ------------------      --------------------   ----          *
*80 1 - policy/plan         fe_spi_pln_var         policy + plan *
*80 2 - spi                 fe_spi_rule_fr_to_svc                *
*80                         fe_spi_rule_prov_typ                 *
*80                         fe_spi_rule_ipa                      *
*80                         fe_spi_rule_caus                     *
*80                         fe_spi_rule_icd                      *
*80                         fe_spi_rule_fr_cond_pos              *
*80                         fe_spi_rule_cpe_flg                  *
******************************************************************
*20***************************************************************
*30***************************************************************
*30  program change log:                                         *
*30                                                              *
*30  release  developer   description                            *
*30  -------  ----------  ---------------------------------      *
*30  rel12q2  m.silva     sprf 4-45917 - icd10 tf case install   *
*30                       initial delivery                       *
*30  rel12q2  m.silva     qc1810-fix cursor                      *
*30                       qc1782-addtl changes                   *
*30  rel12q2  m.silva     qc3211-changes to move derived ps      *
*30                       svc cd and cause code                  *
*30  rel12q2  m.silva     qc5490- fix for -811 for ipa           *
*30  rel12q2  m.silva     qc3670- per dss change - bypass spi no *
*30                       if not active in description table     *
*30                       qc5744- fix for cause code select      *
*30  rel12q2  m.silva     qc5811  corrected subscripts           *
*30  rel12q2  m.silva     qc6693  performance tuning             *
*30  rel12q2  m.silva     qc8025  change ws-sub from 9 to binary *
*30                       as part of performance tuning          *
*30  rel12q2  m.silva     qc9901  move return rules keys         *
*30                       to fix slotting issue                  *
*30  rel12q3  p.parakh    mdtr-2012-0520-1a-tops                 *
*30  rel12q3  p.parakh    defect fix 3841 - sqlcode - 181        *
*30  rel12q3  p.parakh    defect fix 5450(dev identified) for    *
*30                       date conversion from cob to db2        *
*30  rel12q3  p.parakh    defect fix 6274 - non-select 48        *
*30  rel12q3  y.levitis   defect fix 7841                        *
*30                       - increment d51u-ipa-cnt               *
*30  rel12q4  pranjal     uncommenting part of the fix for       *
*30                       defect 7841 for sos 12-2108            *
*30  rel13q3  chuck       mdtr-2013-0207-1a                      *
*30           haatvedt/   added rowset positioning for csplnv &  *
*30           p.parakh    csfrto cursors                         *
*30  rel14q2  hpsm pm10153810 -gaurav b. - fix for icd fetches   *
*30                                        beyond 9999 for table *
*30                                        fe_spi_rule_icd       *
*30  rel15q1  mdtr-2013-1014-1a-tops/    - marie's dtr changes   *
*30           hpsm pm10172289            - marie's dtr changes   *
*30           girish velivala/             create new indexes on *
*30           p.parakh                     fe_spi_rule_caus      *
*30                                        fe_spi_rule_ipa       *
*30                                        fe_spi_rule_prov_typ  *
*30                                       fe_spi_rule_fr_cond_pos*
*30                -  added rowset cursor for derive rules       *
*30                -  added rowset cursor for svc codes          *
*30                -  added rowset cursor for icd codes and to   *
*30                -  fetching pos, svc and caus-cd from csicd,  *
*30                   csfrto and csicd_first_9999_spi also       *
*30                         handle more than 9999 codes that     *
*30                         would handle issue with icd10 codes  *
*30                         for hpsm pm10153810                  *
*30  rel15q3  nick        4-70293 claims processing              *
*30           bukwich     added -grp-tbl-#-nbr                   *
*30  rel15q3  joe leva    4-70293 alm 7323                       *
*30  rel16q1  manoj       fix for alm 4808 for sos 15-3533s      *
*30           ganna       moving spaces to d51u-grp-tbl-1/2/3    *
*30  rel17m8  derek       replaced union to get spi catagories   *
*30           backus      with denorm table                      *
*30                       mdtr-2016-0405-1a-tops                 *
*30  rel18q4  derek       prj145017 internal and customer        *
*30           backus      reporting                              *
*30  rel1909  raj s       prj145017 internal and customer        *
*30                       reporting - pos-tier-typ field         *
*30  rel1909  jaspuneet   prj179220 msk adding pri-diag-ind      *
*30  rel2105  ankita      prj272472 - emergent non-emergent      *
*30           agarwal     project phase 2 and 3                  *
*30 rel21m09  y.levitis  - prj272209 - designated diagnostic     *
*30                        provider (ddp). added  -              *
*30                        major diagnostic eligible indicator   *
*30***************************************************************
*40***************************************************************
*40  external called programs:                                   *
*40                                                              *
*40  name         description        call/link/xctl/start        *
*40  ----     --------------------   --------------------        *
*40                                                              *
*40***************************************************************
*50***************************************************************
*50  return codes:                                               *
*50                                                              *
*50  code                 description                            *
*50  ---------------      ------------------------------------   *
*50                                                              *
*50***************************************************************
*60***************************************************************
*60  database used:                                              *
*60                                                              *
*60            database                  description             *
*60            --------                  ----------------        *
*60                                                              *
*60***************************************************************
*70***************************************************************
*70  tables and access types:                                    *
*70       name                        access                     *
*70  --------------                   -------                    *
*70  fe_spi_desc                      select                     *
*70  fe_spi_rule_fr_cond_pos          select                     *
*70  fe_spi_rule_fr_to_svc            select                     *
*70  fe_spi_rule_prov_typ             select                     *
*70  fe_spi_rule_icd                  select                     *
*70  fe_spi_rule_caus                 select                     *
*70  fe_spi_rule_ipa                  select                     *
*70  fe_spi_rule_cpe_flg              select                     *
*70***************************************************************
*/
