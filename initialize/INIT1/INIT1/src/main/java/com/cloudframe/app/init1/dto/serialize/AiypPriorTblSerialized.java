package com.cloudframe.app.init1.dto.serialize;

/**
*  The class AiypPriorTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AiypPriorTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AiypPriorTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AIYP_PRIOR_TBL_LENGTH = 48;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginAiypPrior;
           protected static final int AIYP_PRIOR_SIZE = 2;
	
	/**
	* Constructor for AiypPriorTblSerialized
	**/
    public AiypPriorTblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AiypPriorTblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AiypPriorTblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AiypPriorTblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this AiypPriorTblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in AiypPriorTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AIYP_PRIOR_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginAiypPrior = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int aiypPriorSize() {
			return AIYP_PRIOR_SIZE;
		}



}
  
