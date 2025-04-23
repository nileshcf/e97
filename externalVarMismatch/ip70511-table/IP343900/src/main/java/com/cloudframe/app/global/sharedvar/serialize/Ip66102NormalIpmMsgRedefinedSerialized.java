package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip66102NormalIpmMsgRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip66102NormalIpmMsgRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip66102NormalIpmMsgRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_66102_NORMAL_IPM_MSG_REDEFINED_LENGTH = 32767;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp66102IsTagTablePresent;
            protected  int beginIp66102TagStart;
            protected  int beginIp66102TaggedIpmMsg;
	
	/**
	* Constructor for Ip66102NormalIpmMsgRedefinedSerialized
	**/
    public Ip66102NormalIpmMsgRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip66102NormalIpmMsgRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66102NormalIpmMsgRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip66102NormalIpmMsgRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip66102NormalIpmMsgRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip66102NormalIpmMsgRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_66102_NORMAL_IPM_MSG_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp66102IsTagTablePresent = getStartOffset() + 0;	// set offset for serialization
  
             beginIp66102TagStart = getStartOffset() + 1;	// set offset for serialization
  
             beginIp66102TaggedIpmMsg = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp66102IsTagTablePresentCounter = -1;
     public boolean isIp66102IsTagTablePresentModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102IsTagTablePresentCounter != sharedCounter;
         localIp66102IsTagTablePresentCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_IS_TAG_TABLE_PRESENT_LEN = 1;
	/**
	 * 	serialize this Ip66102IsTagTablePresent
	 */
   protected void serializeIp66102IsTagTablePresent(char[] ip66102IsTagTablePresent) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102IsTagTablePresent,0,getStringValue(),beginIp66102IsTagTablePresent,IP_66102_IS_TAG_TABLE_PRESENT_LEN);
       localIp66102IsTagTablePresentCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102IsTagTablePresentConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102IsTagTablePresent is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102IsTagTablePresent() {	 
   		return (substring(getStringValue(),beginIp66102IsTagTablePresent,beginIp66102IsTagTablePresent + IP_66102_IS_TAG_TABLE_PRESENT_LEN));
   	}
         int localIp66102TagStartCounter = -1;
         public boolean isIp66102TagStartModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66102TagStartCounter != sharedCounter;
            localIp66102TagStartCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66102_TAG_START_LEN = 4;
  	/**
	 * serializeIp66102TagStart
	 */
	protected void serializeIp66102TagStart(long ip66102TagStart) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66102TagStart,IP_66102_TAG_START_LEN)
                  ,beginIp66102TagStart
                  ,IP_66102_TAG_START_LEN
                 );
            localIp66102TagStartCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp66102TagStartMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp66102TagStart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp66102TagStart() {	 
			return (getUnsignedInt(beginIp66102TagStart));
   	}
     int localIp66102TaggedIpmMsgCounter = -1;
     public boolean isIp66102TaggedIpmMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102TaggedIpmMsgCounter != sharedCounter;
         localIp66102TaggedIpmMsgCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_TAGGED_IPM_MSG_LEN = 32762;
	/**
	 * 	serialize this Ip66102TaggedIpmMsg
	 */
   protected void serializeIp66102TaggedIpmMsg(char[] ip66102TaggedIpmMsg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102TaggedIpmMsg,0,getStringValue(),beginIp66102TaggedIpmMsg,IP_66102_TAGGED_IPM_MSG_LEN);
       localIp66102TaggedIpmMsgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102TaggedIpmMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 32762 ,false, false);
   }
    /**
	 *	refreshIp66102TaggedIpmMsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102TaggedIpmMsg() {	 
   		return (substring(getStringValue(),beginIp66102TaggedIpmMsg,beginIp66102TaggedIpmMsg + IP_66102_TAGGED_IPM_MSG_LEN));
   	}




}
  
