package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup33Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup33Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup33Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_33_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P993ReservdS;
            protected  int beginIp65504P993ReservdL;
            protected  int beginIp65504P994ReservdS;
            protected  int beginIp65504P994ReservdL;
            protected  int beginIp65504P995ReservdS;
            protected  int beginIp65504P995ReservdL;
            protected  int beginIp65504P996ReservdS;
            protected  int beginIp65504P996ReservdL;
            protected  int beginIp65504P997ReservdS;
            protected  int beginIp65504P997ReservdL;
            protected  int beginIp65504P998ReservdS;
            protected  int beginIp65504P998ReservdL;
            protected  int beginIp65504P999ReservdS;
            protected  int beginIp65504P999ReservdL;
            protected  int beginIp65504P1000MemdataS;
            protected  int beginIp65504P1000MemdataL;
            protected  int beginIp65504P1001MemdataS;
            protected  int beginIp65504P1001MemdataL;
            protected  int beginIp65504P1002MemdataS;
            protected  int beginIp65504P1002MemdataL;
            protected  int beginIp65504P1003MemdataS;
            protected  int beginIp65504P1003MemdataL;
            protected  int beginIp65504P1004MemdataS;
            protected  int beginIp65504P1004MemdataL;
            protected  int beginIp65504P1005MemdataS;
            protected  int beginIp65504P1005MemdataL;
            protected  int beginIp65504P1006MemdataS;
            protected  int beginIp65504P1006MemdataL;
            protected  int beginIp65504P1007MemdataS;
            protected  int beginIp65504P1007MemdataL;
            protected  int beginIp65504P1008MemdataS;
            protected  int beginIp65504P1008MemdataL;
            protected  int beginIp65504P1009MemdataS;
            protected  int beginIp65504P1009MemdataL;
            protected  int beginIp65504P1010MemdataS;
            protected  int beginIp65504P1010MemdataL;
            protected  int beginIp65504P1011MemdataS;
            protected  int beginIp65504P1011MemdataL;
            protected  int beginIp65504P1012MemdataS;
            protected  int beginIp65504P1012MemdataL;
            protected  int beginIp65504P1013MemdataS;
            protected  int beginIp65504P1013MemdataL;
            protected  int beginIp65504P1014MemdataS;
            protected  int beginIp65504P1014MemdataL;
            protected  int beginIp65504P1015MemdataS;
            protected  int beginIp65504P1015MemdataL;
            protected  int beginIp65504P1016MemdataS;
            protected  int beginIp65504P1016MemdataL;
            protected  int beginIp65504P1017MemdataS;
            protected  int beginIp65504P1017MemdataL;
            protected  int beginIp65504P1018MemdataS;
            protected  int beginIp65504P1018MemdataL;
            protected  int beginIp65504P1019MemdataS;
            protected  int beginIp65504P1019MemdataL;
            protected  int beginIp65504P1020MemdataS;
            protected  int beginIp65504P1020MemdataL;
            protected  int beginIp65504P1021MemdataS;
            protected  int beginIp65504P1021MemdataL;
            protected  int beginIp65504P1022MemdataS;
            protected  int beginIp65504P1022MemdataL;
            protected  int beginIp65504P1023MemdataS;
            protected  int beginIp65504P1023MemdataL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup33Serialized
	**/
    public Ip65504PdsNamesLargeGroup33Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup33Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup33Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup33Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7932); // serialize this field at offset 7932 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup33Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7932 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup33Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_33_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P993ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P993ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P994ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P994ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P995ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P995ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P996ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P996ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P997ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P997ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P998ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P998ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P999ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P999ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1000MemdataS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1000MemdataL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1001MemdataS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1001MemdataL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1002MemdataS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1002MemdataL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1003MemdataS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1003MemdataL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1004MemdataS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1004MemdataL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1005MemdataS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1005MemdataL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1006MemdataS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1006MemdataL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1007MemdataS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1007MemdataL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1008MemdataS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1008MemdataL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1009MemdataS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1009MemdataL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1010MemdataS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1010MemdataL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1011MemdataS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1011MemdataL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1012MemdataS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1012MemdataL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1013MemdataS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1013MemdataL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1014MemdataS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1014MemdataL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1015MemdataS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1015MemdataL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1016MemdataS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1016MemdataL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1017MemdataS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1017MemdataL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1018MemdataS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1018MemdataL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1019MemdataS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1019MemdataL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1020MemdataS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1020MemdataL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1021MemdataS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1021MemdataL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1022MemdataS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1022MemdataL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1023MemdataS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1023MemdataL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P993ReservdSCounter = -1;
         public boolean isIp65504P993ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P993ReservdSCounter != sharedCounter;
            localIp65504P993ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_993_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P993ReservdS
	 */
	protected void serializeIp65504P993ReservdS(short ip65504P993ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P993ReservdS,IP_65504_P_993_RESERVD_S_LEN)
                  ,beginIp65504P993ReservdS
                  ,IP_65504_P_993_RESERVD_S_LEN
                 );
            localIp65504P993ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P993ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P993ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P993ReservdS() {	 
			return (getShort(beginIp65504P993ReservdS));
   	}
         int localIp65504P993ReservdLCounter = -1;
         public boolean isIp65504P993ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P993ReservdLCounter != sharedCounter;
            localIp65504P993ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_993_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P993ReservdL
	 */
	protected void serializeIp65504P993ReservdL(short ip65504P993ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P993ReservdL,IP_65504_P_993_RESERVD_L_LEN)
                  ,beginIp65504P993ReservdL
                  ,IP_65504_P_993_RESERVD_L_LEN
                 );
            localIp65504P993ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P993ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P993ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P993ReservdL() {	 
			return (getShort(beginIp65504P993ReservdL));
   	}
         int localIp65504P994ReservdSCounter = -1;
         public boolean isIp65504P994ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P994ReservdSCounter != sharedCounter;
            localIp65504P994ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_994_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P994ReservdS
	 */
	protected void serializeIp65504P994ReservdS(short ip65504P994ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P994ReservdS,IP_65504_P_994_RESERVD_S_LEN)
                  ,beginIp65504P994ReservdS
                  ,IP_65504_P_994_RESERVD_S_LEN
                 );
            localIp65504P994ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P994ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P994ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P994ReservdS() {	 
			return (getShort(beginIp65504P994ReservdS));
   	}
         int localIp65504P994ReservdLCounter = -1;
         public boolean isIp65504P994ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P994ReservdLCounter != sharedCounter;
            localIp65504P994ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_994_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P994ReservdL
	 */
	protected void serializeIp65504P994ReservdL(short ip65504P994ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P994ReservdL,IP_65504_P_994_RESERVD_L_LEN)
                  ,beginIp65504P994ReservdL
                  ,IP_65504_P_994_RESERVD_L_LEN
                 );
            localIp65504P994ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P994ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P994ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P994ReservdL() {	 
			return (getShort(beginIp65504P994ReservdL));
   	}
         int localIp65504P995ReservdSCounter = -1;
         public boolean isIp65504P995ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P995ReservdSCounter != sharedCounter;
            localIp65504P995ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_995_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P995ReservdS
	 */
	protected void serializeIp65504P995ReservdS(short ip65504P995ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P995ReservdS,IP_65504_P_995_RESERVD_S_LEN)
                  ,beginIp65504P995ReservdS
                  ,IP_65504_P_995_RESERVD_S_LEN
                 );
            localIp65504P995ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P995ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P995ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P995ReservdS() {	 
			return (getShort(beginIp65504P995ReservdS));
   	}
         int localIp65504P995ReservdLCounter = -1;
         public boolean isIp65504P995ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P995ReservdLCounter != sharedCounter;
            localIp65504P995ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_995_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P995ReservdL
	 */
	protected void serializeIp65504P995ReservdL(short ip65504P995ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P995ReservdL,IP_65504_P_995_RESERVD_L_LEN)
                  ,beginIp65504P995ReservdL
                  ,IP_65504_P_995_RESERVD_L_LEN
                 );
            localIp65504P995ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P995ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P995ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P995ReservdL() {	 
			return (getShort(beginIp65504P995ReservdL));
   	}
         int localIp65504P996ReservdSCounter = -1;
         public boolean isIp65504P996ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P996ReservdSCounter != sharedCounter;
            localIp65504P996ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_996_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P996ReservdS
	 */
	protected void serializeIp65504P996ReservdS(short ip65504P996ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P996ReservdS,IP_65504_P_996_RESERVD_S_LEN)
                  ,beginIp65504P996ReservdS
                  ,IP_65504_P_996_RESERVD_S_LEN
                 );
            localIp65504P996ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P996ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P996ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P996ReservdS() {	 
			return (getShort(beginIp65504P996ReservdS));
   	}
         int localIp65504P996ReservdLCounter = -1;
         public boolean isIp65504P996ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P996ReservdLCounter != sharedCounter;
            localIp65504P996ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_996_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P996ReservdL
	 */
	protected void serializeIp65504P996ReservdL(short ip65504P996ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P996ReservdL,IP_65504_P_996_RESERVD_L_LEN)
                  ,beginIp65504P996ReservdL
                  ,IP_65504_P_996_RESERVD_L_LEN
                 );
            localIp65504P996ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P996ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P996ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P996ReservdL() {	 
			return (getShort(beginIp65504P996ReservdL));
   	}
         int localIp65504P997ReservdSCounter = -1;
         public boolean isIp65504P997ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P997ReservdSCounter != sharedCounter;
            localIp65504P997ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_997_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P997ReservdS
	 */
	protected void serializeIp65504P997ReservdS(short ip65504P997ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P997ReservdS,IP_65504_P_997_RESERVD_S_LEN)
                  ,beginIp65504P997ReservdS
                  ,IP_65504_P_997_RESERVD_S_LEN
                 );
            localIp65504P997ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P997ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P997ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P997ReservdS() {	 
			return (getShort(beginIp65504P997ReservdS));
   	}
         int localIp65504P997ReservdLCounter = -1;
         public boolean isIp65504P997ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P997ReservdLCounter != sharedCounter;
            localIp65504P997ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_997_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P997ReservdL
	 */
	protected void serializeIp65504P997ReservdL(short ip65504P997ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P997ReservdL,IP_65504_P_997_RESERVD_L_LEN)
                  ,beginIp65504P997ReservdL
                  ,IP_65504_P_997_RESERVD_L_LEN
                 );
            localIp65504P997ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P997ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P997ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P997ReservdL() {	 
			return (getShort(beginIp65504P997ReservdL));
   	}
         int localIp65504P998ReservdSCounter = -1;
         public boolean isIp65504P998ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P998ReservdSCounter != sharedCounter;
            localIp65504P998ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_998_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P998ReservdS
	 */
	protected void serializeIp65504P998ReservdS(short ip65504P998ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P998ReservdS,IP_65504_P_998_RESERVD_S_LEN)
                  ,beginIp65504P998ReservdS
                  ,IP_65504_P_998_RESERVD_S_LEN
                 );
            localIp65504P998ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P998ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P998ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P998ReservdS() {	 
			return (getShort(beginIp65504P998ReservdS));
   	}
         int localIp65504P998ReservdLCounter = -1;
         public boolean isIp65504P998ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P998ReservdLCounter != sharedCounter;
            localIp65504P998ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_998_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P998ReservdL
	 */
	protected void serializeIp65504P998ReservdL(short ip65504P998ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P998ReservdL,IP_65504_P_998_RESERVD_L_LEN)
                  ,beginIp65504P998ReservdL
                  ,IP_65504_P_998_RESERVD_L_LEN
                 );
            localIp65504P998ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P998ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P998ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P998ReservdL() {	 
			return (getShort(beginIp65504P998ReservdL));
   	}
         int localIp65504P999ReservdSCounter = -1;
         public boolean isIp65504P999ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P999ReservdSCounter != sharedCounter;
            localIp65504P999ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_999_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P999ReservdS
	 */
	protected void serializeIp65504P999ReservdS(short ip65504P999ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P999ReservdS,IP_65504_P_999_RESERVD_S_LEN)
                  ,beginIp65504P999ReservdS
                  ,IP_65504_P_999_RESERVD_S_LEN
                 );
            localIp65504P999ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P999ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P999ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P999ReservdS() {	 
			return (getShort(beginIp65504P999ReservdS));
   	}
         int localIp65504P999ReservdLCounter = -1;
         public boolean isIp65504P999ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P999ReservdLCounter != sharedCounter;
            localIp65504P999ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_999_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P999ReservdL
	 */
	protected void serializeIp65504P999ReservdL(short ip65504P999ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P999ReservdL,IP_65504_P_999_RESERVD_L_LEN)
                  ,beginIp65504P999ReservdL
                  ,IP_65504_P_999_RESERVD_L_LEN
                 );
            localIp65504P999ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P999ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P999ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P999ReservdL() {	 
			return (getShort(beginIp65504P999ReservdL));
   	}
         int localIp65504P1000MemdataSCounter = -1;
         public boolean isIp65504P1000MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1000MemdataSCounter != sharedCounter;
            localIp65504P1000MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1000_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1000MemdataS
	 */
	protected void serializeIp65504P1000MemdataS(short ip65504P1000MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1000MemdataS,IP_65504_P_1000_MEMDATA_S_LEN)
                  ,beginIp65504P1000MemdataS
                  ,IP_65504_P_1000_MEMDATA_S_LEN
                 );
            localIp65504P1000MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1000MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1000MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1000MemdataS() {	 
			return (getShort(beginIp65504P1000MemdataS));
   	}
         int localIp65504P1000MemdataLCounter = -1;
         public boolean isIp65504P1000MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1000MemdataLCounter != sharedCounter;
            localIp65504P1000MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1000_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1000MemdataL
	 */
	protected void serializeIp65504P1000MemdataL(short ip65504P1000MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1000MemdataL,IP_65504_P_1000_MEMDATA_L_LEN)
                  ,beginIp65504P1000MemdataL
                  ,IP_65504_P_1000_MEMDATA_L_LEN
                 );
            localIp65504P1000MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1000MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1000MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1000MemdataL() {	 
			return (getShort(beginIp65504P1000MemdataL));
   	}
         int localIp65504P1001MemdataSCounter = -1;
         public boolean isIp65504P1001MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1001MemdataSCounter != sharedCounter;
            localIp65504P1001MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1001_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1001MemdataS
	 */
	protected void serializeIp65504P1001MemdataS(short ip65504P1001MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1001MemdataS,IP_65504_P_1001_MEMDATA_S_LEN)
                  ,beginIp65504P1001MemdataS
                  ,IP_65504_P_1001_MEMDATA_S_LEN
                 );
            localIp65504P1001MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1001MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1001MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1001MemdataS() {	 
			return (getShort(beginIp65504P1001MemdataS));
   	}
         int localIp65504P1001MemdataLCounter = -1;
         public boolean isIp65504P1001MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1001MemdataLCounter != sharedCounter;
            localIp65504P1001MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1001_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1001MemdataL
	 */
	protected void serializeIp65504P1001MemdataL(short ip65504P1001MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1001MemdataL,IP_65504_P_1001_MEMDATA_L_LEN)
                  ,beginIp65504P1001MemdataL
                  ,IP_65504_P_1001_MEMDATA_L_LEN
                 );
            localIp65504P1001MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1001MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1001MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1001MemdataL() {	 
			return (getShort(beginIp65504P1001MemdataL));
   	}
         int localIp65504P1002MemdataSCounter = -1;
         public boolean isIp65504P1002MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1002MemdataSCounter != sharedCounter;
            localIp65504P1002MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1002_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1002MemdataS
	 */
	protected void serializeIp65504P1002MemdataS(short ip65504P1002MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1002MemdataS,IP_65504_P_1002_MEMDATA_S_LEN)
                  ,beginIp65504P1002MemdataS
                  ,IP_65504_P_1002_MEMDATA_S_LEN
                 );
            localIp65504P1002MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1002MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1002MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1002MemdataS() {	 
			return (getShort(beginIp65504P1002MemdataS));
   	}
         int localIp65504P1002MemdataLCounter = -1;
         public boolean isIp65504P1002MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1002MemdataLCounter != sharedCounter;
            localIp65504P1002MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1002_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1002MemdataL
	 */
	protected void serializeIp65504P1002MemdataL(short ip65504P1002MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1002MemdataL,IP_65504_P_1002_MEMDATA_L_LEN)
                  ,beginIp65504P1002MemdataL
                  ,IP_65504_P_1002_MEMDATA_L_LEN
                 );
            localIp65504P1002MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1002MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1002MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1002MemdataL() {	 
			return (getShort(beginIp65504P1002MemdataL));
   	}
         int localIp65504P1003MemdataSCounter = -1;
         public boolean isIp65504P1003MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1003MemdataSCounter != sharedCounter;
            localIp65504P1003MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1003_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1003MemdataS
	 */
	protected void serializeIp65504P1003MemdataS(short ip65504P1003MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1003MemdataS,IP_65504_P_1003_MEMDATA_S_LEN)
                  ,beginIp65504P1003MemdataS
                  ,IP_65504_P_1003_MEMDATA_S_LEN
                 );
            localIp65504P1003MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1003MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1003MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1003MemdataS() {	 
			return (getShort(beginIp65504P1003MemdataS));
   	}
         int localIp65504P1003MemdataLCounter = -1;
         public boolean isIp65504P1003MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1003MemdataLCounter != sharedCounter;
            localIp65504P1003MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1003_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1003MemdataL
	 */
	protected void serializeIp65504P1003MemdataL(short ip65504P1003MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1003MemdataL,IP_65504_P_1003_MEMDATA_L_LEN)
                  ,beginIp65504P1003MemdataL
                  ,IP_65504_P_1003_MEMDATA_L_LEN
                 );
            localIp65504P1003MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1003MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1003MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1003MemdataL() {	 
			return (getShort(beginIp65504P1003MemdataL));
   	}
         int localIp65504P1004MemdataSCounter = -1;
         public boolean isIp65504P1004MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1004MemdataSCounter != sharedCounter;
            localIp65504P1004MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1004_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1004MemdataS
	 */
	protected void serializeIp65504P1004MemdataS(short ip65504P1004MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1004MemdataS,IP_65504_P_1004_MEMDATA_S_LEN)
                  ,beginIp65504P1004MemdataS
                  ,IP_65504_P_1004_MEMDATA_S_LEN
                 );
            localIp65504P1004MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1004MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1004MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1004MemdataS() {	 
			return (getShort(beginIp65504P1004MemdataS));
   	}
         int localIp65504P1004MemdataLCounter = -1;
         public boolean isIp65504P1004MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1004MemdataLCounter != sharedCounter;
            localIp65504P1004MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1004_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1004MemdataL
	 */
	protected void serializeIp65504P1004MemdataL(short ip65504P1004MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1004MemdataL,IP_65504_P_1004_MEMDATA_L_LEN)
                  ,beginIp65504P1004MemdataL
                  ,IP_65504_P_1004_MEMDATA_L_LEN
                 );
            localIp65504P1004MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1004MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1004MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1004MemdataL() {	 
			return (getShort(beginIp65504P1004MemdataL));
   	}
         int localIp65504P1005MemdataSCounter = -1;
         public boolean isIp65504P1005MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1005MemdataSCounter != sharedCounter;
            localIp65504P1005MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1005_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1005MemdataS
	 */
	protected void serializeIp65504P1005MemdataS(short ip65504P1005MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1005MemdataS,IP_65504_P_1005_MEMDATA_S_LEN)
                  ,beginIp65504P1005MemdataS
                  ,IP_65504_P_1005_MEMDATA_S_LEN
                 );
            localIp65504P1005MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1005MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1005MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1005MemdataS() {	 
			return (getShort(beginIp65504P1005MemdataS));
   	}
         int localIp65504P1005MemdataLCounter = -1;
         public boolean isIp65504P1005MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1005MemdataLCounter != sharedCounter;
            localIp65504P1005MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1005_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1005MemdataL
	 */
	protected void serializeIp65504P1005MemdataL(short ip65504P1005MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1005MemdataL,IP_65504_P_1005_MEMDATA_L_LEN)
                  ,beginIp65504P1005MemdataL
                  ,IP_65504_P_1005_MEMDATA_L_LEN
                 );
            localIp65504P1005MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1005MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1005MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1005MemdataL() {	 
			return (getShort(beginIp65504P1005MemdataL));
   	}
         int localIp65504P1006MemdataSCounter = -1;
         public boolean isIp65504P1006MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1006MemdataSCounter != sharedCounter;
            localIp65504P1006MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1006_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1006MemdataS
	 */
	protected void serializeIp65504P1006MemdataS(short ip65504P1006MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1006MemdataS,IP_65504_P_1006_MEMDATA_S_LEN)
                  ,beginIp65504P1006MemdataS
                  ,IP_65504_P_1006_MEMDATA_S_LEN
                 );
            localIp65504P1006MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1006MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1006MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1006MemdataS() {	 
			return (getShort(beginIp65504P1006MemdataS));
   	}
         int localIp65504P1006MemdataLCounter = -1;
         public boolean isIp65504P1006MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1006MemdataLCounter != sharedCounter;
            localIp65504P1006MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1006_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1006MemdataL
	 */
	protected void serializeIp65504P1006MemdataL(short ip65504P1006MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1006MemdataL,IP_65504_P_1006_MEMDATA_L_LEN)
                  ,beginIp65504P1006MemdataL
                  ,IP_65504_P_1006_MEMDATA_L_LEN
                 );
            localIp65504P1006MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1006MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1006MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1006MemdataL() {	 
			return (getShort(beginIp65504P1006MemdataL));
   	}
         int localIp65504P1007MemdataSCounter = -1;
         public boolean isIp65504P1007MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1007MemdataSCounter != sharedCounter;
            localIp65504P1007MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1007_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1007MemdataS
	 */
	protected void serializeIp65504P1007MemdataS(short ip65504P1007MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1007MemdataS,IP_65504_P_1007_MEMDATA_S_LEN)
                  ,beginIp65504P1007MemdataS
                  ,IP_65504_P_1007_MEMDATA_S_LEN
                 );
            localIp65504P1007MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1007MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1007MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1007MemdataS() {	 
			return (getShort(beginIp65504P1007MemdataS));
   	}
         int localIp65504P1007MemdataLCounter = -1;
         public boolean isIp65504P1007MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1007MemdataLCounter != sharedCounter;
            localIp65504P1007MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1007_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1007MemdataL
	 */
	protected void serializeIp65504P1007MemdataL(short ip65504P1007MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1007MemdataL,IP_65504_P_1007_MEMDATA_L_LEN)
                  ,beginIp65504P1007MemdataL
                  ,IP_65504_P_1007_MEMDATA_L_LEN
                 );
            localIp65504P1007MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1007MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1007MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1007MemdataL() {	 
			return (getShort(beginIp65504P1007MemdataL));
   	}
         int localIp65504P1008MemdataSCounter = -1;
         public boolean isIp65504P1008MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1008MemdataSCounter != sharedCounter;
            localIp65504P1008MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1008_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1008MemdataS
	 */
	protected void serializeIp65504P1008MemdataS(short ip65504P1008MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1008MemdataS,IP_65504_P_1008_MEMDATA_S_LEN)
                  ,beginIp65504P1008MemdataS
                  ,IP_65504_P_1008_MEMDATA_S_LEN
                 );
            localIp65504P1008MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1008MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1008MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1008MemdataS() {	 
			return (getShort(beginIp65504P1008MemdataS));
   	}
         int localIp65504P1008MemdataLCounter = -1;
         public boolean isIp65504P1008MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1008MemdataLCounter != sharedCounter;
            localIp65504P1008MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1008_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1008MemdataL
	 */
	protected void serializeIp65504P1008MemdataL(short ip65504P1008MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1008MemdataL,IP_65504_P_1008_MEMDATA_L_LEN)
                  ,beginIp65504P1008MemdataL
                  ,IP_65504_P_1008_MEMDATA_L_LEN
                 );
            localIp65504P1008MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1008MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1008MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1008MemdataL() {	 
			return (getShort(beginIp65504P1008MemdataL));
   	}
         int localIp65504P1009MemdataSCounter = -1;
         public boolean isIp65504P1009MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1009MemdataSCounter != sharedCounter;
            localIp65504P1009MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1009_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1009MemdataS
	 */
	protected void serializeIp65504P1009MemdataS(short ip65504P1009MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1009MemdataS,IP_65504_P_1009_MEMDATA_S_LEN)
                  ,beginIp65504P1009MemdataS
                  ,IP_65504_P_1009_MEMDATA_S_LEN
                 );
            localIp65504P1009MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1009MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1009MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1009MemdataS() {	 
			return (getShort(beginIp65504P1009MemdataS));
   	}
         int localIp65504P1009MemdataLCounter = -1;
         public boolean isIp65504P1009MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1009MemdataLCounter != sharedCounter;
            localIp65504P1009MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1009_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1009MemdataL
	 */
	protected void serializeIp65504P1009MemdataL(short ip65504P1009MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1009MemdataL,IP_65504_P_1009_MEMDATA_L_LEN)
                  ,beginIp65504P1009MemdataL
                  ,IP_65504_P_1009_MEMDATA_L_LEN
                 );
            localIp65504P1009MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1009MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1009MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1009MemdataL() {	 
			return (getShort(beginIp65504P1009MemdataL));
   	}
         int localIp65504P1010MemdataSCounter = -1;
         public boolean isIp65504P1010MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1010MemdataSCounter != sharedCounter;
            localIp65504P1010MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1010_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1010MemdataS
	 */
	protected void serializeIp65504P1010MemdataS(short ip65504P1010MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1010MemdataS,IP_65504_P_1010_MEMDATA_S_LEN)
                  ,beginIp65504P1010MemdataS
                  ,IP_65504_P_1010_MEMDATA_S_LEN
                 );
            localIp65504P1010MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1010MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1010MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1010MemdataS() {	 
			return (getShort(beginIp65504P1010MemdataS));
   	}
         int localIp65504P1010MemdataLCounter = -1;
         public boolean isIp65504P1010MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1010MemdataLCounter != sharedCounter;
            localIp65504P1010MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1010_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1010MemdataL
	 */
	protected void serializeIp65504P1010MemdataL(short ip65504P1010MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1010MemdataL,IP_65504_P_1010_MEMDATA_L_LEN)
                  ,beginIp65504P1010MemdataL
                  ,IP_65504_P_1010_MEMDATA_L_LEN
                 );
            localIp65504P1010MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1010MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1010MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1010MemdataL() {	 
			return (getShort(beginIp65504P1010MemdataL));
   	}
         int localIp65504P1011MemdataSCounter = -1;
         public boolean isIp65504P1011MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1011MemdataSCounter != sharedCounter;
            localIp65504P1011MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1011_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1011MemdataS
	 */
	protected void serializeIp65504P1011MemdataS(short ip65504P1011MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1011MemdataS,IP_65504_P_1011_MEMDATA_S_LEN)
                  ,beginIp65504P1011MemdataS
                  ,IP_65504_P_1011_MEMDATA_S_LEN
                 );
            localIp65504P1011MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1011MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1011MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1011MemdataS() {	 
			return (getShort(beginIp65504P1011MemdataS));
   	}
         int localIp65504P1011MemdataLCounter = -1;
         public boolean isIp65504P1011MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1011MemdataLCounter != sharedCounter;
            localIp65504P1011MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1011_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1011MemdataL
	 */
	protected void serializeIp65504P1011MemdataL(short ip65504P1011MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1011MemdataL,IP_65504_P_1011_MEMDATA_L_LEN)
                  ,beginIp65504P1011MemdataL
                  ,IP_65504_P_1011_MEMDATA_L_LEN
                 );
            localIp65504P1011MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1011MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1011MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1011MemdataL() {	 
			return (getShort(beginIp65504P1011MemdataL));
   	}
         int localIp65504P1012MemdataSCounter = -1;
         public boolean isIp65504P1012MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1012MemdataSCounter != sharedCounter;
            localIp65504P1012MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1012_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1012MemdataS
	 */
	protected void serializeIp65504P1012MemdataS(short ip65504P1012MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1012MemdataS,IP_65504_P_1012_MEMDATA_S_LEN)
                  ,beginIp65504P1012MemdataS
                  ,IP_65504_P_1012_MEMDATA_S_LEN
                 );
            localIp65504P1012MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1012MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1012MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1012MemdataS() {	 
			return (getShort(beginIp65504P1012MemdataS));
   	}
         int localIp65504P1012MemdataLCounter = -1;
         public boolean isIp65504P1012MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1012MemdataLCounter != sharedCounter;
            localIp65504P1012MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1012_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1012MemdataL
	 */
	protected void serializeIp65504P1012MemdataL(short ip65504P1012MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1012MemdataL,IP_65504_P_1012_MEMDATA_L_LEN)
                  ,beginIp65504P1012MemdataL
                  ,IP_65504_P_1012_MEMDATA_L_LEN
                 );
            localIp65504P1012MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1012MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1012MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1012MemdataL() {	 
			return (getShort(beginIp65504P1012MemdataL));
   	}
         int localIp65504P1013MemdataSCounter = -1;
         public boolean isIp65504P1013MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1013MemdataSCounter != sharedCounter;
            localIp65504P1013MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1013_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1013MemdataS
	 */
	protected void serializeIp65504P1013MemdataS(short ip65504P1013MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1013MemdataS,IP_65504_P_1013_MEMDATA_S_LEN)
                  ,beginIp65504P1013MemdataS
                  ,IP_65504_P_1013_MEMDATA_S_LEN
                 );
            localIp65504P1013MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1013MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1013MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1013MemdataS() {	 
			return (getShort(beginIp65504P1013MemdataS));
   	}
         int localIp65504P1013MemdataLCounter = -1;
         public boolean isIp65504P1013MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1013MemdataLCounter != sharedCounter;
            localIp65504P1013MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1013_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1013MemdataL
	 */
	protected void serializeIp65504P1013MemdataL(short ip65504P1013MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1013MemdataL,IP_65504_P_1013_MEMDATA_L_LEN)
                  ,beginIp65504P1013MemdataL
                  ,IP_65504_P_1013_MEMDATA_L_LEN
                 );
            localIp65504P1013MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1013MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1013MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1013MemdataL() {	 
			return (getShort(beginIp65504P1013MemdataL));
   	}
         int localIp65504P1014MemdataSCounter = -1;
         public boolean isIp65504P1014MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1014MemdataSCounter != sharedCounter;
            localIp65504P1014MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1014_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1014MemdataS
	 */
	protected void serializeIp65504P1014MemdataS(short ip65504P1014MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1014MemdataS,IP_65504_P_1014_MEMDATA_S_LEN)
                  ,beginIp65504P1014MemdataS
                  ,IP_65504_P_1014_MEMDATA_S_LEN
                 );
            localIp65504P1014MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1014MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1014MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1014MemdataS() {	 
			return (getShort(beginIp65504P1014MemdataS));
   	}
         int localIp65504P1014MemdataLCounter = -1;
         public boolean isIp65504P1014MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1014MemdataLCounter != sharedCounter;
            localIp65504P1014MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1014_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1014MemdataL
	 */
	protected void serializeIp65504P1014MemdataL(short ip65504P1014MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1014MemdataL,IP_65504_P_1014_MEMDATA_L_LEN)
                  ,beginIp65504P1014MemdataL
                  ,IP_65504_P_1014_MEMDATA_L_LEN
                 );
            localIp65504P1014MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1014MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1014MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1014MemdataL() {	 
			return (getShort(beginIp65504P1014MemdataL));
   	}
         int localIp65504P1015MemdataSCounter = -1;
         public boolean isIp65504P1015MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1015MemdataSCounter != sharedCounter;
            localIp65504P1015MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1015_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1015MemdataS
	 */
	protected void serializeIp65504P1015MemdataS(short ip65504P1015MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1015MemdataS,IP_65504_P_1015_MEMDATA_S_LEN)
                  ,beginIp65504P1015MemdataS
                  ,IP_65504_P_1015_MEMDATA_S_LEN
                 );
            localIp65504P1015MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1015MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1015MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1015MemdataS() {	 
			return (getShort(beginIp65504P1015MemdataS));
   	}
         int localIp65504P1015MemdataLCounter = -1;
         public boolean isIp65504P1015MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1015MemdataLCounter != sharedCounter;
            localIp65504P1015MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1015_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1015MemdataL
	 */
	protected void serializeIp65504P1015MemdataL(short ip65504P1015MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1015MemdataL,IP_65504_P_1015_MEMDATA_L_LEN)
                  ,beginIp65504P1015MemdataL
                  ,IP_65504_P_1015_MEMDATA_L_LEN
                 );
            localIp65504P1015MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1015MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1015MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1015MemdataL() {	 
			return (getShort(beginIp65504P1015MemdataL));
   	}
         int localIp65504P1016MemdataSCounter = -1;
         public boolean isIp65504P1016MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1016MemdataSCounter != sharedCounter;
            localIp65504P1016MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1016_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1016MemdataS
	 */
	protected void serializeIp65504P1016MemdataS(short ip65504P1016MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1016MemdataS,IP_65504_P_1016_MEMDATA_S_LEN)
                  ,beginIp65504P1016MemdataS
                  ,IP_65504_P_1016_MEMDATA_S_LEN
                 );
            localIp65504P1016MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1016MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1016MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1016MemdataS() {	 
			return (getShort(beginIp65504P1016MemdataS));
   	}
         int localIp65504P1016MemdataLCounter = -1;
         public boolean isIp65504P1016MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1016MemdataLCounter != sharedCounter;
            localIp65504P1016MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1016_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1016MemdataL
	 */
	protected void serializeIp65504P1016MemdataL(short ip65504P1016MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1016MemdataL,IP_65504_P_1016_MEMDATA_L_LEN)
                  ,beginIp65504P1016MemdataL
                  ,IP_65504_P_1016_MEMDATA_L_LEN
                 );
            localIp65504P1016MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1016MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1016MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1016MemdataL() {	 
			return (getShort(beginIp65504P1016MemdataL));
   	}
         int localIp65504P1017MemdataSCounter = -1;
         public boolean isIp65504P1017MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1017MemdataSCounter != sharedCounter;
            localIp65504P1017MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1017_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1017MemdataS
	 */
	protected void serializeIp65504P1017MemdataS(short ip65504P1017MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1017MemdataS,IP_65504_P_1017_MEMDATA_S_LEN)
                  ,beginIp65504P1017MemdataS
                  ,IP_65504_P_1017_MEMDATA_S_LEN
                 );
            localIp65504P1017MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1017MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1017MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1017MemdataS() {	 
			return (getShort(beginIp65504P1017MemdataS));
   	}
         int localIp65504P1017MemdataLCounter = -1;
         public boolean isIp65504P1017MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1017MemdataLCounter != sharedCounter;
            localIp65504P1017MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1017_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1017MemdataL
	 */
	protected void serializeIp65504P1017MemdataL(short ip65504P1017MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1017MemdataL,IP_65504_P_1017_MEMDATA_L_LEN)
                  ,beginIp65504P1017MemdataL
                  ,IP_65504_P_1017_MEMDATA_L_LEN
                 );
            localIp65504P1017MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1017MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1017MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1017MemdataL() {	 
			return (getShort(beginIp65504P1017MemdataL));
   	}
         int localIp65504P1018MemdataSCounter = -1;
         public boolean isIp65504P1018MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1018MemdataSCounter != sharedCounter;
            localIp65504P1018MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1018_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1018MemdataS
	 */
	protected void serializeIp65504P1018MemdataS(short ip65504P1018MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1018MemdataS,IP_65504_P_1018_MEMDATA_S_LEN)
                  ,beginIp65504P1018MemdataS
                  ,IP_65504_P_1018_MEMDATA_S_LEN
                 );
            localIp65504P1018MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1018MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1018MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1018MemdataS() {	 
			return (getShort(beginIp65504P1018MemdataS));
   	}
         int localIp65504P1018MemdataLCounter = -1;
         public boolean isIp65504P1018MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1018MemdataLCounter != sharedCounter;
            localIp65504P1018MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1018_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1018MemdataL
	 */
	protected void serializeIp65504P1018MemdataL(short ip65504P1018MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1018MemdataL,IP_65504_P_1018_MEMDATA_L_LEN)
                  ,beginIp65504P1018MemdataL
                  ,IP_65504_P_1018_MEMDATA_L_LEN
                 );
            localIp65504P1018MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1018MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1018MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1018MemdataL() {	 
			return (getShort(beginIp65504P1018MemdataL));
   	}
         int localIp65504P1019MemdataSCounter = -1;
         public boolean isIp65504P1019MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1019MemdataSCounter != sharedCounter;
            localIp65504P1019MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1019_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1019MemdataS
	 */
	protected void serializeIp65504P1019MemdataS(short ip65504P1019MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1019MemdataS,IP_65504_P_1019_MEMDATA_S_LEN)
                  ,beginIp65504P1019MemdataS
                  ,IP_65504_P_1019_MEMDATA_S_LEN
                 );
            localIp65504P1019MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1019MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1019MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1019MemdataS() {	 
			return (getShort(beginIp65504P1019MemdataS));
   	}
         int localIp65504P1019MemdataLCounter = -1;
         public boolean isIp65504P1019MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1019MemdataLCounter != sharedCounter;
            localIp65504P1019MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1019_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1019MemdataL
	 */
	protected void serializeIp65504P1019MemdataL(short ip65504P1019MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1019MemdataL,IP_65504_P_1019_MEMDATA_L_LEN)
                  ,beginIp65504P1019MemdataL
                  ,IP_65504_P_1019_MEMDATA_L_LEN
                 );
            localIp65504P1019MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1019MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1019MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1019MemdataL() {	 
			return (getShort(beginIp65504P1019MemdataL));
   	}
         int localIp65504P1020MemdataSCounter = -1;
         public boolean isIp65504P1020MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1020MemdataSCounter != sharedCounter;
            localIp65504P1020MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1020_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1020MemdataS
	 */
	protected void serializeIp65504P1020MemdataS(short ip65504P1020MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1020MemdataS,IP_65504_P_1020_MEMDATA_S_LEN)
                  ,beginIp65504P1020MemdataS
                  ,IP_65504_P_1020_MEMDATA_S_LEN
                 );
            localIp65504P1020MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1020MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1020MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1020MemdataS() {	 
			return (getShort(beginIp65504P1020MemdataS));
   	}
         int localIp65504P1020MemdataLCounter = -1;
         public boolean isIp65504P1020MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1020MemdataLCounter != sharedCounter;
            localIp65504P1020MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1020_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1020MemdataL
	 */
	protected void serializeIp65504P1020MemdataL(short ip65504P1020MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1020MemdataL,IP_65504_P_1020_MEMDATA_L_LEN)
                  ,beginIp65504P1020MemdataL
                  ,IP_65504_P_1020_MEMDATA_L_LEN
                 );
            localIp65504P1020MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1020MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1020MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1020MemdataL() {	 
			return (getShort(beginIp65504P1020MemdataL));
   	}
         int localIp65504P1021MemdataSCounter = -1;
         public boolean isIp65504P1021MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1021MemdataSCounter != sharedCounter;
            localIp65504P1021MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1021_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1021MemdataS
	 */
	protected void serializeIp65504P1021MemdataS(short ip65504P1021MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1021MemdataS,IP_65504_P_1021_MEMDATA_S_LEN)
                  ,beginIp65504P1021MemdataS
                  ,IP_65504_P_1021_MEMDATA_S_LEN
                 );
            localIp65504P1021MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1021MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1021MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1021MemdataS() {	 
			return (getShort(beginIp65504P1021MemdataS));
   	}
         int localIp65504P1021MemdataLCounter = -1;
         public boolean isIp65504P1021MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1021MemdataLCounter != sharedCounter;
            localIp65504P1021MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1021_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1021MemdataL
	 */
	protected void serializeIp65504P1021MemdataL(short ip65504P1021MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1021MemdataL,IP_65504_P_1021_MEMDATA_L_LEN)
                  ,beginIp65504P1021MemdataL
                  ,IP_65504_P_1021_MEMDATA_L_LEN
                 );
            localIp65504P1021MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1021MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1021MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1021MemdataL() {	 
			return (getShort(beginIp65504P1021MemdataL));
   	}
         int localIp65504P1022MemdataSCounter = -1;
         public boolean isIp65504P1022MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1022MemdataSCounter != sharedCounter;
            localIp65504P1022MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1022_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1022MemdataS
	 */
	protected void serializeIp65504P1022MemdataS(short ip65504P1022MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1022MemdataS,IP_65504_P_1022_MEMDATA_S_LEN)
                  ,beginIp65504P1022MemdataS
                  ,IP_65504_P_1022_MEMDATA_S_LEN
                 );
            localIp65504P1022MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1022MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1022MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1022MemdataS() {	 
			return (getShort(beginIp65504P1022MemdataS));
   	}
         int localIp65504P1022MemdataLCounter = -1;
         public boolean isIp65504P1022MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1022MemdataLCounter != sharedCounter;
            localIp65504P1022MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1022_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1022MemdataL
	 */
	protected void serializeIp65504P1022MemdataL(short ip65504P1022MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1022MemdataL,IP_65504_P_1022_MEMDATA_L_LEN)
                  ,beginIp65504P1022MemdataL
                  ,IP_65504_P_1022_MEMDATA_L_LEN
                 );
            localIp65504P1022MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1022MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1022MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1022MemdataL() {	 
			return (getShort(beginIp65504P1022MemdataL));
   	}
         int localIp65504P1023MemdataSCounter = -1;
         public boolean isIp65504P1023MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1023MemdataSCounter != sharedCounter;
            localIp65504P1023MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1023_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1023MemdataS
	 */
	protected void serializeIp65504P1023MemdataS(short ip65504P1023MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1023MemdataS,IP_65504_P_1023_MEMDATA_S_LEN)
                  ,beginIp65504P1023MemdataS
                  ,IP_65504_P_1023_MEMDATA_S_LEN
                 );
            localIp65504P1023MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1023MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1023MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1023MemdataS() {	 
			return (getShort(beginIp65504P1023MemdataS));
   	}
         int localIp65504P1023MemdataLCounter = -1;
         public boolean isIp65504P1023MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1023MemdataLCounter != sharedCounter;
            localIp65504P1023MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1023_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1023MemdataL
	 */
	protected void serializeIp65504P1023MemdataL(short ip65504P1023MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1023MemdataL,IP_65504_P_1023_MEMDATA_L_LEN)
                  ,beginIp65504P1023MemdataL
                  ,IP_65504_P_1023_MEMDATA_L_LEN
                 );
            localIp65504P1023MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1023MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1023MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1023MemdataL() {	 
			return (getShort(beginIp65504P1023MemdataL));
   	}




}
  
