package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip66102NormalIpmMsgSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip66102NormalIpmMsgSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip66102NormalIpmMsgSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_66102_NORMAL_IPM_MSG_LENGTH = 32767;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp66102Mti;
	
	/**
	* Constructor for Ip66102NormalIpmMsgSerialized
	**/
    public Ip66102NormalIpmMsgSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip66102NormalIpmMsgSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66102NormalIpmMsgSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip66102NormalIpmMsgSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip66102NormalIpmMsgSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip66102NormalIpmMsgSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_66102_NORMAL_IPM_MSG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp66102Mti = getStartOffset() + 0;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localIp66102MtiCounter = -1;
     public boolean isIp66102MtiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102MtiCounter != sharedCounter;
         localIp66102MtiCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_MTI_LEN = 4;
	/**
	 * 	serialize this Ip66102Mti
	 */
   protected void serializeIp66102Mti(char[] ip66102Mti) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102Mti,0,getStringValue(),beginIp66102Mti,IP_66102_MTI_LEN);
       localIp66102MtiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102MtiConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp66102Mti is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102Mti() {	 
   		return (substring(getStringValue(),beginIp66102Mti,beginIp66102Mti + IP_66102_MTI_LEN));
   	}




}
  
