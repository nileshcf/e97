package com.cloudframe.app.init1.dto;

/**
*  The class ErrAcctRecordSave is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class ErrAcctRecordSave extends ErrAcctRecordSaveSerialized { 
   

						private char[] errCustAcctSave = new char[8];

	
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
	 *	Returns the value of errCustAcctSave
	 *	@return errCustAcctSave
	 */
   public char[] getErrCustAcctSave() throws CFException{
     if (isErrCustAcctSaveModified()) { 
        errCustAcctSave = refreshErrCustAcctSave();
     }
   		return errCustAcctSave;
   }

  
	/**
	*  set variable errCustAcctSave
	*  Corresponding COBOL Variable is WS-ERR-CUST-ACCT-SAVE
	*  @param value
	**/
   public void setErrCustAcctSave(char[] value) {
      errCustAcctSave = checkErrCustAcctSaveConstraints(value);
      serializeErrCustAcctSave(errCustAcctSave);
   } 

     /**
	 * 	Update ErrCustAcctSave 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrCustAcctSave(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrCustAcctSave,errCustAcctSave.length);
   	
   }
   
   public void setErrCustAcctSave(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrCustAcctSave,errCustAcctSave.length);
   	
   }
   
     /**
	 * 	Update ErrCustAcctSave 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrCustAcctSave(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrCustAcctSave+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrCustAcctSave with another Field
	 *	@param value
	 */
   public void setErrCustAcctSave(Field source) {
       replace(source,0,source.length(),beginErrCustAcctSave,ERR_CUST_ACCT_SAVE_LEN);
   	
   }  
   
     /**
	 * 	Update ErrCustAcctSave 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrCustAcctSave(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrCustAcctSave,ERR_CUST_ACCT_SAVE_LEN);
   	
   }
   
     /**
	 * 	Update ErrCustAcctSave 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrCustAcctSave(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrCustAcctSave+targetIndex,targetLen);
    
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

		public static int getErrAcctRecordSaveFieldLength() {
			return ERR_ACCT_RECORD_SAVE_LENGTH;
		}

}
  
