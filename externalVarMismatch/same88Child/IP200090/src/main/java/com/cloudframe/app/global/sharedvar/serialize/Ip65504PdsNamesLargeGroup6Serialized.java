package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_6_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P156ReservdS;
            protected  int beginIp65504P156ReservdL;
            protected  int beginIp65504P157AcqCurS;
            protected  int beginIp65504P157AcqCurL;
            protected  int beginIp65504P158BusActS;
            protected  int beginIp65504P158BusActL;
            protected  int beginIp65504P159Settle1S;
            protected  int beginIp65504P159Settle1L;
            protected  int beginIp65504P160ReservdS;
            protected  int beginIp65504P160ReservdL;
            protected  int beginIp65504P161Settle2S;
            protected  int beginIp65504P161Settle2L;
            protected  int beginIp65504P162ReservdS;
            protected  int beginIp65504P162ReservdL;
            protected  int beginIp65504P163ReservdS;
            protected  int beginIp65504P163ReservdL;
            protected  int beginIp65504P164CurRteS;
            protected  int beginIp65504P164CurRteL;
            protected  int beginIp65504P165SetlIdS;
            protected  int beginIp65504P165SetlIdL;
            protected  int beginIp65504P166ReservdS;
            protected  int beginIp65504P166ReservdL;
            protected  int beginIp65504P167ReservdS;
            protected  int beginIp65504P167ReservdL;
            protected  int beginIp65504P168ReservdS;
            protected  int beginIp65504P168ReservdL;
            protected  int beginIp65504P169ReservdS;
            protected  int beginIp65504P169ReservdL;
            protected  int beginIp65504P170MerInqS;
            protected  int beginIp65504P170MerInqL;
            protected  int beginIp65504P171AltmdesS;
            protected  int beginIp65504P171AltmdesL;
            protected  int beginIp65504P172PropNmS;
            protected  int beginIp65504P172PropNmL;
            protected  int beginIp65504P173CorpNmS;
            protected  int beginIp65504P173CorpNmL;
            protected  int beginIp65504P174DunbradS;
            protected  int beginIp65504P174DunbradL;
            protected  int beginIp65504P175CardAccptUrlS;
            protected  int beginIp65504P175CardAccptUrlL;
            protected  int beginIp65504P176ReservdS;
            protected  int beginIp65504P176ReservdL;
            protected  int beginIp65504P177ReservdS;
            protected  int beginIp65504P177ReservdL;
            protected  int beginIp65504P178ReservdS;
            protected  int beginIp65504P178ReservdL;
            protected  int beginIp65504P179ReservdS;
            protected  int beginIp65504P179ReservdL;
            protected  int beginIp65504P180ReservdS;
            protected  int beginIp65504P180ReservdL;
            protected  int beginIp65504P181ReservdS;
            protected  int beginIp65504P181ReservdL;
            protected  int beginIp65504P182ReservdS;
            protected  int beginIp65504P182ReservdL;
            protected  int beginIp65504P183ReservdS;
            protected  int beginIp65504P183ReservdL;
            protected  int beginIp65504P184ReservdS;
            protected  int beginIp65504P184ReservdL;
            protected  int beginIp65504P185ReservdS;
            protected  int beginIp65504P185ReservdL;
            protected  int beginIp65504P186ReservdS;
            protected  int beginIp65504P186ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup6Serialized
	**/
    public Ip65504PdsNamesLargeGroup6Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup6Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup6Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup6Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1236); // serialize this field at offset 1236 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup6Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1236 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P156ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P156ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P157AcqCurS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P157AcqCurL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P158BusActS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P158BusActL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P159Settle1S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P159Settle1L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P160ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P160ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P161Settle2S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P161Settle2L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P162ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P162ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P163ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P163ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P164CurRteS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P164CurRteL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P165SetlIdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P165SetlIdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P166ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P166ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P167ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P167ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P168ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P168ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P169ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P169ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P170MerInqS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P170MerInqL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P171AltmdesS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P171AltmdesL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P172PropNmS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P172PropNmL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P173CorpNmS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P173CorpNmL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P174DunbradS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P174DunbradL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P175CardAccptUrlS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P175CardAccptUrlL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P176ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P176ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P177ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P177ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P178ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P178ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P179ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P179ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P180ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P180ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P181ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P181ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P182ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P182ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P183ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P183ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P184ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P184ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P185ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P185ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P186ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P186ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P156ReservdSCounter = -1;
         public boolean isIp65504P156ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P156ReservdSCounter != sharedCounter;
            localIp65504P156ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_156_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P156ReservdS
	 */
	protected void serializeIp65504P156ReservdS(short ip65504P156ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P156ReservdS,IP_65504_P_156_RESERVD_S_LEN)
                  ,beginIp65504P156ReservdS
                  ,IP_65504_P_156_RESERVD_S_LEN
                 );
            localIp65504P156ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P156ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P156ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P156ReservdS() {	 
			return (getShort(beginIp65504P156ReservdS));
   	}
         int localIp65504P156ReservdLCounter = -1;
         public boolean isIp65504P156ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P156ReservdLCounter != sharedCounter;
            localIp65504P156ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_156_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P156ReservdL
	 */
	protected void serializeIp65504P156ReservdL(short ip65504P156ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P156ReservdL,IP_65504_P_156_RESERVD_L_LEN)
                  ,beginIp65504P156ReservdL
                  ,IP_65504_P_156_RESERVD_L_LEN
                 );
            localIp65504P156ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P156ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P156ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P156ReservdL() {	 
			return (getShort(beginIp65504P156ReservdL));
   	}
         int localIp65504P157AcqCurSCounter = -1;
         public boolean isIp65504P157AcqCurSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P157AcqCurSCounter != sharedCounter;
            localIp65504P157AcqCurSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_157_ACQ_CUR_S_LEN = 2;
  	/**
	 * serializeIp65504P157AcqCurS
	 */
	protected void serializeIp65504P157AcqCurS(short ip65504P157AcqCurS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P157AcqCurS,IP_65504_P_157_ACQ_CUR_S_LEN)
                  ,beginIp65504P157AcqCurS
                  ,IP_65504_P_157_ACQ_CUR_S_LEN
                 );
            localIp65504P157AcqCurSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P157AcqCurSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P157AcqCurS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P157AcqCurS() {	 
			return (getShort(beginIp65504P157AcqCurS));
   	}
         int localIp65504P157AcqCurLCounter = -1;
         public boolean isIp65504P157AcqCurLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P157AcqCurLCounter != sharedCounter;
            localIp65504P157AcqCurLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_157_ACQ_CUR_L_LEN = 2;
  	/**
	 * serializeIp65504P157AcqCurL
	 */
	protected void serializeIp65504P157AcqCurL(short ip65504P157AcqCurL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P157AcqCurL,IP_65504_P_157_ACQ_CUR_L_LEN)
                  ,beginIp65504P157AcqCurL
                  ,IP_65504_P_157_ACQ_CUR_L_LEN
                 );
            localIp65504P157AcqCurLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P157AcqCurLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P157AcqCurL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P157AcqCurL() {	 
			return (getShort(beginIp65504P157AcqCurL));
   	}
         int localIp65504P158BusActSCounter = -1;
         public boolean isIp65504P158BusActSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P158BusActSCounter != sharedCounter;
            localIp65504P158BusActSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_158_BUS_ACT_S_LEN = 2;
  	/**
	 * serializeIp65504P158BusActS
	 */
	protected void serializeIp65504P158BusActS(short ip65504P158BusActS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P158BusActS,IP_65504_P_158_BUS_ACT_S_LEN)
                  ,beginIp65504P158BusActS
                  ,IP_65504_P_158_BUS_ACT_S_LEN
                 );
            localIp65504P158BusActSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P158BusActSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P158BusActS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P158BusActS() {	 
			return (getShort(beginIp65504P158BusActS));
   	}
         int localIp65504P158BusActLCounter = -1;
         public boolean isIp65504P158BusActLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P158BusActLCounter != sharedCounter;
            localIp65504P158BusActLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_158_BUS_ACT_L_LEN = 2;
  	/**
	 * serializeIp65504P158BusActL
	 */
	protected void serializeIp65504P158BusActL(short ip65504P158BusActL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P158BusActL,IP_65504_P_158_BUS_ACT_L_LEN)
                  ,beginIp65504P158BusActL
                  ,IP_65504_P_158_BUS_ACT_L_LEN
                 );
            localIp65504P158BusActLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P158BusActLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P158BusActL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P158BusActL() {	 
			return (getShort(beginIp65504P158BusActL));
   	}
         int localIp65504P159Settle1SCounter = -1;
         public boolean isIp65504P159Settle1SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P159Settle1SCounter != sharedCounter;
            localIp65504P159Settle1SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_159_SETTLE_1_S_LEN = 2;
  	/**
	 * serializeIp65504P159Settle1S
	 */
	protected void serializeIp65504P159Settle1S(short ip65504P159Settle1S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P159Settle1S,IP_65504_P_159_SETTLE_1_S_LEN)
                  ,beginIp65504P159Settle1S
                  ,IP_65504_P_159_SETTLE_1_S_LEN
                 );
            localIp65504P159Settle1SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P159Settle1SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P159Settle1S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P159Settle1S() {	 
			return (getShort(beginIp65504P159Settle1S));
   	}
         int localIp65504P159Settle1LCounter = -1;
         public boolean isIp65504P159Settle1LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P159Settle1LCounter != sharedCounter;
            localIp65504P159Settle1LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_159_SETTLE_1_L_LEN = 2;
  	/**
	 * serializeIp65504P159Settle1L
	 */
	protected void serializeIp65504P159Settle1L(short ip65504P159Settle1L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P159Settle1L,IP_65504_P_159_SETTLE_1_L_LEN)
                  ,beginIp65504P159Settle1L
                  ,IP_65504_P_159_SETTLE_1_L_LEN
                 );
            localIp65504P159Settle1LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P159Settle1LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P159Settle1L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P159Settle1L() {	 
			return (getShort(beginIp65504P159Settle1L));
   	}
         int localIp65504P160ReservdSCounter = -1;
         public boolean isIp65504P160ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P160ReservdSCounter != sharedCounter;
            localIp65504P160ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_160_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P160ReservdS
	 */
	protected void serializeIp65504P160ReservdS(short ip65504P160ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P160ReservdS,IP_65504_P_160_RESERVD_S_LEN)
                  ,beginIp65504P160ReservdS
                  ,IP_65504_P_160_RESERVD_S_LEN
                 );
            localIp65504P160ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P160ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P160ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P160ReservdS() {	 
			return (getShort(beginIp65504P160ReservdS));
   	}
         int localIp65504P160ReservdLCounter = -1;
         public boolean isIp65504P160ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P160ReservdLCounter != sharedCounter;
            localIp65504P160ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_160_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P160ReservdL
	 */
	protected void serializeIp65504P160ReservdL(short ip65504P160ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P160ReservdL,IP_65504_P_160_RESERVD_L_LEN)
                  ,beginIp65504P160ReservdL
                  ,IP_65504_P_160_RESERVD_L_LEN
                 );
            localIp65504P160ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P160ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P160ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P160ReservdL() {	 
			return (getShort(beginIp65504P160ReservdL));
   	}
         int localIp65504P161Settle2SCounter = -1;
         public boolean isIp65504P161Settle2SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P161Settle2SCounter != sharedCounter;
            localIp65504P161Settle2SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_161_SETTLE_2_S_LEN = 2;
  	/**
	 * serializeIp65504P161Settle2S
	 */
	protected void serializeIp65504P161Settle2S(short ip65504P161Settle2S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P161Settle2S,IP_65504_P_161_SETTLE_2_S_LEN)
                  ,beginIp65504P161Settle2S
                  ,IP_65504_P_161_SETTLE_2_S_LEN
                 );
            localIp65504P161Settle2SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P161Settle2SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P161Settle2S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P161Settle2S() {	 
			return (getShort(beginIp65504P161Settle2S));
   	}
         int localIp65504P161Settle2LCounter = -1;
         public boolean isIp65504P161Settle2LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P161Settle2LCounter != sharedCounter;
            localIp65504P161Settle2LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_161_SETTLE_2_L_LEN = 2;
  	/**
	 * serializeIp65504P161Settle2L
	 */
	protected void serializeIp65504P161Settle2L(short ip65504P161Settle2L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P161Settle2L,IP_65504_P_161_SETTLE_2_L_LEN)
                  ,beginIp65504P161Settle2L
                  ,IP_65504_P_161_SETTLE_2_L_LEN
                 );
            localIp65504P161Settle2LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P161Settle2LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P161Settle2L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P161Settle2L() {	 
			return (getShort(beginIp65504P161Settle2L));
   	}
         int localIp65504P162ReservdSCounter = -1;
         public boolean isIp65504P162ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P162ReservdSCounter != sharedCounter;
            localIp65504P162ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_162_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P162ReservdS
	 */
	protected void serializeIp65504P162ReservdS(short ip65504P162ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P162ReservdS,IP_65504_P_162_RESERVD_S_LEN)
                  ,beginIp65504P162ReservdS
                  ,IP_65504_P_162_RESERVD_S_LEN
                 );
            localIp65504P162ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P162ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P162ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P162ReservdS() {	 
			return (getShort(beginIp65504P162ReservdS));
   	}
         int localIp65504P162ReservdLCounter = -1;
         public boolean isIp65504P162ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P162ReservdLCounter != sharedCounter;
            localIp65504P162ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_162_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P162ReservdL
	 */
	protected void serializeIp65504P162ReservdL(short ip65504P162ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P162ReservdL,IP_65504_P_162_RESERVD_L_LEN)
                  ,beginIp65504P162ReservdL
                  ,IP_65504_P_162_RESERVD_L_LEN
                 );
            localIp65504P162ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P162ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P162ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P162ReservdL() {	 
			return (getShort(beginIp65504P162ReservdL));
   	}
         int localIp65504P163ReservdSCounter = -1;
         public boolean isIp65504P163ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P163ReservdSCounter != sharedCounter;
            localIp65504P163ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_163_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P163ReservdS
	 */
	protected void serializeIp65504P163ReservdS(short ip65504P163ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P163ReservdS,IP_65504_P_163_RESERVD_S_LEN)
                  ,beginIp65504P163ReservdS
                  ,IP_65504_P_163_RESERVD_S_LEN
                 );
            localIp65504P163ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P163ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P163ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P163ReservdS() {	 
			return (getShort(beginIp65504P163ReservdS));
   	}
         int localIp65504P163ReservdLCounter = -1;
         public boolean isIp65504P163ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P163ReservdLCounter != sharedCounter;
            localIp65504P163ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_163_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P163ReservdL
	 */
	protected void serializeIp65504P163ReservdL(short ip65504P163ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P163ReservdL,IP_65504_P_163_RESERVD_L_LEN)
                  ,beginIp65504P163ReservdL
                  ,IP_65504_P_163_RESERVD_L_LEN
                 );
            localIp65504P163ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P163ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P163ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P163ReservdL() {	 
			return (getShort(beginIp65504P163ReservdL));
   	}
         int localIp65504P164CurRteSCounter = -1;
         public boolean isIp65504P164CurRteSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P164CurRteSCounter != sharedCounter;
            localIp65504P164CurRteSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_164_CUR_RTE_S_LEN = 2;
  	/**
	 * serializeIp65504P164CurRteS
	 */
	protected void serializeIp65504P164CurRteS(short ip65504P164CurRteS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P164CurRteS,IP_65504_P_164_CUR_RTE_S_LEN)
                  ,beginIp65504P164CurRteS
                  ,IP_65504_P_164_CUR_RTE_S_LEN
                 );
            localIp65504P164CurRteSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P164CurRteSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P164CurRteS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P164CurRteS() {	 
			return (getShort(beginIp65504P164CurRteS));
   	}
         int localIp65504P164CurRteLCounter = -1;
         public boolean isIp65504P164CurRteLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P164CurRteLCounter != sharedCounter;
            localIp65504P164CurRteLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_164_CUR_RTE_L_LEN = 2;
  	/**
	 * serializeIp65504P164CurRteL
	 */
	protected void serializeIp65504P164CurRteL(short ip65504P164CurRteL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P164CurRteL,IP_65504_P_164_CUR_RTE_L_LEN)
                  ,beginIp65504P164CurRteL
                  ,IP_65504_P_164_CUR_RTE_L_LEN
                 );
            localIp65504P164CurRteLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P164CurRteLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P164CurRteL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P164CurRteL() {	 
			return (getShort(beginIp65504P164CurRteL));
   	}
         int localIp65504P165SetlIdSCounter = -1;
         public boolean isIp65504P165SetlIdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P165SetlIdSCounter != sharedCounter;
            localIp65504P165SetlIdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_165_SETL_ID_S_LEN = 2;
  	/**
	 * serializeIp65504P165SetlIdS
	 */
	protected void serializeIp65504P165SetlIdS(short ip65504P165SetlIdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P165SetlIdS,IP_65504_P_165_SETL_ID_S_LEN)
                  ,beginIp65504P165SetlIdS
                  ,IP_65504_P_165_SETL_ID_S_LEN
                 );
            localIp65504P165SetlIdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P165SetlIdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P165SetlIdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P165SetlIdS() {	 
			return (getShort(beginIp65504P165SetlIdS));
   	}
         int localIp65504P165SetlIdLCounter = -1;
         public boolean isIp65504P165SetlIdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P165SetlIdLCounter != sharedCounter;
            localIp65504P165SetlIdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_165_SETL_ID_L_LEN = 2;
  	/**
	 * serializeIp65504P165SetlIdL
	 */
	protected void serializeIp65504P165SetlIdL(short ip65504P165SetlIdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P165SetlIdL,IP_65504_P_165_SETL_ID_L_LEN)
                  ,beginIp65504P165SetlIdL
                  ,IP_65504_P_165_SETL_ID_L_LEN
                 );
            localIp65504P165SetlIdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P165SetlIdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P165SetlIdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P165SetlIdL() {	 
			return (getShort(beginIp65504P165SetlIdL));
   	}
         int localIp65504P166ReservdSCounter = -1;
         public boolean isIp65504P166ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P166ReservdSCounter != sharedCounter;
            localIp65504P166ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_166_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P166ReservdS
	 */
	protected void serializeIp65504P166ReservdS(short ip65504P166ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P166ReservdS,IP_65504_P_166_RESERVD_S_LEN)
                  ,beginIp65504P166ReservdS
                  ,IP_65504_P_166_RESERVD_S_LEN
                 );
            localIp65504P166ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P166ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P166ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P166ReservdS() {	 
			return (getShort(beginIp65504P166ReservdS));
   	}
         int localIp65504P166ReservdLCounter = -1;
         public boolean isIp65504P166ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P166ReservdLCounter != sharedCounter;
            localIp65504P166ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_166_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P166ReservdL
	 */
	protected void serializeIp65504P166ReservdL(short ip65504P166ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P166ReservdL,IP_65504_P_166_RESERVD_L_LEN)
                  ,beginIp65504P166ReservdL
                  ,IP_65504_P_166_RESERVD_L_LEN
                 );
            localIp65504P166ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P166ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P166ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P166ReservdL() {	 
			return (getShort(beginIp65504P166ReservdL));
   	}
         int localIp65504P167ReservdSCounter = -1;
         public boolean isIp65504P167ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P167ReservdSCounter != sharedCounter;
            localIp65504P167ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_167_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P167ReservdS
	 */
	protected void serializeIp65504P167ReservdS(short ip65504P167ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P167ReservdS,IP_65504_P_167_RESERVD_S_LEN)
                  ,beginIp65504P167ReservdS
                  ,IP_65504_P_167_RESERVD_S_LEN
                 );
            localIp65504P167ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P167ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P167ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P167ReservdS() {	 
			return (getShort(beginIp65504P167ReservdS));
   	}
         int localIp65504P167ReservdLCounter = -1;
         public boolean isIp65504P167ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P167ReservdLCounter != sharedCounter;
            localIp65504P167ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_167_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P167ReservdL
	 */
	protected void serializeIp65504P167ReservdL(short ip65504P167ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P167ReservdL,IP_65504_P_167_RESERVD_L_LEN)
                  ,beginIp65504P167ReservdL
                  ,IP_65504_P_167_RESERVD_L_LEN
                 );
            localIp65504P167ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P167ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P167ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P167ReservdL() {	 
			return (getShort(beginIp65504P167ReservdL));
   	}
         int localIp65504P168ReservdSCounter = -1;
         public boolean isIp65504P168ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P168ReservdSCounter != sharedCounter;
            localIp65504P168ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_168_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P168ReservdS
	 */
	protected void serializeIp65504P168ReservdS(short ip65504P168ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P168ReservdS,IP_65504_P_168_RESERVD_S_LEN)
                  ,beginIp65504P168ReservdS
                  ,IP_65504_P_168_RESERVD_S_LEN
                 );
            localIp65504P168ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P168ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P168ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P168ReservdS() {	 
			return (getShort(beginIp65504P168ReservdS));
   	}
         int localIp65504P168ReservdLCounter = -1;
         public boolean isIp65504P168ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P168ReservdLCounter != sharedCounter;
            localIp65504P168ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_168_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P168ReservdL
	 */
	protected void serializeIp65504P168ReservdL(short ip65504P168ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P168ReservdL,IP_65504_P_168_RESERVD_L_LEN)
                  ,beginIp65504P168ReservdL
                  ,IP_65504_P_168_RESERVD_L_LEN
                 );
            localIp65504P168ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P168ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P168ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P168ReservdL() {	 
			return (getShort(beginIp65504P168ReservdL));
   	}
         int localIp65504P169ReservdSCounter = -1;
         public boolean isIp65504P169ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P169ReservdSCounter != sharedCounter;
            localIp65504P169ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_169_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P169ReservdS
	 */
	protected void serializeIp65504P169ReservdS(short ip65504P169ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P169ReservdS,IP_65504_P_169_RESERVD_S_LEN)
                  ,beginIp65504P169ReservdS
                  ,IP_65504_P_169_RESERVD_S_LEN
                 );
            localIp65504P169ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P169ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P169ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P169ReservdS() {	 
			return (getShort(beginIp65504P169ReservdS));
   	}
         int localIp65504P169ReservdLCounter = -1;
         public boolean isIp65504P169ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P169ReservdLCounter != sharedCounter;
            localIp65504P169ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_169_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P169ReservdL
	 */
	protected void serializeIp65504P169ReservdL(short ip65504P169ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P169ReservdL,IP_65504_P_169_RESERVD_L_LEN)
                  ,beginIp65504P169ReservdL
                  ,IP_65504_P_169_RESERVD_L_LEN
                 );
            localIp65504P169ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P169ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P169ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P169ReservdL() {	 
			return (getShort(beginIp65504P169ReservdL));
   	}
         int localIp65504P170MerInqSCounter = -1;
         public boolean isIp65504P170MerInqSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P170MerInqSCounter != sharedCounter;
            localIp65504P170MerInqSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_170_MER_INQ_S_LEN = 2;
  	/**
	 * serializeIp65504P170MerInqS
	 */
	protected void serializeIp65504P170MerInqS(short ip65504P170MerInqS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P170MerInqS,IP_65504_P_170_MER_INQ_S_LEN)
                  ,beginIp65504P170MerInqS
                  ,IP_65504_P_170_MER_INQ_S_LEN
                 );
            localIp65504P170MerInqSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P170MerInqSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P170MerInqS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P170MerInqS() {	 
			return (getShort(beginIp65504P170MerInqS));
   	}
         int localIp65504P170MerInqLCounter = -1;
         public boolean isIp65504P170MerInqLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P170MerInqLCounter != sharedCounter;
            localIp65504P170MerInqLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_170_MER_INQ_L_LEN = 2;
  	/**
	 * serializeIp65504P170MerInqL
	 */
	protected void serializeIp65504P170MerInqL(short ip65504P170MerInqL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P170MerInqL,IP_65504_P_170_MER_INQ_L_LEN)
                  ,beginIp65504P170MerInqL
                  ,IP_65504_P_170_MER_INQ_L_LEN
                 );
            localIp65504P170MerInqLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P170MerInqLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P170MerInqL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P170MerInqL() {	 
			return (getShort(beginIp65504P170MerInqL));
   	}
         int localIp65504P171AltmdesSCounter = -1;
         public boolean isIp65504P171AltmdesSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P171AltmdesSCounter != sharedCounter;
            localIp65504P171AltmdesSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_171_ALTMDES_S_LEN = 2;
  	/**
	 * serializeIp65504P171AltmdesS
	 */
	protected void serializeIp65504P171AltmdesS(short ip65504P171AltmdesS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P171AltmdesS,IP_65504_P_171_ALTMDES_S_LEN)
                  ,beginIp65504P171AltmdesS
                  ,IP_65504_P_171_ALTMDES_S_LEN
                 );
            localIp65504P171AltmdesSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P171AltmdesSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P171AltmdesS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P171AltmdesS() {	 
			return (getShort(beginIp65504P171AltmdesS));
   	}
         int localIp65504P171AltmdesLCounter = -1;
         public boolean isIp65504P171AltmdesLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P171AltmdesLCounter != sharedCounter;
            localIp65504P171AltmdesLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_171_ALTMDES_L_LEN = 2;
  	/**
	 * serializeIp65504P171AltmdesL
	 */
	protected void serializeIp65504P171AltmdesL(short ip65504P171AltmdesL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P171AltmdesL,IP_65504_P_171_ALTMDES_L_LEN)
                  ,beginIp65504P171AltmdesL
                  ,IP_65504_P_171_ALTMDES_L_LEN
                 );
            localIp65504P171AltmdesLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P171AltmdesLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P171AltmdesL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P171AltmdesL() {	 
			return (getShort(beginIp65504P171AltmdesL));
   	}
         int localIp65504P172PropNmSCounter = -1;
         public boolean isIp65504P172PropNmSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P172PropNmSCounter != sharedCounter;
            localIp65504P172PropNmSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_172_PROP_NM_S_LEN = 2;
  	/**
	 * serializeIp65504P172PropNmS
	 */
	protected void serializeIp65504P172PropNmS(short ip65504P172PropNmS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P172PropNmS,IP_65504_P_172_PROP_NM_S_LEN)
                  ,beginIp65504P172PropNmS
                  ,IP_65504_P_172_PROP_NM_S_LEN
                 );
            localIp65504P172PropNmSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P172PropNmSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P172PropNmS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P172PropNmS() {	 
			return (getShort(beginIp65504P172PropNmS));
   	}
         int localIp65504P172PropNmLCounter = -1;
         public boolean isIp65504P172PropNmLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P172PropNmLCounter != sharedCounter;
            localIp65504P172PropNmLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_172_PROP_NM_L_LEN = 2;
  	/**
	 * serializeIp65504P172PropNmL
	 */
	protected void serializeIp65504P172PropNmL(short ip65504P172PropNmL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P172PropNmL,IP_65504_P_172_PROP_NM_L_LEN)
                  ,beginIp65504P172PropNmL
                  ,IP_65504_P_172_PROP_NM_L_LEN
                 );
            localIp65504P172PropNmLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P172PropNmLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P172PropNmL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P172PropNmL() {	 
			return (getShort(beginIp65504P172PropNmL));
   	}
         int localIp65504P173CorpNmSCounter = -1;
         public boolean isIp65504P173CorpNmSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P173CorpNmSCounter != sharedCounter;
            localIp65504P173CorpNmSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_173_CORP_NM_S_LEN = 2;
  	/**
	 * serializeIp65504P173CorpNmS
	 */
	protected void serializeIp65504P173CorpNmS(short ip65504P173CorpNmS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P173CorpNmS,IP_65504_P_173_CORP_NM_S_LEN)
                  ,beginIp65504P173CorpNmS
                  ,IP_65504_P_173_CORP_NM_S_LEN
                 );
            localIp65504P173CorpNmSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P173CorpNmSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P173CorpNmS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P173CorpNmS() {	 
			return (getShort(beginIp65504P173CorpNmS));
   	}
         int localIp65504P173CorpNmLCounter = -1;
         public boolean isIp65504P173CorpNmLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P173CorpNmLCounter != sharedCounter;
            localIp65504P173CorpNmLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_173_CORP_NM_L_LEN = 2;
  	/**
	 * serializeIp65504P173CorpNmL
	 */
	protected void serializeIp65504P173CorpNmL(short ip65504P173CorpNmL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P173CorpNmL,IP_65504_P_173_CORP_NM_L_LEN)
                  ,beginIp65504P173CorpNmL
                  ,IP_65504_P_173_CORP_NM_L_LEN
                 );
            localIp65504P173CorpNmLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P173CorpNmLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P173CorpNmL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P173CorpNmL() {	 
			return (getShort(beginIp65504P173CorpNmL));
   	}
         int localIp65504P174DunbradSCounter = -1;
         public boolean isIp65504P174DunbradSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P174DunbradSCounter != sharedCounter;
            localIp65504P174DunbradSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_174_DUNBRAD_S_LEN = 2;
  	/**
	 * serializeIp65504P174DunbradS
	 */
	protected void serializeIp65504P174DunbradS(short ip65504P174DunbradS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P174DunbradS,IP_65504_P_174_DUNBRAD_S_LEN)
                  ,beginIp65504P174DunbradS
                  ,IP_65504_P_174_DUNBRAD_S_LEN
                 );
            localIp65504P174DunbradSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P174DunbradSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P174DunbradS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P174DunbradS() {	 
			return (getShort(beginIp65504P174DunbradS));
   	}
         int localIp65504P174DunbradLCounter = -1;
         public boolean isIp65504P174DunbradLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P174DunbradLCounter != sharedCounter;
            localIp65504P174DunbradLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_174_DUNBRAD_L_LEN = 2;
  	/**
	 * serializeIp65504P174DunbradL
	 */
	protected void serializeIp65504P174DunbradL(short ip65504P174DunbradL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P174DunbradL,IP_65504_P_174_DUNBRAD_L_LEN)
                  ,beginIp65504P174DunbradL
                  ,IP_65504_P_174_DUNBRAD_L_LEN
                 );
            localIp65504P174DunbradLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P174DunbradLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P174DunbradL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P174DunbradL() {	 
			return (getShort(beginIp65504P174DunbradL));
   	}
         int localIp65504P175CardAccptUrlSCounter = -1;
         public boolean isIp65504P175CardAccptUrlSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P175CardAccptUrlSCounter != sharedCounter;
            localIp65504P175CardAccptUrlSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_175_CARD_ACCPT_URL_S_LEN = 2;
  	/**
	 * serializeIp65504P175CardAccptUrlS
	 */
	protected void serializeIp65504P175CardAccptUrlS(short ip65504P175CardAccptUrlS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P175CardAccptUrlS,IP_65504_P_175_CARD_ACCPT_URL_S_LEN)
                  ,beginIp65504P175CardAccptUrlS
                  ,IP_65504_P_175_CARD_ACCPT_URL_S_LEN
                 );
            localIp65504P175CardAccptUrlSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P175CardAccptUrlSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P175CardAccptUrlS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P175CardAccptUrlS() {	 
			return (getShort(beginIp65504P175CardAccptUrlS));
   	}
         int localIp65504P175CardAccptUrlLCounter = -1;
         public boolean isIp65504P175CardAccptUrlLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P175CardAccptUrlLCounter != sharedCounter;
            localIp65504P175CardAccptUrlLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_175_CARD_ACCPT_URL_L_LEN = 2;
  	/**
	 * serializeIp65504P175CardAccptUrlL
	 */
	protected void serializeIp65504P175CardAccptUrlL(short ip65504P175CardAccptUrlL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P175CardAccptUrlL,IP_65504_P_175_CARD_ACCPT_URL_L_LEN)
                  ,beginIp65504P175CardAccptUrlL
                  ,IP_65504_P_175_CARD_ACCPT_URL_L_LEN
                 );
            localIp65504P175CardAccptUrlLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P175CardAccptUrlLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P175CardAccptUrlL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P175CardAccptUrlL() {	 
			return (getShort(beginIp65504P175CardAccptUrlL));
   	}
         int localIp65504P176ReservdSCounter = -1;
         public boolean isIp65504P176ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P176ReservdSCounter != sharedCounter;
            localIp65504P176ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_176_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P176ReservdS
	 */
	protected void serializeIp65504P176ReservdS(short ip65504P176ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P176ReservdS,IP_65504_P_176_RESERVD_S_LEN)
                  ,beginIp65504P176ReservdS
                  ,IP_65504_P_176_RESERVD_S_LEN
                 );
            localIp65504P176ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P176ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P176ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P176ReservdS() {	 
			return (getShort(beginIp65504P176ReservdS));
   	}
         int localIp65504P176ReservdLCounter = -1;
         public boolean isIp65504P176ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P176ReservdLCounter != sharedCounter;
            localIp65504P176ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_176_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P176ReservdL
	 */
	protected void serializeIp65504P176ReservdL(short ip65504P176ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P176ReservdL,IP_65504_P_176_RESERVD_L_LEN)
                  ,beginIp65504P176ReservdL
                  ,IP_65504_P_176_RESERVD_L_LEN
                 );
            localIp65504P176ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P176ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P176ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P176ReservdL() {	 
			return (getShort(beginIp65504P176ReservdL));
   	}
         int localIp65504P177ReservdSCounter = -1;
         public boolean isIp65504P177ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P177ReservdSCounter != sharedCounter;
            localIp65504P177ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_177_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P177ReservdS
	 */
	protected void serializeIp65504P177ReservdS(short ip65504P177ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P177ReservdS,IP_65504_P_177_RESERVD_S_LEN)
                  ,beginIp65504P177ReservdS
                  ,IP_65504_P_177_RESERVD_S_LEN
                 );
            localIp65504P177ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P177ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P177ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P177ReservdS() {	 
			return (getShort(beginIp65504P177ReservdS));
   	}
         int localIp65504P177ReservdLCounter = -1;
         public boolean isIp65504P177ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P177ReservdLCounter != sharedCounter;
            localIp65504P177ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_177_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P177ReservdL
	 */
	protected void serializeIp65504P177ReservdL(short ip65504P177ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P177ReservdL,IP_65504_P_177_RESERVD_L_LEN)
                  ,beginIp65504P177ReservdL
                  ,IP_65504_P_177_RESERVD_L_LEN
                 );
            localIp65504P177ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P177ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P177ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P177ReservdL() {	 
			return (getShort(beginIp65504P177ReservdL));
   	}
         int localIp65504P178ReservdSCounter = -1;
         public boolean isIp65504P178ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P178ReservdSCounter != sharedCounter;
            localIp65504P178ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_178_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P178ReservdS
	 */
	protected void serializeIp65504P178ReservdS(short ip65504P178ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P178ReservdS,IP_65504_P_178_RESERVD_S_LEN)
                  ,beginIp65504P178ReservdS
                  ,IP_65504_P_178_RESERVD_S_LEN
                 );
            localIp65504P178ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P178ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P178ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P178ReservdS() {	 
			return (getShort(beginIp65504P178ReservdS));
   	}
         int localIp65504P178ReservdLCounter = -1;
         public boolean isIp65504P178ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P178ReservdLCounter != sharedCounter;
            localIp65504P178ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_178_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P178ReservdL
	 */
	protected void serializeIp65504P178ReservdL(short ip65504P178ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P178ReservdL,IP_65504_P_178_RESERVD_L_LEN)
                  ,beginIp65504P178ReservdL
                  ,IP_65504_P_178_RESERVD_L_LEN
                 );
            localIp65504P178ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P178ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P178ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P178ReservdL() {	 
			return (getShort(beginIp65504P178ReservdL));
   	}
         int localIp65504P179ReservdSCounter = -1;
         public boolean isIp65504P179ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P179ReservdSCounter != sharedCounter;
            localIp65504P179ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_179_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P179ReservdS
	 */
	protected void serializeIp65504P179ReservdS(short ip65504P179ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P179ReservdS,IP_65504_P_179_RESERVD_S_LEN)
                  ,beginIp65504P179ReservdS
                  ,IP_65504_P_179_RESERVD_S_LEN
                 );
            localIp65504P179ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P179ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P179ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P179ReservdS() {	 
			return (getShort(beginIp65504P179ReservdS));
   	}
         int localIp65504P179ReservdLCounter = -1;
         public boolean isIp65504P179ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P179ReservdLCounter != sharedCounter;
            localIp65504P179ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_179_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P179ReservdL
	 */
	protected void serializeIp65504P179ReservdL(short ip65504P179ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P179ReservdL,IP_65504_P_179_RESERVD_L_LEN)
                  ,beginIp65504P179ReservdL
                  ,IP_65504_P_179_RESERVD_L_LEN
                 );
            localIp65504P179ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P179ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P179ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P179ReservdL() {	 
			return (getShort(beginIp65504P179ReservdL));
   	}
         int localIp65504P180ReservdSCounter = -1;
         public boolean isIp65504P180ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P180ReservdSCounter != sharedCounter;
            localIp65504P180ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_180_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P180ReservdS
	 */
	protected void serializeIp65504P180ReservdS(short ip65504P180ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P180ReservdS,IP_65504_P_180_RESERVD_S_LEN)
                  ,beginIp65504P180ReservdS
                  ,IP_65504_P_180_RESERVD_S_LEN
                 );
            localIp65504P180ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P180ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P180ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P180ReservdS() {	 
			return (getShort(beginIp65504P180ReservdS));
   	}
         int localIp65504P180ReservdLCounter = -1;
         public boolean isIp65504P180ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P180ReservdLCounter != sharedCounter;
            localIp65504P180ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_180_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P180ReservdL
	 */
	protected void serializeIp65504P180ReservdL(short ip65504P180ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P180ReservdL,IP_65504_P_180_RESERVD_L_LEN)
                  ,beginIp65504P180ReservdL
                  ,IP_65504_P_180_RESERVD_L_LEN
                 );
            localIp65504P180ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P180ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P180ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P180ReservdL() {	 
			return (getShort(beginIp65504P180ReservdL));
   	}
         int localIp65504P181ReservdSCounter = -1;
         public boolean isIp65504P181ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P181ReservdSCounter != sharedCounter;
            localIp65504P181ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_181_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P181ReservdS
	 */
	protected void serializeIp65504P181ReservdS(short ip65504P181ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P181ReservdS,IP_65504_P_181_RESERVD_S_LEN)
                  ,beginIp65504P181ReservdS
                  ,IP_65504_P_181_RESERVD_S_LEN
                 );
            localIp65504P181ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P181ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P181ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P181ReservdS() {	 
			return (getShort(beginIp65504P181ReservdS));
   	}
         int localIp65504P181ReservdLCounter = -1;
         public boolean isIp65504P181ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P181ReservdLCounter != sharedCounter;
            localIp65504P181ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_181_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P181ReservdL
	 */
	protected void serializeIp65504P181ReservdL(short ip65504P181ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P181ReservdL,IP_65504_P_181_RESERVD_L_LEN)
                  ,beginIp65504P181ReservdL
                  ,IP_65504_P_181_RESERVD_L_LEN
                 );
            localIp65504P181ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P181ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P181ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P181ReservdL() {	 
			return (getShort(beginIp65504P181ReservdL));
   	}
         int localIp65504P182ReservdSCounter = -1;
         public boolean isIp65504P182ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P182ReservdSCounter != sharedCounter;
            localIp65504P182ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_182_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P182ReservdS
	 */
	protected void serializeIp65504P182ReservdS(short ip65504P182ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P182ReservdS,IP_65504_P_182_RESERVD_S_LEN)
                  ,beginIp65504P182ReservdS
                  ,IP_65504_P_182_RESERVD_S_LEN
                 );
            localIp65504P182ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P182ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P182ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P182ReservdS() {	 
			return (getShort(beginIp65504P182ReservdS));
   	}
         int localIp65504P182ReservdLCounter = -1;
         public boolean isIp65504P182ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P182ReservdLCounter != sharedCounter;
            localIp65504P182ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_182_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P182ReservdL
	 */
	protected void serializeIp65504P182ReservdL(short ip65504P182ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P182ReservdL,IP_65504_P_182_RESERVD_L_LEN)
                  ,beginIp65504P182ReservdL
                  ,IP_65504_P_182_RESERVD_L_LEN
                 );
            localIp65504P182ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P182ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P182ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P182ReservdL() {	 
			return (getShort(beginIp65504P182ReservdL));
   	}
         int localIp65504P183ReservdSCounter = -1;
         public boolean isIp65504P183ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P183ReservdSCounter != sharedCounter;
            localIp65504P183ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_183_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P183ReservdS
	 */
	protected void serializeIp65504P183ReservdS(short ip65504P183ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P183ReservdS,IP_65504_P_183_RESERVD_S_LEN)
                  ,beginIp65504P183ReservdS
                  ,IP_65504_P_183_RESERVD_S_LEN
                 );
            localIp65504P183ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P183ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P183ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P183ReservdS() {	 
			return (getShort(beginIp65504P183ReservdS));
   	}
         int localIp65504P183ReservdLCounter = -1;
         public boolean isIp65504P183ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P183ReservdLCounter != sharedCounter;
            localIp65504P183ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_183_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P183ReservdL
	 */
	protected void serializeIp65504P183ReservdL(short ip65504P183ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P183ReservdL,IP_65504_P_183_RESERVD_L_LEN)
                  ,beginIp65504P183ReservdL
                  ,IP_65504_P_183_RESERVD_L_LEN
                 );
            localIp65504P183ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P183ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P183ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P183ReservdL() {	 
			return (getShort(beginIp65504P183ReservdL));
   	}
         int localIp65504P184ReservdSCounter = -1;
         public boolean isIp65504P184ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P184ReservdSCounter != sharedCounter;
            localIp65504P184ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_184_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P184ReservdS
	 */
	protected void serializeIp65504P184ReservdS(short ip65504P184ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P184ReservdS,IP_65504_P_184_RESERVD_S_LEN)
                  ,beginIp65504P184ReservdS
                  ,IP_65504_P_184_RESERVD_S_LEN
                 );
            localIp65504P184ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P184ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P184ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P184ReservdS() {	 
			return (getShort(beginIp65504P184ReservdS));
   	}
         int localIp65504P184ReservdLCounter = -1;
         public boolean isIp65504P184ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P184ReservdLCounter != sharedCounter;
            localIp65504P184ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_184_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P184ReservdL
	 */
	protected void serializeIp65504P184ReservdL(short ip65504P184ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P184ReservdL,IP_65504_P_184_RESERVD_L_LEN)
                  ,beginIp65504P184ReservdL
                  ,IP_65504_P_184_RESERVD_L_LEN
                 );
            localIp65504P184ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P184ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P184ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P184ReservdL() {	 
			return (getShort(beginIp65504P184ReservdL));
   	}
         int localIp65504P185ReservdSCounter = -1;
         public boolean isIp65504P185ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P185ReservdSCounter != sharedCounter;
            localIp65504P185ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_185_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P185ReservdS
	 */
	protected void serializeIp65504P185ReservdS(short ip65504P185ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P185ReservdS,IP_65504_P_185_RESERVD_S_LEN)
                  ,beginIp65504P185ReservdS
                  ,IP_65504_P_185_RESERVD_S_LEN
                 );
            localIp65504P185ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P185ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P185ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P185ReservdS() {	 
			return (getShort(beginIp65504P185ReservdS));
   	}
         int localIp65504P185ReservdLCounter = -1;
         public boolean isIp65504P185ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P185ReservdLCounter != sharedCounter;
            localIp65504P185ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_185_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P185ReservdL
	 */
	protected void serializeIp65504P185ReservdL(short ip65504P185ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P185ReservdL,IP_65504_P_185_RESERVD_L_LEN)
                  ,beginIp65504P185ReservdL
                  ,IP_65504_P_185_RESERVD_L_LEN
                 );
            localIp65504P185ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P185ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P185ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P185ReservdL() {	 
			return (getShort(beginIp65504P185ReservdL));
   	}
         int localIp65504P186ReservdSCounter = -1;
         public boolean isIp65504P186ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P186ReservdSCounter != sharedCounter;
            localIp65504P186ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_186_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P186ReservdS
	 */
	protected void serializeIp65504P186ReservdS(short ip65504P186ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P186ReservdS,IP_65504_P_186_RESERVD_S_LEN)
                  ,beginIp65504P186ReservdS
                  ,IP_65504_P_186_RESERVD_S_LEN
                 );
            localIp65504P186ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P186ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P186ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P186ReservdS() {	 
			return (getShort(beginIp65504P186ReservdS));
   	}
         int localIp65504P186ReservdLCounter = -1;
         public boolean isIp65504P186ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P186ReservdLCounter != sharedCounter;
            localIp65504P186ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_186_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P186ReservdL
	 */
	protected void serializeIp65504P186ReservdL(short ip65504P186ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P186ReservdL,IP_65504_P_186_RESERVD_L_LEN)
                  ,beginIp65504P186ReservdL
                  ,IP_65504_P_186_RESERVD_L_LEN
                 );
            localIp65504P186ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P186ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P186ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P186ReservdL() {	 
			return (getShort(beginIp65504P186ReservdL));
   	}




}
  
