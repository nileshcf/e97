  package com.cloudframe.app.process;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.ip798030.file.*;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.process.Ip750080;
  import com.cloudframe.app.global.sharedvar.Ip02014TableDataFields;
  import com.cloudframe.app.global.sharedvar.Ip02014TableDataKey;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.global.sharedvar.Ip34631Tipapim;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import com.cloudframe.app.process.Ip081190;
  import com.cloudframe.app.global.sharedvar.Ip70511TableKey;
  import com.cloudframe.app.process.Ip081110;
  import com.cloudframe.app.process.Ip282210;
  import com.cloudframe.app.global.sharedvar.Ip69931InputFields;
  import com.cloudframe.app.process.Ip699930;
  import com.cloudframe.app.global.sharedvar.Ip69931OutputFields;
  import com.cloudframe.app.global.sharedvar.Ip02015PrcssAgrmtTabEnt;
  import com.cloudframe.app.process.Ip996020;
  import com.cloudframe.app.global.sharedvar.Ip57901TipaqprEntries;
  import com.cloudframe.app.process.Ip703020;
  import com.cloudframe.app.process.Ip699910;
  import com.cloudframe.app.process.Ip534110;
  import com.cloudframe.app.global.sharedvar.Ip38201DcbInfo;
  import com.cloudframe.app.global.sharedvar.Ip38201AllocateParms;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.process.Ip532110;
  import com.cloudframe.app.process.Ip532010;
  import com.cloudframe.app.process.Ip081050;
  import com.cloudframe.app.process.Ip760010;
  import com.cloudframe.app.process.Ip595010;
  import com.cloudframe.app.process.Ip500920;
  import com.cloudframe.app.process.Ip708020;
  import com.cloudframe.app.global.sharedvar.Ip02044TableDataKey;
  import com.cloudframe.app.process.Ip282240;
  import com.cloudframe.app.process.Ip648010;
  import com.cloudframe.app.global.sharedvar.Ip32101ChkPtKeyCpt;
  import com.cloudframe.app.process.Ip599050;
  import com.cloudframe.app.global.sharedvar.Ip32101ChkPointDataText;
  import com.cloudframe.app.global.sharedvar.Ip34631CreateUpdateTs;
  import com.cloudframe.app.process.Ip599810;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.global.sharedvar.Ip08101RunControlRecord;
  import com.cloudframe.app.ip798030.dto.*;
  import com.cloudframe.app.ip798030.dto.Parms;
  import com.cloudframe.app.global.sharedvar.CutoffTsData800;
  import com.cloudframe.app.ip798030.file.records.Sys001CutoffRecord;
  import com.cloudframe.app.ip798030.dto.Ip28221PaTableRestart;
  import com.cloudframe.app.global.sharedvar.Ip02015PrcssAgrmtTable;
  import com.cloudframe.app.ip798030.dto.FileIoErrMsgTxt600;
  import com.cloudframe.app.ip798030.dto.AbendParaName900;
  import com.cloudframe.app.ip798030.dto.AbendMessage900;
  import com.cloudframe.app.ip798030.file.records.Sys210MqDataRec;
  import com.cloudframe.app.global.sharedvar.CutoffCkpData800;
  import com.cloudframe.app.global.sharedvar.Ip38201McidynamParms;
  import com.cloudframe.app.ip798030.file.records.Sys202PmaRecord;
  import com.cloudframe.app.ip798030.dto.Jobname800;
  import com.cloudframe.app.ip798030.dto.McdynamErrorMsgTxt640;
  import com.cloudframe.app.global.sharedvar.Ip08151PassedParms;
  import com.cloudframe.app.global.sharedvar.Ip08151ReturnParms;
  import com.cloudframe.app.global.sharedvar.Ip08151PartnStrtGroup;
  import com.cloudframe.app.global.sharedvar.Ip08151PartnEndGroup;
  import com.cloudframe.app.global.sharedvar.Ip75081MqSwitches;
  import com.cloudframe.app.global.sharedvar.Ip02014PrcssAgrmtTable;
  import com.cloudframe.app.global.sharedvar.Ip02044ArPa;
  import com.cloudframe.app.global.sharedvar.ApiLayout;
  import com.cloudframe.app.global.sharedvar.EnvArea800;
  import com.cloudframe.app.global.sharedvar.Ip30771TipacliTable;
  import com.cloudframe.app.global.sharedvar.Ip30881Db2McwaitInputValue;
  import com.cloudframe.app.global.sharedvar.Ip32101TipackpTable;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
  import com.cloudframe.app.global.sharedvar.Ip50921Variables;
  import com.cloudframe.app.global.sharedvar.Ip58041Tipapma;
  import com.cloudframe.app.global.sharedvar.Ip57901Tipaqpr;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip64801LrmCommBlock;
  import com.cloudframe.app.global.sharedvar.Ip69901CafLinkGroup;
  import com.cloudframe.app.global.sharedvar.Ip69901CpuInformationGroup;
  import com.cloudframe.app.global.sharedvar.Ip69901OptionalConnectPrms;
  import com.cloudframe.app.global.sharedvar.Ip69931Linkage;
  import com.cloudframe.app.global.sharedvar.Ip34051MqProcessParameters;
  import com.cloudframe.app.global.sharedvar.Ip70521MqApiLayout;
  import com.cloudframe.app.global.sharedvar.Ip70301IsItCallFromWlmGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301IsItCallFromNspkGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301IsMqReqSentSwGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301IsFraudMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301IsCemreqMqSrvActveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301IsCemresMqSrvActveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301CemauthMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301CemnspkMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301FastpayMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301InstallMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301QrRfndMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301MpAchMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmtmapMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmaIdnMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PmaRusMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301PimmapMqSrvActiveGroup;
  import com.cloudframe.app.global.sharedvar.ArePhysicalFilesOverGroup100;
  import com.cloudframe.app.global.sharedvar.CheckCloseQueueGroup100;
  import com.cloudframe.app.global.sharedvar.CheckGetQueueGroup100;
  import com.cloudframe.app.global.sharedvar.CheckPutQueueGroup100;
  import com.cloudframe.app.global.sharedvar.Ip70301LnCloneOwnerIdGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301LnCommitCntGroup;
  import com.cloudframe.app.global.sharedvar.Ip70301OrigMsgLenGroup;
  import com.cloudframe.app.global.sharedvar.Ip70511Table;
  import com.cloudframe.app.global.sharedvar.Ip70511EntryFoundGroup;
  import com.cloudframe.app.global.sharedvar.Ip7051pm2Table;
  import com.cloudframe.app.global.sharedvar.Ip7051pm2EntryFoundGroup;
  import com.cloudframe.app.global.sharedvar.Ip7051pmrTable;
  import com.cloudframe.app.global.sharedvar.Ip7051pmrEntryFoundGroup;
  import com.cloudframe.app.global.sharedvar.Ip7052pm2MqApiLayout;
  import com.cloudframe.app.global.sharedvar.Ip7052pmrMqApiLayout;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.global.sharedvar.Ip996021JobInformation;
  import com.cloudframe.app.global.sharedvar.Ip66601TipalrmEntries;
  import com.cloudframe.app.global.sharedvar.IsDebugSwOnGroup100;
  import com.cloudframe.app.global.sharedvar.CheckFirstGetPimGroup100;
  import com.cloudframe.app.global.sharedvar.CheckFirstPutPimGroup100;
  import com.cloudframe.app.global.sharedvar.IsRowsFoundGroup100;
  import com.cloudframe.app.global.sharedvar.IsOpenSwGroup100;
  import com.cloudframe.app.global.sharedvar.GetBrowseCallsGroup100;
  import com.cloudframe.app.global.sharedvar.Tab204KeyFoundGroup100;
  import com.cloudframe.app.global.sharedvar.CutoffEndGroup800;
  import com.cloudframe.app.global.sharedvar.SvcStkCountGroup800;
  import com.cloudframe.app.global.sharedvar.ExtValues800;
  import com.cloudframe.app.global.sharedvar.EndOfFileIndicator800;
  import com.cloudframe.app.ip798030.dto.LrmStat630;
  import com.cloudframe.app.ip798030.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip798030")
  
  public class Ip798030 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip798030.class);
  
  private Parms parms = new Parms() ;
  private Sys001CutoffRecord sys001CutoffRecord = new Sys001CutoffRecord() ;
  private Ip28221PaTableRestart ip28221PaTableRestart = new Ip28221PaTableRestart() ;
  private FileIoErrMsgTxt600 fileIoErrMsgTxt600 = new FileIoErrMsgTxt600() ;
  private AbendParaName900 abendParaName900 = new AbendParaName900() ;
  private AbendMessage900 abendMessage900 = new AbendMessage900() ;
  private Sys210MqDataRec sys210MqDataRec = new Sys210MqDataRec() ;
  private Sys202PmaRecord sys202PmaRecord = new Sys202PmaRecord() ;
  private Jobname800 jobname800 = new Jobname800() ;
  private McdynamErrorMsgTxt640 mcdynamErrorMsgTxt640 = new McdynamErrorMsgTxt640() ;
  private LrmStat630 lrmStat630 = new LrmStat630() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("ip798030_sys001CutoffFile")
  Sys001CutoffFile sys001CutoffFile;
  @Autowired 
  @Qualifier("ip798030_sys202PmaFile")
  Sys202PmaFile sys202PmaFile;
  @Autowired 
  @Qualifier("ip081190")
  Ip081190 ip081190;
  @Autowired 
  @Qualifier("ip699930")
  Ip699930 ip699930;
  @Autowired 
  @Qualifier("ip798030_sys210MqDataFile")
  Sys210MqDataFile sys210MqDataFile;
  @Autowired 
  @Qualifier("ip699910")
  Ip699910 ip699910;
  @Autowired 
  @Qualifier("ip534110")
  Ip534110 ip534110;
  @Autowired 
  @Qualifier("ip532110")
  Ip532110 ip532110;
  @Autowired 
  @Qualifier("ip081050")
  Ip081050 ip081050;
  @Autowired 
  @Qualifier("ip760010")
  Ip760010 ip760010;
  @Autowired 
  @Qualifier("ip595010")
  Ip595010 ip595010;
  @Autowired 
  @Qualifier("ip500920")
  Ip500920 ip500920;
  @Autowired 
  @Qualifier("ip282240")
  Ip282240 ip282240;
  @Autowired 
  @Qualifier("ip599050")
  Ip599050 ip599050;
  @Autowired 
  @Qualifier("global_cutoffTsData800")
  CutoffTsData800 cutoffTsData800;
  @Autowired 
  @Qualifier("global_cutoffCkpData800")
  CutoffCkpData800 cutoffCkpData800;
  @Autowired 
  @Qualifier("global_ip38201McidynamParms")
  Ip38201McidynamParms ip38201McidynamParms;
  @Autowired 
  @Qualifier("global_ip08151PassedParms")
  Ip08151PassedParms ip08151PassedParms;
  @Autowired 
  @Qualifier("global_ip08151ReturnParms")
  Ip08151ReturnParms ip08151ReturnParms;
  @Autowired 
  @Qualifier("global_ip08151PartnStrtGroup")
  Ip08151PartnStrtGroup ip08151PartnStrtGroup;
  @Autowired 
  @Qualifier("global_ip08151PartnEndGroup")
  Ip08151PartnEndGroup ip08151PartnEndGroup;
  @Autowired 
  @Qualifier("global_ip02044ArPa")
  Ip02044ArPa ip02044ArPa;
  @Autowired 
  @Qualifier("global_envArea800")
  EnvArea800 envArea800;
  @Autowired 
  @Qualifier("global_ip32101TipackpTable")
  Ip32101TipackpTable ip32101TipackpTable;
  @Autowired 
  @Qualifier("global_ip50921Variables")
  Ip50921Variables ip50921Variables;
  @Autowired 
  @Qualifier("global_ip58041Tipapma")
  Ip58041Tipapma ip58041Tipapma;
  @Autowired 
  @Qualifier("global_ip69901CafLinkGroup")
  Ip69901CafLinkGroup ip69901CafLinkGroup;
  @Autowired 
  @Qualifier("global_ip69901CpuInformationGroup")
  Ip69901CpuInformationGroup ip69901CpuInformationGroup;
  @Autowired 
  @Qualifier("global_ip69901OptionalConnectPrms")
  Ip69901OptionalConnectPrms ip69901OptionalConnectPrms;
  @Autowired 
  @Qualifier("global_ip69931Linkage")
  Ip69931Linkage ip69931Linkage;
  @Autowired 
  @Qualifier("global_ip70301PmtmapMqSrvActiveGroup")
  Ip70301PmtmapMqSrvActiveGroup ip70301PmtmapMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip70301PimmapMqSrvActiveGroup")
  Ip70301PimmapMqSrvActiveGroup ip70301PimmapMqSrvActiveGroup;
  @Autowired 
  @Qualifier("global_ip7051pm2Table")
  Ip7051pm2Table ip7051pm2Table;
  @Autowired 
  @Qualifier("global_ip7051pm2EntryFoundGroup")
  Ip7051pm2EntryFoundGroup ip7051pm2EntryFoundGroup;
  @Autowired 
  @Qualifier("global_ip7051pmrTable")
  Ip7051pmrTable ip7051pmrTable;
  @Autowired 
  @Qualifier("global_ip7051pmrEntryFoundGroup")
  Ip7051pmrEntryFoundGroup ip7051pmrEntryFoundGroup;
  @Autowired 
  @Qualifier("global_ip7052pm2MqApiLayout")
  Ip7052pm2MqApiLayout ip7052pm2MqApiLayout;
  @Autowired 
  @Qualifier("global_ip7052pmrMqApiLayout")
  Ip7052pmrMqApiLayout ip7052pmrMqApiLayout;
  @Autowired 
  @Qualifier("global_ip66601TipalrmEntries")
  Ip66601TipalrmEntries ip66601TipalrmEntries;
  @Autowired 
  @Qualifier("global_isDebugSwOnGroup100")
  IsDebugSwOnGroup100 isDebugSwOnGroup100;
  @Autowired 
  @Qualifier("global_checkFirstGetPimGroup100")
  CheckFirstGetPimGroup100 checkFirstGetPimGroup100;
  @Autowired 
  @Qualifier("global_isRowsFoundGroup100")
  IsRowsFoundGroup100 isRowsFoundGroup100;
  @Autowired 
  @Qualifier("global_isOpenSwGroup100")
  IsOpenSwGroup100 isOpenSwGroup100;
  @Autowired 
  @Qualifier("global_tab204KeyFoundGroup100")
  Tab204KeyFoundGroup100 tab204KeyFoundGroup100;
  @Autowired 
  @Qualifier("global_cutoffEndGroup800")
  CutoffEndGroup800 cutoffEndGroup800;
  @Autowired 
  @Qualifier("global_svcStkCountGroup800")
  SvcStkCountGroup800 svcStkCountGroup800;
  @Autowired 
  @Qualifier("global_extValues800")
  ExtValues800 extValues800;
  @Autowired 
  @Qualifier("global_endOfFileIndicator800")
  EndOfFileIndicator800 endOfFileIndicator800;
  
  
  
  int ip02015PaIndex;
  
  
  
      public int setParameter(String parms) throws Exception {
      		if(parms != null)
      		    this.parms.setString(com.cloudframe.app.data.Field.getParm(parms),new String(CONSTANTS.EBCDIC_ENCODING));
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
//  PERFORM 0000-MAINLINE
          mainline();/*0000-MAINLINE*/
          if (this.isProgramEnded()) {
              return getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
      		if(sys001CutoffFile.hasOpened() && !sys001CutoffFile.isReadOnly()) { 
      			sys001CutoffFile.flush(); 
      		}
      		if(sys202PmaFile.hasOpened() && !sys202PmaFile.isReadOnly()) { 
      			sys202PmaFile.flush(); 
      		}
      		if(sys210MqDataFile.hasOpened() && !sys210MqDataFile.isReadOnly()) { 
      			sys210MqDataFile.flush(); 
      		}
      }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 8
      * Input  :  

      * - ip64801LrmReqStat              COBOL Name: IP64801-LRM-REQ-STAT
      * - ip02014OperSysId               COBOL Name: IP02014-OPER-SYS-ID
      * - valueZos300                    COBOL Name: 300-VALUE-ZOS
      * - ip02014PrcssAgrmtId            COBOL Name: IP02014-PRCSS-AGRMT-ID
      * - valueLprus300                  COBOL Name: 300-VALUE-LPRUS
      * - valueRpnspk300                 COBOL Name: 300-VALUE-RPNSPK
      * - isDebugSwOn100                 COBOL Name: 100-IS-DEBUG-SW-ON
      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      *
      * Output :  

      * - ip75081MqOptions               COBOL Name: IP75081-MQ-OPTIONS
      * - rc                             COBOL Name: RETURN-CODE
      * - ip75081IsItEndOfProcess        COBOL Name: IP75081-IS-IT-END-OF-PROCESS
      *
      * @throws CFException
      */
      private void mainline() throws Exception {
			// Declare local variables used in the method
			Ip02014TableDataFields ip02014TableDataFields = ip02014PrcssAgrmtTable.getIp02014TableDataFields();
			char[] ip02014OperSysId = null;
			char[] valueZos300 = null;
			char[] ip02014PrcssAgrmtId = null;
			char[] valueLprus300 = null;
			char[] valueRpnspk300 = null;
			Ip02014TableDataKey ip02014TableDataKey = ip02014PrcssAgrmtTable.getIp02014TableDataKey();
			// End of variable declaration

      
// *    Code is r and into an internal table if not               = *
// * 3. read the records from the dynamic files or internal table   *
// *    and insert into tipapim table.                              *
// * 4. on successful insertion of records into the gcms pim, delete*
// *    those rows from tamapma.                                    *
// *==> processing remotely                                         *
// * 1. retrieve data from remote tipapim                           *
// * 2. write the retrieved records into dynamic files.             *
// * 3. read the records from the dynamic files and insert into     *
// *    local tipapim table.                                        *
// *----------------------------------------------------------------*
//  PERFORM 1000-INITIALIZE-PROCESS
          initializeProcess();/*1000-INITIALIZE-PROCESS*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS-AUTH-TABLES UNTIL IP64801-88-LRM-STAT-END
          while (!(ip64801LrmCommBlock.isIp6480188LrmStatEnd()) ) {
             processAuthTables();/*2000-PROCESS-AUTH-TABLES*/
             if (this.isProgramEnded()) {
                 return ;
             }
          }
//  PERFORM 4000-OPEN-WRITE-SYS001-OUTFIL
          openWriteSys001Outfil();/*4000-OPEN-WRITE-SYS001-OUTFIL*/
          if (this.isProgramEnded()) {
              return ;
          }
          valueZos300 = work.getValueZos300();
          ip02014OperSysId = ip02014TableDataFields.getIp02014OperSysId();
//  IF IP02014-OPER-SYS-ID EQUAL 300-VALUE-ZOS
          if (		compareChars(ip02014OperSysId,valueZos300) == 0 ) { 
//  SET 88-IP75081-MQ-SEND TO TRUE
              ip75081MqSwitches.setIp75081MqSend88True(); 
              
//  CALL 800-PTR-IP750080
              // CALL 800-PTR-IP750080
              	this.setRc( ip750080.process());
//  SET 88-IP75081-END-OF-PROCESS TO TRUE
              ip75081MqSwitches.setIp75081EndOfProcess88True(); 
              
//  CALL 800-PTR-IP750080
              // CALL 800-PTR-IP750080
              	this.setRc( ip750080.process());
          }
  
//  ELSE
          else { 
//  PERFORM 6000-END-PROCESS
              endProcess6000();/*6000-END-PROCESS*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
//  IF IP02014-PRCSS-AGRMT-ID EQUAL 300-VALUE-LPRUS OR IP02014-PRCSS-AGRMT-ID EQUAL 300-VALUE-RPNSPK
          ip02014PrcssAgrmtId = ip02014TableDataKey.getIp02014PrcssAgrmtId();
          valueRpnspk300 = work.getValueRpnspk300();
          valueLprus300 = work.getValueLprus300();
//  ELSE
          if (		compareChars(ip02014PrcssAgrmtId,valueLprus300) != 0  && 		compareChars(ip02014PrcssAgrmtId,valueRpnspk300) != 0 ) { 
//  PERFORM 7000-CLOSE-DISCONNECT-Q
              closeDisconnectQ();/*7000-CLOSE-DISCONNECT-Q*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
//  IF 88-100-DEBUG-SW-Y AND 88-100-PROCESSING-REMOTELY
          if ( isDebugSwOnGroup100.isDebugSwY88100()   &&  work.isProcessingRemotely88100()  ) { 
//  PERFORM 4500-CLOSE-SYS210-FILE
              closeSys210File();/*4500-CLOSE-SYS210-FILE*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * initializeProcess 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE-PROCESS COBOL Cyclomatic complexity - 7
      * Input  :  

      * - pgmIp798030300                 COBOL Name: 300-PGM-IP798030
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - ip02014PrcssAgrmtId            COBOL Name: IP02014-PRCSS-AGRMT-ID
      * - valueLprus300                  COBOL Name: 300-VALUE-LPRUS
      * - valueRpnspk300                 COBOL Name: 300-VALUE-RPNSPK
      * - commitCnt800                   COBOL Name: 800-COMMIT-CNT
      * - debugFlag800                   COBOL Name: 800-DEBUG-FLAG
      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      *
      * Output :  

      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      * - pgmIp798030300                 COBOL Name: 300-PGM-IP798030
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - ip64801LrmReqStat              COBOL Name: IP64801-LRM-REQ-STAT
      * - tableRows100                   COBOL Name: 100-TABLE-ROWS
      * - checkFirstGetPim100            COBOL Name: 100-CHECK-FIRST-GET-PIM
      * - checkFirstPutPim100            COBOL Name: 100-CHECK-FIRST-PUT-PIM
      * - ip75081IsItEndOfProcess        COBOL Name: IP75081-IS-IT-END-OF-PROCESS
      * - ip75081IsFromPgm               COBOL Name: IP75081-IS-FROM-PGM
      * - noOfValidTrans400              COBOL Name: 400-NO-OF-VALID-TRANS
      * - mqPimRec400                    COBOL Name: 400-MQ-PIM-REC
      * - pimLen800                      COBOL Name: 800-PIM-LEN
      * - ip70521MsgBuffer               COBOL Name: IP70521-MSG-BUFFER
      * - isDebugSwOn100                 COBOL Name: 100-IS-DEBUG-SW-ON
      * - ip64801LrmRequest              COBOL Name: IP64801-LRM-REQUEST
      *
      * @throws CFException
      */
      private void initializeProcess() throws Exception {
			// Declare local variables used in the method
			Ip02014TableDataKey ip02014TableDataKey = ip02014PrcssAgrmtTable.getIp02014TableDataKey();
			char[] ip02014PrcssAgrmtId = null;
			char[] valueLprus300 = null;
			char[] valueRpnspk300 = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph calls routines to,                               *
// * 1. update event log                                            *
// * 2. display execution messages                                  *
// * 3. set procedure pointers to called programs                   *
// * 4. open required files                                         *
// * 5. retrieve processing agreement information.                  *
// * 6. establish mq connection.                                    *
// *----------------------------------------------------------------*
//  MOVE 300-PGM-IP798030 TO IP60001-HOLD-PGM-NAME
          ip60001EventLogWorkArea.setIp60001HoldPgmName(work.getPgmIp798030300());
//  PERFORM 9950-UPDATE-EVENT-LOG
          updateEventLog();/*9950-UPDATE-EVENT-LOG*/
//  IF 88-100-IT-IS-FIRST-TIME
          if ( work.isItIsFirstTime88100()  ) { 
//  PERFORM 1100-DISPLAY-EXEC-MSGS
              displayExecMsgs();/*1100-DISPLAY-EXEC-MSGS*/
//  PERFORM 1200-SET-PROCEDURE-POINTERS
              setProcedurePointers();/*1200-SET-PROCEDURE-POINTERS*/
//  PERFORM 1300-POPULATE-PARM-TO-XTRNAL
              populateParmToXtrnal();/*1300-POPULATE-PARM-TO-XTRNAL*/
//  PERFORM 1500-OPEN-READ-SYS001-INFILE
              openReadSys001Infile();/*1500-OPEN-READ-SYS001-INFILE*/
//  PERFORM 1600-GET-ENV-CNTRL-INFO
              getEnvCntrlInfo();/*1600-GET-ENV-CNTRL-INFO*/
//  PERFORM 1700-GET-RUN-CNTRL-FILE
              getRunCntrlFile();/*1700-GET-RUN-CNTRL-FILE*/
//  PERFORM 1800-GET-PA-INFO
              getPaInfo();/*1800-GET-PA-INFO*/
//  IF IP02014-PRCSS-AGRMT-ID EQUAL 300-VALUE-LPRUS OR IP02014-PRCSS-AGRMT-ID EQUAL 300-VALUE-RPNSPK
              ip02014PrcssAgrmtId = ip02014TableDataKey.getIp02014PrcssAgrmtId();
              valueRpnspk300 = work.getValueRpnspk300();
              valueLprus300 = work.getValueLprus300();
//  ELSE
              if (		compareChars(ip02014PrcssAgrmtId,valueLprus300) != 0  && 		compareChars(ip02014PrcssAgrmtId,valueRpnspk300) != 0 ) { 
//  PERFORM 1900-ESTABLISH-MQ-CONNECTION
                  establishMqConnection();/*1900-ESTABLISH-MQ-CONNECTION*/
              }
  
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              work.setItIsNotFirstTime88100True(); 
              
//  SET IP64801-88-LRM-STAT-AOK TO TRUE
              ip64801LrmCommBlock.setIp6480188LrmStatAokTrue(); 
              
//  SET 88-TABLE-ROWS-REMAINING TO TRUE
              work.setTableRowsRemaining88True(); 
              
//  DISPLAY 'IP798030-COMMIT FREQUENCY => ' 800-COMMIT-CNT
              logger.info("IP798030-COMMIT FREQUENCY => {}", String.valueOf(parms.getCommitCnt800())); 
//  SET 88-100-FIRST-GET-PIM TO TRUE
              checkFirstGetPimGroup100.setFirstGetPim88100True(); 
              
//  SET 88-100-FIRST-PUT-PIM TO TRUE
              checkFirstPutPimGroup100.setFirstPutPim88100True(); 
              
//  SET 88-IP75081-NT-END-OF-PROCESS TO TRUE
              ip75081MqSwitches.setIp75081NtEndOfProcess88True(); 
              
//  SET 88-IP75081-IS-FROM-PIM TO TRUE
              ip75081MqSwitches.setIp75081IsFromPim88True(); 
              
//  MOVE ZEROES TO 400-NO-OF-VALID-TRANS 400-MQ-PIM-REC
              work.setNoOfValidTrans400(0);
              work.setMqPimRec400(0);
//  MOVE LENGTH OF IP34631-TIPAPIM TO 800-PIM-LEN
              work.setPimLen800(Ip34631Tipapim.getIp34631TipapimFieldLength());
//  MOVE SPACES TO IP70521-MSG-BUFFER
              ip70521MqApiLayout.setIp70521MsgBuffer(CONSTANTS.SPACE_4000000);
//  SET 88-100-DEBUG-SW-N TO TRUE
              isDebugSwOnGroup100.setDebugSwN88100True(); 
              
//  IF 88-800-DEBUG-FLAG-Y
              if ( parms.isDebugFlagY88800()  ) { 
//  SET 88-100-DEBUG-SW-Y TO TRUE
                  isDebugSwOnGroup100.setDebugSwY88100True(); 
                  
              }
//  IF 88-100-DEBUG-SW-Y AND 88-100-PROCESSING-REMOTELY
              if ( isDebugSwOnGroup100.isDebugSwY88100()   &&  work.isProcessingRemotely88100()  ) { 
//  PERFORM 1950-OPEN-SYS210-FILE
                  openSys210File();/*1950-OPEN-SYS210-FILE*/
              }
          }
//  SET IP64801-88-LRM-STRT-REQ TO TRUE
          ip64801LrmCommBlock.setIp6480188LrmStrtReqTrue(); 
          
      
      }
      /**
      * displayExecMsgs 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-DISPLAY-EXEC-MSGS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      * - pgmIp798030300                 COBOL Name: 300-PGM-IP798030
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      *
      * Output :  

      * - ptrIp996010800                 COBOL Name: 800-PTR-IP996010
      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - pgmIp798030300                 COBOL Name: 300-PGM-IP798030
      * - ip996011PgmVersion             COBOL Name: IP996011-PGM-VERSION
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip996011WhenCompiled           COBOL Name: IP996011-WHEN-COMPILED
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void displayExecMsgs() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph displays program execution messages like program *
// *name, version, compiled date and time, etc.                     *
// *----------------------------------------------------------------*
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          work.setPtrIp996010800(work.getPgmIp996010300()); 
          
//  MOVE 300-PGM-IP798030 TO IP996011-PGM-ID
          ip996011ProgramStartMessage.setIp996011PgmId(work.getPgmIp798030300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          ip996011ProgramStartMessage.setIp996011PgmVersion(work.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          ip996011ProgramStartMessage.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_149012105));
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	this.setRc( ip996010.process());
      
      }
      /**
      * setProcedurePointers 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-SET-PROCEDURE-POINTERS COBOL Cyclomatic complexity - 23
      * Input  :  

      * - pgmIp610010300                 COBOL Name: 300-PGM-IP610010
      * - pgmIp081050300                 COBOL Name: 300-PGM-IP081050
      * - pgmIp081110300                 COBOL Name: 300-PGM-IP081110
      * - pgmIp081190300                 COBOL Name: 300-PGM-IP081190
      * - pgmIp282210300                 COBOL Name: 300-PGM-IP282210
      * - pgmIp282240300                 COBOL Name: 300-PGM-IP282240
      * - pgmIp500920300                 COBOL Name: 300-PGM-IP500920
      * - pgmIp532010300                 COBOL Name: 300-PGM-IP532010
      * - pgmIp532110300                 COBOL Name: 300-PGM-IP532110
      * - pgmIp534110300                 COBOL Name: 300-PGM-IP534110
      * - pgmIp595010300                 COBOL Name: 300-PGM-IP595010
      * - pgmIp599050300                 COBOL Name: 300-PGM-IP599050
      * - pgmIp599810300                 COBOL Name: 300-PGM-IP599810
      * - pgmIp648010300                 COBOL Name: 300-PGM-IP648010
      * - pgmIp670010300                 COBOL Name: 300-PGM-IP670010
      * - pgmIp699910300                 COBOL Name: 300-PGM-IP699910
      * - pgmIp699930300                 COBOL Name: 300-PGM-IP699930
      * - pgmIp760010300                 COBOL Name: 300-PGM-IP760010
      * - pgmIp750080300                 COBOL Name: 300-PGM-IP750080
      * - pgmIp703020300                 COBOL Name: 300-PGM-IP703020
      * - pgmIp708020300                 COBOL Name: 300-PGM-IP708020
      * - pgmIp996020300                 COBOL Name: 300-PGM-IP996020
      *
      * Output :  

      * - abendPtr800                    COBOL Name: 800-ABEND-PTR
      * - ptrIp081050800                 COBOL Name: 800-PTR-IP081050
      * - ptrIp081110800                 COBOL Name: 800-PTR-IP081110
      * - ptrIp081190800                 COBOL Name: 800-PTR-IP081190
      * - ptrIp282210800                 COBOL Name: 800-PTR-IP282210
      * - ptrIp282240800                 COBOL Name: 800-PTR-IP282240
      * - ptrIp500920800                 COBOL Name: 800-PTR-IP500920
      * - ptrIp532010800                 COBOL Name: 800-PTR-IP532010
      * - ptrIp532110800                 COBOL Name: 800-PTR-IP532110
      * - ptrIp534110800                 COBOL Name: 800-PTR-IP534110
      * - ptrIp595010800                 COBOL Name: 800-PTR-IP595010
      * - ptrIp599050800                 COBOL Name: 800-PTR-IP599050
      * - ptrIp599810800                 COBOL Name: 800-PTR-IP599810
      * - ptrIp648010800                 COBOL Name: 800-PTR-IP648010
      * - ptrIp670010800                 COBOL Name: 800-PTR-IP670010
      * - ptrIp699910800                 COBOL Name: 800-PTR-IP699910
      * - ptrIp699930800                 COBOL Name: 800-PTR-IP699930
      * - ptrIp760010800                 COBOL Name: 800-PTR-IP760010
      * - ptrIp750080800                 COBOL Name: 800-PTR-IP750080
      * - ptrIp703020800                 COBOL Name: 800-PTR-IP703020
      * - ptrIp708020800                 COBOL Name: 800-PTR-IP708020
      * - ptrIp996020800                 COBOL Name: 800-PTR-IP996020
      *
      * @throws CFException
      */
      private void setProcedurePointers() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph sets the procedure pointers for the called       *
// *programs.                                                       *
// *----------------------------------------------------------------*
//  SET 800-ABEND-PTR TO ENTRY 300-PGM-IP610010
          work.setAbendPtr800(work.getPgmIp610010300()); 
          
//  SET 800-PTR-IP081050 TO ENTRY 300-PGM-IP081050
          work.setPtrIp081050800(work.getPgmIp081050300()); 
          
//  SET 800-PTR-IP081110 TO ENTRY 300-PGM-IP081110
          work.setPtrIp081110800(work.getPgmIp081110300()); 
          
//  SET 800-PTR-IP081190 TO ENTRY 300-PGM-IP081190
          work.setPtrIp081190800(work.getPgmIp081190300()); 
          
//  SET 800-PTR-IP282210 TO ENTRY 300-PGM-IP282210
          work.setPtrIp282210800(work.getPgmIp282210300()); 
          
//  SET 800-PTR-IP282240 TO ENTRY 300-PGM-IP282240
          work.setPtrIp282240800(work.getPgmIp282240300()); 
          
//  SET 800-PTR-IP500920 TO ENTRY 300-PGM-IP500920
          work.setPtrIp500920800(work.getPgmIp500920300()); 
          
//  SET 800-PTR-IP532010 TO ENTRY 300-PGM-IP532010
          work.setPtrIp532010800(work.getPgmIp532010300()); 
          
//  SET 800-PTR-IP532110 TO ENTRY 300-PGM-IP532110
          work.setPtrIp532110800(work.getPgmIp532110300()); 
          
//  SET 800-PTR-IP534110 TO ENTRY 300-PGM-IP534110
          work.setPtrIp534110800(work.getPgmIp534110300()); 
          
//  SET 800-PTR-IP595010 TO ENTRY 300-PGM-IP595010
          work.setPtrIp595010800(work.getPgmIp595010300()); 
          
//  SET 800-PTR-IP599050 TO ENTRY 300-PGM-IP599050
          work.setPtrIp599050800(work.getPgmIp599050300()); 
          
//  SET 800-PTR-IP599810 TO ENTRY 300-PGM-IP599810
          work.setPtrIp599810800(work.getPgmIp599810300()); 
          
//  SET 800-PTR-IP648010 TO ENTRY 300-PGM-IP648010
          work.setPtrIp648010800(work.getPgmIp648010300()); 
          
//  SET 800-PTR-IP670010 TO ENTRY 300-PGM-IP670010
          work.setPtrIp670010800(work.getPgmIp670010300()); 
          
//  SET 800-PTR-IP699910 TO ENTRY 300-PGM-IP699910
          work.setPtrIp699910800(work.getPgmIp699910300()); 
          
//  SET 800-PTR-IP699930 TO ENTRY 300-PGM-IP699930
          work.setPtrIp699930800(work.getPgmIp699930300()); 
          
//  SET 800-PTR-IP760010 TO ENTRY 300-PGM-IP760010
          work.setPtrIp760010800(work.getPgmIp760010300()); 
          
//  SET 800-PTR-IP750080 TO ENTRY 300-PGM-IP750080
          work.setPtrIp750080800(work.getPgmIp750080300()); 
          
//  SET 800-PTR-IP703020 TO ENTRY 300-PGM-IP703020
          work.setPtrIp703020800(work.getPgmIp703020300()); 
          
//  SET 800-PTR-IP708020 TO ENTRY 300-PGM-IP708020
          work.setPtrIp708020800(work.getPgmIp708020300()); 
          
//  SET 800-PTR-IP996020 TO ENTRY 300-PGM-IP996020
          work.setPtrIp996020800(work.getPgmIp996020300()); 
          
      
      }
      /**
      * populateParmToXtrnal 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-POPULATE-PARM-TO-XTRNAL COBOL Cyclomatic complexity - 5
      * Input  :  

      * - retryCount800                  COBOL Name: 800-RETRY-COUNT
      * - parmJobgroup800                COBOL Name: 800-PARM-JOBGROUP
      * - parmJobgrpNum800               COBOL Name: 800-PARM-JOBGRP-NUM
      * - para1300300                    COBOL Name: 300-PARA-1300
      * - invalidParmMsgTxt696           COBOL Name: 696-INVALID-PARM-MSG-TXT
      * - jobgrpNoErrAbendCode300        COBOL Name: 300-JOBGRP-NO-ERR-ABEND-CODE
      *
      * Output :  

      * - ip30881911RetryValue           COBOL Name: IP30881-911-RETRY-VALUE
      * - retryCount800                  COBOL Name: 800-RETRY-COUNT
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1300300                    COBOL Name: 300-PARA-1300
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - invalidParmMsgTxt696           COBOL Name: 696-INVALID-PARM-MSG-TXT
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - jobgrpNoErrAbendCode300        COBOL Name: 300-JOBGRP-NO-ERR-ABEND-CODE
      * - jobname800                     COBOL Name: 800-JOBNAME
      * - parmJobgroup800                COBOL Name: 800-PARM-JOBGROUP
      * - jobNumber800                   COBOL Name: 800-JOB-NUMBER
      * - parmJobgrpNum800               COBOL Name: 800-PARM-JOBGRP-NUM
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      *
      * @throws CFException
      */
      private void populateParmToXtrnal() throws Exception {
			// Declare local variables used in the method
			int parmJobgrpNum800 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// * This para retrieves clearing supervisor jobgroup and job number
// * from the jcl and does the validation. used as a os-job-name in
// * the tipatsk table.
// *-----------------------------------------------------------------
//  MOVE 800-RETRY-COUNT TO IP30881-911-RETRY-VALUE
          ip30881Db2McwaitInputValue.setIp30881911RetryValue(parms.getRetryCount800());
          parmJobgrpNum800 = parms.getParmJobgrpNum800();
//  IF 800-PARM-JOBGROUP IS EQUAL TO SPACES OR 800-PARM-JOBGRP-NUM IS EQUAL TO ( LOW-VALUES OR SPACES OR ZEROS)
          if (        ( allSpaces(parms.getParmJobgroup800())   ) || (			( checkLowValue(parms.getParmJobgrpNum800String()) )  || compareChars(parms.getParmJobgrpNum800String(),CONSTANTS.SPACE_2) == 0 || 	( parmJobgrpNum800 == 0 ))) { 
//  MOVE 300-PARA-1300 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1300300());
//  MOVE 696-INVALID-PARM-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(66,work.getInvalidParmMsgTxt696(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-JOBGRP-NO-ERR-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getJobgrpNoErrAbendCode300());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
  
//  ELSE
          else { 
//  MOVE 800-PARM-JOBGROUP TO 800-JOBNAME
              jobname800.setString(parms.getParmJobgroup800());
//  MOVE 800-PARM-JOBGRP-NUM TO 800-JOB-NUMBER
              jobname800.setJobNumber800(parms.getParmJobgrpNum800());
//  MOVE 800-PARM-JOBGROUP TO IP64801-LRM-JOBGRP-NAME
              ip64801LrmCommBlock.setIp64801LrmJobgrpName(parms.getParmJobgroup800());
//  MOVE 800-PARM-JOBGRP-NUM TO IP64801-LRM-JOBGRP-NUM
              ip64801LrmCommBlock.setIp64801LrmJobgrpNum(parms.getParmJobgrpNum800());
          }
      
      }
      /**
      * openReadSys001Infile 
      *   This method is derived from 
  *   COBOL Paragraph - 1500-OPEN-READ-SYS001-INFILE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void openReadSys001Infile() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph performs routines to open & read the settlement  *
// *code control card                                               *
// *----------------------------------------------------------------*
//  PERFORM 1510-OPEN-INPUT-SYS001
          openInputSys001();/*1510-OPEN-INPUT-SYS001*/
//  PERFORM 1520-READ-INPUT-SYS001
          readInputSys001();/*1520-READ-INPUT-SYS001*/
//  PERFORM 8400-CLOSE-SYS001-CUTOFF
          closeSys001Cutoff();/*8400-CLOSE-SYS001-CUTOFF*/
          ;
      
      }
      /**
      * openInputSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 1510-OPEN-INPUT-SYS001 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - para1510300                    COBOL Name: 300-PARA-1510
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - sys210FileStatus200            COBOL Name: 200-SYS210-FILE-STATUS
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1510300                    COBOL Name: 300-PARA-1510
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      private void openInputSys001() throws Exception {
      
// *----------------------------------------------------------------*
//  OPEN INPUT SYS001-CUTOFF-FILE
          sys001CutoffFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys001CutoffFile.getFileName(),sys001CutoffFile.getSys001CutoffFileCharSet(),sys001CutoffFile.getSys001CutoffFileCrlfFlag());
          work.setSys001FileStatus200(sys001CutoffFile.getStatusString() );
//  IF 88-200-SYS001-IO-GOOD
//  ELSE
          if (!(work.isSys001IoGood88200()) ) { 
//  SET 88-800-SYS001 TO TRUE
              work.setSys00188800True(); 
              
//  SET 88-600-FILE-OPEN-ERR TO TRUE
              fileIoErrMsgTxt600.setFileOpenErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              fileIoErrMsgTxt600.setFileName600(work.getFileName800());
//  MOVE 200-SYS001-FILE-STATUS TO 600-FILE-STATUS
              fileIoErrMsgTxt600.setFileStatus600(work.getSys001FileStatus200());
//  MOVE 300-PARA-1510 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1510300());
//  MOVE 300-OPEN-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getOpenAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(fileIoErrMsgTxt600.toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
      
      }
      /**
      * readInputSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 1520-READ-INPUT-SYS001 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - para1520300                    COBOL Name: 300-PARA-1520
      * - readAbendCode300               COBOL Name: 300-READ-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys001CutoffRecord             COBOL Name: SYS001-CUTOFF-RECORD
      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1520300                    COBOL Name: 300-PARA-1520
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - readAbendCode300               COBOL Name: 300-READ-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      private void readInputSys001() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph reads sys001 and check file status.              *
// *----------------------------------------------------------------*
//  READ SYS001-CUTOFF-FILE INTO 800-CUTOFF-TS-DATA END-READ
          	sys001CutoffFile.read();
          work.setSys001FileStatus200(sys001CutoffFile.getStatusString() );
          if (!sys001CutoffFile.hasEnded()) {
             sys001CutoffRecord.setString(sys001CutoffFile.getRecord());
             cutoffTsData800.setString(sys001CutoffRecord.toCharArray());
          }
//  IF 88-200-SYS001-IO-GOOD
//  ELSE
          if (!(work.isSys001IoGood88200()) ) { 
//  SET 88-800-SYS001 TO TRUE
              work.setSys00188800True(); 
              
//  SET 88-600-FILE-READ-ERR TO TRUE
              fileIoErrMsgTxt600.setFileReadErr88600True(); 
              
//  MOVE 300-PARA-1520 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1520300());
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              fileIoErrMsgTxt600.setFileName600(work.getFileName800());
//  MOVE 200-SYS001-FILE-STATUS TO 600-FILE-STATUS
              fileIoErrMsgTxt600.setFileStatus600(work.getSys001FileStatus200());
//  MOVE 300-READ-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getReadAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(fileIoErrMsgTxt600.toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
      
      }
      /**
      * getEnvCntrlInfo 
      *   This method is derived from 
  *   COBOL Paragraph - 1600-GET-ENV-CNTRL-INFO COBOL Cyclomatic complexity - 1
      * Input  :  

      * - environmentInd800              COBOL Name: 800-ENVIRONMENT-IND
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - ip70511EnvCd                   COBOL Name: IP70511-ENV-CD
      * - environmentInd800              COBOL Name: 800-ENVIRONMENT-IND
      *
      * @throws CFException
      */
      private void getEnvCntrlInfo() throws Exception {
			// Declare local variables used in the method
			Ip70511TableKey ip70511TableKey = ip70511Table.getIp70511TableKey();
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This paragraph open/read/close sys067 environment file
// *-----------------------------------------------------------------
//  CALL 800-PTR-IP081190
          // CALL 800-PTR-IP081190
          	this.setRc( ip081190.process());
//  MOVE 800-ENVIRONMENT-IND TO IP70511-ENV-CD
          ip70511TableKey.setIp70511EnvCd(envArea800.getEnvironmentInd800());
  
      
      }
      /**
      * getRunCntrlFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1700-GET-RUN-CNTRL-FILE COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip08101ProcessDate             COBOL Name: IP08101-PROCESS-DATE
      * - ip08101RptProcessTime          COBOL Name: IP08101-RPT-PROCESS-TIME
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - ip50005ClearingDt              COBOL Name: IP50005-CLEARING-DT
      * - ip08101ProcessDate             COBOL Name: IP08101-PROCESS-DATE
      * - ip50005ClearingTm              COBOL Name: IP50005-CLEARING-TM
      * - ip08101RptProcessTime          COBOL Name: IP08101-RPT-PROCESS-TIME
      *
      * @throws CFException
      */
      private void getRunCntrlFile() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph call ip081110 to get the run control file details*
// *it will then move the run control date to get the records from  *
// *oneday file.                                                    *
// *----------------------------------------------------------------*
//  CALL 800-PTR-IP081110
          // CALL 800-PTR-IP081110
          	this.setRc( ip081110.process());
//  MOVE IP08101-PROCESS-DATE (1 : 4) TO IP50005-CLEARING-DT (1 : 4)
          ip50005ClearingDtTm.setIp50005ClearingDt(replace(ip50005ClearingDtTm.getIp50005ClearingDt(),String.valueOf(substring(ip08101RunControlRecord.getIp08101ProcessDateString(),0,4)).toCharArray(),0,4));
//  MOVE IP08101-PROCESS-DATE (5 : 2) TO IP50005-CLEARING-DT (5 : 2)
          ip50005ClearingDtTm.setIp50005ClearingDt(replace(ip50005ClearingDtTm.getIp50005ClearingDt(),String.valueOf(substring(ip08101RunControlRecord.getIp08101ProcessDateString(),4,6)).toCharArray(),4,6));
//  MOVE IP08101-PROCESS-DATE (7 : 2) TO IP50005-CLEARING-DT (7 : 2)
          ip50005ClearingDtTm.setIp50005ClearingDt(replace(ip50005ClearingDtTm.getIp50005ClearingDt(),String.valueOf(substring(ip08101RunControlRecord.getIp08101ProcessDateString(),6,8)).toCharArray(),6,8));
//  MOVE IP08101-RPT-PROCESS-TIME (1 : 2) TO IP50005-CLEARING-TM (1 : 2)
          ip50005ClearingDtTm.replace(ip08101RunControlRecord/*parent*/,44/*fromOffset - (ip50005ClearingTm) */,2/*fromLen*/,8/*toOffset - (ip08101RptProcessTime) */,2/*toLen*/);
      
      }
      /**
      * getPaInfo 
      *   This method is derived from 
  *   COBOL Paragraph - 1800-GET-PA-INFO COBOL Cyclomatic complexity - 8
      * Input  :  

      * - value1300                      COBOL Name: 300-VALUE-1
      * - ip69931ProcessingAgreement     COBOL Name: IP69931-PROCESSING-AGREEMENT
      * - clearingApplicationId300       COBOL Name: 300-CLEARING-APPLICATION-ID
      * - ip69931ResponseStatus          COBOL Name: IP69931-RESPONSE-STATUS
      * - para1800300                    COBOL Name: 300-PARA-1800
      * - ip69931ErrorMsg                COBOL Name: IP69931-ERROR-MSG
      * - ip699930ErrAbendCode300        COBOL Name: 300-IP699930-ERR-ABEND-CODE
      *
      * Output :  

      * - ip02015PrcssAgrmtTable         COBOL Name: IP02015-PRCSS-AGRMT-TABLE
      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      * - ip28221Restart                 COBOL Name: IP28221-RESTART
      * - rc                             COBOL Name: RETURN-CODE
      * - ip02015HostGeoScopeCode        COBOL Name: IP02015-HOST-GEO-SCOPE-CODE
      * - ip02015PaIndex                 COBOL Name: IP02015-PA-INDEX
      * - ip02015PasFoundCount           COBOL Name: IP02015-PAS-FOUND-COUNT
      * - ip02015GeoScopeCode            COBOL Name: IP02015-GEO-SCOPE-CODE
      * - ip02015PrcssAgrmtId            COBOL Name: IP02015-PRCSS-AGRMT-ID
      * - ip69931ProcessingAgreement     COBOL Name: IP69931-PROCESSING-AGREEMENT
      * - ip69931ApplicationSystemId     COBOL Name: IP69931-APPLICATION-SYSTEM-ID
      * - clearingApplicationId300       COBOL Name: 300-CLEARING-APPLICATION-ID
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1800300                    COBOL Name: 300-PARA-1800
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip69931ErrorMsg                COBOL Name: IP69931-ERROR-MSG
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip699930ErrAbendCode300        COBOL Name: 300-IP699930-ERR-ABEND-CODE
      * - ip02015HostPrcssAgrmtId        COBOL Name: IP02015-HOST-PRCSS-AGRMT-ID
      * - ip02014PrcssAgrmtId            COBOL Name: IP02014-PRCSS-AGRMT-ID
      *
      * @throws CFException
      */
      private void getPaInfo() throws Exception {
			// Declare local variables used in the method
			Ip69931InputFields ip69931InputFields = ip69931Linkage.getIp69931InputFields();
			Ip69931OutputFields ip69931OutputFields = ip69931Linkage.getIp69931OutputFields();
			Ip02015PrcssAgrmtTabEnt ip02015PrcssAgrmtTabEnt = ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt();
			Ip02014TableDataKey ip02014TableDataKey = ip02014PrcssAgrmtTable.getIp02014TableDataKey();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph call ip282210 to retrieve the processing         *
// *agreement information.  it is then determined if the program    *
// *is executing remotely (on soil) or locally (saint louis gcms)   *
// *                                                                *
// *if the program is executing on soil, program ip699930 is called *
// *to obtain the database connection info for the remote site.     *
// *----------------------------------------------------------------*
//  INITIALIZE IP02015-PRCSS-AGRMT-TABLE
          ip02015PrcssAgrmtTable.initialize();
//  SET 88-100-PROCESSING-LOCAL TO TRUE
          work.setProcessingLocal88100True(); 
          
//  SET 88-IP28221-IP282210-NO-RESTRT TO TRUE
          ip28221PaTableRestart.setIp28221Ip282210NoRestrt88True(); 
          
//  CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
          // CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
               this.setRc( ip282210.call(ip28221PaTableRestart));
//  IF 88-IP02015-HOST-PA-LOCAL OR 88-IP02015-HOST-PA-REGIONAL
          if ( ip02015PrcssAgrmtTable.isIp02015HostPaLocal88()   ||  ip02015PrcssAgrmtTable.isIp02015HostPaRegional88()  ) { 
//  SET 88-100-PROCESSING-REMOTELY TO TRUE
              work.setProcessingRemotely88100True(); 
              
//  PERFORM VARYING IP02015-PA-INDEX FROM 300-VALUE-1 BY 300-VALUE-1 UNTIL IP02015-PA-INDEX > IP02015-PAS-FOUND-COUNT OR IP69931-PROCESSING-AGREEMENT > SPACES
              for (ip02015PaIndex = work.getValue1300(); (	( ip02015PaIndex <= ip02015PrcssAgrmtTable.getIp02015PasFoundCount() ) &&                    ( isLessOrEqualSpaces(ip69931InputFields.getIp69931ProcessingAgreement()) )) ; ip02015PaIndex = ip02015PaIndex + work.getValue1300() ) {
//  IF IP02015-GEO-SCOPE-CODE ( IP02015-PA-INDEX ) = 'G'
                  if (ip02015PrcssAgrmtTabEnt.getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).getIp02015GeoScopeCode()[0] == 'G') { 
//  MOVE IP02015-PRCSS-AGRMT-ID ( IP02015-PA-INDEX ) TO IP69931-PROCESSING-AGREEMENT
                      ip69931InputFields.setIp69931ProcessingAgreement(ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).getIp02015PrcssAgrmtId());
  
//  MOVE 300-CLEARING-APPLICATION-ID TO IP69931-APPLICATION-SYSTEM-ID
                      ip69931InputFields.setIp69931ApplicationSystemId(work.getClearingApplicationId300());
  
//  CALL 800-PTR-IP699930
                      // CALL 800-PTR-IP699930
                      	this.setRc( ip699930.process());
                      ip69931OutputFields = ip69931Linkage.getIp69931OutputFields();
//  IF 88-IP69931-REQUEST-FAILED
                      if ( ip69931OutputFields.isIp69931RequestFailed88()  ) { 
//  MOVE 300-PARA-1800 TO 900-ABEND-PARA
                          abendParaName900.setAbendPara900(work.getPara1800300());
//  MOVE IP69931-ERROR-MSG TO 900-ABEND-TEXT
                          abendMessage900.setAbendText900(ip69931OutputFields.getIp69931ErrorMsg());
  
//  MOVE 300-IP699930-ERR-ABEND-CODE TO 900-ABEND-CODE
                          abendMessage900.setAbendCode900(work.getIp699930ErrAbendCode300());
//  PERFORM 9500-ABEND-THE-PROGRAM
                          abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
                      }
  
                  }
  
              }
  
          }
