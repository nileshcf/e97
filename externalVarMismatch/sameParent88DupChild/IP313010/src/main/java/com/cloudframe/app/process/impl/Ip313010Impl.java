  package com.cloudframe.app.process.impl;
  /* 
* element ip313010 as of 12/04/19 07:20:57                    ?vc�
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
*author.        roger cantrell.
*date-written.  november 13, 2003
*security.      property of mastercard international, inc.
*
*----------------------------------------------------------------*
*program functionality:this is an optimization program.
*----------------------------------------------------------------*
* the purpose of this program is to optimize the 1 day file, for *
* the table ip0021t1 records.                                    *
*----------------------------------------------------------------*
*revision history:
*----------------------------------------------------------------*
* project       :gcms release 4.1
* date          :2004/04/04
* programmer    :roger cantrell.
* modification  :optimize table ip0021t1.
* modification  :replaced subscripts with indexes.  (jsc)
*----------------------------------------------------------------*
*----------------------------------------------------------------*
*    project         :gcms release 18.q4                         *
*                     lcms and mds batch on-soil migration       *
*    date            :2018/06/06                                 *
*    programmer      :wipro                                      *
*    modification    :program modified to include the compiler   *
*                     directives to support in linux             *
*----------------------------------------------------------------*
*/
  
  import com.cloudframe.app.ip313010.Ip313010Ctx.*;
  import com.cloudframe.app.ip313010.Ip313010Ctx;
  import com.cloudframe.app.process.Ip313010;
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
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.global.sharedvar.Ip002102TableData;
  import com.cloudframe.app.ip313010.dto.*;
  import com.cloudframe.app.ip313010.dto.Ip002103TableData;
  import com.cloudframe.app.global.sharedvar.Ip002102RecreateConvTable;
  import com.cloudframe.app.global.sharedvar.Ip50004iOneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50004iOneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50004iReadTableIdGroup;
  import com.cloudframe.app.global.sharedvar.Ip50004iOneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005oOneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005oOneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50005oOneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005oClearingDtTm;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.ip313010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip313010")
  
  public class Ip313010Impl extends CommonProcess implements Ip313010 {
  
  Logger logger = LoggerFactory.getLogger(Ip313010Impl.class);
  
  
  
  
  @Autowired 
  @Qualifier("ip996010")
  Ip996010 ip996010;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Ip313010Ctx programCtx) throws Exception {
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
      public void mainline(Ip313010Ctx programCtx) throws Exception {
//  PERFORM 1000-DO-INITIALIZATION
          doInitialization(programCtx.getDoInitializationInCtx());/*1000-DO-INITIALIZATION*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS-TBL0021
          processTbl0021(programCtx.getProcessTbl0021InCtx());/*2000-PROCESS-TBL0021*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * doInitialization 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-DO-INITIALIZATION COBOL Cyclomatic complexity - 3
      * Input  :  

      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      * - ip313010300                    COBOL Name: 300-IP313010
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip50004iEffDate                COBOL Name: IP50004I-EFF-DATE
      * - ip50004iTableId                COBOL Name: IP50004I-TABLE-ID
      *
      * Output :  

      * - ptrIp996010800                 COBOL Name: 800-PTR-IP996010
      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - ip313010300                    COBOL Name: 300-IP313010
      * - ip996011PgmVersion             COBOL Name: IP996011-PGM-VERSION
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip996011WhenCompiled           COBOL Name: IP996011-WHEN-COMPILED
      * - rc                             COBOL Name: RETURN-CODE
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - saveEffDate100                 COBOL Name: 100-SAVE-EFF-DATE
      * - ip50004iEffDate                COBOL Name: IP50004I-EFF-DATE
      * - saveTableId100                 COBOL Name: 100-SAVE-TABLE-ID
      * - ip50004iTableId                COBOL Name: IP50004I-TABLE-ID
      * - ip002102RecreateConvTable      COBOL Name: IP002102-RECREATE-CONV-TABLE
      * - ip002102RowCount               COBOL Name: IP002102-ROW-COUNT
      * - ip002102X                      COBOL Name: IP002102-X
      *
      * @throws CFException
      */
      @Override
      public DoInitializationOutCtx doInitialization(DoInitializationInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *If the program is called for the first time, this paragraph will*
// *be performed. it basically displays program execution messages. *
// *it fills the entries in log detail copybook - ip996011          *
// *and displays the details accordingly.                           *
// *----------------------------------------------------------------*
Ip313010Ctx programCtx = methodIn.getIp313010Ctx();
DoInitializationOutCtx methodOut = methodIn.getDoInitializationOutCtx();
//  IF 88-100-IT-IS-FIRST-TIME
          if ( methodIn.isItIsFirstTime88100()  ) { 
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
              methodOut.setPtrIp996010800(methodIn.getPgmIp996010300()); 
              
//  MOVE 300-IP313010 TO IP996011-PGM-ID
              methodOut.setIp996011PgmId(methodOut.getIp313010300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
              methodOut.setIp996011PgmVersion(methodOut.getPgmVersion300());
              // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
              //  FORMAT1311677340 = "X(08)BX(08)"
              methodOut.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_1807325697));
//  CALL 800-PTR-IP996010
              // CALL 800-PTR-IP996010
              	programCtx.setRc( ip996010.process(programCtx.getGlobalCtx().getContext("IP996010")));
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              methodOut.setItIsNotFirstTime88100True(); 
              
              // MOVE IP50004I-EFF-DATE TO 100-SAVE-EFF-DATE
              methodOut.setSaveEffDate100(methodOut.getIp50004iEffDate());
              // MOVE IP50004I-TABLE-ID TO 100-SAVE-TABLE-ID
              methodOut.setSaveTableId100(methodOut.getIp50004iTableId().toCharArray());
//  MOVE HIGH-VALUES TO IP002102-RECREATE-CONV-TABLE
              methodOut.getIp002102RecreateConvTable().setString(CONSTANTS.HIGH_VALUE_1464863615);
              // MOVE ZEROES TO IP002102-ROW-COUNT
              methodOut.setIp002102RowCount(0);
//  SET IP002102-X TO 1
              methodOut.setIp002102X(1); 
              
          }
      
      return methodOut;
      }
      /**
      * processTbl0021 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESS-TBL0021 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip50004iOneDayRecLth           COBOL Name: IP50004I-ONE-DAY-REC-LTH
      * - ip50004iTableData              COBOL Name: IP50004I-TABLE-DATA
      * - ip002102X                      COBOL Name: IP002102-X
      * - ip002102RecreateConvTable      COBOL Name: IP002102-RECREATE-CONV-TABLE
      * - saveEffDate100                 COBOL Name: 100-SAVE-EFF-DATE
      * - saveTableId100                 COBOL Name: 100-SAVE-TABLE-ID
      *
      * Output :  

      * - ip002103TableData              COBOL Name: IP002103-TABLE-DATA
      * - ip50004iTableData              COBOL Name: IP50004I-TABLE-DATA
      * - ip002102RowCount               COBOL Name: IP002102-ROW-COUNT
      * - length800                      COBOL Name: 800-LENGTH
      * - ip50005oOneDayRecLth           COBOL Name: IP50005O-ONE-DAY-REC-LTH
      * - ip50005oTableData              COBOL Name: IP50005O-TABLE-DATA
      * - ip002102RecreateConvTable      COBOL Name: IP002102-RECREATE-CONV-TABLE
      * - ip50005oEffDate                COBOL Name: IP50005O-EFF-DATE
      * - saveEffDate100                 COBOL Name: 100-SAVE-EFF-DATE
      * - ip50005oTableId                COBOL Name: IP50005O-TABLE-ID
      * - saveTableId100                 COBOL Name: 100-SAVE-TABLE-ID
      *
      * @throws CFException
      */
      @Override
      public ProcessTbl0021OutCtx processTbl0021(ProcessTbl0021InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int IP_002102_ROW_COUNT_LENGTH = 4;
			// End of variable declaration

Ip313010Ctx programCtx = methodIn.getIp313010Ctx();
ProcessTbl0021OutCtx methodOut = methodIn.getProcessTbl0021OutCtx();
//  IF IP50004I-ONE-DAY-REC-LTH > ZEROES
          if (	( methodIn.getIp50004iOneDayRecLth() > 0 ) ) { 
//  MOVE IP50004I-TABLE-DATA TO IP002103-TABLE-DATA
              methodOut.getIp002103TableData().setString(methodOut.getIp50004iTableData());
//  PERFORM 2200-MOVE-TABLE-ENTRY
              moveTableEntry(programCtx.getMoveTableEntryInCtx());/*2200-MOVE-TABLE-ENTRY*/
          }
//  ELSE
          else { 
//  SET IP002102-ROW-COUNT TO IP002102-X
              methodOut.setIp002102RowCount(methodIn.getIp002102X()); 
              
//  SUBTRACT 1 FROM IP002102-ROW-COUNT
              methodOut.setIp002102RowCount(methodOut.getIp002102RowCount()-1);
              methodOut.setLength800((int)Math.abs( ( Ip002102TableData.getIp002102TableDataFieldLength() * methodOut.getIp002102RowCount() )  + IP_002102_ROW_COUNT_LENGTH));
//  MOVE 800-LENGTH TO IP50005O-ONE-DAY-REC-LTH
              methodOut.setIp50005oOneDayRecLth((int) methodOut.getLength800());
//  ADD 18 TO IP50005O-ONE-DAY-REC-LTH
              methodOut.setIp50005oOneDayRecLth(methodOut.getIp50005oOneDayRecLth()+(long)18);
//  MOVE IP002102-RECREATE-CONV-TABLE TO IP50005O-TABLE-DATA (1 : 800-LENGTH )
              methodOut.setIp50005oTableData(replace(methodOut.getIp50005oTableData(),methodOut.getIp002102RecreateConvTable().toCharArray(),0,methodOut.getLength800()));
//  MOVE 100-SAVE-EFF-DATE TO IP50005O-EFF-DATE
              methodOut.setIp50005oEffDate(padLeftZeros(10,methodOut.getSaveEffDate100(),false));
//  MOVE 100-SAVE-TABLE-ID TO IP50005O-TABLE-ID
              methodOut.setIp50005oTableId(methodOut.getSaveTableId100());
          }
      
      return methodOut;
      }
      /**
      * moveTableEntry 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-MOVE-TABLE-ENTRY COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip002103OldElementType         COBOL Name: IP002103-OLD-ELEMENT-TYPE
      * - ip002103OldElementNo           COBOL Name: IP002103-OLD-ELEMENT-NO
      * - ip002103OldSubfldNo            COBOL Name: IP002103-OLD-SUBFLD-NO
      * - ip002103NewElementType         COBOL Name: IP002103-NEW-ELEMENT-TYPE
      * - ip002103NewElementNo           COBOL Name: IP002103-NEW-ELEMENT-NO
      * - ip002103NewSubfldNo            COBOL Name: IP002103-NEW-SUBFLD-NO
      * - ip002103Justified              COBOL Name: IP002103-JUSTIFIED
      *
      * Output :  

      * - ip002102OldElementType         COBOL Name: IP002102-OLD-ELEMENT-TYPE
      * - ip002103OldElementType         COBOL Name: IP002103-OLD-ELEMENT-TYPE
      * - ip002102OldElementNo           COBOL Name: IP002102-OLD-ELEMENT-NO
      * - ip002103OldElementNo           COBOL Name: IP002103-OLD-ELEMENT-NO
      * - ip002102OldSubfldNo            COBOL Name: IP002102-OLD-SUBFLD-NO
      * - ip002103OldSubfldNo            COBOL Name: IP002103-OLD-SUBFLD-NO
      * - ip002102NewElementType         COBOL Name: IP002102-NEW-ELEMENT-TYPE
      * - ip002103NewElementType         COBOL Name: IP002103-NEW-ELEMENT-TYPE
      * - ip002102NewElementNo           COBOL Name: IP002102-NEW-ELEMENT-NO
      * - ip002103NewElementNo           COBOL Name: IP002103-NEW-ELEMENT-NO
      * - ip002102NewSubfldNo            COBOL Name: IP002102-NEW-SUBFLD-NO
      * - ip002103NewSubfldNo            COBOL Name: IP002103-NEW-SUBFLD-NO
      * - ip002102Justified              COBOL Name: IP002102-JUSTIFIED
      * - ip002103Justified              COBOL Name: IP002103-JUSTIFIED
      * - ip002102X                      COBOL Name: IP002102-X
      *
      * @throws CFException
      */
      @Override
      public MoveTableEntryOutCtx moveTableEntry(MoveTableEntryInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *  This para checks the prev entry status.
// *----------------------------------------------------------------*
Ip313010Ctx programCtx = methodIn.getIp313010Ctx();
MoveTableEntryOutCtx methodOut = methodIn.getMoveTableEntryOutCtx();
//  MOVE IP002103-OLD-ELEMENT-TYPE TO IP002102-OLD-ELEMENT-TYPE ( IP002102-X )
          methodOut.setIp002102OldElementType(methodOut.getIp002102X() - 1,(short) methodOut.getIp002103OldElementType());
//  MOVE IP002103-OLD-ELEMENT-NO TO IP002102-OLD-ELEMENT-NO ( IP002102-X )
          methodOut.setIp002102OldElementNo(methodOut.getIp002102X() - 1,(short) methodOut.getIp002103OldElementNo());
//  MOVE IP002103-OLD-SUBFLD-NO TO IP002102-OLD-SUBFLD-NO ( IP002102-X )
          methodOut.setIp002102OldSubfldNo(methodOut.getIp002102X() - 1,(short) methodOut.getIp002103OldSubfldNo());
//  MOVE IP002103-NEW-ELEMENT-TYPE TO IP002102-NEW-ELEMENT-TYPE ( IP002102-X )
          methodOut.setIp002102NewElementType(methodOut.getIp002102X() - 1,(short) methodOut.getIp002103NewElementType());
//  MOVE IP002103-NEW-ELEMENT-NO TO IP002102-NEW-ELEMENT-NO ( IP002102-X )
          methodOut.setIp002102NewElementNo(methodOut.getIp002102X() - 1,(short) methodOut.getIp002103NewElementNo());
//  MOVE IP002103-NEW-SUBFLD-NO TO IP002102-NEW-SUBFLD-NO ( IP002102-X )
          methodOut.setIp002102NewSubfldNo(methodOut.getIp002102X() - 1,(short) methodOut.getIp002103NewSubfldNo());
//  MOVE IP002103-JUSTIFIED TO IP002102-JUSTIFIED ( IP002102-X )
          methodOut.setIp002102Justified(methodOut.getIp002102X() - 1,methodOut.getIp002103Justified());
//  SET IP002102-X UP BY 1
          methodOut.setIp002102X(methodOut.getIp002102X() + 1); 
          
      
      return methodOut;
      }
  
  
  
  
  
  
  
  
  }
