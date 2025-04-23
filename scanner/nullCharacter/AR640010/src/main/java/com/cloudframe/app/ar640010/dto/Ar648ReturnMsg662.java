package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar648ReturnMsg662 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class Ar648ReturnMsg662 extends Ar648ReturnMsg662Serialized {
   


								private char[] ar648ReturnCode662 = new char[5];
							

							private char[] ar648ReturnMsg662ConditionGroup2 = new char[47];
						
	
	/**
	* Constructor for Ar648ReturnMsg662
	**/
    public Ar648ReturnMsg662() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("6022-RETURN-CODE:  ").toCharArray()
             , getStartOffset() + 0
             ,19
             );
								setAr648ReturnCode662(fillSpace(5));
       replaceValue( // serialize and save the value
             fillSpace(47)
             , getStartOffset() + 24
             ,47
             );
    }


 

	/**
	 *	Returns the value of ar648ReturnCode662
	 *	@return ar648ReturnCode662
	 */
   public char[] getAr648ReturnCode662() throws CFException{
     if (isAr648ReturnCode662Modified()) { 
        ar648ReturnCode662 = refreshAr648ReturnCode662();
     }
   		return ar648ReturnCode662;
   }

  
	/**
	*  set variable ar648ReturnCode662
	*  Corresponding COBOL Variable is 662-AR648-RETURN-CODE
	*  @param value
	**/
   public void setAr648ReturnCode662(char[] value) {
      ar648ReturnCode662 = checkAr648ReturnCode662Constraints(value);
      serializeAr648ReturnCode662(ar648ReturnCode662);
   } 

     /**
	 * 	Update Ar648ReturnCode662 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr648ReturnCode662(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr648ReturnCode662,ar648ReturnCode662.length);
   	
   }
   
   public void setAr648ReturnCode662(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr648ReturnCode662,ar648ReturnCode662.length);
   	
   }
   
     /**
	 * 	Update Ar648ReturnCode662 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr648ReturnCode662(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr648ReturnCode662+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar648ReturnCode662 with another Field
	 *	@param value
	 */
   public void setAr648ReturnCode662(Field source) {
       replace(source,0,source.length(),beginAr648ReturnCode662,AR_648_RETURN_CODE_662_LEN);
   	
   }  
   
     /**
	 * 	Update Ar648ReturnCode662 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr648ReturnCode662(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr648ReturnCode662,AR_648_RETURN_CODE_662_LEN);
   	
   }
   
     /**
	 * 	Update Ar648ReturnCode662 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr648ReturnCode662(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr648ReturnCode662+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ar648ReturnMsg662ConditionGroup2
	 *	@return ar648ReturnMsg662ConditionGroup2
	 */
   public char[] getAr648ReturnMsg662ConditionGroup2() throws CFException{
     if (isAr648ReturnMsg662ConditionGroup2Modified()) { 
        ar648ReturnMsg662ConditionGroup2 = refreshAr648ReturnMsg662ConditionGroup2();
     }
   		return ar648ReturnMsg662ConditionGroup2;
   }

  
	/**
	*  set variable ar648ReturnMsg662ConditionGroup2
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setAr648ReturnMsg662ConditionGroup2(char[] value) {
      ar648ReturnMsg662ConditionGroup2 = checkAr648ReturnMsg662ConditionGroup2Constraints(value);
      serializeAr648ReturnMsg662ConditionGroup2(ar648ReturnMsg662ConditionGroup2);
   } 

     /**
	 * 	Update Ar648ReturnMsg662ConditionGroup2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr648ReturnMsg662ConditionGroup2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr648ReturnMsg662ConditionGroup2,ar648ReturnMsg662ConditionGroup2.length);
   	
   }
   
   public void setAr648ReturnMsg662ConditionGroup2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr648ReturnMsg662ConditionGroup2,ar648ReturnMsg662ConditionGroup2.length);
   	
   }
   
     /**
	 * 	Update Ar648ReturnMsg662ConditionGroup2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr648ReturnMsg662ConditionGroup2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr648ReturnMsg662ConditionGroup2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar648ReturnMsg662ConditionGroup2 with another Field
	 *	@param value
	 */
   public void setAr648ReturnMsg662ConditionGroup2(Field source) {
       replace(source,0,source.length(),beginAr648ReturnMsg662ConditionGroup2,AR_648_RETURN_MSG_662_CONDITION_GROUP_2_LEN);
   	
   }  
   
     /**
	 * 	Update Ar648ReturnMsg662ConditionGroup2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr648ReturnMsg662ConditionGroup2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr648ReturnMsg662ConditionGroup2,AR_648_RETURN_MSG_662_CONDITION_GROUP_2_LEN);
   	
   }
   
     /**
	 * 	Update Ar648ReturnMsg662ConditionGroup2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr648ReturnMsg662ConditionGroup2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr648ReturnMsg662ConditionGroup2+targetIndex,targetLen);
    
   }
	char[] ar648ReturnError8866288Value = ": LINKAGE AREA REQUEST CODE IS IN ERROR        ".toCharArray();
	/**
	 *	Test condition ": LINKAGE AREA REQUEST CODE IS IN ERROR        " for isAr648ReturnError88662()
	 *	@return  Returns true if isAr648ReturnError88662() is ": LINKAGE AREA REQUEST CODE IS IN ERROR        "
	 */
   public boolean isAr648ReturnError88662() throws CFException {
      return (  compareChars( getAr648ReturnMsg662ConditionGroup2() , ar648ReturnError8866288Value)  == 0  );
   }


	/**
	*  set values ": LINKAGE AREA REQUEST CODE IS IN ERROR        "
	*/
   	public void setAr648ReturnError88662True() {  			
    	setAr648ReturnMsg662ConditionGroup2( ar648ReturnError8866288Value);
   	}
	char[] ar648ReturnOrder8866288Value = ": AR648010 REQUESTS ARE NOT IN ACCEPTABLE ORDER".toCharArray();
	/**
	 *	Test condition ": AR648010 REQUESTS ARE NOT IN ACCEPTABLE ORDER" for isAr648ReturnOrder88662()
	 *	@return  Returns true if isAr648ReturnOrder88662() is ": AR648010 REQUESTS ARE NOT IN ACCEPTABLE ORDER"
	 */
   public boolean isAr648ReturnOrder88662() throws CFException {
      return (  compareChars( getAr648ReturnMsg662ConditionGroup2() , ar648ReturnOrder8866288Value)  == 0  );
   }


	/**
	*  set values ": AR648010 REQUESTS ARE NOT IN ACCEPTABLE ORDER"
	*/
   	public void setAr648ReturnOrder88662True() {  			
    	setAr648ReturnMsg662ConditionGroup2( ar648ReturnOrder8866288Value);
   	}
	char[] ar648ReturnSyslst8866288Value = ": AR648010 SYSLST COBOL I/O ERROR ENCOUNTERED  ".toCharArray();
	/**
	 *	Test condition ": AR648010 SYSLST COBOL I/O ERROR ENCOUNTERED  " for isAr648ReturnSyslst88662()
	 *	@return  Returns true if isAr648ReturnSyslst88662() is ": AR648010 SYSLST COBOL I/O ERROR ENCOUNTERED  "
	 */
   public boolean isAr648ReturnSyslst88662() throws CFException {
      return (  compareChars( getAr648ReturnMsg662ConditionGroup2() , ar648ReturnSyslst8866288Value)  == 0  );
   }


	/**
	*  set values ": AR648010 SYSLST COBOL I/O ERROR ENCOUNTERED  "
	*/
   	public void setAr648ReturnSyslst88662True() {  			
    	setAr648ReturnMsg662ConditionGroup2( ar648ReturnSyslst8866288Value);
   	}
	char[] ar648ReturnEntry8866288Value = ": AR648010 ENTERED AFTER SYSLST COBOL I/O ERROR".toCharArray();
	/**
	 *	Test condition ": AR648010 ENTERED AFTER SYSLST COBOL I/O ERROR" for isAr648ReturnEntry88662()
	 *	@return  Returns true if isAr648ReturnEntry88662() is ": AR648010 ENTERED AFTER SYSLST COBOL I/O ERROR"
	 */
   public boolean isAr648ReturnEntry88662() throws CFException {
      return (  compareChars( getAr648ReturnMsg662ConditionGroup2() , ar648ReturnEntry8866288Value)  == 0  );
   }


	/**
	*  set values ": AR648010 ENTERED AFTER SYSLST COBOL I/O ERROR"
	*/
   	public void setAr648ReturnEntry88662True() {  			
    	setAr648ReturnMsg662ConditionGroup2( ar648ReturnEntry8866288Value);
   	}
	char[] ar648ReturnUnknown8866288Value = ": AR648010 RETURN VALUE UNKNOWN TO API MANAGER ".toCharArray();
	/**
	 *	Test condition ": AR648010 RETURN VALUE UNKNOWN TO API MANAGER " for isAr648ReturnUnknown88662()
	 *	@return  Returns true if isAr648ReturnUnknown88662() is ": AR648010 RETURN VALUE UNKNOWN TO API MANAGER "
	 */
   public boolean isAr648ReturnUnknown88662() throws CFException {
      return (  compareChars( getAr648ReturnMsg662ConditionGroup2() , ar648ReturnUnknown8866288Value)  == 0  );
   }


	/**
	*  set values ": AR648010 RETURN VALUE UNKNOWN TO API MANAGER "
	*/
   	public void setAr648ReturnUnknown88662True() {  			
    	setAr648ReturnMsg662ConditionGroup2( ar648ReturnUnknown8866288Value);
   	}

	
	
	

		public static int getAr648ReturnMsg662FieldLength() {
			return AR_648_RETURN_MSG_662_LENGTH;
		}

}
  
