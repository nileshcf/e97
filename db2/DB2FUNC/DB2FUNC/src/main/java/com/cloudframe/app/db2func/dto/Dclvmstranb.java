package com.cloudframe.app.db2func.dto;

/**
*  The class Dclvmstranb is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dclvmstranb extends DclvmstranbSerialized {
   

						@Getter @Setter private char[] securityAdpNbr = Field.fillLowValue(7);

						@Getter @Setter private char[] trmlCd = Field.fillLowValue(8);

						@Getter @Setter private char[] tranCd = Field.fillLowValue(8);

						@Getter @Setter private char[] addedTmstp = Field.fillLowValue(26);

						@Getter @Setter private char[] doNotUseDt = Field.fillLowValue(10);

						@Getter @Setter private char[] srceSetupSecCd = Field.fillLowValue(2);

						@Getter @Setter private char[] securityIdaCd = Field.fillLowValue(4);

						@Getter @Setter private char[] typeSecurityCd = Field.fillLowValue(3);

						@Getter @Setter private char[] cntryIssueCd = Field.fillLowValue(2);

						@Getter @Setter private char[] cntryOrgnCd = Field.fillLowValue(2);

						@Getter @Setter private char[] clientNbr = Field.fillLowValue(4);

						@Getter @Setter private char[] descSecTxt = Field.fillLowValue(30);

								@Getter @Setter private int mcgillCd;

						@Getter @Setter private char[] cusipCntraNbr = Field.fillLowValue(8);

						@Getter @Setter private char[] classInd = Field.fillLowValue(1);

						@Getter @Setter private char[] symblTrdsAsCd = Field.fillLowValue(20);

						@Getter @Setter private char[] symblTrdsWhiCd = Field.fillLowValue(20);

						@Getter @Setter private char[] secLckdInd = Field.fillLowValue(1);
	
	/**
	* Constructor for Dclvmstranb
	**/
    public Dclvmstranb() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
