package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup49Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:24. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup49Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup49Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_49_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1489S;
            protected  int beginIp65504P1489L;
            protected  int beginIp65504P1490S;
            protected  int beginIp65504P1490L;
            protected  int beginIp65504P1491S;
            protected  int beginIp65504P1491L;
            protected  int beginIp65504P1492S;
            protected  int beginIp65504P1492L;
            protected  int beginIp65504P1493S;
            protected  int beginIp65504P1493L;
            protected  int beginIp65504P1494S;
            protected  int beginIp65504P1494L;
            protected  int beginIp65504P1495S;
            protected  int beginIp65504P1495L;
            protected  int beginIp65504P1496S;
            protected  int beginIp65504P1496L;
            protected  int beginIp65504P1497S;
            protected  int beginIp65504P1497L;
            protected  int beginIp65504P1498S;
            protected  int beginIp65504P1498L;
            protected  int beginIp65504P1499S;
            protected  int beginIp65504P1499L;
            protected  int beginIp65504P1500S;
            protected  int beginIp65504P1500L;
            protected  int beginIp65504P1501S;
            protected  int beginIp65504P1501L;
            protected  int beginIp65504P1502S;
            protected  int beginIp65504P1502L;
            protected  int beginIp65504P1503S;
            protected  int beginIp65504P1503L;
            protected  int beginIp65504P1504S;
            protected  int beginIp65504P1504L;
            protected  int beginIp65504P1505S;
            protected  int beginIp65504P1505L;
            protected  int beginIp65504P1506S;
            protected  int beginIp65504P1506L;
            protected  int beginIp65504P1507S;
            protected  int beginIp65504P1507L;
            protected  int beginIp65504P1508S;
            protected  int beginIp65504P1508L;
            protected  int beginIp65504P1509S;
            protected  int beginIp65504P1509L;
            protected  int beginIp65504P1510S;
            protected  int beginIp65504P1510L;
            protected  int beginIp65504P1511S;
            protected  int beginIp65504P1511L;
            protected  int beginIp65504P1512S;
            protected  int beginIp65504P1512L;
            protected  int beginIp65504P1513S;
            protected  int beginIp65504P1513L;
            protected  int beginIp65504P1514S;
            protected  int beginIp65504P1514L;
            protected  int beginIp65504P1515S;
            protected  int beginIp65504P1515L;
            protected  int beginIp65504P1516S;
            protected  int beginIp65504P1516L;
            protected  int beginIp65504P1517S;
            protected  int beginIp65504P1517L;
            protected  int beginIp65504P1518S;
            protected  int beginIp65504P1518L;
            protected  int beginIp65504P1519S;
            protected  int beginIp65504P1519L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup49Serialized
	**/
    public Ip65504PdsNamesLargeGroup49Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup49Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup49Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup49Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11900); // serialize this field at offset 11900 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup49Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11900 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup49Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_49_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1489S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1489L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1490S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1490L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1491S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1491L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1492S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1492L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1493S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1493L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1494S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1494L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1495S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1495L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1496S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1496L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1497S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1497L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1498S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1498L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1499S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1499L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1500S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1500L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1501S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1501L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1502S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1502L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1503S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1503L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1504S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1504L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1505S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1505L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1506S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1506L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1507S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1507L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1508S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1508L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1509S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1509L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1510S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1510L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1511S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1511L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1512S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1512L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1513S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1513L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1514S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1514L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1515S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1515L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1516S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1516L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1517S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1517L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1518S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1518L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1519S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1519L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1489SCounter = -1;
         public boolean isIp65504P1489SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1489SCounter != sharedCounter;
            localIp65504P1489SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1489_S_LEN = 2;
  	/**
	 * serializeIp65504P1489S
	 */
	protected void serializeIp65504P1489S(short ip65504P1489S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1489S,IP_65504_P_1489_S_LEN)
                  ,beginIp65504P1489S
                  ,IP_65504_P_1489_S_LEN
                 );
            localIp65504P1489SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1489SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1489S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1489S() {	 
			return (getShort(beginIp65504P1489S));
   	}
         int localIp65504P1489LCounter = -1;
         public boolean isIp65504P1489LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1489LCounter != sharedCounter;
            localIp65504P1489LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1489_L_LEN = 2;
  	/**
	 * serializeIp65504P1489L
	 */
	protected void serializeIp65504P1489L(short ip65504P1489L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1489L,IP_65504_P_1489_L_LEN)
                  ,beginIp65504P1489L
                  ,IP_65504_P_1489_L_LEN
                 );
            localIp65504P1489LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1489LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1489L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1489L() {	 
			return (getShort(beginIp65504P1489L));
   	}
         int localIp65504P1490SCounter = -1;
         public boolean isIp65504P1490SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1490SCounter != sharedCounter;
            localIp65504P1490SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1490_S_LEN = 2;
  	/**
	 * serializeIp65504P1490S
	 */
	protected void serializeIp65504P1490S(short ip65504P1490S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1490S,IP_65504_P_1490_S_LEN)
                  ,beginIp65504P1490S
                  ,IP_65504_P_1490_S_LEN
                 );
            localIp65504P1490SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1490SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1490S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1490S() {	 
			return (getShort(beginIp65504P1490S));
   	}
         int localIp65504P1490LCounter = -1;
         public boolean isIp65504P1490LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1490LCounter != sharedCounter;
            localIp65504P1490LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1490_L_LEN = 2;
  	/**
	 * serializeIp65504P1490L
	 */
	protected void serializeIp65504P1490L(short ip65504P1490L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1490L,IP_65504_P_1490_L_LEN)
                  ,beginIp65504P1490L
                  ,IP_65504_P_1490_L_LEN
                 );
            localIp65504P1490LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1490LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1490L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1490L() {	 
			return (getShort(beginIp65504P1490L));
   	}
         int localIp65504P1491SCounter = -1;
         public boolean isIp65504P1491SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1491SCounter != sharedCounter;
            localIp65504P1491SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1491_S_LEN = 2;
  	/**
	 * serializeIp65504P1491S
	 */
	protected void serializeIp65504P1491S(short ip65504P1491S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1491S,IP_65504_P_1491_S_LEN)
                  ,beginIp65504P1491S
                  ,IP_65504_P_1491_S_LEN
                 );
            localIp65504P1491SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1491SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1491S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1491S() {	 
			return (getShort(beginIp65504P1491S));
   	}
         int localIp65504P1491LCounter = -1;
         public boolean isIp65504P1491LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1491LCounter != sharedCounter;
            localIp65504P1491LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1491_L_LEN = 2;
  	/**
	 * serializeIp65504P1491L
	 */
	protected void serializeIp65504P1491L(short ip65504P1491L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1491L,IP_65504_P_1491_L_LEN)
                  ,beginIp65504P1491L
                  ,IP_65504_P_1491_L_LEN
                 );
            localIp65504P1491LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1491LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1491L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1491L() {	 
			return (getShort(beginIp65504P1491L));
   	}
         int localIp65504P1492SCounter = -1;
         public boolean isIp65504P1492SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1492SCounter != sharedCounter;
            localIp65504P1492SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1492_S_LEN = 2;
  	/**
	 * serializeIp65504P1492S
	 */
	protected void serializeIp65504P1492S(short ip65504P1492S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1492S,IP_65504_P_1492_S_LEN)
                  ,beginIp65504P1492S
                  ,IP_65504_P_1492_S_LEN
                 );
            localIp65504P1492SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1492SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1492S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1492S() {	 
			return (getShort(beginIp65504P1492S));
   	}
         int localIp65504P1492LCounter = -1;
         public boolean isIp65504P1492LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1492LCounter != sharedCounter;
            localIp65504P1492LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1492_L_LEN = 2;
  	/**
	 * serializeIp65504P1492L
	 */
	protected void serializeIp65504P1492L(short ip65504P1492L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1492L,IP_65504_P_1492_L_LEN)
                  ,beginIp65504P1492L
                  ,IP_65504_P_1492_L_LEN
                 );
            localIp65504P1492LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1492LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1492L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1492L() {	 
			return (getShort(beginIp65504P1492L));
   	}
         int localIp65504P1493SCounter = -1;
         public boolean isIp65504P1493SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1493SCounter != sharedCounter;
            localIp65504P1493SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1493_S_LEN = 2;
  	/**
	 * serializeIp65504P1493S
	 */
	protected void serializeIp65504P1493S(short ip65504P1493S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1493S,IP_65504_P_1493_S_LEN)
                  ,beginIp65504P1493S
                  ,IP_65504_P_1493_S_LEN
                 );
            localIp65504P1493SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1493SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1493S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1493S() {	 
			return (getShort(beginIp65504P1493S));
   	}
         int localIp65504P1493LCounter = -1;
         public boolean isIp65504P1493LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1493LCounter != sharedCounter;
            localIp65504P1493LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1493_L_LEN = 2;
  	/**
	 * serializeIp65504P1493L
	 */
	protected void serializeIp65504P1493L(short ip65504P1493L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1493L,IP_65504_P_1493_L_LEN)
                  ,beginIp65504P1493L
                  ,IP_65504_P_1493_L_LEN
                 );
            localIp65504P1493LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1493LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1493L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1493L() {	 
			return (getShort(beginIp65504P1493L));
   	}
         int localIp65504P1494SCounter = -1;
         public boolean isIp65504P1494SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1494SCounter != sharedCounter;
            localIp65504P1494SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1494_S_LEN = 2;
  	/**
	 * serializeIp65504P1494S
	 */
	protected void serializeIp65504P1494S(short ip65504P1494S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1494S,IP_65504_P_1494_S_LEN)
                  ,beginIp65504P1494S
                  ,IP_65504_P_1494_S_LEN
                 );
            localIp65504P1494SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1494SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1494S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1494S() {	 
			return (getShort(beginIp65504P1494S));
   	}
         int localIp65504P1494LCounter = -1;
         public boolean isIp65504P1494LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1494LCounter != sharedCounter;
            localIp65504P1494LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1494_L_LEN = 2;
  	/**
	 * serializeIp65504P1494L
	 */
	protected void serializeIp65504P1494L(short ip65504P1494L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1494L,IP_65504_P_1494_L_LEN)
                  ,beginIp65504P1494L
                  ,IP_65504_P_1494_L_LEN
                 );
            localIp65504P1494LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1494LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1494L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1494L() {	 
			return (getShort(beginIp65504P1494L));
   	}
         int localIp65504P1495SCounter = -1;
         public boolean isIp65504P1495SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1495SCounter != sharedCounter;
            localIp65504P1495SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1495_S_LEN = 2;
  	/**
	 * serializeIp65504P1495S
	 */
	protected void serializeIp65504P1495S(short ip65504P1495S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1495S,IP_65504_P_1495_S_LEN)
                  ,beginIp65504P1495S
                  ,IP_65504_P_1495_S_LEN
                 );
            localIp65504P1495SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1495SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1495S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1495S() {	 
			return (getShort(beginIp65504P1495S));
   	}
         int localIp65504P1495LCounter = -1;
         public boolean isIp65504P1495LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1495LCounter != sharedCounter;
            localIp65504P1495LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1495_L_LEN = 2;
  	/**
	 * serializeIp65504P1495L
	 */
	protected void serializeIp65504P1495L(short ip65504P1495L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1495L,IP_65504_P_1495_L_LEN)
                  ,beginIp65504P1495L
                  ,IP_65504_P_1495_L_LEN
                 );
            localIp65504P1495LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1495LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1495L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1495L() {	 
			return (getShort(beginIp65504P1495L));
   	}
         int localIp65504P1496SCounter = -1;
         public boolean isIp65504P1496SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1496SCounter != sharedCounter;
            localIp65504P1496SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1496_S_LEN = 2;
  	/**
	 * serializeIp65504P1496S
	 */
	protected void serializeIp65504P1496S(short ip65504P1496S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1496S,IP_65504_P_1496_S_LEN)
                  ,beginIp65504P1496S
                  ,IP_65504_P_1496_S_LEN
                 );
            localIp65504P1496SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1496SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1496S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1496S() {	 
			return (getShort(beginIp65504P1496S));
   	}
         int localIp65504P1496LCounter = -1;
         public boolean isIp65504P1496LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1496LCounter != sharedCounter;
            localIp65504P1496LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1496_L_LEN = 2;
  	/**
	 * serializeIp65504P1496L
	 */
	protected void serializeIp65504P1496L(short ip65504P1496L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1496L,IP_65504_P_1496_L_LEN)
                  ,beginIp65504P1496L
                  ,IP_65504_P_1496_L_LEN
                 );
            localIp65504P1496LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1496LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1496L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1496L() {	 
			return (getShort(beginIp65504P1496L));
   	}
         int localIp65504P1497SCounter = -1;
         public boolean isIp65504P1497SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1497SCounter != sharedCounter;
            localIp65504P1497SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1497_S_LEN = 2;
  	/**
	 * serializeIp65504P1497S
	 */
	protected void serializeIp65504P1497S(short ip65504P1497S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1497S,IP_65504_P_1497_S_LEN)
                  ,beginIp65504P1497S
                  ,IP_65504_P_1497_S_LEN
                 );
            localIp65504P1497SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1497SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1497S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1497S() {	 
			return (getShort(beginIp65504P1497S));
   	}
         int localIp65504P1497LCounter = -1;
         public boolean isIp65504P1497LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1497LCounter != sharedCounter;
            localIp65504P1497LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1497_L_LEN = 2;
  	/**
	 * serializeIp65504P1497L
	 */
	protected void serializeIp65504P1497L(short ip65504P1497L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1497L,IP_65504_P_1497_L_LEN)
                  ,beginIp65504P1497L
                  ,IP_65504_P_1497_L_LEN
                 );
            localIp65504P1497LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1497LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1497L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1497L() {	 
			return (getShort(beginIp65504P1497L));
   	}
         int localIp65504P1498SCounter = -1;
         public boolean isIp65504P1498SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1498SCounter != sharedCounter;
            localIp65504P1498SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1498_S_LEN = 2;
  	/**
	 * serializeIp65504P1498S
	 */
	protected void serializeIp65504P1498S(short ip65504P1498S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1498S,IP_65504_P_1498_S_LEN)
                  ,beginIp65504P1498S
                  ,IP_65504_P_1498_S_LEN
                 );
            localIp65504P1498SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1498SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1498S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1498S() {	 
			return (getShort(beginIp65504P1498S));
   	}
         int localIp65504P1498LCounter = -1;
         public boolean isIp65504P1498LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1498LCounter != sharedCounter;
            localIp65504P1498LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1498_L_LEN = 2;
  	/**
	 * serializeIp65504P1498L
	 */
	protected void serializeIp65504P1498L(short ip65504P1498L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1498L,IP_65504_P_1498_L_LEN)
                  ,beginIp65504P1498L
                  ,IP_65504_P_1498_L_LEN
                 );
            localIp65504P1498LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1498LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1498L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1498L() {	 
			return (getShort(beginIp65504P1498L));
   	}
         int localIp65504P1499SCounter = -1;
         public boolean isIp65504P1499SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1499SCounter != sharedCounter;
            localIp65504P1499SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1499_S_LEN = 2;
  	/**
	 * serializeIp65504P1499S
	 */
	protected void serializeIp65504P1499S(short ip65504P1499S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1499S,IP_65504_P_1499_S_LEN)
                  ,beginIp65504P1499S
                  ,IP_65504_P_1499_S_LEN
                 );
            localIp65504P1499SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1499SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1499S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1499S() {	 
			return (getShort(beginIp65504P1499S));
   	}
         int localIp65504P1499LCounter = -1;
         public boolean isIp65504P1499LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1499LCounter != sharedCounter;
            localIp65504P1499LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1499_L_LEN = 2;
  	/**
	 * serializeIp65504P1499L
	 */
	protected void serializeIp65504P1499L(short ip65504P1499L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1499L,IP_65504_P_1499_L_LEN)
                  ,beginIp65504P1499L
                  ,IP_65504_P_1499_L_LEN
                 );
            localIp65504P1499LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1499LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1499L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1499L() {	 
			return (getShort(beginIp65504P1499L));
   	}
         int localIp65504P1500SCounter = -1;
         public boolean isIp65504P1500SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1500SCounter != sharedCounter;
            localIp65504P1500SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1500_S_LEN = 2;
  	/**
	 * serializeIp65504P1500S
	 */
	protected void serializeIp65504P1500S(short ip65504P1500S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1500S,IP_65504_P_1500_S_LEN)
                  ,beginIp65504P1500S
                  ,IP_65504_P_1500_S_LEN
                 );
            localIp65504P1500SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1500SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1500S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1500S() {	 
			return (getShort(beginIp65504P1500S));
   	}
         int localIp65504P1500LCounter = -1;
         public boolean isIp65504P1500LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1500LCounter != sharedCounter;
            localIp65504P1500LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1500_L_LEN = 2;
  	/**
	 * serializeIp65504P1500L
	 */
	protected void serializeIp65504P1500L(short ip65504P1500L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1500L,IP_65504_P_1500_L_LEN)
                  ,beginIp65504P1500L
                  ,IP_65504_P_1500_L_LEN
                 );
            localIp65504P1500LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1500LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1500L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1500L() {	 
			return (getShort(beginIp65504P1500L));
   	}
         int localIp65504P1501SCounter = -1;
         public boolean isIp65504P1501SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1501SCounter != sharedCounter;
            localIp65504P1501SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1501_S_LEN = 2;
  	/**
	 * serializeIp65504P1501S
	 */
	protected void serializeIp65504P1501S(short ip65504P1501S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1501S,IP_65504_P_1501_S_LEN)
                  ,beginIp65504P1501S
                  ,IP_65504_P_1501_S_LEN
                 );
            localIp65504P1501SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1501SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1501S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1501S() {	 
			return (getShort(beginIp65504P1501S));
   	}
         int localIp65504P1501LCounter = -1;
         public boolean isIp65504P1501LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1501LCounter != sharedCounter;
            localIp65504P1501LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1501_L_LEN = 2;
  	/**
	 * serializeIp65504P1501L
	 */
	protected void serializeIp65504P1501L(short ip65504P1501L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1501L,IP_65504_P_1501_L_LEN)
                  ,beginIp65504P1501L
                  ,IP_65504_P_1501_L_LEN
                 );
            localIp65504P1501LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1501LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1501L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1501L() {	 
			return (getShort(beginIp65504P1501L));
   	}
         int localIp65504P1502SCounter = -1;
         public boolean isIp65504P1502SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1502SCounter != sharedCounter;
            localIp65504P1502SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1502_S_LEN = 2;
  	/**
	 * serializeIp65504P1502S
	 */
	protected void serializeIp65504P1502S(short ip65504P1502S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1502S,IP_65504_P_1502_S_LEN)
                  ,beginIp65504P1502S
                  ,IP_65504_P_1502_S_LEN
                 );
            localIp65504P1502SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1502SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1502S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1502S() {	 
			return (getShort(beginIp65504P1502S));
   	}
         int localIp65504P1502LCounter = -1;
         public boolean isIp65504P1502LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1502LCounter != sharedCounter;
            localIp65504P1502LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1502_L_LEN = 2;
  	/**
	 * serializeIp65504P1502L
	 */
	protected void serializeIp65504P1502L(short ip65504P1502L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1502L,IP_65504_P_1502_L_LEN)
                  ,beginIp65504P1502L
                  ,IP_65504_P_1502_L_LEN
                 );
            localIp65504P1502LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1502LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1502L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1502L() {	 
			return (getShort(beginIp65504P1502L));
   	}
         int localIp65504P1503SCounter = -1;
         public boolean isIp65504P1503SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1503SCounter != sharedCounter;
            localIp65504P1503SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1503_S_LEN = 2;
  	/**
	 * serializeIp65504P1503S
	 */
	protected void serializeIp65504P1503S(short ip65504P1503S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1503S,IP_65504_P_1503_S_LEN)
                  ,beginIp65504P1503S
                  ,IP_65504_P_1503_S_LEN
                 );
            localIp65504P1503SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1503SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1503S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1503S() {	 
			return (getShort(beginIp65504P1503S));
   	}
         int localIp65504P1503LCounter = -1;
         public boolean isIp65504P1503LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1503LCounter != sharedCounter;
            localIp65504P1503LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1503_L_LEN = 2;
  	/**
	 * serializeIp65504P1503L
	 */
	protected void serializeIp65504P1503L(short ip65504P1503L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1503L,IP_65504_P_1503_L_LEN)
                  ,beginIp65504P1503L
                  ,IP_65504_P_1503_L_LEN
                 );
            localIp65504P1503LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1503LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1503L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1503L() {	 
			return (getShort(beginIp65504P1503L));
   	}
         int localIp65504P1504SCounter = -1;
         public boolean isIp65504P1504SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1504SCounter != sharedCounter;
            localIp65504P1504SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1504_S_LEN = 2;
  	/**
	 * serializeIp65504P1504S
	 */
	protected void serializeIp65504P1504S(short ip65504P1504S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1504S,IP_65504_P_1504_S_LEN)
                  ,beginIp65504P1504S
                  ,IP_65504_P_1504_S_LEN
                 );
            localIp65504P1504SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1504SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1504S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1504S() {	 
			return (getShort(beginIp65504P1504S));
   	}
         int localIp65504P1504LCounter = -1;
         public boolean isIp65504P1504LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1504LCounter != sharedCounter;
            localIp65504P1504LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1504_L_LEN = 2;
  	/**
	 * serializeIp65504P1504L
	 */
	protected void serializeIp65504P1504L(short ip65504P1504L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1504L,IP_65504_P_1504_L_LEN)
                  ,beginIp65504P1504L
                  ,IP_65504_P_1504_L_LEN
                 );
            localIp65504P1504LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1504LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1504L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1504L() {	 
			return (getShort(beginIp65504P1504L));
   	}
         int localIp65504P1505SCounter = -1;
         public boolean isIp65504P1505SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1505SCounter != sharedCounter;
            localIp65504P1505SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1505_S_LEN = 2;
  	/**
	 * serializeIp65504P1505S
	 */
	protected void serializeIp65504P1505S(short ip65504P1505S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1505S,IP_65504_P_1505_S_LEN)
                  ,beginIp65504P1505S
                  ,IP_65504_P_1505_S_LEN
                 );
            localIp65504P1505SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1505SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1505S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1505S() {	 
			return (getShort(beginIp65504P1505S));
   	}
         int localIp65504P1505LCounter = -1;
         public boolean isIp65504P1505LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1505LCounter != sharedCounter;
            localIp65504P1505LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1505_L_LEN = 2;
  	/**
	 * serializeIp65504P1505L
	 */
	protected void serializeIp65504P1505L(short ip65504P1505L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1505L,IP_65504_P_1505_L_LEN)
                  ,beginIp65504P1505L
                  ,IP_65504_P_1505_L_LEN
                 );
            localIp65504P1505LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1505LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1505L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1505L() {	 
			return (getShort(beginIp65504P1505L));
   	}
         int localIp65504P1506SCounter = -1;
         public boolean isIp65504P1506SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1506SCounter != sharedCounter;
            localIp65504P1506SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1506_S_LEN = 2;
  	/**
	 * serializeIp65504P1506S
	 */
	protected void serializeIp65504P1506S(short ip65504P1506S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1506S,IP_65504_P_1506_S_LEN)
                  ,beginIp65504P1506S
                  ,IP_65504_P_1506_S_LEN
                 );
            localIp65504P1506SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1506SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1506S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1506S() {	 
			return (getShort(beginIp65504P1506S));
   	}
         int localIp65504P1506LCounter = -1;
         public boolean isIp65504P1506LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1506LCounter != sharedCounter;
            localIp65504P1506LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1506_L_LEN = 2;
  	/**
	 * serializeIp65504P1506L
	 */
	protected void serializeIp65504P1506L(short ip65504P1506L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1506L,IP_65504_P_1506_L_LEN)
                  ,beginIp65504P1506L
                  ,IP_65504_P_1506_L_LEN
                 );
            localIp65504P1506LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1506LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1506L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1506L() {	 
			return (getShort(beginIp65504P1506L));
   	}
         int localIp65504P1507SCounter = -1;
         public boolean isIp65504P1507SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1507SCounter != sharedCounter;
            localIp65504P1507SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1507_S_LEN = 2;
  	/**
	 * serializeIp65504P1507S
	 */
	protected void serializeIp65504P1507S(short ip65504P1507S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1507S,IP_65504_P_1507_S_LEN)
                  ,beginIp65504P1507S
                  ,IP_65504_P_1507_S_LEN
                 );
            localIp65504P1507SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1507SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1507S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1507S() {	 
			return (getShort(beginIp65504P1507S));
   	}
         int localIp65504P1507LCounter = -1;
         public boolean isIp65504P1507LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1507LCounter != sharedCounter;
            localIp65504P1507LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1507_L_LEN = 2;
  	/**
	 * serializeIp65504P1507L
	 */
	protected void serializeIp65504P1507L(short ip65504P1507L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1507L,IP_65504_P_1507_L_LEN)
                  ,beginIp65504P1507L
                  ,IP_65504_P_1507_L_LEN
                 );
            localIp65504P1507LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1507LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1507L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1507L() {	 
			return (getShort(beginIp65504P1507L));
   	}
         int localIp65504P1508SCounter = -1;
         public boolean isIp65504P1508SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1508SCounter != sharedCounter;
            localIp65504P1508SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1508_S_LEN = 2;
  	/**
	 * serializeIp65504P1508S
	 */
	protected void serializeIp65504P1508S(short ip65504P1508S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1508S,IP_65504_P_1508_S_LEN)
                  ,beginIp65504P1508S
                  ,IP_65504_P_1508_S_LEN
                 );
            localIp65504P1508SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1508SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1508S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1508S() {	 
			return (getShort(beginIp65504P1508S));
   	}
         int localIp65504P1508LCounter = -1;
         public boolean isIp65504P1508LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1508LCounter != sharedCounter;
            localIp65504P1508LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1508_L_LEN = 2;
  	/**
	 * serializeIp65504P1508L
	 */
	protected void serializeIp65504P1508L(short ip65504P1508L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1508L,IP_65504_P_1508_L_LEN)
                  ,beginIp65504P1508L
                  ,IP_65504_P_1508_L_LEN
                 );
            localIp65504P1508LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1508LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1508L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1508L() {	 
			return (getShort(beginIp65504P1508L));
   	}
         int localIp65504P1509SCounter = -1;
         public boolean isIp65504P1509SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1509SCounter != sharedCounter;
            localIp65504P1509SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1509_S_LEN = 2;
  	/**
	 * serializeIp65504P1509S
	 */
	protected void serializeIp65504P1509S(short ip65504P1509S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1509S,IP_65504_P_1509_S_LEN)
                  ,beginIp65504P1509S
                  ,IP_65504_P_1509_S_LEN
                 );
            localIp65504P1509SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1509SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1509S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1509S() {	 
			return (getShort(beginIp65504P1509S));
   	}
         int localIp65504P1509LCounter = -1;
         public boolean isIp65504P1509LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1509LCounter != sharedCounter;
            localIp65504P1509LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1509_L_LEN = 2;
  	/**
	 * serializeIp65504P1509L
	 */
	protected void serializeIp65504P1509L(short ip65504P1509L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1509L,IP_65504_P_1509_L_LEN)
                  ,beginIp65504P1509L
                  ,IP_65504_P_1509_L_LEN
                 );
            localIp65504P1509LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1509LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1509L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1509L() {	 
			return (getShort(beginIp65504P1509L));
   	}
         int localIp65504P1510SCounter = -1;
         public boolean isIp65504P1510SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1510SCounter != sharedCounter;
            localIp65504P1510SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1510_S_LEN = 2;
  	/**
	 * serializeIp65504P1510S
	 */
	protected void serializeIp65504P1510S(short ip65504P1510S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1510S,IP_65504_P_1510_S_LEN)
                  ,beginIp65504P1510S
                  ,IP_65504_P_1510_S_LEN
                 );
            localIp65504P1510SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1510SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1510S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1510S() {	 
			return (getShort(beginIp65504P1510S));
   	}
         int localIp65504P1510LCounter = -1;
         public boolean isIp65504P1510LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1510LCounter != sharedCounter;
            localIp65504P1510LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1510_L_LEN = 2;
  	/**
	 * serializeIp65504P1510L
	 */
	protected void serializeIp65504P1510L(short ip65504P1510L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1510L,IP_65504_P_1510_L_LEN)
                  ,beginIp65504P1510L
                  ,IP_65504_P_1510_L_LEN
                 );
            localIp65504P1510LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1510LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1510L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1510L() {	 
			return (getShort(beginIp65504P1510L));
   	}
         int localIp65504P1511SCounter = -1;
         public boolean isIp65504P1511SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1511SCounter != sharedCounter;
            localIp65504P1511SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1511_S_LEN = 2;
  	/**
	 * serializeIp65504P1511S
	 */
	protected void serializeIp65504P1511S(short ip65504P1511S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1511S,IP_65504_P_1511_S_LEN)
                  ,beginIp65504P1511S
                  ,IP_65504_P_1511_S_LEN
                 );
            localIp65504P1511SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1511SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1511S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1511S() {	 
			return (getShort(beginIp65504P1511S));
   	}
         int localIp65504P1511LCounter = -1;
         public boolean isIp65504P1511LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1511LCounter != sharedCounter;
            localIp65504P1511LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1511_L_LEN = 2;
  	/**
	 * serializeIp65504P1511L
	 */
	protected void serializeIp65504P1511L(short ip65504P1511L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1511L,IP_65504_P_1511_L_LEN)
                  ,beginIp65504P1511L
                  ,IP_65504_P_1511_L_LEN
                 );
            localIp65504P1511LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1511LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1511L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1511L() {	 
			return (getShort(beginIp65504P1511L));
   	}
         int localIp65504P1512SCounter = -1;
         public boolean isIp65504P1512SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1512SCounter != sharedCounter;
            localIp65504P1512SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1512_S_LEN = 2;
  	/**
	 * serializeIp65504P1512S
	 */
	protected void serializeIp65504P1512S(short ip65504P1512S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1512S,IP_65504_P_1512_S_LEN)
                  ,beginIp65504P1512S
                  ,IP_65504_P_1512_S_LEN
                 );
            localIp65504P1512SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1512SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1512S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1512S() {	 
			return (getShort(beginIp65504P1512S));
   	}
         int localIp65504P1512LCounter = -1;
         public boolean isIp65504P1512LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1512LCounter != sharedCounter;
            localIp65504P1512LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1512_L_LEN = 2;
  	/**
	 * serializeIp65504P1512L
	 */
	protected void serializeIp65504P1512L(short ip65504P1512L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1512L,IP_65504_P_1512_L_LEN)
                  ,beginIp65504P1512L
                  ,IP_65504_P_1512_L_LEN
                 );
            localIp65504P1512LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1512LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1512L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1512L() {	 
			return (getShort(beginIp65504P1512L));
   	}
         int localIp65504P1513SCounter = -1;
         public boolean isIp65504P1513SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1513SCounter != sharedCounter;
            localIp65504P1513SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1513_S_LEN = 2;
  	/**
	 * serializeIp65504P1513S
	 */
	protected void serializeIp65504P1513S(short ip65504P1513S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1513S,IP_65504_P_1513_S_LEN)
                  ,beginIp65504P1513S
                  ,IP_65504_P_1513_S_LEN
                 );
            localIp65504P1513SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1513SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1513S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1513S() {	 
			return (getShort(beginIp65504P1513S));
   	}
         int localIp65504P1513LCounter = -1;
         public boolean isIp65504P1513LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1513LCounter != sharedCounter;
            localIp65504P1513LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1513_L_LEN = 2;
  	/**
	 * serializeIp65504P1513L
	 */
	protected void serializeIp65504P1513L(short ip65504P1513L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1513L,IP_65504_P_1513_L_LEN)
                  ,beginIp65504P1513L
                  ,IP_65504_P_1513_L_LEN
                 );
            localIp65504P1513LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1513LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1513L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1513L() {	 
			return (getShort(beginIp65504P1513L));
   	}
         int localIp65504P1514SCounter = -1;
         public boolean isIp65504P1514SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1514SCounter != sharedCounter;
            localIp65504P1514SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1514_S_LEN = 2;
  	/**
	 * serializeIp65504P1514S
	 */
	protected void serializeIp65504P1514S(short ip65504P1514S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1514S,IP_65504_P_1514_S_LEN)
                  ,beginIp65504P1514S
                  ,IP_65504_P_1514_S_LEN
                 );
            localIp65504P1514SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1514SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1514S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1514S() {	 
			return (getShort(beginIp65504P1514S));
   	}
         int localIp65504P1514LCounter = -1;
         public boolean isIp65504P1514LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1514LCounter != sharedCounter;
            localIp65504P1514LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1514_L_LEN = 2;
  	/**
	 * serializeIp65504P1514L
	 */
	protected void serializeIp65504P1514L(short ip65504P1514L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1514L,IP_65504_P_1514_L_LEN)
                  ,beginIp65504P1514L
                  ,IP_65504_P_1514_L_LEN
                 );
            localIp65504P1514LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1514LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1514L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1514L() {	 
			return (getShort(beginIp65504P1514L));
   	}
         int localIp65504P1515SCounter = -1;
         public boolean isIp65504P1515SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1515SCounter != sharedCounter;
            localIp65504P1515SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1515_S_LEN = 2;
  	/**
	 * serializeIp65504P1515S
	 */
	protected void serializeIp65504P1515S(short ip65504P1515S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1515S,IP_65504_P_1515_S_LEN)
                  ,beginIp65504P1515S
                  ,IP_65504_P_1515_S_LEN
                 );
            localIp65504P1515SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1515SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1515S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1515S() {	 
			return (getShort(beginIp65504P1515S));
   	}
         int localIp65504P1515LCounter = -1;
         public boolean isIp65504P1515LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1515LCounter != sharedCounter;
            localIp65504P1515LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1515_L_LEN = 2;
  	/**
	 * serializeIp65504P1515L
	 */
	protected void serializeIp65504P1515L(short ip65504P1515L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1515L,IP_65504_P_1515_L_LEN)
                  ,beginIp65504P1515L
                  ,IP_65504_P_1515_L_LEN
                 );
            localIp65504P1515LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1515LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1515L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1515L() {	 
			return (getShort(beginIp65504P1515L));
   	}
         int localIp65504P1516SCounter = -1;
         public boolean isIp65504P1516SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1516SCounter != sharedCounter;
            localIp65504P1516SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1516_S_LEN = 2;
  	/**
	 * serializeIp65504P1516S
	 */
	protected void serializeIp65504P1516S(short ip65504P1516S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1516S,IP_65504_P_1516_S_LEN)
                  ,beginIp65504P1516S
                  ,IP_65504_P_1516_S_LEN
                 );
            localIp65504P1516SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1516SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1516S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1516S() {	 
			return (getShort(beginIp65504P1516S));
   	}
         int localIp65504P1516LCounter = -1;
         public boolean isIp65504P1516LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1516LCounter != sharedCounter;
            localIp65504P1516LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1516_L_LEN = 2;
  	/**
	 * serializeIp65504P1516L
	 */
	protected void serializeIp65504P1516L(short ip65504P1516L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1516L,IP_65504_P_1516_L_LEN)
                  ,beginIp65504P1516L
                  ,IP_65504_P_1516_L_LEN
                 );
            localIp65504P1516LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1516LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1516L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1516L() {	 
			return (getShort(beginIp65504P1516L));
   	}
         int localIp65504P1517SCounter = -1;
         public boolean isIp65504P1517SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1517SCounter != sharedCounter;
            localIp65504P1517SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1517_S_LEN = 2;
  	/**
	 * serializeIp65504P1517S
	 */
	protected void serializeIp65504P1517S(short ip65504P1517S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1517S,IP_65504_P_1517_S_LEN)
                  ,beginIp65504P1517S
                  ,IP_65504_P_1517_S_LEN
                 );
            localIp65504P1517SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1517SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1517S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1517S() {	 
			return (getShort(beginIp65504P1517S));
   	}
         int localIp65504P1517LCounter = -1;
         public boolean isIp65504P1517LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1517LCounter != sharedCounter;
            localIp65504P1517LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1517_L_LEN = 2;
  	/**
	 * serializeIp65504P1517L
	 */
	protected void serializeIp65504P1517L(short ip65504P1517L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1517L,IP_65504_P_1517_L_LEN)
                  ,beginIp65504P1517L
                  ,IP_65504_P_1517_L_LEN
                 );
            localIp65504P1517LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1517LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1517L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1517L() {	 
			return (getShort(beginIp65504P1517L));
   	}
         int localIp65504P1518SCounter = -1;
         public boolean isIp65504P1518SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1518SCounter != sharedCounter;
            localIp65504P1518SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1518_S_LEN = 2;
  	/**
	 * serializeIp65504P1518S
	 */
	protected void serializeIp65504P1518S(short ip65504P1518S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1518S,IP_65504_P_1518_S_LEN)
                  ,beginIp65504P1518S
                  ,IP_65504_P_1518_S_LEN
                 );
            localIp65504P1518SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1518SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1518S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1518S() {	 
			return (getShort(beginIp65504P1518S));
   	}
         int localIp65504P1518LCounter = -1;
         public boolean isIp65504P1518LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1518LCounter != sharedCounter;
            localIp65504P1518LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1518_L_LEN = 2;
  	/**
	 * serializeIp65504P1518L
	 */
	protected void serializeIp65504P1518L(short ip65504P1518L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1518L,IP_65504_P_1518_L_LEN)
                  ,beginIp65504P1518L
                  ,IP_65504_P_1518_L_LEN
                 );
            localIp65504P1518LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1518LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1518L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1518L() {	 
			return (getShort(beginIp65504P1518L));
   	}
         int localIp65504P1519SCounter = -1;
         public boolean isIp65504P1519SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1519SCounter != sharedCounter;
            localIp65504P1519SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1519_S_LEN = 2;
  	/**
	 * serializeIp65504P1519S
	 */
	protected void serializeIp65504P1519S(short ip65504P1519S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1519S,IP_65504_P_1519_S_LEN)
                  ,beginIp65504P1519S
                  ,IP_65504_P_1519_S_LEN
                 );
            localIp65504P1519SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1519SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1519S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1519S() {	 
			return (getShort(beginIp65504P1519S));
   	}
         int localIp65504P1519LCounter = -1;
         public boolean isIp65504P1519LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1519LCounter != sharedCounter;
            localIp65504P1519LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1519_L_LEN = 2;
  	/**
	 * serializeIp65504P1519L
	 */
	protected void serializeIp65504P1519L(short ip65504P1519L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1519L,IP_65504_P_1519_L_LEN)
                  ,beginIp65504P1519L
                  ,IP_65504_P_1519_L_LEN
                 );
            localIp65504P1519LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1519LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1519L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1519L() {	 
			return (getShort(beginIp65504P1519L));
   	}




}
  
