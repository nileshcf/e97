package com.cloudframe.app.ar640010.dto;

/**
*  The class TaraeptAltXferUserId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class TaraeptAltXferUserId extends TaraeptAltXferUserIdSerialized { 
   

								@Getter @Setter private short taraeptAltXferUserIdLen;

						@Getter @Setter private char[] taraeptAltXferUserIdTxt = Field.fillLowValue(64);
	
	/**
	* Constructor for TaraeptAltXferUserId
	**/
    public TaraeptAltXferUserId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TaraeptAltXferUserId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraeptAltXferUserId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes TaraeptAltXferUserId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTaraeptAltXferUserIdLen((short)0);
         setTaraeptAltXferUserIdTxt(CONSTANTS.SPACE_64);
   }


}
  
