package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar648RequestMsg662 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class Ar648RequestMsg662 extends Ar648RequestMsg662Serialized {
   


								private char[] ar648RequestCode662 = new char[5];
							

							private char[] ar648RequestMsg662ConditionGroup2 = new char[22];
						
	
	/**
	* Constructor for Ar648RequestMsg662
	**/
    public Ar648RequestMsg662() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("6021-REQUEST CODE: ").toCharArray()
             , getStartOffset() + 0
             ,19
             );
								setAr648RequestCode662(fillSpace(5));
       replaceValue( // serialize and save the value
             fillSpace(22)
             , getStartOffset() + 24
             ,22
             );
    }


 

	/**
	 *	Returns the value of ar648RequestCode662
	 *	@return ar648RequestCode662
	 */
   public char[] getAr648RequestCode662() throws CFException{
     if (isAr648RequestCode662Modified()) { 
        ar648RequestCode662 = refreshAr648RequestCode662();
     }
   		return ar648RequestCode662;
   }

  
	/**
	*  set variable ar648RequestCode662
	*  Corresponding COBOL Variable is 662-AR648-REQUEST-CODE
	*  @param value
	**/
   public void setAr648RequestCode662(char[] value) {
      ar648RequestCode662 = checkAr648RequestCode662Constraints(value);
      serializeAr648RequestCode662(ar648RequestCode662);
   } 

     /**
	 * 	Update Ar648RequestCode662 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr648RequestCode662(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr648RequestCode662,ar648RequestCode662.length);
   	
   }
   
   public void setAr648RequestCode662(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr648RequestCode662,ar648RequestCode662.length);
   	
   }
   
     /**
	 * 	Update Ar648RequestCode662 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr648RequestCode662(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr648RequestCode662+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar648RequestCode662 with another Field
	 *	@param value
	 */
   public void setAr648RequestCode662(Field source) {
       replace(source,0,source.length(),beginAr648RequestCode662,AR_648_REQUEST_CODE_662_LEN);
   	
   }  
   
     /**
	 * 	Update Ar648RequestCode662 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr648RequestCode662(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr648RequestCode662,AR_648_REQUEST_CODE_662_LEN);
   	
   }
   
     /**
	 * 	Update Ar648RequestCode662 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr648RequestCode662(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr648RequestCode662+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ar648RequestMsg662ConditionGroup2
	 *	@return ar648RequestMsg662ConditionGroup2
	 */
   public char[] getAr648RequestMsg662ConditionGroup2() throws CFException{
     if (isAr648RequestMsg662ConditionGroup2Modified()) { 
        ar648RequestMsg662ConditionGroup2 = refreshAr648RequestMsg662ConditionGroup2();
     }
   		return ar648RequestMsg662ConditionGroup2;
   }

  
	/**
	*  set variable ar648RequestMsg662ConditionGroup2
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setAr648RequestMsg662ConditionGroup2(char[] value) {
      ar648RequestMsg662ConditionGroup2 = checkAr648RequestMsg662ConditionGroup2Constraints(value);
      serializeAr648RequestMsg662ConditionGroup2(ar648RequestMsg662ConditionGroup2);
   } 

     /**
	 * 	Update Ar648RequestMsg662ConditionGroup2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr648RequestMsg662ConditionGroup2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr648RequestMsg662ConditionGroup2,ar648RequestMsg662ConditionGroup2.length);
   	
   }
   
   public void setAr648RequestMsg662ConditionGroup2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr648RequestMsg662ConditionGroup2,ar648RequestMsg662ConditionGroup2.length);
   	
   }
   
     /**
	 * 	Update Ar648RequestMsg662ConditionGroup2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr648RequestMsg662ConditionGroup2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr648RequestMsg662ConditionGroup2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar648RequestMsg662ConditionGroup2 with another Field
	 *	@param value
	 */
   public void setAr648RequestMsg662ConditionGroup2(Field source) {
       replace(source,0,source.length(),beginAr648RequestMsg662ConditionGroup2,AR_648_REQUEST_MSG_662_CONDITION_GROUP_2_LEN);
   	
   }  
   
     /**
	 * 	Update Ar648RequestMsg662ConditionGroup2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr648RequestMsg662ConditionGroup2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr648RequestMsg662ConditionGroup2,AR_648_REQUEST_MSG_662_CONDITION_GROUP_2_LEN);
   	
   }
   
     /**
	 * 	Update Ar648RequestMsg662ConditionGroup2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr648RequestMsg662ConditionGroup2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr648RequestMsg662ConditionGroup2+targetIndex,targetLen);
    
   }
	char[] ar648RequestOpen8866288Value = ": OPEN SYSLST DATASET ".toCharArray();
	/**
	 *	Test condition ": OPEN SYSLST DATASET " for isAr648RequestOpen88662()
	 *	@return  Returns true if isAr648RequestOpen88662() is ": OPEN SYSLST DATASET "
	 */
   public boolean isAr648RequestOpen88662() throws CFException {
      return (  compareChars( getAr648RequestMsg662ConditionGroup2() , ar648RequestOpen8866288Value)  == 0  );
   }


	/**
	*  set values ": OPEN SYSLST DATASET "
	*/
   	public void setAr648RequestOpen88662True() {  			
    	setAr648RequestMsg662ConditionGroup2( ar648RequestOpen8866288Value);
   	}
	char[] ar648RequestWrite8866288Value = ": WRITE SYSLST DATASET".toCharArray();
	/**
	 *	Test condition ": WRITE SYSLST DATASET" for isAr648RequestWrite88662()
	 *	@return  Returns true if isAr648RequestWrite88662() is ": WRITE SYSLST DATASET"
	 */
   public boolean isAr648RequestWrite88662() throws CFException {
      return (  compareChars( getAr648RequestMsg662ConditionGroup2() , ar648RequestWrite8866288Value)  == 0  );
   }


	/**
	*  set values ": WRITE SYSLST DATASET"
	*/
   	public void setAr648RequestWrite88662True() {  			
    	setAr648RequestMsg662ConditionGroup2( ar648RequestWrite8866288Value);
   	}
	char[] ar648RequestClose8866288Value = ": CLOSE SYSLST DATASET".toCharArray();
	/**
	 *	Test condition ": CLOSE SYSLST DATASET" for isAr648RequestClose88662()
	 *	@return  Returns true if isAr648RequestClose88662() is ": CLOSE SYSLST DATASET"
	 */
   public boolean isAr648RequestClose88662() throws CFException {
      return (  compareChars( getAr648RequestMsg662ConditionGroup2() , ar648RequestClose8866288Value)  == 0  );
   }


	/**
	*  set values ": CLOSE SYSLST DATASET"
	*/
   	public void setAr648RequestClose88662True() {  			
    	setAr648RequestMsg662ConditionGroup2( ar648RequestClose8866288Value);
   	}
	char[] ar648RequestUnknown8866288Value = "                      ".toCharArray();
	/**
	 *	Test condition " " for isAr648RequestUnknown88662()
	 *	@return  Returns true if isAr648RequestUnknown88662() is " "
	 */
   public boolean isAr648RequestUnknown88662() throws CFException {
      return (  compareChars( getAr648RequestMsg662ConditionGroup2() , ar648RequestUnknown8866288Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setAr648RequestUnknown88662True() {  			
    	setAr648RequestMsg662ConditionGroup2( ar648RequestUnknown8866288Value);
   	}

	
	
	

		public static int getAr648RequestMsg662FieldLength() {
			return AR_648_REQUEST_MSG_662_LENGTH;
		}

}
  
