  package com.cloudframe.app.process;
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
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.global.sharedvar.Ip002102TableData;
  import com.cloudframe.app.global.sharedvar.Ip50005oTableKey;
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
  
  public class Ip313010 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip313010.class);
  
  private Ip002103TableData ip002103TableData = new Ip002103TableData() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("ip996010")
  Ip996010 ip996010;
  @Autowired 
  @Qualifier("global_ip002102RecreateConvTable")
  Ip002102RecreateConvTable ip002102RecreateConvTable;
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
  @Qualifier("global_ip996011ProgramStartMessage")
  Ip996011ProgramStartMessage ip996011ProgramStartMessage;
  
  
  
  int ip002102X;
  
  
  
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
//  PERFORM 1000-DO-INITIALIZATION
          doInitialization();/*1000-DO-INITIALIZATION*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS-TBL0021
          processTbl0021();/*2000-PROCESS-TBL0021*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
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
      private void doInitialization() throws Exception {
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
              
//  MOVE 300-IP313010 TO IP996011-PGM-ID
              ip996011ProgramStartMessage.setIp996011PgmId(work.getIp313010300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
              ip996011ProgramStartMessage.setIp996011PgmVersion(work.getPgmVersion300());
              // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
              //  FORMAT1311677340 = "X(08)BX(08)"
              ip996011ProgramStartMessage.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_1807325697));
//  CALL 800-PTR-IP996010
              // CALL 800-PTR-IP996010
              	this.setRc( ip996010.process());
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              work.setItIsNotFirstTime88100True(); 
              
              // MOVE IP50004I-EFF-DATE TO 100-SAVE-EFF-DATE
              work.setSaveEffDate100(ip50004iOneDayRec.getIp50004iTableKey().getIp50004iEffDate());
  
              // MOVE IP50004I-TABLE-ID TO 100-SAVE-TABLE-ID
              work.setSaveTableId100(ip50004iOneDayRec.getIp50004iTableKey().getIp50004iTableId().toCharArray());
  
//  MOVE HIGH-VALUES TO IP002102-RECREATE-CONV-TABLE
              ip002102RecreateConvTable.setString(CONSTANTS.HIGH_VALUE_1464863615);
              // MOVE ZEROES TO IP002102-ROW-COUNT
              ip002102RecreateConvTable.setIp002102RowCount(0);
//  SET IP002102-X TO 1
              ip002102X = 1; 
              
          }
      
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
      private void processTbl0021() throws Exception {
			// Declare local variables used in the method
			long ip50004iOneDayRecLth = 0;
			 final int IP_002102_ROW_COUNT_LENGTH = 4;
			Ip50005oTableKey ip50005oTableKey = ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey();
			// End of variable declaration

          ip50004iOneDayRecLth = ip50004iOneDayRecLthGroup.getIp50004iOneDayRecLth();
//  IF IP50004I-ONE-DAY-REC-LTH > ZEROES
          if (	( ip50004iOneDayRecLth > 0 ) ) { 
//  MOVE IP50004I-TABLE-DATA TO IP002103-TABLE-DATA
              ip002103TableData.setString(ip50004iOneDayRec.getIp50004iTableData());
//  PERFORM 2200-MOVE-TABLE-ENTRY
              moveTableEntry();/*2200-MOVE-TABLE-ENTRY*/
          }
  
//  ELSE
          else { 
//  SET IP002102-ROW-COUNT TO IP002102-X
              ip002102RecreateConvTable.setIp002102RowCount(ip002102X); 
              
//  SUBTRACT 1 FROM IP002102-ROW-COUNT
              ip002102RecreateConvTable.setIp002102RowCount(ip002102RecreateConvTable.getIp002102RowCount()-1);
              work.setLength800((int)Math.abs( ( Ip002102TableData.getIp002102TableDataFieldLength() * ip002102RecreateConvTable.getIp002102RowCount() )  + IP_002102_ROW_COUNT_LENGTH));
//  MOVE 800-LENGTH TO IP50005O-ONE-DAY-REC-LTH
              ip50005oOneDayRecLthGroup.setIp50005oOneDayRecLth((int) work.getLength800());
//  ADD 18 TO IP50005O-ONE-DAY-REC-LTH
              ip50005oOneDayRecLthGroup.setIp50005oOneDayRecLth(ip50005oOneDayRecLthGroup.getIp50005oOneDayRecLth()+(long)18);
//  MOVE IP002102-RECREATE-CONV-TABLE TO IP50005O-TABLE-DATA (1 : 800-LENGTH )
              ip50005oOneDayRec.setIp50005oTableData(replace(ip50005oOneDayRec.getIp50005oTableData(),ip002102RecreateConvTable.toCharArray(),0,work.getLength800()));
//  MOVE 100-SAVE-EFF-DATE TO IP50005O-EFF-DATE
              ip50005oTableKey.setIp50005oEffDate(padLeftZeros(10,work.getSaveEffDate100(),false));
  
//  MOVE 100-SAVE-TABLE-ID TO IP50005O-TABLE-ID
              ip50005oTableKey.setIp50005oTableId(work.getSaveTableId100());
  
          }
      
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
      private void moveTableEntry() throws Exception {
      
// *----------------------------------------------------------------*
// *  This para checks the prev entry status.
// *----------------------------------------------------------------*
//  MOVE IP002103-OLD-ELEMENT-TYPE TO IP002102-OLD-ELEMENT-TYPE ( IP002102-X )
          ip002102RecreateConvTable.getIp002102TableData(ip002102X - 1).getIp002102OldElementId().setIp002102OldElementType((short) ip002103TableData.getIp002103OldElementType());
//  MOVE IP002103-OLD-ELEMENT-NO TO IP002102-OLD-ELEMENT-NO ( IP002102-X )
          ip002102RecreateConvTable.getIp002102TableData(ip002102X - 1).getIp002102OldElementId().setIp002102OldElementNo((short) ip002103TableData.getIp002103OldElementNo());
//  MOVE IP002103-OLD-SUBFLD-NO TO IP002102-OLD-SUBFLD-NO ( IP002102-X )
          ip002102RecreateConvTable.getIp002102TableData(ip002102X - 1).setIp002102OldSubfldNo((short) ip002103TableData.getIp002103OldSubfldNo());
//  MOVE IP002103-NEW-ELEMENT-TYPE TO IP002102-NEW-ELEMENT-TYPE ( IP002102-X )
          ip002102RecreateConvTable.getIp002102TableData(ip002102X - 1).getIp002102NewElementId().setIp002102NewElementType((short) ip002103TableData.getIp002103NewElementType());
//  MOVE IP002103-NEW-ELEMENT-NO TO IP002102-NEW-ELEMENT-NO ( IP002102-X )
          ip002102RecreateConvTable.getIp002102TableData(ip002102X - 1).getIp002102NewElementId().setIp002102NewElementNo((short) ip002103TableData.getIp002103NewElementNo());
//  MOVE IP002103-NEW-SUBFLD-NO TO IP002102-NEW-SUBFLD-NO ( IP002102-X )
          ip002102RecreateConvTable.getIp002102TableData(ip002102X - 1).setIp002102NewSubfldNo((short) ip002103TableData.getIp002103NewSubfldNo());
//  MOVE IP002103-JUSTIFIED TO IP002102-JUSTIFIED ( IP002102-X )
          ip002102RecreateConvTable.getIp002102TableData(ip002102X - 1).setIp002102Justified(ip002103TableData.getIp002103Justified());
//  SET IP002102-X UP BY 1
          ip002102X++; 
          
      
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
