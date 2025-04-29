package com.cloudframe.app.blkdblk.dto.serialize;

/**
*  The class EbcdicTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EbcdicTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EbcdicTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EBCDIC_TABLE_LENGTH = 512;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginEbcdicToAscii;
           protected static final int EBCDIC_TO_ASCII_SIZE = 256;
	
	/**
	* Constructor for EbcdicTableSerialized
	**/
    public EbcdicTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in EbcdicTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EBCDIC_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	        beginEbcdicToAscii = getStartOffset() + 256; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int EBCDIC_TO_ASCII_LEN = 1;
   /**
	 *	serializeEbcdicToAscii as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeEbcdicToAscii(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginEbcdicToAscii + index*EBCDIC_TO_ASCII_LEN)
   	          , EBCDIC_TO_ASCII_LEN 
   	          );
   }

		public int ebcdicToAsciiSize() {
			return EBCDIC_TO_ASCII_SIZE;
		}



}
  
