package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup36Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup36Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup36Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_36_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1086MemdataS;
            protected  int beginIp65504P1086MemdataL;
            protected  int beginIp65504P1087MemdataS;
            protected  int beginIp65504P1087MemdataL;
            protected  int beginIp65504P1088MemdataS;
            protected  int beginIp65504P1088MemdataL;
            protected  int beginIp65504P1089MemdataS;
            protected  int beginIp65504P1089MemdataL;
            protected  int beginIp65504P1090MemdataS;
            protected  int beginIp65504P1090MemdataL;
            protected  int beginIp65504P1091MemdataS;
            protected  int beginIp65504P1091MemdataL;
            protected  int beginIp65504P1092MemdataS;
            protected  int beginIp65504P1092MemdataL;
            protected  int beginIp65504P1093MemdataS;
            protected  int beginIp65504P1093MemdataL;
            protected  int beginIp65504P1094MemdataS;
            protected  int beginIp65504P1094MemdataL;
            protected  int beginIp65504P1095MemdataS;
            protected  int beginIp65504P1095MemdataL;
            protected  int beginIp65504P1096MemdataS;
            protected  int beginIp65504P1096MemdataL;
            protected  int beginIp65504P1097MemdataS;
            protected  int beginIp65504P1097MemdataL;
            protected  int beginIp65504P1098MemdataS;
            protected  int beginIp65504P1098MemdataL;
            protected  int beginIp65504P1099MemdataS;
            protected  int beginIp65504P1099MemdataL;
            protected  int beginIp65504P1100S;
            protected  int beginIp65504P1100L;
            protected  int beginIp65504P1101S;
            protected  int beginIp65504P1101L;
            protected  int beginIp65504P1102S;
            protected  int beginIp65504P1102L;
            protected  int beginIp65504P1103S;
            protected  int beginIp65504P1103L;
            protected  int beginIp65504P1104S;
            protected  int beginIp65504P1104L;
            protected  int beginIp65504P1105S;
            protected  int beginIp65504P1105L;
            protected  int beginIp65504P1106S;
            protected  int beginIp65504P1106L;
            protected  int beginIp65504P1107S;
            protected  int beginIp65504P1107L;
            protected  int beginIp65504P1108S;
            protected  int beginIp65504P1108L;
            protected  int beginIp65504P1109S;
            protected  int beginIp65504P1109L;
            protected  int beginIp65504P1110S;
            protected  int beginIp65504P1110L;
            protected  int beginIp65504P1111S;
            protected  int beginIp65504P1111L;
            protected  int beginIp65504P1112S;
            protected  int beginIp65504P1112L;
            protected  int beginIp65504P1113S;
            protected  int beginIp65504P1113L;
            protected  int beginIp65504P1114S;
            protected  int beginIp65504P1114L;
            protected  int beginIp65504P1115S;
            protected  int beginIp65504P1115L;
            protected  int beginIp65504P1116S;
            protected  int beginIp65504P1116L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup36Serialized
	**/
    public Ip65504PdsNamesLargeGroup36Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup36Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup36Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup36Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8676); // serialize this field at offset 8676 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup36Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8676 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup36Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_36_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1086MemdataS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1086MemdataL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1087MemdataS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1087MemdataL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1088MemdataS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1088MemdataL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1089MemdataS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1089MemdataL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1090MemdataS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1090MemdataL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1091MemdataS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1091MemdataL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1092MemdataS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1092MemdataL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1093MemdataS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1093MemdataL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1094MemdataS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1094MemdataL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1095MemdataS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1095MemdataL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1096MemdataS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1096MemdataL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1097MemdataS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1097MemdataL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1098MemdataS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1098MemdataL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1099MemdataS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1099MemdataL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1100S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1100L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1101S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1101L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1102S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1102L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1103S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1103L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1104S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1104L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1105S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1105L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1106S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1106L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1107S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1107L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1108S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1108L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1109S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1109L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1110S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1110L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1111S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1111L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1112S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1112L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1113S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1113L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1114S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1114L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1115S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1115L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1116S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1116L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1086MemdataSCounter = -1;
         public boolean isIp65504P1086MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1086MemdataSCounter != sharedCounter;
            localIp65504P1086MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1086_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1086MemdataS
	 */
	protected void serializeIp65504P1086MemdataS(short ip65504P1086MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1086MemdataS,IP_65504_P_1086_MEMDATA_S_LEN)
                  ,beginIp65504P1086MemdataS
                  ,IP_65504_P_1086_MEMDATA_S_LEN
                 );
            localIp65504P1086MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1086MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1086MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1086MemdataS() {	 
			return (getShort(beginIp65504P1086MemdataS));
   	}
         int localIp65504P1086MemdataLCounter = -1;
         public boolean isIp65504P1086MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1086MemdataLCounter != sharedCounter;
            localIp65504P1086MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1086_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1086MemdataL
	 */
	protected void serializeIp65504P1086MemdataL(short ip65504P1086MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1086MemdataL,IP_65504_P_1086_MEMDATA_L_LEN)
                  ,beginIp65504P1086MemdataL
                  ,IP_65504_P_1086_MEMDATA_L_LEN
                 );
            localIp65504P1086MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1086MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1086MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1086MemdataL() {	 
			return (getShort(beginIp65504P1086MemdataL));
   	}
         int localIp65504P1087MemdataSCounter = -1;
         public boolean isIp65504P1087MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1087MemdataSCounter != sharedCounter;
            localIp65504P1087MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1087_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1087MemdataS
	 */
	protected void serializeIp65504P1087MemdataS(short ip65504P1087MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1087MemdataS,IP_65504_P_1087_MEMDATA_S_LEN)
                  ,beginIp65504P1087MemdataS
                  ,IP_65504_P_1087_MEMDATA_S_LEN
                 );
            localIp65504P1087MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1087MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1087MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1087MemdataS() {	 
			return (getShort(beginIp65504P1087MemdataS));
   	}
         int localIp65504P1087MemdataLCounter = -1;
         public boolean isIp65504P1087MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1087MemdataLCounter != sharedCounter;
            localIp65504P1087MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1087_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1087MemdataL
	 */
	protected void serializeIp65504P1087MemdataL(short ip65504P1087MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1087MemdataL,IP_65504_P_1087_MEMDATA_L_LEN)
                  ,beginIp65504P1087MemdataL
                  ,IP_65504_P_1087_MEMDATA_L_LEN
                 );
            localIp65504P1087MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1087MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1087MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1087MemdataL() {	 
			return (getShort(beginIp65504P1087MemdataL));
   	}
         int localIp65504P1088MemdataSCounter = -1;
         public boolean isIp65504P1088MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1088MemdataSCounter != sharedCounter;
            localIp65504P1088MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1088_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1088MemdataS
	 */
	protected void serializeIp65504P1088MemdataS(short ip65504P1088MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1088MemdataS,IP_65504_P_1088_MEMDATA_S_LEN)
                  ,beginIp65504P1088MemdataS
                  ,IP_65504_P_1088_MEMDATA_S_LEN
                 );
            localIp65504P1088MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1088MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1088MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1088MemdataS() {	 
			return (getShort(beginIp65504P1088MemdataS));
   	}
         int localIp65504P1088MemdataLCounter = -1;
         public boolean isIp65504P1088MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1088MemdataLCounter != sharedCounter;
            localIp65504P1088MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1088_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1088MemdataL
	 */
	protected void serializeIp65504P1088MemdataL(short ip65504P1088MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1088MemdataL,IP_65504_P_1088_MEMDATA_L_LEN)
                  ,beginIp65504P1088MemdataL
                  ,IP_65504_P_1088_MEMDATA_L_LEN
                 );
            localIp65504P1088MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1088MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1088MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1088MemdataL() {	 
			return (getShort(beginIp65504P1088MemdataL));
   	}
         int localIp65504P1089MemdataSCounter = -1;
         public boolean isIp65504P1089MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1089MemdataSCounter != sharedCounter;
            localIp65504P1089MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1089_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1089MemdataS
	 */
	protected void serializeIp65504P1089MemdataS(short ip65504P1089MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1089MemdataS,IP_65504_P_1089_MEMDATA_S_LEN)
                  ,beginIp65504P1089MemdataS
                  ,IP_65504_P_1089_MEMDATA_S_LEN
                 );
            localIp65504P1089MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1089MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1089MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1089MemdataS() {	 
			return (getShort(beginIp65504P1089MemdataS));
   	}
         int localIp65504P1089MemdataLCounter = -1;
         public boolean isIp65504P1089MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1089MemdataLCounter != sharedCounter;
            localIp65504P1089MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1089_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1089MemdataL
	 */
	protected void serializeIp65504P1089MemdataL(short ip65504P1089MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1089MemdataL,IP_65504_P_1089_MEMDATA_L_LEN)
                  ,beginIp65504P1089MemdataL
                  ,IP_65504_P_1089_MEMDATA_L_LEN
                 );
            localIp65504P1089MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1089MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1089MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1089MemdataL() {	 
			return (getShort(beginIp65504P1089MemdataL));
   	}
         int localIp65504P1090MemdataSCounter = -1;
         public boolean isIp65504P1090MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1090MemdataSCounter != sharedCounter;
            localIp65504P1090MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1090_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1090MemdataS
	 */
	protected void serializeIp65504P1090MemdataS(short ip65504P1090MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1090MemdataS,IP_65504_P_1090_MEMDATA_S_LEN)
                  ,beginIp65504P1090MemdataS
                  ,IP_65504_P_1090_MEMDATA_S_LEN
                 );
            localIp65504P1090MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1090MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1090MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1090MemdataS() {	 
			return (getShort(beginIp65504P1090MemdataS));
   	}
         int localIp65504P1090MemdataLCounter = -1;
         public boolean isIp65504P1090MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1090MemdataLCounter != sharedCounter;
            localIp65504P1090MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1090_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1090MemdataL
	 */
	protected void serializeIp65504P1090MemdataL(short ip65504P1090MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1090MemdataL,IP_65504_P_1090_MEMDATA_L_LEN)
                  ,beginIp65504P1090MemdataL
                  ,IP_65504_P_1090_MEMDATA_L_LEN
                 );
            localIp65504P1090MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1090MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1090MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1090MemdataL() {	 
			return (getShort(beginIp65504P1090MemdataL));
   	}
         int localIp65504P1091MemdataSCounter = -1;
         public boolean isIp65504P1091MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1091MemdataSCounter != sharedCounter;
            localIp65504P1091MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1091_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1091MemdataS
	 */
	protected void serializeIp65504P1091MemdataS(short ip65504P1091MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1091MemdataS,IP_65504_P_1091_MEMDATA_S_LEN)
                  ,beginIp65504P1091MemdataS
                  ,IP_65504_P_1091_MEMDATA_S_LEN
                 );
            localIp65504P1091MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1091MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1091MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1091MemdataS() {	 
			return (getShort(beginIp65504P1091MemdataS));
   	}
         int localIp65504P1091MemdataLCounter = -1;
         public boolean isIp65504P1091MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1091MemdataLCounter != sharedCounter;
            localIp65504P1091MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1091_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1091MemdataL
	 */
	protected void serializeIp65504P1091MemdataL(short ip65504P1091MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1091MemdataL,IP_65504_P_1091_MEMDATA_L_LEN)
                  ,beginIp65504P1091MemdataL
                  ,IP_65504_P_1091_MEMDATA_L_LEN
                 );
            localIp65504P1091MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1091MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1091MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1091MemdataL() {	 
			return (getShort(beginIp65504P1091MemdataL));
   	}
         int localIp65504P1092MemdataSCounter = -1;
         public boolean isIp65504P1092MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1092MemdataSCounter != sharedCounter;
            localIp65504P1092MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1092_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1092MemdataS
	 */
	protected void serializeIp65504P1092MemdataS(short ip65504P1092MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1092MemdataS,IP_65504_P_1092_MEMDATA_S_LEN)
                  ,beginIp65504P1092MemdataS
                  ,IP_65504_P_1092_MEMDATA_S_LEN
                 );
            localIp65504P1092MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1092MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1092MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1092MemdataS() {	 
			return (getShort(beginIp65504P1092MemdataS));
   	}
         int localIp65504P1092MemdataLCounter = -1;
         public boolean isIp65504P1092MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1092MemdataLCounter != sharedCounter;
            localIp65504P1092MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1092_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1092MemdataL
	 */
	protected void serializeIp65504P1092MemdataL(short ip65504P1092MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1092MemdataL,IP_65504_P_1092_MEMDATA_L_LEN)
                  ,beginIp65504P1092MemdataL
                  ,IP_65504_P_1092_MEMDATA_L_LEN
                 );
            localIp65504P1092MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1092MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1092MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1092MemdataL() {	 
			return (getShort(beginIp65504P1092MemdataL));
   	}
         int localIp65504P1093MemdataSCounter = -1;
         public boolean isIp65504P1093MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1093MemdataSCounter != sharedCounter;
            localIp65504P1093MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1093_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1093MemdataS
	 */
	protected void serializeIp65504P1093MemdataS(short ip65504P1093MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1093MemdataS,IP_65504_P_1093_MEMDATA_S_LEN)
                  ,beginIp65504P1093MemdataS
                  ,IP_65504_P_1093_MEMDATA_S_LEN
                 );
            localIp65504P1093MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1093MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1093MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1093MemdataS() {	 
			return (getShort(beginIp65504P1093MemdataS));
   	}
         int localIp65504P1093MemdataLCounter = -1;
         public boolean isIp65504P1093MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1093MemdataLCounter != sharedCounter;
            localIp65504P1093MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1093_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1093MemdataL
	 */
	protected void serializeIp65504P1093MemdataL(short ip65504P1093MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1093MemdataL,IP_65504_P_1093_MEMDATA_L_LEN)
                  ,beginIp65504P1093MemdataL
                  ,IP_65504_P_1093_MEMDATA_L_LEN
                 );
            localIp65504P1093MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1093MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1093MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1093MemdataL() {	 
			return (getShort(beginIp65504P1093MemdataL));
   	}
         int localIp65504P1094MemdataSCounter = -1;
         public boolean isIp65504P1094MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1094MemdataSCounter != sharedCounter;
            localIp65504P1094MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1094_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1094MemdataS
	 */
	protected void serializeIp65504P1094MemdataS(short ip65504P1094MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1094MemdataS,IP_65504_P_1094_MEMDATA_S_LEN)
                  ,beginIp65504P1094MemdataS
                  ,IP_65504_P_1094_MEMDATA_S_LEN
                 );
            localIp65504P1094MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1094MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1094MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1094MemdataS() {	 
			return (getShort(beginIp65504P1094MemdataS));
   	}
         int localIp65504P1094MemdataLCounter = -1;
         public boolean isIp65504P1094MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1094MemdataLCounter != sharedCounter;
            localIp65504P1094MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1094_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1094MemdataL
	 */
	protected void serializeIp65504P1094MemdataL(short ip65504P1094MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1094MemdataL,IP_65504_P_1094_MEMDATA_L_LEN)
                  ,beginIp65504P1094MemdataL
                  ,IP_65504_P_1094_MEMDATA_L_LEN
                 );
            localIp65504P1094MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1094MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1094MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1094MemdataL() {	 
			return (getShort(beginIp65504P1094MemdataL));
   	}
         int localIp65504P1095MemdataSCounter = -1;
         public boolean isIp65504P1095MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1095MemdataSCounter != sharedCounter;
            localIp65504P1095MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1095_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1095MemdataS
	 */
	protected void serializeIp65504P1095MemdataS(short ip65504P1095MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1095MemdataS,IP_65504_P_1095_MEMDATA_S_LEN)
                  ,beginIp65504P1095MemdataS
                  ,IP_65504_P_1095_MEMDATA_S_LEN
                 );
            localIp65504P1095MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1095MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1095MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1095MemdataS() {	 
			return (getShort(beginIp65504P1095MemdataS));
   	}
         int localIp65504P1095MemdataLCounter = -1;
         public boolean isIp65504P1095MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1095MemdataLCounter != sharedCounter;
            localIp65504P1095MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1095_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1095MemdataL
	 */
	protected void serializeIp65504P1095MemdataL(short ip65504P1095MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1095MemdataL,IP_65504_P_1095_MEMDATA_L_LEN)
                  ,beginIp65504P1095MemdataL
                  ,IP_65504_P_1095_MEMDATA_L_LEN
                 );
            localIp65504P1095MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1095MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1095MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1095MemdataL() {	 
			return (getShort(beginIp65504P1095MemdataL));
   	}
         int localIp65504P1096MemdataSCounter = -1;
         public boolean isIp65504P1096MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1096MemdataSCounter != sharedCounter;
            localIp65504P1096MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1096_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1096MemdataS
	 */
	protected void serializeIp65504P1096MemdataS(short ip65504P1096MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1096MemdataS,IP_65504_P_1096_MEMDATA_S_LEN)
                  ,beginIp65504P1096MemdataS
                  ,IP_65504_P_1096_MEMDATA_S_LEN
                 );
            localIp65504P1096MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1096MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1096MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1096MemdataS() {	 
			return (getShort(beginIp65504P1096MemdataS));
   	}
         int localIp65504P1096MemdataLCounter = -1;
         public boolean isIp65504P1096MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1096MemdataLCounter != sharedCounter;
            localIp65504P1096MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1096_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1096MemdataL
	 */
	protected void serializeIp65504P1096MemdataL(short ip65504P1096MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1096MemdataL,IP_65504_P_1096_MEMDATA_L_LEN)
                  ,beginIp65504P1096MemdataL
                  ,IP_65504_P_1096_MEMDATA_L_LEN
                 );
            localIp65504P1096MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1096MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1096MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1096MemdataL() {	 
			return (getShort(beginIp65504P1096MemdataL));
   	}
         int localIp65504P1097MemdataSCounter = -1;
         public boolean isIp65504P1097MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1097MemdataSCounter != sharedCounter;
            localIp65504P1097MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1097_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1097MemdataS
	 */
	protected void serializeIp65504P1097MemdataS(short ip65504P1097MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1097MemdataS,IP_65504_P_1097_MEMDATA_S_LEN)
                  ,beginIp65504P1097MemdataS
                  ,IP_65504_P_1097_MEMDATA_S_LEN
                 );
            localIp65504P1097MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1097MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1097MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1097MemdataS() {	 
			return (getShort(beginIp65504P1097MemdataS));
   	}
         int localIp65504P1097MemdataLCounter = -1;
         public boolean isIp65504P1097MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1097MemdataLCounter != sharedCounter;
            localIp65504P1097MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1097_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1097MemdataL
	 */
	protected void serializeIp65504P1097MemdataL(short ip65504P1097MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1097MemdataL,IP_65504_P_1097_MEMDATA_L_LEN)
                  ,beginIp65504P1097MemdataL
                  ,IP_65504_P_1097_MEMDATA_L_LEN
                 );
            localIp65504P1097MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1097MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1097MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1097MemdataL() {	 
			return (getShort(beginIp65504P1097MemdataL));
   	}
         int localIp65504P1098MemdataSCounter = -1;
         public boolean isIp65504P1098MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1098MemdataSCounter != sharedCounter;
            localIp65504P1098MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1098_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1098MemdataS
	 */
	protected void serializeIp65504P1098MemdataS(short ip65504P1098MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1098MemdataS,IP_65504_P_1098_MEMDATA_S_LEN)
                  ,beginIp65504P1098MemdataS
                  ,IP_65504_P_1098_MEMDATA_S_LEN
                 );
            localIp65504P1098MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1098MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1098MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1098MemdataS() {	 
			return (getShort(beginIp65504P1098MemdataS));
   	}
         int localIp65504P1098MemdataLCounter = -1;
         public boolean isIp65504P1098MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1098MemdataLCounter != sharedCounter;
            localIp65504P1098MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1098_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1098MemdataL
	 */
	protected void serializeIp65504P1098MemdataL(short ip65504P1098MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1098MemdataL,IP_65504_P_1098_MEMDATA_L_LEN)
                  ,beginIp65504P1098MemdataL
                  ,IP_65504_P_1098_MEMDATA_L_LEN
                 );
            localIp65504P1098MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1098MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1098MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1098MemdataL() {	 
			return (getShort(beginIp65504P1098MemdataL));
   	}
         int localIp65504P1099MemdataSCounter = -1;
         public boolean isIp65504P1099MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1099MemdataSCounter != sharedCounter;
            localIp65504P1099MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1099_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1099MemdataS
	 */
	protected void serializeIp65504P1099MemdataS(short ip65504P1099MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1099MemdataS,IP_65504_P_1099_MEMDATA_S_LEN)
                  ,beginIp65504P1099MemdataS
                  ,IP_65504_P_1099_MEMDATA_S_LEN
                 );
            localIp65504P1099MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1099MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1099MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1099MemdataS() {	 
			return (getShort(beginIp65504P1099MemdataS));
   	}
         int localIp65504P1099MemdataLCounter = -1;
         public boolean isIp65504P1099MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1099MemdataLCounter != sharedCounter;
            localIp65504P1099MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1099_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1099MemdataL
	 */
	protected void serializeIp65504P1099MemdataL(short ip65504P1099MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1099MemdataL,IP_65504_P_1099_MEMDATA_L_LEN)
                  ,beginIp65504P1099MemdataL
                  ,IP_65504_P_1099_MEMDATA_L_LEN
                 );
            localIp65504P1099MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1099MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1099MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1099MemdataL() {	 
			return (getShort(beginIp65504P1099MemdataL));
   	}
         int localIp65504P1100SCounter = -1;
         public boolean isIp65504P1100SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1100SCounter != sharedCounter;
            localIp65504P1100SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1100_S_LEN = 2;
  	/**
	 * serializeIp65504P1100S
	 */
	protected void serializeIp65504P1100S(short ip65504P1100S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1100S,IP_65504_P_1100_S_LEN)
                  ,beginIp65504P1100S
                  ,IP_65504_P_1100_S_LEN
                 );
            localIp65504P1100SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1100SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1100S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1100S() {	 
			return (getShort(beginIp65504P1100S));
   	}
         int localIp65504P1100LCounter = -1;
         public boolean isIp65504P1100LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1100LCounter != sharedCounter;
            localIp65504P1100LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1100_L_LEN = 2;
  	/**
	 * serializeIp65504P1100L
	 */
	protected void serializeIp65504P1100L(short ip65504P1100L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1100L,IP_65504_P_1100_L_LEN)
                  ,beginIp65504P1100L
                  ,IP_65504_P_1100_L_LEN
                 );
            localIp65504P1100LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1100LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1100L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1100L() {	 
			return (getShort(beginIp65504P1100L));
   	}
         int localIp65504P1101SCounter = -1;
         public boolean isIp65504P1101SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1101SCounter != sharedCounter;
            localIp65504P1101SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1101_S_LEN = 2;
  	/**
	 * serializeIp65504P1101S
	 */
	protected void serializeIp65504P1101S(short ip65504P1101S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1101S,IP_65504_P_1101_S_LEN)
                  ,beginIp65504P1101S
                  ,IP_65504_P_1101_S_LEN
                 );
            localIp65504P1101SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1101SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1101S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1101S() {	 
			return (getShort(beginIp65504P1101S));
   	}
         int localIp65504P1101LCounter = -1;
         public boolean isIp65504P1101LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1101LCounter != sharedCounter;
            localIp65504P1101LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1101_L_LEN = 2;
  	/**
	 * serializeIp65504P1101L
	 */
	protected void serializeIp65504P1101L(short ip65504P1101L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1101L,IP_65504_P_1101_L_LEN)
                  ,beginIp65504P1101L
                  ,IP_65504_P_1101_L_LEN
                 );
            localIp65504P1101LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1101LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1101L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1101L() {	 
			return (getShort(beginIp65504P1101L));
   	}
         int localIp65504P1102SCounter = -1;
         public boolean isIp65504P1102SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1102SCounter != sharedCounter;
            localIp65504P1102SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1102_S_LEN = 2;
  	/**
	 * serializeIp65504P1102S
	 */
	protected void serializeIp65504P1102S(short ip65504P1102S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1102S,IP_65504_P_1102_S_LEN)
                  ,beginIp65504P1102S
                  ,IP_65504_P_1102_S_LEN
                 );
            localIp65504P1102SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1102SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1102S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1102S() {	 
			return (getShort(beginIp65504P1102S));
   	}
         int localIp65504P1102LCounter = -1;
         public boolean isIp65504P1102LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1102LCounter != sharedCounter;
            localIp65504P1102LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1102_L_LEN = 2;
  	/**
	 * serializeIp65504P1102L
	 */
	protected void serializeIp65504P1102L(short ip65504P1102L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1102L,IP_65504_P_1102_L_LEN)
                  ,beginIp65504P1102L
                  ,IP_65504_P_1102_L_LEN
                 );
            localIp65504P1102LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1102LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1102L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1102L() {	 
			return (getShort(beginIp65504P1102L));
   	}
         int localIp65504P1103SCounter = -1;
         public boolean isIp65504P1103SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1103SCounter != sharedCounter;
            localIp65504P1103SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1103_S_LEN = 2;
  	/**
	 * serializeIp65504P1103S
	 */
	protected void serializeIp65504P1103S(short ip65504P1103S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1103S,IP_65504_P_1103_S_LEN)
                  ,beginIp65504P1103S
                  ,IP_65504_P_1103_S_LEN
                 );
            localIp65504P1103SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1103SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1103S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1103S() {	 
			return (getShort(beginIp65504P1103S));
   	}
         int localIp65504P1103LCounter = -1;
         public boolean isIp65504P1103LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1103LCounter != sharedCounter;
            localIp65504P1103LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1103_L_LEN = 2;
  	/**
	 * serializeIp65504P1103L
	 */
	protected void serializeIp65504P1103L(short ip65504P1103L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1103L,IP_65504_P_1103_L_LEN)
                  ,beginIp65504P1103L
                  ,IP_65504_P_1103_L_LEN
                 );
            localIp65504P1103LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1103LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1103L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1103L() {	 
			return (getShort(beginIp65504P1103L));
   	}
         int localIp65504P1104SCounter = -1;
         public boolean isIp65504P1104SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1104SCounter != sharedCounter;
            localIp65504P1104SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1104_S_LEN = 2;
  	/**
	 * serializeIp65504P1104S
	 */
	protected void serializeIp65504P1104S(short ip65504P1104S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1104S,IP_65504_P_1104_S_LEN)
                  ,beginIp65504P1104S
                  ,IP_65504_P_1104_S_LEN
                 );
            localIp65504P1104SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1104SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1104S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1104S() {	 
			return (getShort(beginIp65504P1104S));
   	}
         int localIp65504P1104LCounter = -1;
         public boolean isIp65504P1104LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1104LCounter != sharedCounter;
            localIp65504P1104LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1104_L_LEN = 2;
  	/**
	 * serializeIp65504P1104L
	 */
	protected void serializeIp65504P1104L(short ip65504P1104L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1104L,IP_65504_P_1104_L_LEN)
                  ,beginIp65504P1104L
                  ,IP_65504_P_1104_L_LEN
                 );
            localIp65504P1104LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1104LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1104L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1104L() {	 
			return (getShort(beginIp65504P1104L));
   	}
         int localIp65504P1105SCounter = -1;
         public boolean isIp65504P1105SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1105SCounter != sharedCounter;
            localIp65504P1105SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1105_S_LEN = 2;
  	/**
	 * serializeIp65504P1105S
	 */
	protected void serializeIp65504P1105S(short ip65504P1105S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1105S,IP_65504_P_1105_S_LEN)
                  ,beginIp65504P1105S
                  ,IP_65504_P_1105_S_LEN
                 );
            localIp65504P1105SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1105SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1105S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1105S() {	 
			return (getShort(beginIp65504P1105S));
   	}
         int localIp65504P1105LCounter = -1;
         public boolean isIp65504P1105LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1105LCounter != sharedCounter;
            localIp65504P1105LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1105_L_LEN = 2;
  	/**
	 * serializeIp65504P1105L
	 */
	protected void serializeIp65504P1105L(short ip65504P1105L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1105L,IP_65504_P_1105_L_LEN)
                  ,beginIp65504P1105L
                  ,IP_65504_P_1105_L_LEN
                 );
            localIp65504P1105LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1105LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1105L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1105L() {	 
			return (getShort(beginIp65504P1105L));
   	}
         int localIp65504P1106SCounter = -1;
         public boolean isIp65504P1106SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1106SCounter != sharedCounter;
            localIp65504P1106SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1106_S_LEN = 2;
  	/**
	 * serializeIp65504P1106S
	 */
	protected void serializeIp65504P1106S(short ip65504P1106S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1106S,IP_65504_P_1106_S_LEN)
                  ,beginIp65504P1106S
                  ,IP_65504_P_1106_S_LEN
                 );
            localIp65504P1106SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1106SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1106S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1106S() {	 
			return (getShort(beginIp65504P1106S));
   	}
         int localIp65504P1106LCounter = -1;
         public boolean isIp65504P1106LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1106LCounter != sharedCounter;
            localIp65504P1106LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1106_L_LEN = 2;
  	/**
	 * serializeIp65504P1106L
	 */
	protected void serializeIp65504P1106L(short ip65504P1106L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1106L,IP_65504_P_1106_L_LEN)
                  ,beginIp65504P1106L
                  ,IP_65504_P_1106_L_LEN
                 );
            localIp65504P1106LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1106LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1106L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1106L() {	 
			return (getShort(beginIp65504P1106L));
   	}
         int localIp65504P1107SCounter = -1;
         public boolean isIp65504P1107SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1107SCounter != sharedCounter;
            localIp65504P1107SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1107_S_LEN = 2;
  	/**
	 * serializeIp65504P1107S
	 */
	protected void serializeIp65504P1107S(short ip65504P1107S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1107S,IP_65504_P_1107_S_LEN)
                  ,beginIp65504P1107S
                  ,IP_65504_P_1107_S_LEN
                 );
            localIp65504P1107SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1107SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1107S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1107S() {	 
			return (getShort(beginIp65504P1107S));
   	}
         int localIp65504P1107LCounter = -1;
         public boolean isIp65504P1107LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1107LCounter != sharedCounter;
            localIp65504P1107LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1107_L_LEN = 2;
  	/**
	 * serializeIp65504P1107L
	 */
	protected void serializeIp65504P1107L(short ip65504P1107L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1107L,IP_65504_P_1107_L_LEN)
                  ,beginIp65504P1107L
                  ,IP_65504_P_1107_L_LEN
                 );
            localIp65504P1107LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1107LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1107L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1107L() {	 
			return (getShort(beginIp65504P1107L));
   	}
         int localIp65504P1108SCounter = -1;
         public boolean isIp65504P1108SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1108SCounter != sharedCounter;
            localIp65504P1108SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1108_S_LEN = 2;
  	/**
	 * serializeIp65504P1108S
	 */
	protected void serializeIp65504P1108S(short ip65504P1108S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1108S,IP_65504_P_1108_S_LEN)
                  ,beginIp65504P1108S
                  ,IP_65504_P_1108_S_LEN
                 );
            localIp65504P1108SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1108SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1108S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1108S() {	 
			return (getShort(beginIp65504P1108S));
   	}
         int localIp65504P1108LCounter = -1;
         public boolean isIp65504P1108LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1108LCounter != sharedCounter;
            localIp65504P1108LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1108_L_LEN = 2;
  	/**
	 * serializeIp65504P1108L
	 */
	protected void serializeIp65504P1108L(short ip65504P1108L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1108L,IP_65504_P_1108_L_LEN)
                  ,beginIp65504P1108L
                  ,IP_65504_P_1108_L_LEN
                 );
            localIp65504P1108LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1108LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1108L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1108L() {	 
			return (getShort(beginIp65504P1108L));
   	}
         int localIp65504P1109SCounter = -1;
         public boolean isIp65504P1109SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1109SCounter != sharedCounter;
            localIp65504P1109SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1109_S_LEN = 2;
  	/**
	 * serializeIp65504P1109S
	 */
	protected void serializeIp65504P1109S(short ip65504P1109S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1109S,IP_65504_P_1109_S_LEN)
                  ,beginIp65504P1109S
                  ,IP_65504_P_1109_S_LEN
                 );
            localIp65504P1109SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1109SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1109S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1109S() {	 
			return (getShort(beginIp65504P1109S));
   	}
         int localIp65504P1109LCounter = -1;
         public boolean isIp65504P1109LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1109LCounter != sharedCounter;
            localIp65504P1109LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1109_L_LEN = 2;
  	/**
	 * serializeIp65504P1109L
	 */
	protected void serializeIp65504P1109L(short ip65504P1109L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1109L,IP_65504_P_1109_L_LEN)
                  ,beginIp65504P1109L
                  ,IP_65504_P_1109_L_LEN
                 );
            localIp65504P1109LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1109LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1109L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1109L() {	 
			return (getShort(beginIp65504P1109L));
   	}
         int localIp65504P1110SCounter = -1;
         public boolean isIp65504P1110SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1110SCounter != sharedCounter;
            localIp65504P1110SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1110_S_LEN = 2;
  	/**
	 * serializeIp65504P1110S
	 */
	protected void serializeIp65504P1110S(short ip65504P1110S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1110S,IP_65504_P_1110_S_LEN)
                  ,beginIp65504P1110S
                  ,IP_65504_P_1110_S_LEN
                 );
            localIp65504P1110SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1110SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1110S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1110S() {	 
			return (getShort(beginIp65504P1110S));
   	}
         int localIp65504P1110LCounter = -1;
         public boolean isIp65504P1110LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1110LCounter != sharedCounter;
            localIp65504P1110LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1110_L_LEN = 2;
  	/**
	 * serializeIp65504P1110L
	 */
	protected void serializeIp65504P1110L(short ip65504P1110L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1110L,IP_65504_P_1110_L_LEN)
                  ,beginIp65504P1110L
                  ,IP_65504_P_1110_L_LEN
                 );
            localIp65504P1110LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1110LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1110L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1110L() {	 
			return (getShort(beginIp65504P1110L));
   	}
         int localIp65504P1111SCounter = -1;
         public boolean isIp65504P1111SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1111SCounter != sharedCounter;
            localIp65504P1111SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1111_S_LEN = 2;
  	/**
	 * serializeIp65504P1111S
	 */
	protected void serializeIp65504P1111S(short ip65504P1111S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1111S,IP_65504_P_1111_S_LEN)
                  ,beginIp65504P1111S
                  ,IP_65504_P_1111_S_LEN
                 );
            localIp65504P1111SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1111SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1111S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1111S() {	 
			return (getShort(beginIp65504P1111S));
   	}
         int localIp65504P1111LCounter = -1;
         public boolean isIp65504P1111LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1111LCounter != sharedCounter;
            localIp65504P1111LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1111_L_LEN = 2;
  	/**
	 * serializeIp65504P1111L
	 */
	protected void serializeIp65504P1111L(short ip65504P1111L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1111L,IP_65504_P_1111_L_LEN)
                  ,beginIp65504P1111L
                  ,IP_65504_P_1111_L_LEN
                 );
            localIp65504P1111LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1111LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1111L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1111L() {	 
			return (getShort(beginIp65504P1111L));
   	}
         int localIp65504P1112SCounter = -1;
         public boolean isIp65504P1112SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1112SCounter != sharedCounter;
            localIp65504P1112SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1112_S_LEN = 2;
  	/**
	 * serializeIp65504P1112S
	 */
	protected void serializeIp65504P1112S(short ip65504P1112S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1112S,IP_65504_P_1112_S_LEN)
                  ,beginIp65504P1112S
                  ,IP_65504_P_1112_S_LEN
                 );
            localIp65504P1112SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1112SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1112S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1112S() {	 
			return (getShort(beginIp65504P1112S));
   	}
         int localIp65504P1112LCounter = -1;
         public boolean isIp65504P1112LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1112LCounter != sharedCounter;
            localIp65504P1112LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1112_L_LEN = 2;
  	/**
	 * serializeIp65504P1112L
	 */
	protected void serializeIp65504P1112L(short ip65504P1112L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1112L,IP_65504_P_1112_L_LEN)
                  ,beginIp65504P1112L
                  ,IP_65504_P_1112_L_LEN
                 );
            localIp65504P1112LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1112LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1112L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1112L() {	 
			return (getShort(beginIp65504P1112L));
   	}
         int localIp65504P1113SCounter = -1;
         public boolean isIp65504P1113SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1113SCounter != sharedCounter;
            localIp65504P1113SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1113_S_LEN = 2;
  	/**
	 * serializeIp65504P1113S
	 */
	protected void serializeIp65504P1113S(short ip65504P1113S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1113S,IP_65504_P_1113_S_LEN)
                  ,beginIp65504P1113S
                  ,IP_65504_P_1113_S_LEN
                 );
            localIp65504P1113SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1113SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1113S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1113S() {	 
			return (getShort(beginIp65504P1113S));
   	}
         int localIp65504P1113LCounter = -1;
         public boolean isIp65504P1113LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1113LCounter != sharedCounter;
            localIp65504P1113LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1113_L_LEN = 2;
  	/**
	 * serializeIp65504P1113L
	 */
	protected void serializeIp65504P1113L(short ip65504P1113L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1113L,IP_65504_P_1113_L_LEN)
                  ,beginIp65504P1113L
                  ,IP_65504_P_1113_L_LEN
                 );
            localIp65504P1113LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1113LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1113L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1113L() {	 
			return (getShort(beginIp65504P1113L));
   	}
         int localIp65504P1114SCounter = -1;
         public boolean isIp65504P1114SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1114SCounter != sharedCounter;
            localIp65504P1114SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1114_S_LEN = 2;
  	/**
	 * serializeIp65504P1114S
	 */
	protected void serializeIp65504P1114S(short ip65504P1114S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1114S,IP_65504_P_1114_S_LEN)
                  ,beginIp65504P1114S
                  ,IP_65504_P_1114_S_LEN
                 );
            localIp65504P1114SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1114SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1114S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1114S() {	 
			return (getShort(beginIp65504P1114S));
   	}
         int localIp65504P1114LCounter = -1;
         public boolean isIp65504P1114LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1114LCounter != sharedCounter;
            localIp65504P1114LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1114_L_LEN = 2;
  	/**
	 * serializeIp65504P1114L
	 */
	protected void serializeIp65504P1114L(short ip65504P1114L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1114L,IP_65504_P_1114_L_LEN)
                  ,beginIp65504P1114L
                  ,IP_65504_P_1114_L_LEN
                 );
            localIp65504P1114LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1114LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1114L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1114L() {	 
			return (getShort(beginIp65504P1114L));
   	}
         int localIp65504P1115SCounter = -1;
         public boolean isIp65504P1115SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1115SCounter != sharedCounter;
            localIp65504P1115SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1115_S_LEN = 2;
  	/**
	 * serializeIp65504P1115S
	 */
	protected void serializeIp65504P1115S(short ip65504P1115S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1115S,IP_65504_P_1115_S_LEN)
                  ,beginIp65504P1115S
                  ,IP_65504_P_1115_S_LEN
                 );
            localIp65504P1115SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1115SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1115S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1115S() {	 
			return (getShort(beginIp65504P1115S));
   	}
         int localIp65504P1115LCounter = -1;
         public boolean isIp65504P1115LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1115LCounter != sharedCounter;
            localIp65504P1115LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1115_L_LEN = 2;
  	/**
	 * serializeIp65504P1115L
	 */
	protected void serializeIp65504P1115L(short ip65504P1115L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1115L,IP_65504_P_1115_L_LEN)
                  ,beginIp65504P1115L
                  ,IP_65504_P_1115_L_LEN
                 );
            localIp65504P1115LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1115LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1115L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1115L() {	 
			return (getShort(beginIp65504P1115L));
   	}
         int localIp65504P1116SCounter = -1;
         public boolean isIp65504P1116SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1116SCounter != sharedCounter;
            localIp65504P1116SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1116_S_LEN = 2;
  	/**
	 * serializeIp65504P1116S
	 */
	protected void serializeIp65504P1116S(short ip65504P1116S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1116S,IP_65504_P_1116_S_LEN)
                  ,beginIp65504P1116S
                  ,IP_65504_P_1116_S_LEN
                 );
            localIp65504P1116SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1116SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1116S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1116S() {	 
			return (getShort(beginIp65504P1116S));
   	}
         int localIp65504P1116LCounter = -1;
         public boolean isIp65504P1116LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1116LCounter != sharedCounter;
            localIp65504P1116LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1116_L_LEN = 2;
  	/**
	 * serializeIp65504P1116L
	 */
	protected void serializeIp65504P1116L(short ip65504P1116L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1116L,IP_65504_P_1116_L_LEN)
                  ,beginIp65504P1116L
                  ,IP_65504_P_1116_L_LEN
                 );
            localIp65504P1116LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1116LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1116L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1116L() {	 
			return (getShort(beginIp65504P1116L));
   	}




}
  
