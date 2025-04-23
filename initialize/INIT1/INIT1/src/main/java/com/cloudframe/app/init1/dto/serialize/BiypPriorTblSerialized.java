package com.cloudframe.app.init1.dto.serialize;

/**
*  The class BiypPriorTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BiypPriorTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BiypPriorTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BIYP_PRIOR_TBL_LENGTH = 48;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginBiypPrior;
           protected static final int BIYP_PRIOR_SIZE = 2;
	
	/**
	* Constructor for BiypPriorTblSerialized
	**/
    public BiypPriorTblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BiypPriorTblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiypPriorTblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BiypPriorTblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this BiypPriorTblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in BiypPriorTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BIYP_PRIOR_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginBiypPrior = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int biypPriorSize() {
			return BIYP_PRIOR_SIZE;
		}



}
  
