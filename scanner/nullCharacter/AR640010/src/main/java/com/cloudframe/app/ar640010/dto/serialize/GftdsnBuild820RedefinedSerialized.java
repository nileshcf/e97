package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class GftdsnBuild820RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class GftdsnBuild820RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GftdsnBuild820RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GFTDSN_BUILD_820_REDEFINED_LENGTH = 41;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginGftdsnPos820;
           protected static final int GFTDSN_POS_820_SIZE = 40;
	
	/**
	* Constructor for GftdsnBuild820RedefinedSerialized
	**/
    public GftdsnBuild820RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for GftdsnBuild820RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GftdsnBuild820RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this GftdsnBuild820RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this GftdsnBuild820RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in GftdsnBuild820RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GFTDSN_BUILD_820_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginGftdsnPos820 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int GFTDSN_POS_820_LEN = 1;
   /**
	 *	serializeGftdsnPos820 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeGftdsnPos820(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginGftdsnPos820 + index*GFTDSN_POS_820_LEN)
   	          , GFTDSN_POS_820_LEN 
   	          );
   }

		public int gftdsnPos820Size() {
			return GFTDSN_POS_820_SIZE;
		}



}
  
