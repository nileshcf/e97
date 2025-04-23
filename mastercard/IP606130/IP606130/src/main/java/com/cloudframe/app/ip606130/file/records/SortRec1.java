package com.cloudframe.app.ip606130.file.records;

/**
*  The class SortRec1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SortRec1 extends SortRec1Serialized { 
   

						private char[] sort1TableId = Field.fillLowValue(8);

						private char[] sort1Key = Field.fillLowValue(99);

						private char[] sort1TableEffDate = Field.fillLowValue(10);

						private char[] sort1ActionCode = Field.fillLowValue(1);

						private char[] sort1TableData = Field.fillLowValue(32634);
	
	/**
	* Constructor for SortRec1
	**/
    public SortRec1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SortRec1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortRec1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sort1TableId
	 *	@return sort1TableId
	 */
   public char[] getSort1TableId() throws CFException{
     if (isSort1TableIdModified()) { 
        sort1TableId = refreshSort1TableId();
     }
   		return sort1TableId;
   }

  
	/**
	*  set variable sort1TableId
	*  Corresponding COBOL Variable is SORT1-TABLE-ID
	*  @param value
	**/
   public void setSort1TableId(char[] value) {
      sort1TableId = checkSort1TableIdConstraints(value);
      serializeSort1TableId(sort1TableId);
   } 

     /**
	 * 	Update Sort1TableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort1TableId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSort1TableId,sort1TableId.length);
   	
   }
   
   public void setSort1TableId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSort1TableId,sort1TableId.length);
   	
   }
   
     /**
	 * 	Update Sort1TableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort1TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort1TableId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sort1TableId with another Field
	 *	@param value
	 */
   public void setSort1TableId(Field source) {
       replace(source,0,source.length(),beginSort1TableId,SORT_1_TABLE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Sort1TableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort1TableId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSort1TableId,SORT_1_TABLE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Sort1TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort1TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort1TableId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sort1Key
	 *	@return sort1Key
	 */
   public char[] getSort1Key() throws CFException{
     if (isSort1KeyModified()) { 
        sort1Key = refreshSort1Key();
     }
   		return sort1Key;
   }

  
	/**
	*  set variable sort1Key
	*  Corresponding COBOL Variable is SORT1-KEY
	*  @param value
	**/
   public void setSort1Key(char[] value) {
      sort1Key = checkSort1KeyConstraints(value);
      serializeSort1Key(sort1Key);
   } 

     /**
	 * 	Update Sort1Key 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort1Key(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSort1Key,sort1Key.length);
   	
   }
   
   public void setSort1Key(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSort1Key,sort1Key.length);
   	
   }
   
     /**
	 * 	Update Sort1Key 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort1Key(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort1Key+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sort1Key with another Field
	 *	@param value
	 */
   public void setSort1Key(Field source) {
       replace(source,0,source.length(),beginSort1Key,SORT_1_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update Sort1Key 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort1Key(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSort1Key,SORT_1_KEY_LEN);
   	
   }
   
     /**
	 * 	Update Sort1Key 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort1Key(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort1Key+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sort1TableEffDate
	 *	@return sort1TableEffDate
	 */
   public char[] getSort1TableEffDate() throws CFException{
     if (isSort1TableEffDateModified()) { 
        sort1TableEffDate = refreshSort1TableEffDate();
     }
   		return sort1TableEffDate;
   }

  
	/**
	*  set variable sort1TableEffDate
	*  Corresponding COBOL Variable is SORT1-TABLE-EFF-DATE
	*  @param value
	**/
   public void setSort1TableEffDate(char[] value) {
      sort1TableEffDate = checkSort1TableEffDateConstraints(value);
      serializeSort1TableEffDate(sort1TableEffDate);
   } 

     /**
	 * 	Update Sort1TableEffDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort1TableEffDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSort1TableEffDate,sort1TableEffDate.length);
   	
   }
   
   public void setSort1TableEffDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSort1TableEffDate,sort1TableEffDate.length);
   	
   }
   
     /**
	 * 	Update Sort1TableEffDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort1TableEffDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort1TableEffDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sort1TableEffDate with another Field
	 *	@param value
	 */
   public void setSort1TableEffDate(Field source) {
       replace(source,0,source.length(),beginSort1TableEffDate,SORT_1_TABLE_EFF_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Sort1TableEffDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort1TableEffDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSort1TableEffDate,SORT_1_TABLE_EFF_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Sort1TableEffDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort1TableEffDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort1TableEffDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sort1ActionCode
	 *	@return sort1ActionCode
	 */
   public char[] getSort1ActionCode() throws CFException{
     if (isSort1ActionCodeModified()) { 
        sort1ActionCode = refreshSort1ActionCode();
     }
   		return sort1ActionCode;
   }

  
	/**
	*  set variable sort1ActionCode
	*  Corresponding COBOL Variable is SORT1-ACTION-CODE
	*  @param value
	**/
   public void setSort1ActionCode(char[] value) {
      sort1ActionCode = checkSort1ActionCodeConstraints(value);
      serializeSort1ActionCode(sort1ActionCode);
   } 

     /**
	 * 	Update Sort1ActionCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort1ActionCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSort1ActionCode,sort1ActionCode.length);
   	
   }
   
   public void setSort1ActionCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSort1ActionCode,sort1ActionCode.length);
   	
   }
   
     /**
	 * 	Update Sort1ActionCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort1ActionCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort1ActionCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sort1ActionCode with another Field
	 *	@param value
	 */
   public void setSort1ActionCode(Field source) {
       replace(source,0,source.length(),beginSort1ActionCode,SORT_1_ACTION_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Sort1ActionCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort1ActionCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSort1ActionCode,SORT_1_ACTION_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Sort1ActionCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort1ActionCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort1ActionCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sort1TableData
	 *	@return sort1TableData
	 */
   public char[] getSort1TableData() throws CFException{
     if (isSort1TableDataModified()) { 
        sort1TableData = refreshSort1TableData();
     }
   		return sort1TableData;
   }

  
	/**
	*  set variable sort1TableData
	*  Corresponding COBOL Variable is SORT1-TABLE-DATA
	*  @param value
	**/
   public void setSort1TableData(char[] value) {
      sort1TableData = checkSort1TableDataConstraints(value);
      serializeSort1TableData(sort1TableData);
   } 

     /**
	 * 	Update Sort1TableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort1TableData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSort1TableData,sort1TableData.length);
   	
   }
   
   public void setSort1TableData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSort1TableData,sort1TableData.length);
   	
   }
   
     /**
	 * 	Update Sort1TableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort1TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort1TableData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sort1TableData with another Field
	 *	@param value
	 */
   public void setSort1TableData(Field source) {
       replace(source,0,source.length(),beginSort1TableData,SORT_1_TABLE_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sort1TableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort1TableData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSort1TableData,SORT_1_TABLE_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Sort1TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort1TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort1TableData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSortRec1FieldLength() {
			return SORT_REC_1_LENGTH;
		}

}
  
