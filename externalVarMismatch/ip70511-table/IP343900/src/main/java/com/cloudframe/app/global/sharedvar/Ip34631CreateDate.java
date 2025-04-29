package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip34631CreateDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip34631CreateDate extends Ip34631CreateDateSerialized { 
   

						@Getter @Setter private char[] ip34631CreateCc = Field.fillLowValue(2);

						@Getter @Setter private char[] ip34631CreateYy = Field.fillLowValue(2);


						@Getter @Setter private char[] ip34631CreateMm = Field.fillLowValue(2);


						@Getter @Setter private char[] ip34631CreateDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip34631CreateDate
	**/
    public Ip34631CreateDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip34631CreateDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip34631CreateDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip34631CreateDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp34631CreateCc(CONSTANTS.SPACE_2);
         setIp34631CreateYy(CONSTANTS.SPACE_2);
         setIp34631CreateMm(CONSTANTS.SPACE_2);
         setIp34631CreateDd(CONSTANTS.SPACE_2);
   }


}
  
