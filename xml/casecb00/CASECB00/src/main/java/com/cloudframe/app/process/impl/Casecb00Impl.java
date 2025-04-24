  package com.cloudframe.app.process.impl;
  /* 
*date-written. feb 26 2010.
*date-compiled.
*remarks.
*---------------------------------------------------------------*
* a batch outbound test for testing xmlpc103s handling of *
* simple arrays. *
*---------------------------------------------------------------*
*/
  
  import com.cloudframe.app.casecb00.Casecb00Ctx.*;
  import com.cloudframe.app.casecb00.Casecb00Ctx;
  import com.cloudframe.app.process.Casecb00;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import java.math.BigDecimal;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.casecb00.dto.*;
  import com.cloudframe.app.casecb00.dto.Xmlpc103Linkage;
  import com.cloudframe.app.casecb00.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("casecb00")
  
  public class Casecb00Impl extends CommonProcess implements Casecb00 {
  
  Logger logger = LoggerFactory.getLogger(Casecb00Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Casecb00Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM 0000-MAIN-PARAGRAPH
          mainParagraph(programCtx);/*0000-MAIN-PARAGRAPH*/
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
      * mainParagraph 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-PARAGRAPH COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainParagraph(Casecb00Ctx programCtx) throws Exception {
//  PERFORM 0010-INITIALIZE THRU 0010-EXIT
          initialize(programCtx);/*0010-INITIALIZE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 0100-FILL-INPUT-DATA THRU 0100-EXIT
          fillInputData(programCtx);/*0100-FILL-INPUT-DATA*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 0300-DISPLAY-RESULTS THRU 0300-EXIT
          displayResults(programCtx.getDisplayResultsInCtx());/*0300-DISPLAY-RESULTS*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//cobolCode::GO TO 9999-GOBACK
goback(programCtx);
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
      @Override
      public InitializeOutCtx initialize(Casecb00Ctx programCtx) throws Exception {
      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
InitializeOutCtx methodOut = programCtx.getInitializeOutCtx();
//  INITIALIZE INVENTORYREQUESTED
          methodOut.getInventoryrequested().initialize();
          ;
      
      return methodOut;
      }
      /**
      * fillInputData 
      *   This method is derived from 
  *   COBOL Paragraph - 0100-FILL-INPUT-DATA COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void fillInputData(Casecb00Ctx programCtx) throws Exception {
      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
//  PERFORM 0100-FILL-INPUT-DATA-SPLIT0
          fillInputDataSplit0(programCtx);/*0100-FILL-INPUT-DATA-SPLIT0*/
//  PERFORM 0100-FILL-INPUT-DATA-SPLIT1
          fillInputDataSplit1(programCtx);/*0100-FILL-INPUT-DATA-SPLIT1*/
//  PERFORM 0100-FILL-INPUT-DATA-SPLIT2
          fillInputDataSplit2(programCtx);/*0100-FILL-INPUT-DATA-SPLIT2*/
      
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
      @Override
      public FillInputDataSplit0OutCtx fillInputDataSplit0(Casecb00Ctx programCtx) throws Exception {
FillInputDataSplit0OutCtx methodOut = programCtx.getFillInputDataSplit0OutCtx();
//  MOVE '2010-03-01' TO REQUESTDATE
//  LITERAL_2010_MN2_0301 = '2010-03-01'
          methodOut.setRequestdate(CONSTANTS.LITERAL_2010_MN2_0301);
//  MOVE '12:00:01' TO REQUESTTIME
//  LITERAL_12_CL2_0001 = '12:00:01'
          methodOut.setRequesttime(CONSTANTS.LITERAL_12_CL2_0001);
//  MOVE 'Mike Piazza  ' TO DEALERNAME (1)
          methodOut.setDealername(0,CONSTANTS.LITERAL_Mike_B20_Piazza);
//  MOVE 'NY' TO STATE (1, 1)
//  LITERAL_NY = 'NY'
          methodOut.setState(0,0,CONSTANTS.LITERAL_NY);
//  MOVE '5 Center St.' TO STREETADDRESS (1, 1)
          methodOut.setStreetaddress(0,0,CONSTANTS.LITERAL_1376140749);
//  MOVE 'PA' TO STATE (1, 2)
//  LITERAL_PA = 'PA'
          methodOut.setState(0,1,CONSTANTS.LITERAL_PA);
//  MOVE '106 Cherry Blossom La.' TO STREETADDRESS (1, 2)
          methodOut.setStreetaddress(0,1,CONSTANTS.LITERAL_2027934206);
//  MOVE 'NJ' TO STATE (1, 3)
//  LITERAL_NJ = 'NJ'
          methodOut.setState(0,2,CONSTANTS.LITERAL_NJ);
//  MOVE '17 Hancock Dr.' TO STREETADDRESS (1, 3)
          methodOut.setStreetaddress(0,2,CONSTANTS.LITERAL_110162895);
//  MOVE 'Hamilton Bikes   ' TO DEALERNAME (2)
          methodOut.setDealername(1,CONSTANTS.LITERAL_Hamilton_B17_Bikes);
//  MOVE 'NJ' TO STATE (2, 1)
//  LITERAL_NJ = 'NJ'
          methodOut.setState(1,0,CONSTANTS.LITERAL_NJ);
//  MOVE '21 Kincaid St.' TO STREETADDRESS (2, 1)
          methodOut.setStreetaddress(1,0,CONSTANTS.LITERAL_478374635);
//  MOVE +3 TO MAKECOUNTER (1)
          methodOut.setMakecounter(0,(short)3);
//  MOVE +2 TO MODELCOUNTER (1, 1)
          methodOut.setModelcounter(0,0,(short)2);
//  MOVE 'Moto Guzzi' TO MANUFACTURER (1, 1)
          methodOut.setManufacturer(0,0,CONSTANTS.LITERAL_Moto_B11_Guzzi);
//  MOVE 'Italy' TO COUNTRY (1, 1)
          methodOut.setCountry(0,0,CONSTANTS.LITERAL_Italy_B10_);
//  MOVE +1 TO LEVEL-1-NUM-IN (1, 1)
          methodOut.setLevel1NumIn(0,0,BigDecimal.ONE);
//  MOVE 'Coppa Italia' TO MODELNAME (1, 1, 1)
          methodOut.setModelname(0,0,0,CONSTANTS.LITERAL_Coppa_B9_Italia);
//  MOVE +1100 TO ENGINESIZECC (1, 1, 1)
          methodOut.setEnginesizecc(0,0,0,(short)1100);
//  MOVE +11 TO LEVEL-2-NUM-IN (1, 1, 1)
          methodOut.setLevel2NumIn(0,0,0,BigDecimal.valueOf(11));
//  MOVE +3 TO COLORCOUNTER (1, 1, 1)
          methodOut.setColorcounter(0,0,0,(short)3);
//  MOVE 'Red' TO COLOR (1, 1, 1, 1)
          methodOut.setColor(0,0,0,0,CONSTANTS.LITERAL_Red_B7_);
//  MOVE 'Green' TO COLOR (1, 1, 1, 2)
          methodOut.setColor(0,0,0,1,CONSTANTS.LITERAL_Green_B5_);
//  MOVE 'White' TO COLOR (1, 1, 1, 3)
          methodOut.setColor(0,0,0,2,CONSTANTS.LITERAL_White_B5_);
//  MOVE 'Leather Jackets' TO ACCESSORY (1, 1, 1, 1)
          methodOut.setAccessory(0,0,0,0,CONSTANTS.LITERAL_Leather_B16_Jackets);
//  MOVE 'Titanium Exhaust' TO ACCESSORY (1, 1, 1, 2)
          methodOut.setAccessory(0,0,0,1,CONSTANTS.LITERAL_Titanium_B15_Exhaust);
//  MOVE 'Auto Oil Filters' TO ACCESSORY (1, 1, 1, 3)
          methodOut.setAccessory(0,0,0,2,CONSTANTS.LITERAL_Auto_B16_OilFilters);
//  MOVE 'Filter Retainer' TO ACCESSORY (1, 1, 1, 4)
          methodOut.setAccessory(0,0,0,3,CONSTANTS.LITERAL_Filter_B16_Retainer);
//  MOVE 'Griso' TO MODELNAME (1, 1, 2)
          methodOut.setModelname(0,0,1,CONSTANTS.LITERAL_Griso_B15_);
//  MOVE +1100 TO ENGINESIZECC (1, 1, 2)
          methodOut.setEnginesizecc(0,0,1,(short)1100);
//  MOVE +12 TO LEVEL-2-NUM-IN (1, 1, 2)
          methodOut.setLevel2NumIn(0,0,1,BigDecimal.valueOf(12));
//  MOVE +3 TO COLORCOUNTER (1, 1, 2)
          methodOut.setColorcounter(0,0,1,(short)3);
//  MOVE 'Black' TO COLOR (1, 1, 2, 1)
          methodOut.setColor(0,0,1,0,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'Yellow' TO COLOR (1, 1, 2, 2)
          methodOut.setColor(0,0,1,1,CONSTANTS.LITERAL_Yellow_B4_);
//  MOVE 'Red' TO COLOR (1, 1, 2, 3)
          methodOut.setColor(0,0,1,2,CONSTANTS.LITERAL_Red_B7_);
//  MOVE 'Britsh Gr.' TO COLOR (1, 1, 2, 4)
//  LITERAL_1977233523 = 'Britsh Gr.'
          methodOut.setColor(0,0,1,3,CONSTANTS.LITERAL_1977233523);
//  MOVE 'Leather Seat' TO ACCESSORY (1, 1, 2, 1)
          methodOut.setAccessory(0,0,1,0,CONSTANTS.LITERAL_Leather_B19_Seat);
//  MOVE 'Engine Guards' TO ACCESSORY (1, 1, 2, 2)
          methodOut.setAccessory(0,0,1,1,CONSTANTS.LITERAL_Engine_B18_Guards);

// *    -----------------------------------------------------*
//  MOVE +3 TO MODELCOUNTER (1, 2)
          methodOut.setModelcounter(0,1,(short)3);
//  MOVE 'Ducati' TO MANUFACTURER (1, 2)
          methodOut.setManufacturer(0,1,CONSTANTS.LITERAL_Ducati_B14_);
//  MOVE 'Italy' TO COUNTRY (1, 2)
          methodOut.setCountry(0,1,CONSTANTS.LITERAL_Italy_B10_);
//  MOVE +2 TO LEVEL-1-NUM-IN (1, 2)
          methodOut.setLevel1NumIn(0,1,BigDecimal.valueOf(2));
//  MOVE +2 TO MODELCOUNTER (1, 2)
          methodOut.setModelcounter(0,1,(short)2);
//  MOVE '1198 RR' TO MODELNAME (1, 2, 1)
          methodOut.setModelname(0,1,0,CONSTANTS.LITERAL_1198_B14_RR);
//  MOVE +1200 TO ENGINESIZECC (1, 2, 1)
          methodOut.setEnginesizecc(0,1,0,(short)1200);
//  MOVE +21 TO LEVEL-2-NUM-IN (1, 2, 1)
          methodOut.setLevel2NumIn(0,1,0,BigDecimal.valueOf(21));
//  MOVE +3 TO COLORCOUNTER (1, 2, 1)
          methodOut.setColorcounter(0,1,0,(short)3);
//  MOVE 'Red' TO COLOR (1, 2, 1, 1)
          methodOut.setColor(0,1,0,0,CONSTANTS.LITERAL_Red_B7_);
//  MOVE 'Black' TO COLOR (1, 2, 1, 2)
          methodOut.setColor(0,1,0,1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'White' TO COLOR (1, 2, 1, 3)
          methodOut.setColor(0,1,0,2,CONSTANTS.LITERAL_White_B5_);
//  MOVE 'Yellow' TO COLOR (1, 2, 1, 4)
          methodOut.setColor(0,1,0,3,CONSTANTS.LITERAL_Yellow_B4_);
      
      return methodOut;
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
      @Override
      public FillInputDataSplit1OutCtx fillInputDataSplit1(Casecb00Ctx programCtx) throws Exception {
FillInputDataSplit1OutCtx methodOut = programCtx.getFillInputDataSplit1OutCtx();
//  MOVE 'Tail Eliminator' TO ACCESSORY (1, 2, 1, 1)
          methodOut.setAccessory(0,1,0,0,CONSTANTS.LITERAL_Tail_B16_Eliminator);
//  MOVE 'Carbon Fiber Wheels' TO ACCESSORY (1, 2, 1, 2)
          methodOut.setAccessory(0,1,0,1,CONSTANTS.LITERAL_Carbon_B13_FiberWheels);
//  MOVE 'Failure' TO ACCESSORY (1, 2, 1, 3)
          methodOut.setAccessory(0,1,0,2,CONSTANTS.LITERAL_Failure_B23_);
//  MOVE 'Multi Strada' TO MODELNAME (1, 2, 2)
          methodOut.setModelname(0,1,1,CONSTANTS.LITERAL_Multi_B9_Strada);
//  MOVE +1100 TO ENGINESIZECC (1, 2, 2)
          methodOut.setEnginesizecc(0,1,1,(short)1100);
//  MOVE +22 TO LEVEL-2-NUM-IN (1, 2, 2)
          methodOut.setLevel2NumIn(0,1,1,BigDecimal.valueOf(22));
//  MOVE +2 TO COLORCOUNTER (1, 2, 2)
          methodOut.setColorcounter(0,1,1,(short)2);
//  MOVE 'Red' TO COLOR (1, 2, 2, 1)
          methodOut.setColor(0,1,1,0,CONSTANTS.LITERAL_Red_B7_);
//  MOVE 'Black' TO COLOR (1, 2, 2, 2)
          methodOut.setColor(0,1,1,1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'Fail' TO ACCESSORY (1, 2, 2, 1)
          methodOut.setAccessory(0,1,1,0,CONSTANTS.LITERAL_Fail_B26_);
//  MOVE 'HyperMotard' TO MODELNAME (1, 2, 3)
          methodOut.setModelname(0,1,2,CONSTANTS.LITERAL_HyperMotard_B9_);
//  MOVE +1100 TO ENGINESIZECC (1, 2, 3)
          methodOut.setEnginesizecc(0,1,2,(short)1100);
//  MOVE +23 TO LEVEL-2-NUM-IN (1, 2, 3)
          methodOut.setLevel2NumIn(0,1,2,BigDecimal.valueOf(23));
//  MOVE +2 TO COLORCOUNTER (1, 2, 3)
          methodOut.setColorcounter(0,1,2,(short)2);
//  MOVE 'Red' TO COLOR (1, 2, 3, 1)
          methodOut.setColor(0,1,2,0,CONSTANTS.LITERAL_Red_B7_);
//  MOVE 'Black' TO COLOR (1, 2, 3, 2)
          methodOut.setColor(0,1,2,1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'Grip Guards' TO ACCESSORY (1, 2, 3, 1)
          methodOut.setAccessory(0,1,2,0,CONSTANTS.LITERAL_Grip_B20_Guards);

// *    -----------------------------------------------------*
//  MOVE +2 TO MODELCOUNTER (1, 3)
          methodOut.setModelcounter(0,2,(short)2);
//  MOVE 'Kawasaki' TO MANUFACTURER (1, 3)
          methodOut.setManufacturer(0,2,CONSTANTS.LITERAL_Kawasaki_B12_);
//  MOVE 'Japan' TO COUNTRY (1, 3)
          methodOut.setCountry(0,2,CONSTANTS.LITERAL_Japan_B10_);
//  MOVE +3 TO LEVEL-1-NUM-IN (1, 3)
          methodOut.setLevel1NumIn(0,2,BigDecimal.valueOf(3));
//  MOVE +2 TO MODELCOUNTER (1, 3)
          methodOut.setModelcounter(0,2,(short)2);
//  MOVE 'ZX10R' TO MODELNAME (1, 3, 1)
          methodOut.setModelname(0,2,0,CONSTANTS.LITERAL_ZX10R_B15_);
//  MOVE +998 TO ENGINESIZECC (1, 3, 1)
          methodOut.setEnginesizecc(0,2,0,(short)998);
//  MOVE +31 TO LEVEL-2-NUM-IN (1, 3, 1)
          methodOut.setLevel2NumIn(0,2,0,BigDecimal.valueOf(31));
//  MOVE +2 TO COLORCOUNTER (1, 3, 1)
          methodOut.setColorcounter(0,2,0,(short)2);
//  MOVE 'Green' TO COLOR (1, 3, 1, 1)
          methodOut.setColor(0,2,0,0,CONSTANTS.LITERAL_Green_B5_);
//  MOVE 'Black' TO COLOR (1, 3, 1, 2)
          methodOut.setColor(0,2,0,1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'Green Helmet' TO ACCESSORY (1, 3, 1, 1)
          methodOut.setAccessory(0,2,0,0,CONSTANTS.LITERAL_Green_B19_Helmet);
//  MOVE 'ZX6R' TO MODELNAME (1, 3, 2)
          methodOut.setModelname(0,2,1,CONSTANTS.LITERAL_ZX6R_B16_);
//  MOVE +600 TO ENGINESIZECC (1, 3, 2)
          methodOut.setEnginesizecc(0,2,1,(short)600);
//  MOVE +32 TO LEVEL-2-NUM-IN (1, 3, 2)
          methodOut.setLevel2NumIn(0,2,1,BigDecimal.valueOf(32));
//  MOVE +2 TO COLORCOUNTER (1, 3, 2)
          methodOut.setColorcounter(0,2,1,(short)2);
//  MOVE 'Green' TO COLOR (1, 3, 2, 1)
          methodOut.setColor(0,2,1,0,CONSTANTS.LITERAL_Green_B5_);
//  MOVE 'Black' TO COLOR (1, 3, 2, 2)
          methodOut.setColor(0,2,1,1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'Green Helmet' TO ACCESSORY (1, 3, 2, 1)
          methodOut.setAccessory(0,2,1,0,CONSTANTS.LITERAL_Green_B19_Helmet);
//  MOVE 'Failed' TO ACCESSORY (1, 3, 2, 2)
          methodOut.setAccessory(0,2,1,1,CONSTANTS.LITERAL_Failed_B24_);

// *    -----------------------------------------------------*
//  MOVE 'Triumph' TO MANUFACTURER (2, 1)
          methodOut.setManufacturer(1,0,CONSTANTS.LITERAL_Triumph_B13_);
//  MOVE 'England' TO COUNTRY (2, 1)
          methodOut.setCountry(1,0,CONSTANTS.LITERAL_England_B8_);
//  MOVE +4 TO LEVEL-1-NUM-IN (2, 1)
          methodOut.setLevel1NumIn(1,0,BigDecimal.valueOf(4));
//  MOVE +3 TO MODELCOUNTER (2, 1)
          methodOut.setModelcounter(1,0,(short)3);
//  MOVE 'Thruxton' TO MODELNAME (2, 1, 1)
          methodOut.setModelname(1,0,0,CONSTANTS.LITERAL_Thruxton_B12_);
//  MOVE +880 TO ENGINESIZECC (2, 1, 1)
          methodOut.setEnginesizecc(1,0,0,(short)880);
//  MOVE +41 TO LEVEL-2-NUM-IN (2, 1, 1)
          methodOut.setLevel2NumIn(1,0,0,BigDecimal.valueOf(41));
//  MOVE +4 TO COLORCOUNTER (2, 1, 1)
          methodOut.setColorcounter(1,0,0,(short)4);
//  MOVE 'Red' TO COLOR (2, 1, 1, 1)
          methodOut.setColor(1,0,0,0,CONSTANTS.LITERAL_Red_B7_);
//  MOVE 'Black' TO COLOR (2, 1, 1, 2)
          methodOut.setColor(1,0,0,1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'Blue' TO COLOR (2, 1, 1, 3)
          methodOut.setColor(1,0,0,2,CONSTANTS.LITERAL_Blue_B6_);
//  MOVE 'White' TO COLOR (2, 1, 1, 4)
          methodOut.setColor(1,0,0,3,CONSTANTS.LITERAL_White_B5_);
//  MOVE 'Fly Screen' TO ACCESSORY (2, 1, 1, 1)
          methodOut.setAccessory(1,0,0,0,CONSTANTS.LITERAL_Fly_B21_Screen);
//  MOVE 'Arrow Exhaust' TO ACCESSORY (2, 1, 1, 2)
          methodOut.setAccessory(1,0,0,1,CONSTANTS.LITERAL_Arrow_B18_Exhaust);
      
      return methodOut;
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
      @Override
      public FillInputDataSplit2OutCtx fillInputDataSplit2(Casecb00Ctx programCtx) throws Exception {
FillInputDataSplit2OutCtx methodOut = programCtx.getFillInputDataSplit2OutCtx();
//  MOVE 'Bonneville' TO MODELNAME (2, 1, 2)
          methodOut.setModelname(1,0,1,CONSTANTS.LITERAL_Bonneville_B10_);
//  MOVE +880 TO ENGINESIZECC (2, 1, 2)
          methodOut.setEnginesizecc(1,0,1,(short)880);
//  MOVE +42 TO LEVEL-2-NUM-IN (2, 1, 2)
          methodOut.setLevel2NumIn(1,0,1,BigDecimal.valueOf(42));
//  MOVE +3 TO COLORCOUNTER (2, 1, 2)
          methodOut.setColorcounter(1,0,1,(short)3);
//  MOVE 'Blue' TO COLOR (2, 1, 2, 1)
          methodOut.setColor(1,0,1,0,CONSTANTS.LITERAL_Blue_B6_);
//  MOVE 'Black' TO COLOR (2, 1, 2, 2)
          methodOut.setColor(1,0,1,1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'White' TO COLOR (2, 1, 2, 3)
          methodOut.setColor(1,0,1,2,CONSTANTS.LITERAL_White_B5_);
//  MOVE 'Nolan Helmets' TO ACCESSORY (2, 1, 2, 1)
          methodOut.setAccessory(1,0,1,0,CONSTANTS.LITERAL_Nolan_B18_Helmets);
//  MOVE 'Denim Jackets' TO ACCESSORY (2, 1, 2, 2)
          methodOut.setAccessory(1,0,1,1,CONSTANTS.LITERAL_Denim_B18_Jackets);
//  MOVE 'Tow Chain' TO ACCESSORY (2, 1, 2, 3)
          methodOut.setAccessory(1,0,1,2,CONSTANTS.LITERAL_Tow_B22_Chain);
//  MOVE 'Speed Triple' TO MODELNAME (2, 1, 3)
          methodOut.setModelname(1,0,2,CONSTANTS.LITERAL_Speed_B9_Triple);
//  MOVE +1200 TO ENGINESIZECC (2, 1, 3)
          methodOut.setEnginesizecc(1,0,2,(short)1200);
//  MOVE +43 TO LEVEL-2-NUM-IN (2, 1, 3)
          methodOut.setLevel2NumIn(1,0,2,BigDecimal.valueOf(43));
//  MOVE +3 TO COLORCOUNTER (2, 1, 3)
          methodOut.setColorcounter(1,0,2,(short)3);
//  MOVE 'Blue' TO COLOR (2, 1, 3, 1)
          methodOut.setColor(1,0,2,0,CONSTANTS.LITERAL_Blue_B6_);
//  MOVE 'Black' TO COLOR (2, 1, 3, 2)
          methodOut.setColor(1,0,2,1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'White' TO COLOR (2, 1, 3, 3)
          methodOut.setColor(1,0,2,2,CONSTANTS.LITERAL_White_B5_);
//  MOVE 'Norton' TO MANUFACTURER (2, 2)
          methodOut.setManufacturer(1,1,CONSTANTS.LITERAL_Norton_B14_);
//  MOVE 'England' TO COUNTRY (2, 2)
          methodOut.setCountry(1,1,CONSTANTS.LITERAL_England_B8_);
//  MOVE +5 TO LEVEL-1-NUM-IN (2, 2)
          methodOut.setLevel1NumIn(1,1,BigDecimal.valueOf(5));
//  MOVE +1 TO MODELCOUNTER (2, 2)
          methodOut.setModelcounter(1,1,(short)1);
//  MOVE 'Comando' TO MODELNAME (2, 2, 1)
          methodOut.setModelname(1,1,0,CONSTANTS.LITERAL_Comando_B13_);
//  MOVE +900 TO ENGINESIZECC (2, 2, 1)
          methodOut.setEnginesizecc(1,1,0,(short)900);
//  MOVE +51 TO LEVEL-2-NUM-IN (2, 2, 1)
          methodOut.setLevel2NumIn(1,1,0,BigDecimal.valueOf(51));
//  MOVE +2 TO COLORCOUNTER (2, 2, 1)
          methodOut.setColorcounter(1,1,0,(short)2);
//  MOVE 'Red' TO COLOR (2, 2, 1, 1)
          methodOut.setColor(1,1,0,0,CONSTANTS.LITERAL_Red_B7_);
//  MOVE 'Black' TO COLOR (2, 2, 1, 2)
          methodOut.setColor(1,1,0,1,CONSTANTS.LITERAL_Black_B5_);
//  MOVE 'Ti Footpegs       ' TO ACCESSORY (2, 2, 1, 1)
          methodOut.setAccessory(1,1,0,0,CONSTANTS.LITERAL_Ti_B20_Footpegs);
//  MOVE 'Staintune Exhaust ' TO ACCESSORY (2, 2, 1, 2)
          methodOut.setAccessory(1,1,0,1,CONSTANTS.LITERAL_Staintune_B14_Exhaust);
//  MOVE 'Dual Seat and Pegs' TO ACCESSORY (2, 2, 1, 3)
          methodOut.setAccessory(1,1,0,2,CONSTANTS.LITERAL_Dual_B15_SeatandPegs);
//  MOVE 'Replace This' TO ACCESSORY (2, 2, 1, 4)
          methodOut.setAccessory(1,1,0,3,CONSTANTS.LITERAL_Replace_B19_This);
//  MOVE 'And This' TO ACCESSORY (2, 2, 1, 5)
          methodOut.setAccessory(1,1,0,4,CONSTANTS.LITERAL_And_B23_This);
          ;
      
      return methodOut;
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
      @Override
      public DisplayResultsOutCtx displayResults(DisplayResultsInCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
Casecb00Ctx programCtx = methodIn.getCasecb00Ctx();
DisplayResultsOutCtx methodOut = methodIn.getDisplayResultsOutCtx();
//  PERFORM 0310-DISPLAY-DEALERS THRU 0310-EXIT VARYING S1 FROM +1 BY +1 UNTIL S1 > +3 OR DEALERNAME (S1) = SPACES OR LOW-VALUES
          for (methodOut.setS1(1); 	( methodOut.getS1() <= 3 )  &&         ( !allSpaces(methodIn.getDealername(methodOut.getS1() - 1))  ) && !( checkLowValue(methodIn.getDealername(methodOut.getS1() - 1)) )  ; methodOut.setS1(methodOut.getS1() + 1) ) {
          	displayDealers(programCtx.getDisplayDealersInCtx());/*0310-DISPLAY-DEALERS*/
          }
          ;
      
      return methodOut;
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
      @Override
      public DisplayDealersOutCtx displayDealers(DisplayDealersInCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
Casecb00Ctx programCtx = methodIn.getCasecb00Ctx();
DisplayDealersOutCtx methodOut = methodIn.getDisplayDealersOutCtx();
//  DISPLAY 'Dealer..........: ' DEALERNAME (S1)
          logger.info("Dealer..........: {}", new String(methodIn.getDealername(methodIn.getS1() - 1))); 
//  PERFORM VARYING S2 FROM +1 BY +1 UNTIL S2 > +3 OR STATE (S1, S2) = SPACES OR LOW-VALUES
          for (methodOut.setS2(1); (	( methodOut.getS2() <= 3 )  &&         ( !allSpaces(methodIn.getState(methodIn.getS1() - 1,methodOut.getS2() - 1))  ) && !( checkLowValue(methodIn.getState(methodIn.getS1() - 1,methodOut.getS2() - 1)) ) ) ; methodOut.setS2(methodOut.getS2() + 1) ) {
//  DISPLAY 'State...........: ' STATE (S1, S2)
              logger.info("State...........: {}", new String(methodIn.getState(methodIn.getS1() - 1,methodOut.getS2() - 1))); 
//  DISPLAY 'Street Address..: ' STREETADDRESS (S1, S2)
              logger.info("Street Address..: {}", new String(methodIn.getStreetaddress(methodIn.getS1() - 1,methodOut.getS2() - 1))); 
          }
//  PERFORM 0320-DISPLAY-MANUFACTURERS THRU 0320-EXIT VARYING S2 FROM +1 BY +1 UNTIL S2 > +4 OR S2 > MAKECOUNTER (S1)
          for (methodOut.setS2(1); 	( methodOut.getS2() <= 4 )  && 	( methodOut.getS2() <= methodIn.getMakecounter(methodIn.getS1() - 1) ) ; methodOut.setS2(methodOut.getS2() + 1) ) {
          	displayManufacturers(programCtx.getDisplayManufacturersInCtx());/*0320-DISPLAY-MANUFACTURERS*/
          }
          ;
      
      return methodOut;
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
      @Override
      public DisplayManufacturersOutCtx displayManufacturers(DisplayManufacturersInCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
Casecb00Ctx programCtx = methodIn.getCasecb00Ctx();
DisplayManufacturersOutCtx methodOut = methodIn.getDisplayManufacturersOutCtx();
//  MOVE LEVEL-1-NUM-IN (S1, S2) TO WS-EDIT
//  FORMAT_1522103253 = "ZZZZ9"
          methodOut.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1522103253,methodOut.getLevel1NumIn(methodIn.getS1() - 1,methodIn.getS2() - 1).toPlainString().toCharArray()));
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY '----------------------------------------------'
          logger.info("----------------------------------------------"); 
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY 'Manufacturer....: ' MANUFACTURER (S1, S2)
          logger.info("Manufacturer....: {}", new String(methodIn.getManufacturer(methodIn.getS1() - 1,methodIn.getS2() - 1))); 
//  DISPLAY 'Country.........: ' COUNTRY (S1, S2)
          logger.info("Country.........: {}", new String(methodIn.getCountry(methodIn.getS1() - 1,methodIn.getS2() - 1))); 
//  DISPLAY 'Level 1 Num.....: ' WS-EDIT
          logger.info("Level 1 Num.....: {}", new String(methodOut.getEdit())); 
//  MOVE MODELCOUNTER (S1, S2) TO WS-EDIT
//  FORMAT_1522103253 = "ZZZZ9"
          methodOut.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1522103253,String.valueOf(methodOut.getModelcounter(methodIn.getS1() - 1,methodIn.getS2() - 1)).toCharArray()));
//  DISPLAY 'Model Counter...: ' WS-EDIT
          logger.info("Model Counter...: {}", new String(methodOut.getEdit())); 
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY 'Models ---------------------------------------'
          logger.info("Models ---------------------------------------"); 
//  PERFORM 0330-DISPLAY-MODELS THRU 0330-EXIT VARYING S3 FROM +1 BY +1 UNTIL S3 > +5 OR MODELNAME (S1, S2, S3) = SPACES OR LOW-VALUES
          for (methodOut.setS3(1); 	( methodOut.getS3() <= 5 )  &&         ( !allSpaces(methodIn.getModelname(methodIn.getS1() - 1,methodIn.getS2() - 1,methodOut.getS3() - 1))  ) && !( checkLowValue(methodIn.getModelname(methodIn.getS1() - 1,methodIn.getS2() - 1,methodOut.getS3() - 1)) )  ; methodOut.setS3(methodOut.getS3() + 1) ) {
          	displayModels(programCtx.getDisplayModelsInCtx());/*0330-DISPLAY-MODELS*/
          }
          ;
      
      return methodOut;
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
      @Override
      public DisplayModelsOutCtx displayModels(DisplayModelsInCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
Casecb00Ctx programCtx = methodIn.getCasecb00Ctx();
DisplayModelsOutCtx methodOut = methodIn.getDisplayModelsOutCtx();
//  MOVE LEVEL-2-NUM-IN (S1, S2, S3) TO WS-EDIT
//  FORMAT_1522103253 = "ZZZZ9"
          methodOut.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1522103253,methodOut.getLevel2NumIn(methodIn.getS1() - 1,methodIn.getS2() - 1,methodIn.getS3() - 1).toPlainString().toCharArray()));
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY 'Model...........: ' MODELNAME (S1, S2, S3)
          logger.info("Model...........: {}", new String(methodIn.getModelname(methodIn.getS1() - 1,methodIn.getS2() - 1,methodIn.getS3() - 1))); 
//  DISPLAY 'Engine Size.....: ' ENGINESIZECC (S1, S2, S3)
          logger.info("Engine Size.....: {}", String.valueOf(methodIn.getEnginesizecc(methodIn.getS1() - 1,methodIn.getS2() - 1,methodIn.getS3() - 1))); 
//  DISPLAY 'Level 2 Num.....: ' WS-EDIT
          logger.info("Level 2 Num.....: {}", new String(methodOut.getEdit())); 
//  MOVE COLORCOUNTER (S1, S2, S3) TO WS-EDIT
//  FORMAT_1522103253 = "ZZZZ9"
          methodOut.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1522103253,String.valueOf(methodOut.getColorcounter(methodIn.getS1() - 1,methodIn.getS2() - 1,methodIn.getS3() - 1)).toCharArray()));
//  DISPLAY 'Color Counter...: ' WS-EDIT
          logger.info("Color Counter...: {}", new String(methodOut.getEdit())); 
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY 'Colors ---------------------------------------'
          logger.info("Colors ---------------------------------------"); 
//  PERFORM 0340-DISPLAY-COLORS THRU 0340-EXIT VARYING S4 FROM +1 BY +1 UNTIL S4 > +5 OR COLOR (S1, S2, S3, S4) = SPACES OR LOW-VALUES
          for (methodOut.setS4(1); 	( methodOut.getS4() <= 5 )  &&         ( !allSpaces(methodIn.getColor(methodIn.getS1() - 1,methodIn.getS2() - 1,methodIn.getS3() - 1,methodOut.getS4() - 1))  ) && !( checkLowValue(methodIn.getColor(methodIn.getS1() - 1,methodIn.getS2() - 1,methodIn.getS3() - 1,methodOut.getS4() - 1)) )  ; methodOut.setS4(methodOut.getS4() + 1) ) {
          	displayColors(programCtx.getDisplayColorsInCtx());/*0340-DISPLAY-COLORS*/
          }
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY 'Accessories ----------------------------------'
          logger.info("Accessories ----------------------------------"); 
//  PERFORM 0350-DISPLAY-ACCESSORIES THRU 0350-EXIT VARYING S4 FROM +1 BY +1 UNTIL S4 > +5 OR ACCESSORY (S1, S2, S3, S4) = SPACES OR LOW-VALUES
          for (methodOut.setS4(1); 	( methodOut.getS4() <= 5 )  &&         ( !allSpaces(methodIn.getAccessory(methodIn.getS1() - 1,methodIn.getS2() - 1,methodIn.getS3() - 1,methodOut.getS4() - 1))  ) && !( checkLowValue(methodIn.getAccessory(methodIn.getS1() - 1,methodIn.getS2() - 1,methodIn.getS3() - 1,methodOut.getS4() - 1)) )  ; methodOut.setS4(methodOut.getS4() + 1) ) {
          	displayAccessories(programCtx.getDisplayAccessoriesInCtx());/*0350-DISPLAY-ACCESSORIES*/
          }
          ;
      
      return methodOut;
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
      @Override
      public void displayColors(DisplayColorsInCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
Casecb00Ctx programCtx = methodIn.getCasecb00Ctx();
//  DISPLAY 'Color...........: ' COLOR (S1, S2, S3, S4)
          logger.info("Color...........: {}", new String(methodIn.getColor(methodIn.getS1() - 1,methodIn.getS2() - 1,methodIn.getS3() - 1,methodIn.getS4() - 1))); 
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
      @Override
      public void displayAccessories(DisplayAccessoriesInCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
Casecb00Ctx programCtx = methodIn.getCasecb00Ctx();
//  DISPLAY 'Accessory.......: ' ACCESSORY (S1, S2, S3, S4)
          logger.info("Accessory.......: {}", new String(methodIn.getAccessory(methodIn.getS1() - 1,methodIn.getS2() - 1,methodIn.getS3() - 1,methodIn.getS4() - 1))); 
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
      @Override
      public void goback(Casecb00Ctx programCtx) throws Exception {
      
// *---------------------------------------------------------------*

// *---------------------------------------------------------------*
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
  
  
  
  
  
  
  
  
  }
