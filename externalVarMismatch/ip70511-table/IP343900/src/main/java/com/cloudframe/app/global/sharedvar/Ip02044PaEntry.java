package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02044PaEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip02044PaEntry extends Ip02044PaEntrySerialized { 
   

						@Getter @Setter private char[] ip02044PrcssAgrmtId = Field.fillLowValue(11);

						@Getter @Setter private char[] ip02044MdsEndpntId = Field.fillLowValue(7);
	
	/**
	* Constructor for Ip02044PaEntry
	**/
    public Ip02044PaEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02044PaEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02044PaEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip02044PaEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02044PrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp02044MdsEndpntId(CONSTANTS.SPACE_7);
   }


}
  
