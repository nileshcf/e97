package com.cloudframe.app.blkdblk.dto.serialize;

/**
*  The class AsciiTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:39. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AsciiTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AsciiTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ASCII_TABLE_LENGTH = 512;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginAsciiToEbcdic;
           protected static final int ASCII_TO_EBCDIC_SIZE = 256;
	
	/**
	* Constructor for AsciiTableSerialized
	**/
    public AsciiTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AsciiTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ASCII_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	        beginAsciiToEbcdic = getStartOffset() + 256; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int ASCII_TO_EBCDIC_LEN = 1;
   /**
	 *	serializeAsciiToEbcdic as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeAsciiToEbcdic(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginAsciiToEbcdic + index*ASCII_TO_EBCDIC_LEN)
   	          , ASCII_TO_EBCDIC_LEN 
   	          );
   }

		public int asciiToEbcdicSize() {
			return ASCII_TO_EBCDIC_SIZE;
		}



}
  
