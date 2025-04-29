package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01SecurityTypeSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01SecurityTypeSegData extends Bdms01SecurityTypeSegDataSerialized { 
   

								@Getter @Setter private int bdms01SecurityTypeSegSqlcd;

						@Getter @Setter private char[] msdTypeOfRecordInd = Field.fillLowValue(1);

						@Getter @Setter private char[] msdSecurityTypePos1 = Field.fillLowValue(1);
				@Getter @Setter private MsdSecTypeCodes msdSecTypeCodes = new MsdSecTypeCodes();

						@Getter @Setter private char[] msdSecPriceMultiplier = Field.fillLowValue(1);

	
	/**
	* Constructor for Bdms01SecurityTypeSegData
	**/
    public Bdms01SecurityTypeSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01SecurityTypeSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SecurityTypeSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMsdSecTypeCodes().setParent(this,getStartOffset() + 6);
    } 

	/**
	 * 	initializes Bdms01SecurityTypeSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01SecurityTypeSegSqlcd(0);
         setMsdTypeOfRecordInd(CONSTANTS.SPACE);
         setMsdSecurityTypePos1(CONSTANTS.SPACE);
          getMsdSecTypeCodes().initialize();
     
         setMsdSecPriceMultiplier(CONSTANTS.SPACE);
   }


}
  
