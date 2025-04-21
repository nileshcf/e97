package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class TableArraySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TableArraySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TableArraySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TABLE_ARRAY_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTableItem;
           protected static final int TABLE_ITEM_SIZE = 10;
	
	/**
	* Constructor for TableArraySerialized
	**/
    public TableArraySerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TableArraySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TABLE_ARRAY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTableItem = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int TABLE_ITEM_LEN = 8;
   /**
	 *	serializeTableItem as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeTableItem(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginTableItem + index*TABLE_ITEM_LEN)
   	          , TABLE_ITEM_LEN 
   	          );
   }

		public int tableItemSize() {
			return TABLE_ITEM_SIZE;
		}



}
  
