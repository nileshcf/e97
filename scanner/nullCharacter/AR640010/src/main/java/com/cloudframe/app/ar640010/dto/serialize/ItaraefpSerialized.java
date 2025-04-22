package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ItaraefpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ItaraefpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ItaraefpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ITARAEFP_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaraefpStatusCdN;
	
	/**
	* Constructor for ItaraefpSerialized
	**/
    public ItaraefpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ItaraefpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ITARAEFP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTaraefpStatusCdN = getStartOffset() + 16;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTaraefpStatusCdNCounter = -1;
         public boolean isTaraefpStatusCdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraefpStatusCdNCounter != sharedCounter;
            localTaraefpStatusCdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAEFP_STATUS_CD_N_LEN = 2;
  	/**
	 * serializeTaraefpStatusCdN
	 */
	protected void serializeTaraefpStatusCdN(short taraefpStatusCdN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraefpStatusCdN,TARAEFP_STATUS_CD_N_LEN)
                  ,beginTaraefpStatusCdN
                  ,TARAEFP_STATUS_CD_N_LEN
                 );
            localTaraefpStatusCdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraefpStatusCdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraefpStatusCdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraefpStatusCdN() {	 
			return (getShort(beginTaraefpStatusCdN));
   	}




}
  
