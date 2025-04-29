package com.cloudframe.app.sf320010.dto;

/**
*  The class RpC8Heading6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpC8Heading6 extends RpC8Heading6Serialized {
   



						private char[] rpC8H6Alert = Field.fillLowValue(8);



						private char[] rpC8H6MsgArea = Field.fillLowValue(80);
	
	/**
	* Constructor for RpC8Heading6
	**/
    public RpC8Heading6() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 1
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 15
             ,5
             );
       replaceValue( // serialize and save the value
             ("OPERATOR INPUT / SYSTEM OUTPUT - ").toCharArray()
             , getStartOffset() + 20
             ,33
             );
    }


 

	/**
	 *	Returns the value of rpC8H6Alert
	 *	@return rpC8H6Alert
	 */
   public char[] getRpC8H6Alert() throws CFException{
     if (isRpC8H6AlertModified()) { 
        rpC8H6Alert = refreshRpC8H6Alert();
     }
   		return rpC8H6Alert;
   }

  
	/**
	*  set variable rpC8H6Alert
	*  Corresponding COBOL Variable is RP-C8-H6-ALERT
	*  @param value
	**/
   public void setRpC8H6Alert(char[] value) {
      rpC8H6Alert = checkRpC8H6AlertConstraints(value);
      serializeRpC8H6Alert(rpC8H6Alert);
   } 

     /**
	 * 	Update RpC8H6Alert 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC8H6Alert(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC8H6Alert,rpC8H6Alert.length);
   	
   }
   
   public void setRpC8H6Alert(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8H6Alert,rpC8H6Alert.length);
   	
   }
   
     /**
	 * 	Update RpC8H6Alert 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC8H6Alert(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8H6Alert+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC8H6Alert with another Field
	 *	@param value
	 */
   public void setRpC8H6Alert(Field source) {
       replace(source,0,source.length(),beginRpC8H6Alert,RP_C_8_H_6_ALERT_LEN);
   	
   }  
   
     /**
	 * 	Update RpC8H6Alert 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC8H6Alert(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC8H6Alert,RP_C_8_H_6_ALERT_LEN);
   	
   }
   
     /**
	 * 	Update RpC8H6Alert 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC8H6Alert(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8H6Alert+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC8H6MsgArea
	 *	@return rpC8H6MsgArea
	 */
   public char[] getRpC8H6MsgArea() throws CFException{
     if (isRpC8H6MsgAreaModified()) { 
        rpC8H6MsgArea = refreshRpC8H6MsgArea();
     }
   		return rpC8H6MsgArea;
   }

  
	/**
	*  set variable rpC8H6MsgArea
	*  Corresponding COBOL Variable is RP-C8-H6-MSG-AREA
	*  @param value
	**/
   public void setRpC8H6MsgArea(char[] value) {
      rpC8H6MsgArea = checkRpC8H6MsgAreaConstraints(value);
      serializeRpC8H6MsgArea(rpC8H6MsgArea);
   } 

     /**
	 * 	Update RpC8H6MsgArea 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC8H6MsgArea(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC8H6MsgArea,rpC8H6MsgArea.length);
   	
   }
   
   public void setRpC8H6MsgArea(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8H6MsgArea,rpC8H6MsgArea.length);
   	
   }
   
     /**
	 * 	Update RpC8H6MsgArea 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC8H6MsgArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8H6MsgArea+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC8H6MsgArea with another Field
	 *	@param value
	 */
   public void setRpC8H6MsgArea(Field source) {
       replace(source,0,source.length(),beginRpC8H6MsgArea,RP_C_8_H_6_MSG_AREA_LEN);
   	
   }  
   
     /**
	 * 	Update RpC8H6MsgArea 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC8H6MsgArea(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC8H6MsgArea,RP_C_8_H_6_MSG_AREA_LEN);
   	
   }
   
     /**
	 * 	Update RpC8H6MsgArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC8H6MsgArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC8H6MsgArea+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpC8Heading6FieldLength() {
			return RP_C_8_HEADING_6_LENGTH;
		}

}
  
