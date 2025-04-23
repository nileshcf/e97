package com.cloudframe.app.ip741010.dto;

/**
*  The class TableIntegrityError640 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.ip741010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TableIntegrityError640 extends TableIntegrityError640Serialized {
   

						private char[] tableId640 = new char[8];


						private char[] timestamp640 = new char[10];

	
	/**
	* Constructor for TableIntegrityError640
	**/
    public TableIntegrityError640() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTableId640(fillSpace(8));
       replaceValue( // serialize and save the value
             (", ").toCharArray()
             , getStartOffset() + 8
             ,2
             );
								setTimestamp640(fillSpace(10));
       replaceValue( // serialize and save the value
             (", DOES NOT HAVE AN INTEGRAL NUMBER OF ROWS.").toCharArray()
             , getStartOffset() + 20
             ,43
             );
    }


 

	/**
	 *	Returns the value of tableId640
	 *	@return tableId640
	 */
   public char[] getTableId640() throws CFException{
     if (isTableId640Modified()) { 
        tableId640 = refreshTableId640();
     }
   		return tableId640;
   }

  
	/**
	*  set variable tableId640
	*  Corresponding COBOL Variable is 640-TABLE-ID
	*  @param value
	**/
   public void setTableId640(char[] value) {
      tableId640 = checkTableId640Constraints(value);
      serializeTableId640(tableId640);
   } 

     /**
	 * 	Update TableId640 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId640(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTableId640,tableId640.length);
   	
   }
   
   public void setTableId640(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTableId640,tableId640.length);
   	
   }
   
     /**
	 * 	Update TableId640 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId640(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableId640+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TableId640 with another Field
	 *	@param value
	 */
   public void setTableId640(Field source) {
       replace(source,0,source.length(),beginTableId640,TABLE_ID_640_LEN);
   	
   }  
   
     /**
	 * 	Update TableId640 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId640(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTableId640,TABLE_ID_640_LEN);
   	
   }
   
     /**
	 * 	Update TableId640 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId640(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableId640+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of timestamp640
	 *	@return timestamp640
	 */
   public char[] getTimestamp640() throws CFException{
     if (isTimestamp640Modified()) { 
        timestamp640 = refreshTimestamp640();
     }
   		return timestamp640;
   }

  
	/**
	*  set variable timestamp640
	*  Corresponding COBOL Variable is 640-TIMESTAMP
	*  @param value
	**/
   public void setTimestamp640(char[] value) {
      timestamp640 = checkTimestamp640Constraints(value);
      serializeTimestamp640(timestamp640);
   } 

     /**
	 * 	Update Timestamp640 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimestamp640(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTimestamp640,timestamp640.length);
   	
   }
   
   public void setTimestamp640(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTimestamp640,timestamp640.length);
   	
   }
   
     /**
	 * 	Update Timestamp640 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimestamp640(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimestamp640+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Timestamp640 with another Field
	 *	@param value
	 */
   public void setTimestamp640(Field source) {
       replace(source,0,source.length(),beginTimestamp640,TIMESTAMP_640_LEN);
   	
   }  
   
     /**
	 * 	Update Timestamp640 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimestamp640(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTimestamp640,TIMESTAMP_640_LEN);
   	
   }
   
     /**
	 * 	Update Timestamp640 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimestamp640(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimestamp640+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTableIntegrityError640FieldLength() {
			return TABLE_INTEGRITY_ERROR_640_LENGTH;
		}

}
  
