package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50005oTableKeyAllSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50005oTableKeyAllSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50005oTableKeyAllSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50005O_TABLE_KEY_ALL_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50005oSeq;
	
	/**
	* Constructor for Ip50005oTableKeyAllSerialized
	**/
    public Ip50005oTableKeyAllSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50005oTableKeyAllSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005oTableKeyAllSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50005oTableKeyAllSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip50005oTableKeyAllSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip50005oTableKeyAllSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50005O_TABLE_KEY_ALL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp50005oSeq = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp50005oSeqCounter = -1;
         public boolean isIp50005oSeqModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp50005oSeqCounter != sharedCounter;
            localIp50005oSeqCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_50005O_SEQ_LEN = 4;
  	/**
	 * serializeIp50005oSeq
	 */
	protected void serializeIp50005oSeq(long ip50005oSeq) {
           replaceValue( //  save the value as string
                   getBinaryString( ip50005oSeq,IP_50005O_SEQ_LEN)
                  ,beginIp50005oSeq
                  ,IP_50005O_SEQ_LEN
                 );
            localIp50005oSeqCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp50005oSeqMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp50005oSeq is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp50005oSeq() {	 
			return (getUnsignedInt(beginIp50005oSeq));
   	}




}
  
