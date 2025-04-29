package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdOptExpMmddccyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class MsdOptExpMmddccyy extends MsdOptExpMmddccyySerialized { 
   

						@Getter @Setter private char[] msdOptExpMm = Field.fillLowValue(2);

						@Getter @Setter private char[] msdOptExpDd = Field.fillLowValue(2);

						@Getter @Setter private char[] msdOptExpCc = Field.fillLowValue(2);

						@Getter @Setter private char[] msdOptExpYy = Field.fillLowValue(2);
	
	/**
	* Constructor for MsdOptExpMmddccyy
	**/
    public MsdOptExpMmddccyy() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdOptExpMmddccyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdOptExpMmddccyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdOptExpMmddccyy
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setMsdOptExpMm(CONSTANTS.SPACE_2);
         setMsdOptExpDd(CONSTANTS.SPACE_2);
         setMsdOptExpCc(CONSTANTS.SPACE_2);
         setMsdOptExpYy(CONSTANTS.SPACE_2);
   }


}
  