//  MOVE IP02015-HOST-PRCSS-AGRMT-ID TO IP02014-PRCSS-AGRMT-ID
          ip02014TableDataKey.setIp02014PrcssAgrmtId(ip02015PrcssAgrmtTable.getIp02015HostPrcssAgrmtId());
  
//  CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
          // CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
               this.setRc( ip282210.call(ip28221PaTableRestart));
      
      }
      /**
      * establishMqConnection 
      *   This method is derived from 
  *   COBOL Paragraph - 1900-ESTABLISH-MQ-CONNECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - cloneOwnerId800                COBOL Name: 800-CLONE-OWNER-ID
      * - ip996021LparName               COBOL Name: IP996021-LPAR-NAME
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - ip02015HostPrcssAgrmtId        COBOL Name: IP02015-HOST-PRCSS-AGRMT-ID
      * - ip02014OperSysId               COBOL Name: IP02014-OPER-SYS-ID
      * - valueLinux300                  COBOL Name: 300-VALUE-LINUX
      *
      * Output :  

      * - ip70511CloneOwnerId            COBOL Name: IP70511-CLONE-OWNER-ID
      * - cloneOwnerId800                COBOL Name: 800-CLONE-OWNER-ID
      * - rc                             COBOL Name: RETURN-CODE
      * - ip70511Cpu                     COBOL Name: IP70511-CPU
      * - ip996021LparName               COBOL Name: IP996021-LPAR-NAME
      * - ip57901JobGroup                COBOL Name: IP57901-JOB-GROUP
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip57901JobGrpNum               COBOL Name: IP57901-JOB-GRP-NUM
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - ip70511HostPrcssAgrmtId        COBOL Name: IP70511-HOST-PRCSS-AGRMT-ID
      * - ip02015HostPrcssAgrmtId        COBOL Name: IP02015-HOST-PRCSS-AGRMT-ID
      * - ip34051ProcessSwitch           COBOL Name: IP34051-PROCESS-SWITCH
      * - ip34051QueueType               COBOL Name: IP34051-QUEUE-TYPE
      * - ip34051ServCd                  COBOL Name: IP34051-SERV-CD
      * - ip34051FuncCd                  COBOL Name: IP34051-FUNC-CD
      * - ip34051TipacliSwitch           COBOL Name: IP34051-TIPACLI-SWITCH
      * - ip34051TipasvcSwitch           COBOL Name: IP34051-TIPASVC-SWITCH
      * - ip34051CallFromIp545110        COBOL Name: IP34051-CALL-FROM-IP545110
      *
      * @throws CFException
      */
      private void establishMqConnection() throws Exception {
			// Declare local variables used in the method
			Ip70511TableKey ip70511TableKey = ip70511Table.getIp70511TableKey();
			Ip57901TipaqprEntries ip57901TipaqprEntries = ip57901Tipaqpr.getIp57901TipaqprEntries();
			Ip02014TableDataFields ip02014TableDataFields = ip02014PrcssAgrmtTable.getIp02014TableDataFields();
			char[] ip02014OperSysId = null;
			char[] valueLinux300 = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph is used to perform the mq connection.
// *----------------------------------------------------------------*
//  MOVE 800-CLONE-OWNER-ID TO IP70511-CLONE-OWNER-ID
          ip70511TableKey.setIp70511CloneOwnerId(parms.getCloneOwnerId800());
  
//  CALL 800-PTR-IP996020
          // CALL 800-PTR-IP996020
          	this.setRc( ip996020.process());
//  MOVE IP996021-LPAR-NAME TO IP70511-CPU
          ip70511TableKey.setIp70511Cpu(ip996021JobInformation.getIp996021LparName());
  
//  MOVE IP64801-LRM-JOBGRP-NAME TO IP57901-JOB-GROUP
          ip57901TipaqprEntries.setIp57901JobGroup(ip64801LrmCommBlock.getIp64801LrmJobgrpName());
  
//  MOVE IP64801-LRM-JOBGRP-NUM TO IP57901-JOB-GRP-NUM
          ip57901TipaqprEntries.setIp57901JobGrpNum( ip64801LrmCommBlock.getIp64801LrmJobgrpNum());
  
//  MOVE IP02015-HOST-PRCSS-AGRMT-ID TO IP70511-HOST-PRCSS-AGRMT-ID
          ip70511TableKey.setIp70511HostPrcssAgrmtId(ip02015PrcssAgrmtTable.getIp02015HostPrcssAgrmtId());
  
//  SET 88-IP34051-REQUEST-START TO TRUE
          ip34051MqProcessParameters.setIp34051RequestStart88True(); 
          
          valueLinux300 = work.getValueLinux300();
          ip02014OperSysId = ip02014TableDataFields.getIp02014OperSysId();
//  IF IP02014-OPER-SYS-ID EQUAL 300-VALUE-LINUX
          if (		compareChars(ip02014OperSysId,valueLinux300) == 0 ) { 
//  SET 88-IP34051-RESPNSE-Q TO TRUE
              ip34051MqProcessParameters.setIp34051RespnseQ88True(); 
              
          }
  
//  ELSE
          else { 
//  SET 88-IP34051-REQUEST-Q TO TRUE
              ip34051MqProcessParameters.setIp34051RequestQ88True(); 
              
          }
//  SET 88-IP34051-SERV-CD-PIMMAP TO TRUE
          ip34051MqProcessParameters.setIp34051ServCdPimmap88True(); 
          
//  SET 88-IP34051-FUNC-CD-GENERAL TO TRUE
          ip34051MqProcessParameters.setIp34051FuncCdGeneral88True(); 
          
//  SET 88-IP34051-TIPACLI-ACTIVE-Y TO TRUE
          ip34051MqProcessParameters.setIp34051TipacliActiveY88True(); 
          
//  SET 88-IP34051-TIPASVC-ACTIVE-Y TO TRUE
          ip34051MqProcessParameters.setIp34051TipasvcActiveY88True(); 
          
//  SET 88-IP34051-IP545110-N TO TRUE
          ip34051MqProcessParameters.setIp34051Ip545110N88True(); 
          
//  CALL 800-PTR-IP703020
          // CALL 800-PTR-IP703020
          	this.setRc( ip703020.process());
      
      }
      /**
      * openSys210File 
      *   This method is derived from 
  *   COBOL Paragraph - 1950-OPEN-SYS210-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - para1950300                    COBOL Name: 300-PARA-1950
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - sys210FileStatus200            COBOL Name: 200-SYS210-FILE-STATUS
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1950300                    COBOL Name: 300-PARA-1950
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      private void openSys210File() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragrpah is used to open sys210 file.
// *----------------------------------------------------------------*
//  OPEN OUTPUT SYS210-MQ-DATA-FILE
          sys210MqDataFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys210MqDataFile.getFileName(),sys210MqDataFile.getSys210MqDataFileCharSet(),sys210MqDataFile.getSys210MqDataFileCrlfFlag());
          work.setSys210FileStatus200(sys210MqDataFile.getStatusString() );
//  IF 88-200-SYS210-IO-GOOD
//  ELSE
          if (!(work.isSys210IoGood88200()) ) { 
//  SET 88-800-SYS210 TO TRUE
              work.setSys21088800True(); 
              
//  SET 88-600-FILE-OPEN-ERR TO TRUE
              fileIoErrMsgTxt600.setFileOpenErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              fileIoErrMsgTxt600.setFileName600(work.getFileName800());
//  MOVE 200-SYS210-FILE-STATUS TO 600-FILE-STATUS
              fileIoErrMsgTxt600.setFileStatus600(work.getSys210FileStatus200());
//  MOVE 300-PARA-1950 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1950300());
//  MOVE 300-OPEN-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getOpenAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(fileIoErrMsgTxt600.toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
      
      }
      /**
      * processAuthTables 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESS-AUTH-TABLES COBOL Cyclomatic complexity - 10
      * Input  :  

      * - launchType800                  COBOL Name: 800-LAUNCH-TYPE
      * - value1300                      COBOL Name: 300-VALUE-1
      * - is1stLrmSwitch100              COBOL Name: 100-IS-1ST-LRM-SWITCH
      * - ip02014OperSysId               COBOL Name: IP02014-OPER-SYS-ID
      * - valueZos300                    COBOL Name: 300-VALUE-ZOS
      * - valueLinux300                  COBOL Name: 300-VALUE-LINUX
      * - cyclId7800                     COBOL Name: 800-CYCL-ID-7
      *
      * Output :  

      * - ip64801LrmReqStat              COBOL Name: IP64801-LRM-REQ-STAT
      * - ip30771ClrCyclId               COBOL Name: IP30771-CLR-CYCL-ID
      * - value1300                      COBOL Name: 300-VALUE-1
      * - is1stLrmSwitch100              COBOL Name: 100-IS-1ST-LRM-SWITCH
      * - tableRows100                   COBOL Name: 100-TABLE-ROWS
      * - ip64801LrmRequest              COBOL Name: IP64801-LRM-REQUEST
      *
      * @throws CFException
      */
      private void processAuthTables() throws Exception {
			// Declare local variables used in the method
			Ip02014TableDataFields ip02014TableDataFields = ip02014PrcssAgrmtTable.getIp02014TableDataFields();
			char[] ip02014OperSysId = null;
			char[] valueZos300 = null;
			char[] valueLinux300 = null;
			short ip30771ClrCyclId = 0;
			int cyclId7800 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph skips lrm look-up if it is of pre-clearing       *
// *catch-up process. this is because irrespective of lrm status,   *
// *we need to ensure all records from auth tables are synced up    *
// *to clearing gcms side. this would eliminate the need for        *
// *tipalrm table to be updated as part of pre-launch schedule.     *
// *(i.e.) the catch-up lrm process should be independent of        *
// *clearing pre-launch schedule.                                   *
// *----------------------------------------------------------------*
//  PERFORM 8500-SELECT-CKP
          selectCkp();/*8500-SELECT-CKP*/
//  PERFORM 2800-SET-BEGINNING-TS
          setBeginningTs();/*2800-SET-BEGINNING-TS*/
//  EVALUATE TRUE
          if  ( parms.isItIsPreclear88800()  ) { 
//  SET IP64801-88-LRM-STAT-AOK TO TRUE
              ip64801LrmCommBlock.setIp6480188LrmStatAokTrue(); 
              
//  MOVE 300-VALUE-1 TO IP30771-CLR-CYCL-ID
              ip30771TipacliTable.setIp30771ClrCyclId(work.getValue1300());
          }
          else if  ( work.isItIs1stSet88100()  ) { 
//  PERFORM 2700-CHECK-CLR-CYCL-ID
              checkClrCyclId();/*2700-CHECK-CLR-CYCL-ID*/
//  PERFORM 8200-CALL-LRM-IP648010
              callLrmIp648010();/*8200-CALL-LRM-IP648010*/
//  SET 88-100-IT-IS-1ST-NO-SET TO TRUE
              work.setItIs1stNoSet88100True(); 
              
          }
          else   { 
//  PERFORM 2700-CHECK-CLR-CYCL-ID
              checkClrCyclId();/*2700-CHECK-CLR-CYCL-ID*/
          }
//  IF IP64801-88-LRM-STAT-AOK
          if ( ip64801LrmCommBlock.isIp6480188LrmStatAok()  ) { 
              valueZos300 = work.getValueZos300();
              ip02014OperSysId = ip02014TableDataFields.getIp02014OperSysId();
//  IF IP02014-OPER-SYS-ID EQUAL 300-VALUE-ZOS
              if (		compareChars(ip02014OperSysId,valueZos300) == 0 ) { 
//  PERFORM 2100-RETRV-AUTH-DB2-DATA
                  retrvAuthDb2Data();/*2100-RETRV-AUTH-DB2-DATA*/
//  PERFORM 2200-PROCESS-AUTH-DB2-DATA
                  processAuthDb2Data();/*2200-PROCESS-AUTH-DB2-DATA*/
//  PERFORM 2300-DELETE-AUTH-DB2-DATA
                  deleteAuthDb2Data();/*2300-DELETE-AUTH-DB2-DATA*/
//  PERFORM 3000-END-PROCESS
                  endProcess();/*3000-END-PROCESS*/
              }
  
//  ELSE
              else { 
                  valueLinux300 = work.getValueLinux300();
                  ip02014OperSysId = ip02014TableDataFields.getIp02014OperSysId();
//  IF IP02014-OPER-SYS-ID EQUAL 300-VALUE-LINUX
                  if (		compareChars(ip02014OperSysId,valueLinux300) == 0 ) { 
//  PERFORM 5000-PROCESS-VIA-MQ
                      processViaMq();/*5000-PROCESS-VIA-MQ*/
//  SET 88-TABLE-ROWS-END TO TRUE
                      work.setTableRowsEnd88True(); 
                      
                  }
  
              }
              cyclId7800 = work.getCyclId7800();
//  IF 88-TABLE-ROWS-END OR IP30771-CLR-CYCL-ID EQUAL 800-CYCL-ID-7
              if ( work.isTableRowsEnd88()   || 	( ip30771TipacliTable.getIp30771ClrCyclId() == cyclId7800 ) ) { 
//  IF 88-800-IT-IS-PRECLEAR
                  if ( parms.isItIsPreclear88800()  ) { 
//  SET IP64801-88-LRM-STAT-END TO TRUE
                      ip64801LrmCommBlock.setIp6480188LrmStatEndTrue(); 
                      
                  }
//  ELSE
                  else { 
//  SET IP64801-88-LRM-DONE-REQ TO TRUE
                      ip64801LrmCommBlock.setIp6480188LrmDoneReqTrue(); 
                      
//  PERFORM 8200-CALL-LRM-IP648010
                      callLrmIp648010();/*8200-CALL-LRM-IP648010*/
                  }
              }
  
          }
      
      }
      /**
      * retrvAuthDb2Data 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-RETRV-AUTH-DB2-DATA COBOL Cyclomatic complexity - 3
      * Input  :  

      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      * - ip69931DatabaseId              COBOL Name: IP69931-DATABASE-ID
      * - ip69931CollectionId            COBOL Name: IP69931-COLLECTION-ID
      *
      * Output :  

      * - ip69901CafLink                 COBOL Name: IP69901-CAF-LINK
      * - ip69901DatabaseId              COBOL Name: IP69901-DATABASE-ID
      * - ip69931DatabaseId              COBOL Name: IP69931-DATABASE-ID
      * - ip69901CollectionId            COBOL Name: IP69901-COLLECTION-ID
      * - ip69931CollectionId            COBOL Name: IP69931-COLLECTION-ID
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void retrvAuthDb2Data() throws Exception {
			// Declare local variables used in the method
			Ip69931OutputFields ip69931OutputFields = ip69931Linkage.getIp69931OutputFields();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph establishes connection to either the auth db2    *
// *server or remote processing site for retrieval of data from     *
// *tamapma.                                                        *
// *-----------------------------------------------------------------
//  SET 88-IP69901-CAF-INIT TO TRUE
          ip69901CafLinkGroup.setIp69901CafInit88True(); 
          
//  IF 88-100-PROCESSING-REMOTELY
          if ( work.isProcessingRemotely88100()  ) { 
//  MOVE IP69931-DATABASE-ID TO IP69901-DATABASE-ID
              ip69901OptionalConnectPrms.setIp69901DatabaseId(ip69931OutputFields.getIp69931DatabaseId());
  
//  MOVE IP69931-COLLECTION-ID TO IP69901-COLLECTION-ID
              ip69901OptionalConnectPrms.setIp69901CollectionId(ip69931OutputFields.getIp69931CollectionId());
  
          }
//  CALL 800-PTR-IP699910
          // CALL 800-PTR-IP699910
          	this.setRc( ip699910.process());
//  IF 88-100-PROCESSING-REMOTELY
          if ( work.isProcessingRemotely88100()  ) { 
//  PERFORM 2120-PROCESS-AUTH-PIM
              processAuthPim();/*2120-PROCESS-AUTH-PIM*/
          }
