package com.cloudframe.app.ip224621.dto.serialize;

/**
*  The class Pds501S1s2s3Entries500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:28. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Pds501S1s2s3Entries500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Pds501S1s2s3Entries500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PDS_501_S_1S_2S_3_ENTRIES_500_LENGTH = 402;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPds501S1s2s3Tcnt500;
           protected int beginPds501S1s2s3Table500;
           protected static final int PDS_501_S_1S_2S_3_TABLE_500_SIZE = 50;
	
	/**
	* Constructor for Pds501S1s2s3Entries500Serialized
	**/
    public Pds501S1s2s3Entries500Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Pds501S1s2s3Entries500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PDS_501_S_1S_2S_3_ENTRIES_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPds501S1s2s3Tcnt500 = getStartOffset() + 0;	// set offset for serialization
  
	        beginPds501S1s2s3Table500 = getStartOffset() + 2; // set offset for serialization
  
	   /*  end of offset */
	}
         int localPds501S1s2s3Tcnt500Counter = -1;
         public boolean isPds501S1s2s3Tcnt500Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPds501S1s2s3Tcnt500Counter != sharedCounter;
            localPds501S1s2s3Tcnt500Counter = sharedCounter; return hasModified; 
         }
   protected static final int PDS_501_S_1S_2S_3_TCNT_500_LEN = 2;
  	/**
	 * serializePds501S1s2s3Tcnt500
	 */
	protected void serializePds501S1s2s3Tcnt500(short pds501S1s2s3Tcnt500) {
           replaceValue( //  save the value as string
                   getBinaryString( pds501S1s2s3Tcnt500,PDS_501_S_1S_2S_3_TCNT_500_LEN)
                  ,beginPds501S1s2s3Tcnt500
                  ,PDS_501_S_1S_2S_3_TCNT_500_LEN
                 );
            localPds501S1s2s3Tcnt500Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkPds501S1s2s3Tcnt500MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshPds501S1s2s3Tcnt500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPds501S1s2s3Tcnt500() {	 
			return (getShort(beginPds501S1s2s3Tcnt500));
   	}

		public int pds501S1s2s3Table500Size() {
			return PDS_501_S_1S_2S_3_TABLE_500_SIZE;
		}



}
  
