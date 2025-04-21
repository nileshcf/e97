package com.cloudframe.app.dbrowset.dto;

/**
*  The class Misc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.dbrowset.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Misc extends MiscSerialized {
   

						private char[] timestamp = new char[32];

								private int maxRows;
	
	/**
	* Constructor for Misc
	**/
    public Misc() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTimestamp(("2019-01-15-19.43.31.000000000000").toCharArray());
								setMaxRows(20);
    }


 

	/**
	 *	Returns the value of timestamp
	 *	@return timestamp
	 */
   public char[] getTimestamp() throws CFException{
     if (isTimestampModified()) { 
        timestamp = refreshTimestamp();
     }
   		return timestamp;
   }

  
	/**
	*  set variable timestamp
	*  Corresponding COBOL Variable is WS-TIMESTAMP
	*  @param value
	**/
   public void setTimestamp(char[] value) {
      timestamp = checkTimestampConstraints(value);
      serializeTimestamp(timestamp);
   } 

     /**
	 * 	Update Timestamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimestamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTimestamp,timestamp.length);
   	
   }
   
   public void setTimestamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTimestamp,timestamp.length);
   	
   }
   
     /**
	 * 	Update Timestamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimestamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimestamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Timestamp with another Field
	 *	@param value
	 */
   public void setTimestamp(Field source) {
       replace(source,0,source.length(),beginTimestamp,TIMESTAMP_LEN);
   	
   }  
   
     /**
	 * 	Update Timestamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimestamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTimestamp,TIMESTAMP_LEN);
   	
   }
   
     /**
	 * 	Update Timestamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimestamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimestamp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of maxRows
	 *	@return maxRows
	 */
	public int getMaxRows() throws CFException {
        if (isMaxRowsModified()) { 
           maxRows = refreshMaxRows();
        }
   		return maxRows;
	}
	
	/**
	 * 	Update MaxRows with the passed value
	 *  Corresponding COBOL Variable is WS-MAX-ROWS
	 *	@param number
	 */
	public void setMaxRows(int number) {
	     // Truncate if the number is beyond +/- Max range
	    maxRows = checkMaxRowsMaxLimit(number); 
		serializeMaxRows(maxRows);
	}


	public void setMaxRows(long number) {
	    number = checkMaxRowsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMaxRows((int)number);
	}
	

	
	
	

		public static int getMiscFieldLength() {
			return MISC_LENGTH;
		}

}
  
