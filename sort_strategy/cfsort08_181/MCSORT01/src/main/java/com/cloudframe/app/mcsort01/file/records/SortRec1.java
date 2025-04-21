package com.cloudframe.app.mcsort01.file.records;

/**
*  The class SortRec1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:54. using version 5.0.0.256
**/


import com.cloudframe.app.mcsort01.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SortRec1 extends SortRec1Serialized { 
   

						private char[] sortTableData = Field.fillLowValue(27865);
	
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
	 *	Returns the value of sortTableData
	 *	@return sortTableData
	 */
   public char[] getSortTableData() throws CFException{
     if (isSortTableDataModified()) { 
        sortTableData = refreshSortTableData();
     }
   		return sortTableData;
   }

  
	/**
	*  set variable sortTableData
	*  Corresponding COBOL Variable is SORT-TABLE-DATA
	*  @param value
	**/
   public void setSortTableData(char[] value) {
      sortTableData = checkSortTableDataConstraints(value);
      serializeSortTableData(sortTableData);
   } 

     /**
	 * 	Update SortTableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortTableData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSortTableData,sortTableData.length);
   	
   }
   
   public void setSortTableData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSortTableData,sortTableData.length);
   	
   }
   
     /**
	 * 	Update SortTableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortTableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortTableData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SortTableData with another Field
	 *	@param value
	 */
   public void setSortTableData(Field source) {
       replace(source,0,source.length(),beginSortTableData,SORT_TABLE_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update SortTableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortTableData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSortTableData,SORT_TABLE_DATA_LEN);
   	
   }
   
     /**
	 * 	Update SortTableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortTableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSortTableData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSortRec1FieldLength() {
			return SORT_REC_1_LENGTH;
		}

}
  
