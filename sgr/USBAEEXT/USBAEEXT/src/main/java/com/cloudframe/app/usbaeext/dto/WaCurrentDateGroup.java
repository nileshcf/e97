package com.cloudframe.app.usbaeext.dto;

/**
*  The class WaCurrentDateGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.usbaeext.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WaCurrentDateGroup extends WaCurrentDateGroupSerialized {
   

						private char[] waCurrentDate = new char[21];
					private WaCurrentDateRedefined waCurrentDateRedefined = new WaCurrentDateRedefined();
	
	/**
	* Constructor for WaCurrentDateGroup
	**/
    public WaCurrentDateGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			waCurrentDateRedefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setWaCurrentDate(fillSpace(21));
    }


 

	/**
	 *	Returns the value of waCurrentDate
	 *	@return waCurrentDate
	 */
   public char[] getWaCurrentDate() throws CFException{
     if (isWaCurrentDateModified()) { 
        waCurrentDate = refreshWaCurrentDate();
     }
   		return waCurrentDate;
   }

  
	/**
	*  set variable waCurrentDate
	*  Corresponding COBOL Variable is WA-CURRENT-DATE
	*  @param value
	**/
   public void setWaCurrentDate(char[] value) {
      waCurrentDate = checkWaCurrentDateConstraints(value);
      serializeWaCurrentDate(waCurrentDate);
   } 

     /**
	 * 	Update WaCurrentDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWaCurrentDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWaCurrentDate,waCurrentDate.length);
   	
   }
   
   public void setWaCurrentDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWaCurrentDate,waCurrentDate.length);
   	
   }
   
     /**
	 * 	Update WaCurrentDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaCurrentDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaCurrentDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WaCurrentDate with another Field
	 *	@param value
	 */
   public void setWaCurrentDate(Field source) {
       replace(source,0,source.length(),beginWaCurrentDate,WA_CURRENT_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update WaCurrentDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWaCurrentDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWaCurrentDate,WA_CURRENT_DATE_LEN);
   	
   }
   
     /**
	 * 	Update WaCurrentDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaCurrentDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWaCurrentDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of waCurrentDateRedefined
	 *	@return waCurrentDateRedefined
	 */   
	 public WaCurrentDateRedefined getWaCurrentDateRedefined() {
   	return waCurrentDateRedefined;
   }
   /**
	* 	Update WaCurrentDateRedefined with the passed value
	*   Corresponding COBOL Variable is WA-CURRENT-DATE-REDEFINED
	*	@param value
	*/
   public void setWaCurrentDateRedefined(char[] value) {
      waCurrentDateRedefined.setString(value); 
   }   
    
     /**
	 * 	Update WaCurrentDateRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWaCurrentDateRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,waCurrentDateRedefined.begin,waCurrentDateRedefined.length());
   }
   
     /**
	 * 	Update WaCurrentDateRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWaCurrentDateRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,waCurrentDateRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WaCurrentDateRedefined with another Field
	 *	@param value
	 */
   public void setWaCurrentDateRedefined(Field source) {
   	replace(source,0,source.length(),waCurrentDateRedefined.begin,waCurrentDateRedefined.length());
   }  
   
     /**
	 * 	Update WaCurrentDateRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWaCurrentDateRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,waCurrentDateRedefined.begin,waCurrentDateRedefined.length());
   }
   
     /**
	 * 	Update WaCurrentDateRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWaCurrentDateRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,waCurrentDateRedefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWaCurrentDateGroupFieldLength() {
			return WA_CURRENT_DATE_GROUP_LENGTH;
		}

}
  
