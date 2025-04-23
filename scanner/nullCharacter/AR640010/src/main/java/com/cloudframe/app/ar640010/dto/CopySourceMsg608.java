package com.cloudframe.app.ar640010.dto;

/**
*  The class CopySourceMsg608 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class CopySourceMsg608 extends CopySourceMsg608Serialized {
   


							private char[] copySourceMsg608ConditionGroup2 = new char[11];
						


								private char[] copySourceRecords608 = new char[13];
							


								private char[] copySourceBytes608 = new char[13];
							
	
	/**
	* Constructor for CopySourceMsg608
	**/
    public CopySourceMsg608() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0081-SOURCE ").toCharArray()
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
								setCopySourceRecords608(fillSpace(13));
       replaceValue( // serialize and save the value
             ("; BYTES: ").toCharArray()
             , getStartOffset() + 46
             ,9
             );
								setCopySourceBytes608(fillSpace(13));
    }


 

	/**
	 *	Returns the value of copySourceMsg608ConditionGroup2
	 *	@return copySourceMsg608ConditionGroup2
	 */
   public char[] getCopySourceMsg608ConditionGroup2() throws CFException{
     if (isCopySourceMsg608ConditionGroup2Modified()) { 
        copySourceMsg608ConditionGroup2 = refreshCopySourceMsg608ConditionGroup2();
     }
   		return copySourceMsg608ConditionGroup2;
   }

  
	/**
	*  set variable copySourceMsg608ConditionGroup2
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setCopySourceMsg608ConditionGroup2(char[] value) {
      copySourceMsg608ConditionGroup2 = checkCopySourceMsg608ConditionGroup2Constraints(value);
      serializeCopySourceMsg608ConditionGroup2(copySourceMsg608ConditionGroup2);
   } 

     /**
	 * 	Update CopySourceMsg608ConditionGroup2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopySourceMsg608ConditionGroup2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopySourceMsg608ConditionGroup2,copySourceMsg608ConditionGroup2.length);
   	
   }
   
   public void setCopySourceMsg608ConditionGroup2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopySourceMsg608ConditionGroup2,copySourceMsg608ConditionGroup2.length);
   	
   }
   
     /**
	 * 	Update CopySourceMsg608ConditionGroup2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopySourceMsg608ConditionGroup2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopySourceMsg608ConditionGroup2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CopySourceMsg608ConditionGroup2 with another Field
	 *	@param value
	 */
   public void setCopySourceMsg608ConditionGroup2(Field source) {
       replace(source,0,source.length(),beginCopySourceMsg608ConditionGroup2,COPY_SOURCE_MSG_608_CONDITION_GROUP_2_LEN);
   	
   }  
   
     /**
	 * 	Update CopySourceMsg608ConditionGroup2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopySourceMsg608ConditionGroup2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopySourceMsg608ConditionGroup2,COPY_SOURCE_MSG_608_CONDITION_GROUP_2_LEN);
   	
   }
   
     /**
	 * 	Update CopySourceMsg608ConditionGroup2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopySourceMsg608ConditionGroup2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopySourceMsg608ConditionGroup2+targetIndex,targetLen);
    
   }
	char[] copySourceAppl8860888Value = "APPLICATION".toCharArray();
	/**
	 *	Test condition "APPLICATION" for isCopySourceAppl88608()
	 *	@return  Returns true if isCopySourceAppl88608() is "APPLICATION"
	 */
   public boolean isCopySourceAppl88608() throws CFException {
      return (  compareChars( getCopySourceMsg608ConditionGroup2() , copySourceAppl8860888Value)  == 0  );
   }


	/**
	*  set values "APPLICATION"
	*/
   	public void setCopySourceAppl88608True() {  			
    	setCopySourceMsg608ConditionGroup2( copySourceAppl8860888Value);
   	}
	char[] copySourceGft8860888Value = "GFT DATASET".toCharArray();
	/**
	 *	Test condition "GFT DATASET" for isCopySourceGft88608()
	 *	@return  Returns true if isCopySourceGft88608() is "GFT DATASET"
	 */
   public boolean isCopySourceGft88608() throws CFException {
      return (  compareChars( getCopySourceMsg608ConditionGroup2() , copySourceGft8860888Value)  == 0  );
   }


	/**
	*  set values "GFT DATASET"
	*/
   	public void setCopySourceGft88608True() {  			
    	setCopySourceMsg608ConditionGroup2( copySourceGft8860888Value);
   	}
	/**
	 *	Returns the value of copySourceRecords608
	 *	@return copySourceRecords608
	 */
   public char[] getCopySourceRecords608() throws CFException{
     if (isCopySourceRecords608Modified()) { 
        copySourceRecords608 = refreshCopySourceRecords608();
     }
   		return copySourceRecords608;
   }

  
	/**
	*  set variable copySourceRecords608
	*  Corresponding COBOL Variable is 608-COPY-SOURCE-RECORDS
	*  @param value
	**/
   public void setCopySourceRecords608(char[] value) {
      copySourceRecords608 = checkCopySourceRecords608Constraints(value);
      serializeCopySourceRecords608(copySourceRecords608);
   } 

     /**
	 * 	Update CopySourceRecords608 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopySourceRecords608(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopySourceRecords608,copySourceRecords608.length);
   	
   }
   
   public void setCopySourceRecords608(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopySourceRecords608,copySourceRecords608.length);
   	
   }
   
     /**
	 * 	Update CopySourceRecords608 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopySourceRecords608(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopySourceRecords608+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CopySourceRecords608 with another Field
	 *	@param value
	 */
   public void setCopySourceRecords608(Field source) {
       replace(source,0,source.length(),beginCopySourceRecords608,COPY_SOURCE_RECORDS_608_LEN);
   	
   }  
   
     /**
	 * 	Update CopySourceRecords608 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopySourceRecords608(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopySourceRecords608,COPY_SOURCE_RECORDS_608_LEN);
   	
   }
   
     /**
	 * 	Update CopySourceRecords608 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopySourceRecords608(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopySourceRecords608+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of copySourceBytes608
	 *	@return copySourceBytes608
	 */
   public char[] getCopySourceBytes608() throws CFException{
     if (isCopySourceBytes608Modified()) { 
        copySourceBytes608 = refreshCopySourceBytes608();
     }
   		return copySourceBytes608;
   }

  
	/**
	*  set variable copySourceBytes608
	*  Corresponding COBOL Variable is 608-COPY-SOURCE-BYTES
	*  @param value
	**/
   public void setCopySourceBytes608(char[] value) {
      copySourceBytes608 = checkCopySourceBytes608Constraints(value);
      serializeCopySourceBytes608(copySourceBytes608);
   } 

     /**
	 * 	Update CopySourceBytes608 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCopySourceBytes608(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCopySourceBytes608,copySourceBytes608.length);
   	
   }
   
   public void setCopySourceBytes608(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCopySourceBytes608,copySourceBytes608.length);
   	
   }
   
     /**
	 * 	Update CopySourceBytes608 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopySourceBytes608(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopySourceBytes608+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CopySourceBytes608 with another Field
	 *	@param value
	 */
   public void setCopySourceBytes608(Field source) {
       replace(source,0,source.length(),beginCopySourceBytes608,COPY_SOURCE_BYTES_608_LEN);
   	
   }  
   
     /**
	 * 	Update CopySourceBytes608 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCopySourceBytes608(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCopySourceBytes608,COPY_SOURCE_BYTES_608_LEN);
   	
   }
   
     /**
	 * 	Update CopySourceBytes608 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopySourceBytes608(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCopySourceBytes608+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCopySourceMsg608FieldLength() {
			return COPY_SOURCE_MSG_608_LENGTH;
		}

}
  
