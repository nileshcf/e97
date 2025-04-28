package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50005TableKeyAllSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50005TableKeyAllSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50005TableKeyAllSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50005_TABLE_KEY_ALL_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50005Seq;
	
	/**
	* Constructor for Ip50005TableKeyAllSerialized
	**/
    public Ip50005TableKeyAllSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50005TableKeyAllSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005TableKeyAllSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50005TableKeyAllSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip50005TableKeyAllSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip50005TableKeyAllSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50005_TABLE_KEY_ALL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp50005Seq = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp50005SeqCounter = -1;
         public boolean isIp50005SeqModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp50005SeqCounter != sharedCounter;
            localIp50005SeqCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_50005_SEQ_LEN = 4;
  	/**
	 * serializeIp50005Seq
	 */
	protected void serializeIp50005Seq(long ip50005Seq) {
           replaceValue( //  save the value as string
                   getBinaryString( ip50005Seq,IP_50005_SEQ_LEN)
                  ,beginIp50005Seq
                  ,IP_50005_SEQ_LEN
                 );
            localIp50005SeqCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp50005SeqMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp50005Seq is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp50005Seq() {	 
			return (getUnsignedInt(beginIp50005Seq));
   	}




}
  
