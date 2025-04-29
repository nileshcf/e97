package com.cloudframe.app.mcsort02.file.records;

/**
*  The class SortRec1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.mcsort02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SortRec1 extends SortRec1Serialized { 
   

						private char[] sortTableId = Field.fillLowValue(8);

						private char[] sortTableEffDate = Field.fillLowValue(10);

						private char[] sortTableKeyData = Field.fillLowValue(99);
	
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
	 *	Returns the value of sortTableId
	 *	@return sortTableId
	 */
   public char[] getSortTableId() throws CFException{
     if (isSortTableIdModified()) { 
        sortTableId = refreshSortTableId();
     }
   		return sortTableId;
   }

  
	/**
	*  set variable sortTableId
	*  Corresponding COBOL Variable is SORT-TABLE-ID
	*  @param value
	**/
   public void setSortTableId(char[] value) {
      sortTableId = checkSortTableIdConstraints(value);
      serializeSortTableId(sortTableId);
   } 

     /**
	 * 	Update SortTableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortTableId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSortTableId,sortTableId.length);
   	
   }
   
   public void setSortTableId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSortTableId,sortTableId.length);
   	
   }
   
     /**
	 * 	Update SortTableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortTableId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SortTableId with another Field
	 *	@param value
	 */
   public void setSortTableId(Field source) {
       replace(source,0,source.length(),beginSortTableId,SORT_TABLE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SortTableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortTableId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSortTableId,SORT_TABLE_ID_LEN);
   	
   }
   
     /**
	 * 	Update SortTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortTableId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sortTableEffDate
	 *	@return sortTableEffDate
	 */
   public char[] getSortTableEffDate() throws CFException{
     if (isSortTableEffDateModified()) { 
        sortTableEffDate = refreshSortTableEffDate();
     }
   		return sortTableEffDate;
   }

  
	/**
	*  set variable sortTableEffDate
	*  Corresponding COBOL Variable is SORT-TABLE-EFF-DATE
	*  @param value
	**/
   public void setSortTableEffDate(char[] value) {
      sortTableEffDate = checkSortTableEffDateConstraints(value);
      serializeSortTableEffDate(sortTableEffDate);
   } 

     /**
	 * 	Update SortTableEffDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortTableEffDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSortTableEffDate,sortTableEffDate.length);
   	
   }
   
   public void setSortTableEffDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSortTableEffDate,sortTableEffDate.length);
   	
   }
   
     /**
	 * 	Update SortTableEffDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortTableEffDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortTableEffDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SortTableEffDate with another Field
	 *	@param value
	 */
   public void setSortTableEffDate(Field source) {
       replace(source,0,source.length(),beginSortTableEffDate,SORT_TABLE_EFF_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update SortTableEffDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortTableEffDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSortTableEffDate,SORT_TABLE_EFF_DATE_LEN);
   	
   }
   
     /**
	 * 	Update SortTableEffDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortTableEffDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortTableEffDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sortTableKeyData
	 *	@return sortTableKeyData
	 */
   public char[] getSortTableKeyData() throws CFException{
     if (isSortTableKeyDataModified()) { 
        sortTableKeyData = refreshSortTableKeyData();
     }
   		return sortTableKeyData;
   }

  
	/**
	*  set variable sortTableKeyData
	*  Corresponding COBOL Variable is SORT-TABLE-KEY-DATA
	*  @param value
	**/
   public void setSortTableKeyData(char[] value) {
      sortTableKeyData = checkSortTableKeyDataConstraints(value);
      serializeSortTableKeyData(sortTableKeyData);
   } 

     /**
	 * 	Update SortTableKeyData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortTableKeyData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSortTableKeyData,sortTableKeyData.length);
   	
   }
   
   public void setSortTableKeyData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSortTableKeyData,sortTableKeyData.length);
   	
   }
   
     /**
	 * 	Update SortTableKeyData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortTableKeyData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortTableKeyData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SortTableKeyData with another Field
	 *	@param value
	 */
   public void setSortTableKeyData(Field source) {
       replace(source,0,source.length(),beginSortTableKeyData,SORT_TABLE_KEY_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update SortTableKeyData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortTableKeyData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSortTableKeyData,SORT_TABLE_KEY_DATA_LEN);
   	
   }
   
     /**
	 * 	Update SortTableKeyData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortTableKeyData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortTableKeyData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSortRec1FieldLength() {
			return SORT_REC_1_LENGTH;
		}

}
  
