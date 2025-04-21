package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Ip90354L1CtldataIndSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip90354L1CtldataIndSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip90354L1CtldataIndSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_90354_L_1_CTLDATA_IND_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp90354L1IndFld;
	
	/**
	* Constructor for Ip90354L1CtldataIndSerialized
	**/
    public Ip90354L1CtldataIndSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip90354L1CtldataIndSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip90354L1CtldataIndSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip90354L1CtldataIndSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this Ip90354L1CtldataIndSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in Ip90354L1CtldataIndSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_90354_L_1_CTLDATA_IND_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp90354L1IndFld = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp90354L1IndFldCounter = -1;
         public boolean isIp90354L1IndFldModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp90354L1IndFldCounter != sharedCounter;
            localIp90354L1IndFldCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_90354_L_1_IND_FLD_LEN = 4;
  	/**
	 * serializeIp90354L1IndFld
	 */
	protected void serializeIp90354L1IndFld(int ip90354L1IndFld) {
           replaceValue( //  save the value as string
                   getBinaryString( ip90354L1IndFld,IP_90354_L_1_IND_FLD_LEN)
                  ,beginIp90354L1IndFld
                  ,IP_90354_L_1_IND_FLD_LEN
                 );
            localIp90354L1IndFldCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp90354L1IndFldMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp90354L1IndFld is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp90354L1IndFld() {	 
			return (getInt(beginIp90354L1IndFld));
   	}




}
  
