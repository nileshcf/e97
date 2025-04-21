package com.cloudframe.app.mcsort01.file.records;

/**
*  The class SortRec3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:00. using version 5.0.0.256
**/


import com.cloudframe.app.mcsort01.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SortRec3 extends SortRec3Serialized { 
   

						private char[] sort3TableData = Field.fillLowValue(27865);
	
	/**
	* Constructor for SortRec3
	**/
    public SortRec3() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SortRec3. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortRec3(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sort3TableData
	 *	@return sort3TableData
	 */
   public char[] getSort3TableData() throws CFException{
     if (isSort3TableDataModified()) { 
        sort3TableData = refreshSort3TableData();
     }
   		return sort3TableData;
   }

  
	/**
	*  set variable sort3TableData
	*  Corresponding COBOL Variable is SORT3-TABLE-DATA
	*  @param value
	**/
   public void setSort3TableData(char[] value) {
      sort3TableData = checkSort3TableDataConstraints(value);
      serializeSort3TableData(sort3TableData);
   } 

     /**
	 * 	Update Sort3TableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort3TableData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSort3TableData,sort3TableData.length);
   	
   }
   
   public void setSort3TableData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSort3TableData,sort3TableData.length);
   	
   }
   
     /**
	 * 	Update Sort3TableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort3TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort3TableData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sort3TableData with another Field
	 *	@param value
	 */
   public void setSort3TableData(Field source) {
       replace(source,0,source.length(),beginSort3TableData,SORT_3_TABLE_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sort3TableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort3TableData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSort3TableData,SORT_3_TABLE_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Sort3TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort3TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort3TableData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSortRec3FieldLength() {
			return SORT_REC_3_LENGTH;
		}

}
  
