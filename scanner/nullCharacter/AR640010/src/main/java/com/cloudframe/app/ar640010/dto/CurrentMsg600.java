package com.cloudframe.app.ar640010.dto;

/**
*  The class CurrentMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurrentMsg600 extends CurrentMsg600Serialized { 
   


						private char[] currentDate600 = new char[10];


						private char[] currentTime600 = new char[8];
	
	/**
	* Constructor for CurrentMsg600
	**/
    public CurrentMsg600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CurrentMsg600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentMsg600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("0002-CURRENT DATE: ").toCharArray()
             , getStartOffset() + 0
             ,19
             );
								setCurrentDate600(fillSpace(10));
       replaceValue( // serialize and save the value
             (", TIME: ").toCharArray()
             , getStartOffset() + 29
             ,8
             );
								setCurrentTime600(fillSpace(8));
    } 

	/**
	 *	Returns the value of currentDate600
	 *	@return currentDate600
	 */
   public char[] getCurrentDate600() throws CFException{
     if (isCurrentDate600Modified()) { 
        currentDate600 = refreshCurrentDate600();
     }
   		return currentDate600;
   }

  
	/**
	*  set variable currentDate600
	*  Corresponding COBOL Variable is 600-CURRENT-DATE
	*  @param value
	**/
   public void setCurrentDate600(char[] value) {
      currentDate600 = checkCurrentDate600Constraints(value);
      serializeCurrentDate600(currentDate600);
   } 

     /**
	 * 	Update CurrentDate600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentDate600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrentDate600,currentDate600.length);
   	
   }
   
   public void setCurrentDate600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentDate600,currentDate600.length);
   	
   }
   
     /**
	 * 	Update CurrentDate600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDate600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentDate600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrentDate600 with another Field
	 *	@param value
	 */
   public void setCurrentDate600(Field source) {
       replace(source,0,source.length(),beginCurrentDate600,CURRENT_DATE_600_LEN);
   	
   }  
   
     /**
	 * 	Update CurrentDate600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentDate600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrentDate600,CURRENT_DATE_600_LEN);
   	
   }
   
     /**
	 * 	Update CurrentDate600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDate600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentDate600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currentTime600
	 *	@return currentTime600
	 */
   public char[] getCurrentTime600() throws CFException{
     if (isCurrentTime600Modified()) { 
        currentTime600 = refreshCurrentTime600();
     }
   		return currentTime600;
   }

  
	/**
	*  set variable currentTime600
	*  Corresponding COBOL Variable is 600-CURRENT-TIME
	*  @param value
	**/
   public void setCurrentTime600(char[] value) {
      currentTime600 = checkCurrentTime600Constraints(value);
      serializeCurrentTime600(currentTime600);
   } 

     /**
	 * 	Update CurrentTime600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentTime600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrentTime600,currentTime600.length);
   	
   }
   
   public void setCurrentTime600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentTime600,currentTime600.length);
   	
   }
   
     /**
	 * 	Update CurrentTime600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentTime600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentTime600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrentTime600 with another Field
	 *	@param value
	 */
   public void setCurrentTime600(Field source) {
       replace(source,0,source.length(),beginCurrentTime600,CURRENT_TIME_600_LEN);
   	
   }  
   
     /**
	 * 	Update CurrentTime600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentTime600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrentTime600,CURRENT_TIME_600_LEN);
   	
   }
   
     /**
	 * 	Update CurrentTime600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentTime600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrentTime600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCurrentMsg600FieldLength() {
			return CURRENT_MSG_600_LENGTH;
		}

}
  
