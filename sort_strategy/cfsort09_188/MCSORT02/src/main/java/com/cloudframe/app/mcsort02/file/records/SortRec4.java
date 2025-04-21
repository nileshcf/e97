package com.cloudframe.app.mcsort02.file.records;

/**
*  The class SortRec4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:57. using version 5.0.0.256
**/


import com.cloudframe.app.mcsort02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SortRec4 extends SortRec4Serialized { 
   

						private char[] sort4TableId = Field.fillLowValue(8);

						private char[] sort4Key = Field.fillLowValue(99);

						private char[] sort4TableEffDate = Field.fillLowValue(10);
	
	/**
	* Constructor for SortRec4
	**/
    public SortRec4() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SortRec4. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortRec4(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sort4TableId
	 *	@return sort4TableId
	 */
   public char[] getSort4TableId() throws CFException{
     if (isSort4TableIdModified()) { 
        sort4TableId = refreshSort4TableId();
     }
   		return sort4TableId;
   }

  
	/**
	*  set variable sort4TableId
	*  Corresponding COBOL Variable is SORT4-TABLE-ID
	*  @param value
	**/
   public void setSort4TableId(char[] value) {
      sort4TableId = checkSort4TableIdConstraints(value);
      serializeSort4TableId(sort4TableId);
   } 

     /**
	 * 	Update Sort4TableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort4TableId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSort4TableId,sort4TableId.length);
   	
   }
   
   public void setSort4TableId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSort4TableId,sort4TableId.length);
   	
   }
   
     /**
	 * 	Update Sort4TableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort4TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort4TableId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sort4TableId with another Field
	 *	@param value
	 */
   public void setSort4TableId(Field source) {
       replace(source,0,source.length(),beginSort4TableId,SORT_4_TABLE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Sort4TableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort4TableId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSort4TableId,SORT_4_TABLE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Sort4TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort4TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort4TableId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sort4Key
	 *	@return sort4Key
	 */
   public char[] getSort4Key() throws CFException{
     if (isSort4KeyModified()) { 
        sort4Key = refreshSort4Key();
     }
   		return sort4Key;
   }

  
	/**
	*  set variable sort4Key
	*  Corresponding COBOL Variable is SORT4-KEY
	*  @param value
	**/
   public void setSort4Key(char[] value) {
      sort4Key = checkSort4KeyConstraints(value);
      serializeSort4Key(sort4Key);
   } 

     /**
	 * 	Update Sort4Key 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort4Key(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSort4Key,sort4Key.length);
   	
   }
   
   public void setSort4Key(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSort4Key,sort4Key.length);
   	
   }
   
     /**
	 * 	Update Sort4Key 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort4Key(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort4Key+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sort4Key with another Field
	 *	@param value
	 */
   public void setSort4Key(Field source) {
       replace(source,0,source.length(),beginSort4Key,SORT_4_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update Sort4Key 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort4Key(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSort4Key,SORT_4_KEY_LEN);
   	
   }
   
     /**
	 * 	Update Sort4Key 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort4Key(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort4Key+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sort4TableEffDate
	 *	@return sort4TableEffDate
	 */
   public char[] getSort4TableEffDate() throws CFException{
     if (isSort4TableEffDateModified()) { 
        sort4TableEffDate = refreshSort4TableEffDate();
     }
   		return sort4TableEffDate;
   }

  
	/**
	*  set variable sort4TableEffDate
	*  Corresponding COBOL Variable is SORT4-TABLE-EFF-DATE
	*  @param value
	**/
   public void setSort4TableEffDate(char[] value) {
      sort4TableEffDate = checkSort4TableEffDateConstraints(value);
      serializeSort4TableEffDate(sort4TableEffDate);
   } 

     /**
	 * 	Update Sort4TableEffDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort4TableEffDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSort4TableEffDate,sort4TableEffDate.length);
   	
   }
   
   public void setSort4TableEffDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSort4TableEffDate,sort4TableEffDate.length);
   	
   }
   
     /**
	 * 	Update Sort4TableEffDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort4TableEffDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort4TableEffDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sort4TableEffDate with another Field
	 *	@param value
	 */
   public void setSort4TableEffDate(Field source) {
       replace(source,0,source.length(),beginSort4TableEffDate,SORT_4_TABLE_EFF_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Sort4TableEffDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort4TableEffDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSort4TableEffDate,SORT_4_TABLE_EFF_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Sort4TableEffDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort4TableEffDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort4TableEffDate+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSortRec4FieldLength() {
			return SORT_REC_4_LENGTH;
		}

}
  
