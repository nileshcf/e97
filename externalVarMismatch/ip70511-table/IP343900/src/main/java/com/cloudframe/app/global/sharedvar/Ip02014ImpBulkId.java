package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014ImpBulkId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip02014ImpBulkId extends Ip02014ImpBulkIdSerialized { 
   

						@Getter @Setter private char[] ip02014BulkFileProcCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014BulkFileTypeCd = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip02014ImpBulkId
	**/
    public Ip02014ImpBulkId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02014ImpBulkId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014ImpBulkId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip02014ImpBulkId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014BulkFileProcCd(CONSTANTS.SPACE);
         setIp02014BulkFileTypeCd(CONSTANTS.SPACE_3);
   }


}
  
