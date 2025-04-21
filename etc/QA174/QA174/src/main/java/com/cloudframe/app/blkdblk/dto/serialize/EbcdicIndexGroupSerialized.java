package com.cloudframe.app.blkdblk.dto.serialize;

/**
*  The class EbcdicIndexGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EbcdicIndexGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EbcdicIndexGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EBCDIC_INDEX_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEbcdicIndex;
	
	/**
	* Constructor for EbcdicIndexGroupSerialized
	**/
    public EbcdicIndexGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in EbcdicIndexGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EBCDIC_INDEX_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEbcdicIndex = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localEbcdicIndexCounter = -1;
         public boolean isEbcdicIndexModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEbcdicIndexCounter != sharedCounter;
            localEbcdicIndexCounter = sharedCounter; return hasModified; 
         }
   protected static final int EBCDIC_INDEX_LEN = 2;
  	/**
	 * serializeEbcdicIndex
	 */
	protected void serializeEbcdicIndex(short ebcdicIndex) {
           replaceValue( //  save the value as string
                   getBinaryString( ebcdicIndex,EBCDIC_INDEX_LEN)
                  ,beginEbcdicIndex
                  ,EBCDIC_INDEX_LEN
                 );
            localEbcdicIndexCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkEbcdicIndexMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshEbcdicIndex is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshEbcdicIndex() {	 
			return (getShort(beginEbcdicIndex));
   	}




}
  
