package com.cloudframe.app.sf311010.dto;

/**
*  The class WorkCompTwo808Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WorkCompTwo808Redefined extends WorkCompTwo808RedefinedSerialized { 
   

						private char[] workCompOneByte808 = Field.fillLowValue(1);
	
	/**
	* Constructor for WorkCompTwo808Redefined
	**/
    public WorkCompTwo808Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WorkCompTwo808Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WorkCompTwo808Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of workCompOneByte808
	 *	@return workCompOneByte808
	 */
   public char[] getWorkCompOneByte808() throws CFException{
     if (isWorkCompOneByte808Modified()) { 
        workCompOneByte808 = refreshWorkCompOneByte808();
     }
   		return workCompOneByte808;
   }

  
	/**
	*  set variable workCompOneByte808
	*  Corresponding COBOL Variable is 808-WORK-COMP-ONE-BYTE
	*  @param value
	**/
   public void setWorkCompOneByte808(char[] value) {
      workCompOneByte808 = checkWorkCompOneByte808Constraints(value);
      serializeWorkCompOneByte808(workCompOneByte808);
   } 

     /**
	 * 	Update WorkCompOneByte808 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWorkCompOneByte808(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWorkCompOneByte808,workCompOneByte808.length);
   	
   }
   
   public void setWorkCompOneByte808(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWorkCompOneByte808,workCompOneByte808.length);
   	
   }
   
     /**
	 * 	Update WorkCompOneByte808 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWorkCompOneByte808(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWorkCompOneByte808+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WorkCompOneByte808 with another Field
	 *	@param value
	 */
   public void setWorkCompOneByte808(Field source) {
       replace(source,0,source.length(),beginWorkCompOneByte808,WORK_COMP_ONE_BYTE_808_LEN);
   	
   }  
   
     /**
	 * 	Update WorkCompOneByte808 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWorkCompOneByte808(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWorkCompOneByte808,WORK_COMP_ONE_BYTE_808_LEN);
   	
   }
   
     /**
	 * 	Update WorkCompOneByte808 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWorkCompOneByte808(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWorkCompOneByte808+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWorkCompTwo808RedefinedFieldLength() {
			return WORK_COMP_TWO_808_REDEFINED_LENGTH;
		}

}
  
