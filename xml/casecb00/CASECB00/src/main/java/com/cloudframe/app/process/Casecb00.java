  package com.cloudframe.app.process;
  /* 
*date-written. feb 26 2010.
*date-compiled.
*remarks.
*---------------------------------------------------------------*
* a batch outbound test for testing xmlpc103s handling of *
* simple arrays. *
*---------------------------------------------------------------*
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.casecb00.dto.Getinventory;
  import com.cloudframe.app.casecb00.dto.Inventoryrequested;
  import java.math.BigDecimal;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.casecb00.dto.*;
  import com.cloudframe.app.casecb00.dto.Xmlpc103Linkage;
  import com.cloudframe.app.casecb00.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("casecb00")
  
  public class Casecb00 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Casecb00.class);
  
  private Xmlpc103Linkage xmlpc103Linkage = new Xmlpc103Linkage() ;
  private Work work = new Work() ;
  
  
  
  
  
  
  
  
  
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
//  PERFORM 0000-MAIN-PARAGRAPH
          mainParagraph();/*0000-MAIN-PARAGRAPH*/
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
      * mainParagraph 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-PARAGRAPH COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void mainParagraph() throws Exception {
//  PERFORM 0010-INITIALIZE THRU 0010-EXIT
          initialize();/*0010-INITIALIZE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 0100-FILL-INPUT-DATA THRU 0100-EXIT
          fillInputData();/*0100-FILL-INPUT-DATA*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 0300-DISPLAY-RESULTS THRU 0300-EXIT
          displayResults();/*0300-DISPLAY-RESULTS*/
          if (this.isProgramEnded()) {
              return ;
          }
//cobolCode::GO TO 9999-GOBACK
goback();
 return ;
//cobolCodeEnds::GO TO 9999-GOBACK
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 0010-INITIALIZE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - inventoryrequested             COBOL Name: INVENTORYREQUESTED
      *
      * @throws CFException
      */
      private void initialize() throws Exception {
			// Declare local variables used in the method
			Getinventory getinventory = xmlpc103Linkage.getInputRequest().getGetinventory();
			// End of variable declaration

      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
//  INITIALIZE INVENTORYREQUESTED
          getinventory.getInventoryrequested().initialize();
  
          ;
      
      }
      /**
      * fillInputData 
      *   This method is derived from 
  *   COBOL Paragraph - 0100-FILL-INPUT-DATA COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void fillInputData() throws Exception {
      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
//  PERFORM 0100-FILL-INPUT-DATA-SPLIT0
          fillInputDataSplit0();/*0100-FILL-INPUT-DATA-SPLIT0*/
//  PERFORM 0100-FILL-INPUT-DATA-SPLIT1
          fillInputDataSplit1();/*0100-FILL-INPUT-DATA-SPLIT1*/
//  PERFORM 0100-FILL-INPUT-DATA-SPLIT2
          fillInputDataSplit2();/*0100-FILL-INPUT-DATA-SPLIT2*/
      
      }
      /**
      * fillInputDataSplit0 
      *   This method is derived from 
  *   COBOL Paragraph - 0100-FILL-INPUT-DATA-SPLIT0 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - requestdate                    COBOL Name: REQUESTDATE
      * - requesttime                    COBOL Name: REQUESTTIME
      * - dealername                     COBOL Name: DEALERNAME
      * - state                          COBOL Name: STATE
      * - streetaddress                  COBOL Name: STREETADDRESS
      * - makecounter                    COBOL Name: MAKECOUNTER
      * - modelcounter                   COBOL Name: MODELCOUNTER
      * - manufacturer                   COBOL Name: MANUFACTURER
      * - country                        COBOL Name: COUNTRY
      * - level1NumIn                    COBOL Name: LEVEL-1-NUM-IN
      * - modelname                      COBOL Name: MODELNAME
      * - enginesizecc                   COBOL Name: ENGINESIZECC
      * - level2NumIn                    COBOL Name: LEVEL-2-NUM-IN
      * - colorcounter                   COBOL Name: COLORCOUNTER
      * - color                          COBOL Name: COLOR
      * - accessory                      COBOL Name: ACCESSORY
      *
      * @throws CFException
      */
      private void fillInputDataSplit0() throws Exception {
			// Declare local variables used in the method
			Inventoryrequested inventoryrequested = xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested();
			// End of variable declaration

//  MOVE '2010-03-01' TO REQUESTDATE
//  LITERAL_2010_MN2_0301 = '2010-03-01'
          inventoryrequested.setRequestdate(CONSTANTS.LITERAL_2010_MN2_0301);
  
//  MOVE '12:00:01' TO REQUESTTIME
//  LITERAL_12_CL2_0001 = '12:00:01'
          inventoryrequested.setRequesttime(CONSTANTS.LITERAL_12_CL2_0001);
  
//  MOVE 'Mike Piazza  ' TO DEALERNAME (1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).setDealername(CONSTANTS.LITERAL_Mike_B20_Piazza);
//  MOVE 'NY' TO STATE (1, 1)
//  LITERAL_NY = 'NY'
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getLocations(0).setState(CONSTANTS.LITERAL_NY);
//  MOVE '5 Center St.' TO STREETADDRESS (1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getLocations(0).setStreetaddress(CONSTANTS.LITERAL_1376140749);
//  MOVE 'PA' TO STATE (1, 2)
//  LITERAL_PA = 'PA'
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getLocations(1).setState(CONSTANTS.LITERAL_PA);
//  MOVE '106 Cherry Blossom La.' TO STREETADDRESS (1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getLocations(1).setStreetaddress(CONSTANTS.LITERAL_2027934206);
//  MOVE 'NJ' TO STATE (1, 3)
//  LITERAL_NJ = 'NJ'
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getLocations(2).setState(CONSTANTS.LITERAL_NJ);
//  MOVE '17 Hancock Dr.' TO STREETADDRESS (1, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getLocations(2).setStreetaddress(CONSTANTS.LITERAL_110162895);
//  MOVE 'Hamilton Bikes   ' TO DEALERNAME (2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).setDealername(CONSTANTS.LITERAL_Hamilton_B17_Bikes);
//  MOVE 'NJ' TO STATE (2, 1)
//  LITERAL_NJ = 'NJ'
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getLocations(0).setState(CONSTANTS.LITERAL_NJ);
//  MOVE '21 Kincaid St.' TO STREETADDRESS (2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getLocations(0).setStreetaddress(CONSTANTS.LITERAL_478374635);
//  MOVE +3 TO MAKECOUNTER (1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).setMakecounter((short)3);
//  MOVE +2 TO MODELCOUNTER (1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).setModelcounter((short)2);
//  MOVE 'Moto Guzzi' TO MANUFACTURER (1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).setManufacturer(CONSTANTS.LITERAL_Moto_B11_Guzzi);
//  MOVE 'Italy' TO COUNTRY (1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).setCountry(CONSTANTS.LITERAL_Italy_B10_);
//  MOVE +1 TO LEVEL-1-NUM-IN (1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).setLevel1NumIn(BigDecimal.ONE);
//  MOVE 'Coppa Italia' TO MODELNAME (1, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(0).setModelname(CONSTANTS.LITERAL_Coppa_B9_Italia);
//  MOVE +1100 TO ENGINESIZECC (1, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(0).setEnginesizecc((short)1100);
//  MOVE +11 TO LEVEL-2-NUM-IN (1, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(0).setLevel2NumIn(BigDecimal.valueOf(11));
//  MOVE +3 TO COLORCOUNTER (1, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(0).setColorcounter((short)3);
//  MOVE 'Red' TO COLOR (1, 1, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(0).getAvailablecolors().setColor(0,CONSTANTS.LITERAL_Red_B7_);
//  MOVE 'Green' TO COLOR (1, 1, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(0).getAvailablecolors().setColor(1,CONSTANTS.LITERAL_Green_B5_);
//  MOVE 'White' TO COLOR (1, 1, 1, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(0).getAvailablecolors().setColor(2,CONSTANTS.LITERAL_White_B5_);
//  MOVE 'Leather Jackets' TO ACCESSORY (1, 1, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(0).setAccessory(0,CONSTANTS.LITERAL_Leather_B16_Jackets);
//  MOVE 'Titanium Exhaust' TO ACCESSORY (1, 1, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(0).setAccessory(1,CONSTANTS.LITERAL_Titanium_B15_Exhaust);
//  MOVE 'Auto Oil Filters' TO ACCESSORY (1, 1, 1, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(0).setAccessory(2,CONSTANTS.LITERAL_Auto_B16_OilFilters);
//  MOVE 'Filter Retainer' TO ACCESSORY (1, 1, 1, 4)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(0).setAccessory(3,CONSTANTS.LITERAL_Filter_B16_Retainer);
//  MOVE 'Griso' TO MODELNAME (1, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(1).setModelname(CONSTANTS.LITERAL_Griso_B15_);
//  MOVE +1100 TO ENGINESIZECC (1, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(1).setEnginesizecc((short)1100);
//  MOVE +12 TO LEVEL-2-NUM-IN (1, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(1).setLevel2NumIn(BigDecimal.valueOf(12));
//  MOVE +3 TO COLORCOUNTER (1, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(1).setColorcounter((short)3);
//  MOVE 'Black' TO COLOR (1, 1, 2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(1).getAvailablecolors().setColor(0,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'Yellow' TO COLOR (1, 1, 2, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(1).getAvailablecolors().setColor(1,CONSTANTS.LITERAL_Yellow_B4_);
//  MOVE 'Red' TO COLOR (1, 1, 2, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(1).getAvailablecolors().setColor(2,CONSTANTS.LITERAL_Red_B7_);
//  MOVE 'Britsh Gr.' TO COLOR (1, 1, 2, 4)
//  LITERAL_1977233523 = 'Britsh Gr.'
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(1).getAvailablecolors().setColor(3,CONSTANTS.LITERAL_1977233523);
//  MOVE 'Leather Seat' TO ACCESSORY (1, 1, 2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(1).setAccessory(0,CONSTANTS.LITERAL_Leather_B19_Seat);
//  MOVE 'Engine Guards' TO ACCESSORY (1, 1, 2, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(0).getModelsin(1).setAccessory(1,CONSTANTS.LITERAL_Engine_B18_Guards);

// *    -----------------------------------------------------*
//  MOVE +3 TO MODELCOUNTER (1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).setModelcounter((short)3);
//  MOVE 'Ducati' TO MANUFACTURER (1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).setManufacturer(CONSTANTS.LITERAL_Ducati_B14_);
//  MOVE 'Italy' TO COUNTRY (1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).setCountry(CONSTANTS.LITERAL_Italy_B10_);
//  MOVE +2 TO LEVEL-1-NUM-IN (1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).setLevel1NumIn(BigDecimal.valueOf(2));
//  MOVE +2 TO MODELCOUNTER (1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).setModelcounter((short)2);
//  MOVE '1198 RR' TO MODELNAME (1, 2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(0).setModelname(CONSTANTS.LITERAL_1198_B14_RR);
//  MOVE +1200 TO ENGINESIZECC (1, 2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(0).setEnginesizecc((short)1200);
//  MOVE +21 TO LEVEL-2-NUM-IN (1, 2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(0).setLevel2NumIn(BigDecimal.valueOf(21));
//  MOVE +3 TO COLORCOUNTER (1, 2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(0).setColorcounter((short)3);
//  MOVE 'Red' TO COLOR (1, 2, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(0).getAvailablecolors().setColor(0,CONSTANTS.LITERAL_Red_B7_);
//  MOVE 'Black' TO COLOR (1, 2, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(0).getAvailablecolors().setColor(1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'White' TO COLOR (1, 2, 1, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(0).getAvailablecolors().setColor(2,CONSTANTS.LITERAL_White_B5_);
//  MOVE 'Yellow' TO COLOR (1, 2, 1, 4)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(0).getAvailablecolors().setColor(3,CONSTANTS.LITERAL_Yellow_B4_);
      
      }
      /**
      * fillInputDataSplit1 
      *   This method is derived from 
  *   COBOL Paragraph - 0100-FILL-INPUT-DATA-SPLIT1 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - accessory                      COBOL Name: ACCESSORY
      * - modelname                      COBOL Name: MODELNAME
      * - enginesizecc                   COBOL Name: ENGINESIZECC
      * - level2NumIn                    COBOL Name: LEVEL-2-NUM-IN
      * - colorcounter                   COBOL Name: COLORCOUNTER
      * - color                          COBOL Name: COLOR
      * - modelcounter                   COBOL Name: MODELCOUNTER
      * - manufacturer                   COBOL Name: MANUFACTURER
      * - country                        COBOL Name: COUNTRY
      * - level1NumIn                    COBOL Name: LEVEL-1-NUM-IN
      *
      * @throws CFException
      */
      private void fillInputDataSplit1() throws Exception {
//  MOVE 'Tail Eliminator' TO ACCESSORY (1, 2, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(0).setAccessory(0,CONSTANTS.LITERAL_Tail_B16_Eliminator);
//  MOVE 'Carbon Fiber Wheels' TO ACCESSORY (1, 2, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(0).setAccessory(1,CONSTANTS.LITERAL_Carbon_B13_FiberWheels);
//  MOVE 'Failure' TO ACCESSORY (1, 2, 1, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(0).setAccessory(2,CONSTANTS.LITERAL_Failure_B23_);
//  MOVE 'Multi Strada' TO MODELNAME (1, 2, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(1).setModelname(CONSTANTS.LITERAL_Multi_B9_Strada);
//  MOVE +1100 TO ENGINESIZECC (1, 2, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(1).setEnginesizecc((short)1100);
//  MOVE +22 TO LEVEL-2-NUM-IN (1, 2, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(1).setLevel2NumIn(BigDecimal.valueOf(22));
//  MOVE +2 TO COLORCOUNTER (1, 2, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(1).setColorcounter((short)2);
//  MOVE 'Red' TO COLOR (1, 2, 2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(1).getAvailablecolors().setColor(0,CONSTANTS.LITERAL_Red_B7_);
//  MOVE 'Black' TO COLOR (1, 2, 2, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(1).getAvailablecolors().setColor(1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'Fail' TO ACCESSORY (1, 2, 2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(1).setAccessory(0,CONSTANTS.LITERAL_Fail_B26_);
//  MOVE 'HyperMotard' TO MODELNAME (1, 2, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(2).setModelname(CONSTANTS.LITERAL_HyperMotard_B9_);
//  MOVE +1100 TO ENGINESIZECC (1, 2, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(2).setEnginesizecc((short)1100);
//  MOVE +23 TO LEVEL-2-NUM-IN (1, 2, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(2).setLevel2NumIn(BigDecimal.valueOf(23));
//  MOVE +2 TO COLORCOUNTER (1, 2, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(2).setColorcounter((short)2);
//  MOVE 'Red' TO COLOR (1, 2, 3, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(2).getAvailablecolors().setColor(0,CONSTANTS.LITERAL_Red_B7_);
//  MOVE 'Black' TO COLOR (1, 2, 3, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(2).getAvailablecolors().setColor(1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'Grip Guards' TO ACCESSORY (1, 2, 3, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(1).getModelsin(2).setAccessory(0,CONSTANTS.LITERAL_Grip_B20_Guards);

// *    -----------------------------------------------------*
//  MOVE +2 TO MODELCOUNTER (1, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).setModelcounter((short)2);
//  MOVE 'Kawasaki' TO MANUFACTURER (1, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).setManufacturer(CONSTANTS.LITERAL_Kawasaki_B12_);
//  MOVE 'Japan' TO COUNTRY (1, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).setCountry(CONSTANTS.LITERAL_Japan_B10_);
//  MOVE +3 TO LEVEL-1-NUM-IN (1, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).setLevel1NumIn(BigDecimal.valueOf(3));
//  MOVE +2 TO MODELCOUNTER (1, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).setModelcounter((short)2);
//  MOVE 'ZX10R' TO MODELNAME (1, 3, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).getModelsin(0).setModelname(CONSTANTS.LITERAL_ZX10R_B15_);
//  MOVE +998 TO ENGINESIZECC (1, 3, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).getModelsin(0).setEnginesizecc((short)998);
//  MOVE +31 TO LEVEL-2-NUM-IN (1, 3, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).getModelsin(0).setLevel2NumIn(BigDecimal.valueOf(31));
//  MOVE +2 TO COLORCOUNTER (1, 3, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).getModelsin(0).setColorcounter((short)2);
//  MOVE 'Green' TO COLOR (1, 3, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).getModelsin(0).getAvailablecolors().setColor(0,CONSTANTS.LITERAL_Green_B5_);
//  MOVE 'Black' TO COLOR (1, 3, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).getModelsin(0).getAvailablecolors().setColor(1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'Green Helmet' TO ACCESSORY (1, 3, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).getModelsin(0).setAccessory(0,CONSTANTS.LITERAL_Green_B19_Helmet);
//  MOVE 'ZX6R' TO MODELNAME (1, 3, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).getModelsin(1).setModelname(CONSTANTS.LITERAL_ZX6R_B16_);
//  MOVE +600 TO ENGINESIZECC (1, 3, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).getModelsin(1).setEnginesizecc((short)600);
//  MOVE +32 TO LEVEL-2-NUM-IN (1, 3, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).getModelsin(1).setLevel2NumIn(BigDecimal.valueOf(32));
//  MOVE +2 TO COLORCOUNTER (1, 3, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).getModelsin(1).setColorcounter((short)2);
//  MOVE 'Green' TO COLOR (1, 3, 2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).getModelsin(1).getAvailablecolors().setColor(0,CONSTANTS.LITERAL_Green_B5_);
//  MOVE 'Black' TO COLOR (1, 3, 2, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).getModelsin(1).getAvailablecolors().setColor(1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'Green Helmet' TO ACCESSORY (1, 3, 2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).getModelsin(1).setAccessory(0,CONSTANTS.LITERAL_Green_B19_Helmet);
//  MOVE 'Failed' TO ACCESSORY (1, 3, 2, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(0).getManufacturers(2).getModelsin(1).setAccessory(1,CONSTANTS.LITERAL_Failed_B24_);

// *    -----------------------------------------------------*
//  MOVE 'Triumph' TO MANUFACTURER (2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).setManufacturer(CONSTANTS.LITERAL_Triumph_B13_);
//  MOVE 'England' TO COUNTRY (2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).setCountry(CONSTANTS.LITERAL_England_B8_);
//  MOVE +4 TO LEVEL-1-NUM-IN (2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).setLevel1NumIn(BigDecimal.valueOf(4));
//  MOVE +3 TO MODELCOUNTER (2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).setModelcounter((short)3);
//  MOVE 'Thruxton' TO MODELNAME (2, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(0).setModelname(CONSTANTS.LITERAL_Thruxton_B12_);
//  MOVE +880 TO ENGINESIZECC (2, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(0).setEnginesizecc((short)880);
//  MOVE +41 TO LEVEL-2-NUM-IN (2, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(0).setLevel2NumIn(BigDecimal.valueOf(41));
//  MOVE +4 TO COLORCOUNTER (2, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(0).setColorcounter((short)4);
//  MOVE 'Red' TO COLOR (2, 1, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(0).getAvailablecolors().setColor(0,CONSTANTS.LITERAL_Red_B7_);
//  MOVE 'Black' TO COLOR (2, 1, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(0).getAvailablecolors().setColor(1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'Blue' TO COLOR (2, 1, 1, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(0).getAvailablecolors().setColor(2,CONSTANTS.LITERAL_Blue_B6_);
//  MOVE 'White' TO COLOR (2, 1, 1, 4)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(0).getAvailablecolors().setColor(3,CONSTANTS.LITERAL_White_B5_);
//  MOVE 'Fly Screen' TO ACCESSORY (2, 1, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(0).setAccessory(0,CONSTANTS.LITERAL_Fly_B21_Screen);
//  MOVE 'Arrow Exhaust' TO ACCESSORY (2, 1, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(0).setAccessory(1,CONSTANTS.LITERAL_Arrow_B18_Exhaust);
      
      }
      /**
      * fillInputDataSplit2 
      *   This method is derived from 
  *   COBOL Paragraph - 0100-FILL-INPUT-DATA-SPLIT2 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - modelname                      COBOL Name: MODELNAME
      * - enginesizecc                   COBOL Name: ENGINESIZECC
      * - level2NumIn                    COBOL Name: LEVEL-2-NUM-IN
      * - colorcounter                   COBOL Name: COLORCOUNTER
      * - color                          COBOL Name: COLOR
      * - accessory                      COBOL Name: ACCESSORY
      * - manufacturer                   COBOL Name: MANUFACTURER
      * - country                        COBOL Name: COUNTRY
      * - level1NumIn                    COBOL Name: LEVEL-1-NUM-IN
      * - modelcounter                   COBOL Name: MODELCOUNTER
      *
      * @throws CFException
      */
      private void fillInputDataSplit2() throws Exception {
//  MOVE 'Bonneville' TO MODELNAME (2, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(1).setModelname(CONSTANTS.LITERAL_Bonneville_B10_);
//  MOVE +880 TO ENGINESIZECC (2, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(1).setEnginesizecc((short)880);
//  MOVE +42 TO LEVEL-2-NUM-IN (2, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(1).setLevel2NumIn(BigDecimal.valueOf(42));
//  MOVE +3 TO COLORCOUNTER (2, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(1).setColorcounter((short)3);
//  MOVE 'Blue' TO COLOR (2, 1, 2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(1).getAvailablecolors().setColor(0,CONSTANTS.LITERAL_Blue_B6_);
//  MOVE 'Black' TO COLOR (2, 1, 2, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(1).getAvailablecolors().setColor(1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'White' TO COLOR (2, 1, 2, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(1).getAvailablecolors().setColor(2,CONSTANTS.LITERAL_White_B5_);
//  MOVE 'Nolan Helmets' TO ACCESSORY (2, 1, 2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(1).setAccessory(0,CONSTANTS.LITERAL_Nolan_B18_Helmets);
//  MOVE 'Denim Jackets' TO ACCESSORY (2, 1, 2, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(1).setAccessory(1,CONSTANTS.LITERAL_Denim_B18_Jackets);
//  MOVE 'Tow Chain' TO ACCESSORY (2, 1, 2, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(1).setAccessory(2,CONSTANTS.LITERAL_Tow_B22_Chain);
//  MOVE 'Speed Triple' TO MODELNAME (2, 1, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(2).setModelname(CONSTANTS.LITERAL_Speed_B9_Triple);
//  MOVE +1200 TO ENGINESIZECC (2, 1, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(2).setEnginesizecc((short)1200);
//  MOVE +43 TO LEVEL-2-NUM-IN (2, 1, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(2).setLevel2NumIn(BigDecimal.valueOf(43));
//  MOVE +3 TO COLORCOUNTER (2, 1, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(2).setColorcounter((short)3);
//  MOVE 'Blue' TO COLOR (2, 1, 3, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(2).getAvailablecolors().setColor(0,CONSTANTS.LITERAL_Blue_B6_);
//  MOVE 'Black' TO COLOR (2, 1, 3, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(2).getAvailablecolors().setColor(1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'White' TO COLOR (2, 1, 3, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(0).getModelsin(2).getAvailablecolors().setColor(2,CONSTANTS.LITERAL_White_B5_);
//  MOVE 'Norton' TO MANUFACTURER (2, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(1).setManufacturer(CONSTANTS.LITERAL_Norton_B14_);
//  MOVE 'England' TO COUNTRY (2, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(1).setCountry(CONSTANTS.LITERAL_England_B8_);
//  MOVE +5 TO LEVEL-1-NUM-IN (2, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(1).setLevel1NumIn(BigDecimal.valueOf(5));
//  MOVE +1 TO MODELCOUNTER (2, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(1).setModelcounter((short)1);
//  MOVE 'Comando' TO MODELNAME (2, 2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(1).getModelsin(0).setModelname(CONSTANTS.LITERAL_Comando_B13_);
//  MOVE +900 TO ENGINESIZECC (2, 2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(1).getModelsin(0).setEnginesizecc((short)900);
//  MOVE +51 TO LEVEL-2-NUM-IN (2, 2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(1).getModelsin(0).setLevel2NumIn(BigDecimal.valueOf(51));
//  MOVE +2 TO COLORCOUNTER (2, 2, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(1).getModelsin(0).setColorcounter((short)2);
//  MOVE 'Red' TO COLOR (2, 2, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(1).getModelsin(0).getAvailablecolors().setColor(0,CONSTANTS.LITERAL_Red_B7_);
//  MOVE 'Black' TO COLOR (2, 2, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(1).getModelsin(0).getAvailablecolors().setColor(1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'Ti Footpegs       ' TO ACCESSORY (2, 2, 1, 1)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(1).getModelsin(0).setAccessory(0,CONSTANTS.LITERAL_Ti_B20_Footpegs);
//  MOVE 'Staintune Exhaust ' TO ACCESSORY (2, 2, 1, 2)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(1).getModelsin(0).setAccessory(1,CONSTANTS.LITERAL_Staintune_B14_Exhaust);
//  MOVE 'Dual Seat and Pegs' TO ACCESSORY (2, 2, 1, 3)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(1).getModelsin(0).setAccessory(2,CONSTANTS.LITERAL_Dual_B15_SeatandPegs);
//  MOVE 'Replace This' TO ACCESSORY (2, 2, 1, 4)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(1).getModelsin(0).setAccessory(3,CONSTANTS.LITERAL_Replace_B19_This);
//  MOVE 'And This' TO ACCESSORY (2, 2, 1, 5)
          xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(1).getManufacturers(1).getModelsin(0).setAccessory(4,CONSTANTS.LITERAL_And_B23_This);
          ;
      
      }
      /**
      * displayResults 
      *   This method is derived from 
  *   COBOL Paragraph - 0300-DISPLAY-RESULTS COBOL Cyclomatic complexity - 5
      * Input  :  

      * - s1                             COBOL Name: S1
      * - dealername                     COBOL Name: DEALERNAME
      *
      * Output :  

      * - s1                             COBOL Name: S1
      *
      * @throws CFException
      */
      private void displayResults() throws Exception {
			// Declare local variables used in the method
			Inventoryrequested inventoryrequested = xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested();
			// End of variable declaration

      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
//  PERFORM 0310-DISPLAY-DEALERS THRU 0310-EXIT VARYING S1 FROM +1 BY +1 UNTIL S1 > +3 OR DEALERNAME (S1) = SPACES OR LOW-VALUES
          for (work.setS1(1); 	( work.getS1() <= 3 )  &&         ( !allSpaces(inventoryrequested.getDealers(work.getS1() - 1).getDealername())  ) && !( checkLowValue(inventoryrequested.getDealers(work.getS1() - 1).getDealername()) )  ; work.setS1(work.getS1() + 1) ) {
          	displayDealers();/*0310-DISPLAY-DEALERS*/
          }
  
          ;
      
      }
      /**
      * displayDealers 
      *   This method is derived from 
  *   COBOL Paragraph - 0310-DISPLAY-DEALERS COBOL Cyclomatic complexity - 8
      * Input  :  

      * - dealername                     COBOL Name: DEALERNAME
      * - s2                             COBOL Name: S2
      * - state                          COBOL Name: STATE
      * - s1                             COBOL Name: S1
      * - streetaddress                  COBOL Name: STREETADDRESS
      * - makecounter                    COBOL Name: MAKECOUNTER
      *
      * Output :  

      * - s2                             COBOL Name: S2
      *
      * @throws CFException
      */
      private void displayDealers() throws Exception {
			// Declare local variables used in the method
			Inventoryrequested inventoryrequested = xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested();
			// End of variable declaration

      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
//  DISPLAY 'Dealer..........: ' DEALERNAME (S1)
          logger.info("Dealer..........: {}", new String(xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(work.getS1() - 1).getDealername())); 
//  PERFORM VARYING S2 FROM +1 BY +1 UNTIL S2 > +3 OR STATE (S1, S2) = SPACES OR LOW-VALUES
          for (work.setS2(1); (	( work.getS2() <= 3 )  &&         ( !allSpaces(inventoryrequested.getDealers(work.getS1() - 1).getLocations(work.getS2() - 1).getState())  ) && !( checkLowValue(inventoryrequested.getDealers(work.getS1() - 1).getLocations(work.getS2() - 1).getState()) ) ) ; work.setS2(work.getS2() + 1) ) {
//  DISPLAY 'State...........: ' STATE (S1, S2)
              logger.info("State...........: {}", new String(xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(work.getS1() - 1).getLocations(work.getS2() - 1).getState())); 
//  DISPLAY 'Street Address..: ' STREETADDRESS (S1, S2)
              logger.info("Street Address..: {}", new String(xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(work.getS1() - 1).getLocations(work.getS2() - 1).getStreetaddress())); 
          }
  
//  PERFORM 0320-DISPLAY-MANUFACTURERS THRU 0320-EXIT VARYING S2 FROM +1 BY +1 UNTIL S2 > +4 OR S2 > MAKECOUNTER (S1)
          for (work.setS2(1); 	( work.getS2() <= 4 )  && 	( work.getS2() <= inventoryrequested.getDealers(work.getS1() - 1).getMakecounter() ) ; work.setS2(work.getS2() + 1) ) {
          	displayManufacturers();/*0320-DISPLAY-MANUFACTURERS*/
          }
  
          ;
      
      }
      /**
      * displayManufacturers 
      *   This method is derived from 
  *   COBOL Paragraph - 0320-DISPLAY-MANUFACTURERS COBOL Cyclomatic complexity - 5
      * Input  :  

      * - level1NumIn                    COBOL Name: LEVEL-1-NUM-IN
      * - manufacturer                   COBOL Name: MANUFACTURER
      * - country                        COBOL Name: COUNTRY
      * - modelcounter                   COBOL Name: MODELCOUNTER
      * - s3                             COBOL Name: S3
      * - modelname                      COBOL Name: MODELNAME
      * - s1                             COBOL Name: S1
      * - s2                             COBOL Name: S2
      *
      * Output :  

      * - edit                           COBOL Name: WS-EDIT
      * - level1NumIn                    COBOL Name: LEVEL-1-NUM-IN
      * - modelcounter                   COBOL Name: MODELCOUNTER
      * - s3                             COBOL Name: S3
      *
      * @throws CFException
      */
      private void displayManufacturers() throws Exception {
			// Declare local variables used in the method
			Inventoryrequested inventoryrequested = xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested();
			// End of variable declaration

      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
//  MOVE LEVEL-1-NUM-IN (S1, S2) TO WS-EDIT
//  FORMAT_1522103253 = "ZZZZ9"
          work.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1522103253,xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(work.getS1() - 1).getManufacturers(work.getS2() - 1).getLevel1NumIn().toPlainString().toCharArray()));
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY '----------------------------------------------'
          logger.info("----------------------------------------------"); 
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY 'Manufacturer....: ' MANUFACTURER (S1, S2)
          logger.info("Manufacturer....: {}", new String(xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(work.getS1() - 1).getManufacturers(work.getS2() - 1).getManufacturer())); 
