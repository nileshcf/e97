package com.cloudframe.app.tmsmmcpy.file.records;

/**
*  The class SortRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.tmsmmcpy.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SortRecord extends SortRecordSerialized {
   

						private char[] sortKey01 = Field.fillLowValue(100);
	
	/**
	* Constructor for SortRecord
	**/
    public SortRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sortKey01
	 *	@return sortKey01
	 */
   public char[] getSortKey01() throws CFException{
     if (isSortKey01Modified()) { 
        sortKey01 = refreshSortKey01();
     }
   		return sortKey01;
   }

  
	/**
	*  set variable sortKey01
	*  Corresponding COBOL Variable is SORT-KEY
	*  @param value
	**/
   public void setSortKey01(char[] value) {
      sortKey01 = checkSortKey01Constraints(value);
      serializeSortKey01(sortKey01);
   } 

     /**
	 * 	Update SortKey01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortKey01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSortKey01,sortKey01.length);
   	
   }
   
   public void setSortKey01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSortKey01,sortKey01.length);
   	
   }
   
     /**
	 * 	Update SortKey01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortKey01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortKey01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SortKey01 with another Field
	 *	@param value
	 */
   public void setSortKey01(Field source) {
       replace(source,0,source.length(),beginSortKey01,SORT_KEY_01_LEN);
   	
   }  
   
     /**
	 * 	Update SortKey01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortKey01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSortKey01,SORT_KEY_01_LEN);
   	
   }
   
     /**
	 * 	Update SortKey01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortKey01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortKey01+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSortRecordFieldLength() {
			return SORT_RECORD_LENGTH;
		}

}
  
