package com.cloudframe.app.ip739010.dto;

/**
*  The class RowsLoadedMessage630 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/


import com.cloudframe.app.ip739010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class RowsLoadedMessage630 extends RowsLoadedMessage630Serialized { 
   


						private char[] tableId630 = new char[8];


						private char[] tableTimestamp630 = new char[10];


								private char[] rowsLoadedCnt630 = new char[4];
							

	
	/**
	* Constructor for RowsLoadedMessage630
	**/
    public RowsLoadedMessage630() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP739010-").toCharArray()
             , getStartOffset() + 0
             ,9
             );
								setTableId630(fillSpace(8));
       replaceValue( // serialize and save the value
             (", ").toCharArray()
             , getStartOffset() + 17
             ,2
             );
								setTableTimestamp630(fillSpace(10));
       replaceValue( // serialize and save the value
             (": ROWS LOADED = ").toCharArray()
             , getStartOffset() + 29
             ,16
             );
								setRowsLoadedCnt630(CFUtil.cobolNumberFormatter("ZZZ9".toCharArray(),"0".toCharArray()));
       replaceValue( // serialize and save the value
             fillSpace(29)
             , getStartOffset() + 49
             ,29
             );
    }


 

	/**
	 *	Returns the value of tableId630
	 *	@return tableId630
	 */
   public char[] getTableId630() throws CFException{
     if (isTableId630Modified()) { 
        tableId630 = refreshTableId630();
     }
   		return tableId630;
   }

  
	/**
	*  set variable tableId630
	*  Corresponding COBOL Variable is 630-TABLE-ID
	*  @param value
	**/
   public void setTableId630(char[] value) {
      tableId630 = checkTableId630Constraints(value);
      serializeTableId630(tableId630);
   } 

     /**
	 * 	Update TableId630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId630(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTableId630,tableId630.length);
   	
   }
   
   public void setTableId630(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTableId630,tableId630.length);
   	
   }
   
     /**
	 * 	Update TableId630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableId630+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TableId630 with another Field
	 *	@param value
	 */
   public void setTableId630(Field source) {
       replace(source,0,source.length(),beginTableId630,TABLE_ID_630_LEN);
   	
   }  
   
     /**
	 * 	Update TableId630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId630(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTableId630,TABLE_ID_630_LEN);
   	
   }
   
     /**
	 * 	Update TableId630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableId630+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tableTimestamp630
	 *	@return tableTimestamp630
	 */
   public char[] getTableTimestamp630() throws CFException{
     if (isTableTimestamp630Modified()) { 
        tableTimestamp630 = refreshTableTimestamp630();
     }
   		return tableTimestamp630;
   }

  
	/**
	*  set variable tableTimestamp630
	*  Corresponding COBOL Variable is 630-TABLE-TIMESTAMP
	*  @param value
	**/
   public void setTableTimestamp630(char[] value) {
      tableTimestamp630 = checkTableTimestamp630Constraints(value);
      serializeTableTimestamp630(tableTimestamp630);
   } 

     /**
	 * 	Update TableTimestamp630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableTimestamp630(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTableTimestamp630,tableTimestamp630.length);
   	
   }
   
   public void setTableTimestamp630(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTableTimestamp630,tableTimestamp630.length);
   	
   }
   
     /**
	 * 	Update TableTimestamp630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableTimestamp630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableTimestamp630+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TableTimestamp630 with another Field
	 *	@param value
	 */
   public void setTableTimestamp630(Field source) {
       replace(source,0,source.length(),beginTableTimestamp630,TABLE_TIMESTAMP_630_LEN);
   	
   }  
   
     /**
	 * 	Update TableTimestamp630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableTimestamp630(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTableTimestamp630,TABLE_TIMESTAMP_630_LEN);
   	
   }
   
     /**
	 * 	Update TableTimestamp630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableTimestamp630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableTimestamp630+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rowsLoadedCnt630
	 *	@return rowsLoadedCnt630
	 */
   public char[] getRowsLoadedCnt630() throws CFException{
     if (isRowsLoadedCnt630Modified()) { 
        rowsLoadedCnt630 = refreshRowsLoadedCnt630();
     }
   		return rowsLoadedCnt630;
   }

  
	/**
	*  set variable rowsLoadedCnt630
	*  Corresponding COBOL Variable is 630-ROWS-LOADED-CNT
	*  @param value
	**/
   public void setRowsLoadedCnt630(char[] value) {
      rowsLoadedCnt630 = checkRowsLoadedCnt630Constraints(value);
      serializeRowsLoadedCnt630(rowsLoadedCnt630);
   } 

     /**
	 * 	Update RowsLoadedCnt630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRowsLoadedCnt630(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRowsLoadedCnt630,rowsLoadedCnt630.length);
   	
   }
   
   public void setRowsLoadedCnt630(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRowsLoadedCnt630,rowsLoadedCnt630.length);
   	
   }
   
     /**
	 * 	Update RowsLoadedCnt630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRowsLoadedCnt630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRowsLoadedCnt630+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RowsLoadedCnt630 with another Field
	 *	@param value
	 */
   public void setRowsLoadedCnt630(Field source) {
       replace(source,0,source.length(),beginRowsLoadedCnt630,ROWS_LOADED_CNT_630_LEN);
   	
   }  
   
     /**
	 * 	Update RowsLoadedCnt630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRowsLoadedCnt630(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRowsLoadedCnt630,ROWS_LOADED_CNT_630_LEN);
   	
   }
   
     /**
	 * 	Update RowsLoadedCnt630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRowsLoadedCnt630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRowsLoadedCnt630+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRowsLoadedMessage630FieldLength() {
			return ROWS_LOADED_MESSAGE_630_LENGTH;
		}

}
  
