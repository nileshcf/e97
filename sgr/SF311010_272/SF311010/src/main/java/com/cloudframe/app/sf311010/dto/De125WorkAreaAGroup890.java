package com.cloudframe.app.sf311010.dto;

/**
*  The class De125WorkAreaAGroup890 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class De125WorkAreaAGroup890 extends De125WorkAreaAGroup890Serialized {
   
					private De125WorkAreaA890 de125WorkAreaA890 = new De125WorkAreaA890();
					private De125WorkAreaB891 de125WorkAreaB891 = new De125WorkAreaB891();
	
	/**
	* Constructor for De125WorkAreaAGroup890
	**/
    public De125WorkAreaAGroup890() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			de125WorkAreaA890.setParent(this,getStartOffset() + 0);
	       			de125WorkAreaB891.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of de125WorkAreaA890
	 *	@return de125WorkAreaA890
	 */   
	 public De125WorkAreaA890 getDe125WorkAreaA890() {
   	return de125WorkAreaA890;
   }
   /**
	* 	Update De125WorkAreaA890 with the passed value
	*   Corresponding COBOL Variable is 890-DE125-WORK-AREA-A
	*	@param value
	*/
   public void setDe125WorkAreaA890(char[] value) {
      de125WorkAreaA890.setString(value); 
   }   
    
     /**
	 * 	Update De125WorkAreaA890 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDe125WorkAreaA890(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,de125WorkAreaA890.begin,de125WorkAreaA890.length());
   }
   
     /**
	 * 	Update De125WorkAreaA890 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe125WorkAreaA890(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,de125WorkAreaA890.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update De125WorkAreaA890 with another Field
	 *	@param value
	 */
   public void setDe125WorkAreaA890(Field source) {
   	replace(source,0,source.length(),de125WorkAreaA890.begin,de125WorkAreaA890.length());
   }  
   
     /**
	 * 	Update De125WorkAreaA890 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDe125WorkAreaA890(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,de125WorkAreaA890.begin,de125WorkAreaA890.length());
   }
   
     /**
	 * 	Update De125WorkAreaA890 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe125WorkAreaA890(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,de125WorkAreaA890.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of de125WorkAreaB891
	 *	@return de125WorkAreaB891
	 */   
	 public De125WorkAreaB891 getDe125WorkAreaB891() {
   	return de125WorkAreaB891;
   }
   /**
	* 	Update De125WorkAreaB891 with the passed value
	*   Corresponding COBOL Variable is 891-DE125-WORK-AREA-B
	*	@param value
	*/
   public void setDe125WorkAreaB891(char[] value) {
      de125WorkAreaB891.setString(value); 
   }   
    
     /**
	 * 	Update De125WorkAreaB891 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDe125WorkAreaB891(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,de125WorkAreaB891.begin,de125WorkAreaB891.length());
   }
   
     /**
	 * 	Update De125WorkAreaB891 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe125WorkAreaB891(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,de125WorkAreaB891.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update De125WorkAreaB891 with another Field
	 *	@param value
	 */
   public void setDe125WorkAreaB891(Field source) {
   	replace(source,0,source.length(),de125WorkAreaB891.begin,de125WorkAreaB891.length());
   }  
   
     /**
	 * 	Update De125WorkAreaB891 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDe125WorkAreaB891(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,de125WorkAreaB891.begin,de125WorkAreaB891.length());
   }
   
     /**
	 * 	Update De125WorkAreaB891 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe125WorkAreaB891(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,de125WorkAreaB891.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDe125WorkAreaAGroup890FieldLength() {
			return DE_125_WORK_AREA_AGROUP_890_LENGTH;
		}

}
  
