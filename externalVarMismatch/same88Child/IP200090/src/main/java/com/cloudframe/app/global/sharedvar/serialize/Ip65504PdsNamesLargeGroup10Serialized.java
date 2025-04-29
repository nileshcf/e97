package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup10Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:24. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup10Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup10Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_10_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P280SrcFilS;
            protected  int beginIp65504P280SrcFilL;
            protected  int beginIp65504P281ReservdS;
            protected  int beginIp65504P281ReservdL;
            protected  int beginIp65504P282ReservdS;
            protected  int beginIp65504P282ReservdL;
            protected  int beginIp65504P283ReservdS;
            protected  int beginIp65504P283ReservdL;
            protected  int beginIp65504P284ReservdS;
            protected  int beginIp65504P284ReservdL;
            protected  int beginIp65504P285ReservdS;
            protected  int beginIp65504P285ReservdL;
            protected  int beginIp65504P286ReservdS;
            protected  int beginIp65504P286ReservdL;
            protected  int beginIp65504P287ReservdS;
            protected  int beginIp65504P287ReservdL;
            protected  int beginIp65504P288ReservdS;
            protected  int beginIp65504P288ReservdL;
            protected  int beginIp65504P289ReservdS;
            protected  int beginIp65504P289ReservdL;
            protected  int beginIp65504P290ReservdS;
            protected  int beginIp65504P290ReservdL;
            protected  int beginIp65504P291ReservdS;
            protected  int beginIp65504P291ReservdL;
            protected  int beginIp65504P292ReservdS;
            protected  int beginIp65504P292ReservdL;
            protected  int beginIp65504P293ReservdS;
            protected  int beginIp65504P293ReservdL;
            protected  int beginIp65504P294ReservdS;
            protected  int beginIp65504P294ReservdL;
            protected  int beginIp65504P295ReservdS;
            protected  int beginIp65504P295ReservdL;
            protected  int beginIp65504P296ReservdS;
            protected  int beginIp65504P296ReservdL;
            protected  int beginIp65504P297ReservdS;
            protected  int beginIp65504P297ReservdL;
            protected  int beginIp65504P298RecTrxS;
            protected  int beginIp65504P298RecTrxL;
            protected  int beginIp65504P299ReservdS;
            protected  int beginIp65504P299ReservdL;
            protected  int beginIp65504P300RecFilS;
            protected  int beginIp65504P300RecFilL;
            protected  int beginIp65504P301FilAmtS;
            protected  int beginIp65504P301FilAmtL;
            protected  int beginIp65504P302MbractyS;
            protected  int beginIp65504P302MbractyL;
            protected  int beginIp65504P303TrxTypS;
            protected  int beginIp65504P303TrxTypL;
            protected  int beginIp65504P304ReservdS;
            protected  int beginIp65504P304ReservdL;
            protected  int beginIp65504P305NetCntS;
            protected  int beginIp65504P305NetCntL;
            protected  int beginIp65504P306FilCntS;
            protected  int beginIp65504P306FilCntL;
            protected  int beginIp65504P307ReservdS;
            protected  int beginIp65504P307ReservdL;
            protected  int beginIp65504P308ReservdS;
            protected  int beginIp65504P308ReservdL;
            protected  int beginIp65504P309ReservdS;
            protected  int beginIp65504P309ReservdL;
            protected  int beginIp65504P310DbRamtS;
            protected  int beginIp65504P310DbRamtL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup10Serialized
	**/
    public Ip65504PdsNamesLargeGroup10Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup10Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup10Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup10Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2228); // serialize this field at offset 2228 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup10Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2228 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup10Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_10_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P280SrcFilS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P280SrcFilL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P281ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P281ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P282ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P282ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P283ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P283ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P284ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P284ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P285ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P285ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P286ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P286ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P287ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P287ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P288ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P288ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P289ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P289ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P290ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P290ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P291ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P291ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P292ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P292ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P293ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P293ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P294ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P294ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P295ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P295ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P296ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P296ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P297ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P297ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P298RecTrxS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P298RecTrxL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P299ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P299ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P300RecFilS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P300RecFilL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P301FilAmtS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P301FilAmtL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P302MbractyS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P302MbractyL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P303TrxTypS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P303TrxTypL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P304ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P304ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P305NetCntS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P305NetCntL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P306FilCntS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P306FilCntL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P307ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P307ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P308ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P308ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P309ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P309ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P310DbRamtS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P310DbRamtL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P280SrcFilSCounter = -1;
         public boolean isIp65504P280SrcFilSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P280SrcFilSCounter != sharedCounter;
            localIp65504P280SrcFilSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_280_SRC_FIL_S_LEN = 2;
  	/**
	 * serializeIp65504P280SrcFilS
	 */
	protected void serializeIp65504P280SrcFilS(short ip65504P280SrcFilS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P280SrcFilS,IP_65504_P_280_SRC_FIL_S_LEN)
                  ,beginIp65504P280SrcFilS
                  ,IP_65504_P_280_SRC_FIL_S_LEN
                 );
            localIp65504P280SrcFilSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P280SrcFilSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P280SrcFilS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P280SrcFilS() {	 
			return (getShort(beginIp65504P280SrcFilS));
   	}
         int localIp65504P280SrcFilLCounter = -1;
         public boolean isIp65504P280SrcFilLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P280SrcFilLCounter != sharedCounter;
            localIp65504P280SrcFilLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_280_SRC_FIL_L_LEN = 2;
  	/**
	 * serializeIp65504P280SrcFilL
	 */
	protected void serializeIp65504P280SrcFilL(short ip65504P280SrcFilL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P280SrcFilL,IP_65504_P_280_SRC_FIL_L_LEN)
                  ,beginIp65504P280SrcFilL
                  ,IP_65504_P_280_SRC_FIL_L_LEN
                 );
            localIp65504P280SrcFilLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P280SrcFilLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P280SrcFilL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P280SrcFilL() {	 
			return (getShort(beginIp65504P280SrcFilL));
   	}
         int localIp65504P281ReservdSCounter = -1;
         public boolean isIp65504P281ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P281ReservdSCounter != sharedCounter;
            localIp65504P281ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_281_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P281ReservdS
	 */
	protected void serializeIp65504P281ReservdS(short ip65504P281ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P281ReservdS,IP_65504_P_281_RESERVD_S_LEN)
                  ,beginIp65504P281ReservdS
                  ,IP_65504_P_281_RESERVD_S_LEN
                 );
            localIp65504P281ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P281ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P281ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P281ReservdS() {	 
			return (getShort(beginIp65504P281ReservdS));
   	}
         int localIp65504P281ReservdLCounter = -1;
         public boolean isIp65504P281ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P281ReservdLCounter != sharedCounter;
            localIp65504P281ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_281_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P281ReservdL
	 */
	protected void serializeIp65504P281ReservdL(short ip65504P281ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P281ReservdL,IP_65504_P_281_RESERVD_L_LEN)
                  ,beginIp65504P281ReservdL
                  ,IP_65504_P_281_RESERVD_L_LEN
                 );
            localIp65504P281ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P281ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P281ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P281ReservdL() {	 
			return (getShort(beginIp65504P281ReservdL));
   	}
         int localIp65504P282ReservdSCounter = -1;
         public boolean isIp65504P282ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P282ReservdSCounter != sharedCounter;
            localIp65504P282ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_282_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P282ReservdS
	 */
	protected void serializeIp65504P282ReservdS(short ip65504P282ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P282ReservdS,IP_65504_P_282_RESERVD_S_LEN)
                  ,beginIp65504P282ReservdS
                  ,IP_65504_P_282_RESERVD_S_LEN
                 );
            localIp65504P282ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P282ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P282ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P282ReservdS() {	 
			return (getShort(beginIp65504P282ReservdS));
   	}
         int localIp65504P282ReservdLCounter = -1;
         public boolean isIp65504P282ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P282ReservdLCounter != sharedCounter;
            localIp65504P282ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_282_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P282ReservdL
	 */
	protected void serializeIp65504P282ReservdL(short ip65504P282ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P282ReservdL,IP_65504_P_282_RESERVD_L_LEN)
                  ,beginIp65504P282ReservdL
                  ,IP_65504_P_282_RESERVD_L_LEN
                 );
            localIp65504P282ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P282ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P282ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P282ReservdL() {	 
			return (getShort(beginIp65504P282ReservdL));
   	}
         int localIp65504P283ReservdSCounter = -1;
         public boolean isIp65504P283ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P283ReservdSCounter != sharedCounter;
            localIp65504P283ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_283_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P283ReservdS
	 */
	protected void serializeIp65504P283ReservdS(short ip65504P283ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P283ReservdS,IP_65504_P_283_RESERVD_S_LEN)
                  ,beginIp65504P283ReservdS
                  ,IP_65504_P_283_RESERVD_S_LEN
                 );
            localIp65504P283ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P283ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P283ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P283ReservdS() {	 
			return (getShort(beginIp65504P283ReservdS));
   	}
         int localIp65504P283ReservdLCounter = -1;
         public boolean isIp65504P283ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P283ReservdLCounter != sharedCounter;
            localIp65504P283ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_283_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P283ReservdL
	 */
	protected void serializeIp65504P283ReservdL(short ip65504P283ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P283ReservdL,IP_65504_P_283_RESERVD_L_LEN)
                  ,beginIp65504P283ReservdL
                  ,IP_65504_P_283_RESERVD_L_LEN
                 );
            localIp65504P283ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P283ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P283ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P283ReservdL() {	 
			return (getShort(beginIp65504P283ReservdL));
   	}
         int localIp65504P284ReservdSCounter = -1;
         public boolean isIp65504P284ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P284ReservdSCounter != sharedCounter;
            localIp65504P284ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_284_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P284ReservdS
	 */
	protected void serializeIp65504P284ReservdS(short ip65504P284ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P284ReservdS,IP_65504_P_284_RESERVD_S_LEN)
                  ,beginIp65504P284ReservdS
                  ,IP_65504_P_284_RESERVD_S_LEN
                 );
            localIp65504P284ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P284ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P284ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P284ReservdS() {	 
			return (getShort(beginIp65504P284ReservdS));
   	}
         int localIp65504P284ReservdLCounter = -1;
         public boolean isIp65504P284ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P284ReservdLCounter != sharedCounter;
            localIp65504P284ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_284_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P284ReservdL
	 */
	protected void serializeIp65504P284ReservdL(short ip65504P284ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P284ReservdL,IP_65504_P_284_RESERVD_L_LEN)
                  ,beginIp65504P284ReservdL
                  ,IP_65504_P_284_RESERVD_L_LEN
                 );
            localIp65504P284ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P284ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P284ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P284ReservdL() {	 
			return (getShort(beginIp65504P284ReservdL));
   	}
         int localIp65504P285ReservdSCounter = -1;
         public boolean isIp65504P285ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P285ReservdSCounter != sharedCounter;
            localIp65504P285ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_285_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P285ReservdS
	 */
	protected void serializeIp65504P285ReservdS(short ip65504P285ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P285ReservdS,IP_65504_P_285_RESERVD_S_LEN)
                  ,beginIp65504P285ReservdS
                  ,IP_65504_P_285_RESERVD_S_LEN
                 );
            localIp65504P285ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P285ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P285ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P285ReservdS() {	 
			return (getShort(beginIp65504P285ReservdS));
   	}
         int localIp65504P285ReservdLCounter = -1;
         public boolean isIp65504P285ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P285ReservdLCounter != sharedCounter;
            localIp65504P285ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_285_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P285ReservdL
	 */
	protected void serializeIp65504P285ReservdL(short ip65504P285ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P285ReservdL,IP_65504_P_285_RESERVD_L_LEN)
                  ,beginIp65504P285ReservdL
                  ,IP_65504_P_285_RESERVD_L_LEN
                 );
            localIp65504P285ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P285ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P285ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P285ReservdL() {	 
			return (getShort(beginIp65504P285ReservdL));
   	}
         int localIp65504P286ReservdSCounter = -1;
         public boolean isIp65504P286ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P286ReservdSCounter != sharedCounter;
            localIp65504P286ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_286_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P286ReservdS
	 */
	protected void serializeIp65504P286ReservdS(short ip65504P286ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P286ReservdS,IP_65504_P_286_RESERVD_S_LEN)
                  ,beginIp65504P286ReservdS
                  ,IP_65504_P_286_RESERVD_S_LEN
                 );
            localIp65504P286ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P286ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P286ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P286ReservdS() {	 
			return (getShort(beginIp65504P286ReservdS));
   	}
         int localIp65504P286ReservdLCounter = -1;
         public boolean isIp65504P286ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P286ReservdLCounter != sharedCounter;
            localIp65504P286ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_286_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P286ReservdL
	 */
	protected void serializeIp65504P286ReservdL(short ip65504P286ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P286ReservdL,IP_65504_P_286_RESERVD_L_LEN)
                  ,beginIp65504P286ReservdL
                  ,IP_65504_P_286_RESERVD_L_LEN
                 );
            localIp65504P286ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P286ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P286ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P286ReservdL() {	 
			return (getShort(beginIp65504P286ReservdL));
   	}
         int localIp65504P287ReservdSCounter = -1;
         public boolean isIp65504P287ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P287ReservdSCounter != sharedCounter;
            localIp65504P287ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_287_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P287ReservdS
	 */
	protected void serializeIp65504P287ReservdS(short ip65504P287ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P287ReservdS,IP_65504_P_287_RESERVD_S_LEN)
                  ,beginIp65504P287ReservdS
                  ,IP_65504_P_287_RESERVD_S_LEN
                 );
            localIp65504P287ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P287ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P287ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P287ReservdS() {	 
			return (getShort(beginIp65504P287ReservdS));
   	}
         int localIp65504P287ReservdLCounter = -1;
         public boolean isIp65504P287ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P287ReservdLCounter != sharedCounter;
            localIp65504P287ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_287_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P287ReservdL
	 */
	protected void serializeIp65504P287ReservdL(short ip65504P287ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P287ReservdL,IP_65504_P_287_RESERVD_L_LEN)
                  ,beginIp65504P287ReservdL
                  ,IP_65504_P_287_RESERVD_L_LEN
                 );
            localIp65504P287ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P287ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P287ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P287ReservdL() {	 
			return (getShort(beginIp65504P287ReservdL));
   	}
         int localIp65504P288ReservdSCounter = -1;
         public boolean isIp65504P288ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P288ReservdSCounter != sharedCounter;
            localIp65504P288ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_288_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P288ReservdS
	 */
	protected void serializeIp65504P288ReservdS(short ip65504P288ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P288ReservdS,IP_65504_P_288_RESERVD_S_LEN)
                  ,beginIp65504P288ReservdS
                  ,IP_65504_P_288_RESERVD_S_LEN
                 );
            localIp65504P288ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P288ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P288ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P288ReservdS() {	 
			return (getShort(beginIp65504P288ReservdS));
   	}
         int localIp65504P288ReservdLCounter = -1;
         public boolean isIp65504P288ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P288ReservdLCounter != sharedCounter;
            localIp65504P288ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_288_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P288ReservdL
	 */
	protected void serializeIp65504P288ReservdL(short ip65504P288ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P288ReservdL,IP_65504_P_288_RESERVD_L_LEN)
                  ,beginIp65504P288ReservdL
                  ,IP_65504_P_288_RESERVD_L_LEN
                 );
            localIp65504P288ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P288ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P288ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P288ReservdL() {	 
			return (getShort(beginIp65504P288ReservdL));
   	}
         int localIp65504P289ReservdSCounter = -1;
         public boolean isIp65504P289ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P289ReservdSCounter != sharedCounter;
            localIp65504P289ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_289_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P289ReservdS
	 */
	protected void serializeIp65504P289ReservdS(short ip65504P289ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P289ReservdS,IP_65504_P_289_RESERVD_S_LEN)
                  ,beginIp65504P289ReservdS
                  ,IP_65504_P_289_RESERVD_S_LEN
                 );
            localIp65504P289ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P289ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P289ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P289ReservdS() {	 
			return (getShort(beginIp65504P289ReservdS));
   	}
         int localIp65504P289ReservdLCounter = -1;
         public boolean isIp65504P289ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P289ReservdLCounter != sharedCounter;
            localIp65504P289ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_289_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P289ReservdL
	 */
	protected void serializeIp65504P289ReservdL(short ip65504P289ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P289ReservdL,IP_65504_P_289_RESERVD_L_LEN)
                  ,beginIp65504P289ReservdL
                  ,IP_65504_P_289_RESERVD_L_LEN
                 );
            localIp65504P289ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P289ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P289ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P289ReservdL() {	 
			return (getShort(beginIp65504P289ReservdL));
   	}
         int localIp65504P290ReservdSCounter = -1;
         public boolean isIp65504P290ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P290ReservdSCounter != sharedCounter;
            localIp65504P290ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_290_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P290ReservdS
	 */
	protected void serializeIp65504P290ReservdS(short ip65504P290ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P290ReservdS,IP_65504_P_290_RESERVD_S_LEN)
                  ,beginIp65504P290ReservdS
                  ,IP_65504_P_290_RESERVD_S_LEN
                 );
            localIp65504P290ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P290ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P290ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P290ReservdS() {	 
			return (getShort(beginIp65504P290ReservdS));
   	}
         int localIp65504P290ReservdLCounter = -1;
         public boolean isIp65504P290ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P290ReservdLCounter != sharedCounter;
            localIp65504P290ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_290_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P290ReservdL
	 */
	protected void serializeIp65504P290ReservdL(short ip65504P290ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P290ReservdL,IP_65504_P_290_RESERVD_L_LEN)
                  ,beginIp65504P290ReservdL
                  ,IP_65504_P_290_RESERVD_L_LEN
                 );
            localIp65504P290ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P290ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P290ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P290ReservdL() {	 
			return (getShort(beginIp65504P290ReservdL));
   	}
         int localIp65504P291ReservdSCounter = -1;
         public boolean isIp65504P291ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P291ReservdSCounter != sharedCounter;
            localIp65504P291ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_291_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P291ReservdS
	 */
	protected void serializeIp65504P291ReservdS(short ip65504P291ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P291ReservdS,IP_65504_P_291_RESERVD_S_LEN)
                  ,beginIp65504P291ReservdS
                  ,IP_65504_P_291_RESERVD_S_LEN
                 );
            localIp65504P291ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P291ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P291ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P291ReservdS() {	 
			return (getShort(beginIp65504P291ReservdS));
   	}
         int localIp65504P291ReservdLCounter = -1;
         public boolean isIp65504P291ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P291ReservdLCounter != sharedCounter;
            localIp65504P291ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_291_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P291ReservdL
	 */
	protected void serializeIp65504P291ReservdL(short ip65504P291ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P291ReservdL,IP_65504_P_291_RESERVD_L_LEN)
                  ,beginIp65504P291ReservdL
                  ,IP_65504_P_291_RESERVD_L_LEN
                 );
            localIp65504P291ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P291ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P291ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P291ReservdL() {	 
			return (getShort(beginIp65504P291ReservdL));
   	}
         int localIp65504P292ReservdSCounter = -1;
         public boolean isIp65504P292ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P292ReservdSCounter != sharedCounter;
            localIp65504P292ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_292_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P292ReservdS
	 */
	protected void serializeIp65504P292ReservdS(short ip65504P292ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P292ReservdS,IP_65504_P_292_RESERVD_S_LEN)
                  ,beginIp65504P292ReservdS
                  ,IP_65504_P_292_RESERVD_S_LEN
                 );
            localIp65504P292ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P292ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P292ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P292ReservdS() {	 
			return (getShort(beginIp65504P292ReservdS));
   	}
         int localIp65504P292ReservdLCounter = -1;
         public boolean isIp65504P292ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P292ReservdLCounter != sharedCounter;
            localIp65504P292ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_292_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P292ReservdL
	 */
	protected void serializeIp65504P292ReservdL(short ip65504P292ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P292ReservdL,IP_65504_P_292_RESERVD_L_LEN)
                  ,beginIp65504P292ReservdL
                  ,IP_65504_P_292_RESERVD_L_LEN
                 );
            localIp65504P292ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P292ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P292ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P292ReservdL() {	 
			return (getShort(beginIp65504P292ReservdL));
   	}
         int localIp65504P293ReservdSCounter = -1;
         public boolean isIp65504P293ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P293ReservdSCounter != sharedCounter;
            localIp65504P293ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_293_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P293ReservdS
	 */
	protected void serializeIp65504P293ReservdS(short ip65504P293ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P293ReservdS,IP_65504_P_293_RESERVD_S_LEN)
                  ,beginIp65504P293ReservdS
                  ,IP_65504_P_293_RESERVD_S_LEN
                 );
            localIp65504P293ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P293ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P293ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P293ReservdS() {	 
			return (getShort(beginIp65504P293ReservdS));
   	}
         int localIp65504P293ReservdLCounter = -1;
         public boolean isIp65504P293ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P293ReservdLCounter != sharedCounter;
            localIp65504P293ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_293_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P293ReservdL
	 */
	protected void serializeIp65504P293ReservdL(short ip65504P293ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P293ReservdL,IP_65504_P_293_RESERVD_L_LEN)
                  ,beginIp65504P293ReservdL
                  ,IP_65504_P_293_RESERVD_L_LEN
                 );
            localIp65504P293ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P293ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P293ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P293ReservdL() {	 
			return (getShort(beginIp65504P293ReservdL));
   	}
         int localIp65504P294ReservdSCounter = -1;
         public boolean isIp65504P294ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P294ReservdSCounter != sharedCounter;
            localIp65504P294ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_294_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P294ReservdS
	 */
	protected void serializeIp65504P294ReservdS(short ip65504P294ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P294ReservdS,IP_65504_P_294_RESERVD_S_LEN)
                  ,beginIp65504P294ReservdS
                  ,IP_65504_P_294_RESERVD_S_LEN
                 );
            localIp65504P294ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P294ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P294ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P294ReservdS() {	 
			return (getShort(beginIp65504P294ReservdS));
   	}
         int localIp65504P294ReservdLCounter = -1;
         public boolean isIp65504P294ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P294ReservdLCounter != sharedCounter;
            localIp65504P294ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_294_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P294ReservdL
	 */
	protected void serializeIp65504P294ReservdL(short ip65504P294ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P294ReservdL,IP_65504_P_294_RESERVD_L_LEN)
                  ,beginIp65504P294ReservdL
                  ,IP_65504_P_294_RESERVD_L_LEN
                 );
            localIp65504P294ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P294ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P294ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P294ReservdL() {	 
			return (getShort(beginIp65504P294ReservdL));
   	}
         int localIp65504P295ReservdSCounter = -1;
         public boolean isIp65504P295ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P295ReservdSCounter != sharedCounter;
            localIp65504P295ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_295_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P295ReservdS
	 */
	protected void serializeIp65504P295ReservdS(short ip65504P295ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P295ReservdS,IP_65504_P_295_RESERVD_S_LEN)
                  ,beginIp65504P295ReservdS
                  ,IP_65504_P_295_RESERVD_S_LEN
                 );
            localIp65504P295ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P295ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P295ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P295ReservdS() {	 
			return (getShort(beginIp65504P295ReservdS));
   	}
         int localIp65504P295ReservdLCounter = -1;
         public boolean isIp65504P295ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P295ReservdLCounter != sharedCounter;
            localIp65504P295ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_295_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P295ReservdL
	 */
	protected void serializeIp65504P295ReservdL(short ip65504P295ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P295ReservdL,IP_65504_P_295_RESERVD_L_LEN)
                  ,beginIp65504P295ReservdL
                  ,IP_65504_P_295_RESERVD_L_LEN
                 );
            localIp65504P295ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P295ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P295ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P295ReservdL() {	 
			return (getShort(beginIp65504P295ReservdL));
   	}
         int localIp65504P296ReservdSCounter = -1;
         public boolean isIp65504P296ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P296ReservdSCounter != sharedCounter;
            localIp65504P296ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_296_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P296ReservdS
	 */
	protected void serializeIp65504P296ReservdS(short ip65504P296ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P296ReservdS,IP_65504_P_296_RESERVD_S_LEN)
                  ,beginIp65504P296ReservdS
                  ,IP_65504_P_296_RESERVD_S_LEN
                 );
            localIp65504P296ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P296ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P296ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P296ReservdS() {	 
			return (getShort(beginIp65504P296ReservdS));
   	}
         int localIp65504P296ReservdLCounter = -1;
         public boolean isIp65504P296ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P296ReservdLCounter != sharedCounter;
            localIp65504P296ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_296_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P296ReservdL
	 */
	protected void serializeIp65504P296ReservdL(short ip65504P296ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P296ReservdL,IP_65504_P_296_RESERVD_L_LEN)
                  ,beginIp65504P296ReservdL
                  ,IP_65504_P_296_RESERVD_L_LEN
                 );
            localIp65504P296ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P296ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P296ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P296ReservdL() {	 
			return (getShort(beginIp65504P296ReservdL));
   	}
         int localIp65504P297ReservdSCounter = -1;
         public boolean isIp65504P297ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P297ReservdSCounter != sharedCounter;
            localIp65504P297ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_297_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P297ReservdS
	 */
	protected void serializeIp65504P297ReservdS(short ip65504P297ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P297ReservdS,IP_65504_P_297_RESERVD_S_LEN)
                  ,beginIp65504P297ReservdS
                  ,IP_65504_P_297_RESERVD_S_LEN
                 );
            localIp65504P297ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P297ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P297ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P297ReservdS() {	 
			return (getShort(beginIp65504P297ReservdS));
   	}
         int localIp65504P297ReservdLCounter = -1;
         public boolean isIp65504P297ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P297ReservdLCounter != sharedCounter;
            localIp65504P297ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_297_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P297ReservdL
	 */
	protected void serializeIp65504P297ReservdL(short ip65504P297ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P297ReservdL,IP_65504_P_297_RESERVD_L_LEN)
                  ,beginIp65504P297ReservdL
                  ,IP_65504_P_297_RESERVD_L_LEN
                 );
            localIp65504P297ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P297ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P297ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P297ReservdL() {	 
			return (getShort(beginIp65504P297ReservdL));
   	}
         int localIp65504P298RecTrxSCounter = -1;
         public boolean isIp65504P298RecTrxSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P298RecTrxSCounter != sharedCounter;
            localIp65504P298RecTrxSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_298_REC_TRX_S_LEN = 2;
  	/**
	 * serializeIp65504P298RecTrxS
	 */
	protected void serializeIp65504P298RecTrxS(short ip65504P298RecTrxS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P298RecTrxS,IP_65504_P_298_REC_TRX_S_LEN)
                  ,beginIp65504P298RecTrxS
                  ,IP_65504_P_298_REC_TRX_S_LEN
                 );
            localIp65504P298RecTrxSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P298RecTrxSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P298RecTrxS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P298RecTrxS() {	 
			return (getShort(beginIp65504P298RecTrxS));
   	}
         int localIp65504P298RecTrxLCounter = -1;
         public boolean isIp65504P298RecTrxLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P298RecTrxLCounter != sharedCounter;
            localIp65504P298RecTrxLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_298_REC_TRX_L_LEN = 2;
  	/**
	 * serializeIp65504P298RecTrxL
	 */
	protected void serializeIp65504P298RecTrxL(short ip65504P298RecTrxL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P298RecTrxL,IP_65504_P_298_REC_TRX_L_LEN)
                  ,beginIp65504P298RecTrxL
                  ,IP_65504_P_298_REC_TRX_L_LEN
                 );
            localIp65504P298RecTrxLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P298RecTrxLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P298RecTrxL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P298RecTrxL() {	 
			return (getShort(beginIp65504P298RecTrxL));
   	}
         int localIp65504P299ReservdSCounter = -1;
         public boolean isIp65504P299ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P299ReservdSCounter != sharedCounter;
            localIp65504P299ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_299_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P299ReservdS
	 */
	protected void serializeIp65504P299ReservdS(short ip65504P299ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P299ReservdS,IP_65504_P_299_RESERVD_S_LEN)
                  ,beginIp65504P299ReservdS
                  ,IP_65504_P_299_RESERVD_S_LEN
                 );
            localIp65504P299ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P299ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P299ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P299ReservdS() {	 
			return (getShort(beginIp65504P299ReservdS));
   	}
         int localIp65504P299ReservdLCounter = -1;
         public boolean isIp65504P299ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P299ReservdLCounter != sharedCounter;
            localIp65504P299ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_299_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P299ReservdL
	 */
	protected void serializeIp65504P299ReservdL(short ip65504P299ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P299ReservdL,IP_65504_P_299_RESERVD_L_LEN)
                  ,beginIp65504P299ReservdL
                  ,IP_65504_P_299_RESERVD_L_LEN
                 );
            localIp65504P299ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P299ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P299ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P299ReservdL() {	 
			return (getShort(beginIp65504P299ReservdL));
   	}
         int localIp65504P300RecFilSCounter = -1;
         public boolean isIp65504P300RecFilSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P300RecFilSCounter != sharedCounter;
            localIp65504P300RecFilSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_300_REC_FIL_S_LEN = 2;
  	/**
	 * serializeIp65504P300RecFilS
	 */
	protected void serializeIp65504P300RecFilS(short ip65504P300RecFilS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P300RecFilS,IP_65504_P_300_REC_FIL_S_LEN)
                  ,beginIp65504P300RecFilS
                  ,IP_65504_P_300_REC_FIL_S_LEN
                 );
            localIp65504P300RecFilSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P300RecFilSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P300RecFilS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P300RecFilS() {	 
			return (getShort(beginIp65504P300RecFilS));
   	}
         int localIp65504P300RecFilLCounter = -1;
         public boolean isIp65504P300RecFilLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P300RecFilLCounter != sharedCounter;
            localIp65504P300RecFilLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_300_REC_FIL_L_LEN = 2;
  	/**
	 * serializeIp65504P300RecFilL
	 */
	protected void serializeIp65504P300RecFilL(short ip65504P300RecFilL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P300RecFilL,IP_65504_P_300_REC_FIL_L_LEN)
                  ,beginIp65504P300RecFilL
                  ,IP_65504_P_300_REC_FIL_L_LEN
                 );
            localIp65504P300RecFilLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P300RecFilLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P300RecFilL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P300RecFilL() {	 
			return (getShort(beginIp65504P300RecFilL));
   	}
         int localIp65504P301FilAmtSCounter = -1;
         public boolean isIp65504P301FilAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P301FilAmtSCounter != sharedCounter;
            localIp65504P301FilAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_301_FIL_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504P301FilAmtS
	 */
	protected void serializeIp65504P301FilAmtS(short ip65504P301FilAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P301FilAmtS,IP_65504_P_301_FIL_AMT_S_LEN)
                  ,beginIp65504P301FilAmtS
                  ,IP_65504_P_301_FIL_AMT_S_LEN
                 );
            localIp65504P301FilAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P301FilAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P301FilAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P301FilAmtS() {	 
			return (getShort(beginIp65504P301FilAmtS));
   	}
         int localIp65504P301FilAmtLCounter = -1;
         public boolean isIp65504P301FilAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P301FilAmtLCounter != sharedCounter;
            localIp65504P301FilAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_301_FIL_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504P301FilAmtL
	 */
	protected void serializeIp65504P301FilAmtL(short ip65504P301FilAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P301FilAmtL,IP_65504_P_301_FIL_AMT_L_LEN)
                  ,beginIp65504P301FilAmtL
                  ,IP_65504_P_301_FIL_AMT_L_LEN
                 );
            localIp65504P301FilAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P301FilAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P301FilAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P301FilAmtL() {	 
			return (getShort(beginIp65504P301FilAmtL));
   	}
         int localIp65504P302MbractySCounter = -1;
         public boolean isIp65504P302MbractySModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P302MbractySCounter != sharedCounter;
            localIp65504P302MbractySCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_302_MBRACTY_S_LEN = 2;
  	/**
	 * serializeIp65504P302MbractyS
	 */
	protected void serializeIp65504P302MbractyS(short ip65504P302MbractyS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P302MbractyS,IP_65504_P_302_MBRACTY_S_LEN)
                  ,beginIp65504P302MbractyS
                  ,IP_65504_P_302_MBRACTY_S_LEN
                 );
            localIp65504P302MbractySCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P302MbractySMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P302MbractyS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P302MbractyS() {	 
			return (getShort(beginIp65504P302MbractyS));
   	}
         int localIp65504P302MbractyLCounter = -1;
         public boolean isIp65504P302MbractyLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P302MbractyLCounter != sharedCounter;
            localIp65504P302MbractyLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_302_MBRACTY_L_LEN = 2;
  	/**
	 * serializeIp65504P302MbractyL
	 */
	protected void serializeIp65504P302MbractyL(short ip65504P302MbractyL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P302MbractyL,IP_65504_P_302_MBRACTY_L_LEN)
                  ,beginIp65504P302MbractyL
                  ,IP_65504_P_302_MBRACTY_L_LEN
                 );
            localIp65504P302MbractyLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P302MbractyLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P302MbractyL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P302MbractyL() {	 
			return (getShort(beginIp65504P302MbractyL));
   	}
         int localIp65504P303TrxTypSCounter = -1;
         public boolean isIp65504P303TrxTypSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P303TrxTypSCounter != sharedCounter;
            localIp65504P303TrxTypSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_303_TRX_TYP_S_LEN = 2;
  	/**
	 * serializeIp65504P303TrxTypS
	 */
	protected void serializeIp65504P303TrxTypS(short ip65504P303TrxTypS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P303TrxTypS,IP_65504_P_303_TRX_TYP_S_LEN)
                  ,beginIp65504P303TrxTypS
                  ,IP_65504_P_303_TRX_TYP_S_LEN
                 );
            localIp65504P303TrxTypSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P303TrxTypSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P303TrxTypS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P303TrxTypS() {	 
			return (getShort(beginIp65504P303TrxTypS));
   	}
         int localIp65504P303TrxTypLCounter = -1;
         public boolean isIp65504P303TrxTypLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P303TrxTypLCounter != sharedCounter;
            localIp65504P303TrxTypLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_303_TRX_TYP_L_LEN = 2;
  	/**
	 * serializeIp65504P303TrxTypL
	 */
	protected void serializeIp65504P303TrxTypL(short ip65504P303TrxTypL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P303TrxTypL,IP_65504_P_303_TRX_TYP_L_LEN)
                  ,beginIp65504P303TrxTypL
                  ,IP_65504_P_303_TRX_TYP_L_LEN
                 );
            localIp65504P303TrxTypLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P303TrxTypLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P303TrxTypL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P303TrxTypL() {	 
			return (getShort(beginIp65504P303TrxTypL));
   	}
         int localIp65504P304ReservdSCounter = -1;
         public boolean isIp65504P304ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P304ReservdSCounter != sharedCounter;
            localIp65504P304ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_304_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P304ReservdS
	 */
	protected void serializeIp65504P304ReservdS(short ip65504P304ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P304ReservdS,IP_65504_P_304_RESERVD_S_LEN)
                  ,beginIp65504P304ReservdS
                  ,IP_65504_P_304_RESERVD_S_LEN
                 );
            localIp65504P304ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P304ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P304ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P304ReservdS() {	 
			return (getShort(beginIp65504P304ReservdS));
   	}
         int localIp65504P304ReservdLCounter = -1;
         public boolean isIp65504P304ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P304ReservdLCounter != sharedCounter;
            localIp65504P304ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_304_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P304ReservdL
	 */
	protected void serializeIp65504P304ReservdL(short ip65504P304ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P304ReservdL,IP_65504_P_304_RESERVD_L_LEN)
                  ,beginIp65504P304ReservdL
                  ,IP_65504_P_304_RESERVD_L_LEN
                 );
            localIp65504P304ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P304ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P304ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P304ReservdL() {	 
			return (getShort(beginIp65504P304ReservdL));
   	}
         int localIp65504P305NetCntSCounter = -1;
         public boolean isIp65504P305NetCntSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P305NetCntSCounter != sharedCounter;
            localIp65504P305NetCntSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_305_NET_CNT_S_LEN = 2;
  	/**
	 * serializeIp65504P305NetCntS
	 */
	protected void serializeIp65504P305NetCntS(short ip65504P305NetCntS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P305NetCntS,IP_65504_P_305_NET_CNT_S_LEN)
                  ,beginIp65504P305NetCntS
                  ,IP_65504_P_305_NET_CNT_S_LEN
                 );
            localIp65504P305NetCntSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P305NetCntSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P305NetCntS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P305NetCntS() {	 
			return (getShort(beginIp65504P305NetCntS));
   	}
         int localIp65504P305NetCntLCounter = -1;
         public boolean isIp65504P305NetCntLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P305NetCntLCounter != sharedCounter;
            localIp65504P305NetCntLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_305_NET_CNT_L_LEN = 2;
  	/**
	 * serializeIp65504P305NetCntL
	 */
	protected void serializeIp65504P305NetCntL(short ip65504P305NetCntL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P305NetCntL,IP_65504_P_305_NET_CNT_L_LEN)
                  ,beginIp65504P305NetCntL
                  ,IP_65504_P_305_NET_CNT_L_LEN
                 );
            localIp65504P305NetCntLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P305NetCntLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P305NetCntL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P305NetCntL() {	 
			return (getShort(beginIp65504P305NetCntL));
   	}
         int localIp65504P306FilCntSCounter = -1;
         public boolean isIp65504P306FilCntSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P306FilCntSCounter != sharedCounter;
            localIp65504P306FilCntSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_306_FIL_CNT_S_LEN = 2;
  	/**
	 * serializeIp65504P306FilCntS
	 */
	protected void serializeIp65504P306FilCntS(short ip65504P306FilCntS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P306FilCntS,IP_65504_P_306_FIL_CNT_S_LEN)
                  ,beginIp65504P306FilCntS
                  ,IP_65504_P_306_FIL_CNT_S_LEN
                 );
            localIp65504P306FilCntSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P306FilCntSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P306FilCntS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P306FilCntS() {	 
			return (getShort(beginIp65504P306FilCntS));
   	}
         int localIp65504P306FilCntLCounter = -1;
         public boolean isIp65504P306FilCntLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P306FilCntLCounter != sharedCounter;
            localIp65504P306FilCntLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_306_FIL_CNT_L_LEN = 2;
  	/**
	 * serializeIp65504P306FilCntL
	 */
	protected void serializeIp65504P306FilCntL(short ip65504P306FilCntL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P306FilCntL,IP_65504_P_306_FIL_CNT_L_LEN)
                  ,beginIp65504P306FilCntL
                  ,IP_65504_P_306_FIL_CNT_L_LEN
                 );
            localIp65504P306FilCntLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P306FilCntLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P306FilCntL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P306FilCntL() {	 
			return (getShort(beginIp65504P306FilCntL));
   	}
         int localIp65504P307ReservdSCounter = -1;
         public boolean isIp65504P307ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P307ReservdSCounter != sharedCounter;
            localIp65504P307ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_307_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P307ReservdS
	 */
	protected void serializeIp65504P307ReservdS(short ip65504P307ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P307ReservdS,IP_65504_P_307_RESERVD_S_LEN)
                  ,beginIp65504P307ReservdS
                  ,IP_65504_P_307_RESERVD_S_LEN
                 );
            localIp65504P307ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P307ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P307ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P307ReservdS() {	 
			return (getShort(beginIp65504P307ReservdS));
   	}
         int localIp65504P307ReservdLCounter = -1;
         public boolean isIp65504P307ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P307ReservdLCounter != sharedCounter;
            localIp65504P307ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_307_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P307ReservdL
	 */
	protected void serializeIp65504P307ReservdL(short ip65504P307ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P307ReservdL,IP_65504_P_307_RESERVD_L_LEN)
                  ,beginIp65504P307ReservdL
                  ,IP_65504_P_307_RESERVD_L_LEN
                 );
            localIp65504P307ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P307ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P307ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P307ReservdL() {	 
			return (getShort(beginIp65504P307ReservdL));
   	}
         int localIp65504P308ReservdSCounter = -1;
         public boolean isIp65504P308ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P308ReservdSCounter != sharedCounter;
            localIp65504P308ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_308_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P308ReservdS
	 */
	protected void serializeIp65504P308ReservdS(short ip65504P308ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P308ReservdS,IP_65504_P_308_RESERVD_S_LEN)
                  ,beginIp65504P308ReservdS
                  ,IP_65504_P_308_RESERVD_S_LEN
                 );
            localIp65504P308ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P308ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P308ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P308ReservdS() {	 
			return (getShort(beginIp65504P308ReservdS));
   	}
         int localIp65504P308ReservdLCounter = -1;
         public boolean isIp65504P308ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P308ReservdLCounter != sharedCounter;
            localIp65504P308ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_308_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P308ReservdL
	 */
	protected void serializeIp65504P308ReservdL(short ip65504P308ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P308ReservdL,IP_65504_P_308_RESERVD_L_LEN)
                  ,beginIp65504P308ReservdL
                  ,IP_65504_P_308_RESERVD_L_LEN
                 );
            localIp65504P308ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P308ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P308ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P308ReservdL() {	 
			return (getShort(beginIp65504P308ReservdL));
   	}
         int localIp65504P309ReservdSCounter = -1;
         public boolean isIp65504P309ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P309ReservdSCounter != sharedCounter;
            localIp65504P309ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_309_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P309ReservdS
	 */
	protected void serializeIp65504P309ReservdS(short ip65504P309ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P309ReservdS,IP_65504_P_309_RESERVD_S_LEN)
                  ,beginIp65504P309ReservdS
                  ,IP_65504_P_309_RESERVD_S_LEN
                 );
            localIp65504P309ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P309ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P309ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P309ReservdS() {	 
			return (getShort(beginIp65504P309ReservdS));
   	}
         int localIp65504P309ReservdLCounter = -1;
         public boolean isIp65504P309ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P309ReservdLCounter != sharedCounter;
            localIp65504P309ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_309_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P309ReservdL
	 */
	protected void serializeIp65504P309ReservdL(short ip65504P309ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P309ReservdL,IP_65504_P_309_RESERVD_L_LEN)
                  ,beginIp65504P309ReservdL
                  ,IP_65504_P_309_RESERVD_L_LEN
                 );
            localIp65504P309ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P309ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P309ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P309ReservdL() {	 
			return (getShort(beginIp65504P309ReservdL));
   	}
         int localIp65504P310DbRamtSCounter = -1;
         public boolean isIp65504P310DbRamtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P310DbRamtSCounter != sharedCounter;
            localIp65504P310DbRamtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_310_DB_RAMT_S_LEN = 2;
  	/**
	 * serializeIp65504P310DbRamtS
	 */
	protected void serializeIp65504P310DbRamtS(short ip65504P310DbRamtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P310DbRamtS,IP_65504_P_310_DB_RAMT_S_LEN)
                  ,beginIp65504P310DbRamtS
                  ,IP_65504_P_310_DB_RAMT_S_LEN
                 );
            localIp65504P310DbRamtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P310DbRamtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P310DbRamtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P310DbRamtS() {	 
			return (getShort(beginIp65504P310DbRamtS));
   	}
         int localIp65504P310DbRamtLCounter = -1;
         public boolean isIp65504P310DbRamtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P310DbRamtLCounter != sharedCounter;
            localIp65504P310DbRamtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_310_DB_RAMT_L_LEN = 2;
  	/**
	 * serializeIp65504P310DbRamtL
	 */
	protected void serializeIp65504P310DbRamtL(short ip65504P310DbRamtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P310DbRamtL,IP_65504_P_310_DB_RAMT_L_LEN)
                  ,beginIp65504P310DbRamtL
                  ,IP_65504_P_310_DB_RAMT_L_LEN
                 );
            localIp65504P310DbRamtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P310DbRamtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P310DbRamtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P310DbRamtL() {	 
			return (getShort(beginIp65504P310DbRamtL));
   	}




}
  
