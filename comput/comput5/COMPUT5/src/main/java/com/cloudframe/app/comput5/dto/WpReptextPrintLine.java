package com.cloudframe.app.comput5.dto;

/**
*  The class WpReptextPrintLine is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.utility.CFUtil;


@Data
public class WpReptextPrintLine extends WpReptextPrintLineSerialized { 
   


						@Getter @Setter private char[] wpSettlDate = Field.fillLowValue(8);


						@Getter @Setter private char[] wpClient = Field.fillLowValue(9);


						@Getter @Setter private char[] wpParcel = Field.fillLowValue(10);


						@Getter @Setter private char[] wpSetlRef = Field.fillLowValue(10);


						@Getter @Setter private char[] wpOperator = Field.fillLowValue(8);


								@Getter @Setter private char[] wpSettlValue = Field.fillLowValue(15);


								@Getter @Setter private char[] wpDexValue = Field.fillLowValue(15);


						@Getter @Setter private char[] wpQuarter = Field.fillLowValue(4);
	
	/**
	* Constructor for WpReptextPrintLine
	**/
    public WpReptextPrintLine() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WpReptextPrintLine. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WpReptextPrintLine(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 0
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 18
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 31
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 43
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 55
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 64
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 83
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 100
             ,3
             );
    } 

	/**
	 * 	initializes WpReptextPrintLine
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWpSettlDate(CONSTANTS.SPACE_8);
         setWpClient(CONSTANTS.SPACE_9);
         setWpParcel(CONSTANTS.SPACE_10);
         setWpSetlRef(CONSTANTS.SPACE_10);
         setWpOperator(CONSTANTS.SPACE_8);
                    setWpSettlValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1073997384,"0".toCharArray()));
                    setWpDexValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1073997384,"0".toCharArray()));
         setWpQuarter(CONSTANTS.SPACE_4);
   }


}
  
