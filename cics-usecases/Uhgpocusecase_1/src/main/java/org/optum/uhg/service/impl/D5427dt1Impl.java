package org.optum.uhg.service.impl;
  /* 
******************************************************************
*00***************************************************************
*00  licensed materials - property of united health group        *
*00                                                              *
*00    n o t   r e v i e w e d - comments have not been reviewed *
*00                              by sme                          *
*00***************************************************************
*10***************************************************************
*10  program name       :  d5427dt1.                             *
*10  business function  :  data retrieval for v5427dt1           *
*10  designed by        :  n/a.                                  *
*10  cloned from        :  n/a.                                  *
*10  programmed by      :  foundation team.                      *
*10  date coded         :  july 2019.                            *
*10  frequency used     :  on-request.                           *
*10  type               :  on-line.                              *
*10  application used   :  iset                                  *
*10***************************************************************
*20***************************************************************
*20  major program process: abbreviated history summary          *
*20                                                              *
*20***************************************************************
*30***************************************************************
*30                                                              *
*30  d5427dt1 program change log                                 *
*30                                                              *
*30 init      date       lvl   description                       *
*30 ----      ----       ---   -----------                       *
*30 myaskovsky 07/10/19        -prj161406 sov claim processing   *
*30                             clone of v5683dt1 converted to a *
*30                             tops program with access to      *
*30                             service channel data base        *
*30 myaskovsky 08/23/19        -prj155221 delegated encounter    *
*30 myaskovsky 12/17/19        -prj179220 msk                    *
*30 venu yadav relm0820        -prb0807082 -fix to send the all  *
*30                             processed claims under member to *
*30                             portal on multiple api calls     *
*30 2020-08-19 marina myaskovsky- prj188631: medical claims apis *
*30 2020-08-20 marina myaskovsky- prj199537:                     *
*30                             ndb unlimited contract lines     *
*30 2021-02-19 phil weis        - prj279099                      *
*30                             ndb unlimited contract lines     *
*30 2021-07-30 marina myaskovsky  prj278383                      *
*30                             medicaid reclamation             *
*30 2021-10-07 marina myaskovsky - prj268164 claims360 phase 1   *
*30 2021-11-02 marina myaskovsky - prj283302 - surprise medical  *
*30                                billing                       *
*30 rel22m06 sunil g. prj293739 - rc43-removal of rc 43.         *
*30***************************************************************
*40***************************************************************
*40  external called programs:                                   *
*40                                                              *
*40  name         description           call/link                *
*40  --------     -----------           ----------               *
*40                                                              *
*40***************************************************************
*50***************************************************************
*50  return codes:                                               *
*50                                                              *
*50***************************************************************
*60***************************************************************
*60  files used:                                                 *
*60                                                              *
*60  filename             mode           description             *
*60  --------             ----           ----------------        *
*60                                                              *
*60***************************************************************
*70***************************************************************
*70  tables and access types:                                    *
*70                                                              *
*70  name                               db2 access               *
*70  --------------                     -------------------      *
*70  adjd_clmhst_denorm_ref             select                   *
*70  adjd_clmhst_denorm_ln              select                   *
*70  adjd_clmhst_denorm_hdr             select                   *
*70  adjd_clmsf_blk_e                   select                   *
*70  de_auth_srch                       select                   *
*70  adjd_clmsf_blk_e2                  select                   *
*70  adjd_clmsf_lnlptnt                 select                   *
*70  adjd_clmsf_diag                    select                   *
*70***************************************************************
*/
  
import org.optum.uhg.common.CommonProcess;
import com.cloudframe.app.process.BaseProcess;
  import com.cloudframe.app.cics.CICSSession;
import org.optum.uhg.dto.d5427dt1.D5427dt1Ctx.*;
import org.optum.uhg.dto.d5427dt1.D5427dt1Ctx;
import org.optum.uhg.service.D5427dt1;
  import com.cloudframe.app.process.BaseProcess;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.cics.TransactionManager;
  import com.cloudframe.app.utility.CFUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.optum.uhg.repository.D5427dt1Repository;
import java.math.BigDecimal;
  import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.optum.uhg.business.Vp776a00;
import org.optum.uhg.business.*;
import org.optum.uhg.service.*;
import java.util.List;
  import com.cloudframe.app.utility.DsntiarUtil;
  import com.cloudframe.app.utility.MiscFunctions;
  import com.cloudframe.app.utility.DateTimeVariable;
import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dto.ProgramContext;
import org.optum.uhg.dto.d5427dt1.*;
import org.optum.uhg.dto.d5427dt1.DfhcommareaGroup;
import org.optum.uhg.dto.d5427dt1.QueryTextArea;
import org.optum.uhg.dto.d5427dt1.HostVariables;
import org.optum.uhg.dto.d5427dt1.DcladjdClmhstDenormRef;
import org.optum.uhg.dto.d5427dt1.Num15;
import org.optum.uhg.dto.d5427dt1.Dt1ReqContainer;
import org.optum.uhg.dto.d5427dt1.IPicstr;
import org.optum.uhg.dto.d5427dt1.QueryFilterGetNext;
import org.optum.uhg.dto.d5427dt1.DcladjdClmsfRef;
import org.optum.uhg.dto.d5427dt1.QueryFilterDlgtCrit5;
import org.optum.uhg.dto.d5427dt1.SrpSortRequestParameters;
import org.optum.uhg.dto.d5427dt1.ClaimKey;
import org.optum.uhg.dto.d5427dt1.QueryBaseMainSql;
import org.optum.uhg.dto.d5427dt1.OPicstr;
import org.optum.uhg.dto.d5427dt1.Db2ErrMsg;
import org.optum.uhg.dto.d5427dt1.FormattedDateGroup;
import org.optum.uhg.dto.d5427dt1.QueryFilterServiceDates;
import org.optum.uhg.dto.d5427dt1.Chrdate;
import org.optum.uhg.dto.d5427dt1.QueryFilterFln;
import org.optum.uhg.dto.d5427dt1.QueryFilterSvcSql;
import org.optum.uhg.dto.d5427dt1.StandardVars;
import org.optum.uhg.dto.d5427dt1.StsContainer;
import org.optum.uhg.dto.d5427dt1.NextKey;
import org.optum.uhg.dto.d5427dt1.HvaClmHistArray;
import org.optum.uhg.dto.d5427dt1.Dt1ClmContainer;
import org.optum.uhg.dto.d5427dt1.Num3;
import org.optum.uhg.dto.d5427dt1.QueryFilterAuthCrit5;
import org.optum.uhg.dto.d5427dt1.HoldArea;
import org.optum.uhg.dto.d5427dt1.QueryFilterOff;
import org.optum.uhg.dto.d5427dt1.Sqlca;
import org.optum.uhg.dto.d5427dt1.LilianGroup;
import org.optum.uhg.dto.d5427dt1.Dt1RspContainer;
import org.optum.uhg.dto.d5427dt1.Dt1SrtContainer;
import org.optum.uhg.dto.d5427dt1.DateXGroup;
import org.optum.uhg.dto.d5427dt1.TimeXGroup;
import org.optum.uhg.dto.d5427dt1.LastBitXGroup;
import org.optum.uhg.dto.d5427dt1.DsmCallArea;
import org.optum.uhg.dto.d5427dt1.Dt1ClaimKeyTable;
import org.optum.uhg.dto.d5427dt1.Sqlda;
import org.optum.uhg.dto.d5427dt1.Work;
import org.optum.uhg.common.CONSTANTS;
import org.optum.uhg.common.SQLS;
  import com.cloudframe.app.dao.Db2Base;
import java.sql.SQLException;
  
  @Component("d5427dt1")
  
  public class D5427dt1Impl extends CommonProcess implements D5427dt1 {
  
  Logger logger = LoggerFactory.getLogger(D5427dt1Impl.class);
  
  
  @Value("${timeZoneId:America/New_York}")
  private String timeZoneId;
  @Value("${D5427DT1.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2Base")
  Db2Base db2Base;
  @Autowired 
  @Qualifier("d5427dt1Repository")
  D5427dt1Repository d5427dt1Repository;
  @Autowired 
  @Qualifier("vp776a00")
  Vp776a00 vp776a00;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(D5427dt1Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("D5427DT1" ,dbQualifier, true/*use Dynamic SQL*/);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
//  PERFORM 0000-MAINLINE
          mainline(programCtx.getMainlineInCtx());/*0000-MAINLINE SECTION*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
          exit(programCtx);/*0000-EXIT*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
		handleDbAtEnd(db2Base); 
      

      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE SECTION COBOL Cyclomatic complexity - 13
      * Input  :  

      * - stsRespCode                    COBOL Name: STS-RESP-CODE
      * - dt1ReqSearchType               COBOL Name: DT1-REQ-SEARCH-TYPE
      * - dt1SrtItemCnt                  COBOL Name: DT1-SRT-ITEM-CNT
      * - totalRowsRetrieved             COBOL Name: TOTAL-ROWS-RETRIEVED
      *
      * Output :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      * - dt1RspExplanationCode          COBOL Name: DT1-RSP-EXPLANATION-CODE
      * - dt1RspRespCode                 COBOL Name: DT1-RSP-RESP-CODE
      * - dt1RspErrSection               COBOL Name: DT1-RSP-ERR-SECTION
      * - dt1RspClmContainerItemLen      COBOL Name: DT1-RSP-CLM-CONTAINER-ITEM-LEN
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
//  PERFORM 0100-FFII-INITIALIZATION-SECT
          ffiiInitializationSect(programCtx.getFfiiInitializationSectInCtx());/*0100-FFII-INITIALIZATION-SECT SECTION*/

// * Skip main process if any error

// *  5 Types of requests (1, 4, 5, 6, 7)
//  IF STS-RESP-CODE-OK
          if ( methodIn.isStsRespCodeOk()  ) { 
//  EVALUATE TRUE
              if  ( methodIn.isDt1ReqSearchIcnOnly()  ) { 
//  PERFORM 1000-SEARCH-ICN-ONLY-SECT
                  searchIcnOnlySect(programCtx.getSearchIcnOnlySectInCtx());/*1000-SEARCH-ICN-ONLY-SECT SECTION*/
              }
              else if  ( methodIn.isDt1ReqSearchMemberPlus()  ) { 
//  PERFORM 4000-SEARCH-MEMBER-PLUS-SECT
                  searchMemberPlusSect(programCtx.getSearchMemberPlusSectInCtx());/*4000-SEARCH-MEMBER-PLUS-SECT SECTION*/
              }
              else if  (( methodIn.isDt1ReqSearchMbrAuthNbr()  ) || ( methodIn.isDt1ReqSearchAuthsOnly()  )) { 
//  PERFORM 6200-PROC-DYN-CURSOR-SECT
                  procDynCursorSect(programCtx.getProcDynCursorSectInCtx());/*6200-PROC-DYN-CURSOR-SECT SECTION*/
              }
              else if  ( methodIn.isDt1ReqSearchCategory()  ) { 
//  PERFORM 6200-PROC-DYN-CURSOR-SECT
                  procDynCursorSect(programCtx.getProcDynCursorSectInCtx());/*6200-PROC-DYN-CURSOR-SECT SECTION*/
              }
              else   { 
//  SET DT1-RSP-FAILED-SEE-EXP-CODE TO TRUE
                  methodOut.setDt1RspFailedSeeExpCodeTrue(); 
                  
//  SET DT1-RSP-SEE-PARMS-FOR-MORE-INF TO TRUE
                  methodOut.setDt1RspSeeParmsForMoreInfTrue(); 
                  
//  SET DT1-RSP-INVALID-REQUEST TO TRUE
                  methodOut.setDt1RspInvalidRequestTrue(); 
                  
//  MOVE 'MAINLINE' TO DT1-RSP-ERR-SECTION
//  LITERAL_MAINLINE = 'MAINLINE'
                  methodOut.setDt1RspErrSection(CONSTANTS.LITERAL_MAINLINE);
              }

// * Skip sort process if any error or no more than 1 item
//  IF STS-RESP-CODE-OK
              if ( methodIn.isStsRespCodeOk()  ) { 
//  IF DT1-SRT-ITEM-CNT > 1
//  LITERAL_1 = 1
                  if (	( methodIn.getDt1SrtItemCnt() > 1 )) { 
//  PERFORM 8000-SORT-DT1SRT-SECT
                      sortDt1srtSect(programCtx.getSortDt1srtSectInCtx());/*8000-SORT-DT1SRT-SECT SECTION*/
                  }
              }
          }
//  IF STS-RESP-CODE-OK
          if ( methodIn.isStsRespCodeOk()  ) { 
//  PERFORM 8100-PUT-D5427DT1-SRT-SECT
              putD5427dt1SrtSect(programCtx.getPutD5427dt1SrtSectInCtx());/*8100-PUT-D5427DT1-SRT-SECT SECTION*/
          }
//  IF STS-RESP-CODE-OK
          if ( methodIn.isStsRespCodeOk()  ) { 
//  IF TOTAL-ROWS-RETRIEVED = ZERO
              if (	( methodIn.getTotalRowsRetrieved() == 0 )) { 
//  SET DT1-RSP-FAILED-SEE-EXP-CODE TO TRUE
                  methodOut.setDt1RspFailedSeeExpCodeTrue(); 
                  
//  SET DT1-RSP-SEE-VIEW-FOR-MORE-INFO TO TRUE
                  methodOut.setDt1RspSeeViewForMoreInfoTrue(); 
                  
//  SET DT1-RSP-NO-CLAIMS-FOUND TO TRUE
                  methodOut.setDt1RspNoClaimsFoundTrue(); 
                  
              }
          }
//  MOVE LENGTH OF DT1-CLM-CLAIM-ITEM (1) TO DT1-RSP-CLM-CONTAINER-ITEM-LEN
          methodOut.setDt1RspClmContainerItemLen(Dt1ClmClaimItem.getDt1ClmClaimItemFieldLength());
//  PERFORM 8130-PUT-D5427DT1-RSP-SECT
          putD5427dt1RspSect(programCtx.getPutD5427dt1RspSectInCtx());/*8130-PUT-D5427DT1-RSP-SECT SECTION*/
      
      return methodOut;
      }
      /**
      * exit 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-EXIT COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void exit(D5427dt1Ctx programCtx) throws Exception {
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * ffiiInitializationSect 
      *   This method is derived from 
  *   COBOL Paragraph - 0100-FFII-INITIALIZATION-SECT SECTION COBOL Cyclomatic complexity - 11
      * Input  :  

      * - thisProgram                    COBOL Name: THIS-PROGRAM
      * - dt1ReqContainerName            COBOL Name: DT1-REQ-CONTAINER-NAME
      * - dt1ReqClmItemsRequested        COBOL Name: DT1-REQ-CLM-ITEMS-REQUESTED
      * - maxClaimsDefault               COBOL Name: MAX-CLAIMS-DEFAULT
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      *
      * Output :  

      * - sysVariables                   COBOL Name: SYS-VARIABLES
      * - cicsresp                       COBOL Name: CICSRESP
      * - cicsresp2                      COBOL Name: CICSRESP2
      * - asnVariables                   COBOL Name: ASN-VARIABLES
      * - dt1RspContainer                COBOL Name: DT1-RSP-CONTAINER
      * - dt1RspFillerArea               COBOL Name: DT1-RSP-FILLER-AREA
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      * - dt1RspExplanationCode          COBOL Name: DT1-RSP-EXPLANATION-CODE
      * - dt1RspRespCode                 COBOL Name: DT1-RSP-RESP-CODE
      * - dt1ClaimKeyCnt                 COBOL Name: DT1-CLAIM-KEY-CNT
      * - stsRespProgramName             COBOL Name: STS-RESP-PROGRAM-NAME
      * - thisProgram                    COBOL Name: THIS-PROGRAM
      * - stsRespCode                    COBOL Name: STS-RESP-CODE
      * - stsFixedArea                   COBOL Name: STS-FIXED-AREA
      * - currentContainerName           COBOL Name: CURRENT-CONTAINER-NAME
      * - dt1ReqContainerName            COBOL Name: DT1-REQ-CONTAINER-NAME
      * - dt1ReqContainerLength          COBOL Name: DT1-REQ-CONTAINER-LENGTH
      * - currentContainerLength         COBOL Name: CURRENT-CONTAINER-LENGTH
      * - stsResponseVars                COBOL Name: STS-RESPONSE-VARS
      * - dt1RspErrSection               COBOL Name: DT1-RSP-ERR-SECTION
      * - stsCicsresp                    COBOL Name: STS-CICSRESP
      * - stsCicsresp2                   COBOL Name: STS-CICSRESP2
      * - stsEibtaskn                    COBOL Name: STS-EIBTASKN
      * - stsRespMessageType             COBOL Name: STS-RESP-MESSAGE-TYPE
      * - stsRespAdditionalInfo1         COBOL Name: STS-RESP-ADDITIONAL-INFO-1
      * - maxClaimsRequested             COBOL Name: MAX-CLAIMS-REQUESTED
      * - dt1ReqClmItemsRequested        COBOL Name: DT1-REQ-CLM-ITEMS-REQUESTED
      * - d5427dt1MaxClaims              COBOL Name: D5427DT1-MAX-CLAIMS
      * - maxClaimsDefault               COBOL Name: MAX-CLAIMS-DEFAULT
      * - nextKey                        COBOL Name: NEXT-KEY
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - nextHeaderCt                   COBOL Name: NEXT-HEADER-CT
      * - headerCt                       COBOL Name: WS-HEADER-CT
      *
      * @throws CFException
      */
      @Override
      public FfiiInitializationSectOutCtx ffiiInitializationSect(FfiiInitializationSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81 0100-Ffii-initialization-sect                                *
// *81                                                              *
// *81 business function:                                           *
// *81 setup for ff ii interface / get request containers, etc.     *
// *82***************************************************************
// *82 called by :  0000-mainline                                   *
// *82 calls     :  8010-get-clm-cont-stg-sect                      *
// *82           :  0110-init-host-variables-sect                   *
// *82***************************************************************
// *================================================================

// * Get cics system information

// *EXEC CICS INQUIRE SYSTEM CICSSTATUS  (SYS-CVDA-CICSSTATUS)
// *                         INITSTATUS  (SYS-CVDA-INITSTATUS)
// *                         DB2CONN     (SYS-DB2CONN)
// *                         JOBNAME     (SYS-JOBNAME)
// *                         MQCONN      (SYS-MQCONN)
// *                         STARTUPDATE (SYS-STARTUPDATE)
// *                         NOHANDLE
// *                         RESP        (CICSRESP)
// *                         RESP2       (CICSRESP2)
// *END-EXEC
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
FfiiInitializationSectOutCtx methodOut = methodIn.getFfiiInitializationSectOutCtx();
//  INITIALIZE SYS-VARIABLES
          methodOut.getSysVariables().initialize();
//  INQUIRE SYSTEM CICSSTATUS (SYS-CVDA-CICSSTATUS) INITSTATUS (SYS-CVDA-INITSTATUS) DB2CONN (SYS-DB2CONN) JOBNAME (SYS-JOBNAME) MQCONN (SYS-MQCONN) STARTUPDATE (SYS-STARTUPDATE) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // INQUIRE SYSTEM CICSSTATUS (SYS-CVDA-CICSSTATUS) INITSTATUS (SYS-CVDA-INITSTATUS) DB2CONN (SYS-DB2CONN) JOBNAME (SYS-JOBNAME) MQCONN (SYS-MQCONN) STARTUPDATE (SYS-STARTUPDATE) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // inquire system attribute
          	      methodIn.setSysCvdaCicsstatus(TransactionManager.inquireStatus(programCtx.getCicsSession()));
//  MOVE EIBRESP TO CICSRESP
          methodOut.setCicsresp(programCtx.getCicsSession().getEibresp());
//  MOVE EIBRESP2 TO CICSRESP2
          methodOut.setCicsresp2(programCtx.getCicsSession().getEibresp2());

// * Get application parmeters

// *EXEC CICS ASSIGN INVOKINGPROG (ASN-INVOKINGPROG)
// *                 PROGRAM      (ASN-PROGRAM)
// *                 CHANNEL      (CURRENT-CHANNEL-NAME)
// *                 APPLID       (ASN-APPLID)
// *                 SYSID        (ASN-SYSID)
// *                 NOHANDLE
// *                 RESP         (CICSRESP)
// *                 RESP2        (CICSRESP2)
// *END-EXEC
//  INITIALIZE ASN-VARIABLES
          methodOut.getAsnVariables().initialize();
//  ASSIGN INVOKINGPROG (ASN-INVOKINGPROG) PROGRAM (ASN-PROGRAM) CHANNEL (CURRENT-CHANNEL-NAME) APPLID (ASN-APPLID) SYSID (ASN-SYSID) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // ASSIGN INVOKINGPROG (ASN-INVOKINGPROG) PROGRAM (ASN-PROGRAM) CHANNEL (CURRENT-CHANNEL-NAME) APPLID (ASN-APPLID) SYSID (ASN-SYSID) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // ASSIGN various attributes
//  MOVE EIBRESP TO CICSRESP
          methodOut.setCicsresp(programCtx.getCicsSession().getEibresp());
//  MOVE EIBRESP2 TO CICSRESP2
          methodOut.setCicsresp2(programCtx.getCicsSession().getEibresp2());

// * Initialize static response areas
//  INITIALIZE DT1-RSP-CONTAINER
          methodOut.getDt1RspContainer().initialize();
//  MOVE SPACE TO DT1-RSP-FILLER-AREA
          methodOut.setDt1RspFillerArea(CONSTANTS.SPACE_154);
//  SET DT1-RSP-OK TO TRUE
          methodOut.setDt1RspOkTrue(); 
          
//  SET DT1-RSP-EXPL-OK TO TRUE
          methodOut.setDt1RspExplOkTrue(); 
          
//  SET DT1-RSP-GOOD-RETURN TO TRUE
          methodOut.setDt1RspGoodReturnTrue(); 
          
//  MOVE ZERO TO DT1-CLAIM-KEY-CNT
          methodOut.setDt1ClaimKeyCnt(0);
//  MOVE THIS-PROGRAM TO STS-RESP-PROGRAM-NAME
          methodOut.setStsRespProgramName(methodOut.getThisProgram());
//  SET STS-RESP-CODE-OK TO TRUE
          methodOut.setStsRespCodeOkTrue(); 
          
//  INITIALIZE STS-FIXED-AREA
          methodOut.getStsFixedArea().initialize();
//  SET STS-RESP-CODE-OK TO TRUE
          methodOut.setStsRespCodeOkTrue(); 
          

// * Check that request container exists
//  MOVE DT1-REQ-CONTAINER-NAME TO CURRENT-CONTAINER-NAME
          methodOut.setCurrentContainerName(methodOut.getDt1ReqContainerName());
//  MOVE ZERO TO DT1-REQ-CONTAINER-LENGTH
          methodOut.setDt1ReqContainerLength(0);
//  MOVE DT1-REQ-CONTAINER-LENGTH TO CURRENT-CONTAINER-LENGTH
          methodOut.setCurrentContainerLength(methodOut.getDt1ReqContainerLength());
//  GET CONTAINER (CURRENT-CONTAINER-NAME) FLENGTH (CURRENT-CONTAINER-LENGTH) NODATA NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // GET CONTAINER (CURRENT-CONTAINER-NAME) FLENGTH (CURRENT-CONTAINER-LENGTH) NODATA NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // get data from a container
          	 if(programCtx.getGlobalCtx().containerExists(String.valueOf(methodOut.getCurrentContainerName()).trim())) {
          	 	methodOut.setCurrentContainerLength(programCtx.getGlobalCtx().fetchContainer(String.valueOf(methodOut.getCurrentContainerName()).trim()).length);
          	 } else {
          	 }
//  MOVE EIBRESP TO CICSRESP
          methodOut.setCicsresp(programCtx.getCicsSession().getEibresp());
//  MOVE EIBRESP2 TO CICSRESP2
          methodOut.setCicsresp2(programCtx.getCicsSession().getEibresp2());

// * Dfhresp(normal) = 0                       inserted by translator

// * Dfhresp(normal) = 0                       inserted by translator
//  IF ( CICSRESP = 0 AND CICSRESP2 = 0 )
          if ((	( methodOut.getCicsresp() == 0 ) && 	( methodOut.getCicsresp2() == 0 ))) { 
//  IF CURRENT-CONTAINER-LENGTH > ZERO
              if (	( methodOut.getCurrentContainerLength() > 0 )) { 
//  GET CONTAINER (CURRENT-CONTAINER-NAME) FLENGTH (CURRENT-CONTAINER-LENGTH) SET (ADDRESS OF DT1-REQ-CONTAINER) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
                  // GET CONTAINER (CURRENT-CONTAINER-NAME) FLENGTH (CURRENT-CONTAINER-LENGTH) SET (ADDRESS OF DT1-REQ-CONTAINER) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
                  // get data from a container
                  	if(programCtx.getGlobalCtx().containerExists(String.valueOf(methodOut.getCurrentContainerName()).trim())) {
                  		methodIn.getDt1ReqContainer().setString(programCtx.getGlobalCtx().fetchContainer(String.valueOf(methodOut.getCurrentContainerName()).trim()));
                       } else {
                       }
//  MOVE EIBRESP TO CICSRESP
                  methodOut.setCicsresp(programCtx.getCicsSession().getEibresp());
//  MOVE EIBRESP2 TO CICSRESP2
                  methodOut.setCicsresp2(programCtx.getCicsSession().getEibresp2());

// * Dfhresp(normal) = 0                       inserted by translator

// * Dfhresp(normal) = 0                       inserted by translator
//  IF ( CICSRESP = 0 AND CICSRESP2 = 0 )
//  ELSE
                  if ((	( methodOut.getCicsresp() != 0 ) || 	( methodOut.getCicsresp2() != 0 ))) { 
//  INITIALIZE STS-RESPONSE-VARS
                      methodOut.getStsResponseVars().initialize();
//  SET DT1-RSP-FAIL TO TRUE
                      methodOut.setDt1RspFailTrue(); 
                      
//  SET DT1-RSP-SEE-VIEW-FOR-MORE-INFO TO TRUE
                      methodOut.setDt1RspSeeViewForMoreInfoTrue(); 
                      
//  SET STS-RESP-CODE-GET-ERROR TO TRUE
                      methodOut.setStsRespCodeGetErrorTrue(); 
                      
//  MOVE STS-RESP-CODE TO DT1-RSP-RESP-CODE
                      methodOut.setDt1RspRespCode(padLeftZeros(4,methodOut.getStsRespCode(),false));
//  MOVE '0100-I1' TO DT1-RSP-ERR-SECTION
                      methodOut.setDt1RspErrSection(CONSTANTS.LITERAL_0100_MN_I1_B_);
                      // MOVE CICSRESP TO STS-CICSRESP
                      methodOut.setStsCicsresp(methodOut.getCicsresp());
                      // MOVE CICSRESP2 TO STS-CICSRESP2
                      methodOut.setStsCicsresp2(methodOut.getCicsresp2());
//  MOVE EIBTASKN TO STS-EIBTASKN
                      methodOut.setStsEibtaskn(programCtx.getCicsSession().getEibtaskn());
//  SET STS-RESP-MESSAGE-CICS TO TRUE
                      methodOut.setStsRespMessageCicsTrue(); 
                      
//  MOVE 'D5427DT1-REQ; CICS GET CONTAINER-DATA ERROR' TO STS-RESP-ADDITIONAL-INFO-1
                      methodOut.setStsRespAdditionalInfo1(CONSTANTS.LITERAL_526186284);
                  }
              }
//  ELSE
              else { 
//  INITIALIZE STS-RESPONSE-VARS
                  methodOut.getStsResponseVars().initialize();
//  SET DT1-RSP-FAIL TO TRUE
                  methodOut.setDt1RspFailTrue(); 
                  
//  SET DT1-RSP-SEE-VIEW-FOR-MORE-INFO TO TRUE
                  methodOut.setDt1RspSeeViewForMoreInfoTrue(); 
                  
//  SET STS-RESP-CODE-NULLCONT TO TRUE
                  methodOut.setStsRespCodeNullcontTrue(); 
                  
//  MOVE STS-RESP-CODE TO DT1-RSP-RESP-CODE
                  methodOut.setDt1RspRespCode(padLeftZeros(4,methodOut.getStsRespCode(),false));
//  MOVE '0100-I2' TO DT1-RSP-ERR-SECTION
                  methodOut.setDt1RspErrSection(CONSTANTS.LITERAL_0100_MN_I2_B_);
                  // MOVE CICSRESP TO STS-CICSRESP
                  methodOut.setStsCicsresp(methodOut.getCicsresp());
                  // MOVE CICSRESP2 TO STS-CICSRESP2
                  methodOut.setStsCicsresp2(methodOut.getCicsresp2());
//  MOVE EIBTASKN TO STS-EIBTASKN
                  methodOut.setStsEibtaskn(programCtx.getCicsSession().getEibtaskn());
//  SET STS-RESP-MESSAGE-CICS TO TRUE
                  methodOut.setStsRespMessageCicsTrue(); 
                  
//  MOVE 'D5427DT1-REQ; CONTAINER LENGTH IS ZERO' TO STS-RESP-ADDITIONAL-INFO-1
                  methodOut.setStsRespAdditionalInfo1(CONSTANTS.LITERAL_1529577179);
              }
          }
//  ELSE
          else { 
//  INITIALIZE STS-RESPONSE-VARS
              methodOut.getStsResponseVars().initialize();
//  SET DT1-RSP-FAIL TO TRUE
              methodOut.setDt1RspFailTrue(); 
              
//  SET DT1-RSP-SEE-VIEW-FOR-MORE-INFO TO TRUE
              methodOut.setDt1RspSeeViewForMoreInfoTrue(); 
              
//  SET STS-RESP-CODE-GET-ERROR TO TRUE
              methodOut.setStsRespCodeGetErrorTrue(); 
              
//  MOVE STS-RESP-CODE TO DT1-RSP-RESP-CODE
              methodOut.setDt1RspRespCode(padLeftZeros(4,methodOut.getStsRespCode(),false));
//  MOVE '0100-I3' TO DT1-RSP-ERR-SECTION
              methodOut.setDt1RspErrSection(CONSTANTS.LITERAL_0100_MN_I3_B_);
              // MOVE CICSRESP TO STS-CICSRESP
              methodOut.setStsCicsresp(methodOut.getCicsresp());
              // MOVE CICSRESP2 TO STS-CICSRESP2
              methodOut.setStsCicsresp2(methodOut.getCicsresp2());
//  MOVE EIBTASKN TO STS-EIBTASKN
              methodOut.setStsEibtaskn(programCtx.getCicsSession().getEibtaskn());
//  SET STS-RESP-MESSAGE-CICS TO TRUE
              methodOut.setStsRespMessageCicsTrue(); 
              
//  MOVE 'D5427DT1-REQ; CICS GET CONTAINER-NODATA ERROR' TO STS-RESP-ADDITIONAL-INFO-1
              methodOut.setStsRespAdditionalInfo1(CONSTANTS.LITERAL_1940538157);
          }
//  IF STS-RESP-CODE-OK
          if ( methodOut.isStsRespCodeOk()  ) { 
//  PERFORM 8010-GET-CLM-CONT-STG-SECT
              getClmContStgSect(programCtx.getGetClmContStgSectInCtx());/*8010-GET-CLM-CONT-STG-SECT SECTION*/
          }

// * Set maximum rows based on request or default
//  IF DT1-REQ-CLM-ITEMS-REQUESTED NUMERIC AND DT1-REQ-CLM-ITEMS-REQUESTED <= MAX-CLAIMS-DEFAULT
          if (    isNumeric(methodOut.getDt1ReqClmItemsRequested()) && compareChars(methodOut.getDt1ReqClmItemsRequested(),String.valueOf(methodOut.getMaxClaimsDefaultString()).toCharArray()) <= 0) { 
              // MOVE DT1-REQ-CLM-ITEMS-REQUESTED TO MAX-CLAIMS-REQUESTED
              methodOut.setMaxClaimsRequested(padLeftZeros(5,methodOut.getDt1ReqClmItemsRequested(),false));
              // MOVE MAX-CLAIMS-REQUESTED TO D5427DT1-MAX-CLAIMS
              methodOut.setD5427dt1MaxClaims((int)methodOut.getMaxClaimsRequested());
          }
//  ELSE
          else { 
              // MOVE MAX-CLAIMS-DEFAULT TO D5427DT1-MAX-CLAIMS
              methodOut.setD5427dt1MaxClaims((int)methodOut.getMaxClaimsDefault());
          }
//  PERFORM 0110-INIT-HOST-VARIABLES-SECT
          initHostVariablesSect(programCtx.getInitHostVariablesSectInCtx());/*0110-INIT-HOST-VARIABLES-SECT SECTION*/
//  IF DT1-REQ-START-AT-TOP
//  ELSE
          if (!(methodIn.isDt1ReqStartAtTop()) ) { 
//  MOVE DT1-REQ-NEXT-KEY TO NEXT-KEY
              methodOut.getNextKey().setString(methodOut.getDt1ReqNextKey());
//  IF NEXT-HEADER-CT NUMERIC
              if (        methodOut.getNextKey().nextHeaderCtIsNumeric() ) { 
                  methodOut.setHeaderCt((short) (methodOut.getNextHeaderCt() - 1));
              }
          }
      
      return methodOut;
      }
      /**
      * initHostVariablesSect 
      *   This method is derived from 
  *   COBOL Paragraph - 0110-INIT-HOST-VARIABLES-SECT SECTION COBOL Cyclomatic complexity - 66
      * Input  :  

      * - dt1ReqFilmOffice               COBOL Name: DT1-REQ-FILM-OFFICE
      * - dt1ReqFln                      COBOL Name: DT1-REQ-FLN
      * - dt1ReqIcn                      COBOL Name: DT1-REQ-ICN
      * - dt1ReqFirstServiceDate         COBOL Name: DT1-REQ-FIRST-SERVICE-DATE
      * - dt1ReqLastServiceDate          COBOL Name: DT1-REQ-LAST-SERVICE-DATE
      * - dt1ReqProviderTin              COBOL Name: DT1-REQ-PROVIDER-TIN
      * - dt1ReqAuthNbr                  COBOL Name: DT1-REQ-AUTH-NBR
      * - dt1ReqServiceCategory          COBOL Name: DT1-REQ-SERVICE-CATEGORY
      * - dt1ReqCptFrom                  COBOL Name: DT1-REQ-CPT-FROM
      * - dt1ReqCptThru                  COBOL Name: DT1-REQ-CPT-THRU
      * - dt1ReqRevFrom                  COBOL Name: DT1-REQ-REV-FROM
      * - dt1ReqRevThru                  COBOL Name: DT1-REQ-REV-THRU
      * - dt1ReqRemarkCd                 COBOL Name: DT1-REQ-REMARK-CD
      * - dt1ReqProvSpclCd               COBOL Name: DT1-REQ-PROV-SPCL-CD
      * - dt1ReqCauseCd                  COBOL Name: DT1-REQ-CAUSE-CD
      * - dt1ReqAppliedToOopInd          COBOL Name: DT1-REQ-APPLIED-TO-OOP-IND
      *
      * Output :  

      * - hvFilmOfcNbr                   COBOL Name: HV-FILM-OFC-NBR
      * - dt1ReqFilmOffice               COBOL Name: DT1-REQ-FILM-OFFICE
      * - hvFlnJulianDtNbr               COBOL Name: HV-FLN-JULIAN-DT-NBR
      * - dt1ReqFln                      COBOL Name: DT1-REQ-FLN
      * - hvFlnSrlNbr                    COBOL Name: HV-FLN-SRL-NBR
      * - hvInvnCtlNbr                   COBOL Name: HV-INVN-CTL-NBR
      * - dt1ReqIcn                      COBOL Name: DT1-REQ-ICN
      * - hvFstDt                        COBOL Name: HV-FST-DT
      * - dt1ReqFirstServiceDate         COBOL Name: DT1-REQ-FIRST-SERVICE-DATE
      * - hvLstSrvcDt                    COBOL Name: HV-LST-SRVC-DT
      * - dt1ReqLastServiceDate          COBOL Name: DT1-REQ-LAST-SERVICE-DATE
      * - hvProvTinsuff                  COBOL Name: HV-PROV-TINSUFF
      * - hvProvTinsuff1                 COBOL Name: HV-PROV-TINSUFF1
      * - dt1ReqProviderTin              COBOL Name: DT1-REQ-PROVIDER-TIN
      * - hvAuthNbr                      COBOL Name: HV-AUTH-NBR
      * - hvExtrNtfyNbr                  COBOL Name: HV-EXTR-NTFY-NBR
      * - dt1ReqAuthNbr                  COBOL Name: DT1-REQ-AUTH-NBR
      * - hvSrvcCatgyCd                  COBOL Name: HV-SRVC-CATGY-CD
      * - dt1ReqServiceCategory          COBOL Name: DT1-REQ-SERVICE-CATEGORY
      * - hvSpiCtgyCd1                   COBOL Name: HV-SPI-CTGY-CD-1
      * - hvSpiCtgyCd2                   COBOL Name: HV-SPI-CTGY-CD-2
      * - hvSpiCtgyCd3                   COBOL Name: HV-SPI-CTGY-CD-3
      * - hvSpiCtgyCd4                   COBOL Name: HV-SPI-CTGY-CD-4
      * - hvSpiCtgyCd5                   COBOL Name: HV-SPI-CTGY-CD-5
      * - hvCptFrom                      COBOL Name: HV-CPT-FROM
      * - dt1ReqCptFrom                  COBOL Name: DT1-REQ-CPT-FROM
      * - hvCptThru                      COBOL Name: HV-CPT-THRU
      * - dt1ReqCptThru                  COBOL Name: DT1-REQ-CPT-THRU
      * - hvRevFrom                      COBOL Name: HV-REV-FROM
      * - dt1ReqRevFrom                  COBOL Name: DT1-REQ-REV-FROM
      * - hvRevThru                      COBOL Name: HV-REV-THRU
      * - dt1ReqRevThru                  COBOL Name: DT1-REQ-REV-THRU
      * - hvRemarkCd1                    COBOL Name: HV-REMARK-CD1
      * - hvRemarkCd2                    COBOL Name: HV-REMARK-CD2
      * - dt1ReqRemarkCd                 COBOL Name: DT1-REQ-REMARK-CD
      * - hvProvSpclCd1                  COBOL Name: HV-PROV-SPCL-CD1
      * - hvProvSpclCd2                  COBOL Name: HV-PROV-SPCL-CD2
      * - dt1ReqProvSpclCd               COBOL Name: DT1-REQ-PROV-SPCL-CD
      * - hvCauseCd1                     COBOL Name: HV-CAUSE-CD1
      * - hvCauseCd2                     COBOL Name: HV-CAUSE-CD2
      * - dt1ReqCauseCd                  COBOL Name: DT1-REQ-CAUSE-CD
      * - hvAppliedToOopInd              COBOL Name: HV-APPLIED-TO-OOP-IND
      * - dt1ReqAppliedToOopInd          COBOL Name: DT1-REQ-APPLIED-TO-OOP-IND
      * - queryFilterInd                 COBOL Name: QUERY-FILTER-IND
      *
      * @throws CFException
      */
      @Override
      public InitHostVariablesSectOutCtx initHostVariablesSect(InitHostVariablesSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  0110-Init-host-variables-sect                               *
// *81                                                              *
// *81  business function: set host variables to request or default *
// *81                     determine if init query or next-key pass *
// *82***************************************************************
// *82  called by : 0100-ffii-initialization-sect                   *
// *82  calls     : none                                            *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
InitHostVariablesSectOutCtx methodOut = methodIn.getInitHostVariablesSectOutCtx();
          // MOVE '0000' TO HV-FILM-OFC-NBR
          //  LITERAL_0000 = '0000'
          methodOut.setHvFilmOfcNbr(CONSTANTS.LITERAL_0000);
//  IF DT1-REQ-FILM-OFFICE = '000'
//  LITERAL_000 = '000'
//  ELSE
          if (compareChars(methodIn.getDt1RequestArea().getDt1ReqFilmOfficeString(),CONSTANTS.LITERAL_000) != 0) { 
//  MOVE DT1-REQ-FILM-OFFICE (1 : 3) TO HV-FILM-OFC-NBR (2 : 3)
              methodOut.setHvFilmOfcNbr(replace(methodOut.getHvFilmOfcNbr(),String.valueOf(substring(methodOut.getDt1ReqFilmOfficeString(),0,3)).toCharArray(),1,4));
          }
//  MOVE DT1-REQ-FLN (1 : 5) TO HV-FLN-JULIAN-DT-NBR
          methodOut.setHvFlnJulianDtNbr(String.valueOf(substring(methodOut.getDt1ReqFlnString(),0,5)).toCharArray());
//  MOVE DT1-REQ-FLN (6 : 5) TO HV-FLN-SRL-NBR
          methodOut.setHvFlnSrlNbr(String.valueOf(substring(methodOut.getDt1ReqFlnString(),5,10)).toCharArray());
//  MOVE DT1-REQ-ICN TO HV-INVN-CTL-NBR
          methodOut.setHvInvnCtlNbr(methodOut.getDt1ReqIcn());
//  IF DT1-REQ-FIRST-SERVICE-DATE = ZERO
          if (	( methodOut.getDt1ReqFirstServiceDate() == 0 ) ) { 
//  MOVE '0001-01-01' TO HV-FST-DT
//  LITERAL_0001_MN2_0101 = '0001-01-01'
              methodOut.setHvFstDt(CONSTANTS.LITERAL_0001_MN2_0101);
          }
//  ELSE
          else { 
//  MOVE ALL '-' TO HV-FST-DT
              methodOut.setHvFstDt(CONSTANTS.LITERAL_MN10_);
//  MOVE DT1-REQ-FIRST-SERVICE-DATE (1 : 4) TO HV-FST-DT (1 : 4)
              methodOut.setHvFstDt(replace(methodOut.getHvFstDt(),String.valueOf(substring(methodOut.getDt1ReqFirstServiceDateString(),0,4)).toCharArray(),0,4));
//  MOVE DT1-REQ-FIRST-SERVICE-DATE (5 : 2) TO HV-FST-DT (6 : 2)
              methodOut.setHvFstDt(replace(methodOut.getHvFstDt(),String.valueOf(substring(methodOut.getDt1ReqFirstServiceDateString(),4,6)).toCharArray(),5,7));
//  MOVE DT1-REQ-FIRST-SERVICE-DATE (7 : 2) TO HV-FST-DT (9 : 2)
              methodOut.setHvFstDt(replace(methodOut.getHvFstDt(),String.valueOf(substring(methodOut.getDt1ReqFirstServiceDateString(),6,8)).toCharArray(),8,10));
          }
//  IF DT1-REQ-LAST-SERVICE-DATE = 99999999
          if (	( methodOut.getDt1ReqLastServiceDate() == 99999999 ) ) { 
//  MOVE '9999-12-31' TO HV-LST-SRVC-DT
//  LITERAL_9999_MN2_1231 = '9999-12-31'
              methodOut.setHvLstSrvcDt(CONSTANTS.LITERAL_9999_MN2_1231);
          }
//  ELSE
          else { 
//  MOVE ALL '-' TO HV-LST-SRVC-DT
              methodOut.setHvLstSrvcDt(CONSTANTS.LITERAL_MN10_);
//  MOVE DT1-REQ-LAST-SERVICE-DATE (1 : 4) TO HV-LST-SRVC-DT (1 : 4)
              methodOut.setHvLstSrvcDt(replace(methodOut.getHvLstSrvcDt(),String.valueOf(substring(methodOut.getDt1ReqLastServiceDateString(),0,4)).toCharArray(),0,4));
//  MOVE DT1-REQ-LAST-SERVICE-DATE (5 : 2) TO HV-LST-SRVC-DT (6 : 2)
              methodOut.setHvLstSrvcDt(replace(methodOut.getHvLstSrvcDt(),String.valueOf(substring(methodOut.getDt1ReqLastServiceDateString(),4,6)).toCharArray(),5,7));
//  MOVE DT1-REQ-LAST-SERVICE-DATE (7 : 2) TO HV-LST-SRVC-DT (9 : 2)
              methodOut.setHvLstSrvcDt(replace(methodOut.getHvLstSrvcDt(),String.valueOf(substring(methodOut.getDt1ReqLastServiceDateString(),6,8)).toCharArray(),8,10));
          }
//  IF DT1-REQ-PROVIDER-TIN = '000000000'
//  LITERAL_000000000 = '000000000'
          if (compareChars(methodIn.getDt1RequestArea().getDt1ReqProviderTinString(),CONSTANTS.LITERAL_000000000) == 0) { 
              // MOVE '000000000000000' TO HV-PROV-TINSUFF
              //  LITERAL_000000000000000 = '000000000000000'
              methodOut.setHvProvTinsuff(CONSTANTS.LITERAL_000000000000000);
          }
//  ELSE
          else { 
//  MOVE DT1-REQ-PROVIDER-TIN (1 : 9) TO HV-PROV-TINSUFF (2 : 9) HV-PROV-TINSUFF1 (2 : 9)
              methodOut.setHvProvTinsuff(replace(methodOut.getHvProvTinsuff(),String.valueOf(substring(methodOut.getDt1ReqProviderTinString(),0,9)).toCharArray(),1,10));
              methodOut.setHvProvTinsuff1(replace(methodOut.getHvProvTinsuff1(),String.valueOf(substring(methodOut.getDt1ReqProviderTinString(),0,9)).toCharArray(),1,10));
          }
//  MOVE DT1-REQ-AUTH-NBR TO HV-AUTH-NBR HV-EXTR-NTFY-NBR
          methodOut.setHvAuthNbr(methodOut.getDt1ReqAuthNbr());
          methodOut.setHvExtrNtfyNbr(methodOut.getDt1ReqAuthNbr());
//  MOVE DT1-REQ-SERVICE-CATEGORY TO HV-SRVC-CATGY-CD
          methodOut.setHvSrvcCatgyCd(methodOut.getDt1ReqServiceCategory());
//  MOVE FUNCTION UPPER-CASE ( DT1-REQ-SPI-CATEGORY-CD (1) ) TO HV-SPI-CTGY-CD-1
          methodOut.setHvSpiCtgyCd1(upperCase(methodIn.getDt1ReqSpiCategoryCd(0)));
//  MOVE FUNCTION UPPER-CASE ( DT1-REQ-SPI-CATEGORY-CD (2) ) TO HV-SPI-CTGY-CD-2
          methodOut.setHvSpiCtgyCd2(upperCase(methodIn.getDt1ReqSpiCategoryCd(1)));
//  MOVE FUNCTION UPPER-CASE ( DT1-REQ-SPI-CATEGORY-CD (3) ) TO HV-SPI-CTGY-CD-3
          methodOut.setHvSpiCtgyCd3(upperCase(methodIn.getDt1ReqSpiCategoryCd(2)));
//  MOVE FUNCTION UPPER-CASE ( DT1-REQ-SPI-CATEGORY-CD (4) ) TO HV-SPI-CTGY-CD-4
          methodOut.setHvSpiCtgyCd4(upperCase(methodIn.getDt1ReqSpiCategoryCd(3)));
//  MOVE FUNCTION UPPER-CASE ( DT1-REQ-SPI-CATEGORY-CD (5) ) TO HV-SPI-CTGY-CD-5
          methodOut.setHvSpiCtgyCd5(upperCase(methodIn.getDt1ReqSpiCategoryCd(4)));
//  IF DT1-REQ-CPT-FROM > SPACES
          if (             ( isGreaterThanSpaces(methodOut.getDt1ReqCptFrom()) )) { 
//  MOVE DT1-REQ-CPT-FROM TO HV-CPT-FROM
              methodOut.setHvCptFrom(methodOut.getDt1ReqCptFrom());
          }
//  IF DT1-REQ-CPT-THRU > SPACES
          if (             ( isGreaterThanSpaces(methodOut.getDt1ReqCptThru()) )) { 
//  MOVE DT1-REQ-CPT-THRU TO HV-CPT-THRU
              methodOut.setHvCptThru(methodOut.getDt1ReqCptThru());
          }
//  IF DT1-REQ-REV-FROM > SPACES
          if (             ( isGreaterThanSpaces(methodOut.getDt1ReqRevFrom()) )) { 
//  MOVE DT1-REQ-REV-FROM TO HV-REV-FROM
              methodOut.setHvRevFrom(methodOut.getDt1ReqRevFrom());
          }
//  IF DT1-REQ-REV-THRU > SPACES
          if (             ( isGreaterThanSpaces(methodOut.getDt1ReqRevThru()) )) { 
//  MOVE DT1-REQ-REV-THRU TO HV-REV-THRU
              methodOut.setHvRevThru(methodOut.getDt1ReqRevThru());
          }
//  IF DT1-REQ-REMARK-CD > SPACES
          if (             ( isGreaterThanSpaces(methodOut.getDt1ReqRemarkCd()) )) { 
//  MOVE DT1-REQ-REMARK-CD TO HV-REMARK-CD1 HV-REMARK-CD2
              methodOut.setHvRemarkCd1(methodOut.getDt1ReqRemarkCd());
              methodOut.setHvRemarkCd2(methodOut.getDt1ReqRemarkCd());
          }
//  IF DT1-REQ-PROV-SPCL-CD > SPACES
          if (             ( isGreaterThanSpaces(methodOut.getDt1ReqProvSpclCd()) )) { 
//  MOVE DT1-REQ-PROV-SPCL-CD TO HV-PROV-SPCL-CD1 HV-PROV-SPCL-CD2
              methodOut.setHvProvSpclCd1(methodOut.getDt1ReqProvSpclCd());
              methodOut.setHvProvSpclCd2(methodOut.getDt1ReqProvSpclCd());
          }
//  IF DT1-REQ-CAUSE-CD > SPACES
          if (             ( isGreaterThanSpaces(methodOut.getDt1ReqCauseCd()) )) { 
//  MOVE DT1-REQ-CAUSE-CD TO HV-CAUSE-CD1 HV-CAUSE-CD2
              methodOut.setHvCauseCd1(methodOut.getDt1ReqCauseCd());
              methodOut.setHvCauseCd2(methodOut.getDt1ReqCauseCd());
          }
//  IF DT1-REQ-APPLIED-TO-OOP-IND = 'Y'
//  LITERAL_Y = 'Y'
          if (compareChars(methodOut.getDt1ReqAppliedToOopInd(), CONSTANTS.LITERAL_Y) == 0) { 
//  MOVE DT1-REQ-APPLIED-TO-OOP-IND TO HV-APPLIED-TO-OOP-IND
              methodOut.setHvAppliedToOopInd(methodOut.getDt1ReqAppliedToOopInd());
          }

// * Set indicator for type of cursor to be executed
//  IF HV-FILM-OFC-NBR = ZERO AND HV-FLN-JULIAN-DT-NBR = ZERO AND HV-FLN-SRL-NBR = ZERO AND ( HV-INVN-CTL-NBR = '0000000000' OR SPACE) AND HV-FST-DT = '0001-01-01' AND HV-LST-SRVC-DT = '9999-12-31' AND HV-PROV-TINSUFF = ZERO AND HV-AUTH-NBR = SPACE AND HV-EXTR-NTFY-NBR = SPACE AND HV-SRVC-CATGY-CD = SPACE AND HV-SPI-CTGY-CD-1 = SPACE AND HV-SPI-CTGY-CD-2 = SPACE AND HV-SPI-CTGY-CD-3 = SPACE AND HV-SPI-CTGY-CD-4 = SPACE AND HV-SPI-CTGY-CD-5 = SPACE AND HV-CPT-FROM = SPACE AND HV-CPT-THRU = HIGH-VALUES AND HV-REV-FROM = SPACE AND HV-REV-THRU = HIGH-VALUES AND HV-REMARK-CD1 = SPACE AND HV-PROV-SPCL-CD1 = SPACE AND HV-CAUSE-CD1 = SPACE AND HV-APPLIED-TO-OOP-IND = SPACE
          if (( allZeros(methodOut.getHvFilmOfcNbr()) ) /*  ==  zeros*/ && ( allZeros(methodOut.getHvFlnJulianDtNbr()) ) /*  ==  zeros*/ && ( allZeros(methodOut.getHvFlnSrlNbr()) ) /*  ==  zeros*/ && (		compareChars(methodOut.getHvInvnCtlNbr(),CONSTANTS.LITERAL_0000000000) == 0  ||         ( allSpaces(methodOut.getHvInvnCtlNbr())   )) && compareChars(methodOut.getHvFstDt(),CONSTANTS.LITERAL_0001_MN2_0101) == 0 && compareChars(methodOut.getHvLstSrvcDt(),CONSTANTS.LITERAL_9999_MN2_1231) == 0 && ( allZeros(methodOut.getHvProvTinsuff()) ) /*  ==  zeros*/ &&         ( allSpaces(methodOut.getHvAuthNbr())   ) &&         ( allSpaces(methodOut.getHvExtrNtfyNbr())   ) &&         ( allSpaces(methodOut.getHvSrvcCatgyCd())   ) &&         ( allSpaces(methodOut.getHvSpiCtgyCd1())   ) &&         ( allSpaces(methodOut.getHvSpiCtgyCd2())   ) &&         ( allSpaces(methodOut.getHvSpiCtgyCd3())   ) &&         ( allSpaces(methodOut.getHvSpiCtgyCd4())   ) &&         ( allSpaces(methodOut.getHvSpiCtgyCd5())   ) &&         ( allSpaces(methodOut.getHvCptFrom())   ) && ( isHighValue(methodOut.getHvCptThru()) )  &&         ( allSpaces(methodOut.getHvRevFrom())   ) && ( isHighValue(methodOut.getHvRevThru()) )  &&         ( allSpaces(methodOut.getHvRemarkCd1())   ) &&         ( allSpaces(methodOut.getHvProvSpclCd1())   ) &&         ( allSpaces(methodOut.getHvCauseCd1())   ) &&         ( allSpaces(methodOut.getHvAppliedToOopInd())   )) { 
//  SET QUERY-FILTER-NO TO TRUE
              methodOut.setQueryFilterNoTrue(); 
              
          }
//  ELSE
          else { 
//  SET QUERY-FILTER-YES TO TRUE
              methodOut.setQueryFilterYesTrue(); 
              
          }

// * Futher refine search type for new cursors
//  IF HV-FILM-OFC-NBR = ZERO AND HV-FLN-JULIAN-DT-NBR = ZERO AND HV-FLN-SRL-NBR = ZERO AND ( HV-INVN-CTL-NBR = '0000000000' OR SPACE) AND HV-AUTH-NBR = SPACE AND HV-EXTR-NTFY-NBR = SPACE AND HV-SRVC-CATGY-CD = SPACE AND HV-SPI-CTGY-CD-1 = SPACE AND HV-SPI-CTGY-CD-2 = SPACE AND HV-SPI-CTGY-CD-3 = SPACE AND HV-SPI-CTGY-CD-4 = SPACE AND HV-SPI-CTGY-CD-5 = SPACE
          if (( allZeros(methodOut.getHvFilmOfcNbr()) ) /*  ==  zeros*/ && ( allZeros(methodOut.getHvFlnJulianDtNbr()) ) /*  ==  zeros*/ && ( allZeros(methodOut.getHvFlnSrlNbr()) ) /*  ==  zeros*/ && (		compareChars(methodOut.getHvInvnCtlNbr(),CONSTANTS.LITERAL_0000000000) == 0  ||         ( allSpaces(methodOut.getHvInvnCtlNbr())   )) &&         ( allSpaces(methodOut.getHvAuthNbr())   ) &&         ( allSpaces(methodOut.getHvExtrNtfyNbr())   ) &&         ( allSpaces(methodOut.getHvSrvcCatgyCd())   ) &&         ( allSpaces(methodOut.getHvSpiCtgyCd1())   ) &&         ( allSpaces(methodOut.getHvSpiCtgyCd2())   ) &&         ( allSpaces(methodOut.getHvSpiCtgyCd3())   ) &&         ( allSpaces(methodOut.getHvSpiCtgyCd4())   ) &&         ( allSpaces(methodOut.getHvSpiCtgyCd5())   )) { 
//  IF ( HV-FST-DT > '0001-01-01' OR HV-LST-SRVC-DT < '9999-12-31' ) AND HV-PROV-TINSUFF = ZERO
              if ((compareChars(methodOut.getHvFstDt(),CONSTANTS.LITERAL_0001_MN2_0101) > 0 || compareChars(methodOut.getHvLstSrvcDt(),CONSTANTS.LITERAL_9999_MN2_1231) < 0) && ( allZeros(methodOut.getHvProvTinsuff()) ) /*  ==  zeros*/) { 
//  SET QUERY-FILTER-SRVC-DT-ONLY TO TRUE
                  methodOut.setQueryFilterSrvcDtOnlyTrue(); 
                  
              }
//  IF HV-PROV-TINSUFF > ZERO
              if (( compareChars(methodOut.getHvProvTinsuff(), CONSTANTS.LITERAL_000000000000000) == 1 ) /*  >  zeros*/) { 
//  SET QUERY-FILTER-SRVC-DT-PROV TO TRUE
                  methodOut.setQueryFilterSrvcDtProvTrue(); 
                  
              }
//  IF HV-CPT-FROM > SPACES OR HV-CPT-THRU < HIGH-VALUES OR HV-REMARK-CD1 > SPACES OR HV-PROV-SPCL-CD1 > SPACES OR HV-CAUSE-CD1 > SPACES
              if (             ( isGreaterThanSpaces(methodOut.getHvCptFrom()) ) || !( isHighValue(methodOut.getHvCptThru()) )  ||              ( isGreaterThanSpaces(methodOut.getHvRemarkCd1()) ) ||              ( isGreaterThanSpaces(methodOut.getHvProvSpclCd1()) ) ||              ( isGreaterThanSpaces(methodOut.getHvCauseCd1()) )) { 
//  SET QUERY-FILTER-ALL-CPT TO TRUE
                  methodOut.setQueryFilterAllCptTrue(); 
                  
              }
//  IF HV-APPLIED-TO-OOP-IND = 'Y'
//  LITERAL_Y = 'Y'
              if (compareChars(methodOut.getHvAppliedToOopInd(), CONSTANTS.LITERAL_Y) == 0) { 
//  SET QUERY-FILTER-ALL-CPT-OOP TO TRUE
                  methodOut.setQueryFilterAllCptOopTrue(); 
                  
              }
//  IF ( HV-REV-FROM > SPACES OR HV-REV-THRU < HIGH-VALUES ) AND HV-APPLIED-TO-OOP-IND = SPACES
              if ((             ( isGreaterThanSpaces(methodOut.getHvRevFrom()) ) || !( isHighValue(methodOut.getHvRevThru()) ) ) &&         ( allSpaces(methodOut.getHvAppliedToOopInd())   )) { 
//  SET QUERY-FILTER-ALL-REV TO TRUE
                  methodOut.setQueryFilterAllRevTrue(); 
                  
              }
//  IF ( HV-REV-FROM > SPACES OR HV-REV-THRU < HIGH-VALUES ) AND HV-APPLIED-TO-OOP-IND = 'Y'
//  LITERAL_Y = 'Y'
              if ((             ( isGreaterThanSpaces(methodOut.getHvRevFrom()) ) || !( isHighValue(methodOut.getHvRevThru()) ) ) && compareChars(methodOut.getHvAppliedToOopInd(), CONSTANTS.LITERAL_Y) == 0) { 
//  SET QUERY-FILTER-ALL-REV-OOP TO TRUE
                  methodOut.setQueryFilterAllRevOopTrue(); 
                  
              }
          }
      
      return methodOut;
      }
      /**
      * searchIcnOnlySect 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-SEARCH-ICN-ONLY-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  :  

      * - dt1ReqIcn                      COBOL Name: DT1-REQ-ICN
      * - sqlcode                        COBOL Name: SQLCODE
      * - drefPolNbr                     COBOL Name: DREF-POL-NBR
      * - drefEeId                       COBOL Name: DREF-EE-ID
      * - drefDepnNbr                    COBOL Name: DREF-DEPN-NBR
      *
      * Output :  

      * - drefInvnCtlNbr                 COBOL Name: DREF-INVN-CTL-NBR
      * - dt1ReqIcn                      COBOL Name: DT1-REQ-ICN
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dt1RspPolicy                   COBOL Name: DT1-RSP-POLICY
      * - drefPolNbr                     COBOL Name: DREF-POL-NBR
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dt1RspEmpid                    COBOL Name: DT1-RSP-EMPID
      * - drefEeId                       COBOL Name: DREF-EE-ID
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - drefDepnNbr                    COBOL Name: DREF-DEPN-NBR
      * - dt1RspDepNbr                   COBOL Name: DT1-RSP-DEP-NBR
      * - dt1ReqSearchType               COBOL Name: DT1-REQ-SEARCH-TYPE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public SearchIcnOnlySectOutCtx searchIcnOnlySect(SearchIcnOnlySectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  1000-Search-icn-only-sect                                   *
// *81                                                              *
// *81  business function: get the member information based on icns *
// *81   -if found, request is populated for mbr-plus search        *
// *82***************************************************************
// *82  called by : 0000-mainline section                           *
// *82  calls     : 4000-search-member-plus-sect                    *
// *82            : 9100-database-error-sect                        *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
SearchIcnOnlySectOutCtx methodOut = methodIn.getSearchIcnOnlySectOutCtx();
//  MOVE DT1-REQ-ICN TO DREF-INVN-CTL-NBR
          methodOut.setDrefInvnCtlNbr(methodOut.getDt1ReqIcn());
//  SELECT POL_NBR , EE_ID , DEPN_NBR FROM ADJD_CLMSF_REF WHERE INVN_CTL_NBR = ? FETCH FIRST 1 ROWS ONLY WITH UR
          d5427dt1Repository.selectAdjdClmsfRef(methodOut.getDcladjdClmsfRef(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());

// * Change to search-type mbr-plus and execute mbr-plus search
//  IF SQLCODE = ZERO
          if (	( methodOut.getSqlcode() == 0 )) { 
//  MOVE DREF-POL-NBR TO DT1-REQ-POLICY , DT1-RSP-POLICY
              methodOut.setDt1ReqPolicy(methodOut.getDrefPolNbr());
              methodOut.setDt1RspPolicy(methodOut.getDrefPolNbr());
//  MOVE DREF-EE-ID TO DT1-REQ-EMPID , DT1-RSP-EMPID
              methodOut.setDt1ReqEmpid(methodOut.getDrefEeId());
              methodOut.setDt1RspEmpid(methodOut.getDrefEeId());
//  MOVE ZERO TO DT1-REQ-DEP-NBR
              methodOut.setDt1ReqDepNbr(0);
//  MOVE DREF-DEPN-NBR (1 : 2) TO DT1-REQ-DEP-NBR (2 : 2)
              methodOut.setDt1ReqDepNbr(replace(String.valueOf(methodOut.getDt1ReqDepNbrString()).toCharArray(),substring(methodOut.getDrefDepnNbr(),0,2),1,3));
//  MOVE DT1-REQ-DEP-NBR TO DT1-RSP-DEP-NBR
              methodOut.setDt1RspDepNbr(methodOut.getDt1ReqDepNbr());
//  SET DT1-REQ-SEARCH-MEMBER-PLUS TO TRUE
              methodOut.setDt1ReqSearchMemberPlusTrue(); 
              
//  PERFORM 4000-SEARCH-MEMBER-PLUS-SECT
              searchMemberPlusSect(programCtx.getSearchMemberPlusSectInCtx());/*4000-SEARCH-MEMBER-PLUS-SECT SECTION*/
          }
//  ELSE
          else { 
//  MOVE '1000-SEA' TO DB2-PARAGRAPH
//  LITERAL_1000_MN_SEA = '1000-SEA'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_1000_MN_SEA);
//  MOVE 'SELECT ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_SELECT_B4_);
//  MOVE 'DENORM_REF' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_DENORM_REF_B20_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * procCsrInitFil2Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 3200-PROC-CSR-INIT-FIL2-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * @throws CFException
      */
      @Override
      public ProcCsrInitFil2SectOutCtx procCsrInitFil2Sect(ProcCsrInitFil2SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  3200-Proc-csr-init-fil2-sect                                *
// *81                                                              *
// *81  business function: declare and open init-fil2 cursor        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4000-search-member-plus-sect                    *
// *82  calls     : 3210-open-csr-init-fil2-sect
// *82            : 3220-fetch-csr-init-fil2-sect
// *82            : 3230-close-csr-init-fil2-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcCsrInitFil2SectOutCtx methodOut = methodIn.getProcCsrInitFil2SectOutCtx();
//  PERFORM 3210-OPEN-CSR-INIT-FIL2-SECT
          openCsrInitFil2Sect(programCtx.getOpenCsrInitFil2SectInCtx());/*3210-OPEN-CSR-INIT-FIL2-SECT SECTION*/
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
              methodOut.setClmHstEndOfFetchNoTrue(); 
              
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
              while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodIn.isDt1RspOk()  )) {
//  PERFORM 3220-FETCH-CSR-INIT-FIL2-SECT
                  fetchCsrInitFil2Sect(programCtx);/*3220-FETCH-CSR-INIT-FIL2-SECT SECTION*/
              }
          }
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  PERFORM 3230-CLOSE-CSR-INIT-FIL2-SECT
              closeCsrInitFil2Sect(programCtx.getCloseCsrInitFil2SectInCtx());/*3230-CLOSE-CSR-INIT-FIL2-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * openCsrInitFil2Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 3210-OPEN-CSR-INIT-FIL2-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dderefPolNbr                   COBOL Name: DDEREF-POL-NBR
      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dderefEeId                     COBOL Name: DDEREF-EE-ID
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dderefDepnNbr                  COBOL Name: DDEREF-DEPN-NBR
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public OpenCsrInitFil2SectOutCtx openCsrInitFil2Sect(OpenCsrInitFil2SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  3210-Open-csr-init-fil2-sect                                *
// *81                                                              *
// *81  business function: declare and open csr-init-fil2           *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 3200-proc-csr-init-fil2-sect                    *
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
OpenCsrInitFil2SectOutCtx methodOut = methodIn.getOpenCsrInitFil2SectOutCtx();
//  MOVE DT1-REQ-POLICY TO DDEREF-POL-NBR
          methodOut.setDderefPolNbr(methodOut.getDt1ReqPolicy());
//  MOVE DT1-REQ-EMPID TO DDEREF-EE-ID
          methodOut.setDderefEeId(methodOut.getDt1ReqEmpid());
//  MOVE DT1-REQ-DEP-NBR (2 : 2) TO DDEREF-DEPN-NBR (1 : 2)
          methodOut.setDderefDepnNbr(replace(methodOut.getDderefDepnNbr(),String.valueOf(substring(methodOut.getDt1ReqDepNbrString(),1,3)).toCharArray(),0,2));
//  IF DDEREF-DEPN-NBR = 99
//  LITERAL_99 = 99
          if (compareChars(methodOut.getDderefDepnNbr(),CONSTANTS.LITERAL_99) == 0) { 
//  MOVE ZERO TO DDEREF-DEPN-NBR
              methodOut.setDderefDepnNbr(CONSTANTS.ZERO_2);
          }
//  WITH CLM_HST_TABLE ( PARTN_ID , PARTN_VAL , PROC_DT , PROC_TM , ICN_SUFX_VERS_NBR , INVN_CTL_NBR , ICN_SUFX_CD ) AS ( SELECT DISTINCT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD FROM ADJD_CLMHST_DENORM_REF REF WHERE REF.POL_NBR = ? AND REF.EE_ID = ? AND REF.DEPN_NBR = ? AND ? >= REF.FST_DT AND ? <= REF.LST_SRVC_DT AND SUBSTR ( REF.PROV_TINSUFF , 2 , 9 ) = ? ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC FETCH FIRST 500 ROWS ONLY ) SELECT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.PGM_ID_LST_CHAR_VAL , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , REF.LN_ID , REF.FLN_JULIAN_DT_NBR , REF.FLN_SRL_NBR , REF.DFT_NBR , REF.FST_DT , REF.LST_SRVC_DT , REF.PROV_TINSUFF , REF.PROV_SCRN_NBR , REF.CHRG_AMT , REF.RMRK_CD , REF.NC_AMT , REF.PMT_SVC_CD , REF.OVR_CD , REF.COPAY_AMT , REF.SRVC_CD , REF.PAY_CD , REF.TRANS_CD , HDR.FILM_OFC_NBR , HDR.CLM_LVL_RSN_CD , HDR.ADJTR_ID , HDR.MBR_PRV_IND , HDR.NTFY_WAIV_CD , HDR.BANK_CD , HDR.DIV_NBR , HDR.CLS_NBR , HDR.DRG_NBR , HDR.FACL_OR_PROF_CD , BKE.DLGT_ENTY_CD , BK2.NDB_CONTR_ID , BK2.CLM_SMB_TYP_APP_CD , BK2.SMB_ST_CD , DLN.PROC_T1_IND , DLN.AUTH_NBR , DLN.BASE_DED_DESC_TXT , DLN.MM_DED_DESC_TXT , DLN.PRS_CREAT_SRC_CD , DLN.BASE_DED_AMT , DLN.BASE_AMT , DLN.MM_DED_AMT , DLN.MM_AMT , DLN.MC_CR_RES_AMT , DLN.COB_CR_RES_AMT , DLN.PAR_IND , DLN.SUP_AMT , DLN.PROV_MKT_NBR , DLN.PPO_CD , DLN.PTNT_RESP_AMT , LNE.AUTH_SRC_ID , LNE.AUTH_PROC_CD , PRV.PROV_NM , PRV.PROV_EOB_NM , PRV.PROV_PRDCT_CD , PRV.PROV_MKT_TYP_CD , PRV.PROV_IPA_ID , PRV.TPSM_CD , PRV.PROV_SPCL_CD , IFNULL ( ( SELECT PR1.PROV_MEDCD_RECLM_IND FROM ADJD_CLMSF_PROV PR1 WHERE REF.PARTN_ID = PR1.PARTN_ID AND REF.PARTN_VAL = PR1.PARTN_VAL AND REF.INVN_CTL_NBR = PR1.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PR1.ICN_SUFX_CD AND REF.PROC_DT = PR1.PROC_DT AND REF.PROC_TM = PR1.PROC_TM AND PR1.PROV_MEDCD_RECLM_IND = 'Y' ORDER BY LST_UPDT_DTTM DESC FETCH FIRST 1 ROW ONLY ) , ' ' ) , IFNULL ( ( SELECT REL.REL_SRVC_CLM_LVL_IND FROM ADJD_CLMSFLN_REL_SRVCS REL WHERE REF.PARTN_ID = REL.PARTN_ID AND REF.PARTN_VAL = REL.PARTN_VAL AND REF.INVN_CTL_NBR = REL.INVN_CTL_NBR AND REF.ICN_SUFX_CD = REL.ICN_SUFX_CD AND REF.PROC_DT = REL.PROC_DT AND REF.PROC_TM = REL.PROC_TM AND REF.ICN_SUFX_VERS_NBR = REL.ICN_SUFX_VERS_NBR AND REF.LN_ID = REL.LN_ID FETCH FIRST 1 ROWS ONLY ) , ' ' ) , IFNULL ( DIA.DIAG_CD , '       ' ) , ( SELECT COUNT ( DISTINCT AUTH_NBR ) FROM ADJD_CLMHST_DENORM_LN DLN2 WHERE REF.PARTN_ID = DLN2.PARTN_ID AND REF.PARTN_VAL = DLN2.PARTN_VAL AND REF.INVN_CTL_NBR = DLN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN2.ICN_SUFX_CD AND REF.PROC_DT = DLN2.PROC_DT AND REF.PROC_TM = DLN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR AND ' ' < DLN2.AUTH_NBR ) , ( SELECT SUM ( PHYS_MEDCN_MSK_CNT ) FROM ADJD_CLMSF_LN2 LN2 WHERE REF.PARTN_ID = LN2.PARTN_ID AND REF.PARTN_VAL = LN2.PARTN_VAL AND REF.INVN_CTL_NBR = LN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LN2.ICN_SUFX_CD AND REF.PROC_DT = LN2.PROC_DT AND REF.PROC_TM = LN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR ) FROM CLM_HST_TABLE HST INNER JOIN ADJD_CLMHST_DENORM_REF REF ON REF.PARTN_ID = HST.PARTN_ID AND REF.PARTN_VAL = HST.PARTN_VAL AND REF.PROC_DT = HST.PROC_DT AND REF.PROC_TM = HST.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR AND REF.INVN_CTL_NBR = HST.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HST.ICN_SUFX_CD INNER JOIN ADJD_CLMHST_DENORM_HDR HDR ON REF.PARTN_ID = HDR.PARTN_ID AND REF.PARTN_VAL = HDR.PARTN_VAL AND REF.INVN_CTL_NBR = HDR.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HDR.ICN_SUFX_CD AND REF.PROC_DT = HDR.PROC_DT AND REF.PROC_TM = HDR.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E BKE ON REF.PARTN_ID = BKE.PARTN_ID AND REF.PARTN_VAL = BKE.PARTN_VAL AND REF.INVN_CTL_NBR = BKE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BKE.ICN_SUFX_CD AND REF.PROC_DT = BKE.PROC_DT AND REF.PROC_TM = BKE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E2 BK2 ON REF.PARTN_ID = BK2.PARTN_ID AND REF.PARTN_VAL = BK2.PARTN_VAL AND REF.INVN_CTL_NBR = BK2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BK2.ICN_SUFX_CD AND REF.PROC_DT = BK2.PROC_DT AND REF.PROC_TM = BK2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMHST_DENORM_LN DLN ON REF.PARTN_ID = DLN.PARTN_ID AND REF.PARTN_VAL = DLN.PARTN_VAL AND REF.INVN_CTL_NBR = DLN.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN.ICN_SUFX_CD AND REF.PROC_DT = DLN.PROC_DT AND REF.PROC_TM = DLN.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR AND REF.LN_ID = DLN.LN_ID INNER JOIN ADJD_CLMSF_PROV PRV ON REF.PARTN_ID = PRV.PARTN_ID AND REF.PARTN_VAL = PRV.PARTN_VAL AND REF.INVN_CTL_NBR = PRV.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PRV.ICN_SUFX_CD AND REF.PROC_DT = PRV.PROC_DT AND REF.PROC_TM = PRV.PROC_TM AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR AND REF.PROV_SCRN_NBR = PRV.PROV_SEQ_NBR INNER JOIN ADJD_CLMSF_LN LNE ON REF.PARTN_ID = LNE.PARTN_ID AND REF.PARTN_VAL = LNE.PARTN_VAL AND REF.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND REF.PROC_DT = LNE.PROC_DT AND REF.PROC_TM = LNE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND REF.LN_ID = LNE.LN_ID LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA ON REF.PARTN_ID = DIA.PARTN_ID AND REF.PARTN_VAL = DIA.PARTN_VAL AND REF.INVN_CTL_NBR = DIA.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DIA.ICN_SUFX_CD AND REF.PROC_DT = DIA.PROC_DT AND REF.PROC_TM = DIA.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR AND 1 = DIA.DIAG_SEQ_NBR ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.PGM_ID_LST_CHAR_VAL DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC , REF.LN_ID DESC OPTIMIZE FOR 600 ROWS FETCH FIRST 600 ROWS ONLY WITH UR
          programCtx.setCsrInitFil2ResultSet(d5427dt1Repository.openCsrInitFil2D5427dt1(methodOut.getDcladjdClmhstDenormRef(),methodIn.getHostVariables(),programCtx.getSqlca()));
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = ZERO
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '3210-OPE' TO DB2-PARAGRAPH
//  LITERAL_3210_MN_OPE = '3210-OPE'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_3210_MN_OPE);
//  MOVE 'OPEN   ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_OPEN_B6_);
//  MOVE 'CSR-INIT-FIL2' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFIL2_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrInitFil2Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 3220-FETCH-CSR-INIT-FIL2-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrInitFil2SectOutCtx fetchCsrInitFil2Sect(D5427dt1Ctx programCtx) throws Exception {
      
// *81***************************************************************
// *81  3220-Fetch-csr-init-fil2-sect                               *
// *81                                                              *
// *81  business function: fetch claim lines                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 3200-proc-csr-init-fil2-sect                    *
// *82  calls     : 3221-fetch-csr-rows-sect                        *
// *82***************************************************************
// *================================================================
FetchCsrInitFil2SectOutCtx methodOut = programCtx.getFetchCsrInitFil2SectOutCtx();
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
          methodOut.setClmHstEndOfFetchNoTrue(); 
          
//  SET DT1-RSP-OK TO TRUE
          methodOut.setDt1RspOkTrue(); 
          
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
          while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodOut.isDt1RspOk()  )) {
//  PERFORM 3221-FETCH-CSR-ROWS-SECT
              fetchCsrRowsSect(programCtx.getFetchCsrRowsSectInCtx());/*3221-FETCH-CSR-ROWS-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrRowsSect 
      *   This method is derived from 
  *   COBOL Paragraph - 3221-FETCH-CSR-ROWS-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrRowsSectOutCtx fetchCsrRowsSect(FetchCsrRowsSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  3221-Fetch-csr-rows-sect                                    *
// *81                                                              *
// *81  business function: fetch cursor rows                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 3220-fetch-csr-init-fil2-sect                   *
// *82  calls     : 4500-proc-fetched-rows-sect                     *
// *82            : 9100-database-error-sect                        *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
FetchCsrRowsSectOutCtx methodOut = methodIn.getFetchCsrRowsSectOutCtx();
//  FETCH NEXT ROWSET FROM CSR-INIT-FIL2 FOR ? ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d5427dt1Repository.fetchCsrInitFil2D5427dt1(programCtx.getCsrInitFil2ResultSet(),methodOut.getHvaClmHistArray(),methodIn.getWork(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  (( methodOut.isSqlcodeOk()  ) || ( methodOut.isSqlcodeFetchEnd()  )) { 
//  PERFORM 4500-PROC-FETCHED-ROWS-SECT
              procFetchedRowsSect(programCtx.getProcFetchedRowsSectInCtx());/*4500-PROC-FETCHED-ROWS-SECT SECTION*/
          }
          else   { 
//  MOVE '3221-FET' TO DB2-PARAGRAPH
//  LITERAL_3221_MN_FET = '3221-FET'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_3221_MN_FET);
//  MOVE 'FETCH  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_FETCH_B5_);
//  MOVE 'CSR-INIT-FIL2' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFIL2_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsrInitFil2Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 3230-CLOSE-CSR-INIT-FIL2-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public CloseCsrInitFil2SectOutCtx closeCsrInitFil2Sect(CloseCsrInitFil2SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  3230-Close-csr-init-fil2-sect                               *
// *81                                                              *
// *81  business function: close the claim list cursor              *
// *82***************************************************************
// *82  called by : 3200-proc-csr-init-fil2-sect
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
CloseCsrInitFil2SectOutCtx methodOut = methodIn.getCloseCsrInitFil2SectOutCtx();
//  CLOSE CSR-INIT-FIL2
          d5427dt1Repository.closeCsrInitFil2D5427dt1(programCtx.getCsrInitFil2ResultSet(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = +0 OR SQLCODE = -501
//  ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != -501 )) { 
//  MOVE '3230-CLO' TO DB2-PARAGRAPH
//  LITERAL_3230_MN_CLO = '3230-CLO'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_3230_MN_CLO);
//  MOVE 'CLOSE  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_CLOSE_B5_);
//  MOVE 'CSR-INIT-FIL2' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFIL2_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * procCsrNextFil2Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 3400-PROC-CSR-NEXT-FIL2-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * @throws CFException
      */
      @Override
      public ProcCsrNextFil2SectOutCtx procCsrNextFil2Sect(ProcCsrNextFil2SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  3400-Proc-csr-next-fil2-sect                                *
// *81                                                              *
// *81  business function: declare and open next-fil2 cursor        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4000-search-member-plus-sect                    *
// *82  calls     : 3410-open-csr-next-fil2-sect
// *82            : 3420-fetch-csr-next-fil2-sect
// *82            : 3430-close-csr-next-fil2-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcCsrNextFil2SectOutCtx methodOut = methodIn.getProcCsrNextFil2SectOutCtx();
//  PERFORM 3410-OPEN-CSR-NEXT-FIL2-SECT
          openCsrNextFil2Sect(programCtx.getOpenCsrNextFil2SectInCtx());/*3410-OPEN-CSR-NEXT-FIL2-SECT SECTION*/
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
              methodOut.setClmHstEndOfFetchNoTrue(); 
              
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
              while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodIn.isDt1RspOk()  )) {
//  PERFORM 3420-FETCH-CSR-NEXT-FIL2-SECT
                  fetchCsrNextFil2Sect(programCtx);/*3420-FETCH-CSR-NEXT-FIL2-SECT SECTION*/
              }
          }
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  PERFORM 3430-CLOSE-CSR-NEXT-FIL2-SECT
              closeCsrNextFil2Sect(programCtx.getCloseCsrNextFil2SectInCtx());/*3430-CLOSE-CSR-NEXT-FIL2-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * openCsrNextFil2Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 3410-OPEN-CSR-NEXT-FIL2-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dderefPolNbr                   COBOL Name: DDEREF-POL-NBR
      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dderefEeId                     COBOL Name: DDEREF-EE-ID
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dderefDepnNbr                  COBOL Name: DDEREF-DEPN-NBR
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - nextKey                        COBOL Name: NEXT-KEY
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - nextProcDt                     COBOL Name: NEXT-PROC-DT
      * - dderefProcDt                   COBOL Name: DDEREF-PROC-DT
      * - nextProcTm                     COBOL Name: NEXT-PROC-TM
      * - dderefProcTm                   COBOL Name: DDEREF-PROC-TM
      * - nextPgmIdLstCharVal            COBOL Name: NEXT-PGM-ID-LST-CHAR-VAL
      * - dderefPgmIdLstCharVal          COBOL Name: DDEREF-PGM-ID-LST-CHAR-VAL
      * - nextIcnSufxVersNbr             COBOL Name: NEXT-ICN-SUFX-VERS-NBR
      * - dderefIcnSufxVersNbr           COBOL Name: DDEREF-ICN-SUFX-VERS-NBR
      * - nextInvnCtlNbr                 COBOL Name: NEXT-INVN-CTL-NBR
      * - dderefInvnCtlNbr               COBOL Name: DDEREF-INVN-CTL-NBR
      * - nextIcnSufxCd                  COBOL Name: NEXT-ICN-SUFX-CD
      * - dderefIcnSufxCd                COBOL Name: DDEREF-ICN-SUFX-CD
      * - nextLnId                       COBOL Name: NEXT-LN-ID
      * - dderefLnId                     COBOL Name: DDEREF-LN-ID
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public OpenCsrNextFil2SectOutCtx openCsrNextFil2Sect(OpenCsrNextFil2SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  3410-Open-csr-next-fil2-sect                                *
// *81                                                              *
// *81  business function: declare and open csr-next-fil2           *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 3400-proc-csr-next-fil2-sect                    *
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
OpenCsrNextFil2SectOutCtx methodOut = methodIn.getOpenCsrNextFil2SectOutCtx();
//  MOVE DT1-REQ-POLICY TO DDEREF-POL-NBR
          methodOut.setDderefPolNbr(methodOut.getDt1ReqPolicy());
//  MOVE DT1-REQ-EMPID TO DDEREF-EE-ID
          methodOut.setDderefEeId(methodOut.getDt1ReqEmpid());
//  MOVE DT1-REQ-DEP-NBR (2 : 2) TO DDEREF-DEPN-NBR (1 : 2)
          methodOut.setDderefDepnNbr(replace(methodOut.getDderefDepnNbr(),String.valueOf(substring(methodOut.getDt1ReqDepNbrString(),1,3)).toCharArray(),0,2));
//  IF DDEREF-DEPN-NBR = 99
//  LITERAL_99 = 99
          if (compareChars(methodOut.getDderefDepnNbr(),CONSTANTS.LITERAL_99) == 0) { 
//  MOVE ZERO TO DDEREF-DEPN-NBR
              methodOut.setDderefDepnNbr(CONSTANTS.ZERO_2);
          }
//  MOVE DT1-REQ-NEXT-KEY TO NEXT-KEY
          methodOut.getNextKey().setString(methodOut.getDt1ReqNextKey());
//  MOVE NEXT-PROC-DT TO DDEREF-PROC-DT
          methodOut.setDderefProcDt(methodOut.getNextProcDt());
//  MOVE NEXT-PROC-TM TO DDEREF-PROC-TM
          methodOut.setDderefProcTm(methodOut.getNextProcTm());
//  MOVE NEXT-PGM-ID-LST-CHAR-VAL TO DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setDderefPgmIdLstCharVal(methodOut.getNextPgmIdLstCharVal());
//  MOVE NEXT-ICN-SUFX-VERS-NBR TO DDEREF-ICN-SUFX-VERS-NBR
          methodOut.setDderefIcnSufxVersNbr((short) methodOut.getNextIcnSufxVersNbr());
//  MOVE NEXT-INVN-CTL-NBR TO DDEREF-INVN-CTL-NBR
          methodOut.setDderefInvnCtlNbr(methodOut.getNextInvnCtlNbr());
//  MOVE NEXT-ICN-SUFX-CD TO DDEREF-ICN-SUFX-CD
          methodOut.setDderefIcnSufxCd(methodOut.getNextIcnSufxCd());
//  MOVE NEXT-LN-ID TO DDEREF-LN-ID
          methodOut.setDderefLnId((short) methodOut.getNextLnId());
//  WITH CLM_HST_TABLE ( PARTN_ID , PARTN_VAL , PROC_DT , PROC_TM , ICN_SUFX_VERS_NBR , INVN_CTL_NBR , ICN_SUFX_CD ) AS ( SELECT DISTINCT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD FROM ADJD_CLMHST_DENORM_REF REF WHERE REF.POL_NBR = ? AND REF.EE_ID = ? AND REF.DEPN_NBR = ? AND ? >= REF.FST_DT AND ? <= REF.LST_SRVC_DT AND SUBSTR ( REF.PROV_TINSUFF , 2 , 9 ) = ? AND ( ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR = ? AND REF.ICN_SUFX_CD = ? AND REF.LN_ID <= ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR = ? AND REF.ICN_SUFX_CD < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM < ? ) OR ( REF.PROC_DT < ? ) ) ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC FETCH FIRST 500 ROWS ONLY ) SELECT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.PGM_ID_LST_CHAR_VAL , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , REF.LN_ID , REF.FLN_JULIAN_DT_NBR , REF.FLN_SRL_NBR , REF.DFT_NBR , REF.FST_DT , REF.LST_SRVC_DT , REF.PROV_TINSUFF , REF.PROV_SCRN_NBR , REF.CHRG_AMT , REF.RMRK_CD , REF.NC_AMT , REF.PMT_SVC_CD , REF.OVR_CD , REF.COPAY_AMT , REF.SRVC_CD , REF.PAY_CD , REF.TRANS_CD , HDR.FILM_OFC_NBR , HDR.CLM_LVL_RSN_CD , HDR.ADJTR_ID , HDR.MBR_PRV_IND , HDR.NTFY_WAIV_CD , HDR.BANK_CD , HDR.DIV_NBR , HDR.CLS_NBR , BKE.DLGT_ENTY_CD , BK2.NDB_CONTR_ID , BK2.CLM_SMB_TYP_APP_CD , BK2.SMB_ST_CD , DLN.PROC_T1_IND , DLN.AUTH_NBR , DLN.BASE_DED_DESC_TXT , DLN.MM_DED_DESC_TXT , DLN.PRS_CREAT_SRC_CD , DLN.BASE_DED_AMT , DLN.BASE_AMT , DLN.MM_DED_AMT , DLN.MM_AMT , DLN.MC_CR_RES_AMT , DLN.COB_CR_RES_AMT , DLN.PAR_IND , DLN.SUP_AMT , DLN.PROV_MKT_NBR , DLN.PPO_CD , DLN.PTNT_RESP_AMT , LNE.AUTH_SRC_ID , LNE.AUTH_PROC_CD , PRV.PROV_NM , PRV.PROV_EOB_NM , PRV.PROV_PRDCT_CD , PRV.PROV_MKT_TYP_CD , PRV.PROV_IPA_ID , PRV.TPSM_CD , PRV.PROV_SPCL_CD , IFNULL ( ( SELECT PR1.PROV_MEDCD_RECLM_IND FROM ADJD_CLMSF_PROV PR1 WHERE REF.PARTN_ID = PR1.PARTN_ID AND REF.PARTN_VAL = PR1.PARTN_VAL AND REF.INVN_CTL_NBR = PR1.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PR1.ICN_SUFX_CD AND REF.PROC_DT = PR1.PROC_DT AND REF.PROC_TM = PR1.PROC_TM AND PR1.PROV_MEDCD_RECLM_IND = 'Y' ORDER BY LST_UPDT_DTTM DESC FETCH FIRST 1 ROW ONLY ) , ' ' ) , IFNULL ( ( SELECT REL.REL_SRVC_CLM_LVL_IND FROM ADJD_CLMSFLN_REL_SRVCS REL WHERE REF.PARTN_ID = REL.PARTN_ID AND REF.PARTN_VAL = REL.PARTN_VAL AND REF.INVN_CTL_NBR = REL.INVN_CTL_NBR AND REF.ICN_SUFX_CD = REL.ICN_SUFX_CD AND REF.PROC_DT = REL.PROC_DT AND REF.PROC_TM = REL.PROC_TM AND REF.ICN_SUFX_VERS_NBR = REL.ICN_SUFX_VERS_NBR AND REF.LN_ID = REL.LN_ID FETCH FIRST 1 ROWS ONLY ) , ' ' ) , IFNULL ( DIA.DIAG_CD , '       ' ) , ( SELECT COUNT ( DISTINCT AUTH_NBR ) FROM ADJD_CLMHST_DENORM_LN DLN2 WHERE REF.PARTN_ID = DLN2.PARTN_ID AND REF.PARTN_VAL = DLN2.PARTN_VAL AND REF.INVN_CTL_NBR = DLN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN2.ICN_SUFX_CD AND REF.PROC_DT = DLN2.PROC_DT AND REF.PROC_TM = DLN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR AND ' ' < DLN2.AUTH_NBR ) , ( SELECT SUM ( PHYS_MEDCN_MSK_CNT ) FROM ADJD_CLMSF_LN2 LN2 WHERE REF.PARTN_ID = LN2.PARTN_ID AND REF.PARTN_VAL = LN2.PARTN_VAL AND REF.INVN_CTL_NBR = LN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LN2.ICN_SUFX_CD AND REF.PROC_DT = LN2.PROC_DT AND REF.PROC_TM = LN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR ) FROM CLM_HST_TABLE HST INNER JOIN ADJD_CLMHST_DENORM_REF REF ON REF.PARTN_ID = HST.PARTN_ID AND REF.PARTN_VAL = HST.PARTN_VAL AND REF.PROC_DT = HST.PROC_DT AND REF.PROC_TM = HST.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR AND REF.INVN_CTL_NBR = HST.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HST.ICN_SUFX_CD INNER JOIN ADJD_CLMHST_DENORM_HDR HDR ON REF.PARTN_ID = HDR.PARTN_ID AND REF.PARTN_VAL = HDR.PARTN_VAL AND REF.INVN_CTL_NBR = HDR.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HDR.ICN_SUFX_CD AND REF.PROC_DT = HDR.PROC_DT AND REF.PROC_TM = HDR.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E BKE ON REF.PARTN_ID = BKE.PARTN_ID AND REF.PARTN_VAL = BKE.PARTN_VAL AND REF.INVN_CTL_NBR = BKE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BKE.ICN_SUFX_CD AND REF.PROC_DT = BKE.PROC_DT AND REF.PROC_TM = BKE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E2 BK2 ON REF.PARTN_ID = BK2.PARTN_ID AND REF.PARTN_VAL = BK2.PARTN_VAL AND REF.INVN_CTL_NBR = BK2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BK2.ICN_SUFX_CD AND REF.PROC_DT = BK2.PROC_DT AND REF.PROC_TM = BK2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMHST_DENORM_LN DLN ON REF.PARTN_ID = DLN.PARTN_ID AND REF.PARTN_VAL = DLN.PARTN_VAL AND REF.INVN_CTL_NBR = DLN.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN.ICN_SUFX_CD AND REF.PROC_DT = DLN.PROC_DT AND REF.PROC_TM = DLN.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR AND REF.LN_ID = DLN.LN_ID INNER JOIN ADJD_CLMSF_PROV PRV ON REF.PARTN_ID = PRV.PARTN_ID AND REF.PARTN_VAL = PRV.PARTN_VAL AND REF.INVN_CTL_NBR = PRV.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PRV.ICN_SUFX_CD AND REF.PROC_DT = PRV.PROC_DT AND REF.PROC_TM = PRV.PROC_TM AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR AND REF.PROV_SCRN_NBR = PRV.PROV_SEQ_NBR INNER JOIN ADJD_CLMSF_LN LNE ON REF.PARTN_ID = LNE.PARTN_ID AND REF.PARTN_VAL = LNE.PARTN_VAL AND REF.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND REF.PROC_DT = LNE.PROC_DT AND REF.PROC_TM = LNE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND REF.LN_ID = LNE.LN_ID LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA ON REF.PARTN_ID = DIA.PARTN_ID AND REF.PARTN_VAL = DIA.PARTN_VAL AND REF.INVN_CTL_NBR = DIA.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DIA.ICN_SUFX_CD AND REF.PROC_DT = DIA.PROC_DT AND REF.PROC_TM = DIA.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR AND 1 = DIA.DIAG_SEQ_NBR ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.PGM_ID_LST_CHAR_VAL DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC , REF.LN_ID DESC OPTIMIZE FOR 600 ROWS FETCH FIRST 600 ROWS ONLY WITH UR
          programCtx.setCsrNextFil2ResultSet(d5427dt1Repository.openCsrNextFil2D5427dt1(methodOut.getDcladjdClmhstDenormRef(),methodIn.getHostVariables(),programCtx.getSqlca()));
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = ZERO
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '3410-OPE' TO DB2-PARAGRAPH
//  LITERAL_3410_MN_OPE = '3410-OPE'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_3410_MN_OPE);
//  MOVE 'OPEN   ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_OPEN_B6_);
//  MOVE 'CSR-NEXT-FIL2' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFIL2_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrNextFil2Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 3420-FETCH-CSR-NEXT-FIL2-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrNextFil2SectOutCtx fetchCsrNextFil2Sect(D5427dt1Ctx programCtx) throws Exception {
      
// *81***************************************************************
// *81  3420-Fetch-csr-next-fil2-sect                               *
// *81                                                              *
// *81  business function: fetch claim lines                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 3400-proc-csr-next-fil2-sect                    *
// *82  calls     : 3421-fetch-csr-rows-sect                        *
// *82***************************************************************
// *================================================================
FetchCsrNextFil2SectOutCtx methodOut = programCtx.getFetchCsrNextFil2SectOutCtx();
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
          methodOut.setClmHstEndOfFetchNoTrue(); 
          
//  SET DT1-RSP-OK TO TRUE
          methodOut.setDt1RspOkTrue(); 
          
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
          while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodOut.isDt1RspOk()  )) {
//  PERFORM 3421-FETCH-CSR-ROWS-SECT
              fetchCsrRowsSect3421(programCtx.getFetchCsrRowsSect3421InCtx());/*3421-FETCH-CSR-ROWS-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrRowsSect3421 
      *   This method is derived from 
  *   COBOL Paragraph - 3421-FETCH-CSR-ROWS-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrRowsSect3421OutCtx fetchCsrRowsSect3421(FetchCsrRowsSect3421InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  3421-Fetch-csr-rows-sect                                    *
// *81                                                              *
// *81  business function: fetch cursor rows                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 3420-fetch-csr-next-fil2-sect                   *
// *82  calls     : 4500-proc-fetched-rows-sect                     *
// *82            : 9100-database-error-sect                        *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
FetchCsrRowsSect3421OutCtx methodOut = methodIn.getFetchCsrRowsSect3421OutCtx();
//  FETCH NEXT ROWSET FROM CSR-NEXT-FIL2 FOR ? ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d5427dt1Repository.fetchCsrNextFil2D5427dt1(programCtx.getCsrNextFil2ResultSet(),methodOut.getHvaClmHistArray(),methodIn.getWork(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  (( methodOut.isSqlcodeOk()  ) || ( methodOut.isSqlcodeFetchEnd()  )) { 
//  PERFORM 4500-PROC-FETCHED-ROWS-SECT
              procFetchedRowsSect(programCtx.getProcFetchedRowsSectInCtx());/*4500-PROC-FETCHED-ROWS-SECT SECTION*/
          }
          else   { 
//  MOVE '3421-FET' TO DB2-PARAGRAPH
//  LITERAL_3421_MN_FET = '3421-FET'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_3421_MN_FET);
//  MOVE 'FETCH  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_FETCH_B5_);
//  MOVE 'CSR-NEXT-FIL2' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFIL2_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsrNextFil2Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 3430-CLOSE-CSR-NEXT-FIL2-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public CloseCsrNextFil2SectOutCtx closeCsrNextFil2Sect(CloseCsrNextFil2SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  3430-Close-csr-next-fil2-sect                               *
// *81                                                              *
// *81  business function: close the claim list cursor              *
// *82***************************************************************
// *82  called by : 3400-proc-csr-next-fil2-sect
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
CloseCsrNextFil2SectOutCtx methodOut = methodIn.getCloseCsrNextFil2SectOutCtx();
//  CLOSE CSR-NEXT-FIL2
          d5427dt1Repository.closeCsrNextFil2D5427dt1(programCtx.getCsrNextFil2ResultSet(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = +0 OR SQLCODE = -501
//  ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != -501 )) { 
//  MOVE '3430-CLO' TO DB2-PARAGRAPH
//  LITERAL_3430_MN_CLO = '3430-CLO'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_3430_MN_CLO);
//  MOVE 'CLOSE  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_CLOSE_B5_);
//  MOVE 'CSR-NEXT-FIL2' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFIL2_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * procCsrDynamSqlSect 
      *   This method is derived from 
  *   COBOL Paragraph - 3700-PROC-CSR-DYNAM-SQL-SECT SECTION COBOL Cyclomatic complexity - 15
      * Input  :  

      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - queryBaseCteStart              COBOL Name: QUERY-BASE-CTE-START
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - hvLstSrvcDt                    COBOL Name: HV-LST-SRVC-DT
      * - hvFstDt                        COBOL Name: HV-FST-DT
      * - queryFilterServiceDates        COBOL Name: QUERY-FILTER-SERVICE-DATES
      * - hvProvTin                      COBOL Name: HV-PROV-TIN
      * - queryFilterProviderTin         COBOL Name: QUERY-FILTER-PROVIDER-TIN
      * - hvInvnCtlNbr                   COBOL Name: HV-INVN-CTL-NBR
      * - queryFilterIcn                 COBOL Name: QUERY-FILTER-ICN
      * - hvFlnJulianDtNbr               COBOL Name: HV-FLN-JULIAN-DT-NBR
      * - hvFlnSrlNbr                    COBOL Name: HV-FLN-SRL-NBR
      * - queryFilterFln                 COBOL Name: QUERY-FILTER-FLN
      * - hvFilmOfcNbr                   COBOL Name: HV-FILM-OFC-NBR
      * - queryFilterOff                 COBOL Name: QUERY-FILTER-OFF
      * - dt1ReqSearchType               COBOL Name: DT1-REQ-SEARCH-TYPE
      * - queryBaseCteEnd                COBOL Name: QUERY-BASE-CTE-END
      * - queryBaseMainSql               COBOL Name: QUERY-BASE-MAIN-SQL
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dderefPolNbr                   COBOL Name: DDEREF-POL-NBR
      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dderefEeId                     COBOL Name: DDEREF-EE-ID
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dderefDepnNbr                  COBOL Name: DDEREF-DEPN-NBR
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - sqln                           COBOL Name: SQLN
      * - sqld                           COBOL Name: SQLD
      * - queryTextLeng                  COBOL Name: QUERY-TEXT-LENG
      * - queryTextData                  COBOL Name: QUERY-TEXT-DATA
      * - queryBaseCteStart              COBOL Name: QUERY-BASE-CTE-START
      * - sqltype                        COBOL Name: SQLTYPE
      * - sqllen                         COBOL Name: SQLLEN
      * - sqlnamel                       COBOL Name: SQLNAMEL
      * - sqlind                         COBOL Name: SQLIND
      * - sqldata                        COBOL Name: SQLDATA
      * - i                              COBOL Name: I
      * - queryFilterServiceDates        COBOL Name: QUERY-FILTER-SERVICE-DATES
      * - queryFilterProviderTin         COBOL Name: QUERY-FILTER-PROVIDER-TIN
      * - topsIcn10                      COBOL Name: TOPS-ICN-10
      * - hvInvnCtlNbr                   COBOL Name: HV-INVN-CTL-NBR
      * - queryFilterIcn                 COBOL Name: QUERY-FILTER-ICN
      * - queryFilterFln                 COBOL Name: QUERY-FILTER-FLN
      * - queryFilterOff                 COBOL Name: QUERY-FILTER-OFF
      * - queryBaseCteEnd                COBOL Name: QUERY-BASE-CTE-END
      * - queryBaseMainSql               COBOL Name: QUERY-BASE-MAIN-SQL
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      * - sqldaid                        COBOL Name: SQLDAID
      * - sqldabc                        COBOL Name: SQLDABC
      *
      * @throws CFException
      */
      @Override
      public ProcCsrDynamSqlSectOutCtx procCsrDynamSqlSect(ProcCsrDynamSqlSectInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int QUERY_BASE_CTE_START_LENGTH = 376;
			 final int DDEREF_POL_NBR_LENGTH = 6;
			 final int DDEREF_EE_ID_LENGTH = 10;
			 final int DDEREF_DEPN_NBR_LENGTH = 2;
			 final int HV_LST_SRVC_DT_LENGTH = 10;
			 final int HV_FST_DT_LENGTH = 10;
			 final int QUERY_FILTER_PROVIDER_TIN_LENGTH = 55;
			 final int HV_PROV_TIN_LENGTH = 9;
			 final int QUERY_FILTER_ICN_LENGTH = 46;
			 final int HV_INVN_CTL_NBR_LENGTH = 10;
			 final int HV_FLN_JULIAN_DT_NBR_LENGTH = 5;
			 final int HV_FLN_SRL_NBR_LENGTH = 5;
			 final int HV_FILM_OFC_NBR_LENGTH = 4;
			 final int QUERY_BASE_CTE_END_LENGTH = 140;
			 final int SQLDAID_LENGTH = 8;
			 final int SQLDABC_LENGTH = 4;
			 final int SQLN_LENGTH = 2;
			 final int SQLD_LENGTH = 2;
			// End of variable declaration

      
// *81***************************************************************
// *81  3700-Proc-csr-dynam-sql-sect                                *
// *81                                                              *
// *81  business function: build dynamic sql based on mix of params *
// *82***************************************************************
// *82  called by : 4000-search-member-plus-sect
// *82  calls     : 3710-proc-get-next-sql-sect
// *82            : 3720-proc-auth-5-6-sql-sect
// *82            : 3730-proc-option-7-sql-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcCsrDynamSqlSectOutCtx methodOut = methodIn.getProcCsrDynamSqlSectOutCtx();
//  MOVE DT1-REQ-POLICY TO DDEREF-POL-NBR
          methodOut.setDderefPolNbr(methodOut.getDt1ReqPolicy());
//  MOVE DT1-REQ-EMPID TO DDEREF-EE-ID
          methodOut.setDderefEeId(methodOut.getDt1ReqEmpid());
//  MOVE DT1-REQ-DEP-NBR (2 : 2) TO DDEREF-DEPN-NBR (1 : 2)
          methodOut.setDderefDepnNbr(replace(methodOut.getDderefDepnNbr(),String.valueOf(substring(methodOut.getDt1ReqDepNbrString(),1,3)).toCharArray(),0,2));
//  IF DDEREF-DEPN-NBR = 99
//  LITERAL_99 = 99
          if (compareChars(methodOut.getDderefDepnNbr(),CONSTANTS.LITERAL_99) == 0) { 
//  MOVE ZERO TO DDEREF-DEPN-NBR
              methodOut.setDderefDepnNbr(CONSTANTS.ZERO_2);
          }
//  MOVE ZERO TO SQLN, SQLD
          methodOut.setSqln((short) 0);
          methodOut.setSqld((short) 0);

// *-----------------------------------------------------
// * Put initial sql for cte - query-base-cte-start
// *-----------------------------------------------------
//  MOVE LENGTH OF QUERY-BASE-CTE-START TO QUERY-TEXT-LENG
          methodOut.setQueryTextLeng((short) QUERY_BASE_CTE_START_LENGTH);
//  MOVE QUERY-BASE-CTE-START TO QUERY-TEXT-DATA
          methodOut.setQueryTextData(pad(32000,methodOut.getQueryBaseCteStart(),SPACE_CHAR,RIGHT_PAD));

// * Put marker  :dderef-pol-nbr
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF DDEREF-POL-NBR TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_POL_NBR_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-POL-NBR
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefPolNbrGroup(),238,6)); 
          

// * Put marker  :dderef-ee-id
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF DDEREF-EE-ID TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_EE_ID_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-EE-ID
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefEeIdGroup(),110,10)); 
          

// * Put marker  :dderef-depn-nbr
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF DDEREF-DEPN-NBR TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_DEPN_NBR_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-DEPN-NBR
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefDepnNbrGroup(),87,2)); 
          

// *-----------------------------------------------------
// * Put get-next predicates if required - query-filter-get-next
// *-----------------------------------------------------
//  IF NOT DT1-REQ-START-AT-TOP
          if (!(methodIn.isDt1ReqStartAtTop()) ) { 
//  PERFORM 3710-PROC-GET-NEXT-SQL-SECT
              procGetNextSqlSect(programCtx);/*3710-PROC-GET-NEXT-SQL-SECT SECTION*/
          }

// *-----------------------------------------------------
// * Put service-date filter if start and/or end date requested
// *-----------------------------------------------------
//  IF HV-LST-SRVC-DT < '9999-12-31' OR HV-FST-DT > '0001-01-01'
//  LITERAL_0001_MN2_0101 = '0001-01-01'
          if (compareChars(methodIn.getHvLstSrvcDt(),CONSTANTS.LITERAL_9999_MN2_1231) < 0 || compareChars(methodIn.getHvFstDt(),CONSTANTS.LITERAL_0001_MN2_0101) > 0) { 
              methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-SERVICE-DATES TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-SERVICE-DATES )
              methodOut.setQueryTextData(replace(methodOut.getQueryTextData(),methodOut.getQueryFilterServiceDates().toCharArray(),(methodOut.getI()-1), (QueryFilterServiceDates.getQueryFilterServiceDatesFieldLength() + (methodOut.getI() - 1)) ));
//  ADD LENGTH OF QUERY-FILTER-SERVICE-DATES TO QUERY-TEXT-LENG
              methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QueryFilterServiceDates.getQueryFilterServiceDatesFieldLength()));

// * Put marker  :hv-lst-srvc-dt
//  ADD 1 TO SQLN, SQLD
              methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
              methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +384 TO SQLTYPE (SQLN)
              methodOut.setSqltype(methodOut.getSqln() - 1,(short)384);
//  MOVE LENGTH OF HV-LST-SRVC-DT TO SQLLEN (SQLN)
              methodOut.setSqllen(methodOut.getSqln() - 1,(short) HV_LST_SRVC_DT_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
              methodOut.setSqlind(methodOut.getSqln() - 1,0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF HV-LST-SRVC-DT
              methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getHvLstSrvcDtGroup(),46,10)); 
              

// * Put marker  :hv-fst-dt
//  ADD 1 TO SQLN, SQLD
              methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
              methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +384 TO SQLTYPE (SQLN)
              methodOut.setSqltype(methodOut.getSqln() - 1,(short)384);
//  MOVE LENGTH OF HV-FST-DT TO SQLLEN (SQLN)
              methodOut.setSqllen(methodOut.getSqln() - 1,(short) HV_FST_DT_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
              methodOut.setSqlind(methodOut.getSqln() - 1,0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF HV-FST-DT
              methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getHvFstDtGroup(),36,10)); 
              
          }

// *-----------------------------------------------------
// * Put provider-tin filter if requested
// *-----------------------------------------------------
//  IF HV-PROV-TIN > '000000000'
//  LITERAL_000000000 = '000000000'
          if (compareChars(methodIn.getHvProvTin(),CONSTANTS.LITERAL_000000000) > 0) { 
              methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-PROVIDER-TIN TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-PROVIDER-TIN )
              methodOut.setQueryTextData(methodOut.getQueryFilterProviderTin(),0,methodOut.getQueryFilterProviderTin().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_FILTER_PROVIDER_TIN_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-FILTER-PROVIDER-TIN TO QUERY-TEXT-LENG
              methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_FILTER_PROVIDER_TIN_LENGTH));

// * Put marker  :hv-prov-tin
//  ADD 1 TO SQLN, SQLD
              methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
              methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
              methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF HV-PROV-TIN TO SQLLEN (SQLN)
              methodOut.setSqllen(methodOut.getSqln() - 1,(short) HV_PROV_TIN_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
              methodOut.setSqlind(methodOut.getSqln() - 1,0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF HV-PROV-TIN
              methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getHvProvTinsuffRedefined(),57,9)); 
              
          }

// *-----------------------------------------------------
// * Put icn          filter if requested
// *-----------------------------------------------------
//  INITIALIZE TOPS-ICN-10
          methodOut.setTopsIcn10(CONSTANTS.SPACE_10 /* Fill 10 Spaces*/);
//  MOVE HV-INVN-CTL-NBR TO TOPS-ICN-10
          methodOut.setTopsIcn10(methodOut.getHvInvnCtlNbr());
//  IF VALID-ICN-NUM-VALUE-10
          if ( methodOut.isValidIcnNumValue10()  ) { 
              methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-ICN TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-ICN )
              methodOut.setQueryTextData(methodOut.getQueryFilterIcn(),0,methodOut.getQueryFilterIcn().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_FILTER_ICN_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-FILTER-ICN TO QUERY-TEXT-LENG
              methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_FILTER_ICN_LENGTH));

// * Put marker  :hv-invn-ctl-nbr
//  ADD 1 TO SQLN, SQLD
              methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
              methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
              methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF HV-INVN-CTL-NBR TO SQLLEN (SQLN)
              methodOut.setSqllen(methodOut.getSqln() - 1,(short) HV_INVN_CTL_NBR_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
              methodOut.setSqlind(methodOut.getSqln() - 1,0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF HV-INVN-CTL-NBR
              methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getHvInvnCtlNbrGroup(),21,10)); 
              
          }

// *-----------------------------------------------------
// * Put fln          filter if requested
// *-----------------------------------------------------
//  IF HV-FLN-JULIAN-DT-NBR > '00000' AND HV-FLN-SRL-NBR > '00000'
//  LITERAL_00000 = '00000'
          if (compareChars(methodIn.getHvFlnJulianDtNbr(),CONSTANTS.LITERAL_00000) > 0 && compareChars(methodIn.getHvFlnSrlNbr(),CONSTANTS.LITERAL_00000) > 0) { 
              methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-FLN TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-FLN )
              methodOut.setQueryTextData(replace(methodOut.getQueryTextData(),methodOut.getQueryFilterFln().toCharArray(),(methodOut.getI()-1), (QueryFilterFln.getQueryFilterFlnFieldLength() + (methodOut.getI() - 1)) ));
//  ADD LENGTH OF QUERY-FILTER-FLN TO QUERY-TEXT-LENG
              methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QueryFilterFln.getQueryFilterFlnFieldLength()));

// * Put marker  :hv-fln-julian-dt-nbr
//  ADD 1 TO SQLN, SQLD
              methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
              methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
              methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF HV-FLN-JULIAN-DT-NBR TO SQLLEN (SQLN)
              methodOut.setSqllen(methodOut.getSqln() - 1,(short) HV_FLN_JULIAN_DT_NBR_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
              methodOut.setSqlind(methodOut.getSqln() - 1,0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF HV-FLN-JULIAN-DT-NBR
              methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getHvFlnJulianDtNbrGroup(),86,5)); 
              

// * Put marker  :hv-fln-srl-nbr
//  ADD 1 TO SQLN, SQLD
              methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
              methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
              methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF HV-FLN-SRL-NBR TO SQLLEN (SQLN)
              methodOut.setSqllen(methodOut.getSqln() - 1,(short) HV_FLN_SRL_NBR_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
              methodOut.setSqlind(methodOut.getSqln() - 1,0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF HV-FLN-SRL-NBR
              methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getHvFlnSrlNbrGroup(),91,5)); 
              
          }

// *-----------------------------------------------------
// * Put office       filter if requested
// *-----------------------------------------------------
//  IF HV-FILM-OFC-NBR > '0000'
//  LITERAL_0000 = '0000'
          if (compareChars(methodIn.getHvFilmOfcNbr(),CONSTANTS.LITERAL_0000) > 0) { 
              methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-OFF TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-OFF )
              methodOut.setQueryTextData(replace(methodOut.getQueryTextData(),methodOut.getQueryFilterOff().toCharArray(),(methodOut.getI()-1), (QueryFilterOff.getQueryFilterOffFieldLength() + (methodOut.getI() - 1)) ));
//  ADD LENGTH OF QUERY-FILTER-OFF TO QUERY-TEXT-LENG
              methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QueryFilterOff.getQueryFilterOffFieldLength()));

// * Put marker  :hv-film-ofc-nbr
//  ADD 1 TO SQLN, SQLD
              methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
              methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
              methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF HV-FILM-OFC-NBR TO SQLLEN (SQLN)
              methodOut.setSqllen(methodOut.getSqln() - 1,(short) HV_FILM_OFC_NBR_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
              methodOut.setSqlind(methodOut.getSqln() - 1,0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF HV-FILM-OFC-NBR
              methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getHvFilmOfcNbrGroup(),96,4)); 
              
          }

// *-----------------------------------------------------
// * Put opt 5/6  predicates if required -
// *-----------------------------------------------------
//  IF DT1-REQ-SEARCH-MBR-AUTH-NBR OR DT1-REQ-SEARCH-AUTHS-ONLY
          if ( methodIn.isDt1ReqSearchMbrAuthNbr()   ||  methodIn.isDt1ReqSearchAuthsOnly()  ) { 
//  PERFORM 3720-PROC-AUTH-5-6-SQL-SECT
              procAuth56SqlSect(programCtx.getProcAuth56SqlSectInCtx());/*3720-PROC-AUTH-5-6-SQL-SECT SECTION*/
          }

// *-----------------------------------------------------
// * Put opt 7   6predicates if required -
// *-----------------------------------------------------
//  IF DT1-REQ-SEARCH-CATEGORY
          if ( methodIn.isDt1ReqSearchCategory()  ) { 
//  PERFORM 3730-PROC-OPTION-7-SQL-SECT
              procOption7SqlSect(programCtx.getProcOption7SqlSectInCtx());/*3730-PROC-OPTION-7-SQL-SECT SECTION*/
          }
          methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-BASE-CTE-END TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-BASE-CTE-END )
          methodOut.setQueryTextData(methodOut.getQueryBaseCteEnd(),0,methodOut.getQueryBaseCteEnd().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_BASE_CTE_END_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-BASE-CTE-END TO QUERY-TEXT-LENG
          methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_BASE_CTE_END_LENGTH));
          methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-BASE-MAIN-SQL TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-BASE-MAIN-SQL )
          methodOut.setQueryTextData(replace(methodOut.getQueryTextData(),methodOut.getQueryBaseMainSql().toCharArray(),(methodOut.getI()-1), (QueryBaseMainSql.getQueryBaseMainSqlFieldLength() + (methodOut.getI() - 1)) ));
//  ADD LENGTH OF QUERY-BASE-MAIN-SQL TO QUERY-TEXT-LENG
          methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QueryBaseMainSql.getQueryBaseMainSqlFieldLength()));
//  PREPARE DT1-DYN-QUERY FROM ?
          d5427dt1Repository.prepare(methodOut.getQueryTextArea(),programCtx.getSqlca());
//  IF SQLCODE NOT = ZERO
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '3700-PRO' TO DB2-PARAGRAPH
//  LITERAL_3700_MN_PRO = '3700-PRO'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_3700_MN_PRO);
//  MOVE 'PREPARE' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_PREPARE_B3_);
//  MOVE 'DT1-DYN-QUERY' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_DT1_MN2_DYNQUERY_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }

// * Set sqlda id and length vars
//  MOVE 'SQLDA' TO SQLDAID
          methodOut.setSqldaid(CONSTANTS.LITERAL_SQLDA_B3_);
          methodOut.setSqldabc(SQLDAID_LENGTH + SQLDABC_LENGTH + SQLN_LENGTH + SQLD_LENGTH +  ( methodOut.getSqln() * Sqlvar1.getSqlvar1FieldLength() ) );
      
      return methodOut;
      }
      /**
      * procGetNextSqlSect 
      *   This method is derived from 
  *   COBOL Paragraph - 3710-PROC-GET-NEXT-SQL-SECT SECTION COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void procGetNextSqlSect(D5427dt1Ctx programCtx) throws Exception {
      
// *81***************************************************************
// *81  3710-Proc-get-next-sql-sectt                                *
// *81                                                              *
// *81  business function: add   dynamic sql for "get-next" calls   *
// *82***************************************************************
// *82  called by : 3700-proc-csr-dynam-sql-sect
// *82  calls     : none
// *82***************************************************************
// *================================================================
//  PERFORM 3710-PROC-GET-NEXT-SQL-SECT-SPLIT0
          procGetNextSqlSectSplit0(programCtx.getProcGetNextSqlSectSplit0InCtx());/*3710-PROC-GET-NEXT-SQL-SECT-SPLIT0*/
//  PERFORM 3710-PROC-GET-NEXT-SQL-SECT-SPLIT1
          procGetNextSqlSectSplit1(programCtx.getProcGetNextSqlSectSplit1InCtx());/*3710-PROC-GET-NEXT-SQL-SECT-SPLIT1*/
//  PERFORM 3710-PROC-GET-NEXT-SQL-SECT-SPLIT2
          procGetNextSqlSectSplit2(programCtx.getProcGetNextSqlSectSplit2InCtx());/*3710-PROC-GET-NEXT-SQL-SECT-SPLIT2*/
//  PERFORM 3710-PROC-GET-NEXT-SQL-SECT-SPLIT3
          procGetNextSqlSectSplit3(programCtx.getProcGetNextSqlSectSplit3InCtx());/*3710-PROC-GET-NEXT-SQL-SECT-SPLIT3*/
      
      }
      /**
      * procGetNextSqlSectSplit0 
      *   This method is derived from 
  *   COBOL Paragraph - 3710-PROC-GET-NEXT-SQL-SECT-SPLIT0 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - queryTextLeng                  COBOL Name: QUERY-TEXT-LENG
      * - queryFilterGetNext             COBOL Name: QUERY-FILTER-GET-NEXT
      * - sqln                           COBOL Name: SQLN
      * - sqld                           COBOL Name: SQLD
      *
      * Output :  

      * - nextKey                        COBOL Name: NEXT-KEY
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - nextProcDt                     COBOL Name: NEXT-PROC-DT
      * - dderefProcDt                   COBOL Name: DDEREF-PROC-DT
      * - nextProcTm                     COBOL Name: NEXT-PROC-TM
      * - dderefProcTm                   COBOL Name: DDEREF-PROC-TM
      * - nextPgmIdLstCharVal            COBOL Name: NEXT-PGM-ID-LST-CHAR-VAL
      * - dderefPgmIdLstCharVal          COBOL Name: DDEREF-PGM-ID-LST-CHAR-VAL
      * - nextIcnSufxVersNbr             COBOL Name: NEXT-ICN-SUFX-VERS-NBR
      * - dderefIcnSufxVersNbr           COBOL Name: DDEREF-ICN-SUFX-VERS-NBR
      * - nextInvnCtlNbr                 COBOL Name: NEXT-INVN-CTL-NBR
      * - dderefInvnCtlNbr               COBOL Name: DDEREF-INVN-CTL-NBR
      * - nextIcnSufxCd                  COBOL Name: NEXT-ICN-SUFX-CD
      * - dderefIcnSufxCd                COBOL Name: DDEREF-ICN-SUFX-CD
      * - nextLnId                       COBOL Name: NEXT-LN-ID
      * - dderefLnId                     COBOL Name: DDEREF-LN-ID
      * - i                              COBOL Name: I
      * - queryTextData                  COBOL Name: QUERY-TEXT-DATA
      * - queryFilterGetNext             COBOL Name: QUERY-FILTER-GET-NEXT
      * - queryTextLeng                  COBOL Name: QUERY-TEXT-LENG
      * - sqln                           COBOL Name: SQLN
      * - sqld                           COBOL Name: SQLD
      * - sqltype                        COBOL Name: SQLTYPE
      * - sqllen                         COBOL Name: SQLLEN
      * - sqlnamel                       COBOL Name: SQLNAMEL
      * - sqlind                         COBOL Name: SQLIND
      * - sqldata                        COBOL Name: SQLDATA
      *
      * @throws CFException
      */
      @Override
      public ProcGetNextSqlSectSplit0OutCtx procGetNextSqlSectSplit0(ProcGetNextSqlSectSplit0InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int DDEREF_PROC_DT_LENGTH = 10;
			 final int DDEREF_PROC_TM_LENGTH = 8;
			 final int DDEREF_PGM_ID_LST_CHAR_VAL_LENGTH = 1;
			 final int DDEREF_ICN_SUFX_VERS_NBR_LENGTH = 2;
			 final int DDEREF_INVN_CTL_NBR_LENGTH = 10;
			 final int DDEREF_ICN_SUFX_CD_LENGTH = 2;
			 final int DDEREF_LN_ID_LENGTH = 2;
			// End of variable declaration

D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcGetNextSqlSectSplit0OutCtx methodOut = methodIn.getProcGetNextSqlSectSplit0OutCtx();
//  MOVE DT1-REQ-NEXT-KEY TO NEXT-KEY
          methodOut.getNextKey().setString(methodOut.getDt1ReqNextKey());
//  MOVE NEXT-PROC-DT TO DDEREF-PROC-DT
          methodOut.setDderefProcDt(methodOut.getNextProcDt());
//  MOVE NEXT-PROC-TM TO DDEREF-PROC-TM
          methodOut.setDderefProcTm(methodOut.getNextProcTm());
//  MOVE NEXT-PGM-ID-LST-CHAR-VAL TO DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setDderefPgmIdLstCharVal(methodOut.getNextPgmIdLstCharVal());
//  MOVE NEXT-ICN-SUFX-VERS-NBR TO DDEREF-ICN-SUFX-VERS-NBR
          methodOut.setDderefIcnSufxVersNbr((short) methodOut.getNextIcnSufxVersNbr());
//  MOVE NEXT-INVN-CTL-NBR TO DDEREF-INVN-CTL-NBR
          methodOut.setDderefInvnCtlNbr(methodOut.getNextInvnCtlNbr());
//  MOVE NEXT-ICN-SUFX-CD TO DDEREF-ICN-SUFX-CD
          methodOut.setDderefIcnSufxCd(methodOut.getNextIcnSufxCd());
//  MOVE NEXT-LN-ID TO DDEREF-LN-ID
          methodOut.setDderefLnId((short) methodOut.getNextLnId());
          methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-GET-NEXT TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-GET-NEXT )
          methodOut.setQueryTextData(replace(methodOut.getQueryTextData(),methodOut.getQueryFilterGetNext().toCharArray(),(methodOut.getI()-1), (QueryFilterGetNext.getQueryFilterGetNextFieldLength() + (methodOut.getI() - 1)) ));
//  ADD LENGTH OF QUERY-FILTER-GET-NEXT TO QUERY-TEXT-LENG
          methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QueryFilterGetNext.getQueryFilterGetNextFieldLength()));

// * Put marker  :dderef-proc-dt
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +384 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)384);
//  MOVE LENGTH OF DDEREF-PROC-DT TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PROC_DT_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PROC-DT
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefProcDtGroup(),24,10)); 
          

// * Put marker  :dderef-proc-tm
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +388 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)388);
//  MOVE LENGTH OF DDEREF-PROC-TM TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PROC_TM_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PROC-TM
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefProcTmGroup(),34,8)); 
          

// * Put marker  :dderef-pgm-id-lst-char-val
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF DDEREF-PGM-ID-LST-CHAR-VAL TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PGM_ID_LST_CHAR_VAL_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefPgmIdLstCharValGroup(),227,1)); 
          

// * Put marker  :dderef-icn-sufx-vers-nbr
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +500 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)500);
//  MOVE LENGTH OF DDEREF-ICN-SUFX-VERS-NBR TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_ICN_SUFX_VERS_NBR_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefPgmIdLstCharValGroup(),227,1)); 
          

// * Put marker  :dderef-invn-ctl-nbr
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF DDEREF-INVN-CTL-NBR TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_INVN_CTL_NBR_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-INVN-CTL-NBR
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefInvnCtlNbrGroup(),12,10)); 
          

// * Put marker  :dderef-icn-sufx-cd
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF DDEREF-ICN-SUFX-CD TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_ICN_SUFX_CD_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-ICN-SUFX-CD
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefIcnSufxCdGroup(),22,2)); 
          

// * Put marker  :dderef-ln-id
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +500 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)500);
//  MOVE LENGTH OF DDEREF-LN-ID TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_LN_ID_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
      
      return methodOut;
      }
      /**
      * procGetNextSqlSectSplit1 
      *   This method is derived from 
  *   COBOL Paragraph - 3710-PROC-GET-NEXT-SQL-SECT-SPLIT1 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - dderefLnId                     COBOL Name: DDEREF-LN-ID
      * - sqln                           COBOL Name: SQLN
      * - sqld                           COBOL Name: SQLD
      * - dderefProcDt                   COBOL Name: DDEREF-PROC-DT
      * - dderefProcTm                   COBOL Name: DDEREF-PROC-TM
      * - dderefPgmIdLstCharVal          COBOL Name: DDEREF-PGM-ID-LST-CHAR-VAL
      * - dderefInvnCtlNbr               COBOL Name: DDEREF-INVN-CTL-NBR
      * - dderefIcnSufxCd                COBOL Name: DDEREF-ICN-SUFX-CD
      *
      * Output :  

      * - sqlind                         COBOL Name: SQLIND
      * - sqldata                        COBOL Name: SQLDATA
      * - sqln                           COBOL Name: SQLN
      * - sqld                           COBOL Name: SQLD
      * - sqltype                        COBOL Name: SQLTYPE
      * - sqllen                         COBOL Name: SQLLEN
      * - sqlnamel                       COBOL Name: SQLNAMEL
      *
      * @throws CFException
      */
      @Override
      public ProcGetNextSqlSectSplit1OutCtx procGetNextSqlSectSplit1(ProcGetNextSqlSectSplit1InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int DDEREF_PROC_DT_LENGTH = 10;
			 final int DDEREF_PROC_TM_LENGTH = 8;
			 final int DDEREF_PGM_ID_LST_CHAR_VAL_LENGTH = 1;
			 final int DDEREF_ICN_SUFX_VERS_NBR_LENGTH = 2;
			 final int DDEREF_INVN_CTL_NBR_LENGTH = 10;
			 final int DDEREF_ICN_SUFX_CD_LENGTH = 2;
			// End of variable declaration

D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcGetNextSqlSectSplit1OutCtx methodOut = methodIn.getProcGetNextSqlSectSplit1OutCtx();
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-LN-ID
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefLnIdGroup(),44,2)); 
          

// * Put marker  :dderef-proc-dt
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +384 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)384);
//  MOVE LENGTH OF DDEREF-PROC-DT TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PROC_DT_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PROC-DT
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefProcDtGroup(),24,10)); 
          

// * Put marker  :dderef-proc-tm
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +388 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)388);
//  MOVE LENGTH OF DDEREF-PROC-TM TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PROC_TM_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PROC-TM
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefProcTmGroup(),34,8)); 
          

// * Put marker  :dderef-pgm-id-lst-char-val
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF DDEREF-PGM-ID-LST-CHAR-VAL TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PGM_ID_LST_CHAR_VAL_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefPgmIdLstCharValGroup(),227,1)); 
          

// * Put marker  :dderef-icn-sufx-vers-nbr
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +500 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)500);
//  MOVE LENGTH OF DDEREF-ICN-SUFX-VERS-NBR TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_ICN_SUFX_VERS_NBR_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefPgmIdLstCharValGroup(),227,1)); 
          

// * Put marker  :dderef-invn-ctl-nbr
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF DDEREF-INVN-CTL-NBR TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_INVN_CTL_NBR_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-INVN-CTL-NBR
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefInvnCtlNbrGroup(),12,10)); 
          

// * Put marker  :dderef-icn-sufx-cd
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF DDEREF-ICN-SUFX-CD TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_ICN_SUFX_CD_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-ICN-SUFX-CD
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefIcnSufxCdGroup(),22,2)); 
          

// * -----------------------------------------
// * Put marker  :dderef-proc-dt
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +384 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)384);
//  MOVE LENGTH OF DDEREF-PROC-DT TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PROC_DT_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PROC-DT
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefProcDtGroup(),24,10)); 
          

// * Put marker  :dderef-proc-tm
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +388 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)388);
//  MOVE LENGTH OF DDEREF-PROC-TM TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PROC_TM_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PROC-TM
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefProcTmGroup(),34,8)); 
          

// * Put marker  :dderef-pgm-id-lst-char-val
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
      
      return methodOut;
      }
      /**
      * procGetNextSqlSectSplit2 
      *   This method is derived from 
  *   COBOL Paragraph - 3710-PROC-GET-NEXT-SQL-SECT-SPLIT2 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - dderefPgmIdLstCharVal          COBOL Name: DDEREF-PGM-ID-LST-CHAR-VAL
      * - sqln                           COBOL Name: SQLN
      * - sqld                           COBOL Name: SQLD
      * - dderefInvnCtlNbr               COBOL Name: DDEREF-INVN-CTL-NBR
      * - dderefProcDt                   COBOL Name: DDEREF-PROC-DT
      * - dderefProcTm                   COBOL Name: DDEREF-PROC-TM
      *
      * Output :  

      * - sqltype                        COBOL Name: SQLTYPE
      * - sqllen                         COBOL Name: SQLLEN
      * - sqlnamel                       COBOL Name: SQLNAMEL
      * - sqlind                         COBOL Name: SQLIND
      * - sqldata                        COBOL Name: SQLDATA
      * - sqln                           COBOL Name: SQLN
      * - sqld                           COBOL Name: SQLD
      *
      * @throws CFException
      */
      @Override
      public ProcGetNextSqlSectSplit2OutCtx procGetNextSqlSectSplit2(ProcGetNextSqlSectSplit2InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int DDEREF_PGM_ID_LST_CHAR_VAL_LENGTH = 1;
			 final int DDEREF_ICN_SUFX_VERS_NBR_LENGTH = 2;
			 final int DDEREF_INVN_CTL_NBR_LENGTH = 10;
			 final int DDEREF_PROC_DT_LENGTH = 10;
			 final int DDEREF_PROC_TM_LENGTH = 8;
			// End of variable declaration

D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcGetNextSqlSectSplit2OutCtx methodOut = methodIn.getProcGetNextSqlSectSplit2OutCtx();
//  MOVE +452 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF DDEREF-PGM-ID-LST-CHAR-VAL TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PGM_ID_LST_CHAR_VAL_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefPgmIdLstCharValGroup(),227,1)); 
          

// * Put marker  :dderef-icn-sufx-vers-nbr
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +500 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)500);
//  MOVE LENGTH OF DDEREF-ICN-SUFX-VERS-NBR TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_ICN_SUFX_VERS_NBR_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefPgmIdLstCharValGroup(),227,1)); 
          

// * Put marker  :dderef-invn-ctl-nbr
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF DDEREF-INVN-CTL-NBR TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_INVN_CTL_NBR_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-INVN-CTL-NBR
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefInvnCtlNbrGroup(),12,10)); 
          

// * -----------------------------------------
// * Put marker  :dderef-proc-dt
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +384 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)384);
//  MOVE LENGTH OF DDEREF-PROC-DT TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PROC_DT_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PROC-DT
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefProcDtGroup(),24,10)); 
          

// * Put marker  :dderef-proc-tm
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +388 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)388);
//  MOVE LENGTH OF DDEREF-PROC-TM TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PROC_TM_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PROC-TM
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefProcTmGroup(),34,8)); 
          

// * Put marker  :dderef-pgm-id-lst-char-val
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF DDEREF-PGM-ID-LST-CHAR-VAL TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PGM_ID_LST_CHAR_VAL_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefPgmIdLstCharValGroup(),227,1)); 
          

// * Put marker  :dderef-icn-sufx-vers-nbr
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +500 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)500);
//  MOVE LENGTH OF DDEREF-ICN-SUFX-VERS-NBR TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_ICN_SUFX_VERS_NBR_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefPgmIdLstCharValGroup(),227,1)); 
          

// * -----------------------------------------
// * Put marker  :dderef-proc-dt
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +384 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)384);
//  MOVE LENGTH OF DDEREF-PROC-DT TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PROC_DT_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PROC-DT
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefProcDtGroup(),24,10)); 
          

// * Put marker  :dderef-proc-tm
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +388 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)388);
//  MOVE LENGTH OF DDEREF-PROC-TM TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PROC_TM_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
      
      return methodOut;
      }
      /**
      * procGetNextSqlSectSplit3 
      *   This method is derived from 
  *   COBOL Paragraph - 3710-PROC-GET-NEXT-SQL-SECT-SPLIT3 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - dderefProcTm                   COBOL Name: DDEREF-PROC-TM
      * - sqln                           COBOL Name: SQLN
      * - sqld                           COBOL Name: SQLD
      * - dderefPgmIdLstCharVal          COBOL Name: DDEREF-PGM-ID-LST-CHAR-VAL
      * - dderefProcDt                   COBOL Name: DDEREF-PROC-DT
      *
      * Output :  

      * - sqlind                         COBOL Name: SQLIND
      * - sqldata                        COBOL Name: SQLDATA
      * - sqln                           COBOL Name: SQLN
      * - sqld                           COBOL Name: SQLD
      * - sqltype                        COBOL Name: SQLTYPE
      * - sqllen                         COBOL Name: SQLLEN
      * - sqlnamel                       COBOL Name: SQLNAMEL
      *
      * @throws CFException
      */
      @Override
      public ProcGetNextSqlSectSplit3OutCtx procGetNextSqlSectSplit3(ProcGetNextSqlSectSplit3InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int DDEREF_PGM_ID_LST_CHAR_VAL_LENGTH = 1;
			 final int DDEREF_PROC_DT_LENGTH = 10;
			 final int DDEREF_PROC_TM_LENGTH = 8;
			// End of variable declaration

D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcGetNextSqlSectSplit3OutCtx methodOut = methodIn.getProcGetNextSqlSectSplit3OutCtx();
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PROC-TM
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefProcTmGroup(),34,8)); 
          

// * Put marker  :dderef-pgm-id-lst-char-val
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF DDEREF-PGM-ID-LST-CHAR-VAL TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PGM_ID_LST_CHAR_VAL_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefPgmIdLstCharValGroup(),227,1)); 
          

// * -----------------------------------------
// * Put marker  :dderef-proc-dt
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +384 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)384);
//  MOVE LENGTH OF DDEREF-PROC-DT TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PROC_DT_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PROC-DT
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefProcDtGroup(),24,10)); 
          

// * Put marker  :dderef-proc-tm
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +388 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)388);
//  MOVE LENGTH OF DDEREF-PROC-TM TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PROC_TM_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PROC-TM
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefProcTmGroup(),34,8)); 
          

// * -----------------------------------------
// * Put marker  :dderef-proc-dt
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +384 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)384);
//  MOVE LENGTH OF DDEREF-PROC-DT TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) DDEREF_PROC_DT_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF DDEREF-PROC-DT
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getDderefProcDtGroup(),24,10)); 
          
      
      return methodOut;
      }
      /**
      * procAuth56SqlSect 
      *   This method is derived from 
  *   COBOL Paragraph - 3720-PROC-AUTH-5-6-SQL-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - queryTextLeng                  COBOL Name: QUERY-TEXT-LENG
      * - queryFilterAuthStart           COBOL Name: QUERY-FILTER-AUTH-START
      * - dt1ReqSearchType               COBOL Name: DT1-REQ-SEARCH-TYPE
      * - queryFilterAuthCrit6           COBOL Name: QUERY-FILTER-AUTH-CRIT-6
      * - sqln                           COBOL Name: SQLN
      * - sqld                           COBOL Name: SQLD
      * - hvAuthNbr                      COBOL Name: HV-AUTH-NBR
      * - queryFilterAuthCrit5           COBOL Name: QUERY-FILTER-AUTH-CRIT-5
      * - queryFilterAuthEnd             COBOL Name: QUERY-FILTER-AUTH-END
      * - queryFilterDlgtStart           COBOL Name: QUERY-FILTER-DLGT-START
      * - queryFilterDlgtCrit5           COBOL Name: QUERY-FILTER-DLGT-CRIT-5
      * - queryFilterDlgtCrit6           COBOL Name: QUERY-FILTER-DLGT-CRIT-6
      * - hvExtrNtfyNbr                  COBOL Name: HV-EXTR-NTFY-NBR
      * - queryFilterAuthBaseEnd         COBOL Name: QUERY-FILTER-AUTH-BASE-END
      *
      * Output :  

      * - i                              COBOL Name: I
      * - queryTextData                  COBOL Name: QUERY-TEXT-DATA
      * - queryFilterAuthStart           COBOL Name: QUERY-FILTER-AUTH-START
      * - queryTextLeng                  COBOL Name: QUERY-TEXT-LENG
      * - queryFilterAuthCrit6           COBOL Name: QUERY-FILTER-AUTH-CRIT-6
      * - sqln                           COBOL Name: SQLN
      * - sqld                           COBOL Name: SQLD
      * - sqltype                        COBOL Name: SQLTYPE
      * - sqllen                         COBOL Name: SQLLEN
      * - sqlnamel                       COBOL Name: SQLNAMEL
      * - sqlind                         COBOL Name: SQLIND
      * - sqldata                        COBOL Name: SQLDATA
      * - queryFilterAuthCrit5           COBOL Name: QUERY-FILTER-AUTH-CRIT-5
      * - queryFilterAuthEnd             COBOL Name: QUERY-FILTER-AUTH-END
      * - queryFilterDlgtStart           COBOL Name: QUERY-FILTER-DLGT-START
      * - queryFilterDlgtCrit5           COBOL Name: QUERY-FILTER-DLGT-CRIT-5
      * - queryFilterDlgtCrit6           COBOL Name: QUERY-FILTER-DLGT-CRIT-6
      * - queryFilterAuthBaseEnd         COBOL Name: QUERY-FILTER-AUTH-BASE-END
      *
      * @throws CFException
      */
      @Override
      public ProcAuth56SqlSectOutCtx procAuth56SqlSect(ProcAuth56SqlSectInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int QUERY_FILTER_AUTH_START_LENGTH = 318;
			 final int QUERY_FILTER_AUTH_CRIT_6_LENGTH = 40;
			 final int HV_AUTH_NBR_LENGTH = 10;
			 final int QUERY_FILTER_AUTH_END_LENGTH = 26;
			 final int QUERY_FILTER_DLGT_START_LENGTH = 194;
			 final int QUERY_FILTER_DLGT_CRIT_6_LENGTH = 44;
			 final int HV_EXTR_NTFY_NBR_LENGTH = 50;
			 final int QUERY_FILTER_AUTH_BASE_END_LENGTH = 1;
			// End of variable declaration

      
// *81***************************************************************
// *81  3720-Proc-auth-5-6-sql-sect                                 *
// *81                                                              *
// *81  business function: add   dynamic sql for options 5 & 6      *
// *82***************************************************************
// *82  called by : 3700-proc-csr-dynam-sql-sect
// *82  calls     : none
// *82***************************************************************
// *================================================================

// * Put - query-filter-auth-start
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcAuth56SqlSectOutCtx methodOut = methodIn.getProcAuth56SqlSectOutCtx();
          methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-AUTH-START TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-AUTH-START )
          methodOut.setQueryTextData(methodOut.getQueryFilterAuthStart(),0,methodOut.getQueryFilterAuthStart().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_FILTER_AUTH_START_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-FILTER-AUTH-START TO QUERY-TEXT-LENG
          methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_FILTER_AUTH_START_LENGTH));

// * Option 6 - specific auth
//  IF DT1-REQ-SEARCH-AUTHS-ONLY
          if ( methodIn.isDt1ReqSearchAuthsOnly()  ) { 
              methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-AUTH-CRIT-6 TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-AUTH-CRIT-6 )
              methodOut.setQueryTextData(methodOut.getQueryFilterAuthCrit6(),0,methodOut.getQueryFilterAuthCrit6().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_FILTER_AUTH_CRIT_6_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-FILTER-AUTH-CRIT-6 TO QUERY-TEXT-LENG
              methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_FILTER_AUTH_CRIT_6_LENGTH));

// * Put marker  :hv-auth-nbr
//  ADD 1 TO SQLN, SQLD
              methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
              methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
              methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF HV-AUTH-NBR TO SQLLEN (SQLN)
              methodOut.setSqllen(methodOut.getSqln() - 1,(short) HV_AUTH_NBR_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
              methodOut.setSqlind(methodOut.getSqln() - 1,0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF HV-AUTH-NBR
              methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getHvAuthNbrGroup(),100,10)); 
              
          }

// * Option 5 - "any"    auth
//  IF DT1-REQ-SEARCH-MBR-AUTH-NBR
          if ( methodIn.isDt1ReqSearchMbrAuthNbr()  ) { 
              methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-AUTH-CRIT-5 TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-AUTH-CRIT-5 )
              methodOut.setQueryTextData(replace(methodOut.getQueryTextData(),methodOut.getQueryFilterAuthCrit5().toCharArray(),(methodOut.getI()-1), (QueryFilterAuthCrit5.getQueryFilterAuthCrit5FieldLength() + (methodOut.getI() - 1)) ));
//  ADD LENGTH OF QUERY-FILTER-AUTH-CRIT-5 TO QUERY-TEXT-LENG
              methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QueryFilterAuthCrit5.getQueryFilterAuthCrit5FieldLength()));
          }
          methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-AUTH-END TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-AUTH-END )
          methodOut.setQueryTextData(methodOut.getQueryFilterAuthEnd(),0,methodOut.getQueryFilterAuthEnd().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_FILTER_AUTH_END_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-FILTER-AUTH-END TO QUERY-TEXT-LENG
          methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_FILTER_AUTH_END_LENGTH));
          methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-DLGT-START TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-DLGT-START )
          methodOut.setQueryTextData(methodOut.getQueryFilterDlgtStart(),0,methodOut.getQueryFilterDlgtStart().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_FILTER_DLGT_START_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-FILTER-DLGT-START TO QUERY-TEXT-LENG
          methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_FILTER_DLGT_START_LENGTH));

// * Option 5 - any dlgt auth
//  IF DT1-REQ-SEARCH-MBR-AUTH-NBR
          if ( methodIn.isDt1ReqSearchMbrAuthNbr()  ) { 
              methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-DLGT-CRIT-5 TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-DLGT-CRIT-5 )
              methodOut.setQueryTextData(replace(methodOut.getQueryTextData(),methodOut.getQueryFilterDlgtCrit5().toCharArray(),(methodOut.getI()-1), (QueryFilterDlgtCrit5.getQueryFilterDlgtCrit5FieldLength() + (methodOut.getI() - 1)) ));
//  ADD LENGTH OF QUERY-FILTER-DLGT-CRIT-5 TO QUERY-TEXT-LENG
              methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QueryFilterDlgtCrit5.getQueryFilterDlgtCrit5FieldLength()));
          }

// * Option 6 -  specific dlgt auth
//  IF DT1-REQ-SEARCH-AUTHS-ONLY
          if ( methodIn.isDt1ReqSearchAuthsOnly()  ) { 
              methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-DLGT-CRIT-6 TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-DLGT-CRIT-6 )
              methodOut.setQueryTextData(methodOut.getQueryFilterDlgtCrit6(),0,methodOut.getQueryFilterDlgtCrit6().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_FILTER_DLGT_CRIT_6_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-FILTER-DLGT-CRIT-6 TO QUERY-TEXT-LENG
              methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_FILTER_DLGT_CRIT_6_LENGTH));

// * Put marker  :hv-extr-ntfy-nbr
//  ADD 1 TO SQLN, SQLD
              methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
              methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
              methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF HV-EXTR-NTFY-NBR TO SQLLEN (SQLN)
              methodOut.setSqllen(methodOut.getSqln() - 1,(short) HV_EXTR_NTFY_NBR_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
              methodOut.setSqlind(methodOut.getSqln() - 1,0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF HV-EXTR-NTFY-NBR
              methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getHvExtrNtfyNbrGroup(),159,50)); 
              
          }
          methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-AUTH-END TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-AUTH-END )
          methodOut.setQueryTextData(methodOut.getQueryFilterAuthEnd(),0,methodOut.getQueryFilterAuthEnd().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_FILTER_AUTH_END_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-FILTER-AUTH-END TO QUERY-TEXT-LENG
          methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_FILTER_AUTH_END_LENGTH));
          methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-AUTH-BASE-END TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-AUTH-END )
          methodOut.setQueryTextData(methodOut.getQueryFilterAuthBaseEnd(),0,methodOut.getQueryFilterAuthBaseEnd().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_FILTER_AUTH_END_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-FILTER-AUTH-BASE-END TO QUERY-TEXT-LENG
          methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_FILTER_AUTH_BASE_END_LENGTH));
      
      return methodOut;
      }
      /**
      * procOption7SqlSect 
      *   This method is derived from 
  *   COBOL Paragraph - 3730-PROC-OPTION-7-SQL-SECT SECTION COBOL Cyclomatic complexity - 7
      * Input  :  

      * - queryTextLeng                  COBOL Name: QUERY-TEXT-LENG
      * - queryFilterSpiStart            COBOL Name: QUERY-FILTER-SPI-START
      * - hvSpiCtgyCd1                   COBOL Name: HV-SPI-CTGY-CD-1
      * - queryFilterSpiPred1            COBOL Name: QUERY-FILTER-SPI-PRED-1
      * - sqln                           COBOL Name: SQLN
      * - sqld                           COBOL Name: SQLD
      * - hvSpiCtgyCd2                   COBOL Name: HV-SPI-CTGY-CD-2
      * - queryFilterSpiPred2            COBOL Name: QUERY-FILTER-SPI-PRED-2
      * - hvSpiCtgyCd3                   COBOL Name: HV-SPI-CTGY-CD-3
      * - queryFilterSpiPred3            COBOL Name: QUERY-FILTER-SPI-PRED-3
      * - hvSpiCtgyCd4                   COBOL Name: HV-SPI-CTGY-CD-4
      * - queryFilterSpiPred4            COBOL Name: QUERY-FILTER-SPI-PRED-4
      * - hvSpiCtgyCd5                   COBOL Name: HV-SPI-CTGY-CD-5
      * - queryFilterSpiPred5            COBOL Name: QUERY-FILTER-SPI-PRED-5
      * - hvSrvcCatgyCd                  COBOL Name: HV-SRVC-CATGY-CD
      * - queryFilterSvcSql              COBOL Name: QUERY-FILTER-SVC-SQL
      * - queryFilterSpiEnd              COBOL Name: QUERY-FILTER-SPI-END
      *
      * Output :  

      * - i                              COBOL Name: I
      * - queryTextData                  COBOL Name: QUERY-TEXT-DATA
      * - queryFilterSpiStart            COBOL Name: QUERY-FILTER-SPI-START
      * - queryTextLeng                  COBOL Name: QUERY-TEXT-LENG
      * - queryFilterSpiPred1            COBOL Name: QUERY-FILTER-SPI-PRED-1
      * - sqln                           COBOL Name: SQLN
      * - sqld                           COBOL Name: SQLD
      * - sqltype                        COBOL Name: SQLTYPE
      * - sqllen                         COBOL Name: SQLLEN
      * - sqlnamel                       COBOL Name: SQLNAMEL
      * - sqlind                         COBOL Name: SQLIND
      * - sqldata                        COBOL Name: SQLDATA
      * - queryFilterSpiPred2            COBOL Name: QUERY-FILTER-SPI-PRED-2
      * - queryFilterSpiPred3            COBOL Name: QUERY-FILTER-SPI-PRED-3
      * - queryFilterSpiPred4            COBOL Name: QUERY-FILTER-SPI-PRED-4
      * - queryFilterSpiPred5            COBOL Name: QUERY-FILTER-SPI-PRED-5
      * - queryFilterSvcSql              COBOL Name: QUERY-FILTER-SVC-SQL
      * - queryFilterSpiEnd              COBOL Name: QUERY-FILTER-SPI-END
      *
      * @throws CFException
      */
      @Override
      public ProcOption7SqlSectOutCtx procOption7SqlSect(ProcOption7SqlSectInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int QUERY_FILTER_SPI_START_LENGTH = 6;
			 final int QUERY_FILTER_SPI_PRED_1_LENGTH = 43;
			 final int HV_SPI_CTGY_CD_1_LENGTH = 2;
			 final int QUERY_FILTER_SPI_PRED_2_LENGTH = 47;
			 final int HV_SPI_CTGY_CD_2_LENGTH = 2;
			 final int QUERY_FILTER_SPI_PRED_3_LENGTH = 47;
			 final int HV_SPI_CTGY_CD_3_LENGTH = 2;
			 final int QUERY_FILTER_SPI_PRED_4_LENGTH = 47;
			 final int HV_SPI_CTGY_CD_4_LENGTH = 2;
			 final int QUERY_FILTER_SPI_PRED_5_LENGTH = 47;
			 final int HV_SPI_CTGY_CD_5_LENGTH = 2;
			 final int HV_SRVC_CATGY_CD_LENGTH = 2;
			 final int QUERY_FILTER_SPI_END_LENGTH = 1;
			// End of variable declaration

      
// *82  Called by : 3700-proc-csr-dynam-sql-sect
// *82  calls     : none
// *82***************************************************************
// *================================================================

// * Put - query-filter-spi-start
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcOption7SqlSectOutCtx methodOut = methodIn.getProcOption7SqlSectOutCtx();
          methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-SPI-START TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-SPI-START )
          methodOut.setQueryTextData(methodOut.getQueryFilterSpiStart(),0,methodOut.getQueryFilterSpiStart().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_FILTER_SPI_START_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-FILTER-SPI-START TO QUERY-TEXT-LENG
          methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_FILTER_SPI_START_LENGTH));

// * Set up spi-category search predicates as requested

// * Put - query-filter-spi-pred-1
//  IF HV-SPI-CTGY-CD-1 > SPACE
          if (             ( isGreaterThanSpaces(methodIn.getHvSpiCtgyCd1()) )) { 
              methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-SPI-PRED-1 TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-SPI-PRED-1 )
              methodOut.setQueryTextData(methodOut.getQueryFilterSpiPred1(),0,methodOut.getQueryFilterSpiPred1().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_FILTER_SPI_PRED_1_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-FILTER-SPI-PRED-1 TO QUERY-TEXT-LENG
              methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_FILTER_SPI_PRED_1_LENGTH));

// * Put marker  :hv-spi-ctgy-cd-1
//  ADD 1 TO SQLN, SQLD
              methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
              methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
              methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF HV-SPI-CTGY-CD-1 TO SQLLEN (SQLN)
              methodOut.setSqllen(methodOut.getSqln() - 1,(short) HV_SPI_CTGY_CD_1_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
              methodOut.setSqlind(methodOut.getSqln() - 1,0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF HV-SPI-CTGY-CD-1
              methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getHvSpiCtgyCd1Group(),112,2)); 
              
          }
//  IF HV-SPI-CTGY-CD-2 > SPACE
          if (             ( isGreaterThanSpaces(methodIn.getHvSpiCtgyCd2()) )) { 
              methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-SPI-PRED-2 TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-SPI-PRED-2 )
              methodOut.setQueryTextData(methodOut.getQueryFilterSpiPred2(),0,methodOut.getQueryFilterSpiPred2().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_FILTER_SPI_PRED_2_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-FILTER-SPI-PRED-2 TO QUERY-TEXT-LENG
              methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_FILTER_SPI_PRED_2_LENGTH));

// * Put marker  :hv-spi-ctgy-cd-2
//  ADD 1 TO SQLN, SQLD
              methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
              methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
              methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF HV-SPI-CTGY-CD-2 TO SQLLEN (SQLN)
              methodOut.setSqllen(methodOut.getSqln() - 1,(short) HV_SPI_CTGY_CD_2_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
              methodOut.setSqlind(methodOut.getSqln() - 1,0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF HV-SPI-CTGY-CD-2
              methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getHvSpiCtgyCd2Group(),114,2)); 
              
          }
//  IF HV-SPI-CTGY-CD-3 > SPACE
          if (             ( isGreaterThanSpaces(methodIn.getHvSpiCtgyCd3()) )) { 
              methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-SPI-PRED-3 TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-SPI-PRED-3 )
              methodOut.setQueryTextData(methodOut.getQueryFilterSpiPred3(),0,methodOut.getQueryFilterSpiPred3().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_FILTER_SPI_PRED_3_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-FILTER-SPI-PRED-3 TO QUERY-TEXT-LENG
              methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_FILTER_SPI_PRED_3_LENGTH));

// * Put marker  :hv-spi-ctgy-cd-3
//  ADD 1 TO SQLN, SQLD
              methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
              methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
              methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF HV-SPI-CTGY-CD-3 TO SQLLEN (SQLN)
              methodOut.setSqllen(methodOut.getSqln() - 1,(short) HV_SPI_CTGY_CD_3_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
              methodOut.setSqlind(methodOut.getSqln() - 1,0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF HV-SPI-CTGY-CD-3
              methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getHvSpiCtgyCd3Group(),116,2)); 
              
          }
//  IF HV-SPI-CTGY-CD-4 > SPACE
          if (             ( isGreaterThanSpaces(methodIn.getHvSpiCtgyCd4()) )) { 
              methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-SPI-PRED-4 TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-SPI-PRED-4 )
              methodOut.setQueryTextData(methodOut.getQueryFilterSpiPred4(),0,methodOut.getQueryFilterSpiPred4().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_FILTER_SPI_PRED_4_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-FILTER-SPI-PRED-4 TO QUERY-TEXT-LENG
              methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_FILTER_SPI_PRED_4_LENGTH));

// * Put marker  :hv-spi-ctgy-cd-4
//  ADD 1 TO SQLN, SQLD
              methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
              methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
              methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF HV-SPI-CTGY-CD-4 TO SQLLEN (SQLN)
              methodOut.setSqllen(methodOut.getSqln() - 1,(short) HV_SPI_CTGY_CD_4_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
              methodOut.setSqlind(methodOut.getSqln() - 1,0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF HV-SPI-CTGY-CD-4
              methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getHvSpiCtgyCd4Group(),118,2)); 
              
          }
//  IF HV-SPI-CTGY-CD-5 > SPACE
          if (             ( isGreaterThanSpaces(methodIn.getHvSpiCtgyCd5()) )) { 
              methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-SPI-PRED-5 TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-SPI-PRED-5 )
              methodOut.setQueryTextData(methodOut.getQueryFilterSpiPred5(),0,methodOut.getQueryFilterSpiPred5().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_FILTER_SPI_PRED_5_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-FILTER-SPI-PRED-5 TO QUERY-TEXT-LENG
              methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_FILTER_SPI_PRED_5_LENGTH));

// * Put marker  :hv-spi-ctgy-cd-5
//  ADD 1 TO SQLN, SQLD
              methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
              methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
              methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF HV-SPI-CTGY-CD-5 TO SQLLEN (SQLN)
              methodOut.setSqllen(methodOut.getSqln() - 1,(short) HV_SPI_CTGY_CD_5_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
              methodOut.setSqlind(methodOut.getSqln() - 1,0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF HV-SPI-CTGY-CD-5
              methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getHvSpiCtgyCd5Group(),120,2)); 
              
          }

// * Set up service-cat search predicates when requested

// * Put - query-filter-svc-sql
//  IF HV-SRVC-CATGY-CD > SPACE
          if (             ( isGreaterThanSpaces(methodIn.getHvSrvcCatgyCd()) )) { 
              methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-SVC-SQL TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-SVC-SQL )
              methodOut.setQueryTextData(replace(methodOut.getQueryTextData(),methodOut.getQueryFilterSvcSql().toCharArray(),(methodOut.getI()-1), (QueryFilterSvcSql.getQueryFilterSvcSqlFieldLength() + (methodOut.getI() - 1)) ));
//  ADD LENGTH OF QUERY-FILTER-SVC-SQL TO QUERY-TEXT-LENG
              methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QueryFilterSvcSql.getQueryFilterSvcSqlFieldLength()));

// * Put marker  :hv-srvc-catgy-cd
//  ADD 1 TO SQLN, SQLD
              methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
              methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
              methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF HV-SRVC-CATGY-CD TO SQLLEN (SQLN)
              methodOut.setSqllen(methodOut.getSqln() - 1,(short) HV_SRVC_CATGY_CD_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
              methodOut.setSqlind(methodOut.getSqln() - 1,0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF HV-SRVC-CATGY-CD
              methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getHvSrvcCatgyCdGroup(),110,2)); 
              
          }
          methodOut.setI((short) (methodOut.getQueryTextLeng() + 1));
//  MOVE QUERY-FILTER-SPI-END TO QUERY-TEXT-DATA (I : LENGTH OF QUERY-FILTER-SPI-END )
          methodOut.setQueryTextData(methodOut.getQueryFilterSpiEnd(),0,methodOut.getQueryFilterSpiEnd().length,(methodOut.getI()-1)/* queryTextData */ ,QUERY_FILTER_SPI_END_LENGTH /* field,targetIndex,targetLen */);
//  ADD LENGTH OF QUERY-FILTER-SPI-END TO QUERY-TEXT-LENG
          methodOut.setQueryTextLeng( (short) (methodOut.getQueryTextLeng()+(short) QUERY_FILTER_SPI_END_LENGTH));
      
      return methodOut;
      }
      /**
      * searchMemberPlusSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4000-SEARCH-MEMBER-PLUS-SECT SECTION COBOL Cyclomatic complexity - 18
      * Input  :  

      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - queryFilterInd                 COBOL Name: QUERY-FILTER-IND
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void searchMemberPlusSect(SearchMemberPlusSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4000-Search-member-plus-sect                                *
// *81                                                              *
// *81  business function: get claims from cursor (init/next)       *
// *82***************************************************************
// *82  called by : 0000-mainline section                           *
// *82            : 1000-search-icn-only-sect                       *
// *82  calls     : 4100-proc-csr-init-full-sect                    *
// *82            : 4200-proc-csr-init-filt-sect                    *
// *82            : 4300-proc-csr-next-full-sect                    *
// *82            : 4400-proc-csr-next-filt-sect                    *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
//  IF DT1-REQ-START-AT-TOP
          if ( methodIn.isDt1ReqStartAtTop()  ) { 
//  IF QUERY-FILTER-NO
              if ( methodIn.isQueryFilterNo()  ) { 
//  PERFORM 4100-PROC-CSR-INIT-FULL-SECT
                  procCsrInitFullSect(programCtx.getProcCsrInitFullSectInCtx());/*4100-PROC-CSR-INIT-FULL-SECT SECTION*/
              }
//  ELSE
              else { 
//  EVALUATE TRUE
                  if  ( methodIn.isQueryFilterSrvcDtOnly()  ) { 
//  PERFORM 4200-PROC-CSR-INIT-FILT-SECT
                      procCsrInitFiltSect(programCtx.getProcCsrInitFiltSectInCtx());/*4200-PROC-CSR-INIT-FILT-SECT SECTION*/
                  }
                  else if  ( methodIn.isQueryFilterSrvcDtProv()  ) { 
//  PERFORM 3200-PROC-CSR-INIT-FIL2-SECT
                      procCsrInitFil2Sect(programCtx.getProcCsrInitFil2SectInCtx());/*3200-PROC-CSR-INIT-FIL2-SECT SECTION*/
                  }
                  else if  ( methodIn.isQueryFilterAllRevOop()  ) { 
//  PERFORM 4700-PROC-CSR-INIT-FIL3-SECT
                      procCsrInitFil3Sect(programCtx.getProcCsrInitFil3SectInCtx());/*4700-PROC-CSR-INIT-FIL3-SECT SECTION*/
                  }
                  else if  ( methodIn.isQueryFilterAllRev()  ) { 
//  PERFORM 5100-PROC-CSR-INIT-FIL5-SECT
                      procCsrInitFil5Sect(programCtx.getProcCsrInitFil5SectInCtx());/*5100-PROC-CSR-INIT-FIL5-SECT SECTION*/
                  }
                  else if  ( methodIn.isQueryFilterAllCptOop()  ) { 
//  PERFORM 4900-PROC-CSR-INIT-FIL4-SECT
                      procCsrInitFil4Sect(programCtx.getProcCsrInitFil4SectInCtx());/*4900-PROC-CSR-INIT-FIL4-SECT SECTION*/
                  }
                  else if  ( methodIn.isQueryFilterAllCpt()  ) { 
//  PERFORM 5300-PROC-CSR-INIT-FIL6-SECT
                      procCsrInitFil6Sect(programCtx.getProcCsrInitFil6SectInCtx());/*5300-PROC-CSR-INIT-FIL6-SECT SECTION*/
                  }
                  else   { 
//  PERFORM 6200-PROC-DYN-CURSOR-SECT
                      procDynCursorSect(programCtx.getProcDynCursorSectInCtx());/*6200-PROC-DYN-CURSOR-SECT SECTION*/
                  }
              }
          }
//  ELSE
          else { 
//  IF QUERY-FILTER-NO
              if ( methodIn.isQueryFilterNo()  ) { 
//  PERFORM 4300-PROC-CSR-NEXT-FULL-SECT
                  procCsrNextFullSect(programCtx.getProcCsrNextFullSectInCtx());/*4300-PROC-CSR-NEXT-FULL-SECT SECTION*/
              }
//  ELSE
              else { 
//  EVALUATE TRUE
                  if  ( methodIn.isQueryFilterSrvcDtOnly()  ) { 
//  PERFORM 4400-PROC-CSR-NEXT-FILT-SECT
                      procCsrNextFiltSect(programCtx.getProcCsrNextFiltSectInCtx());/*4400-PROC-CSR-NEXT-FILT-SECT SECTION*/
                  }
                  else if  ( methodIn.isQueryFilterSrvcDtProv()  ) { 
//  PERFORM 3400-PROC-CSR-NEXT-FIL2-SECT
                      procCsrNextFil2Sect(programCtx.getProcCsrNextFil2SectInCtx());/*3400-PROC-CSR-NEXT-FIL2-SECT SECTION*/
                  }
                  else if  ( methodIn.isQueryFilterAllRevOop()  ) { 
//  PERFORM 4800-PROC-CSR-NEXT-FIL3-SECT
                      procCsrNextFil3Sect(programCtx.getProcCsrNextFil3SectInCtx());/*4800-PROC-CSR-NEXT-FIL3-SECT SECTION*/
                  }
                  else if  ( methodIn.isQueryFilterAllRev()  ) { 
//  PERFORM 5200-PROC-CSR-NEXT-FIL5-SECT
                      procCsrNextFil5Sect(programCtx.getProcCsrNextFil5SectInCtx());/*5200-PROC-CSR-NEXT-FIL5-SECT SECTION*/
                  }
                  else if  ( methodIn.isQueryFilterAllCptOop()  ) { 
//  PERFORM 5000-PROC-CSR-NEXT-FIL4-SECT
                      procCsrNextFil4Sect(programCtx.getProcCsrNextFil4SectInCtx());/*5000-PROC-CSR-NEXT-FIL4-SECT SECTION*/
                  }
                  else if  ( methodIn.isQueryFilterAllCpt()  ) { 
//  PERFORM 5400-PROC-CSR-NEXT-FIL6-SECT
                      procCsrNextFil6Sect(programCtx.getProcCsrNextFil6SectInCtx());/*5400-PROC-CSR-NEXT-FIL6-SECT SECTION*/
                  }
                  else   { 
//  PERFORM 6200-PROC-DYN-CURSOR-SECT
                      procDynCursorSect(programCtx.getProcDynCursorSectInCtx());/*6200-PROC-DYN-CURSOR-SECT SECTION*/
                  }
              }
          }
      
      }
      /**
      * procCsrInitFullSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4100-PROC-CSR-INIT-FULL-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * @throws CFException
      */
      @Override
      public ProcCsrInitFullSectOutCtx procCsrInitFullSect(ProcCsrInitFullSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4100-Proc-csr-init-full-sect                                *
// *81                                                              *
// *81  business function: declare and open full-init cursor        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4000-search-member-plus-sect                    *
// *82  calls     : 4100-proc-csr-init-full-sect                    *
// *82            : 4110-open-csr-init-full-sect                    *
// *82            : 4120-fetch-csr-init-full-sect                   *
// *82            : 4130-close-csr-init-full-sect                   *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcCsrInitFullSectOutCtx methodOut = methodIn.getProcCsrInitFullSectOutCtx();
//  PERFORM 4110-OPEN-CSR-INIT-FULL-SECT
          openCsrInitFullSect(programCtx.getOpenCsrInitFullSectInCtx());/*4110-OPEN-CSR-INIT-FULL-SECT SECTION*/
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
              methodOut.setClmHstEndOfFetchNoTrue(); 
              
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
              while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodIn.isDt1RspOk()  )) {
//  PERFORM 4120-FETCH-CSR-INIT-FULL-SECT
                  fetchCsrInitFullSect(programCtx);/*4120-FETCH-CSR-INIT-FULL-SECT SECTION*/
              }
          }
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  PERFORM 4130-CLOSE-CSR-INIT-FULL-SECT
              closeCsrInitFullSect(programCtx.getCloseCsrInitFullSectInCtx());/*4130-CLOSE-CSR-INIT-FULL-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * openCsrInitFullSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4110-OPEN-CSR-INIT-FULL-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dderefPolNbr                   COBOL Name: DDEREF-POL-NBR
      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dderefEeId                     COBOL Name: DDEREF-EE-ID
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dderefDepnNbr                  COBOL Name: DDEREF-DEPN-NBR
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public OpenCsrInitFullSectOutCtx openCsrInitFullSect(OpenCsrInitFullSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4110-Open-csr-init-full-sect                                *
// *81                                                              *
// *81  business function: declare and open csr-init-full           *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4100-proc-csr-init-full-sect                    *
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
OpenCsrInitFullSectOutCtx methodOut = methodIn.getOpenCsrInitFullSectOutCtx();
//  MOVE DT1-REQ-POLICY TO DDEREF-POL-NBR
          methodOut.setDderefPolNbr(methodOut.getDt1ReqPolicy());
//  MOVE DT1-REQ-EMPID TO DDEREF-EE-ID
          methodOut.setDderefEeId(methodOut.getDt1ReqEmpid());
//  MOVE DT1-REQ-DEP-NBR (2 : 2) TO DDEREF-DEPN-NBR (1 : 2)
          methodOut.setDderefDepnNbr(replace(methodOut.getDderefDepnNbr(),String.valueOf(substring(methodOut.getDt1ReqDepNbrString(),1,3)).toCharArray(),0,2));
//  IF DDEREF-DEPN-NBR = 99
//  LITERAL_99 = 99
          if (compareChars(methodOut.getDderefDepnNbr(),CONSTANTS.LITERAL_99) == 0) { 
//  MOVE ZERO TO DDEREF-DEPN-NBR
              methodOut.setDderefDepnNbr(CONSTANTS.ZERO_2);
          }
//  WITH CLM_HST_TABLE ( PARTN_ID , PARTN_VAL , PROC_DT , PROC_TM , ICN_SUFX_VERS_NBR , INVN_CTL_NBR , ICN_SUFX_CD ) AS ( SELECT DISTINCT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD FROM ADJD_CLMHST_DENORM_REF REF WHERE REF.POL_NBR = ? AND REF.EE_ID = ? AND REF.DEPN_NBR = ? ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC FETCH FIRST 500 ROWS ONLY ) SELECT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.PGM_ID_LST_CHAR_VAL , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , REF.LN_ID , REF.FLN_JULIAN_DT_NBR , REF.FLN_SRL_NBR , REF.DFT_NBR , REF.FST_DT , REF.LST_SRVC_DT , REF.PROV_TINSUFF , REF.PROV_SCRN_NBR , REF.CHRG_AMT , REF.RMRK_CD , REF.NC_AMT , REF.PMT_SVC_CD , REF.OVR_CD , REF.COPAY_AMT , REF.SRVC_CD , REF.PAY_CD , REF.TRANS_CD , HDR.FILM_OFC_NBR , HDR.CLM_LVL_RSN_CD , HDR.ADJTR_ID , HDR.MBR_PRV_IND , HDR.NTFY_WAIV_CD , HDR.BANK_CD , HDR.DIV_NBR , HDR.CLS_NBR , HDR.DRG_NBR , HDR.FACL_OR_PROF_CD , BKE.DLGT_ENTY_CD , BK2.NDB_CONTR_ID , BK2.CLM_SMB_TYP_APP_CD , BK2.SMB_ST_CD , DLN.PROC_T1_IND , DLN.AUTH_NBR , DLN.BASE_DED_DESC_TXT , DLN.MM_DED_DESC_TXT , DLN.PRS_CREAT_SRC_CD , DLN.BASE_DED_AMT , DLN.BASE_AMT , DLN.MM_DED_AMT , DLN.MM_AMT , DLN.MC_CR_RES_AMT , DLN.COB_CR_RES_AMT , DLN.PAR_IND , DLN.SUP_AMT , DLN.PROV_MKT_NBR , DLN.PPO_CD , DLN.PTNT_RESP_AMT , LNE.AUTH_SRC_ID , LNE.AUTH_PROC_CD , PRV.PROV_NM , PRV.PROV_EOB_NM , PRV.PROV_PRDCT_CD , PRV.PROV_MKT_TYP_CD , PRV.PROV_IPA_ID , PRV.TPSM_CD , PRV.PROV_SPCL_CD , IFNULL ( ( SELECT PR1.PROV_MEDCD_RECLM_IND FROM ADJD_CLMSF_PROV PR1 WHERE REF.PARTN_ID = PR1.PARTN_ID AND REF.PARTN_VAL = PR1.PARTN_VAL AND REF.INVN_CTL_NBR = PR1.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PR1.ICN_SUFX_CD AND REF.PROC_DT = PR1.PROC_DT AND REF.PROC_TM = PR1.PROC_TM AND PR1.PROV_MEDCD_RECLM_IND = 'Y' ORDER BY LST_UPDT_DTTM DESC FETCH FIRST 1 ROW ONLY ) , ' ' ) , IFNULL ( ( SELECT REL.REL_SRVC_CLM_LVL_IND FROM ADJD_CLMSFLN_REL_SRVCS REL WHERE REF.PARTN_ID = REL.PARTN_ID AND REF.PARTN_VAL = REL.PARTN_VAL AND REF.INVN_CTL_NBR = REL.INVN_CTL_NBR AND REF.ICN_SUFX_CD = REL.ICN_SUFX_CD AND REF.PROC_DT = REL.PROC_DT AND REF.PROC_TM = REL.PROC_TM AND REF.ICN_SUFX_VERS_NBR = REL.ICN_SUFX_VERS_NBR AND REF.LN_ID = REL.LN_ID FETCH FIRST 1 ROWS ONLY ) , ' ' ) , IFNULL ( DIA.DIAG_CD , '       ' ) , ( SELECT COUNT ( DISTINCT AUTH_NBR ) FROM ADJD_CLMHST_DENORM_LN DLN2 WHERE REF.PARTN_ID = DLN2.PARTN_ID AND REF.PARTN_VAL = DLN2.PARTN_VAL AND REF.INVN_CTL_NBR = DLN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN2.ICN_SUFX_CD AND REF.PROC_DT = DLN2.PROC_DT AND REF.PROC_TM = DLN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR AND ' ' < DLN2.AUTH_NBR ) , ( SELECT SUM ( PHYS_MEDCN_MSK_CNT ) FROM ADJD_CLMSF_LN2 LN2 WHERE REF.PARTN_ID = LN2.PARTN_ID AND REF.PARTN_VAL = LN2.PARTN_VAL AND REF.INVN_CTL_NBR = LN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LN2.ICN_SUFX_CD AND REF.PROC_DT = LN2.PROC_DT AND REF.PROC_TM = LN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR ) FROM CLM_HST_TABLE HST INNER JOIN ADJD_CLMHST_DENORM_REF REF ON REF.PARTN_ID = HST.PARTN_ID AND REF.PARTN_VAL = HST.PARTN_VAL AND REF.PROC_DT = HST.PROC_DT AND REF.PROC_TM = HST.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR AND REF.INVN_CTL_NBR = HST.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HST.ICN_SUFX_CD INNER JOIN ADJD_CLMHST_DENORM_HDR HDR ON REF.PARTN_ID = HDR.PARTN_ID AND REF.PARTN_VAL = HDR.PARTN_VAL AND REF.INVN_CTL_NBR = HDR.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HDR.ICN_SUFX_CD AND REF.PROC_DT = HDR.PROC_DT AND REF.PROC_TM = HDR.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E BKE ON REF.PARTN_ID = BKE.PARTN_ID AND REF.PARTN_VAL = BKE.PARTN_VAL AND REF.INVN_CTL_NBR = BKE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BKE.ICN_SUFX_CD AND REF.PROC_DT = BKE.PROC_DT AND REF.PROC_TM = BKE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E2 BK2 ON REF.PARTN_ID = BK2.PARTN_ID AND REF.PARTN_VAL = BK2.PARTN_VAL AND REF.INVN_CTL_NBR = BK2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BK2.ICN_SUFX_CD AND REF.PROC_DT = BK2.PROC_DT AND REF.PROC_TM = BK2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMHST_DENORM_LN DLN ON REF.PARTN_ID = DLN.PARTN_ID AND REF.PARTN_VAL = DLN.PARTN_VAL AND REF.INVN_CTL_NBR = DLN.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN.ICN_SUFX_CD AND REF.PROC_DT = DLN.PROC_DT AND REF.PROC_TM = DLN.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR AND REF.LN_ID = DLN.LN_ID INNER JOIN ADJD_CLMSF_PROV PRV ON REF.PARTN_ID = PRV.PARTN_ID AND REF.PARTN_VAL = PRV.PARTN_VAL AND REF.INVN_CTL_NBR = PRV.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PRV.ICN_SUFX_CD AND REF.PROC_DT = PRV.PROC_DT AND REF.PROC_TM = PRV.PROC_TM AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR AND REF.PROV_SCRN_NBR = PRV.PROV_SEQ_NBR INNER JOIN ADJD_CLMSF_LN LNE ON REF.PARTN_ID = LNE.PARTN_ID AND REF.PARTN_VAL = LNE.PARTN_VAL AND REF.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND REF.PROC_DT = LNE.PROC_DT AND REF.PROC_TM = LNE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND REF.LN_ID = LNE.LN_ID LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA ON REF.PARTN_ID = DIA.PARTN_ID AND REF.PARTN_VAL = DIA.PARTN_VAL AND REF.INVN_CTL_NBR = DIA.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DIA.ICN_SUFX_CD AND REF.PROC_DT = DIA.PROC_DT AND REF.PROC_TM = DIA.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR AND 1 = DIA.DIAG_SEQ_NBR ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.PGM_ID_LST_CHAR_VAL DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC , REF.LN_ID DESC OPTIMIZE FOR 600 ROWS FETCH FIRST 600 ROWS ONLY WITH UR
          programCtx.setCsrInitFullResultSet(d5427dt1Repository.openCsrInitFullD5427dt1(methodOut.getDcladjdClmhstDenormRef(),programCtx.getSqlca()));
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = ZERO
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '4110-OPE' TO DB2-PARAGRAPH
//  LITERAL_4110_MN_OPE = '4110-OPE'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4110_MN_OPE);
//  MOVE 'OPEN   ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_OPEN_B6_);
//  MOVE 'CSR-INIT-FULL' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFULL_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrInitFullSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4120-FETCH-CSR-INIT-FULL-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrInitFullSectOutCtx fetchCsrInitFullSect(D5427dt1Ctx programCtx) throws Exception {
      
// *81***************************************************************
// *81  4120-Fetch-hst-init-full-sect                               *
// *81                                                              *
// *81  business function: fetch claim lines                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4100-proc-csr-init-full-sect                    *
// *82  calls     : 4121-fetch-csr-rows-sect                        *
// *82***************************************************************
// *================================================================
FetchCsrInitFullSectOutCtx methodOut = programCtx.getFetchCsrInitFullSectOutCtx();
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
          methodOut.setClmHstEndOfFetchNoTrue(); 
          
//  SET DT1-RSP-OK TO TRUE
          methodOut.setDt1RspOkTrue(); 
          
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
          while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodOut.isDt1RspOk()  )) {
//  PERFORM 4121-FETCH-CSR-ROWS-SECT
              fetchCsrRowsSect4121(programCtx.getFetchCsrRowsSect4121InCtx());/*4121-FETCH-CSR-ROWS-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrRowsSect4121 
      *   This method is derived from 
  *   COBOL Paragraph - 4121-FETCH-CSR-ROWS-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrRowsSect4121OutCtx fetchCsrRowsSect4121(FetchCsrRowsSect4121InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4121-Fetch-csr-rows-sect                                    *
// *81                                                              *
// *81  business function: fetch cursor rows                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4120-fetch-csr-init-full-sect                   *
// *82  calls     : 4500-proc-fetched-rows-sect                     *
// *82            : 9100-database-error-sect                        *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
FetchCsrRowsSect4121OutCtx methodOut = methodIn.getFetchCsrRowsSect4121OutCtx();
//  FETCH NEXT ROWSET FROM CSR-INIT-FULL FOR ? ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d5427dt1Repository.fetchCsrInitFullD5427dt1(programCtx.getCsrInitFullResultSet(),methodOut.getHvaClmHistArray(),methodIn.getWork(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  (( methodOut.isSqlcodeOk()  ) || ( methodOut.isSqlcodeFetchEnd()  )) { 
//  PERFORM 4500-PROC-FETCHED-ROWS-SECT
              procFetchedRowsSect(programCtx.getProcFetchedRowsSectInCtx());/*4500-PROC-FETCHED-ROWS-SECT SECTION*/
          }
          else   { 
//  MOVE '4121-FET' TO DB2-PARAGRAPH
//  LITERAL_4121_MN_FET = '4121-FET'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4121_MN_FET);
//  MOVE 'FETCH  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_FETCH_B5_);
//  MOVE 'CSR-INIT-FULL' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFULL_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsrInitFullSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4130-CLOSE-CSR-INIT-FULL-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public CloseCsrInitFullSectOutCtx closeCsrInitFullSect(CloseCsrInitFullSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4130-Close-csr-init-full-sect                               *
// *81                                                              *
// *81  business function: close the claim list cursor              *
// *82***************************************************************
// *82  called by : 4100-proc-csr-init-full-sect
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
CloseCsrInitFullSectOutCtx methodOut = methodIn.getCloseCsrInitFullSectOutCtx();
//  CLOSE CSR-INIT-FULL
          d5427dt1Repository.closeCsrInitFullD5427dt1(programCtx.getCsrInitFullResultSet(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = +0 OR SQLCODE = -501
//  ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != -501 )) { 
//  MOVE '4130-CLO' TO DB2-PARAGRAPH
//  LITERAL_4130_MN_CLO = '4130-CLO'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4130_MN_CLO);
//  MOVE 'CLOSE  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_CLOSE_B5_);
//  MOVE 'CSR-INIT-FULL' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFULL_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * procCsrInitFiltSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4200-PROC-CSR-INIT-FILT-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * @throws CFException
      */
      @Override
      public ProcCsrInitFiltSectOutCtx procCsrInitFiltSect(ProcCsrInitFiltSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4200-Proc-csr-init-filt-sect                                *
// *81                                                              *
// *81  business function: declare and open full-next cursor        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4000-search-member-plus-sect                    *
// *82  calls     : 4210-open-csr-init-filt-sect
// *82            : 4220-fetch-csr-init-filt-sect
// *82            : 4230-close-csr-init-filt-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcCsrInitFiltSectOutCtx methodOut = methodIn.getProcCsrInitFiltSectOutCtx();
//  PERFORM 4210-OPEN-CSR-INIT-FILT-SECT
          openCsrInitFiltSect(programCtx.getOpenCsrInitFiltSectInCtx());/*4210-OPEN-CSR-INIT-FILT-SECT SECTION*/
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
              methodOut.setClmHstEndOfFetchNoTrue(); 
              
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
              while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodIn.isDt1RspOk()  )) {
//  PERFORM 4220-FETCH-CSR-INIT-FILT-SECT
                  fetchCsrInitFiltSect(programCtx);/*4220-FETCH-CSR-INIT-FILT-SECT SECTION*/
              }
          }
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  PERFORM 4230-CLOSE-CSR-INIT-FILT-SECT
              closeCsrInitFiltSect(programCtx.getCloseCsrInitFiltSectInCtx());/*4230-CLOSE-CSR-INIT-FILT-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * openCsrInitFiltSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4210-OPEN-CSR-INIT-FILT-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dderefPolNbr                   COBOL Name: DDEREF-POL-NBR
      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dderefEeId                     COBOL Name: DDEREF-EE-ID
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dderefDepnNbr                  COBOL Name: DDEREF-DEPN-NBR
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public OpenCsrInitFiltSectOutCtx openCsrInitFiltSect(OpenCsrInitFiltSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4210-Open-csr-init-filt-sect                                *
// *81                                                              *
// *81  business function: declare and open csr-init-filt           *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4200-proc-csr-init-filt-sect                    *
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
OpenCsrInitFiltSectOutCtx methodOut = methodIn.getOpenCsrInitFiltSectOutCtx();
//  MOVE DT1-REQ-POLICY TO DDEREF-POL-NBR
          methodOut.setDderefPolNbr(methodOut.getDt1ReqPolicy());
//  MOVE DT1-REQ-EMPID TO DDEREF-EE-ID
          methodOut.setDderefEeId(methodOut.getDt1ReqEmpid());
//  MOVE DT1-REQ-DEP-NBR (2 : 2) TO DDEREF-DEPN-NBR (1 : 2)
          methodOut.setDderefDepnNbr(replace(methodOut.getDderefDepnNbr(),String.valueOf(substring(methodOut.getDt1ReqDepNbrString(),1,3)).toCharArray(),0,2));
//  IF DDEREF-DEPN-NBR = 99
//  LITERAL_99 = 99
          if (compareChars(methodOut.getDderefDepnNbr(),CONSTANTS.LITERAL_99) == 0) { 
//  MOVE ZERO TO DDEREF-DEPN-NBR
              methodOut.setDderefDepnNbr(CONSTANTS.ZERO_2);
          }
//  WITH CLM_HST_TABLE ( PARTN_ID , PARTN_VAL , PROC_DT , PROC_TM , ICN_SUFX_VERS_NBR , INVN_CTL_NBR , ICN_SUFX_CD ) AS ( SELECT DISTINCT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD FROM ADJD_CLMHST_DENORM_REF REF WHERE REF.POL_NBR = ? AND REF.EE_ID = ? AND REF.DEPN_NBR = ? AND ? >= REF.FST_DT AND ? <= REF.LST_SRVC_DT ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC FETCH FIRST 500 ROWS ONLY ) SELECT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.PGM_ID_LST_CHAR_VAL , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , REF.LN_ID , REF.FLN_JULIAN_DT_NBR , REF.FLN_SRL_NBR , REF.DFT_NBR , REF.FST_DT , REF.LST_SRVC_DT , REF.PROV_TINSUFF , REF.PROV_SCRN_NBR , REF.CHRG_AMT , REF.RMRK_CD , REF.NC_AMT , REF.PMT_SVC_CD , REF.OVR_CD , REF.COPAY_AMT , REF.SRVC_CD , REF.PAY_CD , REF.TRANS_CD , HDR.FILM_OFC_NBR , HDR.CLM_LVL_RSN_CD , HDR.ADJTR_ID , HDR.MBR_PRV_IND , HDR.NTFY_WAIV_CD , HDR.BANK_CD , HDR.DIV_NBR , HDR.CLS_NBR , HDR.DRG_NBR , HDR.FACL_OR_PROF_CD , BKE.DLGT_ENTY_CD , BK2.NDB_CONTR_ID , BK2.CLM_SMB_TYP_APP_CD , BK2.SMB_ST_CD , DLN.PROC_T1_IND , DLN.AUTH_NBR , DLN.BASE_DED_DESC_TXT , DLN.MM_DED_DESC_TXT , DLN.PRS_CREAT_SRC_CD , DLN.BASE_DED_AMT , DLN.BASE_AMT , DLN.MM_DED_AMT , DLN.MM_AMT , DLN.MC_CR_RES_AMT , DLN.COB_CR_RES_AMT , DLN.PAR_IND , DLN.SUP_AMT , DLN.PROV_MKT_NBR , DLN.PPO_CD , DLN.PTNT_RESP_AMT , LNE.AUTH_SRC_ID , LNE.AUTH_PROC_CD , PRV.PROV_NM , PRV.PROV_EOB_NM , PRV.PROV_PRDCT_CD , PRV.PROV_MKT_TYP_CD , PRV.PROV_IPA_ID , PRV.TPSM_CD , PRV.PROV_SPCL_CD , IFNULL ( ( SELECT PR1.PROV_MEDCD_RECLM_IND FROM ADJD_CLMSF_PROV PR1 WHERE REF.PARTN_ID = PR1.PARTN_ID AND REF.PARTN_VAL = PR1.PARTN_VAL AND REF.INVN_CTL_NBR = PR1.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PR1.ICN_SUFX_CD AND REF.PROC_DT = PR1.PROC_DT AND REF.PROC_TM = PR1.PROC_TM AND PR1.PROV_MEDCD_RECLM_IND = 'Y' ORDER BY LST_UPDT_DTTM DESC FETCH FIRST 1 ROW ONLY ) , ' ' ) , IFNULL ( ( SELECT REL.REL_SRVC_CLM_LVL_IND FROM ADJD_CLMSFLN_REL_SRVCS REL WHERE REF.PARTN_ID = REL.PARTN_ID AND REF.PARTN_VAL = REL.PARTN_VAL AND REF.INVN_CTL_NBR = REL.INVN_CTL_NBR AND REF.ICN_SUFX_CD = REL.ICN_SUFX_CD AND REF.PROC_DT = REL.PROC_DT AND REF.PROC_TM = REL.PROC_TM AND REF.ICN_SUFX_VERS_NBR = REL.ICN_SUFX_VERS_NBR AND REF.LN_ID = REL.LN_ID FETCH FIRST 1 ROWS ONLY ) , ' ' ) , IFNULL ( DIA.DIAG_CD , '       ' ) , ( SELECT COUNT ( DISTINCT AUTH_NBR ) FROM ADJD_CLMHST_DENORM_LN DLN2 WHERE REF.PARTN_ID = DLN2.PARTN_ID AND REF.PARTN_VAL = DLN2.PARTN_VAL AND REF.INVN_CTL_NBR = DLN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN2.ICN_SUFX_CD AND REF.PROC_DT = DLN2.PROC_DT AND REF.PROC_TM = DLN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR AND ' ' < DLN2.AUTH_NBR ) , ( SELECT SUM ( PHYS_MEDCN_MSK_CNT ) FROM ADJD_CLMSF_LN2 LN2 WHERE REF.PARTN_ID = LN2.PARTN_ID AND REF.PARTN_VAL = LN2.PARTN_VAL AND REF.INVN_CTL_NBR = LN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LN2.ICN_SUFX_CD AND REF.PROC_DT = LN2.PROC_DT AND REF.PROC_TM = LN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR ) FROM CLM_HST_TABLE HST INNER JOIN ADJD_CLMHST_DENORM_REF REF ON REF.PARTN_ID = HST.PARTN_ID AND REF.PARTN_VAL = HST.PARTN_VAL AND REF.PROC_DT = HST.PROC_DT AND REF.PROC_TM = HST.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR AND REF.INVN_CTL_NBR = HST.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HST.ICN_SUFX_CD INNER JOIN ADJD_CLMHST_DENORM_HDR HDR ON REF.PARTN_ID = HDR.PARTN_ID AND REF.PARTN_VAL = HDR.PARTN_VAL AND REF.INVN_CTL_NBR = HDR.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HDR.ICN_SUFX_CD AND REF.PROC_DT = HDR.PROC_DT AND REF.PROC_TM = HDR.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E BKE ON REF.PARTN_ID = BKE.PARTN_ID AND REF.PARTN_VAL = BKE.PARTN_VAL AND REF.INVN_CTL_NBR = BKE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BKE.ICN_SUFX_CD AND REF.PROC_DT = BKE.PROC_DT AND REF.PROC_TM = BKE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E2 BK2 ON REF.PARTN_ID = BK2.PARTN_ID AND REF.PARTN_VAL = BK2.PARTN_VAL AND REF.INVN_CTL_NBR = BK2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BK2.ICN_SUFX_CD AND REF.PROC_DT = BK2.PROC_DT AND REF.PROC_TM = BK2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMHST_DENORM_LN DLN ON REF.PARTN_ID = DLN.PARTN_ID AND REF.PARTN_VAL = DLN.PARTN_VAL AND REF.INVN_CTL_NBR = DLN.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN.ICN_SUFX_CD AND REF.PROC_DT = DLN.PROC_DT AND REF.PROC_TM = DLN.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR AND REF.LN_ID = DLN.LN_ID INNER JOIN ADJD_CLMSF_PROV PRV ON REF.PARTN_ID = PRV.PARTN_ID AND REF.PARTN_VAL = PRV.PARTN_VAL AND REF.INVN_CTL_NBR = PRV.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PRV.ICN_SUFX_CD AND REF.PROC_DT = PRV.PROC_DT AND REF.PROC_TM = PRV.PROC_TM AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR AND REF.PROV_SCRN_NBR = PRV.PROV_SEQ_NBR INNER JOIN ADJD_CLMSF_LN LNE ON REF.PARTN_ID = LNE.PARTN_ID AND REF.PARTN_VAL = LNE.PARTN_VAL AND REF.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND REF.PROC_DT = LNE.PROC_DT AND REF.PROC_TM = LNE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND REF.LN_ID = LNE.LN_ID LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA ON REF.PARTN_ID = DIA.PARTN_ID AND REF.PARTN_VAL = DIA.PARTN_VAL AND REF.INVN_CTL_NBR = DIA.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DIA.ICN_SUFX_CD AND REF.PROC_DT = DIA.PROC_DT AND REF.PROC_TM = DIA.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR AND 1 = DIA.DIAG_SEQ_NBR ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.PGM_ID_LST_CHAR_VAL DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC , REF.LN_ID DESC OPTIMIZE FOR 600 ROWS FETCH FIRST 600 ROWS ONLY WITH UR
          programCtx.setCsrInitFiltResultSet(d5427dt1Repository.openCsrInitFiltD5427dt1(methodOut.getDcladjdClmhstDenormRef(),methodIn.getHostVariables(),programCtx.getSqlca()));
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = ZERO
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '4210-OPE' TO DB2-PARAGRAPH
//  LITERAL_4210_MN_OPE = '4210-OPE'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4210_MN_OPE);
//  MOVE 'OPEN   ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_OPEN_B6_);
//  MOVE 'CSR-INIT-FILT' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFILT_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrInitFiltSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4220-FETCH-CSR-INIT-FILT-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrInitFiltSectOutCtx fetchCsrInitFiltSect(D5427dt1Ctx programCtx) throws Exception {
      
// *81***************************************************************
// *81  4220-Fetch-csr-init-filt-sect                               *
// *81                                                              *
// *81  business function: fetch claim lines                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4200-proc-csr-init-filt-sect                    *
// *82  calls     : 4221-fetch-csr-rows-sect                        *
// *82***************************************************************
// *================================================================
FetchCsrInitFiltSectOutCtx methodOut = programCtx.getFetchCsrInitFiltSectOutCtx();
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
          methodOut.setClmHstEndOfFetchNoTrue(); 
          
//  SET DT1-RSP-OK TO TRUE
          methodOut.setDt1RspOkTrue(); 
          
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
          while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodOut.isDt1RspOk()  )) {
//  PERFORM 4221-FETCH-CSR-ROWS-SECT
              fetchCsrRowsSect4221(programCtx.getFetchCsrRowsSect4221InCtx());/*4221-FETCH-CSR-ROWS-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrRowsSect4221 
      *   This method is derived from 
  *   COBOL Paragraph - 4221-FETCH-CSR-ROWS-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrRowsSect4221OutCtx fetchCsrRowsSect4221(FetchCsrRowsSect4221InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4221-Fetch-csr-rows-sect                                    *
// *81                                                              *
// *81  business function: fetch cursor rows                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4220-fetch-csr-init-filt-sect                   *
// *82  calls     : 4500-proc-fetched-rows-sect                     *
// *82            : 9100-database-error-sect                        *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
FetchCsrRowsSect4221OutCtx methodOut = methodIn.getFetchCsrRowsSect4221OutCtx();
//  FETCH NEXT ROWSET FROM CSR-INIT-FILT FOR ? ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d5427dt1Repository.fetchCsrInitFiltD5427dt1(programCtx.getCsrInitFiltResultSet(),methodOut.getHvaClmHistArray(),methodIn.getWork(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  (( methodOut.isSqlcodeOk()  ) || ( methodOut.isSqlcodeFetchEnd()  )) { 
//  PERFORM 4500-PROC-FETCHED-ROWS-SECT
              procFetchedRowsSect(programCtx.getProcFetchedRowsSectInCtx());/*4500-PROC-FETCHED-ROWS-SECT SECTION*/
          }
          else   { 
//  MOVE '4221-FET' TO DB2-PARAGRAPH
//  LITERAL_4221_MN_FET = '4221-FET'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4221_MN_FET);
//  MOVE 'FETCH  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_FETCH_B5_);
//  MOVE 'CSR-INIT-FILT' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFILT_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsrInitFiltSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4230-CLOSE-CSR-INIT-FILT-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public CloseCsrInitFiltSectOutCtx closeCsrInitFiltSect(CloseCsrInitFiltSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4230-Close-csr-init-filt-sect                               *
// *81                                                              *
// *81  business function: close the claim list cursor              *
// *82***************************************************************
// *82  called by : 4200-proc-csr-init-filt-sect
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
CloseCsrInitFiltSectOutCtx methodOut = methodIn.getCloseCsrInitFiltSectOutCtx();
//  CLOSE CSR-INIT-FILT
          d5427dt1Repository.closeCsrInitFiltD5427dt1(programCtx.getCsrInitFiltResultSet(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = +0 OR SQLCODE = -501
//  ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != -501 )) { 
//  MOVE '4230-CLO' TO DB2-PARAGRAPH
//  LITERAL_4230_MN_CLO = '4230-CLO'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4230_MN_CLO);
//  MOVE 'CLOSE  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_CLOSE_B5_);
//  MOVE 'CSR-INIT-FILT' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFILT_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * procCsrNextFullSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4300-PROC-CSR-NEXT-FULL-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * @throws CFException
      */
      @Override
      public ProcCsrNextFullSectOutCtx procCsrNextFullSect(ProcCsrNextFullSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4300-Proc-csr-next-full-sect                                *
// *81                                                              *
// *81  business function: declare and open next-full cursor        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4000-search-member-plus-sect                    *
// *82  calls     : 4310-open-csr-next-full-sect
// *82            : 4320-fetch-csr-next-full-sect
// *82            : 4330-close-csr-next-full-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcCsrNextFullSectOutCtx methodOut = methodIn.getProcCsrNextFullSectOutCtx();
//  PERFORM 4310-OPEN-CSR-NEXT-FULL-SECT
          openCsrNextFullSect(programCtx.getOpenCsrNextFullSectInCtx());/*4310-OPEN-CSR-NEXT-FULL-SECT SECTION*/
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
              methodOut.setClmHstEndOfFetchNoTrue(); 
              
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
              while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodIn.isDt1RspOk()  )) {
//  PERFORM 4320-FETCH-CSR-NEXT-FULL-SECT
                  fetchCsrNextFullSect(programCtx);/*4320-FETCH-CSR-NEXT-FULL-SECT SECTION*/
              }
          }
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  PERFORM 4330-CLOSE-CSR-NEXT-FULL-SECT
              closeCsrNextFullSect(programCtx.getCloseCsrNextFullSectInCtx());/*4330-CLOSE-CSR-NEXT-FULL-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * openCsrNextFullSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4310-OPEN-CSR-NEXT-FULL-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dderefPolNbr                   COBOL Name: DDEREF-POL-NBR
      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dderefEeId                     COBOL Name: DDEREF-EE-ID
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dderefDepnNbr                  COBOL Name: DDEREF-DEPN-NBR
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - nextKey                        COBOL Name: NEXT-KEY
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - nextProcDt                     COBOL Name: NEXT-PROC-DT
      * - dderefProcDt                   COBOL Name: DDEREF-PROC-DT
      * - nextProcTm                     COBOL Name: NEXT-PROC-TM
      * - dderefProcTm                   COBOL Name: DDEREF-PROC-TM
      * - nextPgmIdLstCharVal            COBOL Name: NEXT-PGM-ID-LST-CHAR-VAL
      * - dderefPgmIdLstCharVal          COBOL Name: DDEREF-PGM-ID-LST-CHAR-VAL
      * - nextIcnSufxVersNbr             COBOL Name: NEXT-ICN-SUFX-VERS-NBR
      * - dderefIcnSufxVersNbr           COBOL Name: DDEREF-ICN-SUFX-VERS-NBR
      * - nextInvnCtlNbr                 COBOL Name: NEXT-INVN-CTL-NBR
      * - dderefInvnCtlNbr               COBOL Name: DDEREF-INVN-CTL-NBR
      * - nextIcnSufxCd                  COBOL Name: NEXT-ICN-SUFX-CD
      * - dderefIcnSufxCd                COBOL Name: DDEREF-ICN-SUFX-CD
      * - nextLnId                       COBOL Name: NEXT-LN-ID
      * - dderefLnId                     COBOL Name: DDEREF-LN-ID
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public OpenCsrNextFullSectOutCtx openCsrNextFullSect(OpenCsrNextFullSectInCtx methodIn) throws Exception {
      
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
OpenCsrNextFullSectOutCtx methodOut = methodIn.getOpenCsrNextFullSectOutCtx();
//  MOVE DT1-REQ-POLICY TO DDEREF-POL-NBR
          methodOut.setDderefPolNbr(methodOut.getDt1ReqPolicy());
//  MOVE DT1-REQ-EMPID TO DDEREF-EE-ID
          methodOut.setDderefEeId(methodOut.getDt1ReqEmpid());
//  MOVE DT1-REQ-DEP-NBR (2 : 2) TO DDEREF-DEPN-NBR (1 : 2)
          methodOut.setDderefDepnNbr(replace(methodOut.getDderefDepnNbr(),String.valueOf(substring(methodOut.getDt1ReqDepNbrString(),1,3)).toCharArray(),0,2));
//  IF DDEREF-DEPN-NBR = 99
//  LITERAL_99 = 99
          if (compareChars(methodOut.getDderefDepnNbr(),CONSTANTS.LITERAL_99) == 0) { 
//  MOVE ZERO TO DDEREF-DEPN-NBR
              methodOut.setDderefDepnNbr(CONSTANTS.ZERO_2);
          }
//  MOVE DT1-REQ-NEXT-KEY TO NEXT-KEY
          methodOut.getNextKey().setString(methodOut.getDt1ReqNextKey());
//  MOVE NEXT-PROC-DT TO DDEREF-PROC-DT
          methodOut.setDderefProcDt(methodOut.getNextProcDt());
//  MOVE NEXT-PROC-TM TO DDEREF-PROC-TM
          methodOut.setDderefProcTm(methodOut.getNextProcTm());
//  MOVE NEXT-PGM-ID-LST-CHAR-VAL TO DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setDderefPgmIdLstCharVal(methodOut.getNextPgmIdLstCharVal());
//  MOVE NEXT-ICN-SUFX-VERS-NBR TO DDEREF-ICN-SUFX-VERS-NBR
          methodOut.setDderefIcnSufxVersNbr((short) methodOut.getNextIcnSufxVersNbr());
//  MOVE NEXT-INVN-CTL-NBR TO DDEREF-INVN-CTL-NBR
          methodOut.setDderefInvnCtlNbr(methodOut.getNextInvnCtlNbr());
//  MOVE NEXT-ICN-SUFX-CD TO DDEREF-ICN-SUFX-CD
          methodOut.setDderefIcnSufxCd(methodOut.getNextIcnSufxCd());
//  MOVE NEXT-LN-ID TO DDEREF-LN-ID
          methodOut.setDderefLnId((short) methodOut.getNextLnId());
//  WITH CLM_HST_TABLE ( PARTN_ID , PARTN_VAL , PROC_DT , PROC_TM , ICN_SUFX_VERS_NBR , INVN_CTL_NBR , ICN_SUFX_CD ) AS ( SELECT DISTINCT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD FROM ADJD_CLMHST_DENORM_REF REF WHERE REF.POL_NBR = ? AND REF.EE_ID = ? AND REF.DEPN_NBR = ? AND ( ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR = ? AND REF.ICN_SUFX_CD = ? AND REF.LN_ID <= ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR = ? AND REF.ICN_SUFX_CD < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM < ? ) OR ( REF.PROC_DT < ? ) ) ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC FETCH FIRST 500 ROWS ONLY ) SELECT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.PGM_ID_LST_CHAR_VAL , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , REF.LN_ID , REF.FLN_JULIAN_DT_NBR , REF.FLN_SRL_NBR , REF.DFT_NBR , REF.FST_DT , REF.LST_SRVC_DT , REF.PROV_TINSUFF , REF.PROV_SCRN_NBR , REF.CHRG_AMT , REF.RMRK_CD , REF.NC_AMT , REF.PMT_SVC_CD , REF.OVR_CD , REF.COPAY_AMT , REF.SRVC_CD , REF.PAY_CD , REF.TRANS_CD , HDR.FILM_OFC_NBR , HDR.CLM_LVL_RSN_CD , HDR.ADJTR_ID , HDR.MBR_PRV_IND , HDR.NTFY_WAIV_CD , HDR.BANK_CD , HDR.DIV_NBR , HDR.CLS_NBR , HDR.DRG_NBR , HDR.FACL_OR_PROF_CD , BKE.DLGT_ENTY_CD , BK2.NDB_CONTR_ID , BK2.CLM_SMB_TYP_APP_CD , BK2.SMB_ST_CD , DLN.PROC_T1_IND , DLN.AUTH_NBR , DLN.BASE_DED_DESC_TXT , DLN.MM_DED_DESC_TXT , DLN.PRS_CREAT_SRC_CD , DLN.BASE_DED_AMT , DLN.BASE_AMT , DLN.MM_DED_AMT , DLN.MM_AMT , DLN.MC_CR_RES_AMT , DLN.COB_CR_RES_AMT , DLN.PAR_IND , DLN.SUP_AMT , DLN.PROV_MKT_NBR , DLN.PPO_CD , DLN.PTNT_RESP_AMT , LNE.AUTH_SRC_ID , LNE.AUTH_PROC_CD , PRV.PROV_NM , PRV.PROV_EOB_NM , PRV.PROV_PRDCT_CD , PRV.PROV_MKT_TYP_CD , PRV.PROV_IPA_ID , PRV.TPSM_CD , PRV.PROV_SPCL_CD , IFNULL ( ( SELECT PR1.PROV_MEDCD_RECLM_IND FROM ADJD_CLMSF_PROV PR1 WHERE REF.PARTN_ID = PR1.PARTN_ID AND REF.PARTN_VAL = PR1.PARTN_VAL AND REF.INVN_CTL_NBR = PR1.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PR1.ICN_SUFX_CD AND REF.PROC_DT = PR1.PROC_DT AND REF.PROC_TM = PR1.PROC_TM AND PR1.PROV_MEDCD_RECLM_IND = 'Y' ORDER BY LST_UPDT_DTTM DESC FETCH FIRST 1 ROW ONLY ) , ' ' ) , IFNULL ( ( SELECT REL.REL_SRVC_CLM_LVL_IND FROM ADJD_CLMSFLN_REL_SRVCS REL WHERE REF.PARTN_ID = REL.PARTN_ID AND REF.PARTN_VAL = REL.PARTN_VAL AND REF.INVN_CTL_NBR = REL.INVN_CTL_NBR AND REF.ICN_SUFX_CD = REL.ICN_SUFX_CD AND REF.PROC_DT = REL.PROC_DT AND REF.PROC_TM = REL.PROC_TM AND REF.ICN_SUFX_VERS_NBR = REL.ICN_SUFX_VERS_NBR AND REF.LN_ID = REL.LN_ID FETCH FIRST 1 ROWS ONLY ) , ' ' ) , IFNULL ( DIA.DIAG_CD , '       ' ) , ( SELECT COUNT ( DISTINCT AUTH_NBR ) FROM ADJD_CLMHST_DENORM_LN DLN2 WHERE REF.PARTN_ID = DLN2.PARTN_ID AND REF.PARTN_VAL = DLN2.PARTN_VAL AND REF.INVN_CTL_NBR = DLN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN2.ICN_SUFX_CD AND REF.PROC_DT = DLN2.PROC_DT AND REF.PROC_TM = DLN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR AND ' ' < DLN2.AUTH_NBR ) , ( SELECT SUM ( PHYS_MEDCN_MSK_CNT ) FROM ADJD_CLMSF_LN2 LN2 WHERE REF.PARTN_ID = LN2.PARTN_ID AND REF.PARTN_VAL = LN2.PARTN_VAL AND REF.INVN_CTL_NBR = LN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LN2.ICN_SUFX_CD AND REF.PROC_DT = LN2.PROC_DT AND REF.PROC_TM = LN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR ) FROM CLM_HST_TABLE HST INNER JOIN ADJD_CLMHST_DENORM_REF REF ON REF.PARTN_ID = HST.PARTN_ID AND REF.PARTN_VAL = HST.PARTN_VAL AND REF.PROC_DT = HST.PROC_DT AND REF.PROC_TM = HST.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR AND REF.INVN_CTL_NBR = HST.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HST.ICN_SUFX_CD INNER JOIN ADJD_CLMHST_DENORM_HDR HDR ON REF.PARTN_ID = HDR.PARTN_ID AND REF.PARTN_VAL = HDR.PARTN_VAL AND REF.INVN_CTL_NBR = HDR.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HDR.ICN_SUFX_CD AND REF.PROC_DT = HDR.PROC_DT AND REF.PROC_TM = HDR.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E BKE ON REF.PARTN_ID = BKE.PARTN_ID AND REF.PARTN_VAL = BKE.PARTN_VAL AND REF.INVN_CTL_NBR = BKE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BKE.ICN_SUFX_CD AND REF.PROC_DT = BKE.PROC_DT AND REF.PROC_TM = BKE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E2 BK2 ON REF.PARTN_ID = BK2.PARTN_ID AND REF.PARTN_VAL = BK2.PARTN_VAL AND REF.INVN_CTL_NBR = BK2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BK2.ICN_SUFX_CD AND REF.PROC_DT = BK2.PROC_DT AND REF.PROC_TM = BK2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMHST_DENORM_LN DLN ON REF.PARTN_ID = DLN.PARTN_ID AND REF.PARTN_VAL = DLN.PARTN_VAL AND REF.INVN_CTL_NBR = DLN.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN.ICN_SUFX_CD AND REF.PROC_DT = DLN.PROC_DT AND REF.PROC_TM = DLN.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR AND REF.LN_ID = DLN.LN_ID INNER JOIN ADJD_CLMSF_PROV PRV ON REF.PARTN_ID = PRV.PARTN_ID AND REF.PARTN_VAL = PRV.PARTN_VAL AND REF.INVN_CTL_NBR = PRV.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PRV.ICN_SUFX_CD AND REF.PROC_DT = PRV.PROC_DT AND REF.PROC_TM = PRV.PROC_TM AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR AND REF.PROV_SCRN_NBR = PRV.PROV_SEQ_NBR INNER JOIN ADJD_CLMSF_LN LNE ON REF.PARTN_ID = LNE.PARTN_ID AND REF.PARTN_VAL = LNE.PARTN_VAL AND REF.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND REF.PROC_DT = LNE.PROC_DT AND REF.PROC_TM = LNE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND REF.LN_ID = LNE.LN_ID LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA ON REF.PARTN_ID = DIA.PARTN_ID AND REF.PARTN_VAL = DIA.PARTN_VAL AND REF.INVN_CTL_NBR = DIA.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DIA.ICN_SUFX_CD AND REF.PROC_DT = DIA.PROC_DT AND REF.PROC_TM = DIA.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR AND 1 = DIA.DIAG_SEQ_NBR ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.PGM_ID_LST_CHAR_VAL DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC , REF.LN_ID DESC OPTIMIZE FOR 600 ROWS FETCH FIRST 600 ROWS ONLY WITH UR
          programCtx.setCsrNextFullResultSet(d5427dt1Repository.openCsrNextFullD5427dt1(methodOut.getDcladjdClmhstDenormRef(),programCtx.getSqlca()));
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = ZERO
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '4310-OPE' TO DB2-PARAGRAPH
//  LITERAL_4310_MN_OPE = '4310-OPE'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4310_MN_OPE);
//  MOVE 'OPEN   ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_OPEN_B6_);
//  MOVE 'CSR-NEXT-FULL' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFULL_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrNextFullSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4320-FETCH-CSR-NEXT-FULL-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrNextFullSectOutCtx fetchCsrNextFullSect(D5427dt1Ctx programCtx) throws Exception {
      
// *81***************************************************************
// *81  4320-Fetch-csr-next-full-sect                               *
// *81                                                              *
// *81  business function: fetch claim lines                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4300-proc-csr-next-full-sect                    *
// *82  calls     : 4321-fetch-csr-rows-sect                        *
// *82***************************************************************
// *================================================================
FetchCsrNextFullSectOutCtx methodOut = programCtx.getFetchCsrNextFullSectOutCtx();
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
          methodOut.setClmHstEndOfFetchNoTrue(); 
          
//  SET DT1-RSP-OK TO TRUE
          methodOut.setDt1RspOkTrue(); 
          
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
          while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodOut.isDt1RspOk()  )) {
//  PERFORM 4321-FETCH-CSR-ROWS-SECT
              fetchCsrRowsSect4321(programCtx.getFetchCsrRowsSect4321InCtx());/*4321-FETCH-CSR-ROWS-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrRowsSect4321 
      *   This method is derived from 
  *   COBOL Paragraph - 4321-FETCH-CSR-ROWS-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrRowsSect4321OutCtx fetchCsrRowsSect4321(FetchCsrRowsSect4321InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *82***************************************************************
// *82  Called by : 4320-fetch-csr-next-full-sect                   *
// *82  calls     : 4500-proc-fetched-rows-sect                     *
// *82            : 9100-database-error-sect                        *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
FetchCsrRowsSect4321OutCtx methodOut = methodIn.getFetchCsrRowsSect4321OutCtx();
//  FETCH NEXT ROWSET FROM CSR-NEXT-FULL FOR ? ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d5427dt1Repository.fetchCsrNextFullD5427dt1(programCtx.getCsrNextFullResultSet(),methodOut.getHvaClmHistArray(),methodIn.getWork(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  (( methodOut.isSqlcodeOk()  ) || ( methodOut.isSqlcodeFetchEnd()  )) { 
//  PERFORM 4500-PROC-FETCHED-ROWS-SECT
              procFetchedRowsSect(programCtx.getProcFetchedRowsSectInCtx());/*4500-PROC-FETCHED-ROWS-SECT SECTION*/
          }
          else   { 
//  MOVE '4321-FET' TO DB2-PARAGRAPH
//  LITERAL_4321_MN_FET = '4321-FET'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4321_MN_FET);
//  MOVE 'FETCH  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_FETCH_B5_);
//  MOVE 'CSR-NEXT-FULL' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFULL_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsrNextFullSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4330-CLOSE-CSR-NEXT-FULL-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public CloseCsrNextFullSectOutCtx closeCsrNextFullSect(CloseCsrNextFullSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4330-Close-csr-next-full-sect                               *
// *81                                                              *
// *81  business function: close the claim list cursor              *
// *82***************************************************************
// *82  called by : 4300-proc-csr-next-full-sect
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
CloseCsrNextFullSectOutCtx methodOut = methodIn.getCloseCsrNextFullSectOutCtx();
//  CLOSE CSR-NEXT-FULL
          d5427dt1Repository.closeCsrNextFullD5427dt1(programCtx.getCsrNextFullResultSet(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = +0 OR SQLCODE = -501
//  ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != -501 )) { 
//  MOVE '4330-CLO' TO DB2-PARAGRAPH
//  LITERAL_4330_MN_CLO = '4330-CLO'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4330_MN_CLO);
//  MOVE 'CLOSE  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_CLOSE_B5_);
//  MOVE 'CSR-NEXT-FULL' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFULL_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * procCsrNextFiltSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4400-PROC-CSR-NEXT-FILT-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * @throws CFException
      */
      @Override
      public ProcCsrNextFiltSectOutCtx procCsrNextFiltSect(ProcCsrNextFiltSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4400-Proc-csr-next-filt-sect                                *
// *81                                                              *
// *81  business function: declare and open next-filt cursor        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4000-search-member-plus-sect                    *
// *82  calls     : 4410-open-csr-next-filt-sect
// *82            : 4420-fetch-csr-next-filt-sect
// *82            : 4430-close-csr-next-filt-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcCsrNextFiltSectOutCtx methodOut = methodIn.getProcCsrNextFiltSectOutCtx();
//  PERFORM 4410-OPEN-CSR-NEXT-FILT-SECT
          openCsrNextFiltSect(programCtx.getOpenCsrNextFiltSectInCtx());/*4410-OPEN-CSR-NEXT-FILT-SECT SECTION*/
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
              methodOut.setClmHstEndOfFetchNoTrue(); 
              
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
              while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodIn.isDt1RspOk()  )) {
//  PERFORM 4420-FETCH-CSR-NEXT-FILT-SECT
                  fetchCsrNextFiltSect(programCtx);/*4420-FETCH-CSR-NEXT-FILT-SECT SECTION*/
              }
          }
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  PERFORM 4430-CLOSE-CSR-NEXT-FILT-SECT
              closeCsrNextFiltSect(programCtx.getCloseCsrNextFiltSectInCtx());/*4430-CLOSE-CSR-NEXT-FILT-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * openCsrNextFiltSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4410-OPEN-CSR-NEXT-FILT-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dderefPolNbr                   COBOL Name: DDEREF-POL-NBR
      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dderefEeId                     COBOL Name: DDEREF-EE-ID
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dderefDepnNbr                  COBOL Name: DDEREF-DEPN-NBR
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - nextKey                        COBOL Name: NEXT-KEY
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - nextProcDt                     COBOL Name: NEXT-PROC-DT
      * - dderefProcDt                   COBOL Name: DDEREF-PROC-DT
      * - nextProcTm                     COBOL Name: NEXT-PROC-TM
      * - dderefProcTm                   COBOL Name: DDEREF-PROC-TM
      * - nextPgmIdLstCharVal            COBOL Name: NEXT-PGM-ID-LST-CHAR-VAL
      * - dderefPgmIdLstCharVal          COBOL Name: DDEREF-PGM-ID-LST-CHAR-VAL
      * - nextIcnSufxVersNbr             COBOL Name: NEXT-ICN-SUFX-VERS-NBR
      * - dderefIcnSufxVersNbr           COBOL Name: DDEREF-ICN-SUFX-VERS-NBR
      * - nextInvnCtlNbr                 COBOL Name: NEXT-INVN-CTL-NBR
      * - dderefInvnCtlNbr               COBOL Name: DDEREF-INVN-CTL-NBR
      * - nextIcnSufxCd                  COBOL Name: NEXT-ICN-SUFX-CD
      * - dderefIcnSufxCd                COBOL Name: DDEREF-ICN-SUFX-CD
      * - nextLnId                       COBOL Name: NEXT-LN-ID
      * - dderefLnId                     COBOL Name: DDEREF-LN-ID
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public OpenCsrNextFiltSectOutCtx openCsrNextFiltSect(OpenCsrNextFiltSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4410-Open-csr-next-filt-sect                                *
// *81                                                              *
// *81  business function: declare and open csr-next-filt           *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4400-proc-csr-next-filt-sect                    *
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
OpenCsrNextFiltSectOutCtx methodOut = methodIn.getOpenCsrNextFiltSectOutCtx();
//  MOVE DT1-REQ-POLICY TO DDEREF-POL-NBR
          methodOut.setDderefPolNbr(methodOut.getDt1ReqPolicy());
//  MOVE DT1-REQ-EMPID TO DDEREF-EE-ID
          methodOut.setDderefEeId(methodOut.getDt1ReqEmpid());
//  MOVE DT1-REQ-DEP-NBR (2 : 2) TO DDEREF-DEPN-NBR (1 : 2)
          methodOut.setDderefDepnNbr(replace(methodOut.getDderefDepnNbr(),String.valueOf(substring(methodOut.getDt1ReqDepNbrString(),1,3)).toCharArray(),0,2));
//  IF DDEREF-DEPN-NBR = 99
//  LITERAL_99 = 99
          if (compareChars(methodOut.getDderefDepnNbr(),CONSTANTS.LITERAL_99) == 0) { 
//  MOVE ZERO TO DDEREF-DEPN-NBR
              methodOut.setDderefDepnNbr(CONSTANTS.ZERO_2);
          }
//  MOVE DT1-REQ-NEXT-KEY TO NEXT-KEY
          methodOut.getNextKey().setString(methodOut.getDt1ReqNextKey());
//  MOVE NEXT-PROC-DT TO DDEREF-PROC-DT
          methodOut.setDderefProcDt(methodOut.getNextProcDt());
//  MOVE NEXT-PROC-TM TO DDEREF-PROC-TM
          methodOut.setDderefProcTm(methodOut.getNextProcTm());
//  MOVE NEXT-PGM-ID-LST-CHAR-VAL TO DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setDderefPgmIdLstCharVal(methodOut.getNextPgmIdLstCharVal());
//  MOVE NEXT-ICN-SUFX-VERS-NBR TO DDEREF-ICN-SUFX-VERS-NBR
          methodOut.setDderefIcnSufxVersNbr((short) methodOut.getNextIcnSufxVersNbr());
//  MOVE NEXT-INVN-CTL-NBR TO DDEREF-INVN-CTL-NBR
          methodOut.setDderefInvnCtlNbr(methodOut.getNextInvnCtlNbr());
//  MOVE NEXT-ICN-SUFX-CD TO DDEREF-ICN-SUFX-CD
          methodOut.setDderefIcnSufxCd(methodOut.getNextIcnSufxCd());
//  MOVE NEXT-LN-ID TO DDEREF-LN-ID
          methodOut.setDderefLnId((short) methodOut.getNextLnId());
//  WITH CLM_HST_TABLE ( PARTN_ID , PARTN_VAL , PROC_DT , PROC_TM , ICN_SUFX_VERS_NBR , INVN_CTL_NBR , ICN_SUFX_CD ) AS ( SELECT DISTINCT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD FROM ADJD_CLMHST_DENORM_REF REF WHERE REF.POL_NBR = ? AND REF.EE_ID = ? AND REF.DEPN_NBR = ? AND ? >= REF.FST_DT AND ? <= REF.LST_SRVC_DT AND ( ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR = ? AND REF.ICN_SUFX_CD = ? AND REF.LN_ID <= ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR = ? AND REF.ICN_SUFX_CD < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM < ? ) OR ( REF.PROC_DT < ? ) ) ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC FETCH FIRST 500 ROWS ONLY ) SELECT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.PGM_ID_LST_CHAR_VAL , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , REF.LN_ID , REF.FLN_JULIAN_DT_NBR , REF.FLN_SRL_NBR , REF.DFT_NBR , REF.FST_DT , REF.LST_SRVC_DT , REF.PROV_TINSUFF , REF.PROV_SCRN_NBR , REF.CHRG_AMT , REF.RMRK_CD , REF.NC_AMT , REF.PMT_SVC_CD , REF.OVR_CD , REF.COPAY_AMT , REF.SRVC_CD , REF.PAY_CD , REF.TRANS_CD , HDR.FILM_OFC_NBR , HDR.CLM_LVL_RSN_CD , HDR.ADJTR_ID , HDR.MBR_PRV_IND , HDR.NTFY_WAIV_CD , HDR.BANK_CD , HDR.DIV_NBR , HDR.CLS_NBR , HDR.DRG_NBR , HDR.FACL_OR_PROF_CD , BKE.DLGT_ENTY_CD , BK2.NDB_CONTR_ID , BK2.CLM_SMB_TYP_APP_CD , BK2.SMB_ST_CD , DLN.PROC_T1_IND , DLN.AUTH_NBR , DLN.BASE_DED_DESC_TXT , DLN.MM_DED_DESC_TXT , DLN.PRS_CREAT_SRC_CD , DLN.BASE_DED_AMT , DLN.BASE_AMT , DLN.MM_DED_AMT , DLN.MM_AMT , DLN.MC_CR_RES_AMT , DLN.COB_CR_RES_AMT , DLN.PAR_IND , DLN.SUP_AMT , DLN.PROV_MKT_NBR , DLN.PPO_CD , DLN.PTNT_RESP_AMT , LNE.AUTH_SRC_ID , LNE.AUTH_PROC_CD , PRV.PROV_NM , PRV.PROV_EOB_NM , PRV.PROV_PRDCT_CD , PRV.PROV_MKT_TYP_CD , PRV.PROV_IPA_ID , PRV.TPSM_CD , PRV.PROV_SPCL_CD , IFNULL ( ( SELECT PR1.PROV_MEDCD_RECLM_IND FROM ADJD_CLMSF_PROV PR1 WHERE REF.PARTN_ID = PR1.PARTN_ID AND REF.PARTN_VAL = PR1.PARTN_VAL AND REF.INVN_CTL_NBR = PR1.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PR1.ICN_SUFX_CD AND REF.PROC_DT = PR1.PROC_DT AND REF.PROC_TM = PR1.PROC_TM AND PR1.PROV_MEDCD_RECLM_IND = 'Y' ORDER BY LST_UPDT_DTTM DESC FETCH FIRST 1 ROW ONLY ) , ' ' ) , IFNULL ( ( SELECT REL.REL_SRVC_CLM_LVL_IND FROM ADJD_CLMSFLN_REL_SRVCS REL WHERE REF.PARTN_ID = REL.PARTN_ID AND REF.PARTN_VAL = REL.PARTN_VAL AND REF.INVN_CTL_NBR = REL.INVN_CTL_NBR AND REF.ICN_SUFX_CD = REL.ICN_SUFX_CD AND REF.PROC_DT = REL.PROC_DT AND REF.PROC_TM = REL.PROC_TM AND REF.ICN_SUFX_VERS_NBR = REL.ICN_SUFX_VERS_NBR AND REF.LN_ID = REL.LN_ID FETCH FIRST 1 ROWS ONLY ) , ' ' ) , IFNULL ( DIA.DIAG_CD , '       ' ) , ( SELECT COUNT ( DISTINCT AUTH_NBR ) FROM ADJD_CLMHST_DENORM_LN DLN2 WHERE REF.PARTN_ID = DLN2.PARTN_ID AND REF.PARTN_VAL = DLN2.PARTN_VAL AND REF.INVN_CTL_NBR = DLN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN2.ICN_SUFX_CD AND REF.PROC_DT = DLN2.PROC_DT AND REF.PROC_TM = DLN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR AND ' ' < DLN2.AUTH_NBR ) , ( SELECT SUM ( PHYS_MEDCN_MSK_CNT ) FROM ADJD_CLMSF_LN2 LN2 WHERE REF.PARTN_ID = LN2.PARTN_ID AND REF.PARTN_VAL = LN2.PARTN_VAL AND REF.INVN_CTL_NBR = LN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LN2.ICN_SUFX_CD AND REF.PROC_DT = LN2.PROC_DT AND REF.PROC_TM = LN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR ) FROM CLM_HST_TABLE HST INNER JOIN ADJD_CLMHST_DENORM_REF REF ON REF.PARTN_ID = HST.PARTN_ID AND REF.PARTN_VAL = HST.PARTN_VAL AND REF.PROC_DT = HST.PROC_DT AND REF.PROC_TM = HST.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR AND REF.INVN_CTL_NBR = HST.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HST.ICN_SUFX_CD INNER JOIN ADJD_CLMHST_DENORM_HDR HDR ON REF.PARTN_ID = HDR.PARTN_ID AND REF.PARTN_VAL = HDR.PARTN_VAL AND REF.INVN_CTL_NBR = HDR.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HDR.ICN_SUFX_CD AND REF.PROC_DT = HDR.PROC_DT AND REF.PROC_TM = HDR.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E BKE ON REF.PARTN_ID = BKE.PARTN_ID AND REF.PARTN_VAL = BKE.PARTN_VAL AND REF.INVN_CTL_NBR = BKE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BKE.ICN_SUFX_CD AND REF.PROC_DT = BKE.PROC_DT AND REF.PROC_TM = BKE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E2 BK2 ON REF.PARTN_ID = BK2.PARTN_ID AND REF.PARTN_VAL = BK2.PARTN_VAL AND REF.INVN_CTL_NBR = BK2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BK2.ICN_SUFX_CD AND REF.PROC_DT = BK2.PROC_DT AND REF.PROC_TM = BK2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMHST_DENORM_LN DLN ON REF.PARTN_ID = DLN.PARTN_ID AND REF.PARTN_VAL = DLN.PARTN_VAL AND REF.INVN_CTL_NBR = DLN.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN.ICN_SUFX_CD AND REF.PROC_DT = DLN.PROC_DT AND REF.PROC_TM = DLN.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR AND REF.LN_ID = DLN.LN_ID INNER JOIN ADJD_CLMSF_PROV PRV ON REF.PARTN_ID = PRV.PARTN_ID AND REF.PARTN_VAL = PRV.PARTN_VAL AND REF.INVN_CTL_NBR = PRV.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PRV.ICN_SUFX_CD AND REF.PROC_DT = PRV.PROC_DT AND REF.PROC_TM = PRV.PROC_TM AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR AND REF.PROV_SCRN_NBR = PRV.PROV_SEQ_NBR INNER JOIN ADJD_CLMSF_LN LNE ON REF.PARTN_ID = LNE.PARTN_ID AND REF.PARTN_VAL = LNE.PARTN_VAL AND REF.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND REF.PROC_DT = LNE.PROC_DT AND REF.PROC_TM = LNE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND REF.LN_ID = LNE.LN_ID LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA ON REF.PARTN_ID = DIA.PARTN_ID AND REF.PARTN_VAL = DIA.PARTN_VAL AND REF.INVN_CTL_NBR = DIA.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DIA.ICN_SUFX_CD AND REF.PROC_DT = DIA.PROC_DT AND REF.PROC_TM = DIA.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR AND 1 = DIA.DIAG_SEQ_NBR ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.PGM_ID_LST_CHAR_VAL DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC , REF.LN_ID DESC OPTIMIZE FOR 600 ROWS FETCH FIRST 600 ROWS ONLY WITH UR
          programCtx.setCsrNextFiltResultSet(d5427dt1Repository.openCsrNextFiltD5427dt1(methodOut.getDcladjdClmhstDenormRef(),methodIn.getHostVariables(),programCtx.getSqlca()));
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = ZERO
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '4410-OPE' TO DB2-PARAGRAPH
//  LITERAL_4410_MN_OPE = '4410-OPE'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4410_MN_OPE);
//  MOVE 'OPEN   ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_OPEN_B6_);
//  MOVE 'CSR-NEXT-FILT' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFILT_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrNextFiltSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4420-FETCH-CSR-NEXT-FILT-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrNextFiltSectOutCtx fetchCsrNextFiltSect(D5427dt1Ctx programCtx) throws Exception {
      
// *81***************************************************************
// *81  4420-Fetch-csr-next-filt-sect                               *
// *81                                                              *
// *81  business function: fetch claim lines                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4400-proc-csr-next-filt-sect                    *
// *82  calls     : 4421-fetch-csr-rows-sect                        *
// *82***************************************************************
// *================================================================
FetchCsrNextFiltSectOutCtx methodOut = programCtx.getFetchCsrNextFiltSectOutCtx();
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
          methodOut.setClmHstEndOfFetchNoTrue(); 
          
//  SET DT1-RSP-OK TO TRUE
          methodOut.setDt1RspOkTrue(); 
          
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
          while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodOut.isDt1RspOk()  )) {
//  PERFORM 4421-FETCH-CSR-ROWS-SECT
              fetchCsrRowsSect4421(programCtx.getFetchCsrRowsSect4421InCtx());/*4421-FETCH-CSR-ROWS-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrRowsSect4421 
      *   This method is derived from 
  *   COBOL Paragraph - 4421-FETCH-CSR-ROWS-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrRowsSect4421OutCtx fetchCsrRowsSect4421(FetchCsrRowsSect4421InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4421-Fetch-csr-rows-sect                                    *
// *81                                                              *
// *81  business function: fetch cursor rows                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4420-fetch-csr-next-filt-sect                   *
// *82  calls     : 4500-proc-fetched-rows-sect                     *
// *82            : 9100-database-error-sect                        *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
FetchCsrRowsSect4421OutCtx methodOut = methodIn.getFetchCsrRowsSect4421OutCtx();
//  FETCH NEXT ROWSET FROM CSR-NEXT-FILT FOR ? ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d5427dt1Repository.fetchCsrNextFiltD5427dt1(programCtx.getCsrNextFiltResultSet(),methodOut.getHvaClmHistArray(),methodIn.getWork(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  (( methodOut.isSqlcodeOk()  ) || ( methodOut.isSqlcodeFetchEnd()  )) { 
//  PERFORM 4500-PROC-FETCHED-ROWS-SECT
              procFetchedRowsSect(programCtx.getProcFetchedRowsSectInCtx());/*4500-PROC-FETCHED-ROWS-SECT SECTION*/
          }
          else   { 
//  MOVE '4421-FET' TO DB2-PARAGRAPH
//  LITERAL_4421_MN_FET = '4421-FET'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4421_MN_FET);
//  MOVE 'FETCH  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_FETCH_B5_);
//  MOVE 'CSR-NEXT-FILT' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFILT_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsrNextFiltSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4430-CLOSE-CSR-NEXT-FILT-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public CloseCsrNextFiltSectOutCtx closeCsrNextFiltSect(CloseCsrNextFiltSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4430-Close-csr-next-filt-sect                               *
// *81                                                              *
// *81  business function: close the claim list cursor              *
// *82***************************************************************
// *82  called by : 4400-proc-csr-next-filt-sect
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
CloseCsrNextFiltSectOutCtx methodOut = methodIn.getCloseCsrNextFiltSectOutCtx();
//  CLOSE CSR-NEXT-FILT
          d5427dt1Repository.closeCsrNextFiltD5427dt1(programCtx.getCsrNextFiltResultSet(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = +0 OR SQLCODE = -501
//  ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != -501 )) { 
//  MOVE '4430-CLO' TO DB2-PARAGRAPH
//  LITERAL_4430_MN_CLO = '4430-CLO'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4430_MN_CLO);
//  MOVE 'CLOSE  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_CLOSE_B5_);
//  MOVE 'CSR-NEXT-FILT' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFILT_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * procFetchedRowsSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4500-PROC-FETCHED-ROWS-SECT SECTION COBOL Cyclomatic complexity - 8
      * Input  :  

      * - sqlerrd                        COBOL Name: SQLERRD
      * - totalRowsRetrieved             COBOL Name: TOTAL-ROWS-RETRIEVED
      * - fetchRowsetMax                 COBOL Name: FETCH-ROWSET-MAX
      * - d5427dt1MaxRows                COBOL Name: D5427DT1-MAX-ROWS
      * - hvaSub                         COBOL Name: HVA-SUB
      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - stsRespCode                    COBOL Name: STS-RESP-CODE
      *
      * Output :  

      * - fetchRowsRetrieved             COBOL Name: FETCH-ROWS-RETRIEVED
      * - sqlerrd                        COBOL Name: SQLERRD
      * - nbrSrtItems                    COBOL Name: NBR-SRT-ITEMS
      * - d5427dt1MaxRows                COBOL Name: D5427DT1-MAX-ROWS
      * - totalRowsRetrieved             COBOL Name: TOTAL-ROWS-RETRIEVED
      * - hvaSub                         COBOL Name: HVA-SUB
      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * @throws CFException
      */
      @Override
      public ProcFetchedRowsSectOutCtx procFetchedRowsSect(ProcFetchedRowsSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4500-Proc-fetched-rows-sect                                 *
// *81                                                              *
// *81  business function: process data from cursor fetch           *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4121-fetch-csr-rows-sect                        *
// *82            : 4221-fetch-csr-rows-sect                        *
// *82            : 4321-fetch-csr-rows-sect                        *
// *82            : 4421-fetch-csr-rows-sect                        *
// *82            : 5221-fetch-csr-rows-sect                        *
// *82            : 5421-fetch-csr-rows-sect                        *
// *82            : 7221-fetch-c7a-rows-sect                        *
// *82            : 7421-fetch-c7a-rows-sect                        *
// *82            : 7221-fetch-c7b-rows-sect                        *
// *82            : 7421-fetch-c7b-rows-sect                        *
// *82  calls     : 8011-get-srt-cont-stg-sect
// *82            : 4600-write-clm-data-sect
// *82***************************************************************
// *================================================================

// * Sqlerrd(3) contains number of rows retrieved

// * First time - allocate srt storage area
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcFetchedRowsSectOutCtx methodOut = methodIn.getProcFetchedRowsSectOutCtx();
//  MOVE SQLERRD (3) TO FETCH-ROWS-RETRIEVED
          methodOut.setFetchRowsRetrieved(methodOut.getSqlerrd(2));
//  IF TOTAL-ROWS-RETRIEVED = ZERO
          if (	( methodOut.getTotalRowsRetrieved() == 0 )) { 
//  IF FETCH-ROWS-RETRIEVED < FETCH-ROWSET-MAX
              if (	( methodOut.getFetchRowsRetrieved() < methodIn.getFetchRowsetMax() )) { 
                  // MOVE FETCH-ROWS-RETRIEVED TO NBR-SRT-ITEMS
                  methodOut.setNbrSrtItems(methodOut.getFetchRowsRetrieved());
              }
//  ELSE
              else { 
                  // MOVE D5427DT1-MAX-ROWS TO NBR-SRT-ITEMS
                  methodOut.setNbrSrtItems(methodOut.getD5427dt1MaxRows());
              }
//  PERFORM 8011-GET-SRT-CONT-STG-SECT
              getSrtContStgSect(programCtx.getGetSrtContStgSectInCtx());/*8011-GET-SRT-CONT-STG-SECT SECTION*/
          }

// * Add fetch count to total-rows count

// * Put the claim data (if any)
//  ADD FETCH-ROWS-RETRIEVED TO TOTAL-ROWS-RETRIEVED
          methodOut.setTotalRowsRetrieved(methodOut.getTotalRowsRetrieved()+methodOut.getFetchRowsRetrieved());
//  PERFORM WITH TEST BEFORE VARYING HVA-SUB FROM 1 BY +1 UNTIL HVA-SUB > FETCH-ROWS-RETRIEVED OR CLM-HST-END-OF-FETCH-YES OR NOT ( STS-RESP-CODE-OK )
          for (methodOut.setHvaSub((short)1); (	( methodOut.getHvaSub() <= methodOut.getFetchRowsRetrieved() )  && !(methodOut.isClmHstEndOfFetchYes())  &&  methodIn.isStsRespCodeOk()  ) ; methodOut.setHvaSub((short)(methodOut.getHvaSub() + 1)) ) {
//  PERFORM 4600-WRITE-CLM-DATA-SECT
              writeClmDataSect(programCtx.getWriteClmDataSectInCtx());/*4600-WRITE-CLM-DATA-SECT SECTION*/
          }

// *  Set end-of-fetch if less than full response
//  IF FETCH-ROWS-RETRIEVED < FETCH-ROWSET-MAX
          if (	( methodOut.getFetchRowsRetrieved() < methodIn.getFetchRowsetMax() )) { 
//  SET CLM-HST-END-OF-FETCH-YES TO TRUE
              methodOut.setClmHstEndOfFetchYesTrue(); 
              
          }
      
      return methodOut;
      }
      /**
      * saveClaimKeySect 
      *   This method is derived from 
  *   COBOL Paragraph - 4501-SAVE-CLAIM-KEY-SECT SECTION COBOL Cyclomatic complexity - 7
      * Input  :  

      * - dt1ClmFln                      COBOL Name: DT1-CLM-FLN
      * - dt1ClmIcn                      COBOL Name: DT1-CLM-ICN
      * - dt1ClmSuffixCd                 COBOL Name: DT1-CLM-SUFFIX-CD
      * - dt1ClmProviderId               COBOL Name: DT1-CLM-PROVIDER-ID
      * - dt1ClmDraftNo                  COBOL Name: DT1-CLM-DRAFT-NO
      * - dt1ClmHeaderCt                 COBOL Name: DT1-CLM-HEADER-CT
      * - dt1ItemDx                      COBOL Name: DT1-ITEM-DX
      * - dt1ClaimKeyCnt                 COBOL Name: DT1-CLAIM-KEY-CNT
      * - dt1ClaimKeyMax                 COBOL Name: DT1-CLAIM-KEY-MAX
      * - dt1ClaimKey                    COBOL Name: DT1-CLAIM-KEY
      * - claimKey                       COBOL Name: CLAIM-KEY
      *
      * Output :  

      * - claimKeyFln                    COBOL Name: CLAIM-KEY-FLN
      * - dt1ClmFln                      COBOL Name: DT1-CLM-FLN
      * - claimKeyIcn                    COBOL Name: CLAIM-KEY-ICN
      * - dt1ClmIcn                      COBOL Name: DT1-CLM-ICN
      * - claimKeySuffixCd               COBOL Name: CLAIM-KEY-SUFFIX-CD
      * - dt1ClmSuffixCd                 COBOL Name: DT1-CLM-SUFFIX-CD
      * - claimKeyProviderNo             COBOL Name: CLAIM-KEY-PROVIDER-NO
      * - dt1ClmProviderId               COBOL Name: DT1-CLM-PROVIDER-ID
      * - claimKeyDraftNo                COBOL Name: CLAIM-KEY-DRAFT-NO
      * - dt1ClmDraftNo                  COBOL Name: DT1-CLM-DRAFT-NO
      * - claimKeyHeaderCt               COBOL Name: CLAIM-KEY-HEADER-CT
      * - dt1ClmHeaderCt                 COBOL Name: DT1-CLM-HEADER-CT
      * - claimSw                        COBOL Name: CLAIM-SW
      * - dt1ItemDx                      COBOL Name: DT1-ITEM-DX
      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - dt1ClaimKeyCnt                 COBOL Name: DT1-CLAIM-KEY-CNT
      * - dt1ClaimKey                    COBOL Name: DT1-CLAIM-KEY
      * - claimKey                       COBOL Name: CLAIM-KEY
      *
      * @throws CFException
      */
      @Override
      public SaveClaimKeySectOutCtx saveClaimKeySect(SaveClaimKeySectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81 4501-Save-claim-key-sect                                     *
// *81                                                              *
// *81 business function: add to list of unique summary keys        *
// *82***************************************************************
// *82 called by :  4600-write-clm-data-sect                        *
// *82 calls     :  4510-set-next-key-value-sect                    *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
SaveClaimKeySectOutCtx methodOut = methodIn.getSaveClaimKeySectOutCtx();
//  MOVE DT1-CLM-FLN (1) TO CLAIM-KEY-FLN
          methodOut.setClaimKeyFln(String.valueOf(methodOut.getDt1ClmFlnString(0)).toCharArray());
//  MOVE DT1-CLM-ICN (1) TO CLAIM-KEY-ICN
          methodOut.setClaimKeyIcn(methodOut.getDt1ClmIcn(0));
//  MOVE DT1-CLM-SUFFIX-CD (1) TO CLAIM-KEY-SUFFIX-CD
          methodOut.setClaimKeySuffixCd(String.valueOf(methodOut.getDt1ClmSuffixCdString(0)).toCharArray());
//  MOVE DT1-CLM-PROVIDER-ID (1) TO CLAIM-KEY-PROVIDER-NO
          methodOut.setClaimKeyProviderNo(methodOut.getDt1ClmProviderId(0).toCharArray());
//  MOVE DT1-CLM-DRAFT-NO (1) TO CLAIM-KEY-DRAFT-NO
          methodOut.setClaimKeyDraftNo(String.valueOf(methodOut.getDt1ClmDraftNoString(0)).toCharArray());
//  MOVE DT1-CLM-HEADER-CT (1) TO CLAIM-KEY-HEADER-CT
          methodOut.setClaimKeyHeaderCt(String.valueOf(methodOut.getDt1ClmHeaderCtString(0)).toCharArray());
//  SET CLAIM-NOTFOUND TO TRUE
          methodOut.setClaimNotfoundTrue(); 
          
//  PERFORM WITH TEST BEFORE VARYING DT1-ITEM-DX FROM 1 BY +1 UNTIL DT1-ITEM-DX > DT1-CLAIM-KEY-CNT OR DT1-ITEM-DX > DT1-CLAIM-KEY-MAX
          for (methodOut.setDt1ItemDx(1); (	( methodOut.getDt1ItemDx() <= methodOut.getDt1ClaimKeyCnt() ) && 	( methodOut.getDt1ItemDx() <= methodIn.getDt1ClaimKeyMax() )) ; methodOut.setDt1ItemDx(methodOut.getDt1ItemDx() + 1) ) {
//  IF DT1-CLAIM-KEY ( DT1-ITEM-DX ) = CLAIM-KEY
              if (		compareChars(methodOut.getDt1ClaimKey(methodOut.getDt1ItemDx() - 1),methodOut.getClaimKey()) == 0 ) { 
//  SET CLAIM-FOUND TO TRUE
                  methodOut.setClaimFoundTrue(); 
                  
//  SET DT1-ITEM-DX TO DT1-CLAIM-KEY-CNT
                  methodOut.setDt1ItemDx(methodOut.getDt1ClaimKeyCnt()); 
                  
              }
          }

// * Add to table if not found
//  IF CLAIM-NOTFOUND
          if ( methodOut.isClaimNotfound()  ) { 
//  IF DT1-ITEM-DX > DT1-CLAIM-KEY-MAX
              if (	( methodOut.getDt1ItemDx() > methodIn.getDt1ClaimKeyMax() )) { 
//  SET CLM-HST-END-OF-FETCH-YES TO TRUE
                  methodOut.setClmHstEndOfFetchYesTrue(); 
                  
//  PERFORM 4510-SET-NEXT-KEY-VALUE-SECT
                  setNextKeyValueSect(programCtx.getSetNextKeyValueSectInCtx());/*4510-SET-NEXT-KEY-VALUE-SECT SECTION*/
              }
//  ELSE
              else { 
//  ADD +1 TO DT1-CLAIM-KEY-CNT
                  methodOut.setDt1ClaimKeyCnt(methodOut.getDt1ClaimKeyCnt()+1);
//  SET DT1-ITEM-DX TO DT1-CLAIM-KEY-CNT
                  methodOut.setDt1ItemDx(methodOut.getDt1ClaimKeyCnt()); 
                  
//  MOVE CLAIM-KEY TO DT1-CLAIM-KEY ( DT1-ITEM-DX )
                  methodOut.setDt1ClaimKey(methodOut.getDt1ItemDx() - 1,methodOut.getClaimKey().getCharArray());
              }
          }
      
      return methodOut;
      }
      /**
      * setNextKeyValueSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4510-SET-NEXT-KEY-VALUE-SECT SECTION COBOL Cyclomatic complexity - 1
      * Input  :  

      * - hvaProcDt                      COBOL Name: HVA-PROC-DT
      * - hvaProcTm                      COBOL Name: HVA-PROC-TM
      * - hvaPgmIdLstCharVal             COBOL Name: HVA-PGM-ID-LST-CHAR-VAL
      * - hvaIcnSufxVersNbr              COBOL Name: HVA-ICN-SUFX-VERS-NBR
      * - hvaInvnCtlNbr                  COBOL Name: HVA-INVN-CTL-NBR
      * - hvaIcnSufxCd                   COBOL Name: HVA-ICN-SUFX-CD
      * - hvaLnId                        COBOL Name: HVA-LN-ID
      * - headerCt                       COBOL Name: WS-HEADER-CT
      * - nextKey                        COBOL Name: NEXT-KEY
      * - hvaSub                         COBOL Name: HVA-SUB
      *
      * Output :  

      * - dt1RspExplCode                 COBOL Name: DT1-RSP-EXPL-CODE
      * - nextProcDt                     COBOL Name: NEXT-PROC-DT
      * - hvaProcDt                      COBOL Name: HVA-PROC-DT
      * - nextProcTm                     COBOL Name: NEXT-PROC-TM
      * - hvaProcTm                      COBOL Name: HVA-PROC-TM
      * - nextPgmIdLstCharVal            COBOL Name: NEXT-PGM-ID-LST-CHAR-VAL
      * - hvaPgmIdLstCharVal             COBOL Name: HVA-PGM-ID-LST-CHAR-VAL
      * - nextIcnSufxVersNbr             COBOL Name: NEXT-ICN-SUFX-VERS-NBR
      * - hvaIcnSufxVersNbr              COBOL Name: HVA-ICN-SUFX-VERS-NBR
      * - nextInvnCtlNbr                 COBOL Name: NEXT-INVN-CTL-NBR
      * - hvaInvnCtlNbr                  COBOL Name: HVA-INVN-CTL-NBR
      * - nextIcnSufxCd                  COBOL Name: NEXT-ICN-SUFX-CD
      * - hvaIcnSufxCd                   COBOL Name: HVA-ICN-SUFX-CD
      * - nextLnId                       COBOL Name: NEXT-LN-ID
      * - hvaLnId                        COBOL Name: HVA-LN-ID
      * - nextHeaderCt                   COBOL Name: NEXT-HEADER-CT
      * - headerCt                       COBOL Name: WS-HEADER-CT
      * - dt1RspNextKey                  COBOL Name: DT1-RSP-NEXT-KEY
      * - nextKey                        COBOL Name: NEXT-KEY
      * - fetchRowsRetrieved             COBOL Name: FETCH-ROWS-RETRIEVED
      *
      * @throws CFException
      */
      @Override
      public SetNextKeyValueSectOutCtx setNextKeyValueSect(SetNextKeyValueSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4510-Set-next-key-value-sect                                *
// *81                                                              *
// *81  business function: set key value for "get-next" call        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4501-save-claim-key-sect                        *
// *82  calls     : none
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
SetNextKeyValueSectOutCtx methodOut = methodIn.getSetNextKeyValueSectOutCtx();
//  SET DT1-RSP-MULTIPLE-RECORDS TO TRUE
          methodOut.setDt1RspMultipleRecordsTrue(); 
          

// * Set next-key to restart from current row
//  MOVE HVA-PROC-DT ( HVA-SUB ) TO NEXT-PROC-DT
          methodOut.setNextProcDt(methodOut.getHvaProcDt(methodIn.getHvaSub() - 1));
//  MOVE HVA-PROC-TM ( HVA-SUB ) TO NEXT-PROC-TM
          methodOut.setNextProcTm(methodOut.getHvaProcTm(methodIn.getHvaSub() - 1));
//  MOVE HVA-PGM-ID-LST-CHAR-VAL ( HVA-SUB ) TO NEXT-PGM-ID-LST-CHAR-VAL
          methodOut.setNextPgmIdLstCharVal(methodOut.getHvaPgmIdLstCharVal(methodIn.getHvaSub() - 1));
//  MOVE HVA-ICN-SUFX-VERS-NBR ( HVA-SUB ) TO NEXT-ICN-SUFX-VERS-NBR
          methodOut.setNextIcnSufxVersNbr(methodOut.getHvaIcnSufxVersNbr(methodIn.getHvaSub() - 1));
//  MOVE HVA-INVN-CTL-NBR ( HVA-SUB ) TO NEXT-INVN-CTL-NBR
          methodOut.setNextInvnCtlNbr(methodOut.getHvaInvnCtlNbr(methodIn.getHvaSub() - 1));
//  MOVE HVA-ICN-SUFX-CD ( HVA-SUB ) TO NEXT-ICN-SUFX-CD
          methodOut.setNextIcnSufxCd(methodOut.getHvaIcnSufxCd(methodIn.getHvaSub() - 1));
//  MOVE HVA-LN-ID ( HVA-SUB ) TO NEXT-LN-ID
          methodOut.setNextLnId(methodOut.getHvaLnId(methodIn.getHvaSub() - 1));
//  MOVE WS-HEADER-CT TO NEXT-HEADER-CT
          methodOut.setNextHeaderCt(methodOut.getHeaderCt());
//  MOVE SPACE TO DT1-RSP-NEXT-KEY
          methodOut.setDt1RspNextKey(CONSTANTS.SPACE_80);
//  MOVE NEXT-KEY (1 : LENGTH OF NEXT-KEY ) TO DT1-RSP-NEXT-KEY
          methodOut.setDt1RspNextKey(pad(80,substring(methodOut.getNextKey().getCharArray(),0,NextKey.getNextKeyFieldLength()),SPACE_CHAR,RIGHT_PAD));
          methodOut.setFetchRowsRetrieved(methodIn.getHvaSub() - 1);
      
      return methodOut;
      }
      /**
      * writeClmDataSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4600-WRITE-CLM-DATA-SECT SECTION COBOL Cyclomatic complexity - 25
      * Input  :  

      * - hldInvnCtlNbr                  COBOL Name: HLD-INVN-CTL-NBR
      * - hvaInvnCtlNbr                  COBOL Name: HVA-INVN-CTL-NBR
      * - hldIcnSufxCd                   COBOL Name: HLD-ICN-SUFX-CD
      * - hvaIcnSufxCd                   COBOL Name: HVA-ICN-SUFX-CD
      * - hldProcDt                      COBOL Name: HLD-PROC-DT
      * - hvaProcDt                      COBOL Name: HVA-PROC-DT
      * - hldProcTm                      COBOL Name: HLD-PROC-TM
      * - hvaProcTm                      COBOL Name: HVA-PROC-TM
      * - hldLstCharVal                  COBOL Name: HLD-LST-CHAR-VAL
      * - hvaPgmIdLstCharVal             COBOL Name: HVA-PGM-ID-LST-CHAR-VAL
      * - hvaSub                         COBOL Name: HVA-SUB
      * - hldIcnSufxVersNbr              COBOL Name: HLD-ICN-SUFX-VERS-NBR
      * - hvaIcnSufxVersNbr              COBOL Name: HVA-ICN-SUFX-VERS-NBR
      * - headerCt                       COBOL Name: WS-HEADER-CT
      * - hvaTransCd                     COBOL Name: HVA-TRANS-CD
      * - hvaProvScrnNbr                 COBOL Name: HVA-PROV-SCRN-NBR
      * - hvaProvTinsuff                 COBOL Name: HVA-PROV-TINSUFF
      * - hvaSrvcCd                      COBOL Name: HVA-SRVC-CD
      * - hvaPayCd                       COBOL Name: HVA-PAY-CD
      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * Output :  

      * - recType                        COBOL Name: WS-REC-TYPE
      * - dt1ClmHeaderCt                 COBOL Name: DT1-CLM-HEADER-CT
      * - headerCt                       COBOL Name: WS-HEADER-CT
      * - hldIcnSufxVersNbr              COBOL Name: HLD-ICN-SUFX-VERS-NBR
      * - hvaIcnSufxVersNbr              COBOL Name: HVA-ICN-SUFX-VERS-NBR
      * - diffrntVerFoundSw              COBOL Name: WS-DIFFRNT-VER-FOUND-SW
      * - hldInvnCtlNbr                  COBOL Name: HLD-INVN-CTL-NBR
      * - hvaInvnCtlNbr                  COBOL Name: HVA-INVN-CTL-NBR
      * - hldIcnSufxCd                   COBOL Name: HLD-ICN-SUFX-CD
      * - hvaIcnSufxCd                   COBOL Name: HVA-ICN-SUFX-CD
      * - hldProcDt                      COBOL Name: HLD-PROC-DT
      * - hvaProcDt                      COBOL Name: HVA-PROC-DT
      * - hldProcTm                      COBOL Name: HLD-PROC-TM
      * - hvaProcTm                      COBOL Name: HVA-PROC-TM
      * - hldLstCharVal                  COBOL Name: HLD-LST-CHAR-VAL
      * - hvaPgmIdLstCharVal             COBOL Name: HVA-PGM-ID-LST-CHAR-VAL
      * - hvaProvScrnNbr                 COBOL Name: HVA-PROV-SCRN-NBR
      * - holdArea                       COBOL Name: WS-HOLD-AREA
      * - payeeCode                      COBOL Name: WS-PAYEE-CODE
      *
      * @throws CFException
      */
      @Override
      public WriteClmDataSectOutCtx writeClmDataSect(WriteClmDataSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4600-Write-clm-data-sect                                    *
// *81                                                              *
// *81  business function: format and put clm data containers       *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4500-proc-fetched-rows-sect                     *
// *82  calls     : 4610-move-claim-data-sect                       *
// *82            : 4501-save-claim-key-sect                        *
// *82            : 8120-put-d5427dt1-clm-sect                      *
// *82***************************************************************
// *================================================================

// * Do the header-ct key break logic
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
WriteClmDataSectOutCtx methodOut = methodIn.getWriteClmDataSectOutCtx();
//  IF HLD-INVN-CTL-NBR = HVA-INVN-CTL-NBR ( HVA-SUB ) AND HLD-ICN-SUFX-CD = HVA-ICN-SUFX-CD ( HVA-SUB ) AND HLD-PROC-DT = HVA-PROC-DT ( HVA-SUB ) AND HLD-PROC-TM = HVA-PROC-TM ( HVA-SUB ) AND HLD-LST-CHAR-VAL = HVA-PGM-ID-LST-CHAR-VAL ( HVA-SUB )
          if (		compareChars(methodOut.getHldInvnCtlNbr(),methodOut.getHvaInvnCtlNbr(methodIn.getHvaSub() - 1)) == 0  && 		compareChars(methodOut.getHldIcnSufxCd(),methodOut.getHvaIcnSufxCd(methodIn.getHvaSub() - 1)) == 0  && 		compareChars(methodOut.getHldProcDt(),methodOut.getHvaProcDt(methodIn.getHvaSub() - 1)) == 0  && 		compareChars(methodOut.getHldProcTm(),methodOut.getHvaProcTm(methodIn.getHvaSub() - 1)) == 0  && 		compareChars(methodOut.getHldLstCharVal(),methodOut.getHvaPgmIdLstCharVal(methodIn.getHvaSub() - 1)) == 0 ) { 
//  IF HLD-ICN-SUFX-VERS-NBR = HVA-ICN-SUFX-VERS-NBR ( HVA-SUB )
              if (	( methodOut.getHldIcnSufxVersNbr() == methodOut.getHvaIcnSufxVersNbr(methodIn.getHvaSub() - 1) )) { 
                  // MOVE '2' TO WS-REC-TYPE
                  //  LITERAL_2 = '2'
                  methodOut.setRecType(CONSTANTS.LITERAL_2);
//  MOVE WS-HEADER-CT TO DT1-CLM-HEADER-CT (1)
                  methodOut.setDt1ClmHeaderCt(0,methodOut.getHeaderCt());
              }
//  ELSE
              else { 

// * If version not = hold determine based on trans-code
//  MOVE HVA-ICN-SUFX-VERS-NBR ( HVA-SUB ) TO HLD-ICN-SUFX-VERS-NBR
                  methodOut.setHldIcnSufxVersNbr(methodOut.getHvaIcnSufxVersNbr(methodIn.getHvaSub() - 1));
//  IF HVA-TRANS-CD ( HVA-SUB ) = '72' OR HVA-TRANS-CD ( HVA-SUB ) = '87'
//  LITERAL_87 = '87'
                  if (		compareChars(methodIn.getHvaTransCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_72) == 0  || 		compareChars(methodIn.getHvaTransCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_87) == 0 ) { 
                      // MOVE '2' TO WS-REC-TYPE
                      //  LITERAL_2 = '2'
                      methodOut.setRecType(CONSTANTS.LITERAL_2);
//  MOVE WS-HEADER-CT TO DT1-CLM-HEADER-CT (1)
                      methodOut.setDt1ClmHeaderCt(0,methodOut.getHeaderCt());
                  }
//  ELSE
                  else { 
                      // MOVE '1' TO WS-REC-TYPE
                      //  LITERAL_1 = '1'
                      methodOut.setRecType(CONSTANTS.LITERAL_1);
//  MOVE WS-HEADER-CT TO DT1-CLM-HEADER-CT (1)
                      methodOut.setDt1ClmHeaderCt(0,methodOut.getHeaderCt());

// * Flag used to id new header based on version
//  SET WS-DIFFRNT-VER-FOUND TO TRUE
                      methodOut.setDiffrntVerFoundTrue(); 
                      
                  }
              }
          }
//  ELSE
          else { 

// * Main key not = hold - consider new header
//  MOVE HVA-INVN-CTL-NBR ( HVA-SUB ) TO HLD-INVN-CTL-NBR
              methodOut.setHldInvnCtlNbr(methodOut.getHvaInvnCtlNbr(methodIn.getHvaSub() - 1));
//  MOVE HVA-ICN-SUFX-CD ( HVA-SUB ) TO HLD-ICN-SUFX-CD
              methodOut.setHldIcnSufxCd(methodOut.getHvaIcnSufxCd(methodIn.getHvaSub() - 1));
//  MOVE HVA-PROC-DT ( HVA-SUB ) TO HLD-PROC-DT
              methodOut.setHldProcDt(methodOut.getHvaProcDt(methodIn.getHvaSub() - 1));
//  MOVE HVA-PROC-TM ( HVA-SUB ) TO HLD-PROC-TM
              methodOut.setHldProcTm(methodOut.getHvaProcTm(methodIn.getHvaSub() - 1));
//  MOVE HVA-ICN-SUFX-VERS-NBR ( HVA-SUB ) TO HLD-ICN-SUFX-VERS-NBR
              methodOut.setHldIcnSufxVersNbr(methodOut.getHvaIcnSufxVersNbr(methodIn.getHvaSub() - 1));
//  MOVE HVA-PGM-ID-LST-CHAR-VAL ( HVA-SUB ) TO HLD-LST-CHAR-VAL
              methodOut.setHldLstCharVal(methodOut.getHvaPgmIdLstCharVal(methodIn.getHvaSub() - 1));
              // MOVE '1' TO WS-REC-TYPE
              //  LITERAL_1 = '1'
              methodOut.setRecType(CONSTANTS.LITERAL_1);
//  ADD 1 TO WS-HEADER-CT
              methodOut.setHeaderCt( (short) (methodOut.getHeaderCt()+(short)1));
//  MOVE WS-HEADER-CT TO DT1-CLM-HEADER-CT (1)
              methodOut.setDt1ClmHeaderCt(0,methodOut.getHeaderCt());

// * New version - consider header
//  IF WS-DIFFRNT-VER-FOUND
              if ( methodOut.isDiffrntVerFound()  ) { 
//  SET WS-DIFFRNT-VER-NOT-FOUND TO TRUE
                  methodOut.setDiffrntVerNotFoundTrue(); 
                  
//  ADD 1 TO WS-HEADER-CT
                  methodOut.setHeaderCt( (short) (methodOut.getHeaderCt()+(short)1));
//  MOVE WS-HEADER-CT TO DT1-CLM-HEADER-CT (1)
                  methodOut.setDt1ClmHeaderCt(0,methodOut.getHeaderCt());
              }
          }

// * Set tin value
//  IF NOT ( HVA-PROV-SCRN-NBR ( HVA-SUB ) = ZERO )
          if ((!( allZeros(methodOut.getHvaProvScrnNbr(methodIn.getHvaSub() - 1)) ) /*  !=  zeros*/)) { 
//  IF HVA-PROV-SCRN-NBR ( HVA-SUB ) NUMERIC
//  ELSE
              if (    !( isNumeric(methodOut.getHvaProvScrnNbr(methodIn.getHvaSub() - 1)) )) { 
//  MOVE ZERO TO HVA-PROV-SCRN-NBR ( HVA-SUB )
                  methodOut.setHvaProvScrnNbr(methodIn.getHvaSub() - 1,CONSTANTS.ZERO_1);
              }
          }
//  ELSE
          else { 
//  MOVE ZERO TO HVA-PROV-SCRN-NBR ( HVA-SUB )
              methodOut.setHvaProvScrnNbr(methodIn.getHvaSub() - 1,CONSTANTS.ZERO_1);
          }

// * Possibly skips a row
//  IF HVA-PROV-TINSUFF ( HVA-SUB ) = ZERO AND HVA-SRVC-CD ( HVA-SUB ) = SPACE AND NOT ( HVA-PAY-CD ( HVA-SUB ) = ( '1' OR '2' OR '3' OR '4' OR 'H' OR 'Q' OR 'M' OR 'S' OR 'Z' ) )
          if (( allZeros(methodIn.getHvaProvTinsuff(methodIn.getHvaSub() - 1)) ) /*  ==  zeros*/ &&         ( allSpaces(methodIn.getHvaSrvcCd(methodIn.getHvaSub() - 1))   ) && (((methodIn.getHvaPayCd(methodIn.getHvaSub() - 1)[0] != '1' && methodIn.getHvaPayCd(methodIn.getHvaSub() - 1)[0] != '2' && methodIn.getHvaPayCd(methodIn.getHvaSub() - 1)[0] != '3' && methodIn.getHvaPayCd(methodIn.getHvaSub() - 1)[0] != '4' && methodIn.getHvaPayCd(methodIn.getHvaSub() - 1)[0] != 'H' && methodIn.getHvaPayCd(methodIn.getHvaSub() - 1)[0] != 'Q' && methodIn.getHvaPayCd(methodIn.getHvaSub() - 1)[0] != 'M' && methodIn.getHvaPayCd(methodIn.getHvaSub() - 1)[0] != 'S' && methodIn.getHvaPayCd(methodIn.getHvaSub() - 1)[0] != 'Z')))) { 
//  IF WS-REC-TYPE = '1'
//  LITERAL_1 = '1'
              if (compareChars(methodOut.getRecType(), CONSTANTS.LITERAL_1) == 0) { 
//  INITIALIZE WS-HOLD-AREA
                  methodOut.getHoldArea().initialize();
              }
//cobolCode::GO TO 4600-WRITE-CLM-DATA-EXIT
return methodOut;
//cobolCodeEnds::GO TO 4600-WRITE-CLM-DATA-EXIT
          }

// * This row is selected

// * Move claim data items
          
// * This row is selected

// * Move claim data items
          // MOVE SPACES TO WS-PAYEE-CODE
          methodOut.setPayeeCode(CONSTANTS.SPACE);
//  PERFORM 4610-MOVE-CLAIM-DATA-SECT
          moveClaimDataSect(programCtx.getMoveClaimDataSectInCtx());/*4610-MOVE-CLAIM-DATA-SECT SECTION*/
//  PERFORM 4501-SAVE-CLAIM-KEY-SECT
          saveClaimKeySect(programCtx.getSaveClaimKeySectInCtx());/*4501-SAVE-CLAIM-KEY-SECT SECTION*/
//  IF CLM-HST-END-OF-FETCH-NO
          if ( methodIn.isClmHstEndOfFetchNo()  ) { 
//  PERFORM 8120-PUT-D5427DT1-CLM-SECT
              putD5427dt1ClmSect(programCtx.getPutD5427dt1ClmSectInCtx());/*8120-PUT-D5427DT1-CLM-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * moveClaimDataSect 
      *   This method is derived from 
  *   COBOL Paragraph - 4610-MOVE-CLAIM-DATA-SECT SECTION COBOL Cyclomatic complexity - 94
      * Input  :  

      * - hvaSrvcCd                      COBOL Name: HVA-SRVC-CD
      * - hvaPmtSvcCd                    COBOL Name: HVA-PMT-SVC-CD
      * - hvaSub                         COBOL Name: HVA-SUB
      * - hvaProvTinsuff                 COBOL Name: HVA-PROV-TINSUFF
      * - hvaPayCd                       COBOL Name: HVA-PAY-CD
      * - hvaNcAmt                       COBOL Name: HVA-NC-AMT
      * - hvaProcDt                      COBOL Name: HVA-PROC-DT
      * - hvaOvrCd                       COBOL Name: HVA-OVR-CD
      * - hvaPrsCreatSrcCd               COBOL Name: HVA-PRS-CREAT-SRC-CD
      * - hvaRmrkCd                      COBOL Name: HVA-RMRK-CD
      * - hvaFlnJulianDtNbr              COBOL Name: HVA-FLN-JULIAN-DT-NBR
      * - hvaFlnSrlNbr                   COBOL Name: HVA-FLN-SRL-NBR
      * - hvaInvnCtlNbr                  COBOL Name: HVA-INVN-CTL-NBR
      * - hvaIcnSufxCd                   COBOL Name: HVA-ICN-SUFX-CD
      * - hvaProcTm                      COBOL Name: HVA-PROC-TM
      * - hvaPtntRespAmt                 COBOL Name: HVA-PTNT-RESP-AMT
      * - hvaPpoCd                       COBOL Name: HVA-PPO-CD
      * - hvaProcT1Ind                   COBOL Name: HVA-PROC-T1-IND
      * - hvaDftNbr                      COBOL Name: HVA-DFT-NBR
      * - hvaAuthNbr                     COBOL Name: HVA-AUTH-NBR
      * - hvaAuthSrcId                   COBOL Name: HVA-AUTH-SRC-ID
      * - hvaAuthProcCd                  COBOL Name: HVA-AUTH-PROC-CD
      * - hvaFilmOfcNbr                  COBOL Name: HVA-FILM-OFC-NBR
      * - dt1ClmProcDt                   COBOL Name: DT1-CLM-PROC-DT
      * - formattedDate                  COBOL Name: FORMATTED-DATE
      * - hvaFstDt                       COBOL Name: HVA-FST-DT
      * - hvaLstSrvcDt                   COBOL Name: HVA-LST-SRVC-DT
      * - hvaClmLvlRsnCd                 COBOL Name: HVA-CLM-LVL-RSN-CD
      * - hvaAdjtrId                     COBOL Name: HVA-ADJTR-ID
      * - hvaMbrPrvInd                   COBOL Name: HVA-MBR-PRV-IND
      * - hvaDiagCd                      COBOL Name: HVA-DIAG-CD
      * - hvaNtfyWaivCd                  COBOL Name: HVA-NTFY-WAIV-CD
      * - hvaDlgteInd                    COBOL Name: HVA-DLGTE-IND
      * - hvaNdbContrId                  COBOL Name: HVA-NDB-CONTR-ID
      * - hvaClmSmbTypAppCd              COBOL Name: HVA-CLM-SMB-TYP-APP-CD
      * - hvaSmbStCd                     COBOL Name: HVA-SMB-ST-CD
      * - hvaDrgNbr                      COBOL Name: HVA-DRG-NBR
      * - hvaFaclOrProfCd                COBOL Name: HVA-FACL-OR-PROF-CD
      * - hvaProvEobNm                   COBOL Name: HVA-PROV-EOB-NM
      * - hvaProvNm                      COBOL Name: HVA-PROV-NM
      * - hvaTpsmCd                      COBOL Name: HVA-TPSM-CD
      * - hvaProvSpclCd                  COBOL Name: HVA-PROV-SPCL-CD
      * - hvaProvMedcdReclmInd           COBOL Name: HVA-PROV-MEDCD-RECLM-IND
      * - hvaRelSrvcClmLvlInd            COBOL Name: HVA-REL-SRVC-CLM-LVL-IND
      * - hvaAuthUniqCnt                 COBOL Name: HVA-AUTH-UNIQ-CNT
      * - hvaMskNullInd                  COBOL Name: HVA-MSK-NULL-IND
      * - hvaProvPrdctCd                 COBOL Name: HVA-PROV-PRDCT-CD
      * - hvaProvMktTypCd                COBOL Name: HVA-PROV-MKT-TYP-CD
      * - hvaProvMktNbr                  COBOL Name: HVA-PROV-MKT-NBR
      * - hvaProvIpaId                   COBOL Name: HVA-PROV-IPA-ID
      *
      * Output :  

      * - infoLineInd                    COBOL Name: INFO-LINE-IND
      * - dt1ClmProviderId               COBOL Name: DT1-CLM-PROVIDER-ID
      * - payeeCode                      COBOL Name: WS-PAYEE-CODE
      * - hvaProvTinsuff                 COBOL Name: HVA-PROV-TINSUFF
      * - hvaPayCd                       COBOL Name: HVA-PAY-CD
      * - dt1ClmParInd                   COBOL Name: DT1-CLM-PAR-IND
      * - dt1ClmNonParInd                COBOL Name: DT1-CLM-NON-PAR-IND
      * - hvaBaseAmt                     COBOL Name: HVA-BASE-AMT
      * - hvaMmAmt                       COBOL Name: HVA-MM-AMT
      * - hvaSupAmt                      COBOL Name: HVA-SUP-AMT
      * - hvaCopayAmt                    COBOL Name: HVA-COPAY-AMT
      * - hvaNcAmt                       COBOL Name: HVA-NC-AMT
      * - hvaChrgAmt                     COBOL Name: HVA-CHRG-AMT
      * - hvaCobCrResAmt                 COBOL Name: HVA-COB-CR-RES-AMT
      * - hvaMcCrResAmt                  COBOL Name: HVA-MC-CR-RES-AMT
      * - hvaBaseDedAmt                  COBOL Name: HVA-BASE-DED-AMT
      * - hvaMmDedAmt                    COBOL Name: HVA-MM-DED-AMT
      * - hvaMmDedDescTxt                COBOL Name: HVA-MM-DED-DESC-TXT
      * - hvaBaseDedDescTxt              COBOL Name: HVA-BASE-DED-DESC-TXT
      * - dt1ClmChargeAmount             COBOL Name: DT1-CLM-CHARGE-AMOUNT
      * - hvaSub2                        COBOL Name: HVA-SUB2
      * - dt1ClmPaidAmount               COBOL Name: DT1-CLM-PAID-AMOUNT
      * - dt1ClmDeductibleAmount         COBOL Name: DT1-CLM-DEDUCTIBLE-AMOUNT
      * - dt1ClmPtntRespAmt              COBOL Name: DT1-CLM-PTNT-RESP-AMT
      * - hvaPtntRespAmt                 COBOL Name: HVA-PTNT-RESP-AMT
      * - dt1ClmPpoInd                   COBOL Name: DT1-CLM-PPO-IND
      * - dt1ClmT1ProcessInd             COBOL Name: DT1-CLM-T1-PROCESS-IND
      * - hvaProcT1Ind                   COBOL Name: HVA-PROC-T1-IND
      * - dt1ClmDraftNo                  COBOL Name: DT1-CLM-DRAFT-NO
      * - hvaDftNbr                      COBOL Name: HVA-DFT-NBR
      * - dt1ClmAuthNbr                  COBOL Name: DT1-CLM-AUTH-NBR
      * - hvaAuthNbr                     COBOL Name: HVA-AUTH-NBR
      * - dt1ClmAuthSrcId                COBOL Name: DT1-CLM-AUTH-SRC-ID
      * - hvaAuthSrcId                   COBOL Name: HVA-AUTH-SRC-ID
      * - dt1ClmAuthProcCd               COBOL Name: DT1-CLM-AUTH-PROC-CD
      * - hvaAuthProcCd                  COBOL Name: HVA-AUTH-PROC-CD
      * - dt1ClmFilmOffice               COBOL Name: DT1-CLM-FILM-OFFICE
      * - hvaFilmOfcNbr                  COBOL Name: HVA-FILM-OFC-NBR
      * - dt1ClmFln                      COBOL Name: DT1-CLM-FLN
      * - hvaFlnJulianDtNbr              COBOL Name: HVA-FLN-JULIAN-DT-NBR
      * - hvaFlnSrlNbr                   COBOL Name: HVA-FLN-SRL-NBR
      * - topsIcn10                      COBOL Name: TOPS-ICN-10
      * - hvaInvnCtlNbr                  COBOL Name: HVA-INVN-CTL-NBR
      * - dt1ClmIcn                      COBOL Name: DT1-CLM-ICN
      * - dt1ClmProcDt                   COBOL Name: DT1-CLM-PROC-DT
      * - dt1ClmSuffixCd                 COBOL Name: DT1-CLM-SUFFIX-CD
      * - hvaIcnSufxCd                   COBOL Name: HVA-ICN-SUFX-CD
      * - hvaProcDt                      COBOL Name: HVA-PROC-DT
      * - dt1ClmProcTm                   COBOL Name: DT1-CLM-PROC-TM
      * - hvaProcTm                      COBOL Name: HVA-PROC-TM
      * - chrdateString                  COBOL Name: CHRDATE-STRING
      * - chrdateLength                  COBOL Name: CHRDATE-LENGTH
      * - dt1ClmFlnFormatDt              COBOL Name: DT1-CLM-FLN-FORMAT-DT
      * - formattedDate                  COBOL Name: FORMATTED-DATE
      * - dt1ClmFirstServiceDate         COBOL Name: DT1-CLM-FIRST-SERVICE-DATE
      * - dt1ClmLastServiceDate          COBOL Name: DT1-CLM-LAST-SERVICE-DATE
      * - hvaFstDt                       COBOL Name: HVA-FST-DT
      * - hvaLstSrvcDt                   COBOL Name: HVA-LST-SRVC-DT
      * - dt1ClmClmLevelRc               COBOL Name: DT1-CLM-CLM-LEVEL-RC
      * - hvaClmLvlRsnCd                 COBOL Name: HVA-CLM-LVL-RSN-CD
      * - dt1ClmAdjNbr                   COBOL Name: DT1-CLM-ADJ-NBR
      * - hvaAdjtrId                     COBOL Name: HVA-ADJTR-ID
      * - dt1ClmAdjInd                   COBOL Name: DT1-CLM-ADJ-IND
      * - dt1ClmClmPhiInd                COBOL Name: DT1-CLM-CLM-PHI-IND
      * - hvaMbrPrvInd                   COBOL Name: HVA-MBR-PRV-IND
      * - dt1ClmPrimaryDiagnosis         COBOL Name: DT1-CLM-PRIMARY-DIAGNOSIS
      * - hvaDiagCd                      COBOL Name: HVA-DIAG-CD
      * - dt1ClmParsWaivInd              COBOL Name: DT1-CLM-PARS-WAIV-IND
      * - hvaNtfyWaivCd                  COBOL Name: HVA-NTFY-WAIV-CD
      * - dt1ClmDlgteInd                 COBOL Name: DT1-CLM-DLGTE-IND
      * - hvaDlgteInd                    COBOL Name: HVA-DLGTE-IND
      * - dt1ClmNdbContrId               COBOL Name: DT1-CLM-NDB-CONTR-ID
      * - hvaNdbContrId                  COBOL Name: HVA-NDB-CONTR-ID
      * - dt1ClmSmbAppCd                 COBOL Name: DT1-CLM-SMB-APP-CD
      * - hvaClmSmbTypAppCd              COBOL Name: HVA-CLM-SMB-TYP-APP-CD
      * - dt1ClmSmbStCd                  COBOL Name: DT1-CLM-SMB-ST-CD
      * - hvaSmbStCd                     COBOL Name: HVA-SMB-ST-CD
      * - dt1ClmDrgNbr                   COBOL Name: DT1-CLM-DRG-NBR
      * - hvaDrgNbr                      COBOL Name: HVA-DRG-NBR
      * - dt1ClmHospProfInd              COBOL Name: DT1-CLM-HOSP-PROF-IND
      * - hvaFaclOrProfCd                COBOL Name: HVA-FACL-OR-PROF-CD
      * - dt1ClmClaimStatus              COBOL Name: DT1-CLM-CLAIM-STATUS
      * - dt1ClmPendedFlag               COBOL Name: DT1-CLM-PENDED-FLAG
      * - dt1ClmClosedFlag               COBOL Name: DT1-CLM-CLOSED-FLAG
      * - dt1ClmRejectedFlag             COBOL Name: DT1-CLM-REJECTED-FLAG
      * - dt1ClmPaidFlag                 COBOL Name: DT1-CLM-PAID-FLAG
      * - dt1ClmProviderName             COBOL Name: DT1-CLM-PROVIDER-NAME
      * - dt1ClmProviderPrefix           COBOL Name: DT1-CLM-PROVIDER-PREFIX
      * - hvaProvNm                      COBOL Name: HVA-PROV-NM
      * - dt1ClmTpsmCd                   COBOL Name: DT1-CLM-TPSM-CD
      * - hvaTpsmCd                      COBOL Name: HVA-TPSM-CD
      * - dt1ClmProvSpclCd               COBOL Name: DT1-CLM-PROV-SPCL-CD
      * - hvaProvSpclCd                  COBOL Name: HVA-PROV-SPCL-CD
      * - dt1ClmProvMedcdReclmInd        COBOL Name: DT1-CLM-PROV-MEDCD-RECLM-IND
      * - hvaProvMedcdReclmInd           COBOL Name: HVA-PROV-MEDCD-RECLM-IND
      * - dt1ClmAuthClmLevelInd          COBOL Name: DT1-CLM-AUTH-CLM-LEVEL-IND
      * - hvaRelSrvcClmLvlInd            COBOL Name: HVA-REL-SRVC-CLM-LVL-IND
      * - dt1ClmAuthUniqueCnt            COBOL Name: DT1-CLM-AUTH-UNIQUE-CNT
      * - hvaAuthUniqCnt                 COBOL Name: HVA-AUTH-UNIQ-CNT
      * - hvaPhysMedcnMskCnt             COBOL Name: HVA-PHYS-MEDCN-MSK-CNT
      * - dt1ClmMskInd                   COBOL Name: DT1-CLM-MSK-IND
      * - dt1ClmProviderTier             COBOL Name: DT1-CLM-PROVIDER-TIER
      *
      * @throws CFException
      */
      @Override
      public MoveClaimDataSectOutCtx moveClaimDataSect(MoveClaimDataSectInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *81***************************************************************
// *81  4610-Move-claim-data-sect                                   *
// *81                                                              *
// *81  business function: format and put clm data containers       *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4600-write-clm-data-sect                        *
// *82  calls     : 9800-convert-yyddd-2-iso-sect                   *
// *82***************************************************************
// *================================================================

// * Check for info line
// * payee code is used in sort
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
MoveClaimDataSectOutCtx methodOut = methodIn.getMoveClaimDataSectOutCtx();
//  SET INFO-LINE-NO TO TRUE
          methodOut.setInfoLineNoTrue(); 
          
//  IF ( HVA-SRVC-CD ( HVA-SUB ) = SPACES) AND ( HVA-PMT-SVC-CD ( HVA-SUB ) NOT = ( 'PAYCCR' AND 'PAYMCR' AND 'DISCO' AND 'AENC' AND 'CXAUDT' AND 'CXINT' AND 'CXMED' AND 'CXMISC' AND 'CXLEG' AND 'COPAY' AND 'NCOPAY' AND 'RCOPAY' ) )
//  LITERAL_RCOPAY = 'RCOPAY'
          if ((        ( allSpaces(methodIn.getHvaSrvcCd(methodIn.getHvaSub() - 1))   )) && (((		compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_PAYCCR) != 0  && 		compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_PAYMCR) != 0  && compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_DISCO_B_) != 0 && compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_AENC_B2_) != 0 && 		compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_CXAUDT) != 0  && compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_CXINT_B_) != 0 && compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_CXMED_B_) != 0 && 		compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_CXMISC) != 0  && compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_CXLEG_B_) != 0 && compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_COPAY_B_) != 0 && 		compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_NCOPAY) != 0  && 		compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_RCOPAY) != 0 )))) { 
//  SET INFO-LINE-YES TO TRUE
              methodOut.setInfoLineYesTrue(); 
              
//  MOVE ZERO TO DT1-CLM-PROVIDER-ID (1)
              methodOut.setDt1ClmProviderId(0,CONSTANTS.ZERO_15);
              // MOVE SPACE TO WS-PAYEE-CODE
              methodOut.setPayeeCode(CONSTANTS.SPACE);
          }
//  ELSE
          else { 
//  MOVE HVA-PROV-TINSUFF ( HVA-SUB ) TO DT1-CLM-PROVIDER-ID (1)
              methodOut.setDt1ClmProviderId(0,methodOut.getHvaProvTinsuff(methodIn.getHvaSub() - 1));
//  MOVE HVA-PAY-CD ( HVA-SUB ) TO WS-PAYEE-CODE
              methodOut.setPayeeCode(methodOut.getHvaPayCd(methodIn.getHvaSub() - 1));
          }
//  EVALUATE HVA-PPO-CD ( HVA-SUB )
          switch(new String(methodIn.getHvaPpoCd(methodIn.getHvaSub() - 1))){
          	case "C":
          
          	case "D":
          
          	case "E":
          
          	case "P":
          
          	case "Q":
//  MOVE 'Y' TO DT1-CLM-PAR-IND (1)
//  LITERAL_Y = 'Y'
              methodOut.setDt1ClmParInd(0,CONSTANTS.LITERAL_Y);
          break;
          	case "A":
          
          	case "B":
          
          	case "N":
          
          	case "R":
          
          	case " ":
//  MOVE 'Y' TO DT1-CLM-NON-PAR-IND (1)
//  LITERAL_Y = 'Y'
              methodOut.setDt1ClmNonParInd(0,CONSTANTS.LITERAL_Y);
          break;
          default :
//  MOVE SPACE TO DT1-CLM-PAR-IND (1)
              methodOut.setDt1ClmParInd(0,CONSTANTS.SPACE);
//  MOVE SPACE TO DT1-CLM-NON-PAR-IND (1)
              methodOut.setDt1ClmNonParInd(0,CONSTANTS.SPACE);
          }
//  IF HVA-PMT-SVC-CD ( HVA-SUB ) = 'PAYCCR' OR 'PAYMCR'
//  LITERAL_PAYMCR = 'PAYMCR'
          if (		compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_PAYCCR) == 0  || 		compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_PAYMCR) == 0 ) { 
//  MOVE ZEROES TO HVA-BASE-AMT ( HVA-SUB ) HVA-MM-AMT ( HVA-SUB ) HVA-SUP-AMT ( HVA-SUB )
              methodOut.setHvaBaseAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
              methodOut.setHvaMmAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
              methodOut.setHvaSupAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
          }
//  IF HVA-PMT-SVC-CD ( HVA-SUB ) = 'COPAY' OR 'NCOPAY' OR 'RCOPAY'
//  LITERAL_RCOPAY = 'RCOPAY'
          if (compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_COPAY_B_) == 0 || 		compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_NCOPAY) == 0  || 		compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_RCOPAY) == 0 ) { 
//  MOVE HVA-NC-AMT ( HVA-SUB ) TO HVA-COPAY-AMT ( HVA-SUB )
              methodOut.setHvaCopayAmt(methodIn.getHvaSub() - 1,methodOut.getHvaNcAmt(methodIn.getHvaSub() - 1));
//  MOVE ZEROS TO HVA-CHRG-AMT ( HVA-SUB ) , HVA-NC-AMT ( HVA-SUB )
              methodOut.setHvaChrgAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
              methodOut.setHvaNcAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
          }
//  IF HVA-PMT-SVC-CD ( HVA-SUB ) = 'DISCO '
//  LITERAL_DISCO_B_ = 'DISCO '
          if (		compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_DISCO_B_) == 0 ) { 
//  IF HVA-PROC-DT ( HVA-SUB ) < '1995-04-01'
//  LITERAL_1995_MN2_0401 = '1995-04-01'
              if (		compareChars(methodOut.getHvaProcDt(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_1995_MN2_0401) < 0 ) { 
//  MOVE HVA-CHRG-AMT ( HVA-SUB ) TO HVA-BASE-AMT ( HVA-SUB )
                  methodOut.setHvaBaseAmt(methodIn.getHvaSub() - 1,methodOut.getHvaChrgAmt(methodIn.getHvaSub() - 1));
              }
//  ELSE
              else { 
//  MOVE ZEROS TO HVA-BASE-AMT ( HVA-SUB ) HVA-NC-AMT ( HVA-SUB )
                  methodOut.setHvaBaseAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
                  methodOut.setHvaNcAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
              }
//  MOVE ZEROS TO HVA-MM-AMT ( HVA-SUB ) HVA-SUP-AMT ( HVA-SUB ) HVA-COB-CR-RES-AMT ( HVA-SUB ) HVA-MC-CR-RES-AMT ( HVA-SUB ) HVA-CHRG-AMT ( HVA-SUB )
              methodOut.setHvaMmAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
              methodOut.setHvaSupAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
              methodOut.setHvaCobCrResAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
              methodOut.setHvaMcCrResAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
              methodOut.setHvaChrgAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
          }
//  IF HVA-OVR-CD ( HVA-SUB ) = ' R' OR 'R ' OR 'C ' OR ' C'
//  LITERAL_B_C = ' C'
          if (		compareChars(methodIn.getHvaOvrCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_B_R) == 0  || 		compareChars(methodIn.getHvaOvrCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_R_B_) == 0  || 		compareChars(methodIn.getHvaOvrCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_C_B_) == 0  || 		compareChars(methodIn.getHvaOvrCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_B_C) == 0 ) { 
//  MOVE ZEROES TO HVA-BASE-AMT ( HVA-SUB ) HVA-MM-AMT ( HVA-SUB ) HVA-SUP-AMT ( HVA-SUB ) HVA-COB-CR-RES-AMT ( HVA-SUB ) HVA-MC-CR-RES-AMT ( HVA-SUB ) HVA-BASE-DED-AMT ( HVA-SUB ) HVA-MM-DED-AMT ( HVA-SUB )
              methodOut.setHvaBaseAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
              methodOut.setHvaMmAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
              methodOut.setHvaSupAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
              methodOut.setHvaCobCrResAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
              methodOut.setHvaMcCrResAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
              methodOut.setHvaBaseDedAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
              methodOut.setHvaMmDedAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
          }
//  IF HVA-PMT-SVC-CD ( HVA-SUB ) = 'CONV'
          if (compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_CONV_B2_) == 0) { 
//  MOVE ZEROES TO HVA-BASE-DED-AMT ( HVA-SUB ) HVA-MM-DED-AMT ( HVA-SUB )
              methodOut.setHvaBaseDedAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
              methodOut.setHvaMmDedAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
//  MOVE SPACE TO HVA-MM-DED-DESC-TXT ( HVA-SUB ) HVA-BASE-DED-DESC-TXT ( HVA-SUB )
              methodOut.setHvaMmDedDescTxt(methodIn.getHvaSub() - 1,CONSTANTS.SPACE_2);
              methodOut.setHvaBaseDedDescTxt(methodIn.getHvaSub() - 1,CONSTANTS.SPACE_2);
//  MOVE ZEROES TO HVA-NC-AMT ( HVA-SUB ) HVA-CHRG-AMT ( HVA-SUB )
              methodOut.setHvaNcAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
              methodOut.setHvaChrgAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
          }
//  IF HVA-PRS-CREAT-SRC-CD ( HVA-SUB ) = 'OG' OR SPACES OR LOW-VALUES
          if (		compareChars(methodIn.getHvaPrsCreatSrcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_OG) == 0  ||         ( allSpaces(methodIn.getHvaPrsCreatSrcCd(methodIn.getHvaSub() - 1))   ) || 			( checkLowValue(methodIn.getHvaPrsCreatSrcCd(methodIn.getHvaSub() - 1)) ) ) { 
//  MOVE HVA-CHRG-AMT ( HVA-SUB ) TO DT1-CLM-CHARGE-AMOUNT (1)
//  FORMAT_484884966 = "-9999999V99"
              methodOut.setDt1ClmChargeAmount(0,CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_484884966,methodOut.getHvaChrgAmt(methodIn.getHvaSub() - 1).toPlainString().toCharArray()));
          }
//  ELSE
          else { 
//  MOVE ZERO TO DT1-CLM-CHARGE-AMOUNT (1)
//  FORMAT_484884966 = "-9999999V99"
              methodOut.setDt1ClmChargeAmount(0,CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_484884966,CONSTANTS.ZERO_10));
          }

// * This was moved from f5683dt1
//  IF HVA-PMT-SVC-CD ( HVA-SUB ) = 'OI' OR 'OIM' OR 'OIMEDI' AND NOT ( HVA-RMRK-CD ( HVA-SUB ) = '70' )
//  LITERAL_70 = '70'
//  ELSE
          if (compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_OI_B4_) != 0 && compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_OIM_B3_) != 0 && 		compareChars(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_OIMEDI) != 0  || (		compareChars(methodIn.getHvaRmrkCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_70_B_) != 0 )) { 
//  IF HVA-RMRK-CD ( HVA-SUB ) = '70'
//  LITERAL_70 = '70'
              if (		compareChars(methodIn.getHvaRmrkCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_70_B_) == 0 ) { 
                  methodOut.setHvaSub2((short) (methodIn.getHvaSub() - 1));
//  PERFORM WITH TEST BEFORE VARYING HVA-SUB2 FROM HVA-SUB2 BY -1 UNTIL HVA-SUB2 < 1
                  for (methodOut.setHvaSub2(methodOut.getHvaSub2()); (	( methodOut.getHvaSub2() >= 1 ) ) ; methodOut.setHvaSub2((short)(methodOut.getHvaSub2() + -1)) ) {
//  IF HVA-FLN-JULIAN-DT-NBR ( HVA-SUB ) = HVA-FLN-JULIAN-DT-NBR ( HVA-SUB2 ) AND HVA-FLN-SRL-NBR ( HVA-SUB ) = HVA-FLN-SRL-NBR ( HVA-SUB2 ) AND HVA-INVN-CTL-NBR ( HVA-SUB ) = HVA-INVN-CTL-NBR ( HVA-SUB2 ) AND HVA-ICN-SUFX-CD ( HVA-SUB ) = HVA-ICN-SUFX-CD ( HVA-SUB2 ) AND HVA-PROC-DT ( HVA-SUB ) = HVA-PROC-DT ( HVA-SUB2 )
                      if (		compareChars(methodOut.getHvaFlnJulianDtNbr(methodIn.getHvaSub() - 1),methodOut.getHvaFlnJulianDtNbr(methodOut.getHvaSub2() - 1)) == 0  && 		compareChars(methodOut.getHvaFlnSrlNbr(methodIn.getHvaSub() - 1),methodOut.getHvaFlnSrlNbr(methodOut.getHvaSub2() - 1)) == 0  && 		compareChars(methodOut.getHvaInvnCtlNbr(methodIn.getHvaSub() - 1),methodOut.getHvaInvnCtlNbr(methodOut.getHvaSub2() - 1)) == 0  && 		compareChars(methodOut.getHvaIcnSufxCd(methodIn.getHvaSub() - 1),methodOut.getHvaIcnSufxCd(methodOut.getHvaSub2() - 1)) == 0  && 		compareChars(methodOut.getHvaProcDt(methodIn.getHvaSub() - 1),methodOut.getHvaProcDt(methodOut.getHvaSub2() - 1)) == 0 ) { 
//  IF HVA-CHRG-AMT ( HVA-SUB ) = HVA-CHRG-AMT ( HVA-SUB2 ) AND HVA-PROC-TM ( HVA-SUB ) < HVA-PROC-TM ( HVA-SUB2 )
                          if (			( methodOut.getHvaChrgAmt(methodIn.getHvaSub() - 1).compareTo(methodOut.getHvaChrgAmt(methodOut.getHvaSub2() - 1)) == 0)  && 		compareChars(methodOut.getHvaProcTm(methodIn.getHvaSub() - 1),methodOut.getHvaProcTm(methodOut.getHvaSub2() - 1)) < 0 ) { 
//  IF HVA-PRS-CREAT-SRC-CD ( HVA-SUB ) NOT = 'RE'
//  LITERAL_RE = 'RE'
                              if (		compareChars(methodIn.getHvaPrsCreatSrcCd(methodIn.getHvaSub() - 1),CONSTANTS.LITERAL_RE) != 0 ) { 
//  MOVE ZERO TO HVA-CHRG-AMT ( HVA-SUB )
                                  methodOut.setHvaChrgAmt(methodIn.getHvaSub() - 1,BigDecimal.ZERO);
//  MOVE 1 TO HVA-SUB2
//  LITERAL_1 = 1
                                  methodOut.setHvaSub2((short)1);
                              }
                          }
                      }
                  }
              }
              methodOut.setDt1ClmPaidAmount(0,CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_484884966,(methodOut.getHvaBaseAmt(methodIn.getHvaSub() - 1).add(methodOut.getHvaMmAmt(methodIn.getHvaSub() - 1)).add(methodOut.getHvaSupAmt(methodIn.getHvaSub() - 1)).add(methodOut.getHvaCobCrResAmt(methodIn.getHvaSub() - 1)).add(methodOut.getHvaMcCrResAmt(methodIn.getHvaSub() - 1))).toPlainString()));
              methodOut.setDt1ClmDeductibleAmount(0,CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_484884966,(methodOut.getHvaBaseDedAmt(methodIn.getHvaSub() - 1).add(methodOut.getHvaMmDedAmt(methodIn.getHvaSub() - 1))).toPlainString()));
//  MOVE HVA-PTNT-RESP-AMT ( HVA-SUB ) TO DT1-CLM-PTNT-RESP-AMT (1)
//  FORMAT_484884966 = "-9999999V99"
              methodOut.setDt1ClmPtntRespAmt(0,CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_484884966,methodOut.getHvaPtntRespAmt(methodIn.getHvaSub() - 1).toPlainString().toCharArray()));
          }

// * Logic transposed from f5427dt0

// *Tbd if hva-srvc-cd    (hva-sub) = space
//  IF HVA-PMT-SVC-CD ( HVA-SUB ) = SPACE
          if (        ( allSpaces(methodIn.getHvaPmtSvcCd(methodIn.getHvaSub() - 1))   )) { 
//  MOVE SPACE TO DT1-CLM-PPO-IND (1)
              methodOut.setDt1ClmPpoInd(0,CONSTANTS.SPACE);
          }
//  ELSE
          else { 
//  IF HVA-OVR-CD ( HVA-SUB ) = ( 'X0' OR 'Y0' OR '20' OR '30' ) OR HVA-PPO-CD ( HVA-SUB ) = ( 'R' OR 'N' )
//  LITERAL_N = 'N'
              if ((methodIn.getHvaPpoCd(methodIn.getHvaSub() - 1)[0] == 'R' || methodIn.getHvaPpoCd(methodIn.getHvaSub() - 1)[0] == 'N')) { 
//  MOVE SPACE TO DT1-CLM-PPO-IND (1)
                  methodOut.setDt1ClmPpoInd(0,CONSTANTS.SPACE);
              }
//  ELSE
              else { 
//  IF HVA-PPO-CD ( HVA-SUB ) = ( 'A' OR 'B' )
                  if ((methodIn.getHvaPpoCd(methodIn.getHvaSub() - 1)[0] == 'A' || methodIn.getHvaPpoCd(methodIn.getHvaSub() - 1)[0] == 'B')) { 
//  MOVE 'O' TO DT1-CLM-PPO-IND (1)
//  LITERAL_O = 'O'
                      methodOut.setDt1ClmPpoInd(0,CONSTANTS.LITERAL_O);
                  }
//  ELSE
                  else { 
//  MOVE 'I' TO DT1-CLM-PPO-IND (1)
//  LITERAL_I = 'I'
                      methodOut.setDt1ClmPpoInd(0,CONSTANTS.LITERAL_I);
                  }
              }
          }
//  MOVE HVA-PROC-T1-IND ( HVA-SUB ) TO DT1-CLM-T1-PROCESS-IND (1)
          methodOut.setDt1ClmT1ProcessInd(0,methodOut.getHvaProcT1Ind(methodIn.getHvaSub() - 1));
//  IF HVA-DFT-NBR ( HVA-SUB ) (1 : 10) NUMERIC
          if (    isNumeric(substring(methodOut.getHvaDftNbr(methodIn.getHvaSub() - 1),0,10))) { 
//  MOVE HVA-DFT-NBR ( HVA-SUB ) (1 : 10) TO DT1-CLM-DRAFT-NO (1)
              try {
              methodOut.setDt1ClmDraftNo(0,CFUtil.getLong(substring(methodOut.getHvaDftNbr(methodIn.getHvaSub() - 1),0,10)));
              } catch(NumberFormatException e) {}
          }
//  ELSE
          else { 
//  MOVE ZERO TO DT1-CLM-DRAFT-NO (1)
              methodOut.setDt1ClmDraftNo(0,0);
          }
//  IF HVA-AUTH-NBR ( HVA-SUB ) > SPACE
          if (             ( isGreaterThanSpaces(methodOut.getHvaAuthNbr(methodIn.getHvaSub() - 1)) )) { 
//  MOVE HVA-AUTH-NBR ( HVA-SUB ) TO DT1-CLM-AUTH-NBR (1)
              methodOut.setDt1ClmAuthNbr(0,pad(50,methodOut.getHvaAuthNbr(methodIn.getHvaSub() - 1),SPACE_CHAR,RIGHT_PAD));
          }
//  ELSE
          else { 
//  MOVE SPACE TO DT1-CLM-AUTH-NBR (1)
              methodOut.setDt1ClmAuthNbr(0,CONSTANTS.SPACE_50);
          }
//  IF HVA-AUTH-SRC-ID ( HVA-SUB ) > SPACE
          if (             ( isGreaterThanSpaces(methodOut.getHvaAuthSrcId(methodIn.getHvaSub() - 1)) )) { 
//  MOVE HVA-AUTH-SRC-ID ( HVA-SUB ) TO DT1-CLM-AUTH-SRC-ID (1)
              methodOut.setDt1ClmAuthSrcId(0,methodOut.getHvaAuthSrcId(methodIn.getHvaSub() - 1));
          }
//  ELSE
          else { 
//  MOVE SPACE TO DT1-CLM-AUTH-SRC-ID (1)
              methodOut.setDt1ClmAuthSrcId(0,CONSTANTS.SPACE_3);
          }
//  IF HVA-AUTH-PROC-CD ( HVA-SUB ) > SPACE
          if (             ( isGreaterThanSpaces(methodOut.getHvaAuthProcCd(methodIn.getHvaSub() - 1)) )) { 
//  MOVE HVA-AUTH-PROC-CD ( HVA-SUB ) TO DT1-CLM-AUTH-PROC-CD (1)
              methodOut.setDt1ClmAuthProcCd(0,methodOut.getHvaAuthProcCd(methodIn.getHvaSub() - 1));
          }
//  ELSE
          else { 
//  MOVE SPACE TO DT1-CLM-AUTH-PROC-CD (1)
              methodOut.setDt1ClmAuthProcCd(0,CONSTANTS.SPACE_5);
          }
//  IF HVA-FILM-OFC-NBR ( HVA-SUB ) NUMERIC
          if (    isNumeric(methodOut.getHvaFilmOfcNbr(methodIn.getHvaSub() - 1))) { 
//  MOVE HVA-FILM-OFC-NBR ( HVA-SUB ) TO DT1-CLM-FILM-OFFICE (1)
              methodOut.setDt1ClmFilmOffice(0,CFUtil.getInt(methodOut.getHvaFilmOfcNbr(methodIn.getHvaSub() - 1)));
          }
//  ELSE
          else { 
//  MOVE ZERO TO DT1-CLM-FILM-OFFICE (1)
              methodOut.setDt1ClmFilmOffice(0,0);
          }
//  IF HVA-FLN-JULIAN-DT-NBR ( HVA-SUB ) NUMERIC
          if (    isNumeric(methodOut.getHvaFlnJulianDtNbr(methodIn.getHvaSub() - 1))) { 
//  MOVE HVA-FLN-JULIAN-DT-NBR ( HVA-SUB ) TO DT1-CLM-FLN (1) (1 : 5)
              methodOut.setDt1ClmFln(0,replace(String.valueOf(methodOut.getDt1ClmFlnString(0)).toCharArray(),methodOut.getHvaFlnJulianDtNbr(methodIn.getHvaSub() - 1),0,5));
          }
//  ELSE
          else { 
//  MOVE ZERO TO DT1-CLM-FLN (1) (1 : 5)
              methodOut.setDt1ClmFln(0,replace(String.valueOf(methodOut.getDt1ClmFlnString(0)).toCharArray(),CONSTANTS.ZERO_5,0,5));
          }
//  IF HVA-FLN-SRL-NBR ( HVA-SUB ) NUMERIC
          if (    isNumeric(methodOut.getHvaFlnSrlNbr(methodIn.getHvaSub() - 1))) { 
//  MOVE HVA-FLN-SRL-NBR ( HVA-SUB ) TO DT1-CLM-FLN (1) (6 : 5)
              methodOut.setDt1ClmFln(0,replace(String.valueOf(methodOut.getDt1ClmFlnString(0)).toCharArray(),methodOut.getHvaFlnSrlNbr(methodIn.getHvaSub() - 1),5,10));
          }
//  ELSE
          else { 
//  MOVE ZERO TO DT1-CLM-FLN (1) (6 : 5)
              methodOut.setDt1ClmFln(0,replace(String.valueOf(methodOut.getDt1ClmFlnString(0)).toCharArray(),CONSTANTS.ZERO_5,5,10));
          }
//  INITIALIZE TOPS-ICN-10
          methodOut.setTopsIcn10(CONSTANTS.SPACE_10 /* Fill 10 Spaces*/);
//  MOVE HVA-INVN-CTL-NBR ( HVA-SUB ) TO TOPS-ICN-10
          methodOut.setTopsIcn10(methodOut.getHvaInvnCtlNbr(methodIn.getHvaSub() - 1));
//  IF VALID-ICN-NUM-VALUE-10
          if ( methodOut.isValidIcnNumValue10()  ) { 
//  MOVE HVA-INVN-CTL-NBR ( HVA-SUB ) TO DT1-CLM-ICN (1)
              methodOut.setDt1ClmIcn(0,methodOut.getHvaInvnCtlNbr(methodIn.getHvaSub() - 1));
          }
//  ELSE
          else { 
//  IF DT1-CLM-FLN (1) NUMERIC AND DT1-CLM-FLN (1) > ZERO
              if (        methodIn.getDt1ClmClaimItem(0).dt1ClmFlnIsNumeric()  && 	( methodOut.getDt1ClmFln(0) > 0 ) ) { 
//  MOVE DT1-CLM-FLN (1) TO DT1-CLM-ICN (1)
                  methodOut.setDt1ClmIcn(0,String.valueOf(methodOut.getDt1ClmFlnString(0)).toCharArray());
              }
//  ELSE
              else { 
//  MOVE DT1-CLM-PROC-DT (1) (3 : 2) TO DT1-CLM-ICN (1) (1 : 2)
                  methodOut.setDt1ClmIcn(0,replace(methodOut.getDt1ClmIcn(0),substring(methodOut.getDt1ClmProcDt(0),2,4),0,2));
//  MOVE DT1-CLM-PROC-DT (1) (6 : 2) TO DT1-CLM-ICN (1) (3 : 2)
                  methodOut.setDt1ClmIcn(0,replace(methodOut.getDt1ClmIcn(0),substring(methodOut.getDt1ClmProcDt(0),5,7),2,4));
//  MOVE DT1-CLM-PROC-DT (1) (9 : 2) TO DT1-CLM-ICN (1) (5 : 2)
                  methodOut.setDt1ClmIcn(0,replace(methodOut.getDt1ClmIcn(0),substring(methodOut.getDt1ClmProcDt(0),8,10),4,6));
//  MOVE '0000' TO DT1-CLM-ICN (1) (7 : 4)
//  LITERAL_0000 = '0000'
                  methodOut.setDt1ClmIcn(0,replace(methodOut.getDt1ClmIcn(0),CONSTANTS.LITERAL_0000,6,10));
              }
          }
//  MOVE HVA-ICN-SUFX-CD ( HVA-SUB ) TO DT1-CLM-SUFFIX-CD (1)
          methodOut.setDt1ClmSuffixCd(0,CFUtil.getInt(methodOut.getHvaIcnSufxCd(methodIn.getHvaSub() - 1)));
//  MOVE HVA-PROC-DT ( HVA-SUB ) TO DT1-CLM-PROC-DT (1)
          methodOut.setDt1ClmProcDt(0,methodOut.getHvaProcDt(methodIn.getHvaSub() - 1));
//  MOVE HVA-PROC-TM ( HVA-SUB ) TO DT1-CLM-PROC-TM (1)
          methodOut.setDt1ClmProcTm(0,methodOut.getHvaProcTm(methodIn.getHvaSub() - 1));
//  MOVE HVA-FLN-JULIAN-DT-NBR ( HVA-SUB ) TO CHRDATE-STRING
          methodOut.setChrdateString(pad(10,methodOut.getHvaFlnJulianDtNbr(methodIn.getHvaSub() - 1),SPACE_CHAR,RIGHT_PAD));
//  MOVE +5 TO CHRDATE-LENGTH
          methodOut.setChrdateLength((short)5);
//  PERFORM 9800-CONVERT-YYDDD-2-ISO-SECT
          convertYyddd2IsoSect(programCtx.getConvertYyddd2IsoSectInCtx());/*9800-CONVERT-YYDDD-2-ISO-SECT SECTION*/
//  MOVE FORMATTED-DATE (6 : 2) TO DT1-CLM-FLN-FORMAT-DT (1) (1 : 2)
          methodOut.setDt1ClmFlnFormatDt(0,replace(methodOut.getDt1ClmFlnFormatDt(0),substring(methodOut.getFormattedDate(),5,7),0,2));
//  MOVE '/' TO DT1-CLM-FLN-FORMAT-DT (1) (3 : 1)
//  LITERAL_SL_ = '/'
          methodOut.setDt1ClmFlnFormatDt(0,replace(methodOut.getDt1ClmFlnFormatDt(0),CONSTANTS.LITERAL_SL_,2,3));
//  MOVE FORMATTED-DATE (9 : 2) TO DT1-CLM-FLN-FORMAT-DT (1) (4 : 2)
          methodOut.setDt1ClmFlnFormatDt(0,replace(methodOut.getDt1ClmFlnFormatDt(0),substring(methodOut.getFormattedDate(),8,10),3,5));
//  MOVE '/' TO DT1-CLM-FLN-FORMAT-DT (1) (6 : 1)
//  LITERAL_SL_ = '/'
          methodOut.setDt1ClmFlnFormatDt(0,replace(methodOut.getDt1ClmFlnFormatDt(0),CONSTANTS.LITERAL_SL_,5,6));
//  MOVE FORMATTED-DATE (1 : 4) TO DT1-CLM-FLN-FORMAT-DT (1) (7 : 4)
          methodOut.setDt1ClmFlnFormatDt(0,replace(methodOut.getDt1ClmFlnFormatDt(0),substring(methodOut.getFormattedDate(),0,4),6,10));

// * Amounts are set for info-lines to match to dt8/dt0 response
//  IF INFO-LINE-YES
          if ( methodOut.isInfoLineYes()  ) { 
//  MOVE ZERO TO DT1-CLM-CHARGE-AMOUNT (1) , DT1-CLM-PAID-AMOUNT (1) , DT1-CLM-DEDUCTIBLE-AMOUNT (1)
//  FORMAT_484884966 = "-9999999V99", FORMAT_484884966 = "-9999999V99", FORMAT_484884966 = "-9999999V99"
              methodOut.setDt1ClmChargeAmount(0,CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_484884966,CONSTANTS.ZERO_10));
              methodOut.setDt1ClmPaidAmount(0,CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_484884966,CONSTANTS.ZERO_10));
              methodOut.setDt1ClmDeductibleAmount(0,CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_484884966,CONSTANTS.ZERO_10));
          }

// * Dates are set for info-lines to match to dt8/dt0 response
//  IF INFO-LINE-YES
          if ( methodOut.isInfoLineYes()  ) { 
//  MOVE 99999999 TO DT1-CLM-FIRST-SERVICE-DATE (1)
              methodOut.setDt1ClmFirstServiceDate(0,(long)99999999);
//  MOVE ZERO TO DT1-CLM-LAST-SERVICE-DATE (1)
              methodOut.setDt1ClmLastServiceDate(0,0);
          }
//  ELSE
          else { 
//  MOVE HVA-FST-DT ( HVA-SUB ) (1 : 4) TO DT1-CLM-FIRST-SERVICE-DATE (1) (1 : 4)
              methodOut.setDt1ClmFirstServiceDate(0,replace(String.valueOf(methodOut.getDt1ClmFirstServiceDateString(0)).toCharArray(),substring(methodOut.getHvaFstDt(methodIn.getHvaSub() - 1),0,4),0,4));
//  MOVE HVA-FST-DT ( HVA-SUB ) (6 : 2) TO DT1-CLM-FIRST-SERVICE-DATE (1) (5 : 2)
              methodOut.setDt1ClmFirstServiceDate(0,replace(String.valueOf(methodOut.getDt1ClmFirstServiceDateString(0)).toCharArray(),substring(methodOut.getHvaFstDt(methodIn.getHvaSub() - 1),5,7),4,6));
//  MOVE HVA-FST-DT ( HVA-SUB ) (9 : 2) TO DT1-CLM-FIRST-SERVICE-DATE (1) (7 : 2)
              methodOut.setDt1ClmFirstServiceDate(0,replace(String.valueOf(methodOut.getDt1ClmFirstServiceDateString(0)).toCharArray(),substring(methodOut.getHvaFstDt(methodIn.getHvaSub() - 1),8,10),6,8));
//  MOVE HVA-LST-SRVC-DT ( HVA-SUB ) (1 : 4) TO DT1-CLM-LAST-SERVICE-DATE (1) (1 : 4)
              methodOut.setDt1ClmLastServiceDate(0,replace(String.valueOf(methodOut.getDt1ClmLastServiceDateString(0)).toCharArray(),substring(methodOut.getHvaLstSrvcDt(methodIn.getHvaSub() - 1),0,4),0,4));
//  MOVE HVA-LST-SRVC-DT ( HVA-SUB ) (6 : 2) TO DT1-CLM-LAST-SERVICE-DATE (1) (5 : 2)
              methodOut.setDt1ClmLastServiceDate(0,replace(String.valueOf(methodOut.getDt1ClmLastServiceDateString(0)).toCharArray(),substring(methodOut.getHvaLstSrvcDt(methodIn.getHvaSub() - 1),5,7),4,6));
//  MOVE HVA-LST-SRVC-DT ( HVA-SUB ) (9 : 2) TO DT1-CLM-LAST-SERVICE-DATE (1) (7 : 2)
              methodOut.setDt1ClmLastServiceDate(0,replace(String.valueOf(methodOut.getDt1ClmLastServiceDateString(0)).toCharArray(),substring(methodOut.getHvaLstSrvcDt(methodIn.getHvaSub() - 1),8,10),6,8));
          }
//  MOVE HVA-CLM-LVL-RSN-CD ( HVA-SUB ) TO DT1-CLM-CLM-LEVEL-RC (1)
          methodOut.setDt1ClmClmLevelRc(0,methodOut.getHvaClmLvlRsnCd(methodIn.getHvaSub() - 1));
//  IF HVA-ADJTR-ID ( HVA-SUB ) NUMERIC
          if (    isNumeric(methodOut.getHvaAdjtrId(methodIn.getHvaSub() - 1))) { 
//  MOVE HVA-ADJTR-ID ( HVA-SUB ) TO DT1-CLM-ADJ-NBR (1)
              methodOut.setDt1ClmAdjNbr(0,CFUtil.getInt(methodOut.getHvaAdjtrId(methodIn.getHvaSub() - 1)));
          }
//  ELSE
          else { 
//  MOVE ZERO TO DT1-CLM-ADJ-NBR (1)
              methodOut.setDt1ClmAdjNbr(0,0);
          }
//  IF HVA-ADJTR-ID ( HVA-SUB ) (6 : 4) = '8273'
//  LITERAL_8273 = '8273'
          if (Field.compareChar(methodOut.getHvaAdjtrId(methodIn.getHvaSub() - 1) , CONSTANTS.LITERAL_8273 , ( 5 /*start*/ ), 4 /*left len*/  , 4 /*right len*/)) { 
//  MOVE 'A' TO DT1-CLM-ADJ-IND (1)
//  LITERAL_A = 'A'
              methodOut.setDt1ClmAdjInd(0,CONSTANTS.LITERAL_A);
          }
//  ELSE
          else { 
//  MOVE 'M' TO DT1-CLM-ADJ-IND (1)
//  LITERAL_M = 'M'
              methodOut.setDt1ClmAdjInd(0,CONSTANTS.LITERAL_M);
          }
//  MOVE HVA-MBR-PRV-IND ( HVA-SUB ) TO DT1-CLM-CLM-PHI-IND (1)
          methodOut.setDt1ClmClmPhiInd(0,methodOut.getHvaMbrPrvInd(methodIn.getHvaSub() - 1));
//  MOVE HVA-DIAG-CD ( HVA-SUB ) TO DT1-CLM-PRIMARY-DIAGNOSIS (1)
          methodOut.setDt1ClmPrimaryDiagnosis(0,methodOut.getHvaDiagCd(methodIn.getHvaSub() - 1));
//  MOVE HVA-NTFY-WAIV-CD ( HVA-SUB ) TO DT1-CLM-PARS-WAIV-IND (1)
          methodOut.setDt1ClmParsWaivInd(0,methodOut.getHvaNtfyWaivCd(methodIn.getHvaSub() - 1));
//  MOVE HVA-DLGTE-IND ( HVA-SUB ) TO DT1-CLM-DLGTE-IND (1)
          methodOut.setDt1ClmDlgteInd(0,methodOut.getHvaDlgteInd(methodIn.getHvaSub() - 1));
//  MOVE HVA-NDB-CONTR-ID ( HVA-SUB ) TO DT1-CLM-NDB-CONTR-ID (1)
          methodOut.setDt1ClmNdbContrId(0,methodOut.getHvaNdbContrId(methodIn.getHvaSub() - 1));
//  MOVE HVA-CLM-SMB-TYP-APP-CD ( HVA-SUB ) TO DT1-CLM-SMB-APP-CD (1)
          methodOut.setDt1ClmSmbAppCd(0,methodOut.getHvaClmSmbTypAppCd(methodIn.getHvaSub() - 1));
//  MOVE HVA-SMB-ST-CD ( HVA-SUB ) TO DT1-CLM-SMB-ST-CD (1)
          methodOut.setDt1ClmSmbStCd(0,methodOut.getHvaSmbStCd(methodIn.getHvaSub() - 1));
//  MOVE HVA-DRG-NBR ( HVA-SUB ) TO DT1-CLM-DRG-NBR (1)
          methodOut.setDt1ClmDrgNbr(0,methodOut.getHvaDrgNbr(methodIn.getHvaSub() - 1));
//  MOVE HVA-FACL-OR-PROF-CD ( HVA-SUB ) TO DT1-CLM-HOSP-PROF-IND (1)
          methodOut.setDt1ClmHospProfInd(0,methodOut.getHvaFaclOrProfCd(methodIn.getHvaSub() - 1));

// * Logic transposed from f5427dt0
// * - summary in f5427dt0 will create a composite of all 'y' flags
//  MOVE 'NNNNN' TO DT1-CLM-CLAIM-STATUS (1)
//  LITERAL_NNNNN = 'NNNNN'
          methodOut.setDt1ClmClaimStatus(0,CONSTANTS.LITERAL_NNNNN);
//  IF INFO-LINE-NO
          if ( methodOut.isInfoLineNo()  ) { 
//  EVALUATE TRUE
              if  (methodIn.getHvaOvrCd(methodIn.getHvaSub() - 1)[0] == 'P') { 
//  SET DT1-CLM-PENDED (1) TO TRUE
                  methodOut.setDt1ClmPendedTrue(0); 
                  
              }
              else if  (methodIn.getHvaOvrCd(methodIn.getHvaSub() - 1)[0] == 'C') { 
//  SET DT1-CLM-CLOSED (1) TO TRUE
                  methodOut.setDt1ClmClosedTrue(0); 
                  
              }
              else if  (methodIn.getHvaOvrCd(methodIn.getHvaSub() - 1)[0] == 'R') { 
//  SET DT1-CLM-REJECTED (1) TO TRUE
                  methodOut.setDt1ClmRejectedTrue(0); 
                  
              }
              else   { 
//  SET DT1-CLM-PAID (1) TO TRUE
                  methodOut.setDt1ClmPaidTrue(0); 
                  
              }
          }
//  MOVE SPACE TO DT1-CLM-PROVIDER-NAME (1)
          methodOut.setDt1ClmProviderName(0,CONSTANTS.SPACE_40);
//  IF INFO-LINE-NO
          if ( methodOut.isInfoLineNo()  ) { 
//  IF DT1-CLM-PROVIDER-PREFIX (1) = ZERO
              if (	( methodOut.getDt1ClmProviderPrefix(0) == 0 )) { 
//  STRING ';' HVA-PROV-EOB-NM ( HVA-SUB ) DELIMITED BY SIZE INTO DT1-CLM-PROVIDER-NAME (1) END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_34537);
                     charArray.add(methodIn.getHvaProvEobNm(methodIn.getHvaSub() - 1));
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
                  updated = updateString(methodOut.getDt1ClmProviderName(0) ,joinCharArray);
                  methodOut.setDt1ClmProviderName(0,  (char[])updated.get("string"));
              }
//  ELSE
              else { 
//  MOVE HVA-PROV-NM ( HVA-SUB ) TO DT1-CLM-PROVIDER-NAME (1)
                  methodOut.setDt1ClmProviderName(0,pad(40,methodOut.getHvaProvNm(methodIn.getHvaSub() - 1),SPACE_CHAR,RIGHT_PAD));
              }
          }
//  MOVE HVA-TPSM-CD ( HVA-SUB ) TO DT1-CLM-TPSM-CD (1)
          methodOut.setDt1ClmTpsmCd(0,methodOut.getHvaTpsmCd(methodIn.getHvaSub() - 1));
//  MOVE HVA-PROV-SPCL-CD ( HVA-SUB ) TO DT1-CLM-PROV-SPCL-CD (1)
          methodOut.setDt1ClmProvSpclCd(0,methodOut.getHvaProvSpclCd(methodIn.getHvaSub() - 1));
//  MOVE HVA-PROV-MEDCD-RECLM-IND ( HVA-SUB ) TO DT1-CLM-PROV-MEDCD-RECLM-IND (1)
          methodOut.setDt1ClmProvMedcdReclmInd(0,methodOut.getHvaProvMedcdReclmInd(methodIn.getHvaSub() - 1));
//  IF HVA-REL-SRVC-CLM-LVL-IND ( HVA-SUB ) > ' '
          if (             ( isGreaterThanSpaces(methodOut.getHvaRelSrvcClmLvlInd(methodIn.getHvaSub() - 1)) )) { 
//  MOVE HVA-REL-SRVC-CLM-LVL-IND ( HVA-SUB ) TO DT1-CLM-AUTH-CLM-LEVEL-IND (1)
              methodOut.setDt1ClmAuthClmLevelInd(0,methodOut.getHvaRelSrvcClmLvlInd(methodIn.getHvaSub() - 1));
          }
//  ELSE
          else { 
//  MOVE SPACE TO DT1-CLM-AUTH-CLM-LEVEL-IND (1)
              methodOut.setDt1ClmAuthClmLevelInd(0,CONSTANTS.SPACE);
          }
//  MOVE HVA-AUTH-UNIQ-CNT ( HVA-SUB ) TO DT1-CLM-AUTH-UNIQUE-CNT (1)
          methodOut.setDt1ClmAuthUniqueCnt(0,methodOut.getHvaAuthUniqCnt(methodIn.getHvaSub() - 1));
//  IF HVA-MSK-NULL-IND ( HVA-SUB ) = -1
          if (	( methodIn.getHvaMskNullInd(methodIn.getHvaSub() - 1) == -1 ) ) { 
//  MOVE ZEROES TO HVA-PHYS-MEDCN-MSK-CNT ( HVA-SUB )
              methodOut.setHvaPhysMedcnMskCnt(methodIn.getHvaSub() - 1,0);
//  MOVE 'N' TO DT1-CLM-MSK-IND (1)
//  LITERAL_N = 'N'
              methodOut.setDt1ClmMskInd(0,CONSTANTS.LITERAL_N);
          }
//  ELSE
          else { 
//  IF HVA-PHYS-MEDCN-MSK-CNT ( HVA-SUB ) > 0
              if (	( methodOut.getHvaPhysMedcnMskCnt(methodIn.getHvaSub() - 1) > 0 )) { 
//  MOVE 'Y' TO DT1-CLM-MSK-IND (1)
//  LITERAL_Y = 'Y'
                  methodOut.setDt1ClmMskInd(0,CONSTANTS.LITERAL_Y);
              }
//  ELSE
              else { 
//  MOVE 'N' TO DT1-CLM-MSK-IND (1)
//  LITERAL_N = 'N'
                  methodOut.setDt1ClmMskInd(0,CONSTANTS.LITERAL_N);
              }
          }
//  IF HVA-PROV-PRDCT-CD ( HVA-SUB ) = SPACE AND HVA-PROV-MKT-TYP-CD ( HVA-SUB ) = ZERO AND HVA-PROV-MKT-NBR ( HVA-SUB ) (1 : 4) = ZERO AND HVA-PROV-IPA-ID ( HVA-SUB ) = ZERO
          if (        ( allSpaces(methodIn.getHvaProvPrdctCd(methodIn.getHvaSub() - 1))   ) && ( allZeros(methodIn.getHvaProvMktTypCd(methodIn.getHvaSub() - 1)) ) /*  ==  zeros*/ && ( allZeros(substring(methodIn.getHvaProvMktNbr(methodIn.getHvaSub() - 1),0,4)) ) /*  ==  zeros*/ && ( allZeros(methodIn.getHvaProvIpaId(methodIn.getHvaSub() - 1)) ) /*  ==  zeros*/) { 
//  SET DT1-CLM-PROVIDER-TIER-OON (1) TO TRUE
              methodOut.setDt1ClmProviderTierOonTrue(0); 
              
          }
//  ELSE
          else { 
//  IF HVA-PROC-T1-IND ( HVA-SUB ) = 'Y'
//  LITERAL_Y = 'Y'
              if (methodOut.getHvaProcT1Ind(methodIn.getHvaSub() - 1)[0] == 'Y') { 
//  SET DT1-CLM-PROVIDER-TIER-T1 (1) TO TRUE
                  methodOut.setDt1ClmProviderTierT1True(0); 
                  
              }
//  ELSE
              else { 
//  SET DT1-CLM-PROVIDER-TIER-INN (1) TO TRUE
                  methodOut.setDt1ClmProviderTierInnTrue(0); 
                  
              }
          }
      
      return methodOut;
      }
      /**
      * procCsrInitFil3Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 4700-PROC-CSR-INIT-FIL3-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * @throws CFException
      */
      @Override
      public ProcCsrInitFil3SectOutCtx procCsrInitFil3Sect(ProcCsrInitFil3SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4700-Proc-csr-init-fil3-sect                                *
// *81                                                              *
// *81  business function: declare and open init-fil3 cursor        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4000-search-member-plus-sect                    *
// *82  calls     : 4710-open-csr-init-fil3-sect
// *82            : 4720-fetch-csr-init-fil3-sect
// *82            : 4730-close-csr-init-fil3-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcCsrInitFil3SectOutCtx methodOut = methodIn.getProcCsrInitFil3SectOutCtx();
//  PERFORM 4710-OPEN-CSR-INIT-FIL3-SECT
          openCsrInitFil3Sect(programCtx.getOpenCsrInitFil3SectInCtx());/*4710-OPEN-CSR-INIT-FIL3-SECT SECTION*/
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
              methodOut.setClmHstEndOfFetchNoTrue(); 
              
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
              while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodIn.isDt1RspOk()  )) {
//  PERFORM 4720-FETCH-CSR-INIT-FIL3-SECT
                  fetchCsrInitFil3Sect(programCtx);/*4720-FETCH-CSR-INIT-FIL3-SECT SECTION*/
              }
          }
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  PERFORM 4730-CLOSE-CSR-INIT-FIL3-SECT
              closeCsrInitFil3Sect(programCtx.getCloseCsrInitFil3SectInCtx());/*4730-CLOSE-CSR-INIT-FIL3-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * openCsrInitFil3Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 4710-OPEN-CSR-INIT-FIL3-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dderefPolNbr                   COBOL Name: DDEREF-POL-NBR
      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dderefEeId                     COBOL Name: DDEREF-EE-ID
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dderefDepnNbr                  COBOL Name: DDEREF-DEPN-NBR
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public OpenCsrInitFil3SectOutCtx openCsrInitFil3Sect(OpenCsrInitFil3SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4710-Open-csr-init-fil3-sect                                *
// *81                                                              *
// *81  business function: declare and open csr-init-fil3           *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4700-proc-csr-init-fil3-sect                    *
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
OpenCsrInitFil3SectOutCtx methodOut = methodIn.getOpenCsrInitFil3SectOutCtx();
//  MOVE DT1-REQ-POLICY TO DDEREF-POL-NBR
          methodOut.setDderefPolNbr(methodOut.getDt1ReqPolicy());
//  MOVE DT1-REQ-EMPID TO DDEREF-EE-ID
          methodOut.setDderefEeId(methodOut.getDt1ReqEmpid());
//  MOVE DT1-REQ-DEP-NBR (2 : 2) TO DDEREF-DEPN-NBR (1 : 2)
          methodOut.setDderefDepnNbr(replace(methodOut.getDderefDepnNbr(),String.valueOf(substring(methodOut.getDt1ReqDepNbrString(),1,3)).toCharArray(),0,2));
//  IF DDEREF-DEPN-NBR = 99
//  LITERAL_99 = 99
          if (compareChars(methodOut.getDderefDepnNbr(),CONSTANTS.LITERAL_99) == 0) { 
//  MOVE ZERO TO DDEREF-DEPN-NBR
              methodOut.setDderefDepnNbr(CONSTANTS.ZERO_2);
          }
//  WITH CLM_HST_TABLE ( PARTN_ID , PARTN_VAL , PROC_DT , PROC_TM , ICN_SUFX_VERS_NBR , INVN_CTL_NBR , ICN_SUFX_CD , AUTH_SRC_ID , AUTH_PROC_CD , PROV_NM , PROV_EOB_NM , PROV_PRDCT_CD , PROV_MKT_TYP_CD , PROV_IPA_ID , TPSM_CD , PROV_SPCL_CD ) AS ( SELECT DISTINCT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , LNE.AUTH_SRC_ID , LNE.AUTH_PROC_CD , PRV.PROV_NM , PRV.PROV_EOB_NM , PRV.PROV_PRDCT_CD , PRV.PROV_MKT_TYP_CD , PRV.PROV_IPA_ID , PRV.TPSM_CD , PRV.PROV_SPCL_CD FROM ADJD_CLMHST_DENORM_REF REF INNER JOIN ADJD_CLMSF_LN LNE ON REF.PARTN_ID = LNE.PARTN_ID AND REF.PARTN_VAL = LNE.PARTN_VAL AND REF.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND REF.PROC_DT = LNE.PROC_DT AND REF.PROC_TM = LNE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND REF.LN_ID = LNE.LN_ID INNER JOIN ADJD_CLMSF_ORIGHDR ORG ON ORG.PARTN_ID = LNE.PARTN_ID AND ORG.PARTN_VAL = LNE.PARTN_VAL AND ORG.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND ORG.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND ORG.PROC_DT = LNE.PROC_DT AND ORG.PROC_TM = LNE.PROC_TM AND ORG.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND ORG.LN_CORR_ID = LNE.ORIG_LN_CORR_ID INNER JOIN ADJD_CLMSF_PROV PRV ON REF.PARTN_ID = PRV.PARTN_ID AND REF.PARTN_VAL = PRV.PARTN_VAL AND REF.INVN_CTL_NBR = PRV.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PRV.ICN_SUFX_CD AND REF.PROC_DT = PRV.PROC_DT AND REF.PROC_TM = PRV.PROC_TM AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR AND REF.PROV_SCRN_NBR = PRV.PROV_SEQ_NBR INNER JOIN ADJD_CLMSFLN_ACCUM ACM ON REF.PARTN_ID = ACM.PARTN_ID AND REF.PARTN_VAL = ACM.PARTN_VAL AND REF.INVN_CTL_NBR = ACM.INVN_CTL_NBR AND REF.ICN_SUFX_CD = ACM.ICN_SUFX_CD AND REF.PROC_DT = ACM.PROC_DT AND REF.PROC_TM = ACM.PROC_TM AND REF.ICN_SUFX_VERS_NBR = ACM.ICN_SUFX_VERS_NBR AND REF.LN_ID = ACM.LN_ID WHERE REF.POL_NBR = ? AND REF.EE_ID = ? AND REF.DEPN_NBR = ? AND ? >= REF.FST_DT AND ? <= REF.LST_SRVC_DT AND SUBSTR ( REF.PROV_TINSUFF , 2 , 9 ) BETWEEN ? AND ? AND REF.RMRK_CD BETWEEN ? AND ? AND SUBSTR ( REF.CAUS_CD , 1 , 1 ) BETWEEN ? AND ? AND ( ORG.UB92_RVNU_CD BETWEEN ? AND ? ) AND ACM.LN_ACCUM_TYP_CD = 'OOP' ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC FETCH FIRST 500 ROWS ONLY ) SELECT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.PGM_ID_LST_CHAR_VAL , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , REF.LN_ID , REF.FLN_JULIAN_DT_NBR , REF.FLN_SRL_NBR , REF.DFT_NBR , REF.FST_DT , REF.LST_SRVC_DT , REF.PROV_TINSUFF , REF.PROV_SCRN_NBR , REF.CHRG_AMT , REF.RMRK_CD , REF.NC_AMT , REF.PMT_SVC_CD , REF.OVR_CD , REF.COPAY_AMT , REF.SRVC_CD , REF.PAY_CD , REF.TRANS_CD , HDR.FILM_OFC_NBR , HDR.CLM_LVL_RSN_CD , HDR.ADJTR_ID , HDR.MBR_PRV_IND , HDR.NTFY_WAIV_CD , HDR.BANK_CD , HDR.DIV_NBR , HDR.CLS_NBR , HDR.DRG_NBR , HDR.FACL_OR_PROF_CD , BKE.DLGT_ENTY_CD , BK2.NDB_CONTR_ID , BK2.CLM_SMB_TYP_APP_CD , BK2.SMB_ST_CD , DLN.PROC_T1_IND , DLN.AUTH_NBR , DLN.BASE_DED_DESC_TXT , DLN.MM_DED_DESC_TXT , DLN.PRS_CREAT_SRC_CD , DLN.BASE_DED_AMT , DLN.BASE_AMT , DLN.MM_DED_AMT , DLN.MM_AMT , DLN.MC_CR_RES_AMT , DLN.COB_CR_RES_AMT , DLN.PAR_IND , DLN.SUP_AMT , DLN.PROV_MKT_NBR , DLN.PPO_CD , DLN.PTNT_RESP_AMT , HST.AUTH_SRC_ID , HST.AUTH_PROC_CD , HST.PROV_NM , HST.PROV_EOB_NM , HST.PROV_PRDCT_CD , HST.PROV_MKT_TYP_CD , HST.PROV_IPA_ID , HST.TPSM_CD , HST.PROV_SPCL_CD , IFNULL ( ( SELECT PR1.PROV_MEDCD_RECLM_IND FROM ADJD_CLMSF_PROV PR1 WHERE REF.PARTN_ID = PR1.PARTN_ID AND REF.PARTN_VAL = PR1.PARTN_VAL AND REF.INVN_CTL_NBR = PR1.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PR1.ICN_SUFX_CD AND REF.PROC_DT = PR1.PROC_DT AND REF.PROC_TM = PR1.PROC_TM AND PR1.PROV_MEDCD_RECLM_IND = 'Y' ORDER BY LST_UPDT_DTTM DESC FETCH FIRST 1 ROW ONLY ) , ' ' ) , IFNULL ( ( SELECT REL.REL_SRVC_CLM_LVL_IND FROM ADJD_CLMSFLN_REL_SRVCS REL WHERE REF.PARTN_ID = REL.PARTN_ID AND REF.PARTN_VAL = REL.PARTN_VAL AND REF.INVN_CTL_NBR = REL.INVN_CTL_NBR AND REF.ICN_SUFX_CD = REL.ICN_SUFX_CD AND REF.PROC_DT = REL.PROC_DT AND REF.PROC_TM = REL.PROC_TM AND REF.ICN_SUFX_VERS_NBR = REL.ICN_SUFX_VERS_NBR AND REF.LN_ID = REL.LN_ID FETCH FIRST 1 ROWS ONLY ) , ' ' ) , IFNULL ( DIA.DIAG_CD , '       ' ) , ( SELECT COUNT ( DISTINCT AUTH_NBR ) FROM ADJD_CLMHST_DENORM_LN DLN2 WHERE REF.PARTN_ID = DLN2.PARTN_ID AND REF.PARTN_VAL = DLN2.PARTN_VAL AND REF.INVN_CTL_NBR = DLN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN2.ICN_SUFX_CD AND REF.PROC_DT = DLN2.PROC_DT AND REF.PROC_TM = DLN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR AND ' ' < DLN2.AUTH_NBR ) , ( SELECT SUM ( PHYS_MEDCN_MSK_CNT ) FROM ADJD_CLMSF_LN2 LN2 WHERE REF.PARTN_ID = LN2.PARTN_ID AND REF.PARTN_VAL = LN2.PARTN_VAL AND REF.INVN_CTL_NBR = LN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LN2.ICN_SUFX_CD AND REF.PROC_DT = LN2.PROC_DT AND REF.PROC_TM = LN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR ) FROM CLM_HST_TABLE HST INNER JOIN ADJD_CLMHST_DENORM_REF REF ON REF.PARTN_ID = HST.PARTN_ID AND REF.PARTN_VAL = HST.PARTN_VAL AND REF.PROC_DT = HST.PROC_DT AND REF.PROC_TM = HST.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR AND REF.INVN_CTL_NBR = HST.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HST.ICN_SUFX_CD INNER JOIN ADJD_CLMHST_DENORM_HDR HDR ON REF.PARTN_ID = HDR.PARTN_ID AND REF.PARTN_VAL = HDR.PARTN_VAL AND REF.INVN_CTL_NBR = HDR.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HDR.ICN_SUFX_CD AND REF.PROC_DT = HDR.PROC_DT AND REF.PROC_TM = HDR.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E BKE ON REF.PARTN_ID = BKE.PARTN_ID AND REF.PARTN_VAL = BKE.PARTN_VAL AND REF.INVN_CTL_NBR = BKE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BKE.ICN_SUFX_CD AND REF.PROC_DT = BKE.PROC_DT AND REF.PROC_TM = BKE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E2 BK2 ON REF.PARTN_ID = BK2.PARTN_ID AND REF.PARTN_VAL = BK2.PARTN_VAL AND REF.INVN_CTL_NBR = BK2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BK2.ICN_SUFX_CD AND REF.PROC_DT = BK2.PROC_DT AND REF.PROC_TM = BK2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMHST_DENORM_LN DLN ON REF.PARTN_ID = DLN.PARTN_ID AND REF.PARTN_VAL = DLN.PARTN_VAL AND REF.INVN_CTL_NBR = DLN.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN.ICN_SUFX_CD AND REF.PROC_DT = DLN.PROC_DT AND REF.PROC_TM = DLN.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR AND REF.LN_ID = DLN.LN_ID LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA ON REF.PARTN_ID = DIA.PARTN_ID AND REF.PARTN_VAL = DIA.PARTN_VAL AND REF.INVN_CTL_NBR = DIA.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DIA.ICN_SUFX_CD AND REF.PROC_DT = DIA.PROC_DT AND REF.PROC_TM = DIA.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR AND 1 = DIA.DIAG_SEQ_NBR ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.PGM_ID_LST_CHAR_VAL DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC , REF.LN_ID DESC OPTIMIZE FOR 600 ROWS FETCH FIRST 600 ROWS ONLY WITH UR
          programCtx.setCsrInitFil3ResultSet(d5427dt1Repository.openCsrInitFil3D5427dt1(methodOut.getDcladjdClmhstDenormRef(),methodIn.getHostVariables(),programCtx.getSqlca()));
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = ZERO
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '4710-OPE' TO DB2-PARAGRAPH
//  LITERAL_4710_MN_OPE = '4710-OPE'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4710_MN_OPE);
//  MOVE 'OPEN   ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_OPEN_B6_);
//  MOVE 'CSR-INIT-FIL3' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFIL3_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrInitFil3Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 4720-FETCH-CSR-INIT-FIL3-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrInitFil3SectOutCtx fetchCsrInitFil3Sect(D5427dt1Ctx programCtx) throws Exception {
      
// *81***************************************************************
// *81  4720-Fetch-csr-init-fil3-sect                               *
// *81                                                              *
// *81  business function: fetch claim lines                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4700-proc-csr-init-fil3-sect                    *
// *82  calls     : 4721-fetch-csr-rows-sect                        *
// *82***************************************************************
// *================================================================
FetchCsrInitFil3SectOutCtx methodOut = programCtx.getFetchCsrInitFil3SectOutCtx();
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
          methodOut.setClmHstEndOfFetchNoTrue(); 
          
//  SET DT1-RSP-OK TO TRUE
          methodOut.setDt1RspOkTrue(); 
          
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
          while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodOut.isDt1RspOk()  )) {
//  PERFORM 4721-FETCH-CSR-ROWS-SECT
              fetchCsrRowsSect4721(programCtx.getFetchCsrRowsSect4721InCtx());/*4721-FETCH-CSR-ROWS-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrRowsSect4721 
      *   This method is derived from 
  *   COBOL Paragraph - 4721-FETCH-CSR-ROWS-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrRowsSect4721OutCtx fetchCsrRowsSect4721(FetchCsrRowsSect4721InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4721-Fetch-csr-rows-sect                                    *
// *81                                                              *
// *81  business function: fetch cursor rows                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4720-fetch-csr-init-fil3-sect                   *
// *82  calls     : 4500-proc-fetched-rows-sect                     *
// *82            : 9100-database-error-sect                        *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
FetchCsrRowsSect4721OutCtx methodOut = methodIn.getFetchCsrRowsSect4721OutCtx();
//  FETCH NEXT ROWSET FROM CSR-INIT-FIL3 FOR ? ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d5427dt1Repository.fetchCsrInitFil3D5427dt1(programCtx.getCsrInitFil3ResultSet(),methodOut.getHvaClmHistArray(),methodIn.getWork(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  (( methodOut.isSqlcodeOk()  ) || ( methodOut.isSqlcodeFetchEnd()  )) { 
//  PERFORM 4500-PROC-FETCHED-ROWS-SECT
              procFetchedRowsSect(programCtx.getProcFetchedRowsSectInCtx());/*4500-PROC-FETCHED-ROWS-SECT SECTION*/
          }
          else   { 
//  MOVE '4721-FET' TO DB2-PARAGRAPH
//  LITERAL_4721_MN_FET = '4721-FET'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4721_MN_FET);
//  MOVE 'FETCH  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_FETCH_B5_);
//  MOVE 'CSR-INIT-FIL3' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFIL3_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsrInitFil3Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 4730-CLOSE-CSR-INIT-FIL3-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public CloseCsrInitFil3SectOutCtx closeCsrInitFil3Sect(CloseCsrInitFil3SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4730-Close-csr-init-fil3-sect                               *
// *81                                                              *
// *81  business function: close the claim list cursor              *
// *82***************************************************************
// *82  called by : 4700-proc-csr-init-fil3-sect
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
CloseCsrInitFil3SectOutCtx methodOut = methodIn.getCloseCsrInitFil3SectOutCtx();
//  CLOSE CSR-INIT-FIL3
          d5427dt1Repository.closeCsrInitFil3D5427dt1(programCtx.getCsrInitFil3ResultSet(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = +0 OR SQLCODE = -501
//  ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != -501 )) { 
//  MOVE '4730-CLO' TO DB2-PARAGRAPH
//  LITERAL_4730_MN_CLO = '4730-CLO'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4730_MN_CLO);
//  MOVE 'CLOSE  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_CLOSE_B5_);
//  MOVE 'CSR-INIT-FIL3' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFIL3_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * procCsrNextFil3Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 4800-PROC-CSR-NEXT-FIL3-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * @throws CFException
      */
      @Override
      public ProcCsrNextFil3SectOutCtx procCsrNextFil3Sect(ProcCsrNextFil3SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4800-Proc-csr-next-fil3-sect                                *
// *81                                                              *
// *81  business function: declare and open next-fil3 cursor        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4000-search-member-plus-sect                    *
// *82  calls     : 4810-open-csr-next-fil3-sect
// *82            : 4820-fetch-csr-next-fil3-sect
// *82            : 4830-close-csr-next-fil3-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcCsrNextFil3SectOutCtx methodOut = methodIn.getProcCsrNextFil3SectOutCtx();
//  PERFORM 4810-OPEN-CSR-NEXT-FIL3-SECT
          openCsrNextFil3Sect(programCtx.getOpenCsrNextFil3SectInCtx());/*4810-OPEN-CSR-NEXT-FIL3-SECT SECTION*/
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
              methodOut.setClmHstEndOfFetchNoTrue(); 
              
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
              while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodIn.isDt1RspOk()  )) {
//  PERFORM 4820-FETCH-CSR-NEXT-FIL3-SECT
                  fetchCsrNextFil3Sect(programCtx);/*4820-FETCH-CSR-NEXT-FIL3-SECT SECTION*/
              }
          }
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  PERFORM 4830-CLOSE-CSR-NEXT-FIL3-SECT
              closeCsrNextFil3Sect(programCtx.getCloseCsrNextFil3SectInCtx());/*4830-CLOSE-CSR-NEXT-FIL3-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * openCsrNextFil3Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 4810-OPEN-CSR-NEXT-FIL3-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dderefPolNbr                   COBOL Name: DDEREF-POL-NBR
      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dderefEeId                     COBOL Name: DDEREF-EE-ID
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dderefDepnNbr                  COBOL Name: DDEREF-DEPN-NBR
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - nextKey                        COBOL Name: NEXT-KEY
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - nextProcDt                     COBOL Name: NEXT-PROC-DT
      * - dderefProcDt                   COBOL Name: DDEREF-PROC-DT
      * - nextProcTm                     COBOL Name: NEXT-PROC-TM
      * - dderefProcTm                   COBOL Name: DDEREF-PROC-TM
      * - nextPgmIdLstCharVal            COBOL Name: NEXT-PGM-ID-LST-CHAR-VAL
      * - dderefPgmIdLstCharVal          COBOL Name: DDEREF-PGM-ID-LST-CHAR-VAL
      * - nextIcnSufxVersNbr             COBOL Name: NEXT-ICN-SUFX-VERS-NBR
      * - dderefIcnSufxVersNbr           COBOL Name: DDEREF-ICN-SUFX-VERS-NBR
      * - nextInvnCtlNbr                 COBOL Name: NEXT-INVN-CTL-NBR
      * - dderefInvnCtlNbr               COBOL Name: DDEREF-INVN-CTL-NBR
      * - nextIcnSufxCd                  COBOL Name: NEXT-ICN-SUFX-CD
      * - dderefIcnSufxCd                COBOL Name: DDEREF-ICN-SUFX-CD
      * - nextLnId                       COBOL Name: NEXT-LN-ID
      * - dderefLnId                     COBOL Name: DDEREF-LN-ID
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public OpenCsrNextFil3SectOutCtx openCsrNextFil3Sect(OpenCsrNextFil3SectInCtx methodIn) throws Exception {
      
// *82***************************************************************
// *82  Called by : 4800-proc-csr-next-fil3-sect                    *
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
OpenCsrNextFil3SectOutCtx methodOut = methodIn.getOpenCsrNextFil3SectOutCtx();
//  MOVE DT1-REQ-POLICY TO DDEREF-POL-NBR
          methodOut.setDderefPolNbr(methodOut.getDt1ReqPolicy());
//  MOVE DT1-REQ-EMPID TO DDEREF-EE-ID
          methodOut.setDderefEeId(methodOut.getDt1ReqEmpid());
//  MOVE DT1-REQ-DEP-NBR (2 : 2) TO DDEREF-DEPN-NBR (1 : 2)
          methodOut.setDderefDepnNbr(replace(methodOut.getDderefDepnNbr(),String.valueOf(substring(methodOut.getDt1ReqDepNbrString(),1,3)).toCharArray(),0,2));
//  IF DDEREF-DEPN-NBR = 99
//  LITERAL_99 = 99
          if (compareChars(methodOut.getDderefDepnNbr(),CONSTANTS.LITERAL_99) == 0) { 
//  MOVE ZERO TO DDEREF-DEPN-NBR
              methodOut.setDderefDepnNbr(CONSTANTS.ZERO_2);
          }
//  MOVE DT1-REQ-NEXT-KEY TO NEXT-KEY
          methodOut.getNextKey().setString(methodOut.getDt1ReqNextKey());
//  MOVE NEXT-PROC-DT TO DDEREF-PROC-DT
          methodOut.setDderefProcDt(methodOut.getNextProcDt());
//  MOVE NEXT-PROC-TM TO DDEREF-PROC-TM
          methodOut.setDderefProcTm(methodOut.getNextProcTm());
//  MOVE NEXT-PGM-ID-LST-CHAR-VAL TO DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setDderefPgmIdLstCharVal(methodOut.getNextPgmIdLstCharVal());
//  MOVE NEXT-ICN-SUFX-VERS-NBR TO DDEREF-ICN-SUFX-VERS-NBR
          methodOut.setDderefIcnSufxVersNbr((short) methodOut.getNextIcnSufxVersNbr());
//  MOVE NEXT-INVN-CTL-NBR TO DDEREF-INVN-CTL-NBR
          methodOut.setDderefInvnCtlNbr(methodOut.getNextInvnCtlNbr());
//  MOVE NEXT-ICN-SUFX-CD TO DDEREF-ICN-SUFX-CD
          methodOut.setDderefIcnSufxCd(methodOut.getNextIcnSufxCd());
//  MOVE NEXT-LN-ID TO DDEREF-LN-ID
          methodOut.setDderefLnId((short) methodOut.getNextLnId());
//  WITH CLM_HST_TABLE ( PARTN_ID , PARTN_VAL , PROC_DT , PROC_TM , ICN_SUFX_VERS_NBR , INVN_CTL_NBR , ICN_SUFX_CD , AUTH_SRC_ID , AUTH_PROC_CD , PROV_NM , PROV_EOB_NM , PROV_PRDCT_CD , PROV_MKT_TYP_CD , PROV_IPA_ID , TPSM_CD , PROV_SPCL_CD ) AS ( SELECT DISTINCT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , LNE.AUTH_SRC_ID , LNE.AUTH_PROC_CD , PRV.PROV_NM , PRV.PROV_EOB_NM , PRV.PROV_PRDCT_CD , PRV.PROV_MKT_TYP_CD , PRV.PROV_IPA_ID , PRV.TPSM_CD , PRV.PROV_SPCL_CD FROM ADJD_CLMHST_DENORM_REF REF INNER JOIN ADJD_CLMSF_LN LNE ON REF.PARTN_ID = LNE.PARTN_ID AND REF.PARTN_VAL = LNE.PARTN_VAL AND REF.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND REF.PROC_DT = LNE.PROC_DT AND REF.PROC_TM = LNE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND REF.LN_ID = LNE.LN_ID INNER JOIN ADJD_CLMSF_ORIGHDR ORG ON ORG.PARTN_ID = LNE.PARTN_ID AND ORG.PARTN_VAL = LNE.PARTN_VAL AND ORG.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND ORG.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND ORG.PROC_DT = LNE.PROC_DT AND ORG.PROC_TM = LNE.PROC_TM AND ORG.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND ORG.LN_CORR_ID = LNE.ORIG_LN_CORR_ID INNER JOIN ADJD_CLMSF_PROV PRV ON REF.PARTN_ID = PRV.PARTN_ID AND REF.PARTN_VAL = PRV.PARTN_VAL AND REF.INVN_CTL_NBR = PRV.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PRV.ICN_SUFX_CD AND REF.PROC_DT = PRV.PROC_DT AND REF.PROC_TM = PRV.PROC_TM AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR AND REF.PROV_SCRN_NBR = PRV.PROV_SEQ_NBR INNER JOIN ADJD_CLMSFLN_ACCUM ACM ON REF.PARTN_ID = ACM.PARTN_ID AND REF.PARTN_VAL = ACM.PARTN_VAL AND REF.INVN_CTL_NBR = ACM.INVN_CTL_NBR AND REF.ICN_SUFX_CD = ACM.ICN_SUFX_CD AND REF.PROC_DT = ACM.PROC_DT AND REF.PROC_TM = ACM.PROC_TM AND REF.ICN_SUFX_VERS_NBR = ACM.ICN_SUFX_VERS_NBR AND REF.LN_ID = ACM.LN_ID WHERE REF.POL_NBR = ? AND REF.EE_ID = ? AND REF.DEPN_NBR = ? AND ? >= REF.FST_DT AND ? <= REF.LST_SRVC_DT AND SUBSTR ( REF.PROV_TINSUFF , 2 , 9 ) BETWEEN ? AND ? AND REF.RMRK_CD BETWEEN ? AND ? AND SUBSTR ( REF.CAUS_CD , 1 , 1 ) BETWEEN ? AND ? AND ( ORG.UB92_RVNU_CD BETWEEN ? AND ? ) AND ACM.LN_ACCUM_TYP_CD = 'OOP' AND ( ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR = ? AND REF.ICN_SUFX_CD = ? AND REF.LN_ID <= ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR = ? AND REF.ICN_SUFX_CD < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM < ? ) OR ( REF.PROC_DT < ? ) ) ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC FETCH FIRST 500 ROWS ONLY ) SELECT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.PGM_ID_LST_CHAR_VAL , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , REF.LN_ID , REF.FLN_JULIAN_DT_NBR , REF.FLN_SRL_NBR , REF.DFT_NBR , REF.FST_DT , REF.LST_SRVC_DT , REF.PROV_TINSUFF , REF.PROV_SCRN_NBR , REF.CHRG_AMT , REF.RMRK_CD , REF.NC_AMT , REF.PMT_SVC_CD , REF.OVR_CD , REF.COPAY_AMT , REF.SRVC_CD , REF.PAY_CD , REF.TRANS_CD , HDR.FILM_OFC_NBR , HDR.CLM_LVL_RSN_CD , HDR.ADJTR_ID , HDR.MBR_PRV_IND , HDR.NTFY_WAIV_CD , HDR.BANK_CD , HDR.DIV_NBR , HDR.CLS_NBR , HDR.DRG_NBR , HDR.FACL_OR_PROF_CD , BKE.DLGT_ENTY_CD , BK2.NDB_CONTR_ID , BK2.CLM_SMB_TYP_APP_CD , BK2.SMB_ST_CD , DLN.PROC_T1_IND , DLN.AUTH_NBR , DLN.BASE_DED_DESC_TXT , DLN.MM_DED_DESC_TXT , DLN.PRS_CREAT_SRC_CD , DLN.BASE_DED_AMT , DLN.BASE_AMT , DLN.MM_DED_AMT , DLN.MM_AMT , DLN.MC_CR_RES_AMT , DLN.COB_CR_RES_AMT , DLN.PAR_IND , DLN.SUP_AMT , DLN.PROV_MKT_NBR , DLN.PPO_CD , DLN.PTNT_RESP_AMT , HST.AUTH_SRC_ID , HST.AUTH_PROC_CD , HST.PROV_NM , HST.PROV_EOB_NM , HST.PROV_PRDCT_CD , HST.PROV_MKT_TYP_CD , HST.PROV_IPA_ID , HST.TPSM_CD , HST.PROV_SPCL_CD , IFNULL ( ( SELECT PR1.PROV_MEDCD_RECLM_IND FROM ADJD_CLMSF_PROV PR1 WHERE REF.PARTN_ID = PR1.PARTN_ID AND REF.PARTN_VAL = PR1.PARTN_VAL AND REF.INVN_CTL_NBR = PR1.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PR1.ICN_SUFX_CD AND REF.PROC_DT = PR1.PROC_DT AND REF.PROC_TM = PR1.PROC_TM AND PR1.PROV_MEDCD_RECLM_IND = 'Y' ORDER BY LST_UPDT_DTTM DESC FETCH FIRST 1 ROW ONLY ) , ' ' ) , IFNULL ( ( SELECT REL.REL_SRVC_CLM_LVL_IND FROM ADJD_CLMSFLN_REL_SRVCS REL WHERE REF.PARTN_ID = REL.PARTN_ID AND REF.PARTN_VAL = REL.PARTN_VAL AND REF.INVN_CTL_NBR = REL.INVN_CTL_NBR AND REF.ICN_SUFX_CD = REL.ICN_SUFX_CD AND REF.PROC_DT = REL.PROC_DT AND REF.PROC_TM = REL.PROC_TM AND REF.ICN_SUFX_VERS_NBR = REL.ICN_SUFX_VERS_NBR AND REF.LN_ID = REL.LN_ID FETCH FIRST 1 ROWS ONLY ) , ' ' ) , IFNULL ( DIA.DIAG_CD , '       ' ) , ( SELECT COUNT ( DISTINCT AUTH_NBR ) FROM ADJD_CLMHST_DENORM_LN DLN2 WHERE REF.PARTN_ID = DLN2.PARTN_ID AND REF.PARTN_VAL = DLN2.PARTN_VAL AND REF.INVN_CTL_NBR = DLN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN2.ICN_SUFX_CD AND REF.PROC_DT = DLN2.PROC_DT AND REF.PROC_TM = DLN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR AND ' ' < DLN2.AUTH_NBR ) , ( SELECT SUM ( PHYS_MEDCN_MSK_CNT ) FROM ADJD_CLMSF_LN2 LN2 WHERE REF.PARTN_ID = LN2.PARTN_ID AND REF.PARTN_VAL = LN2.PARTN_VAL AND REF.INVN_CTL_NBR = LN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LN2.ICN_SUFX_CD AND REF.PROC_DT = LN2.PROC_DT AND REF.PROC_TM = LN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR ) FROM CLM_HST_TABLE HST INNER JOIN ADJD_CLMHST_DENORM_REF REF ON REF.PARTN_ID = HST.PARTN_ID AND REF.PARTN_VAL = HST.PARTN_VAL AND REF.PROC_DT = HST.PROC_DT AND REF.PROC_TM = HST.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR AND REF.INVN_CTL_NBR = HST.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HST.ICN_SUFX_CD INNER JOIN ADJD_CLMHST_DENORM_HDR HDR ON REF.PARTN_ID = HDR.PARTN_ID AND REF.PARTN_VAL = HDR.PARTN_VAL AND REF.INVN_CTL_NBR = HDR.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HDR.ICN_SUFX_CD AND REF.PROC_DT = HDR.PROC_DT AND REF.PROC_TM = HDR.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E BKE ON REF.PARTN_ID = BKE.PARTN_ID AND REF.PARTN_VAL = BKE.PARTN_VAL AND REF.INVN_CTL_NBR = BKE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BKE.ICN_SUFX_CD AND REF.PROC_DT = BKE.PROC_DT AND REF.PROC_TM = BKE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E2 BK2 ON REF.PARTN_ID = BK2.PARTN_ID AND REF.PARTN_VAL = BK2.PARTN_VAL AND REF.INVN_CTL_NBR = BK2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BK2.ICN_SUFX_CD AND REF.PROC_DT = BK2.PROC_DT AND REF.PROC_TM = BK2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMHST_DENORM_LN DLN ON REF.PARTN_ID = DLN.PARTN_ID AND REF.PARTN_VAL = DLN.PARTN_VAL AND REF.INVN_CTL_NBR = DLN.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN.ICN_SUFX_CD AND REF.PROC_DT = DLN.PROC_DT AND REF.PROC_TM = DLN.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR AND REF.LN_ID = DLN.LN_ID LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA ON REF.PARTN_ID = DIA.PARTN_ID AND REF.PARTN_VAL = DIA.PARTN_VAL AND REF.INVN_CTL_NBR = DIA.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DIA.ICN_SUFX_CD AND REF.PROC_DT = DIA.PROC_DT AND REF.PROC_TM = DIA.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR AND 1 = DIA.DIAG_SEQ_NBR ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.PGM_ID_LST_CHAR_VAL DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC , REF.LN_ID DESC OPTIMIZE FOR 600 ROWS FETCH FIRST 600 ROWS ONLY WITH UR
          programCtx.setCsrNextFil3ResultSet(d5427dt1Repository.openCsrNextFil3D5427dt1(methodOut.getDcladjdClmhstDenormRef(),methodIn.getHostVariables(),programCtx.getSqlca()));
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = ZERO
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '4810-OPE' TO DB2-PARAGRAPH
//  LITERAL_4810_MN_OPE = '4810-OPE'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4810_MN_OPE);
//  MOVE 'OPEN   ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_OPEN_B6_);
//  MOVE 'CSR-NEXT-FIL3' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFIL3_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrNextFil3Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 4820-FETCH-CSR-NEXT-FIL3-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrNextFil3SectOutCtx fetchCsrNextFil3Sect(D5427dt1Ctx programCtx) throws Exception {
      
// *81***************************************************************
// *81  4820-Fetch-csr-next-fil3-sect                               *
// *81                                                              *
// *81  business function: fetch claim lines                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4800-proc-csr-next-fil3-sect                    *
// *82  calls     : 4821-fetch-csr-rows-sect                        *
// *82***************************************************************
// *================================================================
FetchCsrNextFil3SectOutCtx methodOut = programCtx.getFetchCsrNextFil3SectOutCtx();
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
          methodOut.setClmHstEndOfFetchNoTrue(); 
          
//  SET DT1-RSP-OK TO TRUE
          methodOut.setDt1RspOkTrue(); 
          
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
          while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodOut.isDt1RspOk()  )) {
//  PERFORM 4821-FETCH-CSR-ROWS-SECT
              fetchCsrRowsSect4821(programCtx.getFetchCsrRowsSect4821InCtx());/*4821-FETCH-CSR-ROWS-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrRowsSect4821 
      *   This method is derived from 
  *   COBOL Paragraph - 4821-FETCH-CSR-ROWS-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrRowsSect4821OutCtx fetchCsrRowsSect4821(FetchCsrRowsSect4821InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4821-Fetch-csr-rows-sect                                    *
// *81                                                              *
// *81  business function: fetch cursor rows                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4820-fetch-csr-next-fil3-sect                   *
// *82  calls     : 4500-proc-fetched-rows-sect                     *
// *82            : 9100-database-error-sect                        *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
FetchCsrRowsSect4821OutCtx methodOut = methodIn.getFetchCsrRowsSect4821OutCtx();
//  FETCH NEXT ROWSET FROM CSR-NEXT-FIL3 FOR ? ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d5427dt1Repository.fetchCsrNextFil3D5427dt1(programCtx.getCsrNextFil3ResultSet(),methodOut.getHvaClmHistArray(),methodIn.getWork(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  (( methodOut.isSqlcodeOk()  ) || ( methodOut.isSqlcodeFetchEnd()  )) { 
//  PERFORM 4500-PROC-FETCHED-ROWS-SECT
              procFetchedRowsSect(programCtx.getProcFetchedRowsSectInCtx());/*4500-PROC-FETCHED-ROWS-SECT SECTION*/
          }
          else   { 
//  MOVE '4821-FET' TO DB2-PARAGRAPH
//  LITERAL_4821_MN_FET = '4821-FET'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4821_MN_FET);
//  MOVE 'FETCH  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_FETCH_B5_);
//  MOVE 'CSR-NEXT-FIL3' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFIL3_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsrNextFil3Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 4830-CLOSE-CSR-NEXT-FIL3-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public CloseCsrNextFil3SectOutCtx closeCsrNextFil3Sect(CloseCsrNextFil3SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4830-Close-csr-next-fil3-sect                               *
// *81                                                              *
// *81  business function: close the claim list cursor              *
// *82***************************************************************
// *82  called by : 4800-proc-csr-next-fil3-sect
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
CloseCsrNextFil3SectOutCtx methodOut = methodIn.getCloseCsrNextFil3SectOutCtx();
//  CLOSE CSR-NEXT-FIL3
          d5427dt1Repository.closeCsrNextFil3D5427dt1(programCtx.getCsrNextFil3ResultSet(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = +0 OR SQLCODE = -501
//  ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != -501 )) { 
//  MOVE '4830-CLO' TO DB2-PARAGRAPH
//  LITERAL_4830_MN_CLO = '4830-CLO'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4830_MN_CLO);
//  MOVE 'CLOSE  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_CLOSE_B5_);
//  MOVE 'CSR-NEXT-FIL3' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFIL3_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * procCsrInitFil4Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 4900-PROC-CSR-INIT-FIL4-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * @throws CFException
      */
      @Override
      public ProcCsrInitFil4SectOutCtx procCsrInitFil4Sect(ProcCsrInitFil4SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4900-Proc-csr-init-fil4-sect                                *
// *81                                                              *
// *81  business function: declare and open init-fil4 cursor        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4000-search-member-plus-sect                    *
// *82  calls     : 4910-open-csr-init-fil4-sect
// *82            : 4920-fetch-csr-init-fil4-sect
// *82            : 4930-close-csr-init-fil4-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcCsrInitFil4SectOutCtx methodOut = methodIn.getProcCsrInitFil4SectOutCtx();
//  PERFORM 4910-OPEN-CSR-INIT-FIL4-SECT
          openCsrInitFil4Sect(programCtx.getOpenCsrInitFil4SectInCtx());/*4910-OPEN-CSR-INIT-FIL4-SECT SECTION*/
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
              methodOut.setClmHstEndOfFetchNoTrue(); 
              
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
              while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodIn.isDt1RspOk()  )) {
//  PERFORM 4920-FETCH-CSR-INIT-FIL4-SECT
                  fetchCsrInitFil4Sect(programCtx);/*4920-FETCH-CSR-INIT-FIL4-SECT SECTION*/
              }
          }
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  PERFORM 4930-CLOSE-CSR-INIT-FIL4-SECT
              closeCsrInitFil4Sect(programCtx.getCloseCsrInitFil4SectInCtx());/*4930-CLOSE-CSR-INIT-FIL4-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * openCsrInitFil4Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 4910-OPEN-CSR-INIT-FIL4-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dderefPolNbr                   COBOL Name: DDEREF-POL-NBR
      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dderefEeId                     COBOL Name: DDEREF-EE-ID
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dderefDepnNbr                  COBOL Name: DDEREF-DEPN-NBR
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public OpenCsrInitFil4SectOutCtx openCsrInitFil4Sect(OpenCsrInitFil4SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4910-Open-csr-init-fil4-sect                                *
// *81                                                              *
// *81  business function: declare and open csr-init-fil4           *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4900-proc-csr-init-fil4-sect                    *
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
OpenCsrInitFil4SectOutCtx methodOut = methodIn.getOpenCsrInitFil4SectOutCtx();
//  MOVE DT1-REQ-POLICY TO DDEREF-POL-NBR
          methodOut.setDderefPolNbr(methodOut.getDt1ReqPolicy());
//  MOVE DT1-REQ-EMPID TO DDEREF-EE-ID
          methodOut.setDderefEeId(methodOut.getDt1ReqEmpid());
//  MOVE DT1-REQ-DEP-NBR (2 : 2) TO DDEREF-DEPN-NBR (1 : 2)
          methodOut.setDderefDepnNbr(replace(methodOut.getDderefDepnNbr(),String.valueOf(substring(methodOut.getDt1ReqDepNbrString(),1,3)).toCharArray(),0,2));
//  IF DDEREF-DEPN-NBR = 99
//  LITERAL_99 = 99
          if (compareChars(methodOut.getDderefDepnNbr(),CONSTANTS.LITERAL_99) == 0) { 
//  MOVE ZERO TO DDEREF-DEPN-NBR
              methodOut.setDderefDepnNbr(CONSTANTS.ZERO_2);
          }
//  WITH CLM_HST_TABLE ( PARTN_ID , PARTN_VAL , PROC_DT , PROC_TM , ICN_SUFX_VERS_NBR , INVN_CTL_NBR , ICN_SUFX_CD , AUTH_SRC_ID , AUTH_PROC_CD , PROV_NM , PROV_EOB_NM , PROV_PRDCT_CD , PROV_MKT_TYP_CD , PROV_IPA_ID , TPSM_CD , PROV_SPCL_CD ) AS ( SELECT DISTINCT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , LNE.AUTH_SRC_ID , LNE.AUTH_PROC_CD , PRV.PROV_NM , PRV.PROV_EOB_NM , PRV.PROV_PRDCT_CD , PRV.PROV_MKT_TYP_CD , PRV.PROV_IPA_ID , PRV.TPSM_CD , PRV.PROV_SPCL_CD FROM ADJD_CLMHST_DENORM_REF REF INNER JOIN ADJD_CLMSF_LN LNE ON REF.PARTN_ID = LNE.PARTN_ID AND REF.PARTN_VAL = LNE.PARTN_VAL AND REF.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND REF.PROC_DT = LNE.PROC_DT AND REF.PROC_TM = LNE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND REF.LN_ID = LNE.LN_ID INNER JOIN ADJD_CLMSF_PROV PRV ON REF.PARTN_ID = PRV.PARTN_ID AND REF.PARTN_VAL = PRV.PARTN_VAL AND REF.INVN_CTL_NBR = PRV.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PRV.ICN_SUFX_CD AND REF.PROC_DT = PRV.PROC_DT AND REF.PROC_TM = PRV.PROC_TM AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR AND REF.PROV_SCRN_NBR = PRV.PROV_SEQ_NBR INNER JOIN ADJD_CLMSFLN_ACCUM ACM ON REF.PARTN_ID = ACM.PARTN_ID AND REF.PARTN_VAL = ACM.PARTN_VAL AND REF.INVN_CTL_NBR = ACM.INVN_CTL_NBR AND REF.ICN_SUFX_CD = ACM.ICN_SUFX_CD AND REF.PROC_DT = ACM.PROC_DT AND REF.PROC_TM = ACM.PROC_TM AND REF.ICN_SUFX_VERS_NBR = ACM.ICN_SUFX_VERS_NBR AND REF.LN_ID = ACM.LN_ID WHERE REF.POL_NBR = ? AND REF.EE_ID = ? AND REF.DEPN_NBR = ? AND ? >= REF.FST_DT AND ? <= REF.LST_SRVC_DT AND SUBSTR ( REF.PROV_TINSUFF , 2 , 9 ) BETWEEN ? AND ? AND REF.RMRK_CD BETWEEN ? AND ? AND SUBSTR ( REF.CAUS_CD , 1 , 1 ) BETWEEN ? AND ? AND ( LNE.ORIG_PROC_CD BETWEEN ? AND ? OR LNE.PMT_SVC_CD BETWEEN ? AND ? ) AND ACM.LN_ACCUM_TYP_CD = 'OOP' ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC FETCH FIRST 500 ROWS ONLY ) SELECT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.PGM_ID_LST_CHAR_VAL , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , REF.LN_ID , REF.FLN_JULIAN_DT_NBR , REF.FLN_SRL_NBR , REF.DFT_NBR , REF.FST_DT , REF.LST_SRVC_DT , REF.PROV_TINSUFF , REF.PROV_SCRN_NBR , REF.CHRG_AMT , REF.RMRK_CD , REF.NC_AMT , REF.PMT_SVC_CD , REF.OVR_CD , REF.COPAY_AMT , REF.SRVC_CD , REF.PAY_CD , REF.TRANS_CD , HDR.FILM_OFC_NBR , HDR.CLM_LVL_RSN_CD , HDR.ADJTR_ID , HDR.MBR_PRV_IND , HDR.NTFY_WAIV_CD , HDR.BANK_CD , HDR.DIV_NBR , HDR.CLS_NBR , HDR.DRG_NBR , HDR.FACL_OR_PROF_CD , BKE.DLGT_ENTY_CD , BK2.NDB_CONTR_ID , BK2.CLM_SMB_TYP_APP_CD , BK2.SMB_ST_CD , DLN.PROC_T1_IND , DLN.AUTH_NBR , DLN.BASE_DED_DESC_TXT , DLN.MM_DED_DESC_TXT , DLN.PRS_CREAT_SRC_CD , DLN.BASE_DED_AMT , DLN.BASE_AMT , DLN.MM_DED_AMT , DLN.MM_AMT , DLN.MC_CR_RES_AMT , DLN.COB_CR_RES_AMT , DLN.PAR_IND , DLN.SUP_AMT , DLN.PROV_MKT_NBR , DLN.PPO_CD , DLN.PTNT_RESP_AMT , HST.AUTH_SRC_ID , HST.AUTH_PROC_CD , HST.PROV_NM , HST.PROV_EOB_NM , HST.PROV_PRDCT_CD , HST.PROV_MKT_TYP_CD , HST.PROV_IPA_ID , HST.TPSM_CD , HST.PROV_SPCL_CD , IFNULL ( ( SELECT PR1.PROV_MEDCD_RECLM_IND FROM ADJD_CLMSF_PROV PR1 WHERE REF.PARTN_ID = PR1.PARTN_ID AND REF.PARTN_VAL = PR1.PARTN_VAL AND REF.INVN_CTL_NBR = PR1.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PR1.ICN_SUFX_CD AND REF.PROC_DT = PR1.PROC_DT AND REF.PROC_TM = PR1.PROC_TM AND PR1.PROV_MEDCD_RECLM_IND = 'Y' ORDER BY LST_UPDT_DTTM DESC FETCH FIRST 1 ROW ONLY ) , ' ' ) , IFNULL ( ( SELECT REL.REL_SRVC_CLM_LVL_IND FROM ADJD_CLMSFLN_REL_SRVCS REL WHERE REF.PARTN_ID = REL.PARTN_ID AND REF.PARTN_VAL = REL.PARTN_VAL AND REF.INVN_CTL_NBR = REL.INVN_CTL_NBR AND REF.ICN_SUFX_CD = REL.ICN_SUFX_CD AND REF.PROC_DT = REL.PROC_DT AND REF.PROC_TM = REL.PROC_TM AND REF.ICN_SUFX_VERS_NBR = REL.ICN_SUFX_VERS_NBR AND REF.LN_ID = REL.LN_ID FETCH FIRST 1 ROWS ONLY ) , ' ' ) , IFNULL ( DIA.DIAG_CD , '       ' ) , ( SELECT COUNT ( DISTINCT AUTH_NBR ) FROM ADJD_CLMHST_DENORM_LN DLN2 WHERE REF.PARTN_ID = DLN2.PARTN_ID AND REF.PARTN_VAL = DLN2.PARTN_VAL AND REF.INVN_CTL_NBR = DLN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN2.ICN_SUFX_CD AND REF.PROC_DT = DLN2.PROC_DT AND REF.PROC_TM = DLN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR AND ' ' < DLN2.AUTH_NBR ) , ( SELECT SUM ( PHYS_MEDCN_MSK_CNT ) FROM ADJD_CLMSF_LN2 LN2 WHERE REF.PARTN_ID = LN2.PARTN_ID AND REF.PARTN_VAL = LN2.PARTN_VAL AND REF.INVN_CTL_NBR = LN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LN2.ICN_SUFX_CD AND REF.PROC_DT = LN2.PROC_DT AND REF.PROC_TM = LN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR ) FROM CLM_HST_TABLE HST INNER JOIN ADJD_CLMHST_DENORM_REF REF ON REF.PARTN_ID = HST.PARTN_ID AND REF.PARTN_VAL = HST.PARTN_VAL AND REF.PROC_DT = HST.PROC_DT AND REF.PROC_TM = HST.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR AND REF.INVN_CTL_NBR = HST.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HST.ICN_SUFX_CD INNER JOIN ADJD_CLMHST_DENORM_HDR HDR ON REF.PARTN_ID = HDR.PARTN_ID AND REF.PARTN_VAL = HDR.PARTN_VAL AND REF.INVN_CTL_NBR = HDR.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HDR.ICN_SUFX_CD AND REF.PROC_DT = HDR.PROC_DT AND REF.PROC_TM = HDR.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E BKE ON REF.PARTN_ID = BKE.PARTN_ID AND REF.PARTN_VAL = BKE.PARTN_VAL AND REF.INVN_CTL_NBR = BKE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BKE.ICN_SUFX_CD AND REF.PROC_DT = BKE.PROC_DT AND REF.PROC_TM = BKE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E2 BK2 ON REF.PARTN_ID = BK2.PARTN_ID AND REF.PARTN_VAL = BK2.PARTN_VAL AND REF.INVN_CTL_NBR = BK2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BK2.ICN_SUFX_CD AND REF.PROC_DT = BK2.PROC_DT AND REF.PROC_TM = BK2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMHST_DENORM_LN DLN ON REF.PARTN_ID = DLN.PARTN_ID AND REF.PARTN_VAL = DLN.PARTN_VAL AND REF.INVN_CTL_NBR = DLN.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN.ICN_SUFX_CD AND REF.PROC_DT = DLN.PROC_DT AND REF.PROC_TM = DLN.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR AND REF.LN_ID = DLN.LN_ID LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA ON REF.PARTN_ID = DIA.PARTN_ID AND REF.PARTN_VAL = DIA.PARTN_VAL AND REF.INVN_CTL_NBR = DIA.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DIA.ICN_SUFX_CD AND REF.PROC_DT = DIA.PROC_DT AND REF.PROC_TM = DIA.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR AND 1 = DIA.DIAG_SEQ_NBR ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.PGM_ID_LST_CHAR_VAL DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC , REF.LN_ID DESC OPTIMIZE FOR 600 ROWS FETCH FIRST 600 ROWS ONLY WITH UR
          programCtx.setCsrInitFil4ResultSet(d5427dt1Repository.openCsrInitFil4D5427dt1(methodOut.getDcladjdClmhstDenormRef(),methodIn.getHostVariables(),programCtx.getSqlca()));
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = ZERO
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '4910-OPE' TO DB2-PARAGRAPH
//  LITERAL_4910_MN_OPE = '4910-OPE'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4910_MN_OPE);
//  MOVE 'OPEN   ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_OPEN_B6_);
//  MOVE 'CSR-INIT-FIL4' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFIL4_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrInitFil4Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 4920-FETCH-CSR-INIT-FIL4-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrInitFil4SectOutCtx fetchCsrInitFil4Sect(D5427dt1Ctx programCtx) throws Exception {
      
// *81***************************************************************
// *81  4920-Fetch-csr-init-fil4-sect                               *
// *81                                                              *
// *81  business function: fetch claim lines                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4900-proc-csr-init-fil4-sect                    *
// *82  calls     : 4921-fetch-csr-rows-sect                        *
// *82***************************************************************
// *================================================================
FetchCsrInitFil4SectOutCtx methodOut = programCtx.getFetchCsrInitFil4SectOutCtx();
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
          methodOut.setClmHstEndOfFetchNoTrue(); 
          
//  SET DT1-RSP-OK TO TRUE
          methodOut.setDt1RspOkTrue(); 
          
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
          while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodOut.isDt1RspOk()  )) {
//  PERFORM 4921-FETCH-CSR-ROWS-SECT
              fetchCsrRowsSect4921(programCtx.getFetchCsrRowsSect4921InCtx());/*4921-FETCH-CSR-ROWS-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrRowsSect4921 
      *   This method is derived from 
  *   COBOL Paragraph - 4921-FETCH-CSR-ROWS-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrRowsSect4921OutCtx fetchCsrRowsSect4921(FetchCsrRowsSect4921InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4921-Fetch-csr-rows-sect                                    *
// *81                                                              *
// *81  business function: fetch cursor rows                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4920-fetch-csr-init-fil4-sect                   *
// *82  calls     : 4500-proc-fetched-rows-sect                     *
// *82            : 9100-database-error-sect                        *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
FetchCsrRowsSect4921OutCtx methodOut = methodIn.getFetchCsrRowsSect4921OutCtx();
//  FETCH NEXT ROWSET FROM CSR-INIT-FIL4 FOR ? ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d5427dt1Repository.fetchCsrInitFil4D5427dt1(programCtx.getCsrInitFil4ResultSet(),methodOut.getHvaClmHistArray(),methodIn.getWork(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  (( methodOut.isSqlcodeOk()  ) || ( methodOut.isSqlcodeFetchEnd()  )) { 
//  PERFORM 4500-PROC-FETCHED-ROWS-SECT
              procFetchedRowsSect(programCtx.getProcFetchedRowsSectInCtx());/*4500-PROC-FETCHED-ROWS-SECT SECTION*/
          }
          else   { 
//  MOVE '4921-FET' TO DB2-PARAGRAPH
//  LITERAL_4921_MN_FET = '4921-FET'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4921_MN_FET);
//  MOVE 'FETCH  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_FETCH_B5_);
//  MOVE 'CSR-INIT-FIL4' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFIL4_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsrInitFil4Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 4930-CLOSE-CSR-INIT-FIL4-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public CloseCsrInitFil4SectOutCtx closeCsrInitFil4Sect(CloseCsrInitFil4SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  4930-Close-csr-init-fil4-sect                               *
// *81                                                              *
// *81  business function: close the claim list cursor              *
// *82***************************************************************
// *82  called by : 4900-proc-csr-init-fil4-sect
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
CloseCsrInitFil4SectOutCtx methodOut = methodIn.getCloseCsrInitFil4SectOutCtx();
//  CLOSE CSR-INIT-FIL4
          d5427dt1Repository.closeCsrInitFil4D5427dt1(programCtx.getCsrInitFil4ResultSet(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = +0 OR SQLCODE = -501
//  ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != -501 )) { 
//  MOVE '4930-CLO' TO DB2-PARAGRAPH
//  LITERAL_4930_MN_CLO = '4930-CLO'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_4930_MN_CLO);
//  MOVE 'CLOSE  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_CLOSE_B5_);
//  MOVE 'CSR-INIT-FIL4' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFIL4_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * procCsrNextFil4Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5000-PROC-CSR-NEXT-FIL4-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * @throws CFException
      */
      @Override
      public ProcCsrNextFil4SectOutCtx procCsrNextFil4Sect(ProcCsrNextFil4SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5000-Proc-csr-next-fil4-sect                                *
// *81                                                              *
// *81  business function: declare and open next-fil2 cursor        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4000-search-member-plus-sect                    *
// *82  calls     : 5010-open-csr-next-fil4-sect
// *82            : 5020-fetch-csr-next-fil4-sect
// *82            : 5030-close-csr-next-fil4-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcCsrNextFil4SectOutCtx methodOut = methodIn.getProcCsrNextFil4SectOutCtx();
//  PERFORM 5010-OPEN-CSR-NEXT-FIL4-SECT
          openCsrNextFil4Sect(programCtx.getOpenCsrNextFil4SectInCtx());/*5010-OPEN-CSR-NEXT-FIL4-SECT SECTION*/
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
              methodOut.setClmHstEndOfFetchNoTrue(); 
              
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
              while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodIn.isDt1RspOk()  )) {
//  PERFORM 5020-FETCH-CSR-NEXT-FIL4-SECT
                  fetchCsrNextFil4Sect(programCtx);/*5020-FETCH-CSR-NEXT-FIL4-SECT SECTION*/
              }
          }
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  PERFORM 5030-CLOSE-CSR-NEXT-FIL4-SECT
              closeCsrNextFil4Sect(programCtx.getCloseCsrNextFil4SectInCtx());/*5030-CLOSE-CSR-NEXT-FIL4-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * openCsrNextFil4Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5010-OPEN-CSR-NEXT-FIL4-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dderefPolNbr                   COBOL Name: DDEREF-POL-NBR
      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dderefEeId                     COBOL Name: DDEREF-EE-ID
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dderefDepnNbr                  COBOL Name: DDEREF-DEPN-NBR
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - nextKey                        COBOL Name: NEXT-KEY
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - nextProcDt                     COBOL Name: NEXT-PROC-DT
      * - dderefProcDt                   COBOL Name: DDEREF-PROC-DT
      * - nextProcTm                     COBOL Name: NEXT-PROC-TM
      * - dderefProcTm                   COBOL Name: DDEREF-PROC-TM
      * - nextPgmIdLstCharVal            COBOL Name: NEXT-PGM-ID-LST-CHAR-VAL
      * - dderefPgmIdLstCharVal          COBOL Name: DDEREF-PGM-ID-LST-CHAR-VAL
      * - nextIcnSufxVersNbr             COBOL Name: NEXT-ICN-SUFX-VERS-NBR
      * - dderefIcnSufxVersNbr           COBOL Name: DDEREF-ICN-SUFX-VERS-NBR
      * - nextInvnCtlNbr                 COBOL Name: NEXT-INVN-CTL-NBR
      * - dderefInvnCtlNbr               COBOL Name: DDEREF-INVN-CTL-NBR
      * - nextIcnSufxCd                  COBOL Name: NEXT-ICN-SUFX-CD
      * - dderefIcnSufxCd                COBOL Name: DDEREF-ICN-SUFX-CD
      * - nextLnId                       COBOL Name: NEXT-LN-ID
      * - dderefLnId                     COBOL Name: DDEREF-LN-ID
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public OpenCsrNextFil4SectOutCtx openCsrNextFil4Sect(OpenCsrNextFil4SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5010-Open-csr-next-fil4-sect                                *
// *81                                                              *
// *81  business function: declare and open csr-next-fil4           *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 5000-proc-csr-next-fil4-sect                    *
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
OpenCsrNextFil4SectOutCtx methodOut = methodIn.getOpenCsrNextFil4SectOutCtx();
//  MOVE DT1-REQ-POLICY TO DDEREF-POL-NBR
          methodOut.setDderefPolNbr(methodOut.getDt1ReqPolicy());
//  MOVE DT1-REQ-EMPID TO DDEREF-EE-ID
          methodOut.setDderefEeId(methodOut.getDt1ReqEmpid());
//  MOVE DT1-REQ-DEP-NBR (2 : 2) TO DDEREF-DEPN-NBR (1 : 2)
          methodOut.setDderefDepnNbr(replace(methodOut.getDderefDepnNbr(),String.valueOf(substring(methodOut.getDt1ReqDepNbrString(),1,3)).toCharArray(),0,2));
//  IF DDEREF-DEPN-NBR = 99
//  LITERAL_99 = 99
          if (compareChars(methodOut.getDderefDepnNbr(),CONSTANTS.LITERAL_99) == 0) { 
//  MOVE ZERO TO DDEREF-DEPN-NBR
              methodOut.setDderefDepnNbr(CONSTANTS.ZERO_2);
          }
//  MOVE DT1-REQ-NEXT-KEY TO NEXT-KEY
          methodOut.getNextKey().setString(methodOut.getDt1ReqNextKey());
//  MOVE NEXT-PROC-DT TO DDEREF-PROC-DT
          methodOut.setDderefProcDt(methodOut.getNextProcDt());
//  MOVE NEXT-PROC-TM TO DDEREF-PROC-TM
          methodOut.setDderefProcTm(methodOut.getNextProcTm());
//  MOVE NEXT-PGM-ID-LST-CHAR-VAL TO DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setDderefPgmIdLstCharVal(methodOut.getNextPgmIdLstCharVal());
//  MOVE NEXT-ICN-SUFX-VERS-NBR TO DDEREF-ICN-SUFX-VERS-NBR
          methodOut.setDderefIcnSufxVersNbr((short) methodOut.getNextIcnSufxVersNbr());
//  MOVE NEXT-INVN-CTL-NBR TO DDEREF-INVN-CTL-NBR
          methodOut.setDderefInvnCtlNbr(methodOut.getNextInvnCtlNbr());
//  MOVE NEXT-ICN-SUFX-CD TO DDEREF-ICN-SUFX-CD
          methodOut.setDderefIcnSufxCd(methodOut.getNextIcnSufxCd());
//  MOVE NEXT-LN-ID TO DDEREF-LN-ID
          methodOut.setDderefLnId((short) methodOut.getNextLnId());
//  WITH CLM_HST_TABLE ( PARTN_ID , PARTN_VAL , PROC_DT , PROC_TM , ICN_SUFX_VERS_NBR , INVN_CTL_NBR , ICN_SUFX_CD , AUTH_SRC_ID , AUTH_PROC_CD , PROV_NM , PROV_EOB_NM , PROV_PRDCT_CD , PROV_MKT_TYP_CD , PROV_IPA_ID , TPSM_CD , PROV_SPCL_CD ) AS ( SELECT DISTINCT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , LNE.AUTH_SRC_ID , LNE.AUTH_PROC_CD , PRV.PROV_NM , PRV.PROV_EOB_NM , PRV.PROV_PRDCT_CD , PRV.PROV_MKT_TYP_CD , PRV.PROV_IPA_ID , PRV.TPSM_CD , PRV.PROV_SPCL_CD FROM ADJD_CLMHST_DENORM_REF REF INNER JOIN ADJD_CLMSF_LN LNE ON REF.PARTN_ID = LNE.PARTN_ID AND REF.PARTN_VAL = LNE.PARTN_VAL AND REF.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND REF.PROC_DT = LNE.PROC_DT AND REF.PROC_TM = LNE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND REF.LN_ID = LNE.LN_ID INNER JOIN ADJD_CLMSF_PROV PRV ON REF.PARTN_ID = PRV.PARTN_ID AND REF.PARTN_VAL = PRV.PARTN_VAL AND REF.INVN_CTL_NBR = PRV.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PRV.ICN_SUFX_CD AND REF.PROC_DT = PRV.PROC_DT AND REF.PROC_TM = PRV.PROC_TM AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR AND REF.PROV_SCRN_NBR = PRV.PROV_SEQ_NBR INNER JOIN ADJD_CLMSFLN_ACCUM ACM ON REF.PARTN_ID = ACM.PARTN_ID AND REF.PARTN_VAL = ACM.PARTN_VAL AND REF.INVN_CTL_NBR = ACM.INVN_CTL_NBR AND REF.ICN_SUFX_CD = ACM.ICN_SUFX_CD AND REF.PROC_DT = ACM.PROC_DT AND REF.PROC_TM = ACM.PROC_TM AND REF.ICN_SUFX_VERS_NBR = ACM.ICN_SUFX_VERS_NBR AND REF.LN_ID = ACM.LN_ID WHERE REF.POL_NBR = ? AND REF.EE_ID = ? AND REF.DEPN_NBR = ? AND ? >= REF.FST_DT AND ? <= REF.LST_SRVC_DT AND SUBSTR ( REF.PROV_TINSUFF , 2 , 9 ) BETWEEN ? AND ? AND REF.RMRK_CD BETWEEN ? AND ? AND SUBSTR ( REF.CAUS_CD , 1 , 1 ) BETWEEN ? AND ? AND ( LNE.ORIG_PROC_CD BETWEEN ? AND ? OR LNE.PMT_SVC_CD BETWEEN ? AND ? ) AND ACM.LN_ACCUM_TYP_CD = 'OOP' AND ( ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR = ? AND REF.ICN_SUFX_CD = ? AND REF.LN_ID <= ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR = ? AND REF.ICN_SUFX_CD < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM < ? ) OR ( REF.PROC_DT < ? ) ) ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC FETCH FIRST 500 ROWS ONLY ) SELECT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.PGM_ID_LST_CHAR_VAL , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , REF.LN_ID , REF.FLN_JULIAN_DT_NBR , REF.FLN_SRL_NBR , REF.DFT_NBR , REF.FST_DT , REF.LST_SRVC_DT , REF.PROV_TINSUFF , REF.PROV_SCRN_NBR , REF.CHRG_AMT , REF.RMRK_CD , REF.NC_AMT , REF.PMT_SVC_CD , REF.OVR_CD , REF.COPAY_AMT , REF.SRVC_CD , REF.PAY_CD , REF.TRANS_CD , HDR.FILM_OFC_NBR , HDR.CLM_LVL_RSN_CD , HDR.ADJTR_ID , HDR.MBR_PRV_IND , HDR.NTFY_WAIV_CD , HDR.BANK_CD , HDR.DIV_NBR , HDR.CLS_NBR , HDR.DRG_NBR , HDR.FACL_OR_PROF_CD , BKE.DLGT_ENTY_CD , BK2.NDB_CONTR_ID , BK2.CLM_SMB_TYP_APP_CD , BK2.SMB_ST_CD , DLN.PROC_T1_IND , DLN.AUTH_NBR , DLN.BASE_DED_DESC_TXT , DLN.MM_DED_DESC_TXT , DLN.PRS_CREAT_SRC_CD , DLN.BASE_DED_AMT , DLN.BASE_AMT , DLN.MM_DED_AMT , DLN.MM_AMT , DLN.MC_CR_RES_AMT , DLN.COB_CR_RES_AMT , DLN.PAR_IND , DLN.SUP_AMT , DLN.PROV_MKT_NBR , DLN.PPO_CD , DLN.PTNT_RESP_AMT , HST.AUTH_SRC_ID , HST.AUTH_PROC_CD , HST.PROV_NM , HST.PROV_EOB_NM , HST.PROV_PRDCT_CD , HST.PROV_MKT_TYP_CD , HST.PROV_IPA_ID , HST.TPSM_CD , HST.PROV_SPCL_CD , IFNULL ( ( SELECT PR1.PROV_MEDCD_RECLM_IND FROM ADJD_CLMSF_PROV PR1 WHERE REF.PARTN_ID = PR1.PARTN_ID AND REF.PARTN_VAL = PR1.PARTN_VAL AND REF.INVN_CTL_NBR = PR1.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PR1.ICN_SUFX_CD AND REF.PROC_DT = PR1.PROC_DT AND REF.PROC_TM = PR1.PROC_TM AND PR1.PROV_MEDCD_RECLM_IND = 'Y' ORDER BY LST_UPDT_DTTM DESC FETCH FIRST 1 ROW ONLY ) , ' ' ) , IFNULL ( ( SELECT REL.REL_SRVC_CLM_LVL_IND FROM ADJD_CLMSFLN_REL_SRVCS REL WHERE REF.PARTN_ID = REL.PARTN_ID AND REF.PARTN_VAL = REL.PARTN_VAL AND REF.INVN_CTL_NBR = REL.INVN_CTL_NBR AND REF.ICN_SUFX_CD = REL.ICN_SUFX_CD AND REF.PROC_DT = REL.PROC_DT AND REF.PROC_TM = REL.PROC_TM AND REF.ICN_SUFX_VERS_NBR = REL.ICN_SUFX_VERS_NBR AND REF.LN_ID = REL.LN_ID FETCH FIRST 1 ROWS ONLY ) , ' ' ) , IFNULL ( DIA.DIAG_CD , '       ' ) , ( SELECT COUNT ( DISTINCT AUTH_NBR ) FROM ADJD_CLMHST_DENORM_LN DLN2 WHERE REF.PARTN_ID = DLN2.PARTN_ID AND REF.PARTN_VAL = DLN2.PARTN_VAL AND REF.INVN_CTL_NBR = DLN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN2.ICN_SUFX_CD AND REF.PROC_DT = DLN2.PROC_DT AND REF.PROC_TM = DLN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR AND ' ' < DLN2.AUTH_NBR ) , ( SELECT SUM ( PHYS_MEDCN_MSK_CNT ) FROM ADJD_CLMSF_LN2 LN2 WHERE REF.PARTN_ID = LN2.PARTN_ID AND REF.PARTN_VAL = LN2.PARTN_VAL AND REF.INVN_CTL_NBR = LN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LN2.ICN_SUFX_CD AND REF.PROC_DT = LN2.PROC_DT AND REF.PROC_TM = LN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR ) FROM CLM_HST_TABLE HST INNER JOIN ADJD_CLMHST_DENORM_REF REF ON REF.PARTN_ID = HST.PARTN_ID AND REF.PARTN_VAL = HST.PARTN_VAL AND REF.PROC_DT = HST.PROC_DT AND REF.PROC_TM = HST.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR AND REF.INVN_CTL_NBR = HST.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HST.ICN_SUFX_CD INNER JOIN ADJD_CLMHST_DENORM_HDR HDR ON REF.PARTN_ID = HDR.PARTN_ID AND REF.PARTN_VAL = HDR.PARTN_VAL AND REF.INVN_CTL_NBR = HDR.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HDR.ICN_SUFX_CD AND REF.PROC_DT = HDR.PROC_DT AND REF.PROC_TM = HDR.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E BKE ON REF.PARTN_ID = BKE.PARTN_ID AND REF.PARTN_VAL = BKE.PARTN_VAL AND REF.INVN_CTL_NBR = BKE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BKE.ICN_SUFX_CD AND REF.PROC_DT = BKE.PROC_DT AND REF.PROC_TM = BKE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E2 BK2 ON REF.PARTN_ID = BK2.PARTN_ID AND REF.PARTN_VAL = BK2.PARTN_VAL AND REF.INVN_CTL_NBR = BK2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BK2.ICN_SUFX_CD AND REF.PROC_DT = BK2.PROC_DT AND REF.PROC_TM = BK2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMHST_DENORM_LN DLN ON REF.PARTN_ID = DLN.PARTN_ID AND REF.PARTN_VAL = DLN.PARTN_VAL AND REF.INVN_CTL_NBR = DLN.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN.ICN_SUFX_CD AND REF.PROC_DT = DLN.PROC_DT AND REF.PROC_TM = DLN.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR AND REF.LN_ID = DLN.LN_ID LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA ON REF.PARTN_ID = DIA.PARTN_ID AND REF.PARTN_VAL = DIA.PARTN_VAL AND REF.INVN_CTL_NBR = DIA.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DIA.ICN_SUFX_CD AND REF.PROC_DT = DIA.PROC_DT AND REF.PROC_TM = DIA.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR AND 1 = DIA.DIAG_SEQ_NBR ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.PGM_ID_LST_CHAR_VAL DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC , REF.LN_ID DESC OPTIMIZE FOR 600 ROWS FETCH FIRST 600 ROWS ONLY WITH UR
          programCtx.setCsrNextFil4ResultSet(d5427dt1Repository.openCsrNextFil4D5427dt1(methodOut.getDcladjdClmhstDenormRef(),methodIn.getHostVariables(),programCtx.getSqlca()));
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = ZERO
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '5010-OPE' TO DB2-PARAGRAPH
//  LITERAL_5010_MN_OPE = '5010-OPE'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_5010_MN_OPE);
//  MOVE 'OPEN   ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_OPEN_B6_);
//  MOVE 'CSR-NEXT-FIL4' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFIL4_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrNextFil4Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5020-FETCH-CSR-NEXT-FIL4-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrNextFil4SectOutCtx fetchCsrNextFil4Sect(D5427dt1Ctx programCtx) throws Exception {
      
// *81***************************************************************
// *81  5020-Fetch-csr-next-fil4-sect                               *
// *81                                                              *
// *81  business function: fetch claim lines                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 5000-proc-csr-next-fil4-sect                    *
// *82  calls     : 5021-fetch-csr-rows-sect                        *
// *82***************************************************************
// *================================================================
FetchCsrNextFil4SectOutCtx methodOut = programCtx.getFetchCsrNextFil4SectOutCtx();
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
          methodOut.setClmHstEndOfFetchNoTrue(); 
          
//  SET DT1-RSP-OK TO TRUE
          methodOut.setDt1RspOkTrue(); 
          
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
          while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodOut.isDt1RspOk()  )) {
//  PERFORM 5021-FETCH-CSR-ROWS-SECT
              fetchCsrRowsSect5021(programCtx.getFetchCsrRowsSect5021InCtx());/*5021-FETCH-CSR-ROWS-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrRowsSect5021 
      *   This method is derived from 
  *   COBOL Paragraph - 5021-FETCH-CSR-ROWS-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrRowsSect5021OutCtx fetchCsrRowsSect5021(FetchCsrRowsSect5021InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5021-Fetch-csr-rows-sect                                    *
// *81                                                              *
// *81  business function: fetch cursor rows                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 5020-fetch-csr-next-fil2-sect                   *
// *82  calls     : 4500-proc-fetched-rows-sect                     *
// *82            : 9100-database-error-sect                        *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
FetchCsrRowsSect5021OutCtx methodOut = methodIn.getFetchCsrRowsSect5021OutCtx();
//  FETCH NEXT ROWSET FROM CSR-NEXT-FIL4 FOR ? ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d5427dt1Repository.fetchCsrNextFil4D5427dt1(programCtx.getCsrNextFil4ResultSet(),methodOut.getHvaClmHistArray(),methodIn.getWork(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  (( methodOut.isSqlcodeOk()  ) || ( methodOut.isSqlcodeFetchEnd()  )) { 
//  PERFORM 4500-PROC-FETCHED-ROWS-SECT
              procFetchedRowsSect(programCtx.getProcFetchedRowsSectInCtx());/*4500-PROC-FETCHED-ROWS-SECT SECTION*/
          }
          else   { 
//  MOVE '5021-FET' TO DB2-PARAGRAPH
//  LITERAL_5021_MN_FET = '5021-FET'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_5021_MN_FET);
//  MOVE 'FETCH  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_FETCH_B5_);
//  MOVE 'CSR-NEXT-FIL4' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFIL4_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsrNextFil4Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5030-CLOSE-CSR-NEXT-FIL4-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public CloseCsrNextFil4SectOutCtx closeCsrNextFil4Sect(CloseCsrNextFil4SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5030-Close-csr-next-fil4-sect                               *
// *81                                                              *
// *81  business function: close the claim list cursor              *
// *82***************************************************************
// *82  called by : 5000-proc-csr-next-fil4-sect
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
CloseCsrNextFil4SectOutCtx methodOut = methodIn.getCloseCsrNextFil4SectOutCtx();
//  CLOSE CSR-NEXT-FIL4
          d5427dt1Repository.closeCsrNextFil4D5427dt1(programCtx.getCsrNextFil4ResultSet(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = +0 OR SQLCODE = -501
//  ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != -501 )) { 
//  MOVE '5030-CLO' TO DB2-PARAGRAPH
//  LITERAL_5030_MN_CLO = '5030-CLO'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_5030_MN_CLO);
//  MOVE 'CLOSE  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_CLOSE_B5_);
//  MOVE 'CSR-NEXT-FIL4' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFIL4_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * procCsrInitFil5Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5100-PROC-CSR-INIT-FIL5-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * @throws CFException
      */
      @Override
      public ProcCsrInitFil5SectOutCtx procCsrInitFil5Sect(ProcCsrInitFil5SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5100-Proc-csr-init-fil5-sect                                *
// *81                                                              *
// *81  business function: declare and open init-fil5 cursor        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4000-search-member-plus-sect                    *
// *82  calls     : 5110-open-csr-init-fil5-sect
// *82            : 5120-fetch-csr-init-fil5-sect
// *82            : 5130-close-csr-init-fil5-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcCsrInitFil5SectOutCtx methodOut = methodIn.getProcCsrInitFil5SectOutCtx();
//  PERFORM 5110-OPEN-CSR-INIT-FIL5-SECT
          openCsrInitFil5Sect(programCtx.getOpenCsrInitFil5SectInCtx());/*5110-OPEN-CSR-INIT-FIL5-SECT SECTION*/
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
              methodOut.setClmHstEndOfFetchNoTrue(); 
              
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
              while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodIn.isDt1RspOk()  )) {
//  PERFORM 5120-FETCH-CSR-INIT-FIL5-SECT
                  fetchCsrInitFil5Sect(programCtx);/*5120-FETCH-CSR-INIT-FIL5-SECT SECTION*/
              }
          }
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  PERFORM 5130-CLOSE-CSR-INIT-FIL5-SECT
              closeCsrInitFil5Sect(programCtx.getCloseCsrInitFil5SectInCtx());/*5130-CLOSE-CSR-INIT-FIL5-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * openCsrInitFil5Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5110-OPEN-CSR-INIT-FIL5-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dderefPolNbr                   COBOL Name: DDEREF-POL-NBR
      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dderefEeId                     COBOL Name: DDEREF-EE-ID
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dderefDepnNbr                  COBOL Name: DDEREF-DEPN-NBR
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public OpenCsrInitFil5SectOutCtx openCsrInitFil5Sect(OpenCsrInitFil5SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5110-Open-csr-init-fil5-sect                                *
// *81                                                              *
// *81  business function: declare and open csr-init-fil5           *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 5100-proc-csr-init-fil5-sect                    *
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
OpenCsrInitFil5SectOutCtx methodOut = methodIn.getOpenCsrInitFil5SectOutCtx();
//  MOVE DT1-REQ-POLICY TO DDEREF-POL-NBR
          methodOut.setDderefPolNbr(methodOut.getDt1ReqPolicy());
//  MOVE DT1-REQ-EMPID TO DDEREF-EE-ID
          methodOut.setDderefEeId(methodOut.getDt1ReqEmpid());
//  MOVE DT1-REQ-DEP-NBR (2 : 2) TO DDEREF-DEPN-NBR (1 : 2)
          methodOut.setDderefDepnNbr(replace(methodOut.getDderefDepnNbr(),String.valueOf(substring(methodOut.getDt1ReqDepNbrString(),1,3)).toCharArray(),0,2));
//  IF DDEREF-DEPN-NBR = 99
//  LITERAL_99 = 99
          if (compareChars(methodOut.getDderefDepnNbr(),CONSTANTS.LITERAL_99) == 0) { 
//  MOVE ZERO TO DDEREF-DEPN-NBR
              methodOut.setDderefDepnNbr(CONSTANTS.ZERO_2);
          }
//  WITH CLM_HST_TABLE ( PARTN_ID , PARTN_VAL , PROC_DT , PROC_TM , ICN_SUFX_VERS_NBR , INVN_CTL_NBR , ICN_SUFX_CD , AUTH_SRC_ID , AUTH_PROC_CD , PROV_NM , PROV_EOB_NM , PROV_PRDCT_CD , PROV_MKT_TYP_CD , PROV_IPA_ID , TPSM_CD , PROV_SPCL_CD ) AS ( SELECT DISTINCT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , LNE.AUTH_SRC_ID , LNE.AUTH_PROC_CD , PRV.PROV_NM , PRV.PROV_EOB_NM , PRV.PROV_PRDCT_CD , PRV.PROV_MKT_TYP_CD , PRV.PROV_IPA_ID , PRV.TPSM_CD , PRV.PROV_SPCL_CD FROM ADJD_CLMHST_DENORM_REF REF INNER JOIN ADJD_CLMSF_LN LNE ON REF.PARTN_ID = LNE.PARTN_ID AND REF.PARTN_VAL = LNE.PARTN_VAL AND REF.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND REF.PROC_DT = LNE.PROC_DT AND REF.PROC_TM = LNE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND REF.LN_ID = LNE.LN_ID INNER JOIN ADJD_CLMSF_ORIGHDR ORG ON ORG.PARTN_ID = LNE.PARTN_ID AND ORG.PARTN_VAL = LNE.PARTN_VAL AND ORG.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND ORG.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND ORG.PROC_DT = LNE.PROC_DT AND ORG.PROC_TM = LNE.PROC_TM AND ORG.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND ORG.LN_CORR_ID = LNE.ORIG_LN_CORR_ID INNER JOIN ADJD_CLMSF_PROV PRV ON REF.PARTN_ID = PRV.PARTN_ID AND REF.PARTN_VAL = PRV.PARTN_VAL AND REF.INVN_CTL_NBR = PRV.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PRV.ICN_SUFX_CD AND REF.PROC_DT = PRV.PROC_DT AND REF.PROC_TM = PRV.PROC_TM AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR AND REF.PROV_SCRN_NBR = PRV.PROV_SEQ_NBR WHERE REF.POL_NBR = ? AND REF.EE_ID = ? AND REF.DEPN_NBR = ? AND ? >= REF.FST_DT AND ? <= REF.LST_SRVC_DT AND SUBSTR ( REF.PROV_TINSUFF , 2 , 9 ) BETWEEN ? AND ? AND REF.RMRK_CD BETWEEN ? AND ? AND SUBSTR ( REF.CAUS_CD , 1 , 1 ) BETWEEN ? AND ? AND ( ORG.UB92_RVNU_CD BETWEEN ? AND ? ) ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC FETCH FIRST 500 ROWS ONLY ) SELECT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.PGM_ID_LST_CHAR_VAL , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , REF.LN_ID , REF.FLN_JULIAN_DT_NBR , REF.FLN_SRL_NBR , REF.DFT_NBR , REF.FST_DT , REF.LST_SRVC_DT , REF.PROV_TINSUFF , REF.PROV_SCRN_NBR , REF.CHRG_AMT , REF.RMRK_CD , REF.NC_AMT , REF.PMT_SVC_CD , REF.OVR_CD , REF.COPAY_AMT , REF.SRVC_CD , REF.PAY_CD , REF.TRANS_CD , HDR.FILM_OFC_NBR , HDR.CLM_LVL_RSN_CD , HDR.ADJTR_ID , HDR.MBR_PRV_IND , HDR.NTFY_WAIV_CD , HDR.BANK_CD , HDR.DIV_NBR , HDR.CLS_NBR , HDR.DRG_NBR , HDR.FACL_OR_PROF_CD , BKE.DLGT_ENTY_CD , BK2.NDB_CONTR_ID , BK2.CLM_SMB_TYP_APP_CD , BK2.SMB_ST_CD , DLN.PROC_T1_IND , DLN.AUTH_NBR , DLN.BASE_DED_DESC_TXT , DLN.MM_DED_DESC_TXT , DLN.PRS_CREAT_SRC_CD , DLN.BASE_DED_AMT , DLN.BASE_AMT , DLN.MM_DED_AMT , DLN.MM_AMT , DLN.MC_CR_RES_AMT , DLN.COB_CR_RES_AMT , DLN.PAR_IND , DLN.SUP_AMT , DLN.PROV_MKT_NBR , DLN.PPO_CD , DLN.PTNT_RESP_AMT , HST.AUTH_SRC_ID , HST.AUTH_PROC_CD , HST.PROV_NM , HST.PROV_EOB_NM , HST.PROV_PRDCT_CD , HST.PROV_MKT_TYP_CD , HST.PROV_IPA_ID , HST.TPSM_CD , HST.PROV_SPCL_CD , IFNULL ( ( SELECT PR1.PROV_MEDCD_RECLM_IND FROM ADJD_CLMSF_PROV PR1 WHERE REF.PARTN_ID = PR1.PARTN_ID AND REF.PARTN_VAL = PR1.PARTN_VAL AND REF.INVN_CTL_NBR = PR1.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PR1.ICN_SUFX_CD AND REF.PROC_DT = PR1.PROC_DT AND REF.PROC_TM = PR1.PROC_TM AND PR1.PROV_MEDCD_RECLM_IND = 'Y' ORDER BY LST_UPDT_DTTM DESC FETCH FIRST 1 ROW ONLY ) , ' ' ) , IFNULL ( ( SELECT REL.REL_SRVC_CLM_LVL_IND FROM ADJD_CLMSFLN_REL_SRVCS REL WHERE REF.PARTN_ID = REL.PARTN_ID AND REF.PARTN_VAL = REL.PARTN_VAL AND REF.INVN_CTL_NBR = REL.INVN_CTL_NBR AND REF.ICN_SUFX_CD = REL.ICN_SUFX_CD AND REF.PROC_DT = REL.PROC_DT AND REF.PROC_TM = REL.PROC_TM AND REF.ICN_SUFX_VERS_NBR = REL.ICN_SUFX_VERS_NBR AND REF.LN_ID = REL.LN_ID FETCH FIRST 1 ROWS ONLY ) , ' ' ) , IFNULL ( DIA.DIAG_CD , '       ' ) , ( SELECT COUNT ( DISTINCT AUTH_NBR ) FROM ADJD_CLMHST_DENORM_LN DLN2 WHERE REF.PARTN_ID = DLN2.PARTN_ID AND REF.PARTN_VAL = DLN2.PARTN_VAL AND REF.INVN_CTL_NBR = DLN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN2.ICN_SUFX_CD AND REF.PROC_DT = DLN2.PROC_DT AND REF.PROC_TM = DLN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR AND ' ' < DLN2.AUTH_NBR ) , ( SELECT SUM ( PHYS_MEDCN_MSK_CNT ) FROM ADJD_CLMSF_LN2 LN2 WHERE REF.PARTN_ID = LN2.PARTN_ID AND REF.PARTN_VAL = LN2.PARTN_VAL AND REF.INVN_CTL_NBR = LN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LN2.ICN_SUFX_CD AND REF.PROC_DT = LN2.PROC_DT AND REF.PROC_TM = LN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR ) FROM CLM_HST_TABLE HST INNER JOIN ADJD_CLMHST_DENORM_REF REF ON REF.PARTN_ID = HST.PARTN_ID AND REF.PARTN_VAL = HST.PARTN_VAL AND REF.PROC_DT = HST.PROC_DT AND REF.PROC_TM = HST.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR AND REF.INVN_CTL_NBR = HST.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HST.ICN_SUFX_CD INNER JOIN ADJD_CLMHST_DENORM_HDR HDR ON REF.PARTN_ID = HDR.PARTN_ID AND REF.PARTN_VAL = HDR.PARTN_VAL AND REF.INVN_CTL_NBR = HDR.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HDR.ICN_SUFX_CD AND REF.PROC_DT = HDR.PROC_DT AND REF.PROC_TM = HDR.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E BKE ON REF.PARTN_ID = BKE.PARTN_ID AND REF.PARTN_VAL = BKE.PARTN_VAL AND REF.INVN_CTL_NBR = BKE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BKE.ICN_SUFX_CD AND REF.PROC_DT = BKE.PROC_DT AND REF.PROC_TM = BKE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E2 BK2 ON REF.PARTN_ID = BK2.PARTN_ID AND REF.PARTN_VAL = BK2.PARTN_VAL AND REF.INVN_CTL_NBR = BK2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BK2.ICN_SUFX_CD AND REF.PROC_DT = BK2.PROC_DT AND REF.PROC_TM = BK2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMHST_DENORM_LN DLN ON REF.PARTN_ID = DLN.PARTN_ID AND REF.PARTN_VAL = DLN.PARTN_VAL AND REF.INVN_CTL_NBR = DLN.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN.ICN_SUFX_CD AND REF.PROC_DT = DLN.PROC_DT AND REF.PROC_TM = DLN.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR AND REF.LN_ID = DLN.LN_ID LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA ON REF.PARTN_ID = DIA.PARTN_ID AND REF.PARTN_VAL = DIA.PARTN_VAL AND REF.INVN_CTL_NBR = DIA.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DIA.ICN_SUFX_CD AND REF.PROC_DT = DIA.PROC_DT AND REF.PROC_TM = DIA.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR AND 1 = DIA.DIAG_SEQ_NBR ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.PGM_ID_LST_CHAR_VAL DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC , REF.LN_ID DESC OPTIMIZE FOR 600 ROWS FETCH FIRST 600 ROWS ONLY WITH UR
          programCtx.setCsrInitFil5ResultSet(d5427dt1Repository.openCsrInitFil5D5427dt1(methodOut.getDcladjdClmhstDenormRef(),methodIn.getHostVariables(),programCtx.getSqlca()));
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = ZERO
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '5110-OPE' TO DB2-PARAGRAPH
//  LITERAL_5110_MN_OPE = '5110-OPE'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_5110_MN_OPE);
//  MOVE 'OPEN   ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_OPEN_B6_);
//  MOVE 'CSR-INIT-FIL5' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFIL5_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrInitFil5Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5120-FETCH-CSR-INIT-FIL5-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrInitFil5SectOutCtx fetchCsrInitFil5Sect(D5427dt1Ctx programCtx) throws Exception {
      
// *81***************************************************************
// *81  5120-Fetch-csr-init-fil5-sect                               *
// *81                                                              *
// *81  business function: fetch claim lines                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 5100-proc-csr-init-fil5-sect                    *
// *82  calls     : 5121-fetch-csr-rows-sect                        *
// *82***************************************************************
// *================================================================
FetchCsrInitFil5SectOutCtx methodOut = programCtx.getFetchCsrInitFil5SectOutCtx();
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
          methodOut.setClmHstEndOfFetchNoTrue(); 
          
//  SET DT1-RSP-OK TO TRUE
          methodOut.setDt1RspOkTrue(); 
          
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
          while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodOut.isDt1RspOk()  )) {
//  PERFORM 5121-FETCH-CSR-ROWS-SECT
              fetchCsrRowsSect5121(programCtx.getFetchCsrRowsSect5121InCtx());/*5121-FETCH-CSR-ROWS-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrRowsSect5121 
      *   This method is derived from 
  *   COBOL Paragraph - 5121-FETCH-CSR-ROWS-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrRowsSect5121OutCtx fetchCsrRowsSect5121(FetchCsrRowsSect5121InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5121-Fetch-csr-rows-sect                                    *
// *81                                                              *
// *81  business function: fetch cursor rows                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 5120-fetch-csr-init-fil5-sect                   *
// *82  calls     : 4500-proc-fetched-rows-sect                     *
// *82            : 9100-database-error-sect                        *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
FetchCsrRowsSect5121OutCtx methodOut = methodIn.getFetchCsrRowsSect5121OutCtx();
//  FETCH NEXT ROWSET FROM CSR-INIT-FIL5 FOR ? ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d5427dt1Repository.fetchCsrInitFil5D5427dt1(programCtx.getCsrInitFil5ResultSet(),methodOut.getHvaClmHistArray(),methodIn.getWork(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  (( methodOut.isSqlcodeOk()  ) || ( methodOut.isSqlcodeFetchEnd()  )) { 
//  PERFORM 4500-PROC-FETCHED-ROWS-SECT
              procFetchedRowsSect(programCtx.getProcFetchedRowsSectInCtx());/*4500-PROC-FETCHED-ROWS-SECT SECTION*/
          }
          else   { 
//  MOVE '5121-FET' TO DB2-PARAGRAPH
//  LITERAL_5121_MN_FET = '5121-FET'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_5121_MN_FET);
//  MOVE 'FETCH  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_FETCH_B5_);
//  MOVE 'CSR-INIT-FIL5' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFIL5_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsrInitFil5Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5130-CLOSE-CSR-INIT-FIL5-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public CloseCsrInitFil5SectOutCtx closeCsrInitFil5Sect(CloseCsrInitFil5SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5130-Close-csr-init-fil5-sect                               *
// *81                                                              *
// *81  business function: close the claim list cursor              *
// *82***************************************************************
// *82  called by : 5100-proc-csr-init-fil5-sect
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
CloseCsrInitFil5SectOutCtx methodOut = methodIn.getCloseCsrInitFil5SectOutCtx();
//  CLOSE CSR-INIT-FIL5
          d5427dt1Repository.closeCsrInitFil5D5427dt1(programCtx.getCsrInitFil5ResultSet(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = +0 OR SQLCODE = -501
//  ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != -501 )) { 
//  MOVE '5130-CLO' TO DB2-PARAGRAPH
//  LITERAL_5130_MN_CLO = '5130-CLO'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_5130_MN_CLO);
//  MOVE 'CLOSE  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_CLOSE_B5_);
//  MOVE 'CSR-INIT-FIL5' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFIL5_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * procCsrNextFil5Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5200-PROC-CSR-NEXT-FIL5-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * @throws CFException
      */
      @Override
      public ProcCsrNextFil5SectOutCtx procCsrNextFil5Sect(ProcCsrNextFil5SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5200-Proc-csr-next-fil5-sect                                *
// *81                                                              *
// *81  business function: declare and open next-fil5 cursor        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4000-search-member-plus-sect                    *
// *82  calls     : 5210-open-csr-next-fil5-sect
// *82            : 5220-fetch-csr-next-fil5-sect
// *82            : 5230-close-csr-next-fil5-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcCsrNextFil5SectOutCtx methodOut = methodIn.getProcCsrNextFil5SectOutCtx();
//  PERFORM 5210-OPEN-CSR-NEXT-FIL5-SECT
          openCsrNextFil5Sect(programCtx.getOpenCsrNextFil5SectInCtx());/*5210-OPEN-CSR-NEXT-FIL5-SECT SECTION*/
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
              methodOut.setClmHstEndOfFetchNoTrue(); 
              
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
              while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodIn.isDt1RspOk()  )) {
//  PERFORM 5220-FETCH-CSR-NEXT-FIL5-SECT
                  fetchCsrNextFil5Sect(programCtx);/*5220-FETCH-CSR-NEXT-FIL5-SECT SECTION*/
              }
          }
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  PERFORM 5230-CLOSE-CSR-NEXT-FIL5-SECT
              closeCsrNextFil5Sect(programCtx.getCloseCsrNextFil5SectInCtx());/*5230-CLOSE-CSR-NEXT-FIL5-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * openCsrNextFil5Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5210-OPEN-CSR-NEXT-FIL5-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dderefPolNbr                   COBOL Name: DDEREF-POL-NBR
      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dderefEeId                     COBOL Name: DDEREF-EE-ID
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dderefDepnNbr                  COBOL Name: DDEREF-DEPN-NBR
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - nextKey                        COBOL Name: NEXT-KEY
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - nextProcDt                     COBOL Name: NEXT-PROC-DT
      * - dderefProcDt                   COBOL Name: DDEREF-PROC-DT
      * - nextProcTm                     COBOL Name: NEXT-PROC-TM
      * - dderefProcTm                   COBOL Name: DDEREF-PROC-TM
      * - nextPgmIdLstCharVal            COBOL Name: NEXT-PGM-ID-LST-CHAR-VAL
      * - dderefPgmIdLstCharVal          COBOL Name: DDEREF-PGM-ID-LST-CHAR-VAL
      * - nextIcnSufxVersNbr             COBOL Name: NEXT-ICN-SUFX-VERS-NBR
      * - dderefIcnSufxVersNbr           COBOL Name: DDEREF-ICN-SUFX-VERS-NBR
      * - nextInvnCtlNbr                 COBOL Name: NEXT-INVN-CTL-NBR
      * - dderefInvnCtlNbr               COBOL Name: DDEREF-INVN-CTL-NBR
      * - nextIcnSufxCd                  COBOL Name: NEXT-ICN-SUFX-CD
      * - dderefIcnSufxCd                COBOL Name: DDEREF-ICN-SUFX-CD
      * - nextLnId                       COBOL Name: NEXT-LN-ID
      * - dderefLnId                     COBOL Name: DDEREF-LN-ID
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public OpenCsrNextFil5SectOutCtx openCsrNextFil5Sect(OpenCsrNextFil5SectInCtx methodIn) throws Exception {
      
// *81  5210-Open-csr-next-fil5-sect                                *
// *81                                                              *
// *81  business function: declare and open csr-next-fil5           *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 5200-proc-csr-next-fil5-sect                    *
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
OpenCsrNextFil5SectOutCtx methodOut = methodIn.getOpenCsrNextFil5SectOutCtx();
//  MOVE DT1-REQ-POLICY TO DDEREF-POL-NBR
          methodOut.setDderefPolNbr(methodOut.getDt1ReqPolicy());
//  MOVE DT1-REQ-EMPID TO DDEREF-EE-ID
          methodOut.setDderefEeId(methodOut.getDt1ReqEmpid());
//  MOVE DT1-REQ-DEP-NBR (2 : 2) TO DDEREF-DEPN-NBR (1 : 2)
          methodOut.setDderefDepnNbr(replace(methodOut.getDderefDepnNbr(),String.valueOf(substring(methodOut.getDt1ReqDepNbrString(),1,3)).toCharArray(),0,2));
//  IF DDEREF-DEPN-NBR = 99
//  LITERAL_99 = 99
          if (compareChars(methodOut.getDderefDepnNbr(),CONSTANTS.LITERAL_99) == 0) { 
//  MOVE ZERO TO DDEREF-DEPN-NBR
              methodOut.setDderefDepnNbr(CONSTANTS.ZERO_2);
          }
//  MOVE DT1-REQ-NEXT-KEY TO NEXT-KEY
          methodOut.getNextKey().setString(methodOut.getDt1ReqNextKey());
//  MOVE NEXT-PROC-DT TO DDEREF-PROC-DT
          methodOut.setDderefProcDt(methodOut.getNextProcDt());
//  MOVE NEXT-PROC-TM TO DDEREF-PROC-TM
          methodOut.setDderefProcTm(methodOut.getNextProcTm());
//  MOVE NEXT-PGM-ID-LST-CHAR-VAL TO DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setDderefPgmIdLstCharVal(methodOut.getNextPgmIdLstCharVal());
//  MOVE NEXT-ICN-SUFX-VERS-NBR TO DDEREF-ICN-SUFX-VERS-NBR
          methodOut.setDderefIcnSufxVersNbr((short) methodOut.getNextIcnSufxVersNbr());
//  MOVE NEXT-INVN-CTL-NBR TO DDEREF-INVN-CTL-NBR
          methodOut.setDderefInvnCtlNbr(methodOut.getNextInvnCtlNbr());
//  MOVE NEXT-ICN-SUFX-CD TO DDEREF-ICN-SUFX-CD
          methodOut.setDderefIcnSufxCd(methodOut.getNextIcnSufxCd());
//  MOVE NEXT-LN-ID TO DDEREF-LN-ID
          methodOut.setDderefLnId((short) methodOut.getNextLnId());
//  WITH CLM_HST_TABLE ( PARTN_ID , PARTN_VAL , PROC_DT , PROC_TM , ICN_SUFX_VERS_NBR , INVN_CTL_NBR , ICN_SUFX_CD , AUTH_SRC_ID , AUTH_PROC_CD , PROV_NM , PROV_EOB_NM , PROV_PRDCT_CD , PROV_MKT_TYP_CD , PROV_IPA_ID , TPSM_CD , PROV_SPCL_CD ) AS ( SELECT DISTINCT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , LNE.AUTH_SRC_ID , LNE.AUTH_PROC_CD , PRV.PROV_NM , PRV.PROV_EOB_NM , PRV.PROV_PRDCT_CD , PRV.PROV_MKT_TYP_CD , PRV.PROV_IPA_ID , PRV.TPSM_CD , PRV.PROV_SPCL_CD FROM ADJD_CLMHST_DENORM_REF REF INNER JOIN ADJD_CLMSF_LN LNE ON REF.PARTN_ID = LNE.PARTN_ID AND REF.PARTN_VAL = LNE.PARTN_VAL AND REF.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND REF.PROC_DT = LNE.PROC_DT AND REF.PROC_TM = LNE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND REF.LN_ID = LNE.LN_ID INNER JOIN ADJD_CLMSF_ORIGHDR ORG ON ORG.PARTN_ID = LNE.PARTN_ID AND ORG.PARTN_VAL = LNE.PARTN_VAL AND ORG.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND ORG.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND ORG.PROC_DT = LNE.PROC_DT AND ORG.PROC_TM = LNE.PROC_TM AND ORG.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND ORG.LN_CORR_ID = LNE.ORIG_LN_CORR_ID INNER JOIN ADJD_CLMSF_PROV PRV ON REF.PARTN_ID = PRV.PARTN_ID AND REF.PARTN_VAL = PRV.PARTN_VAL AND REF.INVN_CTL_NBR = PRV.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PRV.ICN_SUFX_CD AND REF.PROC_DT = PRV.PROC_DT AND REF.PROC_TM = PRV.PROC_TM AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR AND REF.PROV_SCRN_NBR = PRV.PROV_SEQ_NBR WHERE REF.POL_NBR = ? AND REF.EE_ID = ? AND REF.DEPN_NBR = ? AND ? >= REF.FST_DT AND ? <= REF.LST_SRVC_DT AND SUBSTR ( REF.PROV_TINSUFF , 2 , 9 ) BETWEEN ? AND ? AND REF.RMRK_CD BETWEEN ? AND ? AND SUBSTR ( REF.CAUS_CD , 1 , 1 ) BETWEEN ? AND ? AND ( ORG.UB92_RVNU_CD BETWEEN ? AND ? ) AND ( ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR = ? AND REF.ICN_SUFX_CD = ? AND REF.LN_ID <= ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR = ? AND REF.ICN_SUFX_CD < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM < ? ) OR ( REF.PROC_DT < ? ) ) ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC FETCH FIRST 500 ROWS ONLY ) SELECT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.PGM_ID_LST_CHAR_VAL , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , REF.LN_ID , REF.FLN_JULIAN_DT_NBR , REF.FLN_SRL_NBR , REF.DFT_NBR , REF.FST_DT , REF.LST_SRVC_DT , REF.PROV_TINSUFF , REF.PROV_SCRN_NBR , REF.CHRG_AMT , REF.RMRK_CD , REF.NC_AMT , REF.PMT_SVC_CD , REF.OVR_CD , REF.COPAY_AMT , REF.SRVC_CD , REF.PAY_CD , REF.TRANS_CD , HDR.FILM_OFC_NBR , HDR.CLM_LVL_RSN_CD , HDR.ADJTR_ID , HDR.MBR_PRV_IND , HDR.NTFY_WAIV_CD , HDR.BANK_CD , HDR.DIV_NBR , HDR.CLS_NBR , HDR.DRG_NBR , HDR.FACL_OR_PROF_CD , BKE.DLGT_ENTY_CD , BK2.NDB_CONTR_ID , BK2.CLM_SMB_TYP_APP_CD , BK2.SMB_ST_CD , DLN.PROC_T1_IND , DLN.AUTH_NBR , DLN.BASE_DED_DESC_TXT , DLN.MM_DED_DESC_TXT , DLN.PRS_CREAT_SRC_CD , DLN.BASE_DED_AMT , DLN.BASE_AMT , DLN.MM_DED_AMT , DLN.MM_AMT , DLN.MC_CR_RES_AMT , DLN.COB_CR_RES_AMT , DLN.PAR_IND , DLN.SUP_AMT , DLN.PROV_MKT_NBR , DLN.PPO_CD , DLN.PTNT_RESP_AMT , HST.AUTH_SRC_ID , HST.AUTH_PROC_CD , HST.PROV_NM , HST.PROV_EOB_NM , HST.PROV_PRDCT_CD , HST.PROV_MKT_TYP_CD , HST.PROV_IPA_ID , HST.TPSM_CD , HST.PROV_SPCL_CD , IFNULL ( ( SELECT PR1.PROV_MEDCD_RECLM_IND FROM ADJD_CLMSF_PROV PR1 WHERE REF.PARTN_ID = PR1.PARTN_ID AND REF.PARTN_VAL = PR1.PARTN_VAL AND REF.INVN_CTL_NBR = PR1.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PR1.ICN_SUFX_CD AND REF.PROC_DT = PR1.PROC_DT AND REF.PROC_TM = PR1.PROC_TM AND PR1.PROV_MEDCD_RECLM_IND = 'Y' ORDER BY LST_UPDT_DTTM DESC FETCH FIRST 1 ROW ONLY ) , ' ' ) , IFNULL ( ( SELECT REL.REL_SRVC_CLM_LVL_IND FROM ADJD_CLMSFLN_REL_SRVCS REL WHERE REF.PARTN_ID = REL.PARTN_ID AND REF.PARTN_VAL = REL.PARTN_VAL AND REF.INVN_CTL_NBR = REL.INVN_CTL_NBR AND REF.ICN_SUFX_CD = REL.ICN_SUFX_CD AND REF.PROC_DT = REL.PROC_DT AND REF.PROC_TM = REL.PROC_TM AND REF.ICN_SUFX_VERS_NBR = REL.ICN_SUFX_VERS_NBR AND REF.LN_ID = REL.LN_ID FETCH FIRST 1 ROWS ONLY ) , ' ' ) , IFNULL ( DIA.DIAG_CD , '       ' ) , ( SELECT COUNT ( DISTINCT AUTH_NBR ) FROM ADJD_CLMHST_DENORM_LN DLN2 WHERE REF.PARTN_ID = DLN2.PARTN_ID AND REF.PARTN_VAL = DLN2.PARTN_VAL AND REF.INVN_CTL_NBR = DLN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN2.ICN_SUFX_CD AND REF.PROC_DT = DLN2.PROC_DT AND REF.PROC_TM = DLN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR AND ' ' < DLN2.AUTH_NBR ) , ( SELECT SUM ( PHYS_MEDCN_MSK_CNT ) FROM ADJD_CLMSF_LN2 LN2 WHERE REF.PARTN_ID = LN2.PARTN_ID AND REF.PARTN_VAL = LN2.PARTN_VAL AND REF.INVN_CTL_NBR = LN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LN2.ICN_SUFX_CD AND REF.PROC_DT = LN2.PROC_DT AND REF.PROC_TM = LN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR ) FROM CLM_HST_TABLE HST INNER JOIN ADJD_CLMHST_DENORM_REF REF ON REF.PARTN_ID = HST.PARTN_ID AND REF.PARTN_VAL = HST.PARTN_VAL AND REF.PROC_DT = HST.PROC_DT AND REF.PROC_TM = HST.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR AND REF.INVN_CTL_NBR = HST.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HST.ICN_SUFX_CD INNER JOIN ADJD_CLMHST_DENORM_HDR HDR ON REF.PARTN_ID = HDR.PARTN_ID AND REF.PARTN_VAL = HDR.PARTN_VAL AND REF.INVN_CTL_NBR = HDR.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HDR.ICN_SUFX_CD AND REF.PROC_DT = HDR.PROC_DT AND REF.PROC_TM = HDR.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E BKE ON REF.PARTN_ID = BKE.PARTN_ID AND REF.PARTN_VAL = BKE.PARTN_VAL AND REF.INVN_CTL_NBR = BKE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BKE.ICN_SUFX_CD AND REF.PROC_DT = BKE.PROC_DT AND REF.PROC_TM = BKE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E2 BK2 ON REF.PARTN_ID = BK2.PARTN_ID AND REF.PARTN_VAL = BK2.PARTN_VAL AND REF.INVN_CTL_NBR = BK2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BK2.ICN_SUFX_CD AND REF.PROC_DT = BK2.PROC_DT AND REF.PROC_TM = BK2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMHST_DENORM_LN DLN ON REF.PARTN_ID = DLN.PARTN_ID AND REF.PARTN_VAL = DLN.PARTN_VAL AND REF.INVN_CTL_NBR = DLN.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN.ICN_SUFX_CD AND REF.PROC_DT = DLN.PROC_DT AND REF.PROC_TM = DLN.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR AND REF.LN_ID = DLN.LN_ID LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA ON REF.PARTN_ID = DIA.PARTN_ID AND REF.PARTN_VAL = DIA.PARTN_VAL AND REF.INVN_CTL_NBR = DIA.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DIA.ICN_SUFX_CD AND REF.PROC_DT = DIA.PROC_DT AND REF.PROC_TM = DIA.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR AND 1 = DIA.DIAG_SEQ_NBR ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.PGM_ID_LST_CHAR_VAL DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC , REF.LN_ID DESC OPTIMIZE FOR 600 ROWS FETCH FIRST 600 ROWS ONLY WITH UR
          programCtx.setCsrNextFil5ResultSet(d5427dt1Repository.openCsrNextFil5D5427dt1(methodOut.getDcladjdClmhstDenormRef(),methodIn.getHostVariables(),programCtx.getSqlca()));
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = ZERO
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '5210-OPE' TO DB2-PARAGRAPH
//  LITERAL_5210_MN_OPE = '5210-OPE'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_5210_MN_OPE);
//  MOVE 'OPEN   ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_OPEN_B6_);
//  MOVE 'CSR-NEXT-FIL5' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFIL5_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrNextFil5Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5220-FETCH-CSR-NEXT-FIL5-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrNextFil5SectOutCtx fetchCsrNextFil5Sect(D5427dt1Ctx programCtx) throws Exception {
      
// *81***************************************************************
// *81  5220-Fetch-csr-next-fil5-sect                               *
// *81                                                              *
// *81  business function: fetch claim lines                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 5200-proc-csr-next-fil5-sect                    *
// *82  calls     : 5221-fetch-csr-rows-sect                        *
// *82***************************************************************
// *================================================================
FetchCsrNextFil5SectOutCtx methodOut = programCtx.getFetchCsrNextFil5SectOutCtx();
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
          methodOut.setClmHstEndOfFetchNoTrue(); 
          
//  SET DT1-RSP-OK TO TRUE
          methodOut.setDt1RspOkTrue(); 
          
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
          while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodOut.isDt1RspOk()  )) {
//  PERFORM 5221-FETCH-CSR-ROWS-SECT
              fetchCsrRowsSect5221(programCtx.getFetchCsrRowsSect5221InCtx());/*5221-FETCH-CSR-ROWS-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrRowsSect5221 
      *   This method is derived from 
  *   COBOL Paragraph - 5221-FETCH-CSR-ROWS-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrRowsSect5221OutCtx fetchCsrRowsSect5221(FetchCsrRowsSect5221InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5221-Fetch-csr-rows-sect                                    *
// *81                                                              *
// *81  business function: fetch cursor rows                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 5220-fetch-csr-next-fil5-sect                   *
// *82  calls     : 4500-proc-fetched-rows-sect                     *
// *82            : 9100-database-error-sect                        *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
FetchCsrRowsSect5221OutCtx methodOut = methodIn.getFetchCsrRowsSect5221OutCtx();
//  FETCH NEXT ROWSET FROM CSR-NEXT-FIL5 FOR ? ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d5427dt1Repository.fetchCsrNextFil5D5427dt1(programCtx.getCsrNextFil5ResultSet(),methodOut.getHvaClmHistArray(),methodIn.getWork(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  (( methodOut.isSqlcodeOk()  ) || ( methodOut.isSqlcodeFetchEnd()  )) { 
//  PERFORM 4500-PROC-FETCHED-ROWS-SECT
              procFetchedRowsSect(programCtx.getProcFetchedRowsSectInCtx());/*4500-PROC-FETCHED-ROWS-SECT SECTION*/
          }
          else   { 
//  MOVE '5221-FET' TO DB2-PARAGRAPH
//  LITERAL_5221_MN_FET = '5221-FET'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_5221_MN_FET);
//  MOVE 'FETCH  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_FETCH_B5_);
//  MOVE 'CSR-NEXT-FIL5' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFIL5_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsrNextFil5Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5230-CLOSE-CSR-NEXT-FIL5-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public CloseCsrNextFil5SectOutCtx closeCsrNextFil5Sect(CloseCsrNextFil5SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5230-Close-csr-next-fil5-sect                               *
// *81                                                              *
// *81  business function: close the claim list cursor              *
// *82***************************************************************
// *82  called by : 5200-proc-csr-next-fil5-sect
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
CloseCsrNextFil5SectOutCtx methodOut = methodIn.getCloseCsrNextFil5SectOutCtx();
//  CLOSE CSR-NEXT-FIL5
          d5427dt1Repository.closeCsrNextFil5D5427dt1(programCtx.getCsrNextFil5ResultSet(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = +0 OR SQLCODE = -501
//  ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != -501 )) { 
//  MOVE '5230-CLO' TO DB2-PARAGRAPH
//  LITERAL_5230_MN_CLO = '5230-CLO'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_5230_MN_CLO);
//  MOVE 'CLOSE  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_CLOSE_B5_);
//  MOVE 'CSR-NEXT-FIL5' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFIL5_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * procCsrInitFil6Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5300-PROC-CSR-INIT-FIL6-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * @throws CFException
      */
      @Override
      public ProcCsrInitFil6SectOutCtx procCsrInitFil6Sect(ProcCsrInitFil6SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5300-Proc-csr-init-fil6-sect                                *
// *81                                                              *
// *81  business function: declare and open init-fil6 cursor        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4000-search-member-plus-sect                    *
// *82  calls     : 5310-open-csr-init-fil6-sect
// *82            : 5320-fetch-csr-init-fil6-sect
// *82            : 5330-close-csr-init-fil6-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcCsrInitFil6SectOutCtx methodOut = methodIn.getProcCsrInitFil6SectOutCtx();
//  PERFORM 5310-OPEN-CSR-INIT-FIL6-SECT
          openCsrInitFil6Sect(programCtx.getOpenCsrInitFil6SectInCtx());/*5310-OPEN-CSR-INIT-FIL6-SECT SECTION*/
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
              methodOut.setClmHstEndOfFetchNoTrue(); 
              
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
              while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodIn.isDt1RspOk()  )) {
//  PERFORM 5320-FETCH-CSR-INIT-FIL6-SECT
                  fetchCsrInitFil6Sect(programCtx);/*5320-FETCH-CSR-INIT-FIL6-SECT SECTION*/
              }
          }
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  PERFORM 5330-CLOSE-CSR-INIT-FIL6-SECT
              closeCsrInitFil6Sect(programCtx.getCloseCsrInitFil6SectInCtx());/*5330-CLOSE-CSR-INIT-FIL6-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * openCsrInitFil6Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5310-OPEN-CSR-INIT-FIL6-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dderefPolNbr                   COBOL Name: DDEREF-POL-NBR
      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dderefEeId                     COBOL Name: DDEREF-EE-ID
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dderefDepnNbr                  COBOL Name: DDEREF-DEPN-NBR
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public OpenCsrInitFil6SectOutCtx openCsrInitFil6Sect(OpenCsrInitFil6SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5310-Open-csr-init-fil6-sect                                *
// *81                                                              *
// *81  business function: declare and open csr-init-fil6           *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 5300-proc-csr-init-fil6-sect                    *
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
OpenCsrInitFil6SectOutCtx methodOut = methodIn.getOpenCsrInitFil6SectOutCtx();
//  MOVE DT1-REQ-POLICY TO DDEREF-POL-NBR
          methodOut.setDderefPolNbr(methodOut.getDt1ReqPolicy());
//  MOVE DT1-REQ-EMPID TO DDEREF-EE-ID
          methodOut.setDderefEeId(methodOut.getDt1ReqEmpid());
//  MOVE DT1-REQ-DEP-NBR (2 : 2) TO DDEREF-DEPN-NBR (1 : 2)
          methodOut.setDderefDepnNbr(replace(methodOut.getDderefDepnNbr(),String.valueOf(substring(methodOut.getDt1ReqDepNbrString(),1,3)).toCharArray(),0,2));
//  IF DDEREF-DEPN-NBR = 99
//  LITERAL_99 = 99
          if (compareChars(methodOut.getDderefDepnNbr(),CONSTANTS.LITERAL_99) == 0) { 
//  MOVE ZERO TO DDEREF-DEPN-NBR
              methodOut.setDderefDepnNbr(CONSTANTS.ZERO_2);
          }
//  WITH CLM_HST_TABLE ( PARTN_ID , PARTN_VAL , PROC_DT , PROC_TM , ICN_SUFX_VERS_NBR , INVN_CTL_NBR , ICN_SUFX_CD , AUTH_SRC_ID , AUTH_PROC_CD , PROV_NM , PROV_EOB_NM , PROV_PRDCT_CD , PROV_MKT_TYP_CD , PROV_IPA_ID , TPSM_CD , PROV_SPCL_CD ) AS ( SELECT DISTINCT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , LNE.AUTH_SRC_ID , LNE.AUTH_PROC_CD , PRV.PROV_NM , PRV.PROV_EOB_NM , PRV.PROV_PRDCT_CD , PRV.PROV_MKT_TYP_CD , PRV.PROV_IPA_ID , PRV.TPSM_CD , PRV.PROV_SPCL_CD FROM ADJD_CLMHST_DENORM_REF REF INNER JOIN ADJD_CLMSF_LN LNE ON REF.PARTN_ID = LNE.PARTN_ID AND REF.PARTN_VAL = LNE.PARTN_VAL AND REF.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND REF.PROC_DT = LNE.PROC_DT AND REF.PROC_TM = LNE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND REF.LN_ID = LNE.LN_ID INNER JOIN ADJD_CLMSF_PROV PRV ON REF.PARTN_ID = PRV.PARTN_ID AND REF.PARTN_VAL = PRV.PARTN_VAL AND REF.INVN_CTL_NBR = PRV.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PRV.ICN_SUFX_CD AND REF.PROC_DT = PRV.PROC_DT AND REF.PROC_TM = PRV.PROC_TM AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR AND REF.PROV_SCRN_NBR = PRV.PROV_SEQ_NBR WHERE REF.POL_NBR = ? AND REF.EE_ID = ? AND REF.DEPN_NBR = ? AND ? >= REF.FST_DT AND ? <= REF.LST_SRVC_DT AND SUBSTR ( REF.PROV_TINSUFF , 2 , 9 ) BETWEEN ? AND ? AND REF.RMRK_CD BETWEEN ? AND ? AND SUBSTR ( REF.CAUS_CD , 1 , 1 ) BETWEEN ? AND ? AND ( LNE.ORIG_PROC_CD BETWEEN ? AND ? OR LNE.PMT_SVC_CD BETWEEN ? AND ? ) ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC FETCH FIRST 500 ROWS ONLY ) SELECT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.PGM_ID_LST_CHAR_VAL , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , REF.LN_ID , REF.FLN_JULIAN_DT_NBR , REF.FLN_SRL_NBR , REF.DFT_NBR , REF.FST_DT , REF.LST_SRVC_DT , REF.PROV_TINSUFF , REF.PROV_SCRN_NBR , REF.CHRG_AMT , REF.RMRK_CD , REF.NC_AMT , REF.PMT_SVC_CD , REF.OVR_CD , REF.COPAY_AMT , REF.SRVC_CD , REF.PAY_CD , REF.TRANS_CD , HDR.FILM_OFC_NBR , HDR.CLM_LVL_RSN_CD , HDR.ADJTR_ID , HDR.MBR_PRV_IND , HDR.NTFY_WAIV_CD , HDR.BANK_CD , HDR.DIV_NBR , HDR.CLS_NBR , HDR.DRG_NBR , HDR.FACL_OR_PROF_CD , BKE.DLGT_ENTY_CD , BK2.NDB_CONTR_ID , BK2.CLM_SMB_TYP_APP_CD , BK2.SMB_ST_CD , DLN.PROC_T1_IND , DLN.AUTH_NBR , DLN.BASE_DED_DESC_TXT , DLN.MM_DED_DESC_TXT , DLN.PRS_CREAT_SRC_CD , DLN.BASE_DED_AMT , DLN.BASE_AMT , DLN.MM_DED_AMT , DLN.MM_AMT , DLN.MC_CR_RES_AMT , DLN.COB_CR_RES_AMT , DLN.PAR_IND , DLN.SUP_AMT , DLN.PROV_MKT_NBR , DLN.PPO_CD , DLN.PTNT_RESP_AMT , HST.AUTH_SRC_ID , HST.AUTH_PROC_CD , HST.PROV_NM , HST.PROV_EOB_NM , HST.PROV_PRDCT_CD , HST.PROV_MKT_TYP_CD , HST.PROV_IPA_ID , HST.TPSM_CD , HST.PROV_SPCL_CD , IFNULL ( ( SELECT PR1.PROV_MEDCD_RECLM_IND FROM ADJD_CLMSF_PROV PR1 WHERE REF.PARTN_ID = PR1.PARTN_ID AND REF.PARTN_VAL = PR1.PARTN_VAL AND REF.INVN_CTL_NBR = PR1.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PR1.ICN_SUFX_CD AND REF.PROC_DT = PR1.PROC_DT AND REF.PROC_TM = PR1.PROC_TM AND PR1.PROV_MEDCD_RECLM_IND = 'Y' ORDER BY LST_UPDT_DTTM DESC FETCH FIRST 1 ROW ONLY ) , ' ' ) , IFNULL ( ( SELECT REL.REL_SRVC_CLM_LVL_IND FROM ADJD_CLMSFLN_REL_SRVCS REL WHERE REF.PARTN_ID = REL.PARTN_ID AND REF.PARTN_VAL = REL.PARTN_VAL AND REF.INVN_CTL_NBR = REL.INVN_CTL_NBR AND REF.ICN_SUFX_CD = REL.ICN_SUFX_CD AND REF.PROC_DT = REL.PROC_DT AND REF.PROC_TM = REL.PROC_TM AND REF.ICN_SUFX_VERS_NBR = REL.ICN_SUFX_VERS_NBR AND REF.LN_ID = REL.LN_ID FETCH FIRST 1 ROWS ONLY ) , ' ' ) , IFNULL ( DIA.DIAG_CD , '       ' ) , ( SELECT COUNT ( DISTINCT AUTH_NBR ) FROM ADJD_CLMHST_DENORM_LN DLN2 WHERE REF.PARTN_ID = DLN2.PARTN_ID AND REF.PARTN_VAL = DLN2.PARTN_VAL AND REF.INVN_CTL_NBR = DLN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN2.ICN_SUFX_CD AND REF.PROC_DT = DLN2.PROC_DT AND REF.PROC_TM = DLN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR AND ' ' < DLN2.AUTH_NBR ) , ( SELECT SUM ( PHYS_MEDCN_MSK_CNT ) FROM ADJD_CLMSF_LN2 LN2 WHERE REF.PARTN_ID = LN2.PARTN_ID AND REF.PARTN_VAL = LN2.PARTN_VAL AND REF.INVN_CTL_NBR = LN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LN2.ICN_SUFX_CD AND REF.PROC_DT = LN2.PROC_DT AND REF.PROC_TM = LN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR ) FROM CLM_HST_TABLE HST INNER JOIN ADJD_CLMHST_DENORM_REF REF ON REF.PARTN_ID = HST.PARTN_ID AND REF.PARTN_VAL = HST.PARTN_VAL AND REF.PROC_DT = HST.PROC_DT AND REF.PROC_TM = HST.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR AND REF.INVN_CTL_NBR = HST.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HST.ICN_SUFX_CD INNER JOIN ADJD_CLMHST_DENORM_HDR HDR ON REF.PARTN_ID = HDR.PARTN_ID AND REF.PARTN_VAL = HDR.PARTN_VAL AND REF.INVN_CTL_NBR = HDR.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HDR.ICN_SUFX_CD AND REF.PROC_DT = HDR.PROC_DT AND REF.PROC_TM = HDR.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E BKE ON REF.PARTN_ID = BKE.PARTN_ID AND REF.PARTN_VAL = BKE.PARTN_VAL AND REF.INVN_CTL_NBR = BKE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BKE.ICN_SUFX_CD AND REF.PROC_DT = BKE.PROC_DT AND REF.PROC_TM = BKE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E2 BK2 ON REF.PARTN_ID = BK2.PARTN_ID AND REF.PARTN_VAL = BK2.PARTN_VAL AND REF.INVN_CTL_NBR = BK2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BK2.ICN_SUFX_CD AND REF.PROC_DT = BK2.PROC_DT AND REF.PROC_TM = BK2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMHST_DENORM_LN DLN ON REF.PARTN_ID = DLN.PARTN_ID AND REF.PARTN_VAL = DLN.PARTN_VAL AND REF.INVN_CTL_NBR = DLN.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN.ICN_SUFX_CD AND REF.PROC_DT = DLN.PROC_DT AND REF.PROC_TM = DLN.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR AND REF.LN_ID = DLN.LN_ID LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA ON REF.PARTN_ID = DIA.PARTN_ID AND REF.PARTN_VAL = DIA.PARTN_VAL AND REF.INVN_CTL_NBR = DIA.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DIA.ICN_SUFX_CD AND REF.PROC_DT = DIA.PROC_DT AND REF.PROC_TM = DIA.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR AND 1 = DIA.DIAG_SEQ_NBR ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.PGM_ID_LST_CHAR_VAL DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC , REF.LN_ID DESC OPTIMIZE FOR 600 ROWS FETCH FIRST 600 ROWS ONLY WITH UR
          programCtx.setCsrInitFil6ResultSet(d5427dt1Repository.openCsrInitFil6D5427dt1(methodOut.getDcladjdClmhstDenormRef(),methodIn.getHostVariables(),programCtx.getSqlca()));
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = ZERO
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '5310-OPE' TO DB2-PARAGRAPH
//  LITERAL_5310_MN_OPE = '5310-OPE'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_5310_MN_OPE);
//  MOVE 'OPEN   ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_OPEN_B6_);
//  MOVE 'CSR-INIT-FIL6' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFIL6_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrInitFil6Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5320-FETCH-CSR-INIT-FIL6-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrInitFil6SectOutCtx fetchCsrInitFil6Sect(D5427dt1Ctx programCtx) throws Exception {
      
// *81***************************************************************
// *81  5320-Fetch-csr-init-fil6-sect                               *
// *81                                                              *
// *81  business function: fetch claim lines                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 5300-proc-csr-init-fil6-sect                    *
// *82  calls     : 5321-fetch-csr-rows-sect                        *
// *82***************************************************************
// *================================================================
FetchCsrInitFil6SectOutCtx methodOut = programCtx.getFetchCsrInitFil6SectOutCtx();
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
          methodOut.setClmHstEndOfFetchNoTrue(); 
          
//  SET DT1-RSP-OK TO TRUE
          methodOut.setDt1RspOkTrue(); 
          
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
          while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodOut.isDt1RspOk()  )) {
//  PERFORM 5321-FETCH-CSR-ROWS-SECT
              fetchCsrRowsSect5321(programCtx.getFetchCsrRowsSect5321InCtx());/*5321-FETCH-CSR-ROWS-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrRowsSect5321 
      *   This method is derived from 
  *   COBOL Paragraph - 5321-FETCH-CSR-ROWS-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrRowsSect5321OutCtx fetchCsrRowsSect5321(FetchCsrRowsSect5321InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5321-Fetch-csr-rows-sect                                    *
// *81                                                              *
// *81  business function: fetch cursor rows                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 5320-fetch-csr-init-fil6-sect                   *
// *82  calls     : 4500-proc-fetched-rows-sect                     *
// *82            : 9100-database-error-sect                        *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
FetchCsrRowsSect5321OutCtx methodOut = methodIn.getFetchCsrRowsSect5321OutCtx();
//  FETCH NEXT ROWSET FROM CSR-INIT-FIL6 FOR ? ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d5427dt1Repository.fetchCsrInitFil6D5427dt1(programCtx.getCsrInitFil6ResultSet(),methodOut.getHvaClmHistArray(),methodIn.getWork(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  (( methodOut.isSqlcodeOk()  ) || ( methodOut.isSqlcodeFetchEnd()  )) { 
//  PERFORM 4500-PROC-FETCHED-ROWS-SECT
              procFetchedRowsSect(programCtx.getProcFetchedRowsSectInCtx());/*4500-PROC-FETCHED-ROWS-SECT SECTION*/
          }
          else   { 
//  MOVE '5321-FET' TO DB2-PARAGRAPH
//  LITERAL_5321_MN_FET = '5321-FET'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_5321_MN_FET);
//  MOVE 'FETCH  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_FETCH_B5_);
//  MOVE 'CSR-INIT-FIL6' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFIL6_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsrInitFil6Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5330-CLOSE-CSR-INIT-FIL6-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public CloseCsrInitFil6SectOutCtx closeCsrInitFil6Sect(CloseCsrInitFil6SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5330-Close-csr-init-fil6-sect                               *
// *81                                                              *
// *81  business function: close the claim list cursor              *
// *82***************************************************************
// *82  called by : 5300-proc-csr-init-fil6-sect
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
CloseCsrInitFil6SectOutCtx methodOut = methodIn.getCloseCsrInitFil6SectOutCtx();
//  CLOSE CSR-INIT-FIL6
          d5427dt1Repository.closeCsrInitFil6D5427dt1(programCtx.getCsrInitFil6ResultSet(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = +0 OR SQLCODE = -501
//  ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != -501 )) { 
//  MOVE '5330-CLO' TO DB2-PARAGRAPH
//  LITERAL_5330_MN_CLO = '5330-CLO'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_5330_MN_CLO);
//  MOVE 'CLOSE  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_CLOSE_B5_);
//  MOVE 'CSR-INIT-FIL6' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_INITFIL6_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * procCsrNextFil6Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5400-PROC-CSR-NEXT-FIL6-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * @throws CFException
      */
      @Override
      public ProcCsrNextFil6SectOutCtx procCsrNextFil6Sect(ProcCsrNextFil6SectInCtx methodIn) throws Exception {
      
// *81  5400-Proc-csr-next-fil6-sect                                *
// *81                                                              *
// *81  business function: declare and open next-fil6 cursor        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 4000-search-member-plus-sect                    *
// *82  calls     : 5410-open-csr-next-fil6-sect
// *82            : 5420-fetch-csr-next-fil6-sect
// *82            : 5430-close-csr-next-fil6-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcCsrNextFil6SectOutCtx methodOut = methodIn.getProcCsrNextFil6SectOutCtx();
//  PERFORM 5410-OPEN-CSR-NEXT-FIL6-SECT
          openCsrNextFil6Sect(programCtx.getOpenCsrNextFil6SectInCtx());/*5410-OPEN-CSR-NEXT-FIL6-SECT SECTION*/
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
              methodOut.setClmHstEndOfFetchNoTrue(); 
              
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
              while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodIn.isDt1RspOk()  )) {
//  PERFORM 5420-FETCH-CSR-NEXT-FIL6-SECT
                  fetchCsrNextFil6Sect(programCtx);/*5420-FETCH-CSR-NEXT-FIL6-SECT SECTION*/
              }
          }
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  PERFORM 5430-CLOSE-CSR-NEXT-FIL6-SECT
              closeCsrNextFil6Sect(programCtx.getCloseCsrNextFil6SectInCtx());/*5430-CLOSE-CSR-NEXT-FIL6-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * openCsrNextFil6Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5410-OPEN-CSR-NEXT-FIL6-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dderefPolNbr                   COBOL Name: DDEREF-POL-NBR
      * - dt1ReqPolicy                   COBOL Name: DT1-REQ-POLICY
      * - dderefEeId                     COBOL Name: DDEREF-EE-ID
      * - dt1ReqEmpid                    COBOL Name: DT1-REQ-EMPID
      * - dderefDepnNbr                  COBOL Name: DDEREF-DEPN-NBR
      * - dt1ReqDepNbr                   COBOL Name: DT1-REQ-DEP-NBR
      * - nextKey                        COBOL Name: NEXT-KEY
      * - dt1ReqNextKey                  COBOL Name: DT1-REQ-NEXT-KEY
      * - nextProcDt                     COBOL Name: NEXT-PROC-DT
      * - dderefProcDt                   COBOL Name: DDEREF-PROC-DT
      * - nextProcTm                     COBOL Name: NEXT-PROC-TM
      * - dderefProcTm                   COBOL Name: DDEREF-PROC-TM
      * - nextPgmIdLstCharVal            COBOL Name: NEXT-PGM-ID-LST-CHAR-VAL
      * - dderefPgmIdLstCharVal          COBOL Name: DDEREF-PGM-ID-LST-CHAR-VAL
      * - nextIcnSufxVersNbr             COBOL Name: NEXT-ICN-SUFX-VERS-NBR
      * - dderefIcnSufxVersNbr           COBOL Name: DDEREF-ICN-SUFX-VERS-NBR
      * - nextInvnCtlNbr                 COBOL Name: NEXT-INVN-CTL-NBR
      * - dderefInvnCtlNbr               COBOL Name: DDEREF-INVN-CTL-NBR
      * - nextIcnSufxCd                  COBOL Name: NEXT-ICN-SUFX-CD
      * - dderefIcnSufxCd                COBOL Name: DDEREF-ICN-SUFX-CD
      * - nextLnId                       COBOL Name: NEXT-LN-ID
      * - dderefLnId                     COBOL Name: DDEREF-LN-ID
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public OpenCsrNextFil6SectOutCtx openCsrNextFil6Sect(OpenCsrNextFil6SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5010-Open-csr-next-fil6-sect                                *
// *81                                                              *
// *81  business function: declare and open csr-next-fil6           *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 5400-proc-csr-next-fil6-sect                    *
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
OpenCsrNextFil6SectOutCtx methodOut = methodIn.getOpenCsrNextFil6SectOutCtx();
//  MOVE DT1-REQ-POLICY TO DDEREF-POL-NBR
          methodOut.setDderefPolNbr(methodOut.getDt1ReqPolicy());
//  MOVE DT1-REQ-EMPID TO DDEREF-EE-ID
          methodOut.setDderefEeId(methodOut.getDt1ReqEmpid());
//  MOVE DT1-REQ-DEP-NBR (2 : 2) TO DDEREF-DEPN-NBR (1 : 2)
          methodOut.setDderefDepnNbr(replace(methodOut.getDderefDepnNbr(),String.valueOf(substring(methodOut.getDt1ReqDepNbrString(),1,3)).toCharArray(),0,2));
//  IF DDEREF-DEPN-NBR = 99
//  LITERAL_99 = 99
          if (compareChars(methodOut.getDderefDepnNbr(),CONSTANTS.LITERAL_99) == 0) { 
//  MOVE ZERO TO DDEREF-DEPN-NBR
              methodOut.setDderefDepnNbr(CONSTANTS.ZERO_2);
          }
//  MOVE DT1-REQ-NEXT-KEY TO NEXT-KEY
          methodOut.getNextKey().setString(methodOut.getDt1ReqNextKey());
//  MOVE NEXT-PROC-DT TO DDEREF-PROC-DT
          methodOut.setDderefProcDt(methodOut.getNextProcDt());
//  MOVE NEXT-PROC-TM TO DDEREF-PROC-TM
          methodOut.setDderefProcTm(methodOut.getNextProcTm());
//  MOVE NEXT-PGM-ID-LST-CHAR-VAL TO DDEREF-PGM-ID-LST-CHAR-VAL
          methodOut.setDderefPgmIdLstCharVal(methodOut.getNextPgmIdLstCharVal());
//  MOVE NEXT-ICN-SUFX-VERS-NBR TO DDEREF-ICN-SUFX-VERS-NBR
          methodOut.setDderefIcnSufxVersNbr((short) methodOut.getNextIcnSufxVersNbr());
//  MOVE NEXT-INVN-CTL-NBR TO DDEREF-INVN-CTL-NBR
          methodOut.setDderefInvnCtlNbr(methodOut.getNextInvnCtlNbr());
//  MOVE NEXT-ICN-SUFX-CD TO DDEREF-ICN-SUFX-CD
          methodOut.setDderefIcnSufxCd(methodOut.getNextIcnSufxCd());
//  MOVE NEXT-LN-ID TO DDEREF-LN-ID
          methodOut.setDderefLnId((short) methodOut.getNextLnId());
//  WITH CLM_HST_TABLE ( PARTN_ID , PARTN_VAL , PROC_DT , PROC_TM , ICN_SUFX_VERS_NBR , INVN_CTL_NBR , ICN_SUFX_CD , AUTH_SRC_ID , AUTH_PROC_CD , PROV_NM , PROV_EOB_NM , PROV_PRDCT_CD , PROV_MKT_TYP_CD , PROV_IPA_ID , TPSM_CD , PROV_SPCL_CD ) AS ( SELECT DISTINCT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , LNE.AUTH_SRC_ID , LNE.AUTH_PROC_CD , PRV.PROV_NM , PRV.PROV_EOB_NM , PRV.PROV_PRDCT_CD , PRV.PROV_MKT_TYP_CD , PRV.PROV_IPA_ID , PRV.TPSM_CD , PRV.PROV_SPCL_CD FROM ADJD_CLMHST_DENORM_REF REF INNER JOIN ADJD_CLMSF_LN LNE ON REF.PARTN_ID = LNE.PARTN_ID AND REF.PARTN_VAL = LNE.PARTN_VAL AND REF.INVN_CTL_NBR = LNE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LNE.ICN_SUFX_CD AND REF.PROC_DT = LNE.PROC_DT AND REF.PROC_TM = LNE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LNE.ICN_SUFX_VERS_NBR AND REF.LN_ID = LNE.LN_ID INNER JOIN ADJD_CLMSF_PROV PRV ON REF.PARTN_ID = PRV.PARTN_ID AND REF.PARTN_VAL = PRV.PARTN_VAL AND REF.INVN_CTL_NBR = PRV.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PRV.ICN_SUFX_CD AND REF.PROC_DT = PRV.PROC_DT AND REF.PROC_TM = PRV.PROC_TM AND REF.ICN_SUFX_VERS_NBR = PRV.ICN_SUFX_VERS_NBR AND REF.PROV_SCRN_NBR = PRV.PROV_SEQ_NBR WHERE REF.POL_NBR = ? AND REF.EE_ID = ? AND REF.DEPN_NBR = ? AND ? >= REF.FST_DT AND ? <= REF.LST_SRVC_DT AND SUBSTR ( REF.PROV_TINSUFF , 2 , 9 ) BETWEEN ? AND ? AND REF.RMRK_CD BETWEEN ? AND ? AND SUBSTR ( REF.CAUS_CD , 1 , 1 ) BETWEEN ? AND ? AND ( LNE.ORIG_PROC_CD BETWEEN ? AND ? OR LNE.PMT_SVC_CD BETWEEN ? AND ? ) AND ( ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR = ? AND REF.ICN_SUFX_CD = ? AND REF.LN_ID <= ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR = ? AND REF.ICN_SUFX_CD < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR = ? AND REF.INVN_CTL_NBR < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL = ? AND REF.ICN_SUFX_VERS_NBR < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM = ? AND REF.PGM_ID_LST_CHAR_VAL < ? ) OR ( REF.PROC_DT = ? AND REF.PROC_TM < ? ) OR ( REF.PROC_DT < ? ) ) ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC FETCH FIRST 500 ROWS ONLY ) SELECT REF.PARTN_ID , REF.PARTN_VAL , REF.PROC_DT , REF.PROC_TM , REF.PGM_ID_LST_CHAR_VAL , REF.ICN_SUFX_VERS_NBR , REF.INVN_CTL_NBR , REF.ICN_SUFX_CD , REF.LN_ID , REF.FLN_JULIAN_DT_NBR , REF.FLN_SRL_NBR , REF.DFT_NBR , REF.FST_DT , REF.LST_SRVC_DT , REF.PROV_TINSUFF , REF.PROV_SCRN_NBR , REF.CHRG_AMT , REF.RMRK_CD , REF.NC_AMT , REF.PMT_SVC_CD , REF.OVR_CD , REF.COPAY_AMT , REF.SRVC_CD , REF.PAY_CD , REF.TRANS_CD , HDR.FILM_OFC_NBR , HDR.CLM_LVL_RSN_CD , HDR.ADJTR_ID , HDR.MBR_PRV_IND , HDR.NTFY_WAIV_CD , HDR.BANK_CD , HDR.DIV_NBR , HDR.CLS_NBR , HDR.DRG_NBR , HDR.FACL_OR_PROF_CD , BKE.DLGT_ENTY_CD , BK2.NDB_CONTR_ID , BK2.CLM_SMB_TYP_APP_CD , BK2.SMB_ST_CD , DLN.PROC_T1_IND , DLN.AUTH_NBR , DLN.BASE_DED_DESC_TXT , DLN.MM_DED_DESC_TXT , DLN.PRS_CREAT_SRC_CD , DLN.BASE_DED_AMT , DLN.BASE_AMT , DLN.MM_DED_AMT , DLN.MM_AMT , DLN.MC_CR_RES_AMT , DLN.COB_CR_RES_AMT , DLN.PAR_IND , DLN.SUP_AMT , DLN.PROV_MKT_NBR , DLN.PPO_CD , DLN.PTNT_RESP_AMT , HST.AUTH_SRC_ID , HST.AUTH_PROC_CD , HST.PROV_NM , HST.PROV_EOB_NM , HST.PROV_PRDCT_CD , HST.PROV_MKT_TYP_CD , HST.PROV_IPA_ID , HST.TPSM_CD , HST.PROV_SPCL_CD , IFNULL ( ( SELECT PR1.PROV_MEDCD_RECLM_IND FROM ADJD_CLMSF_PROV PR1 WHERE REF.PARTN_ID = PR1.PARTN_ID AND REF.PARTN_VAL = PR1.PARTN_VAL AND REF.INVN_CTL_NBR = PR1.INVN_CTL_NBR AND REF.ICN_SUFX_CD = PR1.ICN_SUFX_CD AND REF.PROC_DT = PR1.PROC_DT AND REF.PROC_TM = PR1.PROC_TM AND PR1.PROV_MEDCD_RECLM_IND = 'Y' ORDER BY LST_UPDT_DTTM DESC FETCH FIRST 1 ROW ONLY ) , ' ' ) , IFNULL ( ( SELECT REL.REL_SRVC_CLM_LVL_IND FROM ADJD_CLMSFLN_REL_SRVCS REL WHERE REF.PARTN_ID = REL.PARTN_ID AND REF.PARTN_VAL = REL.PARTN_VAL AND REF.INVN_CTL_NBR = REL.INVN_CTL_NBR AND REF.ICN_SUFX_CD = REL.ICN_SUFX_CD AND REF.PROC_DT = REL.PROC_DT AND REF.PROC_TM = REL.PROC_TM AND REF.ICN_SUFX_VERS_NBR = REL.ICN_SUFX_VERS_NBR AND REF.LN_ID = REL.LN_ID FETCH FIRST 1 ROWS ONLY ) , ' ' ) , IFNULL ( DIA.DIAG_CD , '       ' ) , ( SELECT COUNT ( DISTINCT AUTH_NBR ) FROM ADJD_CLMHST_DENORM_LN DLN2 WHERE REF.PARTN_ID = DLN2.PARTN_ID AND REF.PARTN_VAL = DLN2.PARTN_VAL AND REF.INVN_CTL_NBR = DLN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN2.ICN_SUFX_CD AND REF.PROC_DT = DLN2.PROC_DT AND REF.PROC_TM = DLN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN2.ICN_SUFX_VERS_NBR AND ' ' < DLN2.AUTH_NBR ) , ( SELECT SUM ( PHYS_MEDCN_MSK_CNT ) FROM ADJD_CLMSF_LN2 LN2 WHERE REF.PARTN_ID = LN2.PARTN_ID AND REF.PARTN_VAL = LN2.PARTN_VAL AND REF.INVN_CTL_NBR = LN2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = LN2.ICN_SUFX_CD AND REF.PROC_DT = LN2.PROC_DT AND REF.PROC_TM = LN2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = LN2.ICN_SUFX_VERS_NBR ) FROM CLM_HST_TABLE HST INNER JOIN ADJD_CLMHST_DENORM_REF REF ON REF.PARTN_ID = HST.PARTN_ID AND REF.PARTN_VAL = HST.PARTN_VAL AND REF.PROC_DT = HST.PROC_DT AND REF.PROC_TM = HST.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HST.ICN_SUFX_VERS_NBR AND REF.INVN_CTL_NBR = HST.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HST.ICN_SUFX_CD INNER JOIN ADJD_CLMHST_DENORM_HDR HDR ON REF.PARTN_ID = HDR.PARTN_ID AND REF.PARTN_VAL = HDR.PARTN_VAL AND REF.INVN_CTL_NBR = HDR.INVN_CTL_NBR AND REF.ICN_SUFX_CD = HDR.ICN_SUFX_CD AND REF.PROC_DT = HDR.PROC_DT AND REF.PROC_TM = HDR.PROC_TM AND REF.ICN_SUFX_VERS_NBR = HDR.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E BKE ON REF.PARTN_ID = BKE.PARTN_ID AND REF.PARTN_VAL = BKE.PARTN_VAL AND REF.INVN_CTL_NBR = BKE.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BKE.ICN_SUFX_CD AND REF.PROC_DT = BKE.PROC_DT AND REF.PROC_TM = BKE.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BKE.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMSF_BLK_E2 BK2 ON REF.PARTN_ID = BK2.PARTN_ID AND REF.PARTN_VAL = BK2.PARTN_VAL AND REF.INVN_CTL_NBR = BK2.INVN_CTL_NBR AND REF.ICN_SUFX_CD = BK2.ICN_SUFX_CD AND REF.PROC_DT = BK2.PROC_DT AND REF.PROC_TM = BK2.PROC_TM AND REF.ICN_SUFX_VERS_NBR = BK2.ICN_SUFX_VERS_NBR INNER JOIN ADJD_CLMHST_DENORM_LN DLN ON REF.PARTN_ID = DLN.PARTN_ID AND REF.PARTN_VAL = DLN.PARTN_VAL AND REF.INVN_CTL_NBR = DLN.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DLN.ICN_SUFX_CD AND REF.PROC_DT = DLN.PROC_DT AND REF.PROC_TM = DLN.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DLN.ICN_SUFX_VERS_NBR AND REF.LN_ID = DLN.LN_ID LEFT OUTER JOIN ADJD_CLMSF_DIAG DIA ON REF.PARTN_ID = DIA.PARTN_ID AND REF.PARTN_VAL = DIA.PARTN_VAL AND REF.INVN_CTL_NBR = DIA.INVN_CTL_NBR AND REF.ICN_SUFX_CD = DIA.ICN_SUFX_CD AND REF.PROC_DT = DIA.PROC_DT AND REF.PROC_TM = DIA.PROC_TM AND REF.ICN_SUFX_VERS_NBR = DIA.ICN_SUFX_VERS_NBR AND 1 = DIA.DIAG_SEQ_NBR ORDER BY REF.PROC_DT DESC , REF.PROC_TM DESC , REF.PGM_ID_LST_CHAR_VAL DESC , REF.ICN_SUFX_VERS_NBR DESC , REF.INVN_CTL_NBR DESC , REF.ICN_SUFX_CD DESC , REF.LN_ID DESC OPTIMIZE FOR 600 ROWS FETCH FIRST 600 ROWS ONLY WITH UR
          programCtx.setCsrNextFil6ResultSet(d5427dt1Repository.openCsrNextFil6D5427dt1(methodOut.getDcladjdClmhstDenormRef(),methodIn.getHostVariables(),programCtx.getSqlca()));
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = ZERO
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '5410-OPE' TO DB2-PARAGRAPH
//  LITERAL_5410_MN_OPE = '5410-OPE'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_5410_MN_OPE);
//  MOVE 'OPEN   ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_OPEN_B6_);
//  MOVE 'CSR-NEXT-FIL6' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFIL6_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrNextFil6Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5420-FETCH-CSR-NEXT-FIL6-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrNextFil6SectOutCtx fetchCsrNextFil6Sect(D5427dt1Ctx programCtx) throws Exception {
      
// *81***************************************************************
// *81  5420-Fetch-csr-next-fil6-sect                               *
// *81                                                              *
// *81  business function: fetch claim lines                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 5400-proc-csr-next-fil6-sect                    *
// *82  calls     : 5421-fetch-csr-rows-sect                        *
// *82***************************************************************
// *================================================================
FetchCsrNextFil6SectOutCtx methodOut = programCtx.getFetchCsrNextFil6SectOutCtx();
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
          methodOut.setClmHstEndOfFetchNoTrue(); 
          
//  SET DT1-RSP-OK TO TRUE
          methodOut.setDt1RspOkTrue(); 
          
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
          while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodOut.isDt1RspOk()  )) {
//  PERFORM 5421-FETCH-CSR-ROWS-SECT
              fetchCsrRowsSect5421(programCtx.getFetchCsrRowsSect5421InCtx());/*5421-FETCH-CSR-ROWS-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrRowsSect5421 
      *   This method is derived from 
  *   COBOL Paragraph - 5421-FETCH-CSR-ROWS-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrRowsSect5421OutCtx fetchCsrRowsSect5421(FetchCsrRowsSect5421InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5421-Fetch-csr-rows-sect                                    *
// *81                                                              *
// *81  business function: fetch cursor rows                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 5420-fetch-csr-next-fil6-sect                   *
// *82  calls     : 4500-proc-fetched-rows-sect                     *
// *82            : 9100-database-error-sect                        *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
FetchCsrRowsSect5421OutCtx methodOut = methodIn.getFetchCsrRowsSect5421OutCtx();
//  FETCH NEXT ROWSET FROM CSR-NEXT-FIL6 FOR ? ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d5427dt1Repository.fetchCsrNextFil6D5427dt1(programCtx.getCsrNextFil6ResultSet(),methodOut.getHvaClmHistArray(),methodIn.getWork(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  (( methodOut.isSqlcodeOk()  ) || ( methodOut.isSqlcodeFetchEnd()  )) { 
//  PERFORM 4500-PROC-FETCHED-ROWS-SECT
              procFetchedRowsSect(programCtx.getProcFetchedRowsSectInCtx());/*4500-PROC-FETCHED-ROWS-SECT SECTION*/
          }
          else   { 
//  MOVE '5421-FET' TO DB2-PARAGRAPH
//  LITERAL_5421_MN_FET = '5421-FET'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_5421_MN_FET);
//  MOVE 'FETCH  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_FETCH_B5_);
//  MOVE 'CSR-NEXT-FIL6' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFIL6_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsrNextFil6Sect 
      *   This method is derived from 
  *   COBOL Paragraph - 5430-CLOSE-CSR-NEXT-FIL6-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public CloseCsrNextFil6SectOutCtx closeCsrNextFil6Sect(CloseCsrNextFil6SectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  5430-Close-csr-next-fil6-sect                               *
// *81                                                              *
// *81  business function: close the claim list cursor              *
// *82***************************************************************
// *82  called by : 5400-proc-csr-next-fil6-sect
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
CloseCsrNextFil6SectOutCtx methodOut = methodIn.getCloseCsrNextFil6SectOutCtx();
//  CLOSE CSR-NEXT-FIL6
          d5427dt1Repository.closeCsrNextFil6D5427dt1(programCtx.getCsrNextFil6ResultSet(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = +0 OR SQLCODE = -501
//  ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != -501 )) { 
//  MOVE '5430-CLO' TO DB2-PARAGRAPH
//  LITERAL_5430_MN_CLO = '5430-CLO'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_5430_MN_CLO);
//  MOVE 'CLOSE  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_CLOSE_B5_);
//  MOVE 'CSR-NEXT-FIL6' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_CSR_MN2_NEXTFIL6_B17_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * procDynCursorSect 
      *   This method is derived from 
  *   COBOL Paragraph - 6200-PROC-DYN-CURSOR-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      *
      * @throws CFException
      */
      @Override
      public ProcDynCursorSectOutCtx procDynCursorSect(ProcDynCursorSectInCtx methodIn) throws Exception {
      
// *================================================================
// *81***************************************************************
// *81  6200-Proc-dyn-cursor-sect                                   *
// *81                                                              *
// *81  business function: process the dynamic cursor               *
// *82***************************************************************
// *82  called by : 0000-mainline                                   *
// *82            : 4000-search-member-plus-sect                    *
// *82  calls     : 3700-proc-csr-dynam-sql-sect                    *
// *82            : 6210-open-dyn-cursor-sect                       *
// *82            : 6220-fetch-dyn-cursor-sect                      *
// *82            : 6230-close-dyn-cursor-sect                      *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ProcDynCursorSectOutCtx methodOut = methodIn.getProcDynCursorSectOutCtx();
//  PERFORM 3700-PROC-CSR-DYNAM-SQL-SECT
          procCsrDynamSqlSect(programCtx.getProcCsrDynamSqlSectInCtx());/*3700-PROC-CSR-DYNAM-SQL-SECT SECTION*/
//  PERFORM 6210-OPEN-DYN-CURSOR-SECT
          openDynCursorSect(programCtx.getOpenDynCursorSectInCtx());/*6210-OPEN-DYN-CURSOR-SECT SECTION*/
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
              methodOut.setClmHstEndOfFetchNoTrue(); 
              
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
              while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodIn.isDt1RspOk()  )) {
//  PERFORM 6220-FETCH-DYN-CURSOR-SECT
                  fetchDynCursorSect(programCtx);/*6220-FETCH-DYN-CURSOR-SECT SECTION*/
              }
          }
//  IF DT1-RSP-OK
          if ( methodIn.isDt1RspOk()  ) { 
//  PERFORM 6230-CLOSE-DYN-CURSOR-SECT
              closeDynCursorSect(programCtx.getCloseDynCursorSectInCtx());/*6230-CLOSE-DYN-CURSOR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * openDynCursorSect 
      *   This method is derived from 
  *   COBOL Paragraph - 6210-OPEN-DYN-CURSOR-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public OpenDynCursorSectOutCtx openDynCursorSect(OpenDynCursorSectInCtx methodIn) throws Exception {
      
// *81                                                              *
// *81  Business function: declare and open dynamic cursor          *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 6200-proc-dyn-cursor-sect                       *
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
OpenDynCursorSectOutCtx methodOut = methodIn.getOpenDynCursorSectOutCtx();
//  DECLARE DT1-DYN-CURSOR CURSOR WITH ROWSET POSITIONING FOR DT1-DYN-QUERY
          programCtx.setDt1DynCursorResultSet(d5427dt1Repository.openDt1DynCursorD5427dt1(programCtx.getSqlda(),programCtx.getSqlca()));
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = ZERO
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '6210-OPE' TO DB2-PARAGRAPH
//  LITERAL_6210_MN_OPE = '6210-OPE'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_6210_MN_OPE);
//  MOVE 'OPEN   ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_OPEN_B6_);
//  MOVE 'DT1-DYN-CURSOR' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_DT1_MN2_DYNCURSOR_B16_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchDynCursorSect 
      *   This method is derived from 
  *   COBOL Paragraph - 6220-FETCH-DYN-CURSOR-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - clmHstEndOfFetchInd            COBOL Name: CLM-HST-END-OF-FETCH-IND
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public FetchDynCursorSectOutCtx fetchDynCursorSect(D5427dt1Ctx programCtx) throws Exception {
      
// *81***************************************************************
// *81  6220-Fetch-dyn-cursor-sect                                  *
// *81                                                              *
// *81  business function: fetch claim lines                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 6200-proc-dyn-cursor-sect                       *
// *82  calls     : 6221-fetch-csr-rows-sect                        *
// *82***************************************************************
// *================================================================
FetchDynCursorSectOutCtx methodOut = programCtx.getFetchDynCursorSectOutCtx();
//  SET CLM-HST-END-OF-FETCH-NO TO TRUE
          methodOut.setClmHstEndOfFetchNoTrue(); 
          
//  SET DT1-RSP-OK TO TRUE
          methodOut.setDt1RspOkTrue(); 
          
//  PERFORM WITH TEST BEFORE UNTIL CLM-HST-END-OF-FETCH-YES OR NOT DT1-RSP-OK
          while ((!(methodOut.isClmHstEndOfFetchYes())  &&  methodOut.isDt1RspOk()  )) {
//  PERFORM 6221-FETCH-CSR-ROWS-SECT
              fetchCsrRowsSect6221(programCtx.getFetchCsrRowsSect6221InCtx());/*6221-FETCH-CSR-ROWS-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * fetchCsrRowsSect6221 
      *   This method is derived from 
  *   COBOL Paragraph - 6221-FETCH-CSR-ROWS-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public FetchCsrRowsSect6221OutCtx fetchCsrRowsSect6221(FetchCsrRowsSect6221InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  6221-Fetch-csr-rows-sect                                    *
// *81                                                              *
// *81  business function: fetch cursor rows                        *
// *81***************************************************************
// *82***************************************************************
// *82  called by : 6220-fetch-dyn-cursor-sect                      *
// *82  calls     : 4500-proc-fetched-rows-sect                     *
// *82            : 9100-database-error-sect                        *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
FetchCsrRowsSect6221OutCtx methodOut = methodIn.getFetchCsrRowsSect6221OutCtx();
//  FETCH NEXT ROWSET FROM DT1-DYN-CURSOR FOR ? ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d5427dt1Repository.fetchDt1DynCursorD5427dt1(programCtx.getDt1DynCursorResultSet(),methodOut.getHvaClmHistArray(),methodIn.getWork(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  (( methodOut.isSqlcodeOk()  ) || ( methodOut.isSqlcodeFetchEnd()  )) { 
//  PERFORM 4500-PROC-FETCHED-ROWS-SECT
              procFetchedRowsSect(programCtx.getProcFetchedRowsSectInCtx());/*4500-PROC-FETCHED-ROWS-SECT SECTION*/
          }
          else   { 
//  MOVE '6221-FET' TO DB2-PARAGRAPH
//  LITERAL_6221_MN_FET = '6221-FET'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_6221_MN_FET);
//  MOVE 'FETCH  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_FETCH_B5_);
//  MOVE 'DT1-DYN-CURSOR' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_DT1_MN2_DYNCURSOR_B16_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeDynCursorSect 
      *   This method is derived from 
  *   COBOL Paragraph - 6230-CLOSE-DYN-CURSOR-SECT SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - db2Action                      COBOL Name: DB2-ACTION
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      *
      * @throws CFException
      */
      @Override
      public CloseDynCursorSectOutCtx closeDynCursorSect(CloseDynCursorSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81  6230-Close-dyn-cursor-sect                                  *
// *81                                                              *
// *81  business function: close the claim list cursor              *
// *82***************************************************************
// *82  called by : 6200-proc-dyn-cursor-sect
// *82  calls     : 9100-database-error-sect
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
CloseDynCursorSectOutCtx methodOut = methodIn.getCloseDynCursorSectOutCtx();
//  CLOSE DT1-DYN-CURSOR
          d5427dt1Repository.closeDt1DynCursorD5427dt1(programCtx.getDt1DynCursorResultSet(),programCtx.getSqlca());
//  MOVE SQLCODE TO WS-SQLCODE
          methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  IF SQLCODE = +0 OR SQLCODE = -501
//  ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != -501 )) { 
//  MOVE '6230-CLO' TO DB2-PARAGRAPH
//  LITERAL_6230_MN_CLO = '6230-CLO'
              methodOut.setDb2Paragraph(CONSTANTS.LITERAL_6230_MN_CLO);
//  MOVE 'CLOSE  ' TO DB2-ACTION
              methodOut.setDb2Action(CONSTANTS.LITERAL_CLOSE_B5_);
//  MOVE 'DT1-DYN-CURSOR' TO DB2-RESOURCE
              methodOut.setDb2Resource(CONSTANTS.LITERAL_DT1_MN2_DYNCURSOR_B16_);
//  PERFORM 9100-DATABASE-ERROR-SECT
              databaseErrorSect(programCtx.getDatabaseErrorSectInCtx());/*9100-DATABASE-ERROR-SECT SECTION*/
          }
      
      return methodOut;
      }
      /**
      * sortDt1srtSect 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-SORT-DT1SRT-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  :  

      * - dt1SrtItemCnt                  COBOL Name: DT1-SRT-ITEM-CNT
      * - srpReturnCode                  COBOL Name: SRP-RETURN-CODE
      *
      * Output :  

      * - srpEntryCount                  COBOL Name: SRP-ENTRY-COUNT
      * - dt1SrtItemCnt                  COBOL Name: DT1-SRT-ITEM-CNT
      * - srpEntryLength                 COBOL Name: SRP-ENTRY-LENGTH
      * - srpKeyStart                    COBOL Name: SRP-KEY-START
      * - srpKeyLength                   COBOL Name: SRP-KEY-LENGTH
      * - srpSequence                    COBOL Name: SRP-SEQUENCE
      * - rc                             COBOL Name: RETURN-CODE
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      * - dt1RspExplanationCode          COBOL Name: DT1-RSP-EXPLANATION-CODE
      * - dt1RspRespCode                 COBOL Name: DT1-RSP-RESP-CODE
      * - srpReturnCode                  COBOL Name: SRP-RETURN-CODE
      * - dt1RspErrSection               COBOL Name: DT1-RSP-ERR-SECTION
      *
      * @throws CFException
      */
      @Override
      public SortDt1srtSectOutCtx sortDt1srtSect(SortDt1srtSectInCtx methodIn) throws Exception {
      
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
SortDt1srtSectOutCtx methodOut = methodIn.getSortDt1srtSectOutCtx();
//  MOVE DT1-SRT-ITEM-CNT TO SRP-ENTRY-COUNT
          methodOut.setSrpEntryCount(methodOut.getDt1SrtItemCnt());
//  MOVE LENGTH OF DT1-SRT-ITEM TO SRP-ENTRY-LENGTH
          methodOut.setSrpEntryLength(Dt1SrtItem.getDt1SrtItemFieldLength());

// * Sort by descending key
//  MOVE 1 TO SRP-KEY-START
//  LITERAL_1 = 1
          methodOut.setSrpKeyStart(1);
//  MOVE 62 TO SRP-KEY-LENGTH
          methodOut.setSrpKeyLength(62);
//  SET SRP-DESCENDING-SORT TO TRUE
          methodOut.setSrpDescendingSortTrue(); 
          
//  CALL VP776A00 USING OMITTED_1 , OMITTED_1 , SRP-SORT-REQUEST-PARAMETERS , DT1-SRT-ARRAY END-CALL
          // CALL VP776A00 USING OMITTED_1 , OMITTED_1 , SRP-SORT-REQUEST-PARAMETERS , DT1-SRT-ARRAY END-CALL
               programCtx.setRc( vp776a00.call(programCtx.getGlobalCtx().getContext("VP776A00"),(Field)null,(Field)null,methodOut.getSrpSortRequestParameters(),methodOut.getDt1SrtArray()));
//  EVALUATE TRUE
          if  ( methodIn.isSrpGoodReturn()  ) { 
              ;
          }
          else   { 
//  SET DT1-RSP-FAILED-SEE-EXP-CODE TO TRUE
              methodOut.setDt1RspFailedSeeExpCodeTrue(); 
              
//  SET DT1-RSP-SEE-VIEW-FOR-MORE-INFO TO TRUE
              methodOut.setDt1RspSeeViewForMoreInfoTrue(); 
              
//  MOVE SRP-RETURN-CODE TO DT1-RSP-RESP-CODE
              methodOut.setDt1RspRespCode(padLeftZeros(4,methodOut.getSrpReturnCode(),false));
//  MOVE '8000-SOR' TO DT1-RSP-ERR-SECTION
//  LITERAL_8000_MN_SOR = '8000-SOR'
              methodOut.setDt1RspErrSection(CONSTANTS.LITERAL_8000_MN_SOR);
          }
      
      return methodOut;
      }
      /**
      * getClmContStgSect 
      *   This method is derived from 
  *   COBOL Paragraph - 8010-GET-CLM-CONT-STG-SECT SECTION COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - storageAreaPtr                 COBOL Name: STORAGE-AREA-PTR
      * - storageSizeRequired            COBOL Name: STORAGE-SIZE-REQUIRED
      * - cicsresp                       COBOL Name: CICSRESP
      * - cicsresp2                      COBOL Name: CICSRESP2
      * - dt1ClmContainer                COBOL Name: DT1-CLM-CONTAINER
      * - dt1ClmFixedArea                COBOL Name: DT1-CLM-FIXED-AREA
      * - dt1ClmClmContainerItemCnt      COBOL Name: DT1-CLM-CLM-CONTAINER-ITEM-CNT
      * - dt1ClmClaimItem                COBOL Name: DT1-CLM-CLAIM-ITEM
      * - dt1ClmItemFillerArea           COBOL Name: DT1-CLM-ITEM-FILLER-AREA
      * - dt1ClmClmContainerItemLen      COBOL Name: DT1-CLM-CLM-CONTAINER-ITEM-LEN
      *
      * @throws CFException
      */
      @Override
      public GetClmContStgSectOutCtx getClmContStgSect(GetClmContStgSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81 8010-Get-clm-cont-stg-sect                                   *
// *81                                                              *
// *81 business function:                                           *
// *81 get storage for clm-container staging area                   *
// *81 - size is length of fixed area + length of one array entry   *
// *82***************************************************************
// *82 called by :  0100-ffii-initialization-sect                   *
// *82 calls     :  none                                            *
// *82***************************************************************
// *================================================================

// * Allocate staging area for clm container - one occurence only
// * setup call to get storage - fields must always be initialized
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
GetClmContStgSectOutCtx methodOut = methodIn.getGetClmContStgSectOutCtx();
//  SET STORAGE-AREA-PTR TO NULL
          methodOut.setStorageAreaPtr(0); 
          
          methodOut.setStorageSizeRequired(Dt1ClmFixedArea.getDt1ClmFixedAreaFieldLength() + Dt1ClmClaimItem.getDt1ClmClaimItemFieldLength());
//  GETMAIN SET (STORAGE-AREA-PTR) FLENGTH (STORAGE-SIZE-REQUIRED) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // GETMAIN SET (STORAGE-AREA-PTR) FLENGTH (STORAGE-SIZE-REQUIRED) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // getmain
           methodOut.setStorageAreaPtr(TransactionManager.getMain(programCtx.getCicsSession(), methodOut.getStorageSizeRequired() , false));
//  MOVE EIBRESP TO CICSRESP
          methodOut.setCicsresp(programCtx.getCicsSession().getEibresp());
//  MOVE EIBRESP2 TO CICSRESP2
          methodOut.setCicsresp2(programCtx.getCicsSession().getEibresp2());
//  SET ADDRESS OF DT1-CLM-CONTAINER TO STORAGE-AREA-PTR
          methodOut.getDt1ClmContainer().set(getObject(methodOut.getStorageAreaPtr())); 
          
//  INITIALIZE DT1-CLM-FIXED-AREA
          methodOut.getDt1ClmFixedArea().initialize();
          // MOVE +1 TO DT1-CLM-CLM-CONTAINER-ITEM-CNT
          methodOut.setDt1ClmClmContainerItemCnt((long)1);
//  INITIALIZE DT1-CLM-CLAIM-ITEM (1)
          methodOut.getDt1ClmClaimItem(0).initialize();
//  INITIALIZE DT1-CLM-ITEM-FILLER-AREA (1)
          methodOut.setDt1ClmItemFillerArea(0,CONSTANTS.SPACE_117 /* Fill 117 Spaces*/);
//  MOVE LENGTH OF DT1-CLM-CLAIM-ITEM TO DT1-CLM-CLM-CONTAINER-ITEM-LEN
          methodOut.setDt1ClmClmContainerItemLen(Dt1ClmClaimItem.getDt1ClmClaimItemFieldLength());
      
      return methodOut;
      }
      /**
      * getSrtContStgSect 
      *   This method is derived from 
  *   COBOL Paragraph - 8011-GET-SRT-CONT-STG-SECT SECTION COBOL Cyclomatic complexity - 1
      * Input  :  

      * - nbrSrtItems                    COBOL Name: NBR-SRT-ITEMS
      *
      * Output :  

      * - storageAreaPtr                 COBOL Name: STORAGE-AREA-PTR
      * - storageSizeRequired            COBOL Name: STORAGE-SIZE-REQUIRED
      * - cicsresp                       COBOL Name: CICSRESP
      * - cicsresp2                      COBOL Name: CICSRESP2
      * - dt1SrtContainer                COBOL Name: DT1-SRT-CONTAINER
      * - dt1SrtFixedArea                COBOL Name: DT1-SRT-FIXED-AREA
      *
      * @throws CFException
      */
      @Override
      public GetSrtContStgSectOutCtx getSrtContStgSect(GetSrtContStgSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81 8011-Get-srt-cont-stg-sect                                   *
// *81                                                              *
// *81 business function:                                           *
// *81 get storage for srt-container area                           *
// *82***************************************************************
// *82 called by :  4500-proc-fetched-rows-sect                     *
// *82 calls     :  none                                            *
// *82***************************************************************
// *================================================================

// * Allocate staging area for srt container
// * setup call to get storage - fields must always be initialized
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
GetSrtContStgSectOutCtx methodOut = methodIn.getGetSrtContStgSectOutCtx();
//  SET STORAGE-AREA-PTR TO NULL
          methodOut.setStorageAreaPtr(0); 
          
          methodOut.setStorageSizeRequired(Dt1SrtFixedArea.getDt1SrtFixedAreaFieldLength() + Dt1SrtItem.getDt1SrtItemFieldLength() * methodIn.getNbrSrtItems());
//  GETMAIN SET (STORAGE-AREA-PTR) FLENGTH (STORAGE-SIZE-REQUIRED) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // GETMAIN SET (STORAGE-AREA-PTR) FLENGTH (STORAGE-SIZE-REQUIRED) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // getmain
           methodOut.setStorageAreaPtr(TransactionManager.getMain(programCtx.getCicsSession(), methodOut.getStorageSizeRequired() , false));
//  MOVE EIBRESP TO CICSRESP
          methodOut.setCicsresp(programCtx.getCicsSession().getEibresp());
//  MOVE EIBRESP2 TO CICSRESP2
          methodOut.setCicsresp2(programCtx.getCicsSession().getEibresp2());
//  SET ADDRESS OF DT1-SRT-CONTAINER TO STORAGE-AREA-PTR
          methodOut.getDt1SrtContainer().set(getObject(methodOut.getStorageAreaPtr())); 
          
//  INITIALIZE DT1-SRT-FIXED-AREA
          methodOut.getDt1SrtFixedArea().initialize();
      
      return methodOut;
      }
      /**
      * putD5427dt1SrtSect 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-PUT-D5427DT1-SRT-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  :  

      * - dt1SrtContainerName            COBOL Name: DT1-SRT-CONTAINER-NAME
      * - dt1SrtContainerLayout          COBOL Name: DT1-SRT-CONTAINER-LAYOUT
      * - dt1SrtItemCnt                  COBOL Name: DT1-SRT-ITEM-CNT
      *
      * Output :  

      * - currentContainerName           COBOL Name: CURRENT-CONTAINER-NAME
      * - dt1SrtContainerName            COBOL Name: DT1-SRT-CONTAINER-NAME
      * - currentContainerLayout         COBOL Name: CURRENT-CONTAINER-LAYOUT
      * - dt1SrtContainerLayout          COBOL Name: DT1-SRT-CONTAINER-LAYOUT
      * - currentContainerLength         COBOL Name: CURRENT-CONTAINER-LENGTH
      * - cicsresp                       COBOL Name: CICSRESP
      * - cicsresp2                      COBOL Name: CICSRESP2
      * - stsResponseVars                COBOL Name: STS-RESPONSE-VARS
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      * - dt1RspExplanationCode          COBOL Name: DT1-RSP-EXPLANATION-CODE
      * - stsRespCode                    COBOL Name: STS-RESP-CODE
      * - dt1RspRespCode                 COBOL Name: DT1-RSP-RESP-CODE
      * - dt1RspErrSection               COBOL Name: DT1-RSP-ERR-SECTION
      * - stsCicsresp                    COBOL Name: STS-CICSRESP
      * - stsCicsresp2                   COBOL Name: STS-CICSRESP2
      * - stsEibtaskn                    COBOL Name: STS-EIBTASKN
      * - stsRespMessageType             COBOL Name: STS-RESP-MESSAGE-TYPE
      * - stsRespAdditionalInfo1         COBOL Name: STS-RESP-ADDITIONAL-INFO-1
      *
      * @throws CFException
      */
      @Override
      public PutD5427dt1SrtSectOutCtx putD5427dt1SrtSect(PutD5427dt1SrtSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81 8100-Put-d5427dt1-srt-sect                                   *
// *81                                                              *
// *81 business function:                                           *
// *81 put the d5427dt1-srt contaier                                *
// *82***************************************************************
// *82 called by :  0000-mainline                                   *
// *82 calls     :  none                                            *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
PutD5427dt1SrtSectOutCtx methodOut = methodIn.getPutD5427dt1SrtSectOutCtx();
//  MOVE DT1-SRT-CONTAINER-NAME TO CURRENT-CONTAINER-NAME
          methodOut.setCurrentContainerName(methodOut.getDt1SrtContainerName());
//  MOVE DT1-SRT-CONTAINER-LAYOUT TO CURRENT-CONTAINER-LAYOUT
          methodOut.setCurrentContainerLayout(methodOut.getDt1SrtContainerLayout());
//  MOVE LENGTH OF DT1-SRT-CONTAINER TO CURRENT-CONTAINER-LENGTH
          methodOut.setCurrentContainerLength(4/* fixed offset*/ + methodIn.getDt1SrtItemCnt()/* depending on*/  * 74/* field Length */ );
//  PUT CONTAINER (CURRENT-CONTAINER-NAME) FLENGTH (CURRENT-CONTAINER-LENGTH) CHANNEL (CURRENT-CHANNEL-NAME) FROM (DT1-SRT-CONTAINER) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // PUT CONTAINER (CURRENT-CONTAINER-NAME) FLENGTH (CURRENT-CONTAINER-LENGTH) CHANNEL (CURRENT-CHANNEL-NAME) FROM (DT1-SRT-CONTAINER) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // write data to a container
          	programCtx.getGlobalCtx().addContainer(String.valueOf(methodOut.getCurrentContainerName()).trim(),methodIn.getDt1SrtContainer().toCharArray());
          
          methodOut.setCicsresp(programCtx.getCicsSession().getEibresp());
          methodOut.setCicsresp2(programCtx.getCicsSession().getEibresp2());
          	
//  MOVE EIBRESP TO CICSRESP
          methodOut.setCicsresp(programCtx.getCicsSession().getEibresp());
//  MOVE EIBRESP2 TO CICSRESP2
          methodOut.setCicsresp2(programCtx.getCicsSession().getEibresp2());

// * Dfhresp(normal) = 0                       inserted by translator

// * Dfhresp(normal) = 0                       inserted by translator
//  IF ( CICSRESP = 0 AND CICSRESP2 = 0 )
//  ELSE
          if ((	( methodOut.getCicsresp() != 0 ) || 	( methodOut.getCicsresp2() != 0 ))) { 
//  INITIALIZE STS-RESPONSE-VARS
              methodOut.getStsResponseVars().initialize();
//  SET DT1-RSP-FAIL TO TRUE
              methodOut.setDt1RspFailTrue(); 
              
//  SET DT1-RSP-SEE-VIEW-FOR-MORE-INFO TO TRUE
              methodOut.setDt1RspSeeViewForMoreInfoTrue(); 
              
//  SET STS-RESP-CODE-PUT-ERROR TO TRUE
              methodOut.setStsRespCodePutErrorTrue(); 
              
//  MOVE STS-RESP-CODE TO DT1-RSP-RESP-CODE
              methodOut.setDt1RspRespCode(padLeftZeros(4,methodOut.getStsRespCode(),false));
//  MOVE '8100-PUT' TO DT1-RSP-ERR-SECTION
//  LITERAL_8100_MN_PUT = '8100-PUT'
              methodOut.setDt1RspErrSection(CONSTANTS.LITERAL_8100_MN_PUT);
              // MOVE CICSRESP TO STS-CICSRESP
              methodOut.setStsCicsresp(methodOut.getCicsresp());
              // MOVE CICSRESP2 TO STS-CICSRESP2
              methodOut.setStsCicsresp2(methodOut.getCicsresp2());
//  MOVE EIBTASKN TO STS-EIBTASKN
              methodOut.setStsEibtaskn(programCtx.getCicsSession().getEibtaskn());
//  SET STS-RESP-MESSAGE-CICS TO TRUE
              methodOut.setStsRespMessageCicsTrue(); 
              
//  MOVE 'D5427DT1-SRT; CICS PUT CONTAINER ERROR' TO STS-RESP-ADDITIONAL-INFO-1
              methodOut.setStsRespAdditionalInfo1(CONSTANTS.LITERAL_1507533171);
          }
      
      return methodOut;
      }
      /**
      * putD5427dt1ClmSect 
      *   This method is derived from 
  *   COBOL Paragraph - 8120-PUT-D5427DT1-CLM-SECT SECTION COBOL Cyclomatic complexity - 20
      * Input  :  

      * - dt1ClmContainerName            COBOL Name: DT1-CLM-CONTAINER-NAME
      * - dt1ClmContainerLayout          COBOL Name: DT1-CLM-CONTAINER-LAYOUT
      * - dt1SrtItemCnt                  COBOL Name: DT1-SRT-ITEM-CNT
      * - dt1RspClmContainerItemCnt      COBOL Name: DT1-RSP-CLM-CONTAINER-ITEM-CNT
      * - dt1ClmFln                      COBOL Name: DT1-CLM-FLN
      * - dt1ClmIcn                      COBOL Name: DT1-CLM-ICN
      * - dt1ClmProcDt                   COBOL Name: DT1-CLM-PROC-DT
      * - date9                          COBOL Name: WS-DATE-9
      * - dt1ClmProcTm                   COBOL Name: DT1-CLM-PROC-TM
      * - hvaPgmIdLstCharVal             COBOL Name: HVA-PGM-ID-LST-CHAR-VAL
      * - time9                          COBOL Name: WS-TIME-9
      * - lastBit9                       COBOL Name: WS-LAST-BIT-9
      * - hvaBankCd                      COBOL Name: HVA-BANK-CD
      * - num3                           COBOL Name: WS-NUM-3
      * - num39                          COBOL Name: WS-NUM-3-9
      * - dt1ClmDraftNo                  COBOL Name: DT1-CLM-DRAFT-NO
      * - payeeCode                      COBOL Name: WS-PAYEE-CODE
      * - hvaRmrkCd                      COBOL Name: HVA-RMRK-CD
      * - dt1ClmAdjNbr                   COBOL Name: DT1-CLM-ADJ-NBR
      * - dt1ClmHeaderCt                 COBOL Name: DT1-CLM-HEADER-CT
      * - dt1ClmProviderId               COBOL Name: DT1-CLM-PROVIDER-ID
      * - dt1ClmSuffixCd                 COBOL Name: DT1-CLM-SUFFIX-CD
      * - hvaDivNbr                      COBOL Name: HVA-DIV-NBR
      * - hvaClsNbr                      COBOL Name: HVA-CLS-NBR
      *
      * Output :  

      * - currentContainerName           COBOL Name: CURRENT-CONTAINER-NAME
      * - dt1ClmContainerName            COBOL Name: DT1-CLM-CONTAINER-NAME
      * - currentContainerLayout         COBOL Name: CURRENT-CONTAINER-LAYOUT
      * - dt1ClmContainerLayout          COBOL Name: DT1-CLM-CONTAINER-LAYOUT
      * - currentContainerLength         COBOL Name: CURRENT-CONTAINER-LENGTH
      * - cicsresp                       COBOL Name: CICSRESP
      * - cicsresp2                      COBOL Name: CICSRESP2
      * - stsResponseVars                COBOL Name: STS-RESPONSE-VARS
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      * - dt1RspExplanationCode          COBOL Name: DT1-RSP-EXPLANATION-CODE
      * - stsRespCode                    COBOL Name: STS-RESP-CODE
      * - dt1RspErrSection               COBOL Name: DT1-RSP-ERR-SECTION
      * - stsCicsresp                    COBOL Name: STS-CICSRESP
      * - stsCicsresp2                   COBOL Name: STS-CICSRESP2
      * - stsEibtaskn                    COBOL Name: STS-EIBTASKN
      * - dt1RspRespCode                 COBOL Name: DT1-RSP-RESP-CODE
      * - stsRespMessageType             COBOL Name: STS-RESP-MESSAGE-TYPE
      * - stsRespAdditionalInfo1         COBOL Name: STS-RESP-ADDITIONAL-INFO-1
      * - dt1RspClmContainerItemCnt      COBOL Name: DT1-RSP-CLM-CONTAINER-ITEM-CNT
      * - dt1SrtItemCnt                  COBOL Name: DT1-SRT-ITEM-CNT
      * - dt1SrtDx                       COBOL Name: DT1-SRT-DX
      * - dt1SrtFlnCent                  COBOL Name: DT1-SRT-FLN-CENT
      * - dt1SrtFln                      COBOL Name: DT1-SRT-FLN
      * - dt1ClmFln                      COBOL Name: DT1-CLM-FLN
      * - dt1SrtIcn                      COBOL Name: DT1-SRT-ICN
      * - dt1ClmIcn                      COBOL Name: DT1-CLM-ICN
      * - dateX                          COBOL Name: WS-DATE-X
      * - dt1ClmProcDt                   COBOL Name: DT1-CLM-PROC-DT
      * - dt1SrtDate                     COBOL Name: DT1-SRT-DATE
      * - date9                          COBOL Name: WS-DATE-9
      * - timeX                          COBOL Name: WS-TIME-X
      * - dt1ClmProcTm                   COBOL Name: DT1-CLM-PROC-TM
      * - lastBitX                       COBOL Name: WS-LAST-BIT-X
      * - hvaPgmIdLstCharVal             COBOL Name: HVA-PGM-ID-LST-CHAR-VAL
      * - dt1SrtTime                     COBOL Name: DT1-SRT-TIME
      * - num3X                          COBOL Name: WS-NUM-3-X
      * - hvaBankCd                      COBOL Name: HVA-BANK-CD
      * - dt1SrtBankCode                 COBOL Name: DT1-SRT-BANK-CODE
      * - num39                          COBOL Name: WS-NUM-3-9
      * - dt1SrtDraft                    COBOL Name: DT1-SRT-DRAFT
      * - dt1ClmDraftNo                  COBOL Name: DT1-CLM-DRAFT-NO
      * - dt1SrtPayeeCode                COBOL Name: DT1-SRT-PAYEE-CODE
      * - payeeCode                      COBOL Name: WS-PAYEE-CODE
      * - dt1SrtLineSequence             COBOL Name: DT1-SRT-LINE-SEQUENCE
      * - dt1SrtTranCode                 COBOL Name: DT1-SRT-TRAN-CODE
      * - hvaRmrkCd                      COBOL Name: HVA-RMRK-CD
      * - dt1SrtApproverAltId            COBOL Name: DT1-SRT-APPROVER-ALT-ID
      * - dt1ClmAdjNbr                   COBOL Name: DT1-CLM-ADJ-NBR
      * - dt1SrtHeaderCt                 COBOL Name: DT1-SRT-HEADER-CT
      * - dt1ClmHeaderCt                 COBOL Name: DT1-CLM-HEADER-CT
      * - num15                          COBOL Name: WS-NUM-15
      * - dt1ClmProviderId               COBOL Name: DT1-CLM-PROVIDER-ID
      * - num159                         COBOL Name: WS-NUM-15-9
      * - dt1SrtProviderId               COBOL Name: DT1-SRT-PROVIDER-ID
      * - dt1SrtSuffixCd                 COBOL Name: DT1-SRT-SUFFIX-CD
      * - dt1ClmSuffixCd                 COBOL Name: DT1-CLM-SUFFIX-CD
      * - dt1SrtDivNbr                   COBOL Name: DT1-SRT-DIV-NBR
      * - hvaDivNbr                      COBOL Name: HVA-DIV-NBR
      * - dt1SrtClsNbr                   COBOL Name: DT1-SRT-CLS-NBR
      * - hvaClsNbr                      COBOL Name: HVA-CLS-NBR
      * - dt1SrtClmItem                  COBOL Name: DT1-SRT-CLM-ITEM
      * - dt1ClmClaimItem                COBOL Name: DT1-CLM-CLAIM-ITEM
      *
      * @throws CFException
      */
      @Override
      public PutD5427dt1ClmSectOutCtx putD5427dt1ClmSect(PutD5427dt1ClmSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81 8120-Put-d5427dt1-clm-sect                                   *
// *81                                                              *
// *81 business function:                                           *
// *81 put the d5427dt1-clm container / with put append             *
// *82***************************************************************
// *82 called by :  4600-write-clm-data-sect                        *
// *82 calls     :  none                                            *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
PutD5427dt1ClmSectOutCtx methodOut = methodIn.getPutD5427dt1ClmSectOutCtx();
//  MOVE DT1-CLM-CONTAINER-NAME TO CURRENT-CONTAINER-NAME
          methodOut.setCurrentContainerName(methodOut.getDt1ClmContainerName());
//  MOVE DT1-CLM-CONTAINER-LAYOUT TO CURRENT-CONTAINER-LAYOUT
          methodOut.setCurrentContainerLayout(methodOut.getDt1ClmContainerLayout());
//  IF DT1-SRT-ITEM-CNT = ZERO
          if (	( methodOut.getDt1SrtItemCnt() == 0 )) { 
              methodOut.setCurrentContainerLength(Dt1ClmFixedArea.getDt1ClmFixedAreaFieldLength() + Dt1ClmClaimItem.getDt1ClmClaimItemFieldLength());
//  PUT CONTAINER (CURRENT-CONTAINER-NAME) FLENGTH (CURRENT-CONTAINER-LENGTH) CHANNEL (CURRENT-CHANNEL-NAME) FROM (DT1-CLM-CONTAINER) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
              // PUT CONTAINER (CURRENT-CONTAINER-NAME) FLENGTH (CURRENT-CONTAINER-LENGTH) CHANNEL (CURRENT-CHANNEL-NAME) FROM (DT1-CLM-CONTAINER) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
              // write data to a container
              	programCtx.getGlobalCtx().addContainer(String.valueOf(methodOut.getCurrentContainerName()).trim(),methodIn.getDt1ClmContainer().toCharArray());
              
              methodOut.setCicsresp(programCtx.getCicsSession().getEibresp());
              methodOut.setCicsresp2(programCtx.getCicsSession().getEibresp2());
              	
//  MOVE EIBRESP TO CICSRESP
              methodOut.setCicsresp(programCtx.getCicsSession().getEibresp());
//  MOVE EIBRESP2 TO CICSRESP2
              methodOut.setCicsresp2(programCtx.getCicsSession().getEibresp2());
          }
//  ELSE
          else { 

// * Put for items 2, 3... etc
//  MOVE LENGTH OF DT1-CLM-CLAIM-ITEM (1) TO CURRENT-CONTAINER-LENGTH
              methodOut.setCurrentContainerLength(Dt1ClmClaimItem.getDt1ClmClaimItemFieldLength());
//  PUT CONTAINER (CURRENT-CONTAINER-NAME) FLENGTH (CURRENT-CONTAINER-LENGTH) CHANNEL (CURRENT-CHANNEL-NAME) FROM (DT1-CLM-CLAIM-ITEM (1) ) APPEND NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
              // PUT CONTAINER (CURRENT-CONTAINER-NAME) FLENGTH (CURRENT-CONTAINER-LENGTH) CHANNEL (CURRENT-CHANNEL-NAME) FROM (DT1-CLM-CLAIM-ITEM (1) ) APPEND NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
              // write data to a container
                      String containerName = String.valueOf(methodOut.getCurrentContainerName()).trim();
char[] inContainer = programCtx.getGlobalCtx().fetchContainer(containerName);
if(inContainer == null) inContainer = new char[0];
char[] appendData = methodOut.getDt1ClmClaimItem(0).toCharArray();
char[] newData = new char[inContainer.length + appendData.length];
if(inContainer.length > 0) Field.arraycopy(inContainer, 0, newData, 0, inContainer.length);
Field.arraycopy(appendData, 0, newData, inContainer.length, appendData.length);

              	programCtx.getGlobalCtx().addContainer(containerName, newData);
              
              methodOut.setCicsresp(programCtx.getCicsSession().getEibresp());
              methodOut.setCicsresp2(programCtx.getCicsSession().getEibresp2());
              	
//  MOVE EIBRESP TO CICSRESP
              methodOut.setCicsresp(programCtx.getCicsSession().getEibresp());
//  MOVE EIBRESP2 TO CICSRESP2
              methodOut.setCicsresp2(programCtx.getCicsSession().getEibresp2());
          }

// * Dfhresp(normal) = 0                       inserted by translator

// * Dfhresp(normal) = 0                       inserted by translator
//  IF ( CICSRESP = 0 AND CICSRESP2 = 0 )
//  ELSE
          if ((	( methodOut.getCicsresp() != 0 ) || 	( methodOut.getCicsresp2() != 0 ))) { 
//  INITIALIZE STS-RESPONSE-VARS
              methodOut.getStsResponseVars().initialize();
//  SET DT1-RSP-FAIL TO TRUE
              methodOut.setDt1RspFailTrue(); 
              
//  SET DT1-RSP-SEE-VIEW-FOR-MORE-INFO TO TRUE
              methodOut.setDt1RspSeeViewForMoreInfoTrue(); 
              
//  SET STS-RESP-CODE-PUT-ERROR TO TRUE
              methodOut.setStsRespCodePutErrorTrue(); 
              
//  MOVE '8120-PUT' TO DT1-RSP-ERR-SECTION
//  LITERAL_8120_MN_PUT = '8120-PUT'
              methodOut.setDt1RspErrSection(CONSTANTS.LITERAL_8120_MN_PUT);
              // MOVE CICSRESP TO STS-CICSRESP
              methodOut.setStsCicsresp(methodOut.getCicsresp());
              // MOVE CICSRESP2 TO STS-CICSRESP2
              methodOut.setStsCicsresp2(methodOut.getCicsresp2());
//  MOVE EIBTASKN TO STS-EIBTASKN
              methodOut.setStsEibtaskn(programCtx.getCicsSession().getEibtaskn());
//  MOVE STS-RESP-CODE TO DT1-RSP-RESP-CODE
              methodOut.setDt1RspRespCode(padLeftZeros(4,methodOut.getStsRespCode(),false));
//  SET STS-RESP-MESSAGE-CICS TO TRUE
              methodOut.setStsRespMessageCicsTrue(); 
              
//  MOVE 'D5427DT1-CLM; CICS PUT CONTAINER ERROR' TO STS-RESP-ADDITIONAL-INFO-1
              methodOut.setStsRespAdditionalInfo1(CONSTANTS.LITERAL_1706124574);
          }

// * Increment claim count in dt1-rsp

// * Add entry to srt-container table
//  ADD 1 TO DT1-RSP-CLM-CONTAINER-ITEM-CNT
          methodOut.setDt1RspClmContainerItemCnt(methodOut.getDt1RspClmContainerItemCnt()+(long)1);
//  ADD +1 TO DT1-SRT-ITEM-CNT
          methodOut.setDt1SrtItemCnt(methodOut.getDt1SrtItemCnt()+1);
//  SET DT1-SRT-DX TO DT1-SRT-ITEM-CNT
          methodOut.setDt1SrtDx(methodOut.getDt1SrtItemCnt()); 
          
//  IF DT1-CLM-FLN (1) (1 : 2) < '50'
//  LITERAL_50 = '50'
          if (		compareChars(substring(methodOut.getDt1ClmFlnString(0),0,2),CONSTANTS.LITERAL_50) < 0 ) { 
//  MOVE '20' TO DT1-SRT-FLN-CENT ( DT1-SRT-DX )
              methodOut.setDt1SrtFlnCent(methodOut.getDt1SrtDx() - 1,20);
          }
//  ELSE
          else { 
//  MOVE '19' TO DT1-SRT-FLN-CENT ( DT1-SRT-DX )
              methodOut.setDt1SrtFlnCent(methodOut.getDt1SrtDx() - 1,19);
          }
//  MOVE DT1-CLM-FLN (1) TO DT1-SRT-FLN ( DT1-SRT-DX )
          methodOut.setDt1SrtFln(methodOut.getDt1SrtDx() - 1,methodOut.getDt1ClmFln(0));
//  MOVE DT1-CLM-ICN (1) TO DT1-SRT-ICN ( DT1-SRT-DX )
          methodOut.setDt1SrtIcn(methodOut.getDt1SrtDx() - 1,methodOut.getDt1ClmIcn(0));
//  MOVE DT1-CLM-PROC-DT (1) (1 : 4) TO WS-DATE-X (1 : 4)
          methodOut.setDateX(replace(methodOut.getDateX(),substring(methodOut.getDt1ClmProcDt(0),0,4),0,4));
//  MOVE DT1-CLM-PROC-DT (1) (6 : 2) TO WS-DATE-X (5 : 2)
          methodOut.setDateX(replace(methodOut.getDateX(),substring(methodOut.getDt1ClmProcDt(0),5,7),4,6));
//  MOVE DT1-CLM-PROC-DT (1) (9 : 2) TO WS-DATE-X (7 : 2)
          methodOut.setDateX(replace(methodOut.getDateX(),substring(methodOut.getDt1ClmProcDt(0),8,10),6,8));
//  MOVE WS-DATE-9 TO DT1-SRT-DATE ( DT1-SRT-DX )
          methodOut.setDt1SrtDate(methodOut.getDt1SrtDx() - 1,methodOut.getDate9());
//  MOVE DT1-CLM-PROC-TM (1) (1 : 2) TO WS-TIME-X (1 : 2)
          methodOut.setTimeX(replace(methodOut.getTimeX(),substring(methodOut.getDt1ClmProcTm(0),0,2),0,2));
//  MOVE DT1-CLM-PROC-TM (1) (4 : 2) TO WS-TIME-X (3 : 2)
          methodOut.setTimeX(replace(methodOut.getTimeX(),substring(methodOut.getDt1ClmProcTm(0),3,5),2,4));
//  MOVE DT1-CLM-PROC-TM (1) (7 : 2) TO WS-TIME-X (5 : 2)
          methodOut.setTimeX(replace(methodOut.getTimeX(),substring(methodOut.getDt1ClmProcTm(0),6,8),4,6));
//  MOVE HVA-PGM-ID-LST-CHAR-VAL ( HVA-SUB ) TO WS-LAST-BIT-X
          methodOut.setLastBitX(methodOut.getHvaPgmIdLstCharVal(methodIn.getHvaSub() - 1));
          methodOut.setDt1SrtTime(methodOut.getDt1SrtDx() - 1,(long) (Math.abs( ( methodIn.getTime9() * 10 )  + methodIn.getLastBit9())));
//  MOVE HVA-BANK-CD ( HVA-SUB ) TO WS-NUM-3-X
          methodOut.setNum3X(methodOut.getHvaBankCd(methodIn.getHvaSub() - 1));
//  IF WS-NUM-3 NUMERIC
          if (    isNumeric(methodIn.getNum3())) { 
//  MOVE WS-NUM-3-9 TO DT1-SRT-BANK-CODE ( DT1-SRT-DX )
              methodOut.setDt1SrtBankCode(methodOut.getDt1SrtDx() - 1,methodOut.getNum39());
          }
//  ELSE
          else { 
//  MOVE ZERO TO DT1-SRT-BANK-CODE ( DT1-SRT-DX )
              methodOut.setDt1SrtBankCode(methodOut.getDt1SrtDx() - 1,0);
          }
//  MOVE DT1-CLM-DRAFT-NO (1) TO DT1-SRT-DRAFT ( DT1-SRT-DX )
          methodOut.setDt1SrtDraft(methodOut.getDt1SrtDx() - 1,methodOut.getDt1ClmDraftNo(0));
//  MOVE WS-PAYEE-CODE TO DT1-SRT-PAYEE-CODE ( DT1-SRT-DX )
          methodOut.setDt1SrtPayeeCode(methodOut.getDt1SrtDx() - 1,methodOut.getPayeeCode());
//  MOVE ZERO TO DT1-SRT-LINE-SEQUENCE ( DT1-SRT-DX )
          methodOut.setDt1SrtLineSequence(methodOut.getDt1SrtDx() - 1,0);
//  EVALUATE HVA-RMRK-CD ( HVA-SUB )
          switch(new String(methodOut.getHvaRmrkCd(methodIn.getHvaSub() - 1))){
          	case "68 ":
//  MOVE '68' TO DT1-SRT-TRAN-CODE ( DT1-SRT-DX )
//  LITERAL_68 = '68'
              methodOut.setDt1SrtTranCode(methodOut.getDt1SrtDx() - 1,CONSTANTS.LITERAL_68);
          break;
          	case "69 ":
//  MOVE '69' TO DT1-SRT-TRAN-CODE ( DT1-SRT-DX )
//  LITERAL_69 = '69'
              methodOut.setDt1SrtTranCode(methodOut.getDt1SrtDx() - 1,CONSTANTS.LITERAL_69);
          break;
          	case "42 ":
//  MOVE '72' TO DT1-SRT-TRAN-CODE ( DT1-SRT-DX )
//  LITERAL_72 = '72'
              methodOut.setDt1SrtTranCode(methodOut.getDt1SrtDx() - 1,CONSTANTS.LITERAL_72);
          break;
          	case "74 ":
//  MOVE '74' TO DT1-SRT-TRAN-CODE ( DT1-SRT-DX )
//  LITERAL_74 = '74'
              methodOut.setDt1SrtTranCode(methodOut.getDt1SrtDx() - 1,CONSTANTS.LITERAL_74);
          break;
          	case "76 ":
//  MOVE '76' TO DT1-SRT-TRAN-CODE ( DT1-SRT-DX )
//  LITERAL_76 = '76'
              methodOut.setDt1SrtTranCode(methodOut.getDt1SrtDx() - 1,CONSTANTS.LITERAL_76);
          break;
          	case "79 ":
//  MOVE '79' TO DT1-SRT-TRAN-CODE ( DT1-SRT-DX )
//  LITERAL_79 = '79'
              methodOut.setDt1SrtTranCode(methodOut.getDt1SrtDx() - 1,CONSTANTS.LITERAL_79);
          break;
          	case "70 ":
//  MOVE '70' TO DT1-SRT-TRAN-CODE ( DT1-SRT-DX )
//  LITERAL_70 = '70'
              methodOut.setDt1SrtTranCode(methodOut.getDt1SrtDx() - 1,CONSTANTS.LITERAL_70);
          break;
          	case "78 ":
//  MOVE '78' TO DT1-SRT-TRAN-CODE ( DT1-SRT-DX )
//  LITERAL_78 = '78'
              methodOut.setDt1SrtTranCode(methodOut.getDt1SrtDx() - 1,CONSTANTS.LITERAL_78);
          break;
          	case "37 ":
//  MOVE '37' TO DT1-SRT-TRAN-CODE ( DT1-SRT-DX )
//  LITERAL_37 = '37'
              methodOut.setDt1SrtTranCode(methodOut.getDt1SrtDx() - 1,CONSTANTS.LITERAL_37);
          break;
          	case "67 ":
//  MOVE '67' TO DT1-SRT-TRAN-CODE ( DT1-SRT-DX )
//  LITERAL_67 = '67'
              methodOut.setDt1SrtTranCode(methodOut.getDt1SrtDx() - 1,CONSTANTS.LITERAL_67);
          break;
          	case "75 ":
          
          	case "84 ":
          
          	case "87 ":
//  MOVE HVA-RMRK-CD ( HVA-SUB ) TO DT1-SRT-TRAN-CODE ( DT1-SRT-DX )
              methodOut.setDt1SrtTranCode(methodOut.getDt1SrtDx() - 1,methodOut.getHvaRmrkCd(methodIn.getHvaSub() - 1));
          break;
          default :
//  MOVE SPACE TO DT1-SRT-TRAN-CODE ( DT1-SRT-DX )
              methodOut.setDt1SrtTranCode(methodOut.getDt1SrtDx() - 1,CONSTANTS.SPACE_2);
          }
//  MOVE DT1-CLM-ADJ-NBR (1) TO DT1-SRT-APPROVER-ALT-ID ( DT1-SRT-DX )
          methodOut.setDt1SrtApproverAltId(methodOut.getDt1SrtDx() - 1, methodOut.getDt1ClmAdjNbr(0));

// * Expanded srt- data for summirazition breaks
//  MOVE DT1-CLM-HEADER-CT (1) TO DT1-SRT-HEADER-CT ( DT1-SRT-DX )
          methodOut.setDt1SrtHeaderCt(methodOut.getDt1SrtDx() - 1,methodOut.getDt1ClmHeaderCt(0));
//  MOVE DT1-CLM-PROVIDER-ID (1) TO WS-NUM-15
          methodOut.getNum15().setString(methodOut.getDt1ClmProviderId(0).toCharArray());
//  MOVE WS-NUM-15-9 TO DT1-SRT-PROVIDER-ID ( DT1-SRT-DX )
          methodOut.setDt1SrtProviderId(methodOut.getDt1SrtDx() - 1,methodOut.getNum159());
//  MOVE DT1-CLM-SUFFIX-CD (1) TO DT1-SRT-SUFFIX-CD ( DT1-SRT-DX )
          methodOut.setDt1SrtSuffixCd(methodOut.getDt1SrtDx() - 1,methodOut.getDt1ClmSuffixCd(0));

// * Additional fields returned to f5683dt1
//  MOVE HVA-DIV-NBR ( HVA-SUB ) TO DT1-SRT-DIV-NBR ( DT1-SRT-DX )
          methodOut.setDt1SrtDivNbr(methodOut.getDt1SrtDx() - 1,methodOut.getHvaDivNbr(methodIn.getHvaSub() - 1));
//  MOVE HVA-CLS-NBR ( HVA-SUB ) TO DT1-SRT-CLS-NBR ( DT1-SRT-DX )
          methodOut.setDt1SrtClsNbr(methodOut.getDt1SrtDx() - 1,methodOut.getHvaClsNbr(methodIn.getHvaSub() - 1));
//  SET DT1-SRT-CLM-ITEM ( DT1-SRT-DX ) TO DT1-SRT-DX
          methodOut.setDt1SrtClmItem(methodOut.getDt1SrtDx() - 1,(short) (short) methodOut.getDt1SrtDx()); 
          
          methodOut.setDt1SrtClmItem(methodOut.getDt1SrtDx() - 1,(short) (methodOut.getDt1SrtClmItem(methodOut.getDt1SrtDx() - 1) * -1));
//  INITIALIZE DT1-CLM-CLAIM-ITEM (1)
          methodOut.getDt1ClmClaimItem(0).initialize();
      
      return methodOut;
      }
      /**
      * putD5427dt1RspSect 
      *   This method is derived from 
  *   COBOL Paragraph - 8130-PUT-D5427DT1-RSP-SECT SECTION COBOL Cyclomatic complexity - 6
      * Input  :  

      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      * - dt1RspExplanationCode          COBOL Name: DT1-RSP-EXPLANATION-CODE
      * - dt1RspRespCode                 COBOL Name: DT1-RSP-RESP-CODE
      * - dt1RspContainerName            COBOL Name: DT1-RSP-CONTAINER-NAME
      * - dt1RspContainerLayout          COBOL Name: DT1-RSP-CONTAINER-LAYOUT
      *
      * Output :  

      * - currentContainerName           COBOL Name: CURRENT-CONTAINER-NAME
      * - dt1RspContainerName            COBOL Name: DT1-RSP-CONTAINER-NAME
      * - dt1RspContainerLength          COBOL Name: DT1-RSP-CONTAINER-LENGTH
      * - currentContainerLength         COBOL Name: CURRENT-CONTAINER-LENGTH
      * - currentContainerLayout         COBOL Name: CURRENT-CONTAINER-LAYOUT
      * - dt1RspContainerLayout          COBOL Name: DT1-RSP-CONTAINER-LAYOUT
      * - cicsresp                       COBOL Name: CICSRESP
      * - cicsresp2                      COBOL Name: CICSRESP2
      * - stsResponseVars                COBOL Name: STS-RESPONSE-VARS
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      * - dt1RspExplanationCode          COBOL Name: DT1-RSP-EXPLANATION-CODE
      * - stsRespCode                    COBOL Name: STS-RESP-CODE
      * - dt1RspRespCode                 COBOL Name: DT1-RSP-RESP-CODE
      * - dt1RspErrSection               COBOL Name: DT1-RSP-ERR-SECTION
      * - stsCicsresp                    COBOL Name: STS-CICSRESP
      * - stsCicsresp2                   COBOL Name: STS-CICSRESP2
      * - stsEibtaskn                    COBOL Name: STS-EIBTASKN
      * - stsRespMessageType             COBOL Name: STS-RESP-MESSAGE-TYPE
      * - stsRespAdditionalInfo1         COBOL Name: STS-RESP-ADDITIONAL-INFO-1
      *
      * @throws CFException
      */
      @Override
      public PutD5427dt1RspSectOutCtx putD5427dt1RspSect(PutD5427dt1RspSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81 8130-Put-d5427dt1-rsp-sect                                   *
// *81                                                              *
// *81 business function:                                           *
// *81 put the d5427dt1-rsp container (required response container) *
// *82***************************************************************
// *82 called by :  0000-mainline                                   *
// *82 calls     :  8131-put-d5427dt1-sts-sect                      *
// *82***************************************************************
// *================================================================

// * Return sts container with diagnostics unless all is well
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
PutD5427dt1RspSectOutCtx methodOut = methodIn.getPutD5427dt1RspSectOutCtx();
//  IF DT1-RSP-OK AND DT1-RSP-EXPL-OK AND DT1-RSP-GOOD-RETURN
//  ELSE
          if (!(methodIn.isDt1RspOk())  || !(methodIn.isDt1RspExplOk())  || !(methodIn.isDt1RspGoodReturn()) ) { 
//  PERFORM 8131-PUT-D5427DT1-STS-SECT
              putD5427dt1StsSect(programCtx.getPutD5427dt1StsSectInCtx());/*8131-PUT-D5427DT1-STS-SECT SECTION*/
          }
//  MOVE DT1-RSP-CONTAINER-NAME TO CURRENT-CONTAINER-NAME
          methodOut.setCurrentContainerName(methodOut.getDt1RspContainerName());
//  MOVE LENGTH OF DT1-RSP-CONTAINER TO DT1-RSP-CONTAINER-LENGTH
          methodOut.setDt1RspContainerLength(Dt1RspContainer.getDt1RspContainerFieldLength());
//  MOVE DT1-RSP-CONTAINER-LENGTH TO CURRENT-CONTAINER-LENGTH
          methodOut.setCurrentContainerLength(methodOut.getDt1RspContainerLength());
//  MOVE DT1-RSP-CONTAINER-LAYOUT TO CURRENT-CONTAINER-LAYOUT
          methodOut.setCurrentContainerLayout(methodOut.getDt1RspContainerLayout());
//  PUT CONTAINER (CURRENT-CONTAINER-NAME) FLENGTH (CURRENT-CONTAINER-LENGTH) FROM (DT1-RSP-CONTAINER) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // PUT CONTAINER (CURRENT-CONTAINER-NAME) FLENGTH (CURRENT-CONTAINER-LENGTH) FROM (DT1-RSP-CONTAINER) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // write data to a container
          	programCtx.getGlobalCtx().addContainer(String.valueOf(methodOut.getCurrentContainerName()).trim(),methodIn.getDt1RspContainer().toCharArray());
          
          methodOut.setCicsresp(programCtx.getCicsSession().getEibresp());
          methodOut.setCicsresp2(programCtx.getCicsSession().getEibresp2());
          	
//  MOVE EIBRESP TO CICSRESP
          methodOut.setCicsresp(programCtx.getCicsSession().getEibresp());
//  MOVE EIBRESP2 TO CICSRESP2
          methodOut.setCicsresp2(programCtx.getCicsSession().getEibresp2());

// * Dfhresp(normal) = 0                       inserted by translator

// * Dfhresp(normal) = 0                       inserted by translator
//  IF ( CICSRESP = 0 AND CICSRESP2 = 0 )
//  ELSE
          if ((	( methodOut.getCicsresp() != 0 ) || 	( methodOut.getCicsresp2() != 0 ))) { 
//  INITIALIZE STS-RESPONSE-VARS
              methodOut.getStsResponseVars().initialize();
//  SET DT1-RSP-FAIL TO TRUE
              methodOut.setDt1RspFailTrue(); 
              
//  SET DT1-RSP-SEE-VIEW-FOR-MORE-INFO TO TRUE
              methodOut.setDt1RspSeeViewForMoreInfoTrue(); 
              
//  SET STS-RESP-CODE-PUT-ERROR TO TRUE
              methodOut.setStsRespCodePutErrorTrue(); 
              
//  MOVE STS-RESP-CODE TO DT1-RSP-RESP-CODE
              methodOut.setDt1RspRespCode(padLeftZeros(4,methodOut.getStsRespCode(),false));
//  MOVE '8130-PUT' TO DT1-RSP-ERR-SECTION
//  LITERAL_8130_MN_PUT = '8130-PUT'
              methodOut.setDt1RspErrSection(CONSTANTS.LITERAL_8130_MN_PUT);
              // MOVE CICSRESP TO STS-CICSRESP
              methodOut.setStsCicsresp(methodOut.getCicsresp());
              // MOVE CICSRESP2 TO STS-CICSRESP2
              methodOut.setStsCicsresp2(methodOut.getCicsresp2());
//  MOVE EIBTASKN TO STS-EIBTASKN
              methodOut.setStsEibtaskn(programCtx.getCicsSession().getEibtaskn());
//  SET STS-RESP-MESSAGE-CICS TO TRUE
              methodOut.setStsRespMessageCicsTrue(); 
              
//  MOVE 'D5427DT1-RSP; CICS PUT CONTAINER ERROR' TO STS-RESP-ADDITIONAL-INFO-1
              methodOut.setStsRespAdditionalInfo1(CONSTANTS.LITERAL_330525875);
          }
      
      return methodOut;
      }
      /**
      * putD5427dt1StsSect 
      *   This method is derived from 
  *   COBOL Paragraph - 8131-PUT-D5427DT1-STS-SECT SECTION COBOL Cyclomatic complexity - 3
      * Input  :  

      * - stsContainerName               COBOL Name: STS-CONTAINER-NAME
      * - stsContainerLayout             COBOL Name: STS-CONTAINER-LAYOUT
      *
      * Output :  

      * - currentContainerName           COBOL Name: CURRENT-CONTAINER-NAME
      * - stsContainerName               COBOL Name: STS-CONTAINER-NAME
      * - stsContainerLength             COBOL Name: STS-CONTAINER-LENGTH
      * - currentContainerLength         COBOL Name: CURRENT-CONTAINER-LENGTH
      * - currentContainerLayout         COBOL Name: CURRENT-CONTAINER-LAYOUT
      * - stsContainerLayout             COBOL Name: STS-CONTAINER-LAYOUT
      * - cicsresp                       COBOL Name: CICSRESP
      * - cicsresp2                      COBOL Name: CICSRESP2
      * - stsResponseVars                COBOL Name: STS-RESPONSE-VARS
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      * - dt1RspExplanationCode          COBOL Name: DT1-RSP-EXPLANATION-CODE
      * - stsRespCode                    COBOL Name: STS-RESP-CODE
      * - dt1RspRespCode                 COBOL Name: DT1-RSP-RESP-CODE
      * - dt1RspErrSection               COBOL Name: DT1-RSP-ERR-SECTION
      * - stsCicsresp                    COBOL Name: STS-CICSRESP
      * - stsCicsresp2                   COBOL Name: STS-CICSRESP2
      * - stsEibtaskn                    COBOL Name: STS-EIBTASKN
      * - stsRespMessageType             COBOL Name: STS-RESP-MESSAGE-TYPE
      * - stsRespAdditionalInfo1         COBOL Name: STS-RESP-ADDITIONAL-INFO-1
      *
      * @throws CFException
      */
      @Override
      public PutD5427dt1StsSectOutCtx putD5427dt1StsSect(PutD5427dt1StsSectInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81 8131-Put-d5427dt1-sts-sect                                   *
// *81                                                              *
// *81 business function:                                           *
// *81 put the d5427dt1-sts container (optional response container) *
// *82***************************************************************
// *82 called by :  8130-put-d5427dt1-rsp-sect                      *
// *82 calls     :  none                                            *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
PutD5427dt1StsSectOutCtx methodOut = methodIn.getPutD5427dt1StsSectOutCtx();
//  MOVE STS-CONTAINER-NAME TO CURRENT-CONTAINER-NAME
          methodOut.setCurrentContainerName(methodOut.getStsContainerName());
//  MOVE LENGTH OF STS-CONTAINER TO STS-CONTAINER-LENGTH
          methodOut.setStsContainerLength(StsContainer.getStsContainerFieldLength());
//  MOVE STS-CONTAINER-LENGTH TO CURRENT-CONTAINER-LENGTH
          methodOut.setCurrentContainerLength(methodOut.getStsContainerLength());
//  MOVE STS-CONTAINER-LAYOUT TO CURRENT-CONTAINER-LAYOUT
          methodOut.setCurrentContainerLayout(methodOut.getStsContainerLayout());
//  PUT CONTAINER (CURRENT-CONTAINER-NAME) FLENGTH (CURRENT-CONTAINER-LENGTH) FROM (STS-CONTAINER) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // PUT CONTAINER (CURRENT-CONTAINER-NAME) FLENGTH (CURRENT-CONTAINER-LENGTH) FROM (STS-CONTAINER) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // write data to a container
          	programCtx.getGlobalCtx().addContainer(String.valueOf(methodOut.getCurrentContainerName()).trim(),methodIn.getStsContainer().toCharArray());
          
          methodOut.setCicsresp(programCtx.getCicsSession().getEibresp());
          methodOut.setCicsresp2(programCtx.getCicsSession().getEibresp2());
          	
//  MOVE EIBRESP TO CICSRESP
          methodOut.setCicsresp(programCtx.getCicsSession().getEibresp());
//  MOVE EIBRESP2 TO CICSRESP2
          methodOut.setCicsresp2(programCtx.getCicsSession().getEibresp2());

// * Dfhresp(normal) = 0                       inserted by translator

// * Dfhresp(normal) = 0                       inserted by translator
//  IF ( CICSRESP = 0 AND CICSRESP2 = 0 )
//  ELSE
          if ((	( methodOut.getCicsresp() != 0 ) || 	( methodOut.getCicsresp2() != 0 ))) { 
//  INITIALIZE STS-RESPONSE-VARS
              methodOut.getStsResponseVars().initialize();
//  SET DT1-RSP-FAIL TO TRUE
              methodOut.setDt1RspFailTrue(); 
              
//  SET DT1-RSP-SEE-VIEW-FOR-MORE-INFO TO TRUE
              methodOut.setDt1RspSeeViewForMoreInfoTrue(); 
              
//  SET STS-RESP-CODE-PUT-ERROR TO TRUE
              methodOut.setStsRespCodePutErrorTrue(); 
              
//  MOVE STS-RESP-CODE TO DT1-RSP-RESP-CODE
              methodOut.setDt1RspRespCode(padLeftZeros(4,methodOut.getStsRespCode(),false));
//  MOVE '8131-PUT' TO DT1-RSP-ERR-SECTION
//  LITERAL_8131_MN_PUT = '8131-PUT'
              methodOut.setDt1RspErrSection(CONSTANTS.LITERAL_8131_MN_PUT);
              // MOVE CICSRESP TO STS-CICSRESP
              methodOut.setStsCicsresp(methodOut.getCicsresp());
              // MOVE CICSRESP2 TO STS-CICSRESP2
              methodOut.setStsCicsresp2(methodOut.getCicsresp2());
//  MOVE EIBTASKN TO STS-EIBTASKN
              methodOut.setStsEibtaskn(programCtx.getCicsSession().getEibtaskn());
//  SET STS-RESP-MESSAGE-CICS TO TRUE
              methodOut.setStsRespMessageCicsTrue(); 
              
//  MOVE 'D5427DT1-STS; CICS PUT CONTAINER ERROR' TO STS-RESP-ADDITIONAL-INFO-1
              methodOut.setStsRespAdditionalInfo1(CONSTANTS.LITERAL_1912682608);
          }
      
      return methodOut;
      }
      /**
      * databaseErrorSect 
      *   This method is derived from 
  *   COBOL Paragraph - 9100-DATABASE-ERROR-SECT SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - db2Resource                    COBOL Name: DB2-RESOURCE
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - asnInvokingprog                COBOL Name: ASN-INVOKINGPROG
      * - db2Action                      COBOL Name: DB2-ACTION
      * - thisProgram                    COBOL Name: THIS-PROGRAM
      * - cicsresp                       COBOL Name: CICSRESP
      * - cicsresp2                      COBOL Name: CICSRESP2
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - iSub                           COBOL Name: I-SUB
      * - db2ErrMsgText                  COBOL Name: DB2-ERR-MSG-TEXT
      *
      * Output :  

      * - stsResponseVars                COBOL Name: STS-RESPONSE-VARS
      * - dt1RspReturnCode               COBOL Name: DT1-RSP-RETURN-CODE
      * - dt1RspExplanationCode          COBOL Name: DT1-RSP-EXPLANATION-CODE
      * - stsRespCode                    COBOL Name: STS-RESP-CODE
      * - dt1RspRespCode                 COBOL Name: DT1-RSP-RESP-CODE
      * - stsDsmErrTblName               COBOL Name: STS-DSM-ERR-TBL-NAME
      * - db2Resource                    COBOL Name: DB2-RESOURCE
      * - dt1RspErrSection               COBOL Name: DT1-RSP-ERR-SECTION
      * - stsDsmErrSectnName             COBOL Name: STS-DSM-ERR-SECTN-NAME
      * - db2Paragraph                   COBOL Name: DB2-PARAGRAPH
      * - dsmErrClngPgmName              COBOL Name: DSM-ERR-CLNG-PGM-NAME
      * - stsDsmErrClngPgmName           COBOL Name: STS-DSM-ERR-CLNG-PGM-NAME
      * - asnInvokingprog                COBOL Name: ASN-INVOKINGPROG
      * - stsDsmErrTblAction             COBOL Name: STS-DSM-ERR-TBL-ACTION
      * - db2Action                      COBOL Name: DB2-ACTION
      * - stsDsmErrPgmName               COBOL Name: STS-DSM-ERR-PGM-NAME
      * - thisProgram                    COBOL Name: THIS-PROGRAM
      * - stsCicsresp                    COBOL Name: STS-CICSRESP
      * - cicsresp                       COBOL Name: CICSRESP
      * - stsCicsresp2                   COBOL Name: STS-CICSRESP2
      * - cicsresp2                      COBOL Name: CICSRESP2
      * - stsEibtaskn                    COBOL Name: STS-EIBTASKN
      * - dt1RspSqlCode                  COBOL Name: DT1-RSP-SQL-CODE
      * - stsSqlcode                     COBOL Name: STS-SQLCODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - stsDsmSqlErrorMessage          COBOL Name: STS-DSM-SQL-ERROR-MESSAGE
      * - rc                             COBOL Name: RETURN-CODE
      * - iSub                           COBOL Name: I-SUB
      * - stsDsmFrmtdSqlErrMsg           COBOL Name: STS-DSM-FRMTD-SQL-ERR-MSG
      * - db2ErrMsgText                  COBOL Name: DB2-ERR-MSG-TEXT
      * - stsRespMessageType             COBOL Name: STS-RESP-MESSAGE-TYPE
      * - stsRespAdditionalInfo1         COBOL Name: STS-RESP-ADDITIONAL-INFO-1
      *
      * @throws CFException
      */
      @Override
      public DatabaseErrorSectOutCtx databaseErrorSect(DatabaseErrorSectInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			boolean overflow = false;
			// End of variable declaration

      
// *81***************************************************************
// *81 9100-Database-error-sect                                     *
// *81                                                              *
// *81 business function:                                           *
// *81 format db2 error information for caller                      *
// *82***************************************************************
// *82 called by :  various                                         *
// *82 calls     :  none                                            *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
DatabaseErrorSectOutCtx methodOut = methodIn.getDatabaseErrorSectOutCtx();
//  INITIALIZE STS-RESPONSE-VARS
          methodOut.getStsResponseVars().initialize();
//  SET DT1-RSP-FAIL TO TRUE
          methodOut.setDt1RspFailTrue(); 
          
//  SET DT1-RSP-SEE-VIEW-FOR-MORE-INFO TO TRUE
          methodOut.setDt1RspSeeViewForMoreInfoTrue(); 
          
//  SET STS-RESP-CODE-DB2-ERROR TO TRUE
          methodOut.setStsRespCodeDb2ErrorTrue(); 
          
//  MOVE STS-RESP-CODE TO DT1-RSP-RESP-CODE
          methodOut.setDt1RspRespCode(padLeftZeros(4,methodOut.getStsRespCode(),false));
//  MOVE DB2-RESOURCE TO STS-DSM-ERR-TBL-NAME
          methodOut.setStsDsmErrTblName(methodOut.getDb2Resource());
//  MOVE DB2-PARAGRAPH TO DT1-RSP-ERR-SECTION , STS-DSM-ERR-SECTN-NAME
          methodOut.setDt1RspErrSection(methodOut.getDb2Paragraph());
          methodOut.setStsDsmErrSectnName(methodOut.getDb2Paragraph());
//  MOVE ASN-INVOKINGPROG TO DSM-ERR-CLNG-PGM-NAME , STS-DSM-ERR-CLNG-PGM-NAME
          methodOut.setDsmErrClngPgmName(methodOut.getAsnInvokingprog());
          methodOut.setStsDsmErrClngPgmName(methodOut.getAsnInvokingprog());
//  MOVE DB2-ACTION TO STS-DSM-ERR-TBL-ACTION
          methodOut.setStsDsmErrTblAction(methodOut.getDb2Action());
//  MOVE THIS-PROGRAM TO STS-DSM-ERR-PGM-NAME
          methodOut.setStsDsmErrPgmName(methodOut.getThisProgram());
          // MOVE CICSRESP TO STS-CICSRESP
          methodOut.setStsCicsresp(methodOut.getCicsresp());
          // MOVE CICSRESP2 TO STS-CICSRESP2
          methodOut.setStsCicsresp2(methodOut.getCicsresp2());
//  MOVE EIBTASKN TO STS-EIBTASKN
          methodOut.setStsEibtaskn(programCtx.getCicsSession().getEibtaskn());
//  MOVE WS-SQLCODE TO DT1-RSP-SQL-CODE , STS-SQLCODE
          methodOut.setDt1RspSqlCode( methodOut.getSqlcode_Ws());
          methodOut.setStsSqlcode( methodOut.getSqlcode_Ws());
//  INITIALIZE STS-DSM-SQL-ERROR-MESSAGE
          methodOut.setStsDsmSqlErrorMessage(CONSTANTS.SPACE_120 /* Fill 120 Spaces*/);
//  CALL DSNTIAR USING SQLCA , DB2-ERR-MSG , DB2-ERR-MSG-TEXT-LEN END-CALL
          // CALL DSNTIAR USING SQLCA , DB2-ERR-MSG , DB2-ERR-MSG-TEXT-LEN END-CALL
          // db2 error handling
          db2ErrorLogger(programCtx.getSqlca(),methodOut.getDb2ErrMsg(),methodOut.getDb2ErrMsgTextLen());
//  PERFORM WITH TEST BEFORE VARYING I-SUB FROM 1 BY +1 UNTIL I-SUB > +10
          for (methodOut.setISub((short)1); (	( methodOut.getISub() <= 10 ) ) ; methodOut.setISub((short)(methodOut.getISub() + 1)) ) {
//  MOVE DB2-ERR-MSG-TEXT ( I-SUB ) TO STS-DSM-FRMTD-SQL-ERR-MSG ( I-SUB )
              methodOut.setStsDsmFrmtdSqlErrMsg(methodOut.getISub() - 1,methodOut.getDb2ErrMsgText(methodOut.getISub() - 1));
          }
//  SET STS-RESP-MESSAGE-DB2 TO TRUE
          methodOut.setStsRespMessageDb2True(); 
          
//  MOVE +1 TO I-SUB
          methodOut.setISub((short)1);
//  STRING 'DB2 ERROR ' , '-PROG->' , THIS-PROGRAM , '-PARA->' , DB2-PARAGRAPH , '-SQLC->' , STS-SQLCODE DELIMITED BY SIZE INTO STS-RESP-ADDITIONAL-INFO-1 WITH POINTER I-SUB
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_DB2_B2_ERROR);
             charArray.add(CONSTANTS.LITERAL_201703500);
             charArray.add(methodOut.getThisProgram());
             charArray.add(CONSTANTS.LITERAL_282400250);
             charArray.add(methodOut.getDb2Paragraph());
             charArray.add(CONSTANTS.LITERAL_1462271631);
             charArray.add(String.valueOf(methodOut.getStsSqlcodeString()).toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6));
          updated = updateString(methodOut.getStsRespAdditionalInfo1() ,joinCharArray ,(methodOut.getISub()-1));
          methodOut.setStsRespAdditionalInfo1(   (char[])updated.get("string"));
          methodOut.setISub((short)(int)updated.get("startAt"));
          overflow = (boolean)updated.get("exceeds");
          if (overflow) {
          //  ON OVERFLOW
               ;
           }
      
      return methodOut;
      }
      /**
      * convertYyddd2IsoSect 
      *   This method is derived from 
  *   COBOL Paragraph - 9800-CONVERT-YYDDD-2-ISO-SECT SECTION COBOL Cyclomatic complexity - 1
      * Input  :  

      * - fmtYyddd                       COBOL Name: FMT-YYDDD
      * - fmtYyyyMmDd                    COBOL Name: FMT-YYYY-MM-DD
      * - defaultDateDb2                 COBOL Name: DEFAULT-DATE-DB2
      *
      * Output :  

      * - fc                             COBOL Name: FC
      * - iPicstrString                  COBOL Name: I-PICSTR-STRING
      * - fmtYyddd                       COBOL Name: FMT-YYDDD
      * - iPicstrLength                  COBOL Name: I-PICSTR-LENGTH
      * - oPicstrString                  COBOL Name: O-PICSTR-STRING
      * - fmtYyyyMmDd                    COBOL Name: FMT-YYYY-MM-DD
      * - oPicstrLength                  COBOL Name: O-PICSTR-LENGTH
      * - defaultDate                    COBOL Name: WS-DEFAULT-DATE
      * - defaultDateDb2                 COBOL Name: DEFAULT-DATE-DB2
      *
      * @throws CFException
      */
      @Override
      public ConvertYyddd2IsoSectOutCtx convertYyddd2IsoSect(ConvertYyddd2IsoSectInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int FMT_YYDDD_LENGTH = 5;
			 final int FMT_YYYY_MM_DD_LENGTH = 10;
			// End of variable declaration

      
// *81***************************************************************
// *81 9800-Convert-yyddd-2-iso-sect                                *
// *81                                                              *
// *81 business function: convert julian date to ccyy-mm-dd         *
// *82***************************************************************
// *82 called by : 4610-move-claim-data-sect                        *
// *82 calls     : 9810-convert-date-sect                           *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ConvertYyddd2IsoSectOutCtx methodOut = methodIn.getConvertYyddd2IsoSectOutCtx();
//  MOVE ZERO TO FC
          methodOut.getFc().setString(CONSTANTS.ZERO_8);
//  MOVE FMT-YYDDD TO I-PICSTR-STRING
          methodOut.setIPicstrString(pad(80,methodOut.getFmtYyddd(),SPACE_CHAR,RIGHT_PAD));
//  MOVE LENGTH OF FMT-YYDDD TO I-PICSTR-LENGTH
          methodOut.setIPicstrLength((short) FMT_YYDDD_LENGTH);
//  MOVE FMT-YYYY-MM-DD TO O-PICSTR-STRING
          methodOut.setOPicstrString(pad(80,methodOut.getFmtYyyyMmDd(),SPACE_CHAR,RIGHT_PAD));
//  MOVE LENGTH OF FMT-YYYY-MM-DD TO O-PICSTR-LENGTH
          methodOut.setOPicstrLength((short) FMT_YYYY_MM_DD_LENGTH);
          // MOVE DEFAULT-DATE-DB2 TO WS-DEFAULT-DATE
          methodOut.setDefaultDate(methodOut.getDefaultDateDb2());
//  PERFORM 9810-CONVERT-DATE-SECT
          convertDateSect(programCtx.getConvertDateSectInCtx());/*9810-CONVERT-DATE-SECT SECTION*/
      
      return methodOut;
      }
      /**
      * convertDateSect 
      *   This method is derived from 
  *   COBOL Paragraph - 9810-CONVERT-DATE-SECT SECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - conditionTokenValue            COBOL Name: CONDITION-TOKEN-VALUE
      * - defaultDate                    COBOL Name: WS-DEFAULT-DATE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - formattedDate                  COBOL Name: FORMATTED-DATE
      * - defaultDate                    COBOL Name: WS-DEFAULT-DATE
      *
      * @throws CFException
      */
      @Override
      public ConvertDateSectOutCtx convertDateSect(ConvertDateSectInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			DateTimeVariable dateTimeVariable = new DateTimeVariable(timeZoneId);
			// End of variable declaration

      
// *81***************************************************************
// *81 9810-Convert-date-sect                                       *
// *81                                                              *
// *81 business function: call ceedate                              *
// *82***************************************************************
// *82 called by : 9800-convert-yyddd-2-iso-sect                    *
// *82 calls     : 9820-call-ceedays-sect                           *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
ConvertDateSectOutCtx methodOut = methodIn.getConvertDateSectOutCtx();
//  PERFORM 9820-CALL-CEEDAYS-SECT
          callCeedaysSect(programCtx.getCallCeedaysSectInCtx());/*9820-CALL-CEEDAYS-SECT SECTION*/
//  IF CEE000
          if ( methodIn.isCee000()  ) { 
//  CALL CEEDATE USING LILIAN, O-PICSTR , FORMATTED-DATE , OMITTED_1 END-CALL
              // CALL CEEDATE USING LILIAN, O-PICSTR , FORMATTED-DATE , OMITTED_1 END-CALL
              dateTimeVariable.setLilianDays(Field.getLongBinary(methodOut.getLilianGroup()));
              dateTimeVariable.setDateFormat(methodOut.getOPicstr().toString());
              MiscFunctions.ceedate(dateTimeVariable);
              methodOut.getFormattedDateGroup().setString(dateTimeVariable.getDateAsString() );
          }
//  ELSE
          else { 
//  MOVE WS-DEFAULT-DATE TO FORMATTED-DATE
              methodOut.setFormattedDate(methodOut.getDefaultDate());
          }
      
      return methodOut;
      }
      /**
      * callCeedaysSect 
      *   This method is derived from 
  *   COBOL Paragraph - 9820-CALL-CEEDAYS-SECT SECTION COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public CallCeedaysSectOutCtx callCeedaysSect(CallCeedaysSectInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			DateTimeVariable dateTimeVariable = new DateTimeVariable(timeZoneId);
			// End of variable declaration

      
// *81***************************************************************
// *81 9820-Call-ceedays-sect                                       *
// *81                                                              *
// *81 business function: call ceedays                              *
// *82***************************************************************
// *82 called by :  9810-convert-date-sect                          *
// *82 calls     :  none                                            *
// *82***************************************************************
// *================================================================
D5427dt1Ctx programCtx = methodIn.getD5427dt1Ctx();
CallCeedaysSectOutCtx methodOut = methodIn.getCallCeedaysSectOutCtx();
//  CALL CEEDAYS USING CHRDATE, I-PICSTR , LILIAN, FC END-CALL
          // CALL CEEDAYS USING CHRDATE, I-PICSTR , LILIAN, FC END-CALL
          dateTimeVariable.setDateAsString(methodOut.getChrdate().toString());
          dateTimeVariable.setDateFormat(methodOut.getIPicstr().toString());
          MiscFunctions.ceedays(dateTimeVariable);
          methodOut.getLilianGroup().setLilian(dateTimeVariable.getLilianDays());
          methodOut.getFc().setString(dateTimeVariable.getFeedBackCode() );
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      D5427dt1Ctx programCtx = (D5427dt1Ctx) ctx;
      
      int len = params.length;
         if (len > 1 && params[1] != null )
            programCtx.getDfhcommareaGroup().set((Field)params[1]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      D5427dt1Ctx programCtx = (D5427dt1Ctx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 1:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof DfhcommareaGroup) {
                       	programCtx.setDfhcommareaGroup((DfhcommareaGroup) parameters[index]);
                  	} else {
                       	programCtx.getDfhcommareaGroup().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
      public void setFromVp776a00(D5427dt1Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 2)
         if(params[2] instanceof Field) 
   programCtx.getSrpSortRequestParameters().setString(((Field)params[2] ).toCharArray());
 else    programCtx.getSrpSortRequestParameters().setString((char[])params[2] );
         if (len > 3)
         if(params[3] instanceof Field) 
   programCtx.getDt1SrtContainer().getDt1SrtVariableArea().getDt1SrtArray().setString(((Field)params[3] ).toCharArray());
 else    programCtx.getDt1SrtContainer().getDt1SrtVariableArea().getDt1SrtArray().setString((char[])params[3] );
      }
      public void setFromDsntiar(D5427dt1Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getSqlca().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getSqlca().setString((char[])params[0] );
         if (len > 1)
         if(params[1] instanceof Field) 
   programCtx.getDb2ErrMsg().setString(((Field)params[1] ).toCharArray());
 else    programCtx.getDb2ErrMsg().setString((char[])params[1] );
         if (len > 2)
            programCtx.getDb2ErrMsg().setDb2ErrMsgTextLen((int)params[2] );
      }
  
        /**
         * This method calls DsntiarUtil class and prepare error message in a similar format as the mainframe output.
         * @param sqlca
         * @param errorMessage
         * @param messageLen
         */
      
          private void db2ErrorLogger(Sqlca sqlca, Db2ErrMsg errorMessage, int messageLen) throws CFException {
                  List<String> list = null;
                  list = DsntiarUtil.dsntiarInfo(sqlca.getSqlcode(), sqlca.getSqlext().getSqlstate(), sqlca.getSqlerrp(), sqlca.getSqlerrm().getSqlerrmc(), sqlca.getSqlerrd(), messageLen);
                  if (list != null && !list.isEmpty()) {
                      for (int i = 0; i < errorMessage.db2ErrMsgTextSize() && i < list.size(); i++) {
                          errorMessage.setDb2ErrMsgText(i, list.get(i).toCharArray());
                      }
                  }
          }
  
  
  
  
  }
