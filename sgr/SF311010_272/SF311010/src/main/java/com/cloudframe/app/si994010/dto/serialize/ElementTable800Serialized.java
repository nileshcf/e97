package com.cloudframe.app.si994010.dto.serialize;

/**
*  The class ElementTable800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ElementTable800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ElementTable800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ELEMENT_TABLE_800_LENGTH = 128;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginElement800;
           protected static final int ELEMENT_800_SIZE = 128;
	
	/**
	* Constructor for ElementTable800Serialized
	**/
    public ElementTable800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ElementTable800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ELEMENT_TABLE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginElement800 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int ELEMENT_800_LEN = 1;
   /**
	 *	serializeElement800 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeElement800(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginElement800 + index*ELEMENT_800_LEN)
   	          , ELEMENT_800_LEN 
   	          );
   }

		public int element800Size() {
			return ELEMENT_800_SIZE;
		}



}
  