//  ELSE
          else { 
//  PERFORM 2110-PROCESS-AUTH-PMA
              processAuthPma();/*2110-PROCESS-AUTH-PMA*/
          }
      
      }
      /**
      * processAuthPma 
      *   This method is derived from 
  *   COBOL Paragraph - 2110-PROCESS-AUTH-PMA COBOL Cyclomatic complexity - 6
      * Input  :  

      * - value5300                      COBOL Name: 300-VALUE-5
      * - tamapmaRowsFetched400          COBOL Name: 400-TAMAPMA-ROWS-FETCHED
      * - ip58041ActionCode              COBOL Name: IP58041-ACTION-CODE
      * - valueR300                      COBOL Name: 300-VALUE-R
      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      * - isSys202OpenSw100              COBOL Name: 100-IS-SYS202-OPEN-SW
      *
      * Output :  

      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - apiSwitch100                   COBOL Name: 100-API-SWITCH
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - queryNo                        COBOL Name: QUERY-NO
      * - value5300                      COBOL Name: 300-VALUE-5
      * - rc                             COBOL Name: RETURN-CODE
      * - isEndProcess100                COBOL Name: 100-IS-END-PROCESS
      * - tamapmaRowsFetched400          COBOL Name: 400-TAMAPMA-ROWS-FETCHED
      *
      * @throws CFException
      */
      private void processAuthPma() throws Exception {
			// Declare local variables used in the method
			char[] ip58041ActionCode = null;
			char[] valueR300 = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph -                                                *
// *1) retrieve auth data from tamapma or tipapim for remote        *
// *2) write the pma records to internal table/file                 *
// *----------------------------------------------------------------*
//  SET 88-100-ROWS-FOUND TO TRUE
          apiLayout.setRowsFound88100True(); 
          
//  SET 88-100-OPEN-FIRST-TIME TO TRUE
          apiLayout.setOpenFirstTime88100True(); 
          
//  SET 88-100-SELECT-RTN TO TRUE
          apiLayout.setSelectRtn88100True(); 
          
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          apiLayout.setItIsNotAbend88100True(); 
          
//  MOVE 300-VALUE-5 TO QUERY-NO
          apiLayout.setQueryNo(work.getValue5300());
//  CALL 800-PTR-IP534110
          // CALL 800-PTR-IP534110
          	this.setRc( ip534110.process());
//  IF 88-100-ROWS-FOUND
          if ( apiLayout.isRowsFound88100()  ) { 
//  SET 88-100-END-PROS-N TO TRUE
              work.setEndProsN88100True(); 
              
//  ADD 1 TO 400-TAMAPMA-ROWS-FETCHED
              work.setTamapmaRowsFetched400(work.getTamapmaRowsFetched400()+1);
              ip58041ActionCode = ip58041Tipapma.getIp58041ActionCode();
              valueR300 = work.getValueR300();
//  IF IP58041-ACTION-CODE = 300-VALUE-R
              if (		compareChars(ip58041ActionCode,valueR300) == 0 ) { 
//  PERFORM 2111-ALLOCATE-SYS202-OUTFILE
                  allocateSys202Outfile();/*2111-ALLOCATE-SYS202-OUTFILE*/
//  PERFORM 2112-OPEN-OP-SYS202-PMAFILE
                  openOpSys202Pmafile();/*2112-OPEN-OP-SYS202-PMAFILE*/
              }
  
//  IF 88-100-PROCESSING-LOCAL AND IP58041-ACTION-CODE NOT = 300-VALUE-R
              ip58041ActionCode = ip58041Tipapma.getIp58041ActionCode();
              valueR300 = work.getValueR300();
//  ELSE
              if (!(work.isProcessingLocal88100())  || 		compareChars(ip58041ActionCode,valueR300) == 0 ) { 
//  PERFORM 2114-FETCH-VCN
                  fetchVcn();/*2114-FETCH-VCN*/
              }
  
          }
//  ELSE
          else { 
//  SET 88-100-END-PROS-Y TO TRUE
              work.setEndProsY88100True(); 
              
          }
//  IF 88-100-SYS202-OPEN-Y
          if ( work.isSys202OpenY88100()  ) { 
//  PERFORM 8420-CLOSE-SYS202-PMAFILE
              closeSys202Pmafile();/*8420-CLOSE-SYS202-PMAFILE*/
          }
      
      }
      /**
      * allocateSys202Outfile 
      *   This method is derived from 
  *   COBOL Paragraph - 2111-ALLOCATE-SYS202-OUTFILE COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ddSys202300                    COBOL Name: 300-DD-SYS202
      * - pimBulkFileTypeCd800           COBOL Name: 800-PIM-BULK-FILE-TYPE-CD
      * - valuePim300                    COBOL Name: 300-VALUE-PIM
      * - outputDsn800                   COBOL Name: 800-OUTPUT-DSN
      *
      * Output :  

      * - ip38201McidynamParms           COBOL Name: IP38201-MCIDYNAM-PARMS
      * - ip38201Lrecl                   COBOL Name: IP38201-LRECL
      * - ip38201Dd                      COBOL Name: IP38201-DD
      * - ddSys202300                    COBOL Name: 300-DD-SYS202
      * - ip38201BulkType                COBOL Name: IP38201-BULK-TYPE
      * - pimBulkFileTypeCd800           COBOL Name: 800-PIM-BULK-FILE-TYPE-CD
      * - ip38201ClearingIdentifier      COBOL Name: IP38201-CLEARING-IDENTIFIER
      * - valuePim300                    COBOL Name: 300-VALUE-PIM
      * - sys202Dsn800                   COBOL Name: 800-SYS202-DSN
      * - outputDsn800                   COBOL Name: 800-OUTPUT-DSN
      *
      * @throws CFException
      */
      private void allocateSys202Outfile() throws Exception {
			// Declare local variables used in the method
			Ip38201DcbInfo ip38201DcbInfo = ip38201McidynamParms.getIp38201AllocateParms().getIp38201DcbInfo();
			Ip38201AllocateParms ip38201AllocateParms = ip38201McidynamParms.getIp38201AllocateParms();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *Allocate output file dynamically by calling ip760010            *
// *----------------------------------------------------------------*
//  INITIALIZE IP38201-MCIDYNAM-PARMS
          ip38201McidynamParms.initialize();
//  MOVE LENGTH OF IP34631-TIPAPIM TO IP38201-LRECL
          ip38201DcbInfo.setIp38201Lrecl(Ip34631Tipapim.getIp34631TipapimFieldLength());
  
//  MOVE 300-DD-SYS202 TO IP38201-DD
          ip38201McidynamParms.setIp38201Dd(pad(8,work.getDdSys202300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 800-PIM-BULK-FILE-TYPE-CD TO IP38201-BULK-TYPE
          ip38201AllocateParms.setIp38201BulkType(work.getPimBulkFileTypeCd800());
  
//  MOVE 300-VALUE-PIM (1 : 3) TO IP38201-CLEARING-IDENTIFIER (1 : 3)
          ip38201McidynamParms.getIp38201AllocateParms().setIp38201ClearingIdentifier(work.getValuePim300(),0/* valuePim300 */ ,3,0,3 /* field,sourceIndex,sourceLen,targetIndex,targetLen */);
//  PERFORM 8300-CALL-MCDYNAM-ROUTINE
          callMcdynamRoutine();/*8300-CALL-MCDYNAM-ROUTINE*/
          // MOVE 800-OUTPUT-DSN TO 800-SYS202-DSN
          work.setSys202Dsn800(work.getOutputDsn800());
      
      }
      /**
      * openOpSys202Pmafile 
      *   This method is derived from 
  *   COBOL Paragraph - 2112-OPEN-OP-SYS202-PMAFILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - para2112300                    COBOL Name: 300-PARA-2112
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - sys210FileStatus200            COBOL Name: 200-SYS210-FILE-STATUS
      * - isSys202OpenSw100              COBOL Name: 100-IS-SYS202-OPEN-SW
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2112300                    COBOL Name: 300-PARA-2112
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      private void openOpSys202Pmafile() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph opens the pma file for output                    *
// *----------------------------------------------------------------*
//  OPEN OUTPUT SYS202-PMA-FILE
          sys202PmaFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys202PmaFile.getFileName(),sys202PmaFile.getSys202PmaFileCharSet(),sys202PmaFile.getSys202PmaFileCrlfFlag());
          work.setSys202FileStatus200(sys202PmaFile.getStatusString() );
//  IF 88-200-SYS202-IO-GOOD
          if ( work.isSys202IoGood88200()  ) { 
//  SET 88-100-SYS202-OPEN-Y TO TRUE
              work.setSys202OpenY88100True(); 
              
          }
//  ELSE
          else { 
//  SET 88-800-SYS202 TO TRUE
              work.setSys20288800True(); 
              
//  SET 88-600-FILE-OPEN-ERR TO TRUE
              fileIoErrMsgTxt600.setFileOpenErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              fileIoErrMsgTxt600.setFileName600(work.getFileName800());
//  MOVE 200-SYS202-FILE-STATUS TO 600-FILE-STATUS
              fileIoErrMsgTxt600.setFileStatus600(work.getSys202FileStatus200());
//  MOVE 300-PARA-2112 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara2112300());
//  MOVE 300-OPEN-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getOpenAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(fileIoErrMsgTxt600.toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
      
      }
      /**
      * writePmaRecord 
      *   This method is derived from 
  *   COBOL Paragraph - 2113-WRITE-PMA-RECORD COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys202PmaRecord                COBOL Name: SYS202-PMA-RECORD
      * - sys202Count400                 COBOL Name: 400-SYS202-COUNT
      * - para2113300                    COBOL Name: 300-PARA-2113
      * - writeAbendCode300              COBOL Name: 300-WRITE-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - sys202Count400                 COBOL Name: 400-SYS202-COUNT
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2113300                    COBOL Name: 300-PARA-2113
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - writeAbendCode300              COBOL Name: 300-WRITE-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      private void writePmaRecord() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph writes pma record read from auth table.          *
// *----------------------------------------------------------------*
//  WRITE SYS202-PMA-RECORD FROM IP34631-TIPAPIM
          sys202PmaFile.write(ip34631Tipapim.toCharArray()); 
          sys202PmaRecord.setString(CONSTANTS.LOW_VALUE_1253878022);
          work.setSys202FileStatus200(sys202PmaFile.getStatusString() );
//  IF 88-200-SYS202-IO-GOOD
          if ( work.isSys202IoGood88200()  ) { 
//  ADD 1 TO 400-SYS202-COUNT
              work.setSys202Count400(work.getSys202Count400()+1);
          }
//  ELSE
          else { 
//  SET 88-800-SYS202 TO TRUE
              work.setSys20288800True(); 
              
//  SET 88-600-FILE-WRITE-ERR TO TRUE
              fileIoErrMsgTxt600.setFileWriteErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              fileIoErrMsgTxt600.setFileName600(work.getFileName800());
//  MOVE 200-SYS202-FILE-STATUS TO 600-FILE-STATUS
              fileIoErrMsgTxt600.setFileStatus600(work.getSys202FileStatus200());
//  MOVE 300-PARA-2113 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara2113300());
//  MOVE 300-WRITE-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getWriteAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(fileIoErrMsgTxt600.toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
      
      }
      /**
      * fetchVcn 
      *   This method is derived from 
  *   COBOL Paragraph - 2114-FETCH-VCN COBOL Cyclomatic complexity - 3
      * Input  :  

      * - value18300                     COBOL Name: 300-VALUE-18
      * - tipapimRowsReplaced400         COBOL Name: 400-TIPAPIM-ROWS-REPLACED
      *
      * Output :  

      * - ip69901CafLink                 COBOL Name: IP69901-CAF-LINK
      * - rc                             COBOL Name: RETURN-CODE
      * - isRowsFound100                 COBOL Name: 100-IS-ROWS-FOUND
      * - isOpenSw100                    COBOL Name: 100-IS-OPEN-SW
      * - queryNo                        COBOL Name: QUERY-NO
      * - value18300                     COBOL Name: 300-VALUE-18
      * - tipapimRowsReplaced400         COBOL Name: 400-TIPAPIM-ROWS-REPLACED
      * - ip34631ObsAccessTs             COBOL Name: IP34631-OBS-ACCESS-TS
      * - ip34631ObsAccessTsN            COBOL Name: IP34631-OBS-ACCESS-TS-N
      *
      * @throws CFException
      */
      private void fetchVcn() throws Exception {
      
// *-----------------------------------------------------------------
// *Fetch vcn for old rcn and write ercords to o/p file
// *-----------------------------------------------------------------
//  SET 88-IP69901-CAF-RESET TO TRUE
          ip69901CafLinkGroup.setIp69901CafReset88True(); 
          
//  CALL 800-PTR-IP699910
          // CALL 800-PTR-IP699910
          	this.setRc( ip699910.process());
//  SET 88-100-ROWS-FOUND-R TO TRUE
          isRowsFoundGroup100.setRowsFoundR88100True(); 
          
//  SET 88-100-OPEN-FIRST-TIME-R TO TRUE
          isOpenSwGroup100.setOpenFirstTimeR88100True(); 
          
//  MOVE 300-VALUE-18 TO QUERY-NO
          apiLayout.setQueryNo(work.getValue18300());
//  PERFORM UNTIL 88-100-ROWS-NOT-FND-R
          while ((!(isRowsFoundGroup100.isRowsNotFndR88100()) )) {
//  CALL 800-PTR-IP532110
              // CALL 800-PTR-IP532110
              	this.setRc( ip532110.process());
//  IF 88-100-ROWS-FOUND-R
              if ( isRowsFoundGroup100.isRowsFoundR88100()  ) { 
//  ADD 1 TO 400-TIPAPIM-ROWS-REPLACED
                  work.setTipapimRowsReplaced400(work.getTipapimRowsReplaced400()+1);
//  PERFORM 8220-POPULATE-PIM-VARIABLES
                  populatePimVariables();/*8220-POPULATE-PIM-VARIABLES*/
//  MOVE SPACES TO IP34631-OBS-ACCESS-TS
                  ip34631Tipapim.setIp34631ObsAccessTs(CONSTANTS.SPACE_26);
//  MOVE ZEROS TO IP34631-OBS-ACCESS-TS-N
                  ip34631Tipapim.setIp34631ObsAccessTsN(CONSTANTS.ZERO_1);
//  PERFORM 2113-WRITE-PMA-RECORD
                  writePmaRecord();/*2113-WRITE-PMA-RECORD*/
              }
          }
      
      }
      /**
      * processAuthPim 
      *   This method is derived from 
  *   COBOL Paragraph - 2120-PROCESS-AUTH-PIM COBOL Cyclomatic complexity - 8
      * Input  :  

      * - value17300                     COBOL Name: 300-VALUE-17
      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      * - ip34631PrimAccountNbr          COBOL Name: IP34631-PRIM-ACCOUNT-NBR
      * - tipapimRowsFetched400          COBOL Name: 400-TIPAPIM-ROWS-FETCHED
      *
      * Output :  

      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - apiSwitch100                   COBOL Name: 100-API-SWITCH
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - queryNo                        COBOL Name: QUERY-NO
      * - value17300                     COBOL Name: 300-VALUE-17
      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - rc                             COBOL Name: RETURN-CODE
      * - isRecordEligible100            COBOL Name: 100-IS-RECORD-ELIGIBLE
      * - ip08151PassedAcctNbr           COBOL Name: IP08151-PASSED-ACCT-NBR
      * - ip34631PrimAccountNbr          COBOL Name: IP34631-PRIM-ACCOUNT-NBR
      * - tipapimRowsFetched400          COBOL Name: 400-TIPAPIM-ROWS-FETCHED
      * - isEndProcess100                COBOL Name: 100-IS-END-PROCESS
      *
      * @throws CFException
      */
      private void processAuthPim() throws Exception {
			// Declare local variables used in the method
			int tipapimRowsFetched400 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph -                                                *
// *1) retrieve auth data from tiappim for remote                   *
// *2) allocate sys202 file in output mode                          *
// *3) write the pim records to dynamically allocated output file   *
// *----------------------------------------------------------------*
//  SET 88-100-ROWS-FOUND TO TRUE
          apiLayout.setRowsFound88100True(); 
          
//  SET 88-100-OPEN-FIRST-TIME TO TRUE
          apiLayout.setOpenFirstTime88100True(); 
          
//  SET 88-100-SELECT-RTN TO TRUE
          apiLayout.setSelectRtn88100True(); 
          
//  MOVE 300-VALUE-17 TO QUERY-NO
          apiLayout.setQueryNo(work.getValue17300());
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          apiLayout.setItIsNotAbend88100True(); 
          
//  PERFORM UNTIL 88-100-ROWS-NOT-FND
          while ((!(apiLayout.isRowsNotFnd88100()) )) {
//  CALL 800-PTR-IP532010
              // CALL 800-PTR-IP532010
              	this.setRc( ip532010.process());
//  IF 88-100-ROWS-FOUND
              if ( apiLayout.isRowsFound88100()  ) { 
//  SET 88-100-RECORD-ELIGIBLE TO TRUE
                  work.setRecordEligible88100True(); 
                  
//  IF 88-100-PROCESSING-REMOTELY
                  if ( work.isProcessingRemotely88100()  ) { 
//  MOVE IP34631-PRIM-ACCOUNT-NBR TO IP08151-PASSED-ACCT-NBR
                      ip08151PassedParms.setIp08151PassedAcctNbr(ip34631Tipapim.getIp34631PrimAccountNbr());
//  CALL 800-PTR-IP081050
                      // CALL 800-PTR-IP081050
                      	this.setRc( ip081050.process());
//  PERFORM 8100-FIND-ACC-ELIGIBILITY
                      findAccEligibility();/*8100-FIND-ACC-ELIGIBILITY*/
                  }
//  IF 88-100-RECORD-ELIGIBLE
                  if ( work.isRecordEligible88100()  ) { 
//  ADD 1 TO 400-TIPAPIM-ROWS-FETCHED
                      work.setTipapimRowsFetched400(work.getTipapimRowsFetched400()+1);
                      tipapimRowsFetched400 = work.getTipapimRowsFetched400();
//  IF 400-TIPAPIM-ROWS-FETCHED EQUAL 1
                      if (	( tipapimRowsFetched400 == 1 )) { 
//  PERFORM 2111-ALLOCATE-SYS202-OUTFILE
                          allocateSys202Outfile();/*2111-ALLOCATE-SYS202-OUTFILE*/
//  PERFORM 2112-OPEN-OP-SYS202-PMAFILE
                          openOpSys202Pmafile();/*2112-OPEN-OP-SYS202-PMAFILE*/
                      }
  
//  PERFORM 2113-WRITE-PMA-RECORD
                      writePmaRecord();/*2113-WRITE-PMA-RECORD*/
                  }
              }
          }
//  IF 88-100-ROWS-NOT-FND
          if ( apiLayout.isRowsNotFnd88100()  ) { 
//  SET 88-100-END-PROS-Y TO TRUE
              work.setEndProsY88100True(); 
              
          }
//  ELSE
          else { 
//  SET 88-100-END-PROS-N TO TRUE
              work.setEndProsN88100True(); 
              
          }
          tipapimRowsFetched400 = work.getTipapimRowsFetched400();
//  IF 400-TIPAPIM-ROWS-FETCHED GREATER THAN ZEROES
          if (	( tipapimRowsFetched400 > 0 )) { 
//  PERFORM 8420-CLOSE-SYS202-PMAFILE
              closeSys202Pmafile();/*8420-CLOSE-SYS202-PMAFILE*/
          }
  
      
      }
      /**
      * processAuthDb2Data 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-PROCESS-AUTH-DB2-DATA COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - ip69901CafLink                 COBOL Name: IP69901-CAF-LINK
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void processAuthDb2Data() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph -                                                *
// *1) establishes db2 connection from auth server or remote site   *
// *2) processes dynamically allocated pim entries and insert into  *
// *   gcms tables.                                                 *
// *----------------------------------------------------------------*
//  SET 88-IP69901-CAF-RESET TO TRUE
          ip69901CafLinkGroup.setIp69901CafReset88True(); 
          
//  CALL 800-PTR-IP699910
          // CALL 800-PTR-IP699910
          	this.setRc( ip699910.process());
//  PERFORM 2210-PROCESS-PMA-ENTRIES
          processPmaEntries();/*2210-PROCESS-PMA-ENTRIES*/
          ;
      
      }
      /**
      * processPmaEntries 
      *   This method is derived from 
  *   COBOL Paragraph - 2210-PROCESS-PMA-ENTRIES COBOL Cyclomatic complexity - 6
      * Input  :  

      * - sys202Count400                 COBOL Name: 400-SYS202-COUNT
      * - valuePim300                    COBOL Name: 300-VALUE-PIM
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - cutoffPimTmpTs800              COBOL Name: 800-CUTOFF-PIM-TMP-TS
      * - para2210300                    COBOL Name: 300-PARA-2210
      * - isEndProcess100                COBOL Name: 100-IS-END-PROCESS
      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      * - pimCommitCnt400                COBOL Name: 400-PIM-COMMIT-CNT
      * - commitCnt800                   COBOL Name: 800-COMMIT-CNT
      *
      * Output :  

      * - updateModFileInd800            COBOL Name: 800-UPDATE-MOD-FILE-IND
      * - valuePim300                    COBOL Name: 300-VALUE-PIM
      * - cutoffPimBegin800              COBOL Name: 800-CUTOFF-PIM-BEGIN
      * - cutoffPimTmpTs800              COBOL Name: 800-CUTOFF-PIM-TMP-TS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2210300                    COBOL Name: 300-PARA-2210
      * - pimCommitCnt400                COBOL Name: 400-PIM-COMMIT-CNT
      *
      * @throws CFException
      */
      private void processPmaEntries() throws Exception {
			// Declare local variables used in the method
			int sys202Count400 = 0;
			int pimCommitCnt400 = 0;
			int commitCnt800 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *Perform inserts into the gcms pim table only if any record was
// *was retrieved and written for the cutoff timestamps from the auth
// *or global pma table.
// *-----------------------------------------------------------------
          sys202Count400 = work.getSys202Count400();
//  IF 400-SYS202-COUNT > ZEROES
          if (	( sys202Count400 > 0 )) { 
//  PERFORM 8430-OPEN-IP-SYS202-PMAFILE
              openIpSys202Pmafile();/*8430-OPEN-IP-SYS202-PMAFILE*/
//  MOVE 300-VALUE-PIM TO 800-UPDATE-MOD-FILE-IND
              extValues800.setUpdateModFileInd800(work.getValuePim300());
//  PERFORM 2211-READ-PMA-INSERT-PIM UNTIL 88-200-SYS202-EOF
              while (!(work.isSys202Eof88200()) ) {
                 readPmaInsertPim();/*2211-READ-PMA-INSERT-PIM*/
              }
//  PERFORM 8420-CLOSE-SYS202-PMAFILE
              closeSys202Pmafile();/*8420-CLOSE-SYS202-PMAFILE*/
//  MOVE 800-CUTOFF-PIM-TMP-TS TO 800-CUTOFF-PIM-BEGIN
              cutoffTsData800.setCutoffPimBegin800(work.getCutoffPimTmpTs800());
//  MOVE 300-PARA-2210 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara2210300());
//  PERFORM 8520-UPDATE-CKP-ROW
              updateCkpRow();/*8520-UPDATE-CKP-ROW*/
//  PERFORM 8800-COMMIT-SQL
              commitSql();/*8800-COMMIT-SQL*/
//  PERFORM 2213-DELETE-SYS202-PMAFILE
              deleteSys202Pmafile();/*2213-DELETE-SYS202-PMAFILE*/
          }
  
//  ELSE
          else { 
//  IF 88-100-END-PROS-N AND 88-100-PROCESSING-LOCAL
              if ( work.isEndProsN88100()   &&  work.isProcessingLocal88100()  ) { 
//  PERFORM 2212-READ-PMA-INSERT-PIM
                  readPmaInsertPim2212();/*2212-READ-PMA-INSERT-PIM*/
//  MOVE 800-CUTOFF-PIM-TMP-TS TO 800-CUTOFF-PIM-BEGIN
                  cutoffTsData800.setCutoffPimBegin800(work.getCutoffPimTmpTs800());
//  MOVE 300-PARA-2210 TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(work.getPara2210300());
                  pimCommitCnt400 = work.getPimCommitCnt400();
                  commitCnt800 = parms.getCommitCnt800();
//  IF 400-PIM-COMMIT-CNT >= 800-COMMIT-CNT
                  if (	( pimCommitCnt400 >= commitCnt800 )) { 
//  MOVE ZEROES TO 400-PIM-COMMIT-CNT
                      work.setPimCommitCnt400(0);
//  PERFORM 8520-UPDATE-CKP-ROW
                      updateCkpRow();/*8520-UPDATE-CKP-ROW*/
//  PERFORM 8800-COMMIT-SQL
                      commitSql();/*8800-COMMIT-SQL*/
                  }
  
              }
          }
      
      }
      /**
      * readPmaInsertPim 
      *   This method is derived from 
  *   COBOL Paragraph - 2211-READ-PMA-INSERT-PIM COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip34631VirtualAccountNbr       COBOL Name: IP34631-VIRTUAL-ACCOUNT-NBR
      * - para2211300                    COBOL Name: 300-PARA-2211
      * - readAbendCode300               COBOL Name: 300-READ-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys202PmaRecord                COBOL Name: SYS202-PMA-RECORD
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - ip75081MqOptions               COBOL Name: IP75081-MQ-OPTIONS
      * - ip75081IsForTable              COBOL Name: IP75081-IS-FOR-TABLE
      * - ip75081AccntNum                COBOL Name: IP75081-ACCNT-NUM
      * - ip34631VirtualAccountNbr       COBOL Name: IP34631-VIRTUAL-ACCOUNT-NBR
      * - rc                             COBOL Name: RETURN-CODE
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2211300                    COBOL Name: 300-PARA-2211
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - readAbendCode300               COBOL Name: 300-READ-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      private void readPmaInsertPim() throws Exception {
      
// *-----------------------------------------------------------------
// *Read each pma record and call routine to insert into gcms table
// *-----------------------------------------------------------------
//  READ SYS202-PMA-FILE INTO IP34631-TIPAPIM END-READ
          	sys202PmaFile.read();
          work.setSys202FileStatus200(sys202PmaFile.getStatusString() );
          if (!sys202PmaFile.hasEnded()) {
             sys202PmaRecord.setString(sys202PmaFile.getRecord());
             ip34631Tipapim.setString(sys202PmaRecord.toCharArray());
          }
//  EVALUATE TRUE
          if  ( work.isSys202IoGood88200()  ) { 
//  PERFORM 8700-INSERT-TIPAPIM
              insertTipapim();/*8700-INSERT-TIPAPIM*/
//  SET 88-IP75081-MQ-PUT TO TRUE
              ip75081MqSwitches.setIp75081MqPut88True(); 
              
//  SET 88-IP75081-IS-FOR-PIM TO TRUE
              ip75081MqSwitches.setIp75081IsForPim88True(); 
              
//  MOVE IP34631-VIRTUAL-ACCOUNT-NBR TO IP75081-ACCNT-NUM
              ip75081MqSwitches.setIp75081AccntNum(ip34631Tipapim.getIp34631VirtualAccountNbr());
//  CALL 800-PTR-IP750080
              // CALL 800-PTR-IP750080
              	this.setRc( ip750080.process());
          }
          else if  ( work.isSys202Eof88200()  ) { 
//  SET 88-IP75081-MQ-SEND TO TRUE
              ip75081MqSwitches.setIp75081MqSend88True(); 
              
//  CALL 800-PTR-IP750080
              // CALL 800-PTR-IP750080
              	this.setRc( ip750080.process());
          }
          else   { 
//  SET 88-800-SYS202 TO TRUE
              work.setSys20288800True(); 
              
//  SET 88-600-FILE-READ-ERR TO TRUE
              fileIoErrMsgTxt600.setFileReadErr88600True(); 
              
//  MOVE 300-PARA-2211 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara2211300());
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              fileIoErrMsgTxt600.setFileName600(work.getFileName800());
//  MOVE 200-SYS202-FILE-STATUS TO 600-FILE-STATUS
              fileIoErrMsgTxt600.setFileStatus600(work.getSys202FileStatus200());
//  MOVE 300-READ-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getReadAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(fileIoErrMsgTxt600.toCharArray());
          }
      
      }
      /**
      * readPmaInsertPim2212 
      *   This method is derived from 
  *   COBOL Paragraph - 2212-READ-PMA-INSERT-PIM COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip58041VirtualAccountNbr       COBOL Name: IP58041-VIRTUAL-ACCOUNT-NBR
      *
      * Output :  

      * - ip34631VirtualAccountNbr       COBOL Name: IP34631-VIRTUAL-ACCOUNT-NBR
      * - ip58041VirtualAccountNbr       COBOL Name: IP58041-VIRTUAL-ACCOUNT-NBR
      * - ip75081MqOptions               COBOL Name: IP75081-MQ-OPTIONS
      * - ip75081IsForTable              COBOL Name: IP75081-IS-FOR-TABLE
      * - ip75081AccntNum                COBOL Name: IP75081-ACCNT-NUM
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void readPmaInsertPim2212() throws Exception {
      
// *-----------------------------------------------------------------
// *Read each pma record and call routine to insert into gcms table
// *-----------------------------------------------------------------
//  MOVE IP58041-VIRTUAL-ACCOUNT-NBR TO IP34631-VIRTUAL-ACCOUNT-NBR
          ip34631Tipapim.setIp34631VirtualAccountNbr(ip58041Tipapma.getIp58041VirtualAccountNbr());
//  PERFORM 8220-POPULATE-PIM-VARIABLES
          populatePimVariables();/*8220-POPULATE-PIM-VARIABLES*/
