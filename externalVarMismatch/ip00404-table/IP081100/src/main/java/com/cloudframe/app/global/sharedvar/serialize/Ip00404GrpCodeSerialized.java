package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00404GrpCodeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00404GrpCodeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00404GrpCodeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00404_GRP_CODE_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp00404GrpCodeDtl;
           protected static final int IP_00404_GRP_CODE_DTL_SIZE = 5;
	
	/**
	* Constructor for Ip00404GrpCodeSerialized
	**/
    public Ip00404GrpCodeSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00404GrpCodeSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404GrpCodeSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00404GrpCodeSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,207); // serialize this field at offset 207 by default 
    }
    
	/**
	* sets parent for this Ip00404GrpCodeSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 207 by default
    }    
	/**
	* initializes the field in Ip00404GrpCodeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00404_GRP_CODE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp00404GrpCodeDtl = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int IP_00404_GRP_CODE_DTL_LEN = 2;
   /**
	 *	serializeIp00404GrpCodeDtl as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeIp00404GrpCodeDtl(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginIp00404GrpCodeDtl + index*IP_00404_GRP_CODE_DTL_LEN)
   	          , IP_00404_GRP_CODE_DTL_LEN 
   	          );
   }

		public int ip00404GrpCodeDtlSize() {
			return IP_00404_GRP_CODE_DTL_SIZE;
		}



}
  
