package com.cloudframe.app.cpsc4.dto.serialize;

/**
*  The class S0v3DtlDriftDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class S0v3DtlDriftDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(S0v3DtlDriftDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int S_0V_3_DTL_DRIFT_DATA_LENGTH = 840;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginDriftData;
           protected static final int DRIFT_DATA_SIZE = 30;
	
	/**
	* Constructor for S0v3DtlDriftDataSerialized
	**/
    public S0v3DtlDriftDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in S0v3DtlDriftDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(S_0V_3_DTL_DRIFT_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginDriftData = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int driftDataSize() {
			return DRIFT_DATA_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  28);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  28);
     }
}
  
