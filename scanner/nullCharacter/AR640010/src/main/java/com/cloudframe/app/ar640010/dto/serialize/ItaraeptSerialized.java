package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ItaraeptSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ItaraeptSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ItaraeptSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ITARAEPT_LENGTH = 46;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaraeptUserSrvrIdN;
            protected  int beginTaraeptBkupEndptIdN;
            protected  int beginTaraeptCsMipIdN;
            protected  int beginTaraeptRmMipIdN;
	
	/**
	* Constructor for ItaraeptSerialized
	**/
    public ItaraeptSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ItaraeptSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ITARAEPT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTaraeptUserSrvrIdN = getStartOffset() + 6;	// set offset for serialization
  
             beginTaraeptBkupEndptIdN = getStartOffset() + 18;	// set offset for serialization
  
             beginTaraeptCsMipIdN = getStartOffset() + 22;	// set offset for serialization
  
             beginTaraeptRmMipIdN = getStartOffset() + 24;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTaraeptUserSrvrIdNCounter = -1;
         public boolean isTaraeptUserSrvrIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraeptUserSrvrIdNCounter != sharedCounter;
            localTaraeptUserSrvrIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAEPT_USER_SRVR_ID_N_LEN = 2;
  	/**
	 * serializeTaraeptUserSrvrIdN
	 */
	protected void serializeTaraeptUserSrvrIdN(short taraeptUserSrvrIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraeptUserSrvrIdN,TARAEPT_USER_SRVR_ID_N_LEN)
                  ,beginTaraeptUserSrvrIdN
                  ,TARAEPT_USER_SRVR_ID_N_LEN
                 );
            localTaraeptUserSrvrIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraeptUserSrvrIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraeptUserSrvrIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraeptUserSrvrIdN() {	 
			return (getShort(beginTaraeptUserSrvrIdN));
   	}
         int localTaraeptBkupEndptIdNCounter = -1;
         public boolean isTaraeptBkupEndptIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraeptBkupEndptIdNCounter != sharedCounter;
            localTaraeptBkupEndptIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAEPT_BKUP_ENDPT_ID_N_LEN = 2;
  	/**
	 * serializeTaraeptBkupEndptIdN
	 */
	protected void serializeTaraeptBkupEndptIdN(short taraeptBkupEndptIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraeptBkupEndptIdN,TARAEPT_BKUP_ENDPT_ID_N_LEN)
                  ,beginTaraeptBkupEndptIdN
                  ,TARAEPT_BKUP_ENDPT_ID_N_LEN
                 );
            localTaraeptBkupEndptIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraeptBkupEndptIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraeptBkupEndptIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraeptBkupEndptIdN() {	 
			return (getShort(beginTaraeptBkupEndptIdN));
   	}
         int localTaraeptCsMipIdNCounter = -1;
         public boolean isTaraeptCsMipIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraeptCsMipIdNCounter != sharedCounter;
            localTaraeptCsMipIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAEPT_CS_MIP_ID_N_LEN = 2;
  	/**
	 * serializeTaraeptCsMipIdN
	 */
	protected void serializeTaraeptCsMipIdN(short taraeptCsMipIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraeptCsMipIdN,TARAEPT_CS_MIP_ID_N_LEN)
                  ,beginTaraeptCsMipIdN
                  ,TARAEPT_CS_MIP_ID_N_LEN
                 );
            localTaraeptCsMipIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraeptCsMipIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraeptCsMipIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraeptCsMipIdN() {	 
			return (getShort(beginTaraeptCsMipIdN));
   	}
         int localTaraeptRmMipIdNCounter = -1;
         public boolean isTaraeptRmMipIdNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTaraeptRmMipIdNCounter != sharedCounter;
            localTaraeptRmMipIdNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAEPT_RM_MIP_ID_N_LEN = 2;
  	/**
	 * serializeTaraeptRmMipIdN
	 */
	protected void serializeTaraeptRmMipIdN(short taraeptRmMipIdN) {
           replaceValue( //  save the value as string
                   getBinaryString( taraeptRmMipIdN,TARAEPT_RM_MIP_ID_N_LEN)
                  ,beginTaraeptRmMipIdN
                  ,TARAEPT_RM_MIP_ID_N_LEN
                 );
            localTaraeptRmMipIdNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTaraeptRmMipIdNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTaraeptRmMipIdN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTaraeptRmMipIdN() {	 
			return (getShort(beginTaraeptRmMipIdN));
   	}




}
  
