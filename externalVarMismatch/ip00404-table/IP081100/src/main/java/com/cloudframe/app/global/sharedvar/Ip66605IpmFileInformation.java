package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66605IpmFileInformation is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip66605IpmFileInformation extends Ip66605IpmFileInformationSerialized { 
   

						@Getter @Setter private char[] ip66605IsIpmFileFinished = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66605IsIpmFileTagged = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66605WriteToFileSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66605DoIWrite800Pdses = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip66605IpmFileInformation
	**/
    public Ip66605IpmFileInformation() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip66605IpmFileInformation. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66605IpmFileInformation(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip66605IpmFileInformation
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp66605IsIpmFileFinished(CONSTANTS.SPACE);
         setIp66605IsIpmFileTagged(CONSTANTS.SPACE);
         setIp66605WriteToFileSw(CONSTANTS.SPACE);
         setIp66605DoIWrite800Pdses(CONSTANTS.SPACE);
   }


}
  
