package com.cloudframe.app.search2.dto.serialize;

/**
*  The class SbidGroupTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SbidGroupTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SbidGroupTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SBID_GROUP_TBL_LENGTH = 22000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSbidGroupEntries;
           protected static final int SBID_GROUP_ENTRIES_SIZE = 2000;
	
	/**
	* Constructor for SbidGroupTblSerialized
	**/
    public SbidGroupTblSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SbidGroupTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SBID_GROUP_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSbidGroupEntries = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int sbidGroupEntriesSize() {
			return SBID_GROUP_ENTRIES_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  11);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  11);
     }
}
  
