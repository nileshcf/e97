package com.cloudframe.app.usbaeext.dto;

/**
*  The class TaAdjTableRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TaAdjTableRedefined extends TaAdjTableRedefinedSerialized { 
   

						@Getter @Setter private char[] taSiteCode = Field.fillLowValue(3);

						@Getter @Setter private char[] taAdjCode = Field.fillLowValue(3);

						@Getter @Setter private char[] taSortType = Field.fillLowValue(3);

						@Getter @Setter private char[] taBankNo = Field.fillLowValue(3);

						@Getter @Setter private char[] taDeptNo = Field.fillLowValue(2);

						@Getter @Setter private char[] taAcctCd = Field.fillLowValue(2);

						@Getter @Setter private char[] taTypeCd = Field.fillLowValue(2);

						@Getter @Setter private char[] taClerkId = Field.fillLowValue(8);

						@Getter @Setter private char[] taSrcReceiptCd = Field.fillLowValue(6);

						@Getter @Setter private char[] taSrcErrorCd = Field.fillLowValue(6);

								@Getter @Setter private int taAdjCodeCnt;
	
	/**
	* Constructor for TaAdjTableRedefined
	**/
    public TaAdjTableRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TaAdjTableRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaAdjTableRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
