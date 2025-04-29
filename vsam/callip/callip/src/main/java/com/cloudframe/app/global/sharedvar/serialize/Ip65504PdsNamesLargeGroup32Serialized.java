package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup32Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup32Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup32Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_32_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P962ReservdS;
            protected  int beginIp65504P962ReservdL;
            protected  int beginIp65504P963ReservdS;
            protected  int beginIp65504P963ReservdL;
            protected  int beginIp65504P964ReservdS;
            protected  int beginIp65504P964ReservdL;
            protected  int beginIp65504P965ReservdS;
            protected  int beginIp65504P965ReservdL;
            protected  int beginIp65504P966ReservdS;
            protected  int beginIp65504P966ReservdL;
            protected  int beginIp65504P967ReservdS;
            protected  int beginIp65504P967ReservdL;
            protected  int beginIp65504P968ReservdS;
            protected  int beginIp65504P968ReservdL;
            protected  int beginIp65504P969ReservdS;
            protected  int beginIp65504P969ReservdL;
            protected  int beginIp65504P970ReservdS;
            protected  int beginIp65504P970ReservdL;
            protected  int beginIp65504P971ReservdS;
            protected  int beginIp65504P971ReservdL;
            protected  int beginIp65504P972ReservdS;
            protected  int beginIp65504P972ReservdL;
            protected  int beginIp65504P973ReservdS;
            protected  int beginIp65504P973ReservdL;
            protected  int beginIp65504P974ReservdS;
            protected  int beginIp65504P974ReservdL;
            protected  int beginIp65504P975ReservdS;
            protected  int beginIp65504P975ReservdL;
            protected  int beginIp65504P976ReservdS;
            protected  int beginIp65504P976ReservdL;
            protected  int beginIp65504P977ReservdS;
            protected  int beginIp65504P977ReservdL;
            protected  int beginIp65504P978ReservdS;
            protected  int beginIp65504P978ReservdL;
            protected  int beginIp65504P979ReservdS;
            protected  int beginIp65504P979ReservdL;
            protected  int beginIp65504P980ReservdS;
            protected  int beginIp65504P980ReservdL;
            protected  int beginIp65504P981ReservdS;
            protected  int beginIp65504P981ReservdL;
            protected  int beginIp65504P982ReservdS;
            protected  int beginIp65504P982ReservdL;
            protected  int beginIp65504P983ReservdS;
            protected  int beginIp65504P983ReservdL;
            protected  int beginIp65504P984ReservdS;
            protected  int beginIp65504P984ReservdL;
            protected  int beginIp65504P985ReservdS;
            protected  int beginIp65504P985ReservdL;
            protected  int beginIp65504P986ReservdS;
            protected  int beginIp65504P986ReservdL;
            protected  int beginIp65504P987ReservdS;
            protected  int beginIp65504P987ReservdL;
            protected  int beginIp65504P988ReservdS;
            protected  int beginIp65504P988ReservdL;
            protected  int beginIp65504P989ReservdS;
            protected  int beginIp65504P989ReservdL;
            protected  int beginIp65504P990ReservdS;
            protected  int beginIp65504P990ReservdL;
            protected  int beginIp65504P991ReservdS;
            protected  int beginIp65504P991ReservdL;
            protected  int beginIp65504P992ReservdS;
            protected  int beginIp65504P992ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup32Serialized
	**/
    public Ip65504PdsNamesLargeGroup32Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup32Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup32Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup32Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7684); // serialize this field at offset 7684 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup32Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7684 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup32Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_32_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P962ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P962ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P963ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P963ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P964ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P964ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P965ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P965ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P966ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P966ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P967ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P967ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P968ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P968ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P969ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P969ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P970ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P970ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P971ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P971ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P972ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P972ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P973ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P973ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P974ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P974ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P975ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P975ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P976ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P976ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P977ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P977ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P978ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P978ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P979ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P979ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P980ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P980ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P981ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P981ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P982ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P982ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P983ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P983ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P984ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P984ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P985ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P985ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P986ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P986ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P987ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P987ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P988ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P988ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P989ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P989ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P990ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P990ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P991ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P991ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P992ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P992ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P962ReservdSCounter = -1;
         public boolean isIp65504P962ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P962ReservdSCounter != sharedCounter;
            localIp65504P962ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_962_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P962ReservdS
	 */
	protected void serializeIp65504P962ReservdS(short ip65504P962ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P962ReservdS,IP_65504_P_962_RESERVD_S_LEN)
                  ,beginIp65504P962ReservdS
                  ,IP_65504_P_962_RESERVD_S_LEN
                 );
            localIp65504P962ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P962ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P962ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P962ReservdS() {	 
			return (getShort(beginIp65504P962ReservdS));
   	}
         int localIp65504P962ReservdLCounter = -1;
         public boolean isIp65504P962ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P962ReservdLCounter != sharedCounter;
            localIp65504P962ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_962_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P962ReservdL
	 */
	protected void serializeIp65504P962ReservdL(short ip65504P962ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P962ReservdL,IP_65504_P_962_RESERVD_L_LEN)
                  ,beginIp65504P962ReservdL
                  ,IP_65504_P_962_RESERVD_L_LEN
                 );
            localIp65504P962ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P962ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P962ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P962ReservdL() {	 
			return (getShort(beginIp65504P962ReservdL));
   	}
         int localIp65504P963ReservdSCounter = -1;
         public boolean isIp65504P963ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P963ReservdSCounter != sharedCounter;
            localIp65504P963ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_963_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P963ReservdS
	 */
	protected void serializeIp65504P963ReservdS(short ip65504P963ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P963ReservdS,IP_65504_P_963_RESERVD_S_LEN)
                  ,beginIp65504P963ReservdS
                  ,IP_65504_P_963_RESERVD_S_LEN
                 );
            localIp65504P963ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P963ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P963ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P963ReservdS() {	 
			return (getShort(beginIp65504P963ReservdS));
   	}
         int localIp65504P963ReservdLCounter = -1;
         public boolean isIp65504P963ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P963ReservdLCounter != sharedCounter;
            localIp65504P963ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_963_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P963ReservdL
	 */
	protected void serializeIp65504P963ReservdL(short ip65504P963ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P963ReservdL,IP_65504_P_963_RESERVD_L_LEN)
                  ,beginIp65504P963ReservdL
                  ,IP_65504_P_963_RESERVD_L_LEN
                 );
            localIp65504P963ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P963ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P963ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P963ReservdL() {	 
			return (getShort(beginIp65504P963ReservdL));
   	}
         int localIp65504P964ReservdSCounter = -1;
         public boolean isIp65504P964ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P964ReservdSCounter != sharedCounter;
            localIp65504P964ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_964_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P964ReservdS
	 */
	protected void serializeIp65504P964ReservdS(short ip65504P964ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P964ReservdS,IP_65504_P_964_RESERVD_S_LEN)
                  ,beginIp65504P964ReservdS
                  ,IP_65504_P_964_RESERVD_S_LEN
                 );
            localIp65504P964ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P964ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P964ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P964ReservdS() {	 
			return (getShort(beginIp65504P964ReservdS));
   	}
         int localIp65504P964ReservdLCounter = -1;
         public boolean isIp65504P964ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P964ReservdLCounter != sharedCounter;
            localIp65504P964ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_964_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P964ReservdL
	 */
	protected void serializeIp65504P964ReservdL(short ip65504P964ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P964ReservdL,IP_65504_P_964_RESERVD_L_LEN)
                  ,beginIp65504P964ReservdL
                  ,IP_65504_P_964_RESERVD_L_LEN
                 );
            localIp65504P964ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P964ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P964ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P964ReservdL() {	 
			return (getShort(beginIp65504P964ReservdL));
   	}
         int localIp65504P965ReservdSCounter = -1;
         public boolean isIp65504P965ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P965ReservdSCounter != sharedCounter;
            localIp65504P965ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_965_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P965ReservdS
	 */
	protected void serializeIp65504P965ReservdS(short ip65504P965ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P965ReservdS,IP_65504_P_965_RESERVD_S_LEN)
                  ,beginIp65504P965ReservdS
                  ,IP_65504_P_965_RESERVD_S_LEN
                 );
            localIp65504P965ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P965ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P965ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P965ReservdS() {	 
			return (getShort(beginIp65504P965ReservdS));
   	}
         int localIp65504P965ReservdLCounter = -1;
         public boolean isIp65504P965ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P965ReservdLCounter != sharedCounter;
            localIp65504P965ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_965_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P965ReservdL
	 */
	protected void serializeIp65504P965ReservdL(short ip65504P965ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P965ReservdL,IP_65504_P_965_RESERVD_L_LEN)
                  ,beginIp65504P965ReservdL
                  ,IP_65504_P_965_RESERVD_L_LEN
                 );
            localIp65504P965ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P965ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P965ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P965ReservdL() {	 
			return (getShort(beginIp65504P965ReservdL));
   	}
         int localIp65504P966ReservdSCounter = -1;
         public boolean isIp65504P966ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P966ReservdSCounter != sharedCounter;
            localIp65504P966ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_966_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P966ReservdS
	 */
	protected void serializeIp65504P966ReservdS(short ip65504P966ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P966ReservdS,IP_65504_P_966_RESERVD_S_LEN)
                  ,beginIp65504P966ReservdS
                  ,IP_65504_P_966_RESERVD_S_LEN
                 );
            localIp65504P966ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P966ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P966ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P966ReservdS() {	 
			return (getShort(beginIp65504P966ReservdS));
   	}
         int localIp65504P966ReservdLCounter = -1;
         public boolean isIp65504P966ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P966ReservdLCounter != sharedCounter;
            localIp65504P966ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_966_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P966ReservdL
	 */
	protected void serializeIp65504P966ReservdL(short ip65504P966ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P966ReservdL,IP_65504_P_966_RESERVD_L_LEN)
                  ,beginIp65504P966ReservdL
                  ,IP_65504_P_966_RESERVD_L_LEN
                 );
            localIp65504P966ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P966ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P966ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P966ReservdL() {	 
			return (getShort(beginIp65504P966ReservdL));
   	}
         int localIp65504P967ReservdSCounter = -1;
         public boolean isIp65504P967ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P967ReservdSCounter != sharedCounter;
            localIp65504P967ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_967_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P967ReservdS
	 */
	protected void serializeIp65504P967ReservdS(short ip65504P967ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P967ReservdS,IP_65504_P_967_RESERVD_S_LEN)
                  ,beginIp65504P967ReservdS
                  ,IP_65504_P_967_RESERVD_S_LEN
                 );
            localIp65504P967ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P967ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P967ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P967ReservdS() {	 
			return (getShort(beginIp65504P967ReservdS));
   	}
         int localIp65504P967ReservdLCounter = -1;
         public boolean isIp65504P967ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P967ReservdLCounter != sharedCounter;
            localIp65504P967ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_967_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P967ReservdL
	 */
	protected void serializeIp65504P967ReservdL(short ip65504P967ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P967ReservdL,IP_65504_P_967_RESERVD_L_LEN)
                  ,beginIp65504P967ReservdL
                  ,IP_65504_P_967_RESERVD_L_LEN
                 );
            localIp65504P967ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P967ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P967ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P967ReservdL() {	 
			return (getShort(beginIp65504P967ReservdL));
   	}
         int localIp65504P968ReservdSCounter = -1;
         public boolean isIp65504P968ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P968ReservdSCounter != sharedCounter;
            localIp65504P968ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_968_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P968ReservdS
	 */
	protected void serializeIp65504P968ReservdS(short ip65504P968ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P968ReservdS,IP_65504_P_968_RESERVD_S_LEN)
                  ,beginIp65504P968ReservdS
                  ,IP_65504_P_968_RESERVD_S_LEN
                 );
            localIp65504P968ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P968ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P968ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P968ReservdS() {	 
			return (getShort(beginIp65504P968ReservdS));
   	}
         int localIp65504P968ReservdLCounter = -1;
         public boolean isIp65504P968ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P968ReservdLCounter != sharedCounter;
            localIp65504P968ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_968_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P968ReservdL
	 */
	protected void serializeIp65504P968ReservdL(short ip65504P968ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P968ReservdL,IP_65504_P_968_RESERVD_L_LEN)
                  ,beginIp65504P968ReservdL
                  ,IP_65504_P_968_RESERVD_L_LEN
                 );
            localIp65504P968ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P968ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P968ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P968ReservdL() {	 
			return (getShort(beginIp65504P968ReservdL));
   	}
         int localIp65504P969ReservdSCounter = -1;
         public boolean isIp65504P969ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P969ReservdSCounter != sharedCounter;
            localIp65504P969ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_969_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P969ReservdS
	 */
	protected void serializeIp65504P969ReservdS(short ip65504P969ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P969ReservdS,IP_65504_P_969_RESERVD_S_LEN)
                  ,beginIp65504P969ReservdS
                  ,IP_65504_P_969_RESERVD_S_LEN
                 );
            localIp65504P969ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P969ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P969ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P969ReservdS() {	 
			return (getShort(beginIp65504P969ReservdS));
   	}
         int localIp65504P969ReservdLCounter = -1;
         public boolean isIp65504P969ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P969ReservdLCounter != sharedCounter;
            localIp65504P969ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_969_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P969ReservdL
	 */
	protected void serializeIp65504P969ReservdL(short ip65504P969ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P969ReservdL,IP_65504_P_969_RESERVD_L_LEN)
                  ,beginIp65504P969ReservdL
                  ,IP_65504_P_969_RESERVD_L_LEN
                 );
            localIp65504P969ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P969ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P969ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P969ReservdL() {	 
			return (getShort(beginIp65504P969ReservdL));
   	}
         int localIp65504P970ReservdSCounter = -1;
         public boolean isIp65504P970ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P970ReservdSCounter != sharedCounter;
            localIp65504P970ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_970_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P970ReservdS
	 */
	protected void serializeIp65504P970ReservdS(short ip65504P970ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P970ReservdS,IP_65504_P_970_RESERVD_S_LEN)
                  ,beginIp65504P970ReservdS
                  ,IP_65504_P_970_RESERVD_S_LEN
                 );
            localIp65504P970ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P970ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P970ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P970ReservdS() {	 
			return (getShort(beginIp65504P970ReservdS));
   	}
         int localIp65504P970ReservdLCounter = -1;
         public boolean isIp65504P970ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P970ReservdLCounter != sharedCounter;
            localIp65504P970ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_970_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P970ReservdL
	 */
	protected void serializeIp65504P970ReservdL(short ip65504P970ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P970ReservdL,IP_65504_P_970_RESERVD_L_LEN)
                  ,beginIp65504P970ReservdL
                  ,IP_65504_P_970_RESERVD_L_LEN
                 );
            localIp65504P970ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P970ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P970ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P970ReservdL() {	 
			return (getShort(beginIp65504P970ReservdL));
   	}
         int localIp65504P971ReservdSCounter = -1;
         public boolean isIp65504P971ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P971ReservdSCounter != sharedCounter;
            localIp65504P971ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_971_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P971ReservdS
	 */
	protected void serializeIp65504P971ReservdS(short ip65504P971ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P971ReservdS,IP_65504_P_971_RESERVD_S_LEN)
                  ,beginIp65504P971ReservdS
                  ,IP_65504_P_971_RESERVD_S_LEN
                 );
            localIp65504P971ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P971ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P971ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P971ReservdS() {	 
			return (getShort(beginIp65504P971ReservdS));
   	}
         int localIp65504P971ReservdLCounter = -1;
         public boolean isIp65504P971ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P971ReservdLCounter != sharedCounter;
            localIp65504P971ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_971_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P971ReservdL
	 */
	protected void serializeIp65504P971ReservdL(short ip65504P971ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P971ReservdL,IP_65504_P_971_RESERVD_L_LEN)
                  ,beginIp65504P971ReservdL
                  ,IP_65504_P_971_RESERVD_L_LEN
                 );
            localIp65504P971ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P971ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P971ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P971ReservdL() {	 
			return (getShort(beginIp65504P971ReservdL));
   	}
         int localIp65504P972ReservdSCounter = -1;
         public boolean isIp65504P972ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P972ReservdSCounter != sharedCounter;
            localIp65504P972ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_972_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P972ReservdS
	 */
	protected void serializeIp65504P972ReservdS(short ip65504P972ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P972ReservdS,IP_65504_P_972_RESERVD_S_LEN)
                  ,beginIp65504P972ReservdS
                  ,IP_65504_P_972_RESERVD_S_LEN
                 );
            localIp65504P972ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P972ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P972ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P972ReservdS() {	 
			return (getShort(beginIp65504P972ReservdS));
   	}
         int localIp65504P972ReservdLCounter = -1;
         public boolean isIp65504P972ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P972ReservdLCounter != sharedCounter;
            localIp65504P972ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_972_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P972ReservdL
	 */
	protected void serializeIp65504P972ReservdL(short ip65504P972ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P972ReservdL,IP_65504_P_972_RESERVD_L_LEN)
                  ,beginIp65504P972ReservdL
                  ,IP_65504_P_972_RESERVD_L_LEN
                 );
            localIp65504P972ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P972ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P972ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P972ReservdL() {	 
			return (getShort(beginIp65504P972ReservdL));
   	}
         int localIp65504P973ReservdSCounter = -1;
         public boolean isIp65504P973ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P973ReservdSCounter != sharedCounter;
            localIp65504P973ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_973_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P973ReservdS
	 */
	protected void serializeIp65504P973ReservdS(short ip65504P973ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P973ReservdS,IP_65504_P_973_RESERVD_S_LEN)
                  ,beginIp65504P973ReservdS
                  ,IP_65504_P_973_RESERVD_S_LEN
                 );
            localIp65504P973ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P973ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P973ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P973ReservdS() {	 
			return (getShort(beginIp65504P973ReservdS));
   	}
         int localIp65504P973ReservdLCounter = -1;
         public boolean isIp65504P973ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P973ReservdLCounter != sharedCounter;
            localIp65504P973ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_973_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P973ReservdL
	 */
	protected void serializeIp65504P973ReservdL(short ip65504P973ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P973ReservdL,IP_65504_P_973_RESERVD_L_LEN)
                  ,beginIp65504P973ReservdL
                  ,IP_65504_P_973_RESERVD_L_LEN
                 );
            localIp65504P973ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P973ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P973ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P973ReservdL() {	 
			return (getShort(beginIp65504P973ReservdL));
   	}
         int localIp65504P974ReservdSCounter = -1;
         public boolean isIp65504P974ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P974ReservdSCounter != sharedCounter;
            localIp65504P974ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_974_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P974ReservdS
	 */
	protected void serializeIp65504P974ReservdS(short ip65504P974ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P974ReservdS,IP_65504_P_974_RESERVD_S_LEN)
                  ,beginIp65504P974ReservdS
                  ,IP_65504_P_974_RESERVD_S_LEN
                 );
            localIp65504P974ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P974ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P974ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P974ReservdS() {	 
			return (getShort(beginIp65504P974ReservdS));
   	}
         int localIp65504P974ReservdLCounter = -1;
         public boolean isIp65504P974ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P974ReservdLCounter != sharedCounter;
            localIp65504P974ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_974_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P974ReservdL
	 */
	protected void serializeIp65504P974ReservdL(short ip65504P974ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P974ReservdL,IP_65504_P_974_RESERVD_L_LEN)
                  ,beginIp65504P974ReservdL
                  ,IP_65504_P_974_RESERVD_L_LEN
                 );
            localIp65504P974ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P974ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P974ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P974ReservdL() {	 
			return (getShort(beginIp65504P974ReservdL));
   	}
         int localIp65504P975ReservdSCounter = -1;
         public boolean isIp65504P975ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P975ReservdSCounter != sharedCounter;
            localIp65504P975ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_975_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P975ReservdS
	 */
	protected void serializeIp65504P975ReservdS(short ip65504P975ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P975ReservdS,IP_65504_P_975_RESERVD_S_LEN)
                  ,beginIp65504P975ReservdS
                  ,IP_65504_P_975_RESERVD_S_LEN
                 );
            localIp65504P975ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P975ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P975ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P975ReservdS() {	 
			return (getShort(beginIp65504P975ReservdS));
   	}
         int localIp65504P975ReservdLCounter = -1;
         public boolean isIp65504P975ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P975ReservdLCounter != sharedCounter;
            localIp65504P975ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_975_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P975ReservdL
	 */
	protected void serializeIp65504P975ReservdL(short ip65504P975ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P975ReservdL,IP_65504_P_975_RESERVD_L_LEN)
                  ,beginIp65504P975ReservdL
                  ,IP_65504_P_975_RESERVD_L_LEN
                 );
            localIp65504P975ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P975ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P975ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P975ReservdL() {	 
			return (getShort(beginIp65504P975ReservdL));
   	}
         int localIp65504P976ReservdSCounter = -1;
         public boolean isIp65504P976ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P976ReservdSCounter != sharedCounter;
            localIp65504P976ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_976_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P976ReservdS
	 */
	protected void serializeIp65504P976ReservdS(short ip65504P976ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P976ReservdS,IP_65504_P_976_RESERVD_S_LEN)
                  ,beginIp65504P976ReservdS
                  ,IP_65504_P_976_RESERVD_S_LEN
                 );
            localIp65504P976ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P976ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P976ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P976ReservdS() {	 
			return (getShort(beginIp65504P976ReservdS));
   	}
         int localIp65504P976ReservdLCounter = -1;
         public boolean isIp65504P976ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P976ReservdLCounter != sharedCounter;
            localIp65504P976ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_976_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P976ReservdL
	 */
	protected void serializeIp65504P976ReservdL(short ip65504P976ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P976ReservdL,IP_65504_P_976_RESERVD_L_LEN)
                  ,beginIp65504P976ReservdL
                  ,IP_65504_P_976_RESERVD_L_LEN
                 );
            localIp65504P976ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P976ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P976ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P976ReservdL() {	 
			return (getShort(beginIp65504P976ReservdL));
   	}
         int localIp65504P977ReservdSCounter = -1;
         public boolean isIp65504P977ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P977ReservdSCounter != sharedCounter;
            localIp65504P977ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_977_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P977ReservdS
	 */
	protected void serializeIp65504P977ReservdS(short ip65504P977ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P977ReservdS,IP_65504_P_977_RESERVD_S_LEN)
                  ,beginIp65504P977ReservdS
                  ,IP_65504_P_977_RESERVD_S_LEN
                 );
            localIp65504P977ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P977ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P977ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P977ReservdS() {	 
			return (getShort(beginIp65504P977ReservdS));
   	}
         int localIp65504P977ReservdLCounter = -1;
         public boolean isIp65504P977ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P977ReservdLCounter != sharedCounter;
            localIp65504P977ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_977_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P977ReservdL
	 */
	protected void serializeIp65504P977ReservdL(short ip65504P977ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P977ReservdL,IP_65504_P_977_RESERVD_L_LEN)
                  ,beginIp65504P977ReservdL
                  ,IP_65504_P_977_RESERVD_L_LEN
                 );
            localIp65504P977ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P977ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P977ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P977ReservdL() {	 
			return (getShort(beginIp65504P977ReservdL));
   	}
         int localIp65504P978ReservdSCounter = -1;
         public boolean isIp65504P978ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P978ReservdSCounter != sharedCounter;
            localIp65504P978ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_978_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P978ReservdS
	 */
	protected void serializeIp65504P978ReservdS(short ip65504P978ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P978ReservdS,IP_65504_P_978_RESERVD_S_LEN)
                  ,beginIp65504P978ReservdS
                  ,IP_65504_P_978_RESERVD_S_LEN
                 );
            localIp65504P978ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P978ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P978ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P978ReservdS() {	 
			return (getShort(beginIp65504P978ReservdS));
   	}
         int localIp65504P978ReservdLCounter = -1;
         public boolean isIp65504P978ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P978ReservdLCounter != sharedCounter;
            localIp65504P978ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_978_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P978ReservdL
	 */
	protected void serializeIp65504P978ReservdL(short ip65504P978ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P978ReservdL,IP_65504_P_978_RESERVD_L_LEN)
                  ,beginIp65504P978ReservdL
                  ,IP_65504_P_978_RESERVD_L_LEN
                 );
            localIp65504P978ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P978ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P978ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P978ReservdL() {	 
			return (getShort(beginIp65504P978ReservdL));
   	}
         int localIp65504P979ReservdSCounter = -1;
         public boolean isIp65504P979ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P979ReservdSCounter != sharedCounter;
            localIp65504P979ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_979_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P979ReservdS
	 */
	protected void serializeIp65504P979ReservdS(short ip65504P979ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P979ReservdS,IP_65504_P_979_RESERVD_S_LEN)
                  ,beginIp65504P979ReservdS
                  ,IP_65504_P_979_RESERVD_S_LEN
                 );
            localIp65504P979ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P979ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P979ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P979ReservdS() {	 
			return (getShort(beginIp65504P979ReservdS));
   	}
         int localIp65504P979ReservdLCounter = -1;
         public boolean isIp65504P979ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P979ReservdLCounter != sharedCounter;
            localIp65504P979ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_979_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P979ReservdL
	 */
	protected void serializeIp65504P979ReservdL(short ip65504P979ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P979ReservdL,IP_65504_P_979_RESERVD_L_LEN)
                  ,beginIp65504P979ReservdL
                  ,IP_65504_P_979_RESERVD_L_LEN
                 );
            localIp65504P979ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P979ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P979ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P979ReservdL() {	 
			return (getShort(beginIp65504P979ReservdL));
   	}
         int localIp65504P980ReservdSCounter = -1;
         public boolean isIp65504P980ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P980ReservdSCounter != sharedCounter;
            localIp65504P980ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_980_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P980ReservdS
	 */
	protected void serializeIp65504P980ReservdS(short ip65504P980ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P980ReservdS,IP_65504_P_980_RESERVD_S_LEN)
                  ,beginIp65504P980ReservdS
                  ,IP_65504_P_980_RESERVD_S_LEN
                 );
            localIp65504P980ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P980ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P980ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P980ReservdS() {	 
			return (getShort(beginIp65504P980ReservdS));
   	}
         int localIp65504P980ReservdLCounter = -1;
         public boolean isIp65504P980ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P980ReservdLCounter != sharedCounter;
            localIp65504P980ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_980_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P980ReservdL
	 */
	protected void serializeIp65504P980ReservdL(short ip65504P980ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P980ReservdL,IP_65504_P_980_RESERVD_L_LEN)
                  ,beginIp65504P980ReservdL
                  ,IP_65504_P_980_RESERVD_L_LEN
                 );
            localIp65504P980ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P980ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P980ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P980ReservdL() {	 
			return (getShort(beginIp65504P980ReservdL));
   	}
         int localIp65504P981ReservdSCounter = -1;
         public boolean isIp65504P981ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P981ReservdSCounter != sharedCounter;
            localIp65504P981ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_981_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P981ReservdS
	 */
	protected void serializeIp65504P981ReservdS(short ip65504P981ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P981ReservdS,IP_65504_P_981_RESERVD_S_LEN)
                  ,beginIp65504P981ReservdS
                  ,IP_65504_P_981_RESERVD_S_LEN
                 );
            localIp65504P981ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P981ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P981ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P981ReservdS() {	 
			return (getShort(beginIp65504P981ReservdS));
   	}
         int localIp65504P981ReservdLCounter = -1;
         public boolean isIp65504P981ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P981ReservdLCounter != sharedCounter;
            localIp65504P981ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_981_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P981ReservdL
	 */
	protected void serializeIp65504P981ReservdL(short ip65504P981ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P981ReservdL,IP_65504_P_981_RESERVD_L_LEN)
                  ,beginIp65504P981ReservdL
                  ,IP_65504_P_981_RESERVD_L_LEN
                 );
            localIp65504P981ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P981ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P981ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P981ReservdL() {	 
			return (getShort(beginIp65504P981ReservdL));
   	}
         int localIp65504P982ReservdSCounter = -1;
         public boolean isIp65504P982ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P982ReservdSCounter != sharedCounter;
            localIp65504P982ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_982_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P982ReservdS
	 */
	protected void serializeIp65504P982ReservdS(short ip65504P982ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P982ReservdS,IP_65504_P_982_RESERVD_S_LEN)
                  ,beginIp65504P982ReservdS
                  ,IP_65504_P_982_RESERVD_S_LEN
                 );
            localIp65504P982ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P982ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P982ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P982ReservdS() {	 
			return (getShort(beginIp65504P982ReservdS));
   	}
         int localIp65504P982ReservdLCounter = -1;
         public boolean isIp65504P982ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P982ReservdLCounter != sharedCounter;
            localIp65504P982ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_982_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P982ReservdL
	 */
	protected void serializeIp65504P982ReservdL(short ip65504P982ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P982ReservdL,IP_65504_P_982_RESERVD_L_LEN)
                  ,beginIp65504P982ReservdL
                  ,IP_65504_P_982_RESERVD_L_LEN
                 );
            localIp65504P982ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P982ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P982ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P982ReservdL() {	 
			return (getShort(beginIp65504P982ReservdL));
   	}
         int localIp65504P983ReservdSCounter = -1;
         public boolean isIp65504P983ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P983ReservdSCounter != sharedCounter;
            localIp65504P983ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_983_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P983ReservdS
	 */
	protected void serializeIp65504P983ReservdS(short ip65504P983ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P983ReservdS,IP_65504_P_983_RESERVD_S_LEN)
                  ,beginIp65504P983ReservdS
                  ,IP_65504_P_983_RESERVD_S_LEN
                 );
            localIp65504P983ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P983ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P983ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P983ReservdS() {	 
			return (getShort(beginIp65504P983ReservdS));
   	}
         int localIp65504P983ReservdLCounter = -1;
         public boolean isIp65504P983ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P983ReservdLCounter != sharedCounter;
            localIp65504P983ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_983_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P983ReservdL
	 */
	protected void serializeIp65504P983ReservdL(short ip65504P983ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P983ReservdL,IP_65504_P_983_RESERVD_L_LEN)
                  ,beginIp65504P983ReservdL
                  ,IP_65504_P_983_RESERVD_L_LEN
                 );
            localIp65504P983ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P983ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P983ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P983ReservdL() {	 
			return (getShort(beginIp65504P983ReservdL));
   	}
         int localIp65504P984ReservdSCounter = -1;
         public boolean isIp65504P984ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P984ReservdSCounter != sharedCounter;
            localIp65504P984ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_984_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P984ReservdS
	 */
	protected void serializeIp65504P984ReservdS(short ip65504P984ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P984ReservdS,IP_65504_P_984_RESERVD_S_LEN)
                  ,beginIp65504P984ReservdS
                  ,IP_65504_P_984_RESERVD_S_LEN
                 );
            localIp65504P984ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P984ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P984ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P984ReservdS() {	 
			return (getShort(beginIp65504P984ReservdS));
   	}
         int localIp65504P984ReservdLCounter = -1;
         public boolean isIp65504P984ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P984ReservdLCounter != sharedCounter;
            localIp65504P984ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_984_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P984ReservdL
	 */
	protected void serializeIp65504P984ReservdL(short ip65504P984ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P984ReservdL,IP_65504_P_984_RESERVD_L_LEN)
                  ,beginIp65504P984ReservdL
                  ,IP_65504_P_984_RESERVD_L_LEN
                 );
            localIp65504P984ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P984ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P984ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P984ReservdL() {	 
			return (getShort(beginIp65504P984ReservdL));
   	}
         int localIp65504P985ReservdSCounter = -1;
         public boolean isIp65504P985ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P985ReservdSCounter != sharedCounter;
            localIp65504P985ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_985_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P985ReservdS
	 */
	protected void serializeIp65504P985ReservdS(short ip65504P985ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P985ReservdS,IP_65504_P_985_RESERVD_S_LEN)
                  ,beginIp65504P985ReservdS
                  ,IP_65504_P_985_RESERVD_S_LEN
                 );
            localIp65504P985ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P985ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P985ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P985ReservdS() {	 
			return (getShort(beginIp65504P985ReservdS));
   	}
         int localIp65504P985ReservdLCounter = -1;
         public boolean isIp65504P985ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P985ReservdLCounter != sharedCounter;
            localIp65504P985ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_985_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P985ReservdL
	 */
	protected void serializeIp65504P985ReservdL(short ip65504P985ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P985ReservdL,IP_65504_P_985_RESERVD_L_LEN)
                  ,beginIp65504P985ReservdL
                  ,IP_65504_P_985_RESERVD_L_LEN
                 );
            localIp65504P985ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P985ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P985ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P985ReservdL() {	 
			return (getShort(beginIp65504P985ReservdL));
   	}
         int localIp65504P986ReservdSCounter = -1;
         public boolean isIp65504P986ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P986ReservdSCounter != sharedCounter;
            localIp65504P986ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_986_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P986ReservdS
	 */
	protected void serializeIp65504P986ReservdS(short ip65504P986ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P986ReservdS,IP_65504_P_986_RESERVD_S_LEN)
                  ,beginIp65504P986ReservdS
                  ,IP_65504_P_986_RESERVD_S_LEN
                 );
            localIp65504P986ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P986ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P986ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P986ReservdS() {	 
			return (getShort(beginIp65504P986ReservdS));
   	}
         int localIp65504P986ReservdLCounter = -1;
         public boolean isIp65504P986ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P986ReservdLCounter != sharedCounter;
            localIp65504P986ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_986_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P986ReservdL
	 */
	protected void serializeIp65504P986ReservdL(short ip65504P986ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P986ReservdL,IP_65504_P_986_RESERVD_L_LEN)
                  ,beginIp65504P986ReservdL
                  ,IP_65504_P_986_RESERVD_L_LEN
                 );
            localIp65504P986ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P986ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P986ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P986ReservdL() {	 
			return (getShort(beginIp65504P986ReservdL));
   	}
         int localIp65504P987ReservdSCounter = -1;
         public boolean isIp65504P987ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P987ReservdSCounter != sharedCounter;
            localIp65504P987ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_987_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P987ReservdS
	 */
	protected void serializeIp65504P987ReservdS(short ip65504P987ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P987ReservdS,IP_65504_P_987_RESERVD_S_LEN)
                  ,beginIp65504P987ReservdS
                  ,IP_65504_P_987_RESERVD_S_LEN
                 );
            localIp65504P987ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P987ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P987ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P987ReservdS() {	 
			return (getShort(beginIp65504P987ReservdS));
   	}
         int localIp65504P987ReservdLCounter = -1;
         public boolean isIp65504P987ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P987ReservdLCounter != sharedCounter;
            localIp65504P987ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_987_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P987ReservdL
	 */
	protected void serializeIp65504P987ReservdL(short ip65504P987ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P987ReservdL,IP_65504_P_987_RESERVD_L_LEN)
                  ,beginIp65504P987ReservdL
                  ,IP_65504_P_987_RESERVD_L_LEN
                 );
            localIp65504P987ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P987ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P987ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P987ReservdL() {	 
			return (getShort(beginIp65504P987ReservdL));
   	}
         int localIp65504P988ReservdSCounter = -1;
         public boolean isIp65504P988ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P988ReservdSCounter != sharedCounter;
            localIp65504P988ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_988_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P988ReservdS
	 */
	protected void serializeIp65504P988ReservdS(short ip65504P988ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P988ReservdS,IP_65504_P_988_RESERVD_S_LEN)
                  ,beginIp65504P988ReservdS
                  ,IP_65504_P_988_RESERVD_S_LEN
                 );
            localIp65504P988ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P988ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P988ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P988ReservdS() {	 
			return (getShort(beginIp65504P988ReservdS));
   	}
         int localIp65504P988ReservdLCounter = -1;
         public boolean isIp65504P988ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P988ReservdLCounter != sharedCounter;
            localIp65504P988ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_988_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P988ReservdL
	 */
	protected void serializeIp65504P988ReservdL(short ip65504P988ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P988ReservdL,IP_65504_P_988_RESERVD_L_LEN)
                  ,beginIp65504P988ReservdL
                  ,IP_65504_P_988_RESERVD_L_LEN
                 );
            localIp65504P988ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P988ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P988ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P988ReservdL() {	 
			return (getShort(beginIp65504P988ReservdL));
   	}
         int localIp65504P989ReservdSCounter = -1;
         public boolean isIp65504P989ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P989ReservdSCounter != sharedCounter;
            localIp65504P989ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_989_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P989ReservdS
	 */
	protected void serializeIp65504P989ReservdS(short ip65504P989ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P989ReservdS,IP_65504_P_989_RESERVD_S_LEN)
                  ,beginIp65504P989ReservdS
                  ,IP_65504_P_989_RESERVD_S_LEN
                 );
            localIp65504P989ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P989ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P989ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P989ReservdS() {	 
			return (getShort(beginIp65504P989ReservdS));
   	}
         int localIp65504P989ReservdLCounter = -1;
         public boolean isIp65504P989ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P989ReservdLCounter != sharedCounter;
            localIp65504P989ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_989_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P989ReservdL
	 */
	protected void serializeIp65504P989ReservdL(short ip65504P989ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P989ReservdL,IP_65504_P_989_RESERVD_L_LEN)
                  ,beginIp65504P989ReservdL
                  ,IP_65504_P_989_RESERVD_L_LEN
                 );
            localIp65504P989ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P989ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P989ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P989ReservdL() {	 
			return (getShort(beginIp65504P989ReservdL));
   	}
         int localIp65504P990ReservdSCounter = -1;
         public boolean isIp65504P990ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P990ReservdSCounter != sharedCounter;
            localIp65504P990ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_990_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P990ReservdS
	 */
	protected void serializeIp65504P990ReservdS(short ip65504P990ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P990ReservdS,IP_65504_P_990_RESERVD_S_LEN)
                  ,beginIp65504P990ReservdS
                  ,IP_65504_P_990_RESERVD_S_LEN
                 );
            localIp65504P990ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P990ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P990ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P990ReservdS() {	 
			return (getShort(beginIp65504P990ReservdS));
   	}
         int localIp65504P990ReservdLCounter = -1;
         public boolean isIp65504P990ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P990ReservdLCounter != sharedCounter;
            localIp65504P990ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_990_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P990ReservdL
	 */
	protected void serializeIp65504P990ReservdL(short ip65504P990ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P990ReservdL,IP_65504_P_990_RESERVD_L_LEN)
                  ,beginIp65504P990ReservdL
                  ,IP_65504_P_990_RESERVD_L_LEN
                 );
            localIp65504P990ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P990ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P990ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P990ReservdL() {	 
			return (getShort(beginIp65504P990ReservdL));
   	}
         int localIp65504P991ReservdSCounter = -1;
         public boolean isIp65504P991ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P991ReservdSCounter != sharedCounter;
            localIp65504P991ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_991_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P991ReservdS
	 */
	protected void serializeIp65504P991ReservdS(short ip65504P991ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P991ReservdS,IP_65504_P_991_RESERVD_S_LEN)
                  ,beginIp65504P991ReservdS
                  ,IP_65504_P_991_RESERVD_S_LEN
                 );
            localIp65504P991ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P991ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P991ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P991ReservdS() {	 
			return (getShort(beginIp65504P991ReservdS));
   	}
         int localIp65504P991ReservdLCounter = -1;
         public boolean isIp65504P991ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P991ReservdLCounter != sharedCounter;
            localIp65504P991ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_991_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P991ReservdL
	 */
	protected void serializeIp65504P991ReservdL(short ip65504P991ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P991ReservdL,IP_65504_P_991_RESERVD_L_LEN)
                  ,beginIp65504P991ReservdL
                  ,IP_65504_P_991_RESERVD_L_LEN
                 );
            localIp65504P991ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P991ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P991ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P991ReservdL() {	 
			return (getShort(beginIp65504P991ReservdL));
   	}
         int localIp65504P992ReservdSCounter = -1;
         public boolean isIp65504P992ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P992ReservdSCounter != sharedCounter;
            localIp65504P992ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_992_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P992ReservdS
	 */
	protected void serializeIp65504P992ReservdS(short ip65504P992ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P992ReservdS,IP_65504_P_992_RESERVD_S_LEN)
                  ,beginIp65504P992ReservdS
                  ,IP_65504_P_992_RESERVD_S_LEN
                 );
            localIp65504P992ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P992ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P992ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P992ReservdS() {	 
			return (getShort(beginIp65504P992ReservdS));
   	}
         int localIp65504P992ReservdLCounter = -1;
         public boolean isIp65504P992ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P992ReservdLCounter != sharedCounter;
            localIp65504P992ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_992_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P992ReservdL
	 */
	protected void serializeIp65504P992ReservdL(short ip65504P992ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P992ReservdL,IP_65504_P_992_RESERVD_L_LEN)
                  ,beginIp65504P992ReservdL
                  ,IP_65504_P_992_RESERVD_L_LEN
                 );
            localIp65504P992ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P992ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P992ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P992ReservdL() {	 
			return (getShort(beginIp65504P992ReservdL));
   	}




}
  
