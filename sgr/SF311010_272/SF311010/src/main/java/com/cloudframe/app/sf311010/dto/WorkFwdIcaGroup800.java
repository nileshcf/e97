package com.cloudframe.app.sf311010.dto;

/**
*  The class WorkFwdIcaGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WorkFwdIcaGroup800 extends WorkFwdIcaGroup800Serialized {
   

								private long workFwdIca800;
					private WorkFwdIca800Redefined workFwdIca800Redefined = new WorkFwdIca800Redefined();
	
	/**
	* Constructor for WorkFwdIcaGroup800
	**/
    public WorkFwdIcaGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			workFwdIca800Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of workFwdIca800
	 *	@return workFwdIca800
	 */
	public long getWorkFwdIca800() throws CFException {
       if (isWorkFwdIca800Modified()) { 
           workFwdIca800 = refreshWorkFwdIca800();
        }
   		return workFwdIca800;
	}
	

	
	   
	/**
	 * 	Update WorkFwdIca800 with the passed value
	 *  Corresponding COBOL Variable is 800-WORK-FWD-ICA
	 *	@param number
	 */
	public void setWorkFwdIca800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    workFwdIca800 = checkWorkFwdIca800MaxLimit(number); 
		serializeWorkFwdIca800(workFwdIca800);
	}
	

	/**
	 * 	Update WorkFwdIca800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkFwdIca800(char[] value) throws CFException {
		 workFwdIca800 = serializeWorkFwdIca800(value);
	}
	/**
	 * 	Update WorkFwdIca800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkFwdIca800String(char[] value) throws CFException {
		 setWorkFwdIca800(value);
	}
	/**
	 *	Returns the value of workFwdIca800Redefined
	 *	@return workFwdIca800Redefined
	 */   
	 public WorkFwdIca800Redefined getWorkFwdIca800Redefined() {
   	return workFwdIca800Redefined;
   }
   /**
	* 	Update WorkFwdIca800Redefined with the passed value
	*   Corresponding COBOL Variable is 800-WORK-FWD-ICA-REDEFINED
	*	@param value
	*/
   public void setWorkFwdIca800Redefined(char[] value) {
      workFwdIca800Redefined.setString(value); 
   }   
    
     /**
	 * 	Update WorkFwdIca800Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWorkFwdIca800Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,workFwdIca800Redefined.begin,workFwdIca800Redefined.length());
   }
   
     /**
	 * 	Update WorkFwdIca800Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWorkFwdIca800Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,workFwdIca800Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WorkFwdIca800Redefined with another Field
	 *	@param value
	 */
   public void setWorkFwdIca800Redefined(Field source) {
   	replace(source,0,source.length(),workFwdIca800Redefined.begin,workFwdIca800Redefined.length());
   }  
   
     /**
	 * 	Update WorkFwdIca800Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWorkFwdIca800Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,workFwdIca800Redefined.begin,workFwdIca800Redefined.length());
   }
   
     /**
	 * 	Update WorkFwdIca800Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWorkFwdIca800Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,workFwdIca800Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWorkFwdIcaGroup800FieldLength() {
			return WORK_FWD_ICA_GROUP_800_LENGTH;
		}

}
  
