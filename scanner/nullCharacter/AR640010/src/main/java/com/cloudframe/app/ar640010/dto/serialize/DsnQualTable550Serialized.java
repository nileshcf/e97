package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class DsnQualTable550Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DsnQualTable550Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DsnQualTable550Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DSN_QUAL_TABLE_550_LENGTH = 64;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginDsnQual550;
           protected static final int DSN_QUAL_550_SIZE = 8;
	
	/**
	* Constructor for DsnQualTable550Serialized
	**/
    public DsnQualTable550Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DsnQualTable550Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DSN_QUAL_TABLE_550_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginDsnQual550 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int DSN_QUAL_550_LEN = 8;
   /**
	 *	serializeDsnQual550 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeDsnQual550(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginDsnQual550 + index*DSN_QUAL_550_LEN)
   	          , DSN_QUAL_550_LEN 
   	          );
   }

		public int dsnQual550Size() {
			return DSN_QUAL_550_SIZE;
		}



}
  
