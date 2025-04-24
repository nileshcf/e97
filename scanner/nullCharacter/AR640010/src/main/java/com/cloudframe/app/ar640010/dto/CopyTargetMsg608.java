package com.cloudframe.app.ar640010.dto;

/**
*  The class CopyTargetMsg608 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class CopyTargetMsg608 extends CopyTargetMsg608Serialized { 
   


							private char[] copyTargetMsg608ConditionGroup2 = new char[11];
						


								private char[] copyTargetRecords608 = new char[13];
							


								private char[] copyTargetBytes608 = new char[13];
							
	
	/**
	* Constructor for CopyTargetMsg608
	**/
    public CopyTargetMsg608() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0082-TARGET ").toCharArray()
             , getStartOffset() + 0
             ,12
             );
       replaceValue( // serialize and save the value
             fillSpace(11)
             , getStartOffset() + 12
             ,11
             );
       replaceValue( // serialize and save the value
             (" RECORDS: ").toCharArray()
             , getStartOffset() + 23
             ,10
             );
								setCopyTargetRecords608(fillSpace(13));
       replaceValue( // serialize and save the value
             ("; BYTES: ").toCharArray()
             , getStartOffset() + 46
             ,9
             );
								setCopyTargetBytes608(fillSpace(13));
    }


 

	/**
	 *	Returns the value of copyTargetMsg608ConditionGroup2
	 *	@return copyTargetMsg608ConditionGroup2
	 */
   public char[] getCopyTargetMsg608ConditionGroup2() throws CFException{
     if (isCopyTargetMsg608ConditionGroup2Modified()) { 
        copyTargetMsg608ConditionGroup2 = refreshCopyTargetMsg608ConditionGroup2();
     }
   		return copyTargetMsg608ConditionGroup2;
   }

  
	/**
	*  set variable copyTargetMsg608ConditionGroup2
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setCopyTargetMsg608ConditionGroup2(char[] value) {
      copyTargetMsg608ConditionGroup2 = checkCopyTargetMsg608ConditionGroup2Constraints(value);
      serializeCopyTargetMsg608ConditionGroup2(copyTargetMsg608ConditionGroup2);
   } 

     /**
	 * 	Update CopyTargetMsg608ConditionGroup2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopyTargetMsg608ConditionGroup2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopyTargetMsg608ConditionGroup2,copyTargetMsg608ConditionGroup2.length);
   	
   }
   
   public void setCopyTargetMsg608ConditionGroup2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopyTargetMsg608ConditionGroup2,copyTargetMsg608ConditionGroup2.length);
   	
   }
   
     /**
	 * 	Update CopyTargetMsg608ConditionGroup2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopyTargetMsg608ConditionGroup2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopyTargetMsg608ConditionGroup2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CopyTargetMsg608ConditionGroup2 with another Field
	 *	@param value
	 */
   public void setCopyTargetMsg608ConditionGroup2(Field source) {
       replace(source,0,source.length(),beginCopyTargetMsg608ConditionGroup2,COPY_TARGET_MSG_608_CONDITION_GROUP_2_LEN);
   	
   }  
   
     /**
	 * 	Update CopyTargetMsg608ConditionGroup2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopyTargetMsg608ConditionGroup2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopyTargetMsg608ConditionGroup2,COPY_TARGET_MSG_608_CONDITION_GROUP_2_LEN);
   	
   }
   
     /**
	 * 	Update CopyTargetMsg608ConditionGroup2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopyTargetMsg608ConditionGroup2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopyTargetMsg608ConditionGroup2+targetIndex,targetLen);
    
   }
	char[] copyTargetAppl8860888Value = "APPLICATION".toCharArray();
	/**
	 *	Test condition "APPLICATION" for isCopyTargetAppl88608()
	 *	@return  Returns true if isCopyTargetAppl88608() is "APPLICATION"
	 */
   public boolean isCopyTargetAppl88608() throws CFException {
      return (  compareChars( getCopyTargetMsg608ConditionGroup2() , copyTargetAppl8860888Value)  == 0  );
   }


	/**
	*  set values "APPLICATION"
	*/
   	public void setCopyTargetAppl88608True() {  			
    	setCopyTargetMsg608ConditionGroup2( copyTargetAppl8860888Value);
   	}
	char[] copyTargetGft8860888Value = "GFT DATASET".toCharArray();
	/**
	 *	Test condition "GFT DATASET" for isCopyTargetGft88608()
	 *	@return  Returns true if isCopyTargetGft88608() is "GFT DATASET"
	 */
   public boolean isCopyTargetGft88608() throws CFException {
      return (  compareChars( getCopyTargetMsg608ConditionGroup2() , copyTargetGft8860888Value)  == 0  );
   }


	/**
	*  set values "GFT DATASET"
	*/
   	public void setCopyTargetGft88608True() {  			
    	setCopyTargetMsg608ConditionGroup2( copyTargetGft8860888Value);
   	}
	/**
	 *	Returns the value of copyTargetRecords608
	 *	@return copyTargetRecords608
	 */
   public char[] getCopyTargetRecords608() throws CFException{
     if (isCopyTargetRecords608Modified()) { 
        copyTargetRecords608 = refreshCopyTargetRecords608();
     }
   		return copyTargetRecords608;
   }

  
	/**
	*  set variable copyTargetRecords608
	*  Corresponding COBOL Variable is 608-COPY-TARGET-RECORDS
	*  @param value
	**/
   public void setCopyTargetRecords608(char[] value) {
      copyTargetRecords608 = checkCopyTargetRecords608Constraints(value);
      serializeCopyTargetRecords608(copyTargetRecords608);
   } 

     /**
	 * 	Update CopyTargetRecords608 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopyTargetRecords608(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopyTargetRecords608,copyTargetRecords608.length);
   	
   }
   
   public void setCopyTargetRecords608(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopyTargetRecords608,copyTargetRecords608.length);
   	
   }
   
     /**
	 * 	Update CopyTargetRecords608 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopyTargetRecords608(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopyTargetRecords608+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CopyTargetRecords608 with another Field
	 *	@param value
	 */
   public void setCopyTargetRecords608(Field source) {
       replace(source,0,source.length(),beginCopyTargetRecords608,COPY_TARGET_RECORDS_608_LEN);
   	
   }  
   
     /**
	 * 	Update CopyTargetRecords608 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopyTargetRecords608(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopyTargetRecords608,COPY_TARGET_RECORDS_608_LEN);
   	
   }
   
     /**
	 * 	Update CopyTargetRecords608 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopyTargetRecords608(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopyTargetRecords608+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of copyTargetBytes608
	 *	@return copyTargetBytes608
	 */
   public char[] getCopyTargetBytes608() throws CFException{
     if (isCopyTargetBytes608Modified()) { 
        copyTargetBytes608 = refreshCopyTargetBytes608();
     }
   		return copyTargetBytes608;
   }

  
	/**
	*  set variable copyTargetBytes608
	*  Corresponding COBOL Variable is 608-COPY-TARGET-BYTES
	*  @param value
	**/
   public void setCopyTargetBytes608(char[] value) {
      copyTargetBytes608 = checkCopyTargetBytes608Constraints(value);
      serializeCopyTargetBytes608(copyTargetBytes608);
   } 

     /**
	 * 	Update CopyTargetBytes608 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopyTargetBytes608(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopyTargetBytes608,copyTargetBytes608.length);
   	
   }
   
   public void setCopyTargetBytes608(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopyTargetBytes608,copyTargetBytes608.length);
   	
   }
   
     /**
	 * 	Update CopyTargetBytes608 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopyTargetBytes608(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopyTargetBytes608+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CopyTargetBytes608 with another Field
	 *	@param value
	 */
   public void setCopyTargetBytes608(Field source) {
       replace(source,0,source.length(),beginCopyTargetBytes608,COPY_TARGET_BYTES_608_LEN);
   	
   }  
   
     /**
	 * 	Update CopyTargetBytes608 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopyTargetBytes608(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopyTargetBytes608,COPY_TARGET_BYTES_608_LEN);
   	
   }
   
     /**
	 * 	Update CopyTargetBytes608 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopyTargetBytes608(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopyTargetBytes608+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCopyTargetMsg608FieldLength() {
			return COPY_TARGET_MSG_608_LENGTH;
		}

}
  
