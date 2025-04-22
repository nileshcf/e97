package com.cloudframe.app.sf311010.dto;

/**
*  The class FwdIcaOnly5800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FwdIcaOnly5800 extends FwdIcaOnly5800Serialized { 
   

						private char[] fwdIcaOnly4800 = Field.fillLowValue(4);
	
	/**
	* Constructor for FwdIcaOnly5800
	**/
    public FwdIcaOnly5800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FwdIcaOnly5800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FwdIcaOnly5800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of fwdIcaOnly4800
	 *	@return fwdIcaOnly4800
	 */
   public char[] getFwdIcaOnly4800() throws CFException{
     if (isFwdIcaOnly4800Modified()) { 
        fwdIcaOnly4800 = refreshFwdIcaOnly4800();
     }
   		return fwdIcaOnly4800;
   }

  
	/**
	*  set variable fwdIcaOnly4800
	*  Corresponding COBOL Variable is 800-FWD-ICA-ONLY4
	*  @param value
	**/
   public void setFwdIcaOnly4800(char[] value) {
      fwdIcaOnly4800 = checkFwdIcaOnly4800Constraints(value);
      serializeFwdIcaOnly4800(fwdIcaOnly4800);
   } 

     /**
	 * 	Update FwdIcaOnly4800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFwdIcaOnly4800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFwdIcaOnly4800,fwdIcaOnly4800.length);
   	
   }
   
   public void setFwdIcaOnly4800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFwdIcaOnly4800,fwdIcaOnly4800.length);
   	
   }
   
     /**
	 * 	Update FwdIcaOnly4800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFwdIcaOnly4800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFwdIcaOnly4800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FwdIcaOnly4800 with another Field
	 *	@param value
	 */
   public void setFwdIcaOnly4800(Field source) {
       replace(source,0,source.length(),beginFwdIcaOnly4800,FWD_ICA_ONLY_4800_LEN);
   	
   }  
   
     /**
	 * 	Update FwdIcaOnly4800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFwdIcaOnly4800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFwdIcaOnly4800,FWD_ICA_ONLY_4800_LEN);
   	
   }
   
     /**
	 * 	Update FwdIcaOnly4800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFwdIcaOnly4800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFwdIcaOnly4800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFwdIcaOnly5800FieldLength() {
			return FWD_ICA_ONLY_5800_LENGTH;
		}

}
  
