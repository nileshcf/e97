package com.cloudframe.app.sf311010.dto;

/**
*  The class WorkCompTwoGroup808 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WorkCompTwoGroup808 extends WorkCompTwoGroup808Serialized { 
   

								private int workCompTwo808;
					private WorkCompTwo808Redefined workCompTwo808Redefined = new WorkCompTwo808Redefined();
	
	/**
	* Constructor for WorkCompTwoGroup808
	**/
    public WorkCompTwoGroup808() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			workCompTwo808Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of workCompTwo808
	 *	@return workCompTwo808
	 */
	public int getWorkCompTwo808() throws CFException {
        if (isWorkCompTwo808Modified()) { 
           workCompTwo808 = refreshWorkCompTwo808();
        }
   		return workCompTwo808;
	}
	
	/**
	 * 	Update WorkCompTwo808 with the passed value
	 *  Corresponding COBOL Variable is 808-WORK-COMP-TWO
	 *	@param number
	 */
	public void setWorkCompTwo808(int number) {
	     // Truncate if the number is beyond +/- Max range
	    workCompTwo808 = checkWorkCompTwo808MaxLimit(number); 
		serializeWorkCompTwo808(workCompTwo808);
	}


	public void setWorkCompTwo808(long number) {
	    number = checkWorkCompTwo808MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWorkCompTwo808((int)number);
	}
	
	/**
	 *	Returns the value of workCompTwo808Redefined
	 *	@return workCompTwo808Redefined
	 */   
	 public WorkCompTwo808Redefined getWorkCompTwo808Redefined() {
   	return workCompTwo808Redefined;
   }
   /**
	* 	Update WorkCompTwo808Redefined with the passed value
	*   Corresponding COBOL Variable is 808-WORK-COMP-TWO-REDEFINED
	*	@param value
	*/
   public void setWorkCompTwo808Redefined(char[] value) {
      workCompTwo808Redefined.setString(value); 
   }   
    
     /**
	 * 	Update WorkCompTwo808Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWorkCompTwo808Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,workCompTwo808Redefined.begin,workCompTwo808Redefined.length());
   }
   
     /**
	 * 	Update WorkCompTwo808Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWorkCompTwo808Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,workCompTwo808Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WorkCompTwo808Redefined with another Field
	 *	@param value
	 */
   public void setWorkCompTwo808Redefined(Field source) {
   	replace(source,0,source.length(),workCompTwo808Redefined.begin,workCompTwo808Redefined.length());
   }  
   
     /**
	 * 	Update WorkCompTwo808Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWorkCompTwo808Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,workCompTwo808Redefined.begin,workCompTwo808Redefined.length());
   }
   
     /**
	 * 	Update WorkCompTwo808Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWorkCompTwo808Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,workCompTwo808Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWorkCompTwoGroup808FieldLength() {
			return WORK_COMP_TWO_GROUP_808_LENGTH;
		}

}
  
