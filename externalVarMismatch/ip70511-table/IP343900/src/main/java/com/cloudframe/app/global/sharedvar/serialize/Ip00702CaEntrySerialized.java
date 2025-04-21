package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00702CaEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00702CaEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00702CaEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00702_CA_ENTRY_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00702CaStart;
            protected  int beginIp00702CaLength;
	
	/**
	* Constructor for Ip00702CaEntrySerialized
	**/
    public Ip00702CaEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00702CaEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00702CaEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00702CaEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip00702CaEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip00702CaEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00702_CA_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00702CaStart = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00702CaLength = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp00702CaStartCounter = -1;
         public boolean isIp00702CaStartModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00702CaStartCounter != sharedCounter;
            localIp00702CaStartCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00702_CA_START_LEN = 2;
  	/**
	 * serializeIp00702CaStart
	 */
	protected void serializeIp00702CaStart(short ip00702CaStart) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00702CaStart,IP_00702_CA_START_LEN)
                  ,beginIp00702CaStart
                  ,IP_00702_CA_START_LEN
                 );
            localIp00702CaStartCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp00702CaStartMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp00702CaStart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp00702CaStart() {	 
			return (getShort(beginIp00702CaStart));
   	}
         int localIp00702CaLengthCounter = -1;
         public boolean isIp00702CaLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00702CaLengthCounter != sharedCounter;
            localIp00702CaLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00702_CA_LENGTH_LEN = 2;
  	/**
	 * serializeIp00702CaLength
	 */
	protected void serializeIp00702CaLength(short ip00702CaLength) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00702CaLength,IP_00702_CA_LENGTH_LEN)
                  ,beginIp00702CaLength
                  ,IP_00702_CA_LENGTH_LEN
                 );
            localIp00702CaLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp00702CaLengthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp00702CaLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp00702CaLength() {	 
			return (getShort(beginIp00702CaLength));
   	}




}
  
