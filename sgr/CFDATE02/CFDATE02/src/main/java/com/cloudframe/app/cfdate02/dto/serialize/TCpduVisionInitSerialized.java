package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class TCpduVisionInitSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TCpduVisionInitSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TCpduVisionInitSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int T_CPDU_VISION_INIT_LENGTH = 99;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for TCpduVisionInitSerialized
	**/
    public TCpduVisionInitSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TCpduVisionInitSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TCpduVisionInitSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TCpduVisionInitSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,168); // serialize this field at offset 168 by default 
    }
    
	/**
	* sets parent for this TCpduVisionInitSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 168 by default
    }    
	/**
	* initializes the field in TCpduVisionInitSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(T_CPDU_VISION_INIT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}




}
  
