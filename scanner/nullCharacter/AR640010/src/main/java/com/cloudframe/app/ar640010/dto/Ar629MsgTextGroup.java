package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar629MsgTextGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ar629MsgTextGroup extends Ar629MsgTextGroupSerialized { 
   

						private char[] ar629MsgText = new char[115];
	
	/**
	* Constructor for Ar629MsgTextGroup
	**/
    public Ar629MsgTextGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ar629MsgTextGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ar629MsgTextGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setAr629MsgText(pad(115," ".toCharArray(),' ',RIGHT_PAD));
    } 

	/**
	 *	Returns the value of ar629MsgText
	 *	@return ar629MsgText
	 */
   public char[] getAr629MsgText() throws CFException{
     if (isAr629MsgTextModified()) { 
        ar629MsgText = refreshAr629MsgText();
     }
   		return ar629MsgText;
   }

  
	/**
	*  set variable ar629MsgText
	*  Corresponding COBOL Variable is AR629-MSG-TEXT
	*  @param value
	**/
   public void setAr629MsgText(char[] value) {
      ar629MsgText = checkAr629MsgTextConstraints(value);
      serializeAr629MsgText(ar629MsgText);
   } 

     /**
	 * 	Update Ar629MsgText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr629MsgText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr629MsgText,ar629MsgText.length);
   	
   }
   
   public void setAr629MsgText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr629MsgText,ar629MsgText.length);
   	
   }
   
     /**
	 * 	Update Ar629MsgText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr629MsgText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr629MsgText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar629MsgText with another Field
	 *	@param value
	 */
   public void setAr629MsgText(Field source) {
       replace(source,0,source.length(),beginAr629MsgText,AR_629_MSG_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update Ar629MsgText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr629MsgText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr629MsgText,AR_629_MSG_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update Ar629MsgText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr629MsgText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr629MsgText+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAr629MsgTextGroupFieldLength() {
			return AR_629_MSG_TEXT_GROUP_LENGTH;
		}

}
  
