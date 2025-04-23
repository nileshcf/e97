package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02044TableDataKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02044TableDataKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02044TableDataKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02044_TABLE_DATA_KEY_LENGTH = 19;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02044RngStrtNum;
	
	/**
	* Constructor for Ip02044TableDataKeySerialized
	**/
    public Ip02044TableDataKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip02044TableDataKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02044TableDataKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip02044TableDataKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip02044TableDataKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip02044TableDataKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02044_TABLE_DATA_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp02044RngStrtNum = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp02044RngStrtNumCounter = -1;
     public boolean isIp02044RngStrtNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02044RngStrtNumCounter != sharedCounter;
         localIp02044RngStrtNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02044_RNG_STRT_NUM_LEN = 19;
	/**
	 * 	serialize this Ip02044RngStrtNum
	 */
   protected void serializeIp02044RngStrtNum(char[] ip02044RngStrtNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02044RngStrtNum,0,getStringValue(),beginIp02044RngStrtNum,IP_02044_RNG_STRT_NUM_LEN);
       localIp02044RngStrtNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02044RngStrtNumConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp02044RngStrtNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02044RngStrtNum() {	 
   		return (substring(getStringValue(),beginIp02044RngStrtNum,beginIp02044RngStrtNum + IP_02044_RNG_STRT_NUM_LEN));
   	}




}
  
