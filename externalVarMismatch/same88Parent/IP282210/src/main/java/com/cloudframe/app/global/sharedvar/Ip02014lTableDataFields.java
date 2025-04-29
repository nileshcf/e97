package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014lTableDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip02014lTableDataFields extends Ip02014lTableDataFieldsSerialized { 
   

						@Getter @Setter private char[] ip02014lGeoScopeCode = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lHostInd = Field.fillLowValue(1);
				@Getter @Setter private Ip02014lImpBulkId ip02014lImpBulkId = new Ip02014lImpBulkId();

								@Getter @Setter private int ip02014lNumCurrCd;

						@Getter @Setter private char[] ip02014lOfsoilDataTypCd = Field.fillLowValue(3);

						@Getter @Setter private char[] ip02014lMrchntSplitCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lCurrSplitCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lAcquirerSplitCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lDomCollOnlyCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lOnsoilDataShrSw = Field.fillLowValue(1);

								@Getter @Setter private int ip02014lClrCycleNum;

						@Getter @Setter private char[] ip02014lDtaWrhsOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lBllngOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lSetlOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lClrOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lAmsOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lMcomOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lMdsOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lStndInOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lAuthOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lPushOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lIncontrolOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lEsrvcOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lGftOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lBnknetOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lMdesOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lZappOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lCemOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014lRptHdrName = Field.fillLowValue(80);

						@Getter @Setter private char[] ip02014lClrPrcssCd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip02014lOnUsPrcssAgrmtId = Field.fillLowValue(11);

						@Getter @Setter private char[] ip02014lOperSysId = Field.fillLowValue(20);

						@Getter @Setter private char[] ip02014lDbId = Field.fillLowValue(20);

						@Getter @Setter private char[] ip02014lFiller = Field.fillLowValue(750);
	
	/**
	* Constructor for Ip02014lTableDataFields
	**/
    public Ip02014lTableDataFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02014lTableDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014lTableDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp02014lImpBulkId().setParent(this,getStartOffset() + 2);
    } 

	/**
	 * 	initializes Ip02014lTableDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014lGeoScopeCode(CONSTANTS.SPACE);
         setIp02014lHostInd(CONSTANTS.SPACE);
          getIp02014lImpBulkId().initialize();
     
                     setIp02014lNumCurrCd(0);
         setIp02014lOfsoilDataTypCd(CONSTANTS.SPACE_3);
         setIp02014lMrchntSplitCd(CONSTANTS.SPACE);
         setIp02014lCurrSplitCd(CONSTANTS.SPACE);
         setIp02014lAcquirerSplitCd(CONSTANTS.SPACE);
         setIp02014lDomCollOnlyCd(CONSTANTS.SPACE);
         setIp02014lOnsoilDataShrSw(CONSTANTS.SPACE);
                     setIp02014lClrCycleNum(0);
         setIp02014lDtaWrhsOnsoilSw(CONSTANTS.SPACE);
         setIp02014lBllngOnsoilSw(CONSTANTS.SPACE);
         setIp02014lSetlOnsoilSw(CONSTANTS.SPACE);
         setIp02014lClrOnsoilSw(CONSTANTS.SPACE);
         setIp02014lAmsOnsoilSw(CONSTANTS.SPACE);
         setIp02014lMcomOnsoilSw(CONSTANTS.SPACE);
         setIp02014lMdsOnsoilSw(CONSTANTS.SPACE);
         setIp02014lStndInOnsoilSw(CONSTANTS.SPACE);
         setIp02014lAuthOnsoilSw(CONSTANTS.SPACE);
         setIp02014lPushOnsoilSw(CONSTANTS.SPACE);
         setIp02014lIncontrolOnsoilSw(CONSTANTS.SPACE);
         setIp02014lEsrvcOnsoilSw(CONSTANTS.SPACE);
         setIp02014lGftOnsoilSw(CONSTANTS.SPACE);
         setIp02014lBnknetOnsoilSw(CONSTANTS.SPACE);
         setIp02014lMdesOnsoilSw(CONSTANTS.SPACE);
         setIp02014lZappOnsoilSw(CONSTANTS.SPACE);
         setIp02014lCemOnsoilSw(CONSTANTS.SPACE);
         setIp02014lRptHdrName(CONSTANTS.SPACE_80);
         setIp02014lClrPrcssCd(CONSTANTS.SPACE_4);
         setIp02014lOnUsPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp02014lOperSysId(CONSTANTS.SPACE_20);
         setIp02014lDbId(CONSTANTS.SPACE_20);
         setIp02014lFiller(CONSTANTS.SPACE_750);
   }


}
  
