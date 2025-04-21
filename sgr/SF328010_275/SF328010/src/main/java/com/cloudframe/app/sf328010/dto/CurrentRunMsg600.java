package com.cloudframe.app.sf328010.dto;

/**
*  The class CurrentRunMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:58. using version 5.0.0.256
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurrentRunMsg600 extends CurrentRunMsg600Serialized {
   

				private CurrentDate600 currentDate600 = new CurrentDate600();

				private CurrentTime600 currentTime600 = new CurrentTime600();

	
	/**
	* Constructor for CurrentRunMsg600
	**/
    public CurrentRunMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			currentDate600.setParent(this,getStartOffset() + 30);
	       			currentTime600.setParent(this,getStartOffset() + 48);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF328010-0003  CURRENT DATE = ").toCharArray()
             , getStartOffset() + 0
             ,30
             );
       replaceValue( // serialize and save the value
             ("  TIME= ").toCharArray()
             , getStartOffset() + 40
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 56
             ,8
             );
    }


 

	/**
	 *	Returns the value of currentDate600
	 *	@return currentDate600
	 */   
	 public CurrentDate600 getCurrentDate600() {
   	return currentDate600;
   }
   /**
	* 	Update CurrentDate600 with the passed value
	*   Corresponding COBOL Variable is 600-CURRENT-DATE
	*	@param value
	*/
   public void setCurrentDate600(char[] value) {
      currentDate600.setString(value); 
   }   
    
     /**
	 * 	Update CurrentDate600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCurrentDate600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currentDate600.begin,currentDate600.length());
   }
   
     /**
	 * 	Update CurrentDate600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDate600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currentDate600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CurrentDate600 with another Field
	 *	@param value
	 */
   public void setCurrentDate600(Field source) {
   	replace(source,0,source.length(),currentDate600.begin,currentDate600.length());
   }  
   
     /**
	 * 	Update CurrentDate600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCurrentDate600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currentDate600.begin,currentDate600.length());
   }
   
     /**
	 * 	Update CurrentDate600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDate600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currentDate600.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of currentTime600
	 *	@return currentTime600
	 */   
	 public CurrentTime600 getCurrentTime600() {
   	return currentTime600;
   }
   /**
	* 	Update CurrentTime600 with the passed value
	*   Corresponding COBOL Variable is 600-CURRENT-TIME
	*	@param value
	*/
   public void setCurrentTime600(char[] value) {
      currentTime600.setString(value); 
   }   
    
     /**
	 * 	Update CurrentTime600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCurrentTime600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currentTime600.begin,currentTime600.length());
   }
   
     /**
	 * 	Update CurrentTime600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentTime600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currentTime600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CurrentTime600 with another Field
	 *	@param value
	 */
   public void setCurrentTime600(Field source) {
   	replace(source,0,source.length(),currentTime600.begin,currentTime600.length());
   }  
   
     /**
	 * 	Update CurrentTime600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCurrentTime600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currentTime600.begin,currentTime600.length());
   }
   
     /**
	 * 	Update CurrentTime600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentTime600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currentTime600.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCurrentRunMsg600FieldLength() {
			return CURRENT_RUN_MSG_600_LENGTH;
		}

}
  
