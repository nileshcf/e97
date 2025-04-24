package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup29Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup29Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup29Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_29_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P869ReservdS;
            protected  int beginIp65504P869ReservdL;
            protected  int beginIp65504P870ReservdS;
            protected  int beginIp65504P870ReservdL;
            protected  int beginIp65504P871ReservdS;
            protected  int beginIp65504P871ReservdL;
            protected  int beginIp65504P872ReservdS;
            protected  int beginIp65504P872ReservdL;
            protected  int beginIp65504P873ReservdS;
            protected  int beginIp65504P873ReservdL;
            protected  int beginIp65504P874ReservdS;
            protected  int beginIp65504P874ReservdL;
            protected  int beginIp65504P875ReservdS;
            protected  int beginIp65504P875ReservdL;
            protected  int beginIp65504P876ReservdS;
            protected  int beginIp65504P876ReservdL;
            protected  int beginIp65504P877ReservdS;
            protected  int beginIp65504P877ReservdL;
            protected  int beginIp65504P878ReservdS;
            protected  int beginIp65504P878ReservdL;
            protected  int beginIp65504P879ReservdS;
            protected  int beginIp65504P879ReservdL;
            protected  int beginIp65504P880ReservdS;
            protected  int beginIp65504P880ReservdL;
            protected  int beginIp65504P881ReservdS;
            protected  int beginIp65504P881ReservdL;
            protected  int beginIp65504P882ReservdS;
            protected  int beginIp65504P882ReservdL;
            protected  int beginIp65504P883ReservdS;
            protected  int beginIp65504P883ReservdL;
            protected  int beginIp65504P884ReservdS;
            protected  int beginIp65504P884ReservdL;
            protected  int beginIp65504P885ReservdS;
            protected  int beginIp65504P885ReservdL;
            protected  int beginIp65504P886ReservdS;
            protected  int beginIp65504P886ReservdL;
            protected  int beginIp65504P887ReservdS;
            protected  int beginIp65504P887ReservdL;
            protected  int beginIp65504P888ReservdS;
            protected  int beginIp65504P888ReservdL;
            protected  int beginIp65504P889ReservdS;
            protected  int beginIp65504P889ReservdL;
            protected  int beginIp65504P890ReservdS;
            protected  int beginIp65504P890ReservdL;
            protected  int beginIp65504P891ReservdS;
            protected  int beginIp65504P891ReservdL;
            protected  int beginIp65504P892ReservdS;
            protected  int beginIp65504P892ReservdL;
            protected  int beginIp65504P893ReservdS;
            protected  int beginIp65504P893ReservdL;
            protected  int beginIp65504P894ReservdS;
            protected  int beginIp65504P894ReservdL;
            protected  int beginIp65504P895ReservdS;
            protected  int beginIp65504P895ReservdL;
            protected  int beginIp65504P896ReservdS;
            protected  int beginIp65504P896ReservdL;
            protected  int beginIp65504P897ReservdS;
            protected  int beginIp65504P897ReservdL;
            protected  int beginIp65504P898ReservdS;
            protected  int beginIp65504P898ReservdL;
            protected  int beginIp65504P899ReservdS;
            protected  int beginIp65504P899ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup29Serialized
	**/
    public Ip65504PdsNamesLargeGroup29Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup29Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup29Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup29Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,6940); // serialize this field at offset 6940 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup29Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 6940 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup29Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_29_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P869ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P869ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P870ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P870ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P871ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P871ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P872ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P872ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P873ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P873ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P874ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P874ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P875ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P875ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P876ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P876ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P877ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P877ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P878ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P878ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P879ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P879ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P880ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P880ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P881ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P881ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P882ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P882ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P883ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P883ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P884ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P884ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P885ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P885ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P886ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P886ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P887ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P887ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P888ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P888ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P889ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P889ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P890ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P890ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P891ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P891ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P892ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P892ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P893ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P893ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P894ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P894ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P895ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P895ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P896ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P896ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P897ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P897ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P898ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P898ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P899ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P899ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P869ReservdSCounter = -1;
         public boolean isIp65504P869ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P869ReservdSCounter != sharedCounter;
            localIp65504P869ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_869_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P869ReservdS
	 */
	protected void serializeIp65504P869ReservdS(short ip65504P869ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P869ReservdS,IP_65504_P_869_RESERVD_S_LEN)
                  ,beginIp65504P869ReservdS
                  ,IP_65504_P_869_RESERVD_S_LEN
                 );
            localIp65504P869ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P869ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P869ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P869ReservdS() {	 
			return (getShort(beginIp65504P869ReservdS));
   	}
         int localIp65504P869ReservdLCounter = -1;
         public boolean isIp65504P869ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P869ReservdLCounter != sharedCounter;
            localIp65504P869ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_869_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P869ReservdL
	 */
	protected void serializeIp65504P869ReservdL(short ip65504P869ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P869ReservdL,IP_65504_P_869_RESERVD_L_LEN)
                  ,beginIp65504P869ReservdL
                  ,IP_65504_P_869_RESERVD_L_LEN
                 );
            localIp65504P869ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P869ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P869ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P869ReservdL() {	 
			return (getShort(beginIp65504P869ReservdL));
   	}
         int localIp65504P870ReservdSCounter = -1;
         public boolean isIp65504P870ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P870ReservdSCounter != sharedCounter;
            localIp65504P870ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_870_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P870ReservdS
	 */
	protected void serializeIp65504P870ReservdS(short ip65504P870ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P870ReservdS,IP_65504_P_870_RESERVD_S_LEN)
                  ,beginIp65504P870ReservdS
                  ,IP_65504_P_870_RESERVD_S_LEN
                 );
            localIp65504P870ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P870ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P870ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P870ReservdS() {	 
			return (getShort(beginIp65504P870ReservdS));
   	}
         int localIp65504P870ReservdLCounter = -1;
         public boolean isIp65504P870ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P870ReservdLCounter != sharedCounter;
            localIp65504P870ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_870_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P870ReservdL
	 */
	protected void serializeIp65504P870ReservdL(short ip65504P870ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P870ReservdL,IP_65504_P_870_RESERVD_L_LEN)
                  ,beginIp65504P870ReservdL
                  ,IP_65504_P_870_RESERVD_L_LEN
                 );
            localIp65504P870ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P870ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P870ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P870ReservdL() {	 
			return (getShort(beginIp65504P870ReservdL));
   	}
         int localIp65504P871ReservdSCounter = -1;
         public boolean isIp65504P871ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P871ReservdSCounter != sharedCounter;
            localIp65504P871ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_871_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P871ReservdS
	 */
	protected void serializeIp65504P871ReservdS(short ip65504P871ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P871ReservdS,IP_65504_P_871_RESERVD_S_LEN)
                  ,beginIp65504P871ReservdS
                  ,IP_65504_P_871_RESERVD_S_LEN
                 );
            localIp65504P871ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P871ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P871ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P871ReservdS() {	 
			return (getShort(beginIp65504P871ReservdS));
   	}
         int localIp65504P871ReservdLCounter = -1;
         public boolean isIp65504P871ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P871ReservdLCounter != sharedCounter;
            localIp65504P871ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_871_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P871ReservdL
	 */
	protected void serializeIp65504P871ReservdL(short ip65504P871ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P871ReservdL,IP_65504_P_871_RESERVD_L_LEN)
                  ,beginIp65504P871ReservdL
                  ,IP_65504_P_871_RESERVD_L_LEN
                 );
            localIp65504P871ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P871ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P871ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P871ReservdL() {	 
			return (getShort(beginIp65504P871ReservdL));
   	}
         int localIp65504P872ReservdSCounter = -1;
         public boolean isIp65504P872ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P872ReservdSCounter != sharedCounter;
            localIp65504P872ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_872_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P872ReservdS
	 */
	protected void serializeIp65504P872ReservdS(short ip65504P872ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P872ReservdS,IP_65504_P_872_RESERVD_S_LEN)
                  ,beginIp65504P872ReservdS
                  ,IP_65504_P_872_RESERVD_S_LEN
                 );
            localIp65504P872ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P872ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P872ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P872ReservdS() {	 
			return (getShort(beginIp65504P872ReservdS));
   	}
         int localIp65504P872ReservdLCounter = -1;
         public boolean isIp65504P872ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P872ReservdLCounter != sharedCounter;
            localIp65504P872ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_872_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P872ReservdL
	 */
	protected void serializeIp65504P872ReservdL(short ip65504P872ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P872ReservdL,IP_65504_P_872_RESERVD_L_LEN)
                  ,beginIp65504P872ReservdL
                  ,IP_65504_P_872_RESERVD_L_LEN
                 );
            localIp65504P872ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P872ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P872ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P872ReservdL() {	 
			return (getShort(beginIp65504P872ReservdL));
   	}
         int localIp65504P873ReservdSCounter = -1;
         public boolean isIp65504P873ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P873ReservdSCounter != sharedCounter;
            localIp65504P873ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_873_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P873ReservdS
	 */
	protected void serializeIp65504P873ReservdS(short ip65504P873ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P873ReservdS,IP_65504_P_873_RESERVD_S_LEN)
                  ,beginIp65504P873ReservdS
                  ,IP_65504_P_873_RESERVD_S_LEN
                 );
            localIp65504P873ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P873ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P873ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P873ReservdS() {	 
			return (getShort(beginIp65504P873ReservdS));
   	}
         int localIp65504P873ReservdLCounter = -1;
         public boolean isIp65504P873ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P873ReservdLCounter != sharedCounter;
            localIp65504P873ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_873_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P873ReservdL
	 */
	protected void serializeIp65504P873ReservdL(short ip65504P873ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P873ReservdL,IP_65504_P_873_RESERVD_L_LEN)
                  ,beginIp65504P873ReservdL
                  ,IP_65504_P_873_RESERVD_L_LEN
                 );
            localIp65504P873ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P873ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P873ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P873ReservdL() {	 
			return (getShort(beginIp65504P873ReservdL));
   	}
         int localIp65504P874ReservdSCounter = -1;
         public boolean isIp65504P874ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P874ReservdSCounter != sharedCounter;
            localIp65504P874ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_874_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P874ReservdS
	 */
	protected void serializeIp65504P874ReservdS(short ip65504P874ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P874ReservdS,IP_65504_P_874_RESERVD_S_LEN)
                  ,beginIp65504P874ReservdS
                  ,IP_65504_P_874_RESERVD_S_LEN
                 );
            localIp65504P874ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P874ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P874ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P874ReservdS() {	 
			return (getShort(beginIp65504P874ReservdS));
   	}
         int localIp65504P874ReservdLCounter = -1;
         public boolean isIp65504P874ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P874ReservdLCounter != sharedCounter;
            localIp65504P874ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_874_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P874ReservdL
	 */
	protected void serializeIp65504P874ReservdL(short ip65504P874ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P874ReservdL,IP_65504_P_874_RESERVD_L_LEN)
                  ,beginIp65504P874ReservdL
                  ,IP_65504_P_874_RESERVD_L_LEN
                 );
            localIp65504P874ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P874ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P874ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P874ReservdL() {	 
			return (getShort(beginIp65504P874ReservdL));
   	}
         int localIp65504P875ReservdSCounter = -1;
         public boolean isIp65504P875ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P875ReservdSCounter != sharedCounter;
            localIp65504P875ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_875_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P875ReservdS
	 */
	protected void serializeIp65504P875ReservdS(short ip65504P875ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P875ReservdS,IP_65504_P_875_RESERVD_S_LEN)
                  ,beginIp65504P875ReservdS
                  ,IP_65504_P_875_RESERVD_S_LEN
                 );
            localIp65504P875ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P875ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P875ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P875ReservdS() {	 
			return (getShort(beginIp65504P875ReservdS));
   	}
         int localIp65504P875ReservdLCounter = -1;
         public boolean isIp65504P875ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P875ReservdLCounter != sharedCounter;
            localIp65504P875ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_875_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P875ReservdL
	 */
	protected void serializeIp65504P875ReservdL(short ip65504P875ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P875ReservdL,IP_65504_P_875_RESERVD_L_LEN)
                  ,beginIp65504P875ReservdL
                  ,IP_65504_P_875_RESERVD_L_LEN
                 );
            localIp65504P875ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P875ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P875ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P875ReservdL() {	 
			return (getShort(beginIp65504P875ReservdL));
   	}
         int localIp65504P876ReservdSCounter = -1;
         public boolean isIp65504P876ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P876ReservdSCounter != sharedCounter;
            localIp65504P876ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_876_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P876ReservdS
	 */
	protected void serializeIp65504P876ReservdS(short ip65504P876ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P876ReservdS,IP_65504_P_876_RESERVD_S_LEN)
                  ,beginIp65504P876ReservdS
                  ,IP_65504_P_876_RESERVD_S_LEN
                 );
            localIp65504P876ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P876ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P876ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P876ReservdS() {	 
			return (getShort(beginIp65504P876ReservdS));
   	}
         int localIp65504P876ReservdLCounter = -1;
         public boolean isIp65504P876ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P876ReservdLCounter != sharedCounter;
            localIp65504P876ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_876_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P876ReservdL
	 */
	protected void serializeIp65504P876ReservdL(short ip65504P876ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P876ReservdL,IP_65504_P_876_RESERVD_L_LEN)
                  ,beginIp65504P876ReservdL
                  ,IP_65504_P_876_RESERVD_L_LEN
                 );
            localIp65504P876ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P876ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P876ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P876ReservdL() {	 
			return (getShort(beginIp65504P876ReservdL));
   	}
         int localIp65504P877ReservdSCounter = -1;
         public boolean isIp65504P877ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P877ReservdSCounter != sharedCounter;
            localIp65504P877ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_877_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P877ReservdS
	 */
	protected void serializeIp65504P877ReservdS(short ip65504P877ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P877ReservdS,IP_65504_P_877_RESERVD_S_LEN)
                  ,beginIp65504P877ReservdS
                  ,IP_65504_P_877_RESERVD_S_LEN
                 );
            localIp65504P877ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P877ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P877ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P877ReservdS() {	 
			return (getShort(beginIp65504P877ReservdS));
   	}
         int localIp65504P877ReservdLCounter = -1;
         public boolean isIp65504P877ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P877ReservdLCounter != sharedCounter;
            localIp65504P877ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_877_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P877ReservdL
	 */
	protected void serializeIp65504P877ReservdL(short ip65504P877ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P877ReservdL,IP_65504_P_877_RESERVD_L_LEN)
                  ,beginIp65504P877ReservdL
                  ,IP_65504_P_877_RESERVD_L_LEN
                 );
            localIp65504P877ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P877ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P877ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P877ReservdL() {	 
			return (getShort(beginIp65504P877ReservdL));
   	}
         int localIp65504P878ReservdSCounter = -1;
         public boolean isIp65504P878ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P878ReservdSCounter != sharedCounter;
            localIp65504P878ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_878_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P878ReservdS
	 */
	protected void serializeIp65504P878ReservdS(short ip65504P878ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P878ReservdS,IP_65504_P_878_RESERVD_S_LEN)
                  ,beginIp65504P878ReservdS
                  ,IP_65504_P_878_RESERVD_S_LEN
                 );
            localIp65504P878ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P878ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P878ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P878ReservdS() {	 
			return (getShort(beginIp65504P878ReservdS));
   	}
         int localIp65504P878ReservdLCounter = -1;
         public boolean isIp65504P878ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P878ReservdLCounter != sharedCounter;
            localIp65504P878ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_878_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P878ReservdL
	 */
	protected void serializeIp65504P878ReservdL(short ip65504P878ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P878ReservdL,IP_65504_P_878_RESERVD_L_LEN)
                  ,beginIp65504P878ReservdL
                  ,IP_65504_P_878_RESERVD_L_LEN
                 );
            localIp65504P878ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P878ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P878ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P878ReservdL() {	 
			return (getShort(beginIp65504P878ReservdL));
   	}
         int localIp65504P879ReservdSCounter = -1;
         public boolean isIp65504P879ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P879ReservdSCounter != sharedCounter;
            localIp65504P879ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_879_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P879ReservdS
	 */
	protected void serializeIp65504P879ReservdS(short ip65504P879ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P879ReservdS,IP_65504_P_879_RESERVD_S_LEN)
                  ,beginIp65504P879ReservdS
                  ,IP_65504_P_879_RESERVD_S_LEN
                 );
            localIp65504P879ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P879ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P879ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P879ReservdS() {	 
			return (getShort(beginIp65504P879ReservdS));
   	}
         int localIp65504P879ReservdLCounter = -1;
         public boolean isIp65504P879ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P879ReservdLCounter != sharedCounter;
            localIp65504P879ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_879_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P879ReservdL
	 */
	protected void serializeIp65504P879ReservdL(short ip65504P879ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P879ReservdL,IP_65504_P_879_RESERVD_L_LEN)
                  ,beginIp65504P879ReservdL
                  ,IP_65504_P_879_RESERVD_L_LEN
                 );
            localIp65504P879ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P879ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P879ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P879ReservdL() {	 
			return (getShort(beginIp65504P879ReservdL));
   	}
         int localIp65504P880ReservdSCounter = -1;
         public boolean isIp65504P880ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P880ReservdSCounter != sharedCounter;
            localIp65504P880ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_880_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P880ReservdS
	 */
	protected void serializeIp65504P880ReservdS(short ip65504P880ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P880ReservdS,IP_65504_P_880_RESERVD_S_LEN)
                  ,beginIp65504P880ReservdS
                  ,IP_65504_P_880_RESERVD_S_LEN
                 );
            localIp65504P880ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P880ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P880ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P880ReservdS() {	 
			return (getShort(beginIp65504P880ReservdS));
   	}
         int localIp65504P880ReservdLCounter = -1;
         public boolean isIp65504P880ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P880ReservdLCounter != sharedCounter;
            localIp65504P880ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_880_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P880ReservdL
	 */
	protected void serializeIp65504P880ReservdL(short ip65504P880ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P880ReservdL,IP_65504_P_880_RESERVD_L_LEN)
                  ,beginIp65504P880ReservdL
                  ,IP_65504_P_880_RESERVD_L_LEN
                 );
            localIp65504P880ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P880ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P880ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P880ReservdL() {	 
			return (getShort(beginIp65504P880ReservdL));
   	}
         int localIp65504P881ReservdSCounter = -1;
         public boolean isIp65504P881ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P881ReservdSCounter != sharedCounter;
            localIp65504P881ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_881_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P881ReservdS
	 */
	protected void serializeIp65504P881ReservdS(short ip65504P881ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P881ReservdS,IP_65504_P_881_RESERVD_S_LEN)
                  ,beginIp65504P881ReservdS
                  ,IP_65504_P_881_RESERVD_S_LEN
                 );
            localIp65504P881ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P881ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P881ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P881ReservdS() {	 
			return (getShort(beginIp65504P881ReservdS));
   	}
         int localIp65504P881ReservdLCounter = -1;
         public boolean isIp65504P881ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P881ReservdLCounter != sharedCounter;
            localIp65504P881ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_881_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P881ReservdL
	 */
	protected void serializeIp65504P881ReservdL(short ip65504P881ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P881ReservdL,IP_65504_P_881_RESERVD_L_LEN)
                  ,beginIp65504P881ReservdL
                  ,IP_65504_P_881_RESERVD_L_LEN
                 );
            localIp65504P881ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P881ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P881ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P881ReservdL() {	 
			return (getShort(beginIp65504P881ReservdL));
   	}
         int localIp65504P882ReservdSCounter = -1;
         public boolean isIp65504P882ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P882ReservdSCounter != sharedCounter;
            localIp65504P882ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_882_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P882ReservdS
	 */
	protected void serializeIp65504P882ReservdS(short ip65504P882ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P882ReservdS,IP_65504_P_882_RESERVD_S_LEN)
                  ,beginIp65504P882ReservdS
                  ,IP_65504_P_882_RESERVD_S_LEN
                 );
            localIp65504P882ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P882ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P882ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P882ReservdS() {	 
			return (getShort(beginIp65504P882ReservdS));
   	}
         int localIp65504P882ReservdLCounter = -1;
         public boolean isIp65504P882ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P882ReservdLCounter != sharedCounter;
            localIp65504P882ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_882_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P882ReservdL
	 */
	protected void serializeIp65504P882ReservdL(short ip65504P882ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P882ReservdL,IP_65504_P_882_RESERVD_L_LEN)
                  ,beginIp65504P882ReservdL
                  ,IP_65504_P_882_RESERVD_L_LEN
                 );
            localIp65504P882ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P882ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P882ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P882ReservdL() {	 
			return (getShort(beginIp65504P882ReservdL));
   	}
         int localIp65504P883ReservdSCounter = -1;
         public boolean isIp65504P883ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P883ReservdSCounter != sharedCounter;
            localIp65504P883ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_883_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P883ReservdS
	 */
	protected void serializeIp65504P883ReservdS(short ip65504P883ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P883ReservdS,IP_65504_P_883_RESERVD_S_LEN)
                  ,beginIp65504P883ReservdS
                  ,IP_65504_P_883_RESERVD_S_LEN
                 );
            localIp65504P883ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P883ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P883ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P883ReservdS() {	 
			return (getShort(beginIp65504P883ReservdS));
   	}
         int localIp65504P883ReservdLCounter = -1;
         public boolean isIp65504P883ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P883ReservdLCounter != sharedCounter;
            localIp65504P883ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_883_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P883ReservdL
	 */
	protected void serializeIp65504P883ReservdL(short ip65504P883ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P883ReservdL,IP_65504_P_883_RESERVD_L_LEN)
                  ,beginIp65504P883ReservdL
                  ,IP_65504_P_883_RESERVD_L_LEN
                 );
            localIp65504P883ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P883ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P883ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P883ReservdL() {	 
			return (getShort(beginIp65504P883ReservdL));
   	}
         int localIp65504P884ReservdSCounter = -1;
         public boolean isIp65504P884ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P884ReservdSCounter != sharedCounter;
            localIp65504P884ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_884_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P884ReservdS
	 */
	protected void serializeIp65504P884ReservdS(short ip65504P884ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P884ReservdS,IP_65504_P_884_RESERVD_S_LEN)
                  ,beginIp65504P884ReservdS
                  ,IP_65504_P_884_RESERVD_S_LEN
                 );
            localIp65504P884ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P884ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P884ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P884ReservdS() {	 
			return (getShort(beginIp65504P884ReservdS));
   	}
         int localIp65504P884ReservdLCounter = -1;
         public boolean isIp65504P884ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P884ReservdLCounter != sharedCounter;
            localIp65504P884ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_884_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P884ReservdL
	 */
	protected void serializeIp65504P884ReservdL(short ip65504P884ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P884ReservdL,IP_65504_P_884_RESERVD_L_LEN)
                  ,beginIp65504P884ReservdL
                  ,IP_65504_P_884_RESERVD_L_LEN
                 );
            localIp65504P884ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P884ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P884ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P884ReservdL() {	 
			return (getShort(beginIp65504P884ReservdL));
   	}
         int localIp65504P885ReservdSCounter = -1;
         public boolean isIp65504P885ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P885ReservdSCounter != sharedCounter;
            localIp65504P885ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_885_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P885ReservdS
	 */
	protected void serializeIp65504P885ReservdS(short ip65504P885ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P885ReservdS,IP_65504_P_885_RESERVD_S_LEN)
                  ,beginIp65504P885ReservdS
                  ,IP_65504_P_885_RESERVD_S_LEN
                 );
            localIp65504P885ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P885ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P885ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P885ReservdS() {	 
			return (getShort(beginIp65504P885ReservdS));
   	}
         int localIp65504P885ReservdLCounter = -1;
         public boolean isIp65504P885ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P885ReservdLCounter != sharedCounter;
            localIp65504P885ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_885_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P885ReservdL
	 */
	protected void serializeIp65504P885ReservdL(short ip65504P885ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P885ReservdL,IP_65504_P_885_RESERVD_L_LEN)
                  ,beginIp65504P885ReservdL
                  ,IP_65504_P_885_RESERVD_L_LEN
                 );
            localIp65504P885ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P885ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P885ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P885ReservdL() {	 
			return (getShort(beginIp65504P885ReservdL));
   	}
         int localIp65504P886ReservdSCounter = -1;
         public boolean isIp65504P886ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P886ReservdSCounter != sharedCounter;
            localIp65504P886ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_886_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P886ReservdS
	 */
	protected void serializeIp65504P886ReservdS(short ip65504P886ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P886ReservdS,IP_65504_P_886_RESERVD_S_LEN)
                  ,beginIp65504P886ReservdS
                  ,IP_65504_P_886_RESERVD_S_LEN
                 );
            localIp65504P886ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P886ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P886ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P886ReservdS() {	 
			return (getShort(beginIp65504P886ReservdS));
   	}
         int localIp65504P886ReservdLCounter = -1;
         public boolean isIp65504P886ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P886ReservdLCounter != sharedCounter;
            localIp65504P886ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_886_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P886ReservdL
	 */
	protected void serializeIp65504P886ReservdL(short ip65504P886ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P886ReservdL,IP_65504_P_886_RESERVD_L_LEN)
                  ,beginIp65504P886ReservdL
                  ,IP_65504_P_886_RESERVD_L_LEN
                 );
            localIp65504P886ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P886ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P886ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P886ReservdL() {	 
			return (getShort(beginIp65504P886ReservdL));
   	}
         int localIp65504P887ReservdSCounter = -1;
         public boolean isIp65504P887ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P887ReservdSCounter != sharedCounter;
            localIp65504P887ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_887_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P887ReservdS
	 */
	protected void serializeIp65504P887ReservdS(short ip65504P887ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P887ReservdS,IP_65504_P_887_RESERVD_S_LEN)
                  ,beginIp65504P887ReservdS
                  ,IP_65504_P_887_RESERVD_S_LEN
                 );
            localIp65504P887ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P887ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P887ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P887ReservdS() {	 
			return (getShort(beginIp65504P887ReservdS));
   	}
         int localIp65504P887ReservdLCounter = -1;
         public boolean isIp65504P887ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P887ReservdLCounter != sharedCounter;
            localIp65504P887ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_887_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P887ReservdL
	 */
	protected void serializeIp65504P887ReservdL(short ip65504P887ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P887ReservdL,IP_65504_P_887_RESERVD_L_LEN)
                  ,beginIp65504P887ReservdL
                  ,IP_65504_P_887_RESERVD_L_LEN
                 );
            localIp65504P887ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P887ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P887ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P887ReservdL() {	 
			return (getShort(beginIp65504P887ReservdL));
   	}
         int localIp65504P888ReservdSCounter = -1;
         public boolean isIp65504P888ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P888ReservdSCounter != sharedCounter;
            localIp65504P888ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_888_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P888ReservdS
	 */
	protected void serializeIp65504P888ReservdS(short ip65504P888ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P888ReservdS,IP_65504_P_888_RESERVD_S_LEN)
                  ,beginIp65504P888ReservdS
                  ,IP_65504_P_888_RESERVD_S_LEN
                 );
            localIp65504P888ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P888ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P888ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P888ReservdS() {	 
			return (getShort(beginIp65504P888ReservdS));
   	}
         int localIp65504P888ReservdLCounter = -1;
         public boolean isIp65504P888ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P888ReservdLCounter != sharedCounter;
            localIp65504P888ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_888_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P888ReservdL
	 */
	protected void serializeIp65504P888ReservdL(short ip65504P888ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P888ReservdL,IP_65504_P_888_RESERVD_L_LEN)
                  ,beginIp65504P888ReservdL
                  ,IP_65504_P_888_RESERVD_L_LEN
                 );
            localIp65504P888ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P888ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P888ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P888ReservdL() {	 
			return (getShort(beginIp65504P888ReservdL));
   	}
         int localIp65504P889ReservdSCounter = -1;
         public boolean isIp65504P889ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P889ReservdSCounter != sharedCounter;
            localIp65504P889ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_889_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P889ReservdS
	 */
	protected void serializeIp65504P889ReservdS(short ip65504P889ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P889ReservdS,IP_65504_P_889_RESERVD_S_LEN)
                  ,beginIp65504P889ReservdS
                  ,IP_65504_P_889_RESERVD_S_LEN
                 );
            localIp65504P889ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P889ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P889ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P889ReservdS() {	 
			return (getShort(beginIp65504P889ReservdS));
   	}
         int localIp65504P889ReservdLCounter = -1;
         public boolean isIp65504P889ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P889ReservdLCounter != sharedCounter;
            localIp65504P889ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_889_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P889ReservdL
	 */
	protected void serializeIp65504P889ReservdL(short ip65504P889ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P889ReservdL,IP_65504_P_889_RESERVD_L_LEN)
                  ,beginIp65504P889ReservdL
                  ,IP_65504_P_889_RESERVD_L_LEN
                 );
            localIp65504P889ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P889ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P889ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P889ReservdL() {	 
			return (getShort(beginIp65504P889ReservdL));
   	}
         int localIp65504P890ReservdSCounter = -1;
         public boolean isIp65504P890ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P890ReservdSCounter != sharedCounter;
            localIp65504P890ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_890_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P890ReservdS
	 */
	protected void serializeIp65504P890ReservdS(short ip65504P890ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P890ReservdS,IP_65504_P_890_RESERVD_S_LEN)
                  ,beginIp65504P890ReservdS
                  ,IP_65504_P_890_RESERVD_S_LEN
                 );
            localIp65504P890ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P890ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P890ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P890ReservdS() {	 
			return (getShort(beginIp65504P890ReservdS));
   	}
         int localIp65504P890ReservdLCounter = -1;
         public boolean isIp65504P890ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P890ReservdLCounter != sharedCounter;
            localIp65504P890ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_890_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P890ReservdL
	 */
	protected void serializeIp65504P890ReservdL(short ip65504P890ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P890ReservdL,IP_65504_P_890_RESERVD_L_LEN)
                  ,beginIp65504P890ReservdL
                  ,IP_65504_P_890_RESERVD_L_LEN
                 );
            localIp65504P890ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P890ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P890ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P890ReservdL() {	 
			return (getShort(beginIp65504P890ReservdL));
   	}
         int localIp65504P891ReservdSCounter = -1;
         public boolean isIp65504P891ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P891ReservdSCounter != sharedCounter;
            localIp65504P891ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_891_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P891ReservdS
	 */
	protected void serializeIp65504P891ReservdS(short ip65504P891ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P891ReservdS,IP_65504_P_891_RESERVD_S_LEN)
                  ,beginIp65504P891ReservdS
                  ,IP_65504_P_891_RESERVD_S_LEN
                 );
            localIp65504P891ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P891ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P891ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P891ReservdS() {	 
			return (getShort(beginIp65504P891ReservdS));
   	}
         int localIp65504P891ReservdLCounter = -1;
         public boolean isIp65504P891ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P891ReservdLCounter != sharedCounter;
            localIp65504P891ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_891_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P891ReservdL
	 */
	protected void serializeIp65504P891ReservdL(short ip65504P891ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P891ReservdL,IP_65504_P_891_RESERVD_L_LEN)
                  ,beginIp65504P891ReservdL
                  ,IP_65504_P_891_RESERVD_L_LEN
                 );
            localIp65504P891ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P891ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P891ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P891ReservdL() {	 
			return (getShort(beginIp65504P891ReservdL));
   	}
         int localIp65504P892ReservdSCounter = -1;
         public boolean isIp65504P892ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P892ReservdSCounter != sharedCounter;
            localIp65504P892ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_892_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P892ReservdS
	 */
	protected void serializeIp65504P892ReservdS(short ip65504P892ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P892ReservdS,IP_65504_P_892_RESERVD_S_LEN)
                  ,beginIp65504P892ReservdS
                  ,IP_65504_P_892_RESERVD_S_LEN
                 );
            localIp65504P892ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P892ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P892ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P892ReservdS() {	 
			return (getShort(beginIp65504P892ReservdS));
   	}
         int localIp65504P892ReservdLCounter = -1;
         public boolean isIp65504P892ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P892ReservdLCounter != sharedCounter;
            localIp65504P892ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_892_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P892ReservdL
	 */
	protected void serializeIp65504P892ReservdL(short ip65504P892ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P892ReservdL,IP_65504_P_892_RESERVD_L_LEN)
                  ,beginIp65504P892ReservdL
                  ,IP_65504_P_892_RESERVD_L_LEN
                 );
            localIp65504P892ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P892ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P892ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P892ReservdL() {	 
			return (getShort(beginIp65504P892ReservdL));
   	}
         int localIp65504P893ReservdSCounter = -1;
         public boolean isIp65504P893ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P893ReservdSCounter != sharedCounter;
            localIp65504P893ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_893_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P893ReservdS
	 */
	protected void serializeIp65504P893ReservdS(short ip65504P893ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P893ReservdS,IP_65504_P_893_RESERVD_S_LEN)
                  ,beginIp65504P893ReservdS
                  ,IP_65504_P_893_RESERVD_S_LEN
                 );
            localIp65504P893ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P893ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P893ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P893ReservdS() {	 
			return (getShort(beginIp65504P893ReservdS));
   	}
         int localIp65504P893ReservdLCounter = -1;
         public boolean isIp65504P893ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P893ReservdLCounter != sharedCounter;
            localIp65504P893ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_893_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P893ReservdL
	 */
	protected void serializeIp65504P893ReservdL(short ip65504P893ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P893ReservdL,IP_65504_P_893_RESERVD_L_LEN)
                  ,beginIp65504P893ReservdL
                  ,IP_65504_P_893_RESERVD_L_LEN
                 );
            localIp65504P893ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P893ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P893ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P893ReservdL() {	 
			return (getShort(beginIp65504P893ReservdL));
   	}
         int localIp65504P894ReservdSCounter = -1;
         public boolean isIp65504P894ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P894ReservdSCounter != sharedCounter;
            localIp65504P894ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_894_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P894ReservdS
	 */
	protected void serializeIp65504P894ReservdS(short ip65504P894ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P894ReservdS,IP_65504_P_894_RESERVD_S_LEN)
                  ,beginIp65504P894ReservdS
                  ,IP_65504_P_894_RESERVD_S_LEN
                 );
            localIp65504P894ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P894ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P894ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P894ReservdS() {	 
			return (getShort(beginIp65504P894ReservdS));
   	}
         int localIp65504P894ReservdLCounter = -1;
         public boolean isIp65504P894ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P894ReservdLCounter != sharedCounter;
            localIp65504P894ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_894_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P894ReservdL
	 */
	protected void serializeIp65504P894ReservdL(short ip65504P894ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P894ReservdL,IP_65504_P_894_RESERVD_L_LEN)
                  ,beginIp65504P894ReservdL
                  ,IP_65504_P_894_RESERVD_L_LEN
                 );
            localIp65504P894ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P894ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P894ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P894ReservdL() {	 
			return (getShort(beginIp65504P894ReservdL));
   	}
         int localIp65504P895ReservdSCounter = -1;
         public boolean isIp65504P895ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P895ReservdSCounter != sharedCounter;
            localIp65504P895ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_895_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P895ReservdS
	 */
	protected void serializeIp65504P895ReservdS(short ip65504P895ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P895ReservdS,IP_65504_P_895_RESERVD_S_LEN)
                  ,beginIp65504P895ReservdS
                  ,IP_65504_P_895_RESERVD_S_LEN
                 );
            localIp65504P895ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P895ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P895ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P895ReservdS() {	 
			return (getShort(beginIp65504P895ReservdS));
   	}
         int localIp65504P895ReservdLCounter = -1;
         public boolean isIp65504P895ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P895ReservdLCounter != sharedCounter;
            localIp65504P895ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_895_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P895ReservdL
	 */
	protected void serializeIp65504P895ReservdL(short ip65504P895ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P895ReservdL,IP_65504_P_895_RESERVD_L_LEN)
                  ,beginIp65504P895ReservdL
                  ,IP_65504_P_895_RESERVD_L_LEN
                 );
            localIp65504P895ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P895ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P895ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P895ReservdL() {	 
			return (getShort(beginIp65504P895ReservdL));
   	}
         int localIp65504P896ReservdSCounter = -1;
         public boolean isIp65504P896ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P896ReservdSCounter != sharedCounter;
            localIp65504P896ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_896_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P896ReservdS
	 */
	protected void serializeIp65504P896ReservdS(short ip65504P896ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P896ReservdS,IP_65504_P_896_RESERVD_S_LEN)
                  ,beginIp65504P896ReservdS
                  ,IP_65504_P_896_RESERVD_S_LEN
                 );
            localIp65504P896ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P896ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P896ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P896ReservdS() {	 
			return (getShort(beginIp65504P896ReservdS));
   	}
         int localIp65504P896ReservdLCounter = -1;
         public boolean isIp65504P896ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P896ReservdLCounter != sharedCounter;
            localIp65504P896ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_896_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P896ReservdL
	 */
	protected void serializeIp65504P896ReservdL(short ip65504P896ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P896ReservdL,IP_65504_P_896_RESERVD_L_LEN)
                  ,beginIp65504P896ReservdL
                  ,IP_65504_P_896_RESERVD_L_LEN
                 );
            localIp65504P896ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P896ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P896ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P896ReservdL() {	 
			return (getShort(beginIp65504P896ReservdL));
   	}
         int localIp65504P897ReservdSCounter = -1;
         public boolean isIp65504P897ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P897ReservdSCounter != sharedCounter;
            localIp65504P897ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_897_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P897ReservdS
	 */
	protected void serializeIp65504P897ReservdS(short ip65504P897ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P897ReservdS,IP_65504_P_897_RESERVD_S_LEN)
                  ,beginIp65504P897ReservdS
                  ,IP_65504_P_897_RESERVD_S_LEN
                 );
            localIp65504P897ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P897ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P897ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P897ReservdS() {	 
			return (getShort(beginIp65504P897ReservdS));
   	}
         int localIp65504P897ReservdLCounter = -1;
         public boolean isIp65504P897ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P897ReservdLCounter != sharedCounter;
            localIp65504P897ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_897_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P897ReservdL
	 */
	protected void serializeIp65504P897ReservdL(short ip65504P897ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P897ReservdL,IP_65504_P_897_RESERVD_L_LEN)
                  ,beginIp65504P897ReservdL
                  ,IP_65504_P_897_RESERVD_L_LEN
                 );
            localIp65504P897ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P897ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P897ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P897ReservdL() {	 
			return (getShort(beginIp65504P897ReservdL));
   	}
         int localIp65504P898ReservdSCounter = -1;
         public boolean isIp65504P898ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P898ReservdSCounter != sharedCounter;
            localIp65504P898ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_898_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P898ReservdS
	 */
	protected void serializeIp65504P898ReservdS(short ip65504P898ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P898ReservdS,IP_65504_P_898_RESERVD_S_LEN)
                  ,beginIp65504P898ReservdS
                  ,IP_65504_P_898_RESERVD_S_LEN
                 );
            localIp65504P898ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P898ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P898ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P898ReservdS() {	 
			return (getShort(beginIp65504P898ReservdS));
   	}
         int localIp65504P898ReservdLCounter = -1;
         public boolean isIp65504P898ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P898ReservdLCounter != sharedCounter;
            localIp65504P898ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_898_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P898ReservdL
	 */
	protected void serializeIp65504P898ReservdL(short ip65504P898ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P898ReservdL,IP_65504_P_898_RESERVD_L_LEN)
                  ,beginIp65504P898ReservdL
                  ,IP_65504_P_898_RESERVD_L_LEN
                 );
            localIp65504P898ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P898ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P898ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P898ReservdL() {	 
			return (getShort(beginIp65504P898ReservdL));
   	}
         int localIp65504P899ReservdSCounter = -1;
         public boolean isIp65504P899ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P899ReservdSCounter != sharedCounter;
            localIp65504P899ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_899_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P899ReservdS
	 */
	protected void serializeIp65504P899ReservdS(short ip65504P899ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P899ReservdS,IP_65504_P_899_RESERVD_S_LEN)
                  ,beginIp65504P899ReservdS
                  ,IP_65504_P_899_RESERVD_S_LEN
                 );
            localIp65504P899ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P899ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P899ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P899ReservdS() {	 
			return (getShort(beginIp65504P899ReservdS));
   	}
         int localIp65504P899ReservdLCounter = -1;
         public boolean isIp65504P899ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P899ReservdLCounter != sharedCounter;
            localIp65504P899ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_899_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P899ReservdL
	 */
	protected void serializeIp65504P899ReservdL(short ip65504P899ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P899ReservdL,IP_65504_P_899_RESERVD_L_LEN)
                  ,beginIp65504P899ReservdL
                  ,IP_65504_P_899_RESERVD_L_LEN
                 );
            localIp65504P899ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P899ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P899ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P899ReservdL() {	 
			return (getShort(beginIp65504P899ReservdL));
   	}




}
  
