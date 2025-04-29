package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip570004Tbl57PointerDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip570004Tbl57PointerDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip570004Tbl57PointerDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_570004_TBL_57_POINTER_DATA_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp570004Tbl57RelRecNumSt;
            protected  int beginIp570004Tbl57RelRecNumEnd;
            protected  int beginIp570004Tbl57CabGpEntrySt;
            protected  int beginIp570004Tbl57CabGpEntryLt;
	
	/**
	* Constructor for Ip570004Tbl57PointerDataSerialized
	**/
    public Ip570004Tbl57PointerDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip570004Tbl57PointerDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip570004Tbl57PointerDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip570004Tbl57PointerDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,24); // serialize this field at offset 24 by default 
    }
    
	/**
	* sets parent for this Ip570004Tbl57PointerDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 24 by default
    }    
	/**
	* initializes the field in Ip570004Tbl57PointerDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_570004_TBL_57_POINTER_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp570004Tbl57RelRecNumSt = getStartOffset() + 0;	// set offset for serialization
  
             beginIp570004Tbl57RelRecNumEnd = getStartOffset() + 2;	// set offset for serialization
  
             beginIp570004Tbl57CabGpEntrySt = getStartOffset() + 4;	// set offset for serialization
  
             beginIp570004Tbl57CabGpEntryLt = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp570004Tbl57RelRecNumStCounter = -1;
         public boolean isIp570004Tbl57RelRecNumStModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp570004Tbl57RelRecNumStCounter != sharedCounter;
            localIp570004Tbl57RelRecNumStCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_570004_TBL_57_REL_REC_NUM_ST_LEN = 2;
  	/**
	 * serializeIp570004Tbl57RelRecNumSt
	 */
	protected void serializeIp570004Tbl57RelRecNumSt(int ip570004Tbl57RelRecNumSt) {
           replaceValue( //  save the value as string
                   getBinaryString( ip570004Tbl57RelRecNumSt,IP_570004_TBL_57_REL_REC_NUM_ST_LEN)
                  ,beginIp570004Tbl57RelRecNumSt
                  ,IP_570004_TBL_57_REL_REC_NUM_ST_LEN
                 );
            localIp570004Tbl57RelRecNumStCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp570004Tbl57RelRecNumStMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp570004Tbl57RelRecNumSt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp570004Tbl57RelRecNumSt() {	 
			return (getUnsignedShort(beginIp570004Tbl57RelRecNumSt));
   	}
         int localIp570004Tbl57RelRecNumEndCounter = -1;
         public boolean isIp570004Tbl57RelRecNumEndModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp570004Tbl57RelRecNumEndCounter != sharedCounter;
            localIp570004Tbl57RelRecNumEndCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_570004_TBL_57_REL_REC_NUM_END_LEN = 2;
  	/**
	 * serializeIp570004Tbl57RelRecNumEnd
	 */
	protected void serializeIp570004Tbl57RelRecNumEnd(int ip570004Tbl57RelRecNumEnd) {
           replaceValue( //  save the value as string
                   getBinaryString( ip570004Tbl57RelRecNumEnd,IP_570004_TBL_57_REL_REC_NUM_END_LEN)
                  ,beginIp570004Tbl57RelRecNumEnd
                  ,IP_570004_TBL_57_REL_REC_NUM_END_LEN
                 );
            localIp570004Tbl57RelRecNumEndCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp570004Tbl57RelRecNumEndMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp570004Tbl57RelRecNumEnd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp570004Tbl57RelRecNumEnd() {	 
			return (getUnsignedShort(beginIp570004Tbl57RelRecNumEnd));
   	}
         int localIp570004Tbl57CabGpEntryStCounter = -1;
         public boolean isIp570004Tbl57CabGpEntryStModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp570004Tbl57CabGpEntryStCounter != sharedCounter;
            localIp570004Tbl57CabGpEntryStCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_570004_TBL_57_CAB_GP_ENTRY_ST_LEN = 4;
  	/**
	 * serializeIp570004Tbl57CabGpEntrySt
	 */
	protected void serializeIp570004Tbl57CabGpEntrySt(long ip570004Tbl57CabGpEntrySt) {
           replaceValue( //  save the value as string
                   getBinaryString( ip570004Tbl57CabGpEntrySt,IP_570004_TBL_57_CAB_GP_ENTRY_ST_LEN)
                  ,beginIp570004Tbl57CabGpEntrySt
                  ,IP_570004_TBL_57_CAB_GP_ENTRY_ST_LEN
                 );
            localIp570004Tbl57CabGpEntryStCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp570004Tbl57CabGpEntryStMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp570004Tbl57CabGpEntrySt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp570004Tbl57CabGpEntrySt() {	 
			return (getUnsignedInt(beginIp570004Tbl57CabGpEntrySt));
   	}
         int localIp570004Tbl57CabGpEntryLtCounter = -1;
         public boolean isIp570004Tbl57CabGpEntryLtModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp570004Tbl57CabGpEntryLtCounter != sharedCounter;
            localIp570004Tbl57CabGpEntryLtCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_570004_TBL_57_CAB_GP_ENTRY_LT_LEN = 4;
  	/**
	 * serializeIp570004Tbl57CabGpEntryLt
	 */
	protected void serializeIp570004Tbl57CabGpEntryLt(long ip570004Tbl57CabGpEntryLt) {
           replaceValue( //  save the value as string
                   getBinaryString( ip570004Tbl57CabGpEntryLt,IP_570004_TBL_57_CAB_GP_ENTRY_LT_LEN)
                  ,beginIp570004Tbl57CabGpEntryLt
                  ,IP_570004_TBL_57_CAB_GP_ENTRY_LT_LEN
                 );
            localIp570004Tbl57CabGpEntryLtCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp570004Tbl57CabGpEntryLtMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp570004Tbl57CabGpEntryLt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp570004Tbl57CabGpEntryLt() {	 
			return (getUnsignedInt(beginIp570004Tbl57CabGpEntryLt));
   	}




}
  
