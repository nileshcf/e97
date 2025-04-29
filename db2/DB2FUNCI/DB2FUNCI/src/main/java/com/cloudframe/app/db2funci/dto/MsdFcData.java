package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdFcData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class MsdFcData extends MsdFcDataSerialized { 
   

								@Getter @Setter private long bdms01Fc2DataInd;
				@Getter @Setter private Bdms01Fc2DataIndRedefined bdms01Fc2DataIndRedefined = new Bdms01Fc2DataIndRedefined();

						@Getter @Setter private char[] bdms01Fc2DepositoryCd = Field.fillLowValue(4);

						@Getter @Setter private char[] bdms01Fc2TrnfrDptryInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01Fc2PortalInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01Fc2ChllIntrDpstInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01Fc2DtcIssTypeCd = Field.fillLowValue(3);

						@Getter @Setter private char[] bdms01Fc2IpoInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01Fc2CloseIpoDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01Fc2DrctRgstnInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01DtcCstdnOnlyInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01BkDrsCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01PprlsLglInd = Field.fillLowValue(1);

	
	/**
	* Constructor for MsdFcData
	**/
    public MsdFcData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdFcData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdFcData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getBdms01Fc2DataIndRedefined().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes MsdFcData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01Fc2DataInd(0);
         setBdms01Fc2DepositoryCd(CONSTANTS.SPACE_4);
         setBdms01Fc2TrnfrDptryInd(CONSTANTS.SPACE);
         setBdms01Fc2PortalInd(CONSTANTS.SPACE);
         setBdms01Fc2ChllIntrDpstInd(CONSTANTS.SPACE);
         setBdms01Fc2DtcIssTypeCd(CONSTANTS.SPACE_3);
         setBdms01Fc2IpoInd(CONSTANTS.SPACE);
         setBdms01Fc2CloseIpoDt(CONSTANTS.SPACE_10);
         setBdms01Fc2DrctRgstnInd(CONSTANTS.SPACE);
         setBdms01DtcCstdnOnlyInd(CONSTANTS.SPACE);
         setBdms01BkDrsCd(CONSTANTS.SPACE);
         setBdms01PprlsLglInd(CONSTANTS.SPACE);
   }


}
  