//  DISPLAY 'Country.........: ' COUNTRY (S1, S2)
          logger.info("Country.........: {}", new String(xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(work.getS1() - 1).getManufacturers(work.getS2() - 1).getCountry())); 
//  DISPLAY 'Level 1 Num.....: ' WS-EDIT
          logger.info("Level 1 Num.....: {}", new String(work.getEdit())); 
//  MOVE MODELCOUNTER (S1, S2) TO WS-EDIT
//  FORMAT_1522103253 = "ZZZZ9"
          work.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1522103253,String.valueOf(xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(work.getS1() - 1).getManufacturers(work.getS2() - 1).getModelcounter()).toCharArray()));
//  DISPLAY 'Model Counter...: ' WS-EDIT
          logger.info("Model Counter...: {}", new String(work.getEdit())); 
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY 'Models ---------------------------------------'
          logger.info("Models ---------------------------------------"); 
//  PERFORM 0330-DISPLAY-MODELS THRU 0330-EXIT VARYING S3 FROM +1 BY +1 UNTIL S3 > +5 OR MODELNAME (S1, S2, S3) = SPACES OR LOW-VALUES
          for (work.setS3(1); 	( work.getS3() <= 5 )  &&         ( !allSpaces(inventoryrequested.getDealers(work.getS1() - 1).getManufacturers(work.getS2() - 1).getModelsin(work.getS3() - 1).getModelname())  ) && !( checkLowValue(inventoryrequested.getDealers(work.getS1() - 1).getManufacturers(work.getS2() - 1).getModelsin(work.getS3() - 1).getModelname()) )  ; work.setS3(work.getS3() + 1) ) {
          	displayModels();/*0330-DISPLAY-MODELS*/
          }
  
          ;
      
      }
      /**
      * displayModels 
      *   This method is derived from 
  *   COBOL Paragraph - 0330-DISPLAY-MODELS COBOL Cyclomatic complexity - 9
      * Input  :  

      * - level2NumIn                    COBOL Name: LEVEL-2-NUM-IN
      * - modelname                      COBOL Name: MODELNAME
      * - enginesizecc                   COBOL Name: ENGINESIZECC
      * - colorcounter                   COBOL Name: COLORCOUNTER
      * - s4                             COBOL Name: S4
      * - color                          COBOL Name: COLOR
      * - s1                             COBOL Name: S1
      * - s2                             COBOL Name: S2
      * - s3                             COBOL Name: S3
      * - accessory                      COBOL Name: ACCESSORY
      *
      * Output :  

      * - edit                           COBOL Name: WS-EDIT
      * - level2NumIn                    COBOL Name: LEVEL-2-NUM-IN
      * - colorcounter                   COBOL Name: COLORCOUNTER
      * - s4                             COBOL Name: S4
      *
      * @throws CFException
      */
      private void displayModels() throws Exception {
			// Declare local variables used in the method
			Inventoryrequested inventoryrequested = xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested();
			// End of variable declaration

      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
//  MOVE LEVEL-2-NUM-IN (S1, S2, S3) TO WS-EDIT
//  FORMAT_1522103253 = "ZZZZ9"
          work.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1522103253,xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(work.getS1() - 1).getManufacturers(work.getS2() - 1).getModelsin(work.getS3() - 1).getLevel2NumIn().toPlainString().toCharArray()));
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY 'Model...........: ' MODELNAME (S1, S2, S3)
          logger.info("Model...........: {}", new String(xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(work.getS1() - 1).getManufacturers(work.getS2() - 1).getModelsin(work.getS3() - 1).getModelname())); 
