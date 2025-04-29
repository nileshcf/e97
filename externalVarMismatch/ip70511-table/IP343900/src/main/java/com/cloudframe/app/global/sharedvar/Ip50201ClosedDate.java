package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50201ClosedDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip50201ClosedDate extends Ip50201ClosedDateSerialized { 
   

						@Getter @Setter private char[] ip50201ClosedCcyy = Field.fillLowValue(4);

						@Getter @Setter private char[] ip50201Filler1 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip50201ClosedMm = Field.fillLowValue(2);

						@Getter @Setter private char[] ip50201Filler2 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip50201ClosedDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50201ClosedDate
	**/
    public Ip50201ClosedDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50201ClosedDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50201ClosedDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip50201ClosedDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50201ClosedCcyy(CONSTANTS.SPACE_4);
         setIp50201Filler1(CONSTANTS.SPACE);
         setIp50201ClosedMm(CONSTANTS.SPACE_2);
         setIp50201Filler2(CONSTANTS.SPACE);
         setIp50201ClosedDd(CONSTANTS.SPACE_2);
   }


}
  
