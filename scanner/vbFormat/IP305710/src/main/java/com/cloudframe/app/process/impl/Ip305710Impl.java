  package com.cloudframe.app.process.impl;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import com.cloudframe.app.ip305710.Ip305710Ctx.*;
  import com.cloudframe.app.ip305710.Ip305710Ctx;
  import com.cloudframe.app.process.Ip305710;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.ip305710.dto.*;
  import com.cloudframe.app.ip305710.dto.AbendParaName900;
  import com.cloudframe.app.ip305710.dto.MaxRrnLimitErr620;
  import com.cloudframe.app.ip305710.dto.AbendMessage900;
  import com.cloudframe.app.ip305710.dto.Ip005704TableData;
  import com.cloudframe.app.ip305710.dto.Ip005703TableData;
  import com.cloudframe.app.global.sharedvar.Ip005704EntryFoundGroup;
  import com.cloudframe.app.global.sharedvar.Ip005704SrchProdClassGroup;
  import com.cloudframe.app.global.sharedvar.Ip35501RelativeRecNumGroup;
  import com.cloudframe.app.global.sharedvar.Ip570004TableDataInfo;
  import com.cloudframe.app.global.sharedvar.Ip50004iOneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50004iOneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50004iReadTableIdGroup;
  import com.cloudframe.app.global.sharedvar.Ip50004iOneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005oOneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005oOneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50005oOneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005oClearingDtTm;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.ip305710.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip305710")
  
  public class Ip305710Impl extends CommonProcess implements Ip305710 {
  
  Logger logger = LoggerFactory.getLogger(Ip305710Impl.class);
  
  
  
  
  @Autowired 
  @Qualifier("ip996010")
  Ip996010 ip996010;
  @Autowired 
  @Qualifier("ip610010")
  Ip610010 ip610010;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Ip305710Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM 0000-MAINLINE
          mainline(programCtx);/*0000-MAINLINE*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainline(Ip305710Ctx programCtx) throws Exception {
      
// *----------------------------------------------------------------*
// *  Main process:  process the table 57 records.
// *----------------------------------------------------------------*
//  PERFORM 1000-DISPLAY-EXEC-MSGS
          displayExecMsgs(programCtx.getDisplayExecMsgsInCtx());/*1000-DISPLAY-EXEC-MSGS*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS-0057-ENTRIES
          process0057Entries(programCtx.getProcess0057EntriesInCtx());/*2000-PROCESS-0057-ENTRIES*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * displayExecMsgs 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-DISPLAY-EXEC-MSGS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      * - ip305710300                    COBOL Name: 300-IP305710
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip50004iEffDate                COBOL Name: IP50004I-EFF-DATE
      *
      * Output :  

      * - ptrIp996010800                 COBOL Name: 800-PTR-IP996010
      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - ip305710300                    COBOL Name: 300-IP305710
      * - ip996011PgmVersion             COBOL Name: IP996011-PGM-VERSION
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip996011WhenCompiled           COBOL Name: IP996011-WHEN-COMPILED
      * - rc                             COBOL Name: RETURN-CODE
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - ip570004EffdtTm                COBOL Name: IP570004-EFFDT-TM
      * - ip50004iEffDate                COBOL Name: IP50004I-EFF-DATE
      * - entryLength800                 COBOL Name: 800-ENTRY-LENGTH
      * - length800                      COBOL Name: 800-LENGTH
      * - ip570004Idx                    COBOL Name: IP570004-IDX
      *
      * @throws CFException
      */
      @Override
      public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *If the program is called for the first time, this paragraph will*
// *be performed. it basically displays program execution messages. *
// *it fills the entries in log detail copybook - ip996011          *
// *and displays the details accordingly.                           *
// *----------------------------------------------------------------*
Ip305710Ctx programCtx = methodIn.getIp305710Ctx();
DisplayExecMsgsOutCtx methodOut = methodIn.getDisplayExecMsgsOutCtx();
//  IF 88-100-IT-IS-FIRST-TIME
          if ( methodIn.isItIsFirstTime88100()  ) { 
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
              methodOut.setPtrIp996010800(methodIn.getPgmIp996010300()); 
              
//  MOVE 300-IP305710 TO IP996011-PGM-ID
              methodOut.setIp996011PgmId(methodOut.getIp305710300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
              methodOut.setIp996011PgmVersion(methodOut.getPgmVersion300());
              // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
              //  FORMAT1311677340 = "X(08)BX(08)"
              methodOut.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_603451679));
//  CALL 800-PTR-IP996010
              // CALL 800-PTR-IP996010
              	programCtx.setRc( ip996010.process(programCtx.getGlobalCtx().getContext("IP996010")));
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              methodOut.setItIsNotFirstTime88100True(); 
              
//  MOVE IP50004I-EFF-DATE TO IP570004-EFFDT-TM
              methodOut.setIp570004EffdtTm(methodOut.getIp50004iEffDate());
//  MOVE LENGTH OF IP005704-TABLE-DATA TO 800-ENTRY-LENGTH 800-LENGTH
              methodOut.setEntryLength800(Ip005704TableData.getIp005704TableDataFieldLength());
              methodOut.setLength800(Ip005704TableData.getIp005704TableDataFieldLength());
//  MOVE 0 TO IP570004-IDX
              methodOut.setIp570004Idx((long)0);
          }
      
      return methodOut;
      }
      /**
      * process0057Entries 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESS-0057-ENTRIES COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip50004iOneDayRecLth           COBOL Name: IP50004I-ONE-DAY-REC-LTH
      * - ip50004iTableData              COBOL Name: IP50004I-TABLE-DATA
      * - currPtrLngth800                COBOL Name: 800-CURR-PTR-LNGTH
      * - ip570004Idx                    COBOL Name: IP570004-IDX
      * - start800                       COBOL Name: 800-START
      * - length800                      COBOL Name: 800-LENGTH
      * - ip35501RelativeRecNum          COBOL Name: IP35501-RELATIVE-REC-NUM
      *
      * Output :  

      * - ip005703TableData              COBOL Name: IP005703-TABLE-DATA
      * - ip50004iTableData              COBOL Name: IP50004I-TABLE-DATA
      * - ip005703ProdClass              COBOL Name: IP005703-PROD-CLASS
      * - ip005704ProdClass              COBOL Name: IP005704-PROD-CLASS
      * - ip005703CabCode                COBOL Name: IP005703-CAB-CODE
      * - ip005704CabCode                COBOL Name: IP005704-CAB-CODE
      * - ip005703McAssgnId              COBOL Name: IP005703-MC-ASSGN-ID
      * - ip005704McAssgnId              COBOL Name: IP005704-MC-ASSGN-ID
      * - ip005703OvrdePrtyNum           COBOL Name: IP005703-OVRDE-PRTY-NUM
      * - ip005704OvrdePrtyNum           COBOL Name: IP005704-OVRDE-PRTY-NUM
      * - ip005703FeeCodePtr             COBOL Name: IP005703-FEE-CODE-PTR
      * - ip005704FeeCodePtr             COBOL Name: IP005704-FEE-CODE-PTR
      * - ip570004Tbl57CabGpEntryLt      COBOL Name: IP570004-TBL57-CAB-GP-ENTRY-LT
      * - currPtrLngth800                COBOL Name: 800-CURR-PTR-LNGTH
      * - ip570004IdxMax                 COBOL Name: IP570004-IDX-MAX
      * - ip570004Idx                    COBOL Name: IP570004-IDX
      * - start800                       COBOL Name: 800-START
      * - ip570004Tbl57RelRecNumEnd      COBOL Name: IP570004-TBL57-REL-REC-NUM-END
      * - ip35501RelativeRecNum          COBOL Name: IP35501-RELATIVE-REC-NUM
      *
      * @throws CFException
      */
      @Override
      public Process0057EntriesOutCtx process0057Entries(Process0057EntriesInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *  Process the table 57 records.                                 *
// *----------------------------------------------------------------*
Ip305710Ctx programCtx = methodIn.getIp305710Ctx();
Process0057EntriesOutCtx methodOut = methodIn.getProcess0057EntriesOutCtx();
//  IF IP50004I-ONE-DAY-REC-LTH > ZEROES
          if (	( methodIn.getIp50004iOneDayRecLth() > 0 ) ) { 
//  MOVE IP50004I-TABLE-DATA TO IP005703-TABLE-DATA
              methodOut.getIp005703TableData().setString(methodOut.getIp50004iTableData());
//  MOVE IP005703-PROD-CLASS TO IP005704-PROD-CLASS
              methodOut.setIp005704ProdClass(methodOut.getIp005703ProdClass());
//  MOVE IP005703-CAB-CODE TO IP005704-CAB-CODE
              methodOut.setIp005704CabCode(methodOut.getIp005703CabCode());
//  MOVE IP005703-MC-ASSGN-ID TO IP005704-MC-ASSGN-ID
              methodOut.setIp005704McAssgnId(methodOut.getIp005703McAssgnId());
//  MOVE IP005703-OVRDE-PRTY-NUM TO IP005704-OVRDE-PRTY-NUM
              methodOut.setIp005704OvrdePrtyNum(methodOut.getIp005703OvrdePrtyNum());
//  MOVE IP005703-FEE-CODE-PTR TO IP005704-FEE-CODE-PTR
              methodOut.setIp005704FeeCodePtr(methodOut.getIp005703FeeCodePtr());
//  PERFORM 2100-SAVE-TABLE-ENTRY
              saveTableEntry(programCtx.getSaveTableEntryInCtx());/*2100-SAVE-TABLE-ENTRY*/
          }
//  ELSE
          else { 
//  MOVE 800-CURR-PTR-LNGTH TO IP570004-TBL57-CAB-GP-ENTRY-LT ( IP570004-IDX )
              methodOut.setIp570004Tbl57CabGpEntryLt((int) methodOut.getIp570004Idx() - 1,methodOut.getCurrPtrLngth800());
//  MOVE IP570004-IDX TO IP570004-IDX-MAX
              methodOut.setIp570004IdxMax(methodOut.getIp570004Idx());
//  ADD 800-LENGTH TO 800-START
              methodOut.setStart800(methodOut.getStart800()+(int) methodIn.getLength800());
//  MOVE IP35501-RELATIVE-REC-NUM TO IP570004-TBL57-REL-REC-NUM-END ( IP570004-IDX )
              methodOut.setIp570004Tbl57RelRecNumEnd((int) methodOut.getIp570004Idx() - 1,methodOut.getIp35501RelativeRecNum());
//  PERFORM 8000-POPULATE-OUTPUT-DATA-BLK
              populateOutputDataBlk(programCtx.getPopulateOutputDataBlkInCtx());/*8000-POPULATE-OUTPUT-DATA-BLK*/
          }
      
      return methodOut;
      }
      /**
      * saveTableEntry 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-SAVE-TABLE-ENTRY COBOL Cyclomatic complexity - 7
      * Input  :  

      * - ip005704TableData              COBOL Name: IP005704-TABLE-DATA
      * - ip570004Idx                    COBOL Name: IP570004-IDX
      * - ip570004Tbl57PcCabGrpPtr       COBOL Name: IP570004-TBL57-PC-CAB-GRP-PTR
      * - ip005703Tbl57PcCabGrpPtr       COBOL Name: IP005703-TBL57-PC-CAB-GRP-PTR
      * - currPtrLngth800                COBOL Name: 800-CURR-PTR-LNGTH
      * - length800                      COBOL Name: 800-LENGTH
      * - entryLength800                 COBOL Name: 800-ENTRY-LENGTH
      * - ip35501RelativeRecNum          COBOL Name: IP35501-RELATIVE-REC-NUM
      * - ip570004Tbl57RelRecNumSt       COBOL Name: IP570004-TBL57-REL-REC-NUM-ST
      * - maxRrnLimit300                 COBOL Name: 300-MAX-RRN-LIMIT
      * - para2100300                    COBOL Name: 300-PARA-2100
      * - abendCd3003300                 COBOL Name: 300-ABEND-CD-3003
      * - maxRrnLimitErr620              COBOL Name: 620-MAX-RRN-LIMIT-ERR
      * - start800                       COBOL Name: 800-START
      * - uniqMaxCabPtrErrorCd610        COBOL Name: 610-UNIQ-MAX-CAB-PTR-ERROR-CD
      * - uniqMaxCabPtrErrorMsg610       COBOL Name: 610-UNIQ-MAX-CAB-PTR-ERROR-MSG
      * - maxLength300                   COBOL Name: 300-MAX-LENGTH
      *
      * Output :  

      * - ip50005oTableData              COBOL Name: IP50005O-TABLE-DATA
      * - ip005704TableData              COBOL Name: IP005704-TABLE-DATA
      * - currPtrLngth800                COBOL Name: 800-CURR-PTR-LNGTH
      * - ip570004Tbl57CabGpEntryLt      COBOL Name: IP570004-TBL57-CAB-GP-ENTRY-LT
      * - entryLength800                 COBOL Name: 800-ENTRY-LENGTH
      * - ip570004Tbl57RelRecNumEnd      COBOL Name: IP570004-TBL57-REL-REC-NUM-END
      * - ip35501RelativeRecNum          COBOL Name: IP35501-RELATIVE-REC-NUM
      * - rrnNbr800                      COBOL Name: 800-RRN-NBR
      * - pcCapGrpPtr620                 COBOL Name: 620-PC-CAP-GRP-PTR
      * - ip570004Tbl57PcCabGrpPtr       COBOL Name: IP570004-TBL57-PC-CAB-GRP-PTR
      * - maxRrnLimit620                 COBOL Name: 620-MAX-RRN-LIMIT
      * - maxRrnLimit300                 COBOL Name: 300-MAX-RRN-LIMIT
      * - actualRrnLimit620              COBOL Name: 620-ACTUAL-RRN-LIMIT
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2100300                    COBOL Name: 300-PARA-2100
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCd3003300                 COBOL Name: 300-ABEND-CD-3003
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - maxRrnLimitErr620              COBOL Name: 620-MAX-RRN-LIMIT-ERR
      * - ip570004Idx                    COBOL Name: IP570004-IDX
      * - ip005703Tbl57PcCabGrpPtr       COBOL Name: IP005703-TBL57-PC-CAB-GRP-PTR
      * - ip570004Tbl57RelRecNumSt       COBOL Name: IP570004-TBL57-REL-REC-NUM-ST
      * - ip570004Tbl57CabGpEntrySt      COBOL Name: IP570004-TBL57-CAB-GP-ENTRY-ST
      * - start800                       COBOL Name: 800-START
      * - uniqMaxCabPtrErrorCd610        COBOL Name: 610-UNIQ-MAX-CAB-PTR-ERROR-CD
      * - uniqMaxCabPtrErrorMsg610       COBOL Name: 610-UNIQ-MAX-CAB-PTR-ERROR-MSG
      * - length800                      COBOL Name: 800-LENGTH
      *
      * @throws CFException
      */
      @Override
      public SaveTableEntryOutCtx saveTableEntry(SaveTableEntryInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *  This para saves the optimized table entries.
// *----------------------------------------------------------------*
Ip305710Ctx programCtx = methodIn.getIp305710Ctx();
SaveTableEntryOutCtx methodOut = methodIn.getSaveTableEntryOutCtx();
//  MOVE IP005704-TABLE-DATA TO IP50005O-TABLE-DATA ( 800-START : 800-LENGTH )
          methodOut.setIp50005oTableData(replace(methodOut.getIp50005oTableData(),methodOut.getIp005704TableData().toCharArray(),((int) methodOut.getStart800()-1), (methodOut.getLength800() + ((int) methodOut.getStart800() - 1)) ));
//  IF IP570004-IDX > 0
          if (	( methodOut.getIp570004Idx() > 0 ) ) { 
//  IF IP570004-TBL57-PC-CAB-GRP-PTR ( IP570004-IDX ) = IP005703-TBL57-PC-CAB-GRP-PTR
              if (	( methodOut.getIp570004Tbl57PcCabGrpPtr((int) methodOut.getIp570004Idx() - 1) == methodOut.getIp005703Tbl57PcCabGrpPtr() )) { 
//  ADD 800-LENGTH TO 800-CURR-PTR-LNGTH
                  methodOut.setCurrPtrLngth800(methodOut.getCurrPtrLngth800()+(int) methodOut.getLength800());
              }
//  ELSE
              else { 
//  MOVE 800-CURR-PTR-LNGTH TO IP570004-TBL57-CAB-GP-ENTRY-LT ( IP570004-IDX )
                  methodOut.setIp570004Tbl57CabGpEntryLt((int) methodOut.getIp570004Idx() - 1,methodOut.getCurrPtrLngth800());
//  MOVE 800-ENTRY-LENGTH TO 800-CURR-PTR-LNGTH
                  methodOut.setCurrPtrLngth800((int) methodOut.getEntryLength800());
//  MOVE IP35501-RELATIVE-REC-NUM TO IP570004-TBL57-REL-REC-NUM-END ( IP570004-IDX )
                  methodOut.setIp570004Tbl57RelRecNumEnd((int) methodOut.getIp570004Idx() - 1,methodOut.getIp35501RelativeRecNum());
//  IF IP570004-TBL57-REL-REC-NUM-END ( IP570004-IDX ) >= IP570004-TBL57-REL-REC-NUM-ST ( IP570004-IDX )
                  if (	( methodOut.getIp570004Tbl57RelRecNumEnd((int) methodOut.getIp570004Idx() - 1) >= methodOut.getIp570004Tbl57RelRecNumSt((int) methodOut.getIp570004Idx() - 1) )) { 
//  SUBTRACT IP570004-TBL57-REL-REC-NUM-ST ( IP570004-IDX ) FROM IP570004-TBL57-REL-REC-NUM-END ( IP570004-IDX ) GIVING 800-RRN-NBR
                      methodOut.setRrnNbr800(Math.abs(methodOut.getIp570004Tbl57RelRecNumEnd((int) methodOut.getIp570004Idx() - 1)-methodOut.getIp570004Tbl57RelRecNumSt((int) methodOut.getIp570004Idx() - 1)));
//  IF 800-RRN-NBR GREATER THAN 300-MAX-RRN-LIMIT
                      if (	( methodOut.getRrnNbr800() > methodOut.getMaxRrnLimit300() )) { 
//  MOVE IP570004-TBL57-PC-CAB-GRP-PTR ( IP570004-IDX ) TO 620-PC-CAP-GRP-PTR
                          methodOut.setPcCapGrpPtr620(methodOut.getIp570004Tbl57PcCabGrpPtr((int) methodOut.getIp570004Idx() - 1));
//  MOVE 300-MAX-RRN-LIMIT TO 620-MAX-RRN-LIMIT
                          methodOut.setMaxRrnLimit620(methodOut.getMaxRrnLimit300());
//  MOVE 800-RRN-NBR TO 620-ACTUAL-RRN-LIMIT
                          methodOut.setActualRrnLimit620(methodOut.getRrnNbr800());
//  MOVE 300-PARA-2100 TO 900-ABEND-PARA
                          methodOut.setAbendPara900(methodOut.getPara2100300());
//  MOVE 300-ABEND-CD-3003 TO 900-ABEND-CODE
                          methodOut.setAbendCode900(methodOut.getAbendCd3003300());
                          // MOVE 620-MAX-RRN-LIMIT-ERR TO 900-ABEND-TEXT
                          methodOut.setAbendText900(methodOut.getMaxRrnLimitErr620().toCharArray());
//  PERFORM 9000-DISPLAY-ABEND-MESSAGE
                          displayAbendMessage(programCtx.getDisplayAbendMessageInCtx());/*9000-DISPLAY-ABEND-MESSAGE*/
                      }
                  }
//  ADD 1 TO IP570004-IDX
                  methodOut.setIp570004Idx(methodOut.getIp570004Idx()+(long)1);
//  IF IP570004-IDX <= 100000
                  if (	( methodOut.getIp570004Idx() <= 100000 ) ) { 
//  MOVE IP005703-TBL57-PC-CAB-GRP-PTR TO IP570004-TBL57-PC-CAB-GRP-PTR ( IP570004-IDX )
                      methodOut.setIp570004Tbl57PcCabGrpPtr((int) methodOut.getIp570004Idx() - 1,methodOut.getIp005703Tbl57PcCabGrpPtr());
//  MOVE IP35501-RELATIVE-REC-NUM TO IP570004-TBL57-REL-REC-NUM-ST ( IP570004-IDX )
                      methodOut.setIp570004Tbl57RelRecNumSt((int) methodOut.getIp570004Idx() - 1,methodOut.getIp35501RelativeRecNum());
//  MOVE 800-START TO IP570004-TBL57-CAB-GP-ENTRY-ST ( IP570004-IDX )
                      methodOut.setIp570004Tbl57CabGpEntrySt((int) methodOut.getIp570004Idx() - 1,methodOut.getStart800());
                  }
//  ELSE
                  else { 
//  MOVE 300-PARA-2100 TO 900-ABEND-PARA
                      methodOut.setAbendPara900(methodOut.getPara2100300());
//  MOVE 610-UNIQ-MAX-CAB-PTR-ERROR-CD TO 900-ABEND-CODE
                      methodOut.setAbendCode900(methodOut.getUniqMaxCabPtrErrorCd610());
//  MOVE 610-UNIQ-MAX-CAB-PTR-ERROR-MSG TO 900-ABEND-TEXT
                      methodOut.setAbendText900(pad(80,methodOut.getUniqMaxCabPtrErrorMsg610(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 9000-DISPLAY-ABEND-MESSAGE
                      displayAbendMessage(programCtx.getDisplayAbendMessageInCtx());/*9000-DISPLAY-ABEND-MESSAGE*/
                  }
              }
          }
//  ELSE
          else { 
//  ADD 1 TO IP570004-IDX
              methodOut.setIp570004Idx(methodOut.getIp570004Idx()+(long)1);
//  MOVE IP005703-TBL57-PC-CAB-GRP-PTR TO IP570004-TBL57-PC-CAB-GRP-PTR ( IP570004-IDX )
              methodOut.setIp570004Tbl57PcCabGrpPtr((int) methodOut.getIp570004Idx() - 1,methodOut.getIp005703Tbl57PcCabGrpPtr());
//  MOVE IP35501-RELATIVE-REC-NUM TO IP570004-TBL57-REL-REC-NUM-ST ( IP570004-IDX )
              methodOut.setIp570004Tbl57RelRecNumSt((int) methodOut.getIp570004Idx() - 1,methodOut.getIp35501RelativeRecNum());
//  MOVE 800-START TO IP570004-TBL57-CAB-GP-ENTRY-ST ( IP570004-IDX )
              methodOut.setIp570004Tbl57CabGpEntrySt((int) methodOut.getIp570004Idx() - 1,methodOut.getStart800());
//  MOVE 800-ENTRY-LENGTH TO 800-CURR-PTR-LNGTH
              methodOut.setCurrPtrLngth800((int) methodOut.getEntryLength800());
          }
//  IF ( 800-START + 800-LENGTH ) > 300-MAX-LENGTH
          if (	( (int) (methodOut.getStart800() + methodOut.getLength800()) > methodIn.getMaxLength300() ) ) { 
//  ADD 800-ENTRY-LENGTH TO 800-START
              methodOut.setStart800(methodOut.getStart800()+(int) methodOut.getEntryLength800());
//  PERFORM 8000-POPULATE-OUTPUT-DATA-BLK
              populateOutputDataBlk(programCtx.getPopulateOutputDataBlkInCtx());/*8000-POPULATE-OUTPUT-DATA-BLK*/
          }
//  ELSE
          else { 
//  ADD 800-LENGTH TO 800-START
              methodOut.setStart800(methodOut.getStart800()+(int) methodOut.getLength800());
//  MOVE 800-ENTRY-LENGTH TO 800-LENGTH
              methodOut.setLength800(methodOut.getEntryLength800());
          }
      
      return methodOut;
      }
      /**
      * populateOutputDataBlk 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-POPULATE-OUTPUT-DATA-BLK COBOL Cyclomatic complexity - 1
      * Input  :  

      * - tableId300                     COBOL Name: 300-TABLE-ID
      * - ip570004EffdtTm                COBOL Name: IP570004-EFFDT-TM
      * - start800                       COBOL Name: 800-START
      * - ip35501RelativeRecNum          COBOL Name: IP35501-RELATIVE-REC-NUM
      *
      * Output :  

      * - ip50005oTableId                COBOL Name: IP50005O-TABLE-ID
      * - tableId300                     COBOL Name: 300-TABLE-ID
      * - ip50005oEffDate                COBOL Name: IP50005O-EFF-DATE
      * - ip570004EffdtTm                COBOL Name: IP570004-EFFDT-TM
      * - start800                       COBOL Name: 800-START
      * - ip50005oOneDayRecLth           COBOL Name: IP50005O-ONE-DAY-REC-LTH
      * - ip35501RelativeRecNum          COBOL Name: IP35501-RELATIVE-REC-NUM
      *
      * @throws CFException
      */
      @Override
      public PopulateOutputDataBlkOutCtx populateOutputDataBlk(PopulateOutputDataBlkInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *  This para populates the output blocked data.                  *
// *----------------------------------------------------------------*
Ip305710Ctx programCtx = methodIn.getIp305710Ctx();
PopulateOutputDataBlkOutCtx methodOut = methodIn.getPopulateOutputDataBlkOutCtx();
//  MOVE 300-TABLE-ID TO IP50005O-TABLE-ID
          methodOut.setIp50005oTableId(methodOut.getTableId300());
          // MOVE IP570004-EFFDT-TM TO IP50005O-EFF-DATE
          methodOut.setIp50005oEffDate(padLeftZeros(10,methodOut.getIp570004EffdtTm(),false));
//  ADD 17 TO 800-START
          methodOut.setStart800(methodOut.getStart800()+(long)17);
//  MOVE 800-START TO IP50005O-ONE-DAY-REC-LTH
          methodOut.setIp50005oOneDayRecLth(methodOut.getStart800());
          // MOVE 1 TO 800-START
          methodOut.setStart800((long)1);
//  ADD 1 TO IP35501-RELATIVE-REC-NUM
          methodOut.setIp35501RelativeRecNum(methodOut.getIp35501RelativeRecNum()+1);
      
      return methodOut;
      }
      /**
      * displayAbendMessage 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-DISPLAY-ABEND-MESSAGE COBOL Cyclomatic complexity - 1
      * Input  :  

      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      *
      * Output :  

      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public DisplayAbendMessageOutCtx displayAbendMessage(DisplayAbendMessageInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *Function      : standard mastercard abend routine.
// *----------------------------------------------------------------*
Ip305710Ctx programCtx = methodIn.getIp305710Ctx();
DisplayAbendMessageOutCtx methodOut = methodIn.getDisplayAbendMessageOutCtx();
//  MOVE 900-ABEND-TEXT TO IP60001-EVENT-ERROR-MSG
          methodOut.setIp60001EventErrorMsg(methodOut.getAbendText900());
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
          methodOut.setIp60001EventErrorCode(methodOut.getAbendCode900());
//  DISPLAY '----------------------------------*'
          logger.info("----------------------------------*"); 
//  DISPLAY 'A B E N D   A B E N D   A B E N D  '
          logger.info("A B E N D   A B E N D   A B E N D  "); 
//  DISPLAY 'A B E N D   I P 3 0 5 7 1 0        '
          logger.info("A B E N D   I P 3 0 5 7 1 0        "); 
//  DISPLAY '----------------------------------*'
          logger.info("----------------------------------*"); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(methodIn.getAbendParaName900().toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(methodIn.getAbendMessage900().toString()); 
//  CALL 300-PGM-IP610010
          // CALL 300-PGM-IP610010
          	programCtx.setRc( ip610010.process(programCtx.getGlobalCtx().getContext("IP610010")));
      
      return methodOut;
      }
  
  
  
  
  
  
  
  
  }
  /* 
* element ip305710 as of 06/03/21 10:27:01                    �vc�
*$set noamode
*----------------------------------------------------------------*
*          -- -- -- c o n f i d e n t i a l -- -- --
*    this item contains information and procedures which are
*    proprietary to mastercard international, incorporated,
*    and which are confidential.  it is provided with the
*    express understanding that it is to be used only for the
*    benefit of interbank card association, and is not to be
*    used, copied, or disclosed for any other purpose.  any
*    authorized reproduction (in whole or in part) of this
*    material must be marked with this legend.
*----------------------------------------------------------------*
*
*author.        mpact.
*date-written.  april 28, 2005
*security.      property of mastercard international, inc.
*
*----------------------------------------------------------------*
*program functionality:this is an optimization program.
*----------------------------------------------------------------*
* the purpose of this program is to optimize the 1 day file, for *
* the table ip0057t1 records into ip0057t1 and ip5700t1.         *
*----------------------------------------------------------------*
*revision history:
*----------------------------------------------------------------*
*    project         :gcms release 5.1
*    date            :2005/02/14
*    version         :001.00
*    programmer      :mpact
*    modification    :initial version.
*-----------------------------------------------------------------
*    project         :gcms release 5.1 (table 57 rrds conversion)*
*    date            :05/06/05                                   *
*    programmer      :mpact                                      *
*    modification    :program rewritten for rrds changes.        *
*----------------------------------------------------------------*
*    project         :gcms release 6.1                           *
*    date            :04/07/06                                   *
*    programmer      :mpact                                      *
*    modification    :modified to populate the start rrn and end *
*                     rrn in ip570004 copybook.                  *
*----------------------------------------------------------------*
*    project         :gcms release 6.2 crf# c04472               *
*                    :mps-gcms bs interchange program maintenance*
*    date            :2006/10/13                                 *
*    programmer      :mpact                                      *
*    modification    :modified code to populate :t:-ovrde-item-id*
*                     from ip005703 to ip005704 layout.          *
*----------------------------------------------------------------*
*    project         :gcms release 7.2  #c05264                  *
*                    :new criteria for interchange adjustment    *
*    date            :2007/10/12                                 *
*    programmer      :mpact                                      *
*    modification    :modified code to populate :t:-mc-assgn-id, *
*                     :t:-ovrde-prty-num fields from ip005703 to *
*                     ip005704 layout.                           *
*----------------------------------------------------------------*
* project      :gcms release 11.q4 - c25054                      *
*               release agility - enhanced gcms member profile   *
* date         :2011/10/14                                       *
* programmer   :wipro                                            *
* modification :modified to fit the records correctly into rrn   *
*               instead of spanning across.                      *
*----------------------------------------------------------------*
* project      :gcms release 13.q2 scr07925                      *
* date         :2013/04/14                                       *
* programmer   :wipro                                            *
* modification :in gcms11q4, the table 57 rrn limit increased to *
*               8 following abend in mtf. the rrn limit increased*
*               correspondingly the table 57 internal table      *
*               limit to 5,888. even though the table 57 rrn     *
*               limit is defined to be 8, the effective rrn      *
*               limit for consideration should be 7.(i.e.) n-1.  *
*               this is because table 57 rrn records could be    *
*               spanned, the effective consideration should be   *
*               n-1. this rrn limit is being checked in this     *
*               optimization process itself so that it is known  *
*               very earlier and not carried over to downstream  *
*               jobs.                                            *
*----------------------------------------------------------------*
* project      :prb68459 - gcms 15.q2                            *
* date         :2015/04/17                                       *
* programmer   :wipro                                            *
* modification :increased the rrn limit to 15 from 8             *
*               in follow-up to mtf abend.                       *
*----------------------------------------------------------------*
* project      :gcms release 17.q3 - c97387 brazil ole           *
* date         :2017/07/14                                       *
* programmer   :wipro                                            *
* modification :increased the rrn limit to 35 from 15            *
*----------------------------------------------------------------*
*    project         :gcms release 18q3                          *
*                     i7346 - brazil dual message for dmc.       *
*    date            :2018/07/13                                 *
*    programmer      :wipro                                      *
*    modification    :added logic to increase the rrn limit from *
*                    :35 to 65.                                  *
*----------------------------------------------------------------*
*    project         :gcms release 18.q4                         *
*                     lcms and mds batch on-soil migration       *
*    date            :2018/06/06                                 *
*    programmer      :wipro                                      *
*    modification    :program modified to include the compiler   *
*                     directives to support in linux             *
*----------------------------------------------------------------*
*    project         :gcms21q2 release - i11106                  *
*                     alm regionalization                        *
*    date            :2020/11/26                                 *
*    programmer      :ketan joshi                                *
*    modification    :added code to increase 300-max-length      *
*                    :from 27968 to 27951.                       *
*----------------------------------------------------------------*
*/
