package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup15Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup15Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup15Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_15_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P435ReservdS;
            protected  int beginIp65504P435ReservdL;
            protected  int beginIp65504P436ReservdS;
            protected  int beginIp65504P436ReservdL;
            protected  int beginIp65504P437ReservdS;
            protected  int beginIp65504P437ReservdL;
            protected  int beginIp65504P438ReservdS;
            protected  int beginIp65504P438ReservdL;
            protected  int beginIp65504P439ReservdS;
            protected  int beginIp65504P439ReservdL;
            protected  int beginIp65504P440ReservdS;
            protected  int beginIp65504P440ReservdL;
            protected  int beginIp65504P441ReservdS;
            protected  int beginIp65504P441ReservdL;
            protected  int beginIp65504P442ReservdS;
            protected  int beginIp65504P442ReservdL;
            protected  int beginIp65504P443ReservdS;
            protected  int beginIp65504P443ReservdL;
            protected  int beginIp65504P444ReservdS;
            protected  int beginIp65504P444ReservdL;
            protected  int beginIp65504P445ReservdS;
            protected  int beginIp65504P445ReservdL;
            protected  int beginIp65504P446ReservdS;
            protected  int beginIp65504P446ReservdL;
            protected  int beginIp65504P447ReservdS;
            protected  int beginIp65504P447ReservdL;
            protected  int beginIp65504P448ReservdS;
            protected  int beginIp65504P448ReservdL;
            protected  int beginIp65504P449ReservdS;
            protected  int beginIp65504P449ReservdL;
            protected  int beginIp65504P450ReservdS;
            protected  int beginIp65504P450ReservdL;
            protected  int beginIp65504P451ReservdS;
            protected  int beginIp65504P451ReservdL;
            protected  int beginIp65504P452ReservdS;
            protected  int beginIp65504P452ReservdL;
            protected  int beginIp65504P453ReservdS;
            protected  int beginIp65504P453ReservdL;
            protected  int beginIp65504P454ReservdS;
            protected  int beginIp65504P454ReservdL;
            protected  int beginIp65504P455ReservdS;
            protected  int beginIp65504P455ReservdL;
            protected  int beginIp65504P456ReservdS;
            protected  int beginIp65504P456ReservdL;
            protected  int beginIp65504P457ReservdS;
            protected  int beginIp65504P457ReservdL;
            protected  int beginIp65504P458ReservdS;
            protected  int beginIp65504P458ReservdL;
            protected  int beginIp65504P459ReservdS;
            protected  int beginIp65504P459ReservdL;
            protected  int beginIp65504P460ReservdS;
            protected  int beginIp65504P460ReservdL;
            protected  int beginIp65504P461ReservdS;
            protected  int beginIp65504P461ReservdL;
            protected  int beginIp65504P462ReservdS;
            protected  int beginIp65504P462ReservdL;
            protected  int beginIp65504P463ReservdS;
            protected  int beginIp65504P463ReservdL;
            protected  int beginIp65504P464ReservdS;
            protected  int beginIp65504P464ReservdL;
            protected  int beginIp65504P465ReservdS;
            protected  int beginIp65504P465ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup15Serialized
	**/
    public Ip65504PdsNamesLargeGroup15Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup15Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup15Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup15Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3468); // serialize this field at offset 3468 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup15Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3468 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup15Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_15_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P435ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P435ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P436ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P436ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P437ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P437ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P438ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P438ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P439ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P439ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P440ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P440ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P441ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P441ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P442ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P442ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P443ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P443ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P444ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P444ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P445ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P445ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P446ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P446ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P447ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P447ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P448ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P448ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P449ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P449ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P450ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P450ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P451ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P451ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P452ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P452ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P453ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P453ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P454ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P454ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P455ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P455ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P456ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P456ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P457ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P457ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P458ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P458ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P459ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P459ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P460ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P460ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P461ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P461ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P462ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P462ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P463ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P463ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P464ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P464ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P465ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P465ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P435ReservdSCounter = -1;
         public boolean isIp65504P435ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P435ReservdSCounter != sharedCounter;
            localIp65504P435ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_435_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P435ReservdS
	 */
	protected void serializeIp65504P435ReservdS(short ip65504P435ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P435ReservdS,IP_65504_P_435_RESERVD_S_LEN)
                  ,beginIp65504P435ReservdS
                  ,IP_65504_P_435_RESERVD_S_LEN
                 );
            localIp65504P435ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P435ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P435ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P435ReservdS() {	 
			return (getShort(beginIp65504P435ReservdS));
   	}
         int localIp65504P435ReservdLCounter = -1;
         public boolean isIp65504P435ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P435ReservdLCounter != sharedCounter;
            localIp65504P435ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_435_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P435ReservdL
	 */
	protected void serializeIp65504P435ReservdL(short ip65504P435ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P435ReservdL,IP_65504_P_435_RESERVD_L_LEN)
                  ,beginIp65504P435ReservdL
                  ,IP_65504_P_435_RESERVD_L_LEN
                 );
            localIp65504P435ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P435ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P435ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P435ReservdL() {	 
			return (getShort(beginIp65504P435ReservdL));
   	}
         int localIp65504P436ReservdSCounter = -1;
         public boolean isIp65504P436ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P436ReservdSCounter != sharedCounter;
            localIp65504P436ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_436_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P436ReservdS
	 */
	protected void serializeIp65504P436ReservdS(short ip65504P436ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P436ReservdS,IP_65504_P_436_RESERVD_S_LEN)
                  ,beginIp65504P436ReservdS
                  ,IP_65504_P_436_RESERVD_S_LEN
                 );
            localIp65504P436ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P436ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P436ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P436ReservdS() {	 
			return (getShort(beginIp65504P436ReservdS));
   	}
         int localIp65504P436ReservdLCounter = -1;
         public boolean isIp65504P436ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P436ReservdLCounter != sharedCounter;
            localIp65504P436ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_436_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P436ReservdL
	 */
	protected void serializeIp65504P436ReservdL(short ip65504P436ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P436ReservdL,IP_65504_P_436_RESERVD_L_LEN)
                  ,beginIp65504P436ReservdL
                  ,IP_65504_P_436_RESERVD_L_LEN
                 );
            localIp65504P436ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P436ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P436ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P436ReservdL() {	 
			return (getShort(beginIp65504P436ReservdL));
   	}
         int localIp65504P437ReservdSCounter = -1;
         public boolean isIp65504P437ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P437ReservdSCounter != sharedCounter;
            localIp65504P437ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_437_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P437ReservdS
	 */
	protected void serializeIp65504P437ReservdS(short ip65504P437ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P437ReservdS,IP_65504_P_437_RESERVD_S_LEN)
                  ,beginIp65504P437ReservdS
                  ,IP_65504_P_437_RESERVD_S_LEN
                 );
            localIp65504P437ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P437ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P437ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P437ReservdS() {	 
			return (getShort(beginIp65504P437ReservdS));
   	}
         int localIp65504P437ReservdLCounter = -1;
         public boolean isIp65504P437ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P437ReservdLCounter != sharedCounter;
            localIp65504P437ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_437_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P437ReservdL
	 */
	protected void serializeIp65504P437ReservdL(short ip65504P437ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P437ReservdL,IP_65504_P_437_RESERVD_L_LEN)
                  ,beginIp65504P437ReservdL
                  ,IP_65504_P_437_RESERVD_L_LEN
                 );
            localIp65504P437ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P437ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P437ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P437ReservdL() {	 
			return (getShort(beginIp65504P437ReservdL));
   	}
         int localIp65504P438ReservdSCounter = -1;
         public boolean isIp65504P438ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P438ReservdSCounter != sharedCounter;
            localIp65504P438ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_438_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P438ReservdS
	 */
	protected void serializeIp65504P438ReservdS(short ip65504P438ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P438ReservdS,IP_65504_P_438_RESERVD_S_LEN)
                  ,beginIp65504P438ReservdS
                  ,IP_65504_P_438_RESERVD_S_LEN
                 );
            localIp65504P438ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P438ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P438ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P438ReservdS() {	 
			return (getShort(beginIp65504P438ReservdS));
   	}
         int localIp65504P438ReservdLCounter = -1;
         public boolean isIp65504P438ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P438ReservdLCounter != sharedCounter;
            localIp65504P438ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_438_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P438ReservdL
	 */
	protected void serializeIp65504P438ReservdL(short ip65504P438ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P438ReservdL,IP_65504_P_438_RESERVD_L_LEN)
                  ,beginIp65504P438ReservdL
                  ,IP_65504_P_438_RESERVD_L_LEN
                 );
            localIp65504P438ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P438ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P438ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P438ReservdL() {	 
			return (getShort(beginIp65504P438ReservdL));
   	}
         int localIp65504P439ReservdSCounter = -1;
         public boolean isIp65504P439ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P439ReservdSCounter != sharedCounter;
            localIp65504P439ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_439_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P439ReservdS
	 */
	protected void serializeIp65504P439ReservdS(short ip65504P439ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P439ReservdS,IP_65504_P_439_RESERVD_S_LEN)
                  ,beginIp65504P439ReservdS
                  ,IP_65504_P_439_RESERVD_S_LEN
                 );
            localIp65504P439ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P439ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P439ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P439ReservdS() {	 
			return (getShort(beginIp65504P439ReservdS));
   	}
         int localIp65504P439ReservdLCounter = -1;
         public boolean isIp65504P439ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P439ReservdLCounter != sharedCounter;
            localIp65504P439ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_439_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P439ReservdL
	 */
	protected void serializeIp65504P439ReservdL(short ip65504P439ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P439ReservdL,IP_65504_P_439_RESERVD_L_LEN)
                  ,beginIp65504P439ReservdL
                  ,IP_65504_P_439_RESERVD_L_LEN
                 );
            localIp65504P439ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P439ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P439ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P439ReservdL() {	 
			return (getShort(beginIp65504P439ReservdL));
   	}
         int localIp65504P440ReservdSCounter = -1;
         public boolean isIp65504P440ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P440ReservdSCounter != sharedCounter;
            localIp65504P440ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_440_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P440ReservdS
	 */
	protected void serializeIp65504P440ReservdS(short ip65504P440ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P440ReservdS,IP_65504_P_440_RESERVD_S_LEN)
                  ,beginIp65504P440ReservdS
                  ,IP_65504_P_440_RESERVD_S_LEN
                 );
            localIp65504P440ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P440ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P440ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P440ReservdS() {	 
			return (getShort(beginIp65504P440ReservdS));
   	}
         int localIp65504P440ReservdLCounter = -1;
         public boolean isIp65504P440ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P440ReservdLCounter != sharedCounter;
            localIp65504P440ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_440_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P440ReservdL
	 */
	protected void serializeIp65504P440ReservdL(short ip65504P440ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P440ReservdL,IP_65504_P_440_RESERVD_L_LEN)
                  ,beginIp65504P440ReservdL
                  ,IP_65504_P_440_RESERVD_L_LEN
                 );
            localIp65504P440ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P440ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P440ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P440ReservdL() {	 
			return (getShort(beginIp65504P440ReservdL));
   	}
         int localIp65504P441ReservdSCounter = -1;
         public boolean isIp65504P441ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P441ReservdSCounter != sharedCounter;
            localIp65504P441ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_441_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P441ReservdS
	 */
	protected void serializeIp65504P441ReservdS(short ip65504P441ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P441ReservdS,IP_65504_P_441_RESERVD_S_LEN)
                  ,beginIp65504P441ReservdS
                  ,IP_65504_P_441_RESERVD_S_LEN
                 );
            localIp65504P441ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P441ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P441ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P441ReservdS() {	 
			return (getShort(beginIp65504P441ReservdS));
   	}
         int localIp65504P441ReservdLCounter = -1;
         public boolean isIp65504P441ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P441ReservdLCounter != sharedCounter;
            localIp65504P441ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_441_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P441ReservdL
	 */
	protected void serializeIp65504P441ReservdL(short ip65504P441ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P441ReservdL,IP_65504_P_441_RESERVD_L_LEN)
                  ,beginIp65504P441ReservdL
                  ,IP_65504_P_441_RESERVD_L_LEN
                 );
            localIp65504P441ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P441ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P441ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P441ReservdL() {	 
			return (getShort(beginIp65504P441ReservdL));
   	}
         int localIp65504P442ReservdSCounter = -1;
         public boolean isIp65504P442ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P442ReservdSCounter != sharedCounter;
            localIp65504P442ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_442_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P442ReservdS
	 */
	protected void serializeIp65504P442ReservdS(short ip65504P442ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P442ReservdS,IP_65504_P_442_RESERVD_S_LEN)
                  ,beginIp65504P442ReservdS
                  ,IP_65504_P_442_RESERVD_S_LEN
                 );
            localIp65504P442ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P442ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P442ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P442ReservdS() {	 
			return (getShort(beginIp65504P442ReservdS));
   	}
         int localIp65504P442ReservdLCounter = -1;
         public boolean isIp65504P442ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P442ReservdLCounter != sharedCounter;
            localIp65504P442ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_442_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P442ReservdL
	 */
	protected void serializeIp65504P442ReservdL(short ip65504P442ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P442ReservdL,IP_65504_P_442_RESERVD_L_LEN)
                  ,beginIp65504P442ReservdL
                  ,IP_65504_P_442_RESERVD_L_LEN
                 );
            localIp65504P442ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P442ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P442ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P442ReservdL() {	 
			return (getShort(beginIp65504P442ReservdL));
   	}
         int localIp65504P443ReservdSCounter = -1;
         public boolean isIp65504P443ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P443ReservdSCounter != sharedCounter;
            localIp65504P443ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_443_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P443ReservdS
	 */
	protected void serializeIp65504P443ReservdS(short ip65504P443ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P443ReservdS,IP_65504_P_443_RESERVD_S_LEN)
                  ,beginIp65504P443ReservdS
                  ,IP_65504_P_443_RESERVD_S_LEN
                 );
            localIp65504P443ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P443ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P443ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P443ReservdS() {	 
			return (getShort(beginIp65504P443ReservdS));
   	}
         int localIp65504P443ReservdLCounter = -1;
         public boolean isIp65504P443ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P443ReservdLCounter != sharedCounter;
            localIp65504P443ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_443_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P443ReservdL
	 */
	protected void serializeIp65504P443ReservdL(short ip65504P443ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P443ReservdL,IP_65504_P_443_RESERVD_L_LEN)
                  ,beginIp65504P443ReservdL
                  ,IP_65504_P_443_RESERVD_L_LEN
                 );
            localIp65504P443ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P443ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P443ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P443ReservdL() {	 
			return (getShort(beginIp65504P443ReservdL));
   	}
         int localIp65504P444ReservdSCounter = -1;
         public boolean isIp65504P444ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P444ReservdSCounter != sharedCounter;
            localIp65504P444ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_444_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P444ReservdS
	 */
	protected void serializeIp65504P444ReservdS(short ip65504P444ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P444ReservdS,IP_65504_P_444_RESERVD_S_LEN)
                  ,beginIp65504P444ReservdS
                  ,IP_65504_P_444_RESERVD_S_LEN
                 );
            localIp65504P444ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P444ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P444ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P444ReservdS() {	 
			return (getShort(beginIp65504P444ReservdS));
   	}
         int localIp65504P444ReservdLCounter = -1;
         public boolean isIp65504P444ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P444ReservdLCounter != sharedCounter;
            localIp65504P444ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_444_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P444ReservdL
	 */
	protected void serializeIp65504P444ReservdL(short ip65504P444ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P444ReservdL,IP_65504_P_444_RESERVD_L_LEN)
                  ,beginIp65504P444ReservdL
                  ,IP_65504_P_444_RESERVD_L_LEN
                 );
            localIp65504P444ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P444ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P444ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P444ReservdL() {	 
			return (getShort(beginIp65504P444ReservdL));
   	}
         int localIp65504P445ReservdSCounter = -1;
         public boolean isIp65504P445ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P445ReservdSCounter != sharedCounter;
            localIp65504P445ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_445_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P445ReservdS
	 */
	protected void serializeIp65504P445ReservdS(short ip65504P445ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P445ReservdS,IP_65504_P_445_RESERVD_S_LEN)
                  ,beginIp65504P445ReservdS
                  ,IP_65504_P_445_RESERVD_S_LEN
                 );
            localIp65504P445ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P445ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P445ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P445ReservdS() {	 
			return (getShort(beginIp65504P445ReservdS));
   	}
         int localIp65504P445ReservdLCounter = -1;
         public boolean isIp65504P445ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P445ReservdLCounter != sharedCounter;
            localIp65504P445ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_445_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P445ReservdL
	 */
	protected void serializeIp65504P445ReservdL(short ip65504P445ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P445ReservdL,IP_65504_P_445_RESERVD_L_LEN)
                  ,beginIp65504P445ReservdL
                  ,IP_65504_P_445_RESERVD_L_LEN
                 );
            localIp65504P445ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P445ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P445ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P445ReservdL() {	 
			return (getShort(beginIp65504P445ReservdL));
   	}
         int localIp65504P446ReservdSCounter = -1;
         public boolean isIp65504P446ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P446ReservdSCounter != sharedCounter;
            localIp65504P446ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_446_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P446ReservdS
	 */
	protected void serializeIp65504P446ReservdS(short ip65504P446ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P446ReservdS,IP_65504_P_446_RESERVD_S_LEN)
                  ,beginIp65504P446ReservdS
                  ,IP_65504_P_446_RESERVD_S_LEN
                 );
            localIp65504P446ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P446ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P446ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P446ReservdS() {	 
			return (getShort(beginIp65504P446ReservdS));
   	}
         int localIp65504P446ReservdLCounter = -1;
         public boolean isIp65504P446ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P446ReservdLCounter != sharedCounter;
            localIp65504P446ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_446_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P446ReservdL
	 */
	protected void serializeIp65504P446ReservdL(short ip65504P446ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P446ReservdL,IP_65504_P_446_RESERVD_L_LEN)
                  ,beginIp65504P446ReservdL
                  ,IP_65504_P_446_RESERVD_L_LEN
                 );
            localIp65504P446ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P446ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P446ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P446ReservdL() {	 
			return (getShort(beginIp65504P446ReservdL));
   	}
         int localIp65504P447ReservdSCounter = -1;
         public boolean isIp65504P447ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P447ReservdSCounter != sharedCounter;
            localIp65504P447ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_447_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P447ReservdS
	 */
	protected void serializeIp65504P447ReservdS(short ip65504P447ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P447ReservdS,IP_65504_P_447_RESERVD_S_LEN)
                  ,beginIp65504P447ReservdS
                  ,IP_65504_P_447_RESERVD_S_LEN
                 );
            localIp65504P447ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P447ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P447ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P447ReservdS() {	 
			return (getShort(beginIp65504P447ReservdS));
   	}
         int localIp65504P447ReservdLCounter = -1;
         public boolean isIp65504P447ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P447ReservdLCounter != sharedCounter;
            localIp65504P447ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_447_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P447ReservdL
	 */
	protected void serializeIp65504P447ReservdL(short ip65504P447ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P447ReservdL,IP_65504_P_447_RESERVD_L_LEN)
                  ,beginIp65504P447ReservdL
                  ,IP_65504_P_447_RESERVD_L_LEN
                 );
            localIp65504P447ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P447ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P447ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P447ReservdL() {	 
			return (getShort(beginIp65504P447ReservdL));
   	}
         int localIp65504P448ReservdSCounter = -1;
         public boolean isIp65504P448ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P448ReservdSCounter != sharedCounter;
            localIp65504P448ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_448_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P448ReservdS
	 */
	protected void serializeIp65504P448ReservdS(short ip65504P448ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P448ReservdS,IP_65504_P_448_RESERVD_S_LEN)
                  ,beginIp65504P448ReservdS
                  ,IP_65504_P_448_RESERVD_S_LEN
                 );
            localIp65504P448ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P448ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P448ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P448ReservdS() {	 
			return (getShort(beginIp65504P448ReservdS));
   	}
         int localIp65504P448ReservdLCounter = -1;
         public boolean isIp65504P448ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P448ReservdLCounter != sharedCounter;
            localIp65504P448ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_448_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P448ReservdL
	 */
	protected void serializeIp65504P448ReservdL(short ip65504P448ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P448ReservdL,IP_65504_P_448_RESERVD_L_LEN)
                  ,beginIp65504P448ReservdL
                  ,IP_65504_P_448_RESERVD_L_LEN
                 );
            localIp65504P448ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P448ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P448ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P448ReservdL() {	 
			return (getShort(beginIp65504P448ReservdL));
   	}
         int localIp65504P449ReservdSCounter = -1;
         public boolean isIp65504P449ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P449ReservdSCounter != sharedCounter;
            localIp65504P449ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_449_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P449ReservdS
	 */
	protected void serializeIp65504P449ReservdS(short ip65504P449ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P449ReservdS,IP_65504_P_449_RESERVD_S_LEN)
                  ,beginIp65504P449ReservdS
                  ,IP_65504_P_449_RESERVD_S_LEN
                 );
            localIp65504P449ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P449ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P449ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P449ReservdS() {	 
			return (getShort(beginIp65504P449ReservdS));
   	}
         int localIp65504P449ReservdLCounter = -1;
         public boolean isIp65504P449ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P449ReservdLCounter != sharedCounter;
            localIp65504P449ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_449_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P449ReservdL
	 */
	protected void serializeIp65504P449ReservdL(short ip65504P449ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P449ReservdL,IP_65504_P_449_RESERVD_L_LEN)
                  ,beginIp65504P449ReservdL
                  ,IP_65504_P_449_RESERVD_L_LEN
                 );
            localIp65504P449ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P449ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P449ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P449ReservdL() {	 
			return (getShort(beginIp65504P449ReservdL));
   	}
         int localIp65504P450ReservdSCounter = -1;
         public boolean isIp65504P450ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P450ReservdSCounter != sharedCounter;
            localIp65504P450ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_450_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P450ReservdS
	 */
	protected void serializeIp65504P450ReservdS(short ip65504P450ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P450ReservdS,IP_65504_P_450_RESERVD_S_LEN)
                  ,beginIp65504P450ReservdS
                  ,IP_65504_P_450_RESERVD_S_LEN
                 );
            localIp65504P450ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P450ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P450ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P450ReservdS() {	 
			return (getShort(beginIp65504P450ReservdS));
   	}
         int localIp65504P450ReservdLCounter = -1;
         public boolean isIp65504P450ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P450ReservdLCounter != sharedCounter;
            localIp65504P450ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_450_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P450ReservdL
	 */
	protected void serializeIp65504P450ReservdL(short ip65504P450ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P450ReservdL,IP_65504_P_450_RESERVD_L_LEN)
                  ,beginIp65504P450ReservdL
                  ,IP_65504_P_450_RESERVD_L_LEN
                 );
            localIp65504P450ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P450ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P450ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P450ReservdL() {	 
			return (getShort(beginIp65504P450ReservdL));
   	}
         int localIp65504P451ReservdSCounter = -1;
         public boolean isIp65504P451ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P451ReservdSCounter != sharedCounter;
            localIp65504P451ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_451_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P451ReservdS
	 */
	protected void serializeIp65504P451ReservdS(short ip65504P451ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P451ReservdS,IP_65504_P_451_RESERVD_S_LEN)
                  ,beginIp65504P451ReservdS
                  ,IP_65504_P_451_RESERVD_S_LEN
                 );
            localIp65504P451ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P451ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P451ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P451ReservdS() {	 
			return (getShort(beginIp65504P451ReservdS));
   	}
         int localIp65504P451ReservdLCounter = -1;
         public boolean isIp65504P451ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P451ReservdLCounter != sharedCounter;
            localIp65504P451ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_451_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P451ReservdL
	 */
	protected void serializeIp65504P451ReservdL(short ip65504P451ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P451ReservdL,IP_65504_P_451_RESERVD_L_LEN)
                  ,beginIp65504P451ReservdL
                  ,IP_65504_P_451_RESERVD_L_LEN
                 );
            localIp65504P451ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P451ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P451ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P451ReservdL() {	 
			return (getShort(beginIp65504P451ReservdL));
   	}
         int localIp65504P452ReservdSCounter = -1;
         public boolean isIp65504P452ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P452ReservdSCounter != sharedCounter;
            localIp65504P452ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_452_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P452ReservdS
	 */
	protected void serializeIp65504P452ReservdS(short ip65504P452ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P452ReservdS,IP_65504_P_452_RESERVD_S_LEN)
                  ,beginIp65504P452ReservdS
                  ,IP_65504_P_452_RESERVD_S_LEN
                 );
            localIp65504P452ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P452ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P452ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P452ReservdS() {	 
			return (getShort(beginIp65504P452ReservdS));
   	}
         int localIp65504P452ReservdLCounter = -1;
         public boolean isIp65504P452ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P452ReservdLCounter != sharedCounter;
            localIp65504P452ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_452_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P452ReservdL
	 */
	protected void serializeIp65504P452ReservdL(short ip65504P452ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P452ReservdL,IP_65504_P_452_RESERVD_L_LEN)
                  ,beginIp65504P452ReservdL
                  ,IP_65504_P_452_RESERVD_L_LEN
                 );
            localIp65504P452ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P452ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P452ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P452ReservdL() {	 
			return (getShort(beginIp65504P452ReservdL));
   	}
         int localIp65504P453ReservdSCounter = -1;
         public boolean isIp65504P453ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P453ReservdSCounter != sharedCounter;
            localIp65504P453ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_453_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P453ReservdS
	 */
	protected void serializeIp65504P453ReservdS(short ip65504P453ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P453ReservdS,IP_65504_P_453_RESERVD_S_LEN)
                  ,beginIp65504P453ReservdS
                  ,IP_65504_P_453_RESERVD_S_LEN
                 );
            localIp65504P453ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P453ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P453ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P453ReservdS() {	 
			return (getShort(beginIp65504P453ReservdS));
   	}
         int localIp65504P453ReservdLCounter = -1;
         public boolean isIp65504P453ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P453ReservdLCounter != sharedCounter;
            localIp65504P453ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_453_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P453ReservdL
	 */
	protected void serializeIp65504P453ReservdL(short ip65504P453ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P453ReservdL,IP_65504_P_453_RESERVD_L_LEN)
                  ,beginIp65504P453ReservdL
                  ,IP_65504_P_453_RESERVD_L_LEN
                 );
            localIp65504P453ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P453ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P453ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P453ReservdL() {	 
			return (getShort(beginIp65504P453ReservdL));
   	}
         int localIp65504P454ReservdSCounter = -1;
         public boolean isIp65504P454ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P454ReservdSCounter != sharedCounter;
            localIp65504P454ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_454_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P454ReservdS
	 */
	protected void serializeIp65504P454ReservdS(short ip65504P454ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P454ReservdS,IP_65504_P_454_RESERVD_S_LEN)
                  ,beginIp65504P454ReservdS
                  ,IP_65504_P_454_RESERVD_S_LEN
                 );
            localIp65504P454ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P454ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P454ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P454ReservdS() {	 
			return (getShort(beginIp65504P454ReservdS));
   	}
         int localIp65504P454ReservdLCounter = -1;
         public boolean isIp65504P454ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P454ReservdLCounter != sharedCounter;
            localIp65504P454ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_454_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P454ReservdL
	 */
	protected void serializeIp65504P454ReservdL(short ip65504P454ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P454ReservdL,IP_65504_P_454_RESERVD_L_LEN)
                  ,beginIp65504P454ReservdL
                  ,IP_65504_P_454_RESERVD_L_LEN
                 );
            localIp65504P454ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P454ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P454ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P454ReservdL() {	 
			return (getShort(beginIp65504P454ReservdL));
   	}
         int localIp65504P455ReservdSCounter = -1;
         public boolean isIp65504P455ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P455ReservdSCounter != sharedCounter;
            localIp65504P455ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_455_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P455ReservdS
	 */
	protected void serializeIp65504P455ReservdS(short ip65504P455ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P455ReservdS,IP_65504_P_455_RESERVD_S_LEN)
                  ,beginIp65504P455ReservdS
                  ,IP_65504_P_455_RESERVD_S_LEN
                 );
            localIp65504P455ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P455ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P455ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P455ReservdS() {	 
			return (getShort(beginIp65504P455ReservdS));
   	}
         int localIp65504P455ReservdLCounter = -1;
         public boolean isIp65504P455ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P455ReservdLCounter != sharedCounter;
            localIp65504P455ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_455_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P455ReservdL
	 */
	protected void serializeIp65504P455ReservdL(short ip65504P455ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P455ReservdL,IP_65504_P_455_RESERVD_L_LEN)
                  ,beginIp65504P455ReservdL
                  ,IP_65504_P_455_RESERVD_L_LEN
                 );
            localIp65504P455ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P455ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P455ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P455ReservdL() {	 
			return (getShort(beginIp65504P455ReservdL));
   	}
         int localIp65504P456ReservdSCounter = -1;
         public boolean isIp65504P456ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P456ReservdSCounter != sharedCounter;
            localIp65504P456ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_456_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P456ReservdS
	 */
	protected void serializeIp65504P456ReservdS(short ip65504P456ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P456ReservdS,IP_65504_P_456_RESERVD_S_LEN)
                  ,beginIp65504P456ReservdS
                  ,IP_65504_P_456_RESERVD_S_LEN
                 );
            localIp65504P456ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P456ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P456ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P456ReservdS() {	 
			return (getShort(beginIp65504P456ReservdS));
   	}
         int localIp65504P456ReservdLCounter = -1;
         public boolean isIp65504P456ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P456ReservdLCounter != sharedCounter;
            localIp65504P456ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_456_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P456ReservdL
	 */
	protected void serializeIp65504P456ReservdL(short ip65504P456ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P456ReservdL,IP_65504_P_456_RESERVD_L_LEN)
                  ,beginIp65504P456ReservdL
                  ,IP_65504_P_456_RESERVD_L_LEN
                 );
            localIp65504P456ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P456ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P456ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P456ReservdL() {	 
			return (getShort(beginIp65504P456ReservdL));
   	}
         int localIp65504P457ReservdSCounter = -1;
         public boolean isIp65504P457ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P457ReservdSCounter != sharedCounter;
            localIp65504P457ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_457_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P457ReservdS
	 */
	protected void serializeIp65504P457ReservdS(short ip65504P457ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P457ReservdS,IP_65504_P_457_RESERVD_S_LEN)
                  ,beginIp65504P457ReservdS
                  ,IP_65504_P_457_RESERVD_S_LEN
                 );
            localIp65504P457ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P457ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P457ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P457ReservdS() {	 
			return (getShort(beginIp65504P457ReservdS));
   	}
         int localIp65504P457ReservdLCounter = -1;
         public boolean isIp65504P457ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P457ReservdLCounter != sharedCounter;
            localIp65504P457ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_457_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P457ReservdL
	 */
	protected void serializeIp65504P457ReservdL(short ip65504P457ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P457ReservdL,IP_65504_P_457_RESERVD_L_LEN)
                  ,beginIp65504P457ReservdL
                  ,IP_65504_P_457_RESERVD_L_LEN
                 );
            localIp65504P457ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P457ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P457ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P457ReservdL() {	 
			return (getShort(beginIp65504P457ReservdL));
   	}
         int localIp65504P458ReservdSCounter = -1;
         public boolean isIp65504P458ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P458ReservdSCounter != sharedCounter;
            localIp65504P458ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_458_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P458ReservdS
	 */
	protected void serializeIp65504P458ReservdS(short ip65504P458ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P458ReservdS,IP_65504_P_458_RESERVD_S_LEN)
                  ,beginIp65504P458ReservdS
                  ,IP_65504_P_458_RESERVD_S_LEN
                 );
            localIp65504P458ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P458ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P458ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P458ReservdS() {	 
			return (getShort(beginIp65504P458ReservdS));
   	}
         int localIp65504P458ReservdLCounter = -1;
         public boolean isIp65504P458ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P458ReservdLCounter != sharedCounter;
            localIp65504P458ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_458_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P458ReservdL
	 */
	protected void serializeIp65504P458ReservdL(short ip65504P458ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P458ReservdL,IP_65504_P_458_RESERVD_L_LEN)
                  ,beginIp65504P458ReservdL
                  ,IP_65504_P_458_RESERVD_L_LEN
                 );
            localIp65504P458ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P458ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P458ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P458ReservdL() {	 
			return (getShort(beginIp65504P458ReservdL));
   	}
         int localIp65504P459ReservdSCounter = -1;
         public boolean isIp65504P459ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P459ReservdSCounter != sharedCounter;
            localIp65504P459ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_459_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P459ReservdS
	 */
	protected void serializeIp65504P459ReservdS(short ip65504P459ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P459ReservdS,IP_65504_P_459_RESERVD_S_LEN)
                  ,beginIp65504P459ReservdS
                  ,IP_65504_P_459_RESERVD_S_LEN
                 );
            localIp65504P459ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P459ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P459ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P459ReservdS() {	 
			return (getShort(beginIp65504P459ReservdS));
   	}
         int localIp65504P459ReservdLCounter = -1;
         public boolean isIp65504P459ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P459ReservdLCounter != sharedCounter;
            localIp65504P459ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_459_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P459ReservdL
	 */
	protected void serializeIp65504P459ReservdL(short ip65504P459ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P459ReservdL,IP_65504_P_459_RESERVD_L_LEN)
                  ,beginIp65504P459ReservdL
                  ,IP_65504_P_459_RESERVD_L_LEN
                 );
            localIp65504P459ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P459ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P459ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P459ReservdL() {	 
			return (getShort(beginIp65504P459ReservdL));
   	}
         int localIp65504P460ReservdSCounter = -1;
         public boolean isIp65504P460ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P460ReservdSCounter != sharedCounter;
            localIp65504P460ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_460_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P460ReservdS
	 */
	protected void serializeIp65504P460ReservdS(short ip65504P460ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P460ReservdS,IP_65504_P_460_RESERVD_S_LEN)
                  ,beginIp65504P460ReservdS
                  ,IP_65504_P_460_RESERVD_S_LEN
                 );
            localIp65504P460ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P460ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P460ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P460ReservdS() {	 
			return (getShort(beginIp65504P460ReservdS));
   	}
         int localIp65504P460ReservdLCounter = -1;
         public boolean isIp65504P460ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P460ReservdLCounter != sharedCounter;
            localIp65504P460ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_460_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P460ReservdL
	 */
	protected void serializeIp65504P460ReservdL(short ip65504P460ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P460ReservdL,IP_65504_P_460_RESERVD_L_LEN)
                  ,beginIp65504P460ReservdL
                  ,IP_65504_P_460_RESERVD_L_LEN
                 );
            localIp65504P460ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P460ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P460ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P460ReservdL() {	 
			return (getShort(beginIp65504P460ReservdL));
   	}
         int localIp65504P461ReservdSCounter = -1;
         public boolean isIp65504P461ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P461ReservdSCounter != sharedCounter;
            localIp65504P461ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_461_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P461ReservdS
	 */
	protected void serializeIp65504P461ReservdS(short ip65504P461ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P461ReservdS,IP_65504_P_461_RESERVD_S_LEN)
                  ,beginIp65504P461ReservdS
                  ,IP_65504_P_461_RESERVD_S_LEN
                 );
            localIp65504P461ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P461ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P461ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P461ReservdS() {	 
			return (getShort(beginIp65504P461ReservdS));
   	}
         int localIp65504P461ReservdLCounter = -1;
         public boolean isIp65504P461ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P461ReservdLCounter != sharedCounter;
            localIp65504P461ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_461_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P461ReservdL
	 */
	protected void serializeIp65504P461ReservdL(short ip65504P461ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P461ReservdL,IP_65504_P_461_RESERVD_L_LEN)
                  ,beginIp65504P461ReservdL
                  ,IP_65504_P_461_RESERVD_L_LEN
                 );
            localIp65504P461ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P461ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P461ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P461ReservdL() {	 
			return (getShort(beginIp65504P461ReservdL));
   	}
         int localIp65504P462ReservdSCounter = -1;
         public boolean isIp65504P462ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P462ReservdSCounter != sharedCounter;
            localIp65504P462ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_462_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P462ReservdS
	 */
	protected void serializeIp65504P462ReservdS(short ip65504P462ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P462ReservdS,IP_65504_P_462_RESERVD_S_LEN)
                  ,beginIp65504P462ReservdS
                  ,IP_65504_P_462_RESERVD_S_LEN
                 );
            localIp65504P462ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P462ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P462ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P462ReservdS() {	 
			return (getShort(beginIp65504P462ReservdS));
   	}
         int localIp65504P462ReservdLCounter = -1;
         public boolean isIp65504P462ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P462ReservdLCounter != sharedCounter;
            localIp65504P462ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_462_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P462ReservdL
	 */
	protected void serializeIp65504P462ReservdL(short ip65504P462ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P462ReservdL,IP_65504_P_462_RESERVD_L_LEN)
                  ,beginIp65504P462ReservdL
                  ,IP_65504_P_462_RESERVD_L_LEN
                 );
            localIp65504P462ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P462ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P462ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P462ReservdL() {	 
			return (getShort(beginIp65504P462ReservdL));
   	}
         int localIp65504P463ReservdSCounter = -1;
         public boolean isIp65504P463ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P463ReservdSCounter != sharedCounter;
            localIp65504P463ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_463_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P463ReservdS
	 */
	protected void serializeIp65504P463ReservdS(short ip65504P463ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P463ReservdS,IP_65504_P_463_RESERVD_S_LEN)
                  ,beginIp65504P463ReservdS
                  ,IP_65504_P_463_RESERVD_S_LEN
                 );
            localIp65504P463ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P463ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P463ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P463ReservdS() {	 
			return (getShort(beginIp65504P463ReservdS));
   	}
         int localIp65504P463ReservdLCounter = -1;
         public boolean isIp65504P463ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P463ReservdLCounter != sharedCounter;
            localIp65504P463ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_463_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P463ReservdL
	 */
	protected void serializeIp65504P463ReservdL(short ip65504P463ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P463ReservdL,IP_65504_P_463_RESERVD_L_LEN)
                  ,beginIp65504P463ReservdL
                  ,IP_65504_P_463_RESERVD_L_LEN
                 );
            localIp65504P463ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P463ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P463ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P463ReservdL() {	 
			return (getShort(beginIp65504P463ReservdL));
   	}
         int localIp65504P464ReservdSCounter = -1;
         public boolean isIp65504P464ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P464ReservdSCounter != sharedCounter;
            localIp65504P464ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_464_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P464ReservdS
	 */
	protected void serializeIp65504P464ReservdS(short ip65504P464ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P464ReservdS,IP_65504_P_464_RESERVD_S_LEN)
                  ,beginIp65504P464ReservdS
                  ,IP_65504_P_464_RESERVD_S_LEN
                 );
            localIp65504P464ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P464ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P464ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P464ReservdS() {	 
			return (getShort(beginIp65504P464ReservdS));
   	}
         int localIp65504P464ReservdLCounter = -1;
         public boolean isIp65504P464ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P464ReservdLCounter != sharedCounter;
            localIp65504P464ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_464_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P464ReservdL
	 */
	protected void serializeIp65504P464ReservdL(short ip65504P464ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P464ReservdL,IP_65504_P_464_RESERVD_L_LEN)
                  ,beginIp65504P464ReservdL
                  ,IP_65504_P_464_RESERVD_L_LEN
                 );
            localIp65504P464ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P464ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P464ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P464ReservdL() {	 
			return (getShort(beginIp65504P464ReservdL));
   	}
         int localIp65504P465ReservdSCounter = -1;
         public boolean isIp65504P465ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P465ReservdSCounter != sharedCounter;
            localIp65504P465ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_465_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P465ReservdS
	 */
	protected void serializeIp65504P465ReservdS(short ip65504P465ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P465ReservdS,IP_65504_P_465_RESERVD_S_LEN)
                  ,beginIp65504P465ReservdS
                  ,IP_65504_P_465_RESERVD_S_LEN
                 );
            localIp65504P465ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P465ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P465ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P465ReservdS() {	 
			return (getShort(beginIp65504P465ReservdS));
   	}
         int localIp65504P465ReservdLCounter = -1;
         public boolean isIp65504P465ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P465ReservdLCounter != sharedCounter;
            localIp65504P465ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_465_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P465ReservdL
	 */
	protected void serializeIp65504P465ReservdL(short ip65504P465ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P465ReservdL,IP_65504_P_465_RESERVD_L_LEN)
                  ,beginIp65504P465ReservdL
                  ,IP_65504_P_465_RESERVD_L_LEN
                 );
            localIp65504P465ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P465ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P465ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P465ReservdL() {	 
			return (getShort(beginIp65504P465ReservdL));
   	}




}
  
