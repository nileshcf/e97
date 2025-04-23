package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class InxBGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InxBGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InxBGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INX_BGROUP_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInxB;
            protected  int beginInxBBin;
            protected  int beginInxBChr;
	
	/**
	* Constructor for InxBGroupSerialized
	**/
    public InxBGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InxBGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INX_BGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInxB = getStartOffset() + 0;	// set offset for serialization
  
             beginInxBBin = getStartOffset() + 0;	// set offset for serialization
  
             beginInxBChr = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localInxBCounter = -1;
         public boolean isInxBModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localInxBCounter != sharedCounter;
            localInxBCounter = sharedCounter; return hasModified; 
         }
   protected static final int INX_B_LEN = 4;
  	/**
	 * serializeInxB
	 */
	protected void serializeInxB(int inxB) {
           replaceValue( //  save the value as string
                   getBinaryString( inxB,INX_B_LEN)
                  ,beginInxB
                  ,INX_B_LEN
                 );
            localInxBCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkInxBMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshInxB is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshInxB() {	 
			return (getInt(beginInxB));
   	}
         int localInxBBinCounter = -1;
         public boolean isInxBBinModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localInxBBinCounter != sharedCounter;
            localInxBBinCounter = sharedCounter; return hasModified; 
         }
   protected static final int INX_BBIN_LEN = 4;
  	/**
	 * serializeInxBBin
	 */
	protected void serializeInxBBin(long inxBBin) {
           replaceValue( //  save the value as string
                   getBinaryString( inxBBin,INX_BBIN_LEN)
                  ,beginInxBBin
                  ,INX_BBIN_LEN
                 );
            localInxBBinCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkInxBBinMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshInxBBin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshInxBBin() {	 
			return (getUnsignedInt(beginInxBBin));
   	}
     int localInxBChrCounter = -1;
     public boolean isInxBChrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInxBChrCounter != sharedCounter;
         localInxBChrCounter = sharedCounter; return hasModified;
     }
	protected static final int INX_BCHR_LEN = 4;
	/**
	 * 	serialize this InxBChr
	 */
   protected void serializeInxBChr(char[] inxBChr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inxBChr,0,getStringValue(),beginInxBChr,INX_BCHR_LEN);
       localInxBChrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInxBChrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshInxBChr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInxBChr() {	 
   		return (substring(getStringValue(),beginInxBChr,beginInxBChr + INX_BCHR_LEN));
   	}




}
  
