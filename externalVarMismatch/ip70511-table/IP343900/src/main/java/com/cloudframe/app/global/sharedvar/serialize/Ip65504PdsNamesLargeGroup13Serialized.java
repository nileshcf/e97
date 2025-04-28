package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup13Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup13Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup13Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_13_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P373RecIdxS;
            protected  int beginIp65504P373RecIdxL;
            protected  int beginIp65504P374RecPcdS;
            protected  int beginIp65504P374RecPcdL;
            protected  int beginIp65504P375Mbrind1S;
            protected  int beginIp65504P375Mbrind1L;
            protected  int beginIp65504P376Mbrind2S;
            protected  int beginIp65504P376Mbrind2L;
            protected  int beginIp65504P377ReservdS;
            protected  int beginIp65504P377ReservdL;
            protected  int beginIp65504P378ComTtlS;
            protected  int beginIp65504P378ComTtlL;
            protected  int beginIp65504P379ReservdS;
            protected  int beginIp65504P379ReservdL;
            protected  int beginIp65504P380DbtxamtS;
            protected  int beginIp65504P380DbtxamtL;
            protected  int beginIp65504P381CrtxamtS;
            protected  int beginIp65504P381CrtxamtL;
            protected  int beginIp65504P382DbFeesS;
            protected  int beginIp65504P382DbFeesL;
            protected  int beginIp65504P383CrFeesS;
            protected  int beginIp65504P383CrFeesL;
            protected  int beginIp65504P384TrxAmtS;
            protected  int beginIp65504P384TrxAmtL;
            protected  int beginIp65504P385TrxFeeS;
            protected  int beginIp65504P385TrxFeeL;
            protected  int beginIp65504P386NetAmtS;
            protected  int beginIp65504P386NetAmtL;
            protected  int beginIp65504P387ReservdS;
            protected  int beginIp65504P387ReservdL;
            protected  int beginIp65504P388ReservdS;
            protected  int beginIp65504P388ReservdL;
            protected  int beginIp65504P389ReservdS;
            protected  int beginIp65504P389ReservdL;
            protected  int beginIp65504P390DbtxamtS;
            protected  int beginIp65504P390DbtxamtL;
            protected  int beginIp65504P391CrtxamtS;
            protected  int beginIp65504P391CrtxamtL;
            protected  int beginIp65504P392DbtxfeeS;
            protected  int beginIp65504P392DbtxfeeL;
            protected  int beginIp65504P393CrtxfeeS;
            protected  int beginIp65504P393CrtxfeeL;
            protected  int beginIp65504P394AmtNetS;
            protected  int beginIp65504P394AmtNetL;
            protected  int beginIp65504P395AmtFeeS;
            protected  int beginIp65504P395AmtFeeL;
            protected  int beginIp65504P396AmtTtlS;
            protected  int beginIp65504P396AmtTtlL;
            protected  int beginIp65504P397ReservdS;
            protected  int beginIp65504P397ReservdL;
            protected  int beginIp65504P398ReservdS;
            protected  int beginIp65504P398ReservdL;
            protected  int beginIp65504P399ReservdS;
            protected  int beginIp65504P399ReservdL;
            protected  int beginIp65504P400DbtrxnoS;
            protected  int beginIp65504P400DbtrxnoL;
            protected  int beginIp65504P401CrtrxnoS;
            protected  int beginIp65504P401CrtrxnoL;
            protected  int beginIp65504P402TrxTtlS;
            protected  int beginIp65504P402TrxTtlL;
            protected  int beginIp65504P403ReservdS;
            protected  int beginIp65504P403ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup13Serialized
	**/
    public Ip65504PdsNamesLargeGroup13Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup13Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup13Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup13Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2972); // serialize this field at offset 2972 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup13Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2972 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup13Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_13_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P373RecIdxS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P373RecIdxL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P374RecPcdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P374RecPcdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P375Mbrind1S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P375Mbrind1L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P376Mbrind2S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P376Mbrind2L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P377ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P377ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P378ComTtlS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P378ComTtlL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P379ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P379ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P380DbtxamtS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P380DbtxamtL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P381CrtxamtS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P381CrtxamtL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P382DbFeesS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P382DbFeesL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P383CrFeesS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P383CrFeesL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P384TrxAmtS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P384TrxAmtL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P385TrxFeeS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P385TrxFeeL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P386NetAmtS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P386NetAmtL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P387ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P387ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P388ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P388ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P389ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P389ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P390DbtxamtS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P390DbtxamtL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P391CrtxamtS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P391CrtxamtL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P392DbtxfeeS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P392DbtxfeeL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P393CrtxfeeS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P393CrtxfeeL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P394AmtNetS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P394AmtNetL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P395AmtFeeS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P395AmtFeeL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P396AmtTtlS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P396AmtTtlL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P397ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P397ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P398ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P398ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P399ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P399ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P400DbtrxnoS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P400DbtrxnoL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P401CrtrxnoS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P401CrtrxnoL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P402TrxTtlS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P402TrxTtlL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P403ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P403ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P373RecIdxSCounter = -1;
         public boolean isIp65504P373RecIdxSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P373RecIdxSCounter != sharedCounter;
            localIp65504P373RecIdxSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_373_REC_IDX_S_LEN = 2;
  	/**
	 * serializeIp65504P373RecIdxS
	 */
	protected void serializeIp65504P373RecIdxS(short ip65504P373RecIdxS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P373RecIdxS,IP_65504_P_373_REC_IDX_S_LEN)
                  ,beginIp65504P373RecIdxS
                  ,IP_65504_P_373_REC_IDX_S_LEN
                 );
            localIp65504P373RecIdxSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P373RecIdxSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P373RecIdxS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P373RecIdxS() {	 
			return (getShort(beginIp65504P373RecIdxS));
   	}
         int localIp65504P373RecIdxLCounter = -1;
         public boolean isIp65504P373RecIdxLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P373RecIdxLCounter != sharedCounter;
            localIp65504P373RecIdxLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_373_REC_IDX_L_LEN = 2;
  	/**
	 * serializeIp65504P373RecIdxL
	 */
	protected void serializeIp65504P373RecIdxL(short ip65504P373RecIdxL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P373RecIdxL,IP_65504_P_373_REC_IDX_L_LEN)
                  ,beginIp65504P373RecIdxL
                  ,IP_65504_P_373_REC_IDX_L_LEN
                 );
            localIp65504P373RecIdxLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P373RecIdxLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P373RecIdxL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P373RecIdxL() {	 
			return (getShort(beginIp65504P373RecIdxL));
   	}
         int localIp65504P374RecPcdSCounter = -1;
         public boolean isIp65504P374RecPcdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P374RecPcdSCounter != sharedCounter;
            localIp65504P374RecPcdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_374_REC_PCD_S_LEN = 2;
  	/**
	 * serializeIp65504P374RecPcdS
	 */
	protected void serializeIp65504P374RecPcdS(short ip65504P374RecPcdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P374RecPcdS,IP_65504_P_374_REC_PCD_S_LEN)
                  ,beginIp65504P374RecPcdS
                  ,IP_65504_P_374_REC_PCD_S_LEN
                 );
            localIp65504P374RecPcdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P374RecPcdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P374RecPcdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P374RecPcdS() {	 
			return (getShort(beginIp65504P374RecPcdS));
   	}
         int localIp65504P374RecPcdLCounter = -1;
         public boolean isIp65504P374RecPcdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P374RecPcdLCounter != sharedCounter;
            localIp65504P374RecPcdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_374_REC_PCD_L_LEN = 2;
  	/**
	 * serializeIp65504P374RecPcdL
	 */
	protected void serializeIp65504P374RecPcdL(short ip65504P374RecPcdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P374RecPcdL,IP_65504_P_374_REC_PCD_L_LEN)
                  ,beginIp65504P374RecPcdL
                  ,IP_65504_P_374_REC_PCD_L_LEN
                 );
            localIp65504P374RecPcdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P374RecPcdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P374RecPcdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P374RecPcdL() {	 
			return (getShort(beginIp65504P374RecPcdL));
   	}
         int localIp65504P375Mbrind1SCounter = -1;
         public boolean isIp65504P375Mbrind1SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P375Mbrind1SCounter != sharedCounter;
            localIp65504P375Mbrind1SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_375_MBRIND_1_S_LEN = 2;
  	/**
	 * serializeIp65504P375Mbrind1S
	 */
	protected void serializeIp65504P375Mbrind1S(short ip65504P375Mbrind1S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P375Mbrind1S,IP_65504_P_375_MBRIND_1_S_LEN)
                  ,beginIp65504P375Mbrind1S
                  ,IP_65504_P_375_MBRIND_1_S_LEN
                 );
            localIp65504P375Mbrind1SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P375Mbrind1SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P375Mbrind1S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P375Mbrind1S() {	 
			return (getShort(beginIp65504P375Mbrind1S));
   	}
         int localIp65504P375Mbrind1LCounter = -1;
         public boolean isIp65504P375Mbrind1LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P375Mbrind1LCounter != sharedCounter;
            localIp65504P375Mbrind1LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_375_MBRIND_1_L_LEN = 2;
  	/**
	 * serializeIp65504P375Mbrind1L
	 */
	protected void serializeIp65504P375Mbrind1L(short ip65504P375Mbrind1L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P375Mbrind1L,IP_65504_P_375_MBRIND_1_L_LEN)
                  ,beginIp65504P375Mbrind1L
                  ,IP_65504_P_375_MBRIND_1_L_LEN
                 );
            localIp65504P375Mbrind1LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P375Mbrind1LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P375Mbrind1L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P375Mbrind1L() {	 
			return (getShort(beginIp65504P375Mbrind1L));
   	}
         int localIp65504P376Mbrind2SCounter = -1;
         public boolean isIp65504P376Mbrind2SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P376Mbrind2SCounter != sharedCounter;
            localIp65504P376Mbrind2SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_376_MBRIND_2_S_LEN = 2;
  	/**
	 * serializeIp65504P376Mbrind2S
	 */
	protected void serializeIp65504P376Mbrind2S(short ip65504P376Mbrind2S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P376Mbrind2S,IP_65504_P_376_MBRIND_2_S_LEN)
                  ,beginIp65504P376Mbrind2S
                  ,IP_65504_P_376_MBRIND_2_S_LEN
                 );
            localIp65504P376Mbrind2SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P376Mbrind2SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P376Mbrind2S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P376Mbrind2S() {	 
			return (getShort(beginIp65504P376Mbrind2S));
   	}
         int localIp65504P376Mbrind2LCounter = -1;
         public boolean isIp65504P376Mbrind2LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P376Mbrind2LCounter != sharedCounter;
            localIp65504P376Mbrind2LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_376_MBRIND_2_L_LEN = 2;
  	/**
	 * serializeIp65504P376Mbrind2L
	 */
	protected void serializeIp65504P376Mbrind2L(short ip65504P376Mbrind2L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P376Mbrind2L,IP_65504_P_376_MBRIND_2_L_LEN)
                  ,beginIp65504P376Mbrind2L
                  ,IP_65504_P_376_MBRIND_2_L_LEN
                 );
            localIp65504P376Mbrind2LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P376Mbrind2LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P376Mbrind2L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P376Mbrind2L() {	 
			return (getShort(beginIp65504P376Mbrind2L));
   	}
         int localIp65504P377ReservdSCounter = -1;
         public boolean isIp65504P377ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P377ReservdSCounter != sharedCounter;
            localIp65504P377ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_377_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P377ReservdS
	 */
	protected void serializeIp65504P377ReservdS(short ip65504P377ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P377ReservdS,IP_65504_P_377_RESERVD_S_LEN)
                  ,beginIp65504P377ReservdS
                  ,IP_65504_P_377_RESERVD_S_LEN
                 );
            localIp65504P377ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P377ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P377ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P377ReservdS() {	 
			return (getShort(beginIp65504P377ReservdS));
   	}
         int localIp65504P377ReservdLCounter = -1;
         public boolean isIp65504P377ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P377ReservdLCounter != sharedCounter;
            localIp65504P377ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_377_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P377ReservdL
	 */
	protected void serializeIp65504P377ReservdL(short ip65504P377ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P377ReservdL,IP_65504_P_377_RESERVD_L_LEN)
                  ,beginIp65504P377ReservdL
                  ,IP_65504_P_377_RESERVD_L_LEN
                 );
            localIp65504P377ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P377ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P377ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P377ReservdL() {	 
			return (getShort(beginIp65504P377ReservdL));
   	}
         int localIp65504P378ComTtlSCounter = -1;
         public boolean isIp65504P378ComTtlSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P378ComTtlSCounter != sharedCounter;
            localIp65504P378ComTtlSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_378_COM_TTL_S_LEN = 2;
  	/**
	 * serializeIp65504P378ComTtlS
	 */
	protected void serializeIp65504P378ComTtlS(short ip65504P378ComTtlS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P378ComTtlS,IP_65504_P_378_COM_TTL_S_LEN)
                  ,beginIp65504P378ComTtlS
                  ,IP_65504_P_378_COM_TTL_S_LEN
                 );
            localIp65504P378ComTtlSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P378ComTtlSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P378ComTtlS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P378ComTtlS() {	 
			return (getShort(beginIp65504P378ComTtlS));
   	}
         int localIp65504P378ComTtlLCounter = -1;
         public boolean isIp65504P378ComTtlLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P378ComTtlLCounter != sharedCounter;
            localIp65504P378ComTtlLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_378_COM_TTL_L_LEN = 2;
  	/**
	 * serializeIp65504P378ComTtlL
	 */
	protected void serializeIp65504P378ComTtlL(short ip65504P378ComTtlL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P378ComTtlL,IP_65504_P_378_COM_TTL_L_LEN)
                  ,beginIp65504P378ComTtlL
                  ,IP_65504_P_378_COM_TTL_L_LEN
                 );
            localIp65504P378ComTtlLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P378ComTtlLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P378ComTtlL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P378ComTtlL() {	 
			return (getShort(beginIp65504P378ComTtlL));
   	}
         int localIp65504P379ReservdSCounter = -1;
         public boolean isIp65504P379ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P379ReservdSCounter != sharedCounter;
            localIp65504P379ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_379_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P379ReservdS
	 */
	protected void serializeIp65504P379ReservdS(short ip65504P379ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P379ReservdS,IP_65504_P_379_RESERVD_S_LEN)
                  ,beginIp65504P379ReservdS
                  ,IP_65504_P_379_RESERVD_S_LEN
                 );
            localIp65504P379ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P379ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P379ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P379ReservdS() {	 
			return (getShort(beginIp65504P379ReservdS));
   	}
         int localIp65504P379ReservdLCounter = -1;
         public boolean isIp65504P379ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P379ReservdLCounter != sharedCounter;
            localIp65504P379ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_379_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P379ReservdL
	 */
	protected void serializeIp65504P379ReservdL(short ip65504P379ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P379ReservdL,IP_65504_P_379_RESERVD_L_LEN)
                  ,beginIp65504P379ReservdL
                  ,IP_65504_P_379_RESERVD_L_LEN
                 );
            localIp65504P379ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P379ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P379ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P379ReservdL() {	 
			return (getShort(beginIp65504P379ReservdL));
   	}
         int localIp65504P380DbtxamtSCounter = -1;
         public boolean isIp65504P380DbtxamtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P380DbtxamtSCounter != sharedCounter;
            localIp65504P380DbtxamtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_380_DBTXAMT_S_LEN = 2;
  	/**
	 * serializeIp65504P380DbtxamtS
	 */
	protected void serializeIp65504P380DbtxamtS(short ip65504P380DbtxamtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P380DbtxamtS,IP_65504_P_380_DBTXAMT_S_LEN)
                  ,beginIp65504P380DbtxamtS
                  ,IP_65504_P_380_DBTXAMT_S_LEN
                 );
            localIp65504P380DbtxamtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P380DbtxamtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P380DbtxamtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P380DbtxamtS() {	 
			return (getShort(beginIp65504P380DbtxamtS));
   	}
         int localIp65504P380DbtxamtLCounter = -1;
         public boolean isIp65504P380DbtxamtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P380DbtxamtLCounter != sharedCounter;
            localIp65504P380DbtxamtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_380_DBTXAMT_L_LEN = 2;
  	/**
	 * serializeIp65504P380DbtxamtL
	 */
	protected void serializeIp65504P380DbtxamtL(short ip65504P380DbtxamtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P380DbtxamtL,IP_65504_P_380_DBTXAMT_L_LEN)
                  ,beginIp65504P380DbtxamtL
                  ,IP_65504_P_380_DBTXAMT_L_LEN
                 );
            localIp65504P380DbtxamtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P380DbtxamtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P380DbtxamtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P380DbtxamtL() {	 
			return (getShort(beginIp65504P380DbtxamtL));
   	}
         int localIp65504P381CrtxamtSCounter = -1;
         public boolean isIp65504P381CrtxamtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P381CrtxamtSCounter != sharedCounter;
            localIp65504P381CrtxamtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_381_CRTXAMT_S_LEN = 2;
  	/**
	 * serializeIp65504P381CrtxamtS
	 */
	protected void serializeIp65504P381CrtxamtS(short ip65504P381CrtxamtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P381CrtxamtS,IP_65504_P_381_CRTXAMT_S_LEN)
                  ,beginIp65504P381CrtxamtS
                  ,IP_65504_P_381_CRTXAMT_S_LEN
                 );
            localIp65504P381CrtxamtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P381CrtxamtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P381CrtxamtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P381CrtxamtS() {	 
			return (getShort(beginIp65504P381CrtxamtS));
   	}
         int localIp65504P381CrtxamtLCounter = -1;
         public boolean isIp65504P381CrtxamtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P381CrtxamtLCounter != sharedCounter;
            localIp65504P381CrtxamtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_381_CRTXAMT_L_LEN = 2;
  	/**
	 * serializeIp65504P381CrtxamtL
	 */
	protected void serializeIp65504P381CrtxamtL(short ip65504P381CrtxamtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P381CrtxamtL,IP_65504_P_381_CRTXAMT_L_LEN)
                  ,beginIp65504P381CrtxamtL
                  ,IP_65504_P_381_CRTXAMT_L_LEN
                 );
            localIp65504P381CrtxamtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P381CrtxamtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P381CrtxamtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P381CrtxamtL() {	 
			return (getShort(beginIp65504P381CrtxamtL));
   	}
         int localIp65504P382DbFeesSCounter = -1;
         public boolean isIp65504P382DbFeesSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P382DbFeesSCounter != sharedCounter;
            localIp65504P382DbFeesSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_382_DB_FEES_S_LEN = 2;
  	/**
	 * serializeIp65504P382DbFeesS
	 */
	protected void serializeIp65504P382DbFeesS(short ip65504P382DbFeesS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P382DbFeesS,IP_65504_P_382_DB_FEES_S_LEN)
                  ,beginIp65504P382DbFeesS
                  ,IP_65504_P_382_DB_FEES_S_LEN
                 );
            localIp65504P382DbFeesSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P382DbFeesSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P382DbFeesS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P382DbFeesS() {	 
			return (getShort(beginIp65504P382DbFeesS));
   	}
         int localIp65504P382DbFeesLCounter = -1;
         public boolean isIp65504P382DbFeesLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P382DbFeesLCounter != sharedCounter;
            localIp65504P382DbFeesLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_382_DB_FEES_L_LEN = 2;
  	/**
	 * serializeIp65504P382DbFeesL
	 */
	protected void serializeIp65504P382DbFeesL(short ip65504P382DbFeesL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P382DbFeesL,IP_65504_P_382_DB_FEES_L_LEN)
                  ,beginIp65504P382DbFeesL
                  ,IP_65504_P_382_DB_FEES_L_LEN
                 );
            localIp65504P382DbFeesLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P382DbFeesLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P382DbFeesL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P382DbFeesL() {	 
			return (getShort(beginIp65504P382DbFeesL));
   	}
         int localIp65504P383CrFeesSCounter = -1;
         public boolean isIp65504P383CrFeesSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P383CrFeesSCounter != sharedCounter;
            localIp65504P383CrFeesSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_383_CR_FEES_S_LEN = 2;
  	/**
	 * serializeIp65504P383CrFeesS
	 */
	protected void serializeIp65504P383CrFeesS(short ip65504P383CrFeesS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P383CrFeesS,IP_65504_P_383_CR_FEES_S_LEN)
                  ,beginIp65504P383CrFeesS
                  ,IP_65504_P_383_CR_FEES_S_LEN
                 );
            localIp65504P383CrFeesSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P383CrFeesSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P383CrFeesS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P383CrFeesS() {	 
			return (getShort(beginIp65504P383CrFeesS));
   	}
         int localIp65504P383CrFeesLCounter = -1;
         public boolean isIp65504P383CrFeesLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P383CrFeesLCounter != sharedCounter;
            localIp65504P383CrFeesLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_383_CR_FEES_L_LEN = 2;
  	/**
	 * serializeIp65504P383CrFeesL
	 */
	protected void serializeIp65504P383CrFeesL(short ip65504P383CrFeesL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P383CrFeesL,IP_65504_P_383_CR_FEES_L_LEN)
                  ,beginIp65504P383CrFeesL
                  ,IP_65504_P_383_CR_FEES_L_LEN
                 );
            localIp65504P383CrFeesLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P383CrFeesLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P383CrFeesL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P383CrFeesL() {	 
			return (getShort(beginIp65504P383CrFeesL));
   	}
         int localIp65504P384TrxAmtSCounter = -1;
         public boolean isIp65504P384TrxAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P384TrxAmtSCounter != sharedCounter;
            localIp65504P384TrxAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_384_TRX_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504P384TrxAmtS
	 */
	protected void serializeIp65504P384TrxAmtS(short ip65504P384TrxAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P384TrxAmtS,IP_65504_P_384_TRX_AMT_S_LEN)
                  ,beginIp65504P384TrxAmtS
                  ,IP_65504_P_384_TRX_AMT_S_LEN
                 );
            localIp65504P384TrxAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P384TrxAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P384TrxAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P384TrxAmtS() {	 
			return (getShort(beginIp65504P384TrxAmtS));
   	}
         int localIp65504P384TrxAmtLCounter = -1;
         public boolean isIp65504P384TrxAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P384TrxAmtLCounter != sharedCounter;
            localIp65504P384TrxAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_384_TRX_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504P384TrxAmtL
	 */
	protected void serializeIp65504P384TrxAmtL(short ip65504P384TrxAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P384TrxAmtL,IP_65504_P_384_TRX_AMT_L_LEN)
                  ,beginIp65504P384TrxAmtL
                  ,IP_65504_P_384_TRX_AMT_L_LEN
                 );
            localIp65504P384TrxAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P384TrxAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P384TrxAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P384TrxAmtL() {	 
			return (getShort(beginIp65504P384TrxAmtL));
   	}
         int localIp65504P385TrxFeeSCounter = -1;
         public boolean isIp65504P385TrxFeeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P385TrxFeeSCounter != sharedCounter;
            localIp65504P385TrxFeeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_385_TRX_FEE_S_LEN = 2;
  	/**
	 * serializeIp65504P385TrxFeeS
	 */
	protected void serializeIp65504P385TrxFeeS(short ip65504P385TrxFeeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P385TrxFeeS,IP_65504_P_385_TRX_FEE_S_LEN)
                  ,beginIp65504P385TrxFeeS
                  ,IP_65504_P_385_TRX_FEE_S_LEN
                 );
            localIp65504P385TrxFeeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P385TrxFeeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P385TrxFeeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P385TrxFeeS() {	 
			return (getShort(beginIp65504P385TrxFeeS));
   	}
         int localIp65504P385TrxFeeLCounter = -1;
         public boolean isIp65504P385TrxFeeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P385TrxFeeLCounter != sharedCounter;
            localIp65504P385TrxFeeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_385_TRX_FEE_L_LEN = 2;
  	/**
	 * serializeIp65504P385TrxFeeL
	 */
	protected void serializeIp65504P385TrxFeeL(short ip65504P385TrxFeeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P385TrxFeeL,IP_65504_P_385_TRX_FEE_L_LEN)
                  ,beginIp65504P385TrxFeeL
                  ,IP_65504_P_385_TRX_FEE_L_LEN
                 );
            localIp65504P385TrxFeeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P385TrxFeeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P385TrxFeeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P385TrxFeeL() {	 
			return (getShort(beginIp65504P385TrxFeeL));
   	}
         int localIp65504P386NetAmtSCounter = -1;
         public boolean isIp65504P386NetAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P386NetAmtSCounter != sharedCounter;
            localIp65504P386NetAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_386_NET_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504P386NetAmtS
	 */
	protected void serializeIp65504P386NetAmtS(short ip65504P386NetAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P386NetAmtS,IP_65504_P_386_NET_AMT_S_LEN)
                  ,beginIp65504P386NetAmtS
                  ,IP_65504_P_386_NET_AMT_S_LEN
                 );
            localIp65504P386NetAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P386NetAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P386NetAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P386NetAmtS() {	 
			return (getShort(beginIp65504P386NetAmtS));
   	}
         int localIp65504P386NetAmtLCounter = -1;
         public boolean isIp65504P386NetAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P386NetAmtLCounter != sharedCounter;
            localIp65504P386NetAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_386_NET_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504P386NetAmtL
	 */
	protected void serializeIp65504P386NetAmtL(short ip65504P386NetAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P386NetAmtL,IP_65504_P_386_NET_AMT_L_LEN)
                  ,beginIp65504P386NetAmtL
                  ,IP_65504_P_386_NET_AMT_L_LEN
                 );
            localIp65504P386NetAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P386NetAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P386NetAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P386NetAmtL() {	 
			return (getShort(beginIp65504P386NetAmtL));
   	}
         int localIp65504P387ReservdSCounter = -1;
         public boolean isIp65504P387ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P387ReservdSCounter != sharedCounter;
            localIp65504P387ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_387_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P387ReservdS
	 */
	protected void serializeIp65504P387ReservdS(short ip65504P387ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P387ReservdS,IP_65504_P_387_RESERVD_S_LEN)
                  ,beginIp65504P387ReservdS
                  ,IP_65504_P_387_RESERVD_S_LEN
                 );
            localIp65504P387ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P387ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P387ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P387ReservdS() {	 
			return (getShort(beginIp65504P387ReservdS));
   	}
         int localIp65504P387ReservdLCounter = -1;
         public boolean isIp65504P387ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P387ReservdLCounter != sharedCounter;
            localIp65504P387ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_387_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P387ReservdL
	 */
	protected void serializeIp65504P387ReservdL(short ip65504P387ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P387ReservdL,IP_65504_P_387_RESERVD_L_LEN)
                  ,beginIp65504P387ReservdL
                  ,IP_65504_P_387_RESERVD_L_LEN
                 );
            localIp65504P387ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P387ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P387ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P387ReservdL() {	 
			return (getShort(beginIp65504P387ReservdL));
   	}
         int localIp65504P388ReservdSCounter = -1;
         public boolean isIp65504P388ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P388ReservdSCounter != sharedCounter;
            localIp65504P388ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_388_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P388ReservdS
	 */
	protected void serializeIp65504P388ReservdS(short ip65504P388ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P388ReservdS,IP_65504_P_388_RESERVD_S_LEN)
                  ,beginIp65504P388ReservdS
                  ,IP_65504_P_388_RESERVD_S_LEN
                 );
            localIp65504P388ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P388ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P388ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P388ReservdS() {	 
			return (getShort(beginIp65504P388ReservdS));
   	}
         int localIp65504P388ReservdLCounter = -1;
         public boolean isIp65504P388ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P388ReservdLCounter != sharedCounter;
            localIp65504P388ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_388_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P388ReservdL
	 */
	protected void serializeIp65504P388ReservdL(short ip65504P388ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P388ReservdL,IP_65504_P_388_RESERVD_L_LEN)
                  ,beginIp65504P388ReservdL
                  ,IP_65504_P_388_RESERVD_L_LEN
                 );
            localIp65504P388ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P388ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P388ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P388ReservdL() {	 
			return (getShort(beginIp65504P388ReservdL));
   	}
         int localIp65504P389ReservdSCounter = -1;
         public boolean isIp65504P389ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P389ReservdSCounter != sharedCounter;
            localIp65504P389ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_389_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P389ReservdS
	 */
	protected void serializeIp65504P389ReservdS(short ip65504P389ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P389ReservdS,IP_65504_P_389_RESERVD_S_LEN)
                  ,beginIp65504P389ReservdS
                  ,IP_65504_P_389_RESERVD_S_LEN
                 );
            localIp65504P389ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P389ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P389ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P389ReservdS() {	 
			return (getShort(beginIp65504P389ReservdS));
   	}
         int localIp65504P389ReservdLCounter = -1;
         public boolean isIp65504P389ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P389ReservdLCounter != sharedCounter;
            localIp65504P389ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_389_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P389ReservdL
	 */
	protected void serializeIp65504P389ReservdL(short ip65504P389ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P389ReservdL,IP_65504_P_389_RESERVD_L_LEN)
                  ,beginIp65504P389ReservdL
                  ,IP_65504_P_389_RESERVD_L_LEN
                 );
            localIp65504P389ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P389ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P389ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P389ReservdL() {	 
			return (getShort(beginIp65504P389ReservdL));
   	}
         int localIp65504P390DbtxamtSCounter = -1;
         public boolean isIp65504P390DbtxamtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P390DbtxamtSCounter != sharedCounter;
            localIp65504P390DbtxamtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_390_DBTXAMT_S_LEN = 2;
  	/**
	 * serializeIp65504P390DbtxamtS
	 */
	protected void serializeIp65504P390DbtxamtS(short ip65504P390DbtxamtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P390DbtxamtS,IP_65504_P_390_DBTXAMT_S_LEN)
                  ,beginIp65504P390DbtxamtS
                  ,IP_65504_P_390_DBTXAMT_S_LEN
                 );
            localIp65504P390DbtxamtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P390DbtxamtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P390DbtxamtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P390DbtxamtS() {	 
			return (getShort(beginIp65504P390DbtxamtS));
   	}
         int localIp65504P390DbtxamtLCounter = -1;
         public boolean isIp65504P390DbtxamtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P390DbtxamtLCounter != sharedCounter;
            localIp65504P390DbtxamtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_390_DBTXAMT_L_LEN = 2;
  	/**
	 * serializeIp65504P390DbtxamtL
	 */
	protected void serializeIp65504P390DbtxamtL(short ip65504P390DbtxamtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P390DbtxamtL,IP_65504_P_390_DBTXAMT_L_LEN)
                  ,beginIp65504P390DbtxamtL
                  ,IP_65504_P_390_DBTXAMT_L_LEN
                 );
            localIp65504P390DbtxamtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P390DbtxamtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P390DbtxamtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P390DbtxamtL() {	 
			return (getShort(beginIp65504P390DbtxamtL));
   	}
         int localIp65504P391CrtxamtSCounter = -1;
         public boolean isIp65504P391CrtxamtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P391CrtxamtSCounter != sharedCounter;
            localIp65504P391CrtxamtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_391_CRTXAMT_S_LEN = 2;
  	/**
	 * serializeIp65504P391CrtxamtS
	 */
	protected void serializeIp65504P391CrtxamtS(short ip65504P391CrtxamtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P391CrtxamtS,IP_65504_P_391_CRTXAMT_S_LEN)
                  ,beginIp65504P391CrtxamtS
                  ,IP_65504_P_391_CRTXAMT_S_LEN
                 );
            localIp65504P391CrtxamtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P391CrtxamtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P391CrtxamtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P391CrtxamtS() {	 
			return (getShort(beginIp65504P391CrtxamtS));
   	}
         int localIp65504P391CrtxamtLCounter = -1;
         public boolean isIp65504P391CrtxamtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P391CrtxamtLCounter != sharedCounter;
            localIp65504P391CrtxamtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_391_CRTXAMT_L_LEN = 2;
  	/**
	 * serializeIp65504P391CrtxamtL
	 */
	protected void serializeIp65504P391CrtxamtL(short ip65504P391CrtxamtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P391CrtxamtL,IP_65504_P_391_CRTXAMT_L_LEN)
                  ,beginIp65504P391CrtxamtL
                  ,IP_65504_P_391_CRTXAMT_L_LEN
                 );
            localIp65504P391CrtxamtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P391CrtxamtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P391CrtxamtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P391CrtxamtL() {	 
			return (getShort(beginIp65504P391CrtxamtL));
   	}
         int localIp65504P392DbtxfeeSCounter = -1;
         public boolean isIp65504P392DbtxfeeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P392DbtxfeeSCounter != sharedCounter;
            localIp65504P392DbtxfeeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_392_DBTXFEE_S_LEN = 2;
  	/**
	 * serializeIp65504P392DbtxfeeS
	 */
	protected void serializeIp65504P392DbtxfeeS(short ip65504P392DbtxfeeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P392DbtxfeeS,IP_65504_P_392_DBTXFEE_S_LEN)
                  ,beginIp65504P392DbtxfeeS
                  ,IP_65504_P_392_DBTXFEE_S_LEN
                 );
            localIp65504P392DbtxfeeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P392DbtxfeeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P392DbtxfeeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P392DbtxfeeS() {	 
			return (getShort(beginIp65504P392DbtxfeeS));
   	}
         int localIp65504P392DbtxfeeLCounter = -1;
         public boolean isIp65504P392DbtxfeeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P392DbtxfeeLCounter != sharedCounter;
            localIp65504P392DbtxfeeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_392_DBTXFEE_L_LEN = 2;
  	/**
	 * serializeIp65504P392DbtxfeeL
	 */
	protected void serializeIp65504P392DbtxfeeL(short ip65504P392DbtxfeeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P392DbtxfeeL,IP_65504_P_392_DBTXFEE_L_LEN)
                  ,beginIp65504P392DbtxfeeL
                  ,IP_65504_P_392_DBTXFEE_L_LEN
                 );
            localIp65504P392DbtxfeeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P392DbtxfeeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P392DbtxfeeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P392DbtxfeeL() {	 
			return (getShort(beginIp65504P392DbtxfeeL));
   	}
         int localIp65504P393CrtxfeeSCounter = -1;
         public boolean isIp65504P393CrtxfeeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P393CrtxfeeSCounter != sharedCounter;
            localIp65504P393CrtxfeeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_393_CRTXFEE_S_LEN = 2;
  	/**
	 * serializeIp65504P393CrtxfeeS
	 */
	protected void serializeIp65504P393CrtxfeeS(short ip65504P393CrtxfeeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P393CrtxfeeS,IP_65504_P_393_CRTXFEE_S_LEN)
                  ,beginIp65504P393CrtxfeeS
                  ,IP_65504_P_393_CRTXFEE_S_LEN
                 );
            localIp65504P393CrtxfeeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P393CrtxfeeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P393CrtxfeeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P393CrtxfeeS() {	 
			return (getShort(beginIp65504P393CrtxfeeS));
   	}
         int localIp65504P393CrtxfeeLCounter = -1;
         public boolean isIp65504P393CrtxfeeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P393CrtxfeeLCounter != sharedCounter;
            localIp65504P393CrtxfeeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_393_CRTXFEE_L_LEN = 2;
  	/**
	 * serializeIp65504P393CrtxfeeL
	 */
	protected void serializeIp65504P393CrtxfeeL(short ip65504P393CrtxfeeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P393CrtxfeeL,IP_65504_P_393_CRTXFEE_L_LEN)
                  ,beginIp65504P393CrtxfeeL
                  ,IP_65504_P_393_CRTXFEE_L_LEN
                 );
            localIp65504P393CrtxfeeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P393CrtxfeeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P393CrtxfeeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P393CrtxfeeL() {	 
			return (getShort(beginIp65504P393CrtxfeeL));
   	}
         int localIp65504P394AmtNetSCounter = -1;
         public boolean isIp65504P394AmtNetSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P394AmtNetSCounter != sharedCounter;
            localIp65504P394AmtNetSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_394_AMT_NET_S_LEN = 2;
  	/**
	 * serializeIp65504P394AmtNetS
	 */
	protected void serializeIp65504P394AmtNetS(short ip65504P394AmtNetS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P394AmtNetS,IP_65504_P_394_AMT_NET_S_LEN)
                  ,beginIp65504P394AmtNetS
                  ,IP_65504_P_394_AMT_NET_S_LEN
                 );
            localIp65504P394AmtNetSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P394AmtNetSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P394AmtNetS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P394AmtNetS() {	 
			return (getShort(beginIp65504P394AmtNetS));
   	}
         int localIp65504P394AmtNetLCounter = -1;
         public boolean isIp65504P394AmtNetLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P394AmtNetLCounter != sharedCounter;
            localIp65504P394AmtNetLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_394_AMT_NET_L_LEN = 2;
  	/**
	 * serializeIp65504P394AmtNetL
	 */
	protected void serializeIp65504P394AmtNetL(short ip65504P394AmtNetL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P394AmtNetL,IP_65504_P_394_AMT_NET_L_LEN)
                  ,beginIp65504P394AmtNetL
                  ,IP_65504_P_394_AMT_NET_L_LEN
                 );
            localIp65504P394AmtNetLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P394AmtNetLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P394AmtNetL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P394AmtNetL() {	 
			return (getShort(beginIp65504P394AmtNetL));
   	}
         int localIp65504P395AmtFeeSCounter = -1;
         public boolean isIp65504P395AmtFeeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P395AmtFeeSCounter != sharedCounter;
            localIp65504P395AmtFeeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_395_AMT_FEE_S_LEN = 2;
  	/**
	 * serializeIp65504P395AmtFeeS
	 */
	protected void serializeIp65504P395AmtFeeS(short ip65504P395AmtFeeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P395AmtFeeS,IP_65504_P_395_AMT_FEE_S_LEN)
                  ,beginIp65504P395AmtFeeS
                  ,IP_65504_P_395_AMT_FEE_S_LEN
                 );
            localIp65504P395AmtFeeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P395AmtFeeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P395AmtFeeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P395AmtFeeS() {	 
			return (getShort(beginIp65504P395AmtFeeS));
   	}
         int localIp65504P395AmtFeeLCounter = -1;
         public boolean isIp65504P395AmtFeeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P395AmtFeeLCounter != sharedCounter;
            localIp65504P395AmtFeeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_395_AMT_FEE_L_LEN = 2;
  	/**
	 * serializeIp65504P395AmtFeeL
	 */
	protected void serializeIp65504P395AmtFeeL(short ip65504P395AmtFeeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P395AmtFeeL,IP_65504_P_395_AMT_FEE_L_LEN)
                  ,beginIp65504P395AmtFeeL
                  ,IP_65504_P_395_AMT_FEE_L_LEN
                 );
            localIp65504P395AmtFeeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P395AmtFeeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P395AmtFeeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P395AmtFeeL() {	 
			return (getShort(beginIp65504P395AmtFeeL));
   	}
         int localIp65504P396AmtTtlSCounter = -1;
         public boolean isIp65504P396AmtTtlSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P396AmtTtlSCounter != sharedCounter;
            localIp65504P396AmtTtlSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_396_AMT_TTL_S_LEN = 2;
  	/**
	 * serializeIp65504P396AmtTtlS
	 */
	protected void serializeIp65504P396AmtTtlS(short ip65504P396AmtTtlS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P396AmtTtlS,IP_65504_P_396_AMT_TTL_S_LEN)
                  ,beginIp65504P396AmtTtlS
                  ,IP_65504_P_396_AMT_TTL_S_LEN
                 );
            localIp65504P396AmtTtlSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P396AmtTtlSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P396AmtTtlS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P396AmtTtlS() {	 
			return (getShort(beginIp65504P396AmtTtlS));
   	}
         int localIp65504P396AmtTtlLCounter = -1;
         public boolean isIp65504P396AmtTtlLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P396AmtTtlLCounter != sharedCounter;
            localIp65504P396AmtTtlLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_396_AMT_TTL_L_LEN = 2;
  	/**
	 * serializeIp65504P396AmtTtlL
	 */
	protected void serializeIp65504P396AmtTtlL(short ip65504P396AmtTtlL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P396AmtTtlL,IP_65504_P_396_AMT_TTL_L_LEN)
                  ,beginIp65504P396AmtTtlL
                  ,IP_65504_P_396_AMT_TTL_L_LEN
                 );
            localIp65504P396AmtTtlLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P396AmtTtlLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P396AmtTtlL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P396AmtTtlL() {	 
			return (getShort(beginIp65504P396AmtTtlL));
   	}
         int localIp65504P397ReservdSCounter = -1;
         public boolean isIp65504P397ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P397ReservdSCounter != sharedCounter;
            localIp65504P397ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_397_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P397ReservdS
	 */
	protected void serializeIp65504P397ReservdS(short ip65504P397ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P397ReservdS,IP_65504_P_397_RESERVD_S_LEN)
                  ,beginIp65504P397ReservdS
                  ,IP_65504_P_397_RESERVD_S_LEN
                 );
            localIp65504P397ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P397ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P397ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P397ReservdS() {	 
			return (getShort(beginIp65504P397ReservdS));
   	}
         int localIp65504P397ReservdLCounter = -1;
         public boolean isIp65504P397ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P397ReservdLCounter != sharedCounter;
            localIp65504P397ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_397_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P397ReservdL
	 */
	protected void serializeIp65504P397ReservdL(short ip65504P397ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P397ReservdL,IP_65504_P_397_RESERVD_L_LEN)
                  ,beginIp65504P397ReservdL
                  ,IP_65504_P_397_RESERVD_L_LEN
                 );
            localIp65504P397ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P397ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P397ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P397ReservdL() {	 
			return (getShort(beginIp65504P397ReservdL));
   	}
         int localIp65504P398ReservdSCounter = -1;
         public boolean isIp65504P398ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P398ReservdSCounter != sharedCounter;
            localIp65504P398ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_398_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P398ReservdS
	 */
	protected void serializeIp65504P398ReservdS(short ip65504P398ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P398ReservdS,IP_65504_P_398_RESERVD_S_LEN)
                  ,beginIp65504P398ReservdS
                  ,IP_65504_P_398_RESERVD_S_LEN
                 );
            localIp65504P398ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P398ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P398ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P398ReservdS() {	 
			return (getShort(beginIp65504P398ReservdS));
   	}
         int localIp65504P398ReservdLCounter = -1;
         public boolean isIp65504P398ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P398ReservdLCounter != sharedCounter;
            localIp65504P398ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_398_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P398ReservdL
	 */
	protected void serializeIp65504P398ReservdL(short ip65504P398ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P398ReservdL,IP_65504_P_398_RESERVD_L_LEN)
                  ,beginIp65504P398ReservdL
                  ,IP_65504_P_398_RESERVD_L_LEN
                 );
            localIp65504P398ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P398ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P398ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P398ReservdL() {	 
			return (getShort(beginIp65504P398ReservdL));
   	}
         int localIp65504P399ReservdSCounter = -1;
         public boolean isIp65504P399ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P399ReservdSCounter != sharedCounter;
            localIp65504P399ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_399_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P399ReservdS
	 */
	protected void serializeIp65504P399ReservdS(short ip65504P399ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P399ReservdS,IP_65504_P_399_RESERVD_S_LEN)
                  ,beginIp65504P399ReservdS
                  ,IP_65504_P_399_RESERVD_S_LEN
                 );
            localIp65504P399ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P399ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P399ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P399ReservdS() {	 
			return (getShort(beginIp65504P399ReservdS));
   	}
         int localIp65504P399ReservdLCounter = -1;
         public boolean isIp65504P399ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P399ReservdLCounter != sharedCounter;
            localIp65504P399ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_399_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P399ReservdL
	 */
	protected void serializeIp65504P399ReservdL(short ip65504P399ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P399ReservdL,IP_65504_P_399_RESERVD_L_LEN)
                  ,beginIp65504P399ReservdL
                  ,IP_65504_P_399_RESERVD_L_LEN
                 );
            localIp65504P399ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P399ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P399ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P399ReservdL() {	 
			return (getShort(beginIp65504P399ReservdL));
   	}
         int localIp65504P400DbtrxnoSCounter = -1;
         public boolean isIp65504P400DbtrxnoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P400DbtrxnoSCounter != sharedCounter;
            localIp65504P400DbtrxnoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_400_DBTRXNO_S_LEN = 2;
  	/**
	 * serializeIp65504P400DbtrxnoS
	 */
	protected void serializeIp65504P400DbtrxnoS(short ip65504P400DbtrxnoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P400DbtrxnoS,IP_65504_P_400_DBTRXNO_S_LEN)
                  ,beginIp65504P400DbtrxnoS
                  ,IP_65504_P_400_DBTRXNO_S_LEN
                 );
            localIp65504P400DbtrxnoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P400DbtrxnoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P400DbtrxnoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P400DbtrxnoS() {	 
			return (getShort(beginIp65504P400DbtrxnoS));
   	}
         int localIp65504P400DbtrxnoLCounter = -1;
         public boolean isIp65504P400DbtrxnoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P400DbtrxnoLCounter != sharedCounter;
            localIp65504P400DbtrxnoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_400_DBTRXNO_L_LEN = 2;
  	/**
	 * serializeIp65504P400DbtrxnoL
	 */
	protected void serializeIp65504P400DbtrxnoL(short ip65504P400DbtrxnoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P400DbtrxnoL,IP_65504_P_400_DBTRXNO_L_LEN)
                  ,beginIp65504P400DbtrxnoL
                  ,IP_65504_P_400_DBTRXNO_L_LEN
                 );
            localIp65504P400DbtrxnoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P400DbtrxnoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P400DbtrxnoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P400DbtrxnoL() {	 
			return (getShort(beginIp65504P400DbtrxnoL));
   	}
         int localIp65504P401CrtrxnoSCounter = -1;
         public boolean isIp65504P401CrtrxnoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P401CrtrxnoSCounter != sharedCounter;
            localIp65504P401CrtrxnoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_401_CRTRXNO_S_LEN = 2;
  	/**
	 * serializeIp65504P401CrtrxnoS
	 */
	protected void serializeIp65504P401CrtrxnoS(short ip65504P401CrtrxnoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P401CrtrxnoS,IP_65504_P_401_CRTRXNO_S_LEN)
                  ,beginIp65504P401CrtrxnoS
                  ,IP_65504_P_401_CRTRXNO_S_LEN
                 );
            localIp65504P401CrtrxnoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P401CrtrxnoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P401CrtrxnoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P401CrtrxnoS() {	 
			return (getShort(beginIp65504P401CrtrxnoS));
   	}
         int localIp65504P401CrtrxnoLCounter = -1;
         public boolean isIp65504P401CrtrxnoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P401CrtrxnoLCounter != sharedCounter;
            localIp65504P401CrtrxnoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_401_CRTRXNO_L_LEN = 2;
  	/**
	 * serializeIp65504P401CrtrxnoL
	 */
	protected void serializeIp65504P401CrtrxnoL(short ip65504P401CrtrxnoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P401CrtrxnoL,IP_65504_P_401_CRTRXNO_L_LEN)
                  ,beginIp65504P401CrtrxnoL
                  ,IP_65504_P_401_CRTRXNO_L_LEN
                 );
            localIp65504P401CrtrxnoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P401CrtrxnoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P401CrtrxnoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P401CrtrxnoL() {	 
			return (getShort(beginIp65504P401CrtrxnoL));
   	}
         int localIp65504P402TrxTtlSCounter = -1;
         public boolean isIp65504P402TrxTtlSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P402TrxTtlSCounter != sharedCounter;
            localIp65504P402TrxTtlSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_402_TRX_TTL_S_LEN = 2;
  	/**
	 * serializeIp65504P402TrxTtlS
	 */
	protected void serializeIp65504P402TrxTtlS(short ip65504P402TrxTtlS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P402TrxTtlS,IP_65504_P_402_TRX_TTL_S_LEN)
                  ,beginIp65504P402TrxTtlS
                  ,IP_65504_P_402_TRX_TTL_S_LEN
                 );
            localIp65504P402TrxTtlSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P402TrxTtlSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P402TrxTtlS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P402TrxTtlS() {	 
			return (getShort(beginIp65504P402TrxTtlS));
   	}
         int localIp65504P402TrxTtlLCounter = -1;
         public boolean isIp65504P402TrxTtlLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P402TrxTtlLCounter != sharedCounter;
            localIp65504P402TrxTtlLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_402_TRX_TTL_L_LEN = 2;
  	/**
	 * serializeIp65504P402TrxTtlL
	 */
	protected void serializeIp65504P402TrxTtlL(short ip65504P402TrxTtlL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P402TrxTtlL,IP_65504_P_402_TRX_TTL_L_LEN)
                  ,beginIp65504P402TrxTtlL
                  ,IP_65504_P_402_TRX_TTL_L_LEN
                 );
            localIp65504P402TrxTtlLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P402TrxTtlLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P402TrxTtlL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P402TrxTtlL() {	 
			return (getShort(beginIp65504P402TrxTtlL));
   	}
         int localIp65504P403ReservdSCounter = -1;
         public boolean isIp65504P403ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P403ReservdSCounter != sharedCounter;
            localIp65504P403ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_403_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P403ReservdS
	 */
	protected void serializeIp65504P403ReservdS(short ip65504P403ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P403ReservdS,IP_65504_P_403_RESERVD_S_LEN)
                  ,beginIp65504P403ReservdS
                  ,IP_65504_P_403_RESERVD_S_LEN
                 );
            localIp65504P403ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P403ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P403ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P403ReservdS() {	 
			return (getShort(beginIp65504P403ReservdS));
   	}
         int localIp65504P403ReservdLCounter = -1;
         public boolean isIp65504P403ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P403ReservdLCounter != sharedCounter;
            localIp65504P403ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_403_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P403ReservdL
	 */
	protected void serializeIp65504P403ReservdL(short ip65504P403ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P403ReservdL,IP_65504_P_403_RESERVD_L_LEN)
                  ,beginIp65504P403ReservdL
                  ,IP_65504_P_403_RESERVD_L_LEN
                 );
            localIp65504P403ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P403ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P403ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P403ReservdL() {	 
			return (getShort(beginIp65504P403ReservdL));
   	}




}
  
