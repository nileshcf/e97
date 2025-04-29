package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66102BitMap is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip66102BitMap extends Ip66102BitMapSerialized { 
   

						@Getter @Setter private char[] ip66102BitByte1 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66102BitByte2 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66102BitByte3 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66102BitByte4 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66102BitByte5 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66102BitByte6 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66102BitByte7 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66102BitByte8 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66102BitByte9 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66102BitByte10 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66102BitByte11 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66102BitByte12 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66102BitByte13 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66102BitByte14 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66102BitByte15 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66102BitByte16 = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip66102BitMap
	**/
    public Ip66102BitMap() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip66102BitMap. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66102BitMap(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip66102BitMap
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp66102BitByte1(CONSTANTS.SPACE);
         setIp66102BitByte2(CONSTANTS.SPACE);
         setIp66102BitByte3(CONSTANTS.SPACE);
         setIp66102BitByte4(CONSTANTS.SPACE);
         setIp66102BitByte5(CONSTANTS.SPACE);
         setIp66102BitByte6(CONSTANTS.SPACE);
         setIp66102BitByte7(CONSTANTS.SPACE);
         setIp66102BitByte8(CONSTANTS.SPACE);
         setIp66102BitByte9(CONSTANTS.SPACE);
         setIp66102BitByte10(CONSTANTS.SPACE);
         setIp66102BitByte11(CONSTANTS.SPACE);
         setIp66102BitByte12(CONSTANTS.SPACE);
         setIp66102BitByte13(CONSTANTS.SPACE);
         setIp66102BitByte14(CONSTANTS.SPACE);
         setIp66102BitByte15(CONSTANTS.SPACE);
         setIp66102BitByte16(CONSTANTS.SPACE);
   }


}
  
