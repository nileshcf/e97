package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00054Table5Key1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00054Table5Key1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00054Table5Key1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00054_TABLE_5_KEY_1_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00054KeyTableId;
            protected  int beginIp00054KeySeqNo;
	
	/**
	* Constructor for Ip00054Table5Key1Serialized
	**/
    public Ip00054Table5Key1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00054Table5Key1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00054Table5Key1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00054Table5Key1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip00054Table5Key1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip00054Table5Key1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00054_TABLE_5_KEY_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00054KeyTableId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00054KeySeqNo = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00054KeyTableIdCounter = -1;
     public boolean isIp00054KeyTableIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00054KeyTableIdCounter != sharedCounter;
         localIp00054KeyTableIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00054_KEY_TABLE_ID_LEN = 8;
	/**
	 * 	serialize this Ip00054KeyTableId
	 */
   protected void serializeIp00054KeyTableId(char[] ip00054KeyTableId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00054KeyTableId,0,getStringValue(),beginIp00054KeyTableId,IP_00054_KEY_TABLE_ID_LEN);
       localIp00054KeyTableIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00054KeyTableIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp00054KeyTableId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00054KeyTableId() {	 
   		return (substring(getStringValue(),beginIp00054KeyTableId,beginIp00054KeyTableId + IP_00054_KEY_TABLE_ID_LEN));
   	}
         int localIp00054KeySeqNoCounter = -1;
         public boolean isIp00054KeySeqNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00054KeySeqNoCounter != sharedCounter;
            localIp00054KeySeqNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00054_KEY_SEQ_NO_LEN = 4;
  	/**
	 * serializeIp00054KeySeqNo
	 */
	protected void serializeIp00054KeySeqNo(long ip00054KeySeqNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00054KeySeqNo,IP_00054_KEY_SEQ_NO_LEN)
                  ,beginIp00054KeySeqNo
                  ,IP_00054_KEY_SEQ_NO_LEN
                 );
            localIp00054KeySeqNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp00054KeySeqNoMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp00054KeySeqNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00054KeySeqNo() {	 
			return (getUnsignedInt(beginIp00054KeySeqNo));
   	}




}
  