//  PERFORM 8700-INSERT-TIPAPIM
          insertTipapim();/*8700-INSERT-TIPAPIM*/
//  SET 88-IP75081-MQ-PUT TO TRUE
          ip75081MqSwitches.setIp75081MqPut88True(); 
          
//  SET 88-IP75081-IS-FOR-PIM TO TRUE
          ip75081MqSwitches.setIp75081IsForPim88True(); 
          
//  MOVE IP34631-VIRTUAL-ACCOUNT-NBR TO IP75081-ACCNT-NUM
          ip75081MqSwitches.setIp75081AccntNum(ip34631Tipapim.getIp34631VirtualAccountNbr());
//  CALL 800-PTR-IP750080
          // CALL 800-PTR-IP750080
          	this.setRc( ip750080.process());
      
      }
      /**
      * deleteSys202Pmafile 
      *   This method is derived from 
  *   COBOL Paragraph - 2213-DELETE-SYS202-PMAFILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys202Dsn800                   COBOL Name: 800-SYS202-DSN
      * - ddSys202300                    COBOL Name: 300-DD-SYS202
      * - para2213300                    COBOL Name: 300-PARA-2213
      *
      * Output :  

      * - ip38201McidynamParms           COBOL Name: IP38201-MCIDYNAM-PARMS
      * - ip38201Dsn                     COBOL Name: IP38201-DSN
      * - sys202Dsn800                   COBOL Name: 800-SYS202-DSN
      * - ip38201Dd                      COBOL Name: IP38201-DD
      * - ddSys202300                    COBOL Name: 300-DD-SYS202
      * - ip38201Function                COBOL Name: IP38201-FUNCTION
      * - rc                             COBOL Name: RETURN-CODE
      * - ip38201ReturnCode              COBOL Name: IP38201-RETURN-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2213300                    COBOL Name: 300-PARA-2213
      * - mcdynamRequest640              COBOL Name: 640-MCDYNAM-REQUEST
      *
      * @throws CFException
      */
      private void deleteSys202Pmafile() throws Exception {
			// Declare local variables used in the method
			char[] ip38201ReturnCode = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph deletes the pma file                             *
// *----------------------------------------------------------------*
//  INITIALIZE IP38201-MCIDYNAM-PARMS
          ip38201McidynamParms.initialize();
//  MOVE 800-SYS202-DSN TO IP38201-DSN
          ip38201McidynamParms.setIp38201Dsn(work.getSys202Dsn800());
//  MOVE 300-DD-SYS202 TO IP38201-DD
          ip38201McidynamParms.setIp38201Dd(pad(8,work.getDdSys202300(),SPACE_CHAR,RIGHT_PAD));
//  SET 88-IP38201-UNALLOCATE TO TRUE
          ip38201McidynamParms.setIp38201Unallocate88True(); 
          
//  CALL 800-PTR-IP760010
          // CALL 800-PTR-IP760010
          	this.setRc( ip760010.process());
//  SET 88-IP38201-DELETE TO TRUE
          ip38201McidynamParms.setIp38201Delete88True(); 
          
//  CALL 800-PTR-IP760010
          // CALL 800-PTR-IP760010
          	this.setRc( ip760010.process());
//  IF IP38201-RETURN-CODE EQUAL ZERO
          ip38201ReturnCode = ip38201McidynamParms.getIp38201ReturnCode();
//  ELSE
          if (!( allZeros(ip38201ReturnCode) ) /*  !=  zeros*/) { 
//  MOVE 300-PARA-2213 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara2213300());
//  SET 88-640-MCDYNAM-DELETE TO TRUE
              mcdynamErrorMsgTxt640.setMcdynamDelete88640True(); 
              
//  PERFORM 8310-ABEND-ON-MCDYNAM-ERROR
              abendOnMcdynamError();/*8310-ABEND-ON-MCDYNAM-ERROR*/
          }
  
      
      }
      /**
      * readInsertPim 
      *   This method is derived from 
  *   COBOL Paragraph - 2221-READ-INSERT-PIM COBOL Cyclomatic complexity - 5
      * Input  :  

      * - pimCommitCnt400                COBOL Name: 400-PIM-COMMIT-CNT
      * - commitCnt800                   COBOL Name: 800-COMMIT-CNT
      * - para2221300                    COBOL Name: 300-PARA-2221
      * - readAbendCode300               COBOL Name: 300-READ-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys202PmaRecord                COBOL Name: SYS202-PMA-RECORD
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - pimCommitCnt400                COBOL Name: 400-PIM-COMMIT-CNT
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2221300                    COBOL Name: 300-PARA-2221
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - readAbendCode300               COBOL Name: 300-READ-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      private void readInsertPim() throws Exception {
			// Declare local variables used in the method
			int pimCommitCnt400 = 0;
			int commitCnt800 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *Read each pmi record and call routine to insert into gcms table
// *-----------------------------------------------------------------
//  READ SYS202-PMA-FILE INTO IP34631-TIPAPIM END-READ
          	sys202PmaFile.read();
          work.setSys202FileStatus200(sys202PmaFile.getStatusString() );
          if (!sys202PmaFile.hasEnded()) {
             sys202PmaRecord.setString(sys202PmaFile.getRecord());
             ip34631Tipapim.setString(sys202PmaRecord.toCharArray());
          }
//  EVALUATE TRUE
          if  ( work.isSys202IoGood88200()  ) { 
//  PERFORM 8700-INSERT-TIPAPIM
              insertTipapim();/*8700-INSERT-TIPAPIM*/
              pimCommitCnt400 = work.getPimCommitCnt400();
              commitCnt800 = parms.getCommitCnt800();
