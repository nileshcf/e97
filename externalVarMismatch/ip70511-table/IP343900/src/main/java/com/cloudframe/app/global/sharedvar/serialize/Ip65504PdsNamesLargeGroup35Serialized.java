package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup35Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup35Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup35Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_35_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1055MemdataS;
            protected  int beginIp65504P1055MemdataL;
            protected  int beginIp65504P1056MemdataS;
            protected  int beginIp65504P1056MemdataL;
            protected  int beginIp65504P1057MemdataS;
            protected  int beginIp65504P1057MemdataL;
            protected  int beginIp65504P1058MemdataS;
            protected  int beginIp65504P1058MemdataL;
            protected  int beginIp65504P1059MemdataS;
            protected  int beginIp65504P1059MemdataL;
            protected  int beginIp65504P1060MemdataS;
            protected  int beginIp65504P1060MemdataL;
            protected  int beginIp65504P1061MemdataS;
            protected  int beginIp65504P1061MemdataL;
            protected  int beginIp65504P1062MemdataS;
            protected  int beginIp65504P1062MemdataL;
            protected  int beginIp65504P1063MemdataS;
            protected  int beginIp65504P1063MemdataL;
            protected  int beginIp65504P1064MemdataS;
            protected  int beginIp65504P1064MemdataL;
            protected  int beginIp65504P1065MemdataS;
            protected  int beginIp65504P1065MemdataL;
            protected  int beginIp65504P1066MemdataS;
            protected  int beginIp65504P1066MemdataL;
            protected  int beginIp65504P1067MemdataS;
            protected  int beginIp65504P1067MemdataL;
            protected  int beginIp65504P1068MemdataS;
            protected  int beginIp65504P1068MemdataL;
            protected  int beginIp65504P1069MemdataS;
            protected  int beginIp65504P1069MemdataL;
            protected  int beginIp65504P1070MemdataS;
            protected  int beginIp65504P1070MemdataL;
            protected  int beginIp65504P1071MemdataS;
            protected  int beginIp65504P1071MemdataL;
            protected  int beginIp65504P1072MemdataS;
            protected  int beginIp65504P1072MemdataL;
            protected  int beginIp65504P1073MemdataS;
            protected  int beginIp65504P1073MemdataL;
            protected  int beginIp65504P1074MemdataS;
            protected  int beginIp65504P1074MemdataL;
            protected  int beginIp65504P1075MemdataS;
            protected  int beginIp65504P1075MemdataL;
            protected  int beginIp65504P1076MemdataS;
            protected  int beginIp65504P1076MemdataL;
            protected  int beginIp65504P1077MemdataS;
            protected  int beginIp65504P1077MemdataL;
            protected  int beginIp65504P1078MemdataS;
            protected  int beginIp65504P1078MemdataL;
            protected  int beginIp65504P1079MemdataS;
            protected  int beginIp65504P1079MemdataL;
            protected  int beginIp65504P1080MemdataS;
            protected  int beginIp65504P1080MemdataL;
            protected  int beginIp65504P1081MemdataS;
            protected  int beginIp65504P1081MemdataL;
            protected  int beginIp65504P1082MemdataS;
            protected  int beginIp65504P1082MemdataL;
            protected  int beginIp65504P1083MemdataS;
            protected  int beginIp65504P1083MemdataL;
            protected  int beginIp65504P1084MemdataS;
            protected  int beginIp65504P1084MemdataL;
            protected  int beginIp65504P1085MemdataS;
            protected  int beginIp65504P1085MemdataL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup35Serialized
	**/
    public Ip65504PdsNamesLargeGroup35Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup35Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup35Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup35Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8428); // serialize this field at offset 8428 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup35Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8428 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup35Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_35_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1055MemdataS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1055MemdataL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1056MemdataS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1056MemdataL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1057MemdataS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1057MemdataL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1058MemdataS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1058MemdataL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1059MemdataS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1059MemdataL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1060MemdataS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1060MemdataL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1061MemdataS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1061MemdataL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1062MemdataS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1062MemdataL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1063MemdataS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1063MemdataL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1064MemdataS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1064MemdataL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1065MemdataS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1065MemdataL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1066MemdataS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1066MemdataL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1067MemdataS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1067MemdataL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1068MemdataS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1068MemdataL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1069MemdataS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1069MemdataL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1070MemdataS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1070MemdataL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1071MemdataS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1071MemdataL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1072MemdataS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1072MemdataL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1073MemdataS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1073MemdataL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1074MemdataS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1074MemdataL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1075MemdataS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1075MemdataL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1076MemdataS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1076MemdataL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1077MemdataS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1077MemdataL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1078MemdataS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1078MemdataL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1079MemdataS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1079MemdataL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1080MemdataS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1080MemdataL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1081MemdataS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1081MemdataL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1082MemdataS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1082MemdataL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1083MemdataS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1083MemdataL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1084MemdataS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1084MemdataL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1085MemdataS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1085MemdataL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1055MemdataSCounter = -1;
         public boolean isIp65504P1055MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1055MemdataSCounter != sharedCounter;
            localIp65504P1055MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1055_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1055MemdataS
	 */
	protected void serializeIp65504P1055MemdataS(short ip65504P1055MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1055MemdataS,IP_65504_P_1055_MEMDATA_S_LEN)
                  ,beginIp65504P1055MemdataS
                  ,IP_65504_P_1055_MEMDATA_S_LEN
                 );
            localIp65504P1055MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1055MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1055MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1055MemdataS() {	 
			return (getShort(beginIp65504P1055MemdataS));
   	}
         int localIp65504P1055MemdataLCounter = -1;
         public boolean isIp65504P1055MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1055MemdataLCounter != sharedCounter;
            localIp65504P1055MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1055_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1055MemdataL
	 */
	protected void serializeIp65504P1055MemdataL(short ip65504P1055MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1055MemdataL,IP_65504_P_1055_MEMDATA_L_LEN)
                  ,beginIp65504P1055MemdataL
                  ,IP_65504_P_1055_MEMDATA_L_LEN
                 );
            localIp65504P1055MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1055MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1055MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1055MemdataL() {	 
			return (getShort(beginIp65504P1055MemdataL));
   	}
         int localIp65504P1056MemdataSCounter = -1;
         public boolean isIp65504P1056MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1056MemdataSCounter != sharedCounter;
            localIp65504P1056MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1056_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1056MemdataS
	 */
	protected void serializeIp65504P1056MemdataS(short ip65504P1056MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1056MemdataS,IP_65504_P_1056_MEMDATA_S_LEN)
                  ,beginIp65504P1056MemdataS
                  ,IP_65504_P_1056_MEMDATA_S_LEN
                 );
            localIp65504P1056MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1056MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1056MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1056MemdataS() {	 
			return (getShort(beginIp65504P1056MemdataS));
   	}
         int localIp65504P1056MemdataLCounter = -1;
         public boolean isIp65504P1056MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1056MemdataLCounter != sharedCounter;
            localIp65504P1056MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1056_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1056MemdataL
	 */
	protected void serializeIp65504P1056MemdataL(short ip65504P1056MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1056MemdataL,IP_65504_P_1056_MEMDATA_L_LEN)
                  ,beginIp65504P1056MemdataL
                  ,IP_65504_P_1056_MEMDATA_L_LEN
                 );
            localIp65504P1056MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1056MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1056MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1056MemdataL() {	 
			return (getShort(beginIp65504P1056MemdataL));
   	}
         int localIp65504P1057MemdataSCounter = -1;
         public boolean isIp65504P1057MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1057MemdataSCounter != sharedCounter;
            localIp65504P1057MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1057_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1057MemdataS
	 */
	protected void serializeIp65504P1057MemdataS(short ip65504P1057MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1057MemdataS,IP_65504_P_1057_MEMDATA_S_LEN)
                  ,beginIp65504P1057MemdataS
                  ,IP_65504_P_1057_MEMDATA_S_LEN
                 );
            localIp65504P1057MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1057MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1057MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1057MemdataS() {	 
			return (getShort(beginIp65504P1057MemdataS));
   	}
         int localIp65504P1057MemdataLCounter = -1;
         public boolean isIp65504P1057MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1057MemdataLCounter != sharedCounter;
            localIp65504P1057MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1057_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1057MemdataL
	 */
	protected void serializeIp65504P1057MemdataL(short ip65504P1057MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1057MemdataL,IP_65504_P_1057_MEMDATA_L_LEN)
                  ,beginIp65504P1057MemdataL
                  ,IP_65504_P_1057_MEMDATA_L_LEN
                 );
            localIp65504P1057MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1057MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1057MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1057MemdataL() {	 
			return (getShort(beginIp65504P1057MemdataL));
   	}
         int localIp65504P1058MemdataSCounter = -1;
         public boolean isIp65504P1058MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1058MemdataSCounter != sharedCounter;
            localIp65504P1058MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1058_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1058MemdataS
	 */
	protected void serializeIp65504P1058MemdataS(short ip65504P1058MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1058MemdataS,IP_65504_P_1058_MEMDATA_S_LEN)
                  ,beginIp65504P1058MemdataS
                  ,IP_65504_P_1058_MEMDATA_S_LEN
                 );
            localIp65504P1058MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1058MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1058MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1058MemdataS() {	 
			return (getShort(beginIp65504P1058MemdataS));
   	}
         int localIp65504P1058MemdataLCounter = -1;
         public boolean isIp65504P1058MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1058MemdataLCounter != sharedCounter;
            localIp65504P1058MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1058_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1058MemdataL
	 */
	protected void serializeIp65504P1058MemdataL(short ip65504P1058MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1058MemdataL,IP_65504_P_1058_MEMDATA_L_LEN)
                  ,beginIp65504P1058MemdataL
                  ,IP_65504_P_1058_MEMDATA_L_LEN
                 );
            localIp65504P1058MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1058MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1058MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1058MemdataL() {	 
			return (getShort(beginIp65504P1058MemdataL));
   	}
         int localIp65504P1059MemdataSCounter = -1;
         public boolean isIp65504P1059MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1059MemdataSCounter != sharedCounter;
            localIp65504P1059MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1059_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1059MemdataS
	 */
	protected void serializeIp65504P1059MemdataS(short ip65504P1059MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1059MemdataS,IP_65504_P_1059_MEMDATA_S_LEN)
                  ,beginIp65504P1059MemdataS
                  ,IP_65504_P_1059_MEMDATA_S_LEN
                 );
            localIp65504P1059MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1059MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1059MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1059MemdataS() {	 
			return (getShort(beginIp65504P1059MemdataS));
   	}
         int localIp65504P1059MemdataLCounter = -1;
         public boolean isIp65504P1059MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1059MemdataLCounter != sharedCounter;
            localIp65504P1059MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1059_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1059MemdataL
	 */
	protected void serializeIp65504P1059MemdataL(short ip65504P1059MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1059MemdataL,IP_65504_P_1059_MEMDATA_L_LEN)
                  ,beginIp65504P1059MemdataL
                  ,IP_65504_P_1059_MEMDATA_L_LEN
                 );
            localIp65504P1059MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1059MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1059MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1059MemdataL() {	 
			return (getShort(beginIp65504P1059MemdataL));
   	}
         int localIp65504P1060MemdataSCounter = -1;
         public boolean isIp65504P1060MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1060MemdataSCounter != sharedCounter;
            localIp65504P1060MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1060_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1060MemdataS
	 */
	protected void serializeIp65504P1060MemdataS(short ip65504P1060MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1060MemdataS,IP_65504_P_1060_MEMDATA_S_LEN)
                  ,beginIp65504P1060MemdataS
                  ,IP_65504_P_1060_MEMDATA_S_LEN
                 );
            localIp65504P1060MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1060MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1060MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1060MemdataS() {	 
			return (getShort(beginIp65504P1060MemdataS));
   	}
         int localIp65504P1060MemdataLCounter = -1;
         public boolean isIp65504P1060MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1060MemdataLCounter != sharedCounter;
            localIp65504P1060MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1060_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1060MemdataL
	 */
	protected void serializeIp65504P1060MemdataL(short ip65504P1060MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1060MemdataL,IP_65504_P_1060_MEMDATA_L_LEN)
                  ,beginIp65504P1060MemdataL
                  ,IP_65504_P_1060_MEMDATA_L_LEN
                 );
            localIp65504P1060MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1060MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1060MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1060MemdataL() {	 
			return (getShort(beginIp65504P1060MemdataL));
   	}
         int localIp65504P1061MemdataSCounter = -1;
         public boolean isIp65504P1061MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1061MemdataSCounter != sharedCounter;
            localIp65504P1061MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1061_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1061MemdataS
	 */
	protected void serializeIp65504P1061MemdataS(short ip65504P1061MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1061MemdataS,IP_65504_P_1061_MEMDATA_S_LEN)
                  ,beginIp65504P1061MemdataS
                  ,IP_65504_P_1061_MEMDATA_S_LEN
                 );
            localIp65504P1061MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1061MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1061MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1061MemdataS() {	 
			return (getShort(beginIp65504P1061MemdataS));
   	}
         int localIp65504P1061MemdataLCounter = -1;
         public boolean isIp65504P1061MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1061MemdataLCounter != sharedCounter;
            localIp65504P1061MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1061_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1061MemdataL
	 */
	protected void serializeIp65504P1061MemdataL(short ip65504P1061MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1061MemdataL,IP_65504_P_1061_MEMDATA_L_LEN)
                  ,beginIp65504P1061MemdataL
                  ,IP_65504_P_1061_MEMDATA_L_LEN
                 );
            localIp65504P1061MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1061MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1061MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1061MemdataL() {	 
			return (getShort(beginIp65504P1061MemdataL));
   	}
         int localIp65504P1062MemdataSCounter = -1;
         public boolean isIp65504P1062MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1062MemdataSCounter != sharedCounter;
            localIp65504P1062MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1062_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1062MemdataS
	 */
	protected void serializeIp65504P1062MemdataS(short ip65504P1062MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1062MemdataS,IP_65504_P_1062_MEMDATA_S_LEN)
                  ,beginIp65504P1062MemdataS
                  ,IP_65504_P_1062_MEMDATA_S_LEN
                 );
            localIp65504P1062MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1062MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1062MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1062MemdataS() {	 
			return (getShort(beginIp65504P1062MemdataS));
   	}
         int localIp65504P1062MemdataLCounter = -1;
         public boolean isIp65504P1062MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1062MemdataLCounter != sharedCounter;
            localIp65504P1062MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1062_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1062MemdataL
	 */
	protected void serializeIp65504P1062MemdataL(short ip65504P1062MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1062MemdataL,IP_65504_P_1062_MEMDATA_L_LEN)
                  ,beginIp65504P1062MemdataL
                  ,IP_65504_P_1062_MEMDATA_L_LEN
                 );
            localIp65504P1062MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1062MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1062MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1062MemdataL() {	 
			return (getShort(beginIp65504P1062MemdataL));
   	}
         int localIp65504P1063MemdataSCounter = -1;
         public boolean isIp65504P1063MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1063MemdataSCounter != sharedCounter;
            localIp65504P1063MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1063_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1063MemdataS
	 */
	protected void serializeIp65504P1063MemdataS(short ip65504P1063MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1063MemdataS,IP_65504_P_1063_MEMDATA_S_LEN)
                  ,beginIp65504P1063MemdataS
                  ,IP_65504_P_1063_MEMDATA_S_LEN
                 );
            localIp65504P1063MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1063MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1063MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1063MemdataS() {	 
			return (getShort(beginIp65504P1063MemdataS));
   	}
         int localIp65504P1063MemdataLCounter = -1;
         public boolean isIp65504P1063MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1063MemdataLCounter != sharedCounter;
            localIp65504P1063MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1063_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1063MemdataL
	 */
	protected void serializeIp65504P1063MemdataL(short ip65504P1063MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1063MemdataL,IP_65504_P_1063_MEMDATA_L_LEN)
                  ,beginIp65504P1063MemdataL
                  ,IP_65504_P_1063_MEMDATA_L_LEN
                 );
            localIp65504P1063MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1063MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1063MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1063MemdataL() {	 
			return (getShort(beginIp65504P1063MemdataL));
   	}
         int localIp65504P1064MemdataSCounter = -1;
         public boolean isIp65504P1064MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1064MemdataSCounter != sharedCounter;
            localIp65504P1064MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1064_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1064MemdataS
	 */
	protected void serializeIp65504P1064MemdataS(short ip65504P1064MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1064MemdataS,IP_65504_P_1064_MEMDATA_S_LEN)
                  ,beginIp65504P1064MemdataS
                  ,IP_65504_P_1064_MEMDATA_S_LEN
                 );
            localIp65504P1064MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1064MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1064MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1064MemdataS() {	 
			return (getShort(beginIp65504P1064MemdataS));
   	}
         int localIp65504P1064MemdataLCounter = -1;
         public boolean isIp65504P1064MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1064MemdataLCounter != sharedCounter;
            localIp65504P1064MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1064_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1064MemdataL
	 */
	protected void serializeIp65504P1064MemdataL(short ip65504P1064MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1064MemdataL,IP_65504_P_1064_MEMDATA_L_LEN)
                  ,beginIp65504P1064MemdataL
                  ,IP_65504_P_1064_MEMDATA_L_LEN
                 );
            localIp65504P1064MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1064MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1064MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1064MemdataL() {	 
			return (getShort(beginIp65504P1064MemdataL));
   	}
         int localIp65504P1065MemdataSCounter = -1;
         public boolean isIp65504P1065MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1065MemdataSCounter != sharedCounter;
            localIp65504P1065MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1065_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1065MemdataS
	 */
	protected void serializeIp65504P1065MemdataS(short ip65504P1065MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1065MemdataS,IP_65504_P_1065_MEMDATA_S_LEN)
                  ,beginIp65504P1065MemdataS
                  ,IP_65504_P_1065_MEMDATA_S_LEN
                 );
            localIp65504P1065MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1065MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1065MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1065MemdataS() {	 
			return (getShort(beginIp65504P1065MemdataS));
   	}
         int localIp65504P1065MemdataLCounter = -1;
         public boolean isIp65504P1065MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1065MemdataLCounter != sharedCounter;
            localIp65504P1065MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1065_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1065MemdataL
	 */
	protected void serializeIp65504P1065MemdataL(short ip65504P1065MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1065MemdataL,IP_65504_P_1065_MEMDATA_L_LEN)
                  ,beginIp65504P1065MemdataL
                  ,IP_65504_P_1065_MEMDATA_L_LEN
                 );
            localIp65504P1065MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1065MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1065MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1065MemdataL() {	 
			return (getShort(beginIp65504P1065MemdataL));
   	}
         int localIp65504P1066MemdataSCounter = -1;
         public boolean isIp65504P1066MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1066MemdataSCounter != sharedCounter;
            localIp65504P1066MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1066_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1066MemdataS
	 */
	protected void serializeIp65504P1066MemdataS(short ip65504P1066MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1066MemdataS,IP_65504_P_1066_MEMDATA_S_LEN)
                  ,beginIp65504P1066MemdataS
                  ,IP_65504_P_1066_MEMDATA_S_LEN
                 );
            localIp65504P1066MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1066MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1066MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1066MemdataS() {	 
			return (getShort(beginIp65504P1066MemdataS));
   	}
         int localIp65504P1066MemdataLCounter = -1;
         public boolean isIp65504P1066MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1066MemdataLCounter != sharedCounter;
            localIp65504P1066MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1066_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1066MemdataL
	 */
	protected void serializeIp65504P1066MemdataL(short ip65504P1066MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1066MemdataL,IP_65504_P_1066_MEMDATA_L_LEN)
                  ,beginIp65504P1066MemdataL
                  ,IP_65504_P_1066_MEMDATA_L_LEN
                 );
            localIp65504P1066MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1066MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1066MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1066MemdataL() {	 
			return (getShort(beginIp65504P1066MemdataL));
   	}
         int localIp65504P1067MemdataSCounter = -1;
         public boolean isIp65504P1067MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1067MemdataSCounter != sharedCounter;
            localIp65504P1067MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1067_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1067MemdataS
	 */
	protected void serializeIp65504P1067MemdataS(short ip65504P1067MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1067MemdataS,IP_65504_P_1067_MEMDATA_S_LEN)
                  ,beginIp65504P1067MemdataS
                  ,IP_65504_P_1067_MEMDATA_S_LEN
                 );
            localIp65504P1067MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1067MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1067MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1067MemdataS() {	 
			return (getShort(beginIp65504P1067MemdataS));
   	}
         int localIp65504P1067MemdataLCounter = -1;
         public boolean isIp65504P1067MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1067MemdataLCounter != sharedCounter;
            localIp65504P1067MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1067_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1067MemdataL
	 */
	protected void serializeIp65504P1067MemdataL(short ip65504P1067MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1067MemdataL,IP_65504_P_1067_MEMDATA_L_LEN)
                  ,beginIp65504P1067MemdataL
                  ,IP_65504_P_1067_MEMDATA_L_LEN
                 );
            localIp65504P1067MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1067MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1067MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1067MemdataL() {	 
			return (getShort(beginIp65504P1067MemdataL));
   	}
         int localIp65504P1068MemdataSCounter = -1;
         public boolean isIp65504P1068MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1068MemdataSCounter != sharedCounter;
            localIp65504P1068MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1068_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1068MemdataS
	 */
	protected void serializeIp65504P1068MemdataS(short ip65504P1068MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1068MemdataS,IP_65504_P_1068_MEMDATA_S_LEN)
                  ,beginIp65504P1068MemdataS
                  ,IP_65504_P_1068_MEMDATA_S_LEN
                 );
            localIp65504P1068MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1068MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1068MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1068MemdataS() {	 
			return (getShort(beginIp65504P1068MemdataS));
   	}
         int localIp65504P1068MemdataLCounter = -1;
         public boolean isIp65504P1068MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1068MemdataLCounter != sharedCounter;
            localIp65504P1068MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1068_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1068MemdataL
	 */
	protected void serializeIp65504P1068MemdataL(short ip65504P1068MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1068MemdataL,IP_65504_P_1068_MEMDATA_L_LEN)
                  ,beginIp65504P1068MemdataL
                  ,IP_65504_P_1068_MEMDATA_L_LEN
                 );
            localIp65504P1068MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1068MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1068MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1068MemdataL() {	 
			return (getShort(beginIp65504P1068MemdataL));
   	}
         int localIp65504P1069MemdataSCounter = -1;
         public boolean isIp65504P1069MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1069MemdataSCounter != sharedCounter;
            localIp65504P1069MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1069_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1069MemdataS
	 */
	protected void serializeIp65504P1069MemdataS(short ip65504P1069MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1069MemdataS,IP_65504_P_1069_MEMDATA_S_LEN)
                  ,beginIp65504P1069MemdataS
                  ,IP_65504_P_1069_MEMDATA_S_LEN
                 );
            localIp65504P1069MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1069MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1069MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1069MemdataS() {	 
			return (getShort(beginIp65504P1069MemdataS));
   	}
         int localIp65504P1069MemdataLCounter = -1;
         public boolean isIp65504P1069MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1069MemdataLCounter != sharedCounter;
            localIp65504P1069MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1069_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1069MemdataL
	 */
	protected void serializeIp65504P1069MemdataL(short ip65504P1069MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1069MemdataL,IP_65504_P_1069_MEMDATA_L_LEN)
                  ,beginIp65504P1069MemdataL
                  ,IP_65504_P_1069_MEMDATA_L_LEN
                 );
            localIp65504P1069MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1069MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1069MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1069MemdataL() {	 
			return (getShort(beginIp65504P1069MemdataL));
   	}
         int localIp65504P1070MemdataSCounter = -1;
         public boolean isIp65504P1070MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1070MemdataSCounter != sharedCounter;
            localIp65504P1070MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1070_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1070MemdataS
	 */
	protected void serializeIp65504P1070MemdataS(short ip65504P1070MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1070MemdataS,IP_65504_P_1070_MEMDATA_S_LEN)
                  ,beginIp65504P1070MemdataS
                  ,IP_65504_P_1070_MEMDATA_S_LEN
                 );
            localIp65504P1070MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1070MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1070MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1070MemdataS() {	 
			return (getShort(beginIp65504P1070MemdataS));
   	}
         int localIp65504P1070MemdataLCounter = -1;
         public boolean isIp65504P1070MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1070MemdataLCounter != sharedCounter;
            localIp65504P1070MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1070_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1070MemdataL
	 */
	protected void serializeIp65504P1070MemdataL(short ip65504P1070MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1070MemdataL,IP_65504_P_1070_MEMDATA_L_LEN)
                  ,beginIp65504P1070MemdataL
                  ,IP_65504_P_1070_MEMDATA_L_LEN
                 );
            localIp65504P1070MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1070MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1070MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1070MemdataL() {	 
			return (getShort(beginIp65504P1070MemdataL));
   	}
         int localIp65504P1071MemdataSCounter = -1;
         public boolean isIp65504P1071MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1071MemdataSCounter != sharedCounter;
            localIp65504P1071MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1071_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1071MemdataS
	 */
	protected void serializeIp65504P1071MemdataS(short ip65504P1071MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1071MemdataS,IP_65504_P_1071_MEMDATA_S_LEN)
                  ,beginIp65504P1071MemdataS
                  ,IP_65504_P_1071_MEMDATA_S_LEN
                 );
            localIp65504P1071MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1071MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1071MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1071MemdataS() {	 
			return (getShort(beginIp65504P1071MemdataS));
   	}
         int localIp65504P1071MemdataLCounter = -1;
         public boolean isIp65504P1071MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1071MemdataLCounter != sharedCounter;
            localIp65504P1071MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1071_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1071MemdataL
	 */
	protected void serializeIp65504P1071MemdataL(short ip65504P1071MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1071MemdataL,IP_65504_P_1071_MEMDATA_L_LEN)
                  ,beginIp65504P1071MemdataL
                  ,IP_65504_P_1071_MEMDATA_L_LEN
                 );
            localIp65504P1071MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1071MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1071MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1071MemdataL() {	 
			return (getShort(beginIp65504P1071MemdataL));
   	}
         int localIp65504P1072MemdataSCounter = -1;
         public boolean isIp65504P1072MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1072MemdataSCounter != sharedCounter;
            localIp65504P1072MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1072_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1072MemdataS
	 */
	protected void serializeIp65504P1072MemdataS(short ip65504P1072MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1072MemdataS,IP_65504_P_1072_MEMDATA_S_LEN)
                  ,beginIp65504P1072MemdataS
                  ,IP_65504_P_1072_MEMDATA_S_LEN
                 );
            localIp65504P1072MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1072MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1072MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1072MemdataS() {	 
			return (getShort(beginIp65504P1072MemdataS));
   	}
         int localIp65504P1072MemdataLCounter = -1;
         public boolean isIp65504P1072MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1072MemdataLCounter != sharedCounter;
            localIp65504P1072MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1072_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1072MemdataL
	 */
	protected void serializeIp65504P1072MemdataL(short ip65504P1072MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1072MemdataL,IP_65504_P_1072_MEMDATA_L_LEN)
                  ,beginIp65504P1072MemdataL
                  ,IP_65504_P_1072_MEMDATA_L_LEN
                 );
            localIp65504P1072MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1072MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1072MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1072MemdataL() {	 
			return (getShort(beginIp65504P1072MemdataL));
   	}
         int localIp65504P1073MemdataSCounter = -1;
         public boolean isIp65504P1073MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1073MemdataSCounter != sharedCounter;
            localIp65504P1073MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1073_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1073MemdataS
	 */
	protected void serializeIp65504P1073MemdataS(short ip65504P1073MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1073MemdataS,IP_65504_P_1073_MEMDATA_S_LEN)
                  ,beginIp65504P1073MemdataS
                  ,IP_65504_P_1073_MEMDATA_S_LEN
                 );
            localIp65504P1073MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1073MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1073MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1073MemdataS() {	 
			return (getShort(beginIp65504P1073MemdataS));
   	}
         int localIp65504P1073MemdataLCounter = -1;
         public boolean isIp65504P1073MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1073MemdataLCounter != sharedCounter;
            localIp65504P1073MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1073_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1073MemdataL
	 */
	protected void serializeIp65504P1073MemdataL(short ip65504P1073MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1073MemdataL,IP_65504_P_1073_MEMDATA_L_LEN)
                  ,beginIp65504P1073MemdataL
                  ,IP_65504_P_1073_MEMDATA_L_LEN
                 );
            localIp65504P1073MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1073MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1073MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1073MemdataL() {	 
			return (getShort(beginIp65504P1073MemdataL));
   	}
         int localIp65504P1074MemdataSCounter = -1;
         public boolean isIp65504P1074MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1074MemdataSCounter != sharedCounter;
            localIp65504P1074MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1074_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1074MemdataS
	 */
	protected void serializeIp65504P1074MemdataS(short ip65504P1074MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1074MemdataS,IP_65504_P_1074_MEMDATA_S_LEN)
                  ,beginIp65504P1074MemdataS
                  ,IP_65504_P_1074_MEMDATA_S_LEN
                 );
            localIp65504P1074MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1074MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1074MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1074MemdataS() {	 
			return (getShort(beginIp65504P1074MemdataS));
   	}
         int localIp65504P1074MemdataLCounter = -1;
         public boolean isIp65504P1074MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1074MemdataLCounter != sharedCounter;
            localIp65504P1074MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1074_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1074MemdataL
	 */
	protected void serializeIp65504P1074MemdataL(short ip65504P1074MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1074MemdataL,IP_65504_P_1074_MEMDATA_L_LEN)
                  ,beginIp65504P1074MemdataL
                  ,IP_65504_P_1074_MEMDATA_L_LEN
                 );
            localIp65504P1074MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1074MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1074MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1074MemdataL() {	 
			return (getShort(beginIp65504P1074MemdataL));
   	}
         int localIp65504P1075MemdataSCounter = -1;
         public boolean isIp65504P1075MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1075MemdataSCounter != sharedCounter;
            localIp65504P1075MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1075_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1075MemdataS
	 */
	protected void serializeIp65504P1075MemdataS(short ip65504P1075MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1075MemdataS,IP_65504_P_1075_MEMDATA_S_LEN)
                  ,beginIp65504P1075MemdataS
                  ,IP_65504_P_1075_MEMDATA_S_LEN
                 );
            localIp65504P1075MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1075MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1075MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1075MemdataS() {	 
			return (getShort(beginIp65504P1075MemdataS));
   	}
         int localIp65504P1075MemdataLCounter = -1;
         public boolean isIp65504P1075MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1075MemdataLCounter != sharedCounter;
            localIp65504P1075MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1075_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1075MemdataL
	 */
	protected void serializeIp65504P1075MemdataL(short ip65504P1075MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1075MemdataL,IP_65504_P_1075_MEMDATA_L_LEN)
                  ,beginIp65504P1075MemdataL
                  ,IP_65504_P_1075_MEMDATA_L_LEN
                 );
            localIp65504P1075MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1075MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1075MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1075MemdataL() {	 
			return (getShort(beginIp65504P1075MemdataL));
   	}
         int localIp65504P1076MemdataSCounter = -1;
         public boolean isIp65504P1076MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1076MemdataSCounter != sharedCounter;
            localIp65504P1076MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1076_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1076MemdataS
	 */
	protected void serializeIp65504P1076MemdataS(short ip65504P1076MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1076MemdataS,IP_65504_P_1076_MEMDATA_S_LEN)
                  ,beginIp65504P1076MemdataS
                  ,IP_65504_P_1076_MEMDATA_S_LEN
                 );
            localIp65504P1076MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1076MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1076MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1076MemdataS() {	 
			return (getShort(beginIp65504P1076MemdataS));
   	}
         int localIp65504P1076MemdataLCounter = -1;
         public boolean isIp65504P1076MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1076MemdataLCounter != sharedCounter;
            localIp65504P1076MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1076_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1076MemdataL
	 */
	protected void serializeIp65504P1076MemdataL(short ip65504P1076MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1076MemdataL,IP_65504_P_1076_MEMDATA_L_LEN)
                  ,beginIp65504P1076MemdataL
                  ,IP_65504_P_1076_MEMDATA_L_LEN
                 );
            localIp65504P1076MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1076MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1076MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1076MemdataL() {	 
			return (getShort(beginIp65504P1076MemdataL));
   	}
         int localIp65504P1077MemdataSCounter = -1;
         public boolean isIp65504P1077MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1077MemdataSCounter != sharedCounter;
            localIp65504P1077MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1077_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1077MemdataS
	 */
	protected void serializeIp65504P1077MemdataS(short ip65504P1077MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1077MemdataS,IP_65504_P_1077_MEMDATA_S_LEN)
                  ,beginIp65504P1077MemdataS
                  ,IP_65504_P_1077_MEMDATA_S_LEN
                 );
            localIp65504P1077MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1077MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1077MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1077MemdataS() {	 
			return (getShort(beginIp65504P1077MemdataS));
   	}
         int localIp65504P1077MemdataLCounter = -1;
         public boolean isIp65504P1077MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1077MemdataLCounter != sharedCounter;
            localIp65504P1077MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1077_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1077MemdataL
	 */
	protected void serializeIp65504P1077MemdataL(short ip65504P1077MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1077MemdataL,IP_65504_P_1077_MEMDATA_L_LEN)
                  ,beginIp65504P1077MemdataL
                  ,IP_65504_P_1077_MEMDATA_L_LEN
                 );
            localIp65504P1077MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1077MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1077MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1077MemdataL() {	 
			return (getShort(beginIp65504P1077MemdataL));
   	}
         int localIp65504P1078MemdataSCounter = -1;
         public boolean isIp65504P1078MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1078MemdataSCounter != sharedCounter;
            localIp65504P1078MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1078_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1078MemdataS
	 */
	protected void serializeIp65504P1078MemdataS(short ip65504P1078MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1078MemdataS,IP_65504_P_1078_MEMDATA_S_LEN)
                  ,beginIp65504P1078MemdataS
                  ,IP_65504_P_1078_MEMDATA_S_LEN
                 );
            localIp65504P1078MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1078MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1078MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1078MemdataS() {	 
			return (getShort(beginIp65504P1078MemdataS));
   	}
         int localIp65504P1078MemdataLCounter = -1;
         public boolean isIp65504P1078MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1078MemdataLCounter != sharedCounter;
            localIp65504P1078MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1078_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1078MemdataL
	 */
	protected void serializeIp65504P1078MemdataL(short ip65504P1078MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1078MemdataL,IP_65504_P_1078_MEMDATA_L_LEN)
                  ,beginIp65504P1078MemdataL
                  ,IP_65504_P_1078_MEMDATA_L_LEN
                 );
            localIp65504P1078MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1078MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1078MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1078MemdataL() {	 
			return (getShort(beginIp65504P1078MemdataL));
   	}
         int localIp65504P1079MemdataSCounter = -1;
         public boolean isIp65504P1079MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1079MemdataSCounter != sharedCounter;
            localIp65504P1079MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1079_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1079MemdataS
	 */
	protected void serializeIp65504P1079MemdataS(short ip65504P1079MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1079MemdataS,IP_65504_P_1079_MEMDATA_S_LEN)
                  ,beginIp65504P1079MemdataS
                  ,IP_65504_P_1079_MEMDATA_S_LEN
                 );
            localIp65504P1079MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1079MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1079MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1079MemdataS() {	 
			return (getShort(beginIp65504P1079MemdataS));
   	}
         int localIp65504P1079MemdataLCounter = -1;
         public boolean isIp65504P1079MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1079MemdataLCounter != sharedCounter;
            localIp65504P1079MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1079_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1079MemdataL
	 */
	protected void serializeIp65504P1079MemdataL(short ip65504P1079MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1079MemdataL,IP_65504_P_1079_MEMDATA_L_LEN)
                  ,beginIp65504P1079MemdataL
                  ,IP_65504_P_1079_MEMDATA_L_LEN
                 );
            localIp65504P1079MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1079MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1079MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1079MemdataL() {	 
			return (getShort(beginIp65504P1079MemdataL));
   	}
         int localIp65504P1080MemdataSCounter = -1;
         public boolean isIp65504P1080MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1080MemdataSCounter != sharedCounter;
            localIp65504P1080MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1080_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1080MemdataS
	 */
	protected void serializeIp65504P1080MemdataS(short ip65504P1080MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1080MemdataS,IP_65504_P_1080_MEMDATA_S_LEN)
                  ,beginIp65504P1080MemdataS
                  ,IP_65504_P_1080_MEMDATA_S_LEN
                 );
            localIp65504P1080MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1080MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1080MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1080MemdataS() {	 
			return (getShort(beginIp65504P1080MemdataS));
   	}
         int localIp65504P1080MemdataLCounter = -1;
         public boolean isIp65504P1080MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1080MemdataLCounter != sharedCounter;
            localIp65504P1080MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1080_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1080MemdataL
	 */
	protected void serializeIp65504P1080MemdataL(short ip65504P1080MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1080MemdataL,IP_65504_P_1080_MEMDATA_L_LEN)
                  ,beginIp65504P1080MemdataL
                  ,IP_65504_P_1080_MEMDATA_L_LEN
                 );
            localIp65504P1080MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1080MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1080MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1080MemdataL() {	 
			return (getShort(beginIp65504P1080MemdataL));
   	}
         int localIp65504P1081MemdataSCounter = -1;
         public boolean isIp65504P1081MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1081MemdataSCounter != sharedCounter;
            localIp65504P1081MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1081_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1081MemdataS
	 */
	protected void serializeIp65504P1081MemdataS(short ip65504P1081MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1081MemdataS,IP_65504_P_1081_MEMDATA_S_LEN)
                  ,beginIp65504P1081MemdataS
                  ,IP_65504_P_1081_MEMDATA_S_LEN
                 );
            localIp65504P1081MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1081MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1081MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1081MemdataS() {	 
			return (getShort(beginIp65504P1081MemdataS));
   	}
         int localIp65504P1081MemdataLCounter = -1;
         public boolean isIp65504P1081MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1081MemdataLCounter != sharedCounter;
            localIp65504P1081MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1081_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1081MemdataL
	 */
	protected void serializeIp65504P1081MemdataL(short ip65504P1081MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1081MemdataL,IP_65504_P_1081_MEMDATA_L_LEN)
                  ,beginIp65504P1081MemdataL
                  ,IP_65504_P_1081_MEMDATA_L_LEN
                 );
            localIp65504P1081MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1081MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1081MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1081MemdataL() {	 
			return (getShort(beginIp65504P1081MemdataL));
   	}
         int localIp65504P1082MemdataSCounter = -1;
         public boolean isIp65504P1082MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1082MemdataSCounter != sharedCounter;
            localIp65504P1082MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1082_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1082MemdataS
	 */
	protected void serializeIp65504P1082MemdataS(short ip65504P1082MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1082MemdataS,IP_65504_P_1082_MEMDATA_S_LEN)
                  ,beginIp65504P1082MemdataS
                  ,IP_65504_P_1082_MEMDATA_S_LEN
                 );
            localIp65504P1082MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1082MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1082MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1082MemdataS() {	 
			return (getShort(beginIp65504P1082MemdataS));
   	}
         int localIp65504P1082MemdataLCounter = -1;
         public boolean isIp65504P1082MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1082MemdataLCounter != sharedCounter;
            localIp65504P1082MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1082_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1082MemdataL
	 */
	protected void serializeIp65504P1082MemdataL(short ip65504P1082MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1082MemdataL,IP_65504_P_1082_MEMDATA_L_LEN)
                  ,beginIp65504P1082MemdataL
                  ,IP_65504_P_1082_MEMDATA_L_LEN
                 );
            localIp65504P1082MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1082MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1082MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1082MemdataL() {	 
			return (getShort(beginIp65504P1082MemdataL));
   	}
         int localIp65504P1083MemdataSCounter = -1;
         public boolean isIp65504P1083MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1083MemdataSCounter != sharedCounter;
            localIp65504P1083MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1083_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1083MemdataS
	 */
	protected void serializeIp65504P1083MemdataS(short ip65504P1083MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1083MemdataS,IP_65504_P_1083_MEMDATA_S_LEN)
                  ,beginIp65504P1083MemdataS
                  ,IP_65504_P_1083_MEMDATA_S_LEN
                 );
            localIp65504P1083MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1083MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1083MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1083MemdataS() {	 
			return (getShort(beginIp65504P1083MemdataS));
   	}
         int localIp65504P1083MemdataLCounter = -1;
         public boolean isIp65504P1083MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1083MemdataLCounter != sharedCounter;
            localIp65504P1083MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1083_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1083MemdataL
	 */
	protected void serializeIp65504P1083MemdataL(short ip65504P1083MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1083MemdataL,IP_65504_P_1083_MEMDATA_L_LEN)
                  ,beginIp65504P1083MemdataL
                  ,IP_65504_P_1083_MEMDATA_L_LEN
                 );
            localIp65504P1083MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1083MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1083MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1083MemdataL() {	 
			return (getShort(beginIp65504P1083MemdataL));
   	}
         int localIp65504P1084MemdataSCounter = -1;
         public boolean isIp65504P1084MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1084MemdataSCounter != sharedCounter;
            localIp65504P1084MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1084_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1084MemdataS
	 */
	protected void serializeIp65504P1084MemdataS(short ip65504P1084MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1084MemdataS,IP_65504_P_1084_MEMDATA_S_LEN)
                  ,beginIp65504P1084MemdataS
                  ,IP_65504_P_1084_MEMDATA_S_LEN
                 );
            localIp65504P1084MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1084MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1084MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1084MemdataS() {	 
			return (getShort(beginIp65504P1084MemdataS));
   	}
         int localIp65504P1084MemdataLCounter = -1;
         public boolean isIp65504P1084MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1084MemdataLCounter != sharedCounter;
            localIp65504P1084MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1084_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1084MemdataL
	 */
	protected void serializeIp65504P1084MemdataL(short ip65504P1084MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1084MemdataL,IP_65504_P_1084_MEMDATA_L_LEN)
                  ,beginIp65504P1084MemdataL
                  ,IP_65504_P_1084_MEMDATA_L_LEN
                 );
            localIp65504P1084MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1084MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1084MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1084MemdataL() {	 
			return (getShort(beginIp65504P1084MemdataL));
   	}
         int localIp65504P1085MemdataSCounter = -1;
         public boolean isIp65504P1085MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1085MemdataSCounter != sharedCounter;
            localIp65504P1085MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1085_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1085MemdataS
	 */
	protected void serializeIp65504P1085MemdataS(short ip65504P1085MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1085MemdataS,IP_65504_P_1085_MEMDATA_S_LEN)
                  ,beginIp65504P1085MemdataS
                  ,IP_65504_P_1085_MEMDATA_S_LEN
                 );
            localIp65504P1085MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1085MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1085MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1085MemdataS() {	 
			return (getShort(beginIp65504P1085MemdataS));
   	}
         int localIp65504P1085MemdataLCounter = -1;
         public boolean isIp65504P1085MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1085MemdataLCounter != sharedCounter;
            localIp65504P1085MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1085_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1085MemdataL
	 */
	protected void serializeIp65504P1085MemdataL(short ip65504P1085MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1085MemdataL,IP_65504_P_1085_MEMDATA_L_LEN)
                  ,beginIp65504P1085MemdataL
                  ,IP_65504_P_1085_MEMDATA_L_LEN
                 );
            localIp65504P1085MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1085MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1085MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1085MemdataL() {	 
			return (getShort(beginIp65504P1085MemdataL));
   	}




}
  
