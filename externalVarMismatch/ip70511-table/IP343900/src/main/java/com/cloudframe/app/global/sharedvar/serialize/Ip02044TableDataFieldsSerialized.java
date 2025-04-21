package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02044TableDataFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02044TableDataFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02044TableDataFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02044_TABLE_DATA_FIELDS_LENGTH = 203;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02044RngEndNum;
            protected  int beginIp02044PasFoundCount;
           protected int beginIp02044PaEntry;
           protected static final int IP_02044_PA_ENTRY_SIZE = 10;
	
	/**
	* Constructor for Ip02044TableDataFieldsSerialized
	**/
    public Ip02044TableDataFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip02044TableDataFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02044TableDataFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip02044TableDataFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,19); // serialize this field at offset 19 by default 
    }
    
	/**
	* sets parent for this Ip02044TableDataFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 19 by default
    }    
	/**
	* initializes the field in Ip02044TableDataFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02044_TABLE_DATA_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp02044RngEndNum = getStartOffset() + 0;	// set offset for serialization
  
             beginIp02044PasFoundCount = getStartOffset() + 19;	// set offset for serialization
  
	        beginIp02044PaEntry = getStartOffset() + 23; // set offset for serialization
  
	   /*  end of offset */
	}
     int localIp02044RngEndNumCounter = -1;
     public boolean isIp02044RngEndNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp02044RngEndNumCounter != sharedCounter;
         localIp02044RngEndNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_02044_RNG_END_NUM_LEN = 19;
	/**
	 * 	serialize this Ip02044RngEndNum
	 */
   protected void serializeIp02044RngEndNum(char[] ip02044RngEndNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip02044RngEndNum,0,getStringValue(),beginIp02044RngEndNum,IP_02044_RNG_END_NUM_LEN);
       localIp02044RngEndNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp02044RngEndNumConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp02044RngEndNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp02044RngEndNum() {	 
   		return (substring(getStringValue(),beginIp02044RngEndNum,beginIp02044RngEndNum + IP_02044_RNG_END_NUM_LEN));
   	}
         int localIp02044PasFoundCountCounter = -1;
         public boolean isIp02044PasFoundCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp02044PasFoundCountCounter != sharedCounter;
            localIp02044PasFoundCountCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_02044_PAS_FOUND_COUNT_LEN = 4;
  	/**
	 * serializeIp02044PasFoundCount
	 */
	protected void serializeIp02044PasFoundCount(int ip02044PasFoundCount) {
           replaceValue( //  save the value as string
                   getBinaryString( ip02044PasFoundCount,IP_02044_PAS_FOUND_COUNT_LEN)
                  ,beginIp02044PasFoundCount
                  ,IP_02044_PAS_FOUND_COUNT_LEN
                 );
            localIp02044PasFoundCountCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp02044PasFoundCountMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp02044PasFoundCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp02044PasFoundCount() {	 
			return (getInt(beginIp02044PasFoundCount));
   	}

		public int ip02044PaEntrySize() {
			return IP_02044_PA_ENTRY_SIZE;
		}



}
  
