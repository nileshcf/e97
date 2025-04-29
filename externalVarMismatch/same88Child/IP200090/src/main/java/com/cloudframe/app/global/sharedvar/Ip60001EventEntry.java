package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip60001EventEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip60001EventEntry extends Ip60001EventEntrySerialized { 
   

						@Getter @Setter private char[] ip60001PgmName = Field.fillLowValue(8);
	
	/**
	* Constructor for Ip60001EventEntry
	**/
    public Ip60001EventEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip60001EventEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip60001EventEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip60001EventEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp60001PgmName(CONSTANTS.SPACE_8);
   }


}
  
