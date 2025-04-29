package com.cloudframe.app.ar640010.dto;

/**
*  The class ApplExitWork810 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class ApplExitWork810 extends ApplExitWork810Serialized { 
   

								@Getter @Setter private short applExitDsnLen810;

								@Getter @Setter private short applExitMbrLen810;

						@Getter @Setter private char[] applExitDsnDlm810 = new char[1];

						@Getter @Setter private char[] applExitMbrDlm810 = new char[1];

						@Getter @Setter private char[] applExitDsn810 = new char[44];

						@Getter @Setter private char[] applExitMbr810 = new char[8];

						@Getter @Setter private char[] applExitWrk810 = new char[44];
	
	/**
	* Constructor for ApplExitWork810
	**/
    public ApplExitWork810() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ApplExitWork810. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ApplExitWork810(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setApplExitDsnLen810((short)0);
								setApplExitMbrLen810((short)0);
								setApplExitDsnDlm810(fillSpace(1));
								setApplExitMbrDlm810(fillSpace(1));
								setApplExitDsn810(fillSpace(44));
								setApplExitMbr810(fillSpace(8));
								setApplExitWrk810(fillSpace(44));
    } 

	/**
	 * 	initializes ApplExitWork810
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setApplExitDsnLen810((short)0);
         	setApplExitMbrLen810((short)0);
         setApplExitDsnDlm810(CONSTANTS.SPACE);
         setApplExitMbrDlm810(CONSTANTS.SPACE);
         setApplExitDsn810(CONSTANTS.SPACE_44);
         setApplExitMbr810(CONSTANTS.SPACE_8);
         setApplExitWrk810(CONSTANTS.SPACE_44);
   }


}
  
