package com.cloudframe.app.db2varch.dto.serialize;

/**
*  The class IbookSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:42. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IbookSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IbookSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IBOOK_LENGTH = 14;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIndstruc;
           protected static final int INDSTRUC_SIZE = 7;
	
	/**
	* Constructor for IbookSerialized
	**/
    public IbookSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IbookSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IBOOK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIndstruc = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

	protected static final int INDSTRUC_LEN = 2;
    /**
	 * 	serialize this Indstruc as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeIndstruc(int index, short value) {
           short number = (short) value;
           replaceValue( getBinaryString(number) , (beginIndstruc + index*INDSTRUC_LEN), INDSTRUC_LEN);
   }

		public int indstrucSize() {
			return INDSTRUC_SIZE;
		}



}
  
