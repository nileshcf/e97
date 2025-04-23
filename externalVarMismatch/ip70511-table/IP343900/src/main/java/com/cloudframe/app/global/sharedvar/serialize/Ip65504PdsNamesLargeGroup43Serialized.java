package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup43Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup43Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup43Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_43_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1303S;
            protected  int beginIp65504P1303L;
            protected  int beginIp65504P1304S;
            protected  int beginIp65504P1304L;
            protected  int beginIp65504P1305S;
            protected  int beginIp65504P1305L;
            protected  int beginIp65504P1306S;
            protected  int beginIp65504P1306L;
            protected  int beginIp65504P1307S;
            protected  int beginIp65504P1307L;
            protected  int beginIp65504P1308S;
            protected  int beginIp65504P1308L;
            protected  int beginIp65504P1309S;
            protected  int beginIp65504P1309L;
            protected  int beginIp65504P1310S;
            protected  int beginIp65504P1310L;
            protected  int beginIp65504P1311S;
            protected  int beginIp65504P1311L;
            protected  int beginIp65504P1312S;
            protected  int beginIp65504P1312L;
            protected  int beginIp65504P1313S;
            protected  int beginIp65504P1313L;
            protected  int beginIp65504P1314S;
            protected  int beginIp65504P1314L;
            protected  int beginIp65504P1315S;
            protected  int beginIp65504P1315L;
            protected  int beginIp65504P1316S;
            protected  int beginIp65504P1316L;
            protected  int beginIp65504P1317S;
            protected  int beginIp65504P1317L;
            protected  int beginIp65504P1318S;
            protected  int beginIp65504P1318L;
            protected  int beginIp65504P1319S;
            protected  int beginIp65504P1319L;
            protected  int beginIp65504P1320S;
            protected  int beginIp65504P1320L;
            protected  int beginIp65504P1321S;
            protected  int beginIp65504P1321L;
            protected  int beginIp65504P1322S;
            protected  int beginIp65504P1322L;
            protected  int beginIp65504P1323S;
            protected  int beginIp65504P1323L;
            protected  int beginIp65504P1324S;
            protected  int beginIp65504P1324L;
            protected  int beginIp65504P1325S;
            protected  int beginIp65504P1325L;
            protected  int beginIp65504P1326S;
            protected  int beginIp65504P1326L;
            protected  int beginIp65504P1327S;
            protected  int beginIp65504P1327L;
            protected  int beginIp65504P1328S;
            protected  int beginIp65504P1328L;
            protected  int beginIp65504P1329S;
            protected  int beginIp65504P1329L;
            protected  int beginIp65504P1330S;
            protected  int beginIp65504P1330L;
            protected  int beginIp65504P1331S;
            protected  int beginIp65504P1331L;
            protected  int beginIp65504P1332S;
            protected  int beginIp65504P1332L;
            protected  int beginIp65504P1333S;
            protected  int beginIp65504P1333L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup43Serialized
	**/
    public Ip65504PdsNamesLargeGroup43Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup43Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup43Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup43Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,10412); // serialize this field at offset 10412 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup43Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 10412 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup43Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_43_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1303S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1303L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1304S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1304L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1305S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1305L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1306S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1306L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1307S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1307L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1308S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1308L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1309S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1309L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1310S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1310L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1311S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1311L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1312S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1312L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1313S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1313L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1314S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1314L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1315S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1315L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1316S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1316L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1317S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1317L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1318S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1318L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1319S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1319L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1320S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1320L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1321S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1321L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1322S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1322L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1323S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1323L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1324S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1324L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1325S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1325L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1326S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1326L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1327S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1327L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1328S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1328L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1329S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1329L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1330S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1330L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1331S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1331L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1332S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1332L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1333S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1333L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1303SCounter = -1;
         public boolean isIp65504P1303SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1303SCounter != sharedCounter;
            localIp65504P1303SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1303_S_LEN = 2;
  	/**
	 * serializeIp65504P1303S
	 */
	protected void serializeIp65504P1303S(short ip65504P1303S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1303S,IP_65504_P_1303_S_LEN)
                  ,beginIp65504P1303S
                  ,IP_65504_P_1303_S_LEN
                 );
            localIp65504P1303SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1303SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1303S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1303S() {	 
			return (getShort(beginIp65504P1303S));
   	}
         int localIp65504P1303LCounter = -1;
         public boolean isIp65504P1303LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1303LCounter != sharedCounter;
            localIp65504P1303LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1303_L_LEN = 2;
  	/**
	 * serializeIp65504P1303L
	 */
	protected void serializeIp65504P1303L(short ip65504P1303L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1303L,IP_65504_P_1303_L_LEN)
                  ,beginIp65504P1303L
                  ,IP_65504_P_1303_L_LEN
                 );
            localIp65504P1303LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1303LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1303L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1303L() {	 
			return (getShort(beginIp65504P1303L));
   	}
         int localIp65504P1304SCounter = -1;
         public boolean isIp65504P1304SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1304SCounter != sharedCounter;
            localIp65504P1304SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1304_S_LEN = 2;
  	/**
	 * serializeIp65504P1304S
	 */
	protected void serializeIp65504P1304S(short ip65504P1304S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1304S,IP_65504_P_1304_S_LEN)
                  ,beginIp65504P1304S
                  ,IP_65504_P_1304_S_LEN
                 );
            localIp65504P1304SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1304SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1304S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1304S() {	 
			return (getShort(beginIp65504P1304S));
   	}
         int localIp65504P1304LCounter = -1;
         public boolean isIp65504P1304LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1304LCounter != sharedCounter;
            localIp65504P1304LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1304_L_LEN = 2;
  	/**
	 * serializeIp65504P1304L
	 */
	protected void serializeIp65504P1304L(short ip65504P1304L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1304L,IP_65504_P_1304_L_LEN)
                  ,beginIp65504P1304L
                  ,IP_65504_P_1304_L_LEN
                 );
            localIp65504P1304LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1304LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1304L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1304L() {	 
			return (getShort(beginIp65504P1304L));
   	}
         int localIp65504P1305SCounter = -1;
         public boolean isIp65504P1305SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1305SCounter != sharedCounter;
            localIp65504P1305SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1305_S_LEN = 2;
  	/**
	 * serializeIp65504P1305S
	 */
	protected void serializeIp65504P1305S(short ip65504P1305S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1305S,IP_65504_P_1305_S_LEN)
                  ,beginIp65504P1305S
                  ,IP_65504_P_1305_S_LEN
                 );
            localIp65504P1305SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1305SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1305S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1305S() {	 
			return (getShort(beginIp65504P1305S));
   	}
         int localIp65504P1305LCounter = -1;
         public boolean isIp65504P1305LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1305LCounter != sharedCounter;
            localIp65504P1305LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1305_L_LEN = 2;
  	/**
	 * serializeIp65504P1305L
	 */
	protected void serializeIp65504P1305L(short ip65504P1305L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1305L,IP_65504_P_1305_L_LEN)
                  ,beginIp65504P1305L
                  ,IP_65504_P_1305_L_LEN
                 );
            localIp65504P1305LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1305LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1305L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1305L() {	 
			return (getShort(beginIp65504P1305L));
   	}
         int localIp65504P1306SCounter = -1;
         public boolean isIp65504P1306SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1306SCounter != sharedCounter;
            localIp65504P1306SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1306_S_LEN = 2;
  	/**
	 * serializeIp65504P1306S
	 */
	protected void serializeIp65504P1306S(short ip65504P1306S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1306S,IP_65504_P_1306_S_LEN)
                  ,beginIp65504P1306S
                  ,IP_65504_P_1306_S_LEN
                 );
            localIp65504P1306SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1306SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1306S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1306S() {	 
			return (getShort(beginIp65504P1306S));
   	}
         int localIp65504P1306LCounter = -1;
         public boolean isIp65504P1306LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1306LCounter != sharedCounter;
            localIp65504P1306LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1306_L_LEN = 2;
  	/**
	 * serializeIp65504P1306L
	 */
	protected void serializeIp65504P1306L(short ip65504P1306L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1306L,IP_65504_P_1306_L_LEN)
                  ,beginIp65504P1306L
                  ,IP_65504_P_1306_L_LEN
                 );
            localIp65504P1306LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1306LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1306L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1306L() {	 
			return (getShort(beginIp65504P1306L));
   	}
         int localIp65504P1307SCounter = -1;
         public boolean isIp65504P1307SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1307SCounter != sharedCounter;
            localIp65504P1307SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1307_S_LEN = 2;
  	/**
	 * serializeIp65504P1307S
	 */
	protected void serializeIp65504P1307S(short ip65504P1307S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1307S,IP_65504_P_1307_S_LEN)
                  ,beginIp65504P1307S
                  ,IP_65504_P_1307_S_LEN
                 );
            localIp65504P1307SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1307SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1307S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1307S() {	 
			return (getShort(beginIp65504P1307S));
   	}
         int localIp65504P1307LCounter = -1;
         public boolean isIp65504P1307LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1307LCounter != sharedCounter;
            localIp65504P1307LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1307_L_LEN = 2;
  	/**
	 * serializeIp65504P1307L
	 */
	protected void serializeIp65504P1307L(short ip65504P1307L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1307L,IP_65504_P_1307_L_LEN)
                  ,beginIp65504P1307L
                  ,IP_65504_P_1307_L_LEN
                 );
            localIp65504P1307LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1307LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1307L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1307L() {	 
			return (getShort(beginIp65504P1307L));
   	}
         int localIp65504P1308SCounter = -1;
         public boolean isIp65504P1308SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1308SCounter != sharedCounter;
            localIp65504P1308SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1308_S_LEN = 2;
  	/**
	 * serializeIp65504P1308S
	 */
	protected void serializeIp65504P1308S(short ip65504P1308S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1308S,IP_65504_P_1308_S_LEN)
                  ,beginIp65504P1308S
                  ,IP_65504_P_1308_S_LEN
                 );
            localIp65504P1308SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1308SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1308S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1308S() {	 
			return (getShort(beginIp65504P1308S));
   	}
         int localIp65504P1308LCounter = -1;
         public boolean isIp65504P1308LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1308LCounter != sharedCounter;
            localIp65504P1308LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1308_L_LEN = 2;
  	/**
	 * serializeIp65504P1308L
	 */
	protected void serializeIp65504P1308L(short ip65504P1308L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1308L,IP_65504_P_1308_L_LEN)
                  ,beginIp65504P1308L
                  ,IP_65504_P_1308_L_LEN
                 );
            localIp65504P1308LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1308LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1308L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1308L() {	 
			return (getShort(beginIp65504P1308L));
   	}
         int localIp65504P1309SCounter = -1;
         public boolean isIp65504P1309SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1309SCounter != sharedCounter;
            localIp65504P1309SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1309_S_LEN = 2;
  	/**
	 * serializeIp65504P1309S
	 */
	protected void serializeIp65504P1309S(short ip65504P1309S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1309S,IP_65504_P_1309_S_LEN)
                  ,beginIp65504P1309S
                  ,IP_65504_P_1309_S_LEN
                 );
            localIp65504P1309SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1309SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1309S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1309S() {	 
			return (getShort(beginIp65504P1309S));
   	}
         int localIp65504P1309LCounter = -1;
         public boolean isIp65504P1309LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1309LCounter != sharedCounter;
            localIp65504P1309LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1309_L_LEN = 2;
  	/**
	 * serializeIp65504P1309L
	 */
	protected void serializeIp65504P1309L(short ip65504P1309L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1309L,IP_65504_P_1309_L_LEN)
                  ,beginIp65504P1309L
                  ,IP_65504_P_1309_L_LEN
                 );
            localIp65504P1309LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1309LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1309L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1309L() {	 
			return (getShort(beginIp65504P1309L));
   	}
         int localIp65504P1310SCounter = -1;
         public boolean isIp65504P1310SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1310SCounter != sharedCounter;
            localIp65504P1310SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1310_S_LEN = 2;
  	/**
	 * serializeIp65504P1310S
	 */
	protected void serializeIp65504P1310S(short ip65504P1310S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1310S,IP_65504_P_1310_S_LEN)
                  ,beginIp65504P1310S
                  ,IP_65504_P_1310_S_LEN
                 );
            localIp65504P1310SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1310SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1310S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1310S() {	 
			return (getShort(beginIp65504P1310S));
   	}
         int localIp65504P1310LCounter = -1;
         public boolean isIp65504P1310LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1310LCounter != sharedCounter;
            localIp65504P1310LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1310_L_LEN = 2;
  	/**
	 * serializeIp65504P1310L
	 */
	protected void serializeIp65504P1310L(short ip65504P1310L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1310L,IP_65504_P_1310_L_LEN)
                  ,beginIp65504P1310L
                  ,IP_65504_P_1310_L_LEN
                 );
            localIp65504P1310LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1310LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1310L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1310L() {	 
			return (getShort(beginIp65504P1310L));
   	}
         int localIp65504P1311SCounter = -1;
         public boolean isIp65504P1311SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1311SCounter != sharedCounter;
            localIp65504P1311SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1311_S_LEN = 2;
  	/**
	 * serializeIp65504P1311S
	 */
	protected void serializeIp65504P1311S(short ip65504P1311S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1311S,IP_65504_P_1311_S_LEN)
                  ,beginIp65504P1311S
                  ,IP_65504_P_1311_S_LEN
                 );
            localIp65504P1311SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1311SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1311S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1311S() {	 
			return (getShort(beginIp65504P1311S));
   	}
         int localIp65504P1311LCounter = -1;
         public boolean isIp65504P1311LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1311LCounter != sharedCounter;
            localIp65504P1311LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1311_L_LEN = 2;
  	/**
	 * serializeIp65504P1311L
	 */
	protected void serializeIp65504P1311L(short ip65504P1311L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1311L,IP_65504_P_1311_L_LEN)
                  ,beginIp65504P1311L
                  ,IP_65504_P_1311_L_LEN
                 );
            localIp65504P1311LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1311LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1311L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1311L() {	 
			return (getShort(beginIp65504P1311L));
   	}
         int localIp65504P1312SCounter = -1;
         public boolean isIp65504P1312SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1312SCounter != sharedCounter;
            localIp65504P1312SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1312_S_LEN = 2;
  	/**
	 * serializeIp65504P1312S
	 */
	protected void serializeIp65504P1312S(short ip65504P1312S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1312S,IP_65504_P_1312_S_LEN)
                  ,beginIp65504P1312S
                  ,IP_65504_P_1312_S_LEN
                 );
            localIp65504P1312SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1312SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1312S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1312S() {	 
			return (getShort(beginIp65504P1312S));
   	}
         int localIp65504P1312LCounter = -1;
         public boolean isIp65504P1312LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1312LCounter != sharedCounter;
            localIp65504P1312LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1312_L_LEN = 2;
  	/**
	 * serializeIp65504P1312L
	 */
	protected void serializeIp65504P1312L(short ip65504P1312L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1312L,IP_65504_P_1312_L_LEN)
                  ,beginIp65504P1312L
                  ,IP_65504_P_1312_L_LEN
                 );
            localIp65504P1312LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1312LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1312L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1312L() {	 
			return (getShort(beginIp65504P1312L));
   	}
         int localIp65504P1313SCounter = -1;
         public boolean isIp65504P1313SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1313SCounter != sharedCounter;
            localIp65504P1313SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1313_S_LEN = 2;
  	/**
	 * serializeIp65504P1313S
	 */
	protected void serializeIp65504P1313S(short ip65504P1313S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1313S,IP_65504_P_1313_S_LEN)
                  ,beginIp65504P1313S
                  ,IP_65504_P_1313_S_LEN
                 );
            localIp65504P1313SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1313SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1313S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1313S() {	 
			return (getShort(beginIp65504P1313S));
   	}
         int localIp65504P1313LCounter = -1;
         public boolean isIp65504P1313LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1313LCounter != sharedCounter;
            localIp65504P1313LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1313_L_LEN = 2;
  	/**
	 * serializeIp65504P1313L
	 */
	protected void serializeIp65504P1313L(short ip65504P1313L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1313L,IP_65504_P_1313_L_LEN)
                  ,beginIp65504P1313L
                  ,IP_65504_P_1313_L_LEN
                 );
            localIp65504P1313LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1313LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1313L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1313L() {	 
			return (getShort(beginIp65504P1313L));
   	}
         int localIp65504P1314SCounter = -1;
         public boolean isIp65504P1314SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1314SCounter != sharedCounter;
            localIp65504P1314SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1314_S_LEN = 2;
  	/**
	 * serializeIp65504P1314S
	 */
	protected void serializeIp65504P1314S(short ip65504P1314S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1314S,IP_65504_P_1314_S_LEN)
                  ,beginIp65504P1314S
                  ,IP_65504_P_1314_S_LEN
                 );
            localIp65504P1314SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1314SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1314S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1314S() {	 
			return (getShort(beginIp65504P1314S));
   	}
         int localIp65504P1314LCounter = -1;
         public boolean isIp65504P1314LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1314LCounter != sharedCounter;
            localIp65504P1314LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1314_L_LEN = 2;
  	/**
	 * serializeIp65504P1314L
	 */
	protected void serializeIp65504P1314L(short ip65504P1314L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1314L,IP_65504_P_1314_L_LEN)
                  ,beginIp65504P1314L
                  ,IP_65504_P_1314_L_LEN
                 );
            localIp65504P1314LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1314LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1314L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1314L() {	 
			return (getShort(beginIp65504P1314L));
   	}
         int localIp65504P1315SCounter = -1;
         public boolean isIp65504P1315SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1315SCounter != sharedCounter;
            localIp65504P1315SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1315_S_LEN = 2;
  	/**
	 * serializeIp65504P1315S
	 */
	protected void serializeIp65504P1315S(short ip65504P1315S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1315S,IP_65504_P_1315_S_LEN)
                  ,beginIp65504P1315S
                  ,IP_65504_P_1315_S_LEN
                 );
            localIp65504P1315SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1315SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1315S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1315S() {	 
			return (getShort(beginIp65504P1315S));
   	}
         int localIp65504P1315LCounter = -1;
         public boolean isIp65504P1315LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1315LCounter != sharedCounter;
            localIp65504P1315LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1315_L_LEN = 2;
  	/**
	 * serializeIp65504P1315L
	 */
	protected void serializeIp65504P1315L(short ip65504P1315L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1315L,IP_65504_P_1315_L_LEN)
                  ,beginIp65504P1315L
                  ,IP_65504_P_1315_L_LEN
                 );
            localIp65504P1315LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1315LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1315L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1315L() {	 
			return (getShort(beginIp65504P1315L));
   	}
         int localIp65504P1316SCounter = -1;
         public boolean isIp65504P1316SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1316SCounter != sharedCounter;
            localIp65504P1316SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1316_S_LEN = 2;
  	/**
	 * serializeIp65504P1316S
	 */
	protected void serializeIp65504P1316S(short ip65504P1316S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1316S,IP_65504_P_1316_S_LEN)
                  ,beginIp65504P1316S
                  ,IP_65504_P_1316_S_LEN
                 );
            localIp65504P1316SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1316SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1316S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1316S() {	 
			return (getShort(beginIp65504P1316S));
   	}
         int localIp65504P1316LCounter = -1;
         public boolean isIp65504P1316LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1316LCounter != sharedCounter;
            localIp65504P1316LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1316_L_LEN = 2;
  	/**
	 * serializeIp65504P1316L
	 */
	protected void serializeIp65504P1316L(short ip65504P1316L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1316L,IP_65504_P_1316_L_LEN)
                  ,beginIp65504P1316L
                  ,IP_65504_P_1316_L_LEN
                 );
            localIp65504P1316LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1316LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1316L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1316L() {	 
			return (getShort(beginIp65504P1316L));
   	}
         int localIp65504P1317SCounter = -1;
         public boolean isIp65504P1317SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1317SCounter != sharedCounter;
            localIp65504P1317SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1317_S_LEN = 2;
  	/**
	 * serializeIp65504P1317S
	 */
	protected void serializeIp65504P1317S(short ip65504P1317S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1317S,IP_65504_P_1317_S_LEN)
                  ,beginIp65504P1317S
                  ,IP_65504_P_1317_S_LEN
                 );
            localIp65504P1317SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1317SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1317S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1317S() {	 
			return (getShort(beginIp65504P1317S));
   	}
         int localIp65504P1317LCounter = -1;
         public boolean isIp65504P1317LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1317LCounter != sharedCounter;
            localIp65504P1317LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1317_L_LEN = 2;
  	/**
	 * serializeIp65504P1317L
	 */
	protected void serializeIp65504P1317L(short ip65504P1317L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1317L,IP_65504_P_1317_L_LEN)
                  ,beginIp65504P1317L
                  ,IP_65504_P_1317_L_LEN
                 );
            localIp65504P1317LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1317LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1317L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1317L() {	 
			return (getShort(beginIp65504P1317L));
   	}
         int localIp65504P1318SCounter = -1;
         public boolean isIp65504P1318SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1318SCounter != sharedCounter;
            localIp65504P1318SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1318_S_LEN = 2;
  	/**
	 * serializeIp65504P1318S
	 */
	protected void serializeIp65504P1318S(short ip65504P1318S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1318S,IP_65504_P_1318_S_LEN)
                  ,beginIp65504P1318S
                  ,IP_65504_P_1318_S_LEN
                 );
            localIp65504P1318SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1318SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1318S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1318S() {	 
			return (getShort(beginIp65504P1318S));
   	}
         int localIp65504P1318LCounter = -1;
         public boolean isIp65504P1318LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1318LCounter != sharedCounter;
            localIp65504P1318LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1318_L_LEN = 2;
  	/**
	 * serializeIp65504P1318L
	 */
	protected void serializeIp65504P1318L(short ip65504P1318L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1318L,IP_65504_P_1318_L_LEN)
                  ,beginIp65504P1318L
                  ,IP_65504_P_1318_L_LEN
                 );
            localIp65504P1318LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1318LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1318L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1318L() {	 
			return (getShort(beginIp65504P1318L));
   	}
         int localIp65504P1319SCounter = -1;
         public boolean isIp65504P1319SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1319SCounter != sharedCounter;
            localIp65504P1319SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1319_S_LEN = 2;
  	/**
	 * serializeIp65504P1319S
	 */
	protected void serializeIp65504P1319S(short ip65504P1319S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1319S,IP_65504_P_1319_S_LEN)
                  ,beginIp65504P1319S
                  ,IP_65504_P_1319_S_LEN
                 );
            localIp65504P1319SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1319SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1319S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1319S() {	 
			return (getShort(beginIp65504P1319S));
   	}
         int localIp65504P1319LCounter = -1;
         public boolean isIp65504P1319LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1319LCounter != sharedCounter;
            localIp65504P1319LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1319_L_LEN = 2;
  	/**
	 * serializeIp65504P1319L
	 */
	protected void serializeIp65504P1319L(short ip65504P1319L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1319L,IP_65504_P_1319_L_LEN)
                  ,beginIp65504P1319L
                  ,IP_65504_P_1319_L_LEN
                 );
            localIp65504P1319LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1319LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1319L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1319L() {	 
			return (getShort(beginIp65504P1319L));
   	}
         int localIp65504P1320SCounter = -1;
         public boolean isIp65504P1320SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1320SCounter != sharedCounter;
            localIp65504P1320SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1320_S_LEN = 2;
  	/**
	 * serializeIp65504P1320S
	 */
	protected void serializeIp65504P1320S(short ip65504P1320S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1320S,IP_65504_P_1320_S_LEN)
                  ,beginIp65504P1320S
                  ,IP_65504_P_1320_S_LEN
                 );
            localIp65504P1320SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1320SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1320S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1320S() {	 
			return (getShort(beginIp65504P1320S));
   	}
         int localIp65504P1320LCounter = -1;
         public boolean isIp65504P1320LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1320LCounter != sharedCounter;
            localIp65504P1320LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1320_L_LEN = 2;
  	/**
	 * serializeIp65504P1320L
	 */
	protected void serializeIp65504P1320L(short ip65504P1320L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1320L,IP_65504_P_1320_L_LEN)
                  ,beginIp65504P1320L
                  ,IP_65504_P_1320_L_LEN
                 );
            localIp65504P1320LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1320LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1320L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1320L() {	 
			return (getShort(beginIp65504P1320L));
   	}
         int localIp65504P1321SCounter = -1;
         public boolean isIp65504P1321SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1321SCounter != sharedCounter;
            localIp65504P1321SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1321_S_LEN = 2;
  	/**
	 * serializeIp65504P1321S
	 */
	protected void serializeIp65504P1321S(short ip65504P1321S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1321S,IP_65504_P_1321_S_LEN)
                  ,beginIp65504P1321S
                  ,IP_65504_P_1321_S_LEN
                 );
            localIp65504P1321SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1321SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1321S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1321S() {	 
			return (getShort(beginIp65504P1321S));
   	}
         int localIp65504P1321LCounter = -1;
         public boolean isIp65504P1321LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1321LCounter != sharedCounter;
            localIp65504P1321LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1321_L_LEN = 2;
  	/**
	 * serializeIp65504P1321L
	 */
	protected void serializeIp65504P1321L(short ip65504P1321L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1321L,IP_65504_P_1321_L_LEN)
                  ,beginIp65504P1321L
                  ,IP_65504_P_1321_L_LEN
                 );
            localIp65504P1321LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1321LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1321L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1321L() {	 
			return (getShort(beginIp65504P1321L));
   	}
         int localIp65504P1322SCounter = -1;
         public boolean isIp65504P1322SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1322SCounter != sharedCounter;
            localIp65504P1322SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1322_S_LEN = 2;
  	/**
	 * serializeIp65504P1322S
	 */
	protected void serializeIp65504P1322S(short ip65504P1322S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1322S,IP_65504_P_1322_S_LEN)
                  ,beginIp65504P1322S
                  ,IP_65504_P_1322_S_LEN
                 );
            localIp65504P1322SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1322SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1322S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1322S() {	 
			return (getShort(beginIp65504P1322S));
   	}
         int localIp65504P1322LCounter = -1;
         public boolean isIp65504P1322LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1322LCounter != sharedCounter;
            localIp65504P1322LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1322_L_LEN = 2;
  	/**
	 * serializeIp65504P1322L
	 */
	protected void serializeIp65504P1322L(short ip65504P1322L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1322L,IP_65504_P_1322_L_LEN)
                  ,beginIp65504P1322L
                  ,IP_65504_P_1322_L_LEN
                 );
            localIp65504P1322LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1322LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1322L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1322L() {	 
			return (getShort(beginIp65504P1322L));
   	}
         int localIp65504P1323SCounter = -1;
         public boolean isIp65504P1323SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1323SCounter != sharedCounter;
            localIp65504P1323SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1323_S_LEN = 2;
  	/**
	 * serializeIp65504P1323S
	 */
	protected void serializeIp65504P1323S(short ip65504P1323S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1323S,IP_65504_P_1323_S_LEN)
                  ,beginIp65504P1323S
                  ,IP_65504_P_1323_S_LEN
                 );
            localIp65504P1323SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1323SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1323S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1323S() {	 
			return (getShort(beginIp65504P1323S));
   	}
         int localIp65504P1323LCounter = -1;
         public boolean isIp65504P1323LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1323LCounter != sharedCounter;
            localIp65504P1323LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1323_L_LEN = 2;
  	/**
	 * serializeIp65504P1323L
	 */
	protected void serializeIp65504P1323L(short ip65504P1323L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1323L,IP_65504_P_1323_L_LEN)
                  ,beginIp65504P1323L
                  ,IP_65504_P_1323_L_LEN
                 );
            localIp65504P1323LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1323LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1323L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1323L() {	 
			return (getShort(beginIp65504P1323L));
   	}
         int localIp65504P1324SCounter = -1;
         public boolean isIp65504P1324SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1324SCounter != sharedCounter;
            localIp65504P1324SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1324_S_LEN = 2;
  	/**
	 * serializeIp65504P1324S
	 */
	protected void serializeIp65504P1324S(short ip65504P1324S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1324S,IP_65504_P_1324_S_LEN)
                  ,beginIp65504P1324S
                  ,IP_65504_P_1324_S_LEN
                 );
            localIp65504P1324SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1324SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1324S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1324S() {	 
			return (getShort(beginIp65504P1324S));
   	}
         int localIp65504P1324LCounter = -1;
         public boolean isIp65504P1324LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1324LCounter != sharedCounter;
            localIp65504P1324LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1324_L_LEN = 2;
  	/**
	 * serializeIp65504P1324L
	 */
	protected void serializeIp65504P1324L(short ip65504P1324L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1324L,IP_65504_P_1324_L_LEN)
                  ,beginIp65504P1324L
                  ,IP_65504_P_1324_L_LEN
                 );
            localIp65504P1324LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1324LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1324L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1324L() {	 
			return (getShort(beginIp65504P1324L));
   	}
         int localIp65504P1325SCounter = -1;
         public boolean isIp65504P1325SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1325SCounter != sharedCounter;
            localIp65504P1325SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1325_S_LEN = 2;
  	/**
	 * serializeIp65504P1325S
	 */
	protected void serializeIp65504P1325S(short ip65504P1325S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1325S,IP_65504_P_1325_S_LEN)
                  ,beginIp65504P1325S
                  ,IP_65504_P_1325_S_LEN
                 );
            localIp65504P1325SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1325SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1325S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1325S() {	 
			return (getShort(beginIp65504P1325S));
   	}
         int localIp65504P1325LCounter = -1;
         public boolean isIp65504P1325LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1325LCounter != sharedCounter;
            localIp65504P1325LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1325_L_LEN = 2;
  	/**
	 * serializeIp65504P1325L
	 */
	protected void serializeIp65504P1325L(short ip65504P1325L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1325L,IP_65504_P_1325_L_LEN)
                  ,beginIp65504P1325L
                  ,IP_65504_P_1325_L_LEN
                 );
            localIp65504P1325LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1325LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1325L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1325L() {	 
			return (getShort(beginIp65504P1325L));
   	}
         int localIp65504P1326SCounter = -1;
         public boolean isIp65504P1326SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1326SCounter != sharedCounter;
            localIp65504P1326SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1326_S_LEN = 2;
  	/**
	 * serializeIp65504P1326S
	 */
	protected void serializeIp65504P1326S(short ip65504P1326S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1326S,IP_65504_P_1326_S_LEN)
                  ,beginIp65504P1326S
                  ,IP_65504_P_1326_S_LEN
                 );
            localIp65504P1326SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1326SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1326S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1326S() {	 
			return (getShort(beginIp65504P1326S));
   	}
         int localIp65504P1326LCounter = -1;
         public boolean isIp65504P1326LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1326LCounter != sharedCounter;
            localIp65504P1326LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1326_L_LEN = 2;
  	/**
	 * serializeIp65504P1326L
	 */
	protected void serializeIp65504P1326L(short ip65504P1326L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1326L,IP_65504_P_1326_L_LEN)
                  ,beginIp65504P1326L
                  ,IP_65504_P_1326_L_LEN
                 );
            localIp65504P1326LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1326LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1326L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1326L() {	 
			return (getShort(beginIp65504P1326L));
   	}
         int localIp65504P1327SCounter = -1;
         public boolean isIp65504P1327SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1327SCounter != sharedCounter;
            localIp65504P1327SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1327_S_LEN = 2;
  	/**
	 * serializeIp65504P1327S
	 */
	protected void serializeIp65504P1327S(short ip65504P1327S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1327S,IP_65504_P_1327_S_LEN)
                  ,beginIp65504P1327S
                  ,IP_65504_P_1327_S_LEN
                 );
            localIp65504P1327SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1327SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1327S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1327S() {	 
			return (getShort(beginIp65504P1327S));
   	}
         int localIp65504P1327LCounter = -1;
         public boolean isIp65504P1327LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1327LCounter != sharedCounter;
            localIp65504P1327LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1327_L_LEN = 2;
  	/**
	 * serializeIp65504P1327L
	 */
	protected void serializeIp65504P1327L(short ip65504P1327L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1327L,IP_65504_P_1327_L_LEN)
                  ,beginIp65504P1327L
                  ,IP_65504_P_1327_L_LEN
                 );
            localIp65504P1327LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1327LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1327L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1327L() {	 
			return (getShort(beginIp65504P1327L));
   	}
         int localIp65504P1328SCounter = -1;
         public boolean isIp65504P1328SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1328SCounter != sharedCounter;
            localIp65504P1328SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1328_S_LEN = 2;
  	/**
	 * serializeIp65504P1328S
	 */
	protected void serializeIp65504P1328S(short ip65504P1328S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1328S,IP_65504_P_1328_S_LEN)
                  ,beginIp65504P1328S
                  ,IP_65504_P_1328_S_LEN
                 );
            localIp65504P1328SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1328SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1328S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1328S() {	 
			return (getShort(beginIp65504P1328S));
   	}
         int localIp65504P1328LCounter = -1;
         public boolean isIp65504P1328LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1328LCounter != sharedCounter;
            localIp65504P1328LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1328_L_LEN = 2;
  	/**
	 * serializeIp65504P1328L
	 */
	protected void serializeIp65504P1328L(short ip65504P1328L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1328L,IP_65504_P_1328_L_LEN)
                  ,beginIp65504P1328L
                  ,IP_65504_P_1328_L_LEN
                 );
            localIp65504P1328LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1328LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1328L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1328L() {	 
			return (getShort(beginIp65504P1328L));
   	}
         int localIp65504P1329SCounter = -1;
         public boolean isIp65504P1329SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1329SCounter != sharedCounter;
            localIp65504P1329SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1329_S_LEN = 2;
  	/**
	 * serializeIp65504P1329S
	 */
	protected void serializeIp65504P1329S(short ip65504P1329S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1329S,IP_65504_P_1329_S_LEN)
                  ,beginIp65504P1329S
                  ,IP_65504_P_1329_S_LEN
                 );
            localIp65504P1329SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1329SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1329S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1329S() {	 
			return (getShort(beginIp65504P1329S));
   	}
         int localIp65504P1329LCounter = -1;
         public boolean isIp65504P1329LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1329LCounter != sharedCounter;
            localIp65504P1329LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1329_L_LEN = 2;
  	/**
	 * serializeIp65504P1329L
	 */
	protected void serializeIp65504P1329L(short ip65504P1329L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1329L,IP_65504_P_1329_L_LEN)
                  ,beginIp65504P1329L
                  ,IP_65504_P_1329_L_LEN
                 );
            localIp65504P1329LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1329LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1329L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1329L() {	 
			return (getShort(beginIp65504P1329L));
   	}
         int localIp65504P1330SCounter = -1;
         public boolean isIp65504P1330SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1330SCounter != sharedCounter;
            localIp65504P1330SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1330_S_LEN = 2;
  	/**
	 * serializeIp65504P1330S
	 */
	protected void serializeIp65504P1330S(short ip65504P1330S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1330S,IP_65504_P_1330_S_LEN)
                  ,beginIp65504P1330S
                  ,IP_65504_P_1330_S_LEN
                 );
            localIp65504P1330SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1330SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1330S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1330S() {	 
			return (getShort(beginIp65504P1330S));
   	}
         int localIp65504P1330LCounter = -1;
         public boolean isIp65504P1330LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1330LCounter != sharedCounter;
            localIp65504P1330LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1330_L_LEN = 2;
  	/**
	 * serializeIp65504P1330L
	 */
	protected void serializeIp65504P1330L(short ip65504P1330L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1330L,IP_65504_P_1330_L_LEN)
                  ,beginIp65504P1330L
                  ,IP_65504_P_1330_L_LEN
                 );
            localIp65504P1330LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1330LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1330L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1330L() {	 
			return (getShort(beginIp65504P1330L));
   	}
         int localIp65504P1331SCounter = -1;
         public boolean isIp65504P1331SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1331SCounter != sharedCounter;
            localIp65504P1331SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1331_S_LEN = 2;
  	/**
	 * serializeIp65504P1331S
	 */
	protected void serializeIp65504P1331S(short ip65504P1331S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1331S,IP_65504_P_1331_S_LEN)
                  ,beginIp65504P1331S
                  ,IP_65504_P_1331_S_LEN
                 );
            localIp65504P1331SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1331SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1331S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1331S() {	 
			return (getShort(beginIp65504P1331S));
   	}
         int localIp65504P1331LCounter = -1;
         public boolean isIp65504P1331LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1331LCounter != sharedCounter;
            localIp65504P1331LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1331_L_LEN = 2;
  	/**
	 * serializeIp65504P1331L
	 */
	protected void serializeIp65504P1331L(short ip65504P1331L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1331L,IP_65504_P_1331_L_LEN)
                  ,beginIp65504P1331L
                  ,IP_65504_P_1331_L_LEN
                 );
            localIp65504P1331LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1331LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1331L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1331L() {	 
			return (getShort(beginIp65504P1331L));
   	}
         int localIp65504P1332SCounter = -1;
         public boolean isIp65504P1332SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1332SCounter != sharedCounter;
            localIp65504P1332SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1332_S_LEN = 2;
  	/**
	 * serializeIp65504P1332S
	 */
	protected void serializeIp65504P1332S(short ip65504P1332S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1332S,IP_65504_P_1332_S_LEN)
                  ,beginIp65504P1332S
                  ,IP_65504_P_1332_S_LEN
                 );
            localIp65504P1332SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1332SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1332S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1332S() {	 
			return (getShort(beginIp65504P1332S));
   	}
         int localIp65504P1332LCounter = -1;
         public boolean isIp65504P1332LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1332LCounter != sharedCounter;
            localIp65504P1332LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1332_L_LEN = 2;
  	/**
	 * serializeIp65504P1332L
	 */
	protected void serializeIp65504P1332L(short ip65504P1332L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1332L,IP_65504_P_1332_L_LEN)
                  ,beginIp65504P1332L
                  ,IP_65504_P_1332_L_LEN
                 );
            localIp65504P1332LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1332LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1332L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1332L() {	 
			return (getShort(beginIp65504P1332L));
   	}
         int localIp65504P1333SCounter = -1;
         public boolean isIp65504P1333SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1333SCounter != sharedCounter;
            localIp65504P1333SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1333_S_LEN = 2;
  	/**
	 * serializeIp65504P1333S
	 */
	protected void serializeIp65504P1333S(short ip65504P1333S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1333S,IP_65504_P_1333_S_LEN)
                  ,beginIp65504P1333S
                  ,IP_65504_P_1333_S_LEN
                 );
            localIp65504P1333SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1333SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1333S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1333S() {	 
			return (getShort(beginIp65504P1333S));
   	}
         int localIp65504P1333LCounter = -1;
         public boolean isIp65504P1333LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1333LCounter != sharedCounter;
            localIp65504P1333LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1333_L_LEN = 2;
  	/**
	 * serializeIp65504P1333L
	 */
	protected void serializeIp65504P1333L(short ip65504P1333L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1333L,IP_65504_P_1333_L_LEN)
                  ,beginIp65504P1333L
                  ,IP_65504_P_1333_L_LEN
                 );
            localIp65504P1333LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1333LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1333L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1333L() {	 
			return (getShort(beginIp65504P1333L));
   	}




}
  