//  IF 400-PIM-COMMIT-CNT >= 800-COMMIT-CNT
              if (	( pimCommitCnt400 >= commitCnt800 )) { 
//  MOVE ZEROES TO 400-PIM-COMMIT-CNT
                  work.setPimCommitCnt400(0);
//  PERFORM 8520-UPDATE-CKP-ROW
                  updateCkpRow();/*8520-UPDATE-CKP-ROW*/
//  PERFORM 8800-COMMIT-SQL
                  commitSql();/*8800-COMMIT-SQL*/
              }
  
          }
          else if  ( work.isSys202Eof88200()  ) { 
              ;
          }
          else   { 
//  SET 88-800-SYS202 TO TRUE
              work.setSys20288800True(); 
              
//  SET 88-600-FILE-READ-ERR TO TRUE
              fileIoErrMsgTxt600.setFileReadErr88600True(); 
              
//  MOVE 300-PARA-2221 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara2221300());
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              fileIoErrMsgTxt600.setFileName600(work.getFileName800());
//  MOVE 200-SYS202-FILE-STATUS TO 600-FILE-STATUS
              fileIoErrMsgTxt600.setFileStatus600(work.getSys202FileStatus200());
//  MOVE 300-READ-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getReadAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(fileIoErrMsgTxt600.toCharArray());
          }
      
      }
      /**
      * deleteAuthDb2Data 
      *   This method is derived from 
  *   COBOL Paragraph - 2300-DELETE-AUTH-DB2-DATA COBOL Cyclomatic complexity - 2
      * Input  :  

      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      *
      * Output :  

      * - ip69901CafLink                 COBOL Name: IP69901-CAF-LINK
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void deleteAuthDb2Data() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph deletes data from db2 auth after it has been     *
// *updated to gcms tables.                                         *
// *----------------------------------------------------------------*
//  IF 88-100-PROCESSING-LOCAL
          if ( work.isProcessingLocal88100()  ) { 
//  SET 88-IP69901-CAF-INIT TO TRUE
              ip69901CafLinkGroup.setIp69901CafInit88True(); 
              
//  CALL 800-PTR-IP699910
              // CALL 800-PTR-IP699910
              	this.setRc( ip699910.process());
//  PERFORM 2310-DELETE-TAMAPMA
              deleteTamapma();/*2310-DELETE-TAMAPMA*/
//  SET 88-IP69901-CAF-RESET TO TRUE
              ip69901CafLinkGroup.setIp69901CafReset88True(); 
              
//  CALL 800-PTR-IP699910
              // CALL 800-PTR-IP699910
              	this.setRc( ip699910.process());
          }
      
      }
      /**
      * deleteTamapma 
      *   This method is derived from 
  *   COBOL Paragraph - 2310-DELETE-TAMAPMA COBOL Cyclomatic complexity - 3
      * Input  :  

      * - sys202Count400                 COBOL Name: 400-SYS202-COUNT
      * - tamapmaRowsFetched400          COBOL Name: 400-TAMAPMA-ROWS-FETCHED
      * - para2310300                    COBOL Name: 300-PARA-2310
      *
      * Output :  

      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2310300                    COBOL Name: 300-PARA-2310
      *
      * @throws CFException
      */
      private void deleteTamapma() throws Exception {
			// Declare local variables used in the method
			int sys202Count400 = 0;
			int tamapmaRowsFetched400 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This paragraph -
// *1) initiate db2 connection to auth server
// *2) call routine to delete entries from auth table
// *-----------------------------------------------------------------
          tamapmaRowsFetched400 = work.getTamapmaRowsFetched400();
          sys202Count400 = work.getSys202Count400();
//  IF 400-SYS202-COUNT > ZEROS OR 400-TAMAPMA-ROWS-FETCHED > ZEROS
          if (	( sys202Count400 > 0 ) || 	( tamapmaRowsFetched400 > 0 )) { 
//  PERFORM 2311-DELETE-AUTH-PMA-DATA
              deleteAuthPmaData();/*2311-DELETE-AUTH-PMA-DATA*/
//  MOVE 300-PARA-2310 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara2310300());
//  PERFORM 8800-COMMIT-SQL
              commitSql();/*8800-COMMIT-SQL*/
          }
  
      
      }
      /**
      * deleteAuthPmaData 
      *   This method is derived from 
  *   COBOL Paragraph - 2311-DELETE-AUTH-PMA-DATA COBOL Cyclomatic complexity - 2
      * Input  :  

      * - value1300                      COBOL Name: 300-VALUE-1
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - tamapmaRowsDeleted400          COBOL Name: 400-TAMAPMA-ROWS-DELETED
      * - pmaDeleteCnt400                COBOL Name: 400-PMA-DELETE-CNT
      *
      * Output :  

      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - queryNo                        COBOL Name: QUERY-NO
      * - value1300                      COBOL Name: 300-VALUE-1
      * - rc                             COBOL Name: RETURN-CODE
      * - tamapmaRowsDeleted400          COBOL Name: 400-TAMAPMA-ROWS-DELETED
      * - pmaDeleteCnt400                COBOL Name: 400-PMA-DELETE-CNT
      *
      * @throws CFException
      */
      private void deleteAuthPmaData() throws Exception {
      
// *-----------------------------------------------------------------
// *Delete entries from pma table.
// *-----------------------------------------------------------------
//  SET 88-100-DELETE-RTN TO TRUE
          apiLayout.setDeleteRtn88100True(); 
          
//  MOVE 300-VALUE-1 TO QUERY-NO
          apiLayout.setQueryNo(work.getValue1300());
//  CALL 800-PTR-IP534110
          // CALL 800-PTR-IP534110
          	this.setRc( ip534110.process());
//  IF 88-100-ROWS-FOUND
          if ( apiLayout.isRowsFound88100()  ) { 
//  ADD 1 TO 400-TAMAPMA-ROWS-DELETED 400-PMA-DELETE-CNT
              work.setTamapmaRowsDeleted400(work.getTamapmaRowsDeleted400()+1);
              work.setPmaDeleteCnt400(work.getPmaDeleteCnt400()+1);
          }
      
      }
      /**
      * checkClrCyclId 
      *   This method is derived from 
  *   COBOL Paragraph - 2700-CHECK-CLR-CYCL-ID COBOL Cyclomatic complexity - 3
      * Input  :  

      * - value1300                      COBOL Name: 300-VALUE-1
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - clrCyclNotFoundMsgTxt660       COBOL Name: 660-CLR-CYCL-NOT-FOUND-MSG-TXT
      * - para2700300                    COBOL Name: 300-PARA-2700
      * - getClrDtTmAbendCode300         COBOL Name: 300-GET-CLR-DT-TM-ABEND-CODE
      * - ip30771ClrCyclId               COBOL Name: IP30771-CLR-CYCL-ID
      * - cyclId99800                    COBOL Name: 800-CYCL-ID-99
      * - cyclId6800                     COBOL Name: 800-CYCL-ID-6
      *
      * Output :  

      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - queryNo                        COBOL Name: QUERY-NO
      * - value1300                      COBOL Name: 300-VALUE-1
      * - rc                             COBOL Name: RETURN-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2700300                    COBOL Name: 300-PARA-2700
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - getClrDtTmAbendCode300         COBOL Name: 300-GET-CLR-DT-TM-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - clrCyclNotFoundMsgTxt660       COBOL Name: 660-CLR-CYCL-NOT-FOUND-MSG-TXT
      * - clrCyclId800                   COBOL Name: 800-CLR-CYCL-ID
      * - ip30771ClrCyclId               COBOL Name: IP30771-CLR-CYCL-ID
      * - cyclId6800                     COBOL Name: 800-CYCL-ID-6
      *
      * @throws CFException
      */
      private void checkClrCyclId() throws Exception {
			// Declare local variables used in the method
			int clrCyclId800 = 0;
			int cyclId99800 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph retrieves the current clearing cycle and moves   *
// * cycle-id 6 if the current cycle is 99. this would handle the   *
// * scenario where the eod job has kicked of and this lrm is still *
// * in process                                                     *
// *----------------------------------------------------------------*
//  SET 88-100-SELECT-RTN TO TRUE
          apiLayout.setSelectRtn88100True(); 
          
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          apiLayout.setItIsNotAbend88100True(); 
          
//  MOVE 300-VALUE-1 TO QUERY-NO
          apiLayout.setQueryNo(work.getValue1300());
//  CALL 800-PTR-IP595010
          // CALL 800-PTR-IP595010
          	this.setRc( ip595010.process());
//  IF 88-100-ROWS-NOT-FND
          if ( apiLayout.isRowsNotFnd88100()  ) { 
//  DISPLAY 660-CLR-CYCL-NOT-FOUND-MSG-TXT
              logger.info(new String(work.getClrCyclNotFoundMsgTxt660())); 
//  MOVE 300-PARA-2700 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara2700300());
//  MOVE 300-GET-CLR-DT-TM-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getGetClrDtTmAbendCode300());
//  MOVE 660-CLR-CYCL-NOT-FOUND-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(66,work.getClrCyclNotFoundMsgTxt660(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
//  MOVE IP30771-CLR-CYCL-ID TO 800-CLR-CYCL-ID
          extValues800.setClrCyclId800(ip30771TipacliTable.getIp30771ClrCyclId());
          clrCyclId800 = extValues800.getClrCyclId800();
          cyclId99800 = work.getCyclId99800();
//  IF 800-CLR-CYCL-ID EQUAL 800-CYCL-ID-99
          if (	( clrCyclId800 == cyclId99800 )) { 
//  MOVE 800-CYCL-ID-6 TO 800-CLR-CYCL-ID
              extValues800.setClrCyclId800(work.getCyclId6800());
          }
  
      
      }
      /**
      * setBeginningTs 
      *   This method is derived from 
  *   COBOL Paragraph - 2800-SET-BEGINNING-TS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip50921CurrentTs               COBOL Name: IP50921-CURRENT-TS
      * - cutoffPimBegin800              COBOL Name: 800-CUTOFF-PIM-BEGIN
      * - cutoffPimPrev800               COBOL Name: 800-CUTOFF-PIM-PREV
      *
      * Output :  

      * - cutoffEnd800                   COBOL Name: 800-CUTOFF-END
      * - ip50921CurrentTs               COBOL Name: IP50921-CURRENT-TS
      * - cutoffPimPrev800               COBOL Name: 800-CUTOFF-PIM-PREV
      * - cutoffPimBegin800              COBOL Name: 800-CUTOFF-PIM-BEGIN
      *
      * @throws CFException
      */
      private void setBeginningTs() throws Exception {
			// Declare local variables used in the method
			char[] cutoffPimBegin800 = null;
			char[] cutoffPimPrev800 = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph sets the cut off timestamp to be current         *
// *timestamp.                                                      *
// *----------------------------------------------------------------*
//  PERFORM 2810-GET-CUTOFF-TIMESTAMP
          getCutoffTimestamp();/*2810-GET-CUTOFF-TIMESTAMP*/
//  MOVE IP50921-CURRENT-TS TO 800-CUTOFF-END
          cutoffEndGroup800.setCutoffEnd800(ip50921Variables.getIp50921CurrentTs());
//  IF 800-CUTOFF-PIM-BEGIN = 800-CUTOFF-PIM-PREV
          cutoffPimBegin800 = cutoffTsData800.getCutoffPimBegin800();
          cutoffPimPrev800 = work.getCutoffPimPrev800();
//  ELSE
          if (		compareChars(cutoffPimBegin800,cutoffPimPrev800) != 0 ) { 
              // MOVE 800-CUTOFF-PIM-BEGIN TO 800-CUTOFF-PIM-PREV
              work.setCutoffPimPrev800(cutoffTsData800.getCutoffPimBegin800());
          }
  
      
      }
      /**
      * getCutoffTimestamp 
      *   This method is derived from 
  *   COBOL Paragraph - 2810-GET-CUTOFF-TIMESTAMP COBOL Cyclomatic complexity - 1
      * Input  :  

      * - value2300                      COBOL Name: 300-VALUE-2
      *
      * Output :  

      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - queryNo                        COBOL Name: QUERY-NO
      * - value2300                      COBOL Name: 300-VALUE-2
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void getCutoffTimestamp() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph calls routine to get current timestamp - 5 minute
// *----------------------------------------------------------------*
//  SET 88-100-ROWS-FOUND TO TRUE
          apiLayout.setRowsFound88100True(); 
          
//  SET 88-100-SELECT-RTN TO TRUE
          apiLayout.setSelectRtn88100True(); 
          
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          apiLayout.setItIsNotAbend88100True(); 
          
//  MOVE 300-VALUE-2 TO QUERY-NO
          apiLayout.setQueryNo(work.getValue2300());
//  CALL 800-PTR-IP500920
          // CALL 800-PTR-IP500920
          	this.setRc( ip500920.process());
      
      }
      /**
      * endProcess 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-END-PROCESS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      * - tipapimRowsFetched400          COBOL Name: 400-TIPAPIM-ROWS-FETCHED
      * - sys202Count400                 COBOL Name: 400-SYS202-COUNT
      * - isEndProcess100                COBOL Name: 100-IS-END-PROCESS
      *
      * Output :  

      * - sys202Count400                 COBOL Name: 400-SYS202-COUNT
      * - tipapimRowsFetched400          COBOL Name: 400-TIPAPIM-ROWS-FETCHED
      * - ip75081MqOptions               COBOL Name: IP75081-MQ-OPTIONS
      * - rc                             COBOL Name: RETURN-CODE
      * - tableRows100                   COBOL Name: 100-TABLE-ROWS
      *
      * @throws CFException
      */
      private void endProcess() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph performs routines to end the process to display  *
// *the number of records inserted into gcms processing tables from *
// *auth db2 tables.                                                *
// *----------------------------------------------------------------*
//  IF 88-100-PROCESSING-REMOTELY
          if ( work.isProcessingRemotely88100()  ) { 
//  DISPLAY '# OF GCMS PIM ROWS FETCHED  : ' 400-TIPAPIM-ROWS-FETCHED
              logger.info("# OF GCMS PIM ROWS FETCHED  : {}", String.valueOf(work.getTipapimRowsFetched400())); 
//  DISPLAY '# OF SYS202 RECORDS WRITTEN : ' 400-SYS202-COUNT
              logger.info("# OF SYS202 RECORDS WRITTEN : {}", String.valueOf(work.getSys202Count400())); 
          }
//  MOVE ZEROS TO 400-SYS202-COUNT 400-TIPAPIM-ROWS-FETCHED
          work.setSys202Count400(0);
          work.setTipapimRowsFetched400(0);
//  SET 88-IP75081-MQ-SEND TO TRUE
          ip75081MqSwitches.setIp75081MqSend88True(); 
          
//  CALL 800-PTR-IP750080
          // CALL 800-PTR-IP750080
          	this.setRc( ip750080.process());
//  IF 88-100-END-PROS-Y
          if ( work.isEndProsY88100()  ) { 
//  SET 88-TABLE-ROWS-END TO TRUE
              work.setTableRowsEnd88True(); 
              
          }
//  ELSE
          else { 
//  SET 88-TABLE-ROWS-REMAINING TO TRUE
              work.setTableRowsRemaining88True(); 
              
          }
      
      }
      /**
      * openWriteSys001Outfil 
      *   This method is derived from 
  *   COBOL Paragraph - 4000-OPEN-WRITE-SYS001-OUTFIL COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void openWriteSys001Outfil() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph opens sys001 cutoff file in output and closes    *
// *the sys001 cutoff file.                                         *
// *----------------------------------------------------------------*
//  PERFORM 9510-DISPLAY-NET-TOTAL
          displayNetTotal();/*9510-DISPLAY-NET-TOTAL*/
//  PERFORM 4100-OPEN-OUTPUT-SYS001
          openOutputSys001();/*4100-OPEN-OUTPUT-SYS001*/
//  PERFORM 4200-WRITE-OUTPUT-SYS001
          writeOutputSys001();/*4200-WRITE-OUTPUT-SYS001*/
//  PERFORM 8400-CLOSE-SYS001-CUTOFF
          closeSys001Cutoff();/*8400-CLOSE-SYS001-CUTOFF*/
          ;
      
      }
      /**
      * openOutputSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 4100-OPEN-OUTPUT-SYS001 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - para4100300                    COBOL Name: 300-PARA-4100
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - sys210FileStatus200            COBOL Name: 200-SYS210-FILE-STATUS
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para4100300                    COBOL Name: 300-PARA-4100
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      private void openOutputSys001() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph opens sys001 cutoff file in output mode & check  *
// *file status.                                                    *
// *----------------------------------------------------------------*
//  OPEN OUTPUT SYS001-CUTOFF-FILE
          sys001CutoffFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys001CutoffFile.getFileName(),sys001CutoffFile.getSys001CutoffFileCharSet(),sys001CutoffFile.getSys001CutoffFileCrlfFlag());
          work.setSys001FileStatus200(sys001CutoffFile.getStatusString() );
//  IF 88-200-SYS001-IO-GOOD
//  ELSE
          if (!(work.isSys001IoGood88200()) ) { 
//  SET 88-800-SYS001 TO TRUE
              work.setSys00188800True(); 
              
//  SET 88-600-FILE-OPEN-ERR TO TRUE
              fileIoErrMsgTxt600.setFileOpenErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              fileIoErrMsgTxt600.setFileName600(work.getFileName800());
//  MOVE 200-SYS001-FILE-STATUS TO 600-FILE-STATUS
              fileIoErrMsgTxt600.setFileStatus600(work.getSys001FileStatus200());
//  MOVE 300-PARA-4100 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara4100300());
//  MOVE 300-OPEN-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getOpenAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(fileIoErrMsgTxt600.toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
      
      }
      /**
      * writeOutputSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 4200-WRITE-OUTPUT-SYS001 COBOL Cyclomatic complexity - 3
      * Input  :  

      * - tipackpMsgTxt680               COBOL Name: 680-TIPACKP-MSG-TXT
      * - sys001CutoffRecord             COBOL Name: SYS001-CUTOFF-RECORD
      * - para4200300                    COBOL Name: 300-PARA-4200
      * - writeAbendCode300              COBOL Name: 300-WRITE-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - cutoffCkpData800               COBOL Name: 800-CUTOFF-CKP-DATA
      * - cutoffTsData800                COBOL Name: 800-CUTOFF-TS-DATA
      * - cutoffPimCkp800                COBOL Name: 800-CUTOFF-PIM-CKP
      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para4200300                    COBOL Name: 300-PARA-4200
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - writeAbendCode300              COBOL Name: 300-WRITE-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      private void writeOutputSys001() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph determines whether ckp has most recent timestamp *
// *and updates it to sys001 cut off file.                          *
// *----------------------------------------------------------------*
//  MOVE SPACES TO 800-CUTOFF-CKP-DATA
          cutoffCkpData800.setString(CONSTANTS.SPACE_182);
//  PERFORM 8500-SELECT-CKP
          selectCkp();/*8500-SELECT-CKP*/
//  IF 800-CUTOFF-CKP-DATA GREATER SPACES
          if (             ( isGreaterThanSpaces(cutoffCkpData800) )) { 
              // MOVE 800-CUTOFF-CKP-DATA TO 800-CUTOFF-TS-DATA
              cutoffTsData800.setString(cutoffCkpData800.getCharArray());
          }
//  DISPLAY 680-TIPACKP-MSG-TXT 800-CUTOFF-PIM-CKP
          logger.info("{}{}", new String(work.getTipackpMsgTxt680()), new String(cutoffCkpData800.getCutoffPimCkp800())); 
//  WRITE SYS001-CUTOFF-RECORD FROM 800-CUTOFF-TS-DATA END-WRITE
          sys001CutoffFile.write(cutoffTsData800.toCharArray()); 
          sys001CutoffRecord.setString(CONSTANTS.LOW_VALUE_215747182);
          work.setSys001FileStatus200(sys001CutoffFile.getStatusString() );
