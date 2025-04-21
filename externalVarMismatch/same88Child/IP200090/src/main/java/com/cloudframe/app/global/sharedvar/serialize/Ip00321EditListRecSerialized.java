package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00321EditListRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00321EditListRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00321EditListRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00321_EDIT_LIST_REC_LENGTH = 176048;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp00321EditListEntry;
           protected static final int IP_00321_EDIT_LIST_ENTRY_SIZE = 4000;
            protected  int beginIp00321EditNbr;
	
	/**
	* Constructor for Ip00321EditListRecSerialized
	**/
    public Ip00321EditListRecSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip00321EditListRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00321_EDIT_LIST_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp00321EditListEntry = getStartOffset() + 0; // set offset for serialization
  
             beginIp00321EditNbr = getStartOffset() + 176000;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp00321EditNbrCounter = -1;
         public boolean isIp00321EditNbrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00321EditNbrCounter != sharedCounter;
            localIp00321EditNbrCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00321_EDIT_NBR_LEN = 4;
  	/**
	 * serializeIp00321EditNbr
	 */
	protected void serializeIp00321EditNbr(long ip00321EditNbr) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00321EditNbr,IP_00321_EDIT_NBR_LEN)
                  ,beginIp00321EditNbr
                  ,IP_00321_EDIT_NBR_LEN
                 );
            localIp00321EditNbrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp00321EditNbrMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp00321EditNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00321EditNbr() {	 
			return (getUnsignedInt(beginIp00321EditNbr));
   	}

		public int ip00321EditListEntrySize() {
			return IP_00321_EDIT_LIST_ENTRY_SIZE;
		}



}
  
