package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup34Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup34Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup34Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_34_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1024MemdataS;
            protected  int beginIp65504P1024MemdataL;
            protected  int beginIp65504P1025MemdataS;
            protected  int beginIp65504P1025MemdataL;
            protected  int beginIp65504P1026MemdataS;
            protected  int beginIp65504P1026MemdataL;
            protected  int beginIp65504P1027MemdataS;
            protected  int beginIp65504P1027MemdataL;
            protected  int beginIp65504P1028MemdataS;
            protected  int beginIp65504P1028MemdataL;
            protected  int beginIp65504P1029MemdataS;
            protected  int beginIp65504P1029MemdataL;
            protected  int beginIp65504P1030MemdataS;
            protected  int beginIp65504P1030MemdataL;
            protected  int beginIp65504P1031MemdataS;
            protected  int beginIp65504P1031MemdataL;
            protected  int beginIp65504P1032MemdataS;
            protected  int beginIp65504P1032MemdataL;
            protected  int beginIp65504P1033MemdataS;
            protected  int beginIp65504P1033MemdataL;
            protected  int beginIp65504P1034MemdataS;
            protected  int beginIp65504P1034MemdataL;
            protected  int beginIp65504P1035MemdataS;
            protected  int beginIp65504P1035MemdataL;
            protected  int beginIp65504P1036MemdataS;
            protected  int beginIp65504P1036MemdataL;
            protected  int beginIp65504P1037MemdataS;
            protected  int beginIp65504P1037MemdataL;
            protected  int beginIp65504P1038MemdataS;
            protected  int beginIp65504P1038MemdataL;
            protected  int beginIp65504P1039MemdataS;
            protected  int beginIp65504P1039MemdataL;
            protected  int beginIp65504P1040MemdataS;
            protected  int beginIp65504P1040MemdataL;
            protected  int beginIp65504P1041MemdataS;
            protected  int beginIp65504P1041MemdataL;
            protected  int beginIp65504P1042MemdataS;
            protected  int beginIp65504P1042MemdataL;
            protected  int beginIp65504P1043MemdataS;
            protected  int beginIp65504P1043MemdataL;
            protected  int beginIp65504P1044MemdataS;
            protected  int beginIp65504P1044MemdataL;
            protected  int beginIp65504P1045MemdataS;
            protected  int beginIp65504P1045MemdataL;
            protected  int beginIp65504P1046MemdataS;
            protected  int beginIp65504P1046MemdataL;
            protected  int beginIp65504P1047MemdataS;
            protected  int beginIp65504P1047MemdataL;
            protected  int beginIp65504P1048MemdataS;
            protected  int beginIp65504P1048MemdataL;
            protected  int beginIp65504P1049MemdataS;
            protected  int beginIp65504P1049MemdataL;
            protected  int beginIp65504P1050MemdataS;
            protected  int beginIp65504P1050MemdataL;
            protected  int beginIp65504P1051MemdataS;
            protected  int beginIp65504P1051MemdataL;
            protected  int beginIp65504P1052MemdataS;
            protected  int beginIp65504P1052MemdataL;
            protected  int beginIp65504P1053MemdataS;
            protected  int beginIp65504P1053MemdataL;
            protected  int beginIp65504P1054MemdataS;
            protected  int beginIp65504P1054MemdataL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup34Serialized
	**/
    public Ip65504PdsNamesLargeGroup34Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup34Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup34Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup34Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8180); // serialize this field at offset 8180 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup34Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8180 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup34Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_34_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1024MemdataS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1024MemdataL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1025MemdataS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1025MemdataL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1026MemdataS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1026MemdataL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1027MemdataS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1027MemdataL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1028MemdataS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1028MemdataL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1029MemdataS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1029MemdataL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1030MemdataS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1030MemdataL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1031MemdataS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1031MemdataL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1032MemdataS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1032MemdataL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1033MemdataS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1033MemdataL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1034MemdataS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1034MemdataL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1035MemdataS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1035MemdataL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1036MemdataS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1036MemdataL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1037MemdataS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1037MemdataL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1038MemdataS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1038MemdataL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1039MemdataS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1039MemdataL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1040MemdataS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1040MemdataL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1041MemdataS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1041MemdataL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1042MemdataS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1042MemdataL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1043MemdataS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1043MemdataL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1044MemdataS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1044MemdataL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1045MemdataS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1045MemdataL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1046MemdataS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1046MemdataL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1047MemdataS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1047MemdataL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1048MemdataS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1048MemdataL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1049MemdataS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1049MemdataL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1050MemdataS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1050MemdataL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1051MemdataS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1051MemdataL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1052MemdataS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1052MemdataL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1053MemdataS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1053MemdataL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1054MemdataS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1054MemdataL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1024MemdataSCounter = -1;
         public boolean isIp65504P1024MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1024MemdataSCounter != sharedCounter;
            localIp65504P1024MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1024_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1024MemdataS
	 */
	protected void serializeIp65504P1024MemdataS(short ip65504P1024MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1024MemdataS,IP_65504_P_1024_MEMDATA_S_LEN)
                  ,beginIp65504P1024MemdataS
                  ,IP_65504_P_1024_MEMDATA_S_LEN
                 );
            localIp65504P1024MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1024MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1024MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1024MemdataS() {	 
			return (getShort(beginIp65504P1024MemdataS));
   	}
         int localIp65504P1024MemdataLCounter = -1;
         public boolean isIp65504P1024MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1024MemdataLCounter != sharedCounter;
            localIp65504P1024MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1024_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1024MemdataL
	 */
	protected void serializeIp65504P1024MemdataL(short ip65504P1024MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1024MemdataL,IP_65504_P_1024_MEMDATA_L_LEN)
                  ,beginIp65504P1024MemdataL
                  ,IP_65504_P_1024_MEMDATA_L_LEN
                 );
            localIp65504P1024MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1024MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1024MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1024MemdataL() {	 
			return (getShort(beginIp65504P1024MemdataL));
   	}
         int localIp65504P1025MemdataSCounter = -1;
         public boolean isIp65504P1025MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1025MemdataSCounter != sharedCounter;
            localIp65504P1025MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1025_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1025MemdataS
	 */
	protected void serializeIp65504P1025MemdataS(short ip65504P1025MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1025MemdataS,IP_65504_P_1025_MEMDATA_S_LEN)
                  ,beginIp65504P1025MemdataS
                  ,IP_65504_P_1025_MEMDATA_S_LEN
                 );
            localIp65504P1025MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1025MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1025MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1025MemdataS() {	 
			return (getShort(beginIp65504P1025MemdataS));
   	}
         int localIp65504P1025MemdataLCounter = -1;
         public boolean isIp65504P1025MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1025MemdataLCounter != sharedCounter;
            localIp65504P1025MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1025_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1025MemdataL
	 */
	protected void serializeIp65504P1025MemdataL(short ip65504P1025MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1025MemdataL,IP_65504_P_1025_MEMDATA_L_LEN)
                  ,beginIp65504P1025MemdataL
                  ,IP_65504_P_1025_MEMDATA_L_LEN
                 );
            localIp65504P1025MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1025MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1025MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1025MemdataL() {	 
			return (getShort(beginIp65504P1025MemdataL));
   	}
         int localIp65504P1026MemdataSCounter = -1;
         public boolean isIp65504P1026MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1026MemdataSCounter != sharedCounter;
            localIp65504P1026MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1026_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1026MemdataS
	 */
	protected void serializeIp65504P1026MemdataS(short ip65504P1026MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1026MemdataS,IP_65504_P_1026_MEMDATA_S_LEN)
                  ,beginIp65504P1026MemdataS
                  ,IP_65504_P_1026_MEMDATA_S_LEN
                 );
            localIp65504P1026MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1026MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1026MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1026MemdataS() {	 
			return (getShort(beginIp65504P1026MemdataS));
   	}
         int localIp65504P1026MemdataLCounter = -1;
         public boolean isIp65504P1026MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1026MemdataLCounter != sharedCounter;
            localIp65504P1026MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1026_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1026MemdataL
	 */
	protected void serializeIp65504P1026MemdataL(short ip65504P1026MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1026MemdataL,IP_65504_P_1026_MEMDATA_L_LEN)
                  ,beginIp65504P1026MemdataL
                  ,IP_65504_P_1026_MEMDATA_L_LEN
                 );
            localIp65504P1026MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1026MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1026MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1026MemdataL() {	 
			return (getShort(beginIp65504P1026MemdataL));
   	}
         int localIp65504P1027MemdataSCounter = -1;
         public boolean isIp65504P1027MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1027MemdataSCounter != sharedCounter;
            localIp65504P1027MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1027_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1027MemdataS
	 */
	protected void serializeIp65504P1027MemdataS(short ip65504P1027MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1027MemdataS,IP_65504_P_1027_MEMDATA_S_LEN)
                  ,beginIp65504P1027MemdataS
                  ,IP_65504_P_1027_MEMDATA_S_LEN
                 );
            localIp65504P1027MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1027MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1027MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1027MemdataS() {	 
			return (getShort(beginIp65504P1027MemdataS));
   	}
         int localIp65504P1027MemdataLCounter = -1;
         public boolean isIp65504P1027MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1027MemdataLCounter != sharedCounter;
            localIp65504P1027MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1027_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1027MemdataL
	 */
	protected void serializeIp65504P1027MemdataL(short ip65504P1027MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1027MemdataL,IP_65504_P_1027_MEMDATA_L_LEN)
                  ,beginIp65504P1027MemdataL
                  ,IP_65504_P_1027_MEMDATA_L_LEN
                 );
            localIp65504P1027MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1027MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1027MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1027MemdataL() {	 
			return (getShort(beginIp65504P1027MemdataL));
   	}
         int localIp65504P1028MemdataSCounter = -1;
         public boolean isIp65504P1028MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1028MemdataSCounter != sharedCounter;
            localIp65504P1028MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1028_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1028MemdataS
	 */
	protected void serializeIp65504P1028MemdataS(short ip65504P1028MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1028MemdataS,IP_65504_P_1028_MEMDATA_S_LEN)
                  ,beginIp65504P1028MemdataS
                  ,IP_65504_P_1028_MEMDATA_S_LEN
                 );
            localIp65504P1028MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1028MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1028MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1028MemdataS() {	 
			return (getShort(beginIp65504P1028MemdataS));
   	}
         int localIp65504P1028MemdataLCounter = -1;
         public boolean isIp65504P1028MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1028MemdataLCounter != sharedCounter;
            localIp65504P1028MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1028_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1028MemdataL
	 */
	protected void serializeIp65504P1028MemdataL(short ip65504P1028MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1028MemdataL,IP_65504_P_1028_MEMDATA_L_LEN)
                  ,beginIp65504P1028MemdataL
                  ,IP_65504_P_1028_MEMDATA_L_LEN
                 );
            localIp65504P1028MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1028MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1028MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1028MemdataL() {	 
			return (getShort(beginIp65504P1028MemdataL));
   	}
         int localIp65504P1029MemdataSCounter = -1;
         public boolean isIp65504P1029MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1029MemdataSCounter != sharedCounter;
            localIp65504P1029MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1029_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1029MemdataS
	 */
	protected void serializeIp65504P1029MemdataS(short ip65504P1029MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1029MemdataS,IP_65504_P_1029_MEMDATA_S_LEN)
                  ,beginIp65504P1029MemdataS
                  ,IP_65504_P_1029_MEMDATA_S_LEN
                 );
            localIp65504P1029MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1029MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1029MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1029MemdataS() {	 
			return (getShort(beginIp65504P1029MemdataS));
   	}
         int localIp65504P1029MemdataLCounter = -1;
         public boolean isIp65504P1029MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1029MemdataLCounter != sharedCounter;
            localIp65504P1029MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1029_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1029MemdataL
	 */
	protected void serializeIp65504P1029MemdataL(short ip65504P1029MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1029MemdataL,IP_65504_P_1029_MEMDATA_L_LEN)
                  ,beginIp65504P1029MemdataL
                  ,IP_65504_P_1029_MEMDATA_L_LEN
                 );
            localIp65504P1029MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1029MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1029MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1029MemdataL() {	 
			return (getShort(beginIp65504P1029MemdataL));
   	}
         int localIp65504P1030MemdataSCounter = -1;
         public boolean isIp65504P1030MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1030MemdataSCounter != sharedCounter;
            localIp65504P1030MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1030_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1030MemdataS
	 */
	protected void serializeIp65504P1030MemdataS(short ip65504P1030MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1030MemdataS,IP_65504_P_1030_MEMDATA_S_LEN)
                  ,beginIp65504P1030MemdataS
                  ,IP_65504_P_1030_MEMDATA_S_LEN
                 );
            localIp65504P1030MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1030MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1030MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1030MemdataS() {	 
			return (getShort(beginIp65504P1030MemdataS));
   	}
         int localIp65504P1030MemdataLCounter = -1;
         public boolean isIp65504P1030MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1030MemdataLCounter != sharedCounter;
            localIp65504P1030MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1030_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1030MemdataL
	 */
	protected void serializeIp65504P1030MemdataL(short ip65504P1030MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1030MemdataL,IP_65504_P_1030_MEMDATA_L_LEN)
                  ,beginIp65504P1030MemdataL
                  ,IP_65504_P_1030_MEMDATA_L_LEN
                 );
            localIp65504P1030MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1030MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1030MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1030MemdataL() {	 
			return (getShort(beginIp65504P1030MemdataL));
   	}
         int localIp65504P1031MemdataSCounter = -1;
         public boolean isIp65504P1031MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1031MemdataSCounter != sharedCounter;
            localIp65504P1031MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1031_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1031MemdataS
	 */
	protected void serializeIp65504P1031MemdataS(short ip65504P1031MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1031MemdataS,IP_65504_P_1031_MEMDATA_S_LEN)
                  ,beginIp65504P1031MemdataS
                  ,IP_65504_P_1031_MEMDATA_S_LEN
                 );
            localIp65504P1031MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1031MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1031MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1031MemdataS() {	 
			return (getShort(beginIp65504P1031MemdataS));
   	}
         int localIp65504P1031MemdataLCounter = -1;
         public boolean isIp65504P1031MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1031MemdataLCounter != sharedCounter;
            localIp65504P1031MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1031_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1031MemdataL
	 */
	protected void serializeIp65504P1031MemdataL(short ip65504P1031MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1031MemdataL,IP_65504_P_1031_MEMDATA_L_LEN)
                  ,beginIp65504P1031MemdataL
                  ,IP_65504_P_1031_MEMDATA_L_LEN
                 );
            localIp65504P1031MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1031MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1031MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1031MemdataL() {	 
			return (getShort(beginIp65504P1031MemdataL));
   	}
         int localIp65504P1032MemdataSCounter = -1;
         public boolean isIp65504P1032MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1032MemdataSCounter != sharedCounter;
            localIp65504P1032MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1032_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1032MemdataS
	 */
	protected void serializeIp65504P1032MemdataS(short ip65504P1032MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1032MemdataS,IP_65504_P_1032_MEMDATA_S_LEN)
                  ,beginIp65504P1032MemdataS
                  ,IP_65504_P_1032_MEMDATA_S_LEN
                 );
            localIp65504P1032MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1032MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1032MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1032MemdataS() {	 
			return (getShort(beginIp65504P1032MemdataS));
   	}
         int localIp65504P1032MemdataLCounter = -1;
         public boolean isIp65504P1032MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1032MemdataLCounter != sharedCounter;
            localIp65504P1032MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1032_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1032MemdataL
	 */
	protected void serializeIp65504P1032MemdataL(short ip65504P1032MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1032MemdataL,IP_65504_P_1032_MEMDATA_L_LEN)
                  ,beginIp65504P1032MemdataL
                  ,IP_65504_P_1032_MEMDATA_L_LEN
                 );
            localIp65504P1032MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1032MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1032MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1032MemdataL() {	 
			return (getShort(beginIp65504P1032MemdataL));
   	}
         int localIp65504P1033MemdataSCounter = -1;
         public boolean isIp65504P1033MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1033MemdataSCounter != sharedCounter;
            localIp65504P1033MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1033_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1033MemdataS
	 */
	protected void serializeIp65504P1033MemdataS(short ip65504P1033MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1033MemdataS,IP_65504_P_1033_MEMDATA_S_LEN)
                  ,beginIp65504P1033MemdataS
                  ,IP_65504_P_1033_MEMDATA_S_LEN
                 );
            localIp65504P1033MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1033MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1033MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1033MemdataS() {	 
			return (getShort(beginIp65504P1033MemdataS));
   	}
         int localIp65504P1033MemdataLCounter = -1;
         public boolean isIp65504P1033MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1033MemdataLCounter != sharedCounter;
            localIp65504P1033MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1033_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1033MemdataL
	 */
	protected void serializeIp65504P1033MemdataL(short ip65504P1033MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1033MemdataL,IP_65504_P_1033_MEMDATA_L_LEN)
                  ,beginIp65504P1033MemdataL
                  ,IP_65504_P_1033_MEMDATA_L_LEN
                 );
            localIp65504P1033MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1033MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1033MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1033MemdataL() {	 
			return (getShort(beginIp65504P1033MemdataL));
   	}
         int localIp65504P1034MemdataSCounter = -1;
         public boolean isIp65504P1034MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1034MemdataSCounter != sharedCounter;
            localIp65504P1034MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1034_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1034MemdataS
	 */
	protected void serializeIp65504P1034MemdataS(short ip65504P1034MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1034MemdataS,IP_65504_P_1034_MEMDATA_S_LEN)
                  ,beginIp65504P1034MemdataS
                  ,IP_65504_P_1034_MEMDATA_S_LEN
                 );
            localIp65504P1034MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1034MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1034MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1034MemdataS() {	 
			return (getShort(beginIp65504P1034MemdataS));
   	}
         int localIp65504P1034MemdataLCounter = -1;
         public boolean isIp65504P1034MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1034MemdataLCounter != sharedCounter;
            localIp65504P1034MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1034_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1034MemdataL
	 */
	protected void serializeIp65504P1034MemdataL(short ip65504P1034MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1034MemdataL,IP_65504_P_1034_MEMDATA_L_LEN)
                  ,beginIp65504P1034MemdataL
                  ,IP_65504_P_1034_MEMDATA_L_LEN
                 );
            localIp65504P1034MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1034MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1034MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1034MemdataL() {	 
			return (getShort(beginIp65504P1034MemdataL));
   	}
         int localIp65504P1035MemdataSCounter = -1;
         public boolean isIp65504P1035MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1035MemdataSCounter != sharedCounter;
            localIp65504P1035MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1035_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1035MemdataS
	 */
	protected void serializeIp65504P1035MemdataS(short ip65504P1035MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1035MemdataS,IP_65504_P_1035_MEMDATA_S_LEN)
                  ,beginIp65504P1035MemdataS
                  ,IP_65504_P_1035_MEMDATA_S_LEN
                 );
            localIp65504P1035MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1035MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1035MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1035MemdataS() {	 
			return (getShort(beginIp65504P1035MemdataS));
   	}
         int localIp65504P1035MemdataLCounter = -1;
         public boolean isIp65504P1035MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1035MemdataLCounter != sharedCounter;
            localIp65504P1035MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1035_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1035MemdataL
	 */
	protected void serializeIp65504P1035MemdataL(short ip65504P1035MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1035MemdataL,IP_65504_P_1035_MEMDATA_L_LEN)
                  ,beginIp65504P1035MemdataL
                  ,IP_65504_P_1035_MEMDATA_L_LEN
                 );
            localIp65504P1035MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1035MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1035MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1035MemdataL() {	 
			return (getShort(beginIp65504P1035MemdataL));
   	}
         int localIp65504P1036MemdataSCounter = -1;
         public boolean isIp65504P1036MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1036MemdataSCounter != sharedCounter;
            localIp65504P1036MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1036_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1036MemdataS
	 */
	protected void serializeIp65504P1036MemdataS(short ip65504P1036MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1036MemdataS,IP_65504_P_1036_MEMDATA_S_LEN)
                  ,beginIp65504P1036MemdataS
                  ,IP_65504_P_1036_MEMDATA_S_LEN
                 );
            localIp65504P1036MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1036MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1036MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1036MemdataS() {	 
			return (getShort(beginIp65504P1036MemdataS));
   	}
         int localIp65504P1036MemdataLCounter = -1;
         public boolean isIp65504P1036MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1036MemdataLCounter != sharedCounter;
            localIp65504P1036MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1036_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1036MemdataL
	 */
	protected void serializeIp65504P1036MemdataL(short ip65504P1036MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1036MemdataL,IP_65504_P_1036_MEMDATA_L_LEN)
                  ,beginIp65504P1036MemdataL
                  ,IP_65504_P_1036_MEMDATA_L_LEN
                 );
            localIp65504P1036MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1036MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1036MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1036MemdataL() {	 
			return (getShort(beginIp65504P1036MemdataL));
   	}
         int localIp65504P1037MemdataSCounter = -1;
         public boolean isIp65504P1037MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1037MemdataSCounter != sharedCounter;
            localIp65504P1037MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1037_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1037MemdataS
	 */
	protected void serializeIp65504P1037MemdataS(short ip65504P1037MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1037MemdataS,IP_65504_P_1037_MEMDATA_S_LEN)
                  ,beginIp65504P1037MemdataS
                  ,IP_65504_P_1037_MEMDATA_S_LEN
                 );
            localIp65504P1037MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1037MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1037MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1037MemdataS() {	 
			return (getShort(beginIp65504P1037MemdataS));
   	}
         int localIp65504P1037MemdataLCounter = -1;
         public boolean isIp65504P1037MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1037MemdataLCounter != sharedCounter;
            localIp65504P1037MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1037_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1037MemdataL
	 */
	protected void serializeIp65504P1037MemdataL(short ip65504P1037MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1037MemdataL,IP_65504_P_1037_MEMDATA_L_LEN)
                  ,beginIp65504P1037MemdataL
                  ,IP_65504_P_1037_MEMDATA_L_LEN
                 );
            localIp65504P1037MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1037MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1037MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1037MemdataL() {	 
			return (getShort(beginIp65504P1037MemdataL));
   	}
         int localIp65504P1038MemdataSCounter = -1;
         public boolean isIp65504P1038MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1038MemdataSCounter != sharedCounter;
            localIp65504P1038MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1038_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1038MemdataS
	 */
	protected void serializeIp65504P1038MemdataS(short ip65504P1038MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1038MemdataS,IP_65504_P_1038_MEMDATA_S_LEN)
                  ,beginIp65504P1038MemdataS
                  ,IP_65504_P_1038_MEMDATA_S_LEN
                 );
            localIp65504P1038MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1038MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1038MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1038MemdataS() {	 
			return (getShort(beginIp65504P1038MemdataS));
   	}
         int localIp65504P1038MemdataLCounter = -1;
         public boolean isIp65504P1038MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1038MemdataLCounter != sharedCounter;
            localIp65504P1038MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1038_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1038MemdataL
	 */
	protected void serializeIp65504P1038MemdataL(short ip65504P1038MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1038MemdataL,IP_65504_P_1038_MEMDATA_L_LEN)
                  ,beginIp65504P1038MemdataL
                  ,IP_65504_P_1038_MEMDATA_L_LEN
                 );
            localIp65504P1038MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1038MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1038MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1038MemdataL() {	 
			return (getShort(beginIp65504P1038MemdataL));
   	}
         int localIp65504P1039MemdataSCounter = -1;
         public boolean isIp65504P1039MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1039MemdataSCounter != sharedCounter;
            localIp65504P1039MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1039_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1039MemdataS
	 */
	protected void serializeIp65504P1039MemdataS(short ip65504P1039MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1039MemdataS,IP_65504_P_1039_MEMDATA_S_LEN)
                  ,beginIp65504P1039MemdataS
                  ,IP_65504_P_1039_MEMDATA_S_LEN
                 );
            localIp65504P1039MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1039MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1039MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1039MemdataS() {	 
			return (getShort(beginIp65504P1039MemdataS));
   	}
         int localIp65504P1039MemdataLCounter = -1;
         public boolean isIp65504P1039MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1039MemdataLCounter != sharedCounter;
            localIp65504P1039MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1039_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1039MemdataL
	 */
	protected void serializeIp65504P1039MemdataL(short ip65504P1039MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1039MemdataL,IP_65504_P_1039_MEMDATA_L_LEN)
                  ,beginIp65504P1039MemdataL
                  ,IP_65504_P_1039_MEMDATA_L_LEN
                 );
            localIp65504P1039MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1039MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1039MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1039MemdataL() {	 
			return (getShort(beginIp65504P1039MemdataL));
   	}
         int localIp65504P1040MemdataSCounter = -1;
         public boolean isIp65504P1040MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1040MemdataSCounter != sharedCounter;
            localIp65504P1040MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1040_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1040MemdataS
	 */
	protected void serializeIp65504P1040MemdataS(short ip65504P1040MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1040MemdataS,IP_65504_P_1040_MEMDATA_S_LEN)
                  ,beginIp65504P1040MemdataS
                  ,IP_65504_P_1040_MEMDATA_S_LEN
                 );
            localIp65504P1040MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1040MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1040MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1040MemdataS() {	 
			return (getShort(beginIp65504P1040MemdataS));
   	}
         int localIp65504P1040MemdataLCounter = -1;
         public boolean isIp65504P1040MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1040MemdataLCounter != sharedCounter;
            localIp65504P1040MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1040_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1040MemdataL
	 */
	protected void serializeIp65504P1040MemdataL(short ip65504P1040MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1040MemdataL,IP_65504_P_1040_MEMDATA_L_LEN)
                  ,beginIp65504P1040MemdataL
                  ,IP_65504_P_1040_MEMDATA_L_LEN
                 );
            localIp65504P1040MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1040MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1040MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1040MemdataL() {	 
			return (getShort(beginIp65504P1040MemdataL));
   	}
         int localIp65504P1041MemdataSCounter = -1;
         public boolean isIp65504P1041MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1041MemdataSCounter != sharedCounter;
            localIp65504P1041MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1041_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1041MemdataS
	 */
	protected void serializeIp65504P1041MemdataS(short ip65504P1041MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1041MemdataS,IP_65504_P_1041_MEMDATA_S_LEN)
                  ,beginIp65504P1041MemdataS
                  ,IP_65504_P_1041_MEMDATA_S_LEN
                 );
            localIp65504P1041MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1041MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1041MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1041MemdataS() {	 
			return (getShort(beginIp65504P1041MemdataS));
   	}
         int localIp65504P1041MemdataLCounter = -1;
         public boolean isIp65504P1041MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1041MemdataLCounter != sharedCounter;
            localIp65504P1041MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1041_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1041MemdataL
	 */
	protected void serializeIp65504P1041MemdataL(short ip65504P1041MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1041MemdataL,IP_65504_P_1041_MEMDATA_L_LEN)
                  ,beginIp65504P1041MemdataL
                  ,IP_65504_P_1041_MEMDATA_L_LEN
                 );
            localIp65504P1041MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1041MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1041MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1041MemdataL() {	 
			return (getShort(beginIp65504P1041MemdataL));
   	}
         int localIp65504P1042MemdataSCounter = -1;
         public boolean isIp65504P1042MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1042MemdataSCounter != sharedCounter;
            localIp65504P1042MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1042_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1042MemdataS
	 */
	protected void serializeIp65504P1042MemdataS(short ip65504P1042MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1042MemdataS,IP_65504_P_1042_MEMDATA_S_LEN)
                  ,beginIp65504P1042MemdataS
                  ,IP_65504_P_1042_MEMDATA_S_LEN
                 );
            localIp65504P1042MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1042MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1042MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1042MemdataS() {	 
			return (getShort(beginIp65504P1042MemdataS));
   	}
         int localIp65504P1042MemdataLCounter = -1;
         public boolean isIp65504P1042MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1042MemdataLCounter != sharedCounter;
            localIp65504P1042MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1042_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1042MemdataL
	 */
	protected void serializeIp65504P1042MemdataL(short ip65504P1042MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1042MemdataL,IP_65504_P_1042_MEMDATA_L_LEN)
                  ,beginIp65504P1042MemdataL
                  ,IP_65504_P_1042_MEMDATA_L_LEN
                 );
            localIp65504P1042MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1042MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1042MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1042MemdataL() {	 
			return (getShort(beginIp65504P1042MemdataL));
   	}
         int localIp65504P1043MemdataSCounter = -1;
         public boolean isIp65504P1043MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1043MemdataSCounter != sharedCounter;
            localIp65504P1043MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1043_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1043MemdataS
	 */
	protected void serializeIp65504P1043MemdataS(short ip65504P1043MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1043MemdataS,IP_65504_P_1043_MEMDATA_S_LEN)
                  ,beginIp65504P1043MemdataS
                  ,IP_65504_P_1043_MEMDATA_S_LEN
                 );
            localIp65504P1043MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1043MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1043MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1043MemdataS() {	 
			return (getShort(beginIp65504P1043MemdataS));
   	}
         int localIp65504P1043MemdataLCounter = -1;
         public boolean isIp65504P1043MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1043MemdataLCounter != sharedCounter;
            localIp65504P1043MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1043_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1043MemdataL
	 */
	protected void serializeIp65504P1043MemdataL(short ip65504P1043MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1043MemdataL,IP_65504_P_1043_MEMDATA_L_LEN)
                  ,beginIp65504P1043MemdataL
                  ,IP_65504_P_1043_MEMDATA_L_LEN
                 );
            localIp65504P1043MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1043MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1043MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1043MemdataL() {	 
			return (getShort(beginIp65504P1043MemdataL));
   	}
         int localIp65504P1044MemdataSCounter = -1;
         public boolean isIp65504P1044MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1044MemdataSCounter != sharedCounter;
            localIp65504P1044MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1044_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1044MemdataS
	 */
	protected void serializeIp65504P1044MemdataS(short ip65504P1044MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1044MemdataS,IP_65504_P_1044_MEMDATA_S_LEN)
                  ,beginIp65504P1044MemdataS
                  ,IP_65504_P_1044_MEMDATA_S_LEN
                 );
            localIp65504P1044MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1044MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1044MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1044MemdataS() {	 
			return (getShort(beginIp65504P1044MemdataS));
   	}
         int localIp65504P1044MemdataLCounter = -1;
         public boolean isIp65504P1044MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1044MemdataLCounter != sharedCounter;
            localIp65504P1044MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1044_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1044MemdataL
	 */
	protected void serializeIp65504P1044MemdataL(short ip65504P1044MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1044MemdataL,IP_65504_P_1044_MEMDATA_L_LEN)
                  ,beginIp65504P1044MemdataL
                  ,IP_65504_P_1044_MEMDATA_L_LEN
                 );
            localIp65504P1044MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1044MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1044MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1044MemdataL() {	 
			return (getShort(beginIp65504P1044MemdataL));
   	}
         int localIp65504P1045MemdataSCounter = -1;
         public boolean isIp65504P1045MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1045MemdataSCounter != sharedCounter;
            localIp65504P1045MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1045_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1045MemdataS
	 */
	protected void serializeIp65504P1045MemdataS(short ip65504P1045MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1045MemdataS,IP_65504_P_1045_MEMDATA_S_LEN)
                  ,beginIp65504P1045MemdataS
                  ,IP_65504_P_1045_MEMDATA_S_LEN
                 );
            localIp65504P1045MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1045MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1045MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1045MemdataS() {	 
			return (getShort(beginIp65504P1045MemdataS));
   	}
         int localIp65504P1045MemdataLCounter = -1;
         public boolean isIp65504P1045MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1045MemdataLCounter != sharedCounter;
            localIp65504P1045MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1045_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1045MemdataL
	 */
	protected void serializeIp65504P1045MemdataL(short ip65504P1045MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1045MemdataL,IP_65504_P_1045_MEMDATA_L_LEN)
                  ,beginIp65504P1045MemdataL
                  ,IP_65504_P_1045_MEMDATA_L_LEN
                 );
            localIp65504P1045MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1045MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1045MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1045MemdataL() {	 
			return (getShort(beginIp65504P1045MemdataL));
   	}
         int localIp65504P1046MemdataSCounter = -1;
         public boolean isIp65504P1046MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1046MemdataSCounter != sharedCounter;
            localIp65504P1046MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1046_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1046MemdataS
	 */
	protected void serializeIp65504P1046MemdataS(short ip65504P1046MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1046MemdataS,IP_65504_P_1046_MEMDATA_S_LEN)
                  ,beginIp65504P1046MemdataS
                  ,IP_65504_P_1046_MEMDATA_S_LEN
                 );
            localIp65504P1046MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1046MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1046MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1046MemdataS() {	 
			return (getShort(beginIp65504P1046MemdataS));
   	}
         int localIp65504P1046MemdataLCounter = -1;
         public boolean isIp65504P1046MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1046MemdataLCounter != sharedCounter;
            localIp65504P1046MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1046_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1046MemdataL
	 */
	protected void serializeIp65504P1046MemdataL(short ip65504P1046MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1046MemdataL,IP_65504_P_1046_MEMDATA_L_LEN)
                  ,beginIp65504P1046MemdataL
                  ,IP_65504_P_1046_MEMDATA_L_LEN
                 );
            localIp65504P1046MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1046MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1046MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1046MemdataL() {	 
			return (getShort(beginIp65504P1046MemdataL));
   	}
         int localIp65504P1047MemdataSCounter = -1;
         public boolean isIp65504P1047MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1047MemdataSCounter != sharedCounter;
            localIp65504P1047MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1047_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1047MemdataS
	 */
	protected void serializeIp65504P1047MemdataS(short ip65504P1047MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1047MemdataS,IP_65504_P_1047_MEMDATA_S_LEN)
                  ,beginIp65504P1047MemdataS
                  ,IP_65504_P_1047_MEMDATA_S_LEN
                 );
            localIp65504P1047MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1047MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1047MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1047MemdataS() {	 
			return (getShort(beginIp65504P1047MemdataS));
   	}
         int localIp65504P1047MemdataLCounter = -1;
         public boolean isIp65504P1047MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1047MemdataLCounter != sharedCounter;
            localIp65504P1047MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1047_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1047MemdataL
	 */
	protected void serializeIp65504P1047MemdataL(short ip65504P1047MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1047MemdataL,IP_65504_P_1047_MEMDATA_L_LEN)
                  ,beginIp65504P1047MemdataL
                  ,IP_65504_P_1047_MEMDATA_L_LEN
                 );
            localIp65504P1047MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1047MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1047MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1047MemdataL() {	 
			return (getShort(beginIp65504P1047MemdataL));
   	}
         int localIp65504P1048MemdataSCounter = -1;
         public boolean isIp65504P1048MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1048MemdataSCounter != sharedCounter;
            localIp65504P1048MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1048_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1048MemdataS
	 */
	protected void serializeIp65504P1048MemdataS(short ip65504P1048MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1048MemdataS,IP_65504_P_1048_MEMDATA_S_LEN)
                  ,beginIp65504P1048MemdataS
                  ,IP_65504_P_1048_MEMDATA_S_LEN
                 );
            localIp65504P1048MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1048MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1048MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1048MemdataS() {	 
			return (getShort(beginIp65504P1048MemdataS));
   	}
         int localIp65504P1048MemdataLCounter = -1;
         public boolean isIp65504P1048MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1048MemdataLCounter != sharedCounter;
            localIp65504P1048MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1048_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1048MemdataL
	 */
	protected void serializeIp65504P1048MemdataL(short ip65504P1048MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1048MemdataL,IP_65504_P_1048_MEMDATA_L_LEN)
                  ,beginIp65504P1048MemdataL
                  ,IP_65504_P_1048_MEMDATA_L_LEN
                 );
            localIp65504P1048MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1048MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1048MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1048MemdataL() {	 
			return (getShort(beginIp65504P1048MemdataL));
   	}
         int localIp65504P1049MemdataSCounter = -1;
         public boolean isIp65504P1049MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1049MemdataSCounter != sharedCounter;
            localIp65504P1049MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1049_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1049MemdataS
	 */
	protected void serializeIp65504P1049MemdataS(short ip65504P1049MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1049MemdataS,IP_65504_P_1049_MEMDATA_S_LEN)
                  ,beginIp65504P1049MemdataS
                  ,IP_65504_P_1049_MEMDATA_S_LEN
                 );
            localIp65504P1049MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1049MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1049MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1049MemdataS() {	 
			return (getShort(beginIp65504P1049MemdataS));
   	}
         int localIp65504P1049MemdataLCounter = -1;
         public boolean isIp65504P1049MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1049MemdataLCounter != sharedCounter;
            localIp65504P1049MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1049_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1049MemdataL
	 */
	protected void serializeIp65504P1049MemdataL(short ip65504P1049MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1049MemdataL,IP_65504_P_1049_MEMDATA_L_LEN)
                  ,beginIp65504P1049MemdataL
                  ,IP_65504_P_1049_MEMDATA_L_LEN
                 );
            localIp65504P1049MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1049MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1049MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1049MemdataL() {	 
			return (getShort(beginIp65504P1049MemdataL));
   	}
         int localIp65504P1050MemdataSCounter = -1;
         public boolean isIp65504P1050MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1050MemdataSCounter != sharedCounter;
            localIp65504P1050MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1050_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1050MemdataS
	 */
	protected void serializeIp65504P1050MemdataS(short ip65504P1050MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1050MemdataS,IP_65504_P_1050_MEMDATA_S_LEN)
                  ,beginIp65504P1050MemdataS
                  ,IP_65504_P_1050_MEMDATA_S_LEN
                 );
            localIp65504P1050MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1050MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1050MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1050MemdataS() {	 
			return (getShort(beginIp65504P1050MemdataS));
   	}
         int localIp65504P1050MemdataLCounter = -1;
         public boolean isIp65504P1050MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1050MemdataLCounter != sharedCounter;
            localIp65504P1050MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1050_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1050MemdataL
	 */
	protected void serializeIp65504P1050MemdataL(short ip65504P1050MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1050MemdataL,IP_65504_P_1050_MEMDATA_L_LEN)
                  ,beginIp65504P1050MemdataL
                  ,IP_65504_P_1050_MEMDATA_L_LEN
                 );
            localIp65504P1050MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1050MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1050MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1050MemdataL() {	 
			return (getShort(beginIp65504P1050MemdataL));
   	}
         int localIp65504P1051MemdataSCounter = -1;
         public boolean isIp65504P1051MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1051MemdataSCounter != sharedCounter;
            localIp65504P1051MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1051_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1051MemdataS
	 */
	protected void serializeIp65504P1051MemdataS(short ip65504P1051MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1051MemdataS,IP_65504_P_1051_MEMDATA_S_LEN)
                  ,beginIp65504P1051MemdataS
                  ,IP_65504_P_1051_MEMDATA_S_LEN
                 );
            localIp65504P1051MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1051MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1051MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1051MemdataS() {	 
			return (getShort(beginIp65504P1051MemdataS));
   	}
         int localIp65504P1051MemdataLCounter = -1;
         public boolean isIp65504P1051MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1051MemdataLCounter != sharedCounter;
            localIp65504P1051MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1051_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1051MemdataL
	 */
	protected void serializeIp65504P1051MemdataL(short ip65504P1051MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1051MemdataL,IP_65504_P_1051_MEMDATA_L_LEN)
                  ,beginIp65504P1051MemdataL
                  ,IP_65504_P_1051_MEMDATA_L_LEN
                 );
            localIp65504P1051MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1051MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1051MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1051MemdataL() {	 
			return (getShort(beginIp65504P1051MemdataL));
   	}
         int localIp65504P1052MemdataSCounter = -1;
         public boolean isIp65504P1052MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1052MemdataSCounter != sharedCounter;
            localIp65504P1052MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1052_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1052MemdataS
	 */
	protected void serializeIp65504P1052MemdataS(short ip65504P1052MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1052MemdataS,IP_65504_P_1052_MEMDATA_S_LEN)
                  ,beginIp65504P1052MemdataS
                  ,IP_65504_P_1052_MEMDATA_S_LEN
                 );
            localIp65504P1052MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1052MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1052MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1052MemdataS() {	 
			return (getShort(beginIp65504P1052MemdataS));
   	}
         int localIp65504P1052MemdataLCounter = -1;
         public boolean isIp65504P1052MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1052MemdataLCounter != sharedCounter;
            localIp65504P1052MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1052_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1052MemdataL
	 */
	protected void serializeIp65504P1052MemdataL(short ip65504P1052MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1052MemdataL,IP_65504_P_1052_MEMDATA_L_LEN)
                  ,beginIp65504P1052MemdataL
                  ,IP_65504_P_1052_MEMDATA_L_LEN
                 );
            localIp65504P1052MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1052MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1052MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1052MemdataL() {	 
			return (getShort(beginIp65504P1052MemdataL));
   	}
         int localIp65504P1053MemdataSCounter = -1;
         public boolean isIp65504P1053MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1053MemdataSCounter != sharedCounter;
            localIp65504P1053MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1053_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1053MemdataS
	 */
	protected void serializeIp65504P1053MemdataS(short ip65504P1053MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1053MemdataS,IP_65504_P_1053_MEMDATA_S_LEN)
                  ,beginIp65504P1053MemdataS
                  ,IP_65504_P_1053_MEMDATA_S_LEN
                 );
            localIp65504P1053MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1053MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1053MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1053MemdataS() {	 
			return (getShort(beginIp65504P1053MemdataS));
   	}
         int localIp65504P1053MemdataLCounter = -1;
         public boolean isIp65504P1053MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1053MemdataLCounter != sharedCounter;
            localIp65504P1053MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1053_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1053MemdataL
	 */
	protected void serializeIp65504P1053MemdataL(short ip65504P1053MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1053MemdataL,IP_65504_P_1053_MEMDATA_L_LEN)
                  ,beginIp65504P1053MemdataL
                  ,IP_65504_P_1053_MEMDATA_L_LEN
                 );
            localIp65504P1053MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1053MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1053MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1053MemdataL() {	 
			return (getShort(beginIp65504P1053MemdataL));
   	}
         int localIp65504P1054MemdataSCounter = -1;
         public boolean isIp65504P1054MemdataSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1054MemdataSCounter != sharedCounter;
            localIp65504P1054MemdataSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1054_MEMDATA_S_LEN = 2;
  	/**
	 * serializeIp65504P1054MemdataS
	 */
	protected void serializeIp65504P1054MemdataS(short ip65504P1054MemdataS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1054MemdataS,IP_65504_P_1054_MEMDATA_S_LEN)
                  ,beginIp65504P1054MemdataS
                  ,IP_65504_P_1054_MEMDATA_S_LEN
                 );
            localIp65504P1054MemdataSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1054MemdataSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1054MemdataS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1054MemdataS() {	 
			return (getShort(beginIp65504P1054MemdataS));
   	}
         int localIp65504P1054MemdataLCounter = -1;
         public boolean isIp65504P1054MemdataLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1054MemdataLCounter != sharedCounter;
            localIp65504P1054MemdataLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1054_MEMDATA_L_LEN = 2;
  	/**
	 * serializeIp65504P1054MemdataL
	 */
	protected void serializeIp65504P1054MemdataL(short ip65504P1054MemdataL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1054MemdataL,IP_65504_P_1054_MEMDATA_L_LEN)
                  ,beginIp65504P1054MemdataL
                  ,IP_65504_P_1054_MEMDATA_L_LEN
                 );
            localIp65504P1054MemdataLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1054MemdataLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1054MemdataL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1054MemdataL() {	 
			return (getShort(beginIp65504P1054MemdataL));
   	}




}
  
