package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip58041CreateDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip58041CreateDate extends Ip58041CreateDateSerialized { 
   

						@Getter @Setter private char[] ip58041CreateCc = Field.fillLowValue(2);

						@Getter @Setter private char[] ip58041CreateYy = Field.fillLowValue(2);


						@Getter @Setter private char[] ip58041CreateMm = Field.fillLowValue(2);


						@Getter @Setter private char[] ip58041CreateDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip58041CreateDate
	**/
    public Ip58041CreateDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip58041CreateDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip58041CreateDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip58041CreateDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp58041CreateCc(CONSTANTS.SPACE_2);
         setIp58041CreateYy(CONSTANTS.SPACE_2);
         setIp58041CreateMm(CONSTANTS.SPACE_2);
         setIp58041CreateDd(CONSTANTS.SPACE_2);
   }


}
  
