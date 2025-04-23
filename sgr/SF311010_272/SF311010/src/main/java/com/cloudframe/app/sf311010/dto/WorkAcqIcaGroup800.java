package com.cloudframe.app.sf311010.dto;

/**
*  The class WorkAcqIcaGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WorkAcqIcaGroup800 extends WorkAcqIcaGroup800Serialized {
   

								private long workAcqIca800;
					private WorkAcqIca800Redefined workAcqIca800Redefined = new WorkAcqIca800Redefined();
	
	/**
	* Constructor for WorkAcqIcaGroup800
	**/
    public WorkAcqIcaGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			workAcqIca800Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of workAcqIca800
	 *	@return workAcqIca800
	 */
	public long getWorkAcqIca800() throws CFException {
       if (isWorkAcqIca800Modified()) { 
           workAcqIca800 = refreshWorkAcqIca800();
        }
   		return workAcqIca800;
	}
	

	
	   
	/**
	 * 	Update WorkAcqIca800 with the passed value
	 *  Corresponding COBOL Variable is 800-WORK-ACQ-ICA
	 *	@param number
	 */
	public void setWorkAcqIca800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    workAcqIca800 = checkWorkAcqIca800MaxLimit(number); 
		serializeWorkAcqIca800(workAcqIca800);
	}
	

	/**
	 * 	Update WorkAcqIca800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkAcqIca800(char[] value) throws CFException {
		 workAcqIca800 = serializeWorkAcqIca800(value);
	}
	/**
	 * 	Update WorkAcqIca800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkAcqIca800String(char[] value) throws CFException {
		 setWorkAcqIca800(value);
	}
	/**
	 *	Returns the value of workAcqIca800Redefined
	 *	@return workAcqIca800Redefined
	 */   
	 public WorkAcqIca800Redefined getWorkAcqIca800Redefined() {
   	return workAcqIca800Redefined;
   }
   /**
	* 	Update WorkAcqIca800Redefined with the passed value
	*   Corresponding COBOL Variable is 800-WORK-ACQ-ICA-REDEFINED
	*	@param value
	*/
   public void setWorkAcqIca800Redefined(char[] value) {
      workAcqIca800Redefined.setString(value); 
   }   
    
     /**
	 * 	Update WorkAcqIca800Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWorkAcqIca800Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,workAcqIca800Redefined.begin,workAcqIca800Redefined.length());
   }
   
     /**
	 * 	Update WorkAcqIca800Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWorkAcqIca800Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,workAcqIca800Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WorkAcqIca800Redefined with another Field
	 *	@param value
	 */
   public void setWorkAcqIca800Redefined(Field source) {
   	replace(source,0,source.length(),workAcqIca800Redefined.begin,workAcqIca800Redefined.length());
   }  
   
     /**
	 * 	Update WorkAcqIca800Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWorkAcqIca800Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,workAcqIca800Redefined.begin,workAcqIca800Redefined.length());
   }
   
     /**
	 * 	Update WorkAcqIca800Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWorkAcqIca800Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,workAcqIca800Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWorkAcqIcaGroup800FieldLength() {
			return WORK_ACQ_ICA_GROUP_800_LENGTH;
		}

}
  
