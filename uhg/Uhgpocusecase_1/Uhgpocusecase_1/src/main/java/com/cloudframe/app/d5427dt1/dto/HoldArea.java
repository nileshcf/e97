package com.cloudframe.app.d5427dt1.dto;

/**
*  The class HoldArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class HoldArea extends HoldAreaSerialized {
   

						@Getter @Setter private char[] hldInvnCtlNbr = new char[10];

						@Getter @Setter private char[] hldIcnSufxCd = new char[2];

						@Getter @Setter private char[] hldProcDt = new char[10];

						@Getter @Setter private char[] hldProcTm = new char[8];

						@Getter @Setter private char[] hldLstCharVal = new char[1];

								@Getter @Setter private short hldIcnSufxVersNbr;
	
	/**
	* Constructor for HoldArea
	**/
    public HoldArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHldInvnCtlNbr(fillSpace(10));
								setHldIcnSufxCd(fillSpace(2));
								setHldProcDt(fillSpace(10));
								setHldProcTm(fillSpace(8));
								setHldLstCharVal(fillSpace(1));
								setHldIcnSufxVersNbr((short)0);
    }



	/**
	 * 	initializes HoldArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setHldInvnCtlNbr(CONSTANTS.SPACE_10);
         setHldIcnSufxCd(CONSTANTS.SPACE_2);
         setHldProcDt(CONSTANTS.SPACE_10);
         setHldProcTm(CONSTANTS.SPACE_8);
         setHldLstCharVal(CONSTANTS.SPACE);
         	setHldIcnSufxVersNbr((short)0);
   }


}
  
