package com.cloudframe.app.ip741010.dto;

/**
*  The class TableOverflowError600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/


import com.cloudframe.app.ip741010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TableOverflowError600 extends TableOverflowError600Serialized {
   

						private char[] tableId600 = new char[8];


						private char[] timestamp600 = new char[10];

	
	/**
	* Constructor for TableOverflowError600
	**/
    public TableOverflowError600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTableId600(fillSpace(8));
       replaceValue( // serialize and save the value
             (", ").toCharArray()
             , getStartOffset() + 8
             ,2
             );
								setTimestamp600(fillSpace(10));
       replaceValue( // serialize and save the value
             (", TABLE OVERFLOW.").toCharArray()
             , getStartOffset() + 20
             ,17
             );
    }


 

	/**
	 *	Returns the value of tableId600
	 *	@return tableId600
	 */
   public char[] getTableId600() throws CFException{
     if (isTableId600Modified()) { 
        tableId600 = refreshTableId600();
     }
   		return tableId600;
   }

  
	/**
	*  set variable tableId600
	*  Corresponding COBOL Variable is 600-TABLE-ID
	*  @param value
	**/
   public void setTableId600(char[] value) {
      tableId600 = checkTableId600Constraints(value);
      serializeTableId600(tableId600);
   } 

     /**
	 * 	Update TableId600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTableId600,tableId600.length);
   	
   }
   
   public void setTableId600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTableId600,tableId600.length);
   	
   }
   
     /**
	 * 	Update TableId600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableId600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TableId600 with another Field
	 *	@param value
	 */
   public void setTableId600(Field source) {
       replace(source,0,source.length(),beginTableId600,TABLE_ID_600_LEN);
   	
   }  
   
     /**
	 * 	Update TableId600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTableId600,TABLE_ID_600_LEN);
   	
   }
   
     /**
	 * 	Update TableId600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableId600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of timestamp600
	 *	@return timestamp600
	 */
   public char[] getTimestamp600() throws CFException{
     if (isTimestamp600Modified()) { 
        timestamp600 = refreshTimestamp600();
     }
   		return timestamp600;
   }

  
	/**
	*  set variable timestamp600
	*  Corresponding COBOL Variable is 600-TIMESTAMP
	*  @param value
	**/
   public void setTimestamp600(char[] value) {
      timestamp600 = checkTimestamp600Constraints(value);
      serializeTimestamp600(timestamp600);
   } 

     /**
	 * 	Update Timestamp600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimestamp600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTimestamp600,timestamp600.length);
   	
   }
   
   public void setTimestamp600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTimestamp600,timestamp600.length);
   	
   }
   
     /**
	 * 	Update Timestamp600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimestamp600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimestamp600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Timestamp600 with another Field
	 *	@param value
	 */
   public void setTimestamp600(Field source) {
       replace(source,0,source.length(),beginTimestamp600,TIMESTAMP_600_LEN);
   	
   }  
   
     /**
	 * 	Update Timestamp600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimestamp600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTimestamp600,TIMESTAMP_600_LEN);
   	
   }
   
     /**
	 * 	Update Timestamp600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimestamp600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimestamp600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTableOverflowError600FieldLength() {
			return TABLE_OVERFLOW_ERROR_600_LENGTH;
		}

}
  
