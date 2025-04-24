package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip0040GrpCodeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040GrpCodeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040GrpCodeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040_GRP_CODE_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp0040GrpCodeDtl;
           protected static final int IP_0040_GRP_CODE_DTL_SIZE = 5;
	
	/**
	* Constructor for Ip0040GrpCodeSerialized
	**/
    public Ip0040GrpCodeSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0040GrpCodeSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040GrpCodeSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0040GrpCodeSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,216); // serialize this field at offset 216 by default 
    }
    
	/**
	* sets parent for this Ip0040GrpCodeSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 216 by default
    }    
	/**
	* initializes the field in Ip0040GrpCodeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040_GRP_CODE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp0040GrpCodeDtl = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int IP_0040_GRP_CODE_DTL_LEN = 2;
   /**
	 *	serializeIp0040GrpCodeDtl as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeIp0040GrpCodeDtl(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginIp0040GrpCodeDtl + index*IP_0040_GRP_CODE_DTL_LEN)
   	          , IP_0040_GRP_CODE_DTL_LEN 
   	          );
   }

		public int ip0040GrpCodeDtlSize() {
			return IP_0040_GRP_CODE_DTL_SIZE;
		}



}
  
