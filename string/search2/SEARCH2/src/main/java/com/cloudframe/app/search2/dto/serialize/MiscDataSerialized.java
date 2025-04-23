package com.cloudframe.app.search2.dto.serialize;

/**
*  The class MiscDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MiscDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MiscDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MISC_DATA_LENGTH = 293;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginI;
            protected  int beginCmdCaHomeSidBidCode;
            protected  int beginTbls;
           protected int beginTblsRedefined;
           protected static final int TBLS_REDEFINED_SIZE = 26;
	
	/**
	* Constructor for MiscDataSerialized
	**/
    public MiscDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MiscDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MISC_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginI = getStartOffset() + 0;	// set offset for serialization
  
             beginCmdCaHomeSidBidCode = getStartOffset() + 2;	// set offset for serialization
  
             beginTbls = getStartOffset() + 7;	// set offset for serialization
  
	        beginTblsRedefined = getStartOffset() + 7; // set offset for serialization
  
	   /*  end of offset */
	}
         int localICounter = -1;
         public boolean isIModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localICounter != sharedCounter;
            localICounter = sharedCounter; return hasModified; 
         }
   protected static final int I_LEN = 2;
  	/**
	 * serializeI
	 */
	protected void serializeI(short i) {
           replaceValue( //  save the value as string
                   getBinaryString( i,I_LEN)
                  ,beginI
                  ,I_LEN
                 );
            localICounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshI() {	 
			return (getShort(beginI));
   	}
     int localCmdCaHomeSidBidCodeCounter = -1;
     public boolean isCmdCaHomeSidBidCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmdCaHomeSidBidCodeCounter != sharedCounter;
         localCmdCaHomeSidBidCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int CMD_CA_HOME_SID_BID_CODE_LEN = 5;
	/**
	 * 	serialize this CmdCaHomeSidBidCode
	 */
   protected void serializeCmdCaHomeSidBidCode(char[] cmdCaHomeSidBidCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmdCaHomeSidBidCode,0,getStringValue(),beginCmdCaHomeSidBidCode,CMD_CA_HOME_SID_BID_CODE_LEN);
       localCmdCaHomeSidBidCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmdCaHomeSidBidCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshCmdCaHomeSidBidCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmdCaHomeSidBidCode() {	 
   		return (substring(getStringValue(),beginCmdCaHomeSidBidCode,beginCmdCaHomeSidBidCode + CMD_CA_HOME_SID_BID_CODE_LEN));
   	}
     int localTblsCounter = -1;
     public boolean isTblsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTblsCounter != sharedCounter;
         localTblsCounter = sharedCounter; return hasModified;
     }
	protected static final int TBLS_LEN = 286;
	/**
	 * 	serialize this Tbls
	 */
   protected void serializeTbls(char[] tbls) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tbls,0,getStringValue(),beginTbls,TBLS_LEN);
       localTblsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTblsConstraints(char[] value) {
   			return super.checkConstraints(value , 286 ,false, false);
   }
    /**
	 *	refreshTbls is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTbls() {	 
   		return (substring(getStringValue(),beginTbls,beginTbls + TBLS_LEN));
   	}

		public int tblsRedefinedSize() {
			return TBLS_REDEFINED_SIZE;
		}



}
  
