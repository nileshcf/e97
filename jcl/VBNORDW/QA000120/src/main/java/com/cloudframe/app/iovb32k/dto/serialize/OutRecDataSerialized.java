package com.cloudframe.app.iovb32k.dto.serialize;

/**
*  The class OutRecDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OutRecDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OutRecDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OUT_REC_DATA_LENGTH = 32750;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginOutRecByte;
           protected static final int OUT_REC_BYTE_SIZE = 32750;
	
	/**
	* Constructor for OutRecDataSerialized
	**/
    public OutRecDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for OutRecDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OutRecDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this OutRecDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this OutRecDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in OutRecDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OUT_REC_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginOutRecByte = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int OUT_REC_BYTE_LEN = 1;
   /**
	 *	serializeOutRecByte as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeOutRecByte(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginOutRecByte + index*OUT_REC_BYTE_LEN)
   	          , OUT_REC_BYTE_LEN 
   	          );
   }

		public int outRecByteSize() {
			return OUT_REC_BYTE_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  1);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  1);
     }
}
  
