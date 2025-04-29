package com.cloudframe.app.mcindex.dto.serialize;

/**
*  The class IndexSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IndexSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IndexSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INDEX_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginZeroIdx4800;
           protected static final int ZERO_IDX_4800_SIZE = 10;
           protected int beginIndexTbl1800;
           protected static final int INDEX_TBL_1800_SIZE = 10;
	
	/**
	* Constructor for IndexSerialized
	**/
    public IndexSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IndexSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INDEX_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginZeroIdx4800 = getStartOffset() + 0; // set offset for serialization
  
	        beginIndexTbl1800 = getStartOffset() + 40; // set offset for serialization
  
	   /*  end of offset */
	}

	protected static final int ZERO_IDX_4800_LEN = 4;
    /**
	 * 	serialize this ZeroIdx4800 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeZeroIdx4800(int index, int value) {
           int number = value;
           replaceValue( getBinaryString(number) , (beginZeroIdx4800 + index*ZERO_IDX_4800_LEN), ZERO_IDX_4800_LEN);
   }

		public int zeroIdx4800Size() {
			return ZERO_IDX_4800_SIZE;
		}
		public int indexTbl1800Size() {
			return INDEX_TBL_1800_SIZE;
		}



}
  
