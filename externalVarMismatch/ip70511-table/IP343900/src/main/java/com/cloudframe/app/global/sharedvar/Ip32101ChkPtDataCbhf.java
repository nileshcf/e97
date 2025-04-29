package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101ChkPtDataCbhf is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip32101ChkPtDataCbhf extends Ip32101ChkPtDataCbhfSerialized { 
   

								@Getter @Setter private short ip32101CbhfDataLen;

								@Getter @Setter private long ip32101CbhfFreq;
				@Getter @Setter private Ip32101CbhfChkKey ip32101CbhfChkKey = new Ip32101CbhfChkKey();

								@Getter @Setter private long ip32101CbhfChkCnt;

								@Getter @Setter private short ip32101CbhfCycInd;

								@Getter @Setter private int ip32101CbhfCsIpmRecCnt;

						@Getter @Setter private char[] ip32101CbhfBulkId = Field.fillLowValue(4);

						@Getter @Setter private char[] ip32101CbhfEdcDasetNam = Field.fillLowValue(44);
	
	/**
	* Constructor for Ip32101ChkPtDataCbhf
	**/
    public Ip32101ChkPtDataCbhf() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip32101ChkPtDataCbhf. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101ChkPtDataCbhf(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp32101CbhfChkKey().setParent(this,getStartOffset() + 11);
    } 

	/**
	 * 	initializes Ip32101ChkPtDataCbhf
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp32101CbhfDataLen((short)0);
                     setIp32101CbhfFreq(0);
          getIp32101CbhfChkKey().initialize();
     
                     setIp32101CbhfChkCnt(0);
         	setIp32101CbhfCycInd((short)0);
                     setIp32101CbhfCsIpmRecCnt(0);
         setIp32101CbhfBulkId(CONSTANTS.SPACE_4);
         setIp32101CbhfEdcDasetNam(CONSTANTS.SPACE_44);
   }


}
  
