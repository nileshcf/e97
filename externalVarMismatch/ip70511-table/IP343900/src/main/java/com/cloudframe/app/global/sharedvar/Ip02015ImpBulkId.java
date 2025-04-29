package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02015ImpBulkId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip02015ImpBulkId extends Ip02015ImpBulkIdSerialized { 
   

						@Getter @Setter private char[] ip02015BulkFileProcCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015BulkFileTypeCd = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip02015ImpBulkId
	**/
    public Ip02015ImpBulkId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02015ImpBulkId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02015ImpBulkId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip02015ImpBulkId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02015BulkFileProcCd(CONSTANTS.SPACE);
         setIp02015BulkFileTypeCd(CONSTANTS.SPACE_3);
   }


}
  
