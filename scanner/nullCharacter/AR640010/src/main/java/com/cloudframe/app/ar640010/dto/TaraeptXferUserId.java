package com.cloudframe.app.ar640010.dto;

/**
*  The class TaraeptXferUserId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class TaraeptXferUserId extends TaraeptXferUserIdSerialized { 
   

								@Getter @Setter private short taraeptXferUserIdLen;

						@Getter @Setter private char[] taraeptXferUserIdTxt = Field.fillLowValue(64);
	
	/**
	* Constructor for TaraeptXferUserId
	**/
    public TaraeptXferUserId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TaraeptXferUserId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraeptXferUserId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes TaraeptXferUserId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTaraeptXferUserIdLen((short)0);
         setTaraeptXferUserIdTxt(CONSTANTS.SPACE_64);
   }


}
  
