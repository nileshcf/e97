package com.cloudframe.app.casecb00.dto.serialize;

/**
*  The class InventoryrequestedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InventoryrequestedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InventoryrequestedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INVENTORYREQUESTED_LENGTH = 14862;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRequestdate;
           protected int beginDealers;
           protected static final int DEALERS_SIZE = 3;
            protected  int beginRequesttime;
	
	/**
	* Constructor for InventoryrequestedSerialized
	**/
    public InventoryrequestedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for InventoryrequestedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InventoryrequestedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this InventoryrequestedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this InventoryrequestedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in InventoryrequestedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INVENTORYREQUESTED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRequestdate = getStartOffset() + 0;	// set offset for serialization
  
	        beginDealers = getStartOffset() + 10; // set offset for serialization
  
             beginRequesttime = getStartOffset() + 14854;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRequestdateCounter = -1;
     public boolean isRequestdateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRequestdateCounter != sharedCounter;
         localRequestdateCounter = sharedCounter; return hasModified;
     }
	protected static final int REQUESTDATE_LEN = 10;
	/**
	 * 	serialize this Requestdate
	 */
   protected void serializeRequestdate(char[] requestdate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(requestdate,0,getStringValue(),beginRequestdate,REQUESTDATE_LEN);
       localRequestdateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRequestdateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshRequestdate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRequestdate() {	 
   		return (substring(getStringValue(),beginRequestdate,beginRequestdate + REQUESTDATE_LEN));
   	}
     int localRequesttimeCounter = -1;
     public boolean isRequesttimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRequesttimeCounter != sharedCounter;
         localRequesttimeCounter = sharedCounter; return hasModified;
     }
	protected static final int REQUESTTIME_LEN = 8;
	/**
	 * 	serialize this Requesttime
	 */
   protected void serializeRequesttime(char[] requesttime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(requesttime,0,getStringValue(),beginRequesttime,REQUESTTIME_LEN);
       localRequesttimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRequesttimeConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRequesttime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRequesttime() {	 
   		return (substring(getStringValue(),beginRequesttime,beginRequesttime + REQUESTTIME_LEN));
   	}

		public int dealersSize() {
			return DEALERS_SIZE;
		}



}
  
