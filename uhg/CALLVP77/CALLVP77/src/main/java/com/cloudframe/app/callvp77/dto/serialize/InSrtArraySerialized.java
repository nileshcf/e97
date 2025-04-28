package com.cloudframe.app.callvp77.dto.serialize;

/**
*  The class InSrtArraySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InSrtArraySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InSrtArraySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IN_SRT_ARRAY_LENGTH = 59200;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginInSrtItem;
           protected static final int IN_SRT_ITEM_SIZE = 800;
	
	/**
	* Constructor for InSrtArraySerialized
	**/
    public InSrtArraySerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InSrtArraySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IN_SRT_ARRAY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginInSrtItem = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int IN_SRT_ITEM_LEN = 74;
   /**
	 *	serializeInSrtItem as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeInSrtItem(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginInSrtItem + index*IN_SRT_ITEM_LEN)
   	          , IN_SRT_ITEM_LEN 
   	          );
   }

		public int inSrtItemSize() {
			return IN_SRT_ITEM_SIZE;
		}



}
  
