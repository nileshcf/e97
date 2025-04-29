package com.cloudframe.app.qsamrw01.dto;

/**
*  The class HistoryRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:43. using version 5.0.0.254
**/


import com.cloudframe.app.qsamrw01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class HistoryRec extends HistoryRecSerialized {
   

      private List<char[]> historyRows; 

	
	/**
	* Constructor for HistoryRec
	**/
    public HistoryRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("HISTORY RECORD ->   ").toCharArray()
             , getStartOffset() + 0
             ,20
             );
    }


 

    /**
	 *	Returns the value of historyRows
	 *  Corresponding COBOL Variable is WS-HISTORY-ROWS
	 *	@return historyRows
	 */
	public List<char[]> getHistoryRows() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HISTORY_ROWS_SIZE;index++) {
        	list.add( getHistoryRows( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return historyRows
	 */
	public char[] getHistoryRows(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHistoryRows(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HISTORY_ROWS_SIZE) {
             	index = HISTORY_ROWS_SIZE -1; // can't exceed max array size
             	logger.trace("historyRows - Array index exceeded max Size {}, resetting it to max allowed",HISTORY_ROWS_SIZE); 
	    }
   	      return getCharArray( (beginHistoryRows + index*HISTORY_ROWS_LEN) , HISTORY_ROWS_LEN );
    }
    
    
   public int  historyRowsFieldLength() {
   	return HISTORY_ROWS_LEN;
   }
   
	

  
  	/**
	 *	Update HistoryRows with the passed value at a given index
	 *  Corresponding COBOL Variable is WS-HISTORY-ROWS
	 *  @param index
	 *	@param value
	 */
  public void setHistoryRows(int index,char[] value) {
   	setHistoryRows(index,value,true);
   }
   
   
   /**
	 *	Update HistoryRows with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHistoryRows(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHistoryRows(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 20)  {     
		       value = substring(value,0,20);
           }  else if (value.length < 20) {
		       value = pad(20, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(20).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHistoryRows(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes HistoryRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < HISTORY_ROWS_SIZE;index++) {
             setHistoryRows(index, CONSTANTS.SPACE_20);
         }
   }

		public static int getHistoryRecFieldLength() {
			return HISTORY_REC_LENGTH;
		}

}
  
