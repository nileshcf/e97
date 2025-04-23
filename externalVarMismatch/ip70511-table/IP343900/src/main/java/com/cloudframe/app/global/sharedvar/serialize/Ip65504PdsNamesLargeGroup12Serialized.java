package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup12Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup12Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup12Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_12_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P342ReservdS;
            protected  int beginIp65504P342ReservdL;
            protected  int beginIp65504P343ReservdS;
            protected  int beginIp65504P343ReservdL;
            protected  int beginIp65504P344ReservdS;
            protected  int beginIp65504P344ReservdL;
            protected  int beginIp65504P345ReservdS;
            protected  int beginIp65504P345ReservdL;
            protected  int beginIp65504P346ReservdS;
            protected  int beginIp65504P346ReservdL;
            protected  int beginIp65504P347ReservdS;
            protected  int beginIp65504P347ReservdL;
            protected  int beginIp65504P348ReservdS;
            protected  int beginIp65504P348ReservdL;
            protected  int beginIp65504P349ReservdS;
            protected  int beginIp65504P349ReservdL;
            protected  int beginIp65504P350ReservdS;
            protected  int beginIp65504P350ReservdL;
            protected  int beginIp65504P351ReservdS;
            protected  int beginIp65504P351ReservdL;
            protected  int beginIp65504P352ReservdS;
            protected  int beginIp65504P352ReservdL;
            protected  int beginIp65504P353ReservdS;
            protected  int beginIp65504P353ReservdL;
            protected  int beginIp65504P354ReservdS;
            protected  int beginIp65504P354ReservdL;
            protected  int beginIp65504P355ReservdS;
            protected  int beginIp65504P355ReservdL;
            protected  int beginIp65504P356ReservdS;
            protected  int beginIp65504P356ReservdL;
            protected  int beginIp65504P357ReservdS;
            protected  int beginIp65504P357ReservdL;
            protected  int beginIp65504P358ReservdS;
            protected  int beginIp65504P358ReservdL;
            protected  int beginIp65504P359ReActvS;
            protected  int beginIp65504P359ReActvL;
            protected  int beginIp65504P360ReservdS;
            protected  int beginIp65504P360ReservdL;
            protected  int beginIp65504P361ReservdS;
            protected  int beginIp65504P361ReservdL;
            protected  int beginIp65504P362ReservdS;
            protected  int beginIp65504P362ReservdL;
            protected  int beginIp65504P363ReservdS;
            protected  int beginIp65504P363ReservdL;
            protected  int beginIp65504P364ReservdS;
            protected  int beginIp65504P364ReservdL;
            protected  int beginIp65504P365ReservdS;
            protected  int beginIp65504P365ReservdL;
            protected  int beginIp65504P366ReservdS;
            protected  int beginIp65504P366ReservdL;
            protected  int beginIp65504P367ReservdS;
            protected  int beginIp65504P367ReservdL;
            protected  int beginIp65504P368ReservdS;
            protected  int beginIp65504P368ReservdL;
            protected  int beginIp65504P369ReservdS;
            protected  int beginIp65504P369ReservdL;
            protected  int beginIp65504P370RecRngS;
            protected  int beginIp65504P370RecRngL;
            protected  int beginIp65504P371RecRegS;
            protected  int beginIp65504P371RecRegL;
            protected  int beginIp65504P372RecTrxS;
            protected  int beginIp65504P372RecTrxL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup12Serialized
	**/
    public Ip65504PdsNamesLargeGroup12Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup12Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup12Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup12Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2724); // serialize this field at offset 2724 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup12Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2724 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup12Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_12_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P342ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P342ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P343ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P343ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P344ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P344ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P345ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P345ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P346ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P346ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P347ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P347ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P348ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P348ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P349ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P349ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P350ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P350ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P351ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P351ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P352ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P352ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P353ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P353ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P354ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P354ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P355ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P355ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P356ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P356ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P357ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P357ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P358ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P358ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P359ReActvS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P359ReActvL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P360ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P360ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P361ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P361ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P362ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P362ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P363ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P363ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P364ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P364ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P365ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P365ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P366ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P366ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P367ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P367ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P368ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P368ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P369ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P369ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P370RecRngS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P370RecRngL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P371RecRegS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P371RecRegL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P372RecTrxS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P372RecTrxL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P342ReservdSCounter = -1;
         public boolean isIp65504P342ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P342ReservdSCounter != sharedCounter;
            localIp65504P342ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_342_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P342ReservdS
	 */
	protected void serializeIp65504P342ReservdS(short ip65504P342ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P342ReservdS,IP_65504_P_342_RESERVD_S_LEN)
                  ,beginIp65504P342ReservdS
                  ,IP_65504_P_342_RESERVD_S_LEN
                 );
            localIp65504P342ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P342ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P342ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P342ReservdS() {	 
			return (getShort(beginIp65504P342ReservdS));
   	}
         int localIp65504P342ReservdLCounter = -1;
         public boolean isIp65504P342ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P342ReservdLCounter != sharedCounter;
            localIp65504P342ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_342_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P342ReservdL
	 */
	protected void serializeIp65504P342ReservdL(short ip65504P342ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P342ReservdL,IP_65504_P_342_RESERVD_L_LEN)
                  ,beginIp65504P342ReservdL
                  ,IP_65504_P_342_RESERVD_L_LEN
                 );
            localIp65504P342ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P342ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P342ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P342ReservdL() {	 
			return (getShort(beginIp65504P342ReservdL));
   	}
         int localIp65504P343ReservdSCounter = -1;
         public boolean isIp65504P343ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P343ReservdSCounter != sharedCounter;
            localIp65504P343ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_343_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P343ReservdS
	 */
	protected void serializeIp65504P343ReservdS(short ip65504P343ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P343ReservdS,IP_65504_P_343_RESERVD_S_LEN)
                  ,beginIp65504P343ReservdS
                  ,IP_65504_P_343_RESERVD_S_LEN
                 );
            localIp65504P343ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P343ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P343ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P343ReservdS() {	 
			return (getShort(beginIp65504P343ReservdS));
   	}
         int localIp65504P343ReservdLCounter = -1;
         public boolean isIp65504P343ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P343ReservdLCounter != sharedCounter;
            localIp65504P343ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_343_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P343ReservdL
	 */
	protected void serializeIp65504P343ReservdL(short ip65504P343ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P343ReservdL,IP_65504_P_343_RESERVD_L_LEN)
                  ,beginIp65504P343ReservdL
                  ,IP_65504_P_343_RESERVD_L_LEN
                 );
            localIp65504P343ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P343ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P343ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P343ReservdL() {	 
			return (getShort(beginIp65504P343ReservdL));
   	}
         int localIp65504P344ReservdSCounter = -1;
         public boolean isIp65504P344ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P344ReservdSCounter != sharedCounter;
            localIp65504P344ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_344_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P344ReservdS
	 */
	protected void serializeIp65504P344ReservdS(short ip65504P344ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P344ReservdS,IP_65504_P_344_RESERVD_S_LEN)
                  ,beginIp65504P344ReservdS
                  ,IP_65504_P_344_RESERVD_S_LEN
                 );
            localIp65504P344ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P344ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P344ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P344ReservdS() {	 
			return (getShort(beginIp65504P344ReservdS));
   	}
         int localIp65504P344ReservdLCounter = -1;
         public boolean isIp65504P344ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P344ReservdLCounter != sharedCounter;
            localIp65504P344ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_344_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P344ReservdL
	 */
	protected void serializeIp65504P344ReservdL(short ip65504P344ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P344ReservdL,IP_65504_P_344_RESERVD_L_LEN)
                  ,beginIp65504P344ReservdL
                  ,IP_65504_P_344_RESERVD_L_LEN
                 );
            localIp65504P344ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P344ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P344ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P344ReservdL() {	 
			return (getShort(beginIp65504P344ReservdL));
   	}
         int localIp65504P345ReservdSCounter = -1;
         public boolean isIp65504P345ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P345ReservdSCounter != sharedCounter;
            localIp65504P345ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_345_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P345ReservdS
	 */
	protected void serializeIp65504P345ReservdS(short ip65504P345ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P345ReservdS,IP_65504_P_345_RESERVD_S_LEN)
                  ,beginIp65504P345ReservdS
                  ,IP_65504_P_345_RESERVD_S_LEN
                 );
            localIp65504P345ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P345ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P345ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P345ReservdS() {	 
			return (getShort(beginIp65504P345ReservdS));
   	}
         int localIp65504P345ReservdLCounter = -1;
         public boolean isIp65504P345ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P345ReservdLCounter != sharedCounter;
            localIp65504P345ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_345_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P345ReservdL
	 */
	protected void serializeIp65504P345ReservdL(short ip65504P345ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P345ReservdL,IP_65504_P_345_RESERVD_L_LEN)
                  ,beginIp65504P345ReservdL
                  ,IP_65504_P_345_RESERVD_L_LEN
                 );
            localIp65504P345ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P345ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P345ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P345ReservdL() {	 
			return (getShort(beginIp65504P345ReservdL));
   	}
         int localIp65504P346ReservdSCounter = -1;
         public boolean isIp65504P346ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P346ReservdSCounter != sharedCounter;
            localIp65504P346ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_346_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P346ReservdS
	 */
	protected void serializeIp65504P346ReservdS(short ip65504P346ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P346ReservdS,IP_65504_P_346_RESERVD_S_LEN)
                  ,beginIp65504P346ReservdS
                  ,IP_65504_P_346_RESERVD_S_LEN
                 );
            localIp65504P346ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P346ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P346ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P346ReservdS() {	 
			return (getShort(beginIp65504P346ReservdS));
   	}
         int localIp65504P346ReservdLCounter = -1;
         public boolean isIp65504P346ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P346ReservdLCounter != sharedCounter;
            localIp65504P346ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_346_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P346ReservdL
	 */
	protected void serializeIp65504P346ReservdL(short ip65504P346ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P346ReservdL,IP_65504_P_346_RESERVD_L_LEN)
                  ,beginIp65504P346ReservdL
                  ,IP_65504_P_346_RESERVD_L_LEN
                 );
            localIp65504P346ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P346ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P346ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P346ReservdL() {	 
			return (getShort(beginIp65504P346ReservdL));
   	}
         int localIp65504P347ReservdSCounter = -1;
         public boolean isIp65504P347ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P347ReservdSCounter != sharedCounter;
            localIp65504P347ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_347_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P347ReservdS
	 */
	protected void serializeIp65504P347ReservdS(short ip65504P347ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P347ReservdS,IP_65504_P_347_RESERVD_S_LEN)
                  ,beginIp65504P347ReservdS
                  ,IP_65504_P_347_RESERVD_S_LEN
                 );
            localIp65504P347ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P347ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P347ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P347ReservdS() {	 
			return (getShort(beginIp65504P347ReservdS));
   	}
         int localIp65504P347ReservdLCounter = -1;
         public boolean isIp65504P347ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P347ReservdLCounter != sharedCounter;
            localIp65504P347ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_347_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P347ReservdL
	 */
	protected void serializeIp65504P347ReservdL(short ip65504P347ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P347ReservdL,IP_65504_P_347_RESERVD_L_LEN)
                  ,beginIp65504P347ReservdL
                  ,IP_65504_P_347_RESERVD_L_LEN
                 );
            localIp65504P347ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P347ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P347ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P347ReservdL() {	 
			return (getShort(beginIp65504P347ReservdL));
   	}
         int localIp65504P348ReservdSCounter = -1;
         public boolean isIp65504P348ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P348ReservdSCounter != sharedCounter;
            localIp65504P348ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_348_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P348ReservdS
	 */
	protected void serializeIp65504P348ReservdS(short ip65504P348ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P348ReservdS,IP_65504_P_348_RESERVD_S_LEN)
                  ,beginIp65504P348ReservdS
                  ,IP_65504_P_348_RESERVD_S_LEN
                 );
            localIp65504P348ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P348ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P348ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P348ReservdS() {	 
			return (getShort(beginIp65504P348ReservdS));
   	}
         int localIp65504P348ReservdLCounter = -1;
         public boolean isIp65504P348ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P348ReservdLCounter != sharedCounter;
            localIp65504P348ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_348_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P348ReservdL
	 */
	protected void serializeIp65504P348ReservdL(short ip65504P348ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P348ReservdL,IP_65504_P_348_RESERVD_L_LEN)
                  ,beginIp65504P348ReservdL
                  ,IP_65504_P_348_RESERVD_L_LEN
                 );
            localIp65504P348ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P348ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P348ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P348ReservdL() {	 
			return (getShort(beginIp65504P348ReservdL));
   	}
         int localIp65504P349ReservdSCounter = -1;
         public boolean isIp65504P349ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P349ReservdSCounter != sharedCounter;
            localIp65504P349ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_349_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P349ReservdS
	 */
	protected void serializeIp65504P349ReservdS(short ip65504P349ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P349ReservdS,IP_65504_P_349_RESERVD_S_LEN)
                  ,beginIp65504P349ReservdS
                  ,IP_65504_P_349_RESERVD_S_LEN
                 );
            localIp65504P349ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P349ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P349ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P349ReservdS() {	 
			return (getShort(beginIp65504P349ReservdS));
   	}
         int localIp65504P349ReservdLCounter = -1;
         public boolean isIp65504P349ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P349ReservdLCounter != sharedCounter;
            localIp65504P349ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_349_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P349ReservdL
	 */
	protected void serializeIp65504P349ReservdL(short ip65504P349ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P349ReservdL,IP_65504_P_349_RESERVD_L_LEN)
                  ,beginIp65504P349ReservdL
                  ,IP_65504_P_349_RESERVD_L_LEN
                 );
            localIp65504P349ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P349ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P349ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P349ReservdL() {	 
			return (getShort(beginIp65504P349ReservdL));
   	}
         int localIp65504P350ReservdSCounter = -1;
         public boolean isIp65504P350ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P350ReservdSCounter != sharedCounter;
            localIp65504P350ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_350_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P350ReservdS
	 */
	protected void serializeIp65504P350ReservdS(short ip65504P350ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P350ReservdS,IP_65504_P_350_RESERVD_S_LEN)
                  ,beginIp65504P350ReservdS
                  ,IP_65504_P_350_RESERVD_S_LEN
                 );
            localIp65504P350ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P350ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P350ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P350ReservdS() {	 
			return (getShort(beginIp65504P350ReservdS));
   	}
         int localIp65504P350ReservdLCounter = -1;
         public boolean isIp65504P350ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P350ReservdLCounter != sharedCounter;
            localIp65504P350ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_350_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P350ReservdL
	 */
	protected void serializeIp65504P350ReservdL(short ip65504P350ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P350ReservdL,IP_65504_P_350_RESERVD_L_LEN)
                  ,beginIp65504P350ReservdL
                  ,IP_65504_P_350_RESERVD_L_LEN
                 );
            localIp65504P350ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P350ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P350ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P350ReservdL() {	 
			return (getShort(beginIp65504P350ReservdL));
   	}
         int localIp65504P351ReservdSCounter = -1;
         public boolean isIp65504P351ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P351ReservdSCounter != sharedCounter;
            localIp65504P351ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_351_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P351ReservdS
	 */
	protected void serializeIp65504P351ReservdS(short ip65504P351ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P351ReservdS,IP_65504_P_351_RESERVD_S_LEN)
                  ,beginIp65504P351ReservdS
                  ,IP_65504_P_351_RESERVD_S_LEN
                 );
            localIp65504P351ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P351ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P351ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P351ReservdS() {	 
			return (getShort(beginIp65504P351ReservdS));
   	}
         int localIp65504P351ReservdLCounter = -1;
         public boolean isIp65504P351ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P351ReservdLCounter != sharedCounter;
            localIp65504P351ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_351_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P351ReservdL
	 */
	protected void serializeIp65504P351ReservdL(short ip65504P351ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P351ReservdL,IP_65504_P_351_RESERVD_L_LEN)
                  ,beginIp65504P351ReservdL
                  ,IP_65504_P_351_RESERVD_L_LEN
                 );
            localIp65504P351ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P351ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P351ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P351ReservdL() {	 
			return (getShort(beginIp65504P351ReservdL));
   	}
         int localIp65504P352ReservdSCounter = -1;
         public boolean isIp65504P352ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P352ReservdSCounter != sharedCounter;
            localIp65504P352ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_352_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P352ReservdS
	 */
	protected void serializeIp65504P352ReservdS(short ip65504P352ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P352ReservdS,IP_65504_P_352_RESERVD_S_LEN)
                  ,beginIp65504P352ReservdS
                  ,IP_65504_P_352_RESERVD_S_LEN
                 );
            localIp65504P352ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P352ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P352ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P352ReservdS() {	 
			return (getShort(beginIp65504P352ReservdS));
   	}
         int localIp65504P352ReservdLCounter = -1;
         public boolean isIp65504P352ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P352ReservdLCounter != sharedCounter;
            localIp65504P352ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_352_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P352ReservdL
	 */
	protected void serializeIp65504P352ReservdL(short ip65504P352ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P352ReservdL,IP_65504_P_352_RESERVD_L_LEN)
                  ,beginIp65504P352ReservdL
                  ,IP_65504_P_352_RESERVD_L_LEN
                 );
            localIp65504P352ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P352ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P352ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P352ReservdL() {	 
			return (getShort(beginIp65504P352ReservdL));
   	}
         int localIp65504P353ReservdSCounter = -1;
         public boolean isIp65504P353ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P353ReservdSCounter != sharedCounter;
            localIp65504P353ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_353_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P353ReservdS
	 */
	protected void serializeIp65504P353ReservdS(short ip65504P353ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P353ReservdS,IP_65504_P_353_RESERVD_S_LEN)
                  ,beginIp65504P353ReservdS
                  ,IP_65504_P_353_RESERVD_S_LEN
                 );
            localIp65504P353ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P353ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P353ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P353ReservdS() {	 
			return (getShort(beginIp65504P353ReservdS));
   	}
         int localIp65504P353ReservdLCounter = -1;
         public boolean isIp65504P353ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P353ReservdLCounter != sharedCounter;
            localIp65504P353ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_353_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P353ReservdL
	 */
	protected void serializeIp65504P353ReservdL(short ip65504P353ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P353ReservdL,IP_65504_P_353_RESERVD_L_LEN)
                  ,beginIp65504P353ReservdL
                  ,IP_65504_P_353_RESERVD_L_LEN
                 );
            localIp65504P353ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P353ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P353ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P353ReservdL() {	 
			return (getShort(beginIp65504P353ReservdL));
   	}
         int localIp65504P354ReservdSCounter = -1;
         public boolean isIp65504P354ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P354ReservdSCounter != sharedCounter;
            localIp65504P354ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_354_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P354ReservdS
	 */
	protected void serializeIp65504P354ReservdS(short ip65504P354ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P354ReservdS,IP_65504_P_354_RESERVD_S_LEN)
                  ,beginIp65504P354ReservdS
                  ,IP_65504_P_354_RESERVD_S_LEN
                 );
            localIp65504P354ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P354ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P354ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P354ReservdS() {	 
			return (getShort(beginIp65504P354ReservdS));
   	}
         int localIp65504P354ReservdLCounter = -1;
         public boolean isIp65504P354ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P354ReservdLCounter != sharedCounter;
            localIp65504P354ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_354_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P354ReservdL
	 */
	protected void serializeIp65504P354ReservdL(short ip65504P354ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P354ReservdL,IP_65504_P_354_RESERVD_L_LEN)
                  ,beginIp65504P354ReservdL
                  ,IP_65504_P_354_RESERVD_L_LEN
                 );
            localIp65504P354ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P354ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P354ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P354ReservdL() {	 
			return (getShort(beginIp65504P354ReservdL));
   	}
         int localIp65504P355ReservdSCounter = -1;
         public boolean isIp65504P355ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P355ReservdSCounter != sharedCounter;
            localIp65504P355ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_355_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P355ReservdS
	 */
	protected void serializeIp65504P355ReservdS(short ip65504P355ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P355ReservdS,IP_65504_P_355_RESERVD_S_LEN)
                  ,beginIp65504P355ReservdS
                  ,IP_65504_P_355_RESERVD_S_LEN
                 );
            localIp65504P355ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P355ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P355ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P355ReservdS() {	 
			return (getShort(beginIp65504P355ReservdS));
   	}
         int localIp65504P355ReservdLCounter = -1;
         public boolean isIp65504P355ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P355ReservdLCounter != sharedCounter;
            localIp65504P355ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_355_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P355ReservdL
	 */
	protected void serializeIp65504P355ReservdL(short ip65504P355ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P355ReservdL,IP_65504_P_355_RESERVD_L_LEN)
                  ,beginIp65504P355ReservdL
                  ,IP_65504_P_355_RESERVD_L_LEN
                 );
            localIp65504P355ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P355ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P355ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P355ReservdL() {	 
			return (getShort(beginIp65504P355ReservdL));
   	}
         int localIp65504P356ReservdSCounter = -1;
         public boolean isIp65504P356ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P356ReservdSCounter != sharedCounter;
            localIp65504P356ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_356_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P356ReservdS
	 */
	protected void serializeIp65504P356ReservdS(short ip65504P356ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P356ReservdS,IP_65504_P_356_RESERVD_S_LEN)
                  ,beginIp65504P356ReservdS
                  ,IP_65504_P_356_RESERVD_S_LEN
                 );
            localIp65504P356ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P356ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P356ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P356ReservdS() {	 
			return (getShort(beginIp65504P356ReservdS));
   	}
         int localIp65504P356ReservdLCounter = -1;
         public boolean isIp65504P356ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P356ReservdLCounter != sharedCounter;
            localIp65504P356ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_356_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P356ReservdL
	 */
	protected void serializeIp65504P356ReservdL(short ip65504P356ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P356ReservdL,IP_65504_P_356_RESERVD_L_LEN)
                  ,beginIp65504P356ReservdL
                  ,IP_65504_P_356_RESERVD_L_LEN
                 );
            localIp65504P356ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P356ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P356ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P356ReservdL() {	 
			return (getShort(beginIp65504P356ReservdL));
   	}
         int localIp65504P357ReservdSCounter = -1;
         public boolean isIp65504P357ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P357ReservdSCounter != sharedCounter;
            localIp65504P357ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_357_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P357ReservdS
	 */
	protected void serializeIp65504P357ReservdS(short ip65504P357ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P357ReservdS,IP_65504_P_357_RESERVD_S_LEN)
                  ,beginIp65504P357ReservdS
                  ,IP_65504_P_357_RESERVD_S_LEN
                 );
            localIp65504P357ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P357ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P357ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P357ReservdS() {	 
			return (getShort(beginIp65504P357ReservdS));
   	}
         int localIp65504P357ReservdLCounter = -1;
         public boolean isIp65504P357ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P357ReservdLCounter != sharedCounter;
            localIp65504P357ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_357_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P357ReservdL
	 */
	protected void serializeIp65504P357ReservdL(short ip65504P357ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P357ReservdL,IP_65504_P_357_RESERVD_L_LEN)
                  ,beginIp65504P357ReservdL
                  ,IP_65504_P_357_RESERVD_L_LEN
                 );
            localIp65504P357ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P357ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P357ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P357ReservdL() {	 
			return (getShort(beginIp65504P357ReservdL));
   	}
         int localIp65504P358ReservdSCounter = -1;
         public boolean isIp65504P358ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P358ReservdSCounter != sharedCounter;
            localIp65504P358ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_358_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P358ReservdS
	 */
	protected void serializeIp65504P358ReservdS(short ip65504P358ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P358ReservdS,IP_65504_P_358_RESERVD_S_LEN)
                  ,beginIp65504P358ReservdS
                  ,IP_65504_P_358_RESERVD_S_LEN
                 );
            localIp65504P358ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P358ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P358ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P358ReservdS() {	 
			return (getShort(beginIp65504P358ReservdS));
   	}
         int localIp65504P358ReservdLCounter = -1;
         public boolean isIp65504P358ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P358ReservdLCounter != sharedCounter;
            localIp65504P358ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_358_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P358ReservdL
	 */
	protected void serializeIp65504P358ReservdL(short ip65504P358ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P358ReservdL,IP_65504_P_358_RESERVD_L_LEN)
                  ,beginIp65504P358ReservdL
                  ,IP_65504_P_358_RESERVD_L_LEN
                 );
            localIp65504P358ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P358ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P358ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P358ReservdL() {	 
			return (getShort(beginIp65504P358ReservdL));
   	}
         int localIp65504P359ReActvSCounter = -1;
         public boolean isIp65504P359ReActvSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P359ReActvSCounter != sharedCounter;
            localIp65504P359ReActvSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_359_RE_ACTV_S_LEN = 2;
  	/**
	 * serializeIp65504P359ReActvS
	 */
	protected void serializeIp65504P359ReActvS(short ip65504P359ReActvS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P359ReActvS,IP_65504_P_359_RE_ACTV_S_LEN)
                  ,beginIp65504P359ReActvS
                  ,IP_65504_P_359_RE_ACTV_S_LEN
                 );
            localIp65504P359ReActvSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P359ReActvSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P359ReActvS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P359ReActvS() {	 
			return (getShort(beginIp65504P359ReActvS));
   	}
         int localIp65504P359ReActvLCounter = -1;
         public boolean isIp65504P359ReActvLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P359ReActvLCounter != sharedCounter;
            localIp65504P359ReActvLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_359_RE_ACTV_L_LEN = 2;
  	/**
	 * serializeIp65504P359ReActvL
	 */
	protected void serializeIp65504P359ReActvL(short ip65504P359ReActvL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P359ReActvL,IP_65504_P_359_RE_ACTV_L_LEN)
                  ,beginIp65504P359ReActvL
                  ,IP_65504_P_359_RE_ACTV_L_LEN
                 );
            localIp65504P359ReActvLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P359ReActvLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P359ReActvL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P359ReActvL() {	 
			return (getShort(beginIp65504P359ReActvL));
   	}
         int localIp65504P360ReservdSCounter = -1;
         public boolean isIp65504P360ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P360ReservdSCounter != sharedCounter;
            localIp65504P360ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_360_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P360ReservdS
	 */
	protected void serializeIp65504P360ReservdS(short ip65504P360ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P360ReservdS,IP_65504_P_360_RESERVD_S_LEN)
                  ,beginIp65504P360ReservdS
                  ,IP_65504_P_360_RESERVD_S_LEN
                 );
            localIp65504P360ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P360ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P360ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P360ReservdS() {	 
			return (getShort(beginIp65504P360ReservdS));
   	}
         int localIp65504P360ReservdLCounter = -1;
         public boolean isIp65504P360ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P360ReservdLCounter != sharedCounter;
            localIp65504P360ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_360_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P360ReservdL
	 */
	protected void serializeIp65504P360ReservdL(short ip65504P360ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P360ReservdL,IP_65504_P_360_RESERVD_L_LEN)
                  ,beginIp65504P360ReservdL
                  ,IP_65504_P_360_RESERVD_L_LEN
                 );
            localIp65504P360ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P360ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P360ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P360ReservdL() {	 
			return (getShort(beginIp65504P360ReservdL));
   	}
         int localIp65504P361ReservdSCounter = -1;
         public boolean isIp65504P361ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P361ReservdSCounter != sharedCounter;
            localIp65504P361ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_361_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P361ReservdS
	 */
	protected void serializeIp65504P361ReservdS(short ip65504P361ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P361ReservdS,IP_65504_P_361_RESERVD_S_LEN)
                  ,beginIp65504P361ReservdS
                  ,IP_65504_P_361_RESERVD_S_LEN
                 );
            localIp65504P361ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P361ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P361ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P361ReservdS() {	 
			return (getShort(beginIp65504P361ReservdS));
   	}
         int localIp65504P361ReservdLCounter = -1;
         public boolean isIp65504P361ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P361ReservdLCounter != sharedCounter;
            localIp65504P361ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_361_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P361ReservdL
	 */
	protected void serializeIp65504P361ReservdL(short ip65504P361ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P361ReservdL,IP_65504_P_361_RESERVD_L_LEN)
                  ,beginIp65504P361ReservdL
                  ,IP_65504_P_361_RESERVD_L_LEN
                 );
            localIp65504P361ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P361ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P361ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P361ReservdL() {	 
			return (getShort(beginIp65504P361ReservdL));
   	}
         int localIp65504P362ReservdSCounter = -1;
         public boolean isIp65504P362ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P362ReservdSCounter != sharedCounter;
            localIp65504P362ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_362_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P362ReservdS
	 */
	protected void serializeIp65504P362ReservdS(short ip65504P362ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P362ReservdS,IP_65504_P_362_RESERVD_S_LEN)
                  ,beginIp65504P362ReservdS
                  ,IP_65504_P_362_RESERVD_S_LEN
                 );
            localIp65504P362ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P362ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P362ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P362ReservdS() {	 
			return (getShort(beginIp65504P362ReservdS));
   	}
         int localIp65504P362ReservdLCounter = -1;
         public boolean isIp65504P362ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P362ReservdLCounter != sharedCounter;
            localIp65504P362ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_362_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P362ReservdL
	 */
	protected void serializeIp65504P362ReservdL(short ip65504P362ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P362ReservdL,IP_65504_P_362_RESERVD_L_LEN)
                  ,beginIp65504P362ReservdL
                  ,IP_65504_P_362_RESERVD_L_LEN
                 );
            localIp65504P362ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P362ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P362ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P362ReservdL() {	 
			return (getShort(beginIp65504P362ReservdL));
   	}
         int localIp65504P363ReservdSCounter = -1;
         public boolean isIp65504P363ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P363ReservdSCounter != sharedCounter;
            localIp65504P363ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_363_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P363ReservdS
	 */
	protected void serializeIp65504P363ReservdS(short ip65504P363ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P363ReservdS,IP_65504_P_363_RESERVD_S_LEN)
                  ,beginIp65504P363ReservdS
                  ,IP_65504_P_363_RESERVD_S_LEN
                 );
            localIp65504P363ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P363ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P363ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P363ReservdS() {	 
			return (getShort(beginIp65504P363ReservdS));
   	}
         int localIp65504P363ReservdLCounter = -1;
         public boolean isIp65504P363ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P363ReservdLCounter != sharedCounter;
            localIp65504P363ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_363_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P363ReservdL
	 */
	protected void serializeIp65504P363ReservdL(short ip65504P363ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P363ReservdL,IP_65504_P_363_RESERVD_L_LEN)
                  ,beginIp65504P363ReservdL
                  ,IP_65504_P_363_RESERVD_L_LEN
                 );
            localIp65504P363ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P363ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P363ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P363ReservdL() {	 
			return (getShort(beginIp65504P363ReservdL));
   	}
         int localIp65504P364ReservdSCounter = -1;
         public boolean isIp65504P364ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P364ReservdSCounter != sharedCounter;
            localIp65504P364ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_364_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P364ReservdS
	 */
	protected void serializeIp65504P364ReservdS(short ip65504P364ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P364ReservdS,IP_65504_P_364_RESERVD_S_LEN)
                  ,beginIp65504P364ReservdS
                  ,IP_65504_P_364_RESERVD_S_LEN
                 );
            localIp65504P364ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P364ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P364ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P364ReservdS() {	 
			return (getShort(beginIp65504P364ReservdS));
   	}
         int localIp65504P364ReservdLCounter = -1;
         public boolean isIp65504P364ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P364ReservdLCounter != sharedCounter;
            localIp65504P364ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_364_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P364ReservdL
	 */
	protected void serializeIp65504P364ReservdL(short ip65504P364ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P364ReservdL,IP_65504_P_364_RESERVD_L_LEN)
                  ,beginIp65504P364ReservdL
                  ,IP_65504_P_364_RESERVD_L_LEN
                 );
            localIp65504P364ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P364ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P364ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P364ReservdL() {	 
			return (getShort(beginIp65504P364ReservdL));
   	}
         int localIp65504P365ReservdSCounter = -1;
         public boolean isIp65504P365ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P365ReservdSCounter != sharedCounter;
            localIp65504P365ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_365_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P365ReservdS
	 */
	protected void serializeIp65504P365ReservdS(short ip65504P365ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P365ReservdS,IP_65504_P_365_RESERVD_S_LEN)
                  ,beginIp65504P365ReservdS
                  ,IP_65504_P_365_RESERVD_S_LEN
                 );
            localIp65504P365ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P365ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P365ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P365ReservdS() {	 
			return (getShort(beginIp65504P365ReservdS));
   	}
         int localIp65504P365ReservdLCounter = -1;
         public boolean isIp65504P365ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P365ReservdLCounter != sharedCounter;
            localIp65504P365ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_365_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P365ReservdL
	 */
	protected void serializeIp65504P365ReservdL(short ip65504P365ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P365ReservdL,IP_65504_P_365_RESERVD_L_LEN)
                  ,beginIp65504P365ReservdL
                  ,IP_65504_P_365_RESERVD_L_LEN
                 );
            localIp65504P365ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P365ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P365ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P365ReservdL() {	 
			return (getShort(beginIp65504P365ReservdL));
   	}
         int localIp65504P366ReservdSCounter = -1;
         public boolean isIp65504P366ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P366ReservdSCounter != sharedCounter;
            localIp65504P366ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_366_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P366ReservdS
	 */
	protected void serializeIp65504P366ReservdS(short ip65504P366ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P366ReservdS,IP_65504_P_366_RESERVD_S_LEN)
                  ,beginIp65504P366ReservdS
                  ,IP_65504_P_366_RESERVD_S_LEN
                 );
            localIp65504P366ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P366ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P366ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P366ReservdS() {	 
			return (getShort(beginIp65504P366ReservdS));
   	}
         int localIp65504P366ReservdLCounter = -1;
         public boolean isIp65504P366ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P366ReservdLCounter != sharedCounter;
            localIp65504P366ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_366_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P366ReservdL
	 */
	protected void serializeIp65504P366ReservdL(short ip65504P366ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P366ReservdL,IP_65504_P_366_RESERVD_L_LEN)
                  ,beginIp65504P366ReservdL
                  ,IP_65504_P_366_RESERVD_L_LEN
                 );
            localIp65504P366ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P366ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P366ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P366ReservdL() {	 
			return (getShort(beginIp65504P366ReservdL));
   	}
         int localIp65504P367ReservdSCounter = -1;
         public boolean isIp65504P367ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P367ReservdSCounter != sharedCounter;
            localIp65504P367ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_367_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P367ReservdS
	 */
	protected void serializeIp65504P367ReservdS(short ip65504P367ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P367ReservdS,IP_65504_P_367_RESERVD_S_LEN)
                  ,beginIp65504P367ReservdS
                  ,IP_65504_P_367_RESERVD_S_LEN
                 );
            localIp65504P367ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P367ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P367ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P367ReservdS() {	 
			return (getShort(beginIp65504P367ReservdS));
   	}
         int localIp65504P367ReservdLCounter = -1;
         public boolean isIp65504P367ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P367ReservdLCounter != sharedCounter;
            localIp65504P367ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_367_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P367ReservdL
	 */
	protected void serializeIp65504P367ReservdL(short ip65504P367ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P367ReservdL,IP_65504_P_367_RESERVD_L_LEN)
                  ,beginIp65504P367ReservdL
                  ,IP_65504_P_367_RESERVD_L_LEN
                 );
            localIp65504P367ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P367ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P367ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P367ReservdL() {	 
			return (getShort(beginIp65504P367ReservdL));
   	}
         int localIp65504P368ReservdSCounter = -1;
         public boolean isIp65504P368ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P368ReservdSCounter != sharedCounter;
            localIp65504P368ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_368_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P368ReservdS
	 */
	protected void serializeIp65504P368ReservdS(short ip65504P368ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P368ReservdS,IP_65504_P_368_RESERVD_S_LEN)
                  ,beginIp65504P368ReservdS
                  ,IP_65504_P_368_RESERVD_S_LEN
                 );
            localIp65504P368ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P368ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P368ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P368ReservdS() {	 
			return (getShort(beginIp65504P368ReservdS));
   	}
         int localIp65504P368ReservdLCounter = -1;
         public boolean isIp65504P368ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P368ReservdLCounter != sharedCounter;
            localIp65504P368ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_368_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P368ReservdL
	 */
	protected void serializeIp65504P368ReservdL(short ip65504P368ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P368ReservdL,IP_65504_P_368_RESERVD_L_LEN)
                  ,beginIp65504P368ReservdL
                  ,IP_65504_P_368_RESERVD_L_LEN
                 );
            localIp65504P368ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P368ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P368ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P368ReservdL() {	 
			return (getShort(beginIp65504P368ReservdL));
   	}
         int localIp65504P369ReservdSCounter = -1;
         public boolean isIp65504P369ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P369ReservdSCounter != sharedCounter;
            localIp65504P369ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_369_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P369ReservdS
	 */
	protected void serializeIp65504P369ReservdS(short ip65504P369ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P369ReservdS,IP_65504_P_369_RESERVD_S_LEN)
                  ,beginIp65504P369ReservdS
                  ,IP_65504_P_369_RESERVD_S_LEN
                 );
            localIp65504P369ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P369ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P369ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P369ReservdS() {	 
			return (getShort(beginIp65504P369ReservdS));
   	}
         int localIp65504P369ReservdLCounter = -1;
         public boolean isIp65504P369ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P369ReservdLCounter != sharedCounter;
            localIp65504P369ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_369_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P369ReservdL
	 */
	protected void serializeIp65504P369ReservdL(short ip65504P369ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P369ReservdL,IP_65504_P_369_RESERVD_L_LEN)
                  ,beginIp65504P369ReservdL
                  ,IP_65504_P_369_RESERVD_L_LEN
                 );
            localIp65504P369ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P369ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P369ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P369ReservdL() {	 
			return (getShort(beginIp65504P369ReservdL));
   	}
         int localIp65504P370RecRngSCounter = -1;
         public boolean isIp65504P370RecRngSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P370RecRngSCounter != sharedCounter;
            localIp65504P370RecRngSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_370_REC_RNG_S_LEN = 2;
  	/**
	 * serializeIp65504P370RecRngS
	 */
	protected void serializeIp65504P370RecRngS(short ip65504P370RecRngS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P370RecRngS,IP_65504_P_370_REC_RNG_S_LEN)
                  ,beginIp65504P370RecRngS
                  ,IP_65504_P_370_REC_RNG_S_LEN
                 );
            localIp65504P370RecRngSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P370RecRngSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P370RecRngS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P370RecRngS() {	 
			return (getShort(beginIp65504P370RecRngS));
   	}
         int localIp65504P370RecRngLCounter = -1;
         public boolean isIp65504P370RecRngLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P370RecRngLCounter != sharedCounter;
            localIp65504P370RecRngLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_370_REC_RNG_L_LEN = 2;
  	/**
	 * serializeIp65504P370RecRngL
	 */
	protected void serializeIp65504P370RecRngL(short ip65504P370RecRngL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P370RecRngL,IP_65504_P_370_REC_RNG_L_LEN)
                  ,beginIp65504P370RecRngL
                  ,IP_65504_P_370_REC_RNG_L_LEN
                 );
            localIp65504P370RecRngLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P370RecRngLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P370RecRngL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P370RecRngL() {	 
			return (getShort(beginIp65504P370RecRngL));
   	}
         int localIp65504P371RecRegSCounter = -1;
         public boolean isIp65504P371RecRegSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P371RecRegSCounter != sharedCounter;
            localIp65504P371RecRegSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_371_REC_REG_S_LEN = 2;
  	/**
	 * serializeIp65504P371RecRegS
	 */
	protected void serializeIp65504P371RecRegS(short ip65504P371RecRegS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P371RecRegS,IP_65504_P_371_REC_REG_S_LEN)
                  ,beginIp65504P371RecRegS
                  ,IP_65504_P_371_REC_REG_S_LEN
                 );
            localIp65504P371RecRegSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P371RecRegSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P371RecRegS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P371RecRegS() {	 
			return (getShort(beginIp65504P371RecRegS));
   	}
         int localIp65504P371RecRegLCounter = -1;
         public boolean isIp65504P371RecRegLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P371RecRegLCounter != sharedCounter;
            localIp65504P371RecRegLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_371_REC_REG_L_LEN = 2;
  	/**
	 * serializeIp65504P371RecRegL
	 */
	protected void serializeIp65504P371RecRegL(short ip65504P371RecRegL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P371RecRegL,IP_65504_P_371_REC_REG_L_LEN)
                  ,beginIp65504P371RecRegL
                  ,IP_65504_P_371_REC_REG_L_LEN
                 );
            localIp65504P371RecRegLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P371RecRegLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P371RecRegL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P371RecRegL() {	 
			return (getShort(beginIp65504P371RecRegL));
   	}
         int localIp65504P372RecTrxSCounter = -1;
         public boolean isIp65504P372RecTrxSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P372RecTrxSCounter != sharedCounter;
            localIp65504P372RecTrxSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_372_REC_TRX_S_LEN = 2;
  	/**
	 * serializeIp65504P372RecTrxS
	 */
	protected void serializeIp65504P372RecTrxS(short ip65504P372RecTrxS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P372RecTrxS,IP_65504_P_372_REC_TRX_S_LEN)
                  ,beginIp65504P372RecTrxS
                  ,IP_65504_P_372_REC_TRX_S_LEN
                 );
            localIp65504P372RecTrxSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P372RecTrxSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P372RecTrxS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P372RecTrxS() {	 
			return (getShort(beginIp65504P372RecTrxS));
   	}
         int localIp65504P372RecTrxLCounter = -1;
         public boolean isIp65504P372RecTrxLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P372RecTrxLCounter != sharedCounter;
            localIp65504P372RecTrxLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_372_REC_TRX_L_LEN = 2;
  	/**
	 * serializeIp65504P372RecTrxL
	 */
	protected void serializeIp65504P372RecTrxL(short ip65504P372RecTrxL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P372RecTrxL,IP_65504_P_372_REC_TRX_L_LEN)
                  ,beginIp65504P372RecTrxL
                  ,IP_65504_P_372_REC_TRX_L_LEN
                 );
            localIp65504P372RecTrxLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P372RecTrxLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P372RecTrxL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P372RecTrxL() {	 
			return (getShort(beginIp65504P372RecTrxL));
   	}




}
  
