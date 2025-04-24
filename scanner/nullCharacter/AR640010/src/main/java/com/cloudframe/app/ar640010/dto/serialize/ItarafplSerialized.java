package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ItarafplSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ItarafplSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ItarafplSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ITARAFPL_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTarafplAppEndptIdN;
	
	/**
	* Constructor for ItarafplSerialized
	**/
    public ItarafplSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ItarafplSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ITARAFPL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTarafplAppEndptIdN = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTarafplAppEndptIdNCounter = -1;
         public boolean isTarafplAppEndptIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafplAppEndptIdNCounter != sharedCounter;
            localTarafplAppEndptIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFPL_APP_ENDPT_ID_N_LEN = 2;
  	/**
	 * serializeTarafplAppEndptIdN
	 */
	protected void serializeTarafplAppEndptIdN(short tarafplAppEndptIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafplAppEndptIdN,TARAFPL_APP_ENDPT_ID_N_LEN)
                  ,beginTarafplAppEndptIdN
                  ,TARAFPL_APP_ENDPT_ID_N_LEN
                 );
            localTarafplAppEndptIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafplAppEndptIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafplAppEndptIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafplAppEndptIdN() {	 
			return (getShort(beginTarafplAppEndptIdN));
   	}




}
  