//  IF 88-200-SYS001-IO-GOOD
//  ELSE
          if (!(work.isSys001IoGood88200()) ) { 
//  SET 88-800-SYS001 TO TRUE
              work.setSys00188800True(); 
              
//  SET 88-600-FILE-WRITE-ERR TO TRUE
              fileIoErrMsgTxt600.setFileWriteErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              fileIoErrMsgTxt600.setFileName600(work.getFileName800());
//  MOVE 200-SYS001-FILE-STATUS TO 600-FILE-STATUS
              fileIoErrMsgTxt600.setFileStatus600(work.getSys001FileStatus200());
//  MOVE 300-PARA-4200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara4200300());
//  MOVE 300-WRITE-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getWriteAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(fileIoErrMsgTxt600.toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
      
      }
      /**
      * closeSys210File 
      *   This method is derived from 
  *   COBOL Paragraph - 4500-CLOSE-SYS210-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys210FileStatus200            COBOL Name: 200-SYS210-FILE-STATUS
      * - para4500300                    COBOL Name: 300-PARA-4500
      * - closeAbendCode300              COBOL Name: 300-CLOSE-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - sys210FileStatus200            COBOL Name: 200-SYS210-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para4500300                    COBOL Name: 300-PARA-4500
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - closeAbendCode300              COBOL Name: 300-CLOSE-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      private void closeSys210File() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph is used to close sys210 file
// *-----------------------------------------------------------------
//  CLOSE SYS210-MQ-DATA-FILE
          sys210MqDataFile.close(); 
          work.setSys210FileStatus200(sys210MqDataFile.getStatusString() );
//  IF 88-200-SYS210-IO-GOOD
//  ELSE
          if (!(work.isSys210IoGood88200()) ) { 
//  SET 88-800-SYS210 TO TRUE
              work.setSys21088800True(); 
              
//  SET 88-600-FILE-CLOSE-ERR TO TRUE
              fileIoErrMsgTxt600.setFileCloseErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              fileIoErrMsgTxt600.setFileName600(work.getFileName800());
//  MOVE 200-SYS210-FILE-STATUS TO 600-FILE-STATUS
              fileIoErrMsgTxt600.setFileStatus600(work.getSys210FileStatus200());
//  MOVE 300-PARA-4500 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara4500300());
//  MOVE 300-CLOSE-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getCloseAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(fileIoErrMsgTxt600.toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
      
      }
      /**
      * processViaMq 
      *   This method is derived from 
  *   COBOL Paragraph - 5000-PROCESS-VIA-MQ COBOL Cyclomatic complexity - 8
      * Input  :  

      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      * - ip70301PimmapMqSrvActive       COBOL Name: IP70301-PIMMAP-MQ-SRV-ACTIVE
      * - ip7051pmrMqBypassSw            COBOL Name: IP7051PMR-MQ-BYPASS-SW
      * - startQ800                      COBOL Name: 800-START-Q
      * - ip7052pmrHconn                 COBOL Name: IP7052PMR-HCONN
      * - ip7052pmrHobj                  COBOL Name: IP7052PMR-HOBJ
      * - ip7052pmrTargetQName           COBOL Name: IP7052PMR-TARGET-Q-NAME
      * - ip70521ResnCd                  COBOL Name: IP70521-RESN-CD
      * - ip70521CompCd                  COBOL Name: IP70521-COMP-CD
      * - mqFailCode300                  COBOL Name: 300-MQ-FAIL-CODE
      * - para5000300                    COBOL Name: 300-PARA-5000
      * - mqGetErrorMsgTxt614            COBOL Name: 614-MQ-GET-ERROR-MSG-TXT
      * - mqErrAbendCode300              COBOL Name: 300-MQ-ERR-ABEND-CODE
      * - value1300                      COBOL Name: 300-VALUE-1
      *
      * Output :  

      * - mqRespStatusSw100              COBOL Name: 100-MQ-RESP-STATUS-SW
      * - getBrowseCalls100              COBOL Name: 100-GET-BROWSE-CALLS
      * - ip70521MqBypassSw              COBOL Name: IP70521-MQ-BYPASS-SW
      * - ip7051pmrMqBypassSw            COBOL Name: IP7051PMR-MQ-BYPASS-SW
      * - ip70521MsgBufferLen            COBOL Name: IP70521-MSG-BUFFER-LEN
      * - ip70521MsgBuffer               COBOL Name: IP70521-MSG-BUFFER
      * - ip70521Hconn                   COBOL Name: IP70521-HCONN
      * - ip7052pmrHconn                 COBOL Name: IP7052PMR-HCONN
      * - ip70521Hobj                    COBOL Name: IP70521-HOBJ
      * - ip7052pmrHobj                  COBOL Name: IP7052PMR-HOBJ
      * - ip70521TargetQName             COBOL Name: IP70521-TARGET-Q-NAME
      * - ip7052pmrTargetQName           COBOL Name: IP7052PMR-TARGET-Q-NAME
      * - ip70521MqReturnSw              COBOL Name: IP70521-MQ-RETURN-SW
      * - checkGetQueue100               COBOL Name: 100-CHECK-GET-QUEUE
      * - ip70521RequestCd               COBOL Name: IP70521-REQUEST-CD
      * - rc                             COBOL Name: RETURN-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para5000300                    COBOL Name: 300-PARA-5000
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - mqGetErrorMsgTxt614            COBOL Name: 614-MQ-GET-ERROR-MSG-TXT
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - mqErrAbendCode300              COBOL Name: 300-MQ-ERR-ABEND-CODE
      * - ip7052pmrMsgBufferLen          COBOL Name: IP7052PMR-MSG-BUFFER-LEN
      * - ip7052pmrMsgBuffer             COBOL Name: IP7052PMR-MSG-BUFFER
      * - mqStatusSw100                  COBOL Name: 100-MQ-STATUS-SW
      * - startQ800                      COBOL Name: 800-START-Q
      * - value1300                      COBOL Name: 300-VALUE-1
      * - noOfValidTrans400              COBOL Name: 400-NO-OF-VALID-TRANS
      *
      * @throws CFException
      */
      private void processViaMq() throws Exception {
			// Declare local variables used in the method
			 final int IP_70521_MSG_BUFFER_LENGTH = 4000000;
			long startQ800 = 0;
			int ip70521CompCd = 0;
			int mqFailCode300 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This paragraph will execute only when the code is runnin in the
// *linux os to get the message from the queue.
// *-----------------------------------------------------------------
//  IF 88-100-PROCESSING-REMOTELY AND 88-IP70301-PIMMAP-MQ-ACTVE-Y
          if ( work.isProcessingRemotely88100()   &&  ip70301PimmapMqSrvActiveGroup.isIp70301PimmapMqActveY88()  ) { 
//  SET 88-100-MQ-RESP-Y TO TRUE
              work.setMqRespY88100True(); 
              
//  SET 88-100-START-BROWSE TO TRUE
              getBrowseCallsGroup100.setStartBrowse88100True(); 
              
//  PERFORM UNTIL 88-100-MQ-RESP-N
              while ((!(work.isMqRespN88100()) )) {
//  MOVE IP7051PMR-MQ-BYPASS-SW TO IP70521-MQ-BYPASS-SW
                  ip70521MqApiLayout.setIp70521MqBypassSw(ip7051pmrTable.getIp7051pmrMqBypassSw());
//  MOVE LENGTH OF IP70521-MSG-BUFFER TO IP70521-MSG-BUFFER-LEN
                  ip70521MqApiLayout.setIp70521MsgBufferLen(IP_70521_MSG_BUFFER_LENGTH);
                  startQ800 = work.getStartQ800();
//  IF 800-START-Q GREATER THAN ZERO
                  if (	( startQ800 > 0 ) ) { 
//  MOVE SPACES TO IP70521-MSG-BUFFER (1 : 800-START-Q )
                      ip70521MqApiLayout.setIp70521MsgBuffer(replace(ip70521MqApiLayout.getIp70521MsgBuffer(),CONSTANTS.SPACE,0,(int) work.getStartQ800()));
                  }
  
//  MOVE IP7052PMR-HCONN TO IP70521-HCONN
                  ip70521MqApiLayout.setIp70521Hconn(ip7052pmrMqApiLayout.getIp7052pmrHconn());
//  MOVE IP7052PMR-HOBJ TO IP70521-HOBJ
                  ip70521MqApiLayout.setIp70521Hobj(ip7052pmrMqApiLayout.getIp7052pmrHobj());
//  MOVE IP7052PMR-TARGET-Q-NAME TO IP70521-TARGET-Q-NAME
                  ip70521MqApiLayout.setIp70521TargetQName(ip7052pmrMqApiLayout.getIp7052pmrTargetQName());
//  SET 88-IP70521-MQ-RETURN-Y TO TRUE
                  ip70521MqApiLayout.setIp70521MqReturnY88True(); 
                  
//  SET 88-100-GET-PIM TO TRUE
                  checkGetQueueGroup100.setGetPim88100True(); 
                  
//  SET 88-IP70521-GET TO TRUE
                  ip70521MqApiLayout.setIp70521Get88True(); 
                  
//  CALL 800-PTR-IP708020
                  // CALL 800-PTR-IP708020
                  	this.setRc( ip708020.process());
//  IF 88-IP70521-NO-MSG-AVAILABLE OR 88-IP70521-MQ-RETURN-N
                  if ( ip70521MqApiLayout.isIp70521NoMsgAvailable88()   ||  ip70521MqApiLayout.isIp70521MqReturnN88()  ) { 
//  SET 88-100-MQ-RESP-N TO TRUE
                      work.setMqRespN88100True(); 
                      
                  }
//  ELSE
                  else { 
                      mqFailCode300 = work.getMqFailCode300();
                      ip70521CompCd = ip70521MqApiLayout.getIp70521CompCd();
//  IF IP70521-COMP-CD EQUAL 300-MQ-FAIL-CODE
                      if (	( ip70521CompCd == mqFailCode300 )) { 
//  MOVE 300-PARA-5000 TO 900-ABEND-PARA
                          abendParaName900.setAbendPara900(work.getPara5000300());
//  MOVE 614-MQ-GET-ERROR-MSG-TXT TO 900-ABEND-TEXT
                          abendMessage900.setAbendText900(pad(66,work.getMqGetErrorMsgTxt614(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-MQ-ERR-ABEND-CODE TO 900-ABEND-CODE
                          abendMessage900.setAbendCode900(work.getMqErrAbendCode300());
//  PERFORM 9500-ABEND-THE-PROGRAM
                          abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
                      }
  
//  ELSE
                      else { 
//  MOVE IP70521-MSG-BUFFER-LEN TO IP7052PMR-MSG-BUFFER-LEN
                          ip7052pmrMqApiLayout.setIp7052pmrMsgBufferLen(ip70521MqApiLayout.getIp70521MsgBufferLen());
//  MOVE IP70521-MSG-BUFFER TO IP7052PMR-MSG-BUFFER (1 : IP70521-MSG-BUFFER-LEN )
                          ip7052pmrMqApiLayout.replace(ip70521MqApiLayout/*parent*/,252/*fromOffset - (ip7052pmrMsgBuffer) */,4000000/*fromLen*/,252/*toOffset - (ip70521MsgBuffer) */,ip70521MqApiLayout.getIp70521MsgBufferLen()/*toLen*/);
//  SET 88-100-MQ-START TO TRUE
                          work.setMqStart88100True(); 
                          
//  MOVE 300-VALUE-1 TO 800-START-Q
                          work.setStartQ800( work.getValue1300());
//  MOVE ZEROES TO 400-NO-OF-VALID-TRANS
                          work.setNoOfValidTrans400(0);
//  PERFORM 5100-PROCESS-MESSAGE
                          processMessage();/*5100-PROCESS-MESSAGE*/
//  PERFORM 5200-PROCESS-NEXT-MESSAGE
                          processNextMessage();/*5200-PROCESS-NEXT-MESSAGE*/
                      }
                  }
              }
          }
      
      }
      /**
      * processMessage 
      *   This method is derived from 
  *   COBOL Paragraph - 5100-PROCESS-MESSAGE COBOL Cyclomatic complexity - 9
      * Input  :  

      * - mqStatusSw100                  COBOL Name: 100-MQ-STATUS-SW
      * - noOfValidTrans400              COBOL Name: 400-NO-OF-VALID-TRANS
      * - svcStkCount800                 COBOL Name: 800-SVC-STK-COUNT
      * - startQ800                      COBOL Name: 800-START-Q
      * - ip7052pmrMsgBufferLen          COBOL Name: IP7052PMR-MSG-BUFFER-LEN
      * - value1300                      COBOL Name: 300-VALUE-1
      * - ip7052pmrMsgBuffer             COBOL Name: IP7052PMR-MSG-BUFFER
      * - value4300                      COBOL Name: 300-VALUE-4
      * - isDebugSwOn100                 COBOL Name: 100-IS-DEBUG-SW-ON
      * - pimLen800                      COBOL Name: 800-PIM-LEN
      *
      * Output :  

      * - mqStatusSw100                  COBOL Name: 100-MQ-STATUS-SW
      * - tableId800                     COBOL Name: 800-TABLE-ID
      * - ip7052pmrMsgBuffer             COBOL Name: IP7052PMR-MSG-BUFFER
      * - startQ800                      COBOL Name: 800-START-Q
      * - value4300                      COBOL Name: 300-VALUE-4
      * - sys210MqDataRec                COBOL Name: SYS210-MQ-DATA-REC
      *
      * @throws CFException
      */
      private void processMessage() throws Exception {
			// Declare local variables used in the method
			long startQ800 = 0;
			int ip7052pmrMsgBufferLen = 0;
			short value1300 = 0;
			char[] ip7052pmrMsgBuffer = null;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This paragraph is used to perform routine to parse the mq message
// *-----------------------------------------------------------------
//  PERFORM UNTIL 88-100-MQ-STOP OR 400-NO-OF-VALID-TRANS >= 800-SVC-STK-COUNT
          while ((!(work.isMqStop88100())  && 	( work.getNoOfValidTrans400() < svcStkCountGroup800.getSvcStkCount800() ))) {
              ip7052pmrMsgBufferLen = ip7052pmrMqApiLayout.getIp7052pmrMsgBufferLen();
              startQ800 = work.getStartQ800();
//  IF 800-START-Q >= IP7052PMR-MSG-BUFFER-LEN
              if (	( startQ800 >= ip7052pmrMsgBufferLen ) ) { 
//  SET 88-100-MQ-STOP TO TRUE
                  work.setMqStop88100True(); 
                  
              }
  
//  ELSE
              else { 
                  value1300 = work.getValue1300();
                  startQ800 = work.getStartQ800();
//  IF 800-START-Q EQUAL 300-VALUE-1
                  if (	( startQ800 == value1300 ) ) { 
//  MOVE SPACES TO 800-TABLE-ID
                      work.setTableId800(CONSTANTS.SPACE_11);
//  MOVE IP7052PMR-MSG-BUFFER (1 : 3) TO 800-TABLE-ID
                      work.setTableId800(pad(11,substring(ip7052pmrMqApiLayout.getIp7052pmrMsgBuffer(),0,3),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-VALUE-4 TO 800-START-Q
                      work.setStartQ800( work.getValue4300());
                  }
  
//  IF 88-100-DEBUG-SW-Y
                  if ( isDebugSwOnGroup100.isDebugSwY88100()  ) { 
//  MOVE SPACES TO SYS210-MQ-DATA-REC
                      sys210MqDataRec.setString(CONSTANTS.SPACE_500);
//  MOVE IP7052PMR-MSG-BUFFER ( 800-START-Q : 800-PIM-LEN ) TO SYS210-MQ-DATA-REC (1 : 800-PIM-LEN )
                      sys210MqDataRec.replace(ip7052pmrMqApiLayout/*parent*/,252+(int) work.getStartQ800() - 1/*fromOffset - (sys210MqDataRec) */,work.getPimLen800()/*fromLen*/,0/*toOffset - (ip7052pmrMsgBuffer) */,work.getPimLen800()/*toLen*/);
//  PERFORM 8900-WRITE-MQ-FILE
                      writeMqFile();/*8900-WRITE-MQ-FILE*/
                  }
                  ip7052pmrMsgBuffer = ip7052pmrMqApiLayout.getIp7052pmrMsgBuffer();
//  IF IP7052PMR-MSG-BUFFER ( 800-START-Q : 800-PIM-LEN ) EQUAL SPACES OR LOW-VALUES OR HIGH-VALUES
                  if (Field.allSpaces(ip7052pmrMsgBuffer,( ((int) work.getStartQ800() - 1) /*start*/ ), work.getPimLen800() /*len*/) || Field.compareAll(ip7052pmrMsgBuffer,CONSTANTS.LOW_VALUE_STRING,( ((int) work.getStartQ800() - 1) /*start*/ ), work.getPimLen800() /*len*/) || Field.allHighValues(ip7052pmrMsgBuffer,( ((int) work.getStartQ800() - 1) /*start*/ ), work.getPimLen800() /*len*/)) { 
//  SET 88-100-MQ-STOP TO TRUE
                      work.setMqStop88100True(); 
                      
                  }
  
//  ELSE
                  else { 
//  PERFORM 5110-VALIDTE-MESSAGE
                      validteMessage();/*5110-VALIDTE-MESSAGE*/
                  }
              }
          }
      
      }
      /**
      * validteMessage 
      *   This method is derived from 
  *   COBOL Paragraph - 5110-VALIDTE-MESSAGE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - tableId800                     COBOL Name: 800-TABLE-ID
      * - ip7052pmrMsgBuffer             COBOL Name: IP7052PMR-MSG-BUFFER
      * - noOfValidTrans400              COBOL Name: 400-NO-OF-VALID-TRANS
      * - mqPimRec400                    COBOL Name: 400-MQ-PIM-REC
      * - value1300                      COBOL Name: 300-VALUE-1
      * - startQ800                      COBOL Name: 800-START-Q
      * - pimLen800                      COBOL Name: 800-PIM-LEN
      * - mqInvRec400                    COBOL Name: 400-MQ-INV-REC
      *
      * Output :  

      * - ip34631Tipapim                 COBOL Name: IP34631-TIPAPIM
      * - ip7052pmrMsgBuffer             COBOL Name: IP7052PMR-MSG-BUFFER
      * - noOfValidTrans400              COBOL Name: 400-NO-OF-VALID-TRANS
      * - mqPimRec400                    COBOL Name: 400-MQ-PIM-REC
      * - startQ800                      COBOL Name: 800-START-Q
      * - mqStatusSw100                  COBOL Name: 100-MQ-STATUS-SW
      * - mqInvRec400                    COBOL Name: 400-MQ-INV-REC
      *
      * @throws CFException
      */
      private void validteMessage() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph is used to validate the table id and perform
// *routine to insert.
// *-----------------------------------------------------------------
//  EVALUATE TRUE
          if  ( work.isItIsPim88800()  ) { 
//  MOVE IP7052PMR-MSG-BUFFER ( 800-START-Q : 800-PIM-LEN ) TO IP34631-TIPAPIM
              ip34631Tipapim.replace(ip7052pmrMqApiLayout/*parent*/,252+(int) work.getStartQ800() - 1/*fromOffset - (ip34631Tipapim) */,work.getPimLen800()/*fromLen*/,0/*toOffset - (ip7052pmrMsgBuffer) */,94/*toLen*/);
//  ADD 300-VALUE-1 TO 400-NO-OF-VALID-TRANS 400-MQ-PIM-REC
              work.setNoOfValidTrans400(work.getNoOfValidTrans400()+work.getValue1300());
              work.setMqPimRec400(work.getMqPimRec400()+work.getValue1300());
//  ADD 800-PIM-LEN TO 800-START-Q
              work.setStartQ800(work.getStartQ800()+(int) work.getPimLen800());
//  PERFORM 8700-INSERT-TIPAPIM
              insertTipapim();/*8700-INSERT-TIPAPIM*/
//  PERFORM 8800-COMMIT-SQL
              commitSql();/*8800-COMMIT-SQL*/
          }
          else   { 
//  SET 88-100-MQ-STOP TO TRUE
              work.setMqStop88100True(); 
              
//  ADD 300-VALUE-1 TO 400-MQ-INV-REC
              work.setMqInvRec400(work.getMqInvRec400()+work.getValue1300());
          }
      
      }
      /**
      * processNextMessage 
      *   This method is derived from 
  *   COBOL Paragraph - 5200-PROCESS-NEXT-MESSAGE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - checkGetQueue100               COBOL Name: 100-CHECK-GET-QUEUE
      * - getBrowseCalls100              COBOL Name: 100-GET-BROWSE-CALLS
      * - ip70521RequestCd               COBOL Name: IP70521-REQUEST-CD
      * - ip70521MsgBufferLen            COBOL Name: IP70521-MSG-BUFFER-LEN
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void processNextMessage() throws Exception {
			// Declare local variables used in the method
			 final int IP_70521_MSG_BUFFER_LENGTH = 4000000;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *Delete the current read and process next message from queue.    *
// *----------------------------------------------------------------*
//  SET 88-100-GET-PIM TO TRUE
          checkGetQueueGroup100.setGetPim88100True(); 
          
//  SET 88-100-CURRENT-DELETE TO TRUE
          getBrowseCallsGroup100.setCurrentDelete88100True(); 
          
//  SET 88-IP70521-GET TO TRUE
          ip70521MqApiLayout.setIp70521Get88True(); 
          
//  MOVE LENGTH OF IP70521-MSG-BUFFER TO IP70521-MSG-BUFFER-LEN
          ip70521MqApiLayout.setIp70521MsgBufferLen(IP_70521_MSG_BUFFER_LENGTH);
//  CALL 800-PTR-IP708020
          // CALL 800-PTR-IP708020
          	this.setRc( ip708020.process());
//  SET 88-100-NEXT-BROWSE TO TRUE
          getBrowseCallsGroup100.setNextBrowse88100True(); 
          
      
      }
      /**
      * endProcess6000 
      *   This method is derived from 
  *   COBOL Paragraph - 6000-END-PROCESS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - mqPimRec400                    COBOL Name: 400-MQ-PIM-REC
      * - mqPimInsert400                 COBOL Name: 400-MQ-PIM-INSERT
      * - mqInvRec400                    COBOL Name: 400-MQ-INV-REC
      * - tamapmaRowsFetched400          COBOL Name: 400-TAMAPMA-ROWS-FETCHED
      * - tamapmaRowsDeleted400          COBOL Name: 400-TAMAPMA-ROWS-DELETED
      * - tipapimRowsInserted400         COBOL Name: 400-TIPAPIM-ROWS-INSERTED
      *
      * Output : None 

      * @throws CFException
      */
      private void endProcess6000() throws Exception {
      
// *-----------------------------------------------------------------
// *End of process when code execting in linux os.
// *-----------------------------------------------------------------
//  DISPLAY '# OF PIM RECORDS RETRIEVED FROM MQ :' 400-MQ-PIM-REC
          logger.info("# OF PIM RECORDS RETRIEVED FROM MQ :{}", String.valueOf(work.getMqPimRec400())); 
//  DISPLAY '# OF PIM RECORDS INSERTED          :' 400-MQ-PIM-INSERT
          logger.info("# OF PIM RECORDS INSERTED          :{}", String.valueOf(work.getMqPimInsert400())); 
//  DISPLAY '# OF INVALID RECORDS FROM MQ       :' 400-MQ-INV-REC
          logger.info("# OF INVALID RECORDS FROM MQ       :{}", String.valueOf(work.getMqInvRec400())); 
//  DISPLAY '# OF AUTH PMA ROWS FETCHED         :' 400-TAMAPMA-ROWS-FETCHED
          logger.info("# OF AUTH PMA ROWS FETCHED         :{}", String.valueOf(work.getTamapmaRowsFetched400())); 
//  DISPLAY '# OF PMA ROWS DELETED              :' 400-TAMAPMA-ROWS-DELETED
          logger.info("# OF PMA ROWS DELETED              :{}", String.valueOf(work.getTamapmaRowsDeleted400())); 
//  DISPLAY '# OF GCMS PIM ROWS INSERTED        :' 400-TIPAPIM-ROWS-INSERTED
          logger.info("# OF GCMS PIM ROWS INSERTED        :{}", String.valueOf(work.getTipapimRowsInserted400())); 
      
      }
      /**
      * closeDisconnectQ 
      *   This method is derived from 
  *   COBOL Paragraph - 7000-CLOSE-DISCONNECT-Q COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - ip34051ProcessSwitch           COBOL Name: IP34051-PROCESS-SWITCH
      * - ip34051TipacliSwitch           COBOL Name: IP34051-TIPACLI-SWITCH
      * - ip34051TipasvcSwitch           COBOL Name: IP34051-TIPASVC-SWITCH
      * - ip34051ServCd                  COBOL Name: IP34051-SERV-CD
      * - ip34051FuncCd                  COBOL Name: IP34051-FUNC-CD
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void closeDisconnectQ() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph is to close and disconnect the mq
// *-----------------------------------------------------------------
//  SET 88-IP34051-REQUEST-END TO TRUE
          ip34051MqProcessParameters.setIp34051RequestEnd88True(); 
          
//  SET 88-IP34051-TIPACLI-ACTIVE-N TO TRUE
          ip34051MqProcessParameters.setIp34051TipacliActiveN88True(); 
          
//  SET 88-IP34051-TIPASVC-ACTIVE-N TO TRUE
          ip34051MqProcessParameters.setIp34051TipasvcActiveN88True(); 
          
//  SET 88-IP34051-SERV-CD-PIMMAP TO TRUE
          ip34051MqProcessParameters.setIp34051ServCdPimmap88True(); 
          
//  SET 88-IP34051-FUNC-CD-GENERAL TO TRUE
          ip34051MqProcessParameters.setIp34051FuncCdGeneral88True(); 
          
//  CALL 800-PTR-IP703020
          // CALL 800-PTR-IP703020
          	this.setRc( ip703020.process());

// * For disonnecting the queue manager:
//  SET 88-IP34051-REQUEST-DISCNCT TO TRUE
          ip34051MqProcessParameters.setIp34051RequestDiscnct88True(); 
          
//  CALL 800-PTR-IP703020
          // CALL 800-PTR-IP703020
          	this.setRc( ip703020.process());
      
      }
      /**
      * findAccEligibility 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-FIND-ACC-ELIGIBILITY COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip08151PassedAcctNbr           COBOL Name: IP08151-PASSED-ACCT-NBR
      *
      * Output :  

      * - ip02044RngStrtNum              COBOL Name: IP02044-RNG-STRT-NUM
      * - ip08151PassedAcctNbr           COBOL Name: IP08151-PASSED-ACCT-NBR
      * - tab204KeyFound100              COBOL Name: 100-TAB204-KEY-FOUND
      * - rc                             COBOL Name: RETURN-CODE
      * - isRecordEligible100            COBOL Name: 100-IS-RECORD-ELIGIBLE
      *
      * @throws CFException
      */
      private void findAccEligibility() throws Exception {
			// Declare local variables used in the method
			Ip02044TableDataKey ip02044TableDataKey = ip02044ArPa.getIp02044TableDataKey();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph determines if entry present in table 204 for     *
// *remote processing.                                              *
// *----------------------------------------------------------------*
//  MOVE ZEROES TO IP02044-RNG-STRT-NUM
          ip02044TableDataKey.setIp02044RngStrtNum(CONSTANTS.ZERO_19);
  
//  MOVE IP08151-PASSED-ACCT-NBR TO IP02044-RNG-STRT-NUM (1 : IP08151-RETURN-ACCT-NBR-L )
          ip02044ArPa.replace(ip08151PassedParms/*parent*/,0/*fromOffset - (ip02044RngStrtNum) */,19/*fromLen*/,0/*toOffset - (ip08151PassedAcctNbr) */,ip08151ReturnParms.getIp08151ReturnAcctNbrL()/*toLen*/);
//  SET 88-100-204-ENTRY-FOUND-N TO TRUE
          tab204KeyFoundGroup100.setEntryFoundN88100204True(); 
          
//  CALL 800-PTR-IP282240
          // CALL 800-PTR-IP282240
          	this.setRc( ip282240.process());
//  IF 88-100-204-ENTRY-FOUND-N
          if ( tab204KeyFoundGroup100.isEntryFoundN88100204()  ) { 
//  SET 88-100-RECORD-NOT-ELIGIBLE TO TRUE
              work.setRecordNotEligible88100True(); 
              
          }
      
      }
      /**
      * callLrmIp648010 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-CALL-LRM-IP648010 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip64801LrmReqStat              COBOL Name: IP64801-LRM-REQ-STAT
      * - lrmStatError630                COBOL Name: 630-LRM-STAT-ERROR
      * - para8200300                    COBOL Name: 300-PARA-8200
      * - invalidRcIp648010300           COBOL Name: 300-INVALID-RC-IP648010
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - lrmStatError630                COBOL Name: 630-LRM-STAT-ERROR
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8200300                    COBOL Name: 300-PARA-8200
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - invalidRcIp648010300           COBOL Name: 300-INVALID-RC-IP648010
      *
      * @throws CFException
      */
      private void callLrmIp648010() throws Exception {
      
// *-----------------------------------------------------------------
// *Call lrm module and check the status
// *-----------------------------------------------------------------
//  CALL 800-PTR-IP648010
          // CALL 800-PTR-IP648010
          	this.setRc( ip648010.process());
//  IF IP64801-88-LRM-STAT-BAD
          if ( ip64801LrmCommBlock.isIp6480188LrmStatBad()  ) { 
//  MOVE 630-LRM-STAT-ERROR ( IP64801-LRM-BAD-RSN ) TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(lrmStat630.getLrmStatTable630(ip64801LrmCommBlock.getIp64801LrmBadRsn() - 1).getLrmStatError630());
//  MOVE 300-PARA-8200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8200300());
//  MOVE 300-INVALID-RC-IP648010 TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getInvalidRcIp648010300());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
      
      }
      /**
      * populatePimVariables 
      *   This method is derived from 
  *   COBOL Paragraph - 8220-POPULATE-PIM-VARIABLES COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip58041PrimAccountNbr          COBOL Name: IP58041-PRIM-ACCOUNT-NBR
      * - ip58041CreateUpdateTs          COBOL Name: IP58041-CREATE-UPDATE-TS
      * - ip58041ActionCode              COBOL Name: IP58041-ACTION-CODE
      * - ip58041EntRsnCd                COBOL Name: IP58041-ENT-RSN-CD
      * - ip58041StatCd                  COBOL Name: IP58041-STAT-CD
      *
      * Output :  

      * - ip34631PrimAccountNbr          COBOL Name: IP34631-PRIM-ACCOUNT-NBR
      * - ip58041PrimAccountNbr          COBOL Name: IP58041-PRIM-ACCOUNT-NBR
      * - ip34631CreateUpdateTs          COBOL Name: IP34631-CREATE-UPDATE-TS
      * - ip58041CreateUpdateTs          COBOL Name: IP58041-CREATE-UPDATE-TS
      * - ip34631ActionCode              COBOL Name: IP34631-ACTION-CODE
      * - ip58041ActionCode              COBOL Name: IP58041-ACTION-CODE
      * - ip34631EntRsnCd                COBOL Name: IP34631-ENT-RSN-CD
      * - ip58041EntRsnCd                COBOL Name: IP58041-ENT-RSN-CD
      * - ip34631StatCd                  COBOL Name: IP34631-STAT-CD
      * - ip58041StatCd                  COBOL Name: IP58041-STAT-CD
      *
      * @throws CFException
      */
      private void populatePimVariables() throws Exception {
      
// *----------------------------------------------------------------*
// *Populate external copybook.
// *----------------------------------------------------------------*
//  MOVE IP58041-PRIM-ACCOUNT-NBR TO IP34631-PRIM-ACCOUNT-NBR
          ip34631Tipapim.setIp34631PrimAccountNbr(ip58041Tipapma.getIp58041PrimAccountNbr());
          // MOVE IP58041-CREATE-UPDATE-TS TO IP34631-CREATE-UPDATE-TS
          ip34631Tipapim.getIp34631CreateUpdateTs().setString(ip58041Tipapma.getIp58041CreateUpdateTs().getCharArray());
//  MOVE IP58041-ACTION-CODE TO IP34631-ACTION-CODE
          ip34631Tipapim.setIp34631ActionCode(ip58041Tipapma.getIp58041ActionCode());
//  MOVE IP58041-ENT-RSN-CD TO IP34631-ENT-RSN-CD
          ip34631Tipapim.setIp34631EntRsnCd(ip58041Tipapma.getIp58041EntRsnCd());
//  MOVE IP58041-STAT-CD TO IP34631-STAT-CD
          ip34631Tipapim.setIp34631StatCd(ip58041Tipapma.getIp58041StatCd());
      
      }
      /**
      * callMcdynamRoutine 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-CALL-MCDYNAM-ROUTINE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - environmentInd800              COBOL Name: 800-ENVIRONMENT-IND
      * - jobGroup800                    COBOL Name: 800-JOB-GROUP
      * - jobNumber800                   COBOL Name: 800-JOB-NUMBER
      * - ip38201ReturnCode              COBOL Name: IP38201-RETURN-CODE
      * - ip38201Dsn                     COBOL Name: IP38201-DSN
      * - para8300300                    COBOL Name: 300-PARA-8300
      *
      * Output :  

      * - ip38201Function                COBOL Name: IP38201-FUNCTION
      * - ip38201DispBeginParm           COBOL Name: IP38201-DISP-BEGIN-PARM
      * - ip38201DispNormalParm          COBOL Name: IP38201-DISP-NORMAL-PARM
      * - ip38201DispAbnormalParm        COBOL Name: IP38201-DISP-ABNORMAL-PARM
      * - ip38201InputOutputFileInd      COBOL Name: IP38201-INPUT-OUTPUT-FILE-IND
      * - ip38201TrackCylinderInd        COBOL Name: IP38201-TRACK-CYLINDER-IND
      * - ip38201StorageMedia            COBOL Name: IP38201-STORAGE-MEDIA
      * - ip38201ReleaseIndicator        COBOL Name: IP38201-RELEASE-INDICATOR
      * - ip38201Recfm                   COBOL Name: IP38201-RECFM
      * - ip38201RecordCount             COBOL Name: IP38201-RECORD-COUNT
      * - ip38201Blksize                 COBOL Name: IP38201-BLKSIZE
      * - ip38201EnvironmentIndicator    COBOL Name: IP38201-ENVIRONMENT-INDICATOR
      * - environmentInd800              COBOL Name: 800-ENVIRONMENT-IND
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - jobGroup800                    COBOL Name: 800-JOB-GROUP
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - jobNumber800                   COBOL Name: 800-JOB-NUMBER
      * - ip38201ClearingIdentifier      COBOL Name: IP38201-CLEARING-IDENTIFIER
      * - rc                             COBOL Name: RETURN-CODE
      * - outputDsn800                   COBOL Name: 800-OUTPUT-DSN
      * - ip38201Dsn                     COBOL Name: IP38201-DSN
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8300300                    COBOL Name: 300-PARA-8300
      * - mcdynamRequest640              COBOL Name: 640-MCDYNAM-REQUEST
      *
      * @throws CFException
      */
      private void callMcdynamRoutine() throws Exception {
			// Declare local variables used in the method
			Ip38201DcbInfo ip38201DcbInfo = ip38201McidynamParms.getIp38201AllocateParms().getIp38201DcbInfo();
			Ip38201AllocateParms ip38201AllocateParms = ip38201McidynamParms.getIp38201AllocateParms();
			char[] ip38201ReturnCode = null;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *Calls mcdynam routine to allocate datasets dynamically
// *-----------------------------------------------------------------
//  SET 88-IP38201-ALLOCATE TO TRUE
          ip38201McidynamParms.setIp38201Allocate88True(); 
          
//  SET 88-DISP-BEGIN-NEW TO TRUE
          ip38201McidynamParms.getIp38201Disposition().setDispBeginNew88True(); 
          
//  SET 88-DISP-NORMAL-CATLG TO TRUE
          ip38201McidynamParms.getIp38201Disposition().setDispNormalCatlg88True(); 
          
//  SET 88-DISP-ABNORMAL-DELETE TO TRUE
          ip38201McidynamParms.getIp38201Disposition().setDispAbnormalDelete88True(); 
          
//  SET 88-IP38201-OUTPUT-FILE TO TRUE
          ip38201McidynamParms.getIp38201AllocateParms().setIp38201OutputFile88True(); 
          
//  SET 88-IP38201-SPACE-IN-CYLINDERS TO TRUE
          ip38201McidynamParms.getIp38201AllocateParms().getIp38201SpaceParms().setIp38201SpaceInCylinders88True(); 
          
//  SET 88-IP38201-DISK TO TRUE
          ip38201McidynamParms.getIp38201AllocateParms().setIp38201Disk88True(); 
          
//  SET 88-IP38201-RELEASE TO TRUE
          ip38201McidynamParms.getIp38201AllocateParms().getIp38201SpaceParms().setIp38201Release88True(); 
          
//  SET 88-IP38201-RECFM-FIXED-BLOCKED TO TRUE
          ip38201McidynamParms.getIp38201AllocateParms().getIp38201DcbInfo().setIp38201RecfmFixedBlocked88True(); 
          
//  SET 88-IP38201-RECFM-FIXED-LENGTH TO TRUE
          ip38201McidynamParms.getIp38201AllocateParms().getIp38201DcbInfo().setIp38201RecfmFixedLength88True(); 
          
          // MOVE 500 TO IP38201-RECORD-COUNT
          ip38201McidynamParms.getIp38201AllocateParms().getIp38201DcbInfo().setIp38201RecordCount((long)500);
  
          // MOVE ZERO TO IP38201-BLKSIZE
          ip38201McidynamParms.getIp38201AllocateParms().getIp38201DcbInfo().setIp38201Blksize(0);
  
//  IF 88-800-IT-IS-TEST-ENV
          if ( envArea800.isItIsTestEnv88800()  ) { 
//  SET 88-IP38201-ENVRNMNT-IND-TEST TO TRUE
              ip38201McidynamParms.getIp38201AllocateParms().setIp38201EnvrnmntIndTest88True(); 
              
          }
//  ELSE
          else { 
//  MOVE 800-ENVIRONMENT-IND TO IP38201-ENVIRONMENT-INDICATOR
              ip38201AllocateParms.setIp38201EnvironmentIndicator(envArea800.getEnvironmentInd800());
  
          }
//  MOVE 800-JOB-GROUP TO IP64801-LRM-JOBGRP-NAME
          ip64801LrmCommBlock.setIp64801LrmJobgrpName(jobname800.getJobGroup800());
//  MOVE 800-JOB-NUMBER TO IP64801-LRM-JOBGRP-NUM
          ip64801LrmCommBlock.setIp64801LrmJobgrpNum(jobname800.getJobNumber800());
//  MOVE IP64801-LRM-JOBGRP-NUM TO IP38201-CLEARING-IDENTIFIER (4 : 2)
          ip38201McidynamParms.getIp38201AllocateParms().setIp38201ClearingIdentifier(replace(ip38201McidynamParms.getIp38201AllocateParms().getIp38201ClearingIdentifier(),String.valueOf(ip64801LrmCommBlock.getIp64801LrmJobgrpNumString()).toCharArray(),3,5));
//  CALL 800-PTR-IP760010
          // CALL 800-PTR-IP760010
          	this.setRc( ip760010.process());
          ip38201ReturnCode = ip38201McidynamParms.getIp38201ReturnCode();
//  IF IP38201-RETURN-CODE EQUAL ZERO
          if (( allZeros(ip38201ReturnCode) ) /*  ==  zeros*/) { 
//  MOVE IP38201-DSN TO 800-OUTPUT-DSN
              work.setOutputDsn800(ip38201McidynamParms.getIp38201Dsn());
          }
  
//  ELSE
          else { 
//  MOVE 300-PARA-8300 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8300300());
//  SET 88-640-MCDYNAM-ALLOCATION TO TRUE
              mcdynamErrorMsgTxt640.setMcdynamAllocation88640True(); 
              
//  PERFORM 8310-ABEND-ON-MCDYNAM-ERROR
              abendOnMcdynamError();/*8310-ABEND-ON-MCDYNAM-ERROR*/
          }
      
      }
      /**
      * abendOnMcdynamError 
      *   This method is derived from 
  *   COBOL Paragraph - 8310-ABEND-ON-MCDYNAM-ERROR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip38201Dsn                     COBOL Name: IP38201-DSN
      * - ip38201ReturnCode              COBOL Name: IP38201-RETURN-CODE
      * - mcdynamAbendCode300            COBOL Name: 300-MCDYNAM-ABEND-CODE
      * - mcdynamErrorMsgTxt640          COBOL Name: 640-MCDYNAM-ERROR-MSG-TXT
      *
      * Output :  

      * - dsn640                         COBOL Name: 640-DSN
      * - ip38201Dsn                     COBOL Name: IP38201-DSN
      * - mcdynamRc640                   COBOL Name: 640-MCDYNAM-RC
      * - ip38201ReturnCode              COBOL Name: IP38201-RETURN-CODE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - mcdynamAbendCode300            COBOL Name: 300-MCDYNAM-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - mcdynamErrorMsgTxt640          COBOL Name: 640-MCDYNAM-ERROR-MSG-TXT
      *
      * @throws CFException
      */
      private void abendOnMcdynamError() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph invokes abend if the program ip760010-mcdynam    *
// *returns invalid return-code.                                    *
// *----------------------------------------------------------------*
//  MOVE IP38201-DSN TO 640-DSN
          mcdynamErrorMsgTxt640.setDsn640(ip38201McidynamParms.getIp38201Dsn());
//  MOVE IP38201-RETURN-CODE TO 640-MCDYNAM-RC
          mcdynamErrorMsgTxt640.setMcdynamRc640(ip38201McidynamParms.getIp38201ReturnCode());
//  MOVE 300-MCDYNAM-ABEND-CODE TO 900-ABEND-CODE
          abendMessage900.setAbendCode900(work.getMcdynamAbendCode300());
          // MOVE 640-MCDYNAM-ERROR-MSG-TXT TO 900-ABEND-TEXT
          abendMessage900.setAbendText900(mcdynamErrorMsgTxt640.toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
          abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          ;
      
      }
      /**
      * closeSys001Cutoff 
      *   This method is derived from 
  *   COBOL Paragraph - 8400-CLOSE-SYS001-CUTOFF COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - para8400300                    COBOL Name: 300-PARA-8400
      * - closeAbendCode300              COBOL Name: 300-CLOSE-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8400300                    COBOL Name: 300-PARA-8400
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - closeAbendCode300              COBOL Name: 300-CLOSE-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      private void closeSys001Cutoff() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph close sys001 and check file status.              *
// *----------------------------------------------------------------*
//  CLOSE SYS001-CUTOFF-FILE
          sys001CutoffFile.close(); 
          work.setSys001FileStatus200(sys001CutoffFile.getStatusString() );
//  IF 88-200-SYS001-IO-GOOD
//  ELSE
          if (!(work.isSys001IoGood88200()) ) { 
//  SET 88-800-SYS001 TO TRUE
              work.setSys00188800True(); 
              
//  SET 88-600-FILE-CLOSE-ERR TO TRUE
              fileIoErrMsgTxt600.setFileCloseErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              fileIoErrMsgTxt600.setFileName600(work.getFileName800());
//  MOVE 200-SYS001-FILE-STATUS TO 600-FILE-STATUS
              fileIoErrMsgTxt600.setFileStatus600(work.getSys001FileStatus200());
//  MOVE 300-PARA-8400 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8400300());
//  MOVE 300-CLOSE-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getCloseAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(fileIoErrMsgTxt600.toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
      
      }
      /**
      * closeSys202Pmafile 
      *   This method is derived from 
  *   COBOL Paragraph - 8420-CLOSE-SYS202-PMAFILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - para8420300                    COBOL Name: 300-PARA-8420
      * - closeAbendCode300              COBOL Name: 300-CLOSE-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - isSys202OpenSw100              COBOL Name: 100-IS-SYS202-OPEN-SW
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8420300                    COBOL Name: 300-PARA-8420
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - closeAbendCode300              COBOL Name: 300-CLOSE-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      private void closeSys202Pmafile() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph closes the settlement code control card. if any  *
// *i-o error occurs while closing it performs abend procedure.     *
// *----------------------------------------------------------------*
//  CLOSE SYS202-PMA-FILE
          sys202PmaFile.close(); 
          work.setSys202FileStatus200(sys202PmaFile.getStatusString() );
//  IF 88-200-SYS202-IO-GOOD
          if ( work.isSys202IoGood88200()  ) { 
//  SET 88-100-SYS202-OPEN-N TO TRUE
              work.setSys202OpenN88100True(); 
              
          }
//  ELSE
          else { 
//  SET 88-800-SYS202 TO TRUE
              work.setSys20288800True(); 
              
//  SET 88-600-FILE-CLOSE-ERR TO TRUE
              fileIoErrMsgTxt600.setFileCloseErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              fileIoErrMsgTxt600.setFileName600(work.getFileName800());
//  MOVE 200-SYS202-FILE-STATUS TO 600-FILE-STATUS
              fileIoErrMsgTxt600.setFileStatus600(work.getSys202FileStatus200());
//  MOVE 300-PARA-8420 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8420300());
//  MOVE 300-CLOSE-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getCloseAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(fileIoErrMsgTxt600.toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
      
      }
      /**
      * openIpSys202Pmafile 
      *   This method is derived from 
  *   COBOL Paragraph - 8430-OPEN-IP-SYS202-PMAFILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - para8430300                    COBOL Name: 300-PARA-8430
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - sys210FileStatus200            COBOL Name: 200-SYS210-FILE-STATUS
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8430300                    COBOL Name: 300-PARA-8430
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openAbendCode300               COBOL Name: 300-OPEN-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      private void openIpSys202Pmafile() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph opens the pma file for input                     *
// *----------------------------------------------------------------*
//  OPEN INPUT SYS202-PMA-FILE
          sys202PmaFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys202PmaFile.getFileName(),sys202PmaFile.getSys202PmaFileCharSet(),sys202PmaFile.getSys202PmaFileCrlfFlag());
          work.setSys202FileStatus200(sys202PmaFile.getStatusString() );
//  IF 88-200-SYS202-IO-GOOD
//  ELSE
          if (!(work.isSys202IoGood88200()) ) { 
//  SET 88-800-SYS202 TO TRUE
              work.setSys20288800True(); 
              
//  SET 88-600-FILE-OPEN-ERR TO TRUE
              fileIoErrMsgTxt600.setFileOpenErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              fileIoErrMsgTxt600.setFileName600(work.getFileName800());
//  MOVE 200-SYS202-FILE-STATUS TO 600-FILE-STATUS
              fileIoErrMsgTxt600.setFileStatus600(work.getSys202FileStatus200());
//  MOVE 300-PARA-8430 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8430300());
//  MOVE 300-OPEN-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getOpenAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(fileIoErrMsgTxt600.toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
      
      }
      /**
      * selectCkp 
      *   This method is derived from 
  *   COBOL Paragraph - 8500-SELECT-CKP COBOL Cyclomatic complexity - 4
      * Input  :  

      * - value1300                      COBOL Name: 300-VALUE-1
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - ip32101ChkPointDataTxtTxt      COBOL Name: IP32101-CHK-POINT-DATA-TXT-TXT
      * - cutoffPimBegin800              COBOL Name: 800-CUTOFF-PIM-BEGIN
      * - para8500300                    COBOL Name: 300-PARA-8500
      *
      * Output :  

      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - queryNo                        COBOL Name: QUERY-NO
      * - value1300                      COBOL Name: 300-VALUE-1
      * - ip32101ChkJobGrpName           COBOL Name: IP32101-CHK-JOB-GRP-NAME
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip32101ChkJobGrpNum            COBOL Name: IP32101-CHK-JOB-GRP-NUM
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - ip32101ChkLrmFiller            COBOL Name: IP32101-CHK-LRM-FILLER
      * - rc                             COBOL Name: RETURN-CODE
      * - cutoffCkpData800               COBOL Name: 800-CUTOFF-CKP-DATA
      * - ip32101ChkPointDataTxtTxt      COBOL Name: IP32101-CHK-POINT-DATA-TXT-TXT
      * - cutoffPimCkp800                COBOL Name: 800-CUTOFF-PIM-CKP
      * - cutoffTsData800                COBOL Name: 800-CUTOFF-TS-DATA
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8500300                    COBOL Name: 300-PARA-8500
      *
      * @throws CFException
      */
      private void selectCkp() throws Exception {
			// Declare local variables used in the method
			Ip32101ChkPtKeyCpt ip32101ChkPtKeyCpt = ip32101TipackpTable.getIp32101ChkPtKeyCpt();
			char[] cutoffPimCkp800 = null;
			char[] cutoffPimBegin800 = null;
			char[] ip32101ChkPointDataTxtTxt = null;
			Ip32101ChkPointDataText ip32101ChkPointDataText = ip32101TipackpTable.getIp32101ChkPointDataText();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph retrieves the ckp row                            *
// *----------------------------------------------------------------*
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          apiLayout.setItIsNotAbend88100True(); 
          
//  SET 88-100-SELECT-RTN TO TRUE
          apiLayout.setSelectRtn88100True(); 
          
//  SET 88-100-ROWS-FOUND TO TRUE
          apiLayout.setRowsFound88100True(); 
          
//  MOVE 300-VALUE-1 TO QUERY-NO
          apiLayout.setQueryNo(work.getValue1300());
//  MOVE IP64801-LRM-JOBGRP-NAME TO IP32101-CHK-JOB-GRP-NAME
          ip32101ChkPtKeyCpt.setIp32101ChkJobGrpName(ip64801LrmCommBlock.getIp64801LrmJobgrpName());
  
//  MOVE IP64801-LRM-JOBGRP-NUM TO IP32101-CHK-JOB-GRP-NUM
          ip32101ChkPtKeyCpt.setIp32101ChkJobGrpNum(String.valueOf(ip64801LrmCommBlock.getIp64801LrmJobgrpNumString()).toCharArray());
  
//  MOVE SPACES TO IP32101-CHK-LRM-FILLER
          ip32101ChkPtKeyCpt.setIp32101ChkLrmFiller(CONSTANTS.SPACE_9);
  
//  CALL 800-PTR-IP599050
          // CALL 800-PTR-IP599050
          	this.setRc( ip599050.process());
//  IF 88-100-ROWS-FOUND
          if ( apiLayout.isRowsFound88100()  ) { 
              ip32101ChkPointDataTxtTxt = ip32101ChkPointDataText.getIp32101ChkPointDataTxtTxt();
//  IF IP32101-CHK-POINT-DATA-TXT-TXT GREATER SPACES
              if (             ( isGreaterThanSpaces(ip32101ChkPointDataTxtTxt) )) { 
//  MOVE IP32101-CHK-POINT-DATA-TXT-TXT (1 : IP32101-CHK-POINT-DATA-TXT-LEN ) TO 800-CUTOFF-CKP-DATA
                  cutoffCkpData800.replace(ip32101TipackpTable/*parent*/,19/*fromOffset - (cutoffCkpData800) */,ip32101TipackpTable.getIp32101ChkPointDataText().getIp32101ChkPointDataTxtLen()/*fromLen*/,0/*toOffset - (ip32101ChkPointDataTxtTxt) */,182/*toLen*/);
                  cutoffPimBegin800 = cutoffTsData800.getCutoffPimBegin800();
                  cutoffPimCkp800 = cutoffCkpData800.getCutoffPimCkp800();
//  IF ( 800-CUTOFF-PIM-CKP >= 800-CUTOFF-PIM-BEGIN )
                  if ((		compareChars(cutoffPimCkp800,cutoffPimBegin800) >= 0 )) { 
                      // MOVE 800-CUTOFF-CKP-DATA TO 800-CUTOFF-TS-DATA
                      cutoffTsData800.setString(cutoffCkpData800.getCharArray());
                  }
  
//  ELSE
                  else { 
//  MOVE 300-PARA-8500 TO 900-ABEND-PARA
                      abendParaName900.setAbendPara900(work.getPara8500300());
//  PERFORM 8520-UPDATE-CKP-ROW
                      updateCkpRow();/*8520-UPDATE-CKP-ROW*/
//  PERFORM 8800-COMMIT-SQL
                      commitSql();/*8800-COMMIT-SQL*/
                  }
              }
  
          }
//  ELSE
          else { 
//  MOVE 300-PARA-8500 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8500300());
//  PERFORM 8510-INSERT-CKP-ROW
              insertCkpRow();/*8510-INSERT-CKP-ROW*/
//  PERFORM 8800-COMMIT-SQL
              commitSql();/*8800-COMMIT-SQL*/
          }
      
      }
      /**
      * insertCkpRow 
      *   This method is derived from 
  *   COBOL Paragraph - 8510-INSERT-CKP-ROW COBOL Cyclomatic complexity - 1
      * Input  :  

      * - value3300                      COBOL Name: 300-VALUE-3
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - cutoffTsData800                COBOL Name: 800-CUTOFF-TS-DATA
      *
      * Output :  

      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - queryNo                        COBOL Name: QUERY-NO
      * - value3300                      COBOL Name: 300-VALUE-3
      * - ip32101ChkJobGrpName           COBOL Name: IP32101-CHK-JOB-GRP-NAME
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip32101ChkJobGrpNum            COBOL Name: IP32101-CHK-JOB-GRP-NUM
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - ip32101ChkLrmFiller            COBOL Name: IP32101-CHK-LRM-FILLER
      * - ip32101ChkPointDataTxtLen      COBOL Name: IP32101-CHK-POINT-DATA-TXT-LEN
      * - ip32101ChkPointDataTxtTxt      COBOL Name: IP32101-CHK-POINT-DATA-TXT-TXT
      * - cutoffTsData800                COBOL Name: 800-CUTOFF-TS-DATA
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void insertCkpRow() throws Exception {
			// Declare local variables used in the method
			Ip32101ChkPtKeyCpt ip32101ChkPtKeyCpt = ip32101TipackpTable.getIp32101ChkPtKeyCpt();
			Ip32101ChkPointDataText ip32101ChkPointDataText = ip32101TipackpTable.getIp32101ChkPointDataText();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph inserts ckp row.                                 *
// *----------------------------------------------------------------*
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          apiLayout.setItIsNotAbend88100True(); 
          
//  SET 88-100-INSERT-RTN TO TRUE
          apiLayout.setInsertRtn88100True(); 
          
//  SET 88-100-ROWS-NOT-FND TO TRUE
          apiLayout.setRowsNotFnd88100True(); 
          
//  MOVE 300-VALUE-3 TO QUERY-NO
          apiLayout.setQueryNo(work.getValue3300());
//  MOVE IP64801-LRM-JOBGRP-NAME TO IP32101-CHK-JOB-GRP-NAME
          ip32101ChkPtKeyCpt.setIp32101ChkJobGrpName(ip64801LrmCommBlock.getIp64801LrmJobgrpName());
  
//  MOVE IP64801-LRM-JOBGRP-NUM TO IP32101-CHK-JOB-GRP-NUM
          ip32101ChkPtKeyCpt.setIp32101ChkJobGrpNum(String.valueOf(ip64801LrmCommBlock.getIp64801LrmJobgrpNumString()).toCharArray());
  
//  MOVE SPACES TO IP32101-CHK-LRM-FILLER
          ip32101ChkPtKeyCpt.setIp32101ChkLrmFiller(CONSTANTS.SPACE_9);
  
//  MOVE 182 TO IP32101-CHK-POINT-DATA-TXT-LEN
          ip32101ChkPointDataText.setIp32101ChkPointDataTxtLen((short)182);
  
          // MOVE 800-CUTOFF-TS-DATA TO IP32101-CHK-POINT-DATA-TXT-TXT
          ip32101TipackpTable.getIp32101ChkPointDataText().setIp32101ChkPointDataTxtTxt(cutoffTsData800.toCharArray());
  
//  CALL 800-PTR-IP599050
          // CALL 800-PTR-IP599050
          	this.setRc( ip599050.process());
      
      }
      /**
      * updateCkpRow 
      *   This method is derived from 
  *   COBOL Paragraph - 8520-UPDATE-CKP-ROW COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - value2300                      COBOL Name: 300-VALUE-2
      * - cutoffTsData800                COBOL Name: 800-CUTOFF-TS-DATA
      *
      * Output :  

      * - ip32101ChkJobGrpName           COBOL Name: IP32101-CHK-JOB-GRP-NAME
      * - ip64801LrmJobgrpName           COBOL Name: IP64801-LRM-JOBGRP-NAME
      * - ip32101ChkJobGrpNum            COBOL Name: IP32101-CHK-JOB-GRP-NUM
      * - ip64801LrmJobgrpNum            COBOL Name: IP64801-LRM-JOBGRP-NUM
      * - ip32101ChkLrmFiller            COBOL Name: IP32101-CHK-LRM-FILLER
      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - queryNo                        COBOL Name: QUERY-NO
      * - value2300                      COBOL Name: 300-VALUE-2
      * - ip32101ChkPointDataTxtLen      COBOL Name: IP32101-CHK-POINT-DATA-TXT-LEN
      * - ip32101ChkPointDataTxtTxt      COBOL Name: IP32101-CHK-POINT-DATA-TXT-TXT
      * - cutoffTsData800                COBOL Name: 800-CUTOFF-TS-DATA
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void updateCkpRow() throws Exception {
			// Declare local variables used in the method
			Ip32101ChkPtKeyCpt ip32101ChkPtKeyCpt = ip32101TipackpTable.getIp32101ChkPtKeyCpt();
			Ip32101ChkPointDataText ip32101ChkPointDataText = ip32101TipackpTable.getIp32101ChkPointDataText();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph updates ckp row.                                 *
// *----------------------------------------------------------------*
//  MOVE IP64801-LRM-JOBGRP-NAME TO IP32101-CHK-JOB-GRP-NAME
          ip32101ChkPtKeyCpt.setIp32101ChkJobGrpName(ip64801LrmCommBlock.getIp64801LrmJobgrpName());
  
//  MOVE IP64801-LRM-JOBGRP-NUM TO IP32101-CHK-JOB-GRP-NUM
          ip32101ChkPtKeyCpt.setIp32101ChkJobGrpNum(String.valueOf(ip64801LrmCommBlock.getIp64801LrmJobgrpNumString()).toCharArray());
  
//  MOVE SPACES TO IP32101-CHK-LRM-FILLER
          ip32101ChkPtKeyCpt.setIp32101ChkLrmFiller(CONSTANTS.SPACE_9);
  
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          apiLayout.setItIsNotAbend88100True(); 
          
//  SET 88-100-ROWS-FOUND TO TRUE
          apiLayout.setRowsFound88100True(); 
          
//  SET 88-100-UPDATE-RTN TO TRUE
          apiLayout.setUpdateRtn88100True(); 
          
//  MOVE 300-VALUE-2 TO QUERY-NO
          apiLayout.setQueryNo(work.getValue2300());
//  MOVE 182 TO IP32101-CHK-POINT-DATA-TXT-LEN
          ip32101ChkPointDataText.setIp32101ChkPointDataTxtLen((short)182);
  
//  MOVE 800-CUTOFF-TS-DATA TO IP32101-CHK-POINT-DATA-TXT-TXT (1 : IP32101-CHK-POINT-DATA-TXT-LEN )
          ip32101TipackpTable.getIp32101ChkPointDataText().setIp32101ChkPointDataTxtTxt(replace(ip32101TipackpTable.getIp32101ChkPointDataText().getIp32101ChkPointDataTxtTxt(),cutoffTsData800.toCharArray(),0,ip32101TipackpTable.getIp32101ChkPointDataText().getIp32101ChkPointDataTxtLen()));
//  CALL 800-PTR-IP599050
          // CALL 800-PTR-IP599050
          	this.setRc( ip599050.process());
      
      }
      /**
      * getCurrentTimestamp 
      *   This method is derived from 
  *   COBOL Paragraph - 8600-GET-CURRENT-TIMESTAMP COBOL Cyclomatic complexity - 1
      * Input  :  

      * - value1300                      COBOL Name: 300-VALUE-1
      *
      * Output :  

      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - queryNo                        COBOL Name: QUERY-NO
      * - value1300                      COBOL Name: 300-VALUE-1
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void getCurrentTimestamp() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph  calls routine to get the current timestamp.    *
// *----------------------------------------------------------------*
//  SET 88-100-ROWS-FOUND TO TRUE
          apiLayout.setRowsFound88100True(); 
          
//  SET 88-100-SELECT-RTN TO TRUE
          apiLayout.setSelectRtn88100True(); 
          
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          apiLayout.setItIsNotAbend88100True(); 
          
//  MOVE 300-VALUE-1 TO QUERY-NO
          apiLayout.setQueryNo(work.getValue1300());
//  CALL 800-PTR-IP500920
          // CALL 800-PTR-IP500920
          	this.setRc( ip500920.process());
      
      }
      /**
      * insertTipapim 
      *   This method is derived from 
  *   COBOL Paragraph - 8700-INSERT-TIPAPIM COBOL Cyclomatic complexity - 6
      * Input  :  

      * - ip50921CurrentTs               COBOL Name: IP50921-CURRENT-TS
      * - value4300                      COBOL Name: 300-VALUE-4
      * - ip34631CreateUpdateTs          COBOL Name: IP34631-CREATE-UPDATE-TS
      * - ip34631ActionCode              COBOL Name: IP34631-ACTION-CODE
      * - valueR300                      COBOL Name: 300-VALUE-R
      * - tipapimRowsInserted400         COBOL Name: 400-TIPAPIM-ROWS-INSERTED
      * - pimCommitCnt400                COBOL Name: 400-PIM-COMMIT-CNT
      * - mqPimInsert400                 COBOL Name: 400-MQ-PIM-INSERT
      * - commitCnt800                   COBOL Name: 800-COMMIT-CNT
      *
      * Output :  

      * - createUpdateTs800              COBOL Name: 800-CREATE-UPDATE-TS
      * - obsAccessTs800                 COBOL Name: 800-OBS-ACCESS-TS
      * - ip50921CurrentTs               COBOL Name: IP50921-CURRENT-TS
      * - actnCd100                      COBOL Name: 100-ACTN-CD
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      * - queryNo                        COBOL Name: QUERY-NO
      * - value4300                      COBOL Name: 300-VALUE-4
      * - cutoffPimTmpTs800              COBOL Name: 800-CUTOFF-PIM-TMP-TS
      * - ip34631CreateUpdateTs          COBOL Name: IP34631-CREATE-UPDATE-TS
      * - ip34631ObsAccessTs             COBOL Name: IP34631-OBS-ACCESS-TS
      * - ip34631ObsAccessTsN            COBOL Name: IP34631-OBS-ACCESS-TS-N
      * - rc                             COBOL Name: RETURN-CODE
      * - tipapimRowsInserted400         COBOL Name: 400-TIPAPIM-ROWS-INSERTED
      * - pimCommitCnt400                COBOL Name: 400-PIM-COMMIT-CNT
      * - mqPimInsert400                 COBOL Name: 400-MQ-PIM-INSERT
      * - cutoffPimBegin800              COBOL Name: 800-CUTOFF-PIM-BEGIN
      *
      * @throws CFException
      */
      private void insertTipapim() throws Exception {
			// Declare local variables used in the method
			Ip34631CreateUpdateTs ip34631CreateUpdateTs = ip34631Tipapim.getIp34631CreateUpdateTs();
			char[] ip34631ActionCode = null;
			char[] valueR300 = null;
			int pimCommitCnt400 = 0;
			int commitCnt800 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *Insert into gcms table.
// *-----------------------------------------------------------------
//  PERFORM 8600-GET-CURRENT-TIMESTAMP
          getCurrentTimestamp();/*8600-GET-CURRENT-TIMESTAMP*/
          // MOVE IP50921-CURRENT-TS TO 800-CREATE-UPDATE-TS 800-OBS-ACCESS-TS
          work.setCreateUpdateTs800(ip50921Variables.getIp50921CurrentTs());
          work.setObsAccessTs800(ip50921Variables.getIp50921CurrentTs());
//  SET 88-100-INSERT-RTN TO TRUE
          apiLayout.setInsertRtn88100True(); 
          
//  SET 88-100-ROWS-NOT-FND TO TRUE
          apiLayout.setRowsNotFnd88100True(); 
          
//  SET 88-100-IT-IS-NOT-ABEND TO TRUE
          apiLayout.setItIsNotAbend88100True(); 
          
//  MOVE 300-VALUE-4 TO QUERY-NO
          apiLayout.setQueryNo(work.getValue4300());
          ip34631CreateUpdateTs = ip34631Tipapim.getIp34631CreateUpdateTs();
//  IF IP34631-CREATE-UPDATE-TS EQUAL SPACES
          if (        ( allSpaces(ip34631CreateUpdateTs)   )) { 
//  MOVE 800-CREATE-UPDATE-TS TO 800-CUTOFF-PIM-TMP-TS IP34631-CREATE-UPDATE-TS
              work.setCutoffPimTmpTs800(work.getCreateUpdateTs800());
              ip34631Tipapim.getIp34631CreateUpdateTs().setString(work.getCreateUpdateTs800());
          }
  
//  ELSE
          else { 
              ip34631ActionCode = ip34631Tipapim.getIp34631ActionCode();
              valueR300 = work.getValueR300();
//  IF IP34631-ACTION-CODE = 300-VALUE-R
              if (		compareChars(ip34631ActionCode,valueR300) == 0 ) { 
                  // MOVE IP34631-CREATE-UPDATE-TS TO 800-CUTOFF-PIM-TMP-TS
                  work.setCutoffPimTmpTs800(ip34631Tipapim.getIp34631CreateUpdateTs().toCharArray());
//  MOVE 800-CREATE-UPDATE-TS TO IP34631-CREATE-UPDATE-TS
                  ip34631Tipapim.getIp34631CreateUpdateTs().setString(work.getCreateUpdateTs800());
              }
  
//  ELSE
              else { 
                  // MOVE IP34631-CREATE-UPDATE-TS TO 800-CUTOFF-PIM-TMP-TS
                  work.setCutoffPimTmpTs800(ip34631Tipapim.getIp34631CreateUpdateTs().toCharArray());
              }
          }
//  MOVE 800-OBS-ACCESS-TS TO IP34631-OBS-ACCESS-TS
          ip34631Tipapim.setIp34631ObsAccessTs(work.getObsAccessTs800());
//  MOVE ZEROS TO IP34631-OBS-ACCESS-TS-N
          ip34631Tipapim.setIp34631ObsAccessTsN(CONSTANTS.ZERO_1);
//  CALL 800-PTR-IP532010
          // CALL 800-PTR-IP532010
          	this.setRc( ip532010.process());
//  IF 88-100-ROWS-FOUND OR 88-100-DUPLICATE-CODE
          if ( apiLayout.isRowsFound88100()   ||  apiLayout.isDuplicateCode88100()  ) { 
//  ADD 1 TO 400-TIPAPIM-ROWS-INSERTED 400-PIM-COMMIT-CNT 400-MQ-PIM-INSERT
              work.setTipapimRowsInserted400(work.getTipapimRowsInserted400()+1);
              work.setPimCommitCnt400(work.getPimCommitCnt400()+1);
              work.setMqPimInsert400(work.getMqPimInsert400()+1);
//  MOVE 800-CUTOFF-PIM-TMP-TS TO 800-CUTOFF-PIM-BEGIN
              cutoffTsData800.setCutoffPimBegin800(work.getCutoffPimTmpTs800());
              pimCommitCnt400 = work.getPimCommitCnt400();
              commitCnt800 = parms.getCommitCnt800();
//  IF 400-PIM-COMMIT-CNT >= 800-COMMIT-CNT
              if (	( pimCommitCnt400 >= commitCnt800 )) { 
//  MOVE ZEROES TO 400-PIM-COMMIT-CNT
                  work.setPimCommitCnt400(0);
//  PERFORM 8520-UPDATE-CKP-ROW
                  updateCkpRow();/*8520-UPDATE-CKP-ROW*/
//  PERFORM 8800-COMMIT-SQL
                  commitSql();/*8800-COMMIT-SQL*/
              }
  
          }
      
      }
      /**
      * commitSql 
      *   This method is derived from 
  *   COBOL Paragraph - 8800-COMMIT-SQL COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void commitSql() throws Exception {
      
// *----------------------------------------------------------------*
// *Commit the logical unit of work.                                *
// *----------------------------------------------------------------*
//  CALL 800-PTR-IP599810
          // CALL 800-PTR-IP599810
          	this.setRc( ip599810.process());
      
      }
      /**
      * writeMqFile 
      *   This method is derived from 
  *   COBOL Paragraph - 8900-WRITE-MQ-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys210MqDataRec                COBOL Name: SYS210-MQ-DATA-REC
      * - para8900300                    COBOL Name: 300-PARA-8900
      * - writeAbendCode300              COBOL Name: 300-WRITE-ABEND-CODE
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * Output :  

      * - sys210FileStatus200            COBOL Name: 200-SYS210-FILE-STATUS
      * - fileName800                    COBOL Name: 800-FILE-NAME
      * - fileIoErrMsgTxt600ConditionGroup1 COBOL Name: FILLER
      * - fileName600                    COBOL Name: 600-FILE-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8900300                    COBOL Name: 300-PARA-8900
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - writeAbendCode300              COBOL Name: 300-WRITE-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - fileIoErrMsgTxt600             COBOL Name: 600-FILE-IO-ERR-MSG-TXT
      *
      * @throws CFException
      */
      private void writeMqFile() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph is used to write mq data in file.
// *-----------------------------------------------------------------
//  WRITE SYS210-MQ-DATA-REC END-WRITE
          sys210MqDataFile.write(sys210MqDataRec.toCharArray()); 
          sys210MqDataRec.setString(CONSTANTS.LOW_VALUE_215635768);
          work.setSys210FileStatus200(sys210MqDataFile.getStatusString() );
//  IF 88-200-SYS210-IO-GOOD
//  ELSE
          if (!(work.isSys210IoGood88200()) ) { 
//  SET 88-800-SYS210 TO TRUE
              work.setSys21088800True(); 
              
//  SET 88-600-FILE-WRITE-ERR TO TRUE
              fileIoErrMsgTxt600.setFileWriteErr88600True(); 
              
//  MOVE 800-FILE-NAME TO 600-FILE-NAME
              fileIoErrMsgTxt600.setFileName600(work.getFileName800());
//  MOVE 200-SYS210-FILE-STATUS TO 600-FILE-STATUS
              fileIoErrMsgTxt600.setFileStatus600(work.getSys210FileStatus200());
//  MOVE 300-PARA-8900 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8900300());
//  MOVE 300-WRITE-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getWriteAbendCode300());
              // MOVE 600-FILE-IO-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(fileIoErrMsgTxt600.toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
      
      }
      /**
      * abendTheProgram 
      *   This method is derived from 
  *   COBOL Paragraph - 9500-ABEND-THE-PROGRAM COBOL Cyclomatic complexity - 1
      * Input  :  

      * - pgmIp798030300                 COBOL Name: 300-PGM-IP798030
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - astriskLine900                 COBOL Name: 900-ASTRISK-LINE
      * - abendAbend900                  COBOL Name: 900-ABEND-ABEND
      * - abendAbendPgm900               COBOL Name: 900-ABEND-ABEND-PGM
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      *
      * Output :  

      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      * - pgmIp798030300                 COBOL Name: 300-PGM-IP798030
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void abendTheProgram() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph is to perform whenever abend occurs.
// *-----------------------------------------------------------------
//  PERFORM 9510-DISPLAY-NET-TOTAL
          displayNetTotal();/*9510-DISPLAY-NET-TOTAL*/
//  MOVE 300-PGM-IP798030 TO IP60001-HOLD-PGM-NAME
          ip60001EventLogWorkArea.setIp60001HoldPgmName(work.getPgmIp798030300());
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
          ip60001EventLogWorkArea.setIp60001EventErrorCode(abendMessage900.getAbendCode900());
//  MOVE 900-ABEND-TEXT TO IP60001-EVENT-ERROR-MSG
          ip60001EventLogWorkArea.setIp60001EventErrorMsg(abendMessage900.getAbendText900());
//  DISPLAY 900-ASTRISK-LINE
          logger.info(new String(work.getAstriskLine900())); 
//  DISPLAY 900-ABEND-ABEND
          logger.info(new String(work.getAbendAbend900())); 
//  DISPLAY 900-ABEND-ABEND-PGM
          logger.info(new String(work.getAbendAbendPgm900())); 
//  DISPLAY 900-ASTRISK-LINE
          logger.info(new String(work.getAstriskLine900())); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(abendParaName900.toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(abendMessage900.toString()); 
//  CALL 800-ABEND-PTR
          // CALL 800-ABEND-PTR
          	this.setRc( ip610010.process());
      
      }
      /**
      * displayNetTotal 
      *   This method is derived from 
  *   COBOL Paragraph - 9510-DISPLAY-NET-TOTAL COBOL Cyclomatic complexity - 2
      * Input  :  

      * - remoteProcessingSwitch100      COBOL Name: 100-REMOTE-PROCESSING-SWITCH
      * - tipapimRowsInserted400         COBOL Name: 400-TIPAPIM-ROWS-INSERTED
      * - tamapmaRowsDeleted400          COBOL Name: 400-TAMAPMA-ROWS-DELETED
      * - tipapimRowsReplaced400         COBOL Name: 400-TIPAPIM-ROWS-REPLACED
      *
      * Output : None 

      * @throws CFException
      */
      private void displayNetTotal() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph displays the total number of records inserted
// *so far in pma/pmi.
// *-----------------------------------------------------------------
//  IF 88-100-PROCESSING-REMOTELY
          if ( work.isProcessingRemotely88100()  ) { 
//  DISPLAY '------------------------------------------------'
              logger.info("------------------------------------------------"); 
//  DISPLAY 'IP798030-TOTAL GCMS PIM ROWS INSERTED => ' 400-TIPAPIM-ROWS-INSERTED
              logger.info("IP798030-TOTAL GCMS PIM ROWS INSERTED => {}", String.valueOf(work.getTipapimRowsInserted400())); 
//  DISPLAY '------------------------------------------------'
              logger.info("------------------------------------------------"); 
          }
//  ELSE
          else { 
//  DISPLAY '------------------------------------------------'
              logger.info("------------------------------------------------"); 
//  DISPLAY 'IP798030-TOTAL AUTH PMA ROWS DELETED  => ' 400-TAMAPMA-ROWS-DELETED
              logger.info("IP798030-TOTAL AUTH PMA ROWS DELETED  => {}", String.valueOf(work.getTamapmaRowsDeleted400())); 
//  DISPLAY 'IP798030-TOTAL GCMS PIM ROWS INSERTED => ' 400-TIPAPIM-ROWS-INSERTED
              logger.info("IP798030-TOTAL GCMS PIM ROWS INSERTED => {}", String.valueOf(work.getTipapimRowsInserted400())); 
//  DISPLAY 'IP798030-TOTAL GCMS PIM ROWS REPLACED => ' 400-TIPAPIM-ROWS-REPLACED
              logger.info("IP798030-TOTAL GCMS PIM ROWS REPLACED => {}", String.valueOf(work.getTipapimRowsReplaced400())); 
//  DISPLAY '------------------------------------------------'
              logger.info("------------------------------------------------"); 
          }
      
      }
      /**
      * updateEventLog 
      *   This method is derived from 
  *   COBOL Paragraph - 9950-UPDATE-EVENT-LOG COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip60001EventLogControl         COBOL Name: IP60001-EVENT-LOG-CONTROL
      * - ip60001Subscript               COBOL Name: IP60001-SUBSCRIPT
      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      *
      * Output :  

      * - ip60001Subscript               COBOL Name: IP60001-SUBSCRIPT
      * - ip60001PgmName                 COBOL Name: IP60001-PGM-NAME
      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      *
      * @throws CFException
      */
      private void updateEventLog() throws Exception {
			// Declare local variables used in the method
			long ip60001Subscript = 0;
			// End of variable declaration

      
// * Element ip601011 as of 10/31/02 04:53:52                    [vc]
// ******************************************************************
// *   description: this is the procedure division copybook to      *
// *                fill the event log table.  move the current     *
// *                program name to ip60001-hold-pgm-name and       *
// *                the current paragraph name to                   *
// *                ip60001-hold-para-name.  then perform paragraph *
// *                9950-update-event-log.                          *
// ******************************************************************
// *   modifications history                                        *
// *   date             project     modifications                   *
// *   07/30/99         2526        created                         *
// *   mm/dd/yy         xxxxxxx     description                     *
// ******************************************************************
// *  layout description:  event log update                         *
// ******************************************************************
// *  start copybook member ip601011 - event log update             *
// ******************************************************************
//  IF 88-IP60001-LOG-EVENT
          if ( ip60001EventLogWorkArea.isIp60001LogEvent88()  ) { 
              ip60001Subscript = ip60001EventLogWorkArea.getIp60001Subscript();
//  IF IP60001-SUBSCRIPT = 500
              if (	( ip60001Subscript == 500 ) ) { 
//  MOVE 1 TO IP60001-SUBSCRIPT
                  ip60001EventLogWorkArea.setIp60001Subscript((long)1);
              }
  
//  ELSE
              else { 
//  ADD 1 TO IP60001-SUBSCRIPT
                  ip60001EventLogWorkArea.setIp60001Subscript(ip60001EventLogWorkArea.getIp60001Subscript()+(long)1);
              }
//  MOVE IP60001-HOLD-PGM-NAME TO IP60001-PGM-NAME ( IP60001-SUBSCRIPT )
              ip60001EventLogWorkArea.getIp60001EventEntry((int) ip60001EventLogWorkArea.getIp60001Subscript() - 1).setIp60001PgmName(ip60001EventLogWorkArea.getIp60001HoldPgmName());
          }
      
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
  
      public int call(Object[] params) throws Exception {
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            parms.set((Field)params[0]);
         // invoke the process and return rc
         return process();
         
      }
      
      public int call(Field... parameters) throws Exception {
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Parms) {
                       	this.parms = ((Parms) parameters[index]);
                  	} else {
                       	this.parms.set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
          return process();
      }
      
      
      public void setFromIp282210(Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   ip28221PaTableRestart.setString(((Field)params[0] ).toCharArray());
 else    ip28221PaTableRestart.setString((char[])params[0] );
      }
  
  
  
  
  
  }
  /* 
* element ip798030 as of 10/23/19 10:00:40                    [vc]
*----------------------------------------------------------------*
*          -- -- -- c o n f i d e n t i a l -- -- --             *
*    this item contains information and procedures which are     *
*    proprietary to mastercard international, incorporated,      *
*    and which are confidential.  it is provided with the        *
*    express understanding that it is to be used only for the    *
*    benefit of interbank card association, and is not to be     *
*    used, copied, or disclosed for any other purpose.  any      *
*    authorized reproduction (in whole or in part) of this       *
*    material must be marked with this legend.                   *
*----------------------------------------------------------------*
*author.        wipro.                                           *
*date-written.  jun, 2018.                                       *
*date-compiled. jun, 2018.                                       *
*security.      property of mastercard international, inc.       *
*----------------------------------------------------------------*
*program functionality: lrm updater driver for tipapim.          *
*----------------------------------------------------------------*
*this program,                                                   *
* 1. connects to gcms db2 server using db2 caf                   *
*                                                                *
* 2. reads the cutoff file sys001 to retrieve the pim begin      *
* timestamps.                                                    *
*                                                                *
* 3. determine whether tipackp has any record for 'pimu 01'. if  *
* present,compare the timestamp with sys001 and if it is greater,*
* update it to tipackp.                                          *
*                                                                *
* 4. calls driver ip595010 which in turn calls db2 api ip595110  *
* to retrieve the current clearing cycle                         *
*                                                                *
* 5. calls lrm common driver module ip648010 to update the # of  *
* running column on the lrm table to 1                           *
*                                                                *
* 6. calls ip699910 to connect to the auth db2 server            *
*                                                                *
* 7. calls driver ip534110 which in turn calls db2 api ip534120  *
* to retrieve data from the auth pma table.                      *
*                                                                *
* 8. calls ip699910 to reset connection to gcms db2 server       *
*                                                                *
* 9. calls db2 api ip532210 to insert rows into the gcms pim table
*                                                                *
* 10. calls ip699910 to connect to auth db2 server               *
*                                                                *
* 11. api ip534130 to delete the row from the auth pma table     *
* since this row would now be available in the gcms pim table.   *
*                                                                *
* 12. calls ip699910 to reset connection to gcms db2 server      *
*                                                                *
* 13. if any data was retrieved for the auth pma, the tipackp    *
* table is updated with maximum timestamps of the pma row        *
* respectively.                                                  *
*                                                                *
* 14. calls ip648010 to issue a done request and request to sleep*
*----------------------------------------------------------------*
* additional information : -                                     *
*                                                                *
* 1) for an insert or an update , data is committed after        *
* commit count is achieved.                                      *
*                                                                *
* 2) for a delete data is committed each records processed in    *
* tamapma table.                                                 *
*                                                                *
* 3) no special restart logic required for this process          *
*----------------------------------------------------------------*
*revision history:                                               *
*----------------------------------------------------------------*
*    project         :gcms release 18.q4 - i5256                 *
*                    :incontrol rcn replacement                  *
*    date            :2018/10/12                                 *
*    programmer      :wipro                                      *
*    modification    :initial version                            *
*----------------------------------------------------------------*
*    project         :gcms release 18.q4 - i8682                 *
*                     indonesia on soil                          *
*    date            :2018/10/12                                 *
*    programmer      :wipro                                      *
*    modification    :this program modified to perform different *
*                     process when it executing in zos and in the*
*                     linux.                                     *
*                     added mq logic to put messages in queue    *
*                     when executing in zos.                     *
*                     added mq logic to get messages from queue  *
*                     when executing in linux.                   *
*----------------------------------------------------------------*
*    project         :gcms asi - out of release                  *
*                     pbi000000002141                            *
*    date            :2019/03/15                                 *
*    programmer      :wipro                                      *
*    modification    :this program is modified to avoid the      *
*                     recursive send of mq data.                 *
*----------------------------------------------------------------*
*    project        :gcms release 19.q4 - i13263                 *
*                    mdes stop gap solution                      *
*    date           :2019/10/18                                  *
*    programmer     :shankar subramanian                         *
*    modification   :modified the program to use copybook        *
*                    ip798021 in the linkage parameter section.  *
*----------------------------------------------------------------*
*/