//  DISPLAY 'Engine Size.....: ' ENGINESIZECC (S1, S2, S3)
          logger.info("Engine Size.....: {}", String.valueOf(xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(work.getS1() - 1).getManufacturers(work.getS2() - 1).getModelsin(work.getS3() - 1).getEnginesizecc())); 
//  DISPLAY 'Level 2 Num.....: ' WS-EDIT
          logger.info("Level 2 Num.....: {}", new String(work.getEdit())); 
//  MOVE COLORCOUNTER (S1, S2, S3) TO WS-EDIT
//  FORMAT_1522103253 = "ZZZZ9"
          work.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1522103253,String.valueOf(xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(work.getS1() - 1).getManufacturers(work.getS2() - 1).getModelsin(work.getS3() - 1).getColorcounter()).toCharArray()));
//  DISPLAY 'Color Counter...: ' WS-EDIT
          logger.info("Color Counter...: {}", new String(work.getEdit())); 
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY 'Colors ---------------------------------------'
          logger.info("Colors ---------------------------------------"); 
//  PERFORM 0340-DISPLAY-COLORS THRU 0340-EXIT VARYING S4 FROM +1 BY +1 UNTIL S4 > +5 OR COLOR (S1, S2, S3, S4) = SPACES OR LOW-VALUES
          for (work.setS4(1); 	( work.getS4() <= 5 )  &&         ( !allSpaces(inventoryrequested.getDealers(work.getS1() - 1).getManufacturers(work.getS2() - 1).getModelsin(work.getS3() - 1).getAvailablecolors().getColor(work.getS4() - 1))  ) && !( checkLowValue(inventoryrequested.getDealers(work.getS1() - 1).getManufacturers(work.getS2() - 1).getModelsin(work.getS3() - 1).getAvailablecolors().getColor(work.getS4() - 1)) )  ; work.setS4(work.getS4() + 1) ) {
          	displayColors();/*0340-DISPLAY-COLORS*/
          }
  
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY 'Accessories ----------------------------------'
          logger.info("Accessories ----------------------------------"); 
