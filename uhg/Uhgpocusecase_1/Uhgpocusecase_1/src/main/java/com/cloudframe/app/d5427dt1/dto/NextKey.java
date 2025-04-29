package com.cloudframe.app.d5427dt1.dto;

/**
*  The class NextKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class NextKey extends NextKeySerialized {
   

						@Getter @Setter private char[] nextProcDt = Field.fillLowValue(10);

						@Getter @Setter private char[] nextProcTm = Field.fillLowValue(8);

						@Getter @Setter private char[] nextPgmIdLstCharVal = Field.fillLowValue(1);

								@Getter @Setter private int nextIcnSufxVersNbr;

						@Getter @Setter private char[] nextInvnCtlNbr = Field.fillLowValue(10);

						@Getter @Setter private char[] nextIcnSufxCd = Field.fillLowValue(2);

								@Getter @Setter private int nextLnId;

								@Getter @Setter private int nextHeaderCt;
	
	/**
	* Constructor for NextKey
	**/
    public NextKey() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
