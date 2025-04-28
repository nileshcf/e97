  package com.cloudframe.app.process;
  /* 
*00***************************************************************
*00   licensed materials - property of united health group       *
*00***************************************************************
*10***************************************************************
*10                                                              *
*10   program name      : vp776a00.                              *
*10   business function : the purpose of the program is to       *
*10                       validate sort request parameter and    *
*10                       sort the table  during the end process *
*10                       for each system                        *
*10   designed by       : n/a.                                   *
*10   programmed by     : dave morgan                            *
*10   date coded        : oct 5,1995.                            *
*10   frequency used    : on-line.                               *
*10   type              : on request.                            *
*10                                                              *
*10***************************************************************
*20***************************************************************
*20                                                              *
*20   major program process                                      *
*20   ---------------------                                      *
*20                                                              *
*20   the purpose of the  program is to validate sort request    *
*20   parameter and sort the table(ascending  or descending      *
*20   order)                                                     *
*20                                                              *
*20***************************************************************
*30***************************************************************
*30                                                              *
*30   program change history:                                    *
*30   ----------------------                                     *
*30                                                              *
*30    pr #       date        level#                             *
*30    rkm        08/25/03    structured comments                *
*30                                                              *
*30***************************************************************
*40***************************************************************
*40                                                              *
*40   called modules                                             *
*40   --------------                                             *
*40                                                              *
*40   name      description              call/link               *
*40   ----      -----------              ---------               *
*40    n/a          n/a                     n/a                  *
*40                                                              *
*40***************************************************************
*50***************************************************************
*50                                                              *
*50   return code                                                *
*50   -----------                                                *
*50                                                              *
*50   code                            description                *
*50   -------------------------       -----------                *
*50   srp-good-return       =00       successful completion      *
*50   srp-count-error       =02       entry count error          *
*50   srp-entry-length-error=03       entry length  error        *
*50   srp-key-start-error   =04       key start error            *
*50   srp-key-length-error  =05       key length error           *
*50   srp-sequence-error    =06       sequence error             *
*50                                                              *
*50***************************************************************
*60***************************************************************
*60                                                              *
*60   files used                                                 *
*60   ----------                                                 *
*60                                                              *
*60   file name          mode         description                *
*60   ----------         ----         -----------                *
*60     n/a               n/a             n/a                    *
*60                                                              *
*60***************************************************************
*70***************************************************************
*70                                                              *
*70   tables and access types                                    *
*70   -----------------------                                    *
*70                                                              *
*70   name            type       access                          *
*70   ----            ----       ------                          *
*70   n/a             n/a        n/a                             *
*70                                                              *
*70***************************************************************
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.exception.Terminate;
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.vp776a00.dto.*;
  import com.cloudframe.app.vp776a00.dto.Dfheiblk;
  import com.cloudframe.app.vp776a00.dto.SrpSortRequestParameters;
  import com.cloudframe.app.vp776a00.dto.DfhcommareaGroup;
  import com.cloudframe.app.vp776a00.dto.SdtSortDataTableGroup;
  import com.cloudframe.app.vp776a00.dto.Sc2SortCompare2Group;
  import com.cloudframe.app.vp776a00.dto.Sc1SortCompare1Group;
  import com.cloudframe.app.vp776a00.dto.PwaPointerGroup;
  import com.cloudframe.app.vp776a00.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("vp776a00")
  
  public class Vp776a00 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Vp776a00.class);
  
  private Dfheiblk dfheiblk = new Dfheiblk() ;
  private SrpSortRequestParameters srpSortRequestParameters = new SrpSortRequestParameters() ;
  private DfhcommareaGroup dfhcommareaGroup = new DfhcommareaGroup() ;
  private SdtSortDataTableGroup sdtSortDataTableGroup = new SdtSortDataTableGroup() ;
  private Sc2SortCompare2Group sc2SortCompare2Group = new Sc2SortCompare2Group() ;
  private Sc1SortCompare1Group sc1SortCompare1Group = new Sc1SortCompare1Group() ;
  private PwaPointerGroup pwaPointerGroup = new PwaPointerGroup() ;
  private Work work = new Work() ;
  
  
  
  
  
  
  
  
  
      public int setParameter(String dfheiblk,String dfhcommareaGroup,String srpSortRequestParameters,String sdtSortDataTableGroup) throws Exception {
      		if(dfheiblk != null)
      		    this.dfheiblk.setString(com.cloudframe.app.data.Field.getParm(dfheiblk),new String(CONSTANTS.EBCDIC_ENCODING));
      		if(dfhcommareaGroup != null)
      		    this.dfhcommareaGroup.setString(com.cloudframe.app.data.Field.getParm(dfhcommareaGroup),new String(CONSTANTS.EBCDIC_ENCODING));
      		if(srpSortRequestParameters != null)
      		    this.srpSortRequestParameters.setString(com.cloudframe.app.data.Field.getParm(srpSortRequestParameters),new String(CONSTANTS.EBCDIC_ENCODING));
      		if(sdtSortDataTableGroup != null)
      		    this.sdtSortDataTableGroup.setString(com.cloudframe.app.data.Field.getParm(sdtSortDataTableGroup),new String(CONSTANTS.EBCDIC_ENCODING));
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
//  PERFORM MAINLINE-0000
          mainline0000();/*MAINLINE-0000 SECTION*/
          if (this.isProgramEnded()) {
              return getRc();
          }
          exit0000();/*EXIT-0000*/
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
      * mainline0000 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-0000 SECTION COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - srpReturnCode                  COBOL Name: SRP-RETURN-CODE
      *
      * @throws CFException
      */
      private void mainline0000() throws Exception {
      
// *82 Called by :none                                              *
// *82 calls     :1.validate-request-0100                           *
// *82            2.sort-the-table-0200                             *
// *82                                                              *
// *82***************************************************************
//  SET SRP-GOOD-RETURN TO TRUE
          srpSortRequestParameters.setSrpGoodReturnTrue(); 
          
//  PERFORM VALIDATE-REQUEST-0100
          validateRequest0100();/*VALIDATE-REQUEST-0100 SECTION*/
          if (this.isProgramEnded()) {
              return ;
          }
//  IF SRP-GOOD-RETURN
//  ELSE
          if (!(srpSortRequestParameters.isSrpGoodReturn()) ) { 
//cobolCode::GO TO EXIT-0000
exit0000();
 return ;
//cobolCodeEnds::GO TO EXIT-0000
          }
//  PERFORM SORT-THE-TABLE-0200
          sortTheTable0200();/*SORT-THE-TABLE-0200 SECTION*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * exit0000 
      *   This method is derived from 
  *   COBOL Paragraph - EXIT-0000 COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void exit0000() throws Exception {
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * validateRequest0100 
      *   This method is derived from 
  *   COBOL Paragraph - VALIDATE-REQUEST-0100 SECTION COBOL Cyclomatic complexity - 14
      * Input  :  

      * - srpEntryCount                  COBOL Name: SRP-ENTRY-COUNT
      * - srpEntryLength                 COBOL Name: SRP-ENTRY-LENGTH
      * - sc1SortCompare1                COBOL Name: SC1-SORT-COMPARE-1
      * - srpKeyStart                    COBOL Name: SRP-KEY-START
      * - srpKeyLength                   COBOL Name: SRP-KEY-LENGTH
      * - srpSequence                    COBOL Name: SRP-SEQUENCE
      *
      * Output :  

      * - srpReturnCode                  COBOL Name: SRP-RETURN-CODE
      *
      * @throws CFException
      */
      private void validateRequest0100() throws Exception {
			// Declare local variables used in the method
			int srpEntryCount = 0;
			int srpEntryLength = 0;
			int srpKeyStart = 0;
			int srpKeyLength = 0;
			 final int SC_1_SORT_COMPARE_1_LENGTH = 32767;
			char[] srpSequence = null;
			// End of variable declaration

      
// *82                                                              *
// *82 Called by :1.mainline-0000                                   *
// *82 calls     :  n/a                                             *
// *82                                                              *
// *82***************************************************************
//  IF ( SRP-ENTRY-COUNT NUMERIC) AND ( SRP-ENTRY-COUNT > 0)
//  ELSE
          if ((         !(srpSortRequestParameters.srpEntryCountIsNumeric() ) ) || (	( srpSortRequestParameters.getSrpEntryCount() <= 0 ))) { 
//  SET SRP-COUNT-ERROR TO TRUE
              srpSortRequestParameters.setSrpCountErrorTrue(); 
              
//cobolCode::GO TO EXIT-0100
return ;
//cobolCodeEnds::GO TO EXIT-0100
          }
//  IF ( SRP-ENTRY-LENGTH NUMERIC) AND ( SRP-ENTRY-LENGTH > 0) AND ( SRP-ENTRY-LENGTH NOT > LENGTH OF SC1-SORT-COMPARE-1 )
//  ELSE
          if ((         !(srpSortRequestParameters.srpEntryLengthIsNumeric() ) ) || (	( srpSortRequestParameters.getSrpEntryLength() <= 0 )) || (	( srpSortRequestParameters.getSrpEntryLength() > SC_1_SORT_COMPARE_1_LENGTH ))) { 
//  SET SRP-ENTRY-LENGTH-ERROR TO TRUE
              srpSortRequestParameters.setSrpEntryLengthErrorTrue(); 
              
//cobolCode::GO TO EXIT-0100
return ;
//cobolCodeEnds::GO TO EXIT-0100
          }
//  IF ( SRP-KEY-START NUMERIC) AND ( SRP-KEY-START > 0) AND ( SRP-KEY-START NOT > SRP-ENTRY-LENGTH )
//  ELSE
          if ((         !(srpSortRequestParameters.srpKeyStartIsNumeric() ) ) || (	( srpSortRequestParameters.getSrpKeyStart() <= 0 )) || (	( srpSortRequestParameters.getSrpKeyStart() > srpSortRequestParameters.getSrpEntryLength() ))) { 
//  SET SRP-KEY-START-ERROR TO TRUE
              srpSortRequestParameters.setSrpKeyStartErrorTrue(); 
              
//cobolCode::GO TO EXIT-0100
return ;
//cobolCodeEnds::GO TO EXIT-0100
          }
//  IF ( SRP-KEY-LENGTH NUMERIC) AND ( SRP-KEY-LENGTH > 0) AND ( SRP-KEY-LENGTH NOT > SRP-ENTRY-LENGTH )
//  ELSE
          if ((         !(srpSortRequestParameters.srpKeyLengthIsNumeric() ) ) || (	( srpSortRequestParameters.getSrpKeyLength() <= 0 )) || (	( srpSortRequestParameters.getSrpKeyLength() > srpSortRequestParameters.getSrpEntryLength() ))) { 
//  SET SRP-KEY-LENGTH-ERROR TO TRUE
              srpSortRequestParameters.setSrpKeyLengthErrorTrue(); 
              
//cobolCode::GO TO EXIT-0100
return ;
//cobolCodeEnds::GO TO EXIT-0100
          }
//  IF ( SRP-SEQUENCE = 'A' OR 'D' )
//  LITERAL_D = 'D'
          srpSequence = srpSortRequestParameters.getSrpSequence();
//  ELSE
          if ((srpSequence[0] != 'A' && srpSequence[0] != 'D')) { 
//  SET SRP-SEQUENCE-ERROR TO TRUE
              srpSortRequestParameters.setSrpSequenceErrorTrue(); 
              
//cobolCode::GO TO EXIT-0100
return ;
//cobolCodeEnds::GO TO EXIT-0100
          }
  
      
      }
      /**
      * sortTheTable0200 
      *   This method is derived from 
  *   COBOL Paragraph - SORT-THE-TABLE-0200 SECTION COBOL Cyclomatic complexity - 7
      * Input  :  

      * - srpEntryCount                  COBOL Name: SRP-ENTRY-COUNT
      * - pwaSub1                        COBOL Name: PWA-SUB1
      * - sdtSortDataTable               COBOL Name: SDT-SORT-DATA-TABLE
      * - pwaAddress                     COBOL Name: PWA-ADDRESS
      * - srpEntryLength                 COBOL Name: SRP-ENTRY-LENGTH
      * - srpSequence                    COBOL Name: SRP-SEQUENCE
      *
      * Output :  

      * - pwaSortGap                     COBOL Name: PWA-SORT-GAP
      * - srpEntryCount                  COBOL Name: SRP-ENTRY-COUNT
      * - pwaSortSwitch                  COBOL Name: PWA-SORT-SWITCH
      * - pwaLimit                       COBOL Name: PWA-LIMIT
      * - pwaSub1                        COBOL Name: PWA-SUB1
      * - pwaSub2                        COBOL Name: PWA-SUB2
      * - pwaPointer                     COBOL Name: PWA-POINTER
      * - pwaAddress                     COBOL Name: PWA-ADDRESS
      * - sc1SortCompare1                COBOL Name: SC1-SORT-COMPARE-1
      * - sc2SortCompare2                COBOL Name: SC2-SORT-COMPARE-2
      *
      * @throws CFException
      */
      private void sortTheTable0200() throws Exception {
			// Declare local variables used in the method
			BigDecimal tempDecimal = BigDecimal.ZERO;
			short pwaSortGap = 0;
			char[] srpSequence = null;
			// End of variable declaration

      
// *82     -Sort the table in ascending order otherwise             *
// *82      sort the table in descending order                      *
// *82                                                              *
// *82 called by :1.mainline-0000                                   *
// *82 calls     :1.compare-ascending-0300                          *
// *82            2.compare-descending-0400                         *
// *82                                                              *
// *82***************************************************************

// *
// *    Use comb sort to arrange table by sort key.
// *
//  MOVE SRP-ENTRY-COUNT TO PWA-SORT-GAP
          work.setPwaSortGap((short) srpSortRequestParameters.getSrpEntryCount());
//  SET PWA-SORT-INCOMPLETE TO TRUE
          work.setPwaSortIncompleteTrue(); 
          
//  PERFORM UNTIL PWA-SORT-COMPLETE AND PWA-SORT-GAP < 2
          while ((!(work.isPwaSortComplete())  || 	( work.getPwaSortGap() >= 2 ) )) {
//  DIVIDE PWA-SORT-GAP BY 1.3 GIVING PWA-SORT-GAP
              work.setPwaSortGap(BigDecimal.valueOf(work.getPwaSortGap()).divide(BigDecimal.valueOf(1.3),0,RoundingMode.DOWN).shortValue());
              pwaSortGap = work.getPwaSortGap();
//  IF PWA-SORT-GAP < 1
              if (	( pwaSortGap < 1 ) ) { 
                  // MOVE 1 TO PWA-SORT-GAP
                  work.setPwaSortGap((short)1);
              }
  
//  SET PWA-SORT-COMPLETE TO TRUE
              work.setPwaSortCompleteTrue(); 
              
//  SUBTRACT PWA-SORT-GAP FROM SRP-ENTRY-COUNT GIVING PWA-LIMIT
              work.setPwaLimit( (short) ((short) srpSortRequestParameters.getSrpEntryCount()-work.getPwaSortGap()));
//  PERFORM VARYING PWA-SUB1 FROM 1 BY 1 UNTIL PWA-SUB1 > PWA-LIMIT
              for (work.setPwaSub1(1); (	( work.getPwaSub1() <= work.getPwaLimit() )) ; work.setPwaSub1(work.getPwaSub1() + 1) ) {
                  work.setPwaSub2((short) (work.getPwaSub1() + work.getPwaSortGap()));
//  SET PWA-POINTER TO ADDRESS OF SDT-SORT-DATA-TABLE
                  pwaPointerGroup.setPwaPointer(setObject(sdtSortDataTableGroup)); 
                  
                  pwaPointerGroup.setPwaAddress(pwaPointerGroup.getPwaAddress() +  (  ( work.getPwaSub1() - 1 )  * srpSortRequestParameters.getSrpEntryLength() ) );
//  SET ADDRESS OF SC1-SORT-COMPARE-1 TO PWA-POINTER
                  sc1SortCompare1Group.set(getObject(pwaPointerGroup.getPwaPointer())); 
                  
//  SET PWA-POINTER TO ADDRESS OF SDT-SORT-DATA-TABLE
                  pwaPointerGroup.setPwaPointer(setObject(sdtSortDataTableGroup)); 
                  
                  pwaPointerGroup.setPwaAddress(pwaPointerGroup.getPwaAddress() +  (  ( work.getPwaSub2() - 1 )  * srpSortRequestParameters.getSrpEntryLength() ) );
//  SET ADDRESS OF SC2-SORT-COMPARE-2 TO PWA-POINTER
                  sc2SortCompare2Group.set(getObject(pwaPointerGroup.getPwaPointer())); 
                  
                  srpSequence = srpSortRequestParameters.getSrpSequence();
//  IF SRP-SEQUENCE = 'A'
//  LITERAL_A = 'A'
                  if (compareChars(srpSequence, CONSTANTS.LITERAL_A) == 0) { 
//  PERFORM COMPARE-ASCENDING-0300
                      compareAscending0300();/*COMPARE-ASCENDING-0300 SECTION*/
                  }
  
//  ELSE
                  else { 
//  PERFORM COMPARE-DESCENDING-0400
                      compareDescending0400();/*COMPARE-DESCENDING-0400 SECTION*/
                  }
              }
          }
      
      }
      /**
      * compareAscending0300 
      *   This method is derived from 
  *   COBOL Paragraph - COMPARE-ASCENDING-0300 SECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sc1SortCompare1                COBOL Name: SC1-SORT-COMPARE-1
      * - sc2SortCompare2                COBOL Name: SC2-SORT-COMPARE-2
      * - srpKeyStart                    COBOL Name: SRP-KEY-START
      * - srpKeyLength                   COBOL Name: SRP-KEY-LENGTH
      *
      * Output :  

      * - pwaSwapEntry                   COBOL Name: PWA-SWAP-ENTRY
      * - sc1SortCompare1                COBOL Name: SC1-SORT-COMPARE-1
      * - sc2SortCompare2                COBOL Name: SC2-SORT-COMPARE-2
      * - pwaSortSwitch                  COBOL Name: PWA-SORT-SWITCH
      *
      * @throws CFException
      */
      private void compareAscending0300() throws Exception {
			// Declare local variables used in the method
			char[] sc1SortCompare1 = null;
			char[] sc2SortCompare2 = null;
			// End of variable declaration

      
// *82 Called by :1.sort-the-table-0200                             *
// *82 calls     :  n/a                                             *
// *82                                                              *
// *82***************************************************************
          sc2SortCompare2 = sc2SortCompare2Group.getSc2SortCompare2();
          sc1SortCompare1 = sc1SortCompare1Group.getSc1SortCompare1();
//  IF SC1-SORT-COMPARE-1 ( SRP-KEY-START : SRP-KEY-LENGTH ) > SC2-SORT-COMPARE-2 ( SRP-KEY-START : SRP-KEY-LENGTH )
          if (		compareChars(substring(sc1SortCompare1,(srpSortRequestParameters.getSrpKeyStart()-1), (srpSortRequestParameters.getSrpKeyLength() + (srpSortRequestParameters.getSrpKeyStart() - 1)) ),substring(sc2SortCompare2,(srpSortRequestParameters.getSrpKeyStart()-1), (srpSortRequestParameters.getSrpKeyLength() + (srpSortRequestParameters.getSrpKeyStart() - 1)) )) > 0 ) { 
//  MOVE SC1-SORT-COMPARE-1 (1 : SRP-ENTRY-LENGTH ) TO PWA-SWAP-ENTRY (1 : SRP-ENTRY-LENGTH )
              work.setPwaSwapEntry(replace(work.getPwaSwapEntry(),substring(sc1SortCompare1Group.getSc1SortCompare1(),0,srpSortRequestParameters.getSrpEntryLength()),0,srpSortRequestParameters.getSrpEntryLength()));
//  MOVE SC2-SORT-COMPARE-2 (1 : SRP-ENTRY-LENGTH ) TO SC1-SORT-COMPARE-1 (1 : SRP-ENTRY-LENGTH )
              sc1SortCompare1Group.replace(sc2SortCompare2Group/*parent*/,0/*fromOffset - (sc1SortCompare1) */,srpSortRequestParameters.getSrpEntryLength()/*fromLen*/,0/*toOffset - (sc2SortCompare2) */,srpSortRequestParameters.getSrpEntryLength()/*toLen*/);
//  MOVE PWA-SWAP-ENTRY (1 : SRP-ENTRY-LENGTH ) TO SC2-SORT-COMPARE-2 (1 : SRP-ENTRY-LENGTH )
              sc2SortCompare2Group.setSc2SortCompare2(work.getPwaSwapEntry(),0/* pwaSwapEntry */ ,srpSortRequestParameters.getSrpEntryLength(),0,srpSortRequestParameters.getSrpEntryLength() /* field,sourceIndex,sourceLen,targetIndex,targetLen */);
//  SET PWA-SORT-INCOMPLETE TO TRUE
              work.setPwaSortIncompleteTrue(); 
              
          }
  
      
      }
      /**
      * compareDescending0400 
      *   This method is derived from 
  *   COBOL Paragraph - COMPARE-DESCENDING-0400 SECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sc1SortCompare1                COBOL Name: SC1-SORT-COMPARE-1
      * - sc2SortCompare2                COBOL Name: SC2-SORT-COMPARE-2
      * - srpKeyStart                    COBOL Name: SRP-KEY-START
      * - srpKeyLength                   COBOL Name: SRP-KEY-LENGTH
      *
      * Output :  

      * - pwaSwapEntry                   COBOL Name: PWA-SWAP-ENTRY
      * - sc1SortCompare1                COBOL Name: SC1-SORT-COMPARE-1
      * - sc2SortCompare2                COBOL Name: SC2-SORT-COMPARE-2
      * - pwaSortSwitch                  COBOL Name: PWA-SORT-SWITCH
      *
      * @throws CFException
      */
      private void compareDescending0400() throws Exception {
			// Declare local variables used in the method
			char[] sc1SortCompare1 = null;
			char[] sc2SortCompare2 = null;
			// End of variable declaration

      
// *82 Called by :1.sort-the-table-0200                             *
// *82 calls     :  n/a                                             *
// *82                                                              *
// *82***************************************************************
          sc2SortCompare2 = sc2SortCompare2Group.getSc2SortCompare2();
          sc1SortCompare1 = sc1SortCompare1Group.getSc1SortCompare1();
//  IF SC1-SORT-COMPARE-1 ( SRP-KEY-START : SRP-KEY-LENGTH ) < SC2-SORT-COMPARE-2 ( SRP-KEY-START : SRP-KEY-LENGTH )
          if (		compareChars(substring(sc1SortCompare1,(srpSortRequestParameters.getSrpKeyStart()-1), (srpSortRequestParameters.getSrpKeyLength() + (srpSortRequestParameters.getSrpKeyStart() - 1)) ),substring(sc2SortCompare2,(srpSortRequestParameters.getSrpKeyStart()-1), (srpSortRequestParameters.getSrpKeyLength() + (srpSortRequestParameters.getSrpKeyStart() - 1)) )) < 0 ) { 
//  MOVE SC1-SORT-COMPARE-1 (1 : SRP-ENTRY-LENGTH ) TO PWA-SWAP-ENTRY (1 : SRP-ENTRY-LENGTH )
              work.setPwaSwapEntry(replace(work.getPwaSwapEntry(),substring(sc1SortCompare1Group.getSc1SortCompare1(),0,srpSortRequestParameters.getSrpEntryLength()),0,srpSortRequestParameters.getSrpEntryLength()));
//  MOVE SC2-SORT-COMPARE-2 (1 : SRP-ENTRY-LENGTH ) TO SC1-SORT-COMPARE-1 (1 : SRP-ENTRY-LENGTH )
              sc1SortCompare1Group.replace(sc2SortCompare2Group/*parent*/,0/*fromOffset - (sc1SortCompare1) */,srpSortRequestParameters.getSrpEntryLength()/*fromLen*/,0/*toOffset - (sc2SortCompare2) */,srpSortRequestParameters.getSrpEntryLength()/*toLen*/);
//  MOVE PWA-SWAP-ENTRY (1 : SRP-ENTRY-LENGTH ) TO SC2-SORT-COMPARE-2 (1 : SRP-ENTRY-LENGTH )
              sc2SortCompare2Group.setSc2SortCompare2(work.getPwaSwapEntry(),0/* pwaSwapEntry */ ,srpSortRequestParameters.getSrpEntryLength(),0,srpSortRequestParameters.getSrpEntryLength() /* field,sourceIndex,sourceLen,targetIndex,targetLen */);
//  SET PWA-SORT-INCOMPLETE TO TRUE
              work.setPwaSortIncompleteTrue(); 
              
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
         if (len > 1 && params[1] != null )
            dfhcommareaGroup.set((Field)params[1]);
         if (len > 2 && params[2] != null )
            srpSortRequestParameters.set((Field)params[2]);
         if (len > 3 && params[3] != null )
            sdtSortDataTableGroup.set((Field)params[3]);
         // invoke the process and return rc
         return process();
         
      }
      
      public int call(Field... parameters) throws Exception {
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 1:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof DfhcommareaGroup) {
                       	this.dfhcommareaGroup = ((DfhcommareaGroup) parameters[index]);
                  	} else {
                       	this.dfhcommareaGroup.set(parameters[index]);
                  	}
                  }
                
                  break;
              case 2:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof SrpSortRequestParameters) {
                       	this.srpSortRequestParameters = ((SrpSortRequestParameters) parameters[index]);
                  	} else {
                       	this.srpSortRequestParameters.set(parameters[index]);
                  	}
                  }
                
                  break;
              case 3:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof SdtSortDataTableGroup) {
                       	this.sdtSortDataTableGroup = ((SdtSortDataTableGroup) parameters[index]);
                  	} else {
                       	this.sdtSortDataTableGroup.set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
          return process();
      }
      
      
  
  
  
  
  
  }
