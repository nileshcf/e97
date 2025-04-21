package com.cloudframe.app.sf311010.dto;

/**
*  The class AcqIcaOnly5800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AcqIcaOnly5800 extends AcqIcaOnly5800Serialized { 
   

						private char[] acqIcaOnly4800 = Field.fillLowValue(4);
	
	/**
	* Constructor for AcqIcaOnly5800
	**/
    public AcqIcaOnly5800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AcqIcaOnly5800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcqIcaOnly5800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of acqIcaOnly4800
	 *	@return acqIcaOnly4800
	 */
   public char[] getAcqIcaOnly4800() throws CFException{
     if (isAcqIcaOnly4800Modified()) { 
        acqIcaOnly4800 = refreshAcqIcaOnly4800();
     }
   		return acqIcaOnly4800;
   }

  
	/**
	*  set variable acqIcaOnly4800
	*  Corresponding COBOL Variable is 800-ACQ-ICA-ONLY4
	*  @param value
	**/
   public void setAcqIcaOnly4800(char[] value) {
      acqIcaOnly4800 = checkAcqIcaOnly4800Constraints(value);
      serializeAcqIcaOnly4800(acqIcaOnly4800);
   } 

     /**
	 * 	Update AcqIcaOnly4800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcqIcaOnly4800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcqIcaOnly4800,acqIcaOnly4800.length);
   	
   }
   
   public void setAcqIcaOnly4800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcqIcaOnly4800,acqIcaOnly4800.length);
   	
   }
   
     /**
	 * 	Update AcqIcaOnly4800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcqIcaOnly4800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcqIcaOnly4800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcqIcaOnly4800 with another Field
	 *	@param value
	 */
   public void setAcqIcaOnly4800(Field source) {
       replace(source,0,source.length(),beginAcqIcaOnly4800,ACQ_ICA_ONLY_4800_LEN);
   	
   }  
   
     /**
	 * 	Update AcqIcaOnly4800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcqIcaOnly4800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcqIcaOnly4800,ACQ_ICA_ONLY_4800_LEN);
   	
   }
   
     /**
	 * 	Update AcqIcaOnly4800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcqIcaOnly4800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcqIcaOnly4800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAcqIcaOnly5800FieldLength() {
			return ACQ_ICA_ONLY_5800_LENGTH;
		}

}
  
