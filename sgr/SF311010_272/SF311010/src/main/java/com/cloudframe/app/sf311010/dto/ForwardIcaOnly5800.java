package com.cloudframe.app.sf311010.dto;

/**
*  The class ForwardIcaOnly5800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ForwardIcaOnly5800 extends ForwardIcaOnly5800Serialized { 
   

						private char[] forwardIcaOnly4800 = Field.fillLowValue(4);

						private char[] fwdFiller1800 = Field.fillLowValue(1);
	
	/**
	* Constructor for ForwardIcaOnly5800
	**/
    public ForwardIcaOnly5800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ForwardIcaOnly5800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ForwardIcaOnly5800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of forwardIcaOnly4800
	 *	@return forwardIcaOnly4800
	 */
   public char[] getForwardIcaOnly4800() throws CFException{
     if (isForwardIcaOnly4800Modified()) { 
        forwardIcaOnly4800 = refreshForwardIcaOnly4800();
     }
   		return forwardIcaOnly4800;
   }

  
	/**
	*  set variable forwardIcaOnly4800
	*  Corresponding COBOL Variable is 800-FORWARD-ICA-ONLY4
	*  @param value
	**/
   public void setForwardIcaOnly4800(char[] value) {
      forwardIcaOnly4800 = checkForwardIcaOnly4800Constraints(value);
      serializeForwardIcaOnly4800(forwardIcaOnly4800);
   } 

     /**
	 * 	Update ForwardIcaOnly4800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setForwardIcaOnly4800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginForwardIcaOnly4800,forwardIcaOnly4800.length);
   	
   }
   
   public void setForwardIcaOnly4800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginForwardIcaOnly4800,forwardIcaOnly4800.length);
   	
   }
   
     /**
	 * 	Update ForwardIcaOnly4800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setForwardIcaOnly4800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginForwardIcaOnly4800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ForwardIcaOnly4800 with another Field
	 *	@param value
	 */
   public void setForwardIcaOnly4800(Field source) {
       replace(source,0,source.length(),beginForwardIcaOnly4800,FORWARD_ICA_ONLY_4800_LEN);
   	
   }  
   
     /**
	 * 	Update ForwardIcaOnly4800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setForwardIcaOnly4800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginForwardIcaOnly4800,FORWARD_ICA_ONLY_4800_LEN);
   	
   }
   
     /**
	 * 	Update ForwardIcaOnly4800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setForwardIcaOnly4800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginForwardIcaOnly4800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fwdFiller1800
	 *	@return fwdFiller1800
	 */
   public char[] getFwdFiller1800() throws CFException{
     if (isFwdFiller1800Modified()) { 
        fwdFiller1800 = refreshFwdFiller1800();
     }
   		return fwdFiller1800;
   }

  
	/**
	*  set variable fwdFiller1800
	*  Corresponding COBOL Variable is 800-FWD-FILLER-1
	*  @param value
	**/
   public void setFwdFiller1800(char[] value) {
      fwdFiller1800 = checkFwdFiller1800Constraints(value);
      serializeFwdFiller1800(fwdFiller1800);
   } 

     /**
	 * 	Update FwdFiller1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFwdFiller1800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFwdFiller1800,fwdFiller1800.length);
   	
   }
   
   public void setFwdFiller1800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFwdFiller1800,fwdFiller1800.length);
   	
   }
   
     /**
	 * 	Update FwdFiller1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFwdFiller1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFwdFiller1800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FwdFiller1800 with another Field
	 *	@param value
	 */
   public void setFwdFiller1800(Field source) {
       replace(source,0,source.length(),beginFwdFiller1800,FWD_FILLER_1800_LEN);
   	
   }  
   
     /**
	 * 	Update FwdFiller1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFwdFiller1800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFwdFiller1800,FWD_FILLER_1800_LEN);
   	
   }
   
     /**
	 * 	Update FwdFiller1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFwdFiller1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFwdFiller1800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getForwardIcaOnly5800FieldLength() {
			return FORWARD_ICA_ONLY_5800_LENGTH;
		}

}
  
