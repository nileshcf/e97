package com.cloudframe.app.tmsmmcpy.dto;

/**
*  The class WorkFieldGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.tmsmmcpy.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class WorkFieldGroup extends WorkFieldGroupSerialized {
   

						private char[] workField = new char[10];

								private BigDecimal workFieldN = BigDecimal.ZERO;
	
	/**
	* Constructor for WorkFieldGroup
	**/
    public WorkFieldGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWorkField(fillSpace(10));
    }


 

	/**
	 *	Returns the value of workField
	 *	@return workField
	 */
   public char[] getWorkField() throws CFException{
     if (isWorkFieldModified()) { 
        workField = refreshWorkField();
     }
   		return workField;
   }

  
	/**
	*  set variable workField
	*  Corresponding COBOL Variable is WS-WORK-FIELD
	*  @param value
	**/
   public void setWorkField(char[] value) {
      workField = checkWorkFieldConstraints(value);
      serializeWorkField(workField);
   } 

     /**
	 * 	Update WorkField 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWorkField(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWorkField,workField.length);
   	
   }
   
   public void setWorkField(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWorkField,workField.length);
   	
   }
   
     /**
	 * 	Update WorkField 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWorkField(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWorkField+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WorkField with another Field
	 *	@param value
	 */
   public void setWorkField(Field source) {
       replace(source,0,source.length(),beginWorkField,WORK_FIELD_LEN);
   	
   }  
   
     /**
	 * 	Update WorkField 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWorkField(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWorkField,WORK_FIELD_LEN);
   	
   }
   
     /**
	 * 	Update WorkField 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWorkField(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWorkField+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of workFieldN
	 *	@return workFieldN
	 */
	public BigDecimal getWorkFieldN() throws CFException {
       if (isWorkFieldNModified()) { 
           workFieldN = refreshWorkFieldN();
        }
   		return workFieldN;
	}
	

	
	   
	/**
	 * 	Update WorkFieldN with the passed number
	 *  Corresponding COBOL Variable is WS-WORK-FIELD-N
	 *	@param number
	 */
	public void setWorkFieldN(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       workFieldN = checkWorkFieldNMaxLimit(number);
	    serializeWorkFieldN(workFieldN);
   }
	/**
	 * 	Update WorkFieldN with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkFieldN(char[] value) throws CFException {
		 workFieldN = serializeWorkFieldN(value);
	}   

	
	
	

		public static int getWorkFieldGroupFieldLength() {
			return WORK_FIELD_GROUP_LENGTH;
		}

}
  
