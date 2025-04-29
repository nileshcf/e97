package com.cloudframe.app.init1.dto;

/**
*  The class ErrCodes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class ErrCodes extends ErrCodesSerialized { 
   

						@Getter @Setter private char[] errSumCd = new char[3];

						@Getter @Setter private char[] errUsgCd = new char[3];

						@Getter @Setter private char[] errLscCd = new char[3];

						@Getter @Setter private char[] errRemCd = new char[3];

						@Getter @Setter private char[] errAtdCd = new char[3];
	
	/**
	* Constructor for ErrCodes
	**/
    public ErrCodes() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ErrCodes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrCodes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setErrSumCd(fillSpace(3));
								setErrUsgCd(fillSpace(3));
								setErrLscCd(fillSpace(3));
								setErrRemCd(fillSpace(3));
								setErrAtdCd(fillSpace(3));
    } 

	/**
	 * 	initializes ErrCodes
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setErrSumCd(CONSTANTS.SPACE_3);
         setErrUsgCd(CONSTANTS.SPACE_3);
         setErrLscCd(CONSTANTS.SPACE_3);
         setErrRemCd(CONSTANTS.SPACE_3);
         setErrAtdCd(CONSTANTS.SPACE_3);
   }


}
  
