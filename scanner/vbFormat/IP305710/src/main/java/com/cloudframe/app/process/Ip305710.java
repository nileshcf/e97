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
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.global.sharedvar.Ip50004iTableKey;
  import com.cloudframe.app.ip305710.dto.Ip005703Tbl57Data;
  import com.cloudframe.app.ip305710.dto.Ip005704Tbl57Data;
  import com.cloudframe.app.global.sharedvar.Ip570004TableEntries;
  import com.cloudframe.app.global.sharedvar.Ip50005oTableKey;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.ip305710.dto.*;
  import com.cloudframe.app.ip305710.dto.Ip005703TableData;
  import com.cloudframe.app.ip305710.dto.AbendParaName900;
  import com.cloudframe.app.ip305710.dto.Ip005704TableData;
  import com.cloudframe.app.ip305710.dto.AbendMessage900;
  import com.cloudframe.app.ip305710.dto.MaxRrnLimitErr620;
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
  
  public class Ip305710 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip305710.class);
  
  private Ip005703TableData ip005703TableData = new Ip005703TableData() ;
  private AbendParaName900 abendParaName900 = new AbendParaName900() ;
  private Ip005704TableData ip005704TableData = new Ip005704TableData() ;
  private AbendMessage900 abendMessage900 = new AbendMessage900() ;
  private MaxRrnLimitErr620 maxRrnLimitErr620 = new MaxRrnLimitErr620() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("ip996010")
  Ip996010 ip996010;
  @Autowired 
  @Qualifier("ip610010")
  Ip610010 ip610010;
  @Autowired 
  @Qualifier("global_ip005704EntryFoundGroup")
  Ip005704EntryFoundGroup ip005704EntryFoundGroup;
  @Autowired 
  @Qualifier("global_ip005704SrchProdClassGroup")
  Ip005704SrchProdClassGroup ip005704SrchProdClassGroup;
  @Autowired 
  @Qualifier("global_ip35501RelativeRecNumGroup")
  Ip35501RelativeRecNumGroup ip35501RelativeRecNumGroup;
  @Autowired 
  @Qualifier("global_ip570004TableDataInfo")
  Ip570004TableDataInfo ip570004TableDataInfo;
  @Autowired 
  @Qualifier("global_ip50004iOneDayRecLthGroup")
  Ip50004iOneDayRecLthGroup ip50004iOneDayRecLthGroup;
  @Autowired 
  @Qualifier("global_ip50004iOneDayRec")
  Ip50004iOneDayRec ip50004iOneDayRec;
  @Autowired 
  @Qualifier("global_ip50004iReadTableIdGroup")
  Ip50004iReadTableIdGroup ip50004iReadTableIdGroup;
  @Autowired 
  @Qualifier("global_ip50004iOneDayReadStatusGroup")
  Ip50004iOneDayReadStatusGroup ip50004iOneDayReadStatusGroup;
  @Autowired 
  @Qualifier("global_ip50005oOneDayRecLthGroup")
  Ip50005oOneDayRecLthGroup ip50005oOneDayRecLthGroup;
  @Autowired 
  @Qualifier("global_ip50005oOneDayRec")
  Ip50005oOneDayRec ip50005oOneDayRec;
  @Autowired 
  @Qualifier("global_ip50005oOneDayReadStatusGroup")
  Ip50005oOneDayReadStatusGroup ip50005oOneDayReadStatusGroup;
  @Autowired 
  @Qualifier("global_ip50005oClearingDtTm")
  Ip50005oClearingDtTm ip50005oClearingDtTm;
  @Autowired 
  @Qualifier("global_ip60001EventLogWorkArea")
  Ip60001EventLogWorkArea ip60001EventLogWorkArea;
  @Autowired 
  @Qualifier("global_ip996011ProgramStartMessage")
  Ip996011ProgramStartMessage ip996011ProgramStartMessage;
  
  
  
  
  
  
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
//  PERFORM 0000-MAINLINE
          mainline();/*0000-MAINLINE*/
          if (this.isProgramEnded()) {
              return getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
       return getRc(); // Exit with return code
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
      private void mainline() throws Exception {
      
// *----------------------------------------------------------------*
// *  Main process:  process the table 57 records.
// *----------------------------------------------------------------*
//  PERFORM 1000-DISPLAY-EXEC-MSGS
          displayExecMsgs();/*1000-DISPLAY-EXEC-MSGS*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS-0057-ENTRIES
          process0057Entries();/*2000-PROCESS-0057-ENTRIES*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
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
      private void displayExecMsgs() throws Exception {
			// Declare local variables used in the method
			Ip50004iTableKey ip50004iTableKey = ip50004iOneDayRec.getIp50004iTableKey();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *If the program is called for the first time, this paragraph will*
// *be performed. it basically displays program execution messages. *
// *it fills the entries in log detail copybook - ip996011          *
// *and displays the details accordingly.                           *
// *----------------------------------------------------------------*
//  IF 88-100-IT-IS-FIRST-TIME
          if ( work.isItIsFirstTime88100()  ) { 
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
              work.setPtrIp996010800(work.getPgmIp996010300()); 
              
//  MOVE 300-IP305710 TO IP996011-PGM-ID
              ip996011ProgramStartMessage.setIp996011PgmId(work.getIp305710300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
              ip996011ProgramStartMessage.setIp996011PgmVersion(work.getPgmVersion300());
              // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
              //  FORMAT1311677340 = "X(08)BX(08)"
              ip996011ProgramStartMessage.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_603451679));
//  CALL 800-PTR-IP996010
              // CALL 800-PTR-IP996010
              	this.setRc( ip996010.process());
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              work.setItIsNotFirstTime88100True(); 
              
//  MOVE IP50004I-EFF-DATE TO IP570004-EFFDT-TM
              ip570004TableDataInfo.setIp570004EffdtTm(ip50004iTableKey.getIp50004iEffDate());
  
//  MOVE LENGTH OF IP005704-TABLE-DATA TO 800-ENTRY-LENGTH 800-LENGTH
              work.setEntryLength800(Ip005704TableData.getIp005704TableDataFieldLength());
              work.setLength800(Ip005704TableData.getIp005704TableDataFieldLength());
//  MOVE 0 TO IP570004-IDX
              ip570004TableDataInfo.setIp570004Idx((long)0);
          }
      
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
      private void process0057Entries() throws Exception {
			// Declare local variables used in the method
			Ip005703Tbl57Data ip005703Tbl57Data = ip005703TableData.getIp005703Tbl57Data();
			Ip005704Tbl57Data ip005704Tbl57Data = ip005704TableData.getIp005704Tbl57Data();
			long ip50004iOneDayRecLth = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *  Process the table 57 records.                                 *
// *----------------------------------------------------------------*
          ip50004iOneDayRecLth = ip50004iOneDayRecLthGroup.getIp50004iOneDayRecLth();
//  IF IP50004I-ONE-DAY-REC-LTH > ZEROES
          if (	( ip50004iOneDayRecLth > 0 ) ) { 
//  MOVE IP50004I-TABLE-DATA TO IP005703-TABLE-DATA
              ip005703TableData.setString(ip50004iOneDayRec.getIp50004iTableData());
//  MOVE IP005703-PROD-CLASS TO IP005704-PROD-CLASS
              ip005704Tbl57Data.setIp005704ProdClass(ip005703Tbl57Data.getIp005703ProdClass());
  
//  MOVE IP005703-CAB-CODE TO IP005704-CAB-CODE
              ip005704Tbl57Data.setIp005704CabCode(ip005703Tbl57Data.getIp005703CabCode());
  
//  MOVE IP005703-MC-ASSGN-ID TO IP005704-MC-ASSGN-ID
              ip005704Tbl57Data.setIp005704McAssgnId(ip005703Tbl57Data.getIp005703McAssgnId());
  
//  MOVE IP005703-OVRDE-PRTY-NUM TO IP005704-OVRDE-PRTY-NUM
              ip005704Tbl57Data.setIp005704OvrdePrtyNum(ip005703Tbl57Data.getIp005703OvrdePrtyNum());
  
//  MOVE IP005703-FEE-CODE-PTR TO IP005704-FEE-CODE-PTR
              ip005704Tbl57Data.setIp005704FeeCodePtr(ip005703Tbl57Data.getIp005703FeeCodePtr());
  
//  PERFORM 2100-SAVE-TABLE-ENTRY
              saveTableEntry();/*2100-SAVE-TABLE-ENTRY*/
          }
  
//  ELSE
          else { 
//  MOVE 800-CURR-PTR-LNGTH TO IP570004-TBL57-CAB-GP-ENTRY-LT ( IP570004-IDX )
              ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry((int) ip570004TableDataInfo.getIp570004Idx() - 1).getIp570004Tbl57PointerData().setIp570004Tbl57CabGpEntryLt(work.getCurrPtrLngth800());
//  MOVE IP570004-IDX TO IP570004-IDX-MAX
              ip570004TableDataInfo.setIp570004IdxMax(ip570004TableDataInfo.getIp570004Idx());
//  ADD 800-LENGTH TO 800-START
              work.setStart800(work.getStart800()+(int) work.getLength800());
//  MOVE IP35501-RELATIVE-REC-NUM TO IP570004-TBL57-REL-REC-NUM-END ( IP570004-IDX )
              ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry((int) ip570004TableDataInfo.getIp570004Idx() - 1).getIp570004Tbl57PointerData().setIp570004Tbl57RelRecNumEnd(ip35501RelativeRecNumGroup.getIp35501RelativeRecNum());
//  PERFORM 8000-POPULATE-OUTPUT-DATA-BLK
              populateOutputDataBlk();/*8000-POPULATE-OUTPUT-DATA-BLK*/
          }
      
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
      private void saveTableEntry() throws Exception {
			// Declare local variables used in the method
			Ip570004TableEntries ip570004TableEntries = ip570004TableDataInfo.getIp570004TableEntries();
			long ip005703Tbl57PcCabGrpPtr = 0;
			long ip570004Idx = 0;
			long maxLength300 = 0;
			int rrnNbr800 = 0;
			int maxRrnLimit300 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *  This para saves the optimized table entries.
// *----------------------------------------------------------------*
//  MOVE IP005704-TABLE-DATA TO IP50005O-TABLE-DATA ( 800-START : 800-LENGTH )
          ip50005oOneDayRec.setIp50005oTableData(replace(ip50005oOneDayRec.getIp50005oTableData(),ip005704TableData.toCharArray(),((int) work.getStart800()-1), (work.getLength800() + ((int) work.getStart800() - 1)) ));
          ip570004Idx = ip570004TableDataInfo.getIp570004Idx();
//  IF IP570004-IDX > 0
          if (	( ip570004Idx > 0 ) ) { 
              ip005703Tbl57PcCabGrpPtr = ip005703TableData.getIp005703Tbl57PcCabGrpPtr();
//  IF IP570004-TBL57-PC-CAB-GRP-PTR ( IP570004-IDX ) = IP005703-TBL57-PC-CAB-GRP-PTR
              if (	( ip570004TableEntries.getIp570004TableEntry((int) ip570004TableDataInfo.getIp570004Idx() - 1).getIp570004Tbl57PcCabGrpPtr() == ip005703Tbl57PcCabGrpPtr )) { 
//  ADD 800-LENGTH TO 800-CURR-PTR-LNGTH
                  work.setCurrPtrLngth800(work.getCurrPtrLngth800()+(int) work.getLength800());
              }
  
//  ELSE
              else { 
//  MOVE 800-CURR-PTR-LNGTH TO IP570004-TBL57-CAB-GP-ENTRY-LT ( IP570004-IDX )
                  ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry((int) ip570004TableDataInfo.getIp570004Idx() - 1).getIp570004Tbl57PointerData().setIp570004Tbl57CabGpEntryLt(work.getCurrPtrLngth800());
//  MOVE 800-ENTRY-LENGTH TO 800-CURR-PTR-LNGTH
                  work.setCurrPtrLngth800((int) work.getEntryLength800());
//  MOVE IP35501-RELATIVE-REC-NUM TO IP570004-TBL57-REL-REC-NUM-END ( IP570004-IDX )
                  ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry((int) ip570004TableDataInfo.getIp570004Idx() - 1).getIp570004Tbl57PointerData().setIp570004Tbl57RelRecNumEnd(ip35501RelativeRecNumGroup.getIp35501RelativeRecNum());
//  IF IP570004-TBL57-REL-REC-NUM-END ( IP570004-IDX ) >= IP570004-TBL57-REL-REC-NUM-ST ( IP570004-IDX )
                  if (	( ip570004TableEntries.getIp570004TableEntry((int) ip570004TableDataInfo.getIp570004Idx() - 1).getIp570004Tbl57PointerData().getIp570004Tbl57RelRecNumEnd() >= ip570004TableEntries.getIp570004TableEntry((int) ip570004TableDataInfo.getIp570004Idx() - 1).getIp570004Tbl57PointerData().getIp570004Tbl57RelRecNumSt() )) { 
//  SUBTRACT IP570004-TBL57-REL-REC-NUM-ST ( IP570004-IDX ) FROM IP570004-TBL57-REL-REC-NUM-END ( IP570004-IDX ) GIVING 800-RRN-NBR
                      work.setRrnNbr800(Math.abs(ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry((int) ip570004TableDataInfo.getIp570004Idx() - 1).getIp570004Tbl57PointerData().getIp570004Tbl57RelRecNumEnd()-ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry((int) ip570004TableDataInfo.getIp570004Idx() - 1).getIp570004Tbl57PointerData().getIp570004Tbl57RelRecNumSt()));
                      maxRrnLimit300 = work.getMaxRrnLimit300();
                      rrnNbr800 = work.getRrnNbr800();
//  IF 800-RRN-NBR GREATER THAN 300-MAX-RRN-LIMIT
                      if (	( rrnNbr800 > maxRrnLimit300 )) { 
//  MOVE IP570004-TBL57-PC-CAB-GRP-PTR ( IP570004-IDX ) TO 620-PC-CAP-GRP-PTR
                          maxRrnLimitErr620.setPcCapGrpPtr620(ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry((int) ip570004TableDataInfo.getIp570004Idx() - 1).getIp570004Tbl57PcCabGrpPtr());
//  MOVE 300-MAX-RRN-LIMIT TO 620-MAX-RRN-LIMIT
                          maxRrnLimitErr620.setMaxRrnLimit620(work.getMaxRrnLimit300());
//  MOVE 800-RRN-NBR TO 620-ACTUAL-RRN-LIMIT
                          maxRrnLimitErr620.setActualRrnLimit620(work.getRrnNbr800());
//  MOVE 300-PARA-2100 TO 900-ABEND-PARA
                          abendParaName900.setAbendPara900(work.getPara2100300());
//  MOVE 300-ABEND-CD-3003 TO 900-ABEND-CODE
                          abendMessage900.setAbendCode900(work.getAbendCd3003300());
                          // MOVE 620-MAX-RRN-LIMIT-ERR TO 900-ABEND-TEXT
                          abendMessage900.setAbendText900(maxRrnLimitErr620.toCharArray());
//  PERFORM 9000-DISPLAY-ABEND-MESSAGE
                          displayAbendMessage();/*9000-DISPLAY-ABEND-MESSAGE*/
                      }
  
                  }
  
//  ADD 1 TO IP570004-IDX
                  ip570004TableDataInfo.setIp570004Idx(ip570004TableDataInfo.getIp570004Idx()+(long)1);
                  ip570004Idx = ip570004TableDataInfo.getIp570004Idx();
//  IF IP570004-IDX <= 100000
                  if (	( ip570004Idx <= 100000 ) ) { 
//  MOVE IP005703-TBL57-PC-CAB-GRP-PTR TO IP570004-TBL57-PC-CAB-GRP-PTR ( IP570004-IDX )
                      ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry((int) ip570004TableDataInfo.getIp570004Idx() - 1).setIp570004Tbl57PcCabGrpPtr(ip005703TableData.getIp005703Tbl57PcCabGrpPtr());
//  MOVE IP35501-RELATIVE-REC-NUM TO IP570004-TBL57-REL-REC-NUM-ST ( IP570004-IDX )
                      ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry((int) ip570004TableDataInfo.getIp570004Idx() - 1).getIp570004Tbl57PointerData().setIp570004Tbl57RelRecNumSt(ip35501RelativeRecNumGroup.getIp35501RelativeRecNum());
//  MOVE 800-START TO IP570004-TBL57-CAB-GP-ENTRY-ST ( IP570004-IDX )
                      ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry((int) ip570004TableDataInfo.getIp570004Idx() - 1).getIp570004Tbl57PointerData().setIp570004Tbl57CabGpEntrySt(work.getStart800());
                  }
  
//  ELSE
                  else { 
//  MOVE 300-PARA-2100 TO 900-ABEND-PARA
                      abendParaName900.setAbendPara900(work.getPara2100300());
//  MOVE 610-UNIQ-MAX-CAB-PTR-ERROR-CD TO 900-ABEND-CODE
                      abendMessage900.setAbendCode900(work.getUniqMaxCabPtrErrorCd610());
//  MOVE 610-UNIQ-MAX-CAB-PTR-ERROR-MSG TO 900-ABEND-TEXT
                      abendMessage900.setAbendText900(pad(80,work.getUniqMaxCabPtrErrorMsg610(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 9000-DISPLAY-ABEND-MESSAGE
                      displayAbendMessage();/*9000-DISPLAY-ABEND-MESSAGE*/
                  }
              }
          }
  
//  ELSE
          else { 
//  ADD 1 TO IP570004-IDX
              ip570004TableDataInfo.setIp570004Idx(ip570004TableDataInfo.getIp570004Idx()+(long)1);
//  MOVE IP005703-TBL57-PC-CAB-GRP-PTR TO IP570004-TBL57-PC-CAB-GRP-PTR ( IP570004-IDX )
              ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry((int) ip570004TableDataInfo.getIp570004Idx() - 1).setIp570004Tbl57PcCabGrpPtr(ip005703TableData.getIp005703Tbl57PcCabGrpPtr());
//  MOVE IP35501-RELATIVE-REC-NUM TO IP570004-TBL57-REL-REC-NUM-ST ( IP570004-IDX )
              ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry((int) ip570004TableDataInfo.getIp570004Idx() - 1).getIp570004Tbl57PointerData().setIp570004Tbl57RelRecNumSt(ip35501RelativeRecNumGroup.getIp35501RelativeRecNum());
//  MOVE 800-START TO IP570004-TBL57-CAB-GP-ENTRY-ST ( IP570004-IDX )
              ip570004TableDataInfo.getIp570004TableEntries().getIp570004TableEntry((int) ip570004TableDataInfo.getIp570004Idx() - 1).getIp570004Tbl57PointerData().setIp570004Tbl57CabGpEntrySt(work.getStart800());
//  MOVE 800-ENTRY-LENGTH TO 800-CURR-PTR-LNGTH
              work.setCurrPtrLngth800((int) work.getEntryLength800());
          }
          maxLength300 = work.getMaxLength300();
//  IF ( 800-START + 800-LENGTH ) > 300-MAX-LENGTH
          if (	( (int) (work.getStart800() + work.getLength800()) > maxLength300 ) ) { 
//  ADD 800-ENTRY-LENGTH TO 800-START
              work.setStart800(work.getStart800()+(int) work.getEntryLength800());
//  PERFORM 8000-POPULATE-OUTPUT-DATA-BLK
              populateOutputDataBlk();/*8000-POPULATE-OUTPUT-DATA-BLK*/
          }
  
//  ELSE
          else { 
//  ADD 800-LENGTH TO 800-START
              work.setStart800(work.getStart800()+(int) work.getLength800());
//  MOVE 800-ENTRY-LENGTH TO 800-LENGTH
              work.setLength800(work.getEntryLength800());
          }
      
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
      private void populateOutputDataBlk() throws Exception {
			// Declare local variables used in the method
			Ip50005oTableKey ip50005oTableKey = ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *  This para populates the output blocked data.                  *
// *----------------------------------------------------------------*
//  MOVE 300-TABLE-ID TO IP50005O-TABLE-ID
          ip50005oTableKey.setIp50005oTableId(work.getTableId300());
  
          // MOVE IP570004-EFFDT-TM TO IP50005O-EFF-DATE
          ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oEffDate(padLeftZeros(10,ip570004TableDataInfo.getIp570004EffdtTm(),false));
  
//  ADD 17 TO 800-START
          work.setStart800(work.getStart800()+(long)17);
//  MOVE 800-START TO IP50005O-ONE-DAY-REC-LTH
          ip50005oOneDayRecLthGroup.setIp50005oOneDayRecLth(work.getStart800());
          // MOVE 1 TO 800-START
          work.setStart800((long)1);
//  ADD 1 TO IP35501-RELATIVE-REC-NUM
          ip35501RelativeRecNumGroup.setIp35501RelativeRecNum(ip35501RelativeRecNumGroup.getIp35501RelativeRecNum()+1);
      
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
      private void displayAbendMessage() throws Exception {
      
// *----------------------------------------------------------------*
// *Function      : standard mastercard abend routine.
// *----------------------------------------------------------------*
//  MOVE 900-ABEND-TEXT TO IP60001-EVENT-ERROR-MSG
          ip60001EventLogWorkArea.setIp60001EventErrorMsg(abendMessage900.getAbendText900());
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
          ip60001EventLogWorkArea.setIp60001EventErrorCode(abendMessage900.getAbendCode900());
//  DISPLAY '----------------------------------*'
          logger.info("----------------------------------*"); 
//  DISPLAY 'A B E N D   A B E N D   A B E N D  '
          logger.info("A B E N D   A B E N D   A B E N D  "); 
//  DISPLAY 'A B E N D   I P 3 0 5 7 1 0        '
          logger.info("A B E N D   I P 3 0 5 7 1 0        "); 
//  DISPLAY '----------------------------------*'
          logger.info("----------------------------------*"); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(abendParaName900.toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(abendMessage900.toString()); 
//  CALL 300-PGM-IP610010
          // CALL 300-PGM-IP610010
          	this.setRc( ip610010.process());
      
      }
  
  
      /**
* This method pre-initializes variables consistent with
* what a mainframe program would have done at the start of a program
*/
      @Override
      public void initVars() throws CFException {
      setProgramEnded(false);
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
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
