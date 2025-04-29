package com.cloudframe.app.mcsort01.file.records;

/**
*  The class SortRec2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:23. using version 5.0.0.254
**/


import com.cloudframe.app.mcsort01.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SortRec2 extends SortRec2Serialized { 
   

						private char[] sort2TableData = Field.fillLowValue(27964);
	
	/**
	* Constructor for SortRec2
	**/
    public SortRec2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SortRec2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortRec2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sort2TableData
	 *	@return sort2TableData
	 */
   public char[] getSort2TableData() throws CFException{
     if (isSort2TableDataModified()) { 
        sort2TableData = refreshSort2TableData();
     }
   		return sort2TableData;
   }

  
	/**
	*  set variable sort2TableData
	*  Corresponding COBOL Variable is SORT2-TABLE-DATA
	*  @param value
	**/
   public void setSort2TableData(char[] value) {
      sort2TableData = checkSort2TableDataConstraints(value);
      serializeSort2TableData(sort2TableData);
   } 

     /**
	 * 	Update Sort2TableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort2TableData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSort2TableData,sort2TableData.length);
   	
   }
   
   public void setSort2TableData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSort2TableData,sort2TableData.length);
   	
   }
   
     /**
	 * 	Update Sort2TableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort2TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort2TableData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sort2TableData with another Field
	 *	@param value
	 */
   public void setSort2TableData(Field source) {
       replace(source,0,source.length(),beginSort2TableData,SORT_2_TABLE_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sort2TableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort2TableData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSort2TableData,SORT_2_TABLE_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Sort2TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort2TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort2TableData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSortRec2FieldLength() {
			return SORT_REC_2_LENGTH;
		}

}
  
