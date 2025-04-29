package com.cloudframe.app.init1.dto;

/**
*  The class KeyLsbcaPrev is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class KeyLsbcaPrev extends KeyLsbcaPrevSerialized { 
   

								@Getter @Setter private short lsbcaPrvBlSegregateNo;

						@Getter @Setter private char[] lsbcaPrvBlStreamCd = Field.fillLowValue(1);

								@Getter @Setter private short lsbcaPrvJobIterationNo;

								@Getter @Setter private int lsbcaPrvCustIdNo;

								@Getter @Setter private int lsbcaPrvAcctNo;

						@Getter @Setter private char[] lsbcaPrvBlCycEndDt = Field.fillLowValue(10);

						@Getter @Setter private char[] lsbcaPrvShrGrpCompTyp = Field.fillLowValue(1);

						@Getter @Setter private char[] lsbcaPrvNpa = Field.fillLowValue(3);

						@Getter @Setter private char[] lsbcaPrvNxx = Field.fillLowValue(3);

						@Getter @Setter private char[] lsbcaPrvTln = Field.fillLowValue(4);

						@Getter @Setter private char[] lsbcaPrvBlPerFromDt = Field.fillLowValue(10);

						@Getter @Setter private char[] lsbcaPrvBlPerToDt = Field.fillLowValue(10);

								@Getter @Setter private int lsbcaPrvLnShrGrpNo;

								@Getter @Setter private int lsbcaPrvShrActvSeqNo;
	
	/**
	* Constructor for KeyLsbcaPrev
	**/
    public KeyLsbcaPrev() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for KeyLsbcaPrev. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyLsbcaPrev(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes KeyLsbcaPrev
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setLsbcaPrvBlSegregateNo((short)0);
         setLsbcaPrvBlStreamCd(CONSTANTS.SPACE);
         	setLsbcaPrvJobIterationNo((short)0);
                     setLsbcaPrvCustIdNo(0);
                     setLsbcaPrvAcctNo(0);
         setLsbcaPrvBlCycEndDt(CONSTANTS.SPACE_10);
         setLsbcaPrvShrGrpCompTyp(CONSTANTS.SPACE);
         setLsbcaPrvNpa(CONSTANTS.SPACE_3);
         setLsbcaPrvNxx(CONSTANTS.SPACE_3);
         setLsbcaPrvTln(CONSTANTS.SPACE_4);
         setLsbcaPrvBlPerFromDt(CONSTANTS.SPACE_10);
         setLsbcaPrvBlPerToDt(CONSTANTS.SPACE_10);
                     setLsbcaPrvLnShrGrpNo(0);
                     setLsbcaPrvShrActvSeqNo(0);
   }


}
  
