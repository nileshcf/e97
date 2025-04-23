package com.cloudframe.app.qsamrw01.dto.serialize;

/**
*  The class HistoryRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HistoryRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HistoryRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HISTORY_REC_LENGTH = 1020;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginHistoryRows;
           protected static final int HISTORY_ROWS_SIZE = 50;
	
	/**
	* Constructor for HistoryRecSerialized
	**/
    public HistoryRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HistoryRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HISTORY_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	        beginHistoryRows = getStartOffset() + 20; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int HISTORY_ROWS_LEN = 20;
   /**
	 *	serializeHistoryRows as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHistoryRows(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHistoryRows + index*HISTORY_ROWS_LEN)
   	          , HISTORY_ROWS_LEN 
   	          );
   }

		public int historyRowsSize() {
			return HISTORY_ROWS_SIZE;
		}



}
  
