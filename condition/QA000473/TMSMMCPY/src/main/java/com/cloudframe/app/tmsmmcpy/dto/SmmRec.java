package com.cloudframe.app.tmsmmcpy.dto;

/**
*  The class SmmRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SmmRec extends SmmRecSerialized {
   
				@Getter @Setter private SmmKey smmKey = new SmmKey();

						@Getter @Setter private char[] smmSsDdrKey = Field.fillLowValue(10);

						@Getter @Setter private char[] smmMatchStatus = Field.fillLowValue(2);

						@Getter @Setter private char[] smmClassification = Field.fillLowValue(2);

						@Getter @Setter private char[] smmField2 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmField4 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmField5 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmField6 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmField7 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmField8 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmField9 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmField10 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmField11 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmField12 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmField13 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmField14 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmField15 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmBranch = Field.fillLowValue(10);

						@Getter @Setter private char[] smmTeller = Field.fillLowValue(10);

						@Getter @Setter private char[] smmHash = Field.fillLowValue(30);

						@Getter @Setter private char[] smmType = Field.fillLowValue(10);

						@Getter @Setter private char[] smmAppTypePsetNum = Field.fillLowValue(3);

						@Getter @Setter private char[] smmPostingDate = Field.fillLowValue(10);

						@Getter @Setter private char[] smmTransTime = Field.fillLowValue(8);

						@Getter @Setter private char[] smmRefText1 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmRefText2 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmRefText3 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmRefText4 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmRefText5 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmRefNum1 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmRefNum2 = Field.fillLowValue(30);

						@Getter @Setter private char[] smmSubclass = Field.fillLowValue(10);

						@Getter @Setter private char[] smmFlags = Field.fillLowValue(5);

						@Getter @Setter private char[] smmCycleNo = Field.fillLowValue(1);

						@Getter @Setter private char[] smmCycleDate = Field.fillLowValue(8);

						@Getter @Setter private char[] smmEnd = Field.fillLowValue(3);
	
	/**
	* Constructor for SmmRec
	**/
    public SmmRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSmmKey().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
