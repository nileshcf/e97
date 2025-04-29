package com.cloudframe.app.tstcdpag.dto;

/**
*  The class Out is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Out extends OutSerialized {
   

						@Getter @Setter private char[] byteWs = Field.fillLowValue(1);


						@Getter @Setter private char[] hexChar = Field.fillLowValue(2);


						@Getter @Setter private char[] nonDisplayableStr = Field.fillLowValue(25);
	
	/**
	* Constructor for Out
	**/
    public Out() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" Hex value is 0x").toCharArray()
             , getStartOffset() + 1
             ,16
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 19
             ,1
             );
    }



	/**
	 * 	initializes Out
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setByteWs(CONSTANTS.SPACE);
         setHexChar(CONSTANTS.SPACE_2);
         setNonDisplayableStr(CONSTANTS.SPACE_25);
   }


}
  
