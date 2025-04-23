package com.cloudframe.app.mcsort02.file.records;

/**
*  The class SortRec5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:17. using version 5.0.0.254
**/


import com.cloudframe.app.mcsort02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SortRec5 extends SortRec5Serialized { 
   

						private char[] sort5TableId = Field.fillLowValue(8);

						private char[] sort5Key = Field.fillLowValue(99);

						private char[] sort5TableEffDate = Field.fillLowValue(10);
	
	/**
	* Constructor for SortRec5
	**/
    public SortRec5() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SortRec5. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortRec5(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sort5TableId
	 *	@return sort5TableId
	 */
   public char[] getSort5TableId() throws CFException{
     if (isSort5TableIdModified()) { 
        sort5TableId = refreshSort5TableId();
     }
   		return sort5TableId;
   }

  
	/**
	*  set variable sort5TableId
	*  Corresponding COBOL Variable is SORT5-TABLE-ID
	*  @param value
	**/
   public void setSort5TableId(char[] value) {
      sort5TableId = checkSort5TableIdConstraints(value);
      serializeSort5TableId(sort5TableId);
   } 

     /**
	 * 	Update Sort5TableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort5TableId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSort5TableId,sort5TableId.length);
   	
   }
   
   public void setSort5TableId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSort5TableId,sort5TableId.length);
   	
   }
   
     /**
	 * 	Update Sort5TableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort5TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort5TableId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sort5TableId with another Field
	 *	@param value
	 */
   public void setSort5TableId(Field source) {
       replace(source,0,source.length(),beginSort5TableId,SORT_5_TABLE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Sort5TableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort5TableId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSort5TableId,SORT_5_TABLE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Sort5TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort5TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort5TableId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sort5Key
	 *	@return sort5Key
	 */
   public char[] getSort5Key() throws CFException{
     if (isSort5KeyModified()) { 
        sort5Key = refreshSort5Key();
     }
   		return sort5Key;
   }

  
	/**
	*  set variable sort5Key
	*  Corresponding COBOL Variable is SORT5-KEY
	*  @param value
	**/
   public void setSort5Key(char[] value) {
      sort5Key = checkSort5KeyConstraints(value);
      serializeSort5Key(sort5Key);
   } 

     /**
	 * 	Update Sort5Key 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort5Key(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSort5Key,sort5Key.length);
   	
   }
   
   public void setSort5Key(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSort5Key,sort5Key.length);
   	
   }
   
     /**
	 * 	Update Sort5Key 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort5Key(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort5Key+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sort5Key with another Field
	 *	@param value
	 */
   public void setSort5Key(Field source) {
       replace(source,0,source.length(),beginSort5Key,SORT_5_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update Sort5Key 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort5Key(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSort5Key,SORT_5_KEY_LEN);
   	
   }
   
     /**
	 * 	Update Sort5Key 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort5Key(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort5Key+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sort5TableEffDate
	 *	@return sort5TableEffDate
	 */
   public char[] getSort5TableEffDate() throws CFException{
     if (isSort5TableEffDateModified()) { 
        sort5TableEffDate = refreshSort5TableEffDate();
     }
   		return sort5TableEffDate;
   }

  
	/**
	*  set variable sort5TableEffDate
	*  Corresponding COBOL Variable is SORT5-TABLE-EFF-DATE
	*  @param value
	**/
   public void setSort5TableEffDate(char[] value) {
      sort5TableEffDate = checkSort5TableEffDateConstraints(value);
      serializeSort5TableEffDate(sort5TableEffDate);
   } 

     /**
	 * 	Update Sort5TableEffDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort5TableEffDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSort5TableEffDate,sort5TableEffDate.length);
   	
   }
   
   public void setSort5TableEffDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSort5TableEffDate,sort5TableEffDate.length);
   	
   }
   
     /**
	 * 	Update Sort5TableEffDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort5TableEffDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort5TableEffDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sort5TableEffDate with another Field
	 *	@param value
	 */
   public void setSort5TableEffDate(Field source) {
       replace(source,0,source.length(),beginSort5TableEffDate,SORT_5_TABLE_EFF_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Sort5TableEffDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort5TableEffDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSort5TableEffDate,SORT_5_TABLE_EFF_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Sort5TableEffDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort5TableEffDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSort5TableEffDate+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSortRec5FieldLength() {
			return SORT_REC_5_LENGTH;
		}

}
  
