package com.cloudframe.app.sf327010.dto;

/**
*  The class LowServiceTime800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:28. using version 5.0.0.254
**/


import com.cloudframe.app.sf327010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LowServiceTime800 extends LowServiceTime800Serialized {
   
				private LserviceDate800 lserviceDate800 = new LserviceDate800();
				private LserviceTime800 lserviceTime800 = new LserviceTime800();
	
	/**
	* Constructor for LowServiceTime800
	**/
    public LowServiceTime800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			lserviceDate800.setParent(this,getStartOffset() + 0);
	       			lserviceTime800.setParent(this,getStartOffset() + 8);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lserviceDate800
	 *	@return lserviceDate800
	 */   
	 public LserviceDate800 getLserviceDate800() {
   	return lserviceDate800;
   }
   /**
	* 	Update LserviceDate800 with the passed value
	*   Corresponding COBOL Variable is 800-LSERVICE-DATE
	*	@param value
	*/
   public void setLserviceDate800(char[] value) {
      lserviceDate800.setString(value); 
   }   
    
     /**
	 * 	Update LserviceDate800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setLserviceDate800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,lserviceDate800.begin,lserviceDate800.length());
   }
   
     /**
	 * 	Update LserviceDate800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDate800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,lserviceDate800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update LserviceDate800 with another Field
	 *	@param value
	 */
   public void setLserviceDate800(Field source) {
   	replace(source,0,source.length(),lserviceDate800.begin,lserviceDate800.length());
   }  
   
     /**
	 * 	Update LserviceDate800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setLserviceDate800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,lserviceDate800.begin,lserviceDate800.length());
   }
   
     /**
	 * 	Update LserviceDate800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDate800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,lserviceDate800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of lserviceTime800
	 *	@return lserviceTime800
	 */   
	 public LserviceTime800 getLserviceTime800() {
   	return lserviceTime800;
   }
   /**
	* 	Update LserviceTime800 with the passed value
	*   Corresponding COBOL Variable is 800-LSERVICE-TIME
	*	@param value
	*/
   public void setLserviceTime800(char[] value) {
      lserviceTime800.setString(value); 
   }   
    
     /**
	 * 	Update LserviceTime800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setLserviceTime800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,lserviceTime800.begin,lserviceTime800.length());
   }
   
     /**
	 * 	Update LserviceTime800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceTime800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,lserviceTime800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update LserviceTime800 with another Field
	 *	@param value
	 */
   public void setLserviceTime800(Field source) {
   	replace(source,0,source.length(),lserviceTime800.begin,lserviceTime800.length());
   }  
   
     /**
	 * 	Update LserviceTime800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setLserviceTime800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,lserviceTime800.begin,lserviceTime800.length());
   }
   
     /**
	 * 	Update LserviceTime800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceTime800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,lserviceTime800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getLowServiceTime800FieldLength() {
			return LOW_SERVICE_TIME_800_LENGTH;
		}

}
  
