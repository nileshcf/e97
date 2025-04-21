package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup26Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup26Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup26Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_26_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P776ReservdS;
            protected  int beginIp65504P776ReservdL;
            protected  int beginIp65504P777ReservdS;
            protected  int beginIp65504P777ReservdL;
            protected  int beginIp65504P778ReservdS;
            protected  int beginIp65504P778ReservdL;
            protected  int beginIp65504P779ReservdS;
            protected  int beginIp65504P779ReservdL;
            protected  int beginIp65504P780ReservdS;
            protected  int beginIp65504P780ReservdL;
            protected  int beginIp65504P781ReservdS;
            protected  int beginIp65504P781ReservdL;
            protected  int beginIp65504P782ReservdS;
            protected  int beginIp65504P782ReservdL;
            protected  int beginIp65504P783ReservdS;
            protected  int beginIp65504P783ReservdL;
            protected  int beginIp65504P784ReservdS;
            protected  int beginIp65504P784ReservdL;
            protected  int beginIp65504P785ReservdS;
            protected  int beginIp65504P785ReservdL;
            protected  int beginIp65504P786ReservdS;
            protected  int beginIp65504P786ReservdL;
            protected  int beginIp65504P787ReservdS;
            protected  int beginIp65504P787ReservdL;
            protected  int beginIp65504P788ReservdS;
            protected  int beginIp65504P788ReservdL;
            protected  int beginIp65504P789ReservdS;
            protected  int beginIp65504P789ReservdL;
            protected  int beginIp65504P790ReservdS;
            protected  int beginIp65504P790ReservdL;
            protected  int beginIp65504P791ReservdS;
            protected  int beginIp65504P791ReservdL;
            protected  int beginIp65504P792ReservdS;
            protected  int beginIp65504P792ReservdL;
            protected  int beginIp65504P793ReservdS;
            protected  int beginIp65504P793ReservdL;
            protected  int beginIp65504P794ReservdS;
            protected  int beginIp65504P794ReservdL;
            protected  int beginIp65504P795ReservdS;
            protected  int beginIp65504P795ReservdL;
            protected  int beginIp65504P796ReservdS;
            protected  int beginIp65504P796ReservdL;
            protected  int beginIp65504P797ReservdS;
            protected  int beginIp65504P797ReservdL;
            protected  int beginIp65504P798ReservdS;
            protected  int beginIp65504P798ReservdL;
            protected  int beginIp65504P799ReservdS;
            protected  int beginIp65504P799ReservdL;
            protected  int beginIp65504P800ReservdS;
            protected  int beginIp65504P800ReservdL;
            protected  int beginIp65504P801ReservdS;
            protected  int beginIp65504P801ReservdL;
            protected  int beginIp65504P802ReservdS;
            protected  int beginIp65504P802ReservdL;
            protected  int beginIp65504P803ReservdS;
            protected  int beginIp65504P803ReservdL;
            protected  int beginIp65504P804ReservdS;
            protected  int beginIp65504P804ReservdL;
            protected  int beginIp65504P805ReservdS;
            protected  int beginIp65504P805ReservdL;
            protected  int beginIp65504P806ReservdS;
            protected  int beginIp65504P806ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup26Serialized
	**/
    public Ip65504PdsNamesLargeGroup26Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup26Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup26Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup26Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,6196); // serialize this field at offset 6196 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup26Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 6196 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup26Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_26_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P776ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P776ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P777ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P777ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P778ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P778ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P779ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P779ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P780ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P780ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P781ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P781ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P782ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P782ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P783ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P783ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P784ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P784ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P785ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P785ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P786ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P786ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P787ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P787ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P788ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P788ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P789ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P789ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P790ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P790ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P791ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P791ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P792ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P792ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P793ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P793ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P794ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P794ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P795ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P795ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P796ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P796ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P797ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P797ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P798ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P798ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P799ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P799ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P800ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P800ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P801ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P801ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P802ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P802ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P803ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P803ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P804ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P804ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P805ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P805ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P806ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P806ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P776ReservdSCounter = -1;
         public boolean isIp65504P776ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P776ReservdSCounter != sharedCounter;
            localIp65504P776ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_776_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P776ReservdS
	 */
	protected void serializeIp65504P776ReservdS(short ip65504P776ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P776ReservdS,IP_65504_P_776_RESERVD_S_LEN)
                  ,beginIp65504P776ReservdS
                  ,IP_65504_P_776_RESERVD_S_LEN
                 );
            localIp65504P776ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P776ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P776ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P776ReservdS() {	 
			return (getShort(beginIp65504P776ReservdS));
   	}
         int localIp65504P776ReservdLCounter = -1;
         public boolean isIp65504P776ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P776ReservdLCounter != sharedCounter;
            localIp65504P776ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_776_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P776ReservdL
	 */
	protected void serializeIp65504P776ReservdL(short ip65504P776ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P776ReservdL,IP_65504_P_776_RESERVD_L_LEN)
                  ,beginIp65504P776ReservdL
                  ,IP_65504_P_776_RESERVD_L_LEN
                 );
            localIp65504P776ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P776ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P776ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P776ReservdL() {	 
			return (getShort(beginIp65504P776ReservdL));
   	}
         int localIp65504P777ReservdSCounter = -1;
         public boolean isIp65504P777ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P777ReservdSCounter != sharedCounter;
            localIp65504P777ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_777_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P777ReservdS
	 */
	protected void serializeIp65504P777ReservdS(short ip65504P777ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P777ReservdS,IP_65504_P_777_RESERVD_S_LEN)
                  ,beginIp65504P777ReservdS
                  ,IP_65504_P_777_RESERVD_S_LEN
                 );
            localIp65504P777ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P777ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P777ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P777ReservdS() {	 
			return (getShort(beginIp65504P777ReservdS));
   	}
         int localIp65504P777ReservdLCounter = -1;
         public boolean isIp65504P777ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P777ReservdLCounter != sharedCounter;
            localIp65504P777ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_777_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P777ReservdL
	 */
	protected void serializeIp65504P777ReservdL(short ip65504P777ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P777ReservdL,IP_65504_P_777_RESERVD_L_LEN)
                  ,beginIp65504P777ReservdL
                  ,IP_65504_P_777_RESERVD_L_LEN
                 );
            localIp65504P777ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P777ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P777ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P777ReservdL() {	 
			return (getShort(beginIp65504P777ReservdL));
   	}
         int localIp65504P778ReservdSCounter = -1;
         public boolean isIp65504P778ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P778ReservdSCounter != sharedCounter;
            localIp65504P778ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_778_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P778ReservdS
	 */
	protected void serializeIp65504P778ReservdS(short ip65504P778ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P778ReservdS,IP_65504_P_778_RESERVD_S_LEN)
                  ,beginIp65504P778ReservdS
                  ,IP_65504_P_778_RESERVD_S_LEN
                 );
            localIp65504P778ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P778ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P778ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P778ReservdS() {	 
			return (getShort(beginIp65504P778ReservdS));
   	}
         int localIp65504P778ReservdLCounter = -1;
         public boolean isIp65504P778ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P778ReservdLCounter != sharedCounter;
            localIp65504P778ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_778_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P778ReservdL
	 */
	protected void serializeIp65504P778ReservdL(short ip65504P778ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P778ReservdL,IP_65504_P_778_RESERVD_L_LEN)
                  ,beginIp65504P778ReservdL
                  ,IP_65504_P_778_RESERVD_L_LEN
                 );
            localIp65504P778ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P778ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P778ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P778ReservdL() {	 
			return (getShort(beginIp65504P778ReservdL));
   	}
         int localIp65504P779ReservdSCounter = -1;
         public boolean isIp65504P779ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P779ReservdSCounter != sharedCounter;
            localIp65504P779ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_779_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P779ReservdS
	 */
	protected void serializeIp65504P779ReservdS(short ip65504P779ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P779ReservdS,IP_65504_P_779_RESERVD_S_LEN)
                  ,beginIp65504P779ReservdS
                  ,IP_65504_P_779_RESERVD_S_LEN
                 );
            localIp65504P779ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P779ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P779ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P779ReservdS() {	 
			return (getShort(beginIp65504P779ReservdS));
   	}
         int localIp65504P779ReservdLCounter = -1;
         public boolean isIp65504P779ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P779ReservdLCounter != sharedCounter;
            localIp65504P779ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_779_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P779ReservdL
	 */
	protected void serializeIp65504P779ReservdL(short ip65504P779ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P779ReservdL,IP_65504_P_779_RESERVD_L_LEN)
                  ,beginIp65504P779ReservdL
                  ,IP_65504_P_779_RESERVD_L_LEN
                 );
            localIp65504P779ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P779ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P779ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P779ReservdL() {	 
			return (getShort(beginIp65504P779ReservdL));
   	}
         int localIp65504P780ReservdSCounter = -1;
         public boolean isIp65504P780ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P780ReservdSCounter != sharedCounter;
            localIp65504P780ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_780_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P780ReservdS
	 */
	protected void serializeIp65504P780ReservdS(short ip65504P780ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P780ReservdS,IP_65504_P_780_RESERVD_S_LEN)
                  ,beginIp65504P780ReservdS
                  ,IP_65504_P_780_RESERVD_S_LEN
                 );
            localIp65504P780ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P780ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P780ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P780ReservdS() {	 
			return (getShort(beginIp65504P780ReservdS));
   	}
         int localIp65504P780ReservdLCounter = -1;
         public boolean isIp65504P780ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P780ReservdLCounter != sharedCounter;
            localIp65504P780ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_780_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P780ReservdL
	 */
	protected void serializeIp65504P780ReservdL(short ip65504P780ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P780ReservdL,IP_65504_P_780_RESERVD_L_LEN)
                  ,beginIp65504P780ReservdL
                  ,IP_65504_P_780_RESERVD_L_LEN
                 );
            localIp65504P780ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P780ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P780ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P780ReservdL() {	 
			return (getShort(beginIp65504P780ReservdL));
   	}
         int localIp65504P781ReservdSCounter = -1;
         public boolean isIp65504P781ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P781ReservdSCounter != sharedCounter;
            localIp65504P781ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_781_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P781ReservdS
	 */
	protected void serializeIp65504P781ReservdS(short ip65504P781ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P781ReservdS,IP_65504_P_781_RESERVD_S_LEN)
                  ,beginIp65504P781ReservdS
                  ,IP_65504_P_781_RESERVD_S_LEN
                 );
            localIp65504P781ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P781ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P781ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P781ReservdS() {	 
			return (getShort(beginIp65504P781ReservdS));
   	}
         int localIp65504P781ReservdLCounter = -1;
         public boolean isIp65504P781ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P781ReservdLCounter != sharedCounter;
            localIp65504P781ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_781_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P781ReservdL
	 */
	protected void serializeIp65504P781ReservdL(short ip65504P781ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P781ReservdL,IP_65504_P_781_RESERVD_L_LEN)
                  ,beginIp65504P781ReservdL
                  ,IP_65504_P_781_RESERVD_L_LEN
                 );
            localIp65504P781ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P781ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P781ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P781ReservdL() {	 
			return (getShort(beginIp65504P781ReservdL));
   	}
         int localIp65504P782ReservdSCounter = -1;
         public boolean isIp65504P782ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P782ReservdSCounter != sharedCounter;
            localIp65504P782ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_782_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P782ReservdS
	 */
	protected void serializeIp65504P782ReservdS(short ip65504P782ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P782ReservdS,IP_65504_P_782_RESERVD_S_LEN)
                  ,beginIp65504P782ReservdS
                  ,IP_65504_P_782_RESERVD_S_LEN
                 );
            localIp65504P782ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P782ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P782ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P782ReservdS() {	 
			return (getShort(beginIp65504P782ReservdS));
   	}
         int localIp65504P782ReservdLCounter = -1;
         public boolean isIp65504P782ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P782ReservdLCounter != sharedCounter;
            localIp65504P782ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_782_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P782ReservdL
	 */
	protected void serializeIp65504P782ReservdL(short ip65504P782ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P782ReservdL,IP_65504_P_782_RESERVD_L_LEN)
                  ,beginIp65504P782ReservdL
                  ,IP_65504_P_782_RESERVD_L_LEN
                 );
            localIp65504P782ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P782ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P782ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P782ReservdL() {	 
			return (getShort(beginIp65504P782ReservdL));
   	}
         int localIp65504P783ReservdSCounter = -1;
         public boolean isIp65504P783ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P783ReservdSCounter != sharedCounter;
            localIp65504P783ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_783_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P783ReservdS
	 */
	protected void serializeIp65504P783ReservdS(short ip65504P783ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P783ReservdS,IP_65504_P_783_RESERVD_S_LEN)
                  ,beginIp65504P783ReservdS
                  ,IP_65504_P_783_RESERVD_S_LEN
                 );
            localIp65504P783ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P783ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P783ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P783ReservdS() {	 
			return (getShort(beginIp65504P783ReservdS));
   	}
         int localIp65504P783ReservdLCounter = -1;
         public boolean isIp65504P783ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P783ReservdLCounter != sharedCounter;
            localIp65504P783ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_783_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P783ReservdL
	 */
	protected void serializeIp65504P783ReservdL(short ip65504P783ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P783ReservdL,IP_65504_P_783_RESERVD_L_LEN)
                  ,beginIp65504P783ReservdL
                  ,IP_65504_P_783_RESERVD_L_LEN
                 );
            localIp65504P783ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P783ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P783ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P783ReservdL() {	 
			return (getShort(beginIp65504P783ReservdL));
   	}
         int localIp65504P784ReservdSCounter = -1;
         public boolean isIp65504P784ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P784ReservdSCounter != sharedCounter;
            localIp65504P784ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_784_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P784ReservdS
	 */
	protected void serializeIp65504P784ReservdS(short ip65504P784ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P784ReservdS,IP_65504_P_784_RESERVD_S_LEN)
                  ,beginIp65504P784ReservdS
                  ,IP_65504_P_784_RESERVD_S_LEN
                 );
            localIp65504P784ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P784ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P784ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P784ReservdS() {	 
			return (getShort(beginIp65504P784ReservdS));
   	}
         int localIp65504P784ReservdLCounter = -1;
         public boolean isIp65504P784ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P784ReservdLCounter != sharedCounter;
            localIp65504P784ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_784_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P784ReservdL
	 */
	protected void serializeIp65504P784ReservdL(short ip65504P784ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P784ReservdL,IP_65504_P_784_RESERVD_L_LEN)
                  ,beginIp65504P784ReservdL
                  ,IP_65504_P_784_RESERVD_L_LEN
                 );
            localIp65504P784ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P784ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P784ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P784ReservdL() {	 
			return (getShort(beginIp65504P784ReservdL));
   	}
         int localIp65504P785ReservdSCounter = -1;
         public boolean isIp65504P785ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P785ReservdSCounter != sharedCounter;
            localIp65504P785ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_785_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P785ReservdS
	 */
	protected void serializeIp65504P785ReservdS(short ip65504P785ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P785ReservdS,IP_65504_P_785_RESERVD_S_LEN)
                  ,beginIp65504P785ReservdS
                  ,IP_65504_P_785_RESERVD_S_LEN
                 );
            localIp65504P785ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P785ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P785ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P785ReservdS() {	 
			return (getShort(beginIp65504P785ReservdS));
   	}
         int localIp65504P785ReservdLCounter = -1;
         public boolean isIp65504P785ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P785ReservdLCounter != sharedCounter;
            localIp65504P785ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_785_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P785ReservdL
	 */
	protected void serializeIp65504P785ReservdL(short ip65504P785ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P785ReservdL,IP_65504_P_785_RESERVD_L_LEN)
                  ,beginIp65504P785ReservdL
                  ,IP_65504_P_785_RESERVD_L_LEN
                 );
            localIp65504P785ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P785ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P785ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P785ReservdL() {	 
			return (getShort(beginIp65504P785ReservdL));
   	}
         int localIp65504P786ReservdSCounter = -1;
         public boolean isIp65504P786ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P786ReservdSCounter != sharedCounter;
            localIp65504P786ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_786_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P786ReservdS
	 */
	protected void serializeIp65504P786ReservdS(short ip65504P786ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P786ReservdS,IP_65504_P_786_RESERVD_S_LEN)
                  ,beginIp65504P786ReservdS
                  ,IP_65504_P_786_RESERVD_S_LEN
                 );
            localIp65504P786ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P786ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P786ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P786ReservdS() {	 
			return (getShort(beginIp65504P786ReservdS));
   	}
         int localIp65504P786ReservdLCounter = -1;
         public boolean isIp65504P786ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P786ReservdLCounter != sharedCounter;
            localIp65504P786ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_786_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P786ReservdL
	 */
	protected void serializeIp65504P786ReservdL(short ip65504P786ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P786ReservdL,IP_65504_P_786_RESERVD_L_LEN)
                  ,beginIp65504P786ReservdL
                  ,IP_65504_P_786_RESERVD_L_LEN
                 );
            localIp65504P786ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P786ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P786ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P786ReservdL() {	 
			return (getShort(beginIp65504P786ReservdL));
   	}
         int localIp65504P787ReservdSCounter = -1;
         public boolean isIp65504P787ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P787ReservdSCounter != sharedCounter;
            localIp65504P787ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_787_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P787ReservdS
	 */
	protected void serializeIp65504P787ReservdS(short ip65504P787ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P787ReservdS,IP_65504_P_787_RESERVD_S_LEN)
                  ,beginIp65504P787ReservdS
                  ,IP_65504_P_787_RESERVD_S_LEN
                 );
            localIp65504P787ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P787ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P787ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P787ReservdS() {	 
			return (getShort(beginIp65504P787ReservdS));
   	}
         int localIp65504P787ReservdLCounter = -1;
         public boolean isIp65504P787ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P787ReservdLCounter != sharedCounter;
            localIp65504P787ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_787_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P787ReservdL
	 */
	protected void serializeIp65504P787ReservdL(short ip65504P787ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P787ReservdL,IP_65504_P_787_RESERVD_L_LEN)
                  ,beginIp65504P787ReservdL
                  ,IP_65504_P_787_RESERVD_L_LEN
                 );
            localIp65504P787ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P787ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P787ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P787ReservdL() {	 
			return (getShort(beginIp65504P787ReservdL));
   	}
         int localIp65504P788ReservdSCounter = -1;
         public boolean isIp65504P788ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P788ReservdSCounter != sharedCounter;
            localIp65504P788ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_788_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P788ReservdS
	 */
	protected void serializeIp65504P788ReservdS(short ip65504P788ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P788ReservdS,IP_65504_P_788_RESERVD_S_LEN)
                  ,beginIp65504P788ReservdS
                  ,IP_65504_P_788_RESERVD_S_LEN
                 );
            localIp65504P788ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P788ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P788ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P788ReservdS() {	 
			return (getShort(beginIp65504P788ReservdS));
   	}
         int localIp65504P788ReservdLCounter = -1;
         public boolean isIp65504P788ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P788ReservdLCounter != sharedCounter;
            localIp65504P788ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_788_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P788ReservdL
	 */
	protected void serializeIp65504P788ReservdL(short ip65504P788ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P788ReservdL,IP_65504_P_788_RESERVD_L_LEN)
                  ,beginIp65504P788ReservdL
                  ,IP_65504_P_788_RESERVD_L_LEN
                 );
            localIp65504P788ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P788ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P788ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P788ReservdL() {	 
			return (getShort(beginIp65504P788ReservdL));
   	}
         int localIp65504P789ReservdSCounter = -1;
         public boolean isIp65504P789ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P789ReservdSCounter != sharedCounter;
            localIp65504P789ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_789_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P789ReservdS
	 */
	protected void serializeIp65504P789ReservdS(short ip65504P789ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P789ReservdS,IP_65504_P_789_RESERVD_S_LEN)
                  ,beginIp65504P789ReservdS
                  ,IP_65504_P_789_RESERVD_S_LEN
                 );
            localIp65504P789ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P789ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P789ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P789ReservdS() {	 
			return (getShort(beginIp65504P789ReservdS));
   	}
         int localIp65504P789ReservdLCounter = -1;
         public boolean isIp65504P789ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P789ReservdLCounter != sharedCounter;
            localIp65504P789ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_789_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P789ReservdL
	 */
	protected void serializeIp65504P789ReservdL(short ip65504P789ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P789ReservdL,IP_65504_P_789_RESERVD_L_LEN)
                  ,beginIp65504P789ReservdL
                  ,IP_65504_P_789_RESERVD_L_LEN
                 );
            localIp65504P789ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P789ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P789ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P789ReservdL() {	 
			return (getShort(beginIp65504P789ReservdL));
   	}
         int localIp65504P790ReservdSCounter = -1;
         public boolean isIp65504P790ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P790ReservdSCounter != sharedCounter;
            localIp65504P790ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_790_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P790ReservdS
	 */
	protected void serializeIp65504P790ReservdS(short ip65504P790ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P790ReservdS,IP_65504_P_790_RESERVD_S_LEN)
                  ,beginIp65504P790ReservdS
                  ,IP_65504_P_790_RESERVD_S_LEN
                 );
            localIp65504P790ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P790ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P790ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P790ReservdS() {	 
			return (getShort(beginIp65504P790ReservdS));
   	}
         int localIp65504P790ReservdLCounter = -1;
         public boolean isIp65504P790ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P790ReservdLCounter != sharedCounter;
            localIp65504P790ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_790_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P790ReservdL
	 */
	protected void serializeIp65504P790ReservdL(short ip65504P790ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P790ReservdL,IP_65504_P_790_RESERVD_L_LEN)
                  ,beginIp65504P790ReservdL
                  ,IP_65504_P_790_RESERVD_L_LEN
                 );
            localIp65504P790ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P790ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P790ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P790ReservdL() {	 
			return (getShort(beginIp65504P790ReservdL));
   	}
         int localIp65504P791ReservdSCounter = -1;
         public boolean isIp65504P791ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P791ReservdSCounter != sharedCounter;
            localIp65504P791ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_791_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P791ReservdS
	 */
	protected void serializeIp65504P791ReservdS(short ip65504P791ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P791ReservdS,IP_65504_P_791_RESERVD_S_LEN)
                  ,beginIp65504P791ReservdS
                  ,IP_65504_P_791_RESERVD_S_LEN
                 );
            localIp65504P791ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P791ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P791ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P791ReservdS() {	 
			return (getShort(beginIp65504P791ReservdS));
   	}
         int localIp65504P791ReservdLCounter = -1;
         public boolean isIp65504P791ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P791ReservdLCounter != sharedCounter;
            localIp65504P791ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_791_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P791ReservdL
	 */
	protected void serializeIp65504P791ReservdL(short ip65504P791ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P791ReservdL,IP_65504_P_791_RESERVD_L_LEN)
                  ,beginIp65504P791ReservdL
                  ,IP_65504_P_791_RESERVD_L_LEN
                 );
            localIp65504P791ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P791ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P791ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P791ReservdL() {	 
			return (getShort(beginIp65504P791ReservdL));
   	}
         int localIp65504P792ReservdSCounter = -1;
         public boolean isIp65504P792ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P792ReservdSCounter != sharedCounter;
            localIp65504P792ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_792_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P792ReservdS
	 */
	protected void serializeIp65504P792ReservdS(short ip65504P792ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P792ReservdS,IP_65504_P_792_RESERVD_S_LEN)
                  ,beginIp65504P792ReservdS
                  ,IP_65504_P_792_RESERVD_S_LEN
                 );
            localIp65504P792ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P792ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P792ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P792ReservdS() {	 
			return (getShort(beginIp65504P792ReservdS));
   	}
         int localIp65504P792ReservdLCounter = -1;
         public boolean isIp65504P792ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P792ReservdLCounter != sharedCounter;
            localIp65504P792ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_792_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P792ReservdL
	 */
	protected void serializeIp65504P792ReservdL(short ip65504P792ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P792ReservdL,IP_65504_P_792_RESERVD_L_LEN)
                  ,beginIp65504P792ReservdL
                  ,IP_65504_P_792_RESERVD_L_LEN
                 );
            localIp65504P792ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P792ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P792ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P792ReservdL() {	 
			return (getShort(beginIp65504P792ReservdL));
   	}
         int localIp65504P793ReservdSCounter = -1;
         public boolean isIp65504P793ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P793ReservdSCounter != sharedCounter;
            localIp65504P793ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_793_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P793ReservdS
	 */
	protected void serializeIp65504P793ReservdS(short ip65504P793ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P793ReservdS,IP_65504_P_793_RESERVD_S_LEN)
                  ,beginIp65504P793ReservdS
                  ,IP_65504_P_793_RESERVD_S_LEN
                 );
            localIp65504P793ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P793ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P793ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P793ReservdS() {	 
			return (getShort(beginIp65504P793ReservdS));
   	}
         int localIp65504P793ReservdLCounter = -1;
         public boolean isIp65504P793ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P793ReservdLCounter != sharedCounter;
            localIp65504P793ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_793_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P793ReservdL
	 */
	protected void serializeIp65504P793ReservdL(short ip65504P793ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P793ReservdL,IP_65504_P_793_RESERVD_L_LEN)
                  ,beginIp65504P793ReservdL
                  ,IP_65504_P_793_RESERVD_L_LEN
                 );
            localIp65504P793ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P793ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P793ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P793ReservdL() {	 
			return (getShort(beginIp65504P793ReservdL));
   	}
         int localIp65504P794ReservdSCounter = -1;
         public boolean isIp65504P794ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P794ReservdSCounter != sharedCounter;
            localIp65504P794ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_794_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P794ReservdS
	 */
	protected void serializeIp65504P794ReservdS(short ip65504P794ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P794ReservdS,IP_65504_P_794_RESERVD_S_LEN)
                  ,beginIp65504P794ReservdS
                  ,IP_65504_P_794_RESERVD_S_LEN
                 );
            localIp65504P794ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P794ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P794ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P794ReservdS() {	 
			return (getShort(beginIp65504P794ReservdS));
   	}
         int localIp65504P794ReservdLCounter = -1;
         public boolean isIp65504P794ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P794ReservdLCounter != sharedCounter;
            localIp65504P794ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_794_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P794ReservdL
	 */
	protected void serializeIp65504P794ReservdL(short ip65504P794ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P794ReservdL,IP_65504_P_794_RESERVD_L_LEN)
                  ,beginIp65504P794ReservdL
                  ,IP_65504_P_794_RESERVD_L_LEN
                 );
            localIp65504P794ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P794ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P794ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P794ReservdL() {	 
			return (getShort(beginIp65504P794ReservdL));
   	}
         int localIp65504P795ReservdSCounter = -1;
         public boolean isIp65504P795ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P795ReservdSCounter != sharedCounter;
            localIp65504P795ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_795_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P795ReservdS
	 */
	protected void serializeIp65504P795ReservdS(short ip65504P795ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P795ReservdS,IP_65504_P_795_RESERVD_S_LEN)
                  ,beginIp65504P795ReservdS
                  ,IP_65504_P_795_RESERVD_S_LEN
                 );
            localIp65504P795ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P795ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P795ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P795ReservdS() {	 
			return (getShort(beginIp65504P795ReservdS));
   	}
         int localIp65504P795ReservdLCounter = -1;
         public boolean isIp65504P795ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P795ReservdLCounter != sharedCounter;
            localIp65504P795ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_795_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P795ReservdL
	 */
	protected void serializeIp65504P795ReservdL(short ip65504P795ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P795ReservdL,IP_65504_P_795_RESERVD_L_LEN)
                  ,beginIp65504P795ReservdL
                  ,IP_65504_P_795_RESERVD_L_LEN
                 );
            localIp65504P795ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P795ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P795ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P795ReservdL() {	 
			return (getShort(beginIp65504P795ReservdL));
   	}
         int localIp65504P796ReservdSCounter = -1;
         public boolean isIp65504P796ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P796ReservdSCounter != sharedCounter;
            localIp65504P796ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_796_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P796ReservdS
	 */
	protected void serializeIp65504P796ReservdS(short ip65504P796ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P796ReservdS,IP_65504_P_796_RESERVD_S_LEN)
                  ,beginIp65504P796ReservdS
                  ,IP_65504_P_796_RESERVD_S_LEN
                 );
            localIp65504P796ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P796ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P796ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P796ReservdS() {	 
			return (getShort(beginIp65504P796ReservdS));
   	}
         int localIp65504P796ReservdLCounter = -1;
         public boolean isIp65504P796ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P796ReservdLCounter != sharedCounter;
            localIp65504P796ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_796_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P796ReservdL
	 */
	protected void serializeIp65504P796ReservdL(short ip65504P796ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P796ReservdL,IP_65504_P_796_RESERVD_L_LEN)
                  ,beginIp65504P796ReservdL
                  ,IP_65504_P_796_RESERVD_L_LEN
                 );
            localIp65504P796ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P796ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P796ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P796ReservdL() {	 
			return (getShort(beginIp65504P796ReservdL));
   	}
         int localIp65504P797ReservdSCounter = -1;
         public boolean isIp65504P797ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P797ReservdSCounter != sharedCounter;
            localIp65504P797ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_797_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P797ReservdS
	 */
	protected void serializeIp65504P797ReservdS(short ip65504P797ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P797ReservdS,IP_65504_P_797_RESERVD_S_LEN)
                  ,beginIp65504P797ReservdS
                  ,IP_65504_P_797_RESERVD_S_LEN
                 );
            localIp65504P797ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P797ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P797ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P797ReservdS() {	 
			return (getShort(beginIp65504P797ReservdS));
   	}
         int localIp65504P797ReservdLCounter = -1;
         public boolean isIp65504P797ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P797ReservdLCounter != sharedCounter;
            localIp65504P797ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_797_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P797ReservdL
	 */
	protected void serializeIp65504P797ReservdL(short ip65504P797ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P797ReservdL,IP_65504_P_797_RESERVD_L_LEN)
                  ,beginIp65504P797ReservdL
                  ,IP_65504_P_797_RESERVD_L_LEN
                 );
            localIp65504P797ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P797ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P797ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P797ReservdL() {	 
			return (getShort(beginIp65504P797ReservdL));
   	}
         int localIp65504P798ReservdSCounter = -1;
         public boolean isIp65504P798ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P798ReservdSCounter != sharedCounter;
            localIp65504P798ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_798_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P798ReservdS
	 */
	protected void serializeIp65504P798ReservdS(short ip65504P798ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P798ReservdS,IP_65504_P_798_RESERVD_S_LEN)
                  ,beginIp65504P798ReservdS
                  ,IP_65504_P_798_RESERVD_S_LEN
                 );
            localIp65504P798ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P798ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P798ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P798ReservdS() {	 
			return (getShort(beginIp65504P798ReservdS));
   	}
         int localIp65504P798ReservdLCounter = -1;
         public boolean isIp65504P798ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P798ReservdLCounter != sharedCounter;
            localIp65504P798ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_798_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P798ReservdL
	 */
	protected void serializeIp65504P798ReservdL(short ip65504P798ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P798ReservdL,IP_65504_P_798_RESERVD_L_LEN)
                  ,beginIp65504P798ReservdL
                  ,IP_65504_P_798_RESERVD_L_LEN
                 );
            localIp65504P798ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P798ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P798ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P798ReservdL() {	 
			return (getShort(beginIp65504P798ReservdL));
   	}
         int localIp65504P799ReservdSCounter = -1;
         public boolean isIp65504P799ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P799ReservdSCounter != sharedCounter;
            localIp65504P799ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_799_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P799ReservdS
	 */
	protected void serializeIp65504P799ReservdS(short ip65504P799ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P799ReservdS,IP_65504_P_799_RESERVD_S_LEN)
                  ,beginIp65504P799ReservdS
                  ,IP_65504_P_799_RESERVD_S_LEN
                 );
            localIp65504P799ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P799ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P799ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P799ReservdS() {	 
			return (getShort(beginIp65504P799ReservdS));
   	}
         int localIp65504P799ReservdLCounter = -1;
         public boolean isIp65504P799ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P799ReservdLCounter != sharedCounter;
            localIp65504P799ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_799_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P799ReservdL
	 */
	protected void serializeIp65504P799ReservdL(short ip65504P799ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P799ReservdL,IP_65504_P_799_RESERVD_L_LEN)
                  ,beginIp65504P799ReservdL
                  ,IP_65504_P_799_RESERVD_L_LEN
                 );
            localIp65504P799ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P799ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P799ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P799ReservdL() {	 
			return (getShort(beginIp65504P799ReservdL));
   	}
         int localIp65504P800ReservdSCounter = -1;
         public boolean isIp65504P800ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P800ReservdSCounter != sharedCounter;
            localIp65504P800ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_800_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P800ReservdS
	 */
	protected void serializeIp65504P800ReservdS(short ip65504P800ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P800ReservdS,IP_65504_P_800_RESERVD_S_LEN)
                  ,beginIp65504P800ReservdS
                  ,IP_65504_P_800_RESERVD_S_LEN
                 );
            localIp65504P800ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P800ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P800ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P800ReservdS() {	 
			return (getShort(beginIp65504P800ReservdS));
   	}
         int localIp65504P800ReservdLCounter = -1;
         public boolean isIp65504P800ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P800ReservdLCounter != sharedCounter;
            localIp65504P800ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_800_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P800ReservdL
	 */
	protected void serializeIp65504P800ReservdL(short ip65504P800ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P800ReservdL,IP_65504_P_800_RESERVD_L_LEN)
                  ,beginIp65504P800ReservdL
                  ,IP_65504_P_800_RESERVD_L_LEN
                 );
            localIp65504P800ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P800ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P800ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P800ReservdL() {	 
			return (getShort(beginIp65504P800ReservdL));
   	}
         int localIp65504P801ReservdSCounter = -1;
         public boolean isIp65504P801ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P801ReservdSCounter != sharedCounter;
            localIp65504P801ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_801_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P801ReservdS
	 */
	protected void serializeIp65504P801ReservdS(short ip65504P801ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P801ReservdS,IP_65504_P_801_RESERVD_S_LEN)
                  ,beginIp65504P801ReservdS
                  ,IP_65504_P_801_RESERVD_S_LEN
                 );
            localIp65504P801ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P801ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P801ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P801ReservdS() {	 
			return (getShort(beginIp65504P801ReservdS));
   	}
         int localIp65504P801ReservdLCounter = -1;
         public boolean isIp65504P801ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P801ReservdLCounter != sharedCounter;
            localIp65504P801ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_801_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P801ReservdL
	 */
	protected void serializeIp65504P801ReservdL(short ip65504P801ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P801ReservdL,IP_65504_P_801_RESERVD_L_LEN)
                  ,beginIp65504P801ReservdL
                  ,IP_65504_P_801_RESERVD_L_LEN
                 );
            localIp65504P801ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P801ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P801ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P801ReservdL() {	 
			return (getShort(beginIp65504P801ReservdL));
   	}
         int localIp65504P802ReservdSCounter = -1;
         public boolean isIp65504P802ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P802ReservdSCounter != sharedCounter;
            localIp65504P802ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_802_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P802ReservdS
	 */
	protected void serializeIp65504P802ReservdS(short ip65504P802ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P802ReservdS,IP_65504_P_802_RESERVD_S_LEN)
                  ,beginIp65504P802ReservdS
                  ,IP_65504_P_802_RESERVD_S_LEN
                 );
            localIp65504P802ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P802ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P802ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P802ReservdS() {	 
			return (getShort(beginIp65504P802ReservdS));
   	}
         int localIp65504P802ReservdLCounter = -1;
         public boolean isIp65504P802ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P802ReservdLCounter != sharedCounter;
            localIp65504P802ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_802_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P802ReservdL
	 */
	protected void serializeIp65504P802ReservdL(short ip65504P802ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P802ReservdL,IP_65504_P_802_RESERVD_L_LEN)
                  ,beginIp65504P802ReservdL
                  ,IP_65504_P_802_RESERVD_L_LEN
                 );
            localIp65504P802ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P802ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P802ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P802ReservdL() {	 
			return (getShort(beginIp65504P802ReservdL));
   	}
         int localIp65504P803ReservdSCounter = -1;
         public boolean isIp65504P803ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P803ReservdSCounter != sharedCounter;
            localIp65504P803ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_803_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P803ReservdS
	 */
	protected void serializeIp65504P803ReservdS(short ip65504P803ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P803ReservdS,IP_65504_P_803_RESERVD_S_LEN)
                  ,beginIp65504P803ReservdS
                  ,IP_65504_P_803_RESERVD_S_LEN
                 );
            localIp65504P803ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P803ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P803ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P803ReservdS() {	 
			return (getShort(beginIp65504P803ReservdS));
   	}
         int localIp65504P803ReservdLCounter = -1;
         public boolean isIp65504P803ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P803ReservdLCounter != sharedCounter;
            localIp65504P803ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_803_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P803ReservdL
	 */
	protected void serializeIp65504P803ReservdL(short ip65504P803ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P803ReservdL,IP_65504_P_803_RESERVD_L_LEN)
                  ,beginIp65504P803ReservdL
                  ,IP_65504_P_803_RESERVD_L_LEN
                 );
            localIp65504P803ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P803ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P803ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P803ReservdL() {	 
			return (getShort(beginIp65504P803ReservdL));
   	}
         int localIp65504P804ReservdSCounter = -1;
         public boolean isIp65504P804ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P804ReservdSCounter != sharedCounter;
            localIp65504P804ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_804_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P804ReservdS
	 */
	protected void serializeIp65504P804ReservdS(short ip65504P804ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P804ReservdS,IP_65504_P_804_RESERVD_S_LEN)
                  ,beginIp65504P804ReservdS
                  ,IP_65504_P_804_RESERVD_S_LEN
                 );
            localIp65504P804ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P804ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P804ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P804ReservdS() {	 
			return (getShort(beginIp65504P804ReservdS));
   	}
         int localIp65504P804ReservdLCounter = -1;
         public boolean isIp65504P804ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P804ReservdLCounter != sharedCounter;
            localIp65504P804ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_804_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P804ReservdL
	 */
	protected void serializeIp65504P804ReservdL(short ip65504P804ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P804ReservdL,IP_65504_P_804_RESERVD_L_LEN)
                  ,beginIp65504P804ReservdL
                  ,IP_65504_P_804_RESERVD_L_LEN
                 );
            localIp65504P804ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P804ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P804ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P804ReservdL() {	 
			return (getShort(beginIp65504P804ReservdL));
   	}
         int localIp65504P805ReservdSCounter = -1;
         public boolean isIp65504P805ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P805ReservdSCounter != sharedCounter;
            localIp65504P805ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_805_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P805ReservdS
	 */
	protected void serializeIp65504P805ReservdS(short ip65504P805ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P805ReservdS,IP_65504_P_805_RESERVD_S_LEN)
                  ,beginIp65504P805ReservdS
                  ,IP_65504_P_805_RESERVD_S_LEN
                 );
            localIp65504P805ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P805ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P805ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P805ReservdS() {	 
			return (getShort(beginIp65504P805ReservdS));
   	}
         int localIp65504P805ReservdLCounter = -1;
         public boolean isIp65504P805ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P805ReservdLCounter != sharedCounter;
            localIp65504P805ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_805_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P805ReservdL
	 */
	protected void serializeIp65504P805ReservdL(short ip65504P805ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P805ReservdL,IP_65504_P_805_RESERVD_L_LEN)
                  ,beginIp65504P805ReservdL
                  ,IP_65504_P_805_RESERVD_L_LEN
                 );
            localIp65504P805ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P805ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P805ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P805ReservdL() {	 
			return (getShort(beginIp65504P805ReservdL));
   	}
         int localIp65504P806ReservdSCounter = -1;
         public boolean isIp65504P806ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P806ReservdSCounter != sharedCounter;
            localIp65504P806ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_806_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P806ReservdS
	 */
	protected void serializeIp65504P806ReservdS(short ip65504P806ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P806ReservdS,IP_65504_P_806_RESERVD_S_LEN)
                  ,beginIp65504P806ReservdS
                  ,IP_65504_P_806_RESERVD_S_LEN
                 );
            localIp65504P806ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P806ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P806ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P806ReservdS() {	 
			return (getShort(beginIp65504P806ReservdS));
   	}
         int localIp65504P806ReservdLCounter = -1;
         public boolean isIp65504P806ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P806ReservdLCounter != sharedCounter;
            localIp65504P806ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_806_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P806ReservdL
	 */
	protected void serializeIp65504P806ReservdL(short ip65504P806ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P806ReservdL,IP_65504_P_806_RESERVD_L_LEN)
                  ,beginIp65504P806ReservdL
                  ,IP_65504_P_806_RESERVD_L_LEN
                 );
            localIp65504P806ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P806ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P806ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P806ReservdL() {	 
			return (getShort(beginIp65504P806ReservdL));
   	}




}
  
