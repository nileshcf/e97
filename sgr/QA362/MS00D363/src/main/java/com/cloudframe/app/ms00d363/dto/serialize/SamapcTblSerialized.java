package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class SamapcTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SamapcTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SamapcTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAMAPC_TBL_LENGTH = 1350000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSamapcTable;
           protected static final int SAMAPC_TABLE_SIZE = 50000;
	
	/**
	* Constructor for SamapcTblSerialized
	**/
    public SamapcTblSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SamapcTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAMAPC_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSamapcTable = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int samapcTableSize() {
			return SAMAPC_TABLE_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  27);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  27);
     }
}
  
