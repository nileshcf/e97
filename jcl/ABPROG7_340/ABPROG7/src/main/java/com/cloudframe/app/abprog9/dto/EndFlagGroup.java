package com.cloudframe.app.abprog9.dto;

/**
*  The class EndFlagGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:06. using version 5.0.0.254
**/


import com.cloudframe.app.abprog9.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EndFlagGroup extends EndFlagGroupSerialized {
   

						private char[] endFlag = Field.fillLowValue(1);
	
	/**
	* Constructor for EndFlagGroup
	**/
    public EndFlagGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of endFlag
	 *	@return endFlag
	 */
   public char[] getEndFlag() throws CFException{
     if (isEndFlagModified()) { 
        endFlag = refreshEndFlag();
     }
   		return endFlag;
   }

  
	/**
	*  set variable endFlag
	*  Corresponding COBOL Variable is WS-END-FLAG
	*  @param value
	**/
   public void setEndFlag(char[] value) {
      endFlag = checkEndFlagConstraints(value);
      serializeEndFlag(endFlag);
   } 

     /**
	 * 	Update EndFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEndFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEndFlag,endFlag.length);
   	
   }
   
   public void setEndFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEndFlag,endFlag.length);
   	
   }
   
     /**
	 * 	Update EndFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEndFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEndFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EndFlag with another Field
	 *	@param value
	 */
   public void setEndFlag(Field source) {
       replace(source,0,source.length(),beginEndFlag,END_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update EndFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEndFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEndFlag,END_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update EndFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEndFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEndFlag+targetIndex,targetLen);
    
   }
	char[] normalEnd88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNormalEnd()
	 *	@return  Returns true if isNormalEnd() is "N"
	 */
   public boolean isNormalEnd() throws CFException {
      return (  compareChars( getEndFlag() , normalEnd88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNormalEndTrue() {  			
    	setEndFlag( normalEnd88Value);
   	}
	char[] abnormalEnd88Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isAbnormalEnd()
	 *	@return  Returns true if isAbnormalEnd() is "A"
	 */
   public boolean isAbnormalEnd() throws CFException {
      return (  compareChars( getEndFlag() , abnormalEnd88Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setAbnormalEndTrue() {  			
    	setEndFlag( abnormalEnd88Value);
   	}

	
	
	

		public static int getEndFlagGroupFieldLength() {
			return END_FLAG_GROUP_LENGTH;
		}

}
  
