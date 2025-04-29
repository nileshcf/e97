package com.cloudframe.app.sf311010.dto;

/**
*  The class WorkAcqIca800Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WorkAcqIca800Redefined extends WorkAcqIca800RedefinedSerialized { 
   
				private AcqIcaOnly5800 acqIcaOnly5800 = new AcqIcaOnly5800();
	
	/**
	* Constructor for WorkAcqIca800Redefined
	**/
    public WorkAcqIca800Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WorkAcqIca800Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WorkAcqIca800Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			acqIcaOnly5800.setParent(this,getStartOffset() + 1);
    } 

	/**
	 *	Returns the value of acqIcaOnly5800
	 *	@return acqIcaOnly5800
	 */   
	 public AcqIcaOnly5800 getAcqIcaOnly5800() {
   	return acqIcaOnly5800;
   }
   /**
	* 	Update AcqIcaOnly5800 with the passed value
	*   Corresponding COBOL Variable is 800-ACQ-ICA-ONLY5
	*	@param value
	*/
   public void setAcqIcaOnly5800(char[] value) {
      acqIcaOnly5800.setString(value); 
   }   
    
     /**
	 * 	Update AcqIcaOnly5800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAcqIcaOnly5800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,acqIcaOnly5800.begin,acqIcaOnly5800.length());
   }
   
     /**
	 * 	Update AcqIcaOnly5800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcqIcaOnly5800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,acqIcaOnly5800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AcqIcaOnly5800 with another Field
	 *	@param value
	 */
   public void setAcqIcaOnly5800(Field source) {
   	replace(source,0,source.length(),acqIcaOnly5800.begin,acqIcaOnly5800.length());
   }  
   
     /**
	 * 	Update AcqIcaOnly5800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAcqIcaOnly5800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,acqIcaOnly5800.begin,acqIcaOnly5800.length());
   }
   
     /**
	 * 	Update AcqIcaOnly5800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcqIcaOnly5800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,acqIcaOnly5800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWorkAcqIca800RedefinedFieldLength() {
			return WORK_ACQ_ICA_800_REDEFINED_LENGTH;
		}

}
  
