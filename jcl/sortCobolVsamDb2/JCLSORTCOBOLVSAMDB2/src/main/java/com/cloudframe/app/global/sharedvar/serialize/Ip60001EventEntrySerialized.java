package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip60001EventEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip60001EventEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip60001EventEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_60001_EVENT_ENTRY_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp60001PgmName;
	
	/**
	* Constructor for Ip60001EventEntrySerialized
	**/
    public Ip60001EventEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip60001EventEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip60001EventEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip60001EventEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Ip60001EventEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Ip60001EventEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_60001_EVENT_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp60001PgmName = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp60001PgmNameCounter = -1;
     public boolean isIp60001PgmNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp60001PgmNameCounter != sharedCounter;
         localIp60001PgmNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_60001_PGM_NAME_LEN = 8;
	/**
	 * 	serialize this Ip60001PgmName
	 */
   protected void serializeIp60001PgmName(char[] ip60001PgmName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip60001PgmName,0,getStringValue(),beginIp60001PgmName,IP_60001_PGM_NAME_LEN);
       localIp60001PgmNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp60001PgmNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp60001PgmName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp60001PgmName() {	 
   		return (substring(getStringValue(),beginIp60001PgmName,beginIp60001PgmName + IP_60001_PGM_NAME_LEN));
   	}




}
  
