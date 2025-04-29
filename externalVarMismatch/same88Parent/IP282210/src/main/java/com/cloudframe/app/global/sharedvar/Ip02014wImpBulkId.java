package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014wImpBulkId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip02014wImpBulkId extends Ip02014wImpBulkIdSerialized { 
   

						@Getter @Setter private char[] ip02014wBulkFileProcCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014wBulkFileTypeCd = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip02014wImpBulkId
	**/
    public Ip02014wImpBulkId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02014wImpBulkId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014wImpBulkId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip02014wImpBulkId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014wBulkFileProcCd(CONSTANTS.SPACE);
         setIp02014wBulkFileTypeCd(CONSTANTS.SPACE_3);
   }


}
  
