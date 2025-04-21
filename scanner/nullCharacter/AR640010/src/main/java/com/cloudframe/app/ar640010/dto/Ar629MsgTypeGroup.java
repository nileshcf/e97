package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar629MsgTypeGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ar629MsgTypeGroup extends Ar629MsgTypeGroupSerialized { 
   

						private char[] ar629MsgType = new char[1];
	
	/**
	* Constructor for Ar629MsgTypeGroup
	**/
    public Ar629MsgTypeGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ar629MsgTypeGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ar629MsgTypeGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setAr629MsgType(("1").toCharArray());
    } 

	/**
	 *	Returns the value of ar629MsgType
	 *	@return ar629MsgType
	 */
   public char[] getAr629MsgType() throws CFException{
     if (isAr629MsgTypeModified()) { 
        ar629MsgType = refreshAr629MsgType();
     }
   		return ar629MsgType;
   }

  
	/**
	*  set variable ar629MsgType
	*  Corresponding COBOL Variable is AR629-MSG-TYPE
	*  @param value
	**/
   public void setAr629MsgType(char[] value) {
      ar629MsgType = checkAr629MsgTypeConstraints(value);
      serializeAr629MsgType(ar629MsgType);
   } 

     /**
	 * 	Update Ar629MsgType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr629MsgType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr629MsgType,ar629MsgType.length);
   	
   }
   
   public void setAr629MsgType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr629MsgType,ar629MsgType.length);
   	
   }
   
     /**
	 * 	Update Ar629MsgType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr629MsgType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr629MsgType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar629MsgType with another Field
	 *	@param value
	 */
   public void setAr629MsgType(Field source) {
       replace(source,0,source.length(),beginAr629MsgType,AR_629_MSG_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ar629MsgType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr629MsgType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr629MsgType,AR_629_MSG_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ar629MsgType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr629MsgType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr629MsgType+targetIndex,targetLen);
    
   }
	char[] ar629MsgTypeNormal8888Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isAr629MsgTypeNormal88()
	 *	@return  Returns true if isAr629MsgTypeNormal88() is "1"
	 */
   public boolean isAr629MsgTypeNormal88() throws CFException {
      return (  compareChars( getAr629MsgType() , ar629MsgTypeNormal8888Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setAr629MsgTypeNormal88True() {  			
    	setAr629MsgType( ar629MsgTypeNormal8888Value);
   	}
	char[] ar629MsgTypeHiScroll8888Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isAr629MsgTypeHiScroll88()
	 *	@return  Returns true if isAr629MsgTypeHiScroll88() is "2"
	 */
   public boolean isAr629MsgTypeHiScroll88() throws CFException {
      return (  compareChars( getAr629MsgType() , ar629MsgTypeHiScroll8888Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setAr629MsgTypeHiScroll88True() {  			
    	setAr629MsgType( ar629MsgTypeHiScroll8888Value);
   	}
	char[] ar629MsgTypeHiNonScr8888Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isAr629MsgTypeHiNonScr88()
	 *	@return  Returns true if isAr629MsgTypeHiNonScr88() is "3"
	 */
   public boolean isAr629MsgTypeHiNonScr88() throws CFException {
      return (  compareChars( getAr629MsgType() , ar629MsgTypeHiNonScr8888Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setAr629MsgTypeHiNonScr88True() {  			
    	setAr629MsgType( ar629MsgTypeHiNonScr8888Value);
   	}

	
	
	

		public static int getAr629MsgTypeGroupFieldLength() {
			return AR_629_MSG_TYPE_GROUP_LENGTH;
		}

}
  
