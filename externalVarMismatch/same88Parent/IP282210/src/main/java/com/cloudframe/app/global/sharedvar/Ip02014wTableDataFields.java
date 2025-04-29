package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014wTableDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip02014wTableDataFields extends Ip02014wTableDataFieldsSerialized { 
   

						@Getter @Setter private char[] ip02014wGeoScopeCode = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wHostInd = Field.fillLowValue(1);
				@Getter @Setter private Ip02014wImpBulkId ip02014wImpBulkId = new Ip02014wImpBulkId();

								@Getter @Setter private int ip02014wNumCurrCd;

						@Getter @Setter private char[] ip02014wOfsoilDataTypCd = Field.fillLowValue(3);

						@Getter @Setter private char[] ip02014wMrchntSplitCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wCurrSplitCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wAcquirerSplitCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wDomCollOnlyCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wOnsoilDataShrSw = Field.fillLowValue(1);

								@Getter @Setter private int ip02014wClrCycleNum;

						@Getter @Setter private char[] ip02014wDtaWrhsOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wBllngOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wSetlOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wClrOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wAmsOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wMcomOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wMdsOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wStndInOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wAuthOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wPushOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wIncontrolOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wEsrvcOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wGftOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wBnknetOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wMdesOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wZappOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wCemOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wRptHdrName = Field.fillLowValue(80);

						@Getter @Setter private char[] ip02014wClrPrcssCd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip02014wOnUsPrcssAgrmtId = Field.fillLowValue(11);

						@Getter @Setter private char[] ip02014wOperSysId = Field.fillLowValue(20);

						@Getter @Setter private char[] ip02014wDbId = Field.fillLowValue(20);

						@Getter @Setter private char[] ip02014wFiller = Field.fillLowValue(750);
	
	/**
	* Constructor for Ip02014wTableDataFields
	**/
    public Ip02014wTableDataFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02014wTableDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014wTableDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp02014wImpBulkId().setParent(this,getStartOffset() + 2);
    } 

	/**
	 * 	initializes Ip02014wTableDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014wGeoScopeCode(CONSTANTS.SPACE);
         setIp02014wHostInd(CONSTANTS.SPACE);
          getIp02014wImpBulkId().initialize();
     
                     setIp02014wNumCurrCd(0);
         setIp02014wOfsoilDataTypCd(CONSTANTS.SPACE_3);
         setIp02014wMrchntSplitCd(CONSTANTS.SPACE);
         setIp02014wCurrSplitCd(CONSTANTS.SPACE);
         setIp02014wAcquirerSplitCd(CONSTANTS.SPACE);
         setIp02014wDomCollOnlyCd(CONSTANTS.SPACE);
         setIp02014wOnsoilDataShrSw(CONSTANTS.SPACE);
                     setIp02014wClrCycleNum(0);
         setIp02014wDtaWrhsOnsoilSw(CONSTANTS.SPACE);
         setIp02014wBllngOnsoilSw(CONSTANTS.SPACE);
         setIp02014wSetlOnsoilSw(CONSTANTS.SPACE);
         setIp02014wClrOnsoilSw(CONSTANTS.SPACE);
         setIp02014wAmsOnsoilSw(CONSTANTS.SPACE);
         setIp02014wMcomOnsoilSw(CONSTANTS.SPACE);
         setIp02014wMdsOnsoilSw(CONSTANTS.SPACE);
         setIp02014wStndInOnsoilSw(CONSTANTS.SPACE);
         setIp02014wAuthOnsoilSw(CONSTANTS.SPACE);
         setIp02014wPushOnsoilSw(CONSTANTS.SPACE);
         setIp02014wIncontrolOnsoilSw(CONSTANTS.SPACE);
         setIp02014wEsrvcOnsoilSw(CONSTANTS.SPACE);
         setIp02014wGftOnsoilSw(CONSTANTS.SPACE);
         setIp02014wBnknetOnsoilSw(CONSTANTS.SPACE);
         setIp02014wMdesOnsoilSw(CONSTANTS.SPACE);
         setIp02014wZappOnsoilSw(CONSTANTS.SPACE);
         setIp02014wCemOnsoilSw(CONSTANTS.SPACE);
         setIp02014wRptHdrName(CONSTANTS.SPACE_80);
         setIp02014wClrPrcssCd(CONSTANTS.SPACE_4);
         setIp02014wOnUsPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp02014wOperSysId(CONSTANTS.SPACE_20);
         setIp02014wDbId(CONSTANTS.SPACE_20);
         setIp02014wFiller(CONSTANTS.SPACE_750);
   }


}
  
