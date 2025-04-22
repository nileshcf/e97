package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class RotorTable540Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RotorTable540Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RotorTable540Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ROTOR_TABLE_540_LENGTH = 27;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginRotorChar540;
           protected static final int ROTOR_CHAR_540_SIZE = 27;
	
	/**
	* Constructor for RotorTable540Serialized
	**/
    public RotorTable540Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RotorTable540Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ROTOR_TABLE_540_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginRotorChar540 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int ROTOR_CHAR_540_LEN = 1;
   /**
	 *	serializeRotorChar540 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeRotorChar540(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginRotorChar540 + index*ROTOR_CHAR_540_LEN)
   	          , ROTOR_CHAR_540_LEN 
   	          );
   }

		public int rotorChar540Size() {
			return ROTOR_CHAR_540_SIZE;
		}



}
  
