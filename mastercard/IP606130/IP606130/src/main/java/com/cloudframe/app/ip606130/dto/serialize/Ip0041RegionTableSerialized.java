package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip0041RegionTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0041RegionTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0041RegionTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0041_REGION_TABLE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp0041Region;
           protected static final int IP_0041_REGION_SIZE = 6;
	
	/**
	* Constructor for Ip0041RegionTableSerialized
	**/
    public Ip0041RegionTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0041RegionTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0041RegionTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0041RegionTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,50); // serialize this field at offset 50 by default 
    }
    
	/**
	* sets parent for this Ip0041RegionTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 50 by default
    }    
	/**
	* initializes the field in Ip0041RegionTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0041_REGION_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp0041Region = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int IP_0041_REGION_LEN = 1;
   /**
	 *	serializeIp0041Region as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeIp0041Region(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginIp0041Region + index*IP_0041_REGION_LEN)
   	          , IP_0041_REGION_LEN 
   	          );
   }

		public int ip0041RegionSize() {
			return IP_0041_REGION_SIZE;
		}



}
  
