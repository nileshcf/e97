package com.cloudframe.app.sf311010.dto;

/**
*  The class WorkFwdIca800Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WorkFwdIca800Redefined extends WorkFwdIca800RedefinedSerialized { 
   
				private FwdIcaOnly5800 fwdIcaOnly5800 = new FwdIcaOnly5800();
	
	/**
	* Constructor for WorkFwdIca800Redefined
	**/
    public WorkFwdIca800Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WorkFwdIca800Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WorkFwdIca800Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			fwdIcaOnly5800.setParent(this,getStartOffset() + 1);
    } 

	/**
	 *	Returns the value of fwdIcaOnly5800
	 *	@return fwdIcaOnly5800
	 */   
	 public FwdIcaOnly5800 getFwdIcaOnly5800() {
   	return fwdIcaOnly5800;
   }
   /**
	* 	Update FwdIcaOnly5800 with the passed value
	*   Corresponding COBOL Variable is 800-FWD-ICA-ONLY5
	*	@param value
	*/
   public void setFwdIcaOnly5800(char[] value) {
      fwdIcaOnly5800.setString(value); 
   }   
    
     /**
	 * 	Update FwdIcaOnly5800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFwdIcaOnly5800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fwdIcaOnly5800.begin,fwdIcaOnly5800.length());
   }
   
     /**
	 * 	Update FwdIcaOnly5800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFwdIcaOnly5800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fwdIcaOnly5800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FwdIcaOnly5800 with another Field
	 *	@param value
	 */
   public void setFwdIcaOnly5800(Field source) {
   	replace(source,0,source.length(),fwdIcaOnly5800.begin,fwdIcaOnly5800.length());
   }  
   
     /**
	 * 	Update FwdIcaOnly5800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFwdIcaOnly5800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fwdIcaOnly5800.begin,fwdIcaOnly5800.length());
   }
   
     /**
	 * 	Update FwdIcaOnly5800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFwdIcaOnly5800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fwdIcaOnly5800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWorkFwdIca800RedefinedFieldLength() {
			return WORK_FWD_ICA_800_REDEFINED_LENGTH;
		}

}
  
