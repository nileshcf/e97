package com.cloudframe.app.mcsort01.dto.serialize;

/**
*  The class SortKeyLthTable700Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:56. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SortKeyLthTable700Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SortKeyLthTable700Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SORT_KEY_LTH_TABLE_700_LENGTH = 31500;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSortKeyLthEntry700;
           protected static final int SORT_KEY_LTH_ENTRY_700_SIZE = 500;
	
	/**
	* Constructor for SortKeyLthTable700Serialized
	**/
    public SortKeyLthTable700Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SortKeyLthTable700Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SORT_KEY_LTH_TABLE_700_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSortKeyLthEntry700 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int sortKeyLthEntry700Size() {
			return SORT_KEY_LTH_ENTRY_700_SIZE;
		}



}
  
