package com.cloudframe.app.init1.dto;

/**
*  The class ErrAcctRecordSave is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class ErrAcctRecordSave extends ErrAcctRecordSaveSerialized { 
   

						@Getter @Setter private char[] errCustAcctSave = new char[8];

	
	/**
	* Constructor for ErrAcctRecordSave
	**/
    public ErrAcctRecordSave() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ErrAcctRecordSave. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrAcctRecordSave(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setErrCustAcctSave(fillLowValue(8));
       replaceValue( // serialize and save the value
             fillSpace(49)
             , getStartOffset() + 8
             ,49
             );
    } 

	/**
	 * 	initializes ErrAcctRecordSave
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setErrCustAcctSave(CONSTANTS.SPACE_8);
   }


}
  
