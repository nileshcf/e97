package com.cloudframe.app.sf311010.dto;

/**
*  The class AcquirerIcaOnly5800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AcquirerIcaOnly5800 extends AcquirerIcaOnly5800Serialized { 
   

						private char[] acquirerIcaOnly4800 = Field.fillLowValue(4);

						private char[] acqFiller1800 = Field.fillLowValue(1);
	
	/**
	* Constructor for AcquirerIcaOnly5800
	**/
    public AcquirerIcaOnly5800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AcquirerIcaOnly5800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcquirerIcaOnly5800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of acquirerIcaOnly4800
	 *	@return acquirerIcaOnly4800
	 */
   public char[] getAcquirerIcaOnly4800() throws CFException{
     if (isAcquirerIcaOnly4800Modified()) { 
        acquirerIcaOnly4800 = refreshAcquirerIcaOnly4800();
     }
   		return acquirerIcaOnly4800;
   }

  
	/**
	*  set variable acquirerIcaOnly4800
	*  Corresponding COBOL Variable is 800-ACQUIRER-ICA-ONLY4
	*  @param value
	**/
   public void setAcquirerIcaOnly4800(char[] value) {
      acquirerIcaOnly4800 = checkAcquirerIcaOnly4800Constraints(value);
      serializeAcquirerIcaOnly4800(acquirerIcaOnly4800);
   } 

     /**
	 * 	Update AcquirerIcaOnly4800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcquirerIcaOnly4800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcquirerIcaOnly4800,acquirerIcaOnly4800.length);
   	
   }
   
   public void setAcquirerIcaOnly4800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcquirerIcaOnly4800,acquirerIcaOnly4800.length);
   	
   }
   
     /**
	 * 	Update AcquirerIcaOnly4800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcquirerIcaOnly4800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcquirerIcaOnly4800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcquirerIcaOnly4800 with another Field
	 *	@param value
	 */
   public void setAcquirerIcaOnly4800(Field source) {
       replace(source,0,source.length(),beginAcquirerIcaOnly4800,ACQUIRER_ICA_ONLY_4800_LEN);
   	
   }  
   
     /**
	 * 	Update AcquirerIcaOnly4800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcquirerIcaOnly4800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcquirerIcaOnly4800,ACQUIRER_ICA_ONLY_4800_LEN);
   	
   }
   
     /**
	 * 	Update AcquirerIcaOnly4800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcquirerIcaOnly4800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcquirerIcaOnly4800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of acqFiller1800
	 *	@return acqFiller1800
	 */
   public char[] getAcqFiller1800() throws CFException{
     if (isAcqFiller1800Modified()) { 
        acqFiller1800 = refreshAcqFiller1800();
     }
   		return acqFiller1800;
   }

  
	/**
	*  set variable acqFiller1800
	*  Corresponding COBOL Variable is 800-ACQ-FILLER-1
	*  @param value
	**/
   public void setAcqFiller1800(char[] value) {
      acqFiller1800 = checkAcqFiller1800Constraints(value);
      serializeAcqFiller1800(acqFiller1800);
   } 

     /**
	 * 	Update AcqFiller1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcqFiller1800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcqFiller1800,acqFiller1800.length);
   	
   }
   
   public void setAcqFiller1800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcqFiller1800,acqFiller1800.length);
   	
   }
   
     /**
	 * 	Update AcqFiller1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcqFiller1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcqFiller1800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcqFiller1800 with another Field
	 *	@param value
	 */
   public void setAcqFiller1800(Field source) {
       replace(source,0,source.length(),beginAcqFiller1800,ACQ_FILLER_1800_LEN);
   	
   }  
   
     /**
	 * 	Update AcqFiller1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcqFiller1800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcqFiller1800,ACQ_FILLER_1800_LEN);
   	
   }
   
     /**
	 * 	Update AcqFiller1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcqFiller1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcqFiller1800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAcquirerIcaOnly5800FieldLength() {
			return ACQUIRER_ICA_ONLY_5800_LENGTH;
		}

}
  