//  PERFORM 0350-DISPLAY-ACCESSORIES THRU 0350-EXIT VARYING S4 FROM +1 BY +1 UNTIL S4 > +5 OR ACCESSORY (S1, S2, S3, S4) = SPACES OR LOW-VALUES
          for (work.setS4(1); 	( work.getS4() <= 5 )  &&         ( !allSpaces(inventoryrequested.getDealers(work.getS1() - 1).getManufacturers(work.getS2() - 1).getModelsin(work.getS3() - 1).getAccessory(work.getS4() - 1))  ) && !( checkLowValue(inventoryrequested.getDealers(work.getS1() - 1).getManufacturers(work.getS2() - 1).getModelsin(work.getS3() - 1).getAccessory(work.getS4() - 1)) )  ; work.setS4(work.getS4() + 1) ) {
          	displayAccessories();/*0350-DISPLAY-ACCESSORIES*/
          }
  
          ;
      
      }
      /**
      * displayColors 
      *   This method is derived from 
  *   COBOL Paragraph - 0340-DISPLAY-COLORS COBOL Cyclomatic complexity - 1
      * Input  :  

      * - color                          COBOL Name: COLOR
      *
      * Output : None 

      * @throws CFException
      */
      private void displayColors() throws Exception {
      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
//  DISPLAY 'Color...........: ' COLOR (S1, S2, S3, S4)
          logger.info("Color...........: {}", new String(xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(work.getS1() - 1).getManufacturers(work.getS2() - 1).getModelsin(work.getS3() - 1).getAvailablecolors().getColor(work.getS4() - 1))); 
          ;
      
      }
      /**
      * displayAccessories 
      *   This method is derived from 
  *   COBOL Paragraph - 0350-DISPLAY-ACCESSORIES COBOL Cyclomatic complexity - 1
      * Input  :  

      * - accessory                      COBOL Name: ACCESSORY
      *
      * Output : None 

      * @throws CFException
      */
      private void displayAccessories() throws Exception {
      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
//  DISPLAY 'Accessory.......: ' ACCESSORY (S1, S2, S3, S4)
          logger.info("Accessory.......: {}", new String(xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(work.getS1() - 1).getManufacturers(work.getS2() - 1).getModelsin(work.getS3() - 1).getAccessory(work.getS4() - 1))); 
          ;
      
      }
      /**
      * goback 
      *   This method is derived from 
  *   COBOL Paragraph - 9999-GOBACK COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void goback() throws Exception {
      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
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
