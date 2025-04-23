package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class ZlogPointers410Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ZlogPointers410Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ZlogPointers410Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ZLOG_POINTERS_410_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginServInfoCount410;
            protected  int beginServInfoPtr410;
            protected  int beginPayload1Ptr410;
            protected  int beginIsoMsg2Ptr410;
            protected  int beginIsoMsg2Lnth410;
            protected  int beginTrailer1Ptr410;
            protected  int beginTrailer1Lnth410;
            protected  int beginTrailer2Ptr410;
            protected  int beginTrailer2Lnth410;
            protected  int beginHoldSr2Ptr410;
	
	/**
	* Constructor for ZlogPointers410Serialized
	**/
    public ZlogPointers410Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ZlogPointers410Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ZLOG_POINTERS_410_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginServInfoCount410 = getStartOffset() + 0;	// set offset for serialization
  
             beginServInfoPtr410 = getStartOffset() + 2;	// set offset for serialization
  
             beginPayload1Ptr410 = getStartOffset() + 4;	// set offset for serialization
  
             beginIsoMsg2Ptr410 = getStartOffset() + 6;	// set offset for serialization
  
             beginIsoMsg2Lnth410 = getStartOffset() + 8;	// set offset for serialization
  
             beginTrailer1Ptr410 = getStartOffset() + 10;	// set offset for serialization
  
             beginTrailer1Lnth410 = getStartOffset() + 12;	// set offset for serialization
  
             beginTrailer2Ptr410 = getStartOffset() + 14;	// set offset for serialization
  
             beginTrailer2Lnth410 = getStartOffset() + 16;	// set offset for serialization
  
             beginHoldSr2Ptr410 = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localServInfoCount410Counter = -1;
         public boolean isServInfoCount410Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localServInfoCount410Counter != sharedCounter;
            localServInfoCount410Counter = sharedCounter; return hasModified; 
         }
   protected static final int SERV_INFO_COUNT_410_LEN = 2;
  	/**
	 * serializeServInfoCount410
	 */
	protected void serializeServInfoCount410(short servInfoCount410) {
           replaceValue( //  save the value as string
                   getBinaryString( servInfoCount410,SERV_INFO_COUNT_410_LEN)
                  ,beginServInfoCount410
                  ,SERV_INFO_COUNT_410_LEN
                 );
            localServInfoCount410Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkServInfoCount410MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshServInfoCount410 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshServInfoCount410() {	 
			return (getShort(beginServInfoCount410));
   	}
         int localServInfoPtr410Counter = -1;
         public boolean isServInfoPtr410Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localServInfoPtr410Counter != sharedCounter;
            localServInfoPtr410Counter = sharedCounter; return hasModified; 
         }
   protected static final int SERV_INFO_PTR_410_LEN = 2;
  	/**
	 * serializeServInfoPtr410
	 */
	protected void serializeServInfoPtr410(short servInfoPtr410) {
           replaceValue( //  save the value as string
                   getBinaryString( servInfoPtr410,SERV_INFO_PTR_410_LEN)
                  ,beginServInfoPtr410
                  ,SERV_INFO_PTR_410_LEN
                 );
            localServInfoPtr410Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkServInfoPtr410MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshServInfoPtr410 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshServInfoPtr410() {	 
			return (getShort(beginServInfoPtr410));
   	}
         int localPayload1Ptr410Counter = -1;
         public boolean isPayload1Ptr410Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPayload1Ptr410Counter != sharedCounter;
            localPayload1Ptr410Counter = sharedCounter; return hasModified; 
         }
   protected static final int PAYLOAD_1_PTR_410_LEN = 2;
  	/**
	 * serializePayload1Ptr410
	 */
	protected void serializePayload1Ptr410(short payload1Ptr410) {
           replaceValue( //  save the value as string
                   getBinaryString( payload1Ptr410,PAYLOAD_1_PTR_410_LEN)
                  ,beginPayload1Ptr410
                  ,PAYLOAD_1_PTR_410_LEN
                 );
            localPayload1Ptr410Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkPayload1Ptr410MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshPayload1Ptr410 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPayload1Ptr410() {	 
			return (getShort(beginPayload1Ptr410));
   	}
         int localIsoMsg2Ptr410Counter = -1;
         public boolean isIsoMsg2Ptr410Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIsoMsg2Ptr410Counter != sharedCounter;
            localIsoMsg2Ptr410Counter = sharedCounter; return hasModified; 
         }
   protected static final int ISO_MSG_2_PTR_410_LEN = 2;
  	/**
	 * serializeIsoMsg2Ptr410
	 */
	protected void serializeIsoMsg2Ptr410(short isoMsg2Ptr410) {
           replaceValue( //  save the value as string
                   getBinaryString( isoMsg2Ptr410,ISO_MSG_2_PTR_410_LEN)
                  ,beginIsoMsg2Ptr410
                  ,ISO_MSG_2_PTR_410_LEN
                 );
            localIsoMsg2Ptr410Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIsoMsg2Ptr410MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIsoMsg2Ptr410 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIsoMsg2Ptr410() {	 
			return (getShort(beginIsoMsg2Ptr410));
   	}
         int localIsoMsg2Lnth410Counter = -1;
         public boolean isIsoMsg2Lnth410Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIsoMsg2Lnth410Counter != sharedCounter;
            localIsoMsg2Lnth410Counter = sharedCounter; return hasModified; 
         }
   protected static final int ISO_MSG_2_LNTH_410_LEN = 2;
  	/**
	 * serializeIsoMsg2Lnth410
	 */
	protected void serializeIsoMsg2Lnth410(short isoMsg2Lnth410) {
           replaceValue( //  save the value as string
                   getBinaryString( isoMsg2Lnth410,ISO_MSG_2_LNTH_410_LEN)
                  ,beginIsoMsg2Lnth410
                  ,ISO_MSG_2_LNTH_410_LEN
                 );
            localIsoMsg2Lnth410Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIsoMsg2Lnth410MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIsoMsg2Lnth410 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIsoMsg2Lnth410() {	 
			return (getShort(beginIsoMsg2Lnth410));
   	}
         int localTrailer1Ptr410Counter = -1;
         public boolean isTrailer1Ptr410Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTrailer1Ptr410Counter != sharedCounter;
            localTrailer1Ptr410Counter = sharedCounter; return hasModified; 
         }
   protected static final int TRAILER_1_PTR_410_LEN = 2;
  	/**
	 * serializeTrailer1Ptr410
	 */
	protected void serializeTrailer1Ptr410(short trailer1Ptr410) {
           replaceValue( //  save the value as string
                   getBinaryString( trailer1Ptr410,TRAILER_1_PTR_410_LEN)
                  ,beginTrailer1Ptr410
                  ,TRAILER_1_PTR_410_LEN
                 );
            localTrailer1Ptr410Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTrailer1Ptr410MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTrailer1Ptr410 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTrailer1Ptr410() {	 
			return (getShort(beginTrailer1Ptr410));
   	}
         int localTrailer1Lnth410Counter = -1;
         public boolean isTrailer1Lnth410Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTrailer1Lnth410Counter != sharedCounter;
            localTrailer1Lnth410Counter = sharedCounter; return hasModified; 
         }
   protected static final int TRAILER_1_LNTH_410_LEN = 2;
  	/**
	 * serializeTrailer1Lnth410
	 */
	protected void serializeTrailer1Lnth410(short trailer1Lnth410) {
           replaceValue( //  save the value as string
                   getBinaryString( trailer1Lnth410,TRAILER_1_LNTH_410_LEN)
                  ,beginTrailer1Lnth410
                  ,TRAILER_1_LNTH_410_LEN
                 );
            localTrailer1Lnth410Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTrailer1Lnth410MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTrailer1Lnth410 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTrailer1Lnth410() {	 
			return (getShort(beginTrailer1Lnth410));
   	}
         int localTrailer2Ptr410Counter = -1;
         public boolean isTrailer2Ptr410Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTrailer2Ptr410Counter != sharedCounter;
            localTrailer2Ptr410Counter = sharedCounter; return hasModified; 
         }
   protected static final int TRAILER_2_PTR_410_LEN = 2;
  	/**
	 * serializeTrailer2Ptr410
	 */
	protected void serializeTrailer2Ptr410(short trailer2Ptr410) {
           replaceValue( //  save the value as string
                   getBinaryString( trailer2Ptr410,TRAILER_2_PTR_410_LEN)
                  ,beginTrailer2Ptr410
                  ,TRAILER_2_PTR_410_LEN
                 );
            localTrailer2Ptr410Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTrailer2Ptr410MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTrailer2Ptr410 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTrailer2Ptr410() {	 
			return (getShort(beginTrailer2Ptr410));
   	}
         int localTrailer2Lnth410Counter = -1;
         public boolean isTrailer2Lnth410Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTrailer2Lnth410Counter != sharedCounter;
            localTrailer2Lnth410Counter = sharedCounter; return hasModified; 
         }
   protected static final int TRAILER_2_LNTH_410_LEN = 2;
  	/**
	 * serializeTrailer2Lnth410
	 */
	protected void serializeTrailer2Lnth410(short trailer2Lnth410) {
           replaceValue( //  save the value as string
                   getBinaryString( trailer2Lnth410,TRAILER_2_LNTH_410_LEN)
                  ,beginTrailer2Lnth410
                  ,TRAILER_2_LNTH_410_LEN
                 );
            localTrailer2Lnth410Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTrailer2Lnth410MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTrailer2Lnth410 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTrailer2Lnth410() {	 
			return (getShort(beginTrailer2Lnth410));
   	}
         int localHoldSr2Ptr410Counter = -1;
         public boolean isHoldSr2Ptr410Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHoldSr2Ptr410Counter != sharedCounter;
            localHoldSr2Ptr410Counter = sharedCounter; return hasModified; 
         }
   protected static final int HOLD_SR_2_PTR_410_LEN = 2;
  	/**
	 * serializeHoldSr2Ptr410
	 */
	protected void serializeHoldSr2Ptr410(short holdSr2Ptr410) {
           replaceValue( //  save the value as string
                   getBinaryString( holdSr2Ptr410,HOLD_SR_2_PTR_410_LEN)
                  ,beginHoldSr2Ptr410
                  ,HOLD_SR_2_PTR_410_LEN
                 );
            localHoldSr2Ptr410Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkHoldSr2Ptr410MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshHoldSr2Ptr410 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshHoldSr2Ptr410() {	 
			return (getShort(beginHoldSr2Ptr410));
   	}




}
  
