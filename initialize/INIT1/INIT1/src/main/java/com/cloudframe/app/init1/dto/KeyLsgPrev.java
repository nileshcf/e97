package com.cloudframe.app.init1.dto;

/**
*  The class KeyLsgPrev is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class KeyLsgPrev extends KeyLsgPrevSerialized { 
   

								@Getter @Setter private int lsgPrvCustIdNo;

								@Getter @Setter private int lsgPrvAcctNo;

						@Getter @Setter private char[] lsgPrvShrGrpCompTyp = Field.fillLowValue(1);

						@Getter @Setter private char[] lsgPrvBlPerFromDt = Field.fillLowValue(10);

						@Getter @Setter private char[] lsgPrvBlPerToDt = Field.fillLowValue(10);

								@Getter @Setter private int lsgPrvShrGrpNo;
	
	/**
	* Constructor for KeyLsgPrev
	**/
    public KeyLsgPrev() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for KeyLsgPrev. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyLsgPrev(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setLsgPrvCustIdNo(0);
								setLsgPrvAcctNo(0);
								setLsgPrvShrGrpNo(0);
    } 

	/**
	 * 	initializes KeyLsgPrev
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setLsgPrvCustIdNo(0);
                     setLsgPrvAcctNo(0);
         setLsgPrvShrGrpCompTyp(CONSTANTS.SPACE);
         setLsgPrvBlPerFromDt(CONSTANTS.SPACE_10);
         setLsgPrvBlPerToDt(CONSTANTS.SPACE_10);
                     setLsgPrvShrGrpNo(0);
   }


}
  
